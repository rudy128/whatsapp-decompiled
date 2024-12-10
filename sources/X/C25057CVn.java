package X;

/* renamed from: X.CVn  reason: case insensitive filesystem */
public final class C25057CVn {
    public final AnonymousClass1JD A00;
    public final AnonymousClass1JD A01;

    public C25057CVn(AnonymousClass1JD r1, AnonymousClass1JD r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IOLinkInputRollover(queued=");
        A10.append(this.A00);
        A10.append(", received=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
