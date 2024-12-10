package X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.Set;

/* renamed from: X.1kE  reason: invalid class name and case insensitive filesystem */
public final class C34281kE {
    public static C34291kF A00 = C34291kF.A02;
    public static final C34281kE A01 = new Object();

    public static final void A03(C34301kG r2) {
        if (AnonymousClass1GP.A0G(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("StrictMode violation in ");
            sb.append(r2.fragment.getClass().getName());
            Log.d("FragmentManager", sb.toString(), r2);
        }
    }

    public static final C34291kF A00(Fragment fragment) {
        while (fragment != null) {
            if (fragment.A1b()) {
                fragment.A1F();
            }
            fragment = fragment.A0E;
        }
        return A00;
    }

    public static final void A01(Fragment fragment, String str) {
        C451927p r3 = new C451927p(fragment, str);
        A03(r3);
        C34291kF A002 = A00(fragment);
        if (A002.A01.contains(C34391kP.DETECT_FRAGMENT_REUSE) && A04(A002, fragment.getClass(), r3.getClass())) {
            A02(A002, r3);
        }
    }

    public static final void A02(C34291kF r6, C34301kG r7) {
        Fragment fragment = r7.fragment;
        String name = fragment.getClass().getName();
        Set set = r6.A01;
        if (set.contains(C34391kP.PENALTY_LOG)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Policy violation in ");
            sb.append(name);
            Log.d("FragmentStrictMode", sb.toString(), r7);
        }
        if (set.contains(C34391kP.PENALTY_DEATH)) {
            C21452AkJ akJ = new C21452AkJ(0, name, r7);
            if (fragment.A1b()) {
                Handler handler = fragment.A1F().A08.A02;
                if (!C18070vi.A18(handler.getLooper(), Looper.myLooper())) {
                    handler.post(akJ);
                    return;
                }
            }
            akJ.run();
            throw null;
        }
    }

    public static final boolean A04(C34291kF r2, Class cls, Class cls2) {
        Set set = (Set) r2.A00.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (C18070vi.A18(cls2.getSuperclass(), C34301kG.class) || !C29431cG.A18(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
