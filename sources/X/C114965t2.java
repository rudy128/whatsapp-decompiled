package X;

import com.whatsapp.RequestPermissionActivity;

/* renamed from: X.5t2  reason: invalid class name and case insensitive filesystem */
public abstract class C114965t2 extends AnonymousClass1FP {
    public boolean A00 = false;

    public static void A00(AnonymousClass10E r1, AnonymousClass10G r2, AnonymousClass10G r3, RequestPermissionActivity requestPermissionActivity) {
        requestPermissionActivity.A00 = (C132846nh) r2.A08.get();
        requestPermissionActivity.A06 = (C133846pb) r3.A7f.get();
        requestPermissionActivity.A01 = (AnonymousClass12E) r1.A2k.get();
        requestPermissionActivity.A07 = C000200d.A00(r1.A4U);
        requestPermissionActivity.A02 = (AnonymousClass11C) r1.AAp.get();
        requestPermissionActivity.A03 = (C219217x) r1.ABj.get();
        requestPermissionActivity.A04 = (C19830z4) r1.ABl.get();
        requestPermissionActivity.A05 = (AnonymousClass18K) r1.A9B.get();
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            RequestPermissionActivity requestPermissionActivity = (RequestPermissionActivity) this;
            AnonymousClass1K1 r1 = (AnonymousClass1K1) AnonymousClass3MX.A0R(this);
            requestPermissionActivity.A01 = AnonymousClass1K1.A1X(r1);
            AnonymousClass10E r12 = r1.AAQ;
            requestPermissionActivity.A05 = AnonymousClass10E.AL1(r12);
            AnonymousClass10G r0 = r12.A00;
            A00(r12, r0, r0, requestPermissionActivity);
        }
    }

    public C114965t2() {
        AnonymousClass79Z.A00(this, 6);
    }
}
