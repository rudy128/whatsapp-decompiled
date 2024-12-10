package X;

/* renamed from: X.Ak2  reason: case insensitive filesystem */
public class C21435Ak2 implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C21435Ak2(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public static void A00(AnonymousClass10I r1, Object obj, Object obj2, Object obj3, int i) {
        r1.CGF(new C21435Ak2(obj, obj2, obj3, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:173:0x05d8, code lost:
        r0.A03(new X.C172748tx(r3, r4, r5, r6, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x05e0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x061a, code lost:
        r9 = (X.C62312rC) X.C18070vi.A0E(r9.A08);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0622, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        r3 = r7.A0Q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0625, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x062a, code lost:
        if (r3 >= 100) goto L_0x062e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x062c, code lost:
        r3 = 100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x062e, code lost:
        r9.A01(r10, (X.B8R) null, (java.lang.Long) null, java.lang.Long.valueOf(r3), 50, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x063b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x079c, code lost:
        r0 = "newsletterMultiAdminUtils";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0be6, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0bea, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0d3c, code lost:
        r6.A0J(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0d3f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0d7b, code lost:
        r3.A0T.A0c(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0d80, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0d9e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0da2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0da5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0da6, code lost:
        X.CDX.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0da9, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ed, code lost:
        if (r9 < 100) goto L_0x01f6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0889  */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x0caf  */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x0cb5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0440;
                case 1: goto L_0x0455;
                case 2: goto L_0x046b;
                case 3: goto L_0x04b5;
                case 4: goto L_0x0017;
                case 5: goto L_0x005f;
                case 6: goto L_0x04d7;
                case 7: goto L_0x0522;
                case 8: goto L_0x058f;
                case 9: goto L_0x009e;
                case 10: goto L_0x00db;
                case 11: goto L_0x05e1;
                case 12: goto L_0x0112;
                case 13: goto L_0x0181;
                case 14: goto L_0x0642;
                case 15: goto L_0x071f;
                case 16: goto L_0x0200;
                case 17: goto L_0x073f;
                case 18: goto L_0x0764;
                case 19: goto L_0x0229;
                case 20: goto L_0x07a0;
                case 21: goto L_0x07c4;
                case 22: goto L_0x0818;
                case 23: goto L_0x0982;
                case 24: goto L_0x0257;
                case 25: goto L_0x028c;
                case 26: goto L_0x09a2;
                case 27: goto L_0x02ce;
                case 28: goto L_0x0007;
                case 29: goto L_0x0007;
                case 30: goto L_0x0367;
                case 31: goto L_0x09db;
                case 32: goto L_0x0a08;
                case 33: goto L_0x0a57;
                case 34: goto L_0x0a85;
                case 35: goto L_0x0ac2;
                case 36: goto L_0x0add;
                case 37: goto L_0x0b8a;
                case 38: goto L_0x0b9a;
                case 39: goto L_0x0beb;
                case 40: goto L_0x0c21;
                case 41: goto L_0x0c31;
                case 42: goto L_0x0c81;
                case 43: goto L_0x0396;
                case 44: goto L_0x0cd8;
                case 45: goto L_0x03f0;
                case 46: goto L_0x0cea;
                case 47: goto L_0x0d12;
                case 48: goto L_0x0d55;
                case 49: goto L_0x0d69;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r0.A01
            X.72F r2 = (X.AnonymousClass72F) r2
            java.lang.Object r1 = r0.A02
            X.AEX r1 = (X.AEX) r1
            java.lang.Object r0 = r0.A03
            X.7Ki r0 = (X.C145197Ki) r0
            X.AnonymousClass72F.A00(r1, r0, r2)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r3 = r0.A01
            X.1nj r3 = (X.C36341nj) r3
            java.lang.Object r5 = r0.A02
            X.2cn r5 = (X.C53602cn) r5
            java.lang.Object r6 = r0.A03
            X.0vk r6 = (X.C18090vk) r6
            X.00H r0 = r3.A07     // Catch:{ all -> 0x002f }
            X.1OZ r2 = X.C17880vN.A0U(r0)     // Catch:{ all -> 0x002f }
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.A0E(r0)     // Catch:{ all -> 0x002f }
            goto L_0x0033
        L_0x002f:
            r0 = move-exception
            X.C30691eM.A00(r0)
        L_0x0033:
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0016
            X.00H r0 = r3.A07
            X.1OZ r0 = X.C17880vN.A0U(r0)
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x0047
            r6.invoke()
            return
        L_0x0047:
            java.lang.ref.WeakReference r0 = r5.A01
            java.lang.Object r4 = r0.get()
            if (r4 == 0) goto L_0x0016
            X.00H r0 = r3.A06
            X.1KB r0 = X.C108945cZ.A0a(r0)
            r7 = 5
            X.7Py r2 = new X.7Py
            r2.<init>(r3, r4, r5, r6, r7)
            r0.A0J(r2)
            return
        L_0x005f:
            java.lang.Object r6 = r0.A01
            X.4aG r6 = (X.C88634aG) r6
            java.lang.Object r5 = r0.A02
            X.1ch r5 = (X.C29681ch) r5
            java.lang.Object r1 = r0.A03
            X.4rF r1 = (X.C98494rF) r1
            r0 = 2
            X.C18070vi.A0d(r1, r0)
            java.lang.Object r1 = r1.element
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0016
            r1.size()
            java.lang.Object r0 = X.C108955ca.A0p(r1)
            X.206 r0 = (X.AnonymousClass206) r0
            X.205 r0 = r0.A0v
            java.lang.String r4 = r0.A01
            java.util.ArrayList r3 = X.C108965cb.A0t(r4)
            java.util.Iterator r2 = r1.iterator()
        L_0x008e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0d81
            X.206 r0 = X.C17880vN.A0Y(r2)
            long r0 = r0.A0y
            X.C17880vN.A1R(r3, r0)
            goto L_0x008e
        L_0x009e:
            java.lang.Object r3 = r0.A01
            X.1md r3 = (X.C35681md) r3
            java.lang.Object r2 = r0.A02
            X.1BI r2 = (X.AnonymousClass1BI) r2
            java.lang.Object r1 = r0.A03
            java.util.Set r1 = (java.util.Set) r1
            X.00H r0 = r3.A0V
            X.1i5 r5 = X.AnonymousClass8BR.A0M(r0)
            X.1CJ r0 = r5.A02
            X.1ci r4 = r0.A0A(r2)
            boolean r0 = r4 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x0016
            X.2Dk r4 = (X.C46162Dk) r4
            if (r4 == 0) goto L_0x0016
            r4.A09 = r1
            android.content.ContentValues r3 = X.C17880vN.A08()
            java.util.Set r0 = r4.A09
            r2 = 0
            java.util.Iterator r1 = r0.iterator()
        L_0x00cb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0d8c
            java.lang.Object r0 = r1.next()
            X.2Qo r0 = (X.C49462Qo) r0
            int r0 = r0.value
            r2 = r2 | r0
            goto L_0x00cb
        L_0x00db:
            java.lang.Object r4 = r0.A01
            X.AW1 r4 = (X.AW1) r4
            java.lang.Object r5 = r0.A02
            X.1ch r5 = (X.C29681ch) r5
            java.lang.Object r3 = r0.A03
            X.2Dk r3 = (X.C46162Dk) r3
            X.00H r0 = r4.A0C
            java.lang.Object r2 = r0.get()
            X.1NJ r2 = (X.AnonymousClass1NJ) r2
            r0 = -1
            int r0 = r2.A02(r5, r0)
            long r1 = (long) r0
            r9 = 50
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0102
            X.9Ig r1 = r3.A02
            X.9Ig r0 = X.C179509Ig.GUEST
            if (r1 != r0) goto L_0x0016
        L_0x0102:
            X.00H r0 = r4.A08
            java.lang.Object r4 = X.C18070vi.A0E(r0)
            X.2rC r4 = (X.C62312rC) r4
            r6 = 0
            r11 = 0
            r8 = r6
            r7 = r6
            r4.A01(r5, r6, r7, r8, r9, r11)
            return
        L_0x0112:
            java.lang.Object r3 = r0.A01
            X.AW1 r3 = (X.AW1) r3
            java.lang.Object r9 = r0.A02
            X.1ch r9 = (X.C29681ch) r9
            java.lang.Object r5 = r0.A03
            X.1ci r5 = (X.C29691ci) r5
            X.00H r0 = r3.A0C
            java.lang.Object r0 = r0.get()
            X.1NJ r0 = (X.AnonymousClass1NJ) r0
            long r6 = r0.A06(r9)
            r1 = 100
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0134
            r3.A03(r9)
            return
        L_0x0134:
            X.00H r0 = r3.A08
            java.lang.Object r8 = X.C18070vi.A0E(r0)
            X.2rC r8 = (X.C62312rC) r8
            java.lang.Long r12 = java.lang.Long.valueOf(r6)
            r10 = 0
            r15 = 0
            r13 = 50
            r11 = r10
            r8.A01(r9, r10, r11, r12, r13, r15)
            r3.A04(r9)
            monitor-enter(r5)
            X.206 r4 = r5.A0f     // Catch:{ all -> 0x0d99 }
            monitor-exit(r5)
            if (r4 != 0) goto L_0x015d
            X.00H r0 = r3.A03
            java.lang.Object r0 = r0.get()
            X.1R3 r0 = (X.AnonymousClass1R3) r0
            X.206 r4 = r0.A05(r9)
        L_0x015d:
            boolean r0 = r4 instanceof X.AnonymousClass23N
            if (r0 == 0) goto L_0x0016
            X.00H r0 = r3.A05
            java.lang.Object r0 = r0.get()
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            X.0ve r2 = r0.A02
            r1 = 10259(0x2813, float:1.4376E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0016
            X.00H r0 = r3.A06
            java.lang.Object r0 = r0.get()
            X.2nT r0 = (X.C60152nT) r0
            r0.A02(r4)
            return
        L_0x0181:
            java.lang.Object r2 = r0.A01
            X.1m3 r2 = (X.C35321m3) r2
            java.lang.Object r8 = r0.A02
            X.1ch r8 = (X.C29681ch) r8
            java.lang.Object r1 = r0.A03
            X.206 r1 = (X.AnonymousClass206) r1
            X.00H r0 = r2.A07
            java.lang.Object r7 = r0.get()
            X.AW1 r7 = (X.AW1) r7
            long r11 = r1.A0y
            r5 = 100
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0016
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0016
            X.00H r0 = r7.A09
            java.lang.Object r3 = r0.get()
            X.1hF r3 = (X.C32471hF) r3
            r1 = 0
            X.1Cd r0 = r3.A03
            X.1at r2 = r0.get()
            java.lang.String[] r4 = X.C17880vN.A1Z()     // Catch:{ all -> 0x0da3 }
            X.1LW r0 = r3.A00     // Catch:{ all -> 0x0da3 }
            X.AnonymousClass1LW.A03(r0, r8, r4, r1)     // Catch:{ all -> 0x0da3 }
            X.C17890vO.A1K(r4, r11)     // Catch:{ all -> 0x0da3 }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0da3 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0da3 }
            java.lang.String r1 = "SELECT sort_id  FROM message  WHERE chat_row_id = ? AND sort_id < ?  ORDER BY sort_id DESC LIMIT 1"
            java.lang.String r0 = "GET_MESSAGE_SERVER_ID_BEFORE"
            android.database.Cursor r3 = r3.A0A(r1, r0, r4)     // Catch:{ all -> 0x0da3 }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x0d9c }
            if (r0 == 0) goto L_0x01f0
            java.lang.String r0 = "sort_id"
            int r1 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0d9c }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x0d9c }
            if (r0 != 0) goto L_0x01f0
            long r9 = r3.getLong(r1)     // Catch:{ all -> 0x0d9c }
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0d9c }
            if (r0 == 0) goto L_0x01f0
            r3.close()     // Catch:{ all -> 0x0da3 }
            r2.close()
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x01f8
            goto L_0x01f6
        L_0x01f0:
            r3.close()     // Catch:{ all -> 0x0da3 }
            r2.close()
        L_0x01f6:
            r9 = 100
        L_0x01f8:
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0016
            r7.A05(r8, r9, r11)
            return
        L_0x0200:
            java.lang.Object r1 = r0.A01
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            java.lang.Object r3 = r0.A02
            java.lang.Number r3 = (java.lang.Number) r3
            java.lang.Object r2 = r0.A03
            java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2
            X.C18070vi.A0i(r1, r2)
            java.lang.Object r1 = r1.get()
            X.CcK r1 = (X.C25272CcK) r1
            if (r1 == 0) goto L_0x0016
            int r0 = r3.intValue()
            r1.A00 = r0
            java.lang.Object r0 = r2.get()
            X.1qy r0 = (X.C38251qy) r0
            if (r0 == 0) goto L_0x0016
            r0.A0e(r1)
            return
        L_0x0229:
            java.lang.Object r2 = r0.A02
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            java.lang.Object r1 = r0.A03
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r0 = 2131435441(0x7f0b1fb1, float:1.8492724E38)
            java.lang.Object r0 = r2.getTag(r0)
            boolean r0 = X.C72463Mc.A1Y(r0)
            if (r0 == 0) goto L_0x0016
            boolean r0 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x024f
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            if (r1 == 0) goto L_0x024f
            android.graphics.Bitmap r0 = r1.getBitmap()
            if (r0 == 0) goto L_0x024f
            r2.setImageBitmap(r0)
        L_0x024f:
            r1 = 0
            r0 = 2131435441(0x7f0b1fb1, float:1.8492724E38)
            r2.setTag(r0, r1)
            return
        L_0x0257:
            java.lang.Object r4 = r0.A01
            X.1aB r4 = (X.C28411aB) r4
            java.lang.Object r3 = r0.A02
            java.lang.Object r2 = r0.A03
            X.1aA r2 = (X.C28401aA) r2
            r0 = 0
            boolean r1 = r4.Bck(r0)
            r4.CJc(r3)
            boolean r0 = r4.Bck(r0)
            if (r1 != 0) goto L_0x0016
            if (r0 == 0) goto L_0x0016
            java.lang.String r3 = r4.BVY()
            r1 = 1
            X.00H r0 = r2.A01
            r0.get()
            X.1To r2 = r2.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.9qc r1 = new X.9qc
            r1.<init>(r0, r3)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r2.A0L(r1, r0)
            return
        L_0x028c:
            java.lang.Object r2 = r0.A01
            X.4lQ r2 = (X.C94934lQ) r2
            java.lang.Object r5 = r0.A02
            X.7Mo r5 = (X.C145777Mo) r5
            java.lang.Object r4 = r0.A03
            X.206 r4 = (X.AnonymousClass206) r4
            r3 = 0
            boolean r1 = X.AnonymousClass8BU.A1X(r4)
            X.1f4 r9 = r2.A07
            boolean r0 = r9.A0B()
            if (r0 != 0) goto L_0x0016
            int r0 = X.C145777Mo.A15
            r5.A0C(r0, r3, r1)
            X.4aV r3 = X.AnonymousClass4aV.A00
            X.1L1 r1 = r2.A0A
            X.205 r0 = r4.A0v
            X.1BI r0 = r0.A00
            X.AnonymousClass4aV.A0A(r0, r1)
            X.7Mo r1 = r9.A00()
            if (r1 == 0) goto L_0x02be
            r0 = 1
            r1.A0T = r0
        L_0x02be:
            X.0vb r10 = r2.A08
            android.view.View r4 = r2.A00
            X.1pZ r8 = r2.A05
            X.11S r5 = r2.A02
            X.1M9 r6 = r2.A03
            X.1Me r7 = r2.A04
            r3.A0B(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x02ce:
            java.lang.Object r5 = r0.A01
            X.72F r5 = (X.AnonymousClass72F) r5
            java.lang.Object r4 = r0.A02
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r1 = r0.A03
            X.7Kh r1 = (X.C145187Kh) r1
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0dad
            X.5ra r7 = r1.A00
            androidx.recyclerview.widget.RecyclerView r1 = r7.A05
            r0 = 0
            r1.setVisibility(r0)
            java.util.List r8 = r7.A0J
            monitor-enter(r8)
            X.5ky r1 = r7.A08     // Catch:{ all -> 0x0daa }
            X.AEX r0 = r7.A07     // Catch:{ all -> 0x0daa }
            r1.A01 = r0     // Catch:{ all -> 0x0daa }
            r8.clear()     // Catch:{ all -> 0x0daa }
            r0 = 0
            X.6nH r1 = new X.6nH     // Catch:{ all -> 0x0daa }
            r1.<init>(r0)     // Catch:{ all -> 0x0daa }
            r0 = 1
            r1.A00 = r0     // Catch:{ all -> 0x0daa }
            X.AEX r0 = r7.A07     // Catch:{ all -> 0x0daa }
            boolean r0 = X.AnonymousClass000.A1X(r0)
            r1.A02 = r0     // Catch:{ all -> 0x0daa }
            r8.add(r1)     // Catch:{ all -> 0x0daa }
            java.util.Iterator r6 = r4.iterator()     // Catch:{ all -> 0x0daa }
        L_0x030c:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0daa }
            if (r0 == 0) goto L_0x0333
            java.lang.Object r3 = r6.next()     // Catch:{ all -> 0x0daa }
            X.AEX r3 = (X.AEX) r3     // Catch:{ all -> 0x0daa }
            X.6nH r2 = new X.6nH     // Catch:{ all -> 0x0daa }
            r2.<init>(r3)     // Catch:{ all -> 0x0daa }
            X.AEX r0 = r7.A07     // Catch:{ all -> 0x0daa }
            if (r0 == 0) goto L_0x032c
            java.lang.String r1 = r0.A0F     // Catch:{ all -> 0x0daa }
            java.lang.String r0 = r3.A0F     // Catch:{ all -> 0x0daa }
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x0daa }
            r0 = 1
            if (r1 != 0) goto L_0x032d
        L_0x032c:
            r0 = 0
        L_0x032d:
            r2.A02 = r0     // Catch:{ all -> 0x0daa }
            r8.add(r2)     // Catch:{ all -> 0x0daa }
            goto L_0x030c
        L_0x0333:
            X.5ky r0 = r7.A08     // Catch:{ all -> 0x0daa }
            r0.A0U(r8)     // Catch:{ all -> 0x0daa }
            monitor-exit(r8)     // Catch:{ all -> 0x0daa }
            com.facebook.shimmer.ShimmerFrameLayout r1 = r7.A06
            r0 = 8
            r1.setVisibility(r0)
            android.widget.TextView r1 = r7.A03
            r0 = 2131895601(0x7f122531, float:1.942604E38)
            r1.setText(r0)
            java.util.Iterator r4 = r4.iterator()
        L_0x034c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r3 = r4.next()
            X.00H r0 = r5.A0D
            X.10T r2 = X.C17880vN.A0V(r0)
            r1 = 15
            X.7KY r0 = new X.7KY
            r0.<init>(r3, r1)
            r2.notifyAllObservers(r0)
            goto L_0x034c
        L_0x0367:
            java.lang.Object r4 = r0.A01
            X.AQF r4 = (X.AQF) r4
            java.lang.Object r1 = r0.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.A03
            java.util.List r0 = (java.util.List) r0
            r4.A04(r1)
            java.util.Iterator r3 = r0.iterator()
        L_0x037a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r2 = r3.next()
            X.0yx r2 = (X.C19760yx) r2
            java.lang.Object r0 = r2.A00
            if (r0 == 0) goto L_0x037a
            X.AW0 r0 = (X.AW0) r0
            java.lang.String r1 = r0.A0K
            java.lang.Object r0 = r2.A01
            X.205 r0 = (X.AnonymousClass205) r0
            X.AQF.A02(r4, r0, r1)
            goto L_0x037a
        L_0x0396:
            java.lang.Object r1 = r0.A01
            X.A0R r1 = (X.A0R) r1
            java.lang.Object r5 = r0.A02
            X.8pD r5 = (X.AnonymousClass8pD) r5
            java.lang.Object r4 = r0.A03
            android.app.Activity r4 = (android.app.Activity) r4
            if (r5 == 0) goto L_0x03e8
            X.AEs r0 = r5.A00
            if (r0 == 0) goto L_0x03e8
            X.0ve r0 = r1.A0B
            int r0 = X.AnonymousClass8BX.A03(r0)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r3 = 2131889331(0x7f120cb3, float:1.9413323E38)
            if (r0 == 0) goto L_0x03ba
            r3 = 2131889332(0x7f120cb4, float:1.9413325E38)
        L_0x03ba:
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            r1 = 0
            java.lang.String r0 = r5.A02()
            java.lang.String r1 = X.C17880vN.A0q(r4, r0, r2, r1, r3)
        L_0x03c7:
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r0 = "message"
            r2.putString(r0, r1)
            r0 = 2131889329(0x7f120cb1, float:1.9413318E38)
            java.lang.String r1 = r4.getString(r0)
            java.lang.String r0 = "title"
            r2.putString(r0, r1)
            r1 = 101(0x65, float:1.42E-43)
            boolean r0 = X.AnonymousClass4Yv.A02(r4)
            if (r0 != 0) goto L_0x0016
            r4.showDialog(r1, r2)
            return
        L_0x03e8:
            r0 = 2131889330(0x7f120cb2, float:1.941332E38)
            java.lang.String r1 = r4.getString(r0)
            goto L_0x03c7
        L_0x03f0:
            java.lang.Object r5 = r0.A01
            com.whatsapp.payments.ui.viewmodel.BrazilGetPixInfoViewModel r5 = (com.whatsapp.payments.ui.viewmodel.BrazilGetPixInfoViewModel) r5
            java.lang.Object r4 = r0.A02
            X.4rF r4 = (X.C98494rF) r4
            java.lang.Object r3 = r0.A03
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            X.1DT r1 = r5.A00
            java.lang.String r0 = "STARTED"
            r1.A0E(r0)
            X.0ve r2 = r5.A04
            X.1Ln r1 = r5.A03
            r0 = 0
            com.whatsapp.jid.UserJid r3 = X.C60432o1.A01(r0, r1, r2, r3, r0)
            r4.element = r3
            if (r3 == 0) goto L_0x0016
            X.1OZ r1 = r5.A06
            X.9Ye r0 = new X.9Ye
            r0.<init>(r5)
            X.9bO r2 = new X.9bO
            r2.<init>(r1, r0)
            X.1OZ r4 = r2.A00
            java.lang.String r7 = r4.A0B()
            r0 = 11
            X.9F6 r1 = new X.9F6
            r1.<init>((java.lang.String) r7, (com.whatsapp.jid.UserJid) r3, (int) r0)
            java.lang.Object r6 = r1.A00
            X.1ca r6 = (X.C29621ca) r6
            r0 = 15
            X.Aco r5 = new X.Aco
            r5.<init>(r2, r1, r0)
            r9 = 32000(0x7d00, double:1.581E-319)
            r8 = 204(0xcc, float:2.86E-43)
            r4.A0N(r5, r6, r7, r8, r9)
            return
        L_0x0440:
            java.lang.Object r3 = r0.A01
            com.whatsapp.migration.transfer.ui.P2pTransferViewModel r3 = (com.whatsapp.migration.transfer.ui.P2pTransferViewModel) r3
            java.lang.Object r2 = r0.A02
            android.net.wifi.WifiManager r2 = (android.net.wifi.WifiManager) r2
            java.lang.Object r1 = r0.A03
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            X.9jJ r0 = new X.9jJ
            r0.<init>(r2)
            r3.A0e(r1, r2, r0)
            return
        L_0x0455:
            java.lang.Object r4 = r0.A01
            X.10T r4 = (X.AnonymousClass10T) r4
            java.lang.Object r3 = r0.A02
            java.lang.Object r2 = r0.A03
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            r1 = 2
            X.4op r0 = new X.4op
            r0.<init>(r2, r3, r1)
            r4.notifyAllObservers(r0)
            return
        L_0x046b:
            java.lang.Object r5 = r0.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r5 = (com.whatsapp.newsletter.NewsletterInfoActivity) r5
            java.lang.Object r2 = r0.A02
            X.1BI r2 = (X.AnonymousClass1BI) r2
            java.lang.Object r4 = r0.A03
            java.util.List r4 = (java.util.List) r4
            r3 = 0
            boolean r1 = X.AnonymousClass8BU.A1X(r4)
            X.11S r0 = r5.A02
            boolean r0 = r0.A0O(r2)
            if (r0 == 0) goto L_0x049d
            r0 = 2131889500(0x7f120d5c, float:1.9413665E38)
            java.lang.String r3 = r5.getString(r0)
        L_0x048b:
            X.C18070vi.A0b(r3)
            X.1GP r2 = r5.getSupportFragmentManager()
            X.9IF r1 = X.AnonymousClass9IF.DISMISS
            r0 = 0
            com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog r0 = X.C181519Qu.A00(r1, r3, r0, r4)
            X.C20098A7b.A02(r0, r2)
            return
        L_0x049d:
            r2 = 2131889493(0x7f120d55, float:1.9413651E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.00H r0 = r5.A14
            if (r0 == 0) goto L_0x079c
            java.lang.Object r0 = r0.get()
            X.4XL r0 = (X.AnonymousClass4XL) r0
            java.lang.String r0 = r0.A01(r4)
            java.lang.String r3 = X.C17880vN.A0q(r5, r0, r1, r3, r2)
            goto L_0x048b
        L_0x04b5:
            java.lang.Object r2 = r0.A01
            X.1nj r2 = (X.C36341nj) r2
            java.lang.Object r3 = r0.A02
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r1 = r0.A03
            X.4rF r1 = (X.C98494rF) r1
            r0 = 2
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r2.A03
            java.lang.Object r2 = r0.get()
            X.1L9 r2 = (X.AnonymousClass1L9) r2
            java.lang.Object r1 = r1.element
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.String r0 = "NewsletterLinkLauncher:openNewsletterScreen"
            r2.A0B(r3, r1, r0)
            return
        L_0x04d7:
            java.lang.Object r1 = r0.A01
            X.1md r1 = (X.C35681md) r1
            java.lang.Object r3 = r0.A02
            X.1ch r3 = (X.C29681ch) r3
            java.lang.Object r6 = r0.A03
            java.lang.Integer r6 = (java.lang.Integer) r6
            X.00H r0 = r1.A0S
            java.lang.Object r5 = r0.get()
            X.9hA r5 = (X.C188279hA) r5
            X.00H r0 = r1.A0V
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.1i5 r0 = (X.C32991i5) r0
            X.9oP r4 = new X.9oP
            r4.<init>(r0, r3, r1)
            X.A7K r2 = X.A7K.A00()
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "jid"
            r2.A07(r0, r1)
            boolean r0 = X.AnonymousClass000.A1W(r1)
            X.C199610h.A07(r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterJoinResponseImpl> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterJoinResponseImpl.class
            java.lang.String r0 = "NewsletterJoin"
            X.AIj r1 = X.AIj.A00(r2, r1, r0)
            X.00H r0 = r5.A00
            r0.get()
            X.00H r0 = r5.A01
            X.A2g r0 = X.C108975cc.A0J(r1, r0)
            r7 = 0
            goto L_0x05d8
        L_0x0522:
            java.lang.Object r3 = r0.A01
            X.1md r3 = (X.C35681md) r3
            java.lang.Object r7 = r0.A02
            X.2Dk r7 = (X.C46162Dk) r7
            java.lang.Object r2 = r0.A03
            X.1CJ r1 = r3.A0E
            X.1BI r0 = r7.A08()
            X.C18070vi.A0X(r0)
            X.AnonymousClass4aS.A06(r1, r0)
            X.00H r4 = r3.A0V
            X.1i5 r5 = X.AnonymousClass8BR.A0M(r4)
            X.1BI r1 = r7.A08()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.C18070vi.A0z(r1, r0)
            X.1ch r1 = (X.C29681ch) r1
            java.lang.String r0 = r7.A0T
            X.1D6 r0 = r5.A06(r1, r0)
            java.lang.Object r5 = r0.first
            X.1ci r5 = (X.C29691ci) r5
            java.lang.Object r0 = r0.second
            long r9 = X.C17880vN.A05(r0)
            r6 = 0
            r8 = -4
            X.2Dk r0 = X.C46162Dk.A00(r5, r6, r7, r8, r9)
            java.util.List r1 = X.C18070vi.A0M(r0)
            X.1i5 r0 = X.AnonymousClass8BR.A0M(r4)
            r0.A0A(r1)
            X.00H r0 = r3.A0T
            java.lang.Object r0 = r0.get()
            X.A8r r0 = (X.C20131A8r) r0
            r0.A0I(r1)
            X.00H r0 = r3.A0W
            java.lang.Object r0 = r0.get()
            X.2lA r0 = (X.C58732lA) r0
            r0.A00(r7)
            X.00H r0 = r3.A0M
            X.1KB r6 = X.C108945cZ.A0a(r0)
            r0 = 26
            X.Ail r4 = new X.Ail
            r4.<init>(r2, r0)
            goto L_0x0d3c
        L_0x058f:
            java.lang.Object r1 = r0.A01
            X.1md r1 = (X.C35681md) r1
            java.lang.Object r3 = r0.A02
            X.1ch r3 = (X.C29681ch) r3
            java.lang.Object r6 = r0.A03
            java.lang.Integer r6 = (java.lang.Integer) r6
            X.00H r0 = r1.A0S
            java.lang.Object r5 = r0.get()
            X.9hA r5 = (X.C188279hA) r5
            X.00H r0 = r1.A0V
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.1i5 r0 = (X.C32991i5) r0
            X.9oP r4 = new X.9oP
            r4.<init>(r0, r3, r1)
            X.A7K r2 = X.A7K.A00()
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "jid"
            r2.A07(r0, r1)
            boolean r0 = X.AnonymousClass000.A1W(r1)
            X.C199610h.A07(r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterLeaveResponseImpl> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterLeaveResponseImpl.class
            java.lang.String r0 = "NewsletterLeave"
            X.AIj r1 = X.AIj.A00(r2, r1, r0)
            X.00H r0 = r5.A00
            r0.get()
            X.00H r0 = r5.A01
            X.A2g r0 = X.C108975cc.A0J(r1, r0)
            r7 = 1
        L_0x05d8:
            X.8tx r2 = new X.8tx
            r2.<init>(r3, r4, r5, r6, r7)
            r0.A03(r2)
            return
        L_0x05e1:
            java.lang.Object r9 = r0.A01
            X.AW1 r9 = (X.AW1) r9
            java.lang.Object r10 = r0.A02
            X.1ch r10 = (X.C29681ch) r10
            java.lang.Object r7 = r0.A03
            X.1ci r7 = (X.C29691ci) r7
            java.util.Map r8 = r9.A0H
            monitor-enter(r8)
            java.lang.Object r0 = r8.get(r10)     // Catch:{ all -> 0x063f }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x063f }
            if (r0 == 0) goto L_0x0609
            long r1 = r0.longValue()     // Catch:{ all -> 0x063f }
        L_0x05fc:
            X.00H r0 = r9.A0D     // Catch:{ all -> 0x063f }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x063f }
            X.11P r0 = (X.AnonymousClass11P) r0     // Catch:{ all -> 0x063f }
            long r5 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x063f }
            goto L_0x060c
        L_0x0609:
            r1 = 0
            goto L_0x05fc
        L_0x060c:
            long r3 = r5 - r1
            r1 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0616
            monitor-exit(r8)
            return
        L_0x0616:
            X.AnonymousClass8BT.A1O(r10, r8, r5)     // Catch:{ all -> 0x063f }
            monitor-exit(r8)
            X.00H r0 = r9.A08
            java.lang.Object r9 = X.C18070vi.A0E(r0)
            X.2rC r9 = (X.C62312rC) r9
            monitor-enter(r7)
            long r3 = r7.A0Q     // Catch:{ all -> 0x063c }
            monitor-exit(r7)
            r1 = 100
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x062e
            r3 = 100
        L_0x062e:
            java.lang.Long r13 = java.lang.Long.valueOf(r3)
            r11 = 0
            r16 = 0
            r14 = 50
            r12 = r11
            r9.A01(r10, r11, r12, r13, r14, r16)
            return
        L_0x063c:
            r1 = move-exception
            monitor-exit(r7)
            throw r1
        L_0x063f:
            r1 = move-exception
            monitor-exit(r8)
            throw r1
        L_0x0642:
            java.lang.Object r5 = r0.A01
            X.1m3 r5 = (X.C35321m3) r5
            java.lang.Object r3 = r0.A02
            X.2sw r3 = (X.C63362sw) r3
            java.lang.Object r1 = r0.A03
            X.34z r1 = (X.C688634z) r1
            r6 = 1
            X.00H r0 = r5.A0A     // Catch:{ 1hd -> 0x06f7 }
            java.lang.Object r0 = r0.get()     // Catch:{ 1hd -> 0x06f7 }
            X.2qg r0 = (X.C62032qg) r0     // Catch:{ 1hd -> 0x06f7 }
            X.206 r9 = r0.A01(r1, r3)     // Catch:{ 1hd -> 0x06f7 }
            X.00H r0 = r5.A08     // Catch:{ 1hd -> 0x06f7 }
            r0.get()     // Catch:{ 1hd -> 0x06f7 }
            X.25J r0 = X.C29681ch.A03     // Catch:{ 1hd -> 0x06f7 }
            X.205 r2 = r9.A0v     // Catch:{ 1hd -> 0x06f7 }
            X.1BI r10 = r2.A00     // Catch:{ 1hd -> 0x06f7 }
            boolean r0 = r10 instanceof X.C29681ch     // Catch:{ 1hd -> 0x06f7 }
            if (r0 == 0) goto L_0x06ea
            X.1ch r10 = (X.C29681ch) r10     // Catch:{ 1hd -> 0x06f7 }
            if (r10 == 0) goto L_0x06ea
            X.1N7 r7 = r5.A03     // Catch:{ 1hd -> 0x06f7 }
            long r0 = r3.A04     // Catch:{ 1hd -> 0x06f7 }
            r4 = 0
            X.2tQ r8 = X.AnonymousClass1N7.A00(r7, r4, r0)     // Catch:{ 1hd -> 0x06f7 }
            if (r8 == 0) goto L_0x067d
            r0 = 4
            r8.A05(r0)     // Catch:{ 1hd -> 0x06f7 }
        L_0x067d:
            X.00H r0 = r5.A09     // Catch:{ 1hd -> 0x06f7 }
            java.lang.Object r0 = r0.get()     // Catch:{ 1hd -> 0x06f7 }
            X.2nT r0 = (X.C60152nT) r0     // Catch:{ 1hd -> 0x06f7 }
            boolean r11 = r0.A04(r10, r9)     // Catch:{ 1hd -> 0x06f7 }
            X.2lD r7 = new X.2lD     // Catch:{ 1hd -> 0x06f7 }
            r7.<init>()     // Catch:{ 1hd -> 0x06f7 }
            long r0 = r3.A04     // Catch:{ 1hd -> 0x06f7 }
            r7.A00 = r0     // Catch:{ 1hd -> 0x06f7 }
            java.lang.String r0 = "message"
            r7.A06 = r0     // Catch:{ 1hd -> 0x06f7 }
            java.lang.String r0 = r2.A01     // Catch:{ 1hd -> 0x06f7 }
            r7.A08 = r0     // Catch:{ 1hd -> 0x06f7 }
            r7.A02 = r10     // Catch:{ 1hd -> 0x06f7 }
            java.lang.String r0 = r3.A0R     // Catch:{ 1hd -> 0x06f7 }
            r7.A09 = r0     // Catch:{ 1hd -> 0x06f7 }
            boolean r0 = r9 instanceof X.AnonymousClass23N     // Catch:{ 1hd -> 0x06f7 }
            if (r0 == 0) goto L_0x06a8
            java.lang.String r0 = "8"
            r7.A07 = r0     // Catch:{ 1hd -> 0x06f7 }
        L_0x06a8:
            X.0ve r2 = r5.A01     // Catch:{ 1hd -> 0x06f7 }
            r1 = 5871(0x16ef, float:8.227E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ 1hd -> 0x06f7 }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ 1hd -> 0x06f7 }
            if (r0 == 0) goto L_0x06ca
            java.lang.Integer r0 = r3.A0G     // Catch:{ 1hd -> 0x06f7 }
            if (r0 == 0) goto L_0x06ca
            X.10I r4 = r5.A06     // Catch:{ 1hd -> 0x06f7 }
            r0 = 13
            X.Ak2 r2 = new X.Ak2     // Catch:{ 1hd -> 0x06f7 }
            r2.<init>(r5, r10, r9, r0)     // Catch:{ 1hd -> 0x06f7 }
            java.lang.String r1 = "NewsletterIncomingMessageManager/processIncomingMessageInternal"
            r0 = 0
            X.C18070vi.A0d(r1, r0)     // Catch:{ 1hd -> 0x06f7 }
            r4.CGF(r2)     // Catch:{ 1hd -> 0x06f7 }
        L_0x06ca:
            if (r8 == 0) goto L_0x06d0
            r0 = 5
            r8.A05(r0)     // Catch:{ 1hd -> 0x06f7 }
        L_0x06d0:
            if (r11 != 0) goto L_0x06e0
            java.lang.String r4 = "error"
            r2 = 552(0x228, float:7.74E-43)
            java.util.Map r1 = r7.A0A     // Catch:{ 1hd -> 0x06f7 }
            X.1MD r0 = new X.1MD     // Catch:{ 1hd -> 0x06f7 }
            r0.<init>((java.lang.String) r4, (int) r2)     // Catch:{ 1hd -> 0x06f7 }
            r1.put(r4, r0)     // Catch:{ 1hd -> 0x06f7 }
        L_0x06e0:
            X.2nR r0 = r7.A00()     // Catch:{ 1hd -> 0x06f7 }
            X.C18070vi.A0b(r0)     // Catch:{ 1hd -> 0x06f7 }
            X.C35321m3.A00(r5, r0)     // Catch:{ 1hd -> 0x06f7 }
        L_0x06ea:
            X.1PT r1 = r5.A04     // Catch:{ 1hd -> 0x06f7 }
            int r0 = r3.A03     // Catch:{ 1hd -> 0x06f7 }
            r1.A0H(r3, r0, r6)     // Catch:{ 1hd -> 0x06f7 }
            X.1lq r0 = r5.A02     // Catch:{ 1hd -> 0x06f7 }
            r0.A01(r3)     // Catch:{ 1hd -> 0x06f7 }
            return
        L_0x06f7:
            r1 = move-exception
            java.lang.String r0 = "NewsletterIncomingMessageManager/failed to parse a message"
            com.whatsapp.util.Log.e(r0, r1)
            X.1PT r2 = r5.A04
            r1 = 0
            r0 = 5
            r2.A0I(r3, r1, r0)
            java.lang.String r0 = "491"
            X.2nR r0 = r3.A07(r0)
            X.C35321m3.A00(r5, r0)
            X.121 r4 = r5.A00
            X.205 r6 = r3.A0B
            com.whatsapp.jid.Jid r0 = r3.A0Y
            X.1BI r5 = X.C22971Dz.A00(r0)
            long r8 = r3.A0X
            r7 = 491(0x1eb, float:6.88E-43)
            r4.BBO(r5, r6, r7, r8)
            return
        L_0x071f:
            java.lang.Object r1 = r0.A01
            X.4Qm r1 = (X.C86164Qm) r1
            java.lang.Object r4 = r0.A02
            X.5bA r4 = (X.C108125bA) r4
            java.lang.Object r3 = r0.A03
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.1KB r0 = r1.A01
            r0.A04()
            r1 = 0
            X.43p r0 = new X.43p
            r0.<init>(r3, r1)
            java.util.List r0 = X.C18070vi.A0M(r0)
            r4.C7U(r0)
            return
        L_0x073f:
            java.lang.Object r4 = r0.A02
            java.lang.Object r3 = r0.A03
            android.view.View r3 = (android.view.View) r3
            if (r4 != 0) goto L_0x074d
            java.lang.String r0 = "NewsletterAcceptAdminInviteSheet/decode-photo-bytes-returns-null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x074d:
            android.view.animation.AlphaAnimation r2 = X.C108985cd.A0H()
            r0 = 100
            r2.setDuration(r0)
            r1 = 10
            X.3c1 r0 = new X.3c1
            r0.<init>(r4, r3, r1)
            r2.setAnimationListener(r0)
            r3.startAnimation(r2)
            return
        L_0x0764:
            java.lang.Object r6 = r0.A01
            com.whatsapp.newsletter.ui.multiadmin.NewsletterRevokeAdminInviteSheet r6 = (com.whatsapp.newsletter.ui.multiadmin.NewsletterRevokeAdminInviteSheet) r6
            java.lang.Object r5 = r0.A02
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r0.A03
            X.1FL r4 = (X.AnonymousClass1FL) r4
            r3 = 0
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            r2 = 2131895338(0x7f12242a, float:1.9425506E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.00H r0 = r6.A07
            if (r0 == 0) goto L_0x079c
            java.lang.Object r0 = r0.get()
            X.4XL r0 = (X.AnonymousClass4XL) r0
            java.lang.String r0 = r0.A01(r5)
            java.lang.String r2 = X.AnonymousClass3MX.A16(r6, r0, r1, r3, r2)
            X.C18070vi.A0X(r2)
            X.9IF r1 = X.AnonymousClass9IF.REVOKE
            r0 = 0
            com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog r0 = X.C181519Qu.A00(r1, r2, r0, r5)
            r0.A00 = r6
            X.C20098A7b.A00(r0, r4)
            return
        L_0x079c:
            java.lang.String r0 = "newsletterMultiAdminUtils"
            goto L_0x0be6
        L_0x07a0:
            java.lang.Object r5 = r0.A01
            X.206 r5 = (X.AnonymousClass206) r5
            java.lang.Object r4 = r0.A02
            X.2jH r4 = (X.C57562jH) r4
            java.lang.Object r3 = r0.A03
            X.206 r3 = (X.AnonymousClass206) r3
            r2 = 0
            X.205 r0 = r5.A0v
            X.1BI r1 = r0.A00
            if (r1 == 0) goto L_0x07be
            X.00H r0 = r4.A01
            java.lang.Object r0 = r0.get()
            X.1Q1 r0 = (X.AnonymousClass1Q1) r0
            r0.A03(r1, r2)
        L_0x07be:
            X.1Lg r0 = r4.A00
            r0.A03(r5, r3)
            return
        L_0x07c4:
            java.lang.Object r1 = r0.A01
            X.1gx r1 = (X.C32291gx) r1
            java.lang.Object r9 = r0.A02
            X.206 r9 = (X.AnonymousClass206) r9
            java.lang.Object r2 = r0.A03
            if (r9 != 0) goto L_0x07da
            java.util.Map r1 = r1.A0J
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r1.put(r2, r0)
            return
        L_0x07da:
            java.util.Map r0 = r1.A0J
            java.util.List r8 = X.AnonymousClass8BS.A0t(r2, r0)
            X.C32291gx.A01(r8)
            if (r8 == 0) goto L_0x080b
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r6 = r8.iterator()
        L_0x07ed:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0807
            java.lang.Object r5 = r6.next()
            X.2nW r5 = (X.C60182nW) r5
            X.206 r0 = r5.A00
            long r3 = r0.A0y
            long r1 = r9.A0y
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x07ed
            r7.add(r5)
            goto L_0x07ed
        L_0x0807:
            r8.removeAll(r7)
            goto L_0x0814
        L_0x080b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "messagenotification/cache/reset list null for "
            X.C17900vP.A0X(r2, r0, r1)
        L_0x0814:
            X.C32291gx.A01(r8)
            return
        L_0x0818:
            java.lang.Object r3 = r0.A01
            X.1gx r3 = (X.C32291gx) r3
            java.lang.Object r5 = r0.A02
            X.1BI r5 = (X.AnonymousClass1BI) r5
            java.lang.Object r10 = r0.A03
            X.206 r10 = (X.AnonymousClass206) r10
            java.util.Map r6 = r3.A0J
            java.util.List r2 = X.AnonymousClass8BS.A0t(r5, r6)
            if (r2 != 0) goto L_0x0834
            r0 = 1
            java.util.ArrayList r2 = r3.A06(r5, r0)
            r6.put(r5, r2)
        L_0x0834:
            boolean r0 = X.C32291gx.A02(r10, r2)
            if (r0 != 0) goto L_0x097e
            boolean r0 = r10 instanceof X.AnonymousClass23N
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L_0x089e
            r0 = r10
            X.23N r0 = (X.AnonymousClass23N) r0
            java.lang.String r7 = r0.A01
            X.C17960vV.A07(r7)
            X.205 r0 = r10.A0v
            X.1BI r0 = r0.A00
            X.205 r8 = X.AnonymousClass205.A01(r0, r7, r4)
        L_0x0850:
            int r0 = r2.size()
            if (r4 >= r0) goto L_0x088c
            java.lang.Object r6 = r2.get(r4)
            X.2nW r6 = (X.C60182nW) r6
            X.206 r0 = r6.A00
            X.205 r0 = r0.A0v
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x0878
            boolean r0 = r6 instanceof X.AnonymousClass3LC
            if (r0 == 0) goto L_0x089b
            X.3LC r6 = (X.AnonymousClass3LC) r6
            X.205 r0 = r6.BWG()
            java.lang.String r0 = r0.A01
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x089b
        L_0x0878:
            if (r4 < 0) goto L_0x088c
            int r0 = r2.size()
            if (r4 >= r0) goto L_0x088c
            r2.remove(r4)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x088c
            r3.A09(r5)
        L_0x088c:
            int r3 = r2.size()
            r0 = 7
            if (r3 <= r0) goto L_0x097e
            int r0 = X.AnonymousClass3MX.A02(r2, r1)
            r2.remove(r0)
            goto L_0x088c
        L_0x089b:
            int r4 = r4 + 1
            goto L_0x0850
        L_0x089e:
            boolean r0 = r10 instanceof X.AnonymousClass23U
            if (r0 != 0) goto L_0x088c
            boolean r0 = X.AnonymousClass206.A08(r10)
            if (r0 == 0) goto L_0x0928
            X.36k r7 = X.C60472o5.A00(r10)
            boolean r0 = X.AnonymousClass206.A08(r10)
            if (r0 == 0) goto L_0x0928
            if (r7 == 0) goto L_0x0928
            X.A51 r0 = r7.A01()
            if (r0 == 0) goto L_0x0928
            X.205 r0 = r0.A01
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0928
            java.util.Iterator r9 = r2.iterator()
        L_0x08c4:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0928
            java.lang.Object r7 = r9.next()
            X.2nW r7 = (X.C60182nW) r7
            boolean r0 = r7 instanceof X.AnonymousClass2KY
            if (r0 == 0) goto L_0x08c4
            X.2KY r7 = (X.AnonymousClass2KY) r7
            boolean r0 = X.AnonymousClass206.A08(r10)
            if (r0 == 0) goto L_0x08c4
            X.36k r0 = X.C60472o5.A00(r10)
            if (r0 == 0) goto L_0x08c4
            X.2mk r0 = r7.A00
            X.205 r0 = r0.A04
            X.1BI r8 = r0.A00
            X.205 r0 = r10.A0v
            X.1BI r0 = r0.A00
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x08c4
            r7.A00 = r10
            X.36k r0 = X.C60472o5.A00(r10)
            if (r0 == 0) goto L_0x091b
            java.lang.Long r4 = r0.A02()
            X.A51 r3 = r0.A01()
            if (r4 == 0) goto L_0x091b
            if (r3 == 0) goto L_0x091b
            X.2mk r0 = r7.A00
            java.util.Set r12 = r0.A05
            r12.add(r4)
            long r13 = r4.longValue()
            X.205 r11 = r3.A01
            X.2mk r9 = new X.2mk
            r15 = r13
            r9.<init>(r10, r11, r12, r13, r15)
            r7.A00 = r9
        L_0x091b:
            X.3D2 r0 = new X.3D2
            r0.<init>(r1)
            java.util.Collections.sort(r2, r0)
            r6.put(r5, r2)
            goto L_0x088c
        L_0x0928:
            boolean r0 = X.AnonymousClass206.A08(r10)
            if (r0 == 0) goto L_0x0974
            X.36k r0 = X.C60472o5.A00(r10)
            java.lang.Long r6 = r0.A02()
            long r13 = r6.longValue()
            X.00H r0 = r3.A0I
            X.206 r5 = X.AnonymousClass1W2.A02(r0, r13)
            if (r5 == 0) goto L_0x088c
            X.205 r11 = r5.A0v
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x088c
            java.util.HashSet r12 = X.C17880vN.A12()
            r12.add(r6)
            long r15 = r5.A0y
            X.2mk r9 = new X.2mk
            r9.<init>(r10, r11, r12, r13, r15)
            X.1gu r0 = r3.A04
            X.2KY r5 = r0.A00(r9)
        L_0x095c:
            X.17d r0 = r3.A0E
            X.1Qr r0 = r0.A0C
            java.lang.Integer r3 = r10.A0S
            if (r3 == 0) goto L_0x0979
            X.0vl r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0979
            goto L_0x088c
        L_0x0974:
            X.2nW r5 = r3.A05(r10)
            goto L_0x095c
        L_0x0979:
            r2.add(r4, r5)
            goto L_0x088c
        L_0x097e:
            X.C32291gx.A01(r2)
            return
        L_0x0982:
            java.lang.Object r1 = r0.A01
            com.whatsapp.notification.MessageOtpNotificationBroadcastReceiver r1 = (com.whatsapp.notification.MessageOtpNotificationBroadcastReceiver) r1
            java.lang.Object r4 = r0.A02
            X.206 r4 = (X.AnonymousClass206) r4
            java.lang.Object r3 = r0.A03
            android.content.Context r3 = (android.content.Context) r3
            r2 = 0
            X.70P r1 = r1.A02
            if (r1 == 0) goto L_0x099e
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageTemplateHsm"
            X.C18070vi.A0z(r4, r0)
            X.21o r4 = (X.C439521o) r4
            r1.A04(r3, r4, r2)
            return
        L_0x099e:
            java.lang.String r0 = "otpMessageService"
            goto L_0x0be6
        L_0x09a2:
            java.lang.Object r4 = r0.A01
            X.8yn r4 = (X.C175488yn) r4
            java.lang.Object r2 = r0.A02
            X.1ca r2 = (X.C29621ca) r2
            java.lang.Object r3 = r0.A03
            X.9xU r3 = (X.C197919xU) r3
            java.lang.Object r0 = r4.A01
            X.8z5 r0 = (X.C175668z5) r0
            X.1em r0 = r0.A05
            r1 = 0
            X.AW0 r2 = r0.A03(r1, r2)
            if (r2 != 0) goto L_0x09c6
            X.A7B r0 = X.A7B.A00()
            X.C175488yn.A00(r4, r0)
            X.C197919xU.A00(r1, r3)
            return
        L_0x09c6:
            X.96K r1 = r3.A01
            X.1QS r0 = r1.A0c
            X.1QR r0 = X.AnonymousClass8BR.A0O(r0)
            r0.A0c(r2)
            X.1KB r6 = r1.A0I
            r0 = 2
            X.Ak0 r4 = new X.Ak0
            r4.<init>(r3, r2, r0)
            goto L_0x0d3c
        L_0x09db:
            java.lang.Object r4 = r0.A01
            X.21L r4 = (X.AnonymousClass21L) r4
            java.lang.Object r3 = r0.A02
            X.9nE r3 = (X.C191819nE) r3
            java.lang.Object r2 = r0.A03
            java.io.File r2 = (java.io.File) r2
            X.AEt r0 = r4.A00
            if (r0 == 0) goto L_0x0a02
            X.AEE r0 = r0.A05
            if (r0 == 0) goto L_0x0a02
            X.AEi r1 = r0.A00
            if (r1 == 0) goto L_0x0a02
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.1L7 r0 = r3.A02
            java.lang.String r0 = r0.A09(r2)
            X.C18070vi.A0X(r0)
            r1.A00 = r0
        L_0x0a02:
            X.121 r0 = r3.A05
            r0.CQw(r4)
            return
        L_0x0a08:
            java.lang.Object r4 = r0.A01
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r6 = r0.A02
            X.904 r6 = (X.AnonymousClass904) r6
            java.lang.Object r5 = r0.A03
            X.9iY r3 = X.C198239y1.A03
            java.lang.String r2 = "query"
            java.lang.Object r1 = r4.get(r2)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            X.C18070vi.A0z(r1, r0)
            java.util.Map r1 = (java.util.Map) r1
            X.9y1 r2 = r3.A00(r2, r1)
            java.lang.String r0 = "args"
            java.lang.Object r4 = r4.get(r0)
            boolean r1 = r4 instanceof java.util.Map
            r0 = 0
            if (r1 == 0) goto L_0x0a55
            java.util.Map r4 = (java.util.Map) r4
        L_0x0a32:
            X.A1N r3 = r6.A01
            java.lang.String r1 = "client"
            java.util.Map r0 = r2.A01
            if (r0 == 0) goto L_0x0a53
            java.lang.Object r2 = r0.get(r1)
            X.9y1 r2 = (X.C198239y1) r2
        L_0x0a40:
            X.1Wu r1 = X.C27621Wu.A00
            X.Abc r0 = r3.A00
            java.util.LinkedHashMap r1 = r3.A01(r2, r0, r1, r4)
            X.1KB r6 = r6.A00
            r0 = 49
            X.3Bz r4 = new X.3Bz
            r4.<init>(r5, r1, r0)
            goto L_0x0d3c
        L_0x0a53:
            r2 = 0
            goto L_0x0a40
        L_0x0a55:
            r4 = r0
            goto L_0x0a32
        L_0x0a57:
            java.lang.Object r5 = r0.A01
            X.91U r5 = (X.AnonymousClass91U) r5
            java.lang.Object r2 = r0.A02
            com.whatsapp.payments.ui.widget.PaymentView r2 = (com.whatsapp.payments.ui.widget.PaymentView) r2
            java.lang.Object r4 = r0.A03
            X.1KN r4 = (X.AnonymousClass1KN) r4
            X.1ex r3 = r5.A0N
            java.lang.String r1 = r2.getPaymentNote()
            java.util.List r0 = r2.getMentionedJids()
            X.210 r2 = r5.A4c(r1, r0)
            X.1BI r1 = r5.A0G
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 == 0) goto L_0x0a80
            com.whatsapp.jid.UserJid r1 = r5.A0J
        L_0x0a7b:
            r0 = 0
            r3.A09(r4, r0, r1, r2)
            return
        L_0x0a80:
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A00(r1)
            goto L_0x0a7b
        L_0x0a85:
            java.lang.Object r3 = r0.A01
            com.whatsapp.payments.ui.BrazilOrderDetailsActivity r3 = (com.whatsapp.payments.ui.BrazilOrderDetailsActivity) r3
            java.lang.Object r2 = r0.A02
            X.AEn r2 = (X.C20279AEn) r2
            java.lang.Object r4 = r0.A03
            X.BBR r4 = (X.BBR) r4
            X.1KB r1 = r3.A05
            r0 = 12
            X.C21426Ajt.A00(r1, r3, r0)
            X.8Gd r5 = r3.A0C
            java.lang.String r7 = r2.A08
            X.21K r6 = r3.A0K
            X.1jA r8 = r3.A08
            X.122 r3 = r3.A07
            r12 = 0
            boolean r13 = X.C18070vi.A17(r7, r6)
            X.C108985cd.A1D(r8, r3)
            r5.A00 = r13
            X.AXI r2 = new X.AXI
            r2.<init>(r3, r4, r5, r6, r7)
            X.1QS r1 = r5.A07
            java.lang.String r0 = "FBPAY"
            X.AZ9 r10 = r1.A05(r0)
            X.C17960vV.A07(r10)
            r9 = r2
            r11 = r7
            r8.A00(r9, r10, r11, r12, r13)
            return
        L_0x0ac2:
            java.lang.Object r1 = r0.A01
            X.Aa4 r1 = (X.C20826Aa4) r1
            java.lang.Object r5 = r0.A02
            X.206 r5 = (X.AnonymousClass206) r5
            java.lang.Object r4 = r0.A03
            X.AW0 r4 = (X.AW0) r4
            com.whatsapp.payments.ui.BrazilOrderDetailsActivity r3 = r1.A01
            r3.CEx()
            long r1 = r5.A0x
            X.205 r0 = r5.A0v
            X.1BI r0 = r0.A00
            r3.CMz(r4, r0, r1)
            return
        L_0x0add:
            java.lang.Object r1 = r0.A01
            X.9bc r1 = (X.C184849bc) r1
            java.lang.Object r7 = r0.A03
            X.AEn r7 = (X.C20279AEn) r7
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r6 = r1.A01
            X.ARR r5 = r1.A00
            X.1R2 r0 = r6.A0W
            java.lang.Integer r4 = r0.A0O(r7)
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r4 == r0) goto L_0x0b37
            X.0ve r0 = r6.A0E
            boolean r0 = X.AnonymousClass1R2.A0F(r0, r7)
            if (r0 != 0) goto L_0x0b37
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r4 == r0) goto L_0x0b07
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r4 != r0) goto L_0x0b12
        L_0x0b07:
            java.lang.String r2 = "upi_pay_privacy_policy"
            r1 = 1
            X.9Ec r0 = new X.9Ec
            r0.<init>(r2, r1)
            r3.add(r0)
        L_0x0b12:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r4 == r0) goto L_0x0b1a
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r4 != r0) goto L_0x0b25
        L_0x0b1a:
            java.lang.String r2 = "pay_tos_v3"
            r1 = 1
            X.9Ec r0 = new X.9Ec
            r0.<init>(r2, r1)
            r3.add(r0)
        L_0x0b25:
            r0 = 1
            X.9Eo r1 = new X.9Eo
            r1.<init>(r3, r0)
            X.1ex r0 = r6.A0N
            r8 = 2
            X.AXH r3 = new X.AXH
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A0F(r3, r1)
            return
        L_0x0b37:
            X.1QO r0 = r6.A0P
            X.0ve r2 = r0.A02
            r1 = 8583(0x2187, float:1.2027E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0b7f
            X.AES r2 = r6.A01
            if (r2 == 0) goto L_0x0b7f
            int r1 = r2.A00
            r0 = -1
            if (r1 != r0) goto L_0x0b52
            X.AEV r0 = r2.A02
            if (r0 == 0) goto L_0x0b5a
        L_0x0b52:
            java.util.List r0 = r2.A04
            boolean r0 = X.C137476vW.A00(r0)
            if (r0 == 0) goto L_0x0b7f
        L_0x0b5a:
            X.Aa6 r3 = r6.A09
            X.1KB r2 = r3.A0E
            r1 = 17
            X.Aju r0 = new X.Aju
            r0.<init>(r3, r1)
            r2.A0J(r0)
            X.AES r1 = r6.A01
            r0 = 1
            r1.A01 = r0
            X.9jf r4 = r6.A04
            X.205 r3 = r6.A07
            X.Aa6 r0 = r6.A09
            X.8Gd r2 = r0.A06
            r1 = 1
            X.Aan r0 = new X.Aan
            r0.<init>(r1)
            r4.A00(r2, r0, r3)
            return
        L_0x0b7f:
            r1 = 37
            X.Ak2 r0 = new X.Ak2
            r0.<init>(r6, r7, r5, r1)
            r6.runOnUiThread(r0)
            return
        L_0x0b8a:
            java.lang.Object r2 = r0.A01
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r2 = (com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity) r2
            java.lang.Object r1 = r0.A03
            X.ARR r1 = (X.ARR) r1
            java.lang.Object r0 = r0.A02
            X.AEn r0 = (X.C20279AEn) r0
            r2.A5u(r1, r0)
            return
        L_0x0b9a:
            java.lang.Object r2 = r0.A01
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity r2 = (com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity) r2
            java.lang.Object r3 = r0.A02
            java.lang.Object r4 = r0.A03
            X.00H r0 = r2.A0Q
            if (r0 == 0) goto L_0x0be4
            X.1W6 r1 = X.C17880vN.A0c(r0)
            X.205 r0 = r2.A4c()
            X.206 r5 = X.C108945cZ.A0s(r0, r1)
            X.21L r5 = (X.AnonymousClass21L) r5
            r1 = 0
            if (r5 == 0) goto L_0x0be2
            X.AEt r0 = r5.A00
            if (r0 == 0) goto L_0x0be2
            X.AEn r0 = r0.A02
            if (r0 == 0) goto L_0x0be2
            int r0 = r0.A01()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0bc7:
            r2.A0W = r0
            if (r5 == 0) goto L_0x0bd5
            X.AEt r0 = r5.A00
            if (r0 == 0) goto L_0x0bd5
            X.AEn r0 = r0.A02
            if (r0 == 0) goto L_0x0bd5
            java.util.List r1 = r0.A0N
        L_0x0bd5:
            r2.A0Y = r1
            r6 = 8
            X.7Py r1 = new X.7Py
            r1.<init>(r2, r3, r4, r5, r6)
            r2.runOnUiThread(r1)
            return
        L_0x0be2:
            r0 = r1
            goto L_0x0bc7
        L_0x0be4:
            java.lang.String r0 = "fMessageDatabase"
        L_0x0be6:
            X.C18070vi.A11(r0)
            r1 = 0
            throw r1
        L_0x0beb:
            java.lang.Object r4 = r0.A01
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity r4 = (com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity) r4
            java.lang.Object r7 = r0.A02
            X.21L r7 = (X.AnonymousClass21L) r7
            java.lang.Object r5 = r0.A03
            X.AW0 r5 = (X.AW0) r5
            r4.CEx()
            if (r5 == 0) goto L_0x0c1f
            boolean r0 = r5.A0L()
        L_0x0c00:
            r0 = r0 ^ 1
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity.A0d(r4, r7, r0)
            X.Aa6 r2 = r4.A4b()
            X.Aa6 r0 = r4.A4b()
            X.9uf r3 = r0.A07
            X.9I2 r1 = X.AnonymousClass9I2.NONE
            r8 = 0
            X.AED r6 = new X.AED
            r6.<init>(r8, r1, r8, r8)
            X.9nV r0 = r3.A02(r4, r5, r6, r7, r8)
            r2.A01(r1, r0)
            return
        L_0x0c1f:
            r0 = 0
            goto L_0x0c00
        L_0x0c21:
            java.lang.Object r2 = r0.A01
            com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity r2 = (com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity) r2
            java.lang.Object r1 = r0.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.Object r0 = r0.A03
            android.content.Intent r0 = (android.content.Intent) r0
            com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity.A03(r0, r1, r2)
            return
        L_0x0c31:
            java.lang.Object r4 = r0.A01
            com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity r4 = (com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity) r4
            java.lang.Object r8 = r0.A02
            X.1BI r8 = (X.AnonymousClass1BI) r8
            java.lang.Object r7 = r0.A03
            X.1E7 r7 = (X.AnonymousClass1E7) r7
            X.1KB r6 = r4.A05
            android.content.res.Resources r5 = r4.getResources()
            r3 = 2131893908(0x7f121e94, float:1.9422606E38)
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            X.1Me r1 = r4.A03
            X.1M9 r0 = r4.A01
            X.1E7 r0 = r0.A0H(r8)
            java.lang.String r0 = r1.A0O(r0)
            r1 = 0
            java.lang.String r0 = X.AnonymousClass3MW.A0x(r5, r0, r2, r1, r3)
            r6.A0G(r0, r1)
            r4.finish()
            android.os.Bundle r0 = X.AnonymousClass3MY.A09(r4)
            X.1LU r2 = r4.A09
            if (r0 == 0) goto L_0x0c7a
            android.os.Bundle r1 = X.AnonymousClass3MY.A09(r4)
            X.1BI r0 = r7.A0J
            android.content.Intent r0 = X.AnonymousClass3MY.A06(r4, r2, r0)
            r0.putExtras(r1)
        L_0x0c76:
            r4.startActivity(r0)
            return
        L_0x0c7a:
            X.1BI r0 = r7.A0J
            android.content.Intent r0 = r2.A1w(r4, r0, r1)
            goto L_0x0c76
        L_0x0c81:
            java.lang.Object r2 = r0.A01
            com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity r2 = (com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity) r2
            java.lang.Object r4 = r0.A02
            X.9yu r4 = (X.C198789yu) r4
            java.lang.Object r3 = r0.A03
            X.Af0 r3 = (X.C21132Af0) r3
            X.8Gc r0 = r2.A0Q
            X.9NU r1 = r0.A06
            if (r1 == 0) goto L_0x0cd6
            X.206 r0 = r1.A02
            if (r0 == 0) goto L_0x0cbd
            X.1PM r1 = r2.A07
            X.AW0 r0 = X.AnonymousClass25B.A00(r0)
            com.whatsapp.jid.UserJid r0 = r0.A0D
            X.1yf r0 = r1.A01(r0)
            boolean r2 = r0.A02()
        L_0x0ca7:
            X.AW0 r0 = r4.A05
            int r1 = r0.A03
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x0cb5
            java.lang.String r0 = "wa_smb_p2m_payment_details"
        L_0x0cb1:
            r3.A0B(r0)
            return
        L_0x0cb5:
            if (r2 == 0) goto L_0x0cba
            java.lang.String r0 = "wa_api_p2m_receipt_support"
            goto L_0x0cb1
        L_0x0cba:
            java.lang.String r0 = "wa_p2m_receipt_support"
            goto L_0x0cb1
        L_0x0cbd:
            X.AW0 r0 = r1.A01
            if (r0 == 0) goto L_0x0cd6
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x0cd6
            X.1PM r1 = r2.A07
            X.8Gc r0 = r2.A0Q
            X.9NU r0 = r0.A06
            X.AW0 r0 = r0.A01
            com.whatsapp.jid.UserJid r0 = r0.A0D
            boolean r2 = r1.A04(r0)
            goto L_0x0ca7
        L_0x0cd6:
            r2 = 0
            goto L_0x0ca7
        L_0x0cd8:
            java.lang.Object r3 = r0.A01
            X.2ju r3 = (X.C57952ju) r3
            java.lang.Object r2 = r0.A02
            X.21V r2 = (X.AnonymousClass21V) r2
            java.lang.Object r1 = r0.A03
            X.34B r1 = (X.AnonymousClass34B) r1
            X.1iW r0 = r3.A01
            r0.A0a(r1, r2)
            return
        L_0x0cea:
            java.lang.Object r3 = r0.A01
            com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel r3 = (com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel) r3
            java.lang.Object r6 = r0.A02
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r7 = r0.A03
            java.lang.Integer r7 = (java.lang.Integer) r7
            X.1QD r2 = r3.A07
            X.11P r0 = r3.A05
            long r0 = X.AnonymousClass11P.A01(r0)
            r2.A0G(r0)
            r0 = 1
            r2.A0D(r0)
            X.1jA r4 = r3.A06
            X.AXG r5 = new X.AXG
            r5.<init>(r7, r6, r3, r0)
            r8 = 0
            r9 = r8
            r4.A01(r5, r6, r7, r8, r9)
            return
        L_0x0d12:
            java.lang.Object r3 = r0.A01
            X.8GL r3 = (X.AnonymousClass8GL) r3
            java.lang.Object r1 = r0.A02
            X.9O4 r1 = (X.AnonymousClass9O4) r1
            java.lang.Object r0 = r0.A03
            X.AEs r0 = (X.C20284AEs) r0
            if (r1 == 0) goto L_0x0d40
            java.lang.String r0 = "ACCEPT"
            r1.A08 = r0
            java.lang.String r0 = "PENDING"
            r1.A09 = r0
        L_0x0d28:
            X.1QS r0 = r3.A0G
            X.1QR r1 = X.AnonymousClass8BR.A0O(r0)
            X.AW0 r0 = r3.A07
            r1.A0c(r0)
        L_0x0d33:
            X.1KB r6 = r3.A0B
            r0 = 44
            X.Aju r4 = new X.Aju
            r4.<init>(r3, r0)
        L_0x0d3c:
            r6.A0J(r4)
            return
        L_0x0d40:
            if (r0 == 0) goto L_0x0d33
            X.AW0 r2 = r3.A07
            java.lang.String r0 = r0.A0A
            r2.A0H = r0
            X.11P r0 = r3.A03
            long r0 = X.AnonymousClass11P.A01(r0)
            r2.A06 = r0
            r0 = 401(0x191, float:5.62E-43)
            r2.A02 = r0
            goto L_0x0d28
        L_0x0d55:
            java.lang.Object r3 = r0.A01
            X.8Gc r3 = (X.C161588Gc) r3
            java.lang.Object r1 = r0.A02
            X.8pf r1 = (X.C170318pf) r1
            java.lang.Object r2 = r0.A03
            X.AW0 r2 = (X.AW0) r2
            X.9ue r0 = r1.A0H
            X.9O4 r1 = r0.A0C
            r0 = 0
            r1.A05 = r0
            goto L_0x0d7b
        L_0x0d69:
            java.lang.Object r3 = r0.A01
            X.8Gc r3 = (X.C161588Gc) r3
            java.lang.Object r1 = r0.A02
            X.8pf r1 = (X.C170318pf) r1
            java.lang.Object r2 = r0.A03
            X.AW0 r2 = (X.AW0) r2
            X.9ue r1 = r1.A0H
            java.lang.String r0 = ""
            r1.A0H = r0
        L_0x0d7b:
            X.1QR r0 = r3.A0T
            r0.A0c(r2)
            return
        L_0x0d81:
            X.1Mm r1 = r6.A03
            com.whatsapp.newsletter.jobqueue.job.SendViewReceiptJob r0 = new com.whatsapp.newsletter.jobqueue.job.SendViewReceiptJob
            r0.<init>(r5, r4, r3)
            r1.A01(r0)
            return
        L_0x0d8c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = "capabilities"
            r3.put(r0, r1)
            X.C32991i5.A01(r3, r4, r5)
            return
        L_0x0d99:
            r1 = move-exception
            monitor-exit(r5)
            throw r1
        L_0x0d9c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0d9e }
        L_0x0d9e:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0da3 }
            throw r0     // Catch:{ all -> 0x0da3 }
        L_0x0da3:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0da5 }
        L_0x0da5:
            r1 = move-exception
            X.CDX.A00(r2, r0)
            throw r1
        L_0x0daa:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0daa }
            throw r1
        L_0x0dad:
            X.5ra r0 = r1.A00
            android.os.Handler r3 = r0.A01
            r0 = 25
            X.Aju r2 = new X.Aju
            r2.<init>(r1, r0)
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21435Ak2.run():void");
    }
}
