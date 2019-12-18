package value;

import java.util.Objects;

public abstract class ExpValue<T> extends Value {

    private final T value;

    public ExpValue(T value) {
        this.value = value;
    }

    public T toJavaValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        ExpValue<?> expValue = (ExpValue<?>) obj;

        return Objects.equals(value, expValue.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
