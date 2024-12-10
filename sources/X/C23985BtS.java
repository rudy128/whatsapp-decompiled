package X;

/* renamed from: X.BtS  reason: case insensitive filesystem */
public final class C23985BtS extends DPJ {
    public final DPK A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23985BtS) && C18070vi.A18(this.A00, ((C23985BtS) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C23985BtS(DPK dpk) {
        this.A00 = dpk;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Array(inner=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
