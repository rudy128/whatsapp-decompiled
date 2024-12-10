package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.5hB  reason: invalid class name and case insensitive filesystem */
public final class C110835hB extends AnonymousClass0XW implements C17640uz {
    public C18090vk A00;
    public boolean A01;

    public void A0J() {
        this.A01 = false;
    }

    public void BJM(C17480uj r4) {
        C18070vi.A0d(r4, 0);
        if (!this.A01) {
            this.A01 = true;
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                new Handler(myLooper).postAtFrontOfQueue(new C70563Bp(this, 23));
            } else {
                throw C17880vN.A0g();
            }
        }
        r4.BJR();
    }

    public /* synthetic */ void Bxi() {
    }
}
