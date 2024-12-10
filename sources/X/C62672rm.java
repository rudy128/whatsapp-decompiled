package X;

import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2rm  reason: invalid class name and case insensitive filesystem */
public final class C62672rm {
    public String A00;

    public final Jid A01(C29621ca r10, List list, String[] strArr) {
        Jid jid = (Jid) A05(r10, Jid.class, (Long) null, (Long) null, (Object) null, strArr, false);
        if (jid == null) {
            return null;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Class) it.next()).isAssignableFrom(jid.getClass())) {
                    return jid;
                }
            }
        }
        return null;
    }

    public final Object A02(C29621ca r12, C22470B9c b9c, String[] strArr) {
        ArrayList A08 = A08(r12, b9c, strArr, 0, 1);
        if (A08 == null || A08.isEmpty()) {
            return null;
        }
        return A08.get(0);
    }

    public final Object A03(C29621ca r4, C22470B9c b9c, String[] strArr) {
        C18070vi.A0d(b9c, 1);
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            C29621ca A0K = r4.A0K(strArr[i]);
            if (A0K == null) {
                this.A00 = AnonymousClass000.A0y(r4.A00, A00(strArr, i));
                return null;
            }
            i++;
            r4 = A0K;
        }
        return b9c.BCF(r4, this);
    }

    public final Object A04(C29621ca r14, Class cls, Long l, Long l2, Object obj, String[] strArr) {
        C18070vi.A0d(cls, 2);
        Long l3 = l;
        Object A05 = A05(r14, cls, l3, l2, obj, strArr, false);
        if (A05 != null) {
            return A05;
        }
        if (obj == null && l3.longValue() <= 0) {
            if (cls.equals(String.class)) {
                return "";
            }
            if (cls.equals(byte[].class)) {
                return new byte[0];
            }
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Element value missing for tag '");
        A10.append(r14.A00);
        this.A00 = C17890vO.A0c(A10, '\'');
        return null;
    }

    public final String A07(C29621ca r9, List list, String[] strArr) {
        String str = (String) A05(r9, String.class, (Long) null, (Long) null, (Object) null, strArr, false);
        if (str != null && list.contains(str)) {
            return str;
        }
        return null;
    }

    public final ArrayList A08(C29621ca r10, C22470B9c b9c, String[] strArr, long j, long j2) {
        StringBuilder A0H;
        String str;
        int length = strArr.length - 1;
        int i = 0;
        while (true) {
            if (i >= length) {
                String str2 = strArr[length];
                List A0R = r10.A0R(str2);
                C18070vi.A0X(A0R);
                ArrayList A13 = AnonymousClass000.A13();
                Iterator it = A0R.iterator();
                while (it.hasNext()) {
                    C29621ca A0a = C17880vN.A0a(it);
                    C18070vi.A0b(A0a);
                    Object BCF = b9c.BCF(A0a, this);
                    if (BCF != null) {
                        A13.add(BCF);
                    }
                }
                if (((long) A13.size()) < j) {
                    A0H = C17900vP.A0H("Invalid number of children '", str2, "'. Received ");
                    A0H.append(A13.size());
                    str = " children but the minimum value specified in the spec is ";
                } else {
                    j = j2;
                    if (((long) A13.size()) <= j2) {
                        return A13;
                    }
                    A0H = C17900vP.A0H("Invalid number of children '", str2, "'. Received ");
                    A0H.append(A13.size());
                    str = " children but the maximum value specified in the spec is ";
                }
                A0H.append(str);
                A0H.append(j);
                A0H.append('.');
            } else {
                C29621ca A0K = r10.A0K(strArr[i]);
                if (A0K == null) {
                    A0H = A00(strArr, i);
                    A0H.append(r10.A00);
                    break;
                }
                i++;
                r10 = A0K;
            }
        }
        this.A00 = A0H.toString();
        return null;
    }

    public final boolean A09(C29621ca r3, String str) {
        if (C29621ca.A07(r3, str)) {
            return true;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("failed requireTag: expected ");
        A10.append(str);
        A10.append(", actual: ");
        this.A00 = AnonymousClass000.A0y(r3.A00, A10);
        return false;
    }

    public static StringBuilder A00(String[] strArr, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("required child ");
        sb.append(strArr[i]);
        sb.append(" missing for tag ");
        return sb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b5, code lost:
        if (r7 == null) goto L_0x01b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.C29621ca r20, java.lang.Class r21, java.lang.Long r22, java.lang.Long r23, java.lang.Object r24, java.lang.String[] r25, boolean r26) {
        /*
            r19 = this;
            r12 = r24
            r14 = r22
            r7 = 0
            r5 = r20
            X.C18070vi.A0d(r5, r7)
            r2 = 1
            r0 = 2
            r1 = r21
            X.C18070vi.A0d(r1, r0)
            r6 = r25
            int r4 = r6.length
            r11 = 0
            int r4 = r4 - r2
            r10 = r25[r4]
            r3 = 0
            char r2 = r10.charAt(r7)
            r0 = 35
            boolean r2 = X.AnonymousClass000.A1T(r2, r0)
            r9 = r5
        L_0x0024:
            r8 = r19
            if (r3 >= r4) goto L_0x0040
            r0 = r25[r3]
            X.1ca r9 = r9.A0K(r0)
            if (r9 != 0) goto L_0x003d
            java.lang.StringBuilder r1 = A00(r6, r3)
            java.lang.String r0 = r5.A00
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r8.A00 = r0
            return r11
        L_0x003d:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x0040:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = r1.equals(r0)
            r13 = r23
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r12 instanceof java.lang.String
            if (r0 != 0) goto L_0x004f
            r12 = r11
        L_0x004f:
            if (r2 == 0) goto L_0x00d3
            java.lang.String r7 = r9.A0M()
        L_0x0055:
            java.lang.String r6 = "/>."
            java.lang.String r5 = "' in tag <"
            java.lang.String r4 = "Error while parsing attribute '"
            if (r26 == 0) goto L_0x0070
            boolean r0 = X.C42171xk.A00(r7, r12)
            if (r0 != 0) goto L_0x00d9
            java.lang.StringBuilder r1 = X.C17900vP.A0H(r4, r10, r5)
            java.lang.String r0 = r9.A00
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r6, r1)
            r8.A00 = r0
        L_0x006f:
            return r11
        L_0x0070:
            if (r7 == 0) goto L_0x006f
            r15 = 46
            java.lang.String r3 = " for tag "
            java.lang.String r2 = "Length of attribute "
            if (r22 == 0) goto L_0x00a2
            int r0 = r7.length()
            long r0 = (long) r0
            long r17 = r14.longValue()
            int r16 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r16 >= 0) goto L_0x00a2
            java.lang.StringBuilder r1 = X.C17900vP.A0H(r2, r10, r3)
            java.lang.String r0 = r9.A00
            r1.append(r0)
            java.lang.String r0 = " is less than the specified lower bound value of "
        L_0x0092:
            r1.append(r0)
            r1.append(r14)
            r1.append(r15)
        L_0x009b:
            java.lang.String r0 = r1.toString()
            r8.A00 = r0
            return r11
        L_0x00a2:
            r14 = r13
            if (r23 == 0) goto L_0x00be
            int r0 = r7.length()
            long r0 = (long) r0
            long r16 = r13.longValue()
            int r13 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r13 <= 0) goto L_0x00be
            java.lang.StringBuilder r1 = X.C17900vP.A0H(r2, r10, r3)
            java.lang.String r0 = r9.A00
            r1.append(r0)
            java.lang.String r0 = " is more than the specified upper bound value of "
            goto L_0x0092
        L_0x00be:
            if (r12 == 0) goto L_0x00dc
            boolean r0 = r7.equals(r12)
            if (r0 != 0) goto L_0x00dc
            java.lang.StringBuilder r1 = X.C17900vP.A0H(r4, r10, r5)
            java.lang.String r0 = r9.A00
            r1.append(r0)
            r1.append(r6)
            goto L_0x009b
        L_0x00d3:
            java.lang.String r7 = r9.A0Q(r10, r11)
            goto L_0x0055
        L_0x00d9:
            if (r7 != 0) goto L_0x00dc
            return r11
        L_0x00dc:
            return r7
        L_0x00dd:
            java.lang.Class<byte[]> r0 = byte[].class
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x013f
            if (r2 != 0) goto L_0x00fc
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Cannot have binary not contained in an element value in tag "
            r1.append(r0)
            java.lang.String r0 = r9.A00
            r1.append(r0)
        L_0x00f5:
            java.lang.String r0 = r1.toString()
            r8.A00 = r0
        L_0x00fb:
            return r11
        L_0x00fc:
            byte[] r5 = r9.A01
            if (r5 == 0) goto L_0x00fb
            java.lang.String r6 = "Length of element value for tag "
            if (r22 == 0) goto L_0x0120
            int r0 = r5.length
            long r0 = (long) r0
            long r3 = r14.longValue()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0120
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r6)
            java.lang.String r0 = r9.A00
            r1.append(r0)
            java.lang.String r0 = " is less than the specified lower bound value of "
            r1.append(r0)
            r1.append(r14)
            goto L_0x00f5
        L_0x0120:
            if (r23 == 0) goto L_0x013e
            int r0 = r5.length
            long r1 = (long) r0
            long r3 = r13.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x013e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r6)
            java.lang.String r0 = r9.A00
            r1.append(r0)
            java.lang.String r0 = " is more than the specified upper bound value of "
            r1.append(r0)
            r1.append(r13)
            goto L_0x00f5
        L_0x013e:
            return r5
        L_0x013f:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0196
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0196
            java.lang.Class<com.whatsapp.jid.Jid> r0 = com.whatsapp.jid.Jid.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x017a
            boolean r0 = r12 instanceof com.whatsapp.jid.Jid
            if (r0 != 0) goto L_0x015c
            r12 = r11
        L_0x015c:
            com.whatsapp.jid.Jid r4 = r9.A0F(r1, r10)
            java.lang.String r3 = "/>."
            java.lang.String r2 = "' in tag <"
            java.lang.String r1 = "Error while parsing attribute '"
            if (r26 == 0) goto L_0x017b
            boolean r0 = X.C42171xk.A00(r4, r12)
            if (r0 != 0) goto L_0x0192
            java.lang.StringBuilder r1 = X.C17900vP.A0H(r1, r10, r2)
            java.lang.String r0 = r9.A00
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)
            r8.A00 = r0
        L_0x017a:
            return r11
        L_0x017b:
            if (r4 == 0) goto L_0x017a
            if (r12 == 0) goto L_0x0195
            boolean r0 = r4.equals(r12)
            if (r0 != 0) goto L_0x0195
            java.lang.StringBuilder r1 = X.C17900vP.A0H(r1, r10, r2)
            java.lang.String r0 = r9.A00
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)
            r8.A00 = r0
            return r11
        L_0x0192:
            if (r4 != 0) goto L_0x0195
            return r11
        L_0x0195:
            return r4
        L_0x0196:
            boolean r0 = r12 instanceof java.lang.Long
            if (r0 != 0) goto L_0x019b
            r12 = r11
        L_0x019b:
            if (r2 == 0) goto L_0x0228
            java.lang.String r3 = r9.A0M()
        L_0x01a1:
            java.lang.String r5 = "/>."
            java.lang.String r6 = "' in tag <"
            java.lang.String r4 = "Error while parsing attribute '"
            java.lang.String r2 = " is not integral: "
            java.lang.String r1 = " for tag "
            java.lang.String r0 = "attribute "
            if (r26 == 0) goto L_0x01c7
            if (r3 == 0) goto L_0x022e
            java.lang.Long r7 = X.AnonymousClass1YD.A04(r3)
            if (r7 != 0) goto L_0x022f
        L_0x01b7:
            java.lang.StringBuilder r1 = X.C17900vP.A0H(r0, r10, r1)
            java.lang.String r0 = r9.A00
            X.C17890vO.A10(r0, r2, r3, r1)
        L_0x01c0:
            java.lang.String r0 = r1.toString()
            r8.A00 = r0
        L_0x01c6:
            return r11
        L_0x01c7:
            if (r3 == 0) goto L_0x01c6
            java.lang.Long r7 = X.AnonymousClass1YD.A04(r3)
            if (r7 == 0) goto L_0x01b7
            java.lang.String r15 = "' for tag "
            java.lang.String r3 = "Value of attribute '"
            if (r22 == 0) goto L_0x01f3
            long r16 = r7.longValue()
            long r1 = r14.longValue()
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01f3
            java.lang.StringBuilder r1 = X.C17900vP.A0H(r3, r10, r15)
            java.lang.String r0 = r9.A00
            r1.append(r0)
            java.lang.String r0 = " is less than the specified lower bound value of "
            r1.append(r0)
            r1.append(r14)
            goto L_0x01c0
        L_0x01f3:
            if (r23 == 0) goto L_0x0213
            long r16 = r7.longValue()
            long r1 = r13.longValue()
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0213
            java.lang.StringBuilder r1 = X.C17900vP.A0H(r3, r10, r15)
            java.lang.String r0 = r9.A00
            r1.append(r0)
            java.lang.String r0 = " is more than the specified upper bound value of "
            r1.append(r0)
            r1.append(r13)
            goto L_0x01c0
        L_0x0213:
            if (r12 == 0) goto L_0x0245
            boolean r0 = r12.equals(r7)
            if (r0 != 0) goto L_0x0245
            java.lang.StringBuilder r1 = X.C17900vP.A0H(r4, r10, r6)
            java.lang.String r0 = r9.A00
            r1.append(r0)
            r1.append(r5)
            goto L_0x01c0
        L_0x0228:
            java.lang.String r3 = r9.A0Q(r10, r11)
            goto L_0x01a1
        L_0x022e:
            r7 = r11
        L_0x022f:
            boolean r0 = X.C42171xk.A00(r7, r12)
            if (r0 != 0) goto L_0x0242
            java.lang.StringBuilder r1 = X.C17900vP.A0H(r4, r10, r6)
            java.lang.String r0 = r9.A00
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r5, r1)
            r8.A00 = r0
            return r11
        L_0x0242:
            if (r7 != 0) goto L_0x0245
            return r11
        L_0x0245:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62672rm.A05(X.1ca, java.lang.Class, java.lang.Long, java.lang.Long, java.lang.Object, java.lang.String[], boolean):java.lang.Object");
    }

    public final boolean A0A(C29621ca r15, String[] strArr) {
        String A0c;
        String str = strArr[0];
        List A0R = r15.A0R(str);
        C18070vi.A0X(A0R);
        if (((long) A0R.size()) < 1) {
            StringBuilder A0H = C17900vP.A0H("Invalid number of children '", str, "'. Received ");
            A0H.append(A0R.size());
            A0H.append(" children but the minimum value specified in the spec is ");
            A0H.append(1);
            A0c = C17890vO.A0c(A0H, '.');
        } else if (((long) A0R.size()) <= 1) {
            return true;
        } else {
            StringBuilder A0H2 = C17900vP.A0H("Invalid number of children '", str, "'. Received ");
            A0H2.append(A0R.size());
            A0H2.append(" children but the maximum value specified in the spec is ");
            A0H2.append(1);
            A0c = C17890vO.A0c(A0H2, '.');
        }
        this.A00 = A0c;
        return false;
    }

    public final Object A06(C29621ca r5, String str, List list, String[] strArr) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object A03 = A03(r5, (C22470B9c) it.next(), strArr);
            if (A03 != null) {
                return A03;
            }
            String str2 = this.A00;
            if (str2 != null) {
                A13.add(str2);
            }
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Required mixin group '");
        A10.append(str);
        A10.append("' was not present; encountered the following errors for each possible mixin:\n");
        this.A00 = AnonymousClass000.A0y(C29431cG.A0h("\n", A13, (C22821Di) null), A10);
        return null;
    }
}
