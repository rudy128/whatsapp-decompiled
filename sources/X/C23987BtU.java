package X;

/* renamed from: X.BtU  reason: case insensitive filesystem */
public final class C23987BtU extends DPJ {
    public final DPM A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23987BtU) && C18070vi.A18(this.A00, ((C23987BtU) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C23987BtU(DPM dpm) {
        this.A00 = dpm;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Nullable(inner=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
