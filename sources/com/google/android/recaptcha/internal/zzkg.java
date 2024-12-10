package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass8BR;
import X.BE7;
import X.BEA;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class zzkg {
    public static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void zzb(StringBuilder sb, int i, String str, Object obj) {
        String zza2;
        if (obj instanceof List) {
            Iterator A13 = AnonymousClass8BR.A13(obj);
            while (A13.hasNext()) {
                zzb(sb, i, str, A13.next());
            }
        } else if (obj instanceof Map) {
            Iterator A15 = AnonymousClass000.A15((Map) obj);
            while (A15.hasNext()) {
                zzb(sb, i, str, A15.next());
            }
        } else {
            sb.append(10);
            zzc(i, sb);
            if (!str.isEmpty()) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(Character.toLowerCase(BE7.A00(str)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    A10.append(Character.toLowerCase(BEA.A00(str, A10, i2)));
                }
                str = A10.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                Comparator comparator = zzgw.zza;
                zza2 = zzlg.zza(new zzgt(((String) obj).getBytes(zzjc.zzb)));
            } else if (obj instanceof zzgw) {
                sb.append(": \"");
                zza2 = zzlg.zza((zzgw) obj);
            } else {
                if (obj instanceof zzit) {
                    sb.append(" {");
                    zzd((zzgf) obj, sb, i + 2);
                } else if (obj instanceof Map.Entry) {
                    int i3 = i + 2;
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    zzb(sb, i3, "key", entry.getKey());
                    zzb(sb, i3, "value", entry.getValue());
                } else {
                    sb.append(": ");
                    sb.append(obj);
                    return;
                }
                sb.append("\n");
                zzc(i, sb);
                sb.append("}");
                return;
            }
            sb.append(zza2);
            sb.append('\"');
        }
    }

    public static void zzc(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x00b5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void zzd(com.google.android.recaptcha.internal.zzke r17, java.lang.StringBuilder r18, int r19) {
        /*
            r6 = r17
            java.util.HashSet r12 = X.C17880vN.A12()
            java.util.HashMap r11 = X.C17880vN.A11()
            java.util.TreeMap r10 = new java.util.TreeMap
            r10.<init>()
            java.lang.Class r0 = r6.getClass()
            java.lang.reflect.Method[] r5 = r0.getDeclaredMethods()
            int r4 = r5.length
            r9 = 0
            r2 = 0
        L_0x001a:
            java.lang.String r8 = "get"
            java.lang.String r7 = "has"
            java.lang.String r3 = "set"
            r1 = 3
            if (r2 >= r4) goto L_0x005e
            r7 = r5[r2]
            int r0 = r7.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = r7.getName()
            int r0 = r0.length()
            if (r0 < r1) goto L_0x004a
            java.lang.String r0 = r7.getName()
            boolean r0 = r0.startsWith(r3)
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = r7.getName()
            r12.add(r0)
        L_0x004a:
            int r2 = r2 + 1
            goto L_0x001a
        L_0x004d:
            boolean r0 = X.BE7.A1Y(r7)
            if (r0 == 0) goto L_0x004a
            java.lang.Class[] r0 = r7.getParameterTypes()
            int r0 = r0.length
            if (r0 != 0) goto L_0x004a
            X.BEB.A1P(r7, r11, r10)
            goto L_0x004a
        L_0x005e:
            java.util.Iterator r17 = X.C17890vO.A0i(r10)
        L_0x0062:
            boolean r0 = r17.hasNext()
            r5 = r18
            r4 = r19
            if (r0 == 0) goto L_0x019a
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
            java.lang.String r2 = r2.substring(r9, r0)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzit.zzz(r1, r6, r0)
            zzb(r5, r4, r2, r0)
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
            boolean r0 = r12.contains(r0)
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = "Bytes"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L_0x0114
            int r0 = r2.length()
            int r0 = r0 + -5
            java.lang.String r0 = r2.substring(r9, r0)
            java.lang.String r0 = X.BE7.A0m(r8, r0)
            boolean r0 = r10.containsKey(r0)
            if (r0 != 0) goto L_0x00b5
        L_0x0114:
            java.lang.Object r1 = r14.getValue()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r0 = X.BE7.A0m(r7, r2)
            java.lang.Object r13 = r11.get(r0)
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r1 == 0) goto L_0x00b5
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Object r1 = com.google.android.recaptcha.internal.zzit.zzz(r1, r6, r0)
            if (r13 != 0) goto L_0x0193
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x013e
            r0 = r1
        L_0x0133:
            boolean r0 = X.AnonymousClass000.A1Y(r0)
        L_0x0137:
            if (r0 == 0) goto L_0x00b5
        L_0x0139:
            zzb(r5, r4, r2, r1)
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
            boolean r0 = r1 instanceof com.google.android.recaptcha.internal.zzgw
            if (r0 == 0) goto L_0x0179
            com.google.android.recaptcha.internal.zzgw r0 = com.google.android.recaptcha.internal.zzgw.zzb
            goto L_0x016b
        L_0x0179:
            boolean r0 = r1 instanceof com.google.android.recaptcha.internal.zzke
            if (r0 == 0) goto L_0x0187
            r0 = r1
            com.google.android.recaptcha.internal.zzkf r0 = (com.google.android.recaptcha.internal.zzkf) r0
            com.google.android.recaptcha.internal.zzke r0 = r0.zzY()
            if (r1 == r0) goto L_0x00b5
            goto L_0x0139
        L_0x0187:
            boolean r0 = r1 instanceof java.lang.Enum
            if (r0 == 0) goto L_0x0139
            r0 = r1
            java.lang.Enum r0 = (java.lang.Enum) r0
            int r0 = r0.ordinal()
            goto L_0x0137
        L_0x0193:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzit.zzz(r13, r6, r0)
            goto L_0x0133
        L_0x019a:
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzip
            if (r0 == 0) goto L_0x01cc
            r0 = r6
            com.google.android.recaptcha.internal.zzip r0 = (com.google.android.recaptcha.internal.zzip) r0
            com.google.android.recaptcha.internal.zzij r0 = r0.zzb
            java.util.Iterator r3 = r0.zzf()
        L_0x01a7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01cc
            java.util.Map$Entry r2 = X.AnonymousClass000.A16(r3)
            java.lang.Object r0 = r2.getKey()
            com.google.android.recaptcha.internal.zziq r0 = (com.google.android.recaptcha.internal.zziq) r0
            int r1 = r0.zza
            java.lang.StringBuilder r0 = X.BE9.A0q()
            r0.append(r1)
            java.lang.String r1 = X.AnonymousClass000.A0z(r0)
            java.lang.Object r0 = r2.getValue()
            zzb(r5, r4, r1, r0)
            goto L_0x01a7
        L_0x01cc:
            com.google.android.recaptcha.internal.zzit r6 = (com.google.android.recaptcha.internal.zzit) r6
            com.google.android.recaptcha.internal.zzlm r0 = r6.zzc
            if (r0 == 0) goto L_0x01d5
            r0.zzi(r5, r4)
        L_0x01d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkg.zzd(com.google.android.recaptcha.internal.zzke, java.lang.StringBuilder, int):void");
    }

    public static String zza(zzke zzke, String str) {
        StringBuilder A0t = BEA.A0t(str);
        zzd(zzke, A0t, 0);
        return A0t.toString();
    }
}
