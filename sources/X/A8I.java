package X;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class A8I {
    public static final A8I A00 = new Object();
    public static final Pattern A01 = Pattern.compile("à\\(s\\)");
    public static final Pattern A02 = Pattern.compile("la\\(s\\)");

    public static final String A00(C18000vb r1, long j) {
        C18070vi.A0d(r1, 0);
        Calendar instance = Calendar.getInstance(r1.A0N());
        instance.setTimeInMillis(j);
        return A03(r1, instance);
    }

    public static final String A05(C18000vb r14, Calendar calendar, Calendar calendar2) {
        String str;
        int i;
        String str2;
        String str3;
        String A12;
        String str4;
        C18000vb r4 = r14;
        Calendar calendar3 = calendar2;
        Calendar calendar4 = calendar;
        if (C18000vb.A00(r14).A00) {
            i = 229;
            if (calendar.get(11) == calendar3.get(11)) {
                i = 230;
            }
        } else {
            int A002 = AnonymousClass1X0.A00(r14.A0N());
            if (A002 == 2 || A002 == 3) {
                String A08 = r14.A08(223);
                C18070vi.A0X(A08);
                A8I a8i = A00;
                str = r14.A0B(231, a8i.A02(r14, A08, calendar), a8i.A02(r14, A08, calendar3));
                C18070vi.A0X(str);
                return str;
            }
            i = 228;
            if (calendar.get(11) != calendar3.get(11)) {
                i = 226;
                if (calendar.get(9) == calendar3.get(9)) {
                    i = 227;
                }
            }
        }
        String A082 = r14.A08(i);
        int A003 = AnonymousClass8BS.A00(A082);
        StringBuilder A10 = AnonymousClass000.A10();
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (i2 < A003) {
            char charAt = A082.charAt(i2);
            if (charAt == '\'') {
                z = !z;
            } else {
                if (!z) {
                    z = false;
                    if (AnonymousClass1YF.A0C("ahHKm", charAt, 0, false) != -1) {
                        int i3 = i2;
                        while (i3 < A003 && A082.charAt(i3) == charAt) {
                            i3++;
                        }
                        int i4 = i3 - i2;
                        if (charAt == 'a') {
                            Calendar calendar5 = calendar3;
                            if (!z2) {
                                calendar5 = calendar4;
                            }
                            int i5 = 220;
                            if (calendar5.get(9) == 0) {
                                i5 = 211;
                            }
                            String A083 = r4.A08(i5);
                            C18070vi.A0X(A083);
                            A10.append(A083);
                            z2 = true;
                        } else {
                            if (charAt == 'h') {
                                Calendar calendar6 = calendar3;
                                if (!z3) {
                                    calendar6 = calendar4;
                                }
                                A12 = A04(r4, calendar6, i4);
                            } else if (charAt == 'H') {
                                Calendar calendar7 = calendar3;
                                if (!z3) {
                                    calendar7 = calendar4;
                                }
                                Locale A0N = r4.A0N();
                                if (i4 == 1) {
                                    str4 = "%d";
                                } else {
                                    str4 = "%02d";
                                }
                                Object[] objArr = new Object[1];
                                AnonymousClass000.A1L(objArr, calendar7.get(11));
                                A12 = C108955ca.A12(A0N, str4, Arrays.copyOf(objArr, 1));
                            } else if (charAt == 'K') {
                                Calendar calendar8 = calendar3;
                                if (!z3) {
                                    calendar8 = calendar4;
                                }
                                int i6 = calendar8.get(10);
                                Locale A0N2 = r4.A0N();
                                if (i4 == 1) {
                                    str3 = "%d";
                                } else {
                                    str3 = "%02d";
                                }
                                Object[] objArr2 = new Object[1];
                                C17880vN.A1T(objArr2, i6, 0);
                                A12 = C108955ca.A12(A0N2, str3, Arrays.copyOf(objArr2, 1));
                            } else if (charAt == 'm') {
                                Calendar calendar9 = calendar3;
                                if (!z4) {
                                    calendar9 = calendar4;
                                }
                                Locale A0N3 = r4.A0N();
                                if (i4 == 1) {
                                    str2 = "%d";
                                } else {
                                    str2 = "%02d";
                                }
                                Object[] objArr3 = new Object[1];
                                AnonymousClass000.A1L(objArr3, calendar9.get(12));
                                A10.append(C108955ca.A12(A0N3, str2, Arrays.copyOf(objArr3, 1)));
                                z4 = true;
                            }
                            A10.append(A12);
                            z3 = true;
                        }
                        i2 = i3 - 1;
                    }
                }
                A10.append(charAt);
            }
            i2++;
        }
        str = A10.toString();
        C18070vi.A0X(str);
        return str;
    }

    public static final String A04(C18000vb r4, Calendar calendar, int i) {
        String str;
        int i2 = calendar.get(10);
        if (i2 == 0) {
            i2 = 12;
        }
        Locale A0N = r4.A0N();
        if (i == 1) {
            str = "%d";
        } else {
            str = "%02d";
        }
        Object[] objArr = new Object[1];
        C17880vN.A1T(objArr, i2, 0);
        return C108955ca.A12(A0N, str, Arrays.copyOf(objArr, 1));
    }

    public static final String A01(C18000vb r3, String str, long j) {
        Matcher matcher;
        String str2;
        boolean z;
        String str3;
        C18070vi.A0h(r3, str);
        String A05 = r3.A05();
        int hashCode = A05.hashCode();
        if (hashCode != 3246) {
            if (hashCode != 3588 || !A05.equals("pt")) {
                return str;
            }
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            int i = instance.get(11);
            if (i != 0) {
                z = true;
                if (i != 1 && (i != 13 || C18000vb.A00(r3).A00)) {
                    z = false;
                }
            } else {
                z = C18000vb.A00(r3).A00;
            }
            Matcher matcher2 = A01.matcher(str);
            if (z) {
                str3 = "à";
            } else {
                str3 = "às";
            }
            String replaceAll = matcher2.replaceAll(str3);
            C18070vi.A0X(replaceAll);
            return replaceAll;
        } else if (!A05.equals("es")) {
            return str;
        } else {
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(j);
            int i2 = instance2.get(11);
            if (i2 == 1 || (i2 == 13 && !C18000vb.A00(r3).A00)) {
                matcher = A02.matcher(str);
                str2 = "la";
            } else {
                matcher = A02.matcher(str);
                str2 = "las";
            }
            String replaceAll2 = matcher.replaceAll(str2);
            C18070vi.A0b(replaceAll2);
            return replaceAll2;
        }
    }

    private final String A02(C18000vb r11, String str, Calendar calendar) {
        String str2;
        String A12;
        String str3;
        String str4;
        int[] iArr;
        int[] iArr2;
        int length = str.length();
        StringBuilder A10 = AnonymousClass000.A10();
        int i = 0;
        boolean z = false;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '\'') {
                z = !z;
            } else if (z || AnonymousClass1YF.A0C("aBhHKm", charAt, 0, false) == -1) {
                A10.append(charAt);
            } else {
                int i2 = i;
                while (i2 < length && str.charAt(i2) == charAt) {
                    i2++;
                }
                int i3 = i2 - i;
                if (charAt == 'a') {
                    int i4 = 220;
                    if (calendar.get(9) == 0) {
                        i4 = 211;
                    }
                    A12 = r11.A08(i4);
                    C18070vi.A0X(A12);
                } else if (charAt == 'B') {
                    Locale A0N = r11.A0N();
                    String[] strArr = AnonymousClass1X0.A04;
                    String languageTag = A0N.toLanguageTag();
                    AnonymousClass00P r1 = C26082Crx.A00;
                    C185839dE r8 = (C185839dE) r1.get(languageTag);
                    if (r8 == null && (r8 = (C185839dE) r1.get(A0N.getLanguage())) == null) {
                        int i5 = 220;
                        if (calendar.get(9) == 0) {
                            i5 = 211;
                        }
                        A12 = r11.A08(i5);
                    } else {
                        int i6 = calendar.get(11);
                        if (calendar.get(12) == 0 && (iArr = r8.A00) != null && (iArr2 = r8.A01) != null) {
                            int i7 = 0;
                            while (true) {
                                if (i7 >= iArr.length) {
                                    break;
                                } else if (iArr[i7] == i6) {
                                    A12 = r11.A08(iArr2[i7]);
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                        }
                        A12 = r11.A08(r8.A02[i6]);
                    }
                } else if (charAt == 'h') {
                    A12 = A04(r11, calendar, i3);
                } else if (charAt == 'H') {
                    Locale A0N2 = r11.A0N();
                    if (i3 == 1) {
                        str4 = "%d";
                    } else {
                        str4 = "%02d";
                    }
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1L(objArr, calendar.get(11));
                    A12 = C108955ca.A12(A0N2, str4, Arrays.copyOf(objArr, 1));
                } else if (charAt == 'K') {
                    int i8 = calendar.get(10);
                    Locale A0N3 = r11.A0N();
                    if (i3 == 1) {
                        str3 = "%d";
                    } else {
                        str3 = "%02d";
                    }
                    Object[] objArr2 = new Object[1];
                    C17880vN.A1T(objArr2, i8, 0);
                    A12 = C108955ca.A12(A0N3, str3, Arrays.copyOf(objArr2, 1));
                } else {
                    if (charAt == 'm') {
                        Locale A0N4 = r11.A0N();
                        if (i3 == 1) {
                            str2 = "%d";
                        } else {
                            str2 = "%02d";
                        }
                        Object[] objArr3 = new Object[1];
                        AnonymousClass000.A1L(objArr3, calendar.get(12));
                        A12 = C108955ca.A12(A0N4, str2, Arrays.copyOf(objArr3, 1));
                    }
                    i = i2 - 1;
                }
                A10.append(A12);
                i = i2 - 1;
            }
            i++;
        }
        return C18070vi.A0H(A10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r1 == 3) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A03(X.C18000vb r3, java.util.Calendar r4) {
        /*
            X.C18070vi.A0h(r3, r4)
            X.1Wz r0 = X.C18000vb.A00(r3)
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x001b
            r2 = 225(0xe1, float:3.15E-43)
        L_0x000d:
            X.A8I r1 = A00
            java.lang.String r0 = r3.A08(r2)
            X.C18070vi.A0X(r0)
            java.lang.String r0 = r1.A02(r3, r0, r4)
            return r0
        L_0x001b:
            java.util.Locale r0 = r3.A0N()
            int r1 = X.AnonymousClass1X0.A00(r0)
            r0 = 2
            if (r1 == r0) goto L_0x002b
            r0 = 3
            r2 = 224(0xe0, float:3.14E-43)
            if (r1 != r0) goto L_0x000d
        L_0x002b:
            r2 = 223(0xdf, float:3.12E-43)
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8I.A03(X.0vb, java.util.Calendar):java.lang.String");
    }
}
