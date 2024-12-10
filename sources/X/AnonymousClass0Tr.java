package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.0Tr  reason: invalid class name */
public final class AnonymousClass0Tr implements C16900tP {
    public final long A00;
    public final C16590sg A01;
    public final Object A02;
    public final AnonymousClass0D0 A03;
    public final AnonymousClass0D0 A04;
    public final AnonymousClass0D0 A05;
    public final C16030rb A06;
    public final Object A07;

    public AnonymousClass0Tr(AnonymousClass0D0 r22, C16590sg r23, C16030rb r24, Object obj) {
        C16030rb r9 = r24;
        this.A06 = r9;
        C16590sg r0 = r23;
        this.A01 = r0;
        Object obj2 = obj;
        this.A07 = obj2;
        AnonymousClass0D0 r7 = (AnonymousClass0D0) r0.BPS().invoke(obj2);
        this.A04 = r7;
        AnonymousClass0D0 r10 = r22;
        this.A05 = C03860Kx.A00(r10);
        C22821Di BPR = this.A01.BPR();
        AnonymousClass0UA r6 = (AnonymousClass0UA) r9;
        AnonymousClass0D0 r12 = r6.A00;
        if (r12 == null) {
            r12 = C03860Kx.A01(r7);
            r6.A00 = r12;
        }
        int A012 = r12.A01();
        for (int i = 0; i < A012; i++) {
            C15650qy r02 = r6.A03;
            float A002 = r7.A00(i);
            float A003 = r10.A00(i);
            AnonymousClass0OE r03 = ((AnonymousClass0U3) r02).A00;
            double A004 = AnonymousClass0OE.A00(r03, A003);
            double d = (double) C02870Fs.A00;
            r12.A04(i, A002 + (((float) (((double) (r03.A00 * r03.A01)) * Math.exp((d / (d - 1.0d)) * A004))) * Math.signum(A003)));
        }
        this.A02 = BPR.invoke(r12);
        AnonymousClass0D0 r04 = r6.A02;
        if (r04 == null) {
            r04 = C03860Kx.A01(r7);
            r6.A02 = r04;
        }
        int A013 = r04.A01();
        long j = 0;
        for (int i2 = 0; i2 < A013; i2++) {
            C15650qy r05 = r6.A03;
            j = Math.max(j, ((long) (Math.exp(AnonymousClass0OE.A00(((AnonymousClass0U3) r05).A00, r10.A00(i2)) / (((double) C02870Fs.A00) - 1.0d)) * 1000.0d)) * SearchActionVerificationClientService.MS_TO_NS);
        }
        this.A00 = j;
        AnonymousClass0D0 A005 = C03860Kx.A00(r9.BbL(r7, r10, j));
        this.A03 = A005;
        int A014 = A005.A01();
        for (int i3 = 0; i3 < A014; i3++) {
            AnonymousClass0D0 r3 = this.A03;
            r3.A04(i3, C28851b7.A02(r3.A00(i3), -0.0f, 0.0f));
        }
    }

    public Object BbD(long j) {
        float f;
        if (AnonymousClass000.A1Q((j > this.A00 ? 1 : (j == this.A00 ? 0 : -1)))) {
            return this.A02;
        }
        C22821Di BPR = this.A01.BPR();
        C16030rb r9 = this.A06;
        AnonymousClass0D0 r14 = this.A04;
        AnonymousClass0D0 r13 = this.A05;
        AnonymousClass0UA r92 = (AnonymousClass0UA) r9;
        AnonymousClass0D0 r8 = r92.A01;
        if (r8 == null) {
            r8 = C03860Kx.A01(r14);
            r92.A01 = r8;
        }
        int A012 = r8.A01();
        for (int i = 0; i < A012; i++) {
            C15650qy r2 = r92.A03;
            float A002 = r14.A00(i);
            float A003 = r13.A00(i);
            long j2 = j / SearchActionVerificationClientService.MS_TO_NS;
            AnonymousClass0OE r0 = ((AnonymousClass0U3) r2).A00;
            double A004 = AnonymousClass0OE.A00(r0, A003);
            double d = (double) C02870Fs.A00;
            double d2 = d - 1.0d;
            float exp = (float) (((double) (r0.A00 * r0.A01)) * Math.exp((d / d2) * A004));
            long exp2 = (long) (Math.exp(A004 / d2) * 1000.0d);
            if (exp2 > 0) {
                f = ((float) j2) / ((float) exp2);
            } else {
                f = 1.0f;
            }
            r8.A04(i, A002 + (exp * Math.signum(A003) * AnonymousClass0LX.A00(f).A00));
        }
        return BPR.invoke(r8);
    }

    public AnonymousClass0D0 BbM(long j) {
        if (!AnonymousClass000.A1Q((j > this.A00 ? 1 : (j == this.A00 ? 0 : -1)))) {
            return this.A06.BbL(this.A04, this.A05, j);
        }
        return this.A03;
    }

    public /* synthetic */ boolean Ben(long j) {
        return AnonymousClass000.A1Q((j > this.A00 ? 1 : (j == this.A00 ? 0 : -1)));
    }

    public long BQy() {
        return this.A00;
    }

    public Object BaD() {
        return this.A02;
    }

    public C16590sg Bav() {
        return this.A01;
    }

    public boolean Bf5() {
        return false;
    }
}
