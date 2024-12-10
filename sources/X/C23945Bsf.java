package X;

/* renamed from: X.Bsf  reason: case insensitive filesystem */
public final class C23945Bsf extends C4S {
    public final DPM A00;

    public C23945Bsf(DPM dpm) {
        C18070vi.A0d(dpm, 1);
        this.A00 = dpm;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23945Bsf) && C18070vi.A18(this.A00, ((C23945Bsf) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Null(wireType=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
