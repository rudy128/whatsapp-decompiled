package X;

import android.os.Handler;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* renamed from: X.49P  reason: invalid class name */
public class AnonymousClass49P extends A34 {
    public Handler A00;
    public Runnable A01;
    public final long A02 = SystemClock.uptimeMillis();
    public final C24921Me A03;
    public final AnonymousClass1E9 A04;
    public final WeakReference A05;
    public final boolean A06;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        return C24921Me.A04(this.A03, this.A04, 1, true);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Handler A0D = C17890vO.A0D();
        this.A00 = A0D;
        C146817Qs r4 = new C146817Qs(6, (String) obj, this);
        this.A01 = r4;
        if (this.A06) {
            A0D.postAtTime(r4, this.A02 + 3000);
        } else {
            r4.run();
        }
    }

    public AnonymousClass49P(C24921Me r3, AnonymousClass4R6 r4, AnonymousClass1E9 r5, boolean z) {
        this.A03 = r3;
        this.A05 = AnonymousClass3MW.A0z(r4);
        this.A04 = r5;
        this.A06 = z;
    }
}
