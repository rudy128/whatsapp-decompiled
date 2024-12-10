package X;

/* renamed from: X.7Q6  reason: invalid class name */
public class AnonymousClass7Q6 implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;

    public AnonymousClass7Q6(Object obj, Object obj2, Object obj3, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = obj;
        this.A04 = z;
        this.A05 = z2;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005b, code lost:
        if (X.C18020vd.A05(r1, r4, 8880) != false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            r6 = r21
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x00d5;
                case 1: goto L_0x010b;
                case 2: goto L_0x0157;
                case 3: goto L_0x0190;
                case 4: goto L_0x0032;
                default: goto L_0x0007;
            }
        L_0x0007:
            boolean r1 = r6.A04
            java.lang.Object r0 = r6.A01
            X.6j4 r0 = (X.C130216j4) r0
            java.lang.Object r4 = r6.A02
            X.206 r4 = (X.AnonymousClass206) r4
            java.lang.Object r3 = r6.A03
            android.view.View r3 = (android.view.View) r3
            boolean r2 = r6.A05
            if (r1 == 0) goto L_0x00c1
            X.1gV r6 = r0.A03
            X.00H r0 = r0.A01
            java.lang.Object r5 = r0.get()
            X.3M2 r5 = (X.AnonymousClass3M2) r5
            X.205 r7 = r4.A0v
            r9 = 0
            r8 = 240(0xf0, float:3.36E-43)
            r2 = 0
            r14 = 1
            r11 = r9
            r12 = r9
            r13 = r9
            r10 = r9
            X.C32021gV.A05(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0031:
            return
        L_0x0032:
            java.lang.Object r7 = r6.A01
            X.2lE r7 = (X.C58772lE) r7
            boolean r3 = r6.A04
            java.lang.Object r8 = r6.A02
            X.206 r8 = (X.AnonymousClass206) r8
            java.lang.Object r10 = r6.A03
            java.util.List r10 = (java.util.List) r10
            boolean r13 = r6.A05
            r19 = 0
            X.00H r2 = r7.A06
            X.0ve r4 = X.C108955ca.A0R(r2)
            r0 = 8687(0x21ef, float:1.2173E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r4, r0)
            if (r0 != 0) goto L_0x005d
            r0 = 8880(0x22b0, float:1.2444E-41)
            boolean r1 = X.C18020vd.A05(r1, r4, r0)
            r0 = 0
            if (r1 == 0) goto L_0x005e
        L_0x005d:
            r0 = 1
        L_0x005e:
            r12 = 1
            r18 = 0
            if (r0 == 0) goto L_0x00a0
            if (r3 == 0) goto L_0x00a0
            X.205 r0 = r8.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0031
            X.1Lc r0 = X.C108945cZ.A0v(r2)
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x009e
            X.1Le r1 = r7.A02
            com.whatsapp.jid.UserJid r0 = r8.A0I()
            X.2sx r5 = r1.A08(r0)
            if (r5 == 0) goto L_0x009e
            long r3 = r5.A02()
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x009e
            long r0 = r8.A0y
            long r3 = r5.A02()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x009e
        L_0x0095:
            int r11 = r10.indexOf(r8)
            r9 = r8
            r7.A00(r8, r9, r10, r11, r12, r13)
            return
        L_0x009e:
            r12 = 0
            goto L_0x0095
        L_0x00a0:
            java.util.ArrayList r0 = X.C17880vN.A10(r10)
            java.util.List r17 = java.util.Collections.synchronizedList(r0)
            java.util.Iterator r1 = r17.iterator()
        L_0x00ac:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0031
            X.206 r15 = X.C17880vN.A0Y(r1)
            r14 = r7
            r16 = r8
            r20 = r13
            r14.A00(r15, r16, r17, r18, r19, r20)
            int r18 = r18 + 1
            goto L_0x00ac
        L_0x00c1:
            X.1gV r1 = r0.A03
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.3M2 r0 = (X.AnonymousClass3M2) r0
            if (r2 == 0) goto L_0x00d1
            r1.A0D(r3, r4, r0)
            return
        L_0x00d1:
            r1.A0E(r3, r4, r0)
            return
        L_0x00d5:
            java.lang.Object r4 = r6.A01
            X.3uP r4 = (X.AnonymousClass3uP) r4
            java.lang.Object r0 = r6.A02
            X.4Wv r0 = (X.C87754Wv) r0
            boolean r3 = r6.A04
            java.lang.Object r2 = r6.A03
            X.210 r2 = (X.AnonymousClass210) r2
            boolean r1 = r6.A05
            X.1nl r5 = r4.A0T
            android.content.Context r6 = r4.getContext()
            java.lang.String r0 = r0.A03
            android.net.Uri r7 = android.net.Uri.parse(r0)
            r8 = 0
            if (r3 == 0) goto L_0x00f5
            r8 = r2
        L_0x00f5:
            int r9 = r2.A00
            if (r1 == 0) goto L_0x0109
            X.205 r0 = r2.A0v
            X.1BI r0 = r0.A00
            boolean r0 = X.C22971Dz.A0e(r0)
            int r10 = X.C72453Mb.A05(r0)
        L_0x0105:
            r5.CGW(r6, r7, r8, r9, r10)
            return
        L_0x0109:
            r10 = 4
            goto L_0x0105
        L_0x010b:
            boolean r5 = r6.A04
            java.lang.Object r4 = r6.A01
            X.1as r4 = (X.C28771as) r4
            java.lang.Object r7 = r6.A02
            X.1BI r7 = (X.AnonymousClass1BI) r7
            java.lang.Object r3 = r6.A03
            java.lang.Number r3 = (java.lang.Number) r3
            boolean r14 = r6.A05
            if (r5 == 0) goto L_0x0149
            X.1MC r1 = r4.A01
            r0 = 3
            r1.A00(r7, r0)
            X.00H r0 = r4.A0O
            java.lang.Object r2 = r0.get()
            X.A74 r2 = (X.A74) r2
            java.lang.Integer r1 = X.C17880vN.A0m()
            r0 = 3
        L_0x0130:
            r8 = 0
            X.A74.A02(r2, r7, r1, r8, r0)
            X.00H r0 = r4.A0M
            java.lang.Object r6 = r0.get()
            X.A5M r6 = (X.A5M) r6
            int r11 = r3.intValue()
            r12 = r5 ^ 1
            r13 = 0
            r10 = r8
            r9 = r8
            r6.A03(r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x0149:
            X.00H r0 = r4.A0O
            java.lang.Object r2 = r0.get()
            X.A74 r2 = (X.A74) r2
            java.lang.Integer r1 = X.AnonymousClass3MY.A0g()
            r0 = 4
            goto L_0x0130
        L_0x0157:
            java.lang.Object r4 = r6.A01
            android.content.Context r4 = (android.content.Context) r4
            boolean r2 = r6.A04
            boolean r1 = r6.A05
            java.lang.Object r0 = r6.A02
            X.749 r0 = (X.AnonymousClass749) r0
            java.lang.Object r3 = r6.A03
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r2 == 0) goto L_0x0183
            if (r1 == 0) goto L_0x0183
            X.00H r0 = r0.A0C
            android.content.Intent r2 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.newsletter.ui.mv.NewsletterCreateMVActivity"
        L_0x0177:
            r2.setClassName(r1, r0)
            java.lang.String r0 = "log_instance_key"
            r2.putExtra(r0, r3)
            r4.startActivity(r2)
            return
        L_0x0183:
            X.00H r0 = r0.A0C
            android.content.Intent r2 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.newsletter.ui.NewsletterCreationActivity"
            goto L_0x0177
        L_0x0190:
            boolean r2 = r6.A04
            java.lang.Object r1 = r6.A01
            X.6s7 r1 = (X.C135386s7) r1
            boolean r0 = r6.A05
            java.lang.Object r4 = r6.A02
            X.5lQ r4 = (X.C112405lQ) r4
            java.lang.Object r3 = r6.A03
            X.1BI r3 = (X.AnonymousClass1BI) r3
            if (r2 == 0) goto L_0x01b2
            r0 = 0
            r1.A01 = r0
        L_0x01a5:
            X.1KB r2 = r4.A07
            r1 = 38
            X.AkP r0 = new X.AkP
            r0.<init>(r4, r3, r1)
            r2.A0J(r0)
            return
        L_0x01b2:
            if (r0 == 0) goto L_0x01a5
            X.1E7 r2 = r1.A00
            boolean r0 = r2.A0g
            if (r0 != 0) goto L_0x01a5
            X.1M9 r0 = r4.A08
            X.1E7 r1 = r0.A0H(r3)
            X.5yh r0 = new X.5yh
            r0.<init>(r1)
            r0.A01(r2)
            goto L_0x01a5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Q6.run():void");
    }
}
