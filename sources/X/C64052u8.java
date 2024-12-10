package X;

import android.content.Context;
import android.content.res.Resources;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.2u8  reason: invalid class name and case insensitive filesystem */
public abstract class C64052u8 {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        r0 = new java.lang.Object[1];
        A0F(r5, r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        return r5.A0J(r0, r3, (long) r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(X.C18000vb r5, int r6, int r7) {
        /*
            r0 = 7
            if (r7 != r0) goto L_0x0012
            long r3 = (long) r6
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0015
            r0 = 2131892361(0x7f121889, float:1.9419468E38)
            java.lang.String r0 = r5.A09(r0)
            return r0
        L_0x0012:
            switch(r7) {
                case 0: goto L_0x002e;
                case 1: goto L_0x002b;
                case 2: goto L_0x0028;
                case 3: goto L_0x0025;
                case 4: goto L_0x0022;
                case 5: goto L_0x001f;
                case 6: goto L_0x001c;
                default: goto L_0x0015;
            }
        L_0x0015:
            java.lang.String r0 = "Invalid duration unit"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x001c:
            r3 = 296(0x128, float:4.15E-43)
            goto L_0x0030
        L_0x001f:
            r3 = 287(0x11f, float:4.02E-43)
            goto L_0x0030
        L_0x0022:
            r3 = 294(0x126, float:4.12E-43)
            goto L_0x0030
        L_0x0025:
            r3 = 275(0x113, float:3.85E-43)
            goto L_0x0030
        L_0x0028:
            r3 = 279(0x117, float:3.91E-43)
            goto L_0x0030
        L_0x002b:
            r3 = 284(0x11c, float:3.98E-43)
            goto L_0x0030
        L_0x002e:
            r3 = 290(0x122, float:4.06E-43)
        L_0x0030:
            long r1 = (long) r6
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            A0F(r5, r0, r6)
            java.lang.String r0 = r5.A0J(r0, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64052u8.A02(X.0vb, int, int):java.lang.String");
    }

    public static String A09(C18000vb r13, long j) {
        String A0B;
        int i;
        int i2;
        C17960vV.A0D(AnonymousClass000.A1Q((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        long j2 = j / 3600000;
        long j3 = j - (j2 * 3600000);
        long j4 = j3 / 60000;
        if (j3 - (60000 * j4) > 0) {
            j4++;
        }
        if (j4 == 60) {
            j2++;
            j4 = 0;
        }
        if (j2 == 0) {
            i2 = (int) j4;
            A0B = A02(r13, i2, 1);
            i = 2131755458;
        } else {
            int i3 = (int) j2;
            Object[] objArr = new Object[1];
            A0F(r13, objArr, i3);
            int i4 = (int) j4;
            Object[] objArr2 = new Object[1];
            A0F(r13, objArr2, i4);
            A0B = r13.A0B(239, r13.A0J(objArr, 281, (long) i3), r13.A0J(objArr2, 286, (long) i4));
            i = 2131755458;
            i2 = (int) (j2 + j4);
        }
        long j5 = (long) i2;
        return r13.A0K(new Object[]{A0B}, i, j5);
    }

    public static String A0B(C18000vb r5, long j) {
        Integer num;
        int A00 = A87.A00(7, System.currentTimeMillis(), j);
        if (A00 == 0) {
            num = AnonymousClass00R.A00;
        } else if (A00 == 1) {
            num = AnonymousClass00R.A01;
        } else if (A00 < 7) {
            num = AnonymousClass00R.A0C;
        } else {
            num = AnonymousClass00R.A0N;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return AnonymousClass11X.A00(r5);
        }
        if (intValue == 1) {
            return AnonymousClass11X.A00.A05(r5);
        }
        AnonymousClass11Y r0 = AnonymousClass11X.A00;
        if (intValue != 2) {
            return r0.A09(r5, j);
        }
        return r0.A08(r5, j);
    }

    public static void A0F(C18000vb r3, Object[] objArr, int i) {
        objArr[0] = String.format(r3.A0N(), "%d", new Object[]{Integer.valueOf(i)});
    }

    public static String A00(Context context, C18000vb r7, long j, long j2) {
        if (((int) Math.floor(((double) (j - j2)) / 3600000.0d)) < 12) {
            return C17880vN.A0q(context, A8I.A00(r7, j), new Object[1], 0, 2131891470);
        }
        int A00 = A87.A00(30, j, j2);
        Resources resources = context.getResources();
        Object[] objArr = new Object[1];
        C17880vN.A1T(objArr, A00, 0);
        return resources.getQuantityString(2131755195, A00, objArr);
    }

    public static String A04(C18000vb r9, long j) {
        C17960vV.A0D(AnonymousClass000.A1Q((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        int i = (int) (j / 3600000);
        long j2 = j % 3600000;
        int i2 = (int) (j2 / 60000);
        int A04 = (int) C17880vN.A04(j2 % 60000);
        if (i > 0) {
            Object[] objArr = new Object[1];
            A0F(r9, objArr, i);
            Object[] objArr2 = new Object[1];
            A0F(r9, objArr2, i2);
            return r9.A0B(244, r9.A0J(objArr, 281, (long) i), r9.A0J(objArr2, 286, (long) i2));
        } else if (i2 > 0) {
            Object[] objArr3 = new Object[1];
            A0F(r9, objArr3, i2);
            return r9.A0J(objArr3, 286, (long) i2);
        } else {
            Object[] objArr4 = new Object[1];
            A0F(r9, objArr4, A04);
            return r9.A0J(objArr4, 292, (long) A04);
        }
    }

    public static String A06(C18000vb r6, long j) {
        String A0B;
        int i;
        Object[] objArr;
        if (j == -1) {
            return r6.A09(2131892361);
        }
        long currentTimeMillis = System.currentTimeMillis();
        int A00 = A87.A00(C17880vN.A0i(), currentTimeMillis, j);
        if (A00 == 0) {
            i = 2131892373;
        } else if (A00 == -1) {
            i = 2131892374;
        } else {
            if (A00 > -30) {
                A0B = A87.A03(r6, AnonymousClass11X.A02(r6, j), A8I.A00(r6, j));
            } else if (A87.A05(currentTimeMillis, j)) {
                A0B = AnonymousClass11X.A02(r6, j);
            } else {
                A0B = AnonymousClass11X.A00.A0B(r6, j);
            }
            i = 2131892372;
            objArr = new Object[1];
            objArr[0] = A0B;
            return r6.A0C(i, objArr);
        }
        objArr = new Object[1];
        A0B = A8I.A00(r6, j);
        objArr[0] = A0B;
        return r6.A0C(i, objArr);
    }

    public static String A07(C18000vb r8, long j) {
        C17960vV.A0D(AnonymousClass000.A1Q((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        int i = (int) (j / 3600000);
        long j2 = j % 3600000;
        int i2 = (int) (j2 / 60000);
        String A02 = A02(r8, (int) C17880vN.A04(j2 % 60000), 0);
        if (i > 0) {
            return r8.A0B(238, r8.A0B(243, A02(r8, i, 2), A02(r8, i2, 1)), A02);
        } else if (i2 <= 0) {
            return A02;
        } else {
            return r8.A0B(244, A02(r8, i2, 1), A02);
        }
    }

    public static String A0D(C18000vb r17, String str, long j) {
        long j2;
        long j3;
        String str2;
        Object[] objArr;
        Long valueOf;
        String str3 = str;
        if (j >= 3600) {
            j2 = j / 3600;
            j -= 3600 * j2;
        } else {
            j2 = 0;
        }
        if (j >= 60) {
            j3 = j / 60;
            j -= 60 * j3;
        } else {
            j3 = 0;
        }
        C18000vb r2 = r17;
        if (str == null) {
            int i = 222;
            if (j2 > 0) {
                i = 221;
            }
            str3 = r2.A08(i);
        }
        int length = str3.length();
        StringBuilder sb = new StringBuilder(length);
        Locale A0N = r2.A0N();
        int i2 = 0;
        while (i2 < length) {
            char charAt = str3.charAt(i2);
            if (charAt == 'h' || charAt == 'm' || charAt == 's') {
                if (i2 + 1 >= length || str3.charAt(i2 + 1) != charAt) {
                    str2 = "%d";
                } else {
                    i2++;
                    str2 = "%02d";
                }
                if (charAt == 'h') {
                    objArr = new Object[1];
                    valueOf = Long.valueOf(j2);
                } else if (charAt == 'm') {
                    objArr = new Object[1];
                    valueOf = Long.valueOf(j3);
                } else if (charAt == 's') {
                    objArr = new Object[1];
                    valueOf = Long.valueOf(j);
                }
                objArr[0] = valueOf;
                sb.append(String.format(A0N, str2, objArr));
            } else {
                sb.append(charAt);
            }
            i2++;
        }
        return sb.toString();
    }

    public static String A01(AnonymousClass11P r7, C18000vb r8, Integer num, long j) {
        String A01;
        long A012 = AnonymousClass11P.A01(r7);
        Integer A0i = C17880vN.A0i();
        if (C17890vO.A1R(A87.A00(A0i, A012, j))) {
            A01 = AnonymousClass11X.A00.A05(r8);
        } else if (A87.A00(1, A012, j) == 0) {
            A01 = AnonymousClass11X.A00(r8);
        } else if (A87.A00(A0i, A012, j) == -1) {
            A01 = AnonymousClass11X.A01(r8);
        } else if (!A87.A05(j, A012)) {
            return AnonymousClass11X.A00.A07(r8, j);
        } else {
            return AnonymousClass11Y.A01(r8, j);
        }
        if (!num.equals(AnonymousClass00R.A00)) {
            return A01;
        }
        C18070vi.A0d(r8, 0);
        String A08 = r8.A08(171);
        C18070vi.A0X(A08);
        String format = new SimpleDateFormat(A08, r8.A0N()).format(new Date(j));
        C18070vi.A0X(format);
        return r8.A0C(2131895088, A01, format);
    }

    public static String A03(C18000vb r6, int i, long j) {
        int i2;
        Object[] objArr;
        String A06;
        String str;
        String A05 = r6.A05();
        if ("en".equals(A05) || "de".equals(A05) || "es".equals(A05)) {
            if (i <= 30) {
                i2 = 2131896920;
                objArr = new Object[1];
                A06 = AnonymousClass11X.A00.A06(r6, j);
            } else {
                DateFormat dateFormat = AnonymousClass11X.A02;
                if (dateFormat == null) {
                    dateFormat = DateFormat.getDateInstance(2, r6.A0N());
                    AnonymousClass11X.A02 = dateFormat;
                }
                Object clone = dateFormat.clone();
                C18070vi.A0z(clone, "null cannot be cast to non-null type java.text.DateFormat");
                return r6.A0C(2131889186, ((DateFormat) clone).format(new Date(j)));
            }
        } else if (i <= 30) {
            i2 = 2131896920;
            objArr = new Object[1];
            A06 = AnonymousClass11X.A00.A0B(r6, j);
        } else {
            i2 = 2131889186;
            objArr = new Object[1];
            str = AnonymousClass11X.A00.A0B(r6, j);
            objArr[0] = str;
            return r6.A0C(i2, objArr);
        }
        str = A87.A03(r6, A06, A8I.A00(r6, j));
        objArr[0] = str;
        return r6.A0C(i2, objArr);
    }

    public static String A05(C18000vb r5, long j) {
        int i;
        String A0B;
        long currentTimeMillis = System.currentTimeMillis();
        int A00 = A87.A00(C17880vN.A0i(), currentTimeMillis, j);
        if (A00 == 0) {
            i = 2131898488;
        } else if (A00 == 1) {
            i = 2131898489;
        } else {
            if (A87.A05(currentTimeMillis, j)) {
                A0B = AnonymousClass11X.A02(r5, j);
            } else {
                A0B = AnonymousClass11X.A00.A0B(r5, j);
            }
            return r5.A0C(2131898487, A87.A03(r5, A0B, A8I.A00(r5, j)));
        }
        return A8I.A01(r5, r5.A0C(i, A8I.A00(r5, j)), j);
    }

    public static String A08(C18000vb r6, long j) {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        int A00 = A87.A00(C17880vN.A0i(), currentTimeMillis, j);
        if (A00 == 0) {
            int i = (int) ((currentTimeMillis - j) / 60000);
            if (i < 1) {
                return r6.A09(2131891542);
            }
            if (i < 60) {
                Object[] objArr = new Object[1];
                A0F(r6, objArr, i);
                return r6.A0J(objArr, 270, (long) i);
            }
            str = AnonymousClass11X.A00(r6);
        } else if (A00 == 1) {
            str = AnonymousClass11X.A00.A05(r6);
        } else if (A87.A05(currentTimeMillis, j)) {
            str = AnonymousClass11X.A02(r6, j);
        } else {
            str = AnonymousClass11X.A00.A0B(r6, j);
        }
        return A87.A03(r6, str, A8I.A00(r6, j));
    }

    public static String A0A(C18000vb r11, long j) {
        long j2 = j / 3600000;
        long j3 = (j - (3600000 * j2)) / 60000;
        if (j2 == 0) {
            if (j3 == 0) {
                return A02(r11, (int) C17880vN.A04(j), 0);
            }
            return A02(r11, (int) j3, 1);
        } else if (j3 == 0) {
            return A02(r11, (int) j2, 2);
        } else {
            return r11.A0B(244, A02(r11, (int) j2, 2), A02(r11, (int) j3, 1));
        }
    }

    public static String A0C(C18000vb r3, long j, boolean z) {
        int A00 = A87.A00(C17880vN.A0i(), System.currentTimeMillis(), j);
        if (A00 == 0) {
            return A8I.A00(r3, j);
        }
        if (A00 == 1) {
            return AnonymousClass11X.A00.A05(r3);
        }
        if (!z) {
            return AnonymousClass11X.A00.A0B(r3, j);
        }
        C18070vi.A0d(r3, 0);
        String format = AnonymousClass11Y.A04(r3, 0).format(new Date(j));
        C18070vi.A0X(format);
        return format;
    }

    public static String A0E(C18000vb r5, Object[] objArr, int i, int i2, int i3, long j, boolean z) {
        Object[] copyOf;
        String A0B;
        int A00 = A87.A00(C17880vN.A0i(), System.currentTimeMillis(), j);
        int length = objArr.length;
        if (length == 0) {
            copyOf = new String[1];
        } else {
            copyOf = Arrays.copyOf(objArr, 2);
        }
        if (A00 == 0 || A00 == 1) {
            copyOf[length] = r5.A0F(A8I.A00(r5, j));
            if (A00 != 0) {
                i = i2;
            }
            return A8I.A01(r5, r5.A0C(i, copyOf), j);
        }
        if (A00 > 30 || !z) {
            A0B = AnonymousClass11X.A00.A0B(r5, j);
        } else {
            A0B = A87.A03(r5, AnonymousClass11X.A00.A0B(r5, j), A8I.A00(r5, j));
        }
        copyOf[length] = r5.A0F(A0B);
        return r5.A0C(i3, copyOf);
    }
}
