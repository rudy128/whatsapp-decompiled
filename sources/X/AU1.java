package X;

import java.io.IOException;

public final class AU1 implements C1606989o {
    public final /* synthetic */ C184139aT A00;
    public final /* synthetic */ C184149aU A01;
    public final /* synthetic */ C190489l1 A02;
    public final /* synthetic */ C30101dO A03;
    public final /* synthetic */ C24360Bzv A04;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005e, code lost:
        if (r2 == X.C24360Bzv.INSTAGRAM_WITH_V2_PROVIDER) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BE5(X.C138506xC r6) {
        /*
            r5 = this;
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            X.161 r0 = r6.A03
            java.lang.Object r4 = r0.A00
            if (r4 != 0) goto L_0x0026
            X.1dO r1 = r5.A03
            java.lang.String r0 = "FETCH_PHONE_NUMBER_NULL"
            r1.A03(r0)
            java.lang.String r0 = "WfsNativeAuthManager/emptyNonceResultResponse"
            X.C31081ez.A01(r0)
            X.9aT r3 = r5.A00
            java.lang.String r0 = "Please link and/or unpause accounts"
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0n(r0)
            X.9yt r1 = r3.A01
            X.BAU r0 = r3.A00
            X.C198779yt.A00(r0, r1, r2)
            return
        L_0x0026:
            X.9l1 r0 = r5.A02
            X.00H r0 = r0.A00
            java.lang.Object r3 = r0.get()
            X.9kA r3 = (X.C189979kA) r3
            X.19T r2 = r3.A01
            r1 = 551497305(0x20df2e59, float:3.780834E-19)
            r0 = 467(0x1d3, float:6.54E-43)
            r2.markerEnd(r1, r0)
            r0 = 0
            r3.A00 = r0
            X.1dO r1 = r5.A03
            java.lang.String r0 = "FETCH_PHONE_NUMBER_END"
            r1.A04(r0)
            X.7Ik r2 = X.AnonymousClass8BR.A0Z()
            java.lang.String r0 = "WaLinkedNonce"
            X.77e r1 = new X.77e
            r1.<init>(r2, r4, r0)
            r0 = 3
            X.77S r3 = new X.77S
            r3.<init>(r1, r0)
            X.Bzv r2 = r5.A04
            X.Bzv r0 = X.C24360Bzv.INSTAGRAM
            if (r2 == r0) goto L_0x0060
            X.Bzv r0 = X.C24360Bzv.INSTAGRAM_WITH_V2_PROVIDER
            r1 = 1
            if (r2 != r0) goto L_0x0061
        L_0x0060:
            r1 = 2
        L_0x0061:
            X.9aU r0 = r5.A01
            X.9qM r4 = new X.9qM
            r4.<init>(r3, r1)
            X.9yt r3 = r0.A01
            X.BAU r2 = r0.A00
            r1 = 3
            X.Awd r0 = new X.Awd
            r0.<init>(r2, r3, r4)
            X.C20017A3j.A01(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AU1.BE5(X.6xC):void");
    }

    public void BrB(IOException iOException) {
        C18070vi.A0d(iOException, 0);
        this.A03.A03("FETCH_PHONE_NUMBER_ERROR");
        C184139aT r0 = this.A00;
        C198779yt.A00(r0.A00, r0.A01, iOException);
    }

    public void Bsw(Exception exc) {
        C18070vi.A0d(exc, 0);
        this.A03.A03("FETCH_PHONE_NUMBER_END");
        C184139aT r0 = this.A00;
        C198779yt.A00(r0.A00, r0.A01, exc);
    }

    public AU1(C184139aT r1, C184149aU r2, C190489l1 r3, C30101dO r4, C24360Bzv bzv) {
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = bzv;
        this.A01 = r2;
    }
}
