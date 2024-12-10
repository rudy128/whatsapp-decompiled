package X;

/* renamed from: X.Bta  reason: case insensitive filesystem */
public final class C23993Bta extends DPJ {
    public final DPR A00;

    public C23993Bta(DPR dpr) {
        C18070vi.A0d(dpr, 1);
        this.A00 = dpr;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23993Bta) && C18070vi.A18(this.A00, ((C23993Bta) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Path(inner=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public C23993Bta() {
        this(DPR.A00);
    }
}
