package X;

import com.whatsapp.webview.ui.WaInAppBrowsingActivity;

/* renamed from: X.5sD  reason: invalid class name and case insensitive filesystem */
public abstract class C114925sD extends AnonymousClass1FY {
    public boolean A00 = false;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            WaInAppBrowsingActivity waInAppBrowsingActivity = (WaInAppBrowsingActivity) this;
            AnonymousClass1K1 r4 = (AnonymousClass1K1) AnonymousClass3MX.A0R(this);
            AnonymousClass10E A01 = C137116uw.A01(r4, waInAppBrowsingActivity);
            C63932tv.A02(A01, waInAppBrowsingActivity);
            AnonymousClass10G r1 = A01.A00;
            C63932tv.A01(A01, r1, waInAppBrowsingActivity);
            C63662tU.A00(A01, r1, waInAppBrowsingActivity, r1.A5A);
            A03(r4, A01, r1, waInAppBrowsingActivity);
        }
    }

    public C114925sD() {
        AGE.A00(this, 39);
    }

    public static void A03(AnonymousClass1K1 r1, AnonymousClass10E r2, AnonymousClass10G r3, WaInAppBrowsingActivity waInAppBrowsingActivity) {
        waInAppBrowsingActivity.A09 = AnonymousClass1K1.A25(r1);
        waInAppBrowsingActivity.A04 = (AnonymousClass6ZK) r1.A26.get();
        waInAppBrowsingActivity.A06 = (C36361nl) r2.A5h.get();
        waInAppBrowsingActivity.A05 = (AnonymousClass6ZL) r1.A27.get();
        waInAppBrowsingActivity.A08 = r3.AEe();
        waInAppBrowsingActivity.A0D = C000200d.A00(r1.A62);
        waInAppBrowsingActivity.A07 = (AnonymousClass1LU) r2.ABd.get();
        waInAppBrowsingActivity.A0A = AnonymousClass1K1.A26(r1);
        waInAppBrowsingActivity.A0B = (C133236oO) r3.A5D.get();
        waInAppBrowsingActivity.A0C = AnonymousClass1K1.A27(r1);
    }
}
