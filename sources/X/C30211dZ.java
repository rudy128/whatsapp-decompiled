package X;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1dZ  reason: invalid class name and case insensitive filesystem */
public class C30211dZ implements C24411Kf {
    public final AnonymousClass190 A00;
    public final C18180vt A01 = new C18180vt(10, 1000);
    public final AnonymousClass10I A02;
    public final ReferenceQueue A03 = new ReferenceQueue();
    public final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public final C18150vq A05 = new C18150vq((Object) null, new C70933Db(2));
    public volatile Runnable A06;
    public volatile boolean A07 = true;

    public void BlT() {
        this.A07 = true;
        Runnable runnable = this.A06;
        if (runnable != null) {
            this.A02.CEz(runnable);
            this.A06 = null;
        }
    }

    public void onAppBackgrounded() {
        this.A07 = false;
        if (this.A06 == null) {
            this.A06 = this.A02.CGv(new C70583Br(this, 27), 5000);
        }
    }

    public C30211dZ(AnonymousClass190 r4, AnonymousClass10I r5) {
        this.A00 = r4;
        this.A02 = r5;
    }
}
