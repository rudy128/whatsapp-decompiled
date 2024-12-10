package X;

/* renamed from: X.7Qh  reason: invalid class name and case insensitive filesystem */
public class C146707Qh implements Runnable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        if (r4 != null) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(int r9, int r10) {
        /*
            r8 = this;
            r0 = 1
            r6 = -1
            r5 = 2
            r4 = 0
            if (r10 == r0) goto L_0x002a
            r7 = 0
            java.lang.Object r5 = r8.A05     // Catch:{ RuntimeException -> 0x0021 }
            X.6hy r5 = (X.C129546hy) r5     // Catch:{ RuntimeException -> 0x0021 }
            X.CUc r3 = r5.A03     // Catch:{ RuntimeException -> 0x0021 }
            java.lang.Object r0 = r8.A03     // Catch:{ RuntimeException -> 0x0021 }
            X.ECr r0 = (X.C28657ECr) r0     // Catch:{ RuntimeException -> 0x0021 }
            int r2 = r0.BTD()     // Catch:{ RuntimeException -> 0x0021 }
            int r1 = r0.BTC()     // Catch:{ RuntimeException -> 0x0021 }
            android.graphics.Bitmap$Config r0 = r5.A00     // Catch:{ RuntimeException -> 0x0021 }
            X.DRN r4 = r3.A00(r0, r2, r1)     // Catch:{ RuntimeException -> 0x0021 }
            r5 = -1
            goto L_0x003c
        L_0x0021:
            r2 = move-exception
            java.lang.Class<X.6hy> r1 = X.C129546hy.class
            java.lang.String r0 = "Failed to create frame bitmap"
            X.C26265CwA.A04(r1, r0, r2)     // Catch:{ all -> 0x0083 }
            return r7
        L_0x002a:
            java.lang.Object r1 = r8.A04     // Catch:{ all -> 0x0083 }
            X.E9u r1 = (X.C28603E9u) r1     // Catch:{ all -> 0x0083 }
            java.lang.Object r0 = r8.A03     // Catch:{ all -> 0x0083 }
            X.ECr r0 = (X.C28657ECr) r0     // Catch:{ all -> 0x0083 }
            r0.BTD()     // Catch:{ all -> 0x0083 }
            r0.BTC()     // Catch:{ all -> 0x0083 }
            X.DRN r4 = r1.BNQ()     // Catch:{ all -> 0x0083 }
        L_0x003c:
            boolean r0 = X.DRN.A02(r4)     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0074
            if (r4 == 0) goto L_0x0074
            java.lang.Object r3 = r8.A05     // Catch:{ all -> 0x0083 }
            X.6hy r3 = (X.C129546hy) r3     // Catch:{ all -> 0x0083 }
            X.CWs r1 = r3.A02     // Catch:{ all -> 0x0083 }
            java.lang.Object r0 = r4.A05()     // Catch:{ all -> 0x0083 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0083 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0083 }
            boolean r0 = r1.A00(r0, r9)     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0074
            java.lang.Class<X.6hy> r2 = X.C129546hy.class
            java.lang.String r1 = "Frame %d ready."
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0083 }
            X.C26265CwA.A02(r2, r0, r1)     // Catch:{ all -> 0x0083 }
            android.util.SparseArray r1 = r3.A01     // Catch:{ all -> 0x0083 }
            monitor-enter(r1)     // Catch:{ all -> 0x0083 }
            java.lang.Object r0 = r8.A04     // Catch:{ all -> 0x0071 }
            X.E9u r0 = (X.C28603E9u) r0     // Catch:{ all -> 0x0071 }
            r0.Bv3(r4, r9)     // Catch:{ all -> 0x0071 }
            monitor-exit(r1)     // Catch:{ all -> 0x0083 }
            r0 = 1
            goto L_0x0077
        L_0x0071:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0083 }
            throw r0     // Catch:{ all -> 0x0083 }
        L_0x0074:
            r0 = 0
            if (r4 == 0) goto L_0x007c
        L_0x0077:
            r4.close()
            if (r0 != 0) goto L_0x0082
        L_0x007c:
            if (r5 == r6) goto L_0x0082
            boolean r0 = r8.A00(r9, r5)
        L_0x0082:
            return r0
        L_0x0083:
            r0 = move-exception
            if (r4 == 0) goto L_0x0089
            r4.close()
        L_0x0089:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146707Qh.A00(int, int):boolean");
    }

    public C146707Qh(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.A00 = i3;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = obj;
        this.A04 = obj2;
        this.A05 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02ec, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02ed, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x031a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r21 = this;
            r2 = r21
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0191;
                case 1: goto L_0x020a;
                case 2: goto L_0x033b;
                case 3: goto L_0x03b1;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r7 = r2.A03
            X.1hg r7 = (X.C32741hg) r7
            int r3 = r2.A01
            int r8 = r2.A02
            java.lang.Object r6 = r2.A04
            X.206 r6 = (X.AnonymousClass206) r6
            java.lang.Object r9 = r2.A05
            java.lang.Integer r9 = (java.lang.Integer) r9
            r5 = 3
            X.64A r2 = new X.64A
            r2.<init>()
            long r0 = X.C108995ce.A0A(r7)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0B = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.A08 = r0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r2.A07 = r4
            X.205 r10 = r6.A0v
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x00f2
            X.1E5 r1 = X.AnonymousClass1E5.A00
        L_0x003b:
            if (r1 == 0) goto L_0x0059
            X.1M9 r0 = r7.A07
            X.1E7 r1 = r0.A0E(r1)
            if (r1 == 0) goto L_0x0059
            boolean r0 = r1.A0C()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A01 = r0
            boolean r0 = r1.A0B()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A02 = r0
        L_0x0059:
            X.00H r0 = r7.A0L
            X.0ve r1 = X.C108955ca.A0R(r0)
            r0 = 8729(0x2219, float:1.2232E-41)
            X.0vf r11 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r11, r1, r0)
            r1 = 0
            if (r0 == 0) goto L_0x007a
            X.36j r0 = X.C63672tV.A02(r6)
            if (r0 == 0) goto L_0x0078
            boolean r0 = r0.A02()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x0078:
            r2.A00 = r1
        L_0x007a:
            X.0ve r1 = r7.A0B
            r0 = 10542(0x292e, float:1.4772E-41)
            boolean r0 = X.C18020vd.A05(r11, r1, r0)
            if (r0 == 0) goto L_0x00c0
            X.00H r0 = r7.A0N
            r0.get()
            int r0 = r6.A0u
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.AnonymousClass25A.A0t(r6)
            java.lang.Integer r0 = X.C63742tc.A02(r1, r0)
            r2.A06 = r0
            boolean r0 = r6 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x00b6
            r0 = r6
            X.21V r0 = (X.AnonymousClass21V) r0
            if (r0 == 0) goto L_0x00b6
            X.2rc r1 = r0.A02
            if (r1 == 0) goto L_0x00b6
            int r0 = r1.A06
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r2.A09 = r0
            int r0 = r1.A08
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r2.A0A = r0
        L_0x00b6:
            r2.A05 = r9
            java.lang.Integer r0 = r7.A03
            r2.A04 = r0
            java.lang.Boolean r0 = r7.A02
            r2.A03 = r0
        L_0x00c0:
            X.18K r0 = r7.A0C
            r0.CC7(r2)
            X.71S r1 = r7.A01
            if (r1 == 0) goto L_0x048a
            r0 = 1
            if (r3 != r0) goto L_0x048a
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Map r0 = r1.A0D
            java.util.Collection r0 = r0.values()
            if (r0 == 0) goto L_0x00f8
            java.util.Iterator r1 = r0.iterator()
        L_0x00dc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f8
            java.lang.Object r0 = r1.next()
            X.2gk r0 = (X.C56012gk) r0
            java.util.Map r0 = r0.A08
            java.util.Collection r0 = r0.values()
            r2.addAll(r0)
            goto L_0x00dc
        L_0x00f2:
            com.whatsapp.jid.UserJid r1 = r6.A0I()
            goto L_0x003b
        L_0x00f8:
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r2.iterator()
        L_0x0100:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0115
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.6xZ r0 = (X.C138716xZ) r0
            java.lang.String r1 = r0.A0T
            java.lang.String r0 = r10.A01
            X.C108975cc.A13(r1, r0, r2, r9)
            goto L_0x0100
        L_0x0115:
            java.util.Iterator r13 = r9.iterator()
        L_0x0119:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x048a
            java.lang.Object r9 = r13.next()
            X.6xZ r9 = (X.C138716xZ) r9
            long r0 = r9.A09
            java.lang.Long r19 = java.lang.Long.valueOf(r0)
            boolean r0 = r9.A0R
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r0)
            java.lang.String r10 = r9.A0T
            com.whatsapp.jid.UserJid r14 = r9.A0S
            java.lang.Integer r0 = r9.A0J
            r12 = 1
            if (r0 == 0) goto L_0x014c
            int r1 = r0.intValue()
            r0 = 4
            if (r1 == r0) goto L_0x0143
            if (r1 != r5) goto L_0x014c
        L_0x0143:
            long r2 = r9.A08
            long r0 = r9.A06
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 >= 0) goto L_0x014c
            r12 = 0
        L_0x014c:
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r12)
            int r0 = r9.A02
            int r0 = X.C138716xZ.A00(r0)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r0)
            r3 = 15
            X.00H r0 = r7.A0O
            java.lang.Object r15 = r0.get()
            X.71A r15 = (X.AnonymousClass71A) r15
            r2 = 1
            r0 = 262144(0x40000, double:1.295163E-318)
            boolean r0 = r6.A11(r0)
            if (r3 != r8) goto L_0x0182
            if (r0 != r2) goto L_0x0119
            r20 = r10
            X.643 r1 = X.AnonymousClass71A.A01(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Integer r0 = X.C17880vN.A0i()
        L_0x017a:
            r1.A06 = r0
            X.18K r0 = r15.A01
            X.C108965cb.A1E(r1, r0)
            goto L_0x0119
        L_0x0182:
            if (r0 != r2) goto L_0x0119
            r20 = r10
            X.643 r1 = X.AnonymousClass71A.A01(r14, r15, r16, r17, r18, r19, r20)
            r1.A04 = r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x017a
        L_0x0191:
            java.lang.Object r0 = r2.A04     // Catch:{ all -> 0x01f8 }
            X.E9u r0 = (X.C28603E9u) r0     // Catch:{ all -> 0x01f8 }
            int r7 = r2.A02     // Catch:{ all -> 0x01f8 }
            boolean r0 = r0.BFj(r7)     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x01b5
            java.lang.Object r4 = r2.A05     // Catch:{ all -> 0x01f8 }
            X.6hy r4 = (X.C129546hy) r4     // Catch:{ all -> 0x01f8 }
            java.lang.Class<X.6hy> r3 = X.C129546hy.class
            java.lang.String r1 = "Frame %d is cached already."
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x01f8 }
            X.C26265CwA.A02(r3, r0, r1)     // Catch:{ all -> 0x01f8 }
            android.util.SparseArray r3 = r4.A01
            monitor-enter(r3)
            int r0 = r2.A01     // Catch:{ all -> 0x0207 }
            r3.remove(r0)     // Catch:{ all -> 0x0207 }
            goto L_0x01f6
        L_0x01b5:
            r3 = 1
            boolean r0 = r2.A00(r7, r3)     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x01cc
            java.lang.Object r6 = r2.A05     // Catch:{ all -> 0x01f8 }
            X.6hy r6 = (X.C129546hy) r6     // Catch:{ all -> 0x01f8 }
            java.lang.Class<X.6hy> r3 = X.C129546hy.class
            java.lang.String r1 = "Prepared frame %d."
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x01f8 }
            X.C26265CwA.A02(r3, r0, r1)     // Catch:{ all -> 0x01f8 }
            goto L_0x01ee
        L_0x01cc:
            java.lang.Object r6 = r2.A05     // Catch:{ all -> 0x01f8 }
            X.6hy r6 = (X.C129546hy) r6     // Catch:{ all -> 0x01f8 }
            java.lang.Class<X.6hy> r1 = X.C129546hy.class
            java.lang.String r5 = "Could not prepare frame %d."
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x01f8 }
            X.AnonymousClass000.A1L(r4, r7)     // Catch:{ all -> 0x01f8 }
            X.EAY r3 = X.C26265CwA.A00     // Catch:{ all -> 0x01f8 }
            r0 = 6
            boolean r0 = r3.BfN(r0)     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x01ee
            java.lang.String r1 = r1.getSimpleName()     // Catch:{ all -> 0x01f8 }
            r0 = 0
            java.lang.String r0 = java.lang.String.format(r0, r5, r4)     // Catch:{ all -> 0x01f8 }
            r3.BJn(r1, r0)     // Catch:{ all -> 0x01f8 }
        L_0x01ee:
            android.util.SparseArray r3 = r6.A01
            monitor-enter(r3)
            int r0 = r2.A01     // Catch:{ all -> 0x0207 }
            r3.remove(r0)     // Catch:{ all -> 0x0207 }
        L_0x01f6:
            monitor-exit(r3)
            return
        L_0x01f8:
            r1 = move-exception
            java.lang.Object r0 = r2.A05
            X.6hy r0 = (X.C129546hy) r0
            android.util.SparseArray r3 = r0.A01
            monitor-enter(r3)
            int r0 = r2.A01     // Catch:{ all -> 0x0207 }
            r3.remove(r0)     // Catch:{ all -> 0x0207 }
            monitor-exit(r3)
            throw r1
        L_0x0207:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x020a:
            java.lang.Object r8 = r2.A03
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel r8 = (com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel) r8
            int r7 = r2.A01
            int r6 = r2.A02
            java.lang.Object r5 = r2.A04
            X.5u1 r5 = (X.C115445u1) r5
            java.lang.Object r2 = r2.A05
            X.5u4 r2 = (X.C115475u4) r2
            r4 = 0
            X.00H r3 = r8.A08
            X.70I r0 = X.C108945cZ.A0q(r3)
            int r11 = r0.A01()
            X.70I r1 = X.C108945cZ.A0q(r3)
            java.lang.String r0 = "save_profile_photo"
            X.70I r1 = X.AnonymousClass70I.A00(r1, r3, r0, r11)
            X.6E9 r0 = X.AnonymousClass6E9.A00
            r1.A04(r0, r11, r7)
            X.70I r1 = X.C108945cZ.A0q(r3)
            X.6EI r0 = X.AnonymousClass6EI.A00
            r1.A04(r0, r11, r6)
            X.00H r0 = r8.A0A     // Catch:{ all -> 0x02f1 }
            r0.get()     // Catch:{ all -> 0x02f1 }
            android.graphics.Bitmap r7 = r5.A01     // Catch:{ all -> 0x02f1 }
            int r1 = r7.getWidth()     // Catch:{ all -> 0x02f1 }
            int r0 = r7.getHeight()     // Catch:{ all -> 0x02f1 }
            if (r1 == r0) goto L_0x0267
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02f1 }
            java.lang.String r0 = "AvatarProfilePhotoGenerator/bitmap not squared (w="
            X.C108975cc.A0o(r7, r0, r1)     // Catch:{ all -> 0x02f1 }
            java.lang.String r0 = ", h="
            r1.append(r0)     // Catch:{ all -> 0x02f1 }
            int r0 = r7.getHeight()     // Catch:{ all -> 0x02f1 }
            java.lang.String r0 = X.AnonymousClass001.A1L(r1, r0)     // Catch:{ all -> 0x02f1 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02f1 }
        L_0x0267:
            int r6 = r2.A00     // Catch:{ all -> 0x02f1 }
            android.graphics.Bitmap$Config r2 = r7.getConfig()     // Catch:{ all -> 0x02f1 }
            if (r2 == 0) goto L_0x02e7
            int r1 = r7.getWidth()     // Catch:{ all -> 0x02f1 }
            int r0 = r7.getHeight()     // Catch:{ all -> 0x02f1 }
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r1, r0, r2)     // Catch:{ all -> 0x02f1 }
            android.graphics.Canvas r2 = X.C108955ca.A0E(r5)     // Catch:{ all -> 0x02f1 }
            r2.drawColor(r6)     // Catch:{ all -> 0x02f1 }
            r1 = 0
            r0 = 0
            r2.drawBitmap(r7, r1, r1, r0)     // Catch:{ all -> 0x02f1 }
            int r0 = r5.getWidth()     // Catch:{ all -> 0x02f1 }
            r2 = 196(0xc4, float:2.75E-43)
            if (r0 >= r2) goto L_0x02ce
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02f1 }
            java.lang.String r0 = "AvatarProfilePhotoGenerator/bitmap width too low ("
            X.C108975cc.A0o(r5, r0, r1)     // Catch:{ all -> 0x02f1 }
            java.lang.String r0 = "), will be scaled up."
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x02f1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x02f1 }
        L_0x02a1:
            int r0 = r5.getWidth()     // Catch:{ all -> 0x02f1 }
            r2 = 640(0x280, float:8.97E-43)
            if (r0 <= r2) goto L_0x02cb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02f1 }
            java.lang.String r0 = "AvatarProfilePhotoGenerator/bitmap width too high ("
            X.C108975cc.A0o(r5, r0, r1)     // Catch:{ all -> 0x02f1 }
            java.lang.String r0 = "), will be scaled down."
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x02f1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x02f1 }
        L_0x02bb:
            int r0 = r1.intValue()     // Catch:{ all -> 0x02f1 }
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createScaledBitmap(r5, r0, r0, r4)     // Catch:{ all -> 0x02f1 }
            X.C18070vi.A0X(r5)     // Catch:{ all -> 0x02f1 }
        L_0x02c6:
            java.io.ByteArrayOutputStream r2 = X.C108945cZ.A15()     // Catch:{ all -> 0x02f1 }
            goto L_0x02d0
        L_0x02cb:
            if (r1 == 0) goto L_0x02c6
            goto L_0x02bb
        L_0x02ce:
            r1 = 0
            goto L_0x02a1
        L_0x02d0:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x02e5 }
            r0 = 100
            r5.compress(r1, r0, r2)     // Catch:{ all -> 0x02e5 }
            r2.close()     // Catch:{ all -> 0x02f1 }
            r5.recycle()     // Catch:{ all -> 0x02f1 }
            byte[] r10 = r2.toByteArray()     // Catch:{ all -> 0x02f1 }
            X.C18070vi.A0X(r10)     // Catch:{ all -> 0x02f1 }
            goto L_0x02f6
        L_0x02e5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x02ec }
        L_0x02e7:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x02f1 }
            goto L_0x02f0
        L_0x02ec:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x02f1 }
        L_0x02f0:
            throw r0     // Catch:{ all -> 0x02f1 }
        L_0x02f1:
            r0 = move-exception
            X.1IU r10 = X.C108945cZ.A1J(r0)
        L_0x02f6:
            java.lang.Throwable r1 = X.C30671eK.A00(r10)
            if (r1 != 0) goto L_0x031a
            X.70I r1 = X.C108945cZ.A0q(r3)
            java.lang.String r0 = "generated_bitmap"
            r1.A03(r11, r0)
            X.11S r0 = r8.A02
            r0.A0I()
            X.1E8 r9 = r0.A0D
            if (r9 == 0) goto L_0x048a
            X.1KB r0 = r8.A01
            r12 = 1
            X.Aiu r7 = new X.Aiu
            r7.<init>(r8, r9, r10, r11, r12)
            r0.A0J(r7)
            return
        L_0x031a:
            java.lang.String r0 = "AvatarProfilePhotoViewModel/unable to compose profile photo"
            com.whatsapp.util.Log.e(r0, r1)
            X.00H r0 = r8.A07
            X.6ue r3 = X.C108945cZ.A0p(r0)
            java.lang.String r2 = "unable_to_compose_profile_photo"
            java.lang.String r1 = r1.getMessage()
            r0 = 6
            r3.A02(r0, r2, r1)
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel.A04(r8, r4)
            X.1KB r1 = r8.A01
            r0 = 2131889981(0x7f120f3d, float:1.941464E38)
            r1.A09(r0, r4)
            return
        L_0x033b:
            int r5 = r2.A01
            int r0 = r2.A02
            java.lang.Object r1 = r2.A03
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            java.lang.Object r3 = r2.A04
            X.7DY r3 = (X.AnonymousClass7DY) r3
            java.lang.Object r2 = r2.A05
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            if (r5 <= r0) goto L_0x034e
            r5 = r0
        L_0x034e:
            r1.width = r5
            r1.height = r5
            android.view.ViewGroup r0 = r3.A0C
            java.lang.String r4 = "cameraProgressWrapper"
            if (r0 == 0) goto L_0x03a9
            r0.setLayoutParams(r1)
            X.8Av r0 = r3.A0K
            if (r0 != 0) goto L_0x0366
            java.lang.String r0 = "camera"
        L_0x0361:
            X.C18070vi.A11(r0)
        L_0x0364:
            r0 = 0
            throw r0
        L_0x0366:
            boolean r0 = r0.Bgt()
            if (r0 == 0) goto L_0x037f
            r2.width = r5
            float r1 = (float) r5
            r0 = 1058013184(0x3f100000, float:0.5625)
            float r1 = r1 / r0
            int r0 = (int) r1
            r2.height = r0
            android.view.View r0 = r3.A0A
            if (r0 != 0) goto L_0x037c
            java.lang.String r0 = "cameraView"
            goto L_0x0361
        L_0x037c:
            r0.setLayoutParams(r2)
        L_0x037f:
            r1 = 2131168384(0x7f070c80, float:1.7951068E38)
            X.118 r0 = r3.A1D
            android.content.Context r2 = r0.A00
            int r1 = X.AnonymousClass3MZ.A01(r2, r1)
            android.view.ViewGroup r0 = r3.A0C
            if (r0 == 0) goto L_0x03a9
            r0.setPadding(r1, r1, r1, r1)
            r0 = 2131168383(0x7f070c7f, float:1.7951066E38)
            int r1 = X.AnonymousClass3MZ.A01(r2, r0)
            android.view.ViewGroup r0 = r3.A0E
            if (r0 != 0) goto L_0x039f
            java.lang.String r0 = "cameraViewFrameWrapper"
            goto L_0x0361
        L_0x039f:
            r0.setPadding(r1, r1, r1, r1)
            android.view.ViewGroup r0 = r3.A0D
            if (r0 != 0) goto L_0x03ad
            java.lang.String r0 = "cameraViewFrame"
            goto L_0x0361
        L_0x03a9:
            X.C18070vi.A11(r4)
            goto L_0x0364
        L_0x03ad:
            X.AnonymousClass4aO.A02(r0)
            return
        L_0x03b1:
            java.lang.Object r6 = r2.A03
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r6 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r6
            java.lang.Object r7 = r2.A04
            android.net.Uri r7 = (android.net.Uri) r7
            int r13 = r2.A01
            int r9 = r2.A02
            java.lang.Object r8 = r2.A05
            r15 = 0
            r0 = 4
            X.C18070vi.A0d(r8, r0)
            X.4rF r5 = X.C98494rF.A00()
            X.0vl r0 = r6.A0R
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r0 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r0
            X.00H r0 = r0.A0B
            java.lang.Object r0 = r0.get()
            X.6oC r0 = (X.C133116oC) r0
            X.1Sl r0 = r0.A05
            java.lang.String r0 = X.C108975cc.A0c(r7, r0)
            boolean r0 = X.C26521Sl.A0f(r0)
            if (r0 == 0) goto L_0x0441
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r0 = "from"
            java.lang.String r1 = r7.getQueryParameter(r0)
            if (r1 == 0) goto L_0x03fe
            int r0 = r1.length()
            if (r0 == 0) goto L_0x03fe
            long r0 = java.lang.Long.parseLong(r1)
        L_0x03f8:
            long r0 = r2.toMicros(r0)
            r4 = 0
            goto L_0x0401
        L_0x03fe:
            r0 = 0
            goto L_0x03f8
        L_0x0401:
            java.lang.String r2 = "ThumbnailUtils/createVideoThumbnail"
            X.5dc r3 = new X.5dc     // Catch:{ RuntimeException -> 0x043d, IOException -> 0x0439, Exception -> 0x0475 }
            r3.<init>(r2)     // Catch:{ RuntimeException -> 0x043d, IOException -> 0x0439, Exception -> 0x0475 }
            java.lang.Boolean r2 = X.C17960vV.A01     // Catch:{ all -> 0x042f }
            r3.setDataSource(r6, r7)     // Catch:{ all -> 0x042f }
            r2 = 3
            android.graphics.Bitmap r1 = r3.getFrameAtTime(r0, r2)     // Catch:{ all -> 0x042f }
            if (r1 != 0) goto L_0x042b
            android.graphics.Bitmap r1 = r3.getFrameAtTime()     // Catch:{ all -> 0x042f }
            if (r1 != 0) goto L_0x042b
            byte[] r0 = r3.getEmbeddedPicture()     // Catch:{ all -> 0x042f }
            if (r0 == 0) goto L_0x0426
            android.graphics.Bitmap r1 = X.C72473Md.A0E(r0)     // Catch:{ all -> 0x042f }
            if (r1 != 0) goto L_0x042b
        L_0x0426:
            java.lang.String r0 = "mediafileutils/createVideoThumbnail/no bitmap created"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x042f }
        L_0x042b:
            r3.close()     // Catch:{ RuntimeException -> 0x043d, IOException -> 0x0439, Exception -> 0x0475 }
            goto L_0x047c
        L_0x042f:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0434 }
            goto L_0x0438
        L_0x0434:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ RuntimeException -> 0x043d, IOException -> 0x0439, Exception -> 0x0475 }
        L_0x0438:
            throw r1     // Catch:{ RuntimeException -> 0x043d, IOException -> 0x0439, Exception -> 0x0475 }
        L_0x0439:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createVideoThumbnail/unable to load video"
            goto L_0x0478
        L_0x043d:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createVideoThumbnail/corrupt video file"
            goto L_0x0478
        L_0x0441:
            X.1Nq r10 = r6.A0F     // Catch:{ 2RM -> 0x0464 }
            if (r10 == 0) goto L_0x0457
            int r12 = r13 / 2
            com.whatsapp.nativelibloader.WhatsAppLibLoader r0 = r6.A0G     // Catch:{ 2RM -> 0x0464 }
            if (r0 == 0) goto L_0x045d
            boolean r14 = r0.A04()     // Catch:{ 2RM -> 0x0464 }
            r11 = r7
            android.graphics.Bitmap r0 = r10.A08(r11, r12, r13, r14, r15)     // Catch:{ 2RM -> 0x0464 }
            r5.element = r0     // Catch:{ 2RM -> 0x0464 }
            goto L_0x047e
        L_0x0457:
            java.lang.String r0 = "mediaUtils"
            X.C18070vi.A11(r0)     // Catch:{ 2RM -> 0x0464 }
            goto L_0x0462
        L_0x045d:
            java.lang.String r0 = "whatsAppLibLoader"
            X.C18070vi.A11(r0)     // Catch:{ 2RM -> 0x0464 }
        L_0x0462:
            r0 = 0
            throw r0     // Catch:{ 2RM -> 0x0464 }
        L_0x0464:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "InAppBugReporting/screenshot/not-an-image "
            X.C108995ce.A1J(r7, r0, r1, r2)
            r0 = 2131889970(0x7f120f32, float:1.9414619E38)
            r6.BhQ(r0)
            goto L_0x047e
        L_0x0475:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createVideoThumbnail/unknown exception"
        L_0x0478:
            com.whatsapp.util.Log.e(r0, r1)
            r1 = r4
        L_0x047c:
            r5.element = r1
        L_0x047e:
            X.1KB r0 = r6.A05
            r10 = 14
            X.7Q7 r4 = new X.7Q7
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.A0J(r4)
        L_0x048a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146707Qh.run():void");
    }
}
