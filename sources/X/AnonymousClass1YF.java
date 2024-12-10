package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1YF  reason: invalid class name */
public abstract class AnonymousClass1YF extends AnonymousClass1YE {
    public static final int A0B(CharSequence charSequence, char c, int i) {
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (cArr[0] == charSequence.charAt(i)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static final int A0C(CharSequence charSequence, char c, int i, boolean z) {
        int i2;
        C18070vi.A0d(charSequence, 0);
        if (z || !(charSequence instanceof String)) {
            char[] cArr = {c};
            if (z || !(charSequence instanceof String)) {
                if (i < 0) {
                    i = 0;
                }
                int length = charSequence.length() - 1;
                if (i > length) {
                    return -1;
                }
                do {
                    if (AnonymousClass3JC.A01(cArr[0], charSequence.charAt(i), z)) {
                        return i;
                    }
                    i2 = i;
                    i++;
                } while (i2 != length);
                return -1;
            }
        }
        return ((String) charSequence).indexOf(c, i);
    }

    public static final int A0D(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C25391Oa r1;
        int i3;
        boolean regionMatches;
        int i4 = i2;
        int i5 = i;
        if (!z2) {
            if (i < 0) {
                i5 = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i4 = length;
            }
            r1 = new C25411Oc(i5, i4);
        } else {
            int length2 = charSequence.length() - 1;
            if (i > length2) {
                i5 = length2;
            }
            if (i2 < 0) {
                i4 = 0;
            }
            r1 = new C25391Oa(i5, i4, -1);
        }
        CharSequence charSequence3 = charSequence2;
        boolean z3 = z;
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            i3 = r1.A00;
            int i6 = r1.A01;
            int i7 = r1.A02;
            if (i7 > 0) {
                if (i3 > i6) {
                    return -1;
                }
            } else if (i7 >= 0 || i6 > i3) {
                return -1;
            }
            while (true) {
                String str = (String) charSequence3;
                String str2 = (String) charSequence;
                int length3 = charSequence2.length();
                C18070vi.A0d(str, 0);
                C18070vi.A0d(str2, 2);
                if (!z) {
                    regionMatches = str.regionMatches(0, str2, i3, length3);
                } else {
                    regionMatches = str.regionMatches(z3, 0, str2, i3, length3);
                }
                if (regionMatches) {
                    break;
                } else if (i3 == i6) {
                    return -1;
                } else {
                    i3 += i7;
                }
            }
        } else {
            int i8 = r1.A00;
            int i9 = r1.A01;
            int i10 = r1.A02;
            if (i10 > 0) {
                if (i8 > i9) {
                    return -1;
                }
            } else if (i10 >= 0 || i9 > i8) {
                return -1;
            }
            while (true) {
                if (A0X(charSequence3, charSequence, 0, i3, charSequence3.length(), z)) {
                    break;
                } else if (i3 == i9) {
                    return -1;
                } else {
                    i8 = i3 + i10;
                }
            }
        }
        return i3;
    }

    public static final int A0E(CharSequence charSequence, String str, int i) {
        CharSequence charSequence2 = charSequence;
        String str2 = str;
        C18070vi.A0d(str, 1);
        int i2 = i;
        if (!(charSequence2 instanceof String)) {
            return A0D(charSequence2, str2, i2, 0, false, true);
        }
        return ((String) charSequence2).lastIndexOf(str, i);
    }

    public static final int A0F(CharSequence charSequence, String str, int i, boolean z) {
        CharSequence charSequence2 = charSequence;
        C18070vi.A0d(charSequence2, 0);
        String str2 = str;
        C18070vi.A0d(str, 1);
        int i2 = i;
        boolean z2 = z;
        if (z || !(charSequence2 instanceof String)) {
            return A0D(charSequence2, str2, i2, charSequence2.length(), z2, false);
        }
        return ((String) charSequence2).indexOf(str, i);
    }

    public static final CharSequence A0G(CharSequence charSequence) {
        C18070vi.A0d(charSequence, 0);
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A00 = AnonymousClass1c5.A00(charSequence.charAt(i2));
            if (z) {
                if (!A00) {
                    break;
                }
                length--;
            } else if (!A00) {
                z = true;
            } else {
                i++;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final CharSequence A0H(CharSequence charSequence) {
        C18070vi.A0d(charSequence, 0);
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!AnonymousClass1c5.A00(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    public static final String A0J(CharSequence charSequence, String str) {
        boolean A0X;
        String str2 = str;
        CharSequence charSequence2 = charSequence;
        if (charSequence instanceof String) {
            A0X = AnonymousClass1YE.A0A(str, (String) charSequence2, false);
        } else {
            A0X = A0X(str2, charSequence2, 0, 0, charSequence.length(), false);
        }
        if (!A0X) {
            return str2;
        }
        String substring = str2.substring(charSequence2.length());
        C18070vi.A0X(substring);
        return substring;
    }

    public static final String A0K(CharSequence charSequence, String str) {
        C18070vi.A0d(str, 0);
        C18070vi.A0d(charSequence, 1);
        if (!A0W(str, charSequence)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        C18070vi.A0X(substring);
        return substring;
    }

    public static final String A0M(String str, String str2, char c) {
        C18070vi.A0d(str, 0);
        C18070vi.A0d(str2, 2);
        int length = str.length();
        int A0B = A0B(str, c, length - 1);
        if (A0B == -1) {
            return str2;
        }
        String substring = str.substring(A0B + 1, length);
        C18070vi.A0X(substring);
        return substring;
    }

    public static final String A0N(String str, String str2, String str3) {
        C18070vi.A0d(str, 0);
        C18070vi.A0d(str2, 1);
        C18070vi.A0d(str3, 2);
        int A0F = A0F(str, str2, 0, false);
        if (A0F == -1) {
            return str3;
        }
        String substring = str.substring(A0F + str2.length(), str.length());
        C18070vi.A0X(substring);
        return substring;
    }

    public static final StringBuilder A0O(CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        StringBuilder sb;
        C18070vi.A0d(charSequence, 0);
        C18070vi.A0d(charSequence2, 3);
        if (i2 >= i) {
            sb.append(charSequence, 0, i);
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        sb = new StringBuilder();
        sb.append("End index (");
        sb.append(i2);
        sb.append(") is less than start index (");
        sb.append(i);
        sb.append(").");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static final List A0P(CharSequence charSequence) {
        List asList = Arrays.asList(new String[]{"\r\n", "\n", "\r"});
        C18070vi.A0X(asList);
        return AnonymousClass1b2.A06(AnonymousClass1b2.A0C(new AnonymousClass1b0(charSequence), new C28841az(charSequence, new C28831ay(asList), 0)));
    }

    public static final List A0Q(CharSequence charSequence, String str, int i) {
        int i2 = 0;
        int A0F = A0F(charSequence, str, 0, false);
        if (A0F == -1 || i == 1) {
            List singletonList = Collections.singletonList(charSequence.toString());
            C18070vi.A0X(singletonList);
            return singletonList;
        }
        boolean z = false;
        int i3 = 10;
        if (i > 0) {
            z = true;
            i3 = i;
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, A0F).toString());
            i2 = str.length() + A0F;
            if ((z && arrayList.size() == i - 1) || (A0F = A0F(charSequence, str, i2, false)) == -1) {
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i2, A0F).toString());
            i2 = str.length() + A0F;
            break;
        } while ((A0F = A0F(charSequence, str, i2, false)) == -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    public static final List A0R(CharSequence charSequence, char[] cArr) {
        C18070vi.A0d(charSequence, 0);
        return A0Q(charSequence, String.valueOf(cArr[0]), 0);
    }

    public static final List A0S(CharSequence charSequence, String[] strArr, int i) {
        C18070vi.A0d(charSequence, 0);
        String str = strArr[0];
        if (str.length() != 0) {
            return A0Q(charSequence, str, i);
        }
        List asList = Arrays.asList(strArr);
        C18070vi.A0X(asList);
        C98544rK r1 = new C98544rK(new C28841az(charSequence, new C28831ay(asList), i), 2);
        ArrayList arrayList = new ArrayList(10);
        Iterator it = r1.iterator();
        while (it.hasNext()) {
            C25391Oa r2 = (C25391Oa) it.next();
            C18070vi.A0d(r2, 1);
            arrayList.add(charSequence.subSequence(r2.A00, r2.A01 + 1).toString());
        }
        return arrayList;
    }

    public static final boolean A0T(CharSequence charSequence) {
        C18070vi.A0d(charSequence, 0);
        for (int i = 0; i < charSequence.length(); i++) {
            if (!AnonymousClass1c5.A00(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0V(CharSequence charSequence, CharSequence charSequence2) {
        return A0Y(charSequence, charSequence2, false);
    }

    public static final boolean A0W(CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3 = charSequence2;
        CharSequence charSequence4 = charSequence;
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return A0X(charSequence4, charSequence3, charSequence.length() - charSequence2.length(), 0, charSequence2.length(), false);
        }
        String str = (String) charSequence4;
        String str2 = (String) charSequence3;
        C18070vi.A0d(str, 0);
        C18070vi.A0d(str2, 1);
        return str.endsWith(str2);
    }

    public static final boolean A0X(CharSequence charSequence, CharSequence charSequence2, int i, int i2, int i3, boolean z) {
        if (i2 >= 0 && i >= 0 && i <= charSequence.length() - i3 && i2 <= charSequence2.length() - i3) {
            int i4 = 0;
            while (i4 < i3) {
                if (AnonymousClass3JC.A01(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                    i4++;
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean A0Y(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        int A0D;
        CharSequence charSequence3 = charSequence2;
        CharSequence charSequence4 = charSequence;
        C18070vi.A0d(charSequence, 0);
        C18070vi.A0d(charSequence2, 1);
        boolean z2 = charSequence2 instanceof String;
        boolean z3 = z;
        if (z2) {
            A0D = A0F(charSequence, (String) charSequence3, 0, z);
        } else {
            A0D = A0D(charSequence4, charSequence3, 0, charSequence.length(), z3, false);
        }
        if (A0D < 0) {
            return false;
        }
        return true;
    }

    public static final String A0L(String str, int i) {
        CharSequence charSequence;
        int length = str.length();
        if (i <= length) {
            charSequence = str.subSequence(0, length);
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append(str);
            int i2 = i - length;
            int i3 = 1;
            charSequence = sb;
            if (1 <= i2) {
                while (true) {
                    sb.append(' ');
                    if (i3 == i2) {
                        charSequence = sb;
                        break;
                    }
                    i3++;
                }
            }
        }
        return charSequence.toString();
    }

    public static String A0I(CharSequence charSequence) {
        return A0G(charSequence).toString();
    }
}
