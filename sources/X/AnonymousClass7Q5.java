package X;

/* renamed from: X.7Q5  reason: invalid class name */
public class AnonymousClass7Q5 implements Runnable {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public AnonymousClass7Q5(Object obj, Object obj2, Object obj3, int i, int i2, long j) {
        this.A00 = i2;
        this.A03 = obj;
        this.A04 = obj2;
        this.A01 = i;
        this.A02 = j;
        this.A05 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r4 != null) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x00ae;
                case 1: goto L_0x00cc;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r10.A03
            X.6kG r1 = (X.C130946kG) r1
            long r6 = r10.A02
            java.lang.Object r4 = r10.A04
            X.34B r4 = (X.AnonymousClass34B) r4
            int r3 = r10.A01
            java.lang.Object r2 = r10.A05
            X.6pD r2 = (X.C133626pD) r2
            r0 = 4
            X.C18070vi.A0d(r2, r0)
            java.util.Map r1 = r1.A0A
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r1.remove(r0)
            X.1TJ r0 = r4.A0B
            java.lang.Object r1 = r0.A00()
            X.2ex r1 = (X.C54942ex) r1
            if (r1 == 0) goto L_0x0039
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A02
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0039
            java.io.File r0 = r1.A01
            r0.delete()
        L_0x0039:
            X.2g5 r4 = r4.A03()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "XFamilyCrosspostMediaUploadManager/enqueueUploadImpl MediaJobFinished result: "
            r1.append(r0)
            if (r4 == 0) goto L_0x008e
            int r0 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x004e:
            X.C108995ce.A1K(r0, r1)
            if (r4 == 0) goto L_0x005b
            X.2rU r0 = r4.A01
            X.9i7 r0 = r0.A04
            java.lang.Long r0 = r0.A0B
            if (r0 != 0) goto L_0x0071
        L_0x005b:
            r0 = 17
            if (r3 == r0) goto L_0x00a2
            r0 = 22
            if (r3 == r0) goto L_0x00a2
            r0 = 13
            if (r3 == r0) goto L_0x00a2
            r0 = 33
            if (r3 == r0) goto L_0x00a2
            r0 = 25
            if (r3 == r0) goto L_0x00a2
            if (r4 == 0) goto L_0x0098
        L_0x0071:
            int r1 = r4.A00
            r0 = 1
            if (r1 == r0) goto L_0x008d
            r0 = 32
            if (r1 == r0) goto L_0x008d
            if (r1 != 0) goto L_0x0098
            X.9un r0 = r4.A02
            java.lang.String r1 = r0.A03()
            if (r1 == 0) goto L_0x0091
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0091
            r2.A00(r6, r1)
        L_0x008d:
            return
        L_0x008e:
            java.lang.String r0 = "null"
            goto L_0x004e
        L_0x0091:
            r1 = 0
            r0 = -10
            r2.A01(r1, r0, r6)
            return
        L_0x0098:
            r1 = -11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.A01(r0, r1, r6)
            return
        L_0x00a2:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = -1
            X.6nv r2 = r2.A01
            r4 = 3
            r2.A00(r3, r4, r5, r6)
            return
        L_0x00ae:
            java.lang.Object r6 = r10.A03
            X.1ja r6 = (X.C33911ja) r6
            java.lang.Object r5 = r10.A04
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            int r4 = r10.A01
            long r2 = r10.A02
            java.lang.Object r1 = r10.A05
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            r0 = 1
            X.C18070vi.A0f(r5, r0, r1)
            X.1M9 r0 = r6.A00
            r0.A0i(r5, r4, r2)
            r1.A02 = r4
            r1.A0B = r2
            return
        L_0x00cc:
            java.lang.Object r6 = r10.A03
            X.6nI r6 = (X.C132656nI) r6
            java.lang.Object r8 = r10.A04
            X.206 r8 = (X.AnonymousClass206) r8
            long r2 = r10.A02
            java.lang.Object r7 = r10.A05
            java.lang.Number r7 = (java.lang.Number) r7
            int r5 = r10.A01
            r9 = 0
            r0 = 1
            X.1Qe r4 = r6.A01
            X.25F[] r1 = new X.AnonymousClass25F[r0]
            java.lang.Class<X.Ac8> r0 = X.C20954Ac8.class
            X.C108985cd.A19(r4, r8, r0, r1)
            X.63Z r4 = new X.63Z
            r4.<init>()
            com.whatsapp.jid.UserJid r0 = r8.A0I()
            r1 = 0
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = r0.user
            if (r0 == 0) goto L_0x0123
            java.lang.Long r0 = X.C108965cb.A0m(r0)
        L_0x00fb:
            r4.A02 = r0
            java.lang.String r0 = X.C196879vn.A00(r8)
            r4.A05 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.A03 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r4.A00 = r0
            if (r7 == 0) goto L_0x0115
            java.lang.Long r1 = X.C17890vO.A0N(r7)
        L_0x0115:
            r4.A04 = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r4.A01 = r0
            X.18K r0 = r6.A00
            r0.CC7(r4)
            return
        L_0x0123:
            r0 = r1
            goto L_0x00fb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Q5.run():void");
    }
}
