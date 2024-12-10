package X;

import java.util.List;

/* renamed from: X.4HR  reason: invalid class name */
public abstract class AnonymousClass4HR {
    public static final C88074Yf A00(String str, int i, int i2, boolean z) {
        Integer A03;
        int i3 = i2;
        boolean z2 = z;
        int i4 = i;
        if (str == null) {
            return new C88074Yf((String) null, (String) null, i4, i3, z2);
        }
        List A0S = AnonymousClass1YF.A0S(str, new String[]{":"}, 0);
        Object obj = A0S.get(0);
        String str2 = (String) obj;
        String str3 = null;
        if (AnonymousClass4ZA.A00(str2) || !AnonymousClass4ZA.A01(str2)) {
            obj = null;
        }
        String str4 = (String) obj;
        Object obj2 = A0S.get(0);
        if (!(!AnonymousClass4ZA.A00((String) obj2))) {
            str3 = obj2;
        }
        String str5 = str3;
        String str6 = (String) C29431cG.A0f(A0S, 1);
        if (!(str6 == null || (A03 = AnonymousClass1YD.A03(str6)) == null)) {
            i4 = A03.intValue();
        }
        return new C88074Yf(str4, str5, i4, i2, z);
    }
}
