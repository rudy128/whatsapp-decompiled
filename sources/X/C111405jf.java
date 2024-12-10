package X;

import java.util.List;

/* renamed from: X.5jf  reason: invalid class name and case insensitive filesystem */
public final class C111405jf extends C24490C6i {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r7.A01 <= 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (r6.A01 <= 0) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r7.A01 != 0) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006a, code lost:
        if (r6.A01 != 0) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(int r10, int r11) {
        /*
            r9 = this;
            java.util.List r0 = r9.A01
            java.lang.Object r6 = r0.get(r10)
            X.6hS r6 = (X.C129226hS) r6
            java.util.List r0 = r9.A00
            java.lang.Object r5 = r0.get(r11)
            X.6hS r5 = (X.C129226hS) r5
            com.whatsapp.jid.UserJid r1 = r6.A02
            com.whatsapp.jid.UserJid r0 = r5.A02
            boolean r0 = X.C18070vi.A18(r1, r0)
            r8 = 0
            if (r0 == 0) goto L_0x006f
            long r3 = r6.A01
            long r1 = r5.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x006f
            java.lang.String r1 = r6.A03
            java.lang.String r0 = r5.A03
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x006f
            X.6yE r7 = r6.A00
            X.6yE r6 = r5.A00
            r5 = 1
            if (r7 != 0) goto L_0x0037
            if (r6 != 0) goto L_0x006f
        L_0x0036:
            return r5
        L_0x0037:
            if (r6 == 0) goto L_0x006f
            com.whatsapp.jid.UserJid r1 = r7.A02
            com.whatsapp.jid.UserJid r0 = r6.A02
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x006f
            boolean r4 = r7.A01()
            if (r4 == 0) goto L_0x004e
            int r0 = r7.A01
            r2 = 1
            if (r0 > 0) goto L_0x004f
        L_0x004e:
            r2 = 0
        L_0x004f:
            boolean r3 = r6.A01()
            if (r3 == 0) goto L_0x005a
            int r1 = r6.A01
            r0 = 1
            if (r1 > 0) goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            if (r2 != r0) goto L_0x006f
            if (r4 == 0) goto L_0x0064
            int r0 = r7.A01
            r2 = 1
            if (r0 == 0) goto L_0x0065
        L_0x0064:
            r2 = 0
        L_0x0065:
            if (r3 == 0) goto L_0x006c
            int r1 = r6.A01
            r0 = 1
            if (r1 == 0) goto L_0x006d
        L_0x006c:
            r0 = 0
        L_0x006d:
            if (r2 == r0) goto L_0x0036
        L_0x006f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111405jf.A03(int, int):boolean");
    }

    public boolean A04(int i, int i2) {
        return C18070vi.A18(((C129226hS) this.A01.get(i)).A02, ((C129226hS) this.A00.get(i2)).A02);
    }

    public C111405jf(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
