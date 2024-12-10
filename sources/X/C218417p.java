package X;

import android.net.Uri;
import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.17p  reason: invalid class name and case insensitive filesystem */
public final class C218417p implements C218317o, C201511a {
    public AnonymousClass02n A00;
    public AnonymousClass02n A01;
    public AnonymousClass02n A02;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.02h] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.02h] */
    public void A00(Uri uri, AnonymousClass01C r16, C22821Di r17) {
        AnonymousClass05q A04;
        Uri uri2 = uri;
        AnonymousClass01C r5 = r16;
        C18070vi.A0d(r5, 0);
        C18070vi.A0d(uri, 1);
        C22821Di r7 = r17;
        if (C19740yt.A01(r5, "android.permission.CAMERA") == 0) {
            r5.getLifecycle().A05(this);
            A04 = r5.A04.A04(new AGJ(uri2, r5, this, r7, 2), new Object(), "camera_rq#101");
            this.A00 = A04;
        } else {
            A04 = r5.A04.A04(new AGJ(uri, r5, this, r7, 1), new Object(), "permission_rq#101");
            this.A01 = A04;
            uri2 = "android.permission.CAMERA";
        }
        A04.A02((C1406772n) null, uri2);
    }

    @OnLifecycleEvent(C27581Wq.ON_DESTROY)
    public final void onDestroy() {
        AnonymousClass02n r0 = this.A02;
        if (r0 != null) {
            r0.A01();
        }
        this.A02 = null;
        AnonymousClass02n r02 = this.A00;
        if (r02 != null) {
            r02.A01();
        }
        this.A00 = null;
        AnonymousClass02n r03 = this.A01;
        if (r03 != null) {
            r03.A01();
        }
        this.A01 = null;
    }
}
