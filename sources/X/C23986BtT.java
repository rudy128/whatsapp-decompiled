package X;

/* renamed from: X.BtT  reason: case insensitive filesystem */
public final class C23986BtT extends DPJ {
    public final DPN A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23986BtT) && C18070vi.A18(this.A00, ((C23986BtT) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C23986BtT(DPN dpn) {
        this.A00 = dpn;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Block(inner=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
