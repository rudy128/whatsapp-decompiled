package X;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.A5r  reason: case insensitive filesystem */
public abstract class C20067A5r {
    public static final HashSet A00 = AnonymousClass8BR.A12(Collections.singletonList("GTQ"));

    public static String A00(C18000vb r5, String str, String str2, BigDecimal bigDecimal, int i, boolean z) {
        C186689eb r0;
        A6S A0G = AnonymousClass8BW.A0G(A6S.A02, str);
        StringBuilder A10 = AnonymousClass000.A10();
        if (!z) {
            str2 = "";
        }
        A10.append(str2);
        A4I A01 = A6S.A01(A0G, r5, i, false);
        String A02 = A01.A07.A02(bigDecimal);
        C185829dD r1 = A01.A02;
        if (r1.A02) {
            if (bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
                r0 = r1.A00;
            } else {
                r0 = r1.A01;
            }
            A02 = A4I.A00(r0, A01, A02);
        }
        A10.append(A02);
        return AnonymousClass001.A1H(" ", str, A10);
    }

    public static String A01(C18000vb r5, String str, String str2, BigDecimal bigDecimal, int i, boolean z) {
        C186689eb r0;
        A6S a6s = A6S.A02;
        A4I A01 = A6S.A01(AnonymousClass8BW.A0G(a6s, str), r5, i, z);
        String A02 = A01.A07.A02(bigDecimal);
        C185829dD r1 = A01.A02;
        if (r1.A02) {
            if (bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
                r0 = r1.A00;
            } else {
                r0 = r1.A01;
            }
            A02 = A4I.A00(r0, A01, A02);
        }
        HashSet hashSet = A00;
        if (!hashSet.contains(str)) {
            return A02;
        }
        String replace = A02.replace(" ", "");
        if (!hashSet.contains(str)) {
            str2 = AnonymousClass8BW.A0G(a6s, str).A02(r5);
        }
        return replace.replace(str, str2);
    }

    public static String A02(C18000vb r5, String str, String str2, BigDecimal bigDecimal, boolean z) {
        A6S a6s = A6S.A02;
        String A03 = AnonymousClass8BW.A0G(a6s, str).A03(r5, bigDecimal, z);
        HashSet hashSet = A00;
        if (!hashSet.contains(str)) {
            return A03;
        }
        String replace = A03.replace(" ", "");
        if (!hashSet.contains(str)) {
            str2 = AnonymousClass8BW.A0G(a6s, str).A02(r5);
        }
        return replace.replace(str, str2);
    }
}
