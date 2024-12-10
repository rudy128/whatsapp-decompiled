package com.facebook.common.stringformat;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.AnonymousClass8BS;
import X.BE6;
import X.BE7;
import X.BEA;
import X.C108945cZ;
import java.util.Formatter;
import java.util.Locale;
import java.util.MissingFormatArgumentException;
import java.util.UnknownFormatConversionException;

public class StringFormatUtil {
    public static final Object[] A00;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        r11 = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A04(java.lang.String r12, java.lang.StringBuilder r13, java.lang.Object... r14) {
        /*
            r11 = 1
            r10 = 0
            boolean r9 = X.AnonymousClass000.A1X(r13)
            if (r14 == 0) goto L_0x0030
            int r0 = r14.length
            if (r0 == 0) goto L_0x0030
            r8 = 0
        L_0x000c:
            int r7 = r14.length
            r6 = 0
            r5 = 0
            r4 = 0
        L_0x0010:
            r3 = -201(0xffffffffffffff37, float:NaN)
            r2 = -200(0xffffffffffffff38, float:NaN)
            if (r10 >= r7) goto L_0x0034
            r1 = r14[r10]
            r0 = r8 ^ 1
            int r1 = A01(r1, r12, r13, r6, r0)
            r0 = -1
            if (r1 == r0) goto L_0x0048
            if (r9 == 0) goto L_0x0024
            int r5 = r5 + r1
        L_0x0024:
            int r6 = A02(r12, r6)
            if (r6 == r2) goto L_0x0034
            if (r6 == r3) goto L_0x0035
            int r10 = r10 + 1
            r4 = 1
            goto L_0x0010
        L_0x0030:
            java.lang.Object[] r14 = A00
            r8 = 1
            goto L_0x000c
        L_0x0034:
            r11 = r4
        L_0x0035:
            if (r9 == 0) goto L_0x003b
            if (r11 != 0) goto L_0x003b
            r0 = -2
            return r0
        L_0x003b:
            if (r6 == r2) goto L_0x0044
            if (r6 == r3) goto L_0x0044
            int r0 = A03(r12, r13, r6, r5, r9)
            return r0
        L_0x0044:
            if (r9 == 0) goto L_0x0047
            return r5
        L_0x0047:
            r0 = -3
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.stringformat.StringFormatUtil.A04(java.lang.String, java.lang.StringBuilder, java.lang.Object[]):int");
    }

    public static void appendFormatStrLocaleSafe(StringBuilder sb, String str, Object... objArr) {
        int A04 = A04(str, (StringBuilder) null, objArr);
        if (A04 == -1) {
            new Formatter(sb).format((Locale) null, str, objArr);
        } else if (A04 == -2) {
            sb.append(str);
        } else {
            sb.ensureCapacity(A04);
            A04(str, sb, objArr);
        }
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2) {
        String str2 = str;
        Object obj3 = obj;
        Object obj4 = obj2;
        int A002 = A00(obj3, obj4, (Object) null, (Object) null, str2, (StringBuilder) null, 2);
        if (A002 == -1) {
            return A05(str2, C108945cZ.A1a(obj, obj2, 2, 1));
        }
        if (A002 == -2) {
            return str2;
        }
        StringBuilder A0t = BE6.A0t(A002);
        A00(obj3, obj4, (Object) null, (Object) null, str2, A0t, 2);
        return A0t.toString();
    }

    static {
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = null;
        A00 = A1a;
    }

    public static int A00(Object obj, Object obj2, Object obj3, Object obj4, String str, StringBuilder sb, int i) {
        int A01;
        boolean A1X = AnonymousClass000.A1X(sb);
        int i2 = 0;
        if (i == 0) {
            i2 = -1;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i3 >= i) {
                break;
            }
            if (i3 == -1) {
                A01 = A01((Object) null, str, sb, i4, false);
            } else if (i3 == 0) {
                A01 = A01(obj, str, sb, i4, true);
            } else if (i3 == 1) {
                A01 = A01(obj2, str, sb, i4, true);
            } else if (i3 == 2) {
                A01 = A01(obj3, str, sb, i4, true);
            } else if (i3 == 3) {
                A01 = A01(obj4, str, sb, i4, true);
            } else {
                throw new AssertionError();
            }
            if (A01 == -1) {
                return -1;
            }
            if (A1X) {
                i5 += A01;
            }
            i4 = A02(str, i4);
            if (i3 == i2 && i4 == -200) {
                if (!A1X) {
                    return -3;
                }
                return -2;
            } else if (i4 >= 0) {
                i3++;
            } else if (i4 == -200 || i4 == -201) {
                if (A1X) {
                    return i5;
                }
            }
        }
        return A03(str, sb, i4, i5, A1X);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0089, code lost:
        if (r0 == null) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0096 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00be A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x00c3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(java.lang.Object r6, java.lang.String r7, java.lang.StringBuilder r8, int r9, boolean r10) {
        /*
            int r3 = r7.length()
            r5 = 0
        L_0x0005:
            if (r9 >= r3) goto L_0x0046
            char r0 = r7.charAt(r9)
            r4 = 37
            if (r0 != r4) goto L_0x00bf
            int r0 = r9 + 1
            if (r3 <= r0) goto L_0x0043
            char r1 = r7.charAt(r0)
            r0 = 115(0x73, float:1.61E-43)
            if (r1 == r0) goto L_0x0021
            r0 = 100
            if (r1 == r0) goto L_0x0021
            if (r1 != r4) goto L_0x0043
        L_0x0021:
            r1 = -100
        L_0x0023:
            r0 = -100
            r2 = -1
            if (r1 != r0) goto L_0x0032
            int r0 = r9 + 1
            char r1 = r7.charAt(r0)
            if (r10 != 0) goto L_0x0033
            if (r1 == r4) goto L_0x00b0
        L_0x0032:
            return r2
        L_0x0033:
            r0 = 115(0x73, float:1.61E-43)
            if (r1 != r0) goto L_0x0049
            boolean r0 = r6 instanceof java.util.Formattable
            if (r0 == 0) goto L_0x0082
            if (r8 == 0) goto L_0x0032
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0043:
            r1 = -101(0xffffffffffffff9b, float:NaN)
            goto L_0x0023
        L_0x0046:
            if (r8 != 0) goto L_0x0056
            return r5
        L_0x0049:
            r0 = 100
            if (r1 != r0) goto L_0x00ae
            if (r6 != 0) goto L_0x0058
            if (r8 == 0) goto L_0x006f
            java.lang.String r0 = "null"
        L_0x0053:
            r8.append(r0)
        L_0x0056:
            r5 = -3
            return r5
        L_0x0058:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0061
            if (r8 != 0) goto L_0x0071
            r1 = 11
            goto L_0x0093
        L_0x0061:
            boolean r0 = r6 instanceof java.lang.Short
            if (r0 == 0) goto L_0x0069
            if (r8 != 0) goto L_0x0071
            r1 = 6
            goto L_0x0093
        L_0x0069:
            boolean r0 = r6 instanceof java.lang.Byte
            if (r0 == 0) goto L_0x0079
            if (r8 != 0) goto L_0x0071
        L_0x006f:
            r1 = 4
            goto L_0x0093
        L_0x0071:
            int r0 = X.AnonymousClass000.A0M(r6)
            r8.append(r0)
            goto L_0x0056
        L_0x0079:
            boolean r0 = r6 instanceof java.lang.Long
            if (r0 == 0) goto L_0x00a6
            if (r8 != 0) goto L_0x009e
            r1 = 20
            goto L_0x0093
        L_0x0082:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L_0x0097
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
        L_0x0089:
            if (r0 != 0) goto L_0x008d
        L_0x008b:
            java.lang.String r0 = "null"
        L_0x008d:
            if (r8 != 0) goto L_0x0053
            int r1 = r0.length()
        L_0x0093:
            r0 = 1
            if (r1 != r2) goto L_0x00bb
            return r2
        L_0x0097:
            if (r6 == 0) goto L_0x008b
            java.lang.String r0 = r6.toString()
            goto L_0x0089
        L_0x009e:
            long r0 = X.C17880vN.A05(r6)
            r8.append(r0)
            goto L_0x0056
        L_0x00a6:
            if (r8 == 0) goto L_0x0032
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x00ae:
            if (r1 != r4) goto L_0x0032
        L_0x00b0:
            if (r8 == 0) goto L_0x00b5
            r8.append(r4)
        L_0x00b5:
            int r9 = r9 + 1
            r1 = 1
            r0 = 0
            if (r8 != 0) goto L_0x00c3
        L_0x00bb:
            int r5 = r5 + r1
            if (r0 == 0) goto L_0x00c3
            return r5
        L_0x00bf:
            if (r8 != 0) goto L_0x00c7
            int r5 = r5 + 1
        L_0x00c3:
            int r9 = r9 + 1
            goto L_0x0005
        L_0x00c7:
            r8.append(r0)
            goto L_0x00c3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.stringformat.StringFormatUtil.A01(java.lang.Object, java.lang.String, java.lang.StringBuilder, int, boolean):int");
    }

    public static int A02(String str, int i) {
        int i2;
        char charAt;
        int length = str.length();
        boolean z = false;
        while (i < length) {
            if (str.charAt(i) == '%' && length > (i2 = i + 1) && ((charAt = str.charAt(i2)) == 's' || charAt == 'd' || charAt == '%')) {
                if (str.charAt(i + 1) != '%') {
                    return i + 2;
                }
                i++;
                z = true;
            }
            i++;
        }
        if (z) {
            return -201;
        }
        return -200;
    }

    public static int A03(String str, StringBuilder sb, int i, int i2, boolean z) {
        int length = str.length();
        int i3 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '%') {
                if (length > i + 1 && str.charAt(i + 1) == '%') {
                    i++;
                } else if (z) {
                    return -1;
                } else {
                    throw new AssertionError();
                }
            }
            if (sb == null) {
                i3++;
            } else {
                sb.append(charAt);
            }
            i++;
        }
        int i4 = i2 + i3;
        if (!z) {
            return -3;
        }
        return i4;
    }

    public static String A05(String str, Object... objArr) {
        try {
            return BE7.A0o(str, objArr);
        } catch (MissingFormatArgumentException | UnknownFormatConversionException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            AnonymousClass8BS.A1I(A10, e);
            throw BEA.A0g(": ", str, A10);
        }
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        String str2 = str;
        Object obj5 = obj;
        Object obj6 = obj2;
        Object obj7 = obj3;
        Object obj8 = obj4;
        int A002 = A00(obj5, obj6, obj7, obj8, str2, (StringBuilder) null, 4);
        if (A002 == -1) {
            Object[] A1a = C108945cZ.A1a(obj, obj2, 4, 1);
            A1a[2] = obj3;
            A1a[3] = obj4;
            return A05(str2, A1a);
        } else if (A002 == -2) {
            return str2;
        } else {
            StringBuilder A0t = BE6.A0t(A002);
            A00(obj5, obj6, obj7, obj8, str2, A0t, 4);
            return A0t.toString();
        }
    }

    public static String formatStrLocaleSafe(String str, Object obj) {
        String str2 = str;
        Object obj2 = obj;
        int A002 = A00(obj2, (Object) null, (Object) null, (Object) null, str2, (StringBuilder) null, 1);
        if (A002 == -1) {
            return A05(str2, obj);
        } else if (A002 == -2) {
            return str2;
        } else {
            StringBuilder A0t = BE6.A0t(A002);
            A00(obj2, (Object) null, (Object) null, (Object) null, str2, A0t, 1);
            return A0t.toString();
        }
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2, Object obj3) {
        String str2 = str;
        Object obj4 = obj;
        Object obj5 = obj2;
        Object obj6 = obj3;
        int A002 = A00(obj4, obj5, obj6, (Object) null, str2, (StringBuilder) null, 3);
        if (A002 == -1) {
            Object[] A1a = C108945cZ.A1a(obj, obj2, 3, 1);
            A1a[2] = obj3;
            return A05(str2, A1a);
        } else if (A002 == -2) {
            return str2;
        } else {
            StringBuilder A0t = BE6.A0t(A002);
            A00(obj4, obj5, obj6, (Object) null, str2, A0t, 3);
            return A0t.toString();
        }
    }

    public static String formatStrLocaleSafe(String str) {
        String str2 = str;
        int A002 = A00((Object) null, (Object) null, (Object) null, (Object) null, str2, (StringBuilder) null, 0);
        if (A002 == -1) {
            return A05(str2, new Object[0]);
        }
        if (A002 == -2) {
            return str2;
        }
        StringBuilder A0t = BE6.A0t(A002);
        A00((Object) null, (Object) null, (Object) null, (Object) null, str2, A0t, 0);
        return A0t.toString();
    }

    public static String formatStrLocaleSafe(String str, Object... objArr) {
        int A04 = A04(str, (StringBuilder) null, objArr);
        if (A04 == -1) {
            return A05(str, objArr);
        }
        if (A04 == -2) {
            return str;
        }
        StringBuilder A0t = BE6.A0t(A04);
        A04(str, A0t, objArr);
        return A0t.toString();
    }
}
