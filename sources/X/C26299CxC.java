package X;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.CxC  reason: case insensitive filesystem */
public class C26299CxC {
    public static final Object A08 = "false";
    public static final Object A09 = "length";
    public static final Object A0A = C17880vN.A0h();
    public static final Object A0B = "true";
    public static final Object A0C = AnonymousClass3MY.A0f();
    public int A00;
    public int A01;
    public int A02;
    public C24809CLc A03;
    public int[] A04 = new int[16];
    public Object[] A05 = new Object[16];
    public final Random A06 = new Random();
    public final Object A07 = C17880vN.A11();

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        if (r4 > 0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        if (r4 < 0) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r9 != 1) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        r7 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0B(int r9, java.lang.String r10) {
        /*
            r8 = this;
            r7 = 0
            int r0 = r8.A01
            int r1 = r0 + -1
            java.lang.Object[] r0 = r8.A05
            r4 = r0[r1]
            r5 = 1
            int r1 = r1 - r5
            r2 = r0[r1]
            boolean r0 = r2 instanceof java.lang.Long
            r6 = 2
            if (r0 == 0) goto L_0x0037
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L_0x0037
            long r2 = X.C17880vN.A05(r2)
            long r0 = X.C17880vN.A05(r4)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
        L_0x0020:
            if (r9 == 0) goto L_0x006a
            if (r9 == r5) goto L_0x0065
        L_0x0024:
            if (r9 == r6) goto L_0x0034
            if (r4 > 0) goto L_0x0029
        L_0x0028:
            r7 = 1
        L_0x0029:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r8.A08(r5, r0)
            A0F(r8)
            return
        L_0x0034:
            if (r4 >= 0) goto L_0x0029
            goto L_0x0028
        L_0x0037:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x0048
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L_0x0048
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r2.compareTo(r4)
            goto L_0x0020
        L_0x0048:
            java.lang.Number r1 = A04(r2)
            java.lang.Number r0 = A04(r4)
            if (r1 == 0) goto L_0x006d
            if (r0 == 0) goto L_0x006d
            double r2 = r1.doubleValue()
            double r0 = r0.doubleValue()
            if (r9 == 0) goto L_0x0068
            if (r9 == r5) goto L_0x0063
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            goto L_0x0024
        L_0x0063:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
        L_0x0065:
            if (r4 <= 0) goto L_0x0029
            goto L_0x0028
        L_0x0068:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
        L_0x006a:
            if (r4 < 0) goto L_0x0029
            goto L_0x0028
        L_0x006d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Incompatible operand types of "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r10, r1)
            A0J(r2, r4, r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26299CxC.A0B(int, java.lang.String):void");
    }

    public static boolean A0P(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == 'x' || charAt < 9) {
                return true;
            }
            if (charAt > 13 && (charAt < ' ' || charAt > '~')) {
                return true;
            }
        }
        return false;
    }

    public static Object[] A0Q(C26299CxC cxC) {
        return ((C28669EDl) ((C25488Cgj) cxC.A05[cxC.A00 - 4]).A00).CQH().A02;
    }

    public static int A02(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (A0N(obj)) {
            return 4;
        }
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof List) {
            return 6;
        }
        if (obj instanceof Map) {
            return 7;
        }
        if (obj instanceof C25488Cgj) {
            return 8;
        }
        return 5;
    }

    public static Long A03(Object obj) {
        long A002;
        Long l;
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            return l;
        }
        if (obj instanceof Boolean) {
            A002 = AnonymousClass8BX.A06(AnonymousClass000.A1Y(obj) ? 1 : 0);
        } else if (!A0N(obj)) {
            return null;
        } else {
            A002 = (long) AnonymousClass8BR.A00(obj);
        }
        return Long.valueOf(A002);
    }

    public static Number A05(Object obj) {
        int A002;
        double d;
        Number number;
        if ((obj instanceof Long) && (number = (Number) obj) != null) {
            A002 = number.intValue();
        } else if (obj instanceof Boolean) {
            if (AnonymousClass000.A1Y(obj)) {
                d = 1.0d;
            } else {
                d = 0.0d;
            }
            return C25343Ce2.A00(d);
        } else if (!A0N(obj)) {
            return null;
        } else {
            A002 = (int) ((long) AnonymousClass8BR.A00(obj));
        }
        d = (double) A002;
        return C25343Ce2.A00(d);
    }

    public static Map A07(Object obj, int i) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Expected stack value of map type for opcode ");
        A0M(AnonymousClass000.A0y(CFx.A00[i], A10), obj);
        throw null;
    }

    private void A08(int i, Object obj) {
        this.A05[(this.A01 - i) - 1] = obj;
    }

    private void A09(int i, String str) {
        int i2;
        double d;
        int i3 = this.A01 - 1;
        Object[] objArr = this.A05;
        Object obj = objArr[i3];
        Object obj2 = objArr[i3 - 1];
        Number A042 = A04(obj2);
        Number A043 = A04(obj);
        if (A042 == null || A043 == null) {
            A0J(obj2, obj, AnonymousClass001.A1H("Incompatible operand types of ", str, AnonymousClass000.A10()));
            throw null;
        }
        switch (i) {
            case 0:
                d = A042.doubleValue() * A043.doubleValue();
                break;
            case 1:
                d = (double) ((int) ((A042.longValue() & 4294967295L) * (A043.longValue() & 4294967295L)));
                break;
            case 2:
                d = A042.doubleValue() / A043.doubleValue();
                break;
            case 3:
                d = A042.doubleValue() % A043.doubleValue();
                break;
            case 4:
                d = A042.doubleValue() - A043.doubleValue();
                break;
            case 5:
                d = A042.doubleValue() + A043.doubleValue();
                break;
            case 6:
                i2 = ((int) ((long) A042.doubleValue())) & ((int) ((long) A043.doubleValue()));
                break;
            case 7:
                i2 = ((int) ((long) A042.doubleValue())) | ((int) ((long) A043.doubleValue()));
                break;
            case 8:
                i2 = ((int) ((long) A042.doubleValue())) ^ ((int) ((long) A043.doubleValue()));
                break;
            case 9:
                i2 = ((int) ((long) A042.doubleValue())) << (((int) ((long) A043.doubleValue())) & 31);
                break;
            case 10:
                i2 = ((int) ((long) A042.doubleValue())) >> (((int) ((long) A043.doubleValue())) & 31);
                break;
            default:
                d = (double) (((long) (((int) ((long) A042.doubleValue())) >>> (((int) ((long) A043.doubleValue())) & 31))) & 4294967295L);
                break;
        }
        d = (double) i2;
        A08(1, C25343Ce2.A00(d));
        A0F(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b2, code lost:
        A0L(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        A08(1, java.lang.Long.valueOf(r4));
        A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0A(int r10, java.lang.String r11) {
        /*
            r9 = this;
            int r0 = r9.A01
            int r1 = r0 + -1
            java.lang.Object[] r0 = r9.A05
            r4 = r0[r1]
            r3 = 1
            int r1 = r1 - r3
            r2 = r0[r1]
            java.lang.Long r8 = A03(r2)
            java.lang.Long r0 = A03(r4)
            if (r8 == 0) goto L_0x009a
            if (r0 == 0) goto L_0x009a
            r4 = 0
            r6 = 63
            switch(r10) {
                case 12: goto L_0x0046;
                case 13: goto L_0x0035;
                case 14: goto L_0x00a8;
                case 15: goto L_0x0050;
                case 16: goto L_0x005a;
                case 17: goto L_0x0064;
                case 18: goto L_0x006e;
                case 19: goto L_0x0078;
                case 20: goto L_0x0082;
                case 21: goto L_0x008e;
                default: goto L_0x001f;
            }
        L_0x001f:
            long r4 = r8.longValue()
            long r1 = r0.longValue()
            long r1 = r1 & r6
            int r0 = (int) r1
            long r4 = r4 >>> r0
        L_0x002a:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r9.A08(r3, r0)
            A0F(r9)
            return
        L_0x0035:
            long r1 = r0.longValue()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            java.lang.String r0 = "INT64_DIV division by zero"
            goto L_0x00b2
        L_0x0040:
            long r4 = r8.longValue()
            long r4 = r4 / r1
            goto L_0x002a
        L_0x0046:
            long r4 = r8.longValue()
            long r0 = r0.longValue()
            long r4 = r4 * r0
            goto L_0x002a
        L_0x0050:
            long r4 = r8.longValue()
            long r0 = r0.longValue()
            long r4 = r4 - r0
            goto L_0x002a
        L_0x005a:
            long r4 = r8.longValue()
            long r0 = r0.longValue()
            long r4 = r4 + r0
            goto L_0x002a
        L_0x0064:
            long r4 = r8.longValue()
            long r0 = r0.longValue()
            long r4 = r4 & r0
            goto L_0x002a
        L_0x006e:
            long r4 = r8.longValue()
            long r0 = r0.longValue()
            long r4 = r4 | r0
            goto L_0x002a
        L_0x0078:
            long r4 = r8.longValue()
            long r0 = r0.longValue()
            long r4 = r4 ^ r0
            goto L_0x002a
        L_0x0082:
            long r4 = r8.longValue()
            long r1 = r0.longValue()
            long r1 = r1 & r6
            int r0 = (int) r1
            long r4 = r4 << r0
            goto L_0x002a
        L_0x008e:
            long r4 = r8.longValue()
            long r1 = r0.longValue()
            long r1 = r1 & r6
            int r0 = (int) r1
            long r4 = r4 >> r0
            goto L_0x002a
        L_0x009a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Incompatible operand types of "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r11, r1)
            A0J(r2, r4, r0)
            goto L_0x00b5
        L_0x00a8:
            long r1 = r0.longValue()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00b7
            java.lang.String r0 = "INT64_MOD division by zero"
        L_0x00b2:
            A0L(r0)
        L_0x00b5:
            r0 = 0
            throw r0
        L_0x00b7:
            long r4 = r8.longValue()
            long r4 = r4 % r1
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26299CxC.A0A(int, java.lang.String):void");
    }

    public static void A0C(C26971DNt dNt, StringBuilder sb, int i) {
        C24956CRg cRg = dNt.A00;
        C25736Cl6 cl6 = cRg.A03;
        ByteBuffer byteBuffer = cl6.A01;
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(byteBuffer.order());
        int i2 = cRg.A02;
        duplicate.position(i2);
        duplicate.limit(cRg.A00 + i2);
        if ((duplicate.get(i) & 255) == 4) {
            sb.append("  at extension function ");
            sb.append((String) cl6.A01(duplicate.getShort(i + 1) & 65535));
            sb.append(10);
        }
        sb.append("  at offset ");
        sb.append(i - cl6.A03[2].A02);
        sb.append("  (offset ");
        sb.append(i - i2);
        sb.append(" in function ");
        sb.append((String) cl6.A01(cRg.A01));
        sb.append(')');
        sb.append(" in script \"");
        sb.append(cl6.A00);
        sb.append('\"');
        sb.append("\n");
    }

    public static void A0D(C26971DNt dNt, StringBuilder sb, int i, boolean z) {
        Object A0w;
        C25152Ca3 BNX;
        if (z) {
            sb.append("\n");
        }
        C25736Cl6 cl6 = dNt.A00.A03;
        int i2 = i - cl6.A03[2].A02;
        Map map = cl6.A02;
        if (map == null) {
            A0w = null;
        } else {
            A0w = AnonymousClass000.A0w(map, i2);
        }
        E9O BZU = dNt.BZU();
        if (BZU == null) {
            BNX = null;
        } else {
            BNX = BZU.BNX();
        }
        if (BNX != null) {
            sb.append(BNX.A01);
            sb.append(":");
            if (A0w == null) {
                A0w = "(unsymbolicated)";
            }
            sb.append(A0w);
            return;
        }
        sb.append("(unsymbolicated)");
    }

    public static void A0F(C26299CxC cxC) {
        int i = cxC.A01 - 1;
        cxC.A01 = i;
        cxC.A05[i] = null;
    }

    public static void A0G(C26299CxC cxC, int i) {
        Object[] objArr = cxC.A05;
        int length = objArr.length;
        int i2 = cxC.A01;
        if (length - i2 < i) {
            int i3 = i2 + i;
            int i4 = 536870912;
            if (i3 > 536870912) {
                throw AnonymousClass000.A0n("MinScript stack overflow");
            }
            do {
                length <<= 1;
            } while (length < i3);
            if (length <= 536870912) {
                i4 = length;
            }
            Object[] objArr2 = new Object[i4];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            cxC.A05 = objArr2;
            int[] iArr = new int[i4];
            System.arraycopy(cxC.A04, 0, iArr, 0, cxC.A01);
            cxC.A04 = iArr;
        }
    }

    public static void A0H(C26299CxC cxC, Object obj) {
        Object[] objArr = cxC.A05;
        int i = cxC.A01;
        objArr[i] = obj;
        cxC.A01 = i + 1;
    }

    public static boolean A0N(Object obj) {
        if (!(obj instanceof Number) || (obj instanceof Long)) {
            return false;
        }
        return true;
    }

    public static boolean A0O(Object obj) {
        if (obj instanceof Boolean) {
            return AnonymousClass000.A1Y(obj);
        }
        if (!AnonymousClass000.A1X(obj)) {
            if (obj instanceof String) {
                return !((String) obj).isEmpty();
            }
            if (A0N(obj)) {
                double A002 = AnonymousClass8BR.A00(obj);
                if (A002 == 0.0d || Double.isNaN(A002)) {
                    return false;
                }
                return true;
            } else if (!(obj instanceof Long) || C17880vN.A05(obj) != 0) {
                return true;
            }
        }
        return false;
    }

    public int A0R(Object obj, String str, int i) {
        int i2;
        int i3;
        if (obj instanceof Long) {
            long A052 = C17880vN.A05(obj);
            i2 = (int) A052;
            i3 = (((long) i2) > A052 ? 1 : (((long) i2) == A052 ? 0 : -1));
        } else {
            if (A0N(obj)) {
                double A002 = AnonymousClass8BR.A00(obj);
                i2 = (int) A002;
                i3 = (((double) i2) > A002 ? 1 : (((double) i2) == A002 ? 0 : -1));
            }
            A0L(str);
            throw null;
        }
        if (i3 == 0 && i2 >= 0 && i2 <= i) {
            return i2;
        }
        A0L(str);
        throw null;
    }

    public Object A0S(Object obj) {
        if (obj instanceof Boolean) {
            if (AnonymousClass000.A1Y(obj)) {
                return "true";
            }
            return "false";
        } else if (obj instanceof Long) {
            return Long.toString(C17880vN.A05(obj));
        } else {
            if (A0N(obj)) {
                double A002 = AnonymousClass8BR.A00(obj);
                int i = (int) A002;
                if (((double) i) == A002) {
                    return Integer.toString(i);
                }
                String d = Double.toString(A002);
                int indexOf = d.indexOf(69);
                if (indexOf < 0) {
                    return d;
                }
                int length = d.length();
                int i2 = length + 1;
                char[] cArr = new char[i2];
                d.getChars(0, indexOf, cArr, 0);
                cArr[indexOf] = 'e';
                int i3 = indexOf + 1;
                if (d.charAt(i3) == '-') {
                    d.getChars(i3, length, cArr, i3);
                } else {
                    cArr[i3] = '+';
                    d.getChars(i3, length, cArr, indexOf + 2);
                    length = i2;
                }
                return new String(cArr, 0, length);
            } else if (obj instanceof String) {
                return obj;
            } else {
                A0M("Value cannot be converted to string", obj);
                throw null;
            }
        }
    }

    public void A0T(int i) {
        int i2 = this.A01 - i;
        this.A01 = i2;
        Arrays.fill(this.A05, i2, i + i2, (Object) null);
    }

    public static double A00(C26108CsS csS, int i) {
        return A01(C26108CsS.A00(csS, i));
    }

    public static double A01(Object obj) {
        Number number;
        if (A0N(obj) && (number = (Number) obj) != null) {
            return number.doubleValue();
        }
        if (obj instanceof Boolean) {
            if (AnonymousClass000.A1Y(obj)) {
                return 1.0d;
            }
            return 0.0d;
        } else if (obj instanceof Long) {
            return (double) C17880vN.A05(obj);
        } else {
            return Double.NaN;
        }
    }

    public static Number A04(Object obj) {
        Object obj2;
        Number number;
        if (A0N(obj) && (number = (Number) obj) != null) {
            return number;
        }
        if (obj instanceof Boolean) {
            if (AnonymousClass000.A1Y(obj)) {
                obj2 = A0A;
            } else {
                obj2 = A0C;
            }
            if (A0N(obj2)) {
                return (Number) obj2;
            }
            return null;
        } else if (obj instanceof Long) {
            return C25343Ce2.A00((double) C17880vN.A05(obj));
        } else {
            return null;
        }
    }

    public static Object A06(C26108CsS csS, Object obj, int i, boolean z) {
        C25344Ce3.A01(z, obj);
        return C26108CsS.A00(csS, i);
    }

    public static void A0I(C26299CxC cxC, Object obj, Object obj2, int i, int i2) {
        A0H(cxC, obj);
        int[] iArr = cxC.A04;
        int i3 = cxC.A01;
        iArr[i3] = i;
        cxC.A01 = i3 + 1;
        A0H(cxC, obj2);
        int i4 = cxC.A01;
        iArr[i4] = i2;
        int i5 = i4 + 1;
        cxC.A01 = i5;
        iArr[i5] = cxC.A00;
        int i6 = i5 + 1;
        cxC.A01 = i6;
        cxC.A00 = i6 - 1;
    }

    public static void A0J(Object obj, Object obj2, String str) {
        String A0U;
        String A0U2;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TypeError: ");
        A10.append(str);
        A10.append(". Got ");
        if (obj == null) {
            A0U = "null";
        } else {
            A0U = C17890vO.A0U(obj);
        }
        A10.append(A0U);
        A10.append(" and ");
        if (obj2 == null) {
            A0U2 = "null";
        } else {
            A0U2 = C17890vO.A0U(obj2);
        }
        throw new C27228Da7(AnonymousClass000.A0y(A0U2, A10));
    }

    public static void A0K(String str) {
        throw new C27228Da7(AnonymousClass001.A1H("RangeError: ", str, AnonymousClass000.A10()));
    }

    public static void A0L(String str) {
        throw new C27228Da7(AnonymousClass001.A1H("TypeError: ", str, AnonymousClass000.A10()));
    }

    public static void A0M(String str, Object obj) {
        String A0U;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TypeError: ");
        A10.append(str);
        A10.append(". Got ");
        if (obj == null) {
            A0U = "null";
        } else {
            A0U = C17890vO.A0U(obj);
        }
        throw new C27228Da7(AnonymousClass000.A0y(A0U, A10));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: X.CkC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: X.Boh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: X.Boh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v53, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v63, resolved type: X.Boh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v64, resolved type: X.Boh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v90, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v91, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v92, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v93, resolved type: java.util.HashMap} */
    /* JADX WARNING: type inference failed for: r6v20, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02b8, code lost:
        r11.A08(0, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02d7, code lost:
        r11.A08(0, r11.A0S(X.BE8.A0c(r11)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00d6, code lost:
        if (r0 != false) goto L_0x1111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00fe, code lost:
        if (r0 == false) goto L_0x1111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0108, code lost:
        r18.position(r1 + r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0118, code lost:
        r18.getShort();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x08ef, code lost:
        if (r1 == null) goto L_0x08f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0945, code lost:
        A0L(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x099a, code lost:
        X.C26108CsS.A01(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x09b4, code lost:
        X.C26108CsS.A01(r9, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0a79, code lost:
        if (r1 == null) goto L_0x0a7b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:0x0bd4, code lost:
        A0H(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a3, code lost:
        if (r1 == r2) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ad, code lost:
        if (r2 != null) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:742:0x0f1d, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:857:0x11a1, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("Type assertion failed. Expected ");
        r1.append(r4);
        r1.append(", got ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:858:0x11b2, code lost:
        if (r3 != null) goto L_0x11b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:860:0x11b5, code lost:
        r0 = X.C17890vO.A0U(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:861:0x11ba, code lost:
        r0 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:862:0x11bc, code lost:
        A0L(X.AnonymousClass000.A0y(r0, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:863:0x11c5, code lost:
        r1 = new X.C27231DaA(X.AnonymousClass001.A1H("InvalidBytecode: ", r2, X.AnonymousClass000.A10()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:872:0x1223, code lost:
        r0 = "ArrayCopy dst index out of range";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:873:0x1226, code lost:
        r0 = "ArrayCopy src index out of range";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:875:0x122c, code lost:
        r0 = "StringSearch offset out of range";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:877:0x1232, code lost:
        r0 = "SubstringCompare offset out of range";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:882:0x1250, code lost:
        r1 = new X.C27231DaA(X.AnonymousClass001.A1H("InvalidBytecode: ", r4, X.AnonymousClass000.A10()));
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0180 A[Catch:{ Da7 -> 0x1304 }] */
    /* JADX WARNING: Removed duplicated region for block: B:997:0x12f4 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0E(X.C26299CxC r24) {
        /*
            r0 = 4
            r11 = r24
            int r1 = r11.A00
            int r1 = r1 - r0
            java.lang.Object[] r0 = r11.A05
            r0 = r0[r1]
            X.Cgj r0 = (X.C25488Cgj) r0
            X.E8A r0 = r0.A00
            X.EDl r0 = (X.C28669EDl) r0
            X.DNt r17 = r0.CQH()
            r0 = r17
            X.CRg r2 = r0.A00
            X.Cl6 r0 = r2.A03
            r24 = r0
            java.nio.ByteBuffer r0 = r0.A01
            java.nio.ByteBuffer r18 = r0.duplicate()
            java.nio.ByteOrder r1 = r0.order()
            r0 = r18
            r0.order(r1)
            int r1 = r2.A02
            r0.position(r1)
            int r0 = r2.A00
            int r1 = r1 + r0
            r0 = r18
            r0.limit(r1)
            int r1 = r18.position()
            byte r0 = r0.get(r1)
            r1 = r0 & 255(0xff, float:3.57E-43)
            r3 = 1
            r10 = 0
            r0 = 2
            if (r1 != r0) goto L_0x138d
            r16 = 0
            r19 = 0
        L_0x004b:
            int r16 = r18.position()     // Catch:{ Da7 -> 0x1304 }
            int r4 = X.BE6.A0G(r18)     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r9 = "vector index out of range"
            java.lang.String r1 = "key %s not in map"
            r21 = 0
            java.lang.String r6 = "invalid get_by_val vector index"
            java.lang.String r5 = "modifying immutable container"
            r2 = 3
            switch(r4) {
                case 0: goto L_0x10d7;
                case 1: goto L_0x0c4e;
                case 2: goto L_0x0bd9;
                case 3: goto L_0x0cdb;
                case 4: goto L_0x0d03;
                case 5: goto L_0x0498;
                case 6: goto L_0x0460;
                case 7: goto L_0x10bd;
                case 8: goto L_0x043d;
                case 9: goto L_0x1083;
                case 10: goto L_0x03d1;
                case 11: goto L_0x1148;
                case 12: goto L_0x1115;
                case 13: goto L_0x0bd2;
                case 14: goto L_0x0063;
                case 15: goto L_0x03b9;
                case 16: goto L_0x1065;
                case 17: goto L_0x102a;
                case 18: goto L_0x0ff2;
                case 19: goto L_0x0f98;
                case 20: goto L_0x0f53;
                case 21: goto L_0x0eea;
                case 22: goto L_0x0eea;
                case 23: goto L_0x0ed3;
                case 24: goto L_0x0eae;
                case 25: goto L_0x0eae;
                case 26: goto L_0x0e86;
                case 27: goto L_0x0e48;
                case 28: goto L_0x0e1f;
                case 29: goto L_0x0e1f;
                case 30: goto L_0x038b;
                case 31: goto L_0x0dc9;
                case 32: goto L_0x0dc9;
                case 33: goto L_0x0382;
                case 34: goto L_0x100f;
                case 35: goto L_0x0366;
                case 36: goto L_0x0347;
                case 37: goto L_0x0335;
                case 38: goto L_0x031a;
                case 39: goto L_0x0492;
                case 40: goto L_0x0bcb;
                case 41: goto L_0x0bc4;
                case 42: goto L_0x030d;
                case 43: goto L_0x0300;
                case 44: goto L_0x02f2;
                case 45: goto L_0x02e4;
                case 46: goto L_0x0ae4;
                case 47: goto L_0x0db6;
                case 48: goto L_0x02bd;
                case 49: goto L_0x02d7;
                case 50: goto L_0x02a7;
                case 51: goto L_0x0296;
                case 52: goto L_0x0285;
                case 53: goto L_0x0267;
                case 54: goto L_0x0256;
                case 55: goto L_0x0e6e;
                case 56: goto L_0x0245;
                case 57: goto L_0x0221;
                case 58: goto L_0x0209;
                case 59: goto L_0x0bbd;
                case 60: goto L_0x0bb6;
                case 61: goto L_0x0baf;
                case 62: goto L_0x0ba8;
                case 63: goto L_0x0ba0;
                case 64: goto L_0x0d86;
                case 65: goto L_0x01ed;
                case 66: goto L_0x0b98;
                case 67: goto L_0x0b90;
                case 68: goto L_0x0b87;
                case 69: goto L_0x0b7e;
                case 70: goto L_0x0b75;
                case 71: goto L_0x0b6c;
                case 72: goto L_0x01d5;
                case 73: goto L_0x0b63;
                case 74: goto L_0x0b5a;
                case 75: goto L_0x0b51;
                case 76: goto L_0x0b48;
                case 77: goto L_0x0b3f;
                case 78: goto L_0x01bb;
                case 79: goto L_0x0b36;
                case 80: goto L_0x0b2d;
                case 81: goto L_0x0b24;
                case 82: goto L_0x0b1b;
                case 83: goto L_0x0b12;
                case 84: goto L_0x0b09;
                case 85: goto L_0x011d;
                case 86: goto L_0x011d;
                case 87: goto L_0x0b02;
                case 88: goto L_0x0afb;
                case 89: goto L_0x0af4;
                case 90: goto L_0x0aed;
                case 91: goto L_0x0115;
                case 92: goto L_0x0111;
                case 93: goto L_0x00ec;
                case 94: goto L_0x00d9;
                case 95: goto L_0x00c4;
                case 96: goto L_0x00b1;
                case 97: goto L_0x0101;
                case 98: goto L_0x00a9;
                case 99: goto L_0x0069;
                case 100: goto L_0x0ad5;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x123f
        L_0x0063:
            java.util.HashMap r0 = X.C17880vN.A11()     // Catch:{ Da7 -> 0x1304 }
            goto L_0x0bd4
        L_0x0069:
            int r3 = X.BE6.A0G(r18)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Da7 -> 0x1304 }
            int r2 = r3 + -1
            int r0 = r11.A01     // Catch:{ Da7 -> 0x1304 }
            int r1 = r0 + -1
            int r1 = r1 - r2
            java.lang.Object[] r0 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            java.lang.System.arraycopy(r0, r1, r4, r10, r3)     // Catch:{ Da7 -> 0x1304 }
            r11.A0T(r3)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r1 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r1 instanceof X.C25488Cgj     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x008d
            java.lang.String r0 = "target is not a closure"
            A0M(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x008d:
            X.Cgj r1 = (X.C25488Cgj) r1     // Catch:{ Da7 -> 0x1304 }
            X.E8A r0 = r1.A00     // Catch:{ Da7 -> 0x1304 }
            X.EDl r0 = (X.C28669EDl) r0     // Catch:{ Da7 -> 0x1304 }
            X.DNt r0 = r0.CQH()     // Catch:{ Da7 -> 0x1304 }
            X.CRg r3 = r0.A00     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object[] r2 = r0.A02     // Catch:{ Da7 -> 0x1304 }
            X.COJ r1 = r0.A01     // Catch:{ Da7 -> 0x1304 }
            X.DNt r0 = new X.DNt     // Catch:{ Da7 -> 0x1304 }
            r0.<init>(r3, r1, r2, r4)     // Catch:{ Da7 -> 0x1304 }
            X.Cgj r5 = new X.Cgj     // Catch:{ Da7 -> 0x1304 }
            r5.<init>(r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x0e7e
        L_0x00a9:
            int r1 = r18.getInt()     // Catch:{ Da7 -> 0x1304 }
            r18.getShort()     // Catch:{ Da7 -> 0x1304 }
            goto L_0x0108
        L_0x00b1:
            int r1 = r18.getInt()     // Catch:{ Da7 -> 0x1304 }
            r18.getShort()     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r0 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = A0O(r0)     // Catch:{ Da7 -> 0x1304 }
            A0F(r11)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x00d6
        L_0x00c4:
            short r1 = r18.getShort()     // Catch:{ Da7 -> 0x1304 }
            r18.getShort()     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r0 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = A0O(r0)     // Catch:{ Da7 -> 0x1304 }
            A0F(r11)     // Catch:{ Da7 -> 0x1304 }
        L_0x00d6:
            if (r0 != 0) goto L_0x1111
            goto L_0x0108
        L_0x00d9:
            int r1 = r18.getInt()     // Catch:{ Da7 -> 0x1304 }
            r18.getShort()     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r0 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = A0O(r0)     // Catch:{ Da7 -> 0x1304 }
            A0F(r11)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x00fe
        L_0x00ec:
            short r1 = r18.getShort()     // Catch:{ Da7 -> 0x1304 }
            r18.getShort()     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r0 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = A0O(r0)     // Catch:{ Da7 -> 0x1304 }
            A0F(r11)     // Catch:{ Da7 -> 0x1304 }
        L_0x00fe:
            if (r0 == 0) goto L_0x1111
            goto L_0x0108
        L_0x0101:
            short r1 = r18.getShort()     // Catch:{ Da7 -> 0x1304 }
            r18.getShort()     // Catch:{ Da7 -> 0x1304 }
        L_0x0108:
            int r1 = r1 + r16
            r0 = r18
            r0.position(r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0111:
            r18.getInt()     // Catch:{ Da7 -> 0x1304 }
            goto L_0x0118
        L_0x0115:
            r18.getShort()     // Catch:{ Da7 -> 0x1304 }
        L_0x0118:
            r18.getShort()     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x011d:
            int r0 = r11.A01     // Catch:{ Da7 -> 0x1304 }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r2 = r0[r1]     // Catch:{ Da7 -> 0x1304 }
            int r1 = r1 - r3
            r1 = r0[r1]     // Catch:{ Da7 -> 0x1304 }
            if (r1 != 0) goto L_0x012c
            goto L_0x01ac
        L_0x012c:
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch:{ Da7 -> 0x1304 }
            r7 = 1
            if (r0 == 0) goto L_0x0140
            boolean r5 = X.AnonymousClass000.A1Y(r1)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r2 instanceof java.lang.Boolean     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x0168
            boolean r0 = X.AnonymousClass000.A1Y(r2)     // Catch:{ Da7 -> 0x1304 }
            if (r5 != r0) goto L_0x01af
            goto L_0x01a5
        L_0x0140:
            boolean r0 = A0N(r1)     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x0155
            double r5 = X.AnonymousClass8BR.A00(r1)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = A0N(r2)     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x0168
            double r1 = X.AnonymousClass8BR.A00(r2)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x017c
        L_0x0155:
            boolean r0 = r1 instanceof java.lang.Long     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x0181
            long r5 = X.C17880vN.A05(r1)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r2 instanceof java.lang.Long     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x0168
            long r1 = X.C17880vN.A05(r2)     // Catch:{ Da7 -> 0x1304 }
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            goto L_0x017e
        L_0x0168:
            java.lang.Number r1 = A04(r1)     // Catch:{ Da7 -> 0x1304 }
            if (r1 == 0) goto L_0x01af
            java.lang.Number r0 = A04(r2)     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x01af
            double r5 = r1.doubleValue()     // Catch:{ Da7 -> 0x1304 }
            double r1 = r0.doubleValue()     // Catch:{ Da7 -> 0x1304 }
        L_0x017c:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
        L_0x017e:
            if (r0 != 0) goto L_0x01af
            goto L_0x01a5
        L_0x0181:
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x0192
            boolean r0 = r2 instanceof java.lang.String     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x01af
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r1.equals(r2)     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x01af
            goto L_0x01a5
        L_0x0192:
            boolean r0 = r1 instanceof java.util.List     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r1 instanceof X.C25488Cgj     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x01a3
            boolean r7 = r1.equals(r2)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x01a5
        L_0x01a3:
            if (r1 != r2) goto L_0x01af
        L_0x01a5:
            r0 = 86
            boolean r0 = X.AnonymousClass000.A1T(r4, r0)
            goto L_0x01b1
        L_0x01ac:
            r7 = 1
            if (r2 == 0) goto L_0x01a5
        L_0x01af:
            r7 = 0
            goto L_0x01a5
        L_0x01b1:
            r0 = r0 ^ r7
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Da7 -> 0x1304 }
            r11.A08(r3, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x100f
        L_0x01bb:
            java.lang.Object r1 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Long r0 = A03(r1)     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x1170
            long r2 = r0.longValue()     // Catch:{ Da7 -> 0x1304 }
            r0 = -1
            long r2 = r2 ^ r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ Da7 -> 0x1304 }
            r11.A08(r10, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x01d5:
            java.lang.Object r1 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Long r0 = A03(r1)     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x1177
            long r2 = r0.longValue()     // Catch:{ Da7 -> 0x1304 }
            long r0 = -r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Da7 -> 0x1304 }
            r11.A08(r10, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x01ed:
            java.lang.Object r1 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Number r0 = A04(r1)     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x117e
            double r3 = r0.doubleValue()     // Catch:{ Da7 -> 0x1304 }
            long r1 = (long) r3     // Catch:{ Da7 -> 0x1304 }
            int r0 = (int) r1     // Catch:{ Da7 -> 0x1304 }
            r0 = r0 ^ -1
            double r0 = (double) r0     // Catch:{ Da7 -> 0x1304 }
            java.lang.Number r0 = X.C25343Ce2.A00(r0)     // Catch:{ Da7 -> 0x1304 }
            r11.A08(r10, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0209:
            java.lang.Object r1 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Number r0 = A04(r1)     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x1185
            double r2 = r0.doubleValue()     // Catch:{ Da7 -> 0x1304 }
            double r0 = -r2
            java.lang.Number r0 = X.C25343Ce2.A00(r0)     // Catch:{ Da7 -> 0x1304 }
            r11.A08(r10, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0221:
            java.lang.Object r1 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Number r0 = A04(r1)     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x118c
            double r1 = r0.doubleValue()     // Catch:{ Da7 -> 0x1304 }
            int r0 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x0240
            double r0 = java.lang.Math.floor(r1)     // Catch:{ Da7 -> 0x1304 }
        L_0x0237:
            java.lang.Number r0 = X.C25343Ce2.A00(r0)     // Catch:{ Da7 -> 0x1304 }
            r11.A08(r10, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0240:
            double r0 = java.lang.Math.ceil(r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x0237
        L_0x0245:
            java.lang.Object r0 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = A0O(r0)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Boolean r0 = X.C108945cZ.A1A(r0)     // Catch:{ Da7 -> 0x1304 }
            r11.A08(r10, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0256:
            java.lang.Object r0 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = A0O(r0)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Da7 -> 0x1304 }
            r11.A08(r10, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0267:
            java.lang.Object r1 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Number r0 = A05(r1)     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x1193
            long r2 = r0.longValue()     // Catch:{ Da7 -> 0x1304 }
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            double r0 = (double) r2     // Catch:{ Da7 -> 0x1304 }
            java.lang.Number r0 = X.C25343Ce2.A00(r0)     // Catch:{ Da7 -> 0x1304 }
            r11.A08(r10, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0285:
            java.lang.Object r1 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Number r0 = A05(r1)     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x02b8
            java.lang.String r0 = "TO_INT32 operand must be numeric"
            A0M(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x0296:
            java.lang.Object r1 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Long r0 = A03(r1)     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x02b8
            java.lang.String r0 = "TO_BIGINT operand must be numeric"
            A0M(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x02a7:
            java.lang.Object r1 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Number r0 = A04(r1)     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x02b8
            java.lang.String r0 = "TO_NUMBER operand must be numeric"
            A0M(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x02b8:
            r11.A08(r10, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x02bd:
            java.lang.Object r1 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Number r0 = A05(r1)     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x119a
            int r1 = r0.intValue()     // Catch:{ Da7 -> 0x1304 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            char r0 = (char) r1     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Da7 -> 0x1304 }
            r11.A08(r10, r0)     // Catch:{ Da7 -> 0x1304 }
        L_0x02d7:
            java.lang.Object r0 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r0 = r11.A0S(r0)     // Catch:{ Da7 -> 0x1304 }
            r11.A08(r10, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x02e4:
            int r0 = r18.getInt()     // Catch:{ Da7 -> 0x1304 }
            double r0 = (double) r0     // Catch:{ Da7 -> 0x1304 }
            java.lang.Number r0 = X.C25343Ce2.A00(r0)     // Catch:{ Da7 -> 0x1304 }
            A0H(r11, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x02f2:
            short r0 = r18.getShort()     // Catch:{ Da7 -> 0x1304 }
            double r0 = (double) r0     // Catch:{ Da7 -> 0x1304 }
            java.lang.Number r0 = X.C25343Ce2.A00(r0)     // Catch:{ Da7 -> 0x1304 }
            A0H(r11, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0300:
            double r0 = r18.getDouble()     // Catch:{ Da7 -> 0x1304 }
            java.lang.Number r0 = X.C25343Ce2.A00(r0)     // Catch:{ Da7 -> 0x1304 }
            A0H(r11, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x030d:
            long r0 = r18.getLong()     // Catch:{ Da7 -> 0x1304 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Da7 -> 0x1304 }
            A0H(r11, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x031a:
            int r4 = X.BE6.A0G(r18)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r3 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            int r1 = A02(r3)     // Catch:{ Da7 -> 0x1304 }
            r0 = 100
            if (r4 != r0) goto L_0x0331
            r0 = 4
            if (r1 == r0) goto L_0x1111
            if (r1 == r2) goto L_0x1111
            goto L_0x11a1
        L_0x0331:
            if (r1 == r4) goto L_0x1111
            goto L_0x11a1
        L_0x0335:
            java.lang.Object r0 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            int r0 = A02(r0)     // Catch:{ Da7 -> 0x1304 }
            double r0 = (double) r0     // Catch:{ Da7 -> 0x1304 }
            java.lang.Number r0 = X.C25343Ce2.A00(r0)     // Catch:{ Da7 -> 0x1304 }
            r11.A08(r10, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0347:
            int r3 = X.BE6.A0G(r18)     // Catch:{ Da7 -> 0x1304 }
            r0 = r19
            boolean r0 = X.AnonymousClass000.A1U(r3, r0)
            java.lang.String r2 = "invalid local store index"
            if (r0 == 0) goto L_0x11c5
            int r0 = r11.A01     // Catch:{ Da7 -> 0x1304 }
            int r0 = r0 + -1
            java.lang.Object[] r2 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r1 = r2[r0]     // Catch:{ Da7 -> 0x1304 }
            int r0 = r11.A00     // Catch:{ Da7 -> 0x1304 }
            int r0 = r0 + r3
            int r0 = r0 + 1
            r2[r0] = r1     // Catch:{ Da7 -> 0x1304 }
            goto L_0x100f
        L_0x0366:
            int r1 = X.BE6.A0G(r18)     // Catch:{ Da7 -> 0x1304 }
            r0 = r19
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            java.lang.String r2 = "invalid local load index"
            if (r0 == 0) goto L_0x11c5
            int r0 = r11.A00     // Catch:{ Da7 -> 0x1304 }
            int r0 = r0 + r1
            int r1 = r0 + 1
            java.lang.Object[] r0 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r0 = r0[r1]     // Catch:{ Da7 -> 0x1304 }
            A0H(r11, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0382:
            java.lang.Object r0 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            A0H(r11, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x038b:
            java.lang.Object r1 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x03a3
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ Da7 -> 0x1304 }
            int r0 = r1.size()     // Catch:{ Da7 -> 0x1304 }
        L_0x0399:
            double r0 = (double) r0     // Catch:{ Da7 -> 0x1304 }
            java.lang.Number r0 = X.C25343Ce2.A00(r0)     // Catch:{ Da7 -> 0x1304 }
            r11.A08(r10, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x03a3:
            boolean r0 = r1 instanceof java.util.List     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x03ae
            java.util.List r1 = (java.util.List) r1     // Catch:{ Da7 -> 0x1304 }
            int r0 = r1.size()     // Catch:{ Da7 -> 0x1304 }
            goto L_0x0399
        L_0x03ae:
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x11d6
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Da7 -> 0x1304 }
            int r0 = r1.length()     // Catch:{ Da7 -> 0x1304 }
            goto L_0x0399
        L_0x03b9:
            java.lang.Object r2 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r1 = "invalid vector capacity"
            r0 = 4194304(0x400000, float:5.877472E-39)
            int r1 = r11.A0R(r2, r1, r0)     // Catch:{ Da7 -> 0x1304 }
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ Da7 -> 0x1304 }
            r0.ensureCapacity(r1)     // Catch:{ Da7 -> 0x1304 }
            r11.A08(r10, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x03d1:
            int r5 = X.BE6.A0G(r18)     // Catch:{ Da7 -> 0x1304 }
            int r12 = r5 + 1
            int r0 = r11.A01     // Catch:{ Da7 -> 0x1304 }
            int r1 = r0 + -1
            int r1 = r1 - r12
            java.lang.Object[] r0 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r2 = r0[r1]     // Catch:{ Da7 -> 0x1304 }
            r3 = 10
            boolean r0 = r2 instanceof X.C25488Cgj     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x11eb
            r0 = r2
            X.Cgj r0 = (X.C25488Cgj) r0     // Catch:{ Da7 -> 0x1304 }
            X.E8A r0 = r0.A00     // Catch:{ Da7 -> 0x1304 }
            X.EDl r0 = (X.C28669EDl) r0     // Catch:{ Da7 -> 0x1304 }
            r0.CQH()     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r7 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r7 instanceof java.util.List     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x03ff
            java.util.List r7 = (java.util.List) r7     // Catch:{ Da7 -> 0x1304 }
            int r8 = r7.size()     // Catch:{ Da7 -> 0x1304 }
            goto L_0x0403
        L_0x03ff:
            if (r7 != 0) goto L_0x11e4
            r7 = 0
            r8 = 0
        L_0x0403:
            r0 = 32768(0x8000, float:4.5918E-41)
            int r0 = r0 - r5
            if (r0 >= r8) goto L_0x040b
            goto L_0x11dd
        L_0x040b:
            int r4 = r5 + r8
            int r9 = r4 + 1
            A0G(r11, r9)     // Catch:{ Da7 -> 0x1304 }
            int r3 = r11.A01     // Catch:{ Da7 -> 0x1304 }
            int r1 = r3 + -1
            int r1 = r1 - r5
            int r9 = r9 + r3
            r11.A01 = r9     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object[] r6 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r0 = 0
            java.util.Arrays.fill(r6, r3, r9, r0)     // Catch:{ Da7 -> 0x1304 }
            int r6 = r3 + 1
            java.lang.Object[] r0 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r0[r3] = r2     // Catch:{ Da7 -> 0x1304 }
            java.lang.System.arraycopy(r0, r1, r0, r6, r5)     // Catch:{ Da7 -> 0x1304 }
            int r6 = r6 + r5
            if (r7 == 0) goto L_0x0f35
            r5 = 0
        L_0x042d:
            if (r5 >= r8) goto L_0x0f35
            int r3 = r6 + 1
            java.lang.Object r1 = r7.get(r5)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object[] r0 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r0[r6] = r1     // Catch:{ Da7 -> 0x1304 }
            int r5 = r5 + 1
            r6 = r3
            goto L_0x042d
        L_0x043d:
            int r4 = X.BE6.A0G(r18)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object[] r0 = A0Q(r11)     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x0451
            int r3 = r0.length     // Catch:{ Da7 -> 0x1304 }
        L_0x0448:
            int r1 = r11.A00     // Catch:{ Da7 -> 0x1304 }
            int r1 = r1 - r2
            int[] r0 = r11.A04     // Catch:{ Da7 -> 0x1304 }
            r0 = r0[r1]     // Catch:{ Da7 -> 0x1304 }
            int r3 = r3 + r0
            goto L_0x0453
        L_0x0451:
            r3 = 0
            goto L_0x0448
        L_0x0453:
            boolean r0 = X.AnonymousClass000.A1T(r3, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Da7 -> 0x1304 }
            A0H(r11, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0460:
            int r6 = X.BE6.A0G(r18)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object[] r5 = A0Q(r11)     // Catch:{ Da7 -> 0x1304 }
            if (r5 == 0) goto L_0x047c
            int r4 = r5.length     // Catch:{ Da7 -> 0x1304 }
        L_0x046b:
            int r3 = r11.A00     // Catch:{ Da7 -> 0x1304 }
            int r1 = r3 - r2
            int[] r0 = r11.A04     // Catch:{ Da7 -> 0x1304 }
            r1 = r0[r1]     // Catch:{ Da7 -> 0x1304 }
            if (r6 >= r4) goto L_0x047e
            r0 = r5[r6]     // Catch:{ Da7 -> 0x1304 }
            A0H(r11, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x047c:
            r4 = 0
            goto L_0x046b
        L_0x047e:
            int r0 = r4 + r1
            if (r6 >= r0) goto L_0x0492
            int r6 = r6 - r4
            int r1 = r1 - r6
            int r0 = r1 + -1
            int r0 = r0 + 5
            int r3 = r3 - r0
            java.lang.Object[] r0 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r0 = r0[r3]     // Catch:{ Da7 -> 0x1304 }
            A0H(r11, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0492:
            r0 = 0
            A0H(r11, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0498:
            int r3 = X.BE6.A0G(r18)     // Catch:{ Da7 -> 0x1304 }
            int r1 = X.BE6.A0G(r18)     // Catch:{ Da7 -> 0x1304 }
            X.CsS r9 = new X.CsS     // Catch:{ Da7 -> 0x1304 }
            r9.<init>(r11, r1)     // Catch:{ Da7 -> 0x1304 }
            switch(r3) {
                case 0: goto L_0x0a81;
                case 1: goto L_0x0ab9;
                case 2: goto L_0x0a40;
                case 3: goto L_0x09fb;
                case 4: goto L_0x09b9;
                case 5: goto L_0x099f;
                case 6: goto L_0x093d;
                case 7: goto L_0x08f7;
                case 8: goto L_0x085c;
                case 9: goto L_0x082a;
                case 10: goto L_0x07ae;
                case 11: goto L_0x06fc;
                case 12: goto L_0x062a;
                case 13: goto L_0x0564;
                case 14: goto L_0x054b;
                case 15: goto L_0x04fc;
                case 16: goto L_0x04d0;
                case 17: goto L_0x04aa;
                case 18: goto L_0x0964;
                default: goto L_0x04a8;
            }     // Catch:{ Da7 -> 0x1304 }
        L_0x04a8:
            goto L_0x1201
        L_0x04aa:
            int r1 = r9.A00     // Catch:{ Da7 -> 0x1304 }
            int r0 = r1 % 2
            if (r0 == 0) goto L_0x04b4
            java.lang.String r0 = "MakeSmallMapKV requires an even number of arguments"
            goto L_0x0945
        L_0x04b4:
            int r0 = r1 / 2
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Da7 -> 0x1304 }
            r3.<init>(r0)     // Catch:{ Da7 -> 0x1304 }
            r2 = 0
        L_0x04bc:
            int r0 = r9.A00     // Catch:{ Da7 -> 0x1304 }
            if (r2 >= r0) goto L_0x099a
            java.lang.Object r1 = X.C26108CsS.A00(r9, r2)     // Catch:{ Da7 -> 0x1304 }
            int r0 = r2 + 1
            java.lang.Object r0 = X.C26108CsS.A00(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            r3.put(r1, r0)     // Catch:{ Da7 -> 0x1304 }
            int r2 = r2 + 2
            goto L_0x04bc
        L_0x04d0:
            int r1 = r9.A00     // Catch:{ Da7 -> 0x1304 }
            r2 = 1
            boolean r1 = X.AnonymousClass000.A1T(r1, r0)
            java.lang.String r0 = "MapHasValue expects 2 arguments"
            java.lang.Object r0 = A06(r9, r0, r10, r1)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r0 instanceof java.util.Map     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x04e5
            java.lang.String r0 = "MapHasValue 1st arg must be a map"
            goto L_0x0945
        L_0x04e5:
            java.lang.Object r1 = X.C26108CsS.A00(r9, r10)     // Catch:{ Da7 -> 0x1304 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r0 = X.C26108CsS.A00(r9, r2)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r1.containsValue(r0)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Da7 -> 0x1304 }
            X.C26108CsS.A01(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x04fc:
            int r1 = r9.A00     // Catch:{ Da7 -> 0x1304 }
            r2 = 1
            boolean r1 = X.AnonymousClass000.A1T(r1, r0)
            java.lang.String r0 = "MapKeysValues expects 2 arguments"
            java.lang.Object r0 = A06(r9, r0, r10, r1)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r0 instanceof java.util.Map     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x0511
            java.lang.String r0 = "MapKeysValues 1st arg must be a map"
            goto L_0x0945
        L_0x0511:
            java.lang.Object r1 = X.C26108CsS.A00(r9, r10)     // Catch:{ Da7 -> 0x1304 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r0 = X.C26108CsS.A00(r9, r2)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r0 instanceof java.lang.Boolean     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x0523
            java.lang.String r0 = "MapKeysValues 2nd arg must be a boolean"
            goto L_0x0945
        L_0x0523:
            java.lang.Object r0 = X.C26108CsS.A00(r9, r2)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = X.AnonymousClass000.A1Y(r0)     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x0542
            java.util.Set r0 = r1.keySet()     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object[] r0 = r0.toArray()     // Catch:{ Da7 -> 0x1304 }
        L_0x0535:
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ Da7 -> 0x1304 }
            java.util.List r0 = X.AnonymousClass8BU.A0y(r0)     // Catch:{ Da7 -> 0x1304 }
            X.C26108CsS.A01(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0542:
            java.util.Collection r0 = r1.values()     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object[] r0 = r0.toArray()     // Catch:{ Da7 -> 0x1304 }
            goto L_0x0535
        L_0x054b:
            int r0 = r9.A00     // Catch:{ Da7 -> 0x1304 }
            boolean r1 = X.AnonymousClass000.A1P(r0)
            java.lang.String r0 = "CurrentTimeMillis expects no arguments"
            X.C25344Ce3.A01(r1, r0)     // Catch:{ Da7 -> 0x1304 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Da7 -> 0x1304 }
            double r0 = (double) r2     // Catch:{ Da7 -> 0x1304 }
            java.lang.Number r0 = X.C25343Ce2.A00(r0)     // Catch:{ Da7 -> 0x1304 }
            X.C26108CsS.A01(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0564:
            int r3 = r9.A00     // Catch:{ Da7 -> 0x1304 }
            r1 = 5
            r4 = 1
            boolean r3 = X.AnonymousClass000.A1T(r3, r1)
            java.lang.String r1 = "ArrayCopy expects 5 arguments"
            java.lang.Object r1 = A06(r9, r1, r10, r3)     // Catch:{ Da7 -> 0x1304 }
            boolean r1 = r1 instanceof java.util.List     // Catch:{ Da7 -> 0x1304 }
            if (r1 != 0) goto L_0x057a
            java.lang.String r0 = "ArrayCopy 1st argument must be an array"
            goto L_0x0945
        L_0x057a:
            java.lang.Object r8 = X.C26108CsS.A00(r9, r10)     // Catch:{ Da7 -> 0x1304 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ Da7 -> 0x1304 }
            double r6 = A00(r9, r4)     // Catch:{ Da7 -> 0x1304 }
            boolean r1 = X.C26108CsS.A02(r6)     // Catch:{ Da7 -> 0x1304 }
            if (r1 != 0) goto L_0x058e
            java.lang.String r0 = "ArrayCopy 2nd argument must be an integer"
            goto L_0x0945
        L_0x058e:
            java.lang.Object r1 = X.C26108CsS.A00(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            boolean r1 = r1 instanceof java.util.List     // Catch:{ Da7 -> 0x1304 }
            if (r1 != 0) goto L_0x059a
            java.lang.String r0 = "ArrayCopy 3rd argument must be an array"
            goto L_0x0945
        L_0x059a:
            java.lang.Object r5 = X.C26108CsS.A00(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ Da7 -> 0x1304 }
            double r0 = A00(r9, r2)     // Catch:{ Da7 -> 0x1304 }
            boolean r2 = X.C26108CsS.A02(r0)     // Catch:{ Da7 -> 0x1304 }
            if (r2 != 0) goto L_0x05ae
            java.lang.String r0 = "ArrayCopy 4th argument must be an integer"
            goto L_0x0945
        L_0x05ae:
            r2 = 4
            double r3 = A00(r9, r2)     // Catch:{ Da7 -> 0x1304 }
            boolean r2 = X.C26108CsS.A02(r3)     // Catch:{ Da7 -> 0x1304 }
            if (r2 != 0) goto L_0x05bd
            java.lang.String r0 = "ArrayCopy 5th argument must be an integer"
            goto L_0x0945
        L_0x05bd:
            int r2 = r8.size()     // Catch:{ Da7 -> 0x1304 }
            int r20 = r5.size()     // Catch:{ Da7 -> 0x1304 }
            int r12 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r12 >= 0) goto L_0x05cb
            double r12 = (double) r2     // Catch:{ Da7 -> 0x1304 }
            double r6 = r6 + r12
        L_0x05cb:
            int r12 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r12 < 0) goto L_0x1226
            double r14 = (double) r2     // Catch:{ Da7 -> 0x1304 }
            int r2 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r2 > 0) goto L_0x1226
            int r2 = (int) r6     // Catch:{ Da7 -> 0x1304 }
            int r6 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r6 >= 0) goto L_0x05dd
            r6 = r20
            double r6 = (double) r6     // Catch:{ Da7 -> 0x1304 }
            double r0 = r0 + r6
        L_0x05dd:
            int r6 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r6 < 0) goto L_0x1223
            r6 = r20
            double r12 = (double) r6     // Catch:{ Da7 -> 0x1304 }
            int r6 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r6 > 0) goto L_0x1223
            int r6 = (int) r0     // Catch:{ Da7 -> 0x1304 }
            int r0 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r0 < 0) goto L_0x1220
            double r0 = (double) r2     // Catch:{ Da7 -> 0x1304 }
            double r0 = r0 + r3
            int r7 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r7 > 0) goto L_0x1220
            double r0 = (double) r6     // Catch:{ Da7 -> 0x1304 }
            double r0 = r0 + r3
            int r7 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r7 > 0) goto L_0x1220
            int r0 = (int) r3     // Catch:{ Da7 -> 0x1304 }
            if (r8 != r5) goto L_0x0611
            if (r6 <= r2) goto L_0x0611
            int r2 = r2 + r0
            int r6 = r6 + r0
        L_0x0600:
            int r1 = r0 + -1
            if (r0 == 0) goto L_0x0624
            int r6 = r6 + -1
            int r2 = r2 + -1
            java.lang.Object r0 = r8.get(r2)     // Catch:{ UnsupportedOperationException -> 0x120c }
            r5.set(r6, r0)     // Catch:{ UnsupportedOperationException -> 0x120c }
            r0 = r1
            goto L_0x0600
        L_0x0611:
            int r4 = r0 + -1
            if (r0 == 0) goto L_0x0624
            int r3 = r6 + 1
            int r1 = r2 + 1
            java.lang.Object r0 = r8.get(r2)     // Catch:{ UnsupportedOperationException -> 0x120c }
            r5.set(r6, r0)     // Catch:{ UnsupportedOperationException -> 0x120c }
            r6 = r3
            r0 = r4
            r2 = r1
            goto L_0x0611
        L_0x0624:
            r0 = 0
            X.C26108CsS.A01(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x062a:
            int r4 = r9.A00     // Catch:{ Da7 -> 0x1304 }
            r1 = 5
            r3 = 1
            boolean r4 = X.AnonymousClass000.A1T(r4, r1)
            java.lang.String r1 = "StringSearch expects 5 arguments"
            java.lang.Object r1 = A06(r9, r1, r10, r4)     // Catch:{ Da7 -> 0x1304 }
            boolean r1 = r1 instanceof java.lang.String     // Catch:{ Da7 -> 0x1304 }
            if (r1 != 0) goto L_0x0640
            java.lang.String r0 = "StringSearch 1st arg must be a string"
            goto L_0x0945
        L_0x0640:
            java.lang.Object r7 = X.C26108CsS.A00(r9, r10)     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r1 = X.C26108CsS.A00(r9, r3)     // Catch:{ Da7 -> 0x1304 }
            boolean r1 = r1 instanceof java.lang.String     // Catch:{ Da7 -> 0x1304 }
            if (r1 != 0) goto L_0x0652
            java.lang.String r0 = "StringSearch 2nd arg must be a string"
            goto L_0x0945
        L_0x0652:
            java.lang.Object r6 = X.C26108CsS.A00(r9, r3)     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r1 = X.C26108CsS.A00(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            boolean r1 = X.AnonymousClass000.A1X(r1)
            r4 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            if (r1 != 0) goto L_0x0672
            double r0 = A00(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            boolean r3 = X.C26108CsS.A02(r0)     // Catch:{ Da7 -> 0x1304 }
            if (r3 != 0) goto L_0x0674
            java.lang.String r0 = "StringSearch 3rd arg must be an integer or null"
            goto L_0x0945
        L_0x0672:
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
        L_0x0674:
            java.lang.Object r3 = X.C26108CsS.A00(r9, r2)     // Catch:{ Da7 -> 0x1304 }
            if (r3 == 0) goto L_0x0688
            double r4 = A00(r9, r2)     // Catch:{ Da7 -> 0x1304 }
            boolean r2 = X.C26108CsS.A02(r4)     // Catch:{ Da7 -> 0x1304 }
            if (r2 != 0) goto L_0x0688
            java.lang.String r0 = "StringSearch 4th arg must be an integer or null"
            goto L_0x0945
        L_0x0688:
            r3 = 4
            java.lang.Object r2 = X.C26108CsS.A00(r9, r3)     // Catch:{ Da7 -> 0x1304 }
            boolean r2 = r2 instanceof java.lang.Boolean     // Catch:{ Da7 -> 0x1304 }
            if (r2 != 0) goto L_0x0695
            java.lang.String r0 = "StringSearch 5th arg must be a boolean"
            goto L_0x0945
        L_0x0695:
            java.lang.Object r2 = X.C26108CsS.A00(r9, r3)     // Catch:{ Da7 -> 0x1304 }
            boolean r14 = X.AnonymousClass000.A1Y(r2)     // Catch:{ Da7 -> 0x1304 }
            int r8 = r7.length()     // Catch:{ Da7 -> 0x1304 }
            boolean r2 = java.lang.Double.isNaN(r0)     // Catch:{ Da7 -> 0x1304 }
            if (r2 == 0) goto L_0x06aa
            r0 = 0
            goto L_0x06b4
        L_0x06aa:
            int r2 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r2 >= 0) goto L_0x06b0
            double r2 = (double) r8     // Catch:{ Da7 -> 0x1304 }
            double r0 = r0 + r2
        L_0x06b0:
            int r2 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r2 < 0) goto L_0x122c
        L_0x06b4:
            double r2 = (double) r8     // Catch:{ Da7 -> 0x1304 }
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 > 0) goto L_0x122c
            int r12 = (int) r0     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = java.lang.Double.isNaN(r4)     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x06cc
            int r0 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            if (r0 < 0) goto L_0x1229
            double r0 = (double) r12     // Catch:{ Da7 -> 0x1304 }
            double r0 = r0 + r4
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 > 0) goto L_0x1229
            int r1 = (int) r4     // Catch:{ Da7 -> 0x1304 }
            goto L_0x06ce
        L_0x06cc:
            int r1 = r8 - r12
        L_0x06ce:
            int r0 = r6.length()     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x06ef
            if (r0 > r1) goto L_0x06ef
            if (r12 != 0) goto L_0x06dd
            if (r1 != r8) goto L_0x06dd
        L_0x06da:
            if (r14 == 0) goto L_0x06e8
            goto L_0x06e3
        L_0x06dd:
            int r1 = r1 + r12
            java.lang.String r7 = r7.substring(r12, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x06da
        L_0x06e3:
            int r0 = r7.lastIndexOf(r6)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x06ec
        L_0x06e8:
            int r0 = r7.indexOf(r6)     // Catch:{ Da7 -> 0x1304 }
        L_0x06ec:
            if (r0 < 0) goto L_0x06ef
            goto L_0x06f1
        L_0x06ef:
            r0 = 0
            goto L_0x06f7
        L_0x06f1:
            int r0 = r0 + r12
            double r0 = (double) r0     // Catch:{ Da7 -> 0x1304 }
            java.lang.Number r0 = X.C25343Ce2.A00(r0)     // Catch:{ Da7 -> 0x1304 }
        L_0x06f7:
            X.C26108CsS.A01(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x06fc:
            int r4 = r9.A00     // Catch:{ Da7 -> 0x1304 }
            r1 = 4
            r3 = 1
            boolean r4 = X.AnonymousClass000.A1T(r4, r1)
            java.lang.String r1 = "SubstringCompare expects 4 arguments"
            java.lang.Object r1 = A06(r9, r1, r10, r4)     // Catch:{ Da7 -> 0x1304 }
            boolean r1 = r1 instanceof java.lang.String     // Catch:{ Da7 -> 0x1304 }
            if (r1 != 0) goto L_0x0712
            java.lang.String r0 = "SubstringCompare 1st arg must be a string"
            goto L_0x0945
        L_0x0712:
            java.lang.Object r8 = X.C26108CsS.A00(r9, r10)     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r1 = X.C26108CsS.A00(r9, r3)     // Catch:{ Da7 -> 0x1304 }
            boolean r1 = r1 instanceof java.lang.String     // Catch:{ Da7 -> 0x1304 }
            if (r1 != 0) goto L_0x0724
            java.lang.String r0 = "SubstringCompare 2nd arg must be a string"
            goto L_0x0945
        L_0x0724:
            java.lang.Object r7 = X.C26108CsS.A00(r9, r3)     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r1 = X.C26108CsS.A00(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            boolean r1 = X.AnonymousClass000.A1X(r1)
            r3 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            if (r1 != 0) goto L_0x0744
            double r0 = A00(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            boolean r5 = X.C26108CsS.A02(r0)     // Catch:{ Da7 -> 0x1304 }
            if (r5 != 0) goto L_0x0746
            java.lang.String r0 = "SubstringCompare 3rd arg must be an integer or null"
            goto L_0x0945
        L_0x0744:
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
        L_0x0746:
            java.lang.Object r5 = X.C26108CsS.A00(r9, r2)     // Catch:{ Da7 -> 0x1304 }
            if (r5 == 0) goto L_0x075a
            double r3 = A00(r9, r2)     // Catch:{ Da7 -> 0x1304 }
            boolean r2 = X.C26108CsS.A02(r3)     // Catch:{ Da7 -> 0x1304 }
            if (r2 != 0) goto L_0x075a
            java.lang.String r0 = "SubstringCompare 4th arg must be an integer or null"
            goto L_0x0945
        L_0x075a:
            int r2 = r8.length()     // Catch:{ Da7 -> 0x1304 }
            boolean r5 = java.lang.Double.isNaN(r0)     // Catch:{ Da7 -> 0x1304 }
            r14 = 0
            if (r5 == 0) goto L_0x0769
            r0 = 0
            goto L_0x0773
        L_0x0769:
            int r5 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r5 >= 0) goto L_0x076f
            double r5 = (double) r2     // Catch:{ Da7 -> 0x1304 }
            double r0 = r0 + r5
        L_0x076f:
            int r5 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r5 < 0) goto L_0x1232
        L_0x0773:
            double r5 = (double) r2     // Catch:{ Da7 -> 0x1304 }
            int r12 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r12 > 0) goto L_0x1232
            int r12 = (int) r0     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = java.lang.Double.isNaN(r3)     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x0780
            goto L_0x0783
        L_0x0780:
            int r0 = r2 - r12
            goto L_0x078e
        L_0x0783:
            int r0 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r0 < 0) goto L_0x122f
            double r0 = (double) r12     // Catch:{ Da7 -> 0x1304 }
            double r0 = r0 + r3
            int r13 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r13 > 0) goto L_0x122f
            int r0 = (int) r3     // Catch:{ Da7 -> 0x1304 }
        L_0x078e:
            if (r12 != 0) goto L_0x0793
            if (r0 != r2) goto L_0x0793
            goto L_0x0798
        L_0x0793:
            int r0 = r0 + r12
            java.lang.String r8 = r8.substring(r12, r0)     // Catch:{ Da7 -> 0x1304 }
        L_0x0798:
            int r0 = r8.compareTo(r7)     // Catch:{ Da7 -> 0x1304 }
            if (r0 >= 0) goto L_0x07a1
            r14 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L_0x07a5
        L_0x07a1:
            if (r0 == 0) goto L_0x07a5
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x07a5:
            java.lang.Number r0 = X.C25343Ce2.A00(r14)     // Catch:{ Da7 -> 0x1304 }
            X.C26108CsS.A01(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x07ae:
            int r1 = r9.A00     // Catch:{ Da7 -> 0x1304 }
            r3 = 1
            boolean r2 = X.AnonymousClass000.A1T(r1, r2)
            java.lang.String r1 = "Substring expects 3 arguments"
            java.lang.Object r1 = A06(r9, r1, r10, r2)     // Catch:{ Da7 -> 0x1304 }
            boolean r1 = r1 instanceof java.lang.String     // Catch:{ Da7 -> 0x1304 }
            if (r1 != 0) goto L_0x07c3
            java.lang.String r0 = "Substring 1st arg must be a string"
            goto L_0x0945
        L_0x07c3:
            java.lang.Object r6 = X.C26108CsS.A00(r9, r10)     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Da7 -> 0x1304 }
            double r2 = A00(r9, r3)     // Catch:{ Da7 -> 0x1304 }
            boolean r1 = X.C26108CsS.A02(r2)     // Catch:{ Da7 -> 0x1304 }
            if (r1 != 0) goto L_0x07d7
            java.lang.String r0 = "Substring 2nd arg must be an integer"
            goto L_0x0945
        L_0x07d7:
            java.lang.Object r1 = X.C26108CsS.A00(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            if (r1 != 0) goto L_0x07e0
            r4 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L_0x07ee
        L_0x07e0:
            double r4 = A00(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = X.C26108CsS.A02(r4)     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x07ee
            java.lang.String r0 = "Substring 3rd arg must be an integer or null"
            goto L_0x0945
        L_0x07ee:
            int r7 = r6.length()     // Catch:{ Da7 -> 0x1304 }
            int r0 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r0 >= 0) goto L_0x07f8
            double r0 = (double) r7     // Catch:{ Da7 -> 0x1304 }
            double r2 = r2 + r0
        L_0x07f8:
            int r0 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r0 < 0) goto L_0x1235
            double r0 = (double) r7     // Catch:{ Da7 -> 0x1304 }
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 > 0) goto L_0x1235
            int r8 = (int) r2     // Catch:{ Da7 -> 0x1304 }
            boolean r2 = java.lang.Double.isNaN(r4)     // Catch:{ Da7 -> 0x1304 }
            if (r2 != 0) goto L_0x0809
            goto L_0x080c
        L_0x0809:
            int r0 = r7 - r8
            goto L_0x0817
        L_0x080c:
            int r2 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            if (r2 < 0) goto L_0x1238
            double r2 = (double) r8     // Catch:{ Da7 -> 0x1304 }
            double r2 = r2 + r4
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 > 0) goto L_0x1238
            int r0 = (int) r4     // Catch:{ Da7 -> 0x1304 }
        L_0x0817:
            if (r8 != 0) goto L_0x0820
            if (r0 != r7) goto L_0x0820
            java.lang.Object r0 = X.C26108CsS.A00(r9, r10)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x0825
        L_0x0820:
            int r0 = r0 + r8
            java.lang.String r0 = r6.substring(r8, r0)     // Catch:{ Da7 -> 0x1304 }
        L_0x0825:
            X.C26108CsS.A01(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x082a:
            int r0 = r9.A00     // Catch:{ Da7 -> 0x1304 }
            boolean r1 = X.C17890vO.A1R(r0)
            java.lang.String r0 = "IsFinite expects 1 argument"
            java.lang.Object r0 = A06(r9, r0, r10, r1)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Number r0 = A04(r0)     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x0840
            java.lang.String r0 = "IsFinite argument must be numeric"
            goto L_0x0945
        L_0x0840:
            double r0 = r0.doubleValue()     // Catch:{ Da7 -> 0x1304 }
            double r3 = java.lang.Math.abs(r0)     // Catch:{ Da7 -> 0x1304 }
            r1 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.C108975cc.A1A(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Da7 -> 0x1304 }
            X.C26108CsS.A01(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x085c:
            int r1 = r9.A00     // Catch:{ Da7 -> 0x1304 }
            r2 = 1
            boolean r1 = X.AnonymousClass000.A1T(r1, r0)
            java.lang.String r0 = "ParseInt64 requires 2 arguments"
            java.lang.Object r1 = A06(r9, r0, r10, r1)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r0 = X.C26108CsS.A00(r9, r2)     // Catch:{ Da7 -> 0x1304 }
            boolean r23 = A0O(r0)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = A0N(r1)     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x0881
            double r2 = X.AnonymousClass8BR.A00(r1)     // Catch:{ Da7 -> 0x1304 }
            long r0 = (long) r2     // Catch:{ Da7 -> 0x1304 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x08ef
        L_0x0881:
            boolean r0 = r1 instanceof java.lang.Long     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x08ef
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x08eb
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = A0P(r1)     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x08f1
            java.lang.String r6 = r1.trim()     // Catch:{ Da7 -> 0x1304 }
            int r5 = r6.length()     // Catch:{ NumberFormatException -> 0x08f1 }
            if (r5 == 0) goto L_0x08f1
            r4 = 0
            char r1 = r6.charAt(r10)     // Catch:{ NumberFormatException -> 0x08f1 }
            r0 = 45
            r22 = 1
            if (r1 != r0) goto L_0x08a7
            goto L_0x08b4
        L_0x08a7:
            r0 = 43
            if (r1 != r0) goto L_0x08ac
            r4 = 1
        L_0x08ac:
            r20 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r22 = 0
            goto L_0x08b7
        L_0x08b4:
            r4 = 1
            r20 = -9223372036854775808
        L_0x08b7:
            if (r4 == r5) goto L_0x08f1
            r14 = 10
            long r12 = r20 / r14
            r2 = 0
        L_0x08bf:
            if (r4 >= r5) goto L_0x08e3
            char r0 = r6.charAt(r4)     // Catch:{ NumberFormatException -> 0x08f1 }
            int r8 = r0 + -48
            if (r8 < 0) goto L_0x08f1
            r0 = 9
            if (r8 > r0) goto L_0x08f1
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x08de
            long r2 = r2 * r14
            long r0 = (long) r8     // Catch:{ NumberFormatException -> 0x08f1 }
            long r0 = r0 + r20
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 < 0) goto L_0x08de
            long r0 = (long) r8     // Catch:{ NumberFormatException -> 0x08f1 }
            long r2 = r2 - r0
        L_0x08db:
            int r4 = r4 + 1
            goto L_0x08bf
        L_0x08de:
            if (r23 == 0) goto L_0x08f1
            r2 = r20
            goto L_0x08db
        L_0x08e3:
            if (r22 != 0) goto L_0x08e6
            long r2 = -r2
        L_0x08e6:
            java.lang.Long r1 = java.lang.Long.valueOf(r2)     // Catch:{ NumberFormatException -> 0x08f1 }
            goto L_0x08ef
        L_0x08eb:
            java.lang.Long r1 = A03(r1)     // Catch:{ Da7 -> 0x1304 }
        L_0x08ef:
            if (r1 != 0) goto L_0x08f2
        L_0x08f1:
            r1 = 0
        L_0x08f2:
            X.C26108CsS.A01(r9, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x08f7:
            int r1 = r9.A00     // Catch:{ Da7 -> 0x1304 }
            r2 = 1
            r4 = 0
            boolean r1 = X.AnonymousClass000.A1T(r1, r0)
            java.lang.String r0 = "MakeMap expects 2 arguments"
            java.lang.Object r5 = A06(r9, r0, r10, r1)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r3 = X.C26108CsS.A00(r9, r2)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r5 instanceof java.util.List     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x0910
            java.lang.String r0 = "MakeMap arg 0 must be a list"
            goto L_0x0945
        L_0x0910:
            boolean r0 = r3 instanceof java.util.List     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x0917
            java.lang.String r0 = "MakeMap arg 1 must be a list"
            goto L_0x0945
        L_0x0917:
            java.util.List r5 = (java.util.List) r5     // Catch:{ Da7 -> 0x1304 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ Da7 -> 0x1304 }
            int r2 = r5.size()     // Catch:{ Da7 -> 0x1304 }
            int r0 = r3.size()     // Catch:{ Da7 -> 0x1304 }
            if (r2 == r0) goto L_0x0928
            java.lang.String r0 = "MakeMap different number keys/values"
            goto L_0x0945
        L_0x0928:
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ Da7 -> 0x1304 }
            r6.<init>(r2)     // Catch:{ Da7 -> 0x1304 }
        L_0x092d:
            if (r4 >= r2) goto L_0x09b4
            java.lang.Object r1 = r5.get(r4)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r0 = r3.get(r4)     // Catch:{ Da7 -> 0x1304 }
            r6.put(r1, r0)     // Catch:{ Da7 -> 0x1304 }
            int r4 = r4 + 1
            goto L_0x092d
        L_0x093d:
            int r1 = r9.A00     // Catch:{ Da7 -> 0x1304 }
            int r0 = r1 % 2
            if (r0 == 0) goto L_0x094a
            java.lang.String r0 = "MakeSmallMap requires an even number of arguments"
        L_0x0945:
            A0L(r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x094a:
            int r4 = r1 / 2
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Da7 -> 0x1304 }
            r3.<init>(r4)     // Catch:{ Da7 -> 0x1304 }
            r2 = 0
        L_0x0952:
            if (r2 >= r4) goto L_0x099a
            java.lang.Object r1 = X.C26108CsS.A00(r9, r2)     // Catch:{ Da7 -> 0x1304 }
            int r0 = r4 + r2
            java.lang.Object r0 = X.C26108CsS.A00(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            r3.put(r1, r0)     // Catch:{ Da7 -> 0x1304 }
            int r2 = r2 + 1
            goto L_0x0952
        L_0x0964:
            int r1 = r9.A00     // Catch:{ Da7 -> 0x1304 }
            r5 = 1
            boolean r2 = X.AnonymousClass000.A1T(r1, r2)
            java.lang.String r1 = "StringReplaceAll requires 3 arguments"
            X.C25344Ce3.A01(r2, r1)     // Catch:{ Da7 -> 0x1304 }
            X.CxC r4 = r9.A02     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r1 = X.C26108CsS.A00(r9, r10)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r3 = r4.A0S(r1)     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r1 = X.C26108CsS.A00(r9, r5)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r2 = r4.A0S(r1)     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r0 = X.C26108CsS.A00(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r1 = r4.A0S(r0)     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r2.isEmpty()     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x099a
            java.lang.String r3 = r3.replace(r2, r1)     // Catch:{ Da7 -> 0x1304 }
        L_0x099a:
            X.C26108CsS.A01(r9, r3)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x099f:
            int r0 = r9.A00     // Catch:{ Da7 -> 0x1304 }
            java.util.ArrayList r6 = X.C17880vN.A0z(r0)     // Catch:{ Da7 -> 0x1304 }
            r1 = 0
        L_0x09a6:
            int r0 = r9.A00     // Catch:{ Da7 -> 0x1304 }
            if (r1 >= r0) goto L_0x09b4
            java.lang.Object r0 = X.C26108CsS.A00(r9, r1)     // Catch:{ Da7 -> 0x1304 }
            r6.add(r0)     // Catch:{ Da7 -> 0x1304 }
            int r1 = r1 + 1
            goto L_0x09a6
        L_0x09b4:
            X.C26108CsS.A01(r9, r6)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x09b9:
            int r1 = r9.A00     // Catch:{ Da7 -> 0x1304 }
            r3 = 1
            boolean r2 = X.AnonymousClass000.A1T(r1, r2)
            java.lang.String r1 = "MapPutAll requires 3 arguments"
            java.lang.Object r2 = A06(r9, r1, r0, r2)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r1 = X.C26108CsS.A00(r9, r3)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x09d5
            java.lang.String r0 = "MapPutAll 2nd arg must be a Map"
            A0M(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x09d5:
            boolean r0 = r2 instanceof java.util.Map     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x09e0
            java.lang.String r0 = "MapPutAll 3rd arg must be a Map"
            A0M(r0, r2)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x09e0:
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ Da7 -> 0x1304 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r0 = X.C26108CsS.A00(r9, r10)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = A0O(r0)     // Catch:{ Da7 -> 0x1304 }
            if (r2 == r1) goto L_0x09f5
            r1.putAll(r2)     // Catch:{ UnsupportedOperationException -> 0x09f2 }
            goto L_0x09f5
        L_0x09f2:
            r1 = move-exception
            if (r0 != 0) goto L_0x1303
        L_0x09f5:
            r0 = 0
            X.C26108CsS.A01(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x09fb:
            int r3 = r9.A00     // Catch:{ Da7 -> 0x1304 }
            r1 = 4
            r6 = 1
            boolean r3 = X.AnonymousClass000.A1T(r3, r1)
            java.lang.String r1 = "StringReplace requires 4 arguments"
            X.C25344Ce3.A01(r3, r1)     // Catch:{ Da7 -> 0x1304 }
            X.CxC r5 = r9.A02     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r1 = X.C26108CsS.A00(r9, r10)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r4 = r5.A0S(r1)     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r1 = X.C26108CsS.A00(r9, r6)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r3 = r5.A0S(r1)     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r0 = X.C26108CsS.A00(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r1 = r5.A0S(r0)     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r0 = X.C26108CsS.A00(r9, r2)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = A0O(r0)     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x0a3b
            java.lang.String r0 = r4.replaceAll(r3, r1)     // Catch:{ Da7 -> 0x1304 }
        L_0x0a36:
            X.C26108CsS.A01(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0a3b:
            java.lang.String r0 = r4.replaceFirst(r3, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x0a36
        L_0x0a40:
            int r0 = r9.A00     // Catch:{ Da7 -> 0x1304 }
            boolean r1 = X.C17890vO.A1R(r0)
            java.lang.String r0 = "ParseNumber requires one argument"
            java.lang.Object r1 = A06(r9, r0, r10, r1)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = A0N(r1)     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x0a79
            boolean r0 = r1 instanceof java.lang.Long     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x0a60
            long r2 = X.C17880vN.A05(r1)     // Catch:{ Da7 -> 0x1304 }
            double r0 = (double) r2     // Catch:{ Da7 -> 0x1304 }
            java.lang.Number r1 = X.C25343Ce2.A00(r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x0a79
        L_0x0a60:
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x0a75
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = A0P(r1)     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x0a7b
            double r0 = java.lang.Double.parseDouble(r1)     // Catch:{ NumberFormatException -> 0x0a7b }
            java.lang.Number r1 = X.C25343Ce2.A00(r0)     // Catch:{ NumberFormatException -> 0x0a7b }
            goto L_0x0a79
        L_0x0a75:
            java.lang.Number r1 = A04(r1)     // Catch:{ Da7 -> 0x1304 }
        L_0x0a79:
            if (r1 != 0) goto L_0x0a7c
        L_0x0a7b:
            r1 = 0
        L_0x0a7c:
            X.C26108CsS.A01(r9, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0a81:
            int r1 = r9.A00     // Catch:{ Da7 -> 0x1304 }
            r2 = 1
            boolean r1 = X.AnonymousClass000.A1T(r1, r0)
            java.lang.String r0 = "VectorRemove requires 2 arguments"
            java.lang.Object r4 = A06(r9, r0, r10, r1)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r3 = X.C26108CsS.A00(r9, r2)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r4 instanceof java.util.List     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x0a9d
            java.lang.String r0 = "VectorRemove 1st arg must be a vector"
            A0M(r0, r4)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x0a9d:
            java.util.List r4 = (java.util.List) r4     // Catch:{ Da7 -> 0x1304 }
            X.CxC r2 = r9.A02     // Catch:{ Da7 -> 0x1304 }
            r1 = 4194303(0x3fffff, float:5.87747E-39)
            java.lang.String r0 = "VectorRemove invalid vector index"
            int r1 = r2.A0R(r3, r0, r1)     // Catch:{ Da7 -> 0x1304 }
            int r0 = r4.size()     // Catch:{ Da7 -> 0x1304 }
            if (r1 >= r0) goto L_0x0ab3
            r4.remove(r1)     // Catch:{ Da7 -> 0x1304 }
        L_0x0ab3:
            r0 = 0
            X.C26108CsS.A01(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0ab9:
            int r0 = r9.A00     // Catch:{ Da7 -> 0x1304 }
            boolean r1 = X.AnonymousClass000.A1P(r0)
            java.lang.String r0 = "RuntimeRandom expects 0 arguments"
            X.C25344Ce3.A01(r1, r0)     // Catch:{ Da7 -> 0x1304 }
            X.CxC r0 = r9.A02     // Catch:{ Da7 -> 0x1304 }
            java.util.Random r0 = r0.A06     // Catch:{ Da7 -> 0x1304 }
            double r0 = r0.nextDouble()     // Catch:{ Da7 -> 0x1304 }
            java.lang.Number r0 = X.C25343Ce2.A00(r0)     // Catch:{ Da7 -> 0x1304 }
            X.C26108CsS.A01(r9, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0ad5:
            int r1 = X.BE6.A0G(r18)     // Catch:{ Da7 -> 0x1304 }
            r0 = r17
            java.lang.Object[] r0 = r0.A03     // Catch:{ Da7 -> 0x1304 }
            r0 = r0[r1]     // Catch:{ Da7 -> 0x1304 }
            A0H(r11, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0ae4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ Da7 -> 0x1304 }
            A0H(r11, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0aed:
            java.lang.String r0 = "<="
            r11.A0B(r2, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0af4:
            java.lang.String r1 = "<"
            r11.A0B(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0afb:
            java.lang.String r0 = ">"
            r11.A0B(r3, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0b02:
            java.lang.String r0 = ">="
            r11.A0B(r10, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0b09:
            java.lang.String r1 = "INT64_SHR"
            r0 = 22
            r11.A0A(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0b12:
            java.lang.String r1 = "INT64_ASR"
            r0 = 21
            r11.A0A(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0b1b:
            java.lang.String r1 = "INT64_SHL"
            r0 = 20
            r11.A0A(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0b24:
            java.lang.String r1 = "INT64_XOR"
            r0 = 19
            r11.A0A(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0b2d:
            java.lang.String r1 = "INT64_OR"
            r0 = 18
            r11.A0A(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0b36:
            java.lang.String r1 = "INT64_AND"
            r0 = 17
            r11.A0A(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0b3f:
            java.lang.String r1 = "INT64_ADD"
            r0 = 16
            r11.A0A(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0b48:
            java.lang.String r1 = "INT64_SUB"
            r0 = 15
            r11.A0A(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0b51:
            java.lang.String r1 = "INT64_MOD"
            r0 = 14
            r11.A0A(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0b5a:
            java.lang.String r1 = "INT64_DIV"
            r0 = 13
            r11.A0A(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0b63:
            java.lang.String r1 = "INT64_MUL"
            r0 = 12
            r11.A0A(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0b6c:
            java.lang.String r1 = ">>>"
            r0 = 11
            r11.A09(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0b75:
            java.lang.String r1 = ">>"
            r0 = 10
            r11.A09(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0b7e:
            java.lang.String r1 = "<<"
            r0 = 9
            r11.A09(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0b87:
            java.lang.String r1 = "^"
            r0 = 8
            r11.A09(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0b90:
            java.lang.String r1 = "|"
            r0 = 7
            r11.A09(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0b98:
            java.lang.String r1 = "&"
            r0 = 6
            r11.A09(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0ba0:
            java.lang.String r1 = "-"
            r0 = 4
            r11.A09(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0ba8:
            java.lang.String r0 = "%"
            r11.A09(r2, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0baf:
            java.lang.String r1 = "/"
            r11.A09(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0bb6:
            java.lang.String r0 = "imul"
            r11.A09(r3, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0bbd:
            java.lang.String r0 = "*"
            r11.A09(r10, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0bc4:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ Da7 -> 0x1304 }
            A0H(r11, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0bcb:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Da7 -> 0x1304 }
            A0H(r11, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0bd2:
            java.lang.Object r0 = r11.A07     // Catch:{ Da7 -> 0x1304 }
        L_0x0bd4:
            A0H(r11, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0bd9:
            boolean r1 = X.AnonymousClass000.A1P(r19)
            java.lang.String r0 = "enter executed more than once"
            if (r1 == 0) goto L_0x1261
            int r19 = X.BE6.A0G(r18)     // Catch:{ Da7 -> 0x1304 }
            int r3 = X.BE6.A0G(r18)     // Catch:{ Da7 -> 0x1304 }
            short r1 = r18.getShort()     // Catch:{ Da7 -> 0x1304 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            r0 = r19
            boolean r0 = X.BE8.A1U(r3, r0)
            java.lang.String r4 = "op_enter too many params to copy"
            if (r0 == 0) goto L_0x1250
            int r1 = r1 + r19
            int r0 = r1 + 5
            A0G(r11, r0)     // Catch:{ Da7 -> 0x1304 }
            int r4 = r11.A01     // Catch:{ Da7 -> 0x1304 }
            int r5 = r19 + r4
            r11.A01 = r5     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object[] r1 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r0 = 0
            java.util.Arrays.fill(r1, r4, r5, r0)     // Catch:{ Da7 -> 0x1304 }
            int r6 = r11.A00     // Catch:{ Da7 -> 0x1304 }
            int r1 = r6 - r2
            int[] r0 = r11.A04     // Catch:{ Da7 -> 0x1304 }
            r5 = r0[r1]     // Catch:{ Da7 -> 0x1304 }
            r0 = 4
            int r6 = r6 - r0
            java.lang.Object[] r0 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r0 = r0[r6]     // Catch:{ Da7 -> 0x1304 }
            X.Cgj r0 = (X.C25488Cgj) r0     // Catch:{ Da7 -> 0x1304 }
            X.E8A r0 = r0.A00     // Catch:{ Da7 -> 0x1304 }
            X.EDl r0 = (X.C28669EDl) r0     // Catch:{ Da7 -> 0x1304 }
            X.DNt r0 = r0.CQH()     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object[] r2 = r0.A02     // Catch:{ Da7 -> 0x1304 }
            if (r2 == 0) goto L_0x0c37
            int r0 = r2.length     // Catch:{ Da7 -> 0x1304 }
        L_0x0c2b:
            int r1 = java.lang.Math.min(r0, r3)     // Catch:{ Da7 -> 0x1304 }
            if (r1 == 0) goto L_0x0c3a
            java.lang.Object[] r0 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            java.lang.System.arraycopy(r2, r10, r0, r4, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x0c39
        L_0x0c37:
            r0 = 0
            goto L_0x0c2b
        L_0x0c39:
            int r4 = r4 + r1
        L_0x0c3a:
            int r3 = X.BE6.A09(r3, r1, r5)     // Catch:{ Da7 -> 0x1304 }
            if (r3 <= 0) goto L_0x1111
            java.lang.Object[] r2 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            int r1 = r11.A00     // Catch:{ Da7 -> 0x1304 }
            int r0 = r5 + -1
            int r0 = r0 + 5
            int r1 = r1 - r0
            java.lang.System.arraycopy(r2, r1, r2, r4, r3)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0c4e:
            int r2 = X.BE6.A0G(r18)     // Catch:{ Da7 -> 0x1304 }
            int r4 = r2 + 1
            int r0 = r11.A01     // Catch:{ Da7 -> 0x1304 }
            int r1 = r0 + -1
            int r1 = r1 - r4
            java.lang.Object[] r0 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r5 = r0[r1]     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r5 instanceof X.C25488Cgj     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x126e
            X.Cgj r5 = (X.C25488Cgj) r5     // Catch:{ Da7 -> 0x1304 }
            X.E8A r0 = r5.A00     // Catch:{ Da7 -> 0x1304 }
            X.EDl r0 = (X.C28669EDl) r0     // Catch:{ Da7 -> 0x1304 }
            X.DNt r6 = r0.CQH()     // Catch:{ Da7 -> 0x1304 }
            r8 = 0
            java.lang.Object r7 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r7 instanceof java.util.List     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x0c8d
            java.util.List r7 = (java.util.List) r7     // Catch:{ Da7 -> 0x1304 }
            r1 = 32768(0x8000, float:4.5918E-41)
            int r1 = r1 - r2
            int r0 = r7.size()     // Catch:{ Da7 -> 0x1304 }
            if (r1 >= r0) goto L_0x0c87
            java.lang.String r0 = "too many arguments to bind"
            A0L(r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x0c87:
            int r1 = r7.size()     // Catch:{ Da7 -> 0x1304 }
            int r1 = r1 + r2
            goto L_0x0c91
        L_0x0c8d:
            if (r7 != 0) goto L_0x1267
            r7 = 0
            r1 = r2
        L_0x0c91:
            if (r1 == 0) goto L_0x100f
            java.lang.Object[] r0 = r6.A02     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x0c9f
            int r3 = r0.length     // Catch:{ Da7 -> 0x1304 }
            int r1 = r1 + r3
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Da7 -> 0x1304 }
            java.lang.System.arraycopy(r0, r10, r5, r10, r3)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x0ca2
        L_0x0c9f:
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Da7 -> 0x1304 }
            r3 = 0
        L_0x0ca2:
            if (r2 == 0) goto L_0x0caf
            int r0 = r11.A01     // Catch:{ Da7 -> 0x1304 }
            int r1 = r0 + -1
            int r1 = r1 - r2
            java.lang.Object[] r0 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            java.lang.System.arraycopy(r0, r1, r5, r3, r2)     // Catch:{ Da7 -> 0x1304 }
            int r3 = r3 + r2
        L_0x0caf:
            if (r7 == 0) goto L_0x0cc3
            int r2 = r7.size()     // Catch:{ Da7 -> 0x1304 }
        L_0x0cb5:
            if (r8 >= r2) goto L_0x0cc3
            int r1 = r3 + 1
            java.lang.Object r0 = r7.get(r8)     // Catch:{ Da7 -> 0x1304 }
            r5[r3] = r0     // Catch:{ Da7 -> 0x1304 }
            int r8 = r8 + 1
            r3 = r1
            goto L_0x0cb5
        L_0x0cc3:
            X.CRg r3 = r6.A00     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object[] r2 = r6.A03     // Catch:{ Da7 -> 0x1304 }
            X.COJ r0 = r6.A01     // Catch:{ Da7 -> 0x1304 }
            X.DNt r1 = new X.DNt     // Catch:{ Da7 -> 0x1304 }
            r1.<init>(r3, r0, r5, r2)     // Catch:{ Da7 -> 0x1304 }
            X.Cgj r0 = new X.Cgj     // Catch:{ Da7 -> 0x1304 }
            r0.<init>(r1)     // Catch:{ Da7 -> 0x1304 }
            r11.A08(r4, r0)     // Catch:{ Da7 -> 0x1304 }
            r11.A0T(r4)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0cdb:
            int r4 = X.BE6.A0G(r18)     // Catch:{ Da7 -> 0x1304 }
            int r0 = r11.A01     // Catch:{ Da7 -> 0x1304 }
            int r0 = r0 + -1
            int r0 = r0 - r4
            java.lang.Object[] r3 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r2 = r3[r0]     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r2 instanceof X.C25488Cgj     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x0cf3
            java.lang.String r0 = "op_call target is not a closure"
            A0M(r0, r2)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x0cf3:
            r1 = 4
            int r0 = r11.A00     // Catch:{ Da7 -> 0x1304 }
            int r0 = r0 - r1
            r1 = r3[r0]     // Catch:{ Da7 -> 0x1304 }
            r0 = r16
            A0I(r11, r2, r1, r4, r0)     // Catch:{ Da7 -> 0x1304 }
            A0E(r11)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0d03:
            short r2 = r18.getShort()     // Catch:{ Da7 -> 0x1304 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r1 = X.BE6.A0G(r18)     // Catch:{ Da7 -> 0x1304 }
            r0 = r17
            X.COJ r6 = r0.A01     // Catch:{ Da7 -> 0x1304 }
            r0 = r24
            java.lang.Object r2 = r0.A01(r2)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Da7 -> 0x1304 }
            int r5 = r1 + -1
            int r0 = r11.A01     // Catch:{ Da7 -> 0x1304 }
            int r3 = r0 + -1
            int r3 = r3 - r5
            java.lang.Object[] r0 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            java.lang.System.arraycopy(r0, r3, r4, r10, r1)     // Catch:{ Da7 -> 0x1304 }
            int r3 = r11.A02     // Catch:{ Da7 -> 0x1304 }
            r0 = r16
            r11.A02 = r0     // Catch:{ Da7 -> 0x1304 }
            r0 = r24
            X.CQO[] r5 = r0.A03     // Catch:{ Da7 -> 0x1304 }
            r0 = 2
            r0 = r5[r0]     // Catch:{ Da7 -> 0x1304 }
            int r0 = r0.A02     // Catch:{ Da7 -> 0x1304 }
            int r7 = r16 - r0
            r0 = r24
            java.util.Map r5 = r0.A02     // Catch:{ Da7 -> 0x1304 }
            if (r5 == 0) goto L_0x0d45
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ Da7 -> 0x1304 }
            r5.get(r0)     // Catch:{ Da7 -> 0x1304 }
        L_0x0d45:
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Da7 -> 0x1304 }
            X.CLc r0 = r11.A03     // Catch:{ DaA -> 0x12a6, Exception -> 0x1283 }
            java.util.List r5 = java.util.Arrays.asList(r4)     // Catch:{ DaA -> 0x12a6, Exception -> 0x1283 }
            X.CkC r4 = r0.A00     // Catch:{ DaA -> 0x12a6, Exception -> 0x1283 }
            if (r6 == 0) goto L_0x0d6d
            java.util.List r7 = r6.A01     // Catch:{ DaA -> 0x12a6, Exception -> 0x1283 }
            X.E9O r6 = r6.A00     // Catch:{ DaA -> 0x12a6, Exception -> 0x1283 }
            X.Boh r4 = (X.C23736Boh) r4     // Catch:{ DaA -> 0x12a6, Exception -> 0x1283 }
            if (r7 == 0) goto L_0x0d67
            java.util.List r0 = r4.A06     // Catch:{ DaA -> 0x12a6, Exception -> 0x1283 }
            boolean r0 = r7.equals(r0)     // Catch:{ DaA -> 0x12a6, Exception -> 0x1283 }
            if (r0 != 0) goto L_0x0d67
            boolean r0 = r7.isEmpty()     // Catch:{ DaA -> 0x12a6, Exception -> 0x1283 }
            if (r0 == 0) goto L_0x0d77
        L_0x0d67:
            if (r6 == 0) goto L_0x0d6d
            X.E9O r0 = r4.A02     // Catch:{ DaA -> 0x12a6, Exception -> 0x1283 }
            if (r6 != r0) goto L_0x0d77
        L_0x0d6d:
            X.9zJ r0 = new X.9zJ     // Catch:{ DaA -> 0x12a6, Exception -> 0x1283 }
            r0.<init>(r5)     // Catch:{ DaA -> 0x12a6, Exception -> 0x1283 }
            java.lang.Object r0 = r4.A04(r0, r2)     // Catch:{ DaA -> 0x12a6, Exception -> 0x1283 }
            goto L_0x0d7c
        L_0x0d77:
            X.Boh r4 = X.C23736Boh.A00(r6, r4, r7)     // Catch:{ DaA -> 0x12a6, Exception -> 0x1283 }
            goto L_0x0d6d
        L_0x0d7c:
            r11.A02 = r3     // Catch:{ Da7 -> 0x1304 }
            r11.A0T(r1)     // Catch:{ Da7 -> 0x1304 }
            r11.A08(r10, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0d86:
            int r0 = r11.A01     // Catch:{ Da7 -> 0x1304 }
            int r4 = r0 + -1
            int r1 = r4 - r3
            java.lang.Object[] r0 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r2 = r0[r1]     // Catch:{ Da7 -> 0x1304 }
            r1 = r0[r4]     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r2 instanceof java.lang.String     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x0dae
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x0dae
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Da7 -> 0x1304 }
            r0.append(r2)     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r1, r0)     // Catch:{ Da7 -> 0x1304 }
            r11.A08(r3, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x100f
        L_0x0dae:
            java.lang.String r1 = "+"
            r0 = 5
            r11.A09(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0db6:
            short r1 = r18.getShort()     // Catch:{ Da7 -> 0x1304 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            r0 = r24
            java.lang.Object r0 = r0.A01(r1)     // Catch:{ Da7 -> 0x1304 }
            A0H(r11, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0dc9:
            int r1 = r11.A01     // Catch:{ Da7 -> 0x1304 }
            int r8 = r1 + -1
            int r0 = r8 - r0
            java.lang.Object[] r1 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r6 = r1[r0]     // Catch:{ Da7 -> 0x1304 }
            r7 = r1[r8]     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r6 instanceof java.util.List     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x0de0
            java.lang.String r0 = "vector_resize 1st argument must be a vector"
            A0M(r0, r6)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x0de0:
            java.util.List r6 = (java.util.List) r6     // Catch:{ UnsupportedOperationException -> 0x0e1a }
            int r8 = r8 - r3
            r3 = r1[r8]     // Catch:{ UnsupportedOperationException -> 0x0e1a }
            java.lang.String r1 = "invalid vector_resize_length"
            r0 = 4194304(0x400000, float:5.877472E-39)
            int r3 = r11.A0R(r3, r1, r0)     // Catch:{ UnsupportedOperationException -> 0x0e1a }
            int r1 = r6.size()     // Catch:{ UnsupportedOperationException -> 0x0e1a }
            if (r3 <= r1) goto L_0x0e06
            boolean r0 = r6 instanceof java.util.ArrayList     // Catch:{ UnsupportedOperationException -> 0x0e1a }
            if (r0 == 0) goto L_0x0dfd
            r0 = r6
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ UnsupportedOperationException -> 0x0e1a }
            r0.ensureCapacity(r3)     // Catch:{ UnsupportedOperationException -> 0x0e1a }
        L_0x0dfd:
            r6.add(r7)     // Catch:{ UnsupportedOperationException -> 0x0e1a }
            int r1 = r1 + 1
            if (r3 > r1) goto L_0x0dfd
            goto L_0x0f4e
        L_0x0e06:
            if (r3 >= r1) goto L_0x0f4e
        L_0x0e08:
            int r1 = r1 + -1
            r6.remove(r1)     // Catch:{ UnsupportedOperationException -> 0x0e1a }
            if (r3 < r1) goto L_0x0e08
            boolean r0 = r6 instanceof java.util.ArrayList     // Catch:{ UnsupportedOperationException -> 0x0e1a }
            if (r0 == 0) goto L_0x0f4e
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ UnsupportedOperationException -> 0x0e1a }
            r6.trimToSize()     // Catch:{ UnsupportedOperationException -> 0x0e1a }
            goto L_0x0f4e
        L_0x0e1a:
            r3 = move-exception
            r0 = 32
            goto L_0x0f31
        L_0x0e1f:
            short r7 = r18.getShort()     // Catch:{ Da7 -> 0x1304 }
            r1 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r1
            int r1 = r11.A01     // Catch:{ Da7 -> 0x1304 }
            int r2 = r1 + -1
            java.lang.Object[] r1 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r6 = r1[r2]     // Catch:{ Da7 -> 0x1304 }
            int r2 = r2 - r3
            r2 = r1[r2]     // Catch:{ Da7 -> 0x1304 }
            r1 = 28
            java.util.Map r2 = A07(r2, r1)     // Catch:{ Da7 -> 0x1304 }
            r1 = r24
            java.lang.Object r1 = r1.A01(r7)     // Catch:{ UnsupportedOperationException -> 0x0e43 }
            r2.put(r1, r6)     // Catch:{ UnsupportedOperationException -> 0x0e43 }
            goto L_0x0f90
        L_0x0e43:
            r3 = move-exception
            r1 = 29
            goto L_0x0ecf
        L_0x0e48:
            short r5 = r18.getShort()     // Catch:{ Da7 -> 0x1304 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r0
            java.lang.Object r2 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            r0 = 26
            java.util.Map r4 = A07(r2, r0)     // Catch:{ Da7 -> 0x1304 }
            r0 = r24
            java.lang.Object r2 = r0.A01(r5)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r5 = r4.get(r2)     // Catch:{ Da7 -> 0x1304 }
            if (r5 != 0) goto L_0x0e7e
            boolean r0 = r4.containsKey(r2)     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x12a8
            r5 = 0
            goto L_0x0e7e
        L_0x0e6e:
            java.lang.Object r1 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x1111
            boolean r0 = X.AnonymousClass000.A1Y(r1)     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x0e83
            java.lang.Object r5 = A0A     // Catch:{ Da7 -> 0x1304 }
        L_0x0e7e:
            r11.A08(r10, r5)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0e83:
            java.lang.Object r5 = A0C     // Catch:{ Da7 -> 0x1304 }
            goto L_0x0e7e
        L_0x0e86:
            short r2 = r18.getShort()     // Catch:{ Da7 -> 0x1304 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            java.lang.Object r1 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            r0 = 26
            java.util.Map r1 = A07(r1, r0)     // Catch:{ Da7 -> 0x1304 }
            A0F(r11)     // Catch:{ Da7 -> 0x1304 }
            r0 = r24
            java.lang.Object r0 = r0.A01(r2)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r1.containsKey(r0)     // Catch:{ Da7 -> 0x1304 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Da7 -> 0x1304 }
            A0H(r11, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0eae:
            int r1 = r11.A01     // Catch:{ Da7 -> 0x1304 }
            int r6 = r1 + -1
            int r2 = r6 - r3
            java.lang.Object[] r1 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r3 = r1[r2]     // Catch:{ Da7 -> 0x1304 }
            r2 = r1[r6]     // Catch:{ Da7 -> 0x1304 }
            boolean r1 = r3 instanceof java.util.Map     // Catch:{ UnsupportedOperationException -> 0x0ecc }
            if (r1 == 0) goto L_0x0ec5
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ UnsupportedOperationException -> 0x0ecc }
            r3.remove(r2)     // Catch:{ UnsupportedOperationException -> 0x0ecc }
            goto L_0x0f90
        L_0x0ec5:
            java.lang.String r1 = "del_by_val 1st argument must be a map"
            A0M(r1, r3)     // Catch:{ UnsupportedOperationException -> 0x0ecc }
            r1 = 0
            throw r1     // Catch:{ UnsupportedOperationException -> 0x0ecc }
        L_0x0ecc:
            r3 = move-exception
            r1 = 25
        L_0x0ecf:
            if (r4 == r1) goto L_0x0f90
            goto L_0x12f4
        L_0x0ed3:
            int r1 = r11.A01     // Catch:{ Da7 -> 0x1304 }
            int r4 = r1 + -1
            int r2 = r4 - r3
            java.lang.Object[] r1 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r3 = r1[r2]     // Catch:{ Da7 -> 0x1304 }
            r2 = r1[r4]     // Catch:{ Da7 -> 0x1304 }
            boolean r1 = r3 instanceof java.util.List     // Catch:{ UnsupportedOperationException -> 0x12b9 }
            if (r1 == 0) goto L_0x12b2
            java.util.List r3 = (java.util.List) r3     // Catch:{ UnsupportedOperationException -> 0x12b9 }
            r3.add(r2)     // Catch:{ UnsupportedOperationException -> 0x12b9 }
            goto L_0x0f90
        L_0x0eea:
            int r1 = r11.A01     // Catch:{ Da7 -> 0x1304 }
            int r8 = r1 + -1
            int r0 = r8 - r0
            java.lang.Object[] r1 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r6 = r1[r0]     // Catch:{ Da7 -> 0x1304 }
            int r0 = r8 - r3
            r7 = r1[r0]     // Catch:{ Da7 -> 0x1304 }
            r3 = r1[r8]     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r6 instanceof java.util.Map     // Catch:{ UnsupportedOperationException -> 0x0f2e }
            if (r0 == 0) goto L_0x0f04
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ UnsupportedOperationException -> 0x0f2e }
            r6.put(r7, r3)     // Catch:{ UnsupportedOperationException -> 0x0f2e }
            goto L_0x0f4e
        L_0x0f04:
            boolean r0 = r6 instanceof java.util.List     // Catch:{ UnsupportedOperationException -> 0x0f2e }
            if (r0 == 0) goto L_0x0f1e
            java.util.List r6 = (java.util.List) r6     // Catch:{ UnsupportedOperationException -> 0x0f2e }
            java.lang.String r1 = "invalid put_by_val vector index"
            r0 = 4194303(0x3fffff, float:5.87747E-39)
            int r1 = r11.A0R(r7, r1, r0)     // Catch:{ UnsupportedOperationException -> 0x0f2e }
            int r0 = r6.size()     // Catch:{ UnsupportedOperationException -> 0x0f2e }
            if (r1 <= r0) goto L_0x0f24
            A0K(r9)     // Catch:{ UnsupportedOperationException -> 0x0f2e }
        L_0x0f1c:
            r0 = 0
            throw r0     // Catch:{ UnsupportedOperationException -> 0x0f2e }
        L_0x0f1e:
            java.lang.String r0 = "put_by_val 1st argument must be a container"
            A0M(r0, r6)     // Catch:{ UnsupportedOperationException -> 0x0f2e }
            goto L_0x0f1c
        L_0x0f24:
            if (r1 != r0) goto L_0x0f2a
            r6.add(r3)     // Catch:{ UnsupportedOperationException -> 0x0f2e }
            goto L_0x0f4e
        L_0x0f2a:
            r6.set(r1, r3)     // Catch:{ UnsupportedOperationException -> 0x0f2e }
            goto L_0x0f4e
        L_0x0f2e:
            r3 = move-exception
            r0 = 22
        L_0x0f31:
            if (r4 == r0) goto L_0x0f4e
            goto L_0x12f4
        L_0x0f35:
            r0 = 4
            int r1 = r11.A00     // Catch:{ Da7 -> 0x1304 }
            int r1 = r1 - r0
            java.lang.Object[] r0 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r1 = r0[r1]     // Catch:{ Da7 -> 0x1304 }
            r0 = r16
            A0I(r11, r2, r1, r4, r0)     // Catch:{ Da7 -> 0x1304 }
            A0E(r11)     // Catch:{ Da7 -> 0x1304 }
            int r2 = r12 + 1
            java.lang.Object r0 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            r11.A08(r2, r0)     // Catch:{ Da7 -> 0x1304 }
        L_0x0f4e:
            r11.A0T(r2)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0f53:
            int r1 = r11.A01     // Catch:{ Da7 -> 0x1304 }
            int r7 = r1 + -1
            int r1 = r7 - r0
            java.lang.Object[] r5 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r4 = r5[r1]     // Catch:{ Da7 -> 0x1304 }
            int r1 = r7 - r3
            r2 = r5[r1]     // Catch:{ Da7 -> 0x1304 }
            r5 = r5[r7]     // Catch:{ Da7 -> 0x1304 }
            boolean r1 = r4 instanceof java.util.Map     // Catch:{ Da7 -> 0x1304 }
            if (r1 == 0) goto L_0x0f76
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r1 = r4.get(r2)     // Catch:{ Da7 -> 0x1304 }
            if (r1 != 0) goto L_0x0f8d
            boolean r1 = r4.containsKey(r2)     // Catch:{ Da7 -> 0x1304 }
            if (r1 == 0) goto L_0x0f96
            goto L_0x0f95
        L_0x0f76:
            boolean r1 = r4 instanceof java.util.List     // Catch:{ Da7 -> 0x1304 }
            if (r1 == 0) goto L_0x12bb
            java.util.List r4 = (java.util.List) r4     // Catch:{ Da7 -> 0x1304 }
            r1 = 4194303(0x3fffff, float:5.87747E-39)
            int r2 = r11.A0R(r2, r6, r1)     // Catch:{ Da7 -> 0x1304 }
            int r1 = r4.size()     // Catch:{ Da7 -> 0x1304 }
            if (r2 >= r1) goto L_0x0f96
            java.lang.Object r1 = r4.get(r2)     // Catch:{ Da7 -> 0x1304 }
        L_0x0f8d:
            r11.A08(r0, r1)     // Catch:{ Da7 -> 0x1304 }
        L_0x0f90:
            r11.A0T(r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x0f95:
            r5 = 0
        L_0x0f96:
            r1 = r5
            goto L_0x0f8d
        L_0x0f98:
            int r0 = r11.A01     // Catch:{ Da7 -> 0x1304 }
            int r4 = r0 + -1
            int r2 = r4 - r3
            java.lang.Object[] r0 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r2 = r0[r2]     // Catch:{ Da7 -> 0x1304 }
            r4 = r0[r4]     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r2 instanceof java.util.Map     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x0fb8
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ Da7 -> 0x1304 }
            java.lang.Object r0 = r2.get(r4)     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x0fcf
            boolean r0 = r2.containsKey(r4)     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x12c7
            r0 = 0
            goto L_0x0fcf
        L_0x0fb8:
            boolean r0 = r2 instanceof java.util.List     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x0fd3
            java.util.List r2 = (java.util.List) r2     // Catch:{ Da7 -> 0x1304 }
            r0 = 4194303(0x3fffff, float:5.87747E-39)
            int r1 = r11.A0R(r4, r6, r0)     // Catch:{ Da7 -> 0x1304 }
            int r0 = r2.size()     // Catch:{ Da7 -> 0x1304 }
            if (r1 >= r0) goto L_0x12d1
            java.lang.Object r0 = r2.get(r1)     // Catch:{ Da7 -> 0x1304 }
        L_0x0fcf:
            r11.A08(r3, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x100f
        L_0x0fd3:
            boolean r0 = r2 instanceof java.lang.String     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x12db
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r1 = "invalid get_by_val string index"
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r11.A0R(r4, r1, r0)     // Catch:{ Da7 -> 0x1304 }
            int r0 = r2.length()     // Catch:{ Da7 -> 0x1304 }
            if (r1 >= r0) goto L_0x12d5
            char r0 = r2.charAt(r1)     // Catch:{ Da7 -> 0x1304 }
            double r0 = (double) r0     // Catch:{ Da7 -> 0x1304 }
            java.lang.Number r0 = X.C25343Ce2.A00(r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x0fcf
        L_0x0ff2:
            int r0 = r11.A01     // Catch:{ Da7 -> 0x1304 }
            int r4 = r0 + -1
            int r1 = r4 - r3
            java.lang.Object[] r0 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r2 = r0[r1]     // Catch:{ Da7 -> 0x1304 }
            r1 = r0[r4]     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r2 instanceof java.util.Map     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x1014
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r2.containsKey(r1)     // Catch:{ Da7 -> 0x1304 }
        L_0x1008:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Da7 -> 0x1304 }
            r11.A08(r3, r0)     // Catch:{ Da7 -> 0x1304 }
        L_0x100f:
            A0F(r11)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x1014:
            boolean r0 = r2 instanceof java.util.List     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x12e7
            java.util.List r2 = (java.util.List) r2     // Catch:{ Da7 -> 0x1304 }
            r0 = 4194303(0x3fffff, float:5.87747E-39)
            int r1 = r11.A0R(r1, r6, r0)     // Catch:{ Da7 -> 0x1304 }
            int r0 = r2.size()     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            goto L_0x1008
        L_0x102a:
            java.lang.Object r1 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r1 instanceof java.util.List     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x103d
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ Da7 -> 0x1304 }
            java.util.List r1 = X.AnonymousClass8BU.A0y(r1)     // Catch:{ Da7 -> 0x1304 }
        L_0x1038:
            r11.A08(r10, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x103d:
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x104c
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ Da7 -> 0x1304 }
            java.util.HashMap r0 = X.BE6.A10(r1)     // Catch:{ Da7 -> 0x1304 }
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1038
        L_0x104c:
            if (r1 == 0) goto L_0x1038
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x1038
            boolean r0 = r1 instanceof java.lang.Number     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x1038
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x1038
            boolean r0 = r1 instanceof X.C25488Cgj     // Catch:{ Da7 -> 0x1304 }
            if (r0 != 0) goto L_0x1038
            java.lang.String r0 = "argument of immutable_clone cannot be a host ref"
            A0M(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x1065:
            java.lang.Object r1 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r1 instanceof java.util.List     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x1078
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ Da7 -> 0x1304 }
            java.util.ArrayList r0 = X.C17880vN.A10(r1)     // Catch:{ Da7 -> 0x1304 }
        L_0x1073:
            r11.A08(r10, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x1078:
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x12ed
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ Da7 -> 0x1304 }
            java.util.HashMap r0 = X.BE6.A10(r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1073
        L_0x1083:
            java.lang.Object[] r5 = A0Q(r11)     // Catch:{ Da7 -> 0x1304 }
            if (r5 == 0) goto L_0x10ad
            int r3 = r5.length     // Catch:{ Da7 -> 0x1304 }
        L_0x108a:
            int r1 = r11.A00     // Catch:{ Da7 -> 0x1304 }
            int r1 = r1 - r2
            int[] r0 = r11.A04     // Catch:{ Da7 -> 0x1304 }
            r2 = r0[r1]     // Catch:{ Da7 -> 0x1304 }
            int r0 = r3 + r2
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ Da7 -> 0x1304 }
            if (r5 == 0) goto L_0x109a
            java.lang.System.arraycopy(r5, r10, r4, r10, r3)     // Catch:{ Da7 -> 0x1304 }
        L_0x109a:
            int r1 = r11.A00     // Catch:{ Da7 -> 0x1304 }
            int r0 = r2 + -1
            int r0 = r0 + 5
            int r1 = r1 - r0
            java.lang.Object[] r0 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            java.lang.System.arraycopy(r0, r1, r4, r3, r2)     // Catch:{ Da7 -> 0x1304 }
            int r3 = r4.length     // Catch:{ Da7 -> 0x1304 }
            java.util.ArrayList r2 = X.C17880vN.A0z(r3)     // Catch:{ Da7 -> 0x1304 }
            r1 = 0
            goto L_0x10af
        L_0x10ad:
            r3 = 0
            goto L_0x108a
        L_0x10af:
            if (r1 >= r3) goto L_0x10b9
            r0 = r4[r1]     // Catch:{ Da7 -> 0x1304 }
            r2.add(r0)     // Catch:{ Da7 -> 0x1304 }
            int r1 = r1 + 1
            goto L_0x10af
        L_0x10b9:
            A0H(r11, r2)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x10bd:
            java.lang.Object[] r0 = A0Q(r11)     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x10d5
            int r3 = r0.length     // Catch:{ Da7 -> 0x1304 }
        L_0x10c4:
            int r1 = r11.A00     // Catch:{ Da7 -> 0x1304 }
            int r1 = r1 - r2
            int[] r0 = r11.A04     // Catch:{ Da7 -> 0x1304 }
            r0 = r0[r1]     // Catch:{ Da7 -> 0x1304 }
            int r3 = r3 + r0
            double r0 = (double) r3     // Catch:{ Da7 -> 0x1304 }
            java.lang.Number r0 = X.C25343Ce2.A00(r0)     // Catch:{ Da7 -> 0x1304 }
            A0H(r11, r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1111
        L_0x10d5:
            r3 = 0
            goto L_0x10c4
        L_0x10d7:
            short r5 = r18.getShort()     // Catch:{ Da7 -> 0x1304 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r0
            int r6 = X.BE6.A0G(r18)     // Catch:{ Da7 -> 0x1304 }
            r0 = r17
            java.lang.Object[] r4 = r0.A03     // Catch:{ Da7 -> 0x1304 }
            X.COJ r3 = r0.A01     // Catch:{ Da7 -> 0x1304 }
            if (r6 != 0) goto L_0x10ed
            r2 = 0
            goto L_0x10fe
        L_0x10ed:
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ Da7 -> 0x1304 }
            int r7 = r6 + -1
            int r0 = r11.A01     // Catch:{ Da7 -> 0x1304 }
            int r1 = r0 + -1
            int r1 = r1 - r7
            java.lang.Object[] r0 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            java.lang.System.arraycopy(r0, r1, r2, r10, r6)     // Catch:{ Da7 -> 0x1304 }
            r11.A0T(r6)     // Catch:{ Da7 -> 0x1304 }
        L_0x10fe:
            r0 = r24
            X.CRg r0 = r0.A00(r5)     // Catch:{ Da7 -> 0x1304 }
            X.DNt r1 = new X.DNt     // Catch:{ Da7 -> 0x1304 }
            r1.<init>(r0, r3, r2, r4)     // Catch:{ Da7 -> 0x1304 }
            X.Cgj r0 = new X.Cgj     // Catch:{ Da7 -> 0x1304 }
            r0.<init>(r1)     // Catch:{ Da7 -> 0x1304 }
            A0H(r11, r0)     // Catch:{ Da7 -> 0x1304 }
        L_0x1111:
            r3 = 1
            r0 = 2
            goto L_0x004b
        L_0x1115:
            java.lang.Object r3 = X.BE8.A0c(r11)     // Catch:{ Da7 -> 0x1304 }
            boolean r0 = r3 instanceof java.lang.String     // Catch:{ Da7 -> 0x1304 }
            if (r0 == 0) goto L_0x1130
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Da7 -> 0x1304 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = "UserError: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)     // Catch:{ Da7 -> 0x1304 }
            X.Da7 r1 = new X.Da7     // Catch:{ Da7 -> 0x1304 }
            r1.<init>(r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1303
        L_0x1130:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = "Expected stack value of string type for opcode "
            r2.append(r0)     // Catch:{ Da7 -> 0x1304 }
            r1 = 12
            java.lang.String[] r0 = X.CFx.A00     // Catch:{ Da7 -> 0x1304 }
            r0 = r0[r1]     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)     // Catch:{ Da7 -> 0x1304 }
            A0M(r0, r3)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x1148:
            int r5 = r11.A01     // Catch:{ Da7 -> 0x1304 }
            int r0 = r5 + -1
            java.lang.Object[] r6 = r11.A05     // Catch:{ Da7 -> 0x1304 }
            r4 = r6[r0]     // Catch:{ Da7 -> 0x1304 }
            int r3 = r11.A00     // Catch:{ Da7 -> 0x1304 }
            int r0 = r3 - r2
            int[] r1 = r11.A04     // Catch:{ Da7 -> 0x1304 }
            r2 = r1[r0]     // Catch:{ Da7 -> 0x1304 }
            int r0 = r2 + 1
            int r0 = r0 + -1
            int r0 = r0 + 5
            int r0 = r3 - r0
            r6[r0] = r4     // Catch:{ Da7 -> 0x1304 }
            r1 = r1[r3]     // Catch:{ Da7 -> 0x1304 }
            int r0 = r3 + 1
            int r0 = r0 + -5
            int r0 = r0 - r2
            int r5 = r5 - r0
            r11.A0T(r5)     // Catch:{ Da7 -> 0x1304 }
            r11.A00 = r1     // Catch:{ Da7 -> 0x1304 }
            return
        L_0x1170:
            java.lang.String r0 = "INT64_NOT operand must be numeric"
            A0M(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x1177:
            java.lang.String r0 = "INT64_NEG operand must be numeric"
            A0M(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x117e:
            java.lang.String r0 = "BIN_NOT operand must be numeric"
            A0M(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x1185:
            java.lang.String r0 = "NEG operand must be numeric"
            A0M(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x118c:
            java.lang.String r0 = "TRUNC operand must be numeric"
            A0M(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x1193:
            java.lang.String r0 = "TO_UINT32 operand must be numeric"
            A0M(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x119a:
            java.lang.String r0 = "CHR16 operand must be numeric"
            A0M(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x11a1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = "Type assertion failed. Expected "
            r1.append(r0)     // Catch:{ Da7 -> 0x1304 }
            r1.append(r4)     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = ", got "
            r1.append(r0)     // Catch:{ Da7 -> 0x1304 }
            if (r3 != 0) goto L_0x11b5
            goto L_0x11ba
        L_0x11b5:
            java.lang.String r0 = X.C17890vO.A0U(r3)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x11bc
        L_0x11ba:
            java.lang.String r0 = "null"
        L_0x11bc:
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            A0L(r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x11c5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = "InvalidBytecode: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ Da7 -> 0x1304 }
            X.DaA r1 = new X.DaA     // Catch:{ Da7 -> 0x1304 }
            r1.<init>((java.lang.String) r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1303
        L_0x11d6:
            java.lang.String r0 = "get_element_count argument must be a container or string"
            A0M(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x11dd:
            java.lang.String r0 = "too many arguments to apply"
            A0L(r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x11e4:
            java.lang.String r0 = "last apply() argument must be a vector or undefined"
            A0M(r0, r7)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x11eb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = "Expected stack value of closure type for opcode "
            r1.append(r0)     // Catch:{ Da7 -> 0x1304 }
            java.lang.String[] r0 = X.CFx.A00     // Catch:{ Da7 -> 0x1304 }
            r0 = r0[r3]     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            A0M(r0, r2)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x1201:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = "invalid runtime function index "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r3)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x123a
        L_0x120c:
            r3 = move-exception
            java.lang.String r2 = "ArrayCopy dst must be mutable"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = "TypeError: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ Da7 -> 0x1304 }
            X.Da7 r1 = new X.Da7     // Catch:{ Da7 -> 0x1304 }
            r1.<init>(r0, r3)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1303
        L_0x1220:
            java.lang.String r0 = "ArrayCopy length out of range"
            goto L_0x123a
        L_0x1223:
            java.lang.String r0 = "ArrayCopy dst index out of range"
            goto L_0x123a
        L_0x1226:
            java.lang.String r0 = "ArrayCopy src index out of range"
            goto L_0x123a
        L_0x1229:
            java.lang.String r0 = "StringSearch length out of range"
            goto L_0x123a
        L_0x122c:
            java.lang.String r0 = "StringSearch offset out of range"
            goto L_0x123a
        L_0x122f:
            java.lang.String r0 = "SubstringCompare length out of range"
            goto L_0x123a
        L_0x1232:
            java.lang.String r0 = "SubstringCompare offset out of range"
            goto L_0x123a
        L_0x1235:
            java.lang.String r0 = "Substring offset out of range"
            goto L_0x123a
        L_0x1238:
            java.lang.String r0 = "Substring length out of range"
        L_0x123a:
            A0K(r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x123f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = "Unsupported opcode "
            r1.append(r0)     // Catch:{ Da7 -> 0x1304 }
            java.lang.String[] r0 = X.CFx.A00     // Catch:{ Da7 -> 0x1304 }
            r0 = r0[r4]     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r4 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Da7 -> 0x1304 }
        L_0x1250:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = "InvalidBytecode: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r4, r1)     // Catch:{ Da7 -> 0x1304 }
            X.DaA r1 = new X.DaA     // Catch:{ Da7 -> 0x1304 }
            r1.<init>((java.lang.String) r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1303
        L_0x1261:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1303
        L_0x1267:
            java.lang.String r0 = "last bind() operand must be a vector or undefined"
            A0M(r0, r7)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x126e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = "Expected stack value of closure type for opcode "
            r1.append(r0)     // Catch:{ Da7 -> 0x1304 }
            java.lang.String[] r0 = X.CFx.A00     // Catch:{ Da7 -> 0x1304 }
            r0 = r0[r3]     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Da7 -> 0x1304 }
            A0M(r0, r5)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x1283:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = "extension '"
            r1.append(r0)     // Catch:{ Da7 -> 0x1304 }
            r1.append(r2)     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = "' threw an exception: "
            java.lang.String r2 = X.C17900vP.A0C(r0, r1, r3)     // Catch:{ Da7 -> 0x1304 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = "UserError: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ Da7 -> 0x1304 }
            X.Da7 r1 = new X.Da7     // Catch:{ Da7 -> 0x1304 }
            r1.<init>(r0, r3)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x1303
        L_0x12a6:
            r1 = move-exception
            goto L_0x1303
        L_0x12a8:
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = X.AnonymousClass8BS.A0l(r2, r1, r0, r10)     // Catch:{ Da7 -> 0x1304 }
            A0K(r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x12b2:
            java.lang.String r0 = "vector_append 1st argument must be a vector"
            A0M(r0, r3)     // Catch:{ UnsupportedOperationException -> 0x12b9 }
            r0 = 0
            throw r0     // Catch:{ UnsupportedOperationException -> 0x12b9 }
        L_0x12b9:
            r3 = move-exception
            goto L_0x12f4
        L_0x12bb:
            java.lang.String r1 = "get_by_val_or 1st argument must be a container for key %s"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = X.AnonymousClass8BS.A0l(r2, r1, r0, r10)     // Catch:{ Da7 -> 0x1304 }
            A0M(r0, r4)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x12c7:
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = X.AnonymousClass8BS.A0l(r4, r1, r0, r10)     // Catch:{ Da7 -> 0x1304 }
            A0K(r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x12d1:
            A0K(r9)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x12d5:
            java.lang.String r0 = "string index out of range"
            A0K(r0)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x12db:
            java.lang.String r1 = "get_by_val 1st argument must be a container for key %s"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = X.AnonymousClass8BS.A0l(r4, r1, r0, r10)     // Catch:{ Da7 -> 0x1304 }
            A0M(r0, r2)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x12e7:
            java.lang.String r0 = "in_by_val 2nd argument must be a container"
            A0M(r0, r2)     // Catch:{ Da7 -> 0x1304 }
            goto L_0x12f2
        L_0x12ed:
            java.lang.String r0 = "argument of container_clone must be a container"
            A0M(r0, r1)     // Catch:{ Da7 -> 0x1304 }
        L_0x12f2:
            r1 = 0
            goto L_0x1303
        L_0x12f4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Da7 -> 0x1304 }
            java.lang.String r0 = "TypeError: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r5, r1)     // Catch:{ Da7 -> 0x1304 }
            X.Da7 r1 = new X.Da7     // Catch:{ Da7 -> 0x1304 }
            r1.<init>(r0, r3)     // Catch:{ Da7 -> 0x1304 }
        L_0x1303:
            throw r1     // Catch:{ Da7 -> 0x1304 }
        L_0x1304:
            r3 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            int r2 = r11.A00
            int r1 = r2 + -4
            java.lang.Object[] r0 = r11.A05
            r0 = r0[r1]
            X.Cgj r0 = (X.C25488Cgj) r0
            X.E8A r0 = r0.A00
            X.EDl r0 = (X.C28669EDl) r0
            X.DNt r1 = r0.CQH()
            r0 = r16
            A0D(r1, r5, r0, r10)
        L_0x1320:
            int[] r1 = r11.A04
            r4 = r1[r2]
            if (r4 != 0) goto L_0x1373
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r0 = "mins stack trace:\n"
            r6.append(r0)
            int r2 = r11.A00
            int r1 = r2 + -4
            java.lang.Object[] r0 = r11.A05
            r0 = r0[r1]
            X.Cgj r0 = (X.C25488Cgj) r0
            X.E8A r0 = r0.A00
            X.EDl r0 = (X.C28669EDl) r0
            X.DNt r1 = r0.CQH()
            r0 = r16
            A0C(r1, r6, r0)
        L_0x134a:
            int[] r1 = r11.A04
            r4 = r1[r2]
            if (r4 != 0) goto L_0x135a
            java.lang.String r0 = r6.toString()
            X.DaA r1 = new X.DaA
            r1.<init>(r5, r0, r3)
            throw r1
        L_0x135a:
            int r0 = r2 + -1
            r2 = r1[r0]
            int r1 = r4 + -4
            java.lang.Object[] r0 = r11.A05
            r0 = r0[r1]
            X.Cgj r0 = (X.C25488Cgj) r0
            X.E8A r0 = r0.A00
            X.EDl r0 = (X.C28669EDl) r0
            X.DNt r0 = r0.CQH()
            A0C(r0, r6, r2)
            r2 = r4
            goto L_0x134a
        L_0x1373:
            int r0 = r2 + -1
            r2 = r1[r0]
            int r1 = r4 + -4
            java.lang.Object[] r0 = r11.A05
            r0 = r0[r1]
            X.Cgj r0 = (X.C25488Cgj) r0
            X.E8A r0 = r0.A00
            X.EDl r0 = (X.C28669EDl) r0
            X.DNt r1 = r0.CQH()
            r0 = 1
            A0D(r1, r5, r2, r0)
            r2 = r4
            goto L_0x1320
        L_0x138d:
            r0 = 0
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26299CxC.A0E(X.CxC):void");
    }
}
