package X;

import com.whatsapp.util.Log;

/* renamed from: X.4mA  reason: invalid class name and case insensitive filesystem */
public class C95394mA implements C72363Lq {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final C87814Xd A01;
    public final C85834Ox A02;
    public final /* synthetic */ AnonymousClass3TA A03;

    public C95394mA(AnonymousClass3TA r2, C87814Xd r3, C85834Ox r4) {
        this.A03 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }

    public void BrA() {
        Log.e("WebPagePreviewViewModel/CTWAListener/onDeliveryFailure");
        AnonymousClass3TA r2 = this.A03;
        AnonymousClass3TA.A00(r2.A00, r2, AnonymousClass4DX.LOADING_FAILED);
        this.A00.A0E(new AnonymousClass4NI((AnonymousClass4VG) null, this.A02, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r4.A0e, 10399) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C7H(X.AnonymousClass4VG r7) {
        /*
            r6 = this;
            X.3TA r4 = r6.A03
            X.7Fe r0 = r4.A00
            boolean r0 = r0 instanceof X.C75373hL
            if (r0 == 0) goto L_0x0048
            X.4Ox r5 = r6.A02
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x001b
            X.0ve r2 = r4.A0e
            r1 = 10399(0x289f, float:1.4572E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r3 = 1
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            X.7Fe r2 = r4.A00
            X.3hL r2 = (X.C75373hL) r2
            X.4Rp r1 = r4.A0Y
            X.4Xd r0 = r6.A01
            X.Abv r0 = r1.A01(r0, r7, r3)
            r2.A0O(r0)
            X.1DT r2 = r6.A00
            r1 = 1
            X.4NI r0 = new X.4NI
            r0.<init>(r7, r5, r1)
            r2.A0E(r0)
            X.7Fe r1 = r4.A00
            X.4DX r0 = X.AnonymousClass4DX.WEB_PAGE_LOADED
            X.AnonymousClass3TA.A00(r1, r4, r0)
            X.10I r2 = r4.A0q
            r1 = 3
            X.3Bw r0 = new X.3Bw
            r0.<init>(r6, r7, r1)
            r2.CGF(r0)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95394mA.C7H(X.4VG):void");
    }

    public void onError(int i) {
        C17900vP.A0i("WebPagePreviewViewModel/CTWAListener/errorCode/", AnonymousClass000.A10(), i);
        AnonymousClass3TA r2 = this.A03;
        AnonymousClass3TA.A00(r2.A00, r2, AnonymousClass4DX.LOADING_FAILED);
        this.A00.A0E(new AnonymousClass4NI((AnonymousClass4VG) null, this.A02, false));
    }
}
