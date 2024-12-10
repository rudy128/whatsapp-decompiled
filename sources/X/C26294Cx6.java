package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.List;

/* renamed from: X.Cx6  reason: case insensitive filesystem */
public class C26294Cx6 {
    public static final List A00 = AnonymousClass000.A13();
    public static volatile EAY A01 = DBD.A01;

    static {
        A01.CJT();
        C26265CwA.A00 = A01;
    }

    public static void A00(Class cls, String str) {
        if (A01.BfN(3)) {
            A01.BHz(cls.getSimpleName(), str);
        }
    }

    public static void A01(Object obj, Object obj2, String str, String str2) {
        if (A01.BfN(3)) {
            A04(str, StringFormatUtil.formatStrLocaleSafe(str2, obj, obj2));
        }
    }

    public static void A02(Object obj, String str, String str2) {
        if (A01.BfN(3)) {
            A04(str, StringFormatUtil.formatStrLocaleSafe(str2, obj));
        }
    }

    public static void A03(Object obj, String str, String str2) {
        if (A01.BfN(4)) {
            A06(str, StringFormatUtil.formatStrLocaleSafe(str2, obj));
        }
    }

    public static void A04(String str, String str2) {
        if (A01.BfN(3)) {
            A01.BHz(str, str2);
        }
    }

    public static void A06(String str, String str2) {
        if (A01.BfN(4)) {
            A01.Bd1(str, str2);
        }
    }

    public static void A07(String str, String str2) {
        if (A01.BfN(5)) {
            A01.CRu(str, str2);
        }
    }

    public static void A0B(String str, String str2, Throwable th) {
        if (A01.BfN(5)) {
            EAY eay = A01;
            if (th == null) {
                eay.CRu(str, str2);
            } else {
                eay.CRv(str, str2, th);
            }
        }
    }

    public static void A0G(String str, String str2, Object... objArr) {
        if (A01.BfN(5)) {
            A07(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr));
        }
    }

    public static void A05(String str, String str2) {
        if (BE8.A1R()) {
            A01.BJn(str, str2);
        }
    }

    public static void A08(String str, String str2) {
        if (BE8.A1R()) {
            A01.CSX(str, str2);
        }
    }

    public static void A09(String str, String str2, Throwable th) {
        if (BE8.A1R()) {
            A01.BJo(str, str2, th);
        }
    }

    public static void A0A(String str, String str2, Throwable th) {
        if (BE8.A1R()) {
            A01.BJo(str, str2, th);
        }
    }

    public static void A0C(String str, String str2, Throwable th) {
        if (BE8.A1R()) {
            A01.CSY(str, str2, th);
        }
    }

    public static void A0D(String str, String str2, Throwable th, Object... objArr) {
        if (BE8.A1R()) {
            A09(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr), th);
        }
    }

    public static void A0E(String str, String str2, Throwable th, Object... objArr) {
        if (BE8.A1R()) {
            A0C(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr), th);
        }
    }

    public static void A0F(String str, String str2, Object... objArr) {
        if (BE8.A1R()) {
            A05(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr));
        }
    }

    public static void A0H(String str, String str2, Object... objArr) {
        if (BE8.A1R()) {
            A08(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr));
        }
    }
}
