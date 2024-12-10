package X;

/* renamed from: X.7QM  reason: invalid class name */
public class AnonymousClass7QM implements Runnable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public AnonymousClass7QM(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, int i3) {
        this.A00 = i3;
        this.A03 = obj;
        this.A04 = obj2;
        this.A05 = obj3;
        this.A06 = obj4;
        this.A01 = i;
        this.A07 = obj5;
        this.A02 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010b, code lost:
        if (r4.contains(r12.A0X) == false) goto L_0x010d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r2 = r20
            int r0 = r2.A00
            if (r0 == 0) goto L_0x0025
            java.lang.Object r4 = r2.A03
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            int r7 = r2.A01
            int r8 = r2.A02
            java.lang.Object r5 = r2.A04
            X.21W r5 = (X.AnonymousClass21W) r5
            java.lang.Object r3 = r2.A05
            X.2rc r3 = (X.C62572rc) r3
            java.lang.Object r6 = r2.A06
            java.io.File r6 = (java.io.File) r6
            java.lang.Object r1 = r2.A07
            X.6Mr r1 = (X.C122076Mr) r1
            X.6Ml r0 = com.whatsapp.mediaview.MediaViewFragment.A05(r3, r4, r5, r6, r7, r8)
            r1.A09 = r0
        L_0x0024:
            return
        L_0x0025:
            java.lang.Object r13 = r2.A03
            X.6q7 r13 = (X.C134146q7) r13
            java.lang.Object r6 = r2.A04
            X.6kY r6 = (X.C131126kY) r6
            java.lang.Object r1 = r2.A05
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r9 = r2.A06
            X.73D r9 = (X.AnonymousClass73D) r9
            int r5 = r2.A01
            java.lang.Object r4 = r2.A07
            java.util.Set r4 = (java.util.Set) r4
            int r3 = r2.A02
            r8 = 1
            r2 = 3
            boolean r0 = r13.A03
            if (r0 == 0) goto L_0x0024
            boolean r0 = r13.A02
            if (r0 == 0) goto L_0x0024
            X.0vl r0 = r6.A0D
            boolean r18 = X.C72453Mb.A1a(r0)
            X.0vl r0 = r6.A0A
            boolean r19 = X.C72453Mb.A1a(r0)
            java.util.ArrayList r7 = X.C29351c6.A0D(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x005b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006d
            android.net.Uri r0 = X.C108945cZ.A0M(r1)
            X.72S r0 = r9.A02(r0)
            r7.add(r0)
            goto L_0x005b
        L_0x006d:
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.Iterator r10 = r7.iterator()
        L_0x0075:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0092
            java.lang.Object r7 = r10.next()
            r1 = r7
            X.72S r1 = (X.AnonymousClass72S) r1
            X.1ka r0 = r13.A07
            int r1 = X.AnonymousClass72S.A00(r1, r0)
            if (r1 == r8) goto L_0x008e
            r0 = 42
            if (r1 != r0) goto L_0x0075
        L_0x008e:
            r9.add(r7)
            goto L_0x0075
        L_0x0092:
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r11 = r9.iterator()
        L_0x009a:
            boolean r0 = r11.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r7 = r11.next()
            r10 = r7
            X.72S r10 = (X.AnonymousClass72S) r10
            X.C18070vi.A0b(r10)
            java.io.File r0 = r10.A0C()
            if (r0 == 0) goto L_0x009a
            android.net.Uri$Builder r0 = X.C108965cb.A06(r0)
            X.C26521Sl.A0Z(r0, r10)
            android.net.Uri r0 = r0.build()
            if (r0 == 0) goto L_0x009a
            android.net.Uri r9 = X.C26521Sl.A0U(r0)
            X.C18070vi.A0X(r9)
            if (r5 != r2) goto L_0x00d6
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x00d5
            android.net.Uri r0 = r10.A0X
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x00d6
        L_0x00d5:
            r1 = 3
        L_0x00d6:
            X.00H r0 = r13.A0A
            java.lang.Object r0 = r0.get()
            X.2iz r0 = (X.C57382iz) r0
            java.util.Map r0 = r0.A00
            java.lang.Object r0 = X.AnonymousClass000.A0w(r0, r1)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x009a
            boolean r0 = r0.containsKey(r9)
            if (r0 != 0) goto L_0x009a
            r8.add(r7)
            goto L_0x009a
        L_0x00f2:
            java.util.Iterator r9 = r8.iterator()
        L_0x00f6:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r12 = r9.next()
            X.72S r12 = (X.AnonymousClass72S) r12
            if (r5 != r2) goto L_0x010d
            android.net.Uri r0 = r12.A0X
            boolean r0 = r4.contains(r0)
            r15 = 3
            if (r0 != 0) goto L_0x010e
        L_0x010d:
            r15 = 0
        L_0x010e:
            X.C18070vi.A0b(r12)
            java.util.List r14 = r6.A06
            java.io.File r0 = r12.A0C()
            if (r0 == 0) goto L_0x00f6
            android.net.Uri$Builder r0 = X.C108965cb.A06(r0)
            X.C26521Sl.A0Z(r0, r12)
            android.net.Uri r11 = r0.build()
            if (r11 == 0) goto L_0x00f6
            r8 = 1
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x014d
            X.1BI r7 = X.C108945cZ.A0i(r14, r1)
            if (r7 == 0) goto L_0x014d
            int r0 = r14.size()
            if (r0 > r8) goto L_0x013a
            r8 = 0
        L_0x013a:
            int r16 = X.A8F.A01(r7, r8)
        L_0x013e:
            X.10I r0 = r13.A09
            X.3CV r10 = new X.3CV
            r17 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r7 = "OptimisticUploadController_WA_WORKER_TOKEN"
            r0.CGS(r10, r7)
            goto L_0x00f6
        L_0x014d:
            r16 = 1
            goto L_0x013e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7QM.run():void");
    }
}
