package X;

/* renamed from: X.BtX  reason: case insensitive filesystem */
public final class C23990BtX extends DPJ {
    public final DPO A00;

    public C23990BtX(DPO dpo) {
        C18070vi.A0d(dpo, 1);
        this.A00 = dpo;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23990BtX) && C18070vi.A18(this.A00, ((C23990BtX) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Desc(inner=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public C23990BtX() {
        this(DPO.A00);
    }
}
