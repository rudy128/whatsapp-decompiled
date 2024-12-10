package X;

import java.io.IOException;

/* renamed from: X.1uB  reason: invalid class name and case insensitive filesystem */
public final class C40111uB {
    public final C40131uD A00;
    public final String[] A01;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.1tn, java.lang.Object] */
    public static C40111uB A01(String... strArr) {
        String str;
        try {
            int length = strArr.length;
            C40081u8[] r5 = new C40081u8[length];
            ? obj = new Object();
            for (int i = 0; i < length; i++) {
                String str2 = strArr[i];
                String[] strArr2 = C39941tt.A04;
                C39911tq A06 = obj.A06(1);
                byte[] bArr = A06.A06;
                int i2 = A06.A00;
                A06.A00 = i2 + 1;
                bArr[i2] = 34;
                obj.A00++;
                int length2 = str2.length();
                int i3 = 0;
                for (int i4 = 0; i4 < length2; i4++) {
                    char charAt = str2.charAt(i4);
                    if (charAt < 128) {
                        str = strArr2[charAt];
                        if (str == null) {
                        }
                    } else if (charAt == 8232) {
                        str = "\\u2028";
                    } else if (charAt == 8233) {
                        str = "\\u2029";
                    }
                    if (i3 < i4) {
                        obj.A09(str2, i3, i4);
                    }
                    obj.A09(str, 0, str.length());
                    i3 = i4 + 1;
                }
                if (i3 < length2) {
                    obj.A09(str2, i3, length2);
                }
                C39911tq A062 = obj.A06(1);
                byte[] bArr2 = A062.A06;
                int i5 = A062.A00;
                A062.A00 = i5 + 1;
                bArr2[i5] = 34;
                obj.A00++;
                obj.A00();
                C40081u8 r0 = C40081u8.A02;
                r5[i] = new C40081u8(obj.A0A(obj.A00));
            }
            return new C40111uB(C40131uD.A02.A01(r5), (String[]) strArr.clone());
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static C40111uB A00(Object obj, String[] strArr, int i) {
        strArr[i] = obj;
        return A01(strArr);
    }

    public C40111uB(C40131uD r1, String[] strArr) {
        this.A01 = strArr;
        this.A00 = r1;
    }
}
