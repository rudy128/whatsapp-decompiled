package X;

/* renamed from: X.1YE  reason: invalid class name */
public abstract class AnonymousClass1YE extends AnonymousClass1YD {
    public static final String A05(CharSequence charSequence, int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Count 'n' must be non-negative, but was ");
            sb.append(i);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        } else if (i == 0) {
            return "";
        } else {
            int i2 = 1;
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb2 = new StringBuilder(charSequence.length() * i);
                while (true) {
                    sb2.append(charSequence);
                    if (i2 != i) {
                        i2++;
                    } else {
                        String obj = sb2.toString();
                        C18070vi.A0b(obj);
                        return obj;
                    }
                }
            } else {
                int i3 = 0;
                char charAt = charSequence.charAt(0);
                char[] cArr = new char[i];
                do {
                    cArr[i3] = charAt;
                    i3++;
                } while (i3 < i);
                return new String(cArr);
            }
        }
    }

    public static final String A06(String str, String str2, String str3) {
        C18070vi.A0d(str, 0);
        C18070vi.A0d(str3, 2);
        int A0F = AnonymousClass1YF.A0F(str, str2, 0, false);
        if (A0F >= 0) {
            return AnonymousClass1YF.A0O(str, str3, A0F, str2.length() + A0F).toString();
        }
        return str;
    }

    public static final String A07(String str, String str2, String str3, boolean z) {
        C18070vi.A0d(str, 0);
        C18070vi.A0d(str2, 1);
        C18070vi.A0d(str3, 2);
        int i = 0;
        int A0F = AnonymousClass1YF.A0F(str, str2, 0, z);
        if (A0F < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length;
        if (length < 1) {
            i2 = 1;
        }
        int length2 = str.length();
        int length3 = (length2 - length) + str3.length();
        if (length3 >= 0) {
            StringBuilder sb = new StringBuilder(length3);
            do {
                sb.append(str, i, A0F);
                sb.append(str3);
                i = A0F + length;
                if (A0F >= length2 || (A0F = AnonymousClass1YF.A0F(str, str2, A0F + i2, z)) <= 0) {
                    sb.append(str, i, length2);
                    String obj = sb.toString();
                    C18070vi.A0X(obj);
                }
                sb.append(str, i, A0F);
                sb.append(str3);
                i = A0F + length;
                break;
            } while ((A0F = AnonymousClass1YF.A0F(str, str2, A0F + i2, z)) <= 0);
            sb.append(str, i, length2);
            String obj2 = sb.toString();
            C18070vi.A0X(obj2);
            return obj2;
        }
        throw new OutOfMemoryError();
    }

    public static final boolean A0A(String str, String str2, boolean z) {
        String str3 = str;
        C18070vi.A0d(str, 0);
        String str4 = str2;
        C18070vi.A0d(str2, 1);
        boolean z2 = z;
        if (!z) {
            return str3.startsWith(str2);
        }
        return str3.regionMatches(z2, 0, str4, 0, str2.length());
    }

    public static final boolean A08(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A09(String str, String str2, boolean z) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }
}
