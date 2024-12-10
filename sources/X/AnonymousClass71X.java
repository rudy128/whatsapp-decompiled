package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.71X  reason: invalid class name */
public final class AnonymousClass71X {
    public static C125766be A00;
    public static C160848Ae A01;
    public static Integer A02;
    public static WeakReference A03;
    public static WeakReference A04;
    public static final AnonymousClass71X A05 = new Object();
    public static final ConcurrentHashMap A06 = new ConcurrentHashMap(1);

    public static final boolean A00(C160848Ae r2, int i) {
        Integer num;
        if (i == 5) {
            r2.C9i();
            return true;
        } else if (i == 145) {
            r2.C9l();
            return true;
        } else if (i == 155) {
            r2.C9h();
            return true;
        } else if (i == 160) {
            r2.C9m();
            return true;
        } else if (i == 162) {
            r2.C9o();
            return true;
        } else if (i != 165) {
            if (i == 400) {
                num = AnonymousClass00R.A00;
            } else if (i == 420) {
                num = AnonymousClass00R.A01;
            } else if (i != 499) {
                return false;
            } else {
                num = AnonymousClass00R.A0N;
            }
            r2.C3C(num);
            return true;
        } else {
            r2.C9j();
            return true;
        }
    }

    public final void A01(int i, boolean z) {
        WeakReference weakReference = A03;
        if (weakReference != null) {
            weakReference.get();
            C160848Ae r0 = (C160848Ae) weakReference.get();
            if (r0 != null && !A00(r0, i)) {
                return;
            }
        }
        if (z) {
            A01 = null;
            A03 = null;
        }
    }
}
