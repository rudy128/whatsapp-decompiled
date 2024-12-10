package X;

import android.view.View;
import com.whatsapp.PagerSlidingTabStrip;

/* renamed from: X.8Er  reason: invalid class name and case insensitive filesystem */
public class C161488Er extends C28861b9 implements AnonymousClass1bA {
    public final C185139c5[] A00 = new C185139c5[2];
    public final /* synthetic */ AnonymousClass990 A01;

    public int A0E() {
        return 2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161488Er(AnonymousClass1GP r2, AnonymousClass990 r3) {
        super(r2, 0);
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r5 != 1) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence A0C(int r5) {
        /*
            r4 = this;
            X.990 r3 = r4.A01
            X.0vb r0 = r3.A0E
            boolean r2 = X.AnonymousClass3MY.A1b(r0)
            r1 = 1
            if (r5 == 0) goto L_0x0014
            if (r5 == r1) goto L_0x0016
        L_0x000d:
            java.lang.String r0 = "The item position should be less than: 2"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0014:
            r2 = r2 ^ 1
        L_0x0016:
            r0 = 2131888828(0x7f120abc, float:1.9412302E38)
            if (r2 == 0) goto L_0x0020
            if (r2 != r1) goto L_0x000d
            r0 = 2131888838(0x7f120ac6, float:1.9412323E38)
        L_0x0020:
            java.lang.String r0 = r3.getString(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161488Er.A0C(int):java.lang.CharSequence");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r3 != 1) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.fragment.app.Fragment A0I(int r3) {
        /*
            r2 = this;
            X.990 r0 = r2.A01
            X.0vb r0 = r0.A0E
            boolean r1 = X.AnonymousClass3MY.A1b(r0)
            r0 = 1
            if (r3 == 0) goto L_0x0014
            if (r3 == r0) goto L_0x0016
        L_0x000d:
            java.lang.String r0 = "The item position should be less than: 2"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0014:
            r1 = r1 ^ 1
        L_0x0016:
            if (r1 == 0) goto L_0x0020
            if (r1 != r0) goto L_0x000d
            com.whatsapp.qrcode.contactqr.QrScanCodeFragment r0 = new com.whatsapp.qrcode.contactqr.QrScanCodeFragment
            r0.<init>()
            return r0
        L_0x0020:
            com.whatsapp.qrcode.contactqr.ContactQrMyCodeFragment r0 = new com.whatsapp.qrcode.contactqr.ContactQrMyCodeFragment
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161488Er.A0I(int):androidx.fragment.app.Fragment");
    }

    public View BW7(int i) {
        C185139c5[] r4 = this.A00;
        if (r4[i] == null) {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.A01.A05;
            C185139c5 r2 = new C185139c5(AnonymousClass3MX.A0B(C72463Mc.A0K(pagerSlidingTabStrip, 0), pagerSlidingTabStrip, 2131626655, false));
            CharSequence A0C = A0C(i);
            C17960vV.A07(A0C);
            r2.A01.setText(A0C);
            r4[i] = r2;
        }
        return r4[i].A00;
    }
}
