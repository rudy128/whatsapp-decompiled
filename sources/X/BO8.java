package X;

public final class BO8 extends C33 {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BO8) && C18070vi.A18(this.A00, ((BO8) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public BO8(String str) {
        this.A00 = str;
    }
}
