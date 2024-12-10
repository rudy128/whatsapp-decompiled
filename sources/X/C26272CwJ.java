package X;

import android.animation.Animator;
import android.content.Context;
import android.util.SparseArray;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.CwJ  reason: case insensitive filesystem */
public abstract class C26272CwJ {
    public static final E6A A00 = new DNJ(0);

    public static boolean A08(DOZ doz) {
        if (doz == null) {
            return false;
        }
        return Boolean.TRUE.equals(DOZ.A00(doz, 2131428168));
    }

    public static DOZ A00(Context context, SparseArray sparseArray, C26962DNk dNk, CXY cxy, String str) {
        SparseArray clone = cxy.A00().clone();
        for (int i = 0; i < sparseArray.size(); i++) {
            clone.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
        clone.put(2131428183, C17880vN.A11());
        if (dNk == null) {
            dNk = new C26962DNk(C26235CvV.A01(new DFL(-1)), CFu.A00, C25416CfO.A00);
        }
        clone.put(2131428186, dNk);
        clone.put(2131428181, new C25062CVu());
        clone.put(2131428149, C17880vN.A11());
        clone.put(2131428185, C17880vN.A11());
        clone.put(2131428187, C17880vN.A11());
        clone.put(2131428156, C17880vN.A12());
        clone.put(2131428171, str);
        if (context.getApplicationContext() != null) {
            clone.put(2131428153, new CZ6(context));
        }
        if (clone.get(2131428175) == null) {
            clone.put(2131428175, DNP.A00);
        }
        clone.put(2131428160, BE8.A0q());
        cxy.A01.BNU();
        return new DOZ(context, clone, cxy);
    }

    public static C26962DNk A01(DOZ doz) {
        return (C26962DNk) doz.A01(2131428186);
    }

    public static E89 A02(DOZ doz, String str) {
        Map map = (Map) DOZ.A00(doz, 2131428161);
        if (map == null) {
            map = Collections.emptyMap();
        }
        return (E89) map.get(str);
    }

    public static C22415B6x A03(DOZ doz) {
        C22415B6x b6x = (C22415B6x) DOZ.A00(doz, 2131428166);
        if (b6x != null) {
            return b6x;
        }
        C22415B6x b6x2 = C25995CqB.A00().A07;
        C28111Yx.A02(b6x2);
        return b6x2;
    }

    public static Object A04(DOZ doz, DFL dfl) {
        Object A02 = doz.A02(A00, dfl, 2131428159);
        String A0C = dfl.A0C();
        if (A0C != null) {
            ((Map) doz.A01(2131428160)).put(A0C, A02);
        }
        return A02;
    }

    public static void A05(Animator animator, DOZ doz) {
        ((AbstractMap) doz.A01(2131428149)).values().remove(animator);
    }

    public static void A06(DOZ doz) {
        C26962DNk A01 = A01(doz);
        if (A01 != null && C26176Ctu.A03()) {
            int i = A01.A00;
            if (i > 0) {
                int i2 = i - 1;
                A01.A00 = i2;
                if (i2 == 0 && A01.A0H.size() > 0) {
                    A01.A07();
                    return;
                }
                return;
            }
            throw AnonymousClass000.A0n("Negative recursion level.");
        }
    }

    public static boolean A07(DOZ doz) {
        Boolean bool = (Boolean) DOZ.A00(doz, 2131428157);
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }
}
