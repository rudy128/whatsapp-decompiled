package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.9zc  reason: invalid class name and case insensitive filesystem */
public final class C199209zc {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(C199209zc.class, "notCompletedCount$volatile");
    public final EEF[] A00;
    public volatile /* synthetic */ int notCompletedCount$volatile;

    public C199209zc(EEF[] eefArr) {
        this.A00 = eefArr;
        this.notCompletedCount$volatile = eefArr.length;
    }

    public final Object A00(C30391dr r10) {
        C31781g7 A0s = AnonymousClass8BX.A0s(r10);
        EEF[] eefArr = this.A00;
        int length = eefArr.length;
        C22343B3u[] b3uArr = new C22343B3u[length];
        for (int i = 0; i < length; i++) {
            EEF eef = eefArr[i];
            eef.CNg();
            C22343B3u b3u = new C22343B3u(this, A0s);
            b3u.A00 = C30551e8.A01(b3u, eef, false, true);
            b3uArr[i] = b3u;
        }
        C21555Am2 am2 = new C21555Am2(this, b3uArr);
        for (int i2 = 0; i2 < length; i2++) {
            C22343B3u.A03.set(b3uArr[i2], am2);
        }
        if (!(C31781g7.A04.get(A0s) instanceof C35941n5)) {
            am2.A00();
        } else {
            C60682oR.A01(am2, A0s);
        }
        return A0s.A0C();
    }
}
