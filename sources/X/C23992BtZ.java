package X;

/* renamed from: X.BtZ  reason: case insensitive filesystem */
public final class C23992BtZ extends DPJ {
    public final DPQ A00;

    public C23992BtZ(DPQ dpq) {
        C18070vi.A0d(dpq, 1);
        this.A00 = dpq;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23992BtZ) && C18070vi.A18(this.A00, ((C23992BtZ) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Extensions(inner=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public C23992BtZ() {
        this(DPQ.A00);
    }
}
