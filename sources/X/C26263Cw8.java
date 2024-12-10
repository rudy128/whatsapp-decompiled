package X;

import java.lang.reflect.Method;

/* renamed from: X.Cw8  reason: case insensitive filesystem */
public final class C26263Cw8 {
    public static final C26263Cw8 A04 = new C26263Cw8(1, 1, "VZCBSIFJD", 2);
    public static final C26263Cw8 A05 = new C26263Cw8(3, 3, "VZCBSIFJD", 4);
    public static final C26263Cw8 A06 = new C26263Cw8(2, 2, "VZCBSIFJD", 3);
    public static final C26263Cw8 A07 = new C26263Cw8(8, 8, "VZCBSIFJD", 9);
    public static final C26263Cw8 A08 = new C26263Cw8(6, 6, "VZCBSIFJD", 7);
    public static final C26263Cw8 A09 = new C26263Cw8(5, 5, "VZCBSIFJD", 6);
    public static final C26263Cw8 A0A = new C26263Cw8(7, 7, "VZCBSIFJD", 8);
    public static final C26263Cw8 A0B = new C26263Cw8(4, 4, "VZCBSIFJD", 5);
    public static final C26263Cw8 A0C = new C26263Cw8(0, 0, "VZCBSIFJD", 1);
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;

    public static int A00(String str) {
        int i = 0;
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            while (str.charAt(i2) == '[') {
                i2++;
            }
            int i3 = i2 + 1;
            if (str.charAt(i2) == 'L') {
                i2 = Math.max(i3, str.indexOf(59, i3) + 1);
            } else {
                i2 = i3;
            }
            i++;
        }
        return i;
    }

    public static int A01(String str) {
        int i = 1;
        char charAt = str.charAt(1);
        int i2 = 1;
        int i3 = 1;
        while (charAt != ')') {
            if (charAt == 'J' || charAt == 'D') {
                i2++;
                i3 += 2;
            } else {
                while (str.charAt(i2) == '[') {
                    i2++;
                }
                int i4 = i2 + 1;
                if (str.charAt(i2) == 'L') {
                    i4 = Math.max(i4, str.indexOf(59, i4) + 1);
                }
                i3++;
                i2 = i4;
            }
            charAt = str.charAt(i2);
        }
        char charAt2 = str.charAt(i2 + 1);
        if (charAt2 == 'V') {
            return i3 << 2;
        }
        if (charAt2 == 'J' || charAt2 == 'D') {
            i = 2;
        }
        return (i3 << 2) | i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26263Cw8) {
                C26263Cw8 cw8 = (C26263Cw8) obj;
                int i = this.A00;
                int i2 = 10;
                if (i == 12) {
                    i = 10;
                }
                int i3 = cw8.A00;
                if (i3 != 12) {
                    i2 = i3;
                }
                if (i == i2) {
                    int i4 = this.A01;
                    int i5 = this.A02;
                    int i6 = cw8.A01;
                    if (i5 - i4 == cw8.A02 - i6) {
                        while (i4 < i5) {
                            if (this.A03.charAt(i4) == cw8.A03.charAt(i6)) {
                                i4++;
                                i6++;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public String A06() {
        String str;
        int i;
        int i2;
        int i3 = this.A00;
        if (i3 == 10) {
            str = this.A03;
            i = this.A01 - 1;
            i2 = this.A02 + 1;
        } else {
            str = this.A03;
            i = this.A01;
            i2 = this.A02;
            if (i3 == 12) {
                String substring = str.substring(i, i2);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("L");
                A10.append(substring);
                return AnonymousClass000.A0y(";", A10);
            }
        }
        return str.substring(i, i2);
    }

    public int hashCode() {
        int i = this.A00;
        int i2 = i;
        if (i == 12) {
            i2 = 10;
        }
        int i3 = i2 * 13;
        if (i >= 9) {
            int i4 = this.A02;
            for (int i5 = this.A01; i5 < i4; i5++) {
                i3 = (i3 + this.A03.charAt(i5)) * 17;
            }
        }
        return i3;
    }

    public C26263Cw8(int i, int i2, String str, int i3) {
        this.A00 = i;
        this.A03 = str;
        this.A01 = i2;
        this.A02 = i3;
    }

    public static String A02(Method method) {
        StringBuilder A0r = BE9.A0r();
        for (Class A052 : method.getParameterTypes()) {
            A05(A052, A0r);
        }
        A0r.append(')');
        A05(method.getReturnType(), A0r);
        return A0r.toString();
    }

    public static C26263Cw8 A03(Class cls) {
        if (!cls.isPrimitive()) {
            StringBuilder A10 = AnonymousClass000.A10();
            A05(cls, A10);
            String obj = A10.toString();
            return A04(obj, 0, obj.length());
        } else if (cls == Integer.TYPE) {
            return A09;
        } else {
            if (cls == Void.TYPE) {
                return A0C;
            }
            if (cls == Boolean.TYPE) {
                return A04;
            }
            if (cls == Byte.TYPE) {
                return A05;
            }
            if (cls == Character.TYPE) {
                return A06;
            }
            if (cls == Short.TYPE) {
                return A0B;
            }
            if (cls == Double.TYPE) {
                return A07;
            }
            if (cls == Float.TYPE) {
                return A08;
            }
            if (cls == Long.TYPE) {
                return A0A;
            }
            throw new AssertionError();
        }
    }

    public static C26263Cw8 A04(String str, int i, int i2) {
        int i3;
        char charAt = str.charAt(i);
        if (charAt == '(') {
            i3 = 11;
        } else if (charAt == 'F') {
            return A08;
        } else {
            if (charAt == 'L') {
                i++;
                i2--;
                i3 = 10;
            } else if (charAt == 'S') {
                return A0B;
            } else {
                if (charAt == 'V') {
                    return A0C;
                }
                if (charAt == 'I') {
                    return A09;
                }
                if (charAt == 'J') {
                    return A0A;
                }
                if (charAt == 'Z') {
                    return A04;
                }
                if (charAt != '[') {
                    switch (charAt) {
                        case 'B':
                            return A05;
                        case C166418cr.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                            return A06;
                        case C166388co.MESSAGE_ADD_ONS_FIELD_NUMBER:
                            return A07;
                        default:
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("Invalid descriptor: ");
                            throw AnonymousClass001.A12(str, A10);
                    }
                } else {
                    i3 = 9;
                }
            }
        }
        return new C26263Cw8(i3, i, str, i2);
    }

    public static void A05(Class<?> cls, StringBuilder sb) {
        char c;
        while (cls.isArray()) {
            sb.append('[');
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            sb.append('L');
            sb.append(cls.getName().replace('.', '/'));
            c = ';';
        } else if (cls == Integer.TYPE) {
            c = 'I';
        } else if (cls == Void.TYPE) {
            c = 'V';
        } else if (cls == Boolean.TYPE) {
            c = 'Z';
        } else if (cls == Byte.TYPE) {
            c = 'B';
        } else if (cls == Character.TYPE) {
            c = 'C';
        } else if (cls == Short.TYPE) {
            c = 'S';
        } else if (cls == Double.TYPE) {
            c = 'D';
        } else if (cls == Float.TYPE) {
            c = 'F';
        } else if (cls == Long.TYPE) {
            c = 'J';
        } else {
            throw new AssertionError();
        }
        sb.append(c);
    }

    public String toString() {
        return A06();
    }
}
