import value.*;

public class IntImp extends ImpBaseVisitor<Value> {

    private final Conf conf;

    // Constructor
    public IntImp(Conf conf) {
        this.conf = conf;
    }

    @Override
    public ComValue visitProg(ImpParser.ProgContext ctx) {
        return visitCom(ctx.com());
    }

    private ComValue visitCom(ImpParser.ComContext ctx) {
        return (ComValue) visit(ctx);
    }

    // ---------- COMMANDS ----------

    // TODO if-elseif-else
    /*@Override
    public ComValue visitIf(ImpParser.IfContext ctx) {
        return visitBoolExp(ctx.exp()) ? visitCom(ctx.com(0)) : visitCom(ctx.com(1));
    }*/

    @Override
    public ComValue visitAssign(ImpParser.AssignContext ctx) {
        conf.put(ctx.ID().getText(), visitExp(ctx.exp()));

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitSkip(ImpParser.SkipContext ctx) {
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitSeq(ImpParser.SeqContext ctx) {
        visitCom(ctx.com(0));
        visitCom(ctx.com(1));

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitWhile(ImpParser.WhileContext ctx) {
        if (!visitBoolExp(ctx.exp())) {
            return ComValue.INSTANCE;
        }

        visitCom(ctx.com());

        return visitCom(ctx);
    }

    @Override
    public ComValue visitOut(ImpParser.OutContext ctx) {
        System.out.println(visitExp(ctx.exp()));

        return ComValue.INSTANCE;
    }

    // TODO for, doWhile, nd

    // ---------------------------------

    private ExpValue<?> visitExp(ImpParser.ExpContext ctx) {
        return (ExpValue<?>) visit(ctx);
    }

    // ---------- EXPRESSIONS ----------

    private int visitNatExp(ImpParser.ExpContext ctx) {
        try {
            return ((NaturalValue) visit(ctx)).toJavaValue();
        }
        catch(ClassCastException e) {
            System.err.println("Type mismatch in the expression:");
            System.err.println();
            System.err.println(ctx.getText());
            System.err.println();
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getStartIndex());
            System.err.println("> Numerical expression expected");

            System.exit(1);
        }

        return 0; // dumb return (non-reachable code)
    }

    private boolean visitBoolExp(ImpParser.ExpContext ctx) {
        try {
            return ((BooleanValue) visit(ctx)).toJavaValue();
        }
        catch(ClassCastException e) {
            System.err.println("Type mismatch:");
            System.err.println(">>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println("> Boolean expression expected");

            System.exit(1);
        }

        return false; // dumb return (non-reachable code)
    }

    @Override
    public NaturalValue visitNat(ImpParser.NatContext ctx) {
        return new NaturalValue(Integer.parseInt(ctx.NAT().getText()));
    }

    @Override
    public BooleanValue visitBool(ImpParser.BoolContext ctx) {
        return new BooleanValue(Boolean.parseBoolean(ctx.BOOL().getText()));
    }

    @Override
    public ExpValue<?> visitParExp(ImpParser.ParExpContext ctx) {
        return visitExp(ctx.exp());
    }

    @Override
    public NaturalValue visitPow(ImpParser.PowContext ctx) {
        int base = visitNatExp(ctx.exp(0));
        int exp = visitNatExp(ctx.exp(1));

        return new NaturalValue((int) Math.pow(base, exp));
    }

    @Override
    public ExpValue<?> visitNot(ImpParser.NotContext ctx) {
        return new BooleanValue(!visitBoolExp(ctx.exp()));
    }


    @Override
    public NaturalValue visitDivMulMod(ImpParser.DivMulModContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        NaturalValue result = null;

        switch (ctx.op.getType()) {
            case ImpParser.DIV : result = new NaturalValue(left / right);
            case ImpParser.MUL : result = new NaturalValue(left * right);
            case ImpParser.MOD : result = new NaturalValue(left % right);
        }

        return result;
    }

    @Override
    public NaturalValue visitPlusMinus(ImpParser.PlusMinusContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        NaturalValue result = null;

        if(ctx.op.getType() == ImpParser.PLUS) {
            result = new NaturalValue(left + right);
        } else if(ctx.op.getType() == ImpParser.MINUS) {
            result = new NaturalValue(Math.max(left - right, 0));
        }

        return result;
    }

    @Override
    public BooleanValue visitCmpExp(ImpParser.CmpExpContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        BooleanValue result = null;

        switch (ctx.op.getType()) {
            case ImpParser.GEQ : result = new BooleanValue(left >= right);
            case ImpParser.LEQ : result = new BooleanValue(left <= right);
            case ImpParser.LT  : result = new BooleanValue(left < right);
            case ImpParser.GT  : result = new BooleanValue(left > right);
        }

        return result;
    }

    @Override
    public BooleanValue visitEqExp(ImpParser.EqExpContext ctx) {
        ExpValue<?> left = visitExp(ctx.exp(0));
        ExpValue<?> right = visitExp(ctx.exp(1));

        BooleanValue result = null;

        if(ctx.op.getType() == ImpParser.EQQ) {
            result = new BooleanValue(left.equals(right));
        } else if(ctx.op.getType() == ImpParser.NEQ) {
            result = new BooleanValue(!left.equals(right));
        }

        return result;
    }

    @Override
    public BooleanValue visitLogicExp(ImpParser.LogicExpContext ctx) {
        boolean left = visitBoolExp(ctx.exp(0));
        boolean right = visitBoolExp(ctx.exp(1));

        BooleanValue result = null;

        if(ctx.op.getType() == ImpParser.AND) {
            result = new BooleanValue(left && right);
        } else if(ctx.op.getType() == ImpParser.OR) {
            result = new BooleanValue(left || right);
        }

        return result;
    }

    @Override
    public ExpValue<?> visitId(ImpParser.IdContext ctx) {
        if (conf.get(ctx.ID().getText()) == null) {
            System.err.println("Variable '" + ctx.ID().getText() + "' used but never declared");
            System.exit(1);
        }

        return conf.get(ctx.ID().getText());
    }

    // ---------------------------------
}
