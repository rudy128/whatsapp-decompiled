package X;

import com.whatsapp.util.Log;

/* renamed from: X.Adi  reason: case insensitive filesystem */
public class C21052Adi implements C1602487s {
    public final int A00;
    public final Object A01;

    public C21052Adi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C4S(boolean z) {
        if (this.A00 != 0) {
            C115095tO r0 = (C115095tO) this.A01;
            if (z) {
                C115095tO.A07(r0);
                return;
            }
            return;
        }
        C17900vP.A0n("voip/onScreenLockChanged:", AnonymousClass000.A10(), z);
        A99 a99 = (A99) this.A01;
        a99.A1b = z;
        AnonymousClass1HQ r2 = a99.A29;
        if (C40811vJ.A0e(r2.BO3())) {
            if (z && a99.A1Y) {
                ((A1P) a99.A3T.get()).A02(AnonymousClass6RY.SCREEN_LOCKED);
                r2.CQ1();
                a99.A1A(false, true);
            }
            if (!a99.A1b && a99.A1J && a99.A0M != null) {
                Log.i("onScreenLockChanged screen is turned on, but ear-near is still true, release and reacquire the proximity wake lock.");
                A99.A09(a99);
                a99.A0H.sendEmptyMessageDelayed(14, 6000);
            }
        }
    }
}
