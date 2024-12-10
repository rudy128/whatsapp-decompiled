package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Beh  reason: case insensitive filesystem */
public abstract class C23293Beh extends C26919DJa {
    public static Map zzjr = AnonymousClass8BR.A17();
    public C25839Cmt zzjp = C25839Cmt.A05;
    public int zzjq = -1;

    public final /* synthetic */ C23293Beh CTO() {
        return (C23293Beh) A04(6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!A04(6).getClass().isInstance(obj)) {
            return false;
        }
        return BE9.A0R(this).BKS(this, obj);
    }

    public static final void A03(StringBuilder sb, int i, String str, Object obj) {
        String A01;
        if (obj instanceof List) {
            Iterator A13 = AnonymousClass8BR.A13(obj);
            while (A13.hasNext()) {
                A03(sb, i, str, A13.next());
            }
        } else if (obj instanceof Map) {
            Iterator A15 = AnonymousClass000.A15((Map) obj);
            while (A15.hasNext()) {
                A03(sb, i, str, A15.next());
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                DSP dsp = DSP.A00;
                A01 = A01(new C23303Ber(((String) obj).getBytes(C25461CgE.A00)));
            } else if (obj instanceof DSP) {
                sb.append(": \"");
                A01 = A01((DSP) obj);
            } else {
                if (obj instanceof C23293Beh) {
                    sb.append(" {");
                    A02((C26919DJa) obj, sb, i + 2);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i4 = i + 2;
                    A03(sb, i4, "key", entry.getKey());
                    A03(sb, i4, "value", entry.getValue());
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else {
                    sb.append(": ");
                    AnonymousClass8BS.A1D(obj, sb);
                    return;
                }
                sb.append("}");
                return;
            }
            sb.append(A01);
            sb.append('\"');
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.E21, X.Ch3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v7, types: [X.E21, X.Ch3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v14, types: [X.E21, X.Ch3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v21, types: [X.E21, X.Ch3, java.lang.Object] */
    public Object A04(int i) {
        ? obj;
        ? obj2;
        ? obj3;
        ? obj4;
        if (this instanceof C23309Bex) {
            switch (CF8.A00[i - 1]) {
                case 1:
                    return new C23309Bex();
                case 2:
                    return new C23307Bev();
                case 3:
                    Object[] A1b = AnonymousClass3MW.A1b();
                    A1b[0] = "zzbiq";
                    A1b[1] = C23312Bf0.class;
                    return new DJW(C23309Bex.zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", A1b);
                case 4:
                    return C23309Bex.zzbir;
                case 5:
                    synchronized (C23309Bex.class) {
                        C25939Cp5 cp5 = C25505Ch3.A01;
                        C23309Bex bex = C23309Bex.zzbir;
                        obj4 = new Object();
                        obj4.A00 = bex;
                        C23309Bex.zzbg = obj4;
                    }
                    return obj4;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23312Bf0) {
            switch (CF8.A00[i - 1]) {
                case 1:
                    return new C23312Bf0();
                case 2:
                    return new C23308Bew();
                case 3:
                    return new DJW(C23312Bf0.zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
                case 4:
                    return C23312Bf0.zzbiv;
                case 5:
                    synchronized (C23312Bf0.class) {
                        C25939Cp5 cp52 = C25505Ch3.A01;
                        C23312Bf0 bf0 = C23312Bf0.zzbiv;
                        obj3 = new Object();
                        obj3.A00 = bf0;
                        C23312Bf0.zzbg = obj3;
                    }
                    return obj3;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C17880vN.A0y();
            }
        } else {
            boolean z = this instanceof C23310Bey;
            int i2 = CF7.A00[i - 1];
            if (z) {
                switch (i2) {
                    case 1:
                        return new C23310Bey();
                    case 2:
                        return new C23306Beu();
                    case 3:
                        return new DJW(C23310Bey.zzbfc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"zzbb", "zzbfa", C24372C0m.A00, "zzbfb", AnonymousClass9JP.A00});
                    case 4:
                        return C23310Bey.zzbfc;
                    case 5:
                        synchronized (C23310Bey.class) {
                            C25939Cp5 cp53 = C25505Ch3.A01;
                            C23310Bey bey = C23310Bey.zzbfc;
                            obj2 = new Object();
                            obj2.A00 = bey;
                            C23310Bey.zzbg = obj2;
                        }
                        return obj2;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw C17880vN.A0y();
                }
            } else {
                switch (i2) {
                    case 1:
                        return new C23311Bez();
                    case 2:
                        return new C23305Bet();
                    case 3:
                        Object[] A1a = BE6.A1a();
                        A1a[0] = "zzbb";
                        A1a[1] = "zztu";
                        A1a[2] = "zztv";
                        A1a[3] = "zztw";
                        return new DJW(C23311Bez.zztx, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\b\u0002", A1a);
                    case 4:
                        return C23311Bez.zztx;
                    case 5:
                        synchronized (C23311Bez.class) {
                            C25939Cp5 cp54 = C25505Ch3.A01;
                            C23311Bez bez = C23311Bez.zztx;
                            obj = new Object();
                            obj.A00 = bez;
                            C23311Bez.zzbg = obj;
                        }
                        return obj;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw C17880vN.A0y();
                }
            }
        }
    }

    public int hashCode() {
        int i = this.zzex;
        if (i != 0) {
            return i;
        }
        int Bcu = BE9.A0R(this).Bcu(this);
        this.zzex = Bcu;
        return Bcu;
    }

    public static Object A00(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw BE6.A0o("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw BE6.A0o("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static String A01(DSP dsp) {
        String str;
        StringBuilder A0t = BE6.A0t(dsp.A02());
        for (int i = 0; i < dsp.A02(); i++) {
            int A01 = dsp.A01(i);
            if (A01 != 34) {
                if (A01 == 39) {
                    str = "\\'";
                } else if (A01 != 92) {
                    switch (A01) {
                        case 7:
                            str = "\\a";
                            break;
                        case 8:
                            str = "\\b";
                            break;
                        case 9:
                            str = "\\t";
                            break;
                        case 10:
                            str = "\\n";
                            break;
                        case 11:
                            str = "\\v";
                            break;
                        case 12:
                            str = "\\f";
                            break;
                        case 13:
                            str = "\\r";
                            break;
                        default:
                            if (A01 < 32 || A01 > 126) {
                                BEB.A1M(A0t, A01);
                                A01 = (A01 & 7) + 48;
                            }
                            A0t.append((char) A01);
                            continue;
                    }
                } else {
                    str = "\\\\";
                }
                A0t.append(str);
            } else {
                str = "\\\"";
                A0t.append(str);
            }
        }
        return A0t.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0073, code lost:
        if (r2.getReturnType().equals(java.util.List.class) != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        r3 = X.AnonymousClass000.A10();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007e, code lost:
        if (r1 >= r9.length()) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0080, code lost:
        r3.append(java.lang.Character.toLowerCase(X.BEA.A00(r9, r3, r1)));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        A03(r14, r15, r3.toString(), A00(r2, r13, new java.lang.Object[0]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00dc, code lost:
        if (X.BE7.A1Y(r2) != false) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.EDY r13, java.lang.StringBuilder r14, int r15) {
        /*
            java.util.HashMap r7 = X.C17880vN.A11()
            java.util.HashMap r6 = X.C17880vN.A11()
            java.util.TreeSet r8 = new java.util.TreeSet
            r8.<init>()
            java.lang.Class r0 = r13.getClass()
            java.lang.reflect.Method[] r3 = r0.getDeclaredMethods()
            int r2 = r3.length
            r5 = 0
            r1 = 0
        L_0x0018:
            java.lang.String r4 = "get"
            if (r1 >= r2) goto L_0x0024
            r0 = r3[r1]
            X.BEB.A1O(r0, r8, r6, r7)
            int r1 = r1 + 1
            goto L_0x0018
        L_0x0024:
            java.util.Iterator r12 = r8.iterator()
        L_0x0028:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01cb
            java.lang.String r10 = X.C17880vN.A0v(r12)
            java.lang.String r1 = ""
            java.lang.String r3 = r10.replaceFirst(r4, r1)
            java.lang.String r2 = "List"
            boolean r0 = r3.endsWith(r2)
            r8 = 1
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = "OrBuilderList"
            boolean r0 = r3.endsWith(r0)
            if (r0 != 0) goto L_0x009c
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto L_0x009c
            java.lang.String r2 = X.BEA.A0k(r3)
            int r0 = r3.length()
            int r0 = r0 + -4
            java.lang.String r0 = r3.substring(r8, r0)
            java.lang.String r9 = X.BEB.A0e(r2, r0)
            java.lang.Object r2 = r7.get(r10)
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto L_0x009c
            java.lang.Class r11 = r2.getReturnType()
            java.lang.Class<java.util.List> r0 = java.util.List.class
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x009c
        L_0x0075:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            r1 = 0
        L_0x007a:
            int r0 = r9.length()
            if (r1 >= r0) goto L_0x008e
            char r0 = X.BEA.A00(r9, r3, r1)
            char r0 = java.lang.Character.toLowerCase(r0)
            r3.append(r0)
            int r1 = r1 + 1
            goto L_0x007a
        L_0x008e:
            java.lang.String r1 = r3.toString()
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Object r0 = A00(r2, r13, r0)
            A03(r14, r15, r1, r0)
            goto L_0x0028
        L_0x009c:
            java.lang.String r2 = "Map"
            boolean r0 = r3.endsWith(r2)
            if (r0 == 0) goto L_0x00df
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto L_0x00df
            java.lang.String r2 = X.BEA.A0k(r3)
            int r0 = r3.length()
            int r0 = r0 + -3
            java.lang.String r0 = r3.substring(r8, r0)
            java.lang.String r9 = X.BEB.A0e(r2, r0)
            java.lang.Object r2 = r7.get(r10)
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto L_0x00df
            java.lang.Class r10 = r2.getReturnType()
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00df
            java.lang.Class<java.lang.Deprecated> r0 = java.lang.Deprecated.class
            boolean r0 = r2.isAnnotationPresent(r0)
            if (r0 != 0) goto L_0x00df
            boolean r0 = X.BE7.A1Y(r2)
            if (r0 == 0) goto L_0x00df
            goto L_0x0075
        L_0x00df:
            java.lang.String r9 = java.lang.String.valueOf(r3)
            int r2 = r9.length()
            java.lang.String r0 = "set"
            java.lang.String r0 = X.BE9.A0o(r0, r9, r2)
            java.lang.Object r0 = r6.get(r0)
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "Bytes"
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L_0x010f
            int r0 = r3.length()
            int r0 = r0 + -5
            java.lang.String r0 = r3.substring(r5, r0)
            java.lang.String r0 = X.BEB.A0e(r4, r0)
            boolean r0 = r7.containsKey(r0)
            if (r0 != 0) goto L_0x0028
        L_0x010f:
            java.lang.String r2 = X.BEA.A0k(r3)
            java.lang.String r0 = r3.substring(r8)
            java.lang.String r8 = X.BEB.A0e(r2, r0)
            java.lang.String r0 = X.BEB.A0e(r4, r3)
            java.lang.Object r9 = r7.get(r0)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r2 = r3.length()
            java.lang.String r0 = "has"
            java.lang.String r0 = X.BE9.A0o(r0, r3, r2)
            java.lang.Object r2 = r7.get(r0)
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r9 == 0) goto L_0x0028
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Object r3 = A00(r9, r13, r0)
            if (r2 != 0) goto L_0x0171
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x014f
            boolean r2 = X.AnonymousClass000.A1Y(r3)
        L_0x014b:
            if (r2 != 0) goto L_0x018e
            goto L_0x0028
        L_0x014f:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0158
            int r2 = X.AnonymousClass000.A0M(r3)
            goto L_0x014b
        L_0x0158:
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L_0x0164
            float r1 = X.AnonymousClass000.A04(r3)
            r0 = 0
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            goto L_0x014b
        L_0x0164:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L_0x017e
            double r9 = X.AnonymousClass8BR.A00(r3)
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            goto L_0x014b
        L_0x0171:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Object r0 = A00(r2, r13, r0)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x0028
            goto L_0x018e
        L_0x017e:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 != 0) goto L_0x0188
            boolean r0 = r3 instanceof X.DSP
            if (r0 == 0) goto L_0x01a7
            X.DSP r1 = X.DSP.A00
        L_0x0188:
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L_0x0028
        L_0x018e:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            r1 = 0
        L_0x0193:
            int r0 = r8.length()
            if (r1 >= r0) goto L_0x01c2
            char r0 = X.BEA.A00(r8, r2, r1)
            char r0 = java.lang.Character.toLowerCase(r0)
            r2.append(r0)
            int r1 = r1 + 1
            goto L_0x0193
        L_0x01a7:
            boolean r0 = r3 instanceof X.EDY
            if (r0 == 0) goto L_0x01b6
            r0 = r3
            X.E5O r0 = (X.E5O) r0
            X.Beh r0 = r0.CTO()
            if (r3 != r0) goto L_0x018e
            goto L_0x0028
        L_0x01b6:
            boolean r0 = r3 instanceof java.lang.Enum
            if (r0 == 0) goto L_0x018e
            r0 = r3
            java.lang.Enum r0 = (java.lang.Enum) r0
            int r2 = r0.ordinal()
            goto L_0x014b
        L_0x01c2:
            java.lang.String r0 = r2.toString()
            A03(r14, r15, r0, r3)
            goto L_0x0028
        L_0x01cb:
            X.Beh r13 = (X.C23293Beh) r13
            X.Cmt r3 = r13.zzjp
            if (r3 == 0) goto L_0x01ea
            r2 = 0
        L_0x01d2:
            int r0 = r3.A00
            if (r2 >= r0) goto L_0x01ea
            int[] r0 = r3.A03
            r0 = r0[r2]
            int r0 = r0 >>> 3
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.Object[] r0 = r3.A04
            r0 = r0[r2]
            A03(r14, r15, r1, r0)
            int r2 = r2 + 1
            goto L_0x01d2
        L_0x01ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23293Beh.A02(X.EDY, java.lang.StringBuilder, int):void");
    }

    public String toString() {
        StringBuilder A0t = BEA.A0t(super.toString());
        A02(this, A0t, 0);
        return A0t.toString();
    }
}
