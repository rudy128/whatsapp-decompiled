package X;

/* renamed from: X.BtV  reason: case insensitive filesystem */
public final class C23988BtV extends DPJ {
    public final DPS A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23988BtV) && C18070vi.A18(this.A00, ((C23988BtV) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C23988BtV(DPS dps) {
        this.A00 = dps;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Record(inner=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
