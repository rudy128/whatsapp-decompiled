package X;

public final class A1S {
    public static final A1S A00 = new Object();

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof A1S);
    }

    public int hashCode() {
        return -1143276523;
    }

    public String toString() {
        return "Available";
    }
}
