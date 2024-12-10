package X;

public final class Bt2 extends C4V {
    public final C25765Clc A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Bt2) && C18070vi.A18(this.A00, ((Bt2) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public Bt2(C25765Clc clc) {
        this.A00 = clc;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Extensions(inner=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
