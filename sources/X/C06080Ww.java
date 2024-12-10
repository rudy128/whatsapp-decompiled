package X;

import java.util.List;

/* renamed from: X.0Ww  reason: invalid class name and case insensitive filesystem */
public final class C06080Ww implements C16870tM {
    public final AnonymousClass0U5 A00;

    public C06080Ww(AnonymousClass0U5 r1) {
        this.A00 = r1;
    }

    public int BjA(C17740v9 r6, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(AnonymousClass000.A0g(list, 0).Bj9(i));
        int A04 = AnonymousClass1ZU.A04(list);
        int i2 = 1;
        if (1 <= A04) {
            while (true) {
                valueOf = AnonymousClass001.A16(valueOf, AnonymousClass000.A0g(list, i2).Bj9(i));
                if (i2 == A04) {
                    break;
                }
                i2++;
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    public int BjD(C17740v9 r6, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(AnonymousClass000.A0g(list, 0).BjC(i));
        int A04 = AnonymousClass1ZU.A04(list);
        int i2 = 1;
        if (1 <= A04) {
            while (true) {
                valueOf = AnonymousClass001.A16(valueOf, AnonymousClass000.A0g(list, i2).BjC(i));
                if (i2 == A04) {
                    break;
                }
                i2++;
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        if (r7 == 0) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C16820tH BjZ(X.C17530uo r10, java.util.List r11, long r12) {
        /*
            r9 = this;
            int r7 = r11.size()
            X.0XJ[] r5 = new X.AnonymousClass0XJ[r7]
            int r8 = r11.size()
            r4 = 0
            r3 = 0
        L_0x000c:
            r6 = 1
            if (r3 >= r8) goto L_0x002e
            java.lang.Object r2 = r11.get(r3)
            X.0ul r2 = (X.C17500ul) r2
            java.lang.Object r1 = r2.BWC()
            boolean r0 = r1 instanceof X.AnonymousClass0XL
            if (r0 == 0) goto L_0x002b
            X.0XL r1 = (X.AnonymousClass0XL) r1
            if (r1 == 0) goto L_0x002b
            boolean r0 = r1.A00
            if (r0 != r6) goto L_0x002b
            X.0XJ r0 = r2.Bjb(r12)
            r5[r3] = r0
        L_0x002b:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x002e:
            int r3 = r11.size()
            r2 = 0
        L_0x0033:
            if (r2 >= r3) goto L_0x0048
            java.lang.Object r1 = r11.get(r2)
            X.0ul r1 = (X.C17500ul) r1
            r0 = r5[r2]
            if (r0 != 0) goto L_0x0045
            X.0XJ r0 = r1.Bjb(r12)
            r5[r2] = r0
        L_0x0045:
            int r2 = r2 + 1
            goto L_0x0033
        L_0x0048:
            if (r7 == 0) goto L_0x0074
            r8 = r5[r4]
            int r1 = X.C200410p.A0G(r5)
            if (r1 == 0) goto L_0x008a
            int r3 = X.AnonymousClass000.A0K(r8)
            X.1Oc r0 = new X.1Oc
            r0.<init>(r6, r1)
            X.20U r2 = r0.iterator()
        L_0x005f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008a
            int r0 = r2.A00()
            r1 = r5[r0]
            int r0 = X.AnonymousClass000.A0K(r1)
            if (r3 >= r0) goto L_0x005f
            r8 = r1
            r3 = r0
            goto L_0x005f
        L_0x0074:
            r8 = 0
            if (r7 != 0) goto L_0x008e
        L_0x0077:
            X.0U5 r2 = r9.A00
            long r0 = X.C25293Ccv.A00(r8, r4)
            r2.A01(r0)
            X.0jn r0 = new X.0jn
            r0.<init>(r9, r5, r8, r4)
            X.0tH r0 = r10.BhL(X.AnonymousClass1D7.A0I(), r0, r8, r4)
            return r0
        L_0x008a:
            if (r8 == 0) goto L_0x0074
            int r8 = r8.A01
        L_0x008e:
            r7 = r5[r4]
            int r1 = X.C200410p.A0G(r5)
            if (r1 == 0) goto L_0x00b8
            int r3 = X.AnonymousClass000.A0J(r7)
            X.1Oc r0 = new X.1Oc
            r0.<init>(r6, r1)
            X.20U r2 = r0.iterator()
        L_0x00a3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b8
            int r0 = r2.A00()
            r1 = r5[r0]
            int r0 = X.AnonymousClass000.A0J(r1)
            if (r3 >= r0) goto L_0x00a3
            r7 = r1
            r3 = r0
            goto L_0x00a3
        L_0x00b8:
            if (r7 == 0) goto L_0x0077
            int r4 = r7.A00
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06080Ww.BjZ(X.0uo, java.util.List, long):X.0tH");
    }

    public int Bjw(C17740v9 r6, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(AnonymousClass000.A0g(list, 0).Bjv(i));
        int A04 = AnonymousClass1ZU.A04(list);
        int i2 = 1;
        if (1 <= A04) {
            while (true) {
                valueOf = AnonymousClass001.A16(valueOf, AnonymousClass000.A0g(list, i2).Bjv(i));
                if (i2 == A04) {
                    break;
                }
                i2++;
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    public int Bjz(C17740v9 r6, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(AnonymousClass000.A0g(list, 0).Bjy(i));
        int A04 = AnonymousClass1ZU.A04(list);
        int i2 = 1;
        if (1 <= A04) {
            while (true) {
                valueOf = AnonymousClass001.A16(valueOf, AnonymousClass000.A0g(list, i2).Bjy(i));
                if (i2 == A04) {
                    break;
                }
                i2++;
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
