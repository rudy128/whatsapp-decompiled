package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.CoL  reason: case insensitive filesystem */
public abstract class C25907CoL {
    public static final char[] A00;

    static {
        char[] cArr = new char[80];
        A00 = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x00b5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C28454E1u r17, java.lang.StringBuilder r18, int r19) {
        /*
            r12 = r17
            java.util.HashSet r11 = X.C17880vN.A12()
            java.util.HashMap r10 = X.C17880vN.A11()
            java.util.TreeMap r9 = new java.util.TreeMap
            r9.<init>()
            java.lang.Class r0 = r12.getClass()
            java.lang.reflect.Method[] r5 = r0.getDeclaredMethods()
            int r4 = r5.length
            r8 = 0
            r2 = 0
        L_0x001a:
            java.lang.String r7 = "get"
            java.lang.String r6 = "has"
            java.lang.String r3 = "set"
            r1 = 3
            if (r2 >= r4) goto L_0x005e
            r6 = r5[r2]
            int r0 = r6.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = r6.getName()
            int r0 = r0.length()
            if (r0 < r1) goto L_0x004a
            java.lang.String r0 = r6.getName()
            boolean r0 = r0.startsWith(r3)
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = r6.getName()
            r11.add(r0)
        L_0x004a:
            int r2 = r2 + 1
            goto L_0x001a
        L_0x004d:
            boolean r0 = X.BE7.A1Y(r6)
            if (r0 == 0) goto L_0x004a
            java.lang.Class[] r0 = r6.getParameterTypes()
            int r0 = r0.length
            if (r0 != 0) goto L_0x004a
            X.BEB.A1P(r6, r10, r9)
            goto L_0x004a
        L_0x005e:
            java.util.Iterator r17 = X.C17890vO.A0i(r9)
        L_0x0062:
            boolean r0 = r17.hasNext()
            r5 = r18
            r4 = r19
            if (r0 == 0) goto L_0x0195
            java.util.Map$Entry r14 = X.AnonymousClass000.A16(r17)
            java.lang.String r0 = X.C17880vN.A0x(r14)
            java.lang.String r2 = r0.substring(r1)
            java.lang.String r1 = "List"
            boolean r0 = r2.endsWith(r1)
            if (r0 == 0) goto L_0x00b7
            java.lang.String r0 = "OrBuilderList"
            boolean r0 = r2.endsWith(r0)
            if (r0 != 0) goto L_0x00b7
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L_0x00b7
            java.lang.Object r1 = r14.getValue()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 == 0) goto L_0x00b7
            java.lang.Class r13 = r1.getReturnType()
            java.lang.Class<java.util.List> r0 = java.util.List.class
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x00b7
            int r0 = r2.length()
            int r0 = r0 + -4
        L_0x00a8:
            java.lang.String r2 = r2.substring(r8, r0)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Object r0 = X.C23267BeH.A00(r1, r12, r0)
            A01(r5, r4, r2, r0)
        L_0x00b5:
            r1 = 3
            goto L_0x0062
        L_0x00b7:
            java.lang.String r1 = "Map"
            boolean r0 = r2.endsWith(r1)
            if (r0 == 0) goto L_0x00ee
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L_0x00ee
            java.lang.Object r1 = r14.getValue()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 == 0) goto L_0x00ee
            java.lang.Class r13 = r1.getReturnType()
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x00ee
            java.lang.Class<java.lang.Deprecated> r0 = java.lang.Deprecated.class
            boolean r0 = r1.isAnnotationPresent(r0)
            if (r0 != 0) goto L_0x00ee
            boolean r0 = X.BE7.A1Y(r1)
            if (r0 == 0) goto L_0x00ee
            int r0 = r2.length()
            int r0 = r0 + -3
            goto L_0x00a8
        L_0x00ee:
            java.lang.String r0 = X.BE7.A0m(r3, r2)
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = "Bytes"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L_0x0114
            int r0 = r2.length()
            int r0 = r0 + -5
            java.lang.String r0 = r2.substring(r8, r0)
            java.lang.String r0 = X.BE7.A0m(r7, r0)
            boolean r0 = r9.containsKey(r0)
            if (r0 != 0) goto L_0x00b5
        L_0x0114:
            java.lang.Object r1 = r14.getValue()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r0 = X.BE7.A0m(r6, r2)
            java.lang.Object r13 = r10.get(r0)
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r1 == 0) goto L_0x00b5
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Object r1 = X.C23267BeH.A00(r1, r12, r0)
            if (r13 != 0) goto L_0x018e
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x013e
            r0 = r1
        L_0x0133:
            boolean r0 = X.AnonymousClass000.A1Y(r0)
        L_0x0137:
            if (r0 == 0) goto L_0x00b5
        L_0x0139:
            A01(r5, r4, r2, r1)
            goto L_0x00b5
        L_0x013e:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0147
            int r0 = X.AnonymousClass000.A0M(r1)
            goto L_0x0137
        L_0x0147:
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x0154
            float r0 = X.AnonymousClass000.A04(r1)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            goto L_0x0137
        L_0x0154:
            boolean r0 = r1 instanceof java.lang.Double
            if (r0 == 0) goto L_0x0165
            double r13 = X.AnonymousClass8BR.A00(r1)
            long r15 = java.lang.Double.doubleToRawLongBits(r13)
            r13 = 0
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            goto L_0x0137
        L_0x0165:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0172
            java.lang.String r0 = ""
        L_0x016b:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00b5
            goto L_0x0139
        L_0x0172:
            boolean r0 = r1 instanceof X.DSN
            if (r0 == 0) goto L_0x0179
            X.DSN r0 = X.DSN.A00
            goto L_0x016b
        L_0x0179:
            boolean r0 = r1 instanceof X.C28454E1u
            if (r0 == 0) goto L_0x0182
            X.BeN r0 = X.C23273BeN.zzb
            if (r1 == r0) goto L_0x00b5
            goto L_0x0139
        L_0x0182:
            boolean r0 = r1 instanceof java.lang.Enum
            if (r0 == 0) goto L_0x0139
            r0 = r1
            java.lang.Enum r0 = (java.lang.Enum) r0
            int r0 = r0.ordinal()
            goto L_0x0137
        L_0x018e:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Object r0 = X.C23267BeH.A00(r13, r12, r0)
            goto L_0x0133
        L_0x0195:
            X.BeH r12 = (X.C23267BeH) r12
            X.Csz r3 = r12.zzc
            if (r3 == 0) goto L_0x01b4
            r2 = 0
        L_0x019c:
            int r0 = r3.A00
            if (r2 >= r0) goto L_0x01b4
            int[] r0 = r3.A02
            r0 = r0[r2]
            int r0 = r0 >>> 3
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.Object[] r0 = r3.A03
            r0 = r0[r2]
            A01(r5, r4, r1, r0)
            int r2 = r2 + 1
            goto L_0x019c
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25907CoL.A00(X.E1u, java.lang.StringBuilder, int):void");
    }

    public static void A01(StringBuilder sb, int i, String str, Object obj) {
        String A002;
        if (obj instanceof List) {
            Iterator A13 = AnonymousClass8BR.A13(obj);
            while (A13.hasNext()) {
                A01(sb, i, str, A13.next());
            }
        } else if (obj instanceof Map) {
            Iterator A15 = AnonymousClass000.A15((Map) obj);
            while (A15.hasNext()) {
                A01(sb, i, str, A15.next());
            }
        } else {
            sb.append(10);
            int i2 = i;
            while (i2 > 0) {
                int i3 = 80;
                if (i2 <= 80) {
                    i3 = i2;
                }
                sb.append(A00, 0, i3);
                i2 -= i3;
            }
            if (!str.isEmpty()) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(Character.toLowerCase(BE7.A00(str)));
                for (int i4 = 1; i4 < str.length(); i4++) {
                    A10.append(Character.toLowerCase(BEA.A00(str, A10, i4)));
                }
                str = A10.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                DSN dsn = DSN.A00;
                A002 = CB5.A00(new C23271BeL(((String) obj).getBytes(CI7.A03)));
            } else if (obj instanceof DSN) {
                sb.append(": \"");
                A002 = CB5.A00((DSN) obj);
            } else {
                if (obj instanceof C23267BeH) {
                    sb.append(" {");
                    A00((DJN) obj, sb, i + 2);
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i5 = i + 2;
                    A01(sb, i5, "key", entry.getKey());
                    A01(sb, i5, "value", entry.getValue());
                } else {
                    sb.append(": ");
                    sb.append(obj);
                    return;
                }
                sb.append("\n");
                while (i > 0) {
                    int i6 = 80;
                    if (i <= 80) {
                        i6 = i;
                    }
                    sb.append(A00, 0, i6);
                    i -= i6;
                }
                sb.append("}");
                return;
            }
            sb.append(A002);
            sb.append('\"');
        }
    }
}
