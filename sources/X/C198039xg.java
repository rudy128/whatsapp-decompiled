package X;

import android.os.Handler;

/* renamed from: X.9xg  reason: invalid class name and case insensitive filesystem */
public class C198039xg {
    public AnonymousClass7RF A00;
    public final C23391Fw A01;
    public final Handler A02 = new Handler();

    public static final void A00(C27581Wq r2, C198039xg r3) {
        AnonymousClass7RF r0 = r3.A00;
        if (r0 != null) {
            r0.run();
        }
        AnonymousClass7RF r1 = new AnonymousClass7RF(r2, r3.A01);
        r3.A00 = r1;
        r3.A02.postAtFrontOfQueue(r1);
    }

    public C198039xg(AnonymousClass1F9 r2) {
        this.A01 = new C23391Fw(r2);
    }
}
