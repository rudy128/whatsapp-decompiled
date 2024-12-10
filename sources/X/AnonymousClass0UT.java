package X;

/* renamed from: X.0UT  reason: invalid class name */
public class AnonymousClass0UT implements C16600sh {
    public final int A00;

    public AnonymousClass0UT(int i) {
        this.A00 = i;
    }

    public float BDl(long j) {
        float A01;
        switch (this.A00) {
            case 0:
                return AnonymousClass0QY.A00(j);
            case 1:
                A01 = AnonymousClass0QY.A01(j);
                break;
            default:
                A01 = AnonymousClass0QY.A02(j);
                break;
        }
        return Math.abs(A01);
    }

    public long BDw(float f, long j) {
        switch (this.A00) {
            case 0:
                float A002 = AnonymousClass0QY.A00(j);
                return AnonymousClass0QY.A04(j, AnonymousClass0QY.A03(f, AnonymousClass001.A0p(AnonymousClass0QY.A01(j) / A002, AnonymousClass0QY.A02(j) / A002)));
            case 1:
                return AnonymousClass001.A0p(AnonymousClass0QY.A01(j) - (Math.signum(AnonymousClass0QY.A01(j)) * f), AnonymousClass0QY.A02(j));
            default:
                return AnonymousClass001.A0p(AnonymousClass0QY.A01(j), AnonymousClass0QY.A02(j) - (Math.signum(AnonymousClass0QY.A02(j)) * f));
        }
    }
}
