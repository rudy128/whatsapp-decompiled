package X;

/* renamed from: X.Cnm  reason: case insensitive filesystem */
public abstract class C25877Cnm {
    public static String A00(int i, int i2, String str) {
        Object[] A1a;
        String str2;
        if (i < 0) {
            A1a = new Object[2];
            BE8.A1A(str, A1a, 0, i, 1);
            str2 = "%s (%s) must not be negative";
        } else if (i2 >= 0) {
            A1a = AnonymousClass8BR.A1a();
            A1a[0] = str;
            BEA.A1V(A1a, i, 1, i2, 2);
            str2 = "%s (%s) must not be greater than size (%s)";
        } else {
            throw AnonymousClass001.A13("negative size: ", AnonymousClass000.A10(), i2);
        }
        return CBR.A00(str2, A1a);
    }

    public static void A01(int i, int i2) {
        Object[] objArr;
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                objArr = new Object[2];
                BE8.A1A("index", objArr, 0, i, 1);
                str = "%s (%s) must not be negative";
            } else if (i2 < 0) {
                throw AnonymousClass001.A13("negative size: ", AnonymousClass000.A10(), i2);
            } else {
                objArr = AnonymousClass8BR.A1a();
                objArr[0] = "index";
                BEA.A1V(objArr, i, 1, i2, 2);
                str = "%s (%s) must be less than size (%s)";
            }
            throw BE6.A0l(CBR.A00(str, objArr));
        }
    }

    public static void A02(int i, int i2, int i3) {
        String str;
        if (i >= 0) {
            if (i2 >= i && i2 <= i3) {
                return;
            }
            if (i <= i3) {
                if (i2 < 0 || i2 > i3) {
                    str = A00(i2, i3, "end index");
                } else {
                    Object[] A1b = AnonymousClass3MW.A1b();
                    BEA.A1U(A1b, i2, i);
                    str = CBR.A00("end index (%s) must not be less than start index (%s)", A1b);
                }
                throw BE6.A0l(str);
            }
        }
        str = A00(i, i3, "start index");
        throw BE6.A0l(str);
    }
}
