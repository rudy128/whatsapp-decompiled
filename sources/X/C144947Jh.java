package X;

/* renamed from: X.7Jh  reason: invalid class name and case insensitive filesystem */
public class C144947Jh implements AnonymousClass5a9 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C144947Jh(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if ("video/x.looping_mp4".equals(r7) != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bb, code lost:
        if (X.C22971Dz.A0a(r5.A0h) == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017e, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r0.A3F, 6314) == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c7, code lost:
        if (r4.equals("video/x.looping_mp4") != false) goto L_0x01c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean BpE(androidx.core.view.inputmethod.InputContentInfoCompat r24, int r25) {
        /*
            r23 = this;
            r2 = r23
            int r0 = r2.A00
            r6 = r24
            r3 = r25
            switch(r0) {
                case 0: goto L_0x00d3;
                case 1: goto L_0x0093;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r1 = r2.A01
            X.6xm r1 = (X.C138836xm) r1
            java.lang.Object r4 = r2.A02
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r4 = (com.whatsapp.statuscomposer.composer.TextStatusComposerFragment) r4
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r5 = 1
            if (r24 == 0) goto L_0x0285
            X.6UG r0 = r1.A00(r6, r3)
            if (r0 == 0) goto L_0x028a
            android.net.Uri r8 = r0.A00
            java.lang.String r7 = r0.A01
            X.C18070vi.A0W(r7)
            if (r8 == 0) goto L_0x026e
            java.util.ArrayList r6 = X.C108965cb.A0s(r8)
            java.lang.String r0 = "image/gif"
            boolean r0 = r0.equals(r7)
            java.lang.String r2 = "video/x.looping_mp4"
            if (r0 != 0) goto L_0x003e
            boolean r0 = r2.equals(r7)
            r3 = 5
            if (r0 == 0) goto L_0x0040
        L_0x003e:
            r3 = 23
        L_0x0040:
            com.whatsapp.status.widget.StatusEditText r0 = r4.A0l
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "entry"
            X.C18070vi.A11(r0)
        L_0x0049:
            r0 = 0
            throw r0
        L_0x004b:
            java.lang.String r0 = r0.getStringText()
            X.C18070vi.A0X(r0)
            X.72S r1 = new X.72S
            r1.<init>(r8)
            r1.A0P(r0)
            boolean r0 = r2.equals(r7)
            if (r0 == 0) goto L_0x0067
            java.lang.Integer r0 = X.C108955ca.A0i()
            r1.A0O(r0)
        L_0x0067:
            X.73D r2 = new X.73D
            r2.<init>(r1)
            android.content.Context r0 = r4.A14()
            X.6yo r1 = new X.6yo
            r1.<init>(r0)
            r1.A0I = r6
            X.1cg r0 = X.C29671cg.A00
            java.lang.String r0 = r0.getRawString()
            r1.A0D = r0
            r1.A01 = r3
            r1.A0P = r5
            r0 = 34
            r1.A02 = r0
            X.C139416yo.A00(r2, r1)
            android.content.Intent r0 = r1.A01()
            r4.startActivityForResult(r0, r5)
            goto L_0x027e
        L_0x0093:
            java.lang.Object r5 = r2.A01
            com.whatsapp.status.playback.MessageReplyActivity r5 = (com.whatsapp.status.playback.MessageReplyActivity) r5
            java.lang.Object r0 = r2.A02
            X.6xm r0 = (X.C138836xm) r0
            X.6UG r4 = r0.A00(r6, r3)
            if (r4 == 0) goto L_0x028a
            java.lang.String r2 = r4.A01
            java.lang.String r0 = "image/gif"
            boolean r0 = r2.equals(r0)
            java.lang.String r1 = "video/x.looping_mp4"
            if (r0 != 0) goto L_0x00b3
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x00bd
        L_0x00b3:
            X.1BI r0 = r5.A0h
            boolean r0 = X.C22971Dz.A0a(r0)
            r3 = 25
            if (r0 != 0) goto L_0x00be
        L_0x00bd:
            r3 = 5
        L_0x00be:
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x00d1
            java.lang.Integer r2 = X.C108955ca.A0i()
        L_0x00c8:
            X.5tO r1 = r5.A0R
            android.net.Uri r0 = r4.A00
            r1.A0D(r0, r2, r3)
            goto L_0x027e
        L_0x00d1:
            r2 = 0
            goto L_0x00c8
        L_0x00d3:
            java.lang.Object r0 = r2.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            java.lang.Object r1 = r2.A02
            X.6xm r1 = (X.C138836xm) r1
            X.6UG r2 = r1.A00(r6, r3)
            r15 = 0
            if (r2 == 0) goto L_0x028a
            boolean r1 = X.AnonymousClass4aY.A1y(r0)
            if (r1 == 0) goto L_0x0181
            r1 = 1
        L_0x00e9:
            r13 = 0
            r5 = 1
            java.lang.String r4 = r2.A01
            if (r1 == 0) goto L_0x01b8
            X.00H r1 = r0.A4u
            java.lang.Object r1 = r1.get()
            X.2hA r1 = (X.C56252hA) r1
            X.00H r1 = r1.A0E
            X.1UD r1 = X.AnonymousClass3MW.A0X(r1)
            boolean r1 = r1.A0B()
            if (r1 == 0) goto L_0x0187
            boolean r1 = X.AnonymousClass4aY.A20(r0)
            if (r1 != 0) goto L_0x0187
            java.lang.String r1 = "image/gif"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0187
            java.lang.String r1 = "image/webp.wasticker"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0187
            java.lang.String r1 = "video/x.looping_mp4"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x015c
            X.00H r1 = r0.A4u
            java.lang.Object r1 = r1.get()
            X.2hA r1 = (X.C56252hA) r1
            X.00H r1 = r1.A0B
            X.1Ps r3 = X.AnonymousClass3MW.A0W(r1)
            X.1BI r1 = r0.A3R
            boolean r1 = r3.A0E(r1)
            if (r1 != 0) goto L_0x015c
        L_0x0137:
            X.00H r1 = r0.A4u
            java.lang.Object r1 = r1.get()
            X.2hA r1 = (X.C56252hA) r1
            X.00H r1 = r1.A0J
            java.lang.Object r3 = r1.get()
            X.1Po r3 = (X.C25771Po) r3
            r1 = 36
            X.AnonymousClass3MY.A1P(r13, r3, r1, r5)
            android.net.Uri r2 = r2.A00
            X.4cI r1 = new X.4cI
            r1.<init>(r5, r2)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            X.AnonymousClass4aY.A0O(r13, r0, r1)
            goto L_0x027e
        L_0x015c:
            java.lang.String r1 = "image/jpeg"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0137
            java.lang.String r1 = "image/jpg"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0137
            java.lang.String r1 = "image/png"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0187
            X.0ve r4 = r0.A3F
            r3 = 6314(0x18aa, float:8.848E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r4, r3)
            if (r1 != 0) goto L_0x0187
            goto L_0x0137
        L_0x0181:
            boolean r1 = X.AnonymousClass4aY.A20(r0)
            goto L_0x00e9
        L_0x0187:
            X.5cQ r1 = r0.A2Q
            X.1FY r2 = r1.getActivityNullable()
            r1 = 2131887297(0x7f1204c1, float:1.9409197E38)
            java.lang.String r12 = r2.getString(r1)
            X.5cQ r1 = r0.A2Q
            X.1FY r2 = r1.CFa()
            r1 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r9 = X.C110885hR.A0A(r2, r1)
            java.util.List r13 = java.util.Collections.emptyList()
            X.11C r11 = r0.A2f
            X.5cQ r0 = r0.A2Q
            X.1FY r10 = r0.CFa()
            r14 = -1
            X.4eK r8 = new X.4eK
            r8.<init>((android.view.View) r9, (X.AnonymousClass1F9) r10, (X.AnonymousClass11C) r11, (java.lang.String) r12, (java.util.List) r13, (int) r14, (boolean) r15)
            r8.A03()
            goto L_0x027e
        L_0x01b8:
            java.lang.String r1 = "image/gif"
            boolean r1 = r4.equals(r1)
            java.lang.String r3 = "video/x.looping_mp4"
            if (r1 != 0) goto L_0x01c9
            boolean r1 = r4.equals(r3)
            r14 = 5
            if (r1 == 0) goto L_0x01cb
        L_0x01c9:
            r14 = 23
        L_0x01cb:
            boolean r1 = r4.equals(r3)
            if (r1 == 0) goto L_0x01d5
            java.lang.Integer r13 = X.C108955ca.A0i()
        L_0x01d5:
            java.lang.String r1 = "image/webp.wasticker"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0224
            X.77d r3 = new X.77d
            r3.<init>()
            X.737[] r14 = new X.AnonymousClass737[r15]
            r8 = 0
            java.lang.String r5 = ""
            r7 = r5
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r17 = r15
            r18 = r15
            r19 = r15
            r20 = r15
            r21 = r15
            r22 = r15
            X.73B r4 = new X.73B
            r6 = r5
            r9 = r8
            r16 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r3.A04 = r4
            r1 = 512(0x200, float:7.175E-43)
            r3.A03 = r1
            r3.A02 = r1
            java.lang.String r1 = "image/webp"
            r3.A0E = r1
            android.net.Uri r1 = r2.A00
            java.lang.String r2 = r1.toString()
            r1 = 3
            r3.A0B = r2
            r3.A01 = r1
            X.88B r2 = r0.A7l
            java.lang.Integer r1 = X.AnonymousClass3MY.A0h()
            X.1BI r0 = r0.A3R
            r2.C6w(r0, r3, r1, r15)
            goto L_0x027e
        L_0x0224:
            java.lang.String r1 = "image/png"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0266
            X.0ve r4 = r0.A3F
            r3 = 6314(0x18aa, float:8.848E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r4, r3)
            if (r1 == 0) goto L_0x0266
            X.00H r1 = r0.A5Q
            java.lang.Object r1 = r1.get()
            X.2gp r1 = (X.C56052gp) r1
            X.00H r1 = r1.A09
            java.lang.Object r8 = r1.get()
            X.6jE r8 = (X.C130316jE) r8
            android.net.Uri r9 = r2.A00
            X.1BI r10 = r0.A3R
            X.5tO r12 = r0.A24
            X.5cQ r0 = r0.A2Q
            X.1GP r11 = r0.getSupportFragmentManager()
            X.C18070vi.A0d(r9, r15)
            r0 = 3
            X.C72473Md.A1M(r10, r12, r11, r0)
            X.10I r0 = r8.A05
            X.7R5 r7 = new X.7R5
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13, (int) r14, (int) r15)
            r0.CGF(r7)
            goto L_0x027e
        L_0x0266:
            X.5tO r1 = r0.A24
            android.net.Uri r0 = r2.A00
            r1.A0D(r0, r13, r14)
            goto L_0x027e
        L_0x026e:
            java.lang.String r0 = "textstatus/setuppreview/share-failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1KB r2 = r4.A0K
            if (r2 == 0) goto L_0x0280
            r1 = 2131896086(0x7f122716, float:1.9427023E38)
            r0 = 0
            r2.A08(r1, r0)
        L_0x027e:
            r0 = 1
            return r0
        L_0x0280:
            X.AnonymousClass3MW.A1C()
            goto L_0x0049
        L_0x0285:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x028a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144947Jh.BpE(androidx.core.view.inputmethod.InputContentInfoCompat, int):boolean");
    }
}
