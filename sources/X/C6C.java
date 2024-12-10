package X;

public abstract class C6C {
    public boolean equals(Object obj) {
        return this == obj || (obj instanceof C6C);
    }

    public int hashCode() {
        return BE8.A09(Long.MIN_VALUE, ((int) (0 ^ (0 >>> 32))) * 31) * 31 * 31;
    }
}
