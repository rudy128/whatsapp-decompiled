package X;

import java.util.List;

/* renamed from: X.CgC  reason: case insensitive filesystem */
public abstract class C25459CgC {
    public static Boolean A00;
    public static Boolean A01;
    public static String A02;
    public static String A03;
    public static boolean A04;

    public static final boolean A01(String str, String str2) {
        List A0S = AnonymousClass1YF.A0S(str, new String[]{"."}, 0);
        Object A0c = C29431cG.A0c(A0S);
        if (A0c == null || !A0c.equals("eng")) {
            List A0S2 = AnonymousClass1YF.A0S(str2, new String[]{"."}, 0);
            int i = 0;
            while (i < A0S.size() && i < A0S2.size() && Long.parseLong(C17880vN.A0w(A0S, i)) <= Long.parseLong(C17880vN.A0w(A0S2, i))) {
                if (Long.parseLong(C17880vN.A0w(A0S, i)) < Long.parseLong(C17880vN.A0w(A0S2, i))) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static final void A00(boolean z) {
        A04 = z;
        C24712CGy.A01.A01("sup:VersionEnforcementService", C17900vP.A0D("Setting versionUpgradeRequired = ", AnonymousClass000.A10(), z));
    }
}
