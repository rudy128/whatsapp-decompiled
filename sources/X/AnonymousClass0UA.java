package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.0UA  reason: invalid class name */
public final class AnonymousClass0UA implements C16030rb {
    public AnonymousClass0D0 A00;
    public AnonymousClass0D0 A01;
    public AnonymousClass0D0 A02;
    public final C15650qy A03;

    public AnonymousClass0D0 BbL(AnonymousClass0D0 r19, AnonymousClass0D0 r20, long j) {
        float f;
        AnonymousClass0D0 r8 = this.A02;
        if (r8 == null) {
            r8 = C03860Kx.A01(r19);
            this.A02 = r8;
        }
        int A012 = r8.A01();
        for (int i = 0; i < A012; i++) {
            C15650qy r2 = this.A03;
            float A002 = r20.A00(i);
            long j2 = j / SearchActionVerificationClientService.MS_TO_NS;
            AnonymousClass0OE r0 = ((AnonymousClass0U3) r2).A00;
            double A003 = AnonymousClass0OE.A00(r0, A002);
            double d = (double) C02870Fs.A00;
            double d2 = d - 1.0d;
            float exp = (float) (((double) (r0.A00 * r0.A01)) * Math.exp((d / d2) * A003));
            long exp2 = (long) (Math.exp(A003 / d2) * 1000.0d);
            if (exp2 > 0) {
                f = ((float) j2) / ((float) exp2);
            } else {
                f = 1.0f;
            }
            r8.A04(i, (((AnonymousClass0LX.A00(f).A01 * Math.signum(A002)) * exp) / ((float) exp2)) * 1000.0f);
        }
        return r8;
    }

    public AnonymousClass0UA(C15650qy r1) {
        this.A03 = r1;
    }
}
