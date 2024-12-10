package X;

/* renamed from: X.BtY  reason: case insensitive filesystem */
public final class C23991BtY extends DPJ {
    public final DPP A00;

    public C23991BtY(DPP dpp) {
        C18070vi.A0d(dpp, 1);
        this.A00 = dpp;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23991BtY) && C18070vi.A18(this.A00, ((C23991BtY) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(inner=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public C23991BtY() {
        this(DPP.A00);
    }
}
