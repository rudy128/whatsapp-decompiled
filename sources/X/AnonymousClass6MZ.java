package X;

import com.whatsapp.stickers.stickerpack.StickerPackDownloader;

/* renamed from: X.6MZ  reason: invalid class name */
public final class AnonymousClass6MZ extends A34 {
    public String A00;
    public final AnonymousClass167 A01 = ((AnonymousClass167) C221618v.A01(32801));
    public final StickerPackDownloader A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final boolean A07;
    public final C18030ve A08;
    public final AnonymousClass18K A09;
    public final C136936ue A0A;
    public final AnonymousClass2LK A0B;
    public final AnonymousClass88A A0C;
    public final Integer A0D;
    public final boolean A0E;

    public void A0I(Object... objArr) {
        C18070vi.A0d(objArr, 0);
        Number number = objArr[1];
        C18070vi.A0z(number, "null cannot be cast to non-null type kotlin.Int");
        Number number2 = number;
        int intValue = number2.intValue();
        AnonymousClass167 r0 = this.A01;
        String str = this.A06;
        C18070vi.A0d(str, 0);
        r0.A01.put(str, number2);
        this.A0B.notifyAllObservers(new C97024on(str, intValue, 0));
    }

    private final void A00(C123206Tn r7) {
        C1185163t r4 = new C1185163t();
        r4.A05 = this.A05;
        String str = this.A06;
        boolean equals = "meta-avatar".equals(str);
        r4.A02 = C108945cZ.A1A(equals);
        r4.A01 = Boolean.valueOf(equals);
        if (equals) {
            r4.A07 = this.A0A.A02;
        }
        r4.A03 = Boolean.valueOf(this.A0E);
        r4.A04 = this.A0D;
        if (r7 instanceof AnonymousClass6H8) {
            AnonymousClass725 r5 = ((AnonymousClass6H8) r7).A00;
            AnonymousClass2LK r1 = this.A0B;
            C18070vi.A0d(r5, 0);
            AnonymousClass7KY.A00(r1, r5, 20);
            r4.A00 = false;
            C137436vS.A01(this.A08, this.A09, r5, 0);
        } else if (r7 instanceof AnonymousClass6H7) {
            String str2 = ((AnonymousClass6H7) r7).A00;
            AnonymousClass2LK r12 = this.A0B;
            C18070vi.A0d(str, 0);
            AnonymousClass7KZ.A00(r12, str, 7);
            r4.A00 = AnonymousClass000.A0i();
            r4.A06 = str2;
        }
        this.A09.CC7(r4);
        AnonymousClass167 r13 = this.A01;
        C18070vi.A0d(str, 0);
        r13.A01.remove(str);
        r13.A00.remove(str);
        AnonymousClass88A r0 = this.A0C;
        if (r0 != null) {
            r0.C6n(r7);
        }
    }

    public /* bridge */ /* synthetic */ void A0D(Object obj) {
        C123206Tn r4 = (C123206Tn) obj;
        AnonymousClass167 r2 = this.A01;
        String str = this.A06;
        C18070vi.A0d(str, 0);
        r2.A01.remove(str);
        r2.A00.remove(str);
        if (r4 == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("cancelled: received null result (reason: ");
            r4 = new AnonymousClass6H7(C17900vP.A0B(this.A00, A10));
        }
        A00(r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a2, code lost:
        if (X.AnonymousClass000.A1a(r0) != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01be, code lost:
        if (X.C25291Nq.A04(r7, 12817) == false) goto L_0x01c0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r25) {
        /*
            r24 = this;
            r1 = r25
            X.725[] r1 = (X.AnonymousClass725[]) r1
            r6 = 0
            X.C18070vi.A0d(r1, r6)
            r0 = r24
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r5 = r0.A02
            r2 = r1[r6]
            boolean r1 = r0.A07
            X.7Md r10 = new X.7Md
            r10.<init>(r0)
            java.lang.Integer r4 = r0.A04
            java.lang.Integer r3 = r0.A03
            java.lang.Integer r8 = r0.A05
            X.C18070vi.A0d(r2, r6)
            X.1SA r0 = r5.A05
            r0.A0A()
            X.6MZ r0 = r10.A00
            X.8CU r0 = r0.A02
            r18 = r0
            boolean r0 = r18.isCancelled()
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "cancelled"
        L_0x0031:
            X.6H7 r8 = new X.6H7
            r8.<init>(r0)
        L_0x0036:
            return r8
        L_0x0037:
            boolean r0 = r2.A0S
            if (r0 == 0) goto L_0x00a5
            java.util.List r0 = r2.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0099
            if (r1 == 0) goto L_0x0096
            r0 = 0
            com.whatsapp.stickers.stickerpack.StickerPackDownloader$fetchAvatarStickerPackDataWithOnDemand$onDeviceStableIds$1 r1 = new com.whatsapp.stickers.stickerpack.StickerPackDownloader$fetchAvatarStickerPackDataWithOnDemand$onDeviceStableIds$1
            r1.<init>(r5, r0)
            X.1OR r0 = X.AnonymousClass1OR.A00
            java.lang.Object r7 = X.AnonymousClass4GT.A00(r0, r1)
            java.util.Set r7 = (java.util.Set) r7
        L_0x0053:
            X.00H r0 = r5.A07
            java.lang.Object r2 = r0.get()
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository r2 = (com.whatsapp.productinfra.avatar.data.AvatarStickersRepository) r2
            r1 = 1
            X.C18070vi.A0d(r7, r1)
            X.0wl r0 = r2.A0A
            r16 = 0
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarStickerPackSync$1 r11 = new com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarStickerPackSync$1
            r12 = r2
            r13 = r3
            r14 = r8
            r15 = r7
            r17 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17)
            java.lang.Object r0 = X.AnonymousClass4GT.A00(r0, r11)
            X.1eK r0 = (X.C30671eK) r0
            java.lang.Object r2 = r0.value
        L_0x0076:
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            if (r0 == 0) goto L_0x00cb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "StickerPackDownloader/StickerError/"
            r1.append(r0)
            java.lang.Throwable r0 = X.C30671eK.A00(r2)
            if (r0 == 0) goto L_0x008f
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x0091
        L_0x008f:
            java.lang.String r0 = "no exception attached"
        L_0x0091:
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            goto L_0x0031
        L_0x0096:
            X.1Om r7 = X.C25511Om.A00
            goto L_0x0053
        L_0x0099:
            java.util.List r0 = r2.A07
            X.C18070vi.A0X(r0)
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 == 0) goto L_0x00a5
            goto L_0x0076
        L_0x00a5:
            X.00H r0 = r5.A0A
            java.lang.Object r1 = r0.get()
            X.734 r1 = (X.AnonymousClass734) r1
            java.lang.String r7 = X.AnonymousClass725.A00(r2)
            r0 = 0
            X.725 r2 = r1.A03(r0, r7)
            if (r2 != 0) goto L_0x0076
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "could not get sticker pack by id, sticker pack id: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r7, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            X.1IU r2 = X.C30691eM.A00(r0)
            goto L_0x0076
        L_0x00cb:
            X.725 r2 = (X.AnonymousClass725) r2
            if (r2 != 0) goto L_0x00d3
            java.lang.String r0 = "StickerPackDownloader/StickerError/success, but pack is null"
            goto L_0x0031
        L_0x00d3:
            java.util.List r0 = r2.A07
            r23 = r0
            X.C18070vi.A0X(r23)
            X.00H r0 = r5.A0B
            r22 = r0
            java.lang.Object r0 = r22.get()
            X.6pn r0 = (X.C133966pn) r0
            r0.A01(r2)
            java.util.List r11 = r2.A07
            X.C18070vi.A0X(r11)
            int r13 = r11.size()
            r9 = 0
            java.util.concurrent.atomic.AtomicInteger r8 = new java.util.concurrent.atomic.AtomicInteger
            r8.<init>(r6)
            X.0ve r7 = r5.A01
            r0 = 3064(0xbf8, float:4.294E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r7, r0)
            if (r0 == 0) goto L_0x01a2
            X.7wR r14 = new X.7wR
            r14.<init>(r2, r10, r8, r13)
            X.0wl r12 = r5.A0E
            r0 = 4
            X.0wl r12 = r12.A0A(r0)
            r13 = 0
            X.1OD r0 = new X.1OD
            r0.<init>(r13)
            X.0wh r0 = X.AnonymousClass1OQ.A03(r12, r0)
            X.1OY r21 = X.AnonymousClass1OW.A02(r0)
            com.whatsapp.stickers.stickerpack.StickerPackDownloader$downloadStickersInParallel$1 r12 = new com.whatsapp.stickers.stickerpack.StickerPackDownloader$downloadStickersInParallel$1
            r15 = r12
            r16 = r2
            r17 = r10
            r18 = r5
            r19 = r13
            r20 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21)
            X.1OR r0 = X.AnonymousClass1OR.A00
            java.lang.Object r0 = X.AnonymousClass4GT.A00(r0, r12)
            X.1eK r0 = (X.C30671eK) r0
            java.lang.Object r13 = r0.value
        L_0x0136:
            java.lang.Throwable r14 = X.C30671eK.A00(r13)
            if (r14 != 0) goto L_0x0171
            java.util.List r13 = (java.util.List) r13
            r2.A07 = r13
            X.6H8 r8 = new X.6H8
            r8.<init>(r2, r13)
        L_0x0145:
            boolean r0 = r8 instanceof X.AnonymousClass6H8
            if (r0 == 0) goto L_0x0036
            X.6H8 r8 = (X.AnonymousClass6H8) r8
            java.util.List r0 = r8.A01
            r17 = r0
            r0 = 3792(0xed0, float:5.314E-42)
            boolean r0 = X.C18020vd.A05(r1, r7, r0)
            if (r0 == 0) goto L_0x0311
            boolean r0 = r2.A0S
            if (r0 == 0) goto L_0x0311
            X.77d r1 = r2.A0C
            if (r1 == 0) goto L_0x0311
            java.lang.String r0 = "StickerPackDownloader/downloadAvatarStickerDynamicIcon"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6uS r0 = r5.A03
            java.io.File r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x030c
            X.C108945cZ.A1O(r1, r0)
            goto L_0x0217
        L_0x0171:
            r14.getMessage()
            int r12 = r8.get()
        L_0x0178:
            if (r9 >= r12) goto L_0x0194
            java.lang.Object r0 = r11.get(r9)
            X.77d r0 = (X.C1418377d) r0
            java.lang.String r10 = r0.A0F
            if (r10 == 0) goto L_0x0191
            java.lang.Object r0 = r11.get(r9)
            X.77d r0 = (X.C1418377d) r0
            java.lang.String r8 = r0.A0E
            X.1Ns r0 = r5.A00
            r0.A07(r10, r8)
        L_0x0191:
            int r9 = r9 + 1
            goto L_0x0178
        L_0x0194:
            java.lang.String r0 = r14.getMessage()
            if (r0 != 0) goto L_0x019c
            java.lang.String r0 = "no error message available"
        L_0x019c:
            X.6H7 r8 = new X.6H7
            r8.<init>(r0)
            goto L_0x0145
        L_0x01a2:
            X.7wS r12 = new X.7wS
            r12.<init>(r2, r10, r8, r13)
            java.lang.String r10 = X.AnonymousClass725.A00(r2)
            r0 = 12188(0x2f9c, float:1.7079E-41)
            java.lang.String r0 = X.C18020vd.A01(r1, r7, r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x01c0
            r0 = 12817(0x3211, float:1.796E-41)
            boolean r0 = X.C25291Nq.A04(r7, r0)
            r10 = 1
            if (r0 != 0) goto L_0x01c1
        L_0x01c0:
            r10 = 0
        L_0x01c1:
            java.util.List r0 = r2.A07
            X.C18070vi.A0X(r0)
            java.util.ArrayList r13 = X.C29351c6.A0D(r0)
            java.util.Iterator r17 = r0.iterator()
        L_0x01ce:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0136
            X.77d r15 = X.C108945cZ.A0x(r17)
            boolean r0 = r18.isCancelled()
            java.lang.String r16 = "cancelled"
            if (r0 == 0) goto L_0x01ea
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r16)
            X.1IU r13 = X.C30691eM.A00(r0)
            goto L_0x0136
        L_0x01ea:
            X.00H r0 = r5.A09
            java.lang.Object r14 = X.C18070vi.A0E(r0)
            X.6yU r14 = (X.C139236yU) r14
            X.C18070vi.A0b(r15)
            r0 = 0
            X.6Tx r14 = r14.A01(r15, r0, r10)
            boolean r0 = r14 instanceof X.AnonymousClass6I9
            if (r0 == 0) goto L_0x0208
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r16)
            X.1IU r13 = X.C30691eM.A00(r0)
            goto L_0x0136
        L_0x0208:
            boolean r0 = r14 instanceof X.AnonymousClass6IA
            if (r0 == 0) goto L_0x05b3
            r12.invoke()
            X.6IA r14 = (X.AnonymousClass6IA) r14
            X.77d r0 = r14.A00
            r13.add(r0)
            goto L_0x01ce
        L_0x0217:
            X.00H r0 = r5.A06     // Catch:{ all -> 0x02f6 }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x02f6 }
            X.6gZ r7 = (X.C128716gZ) r7     // Catch:{ all -> 0x02f6 }
            java.lang.String r0 = r1.A0B     // Catch:{ all -> 0x02f6 }
            r1 = 0
            if (r0 != 0) goto L_0x0230
            java.lang.String r0 = "AvatarTrayIconManager/createIcon filePath is null"
        L_0x0226:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x02f6 }
            java.lang.String r0 = "Unable to create avatar dynamic icon given template Id"
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x02f6 }
        L_0x022f:
            throw r1     // Catch:{ all -> 0x02f6 }
        L_0x0230:
            android.graphics.Bitmap r14 = android.graphics.BitmapFactory.decodeFile(r0)     // Catch:{ all -> 0x0235 }
            goto L_0x023a
        L_0x0235:
            r0 = move-exception
            X.1IU r14 = X.C108945cZ.A1J(r0)     // Catch:{ all -> 0x02f6 }
        L_0x023a:
            boolean r0 = r14 instanceof X.AnonymousClass1IU     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x023f
            r14 = r1
        L_0x023f:
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14     // Catch:{ all -> 0x02f6 }
            if (r14 != 0) goto L_0x0246
            java.lang.String r0 = "AvatarTrayIconManager/createIcon stickerBitmap is null"
            goto L_0x0226
        L_0x0246:
            X.118 r0 = r7.A00     // Catch:{ all -> 0x02f6 }
            android.content.Context r8 = r0.A00     // Catch:{ all -> 0x02f6 }
            android.content.res.Resources r1 = r8.getResources()     // Catch:{ all -> 0x02f6 }
            r0 = 2131165416(0x7f0700e8, float:1.7945048E38)
            int r1 = r1.getDimensionPixelSize(r0)     // Catch:{ all -> 0x02f6 }
            r0 = 2131099873(0x7f0600e1, float:1.7812111E38)
            int r8 = X.C19740yt.A00(r8, r0)     // Catch:{ all -> 0x02f6 }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x02f6 }
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createBitmap(r1, r1, r0)     // Catch:{ all -> 0x02f6 }
            X.C18070vi.A0X(r12)     // Catch:{ all -> 0x02f6 }
            int r0 = r12.getWidth()     // Catch:{ all -> 0x02f6 }
            float r13 = X.C108945cZ.A02(r0)     // Catch:{ all -> 0x02f6 }
            android.graphics.Canvas r11 = X.C108945cZ.A0I(r12)     // Catch:{ all -> 0x02f6 }
            android.graphics.Paint r10 = X.AnonymousClass3MW.A06()     // Catch:{ all -> 0x02f6 }
            r0 = 1
            r10.setAntiAlias(r0)     // Catch:{ all -> 0x02f6 }
            r10.setDither(r0)     // Catch:{ all -> 0x02f6 }
            r10.setFilterBitmap(r0)     // Catch:{ all -> 0x02f6 }
            android.graphics.Paint r9 = X.AnonymousClass3Ma.A07()     // Catch:{ all -> 0x02f6 }
            r9.setDither(r0)     // Catch:{ all -> 0x02f6 }
            r9.setFilterBitmap(r0)     // Catch:{ all -> 0x02f6 }
            r9.setColor(r8)     // Catch:{ all -> 0x02f6 }
            android.graphics.Rect r8 = X.C108995ce.A0I(r14)     // Catch:{ all -> 0x02f6 }
            float r15 = (float) r1     // Catch:{ all -> 0x02f6 }
            r0 = 0
            android.graphics.RectF r1 = new android.graphics.RectF     // Catch:{ all -> 0x02f6 }
            r1.<init>(r0, r0, r15, r15)     // Catch:{ all -> 0x02f6 }
            r11.drawARGB(r6, r6, r6, r6)     // Catch:{ all -> 0x02f6 }
            android.graphics.Path r15 = X.C108945cZ.A0L()     // Catch:{ all -> 0x02f6 }
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW     // Catch:{ all -> 0x02f6 }
            r15.addCircle(r13, r13, r13, r0)     // Catch:{ all -> 0x02f6 }
            r11.clipPath(r15)     // Catch:{ all -> 0x02f6 }
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.CLEAR     // Catch:{ all -> 0x02f6 }
            r11.drawColor(r6, r0)     // Catch:{ all -> 0x02f6 }
            r11.drawCircle(r13, r13, r13, r9)     // Catch:{ all -> 0x02f6 }
            r11.drawBitmap(r14, r8, r1, r10)     // Catch:{ all -> 0x02f6 }
            r14.recycle()     // Catch:{ all -> 0x02f6 }
            java.io.ByteArrayOutputStream r1 = X.C108945cZ.A15()     // Catch:{ all -> 0x02f6 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x02f6 }
            byte[] r0 = X.C108955ca.A1a(r0, r12, r1, r6)     // Catch:{ all -> 0x02f6 }
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x02f6 }
            r8.<init>(r0)     // Catch:{ all -> 0x02f6 }
            X.00H r0 = r7.A02     // Catch:{ all -> 0x02f6 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x02f6 }
            X.2iM r0 = (X.C56992iM) r0     // Catch:{ all -> 0x02f6 }
            java.lang.String r1 = "meta-avatar-tab-icon"
            X.1Lp r0 = r0.A00     // Catch:{ all -> 0x02f6 }
            X.1ga r0 = r0.A07()     // Catch:{ all -> 0x02f6 }
            r0.A0E(r1)     // Catch:{ all -> 0x02f6 }
            X.00H r0 = r7.A01     // Catch:{ all -> 0x02f6 }
            java.lang.Object r0 = X.C18070vi.A0E(r0)     // Catch:{ all -> 0x02f6 }
            X.6pn r0 = (X.C133966pn) r0     // Catch:{ all -> 0x02f6 }
            java.io.File r7 = r0.A00(r1, r6)     // Catch:{ all -> 0x02f6 }
            if (r7 == 0) goto L_0x02ed
            r0 = 500000(0x7a120, double:2.47033E-318)
            X.C64062u9.A0U(r7, r8, r0)     // Catch:{ all -> 0x02f6 }
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x02f6 }
            goto L_0x02fb
        L_0x02ed:
            java.lang.String r0 = "Unable to create dynamic icon file"
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x02f6 }
            r1.<init>(r0)     // Catch:{ all -> 0x02f6 }
            goto L_0x022f
        L_0x02f6:
            r0 = move-exception
            X.1IU r0 = X.C108945cZ.A1J(r0)
        L_0x02fb:
            java.lang.Throwable r7 = X.C30671eK.A00(r0)
            if (r7 == 0) goto L_0x0311
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "StickerPackDownloader/failed to update avatar dynamic icon "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r7)
            goto L_0x030e
        L_0x030c:
            java.lang.String r0 = "StickerPackDownloader/failed to download avatar dynamic icon"
        L_0x030e:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0311:
            java.lang.String r0 = "stickers_downloaded"
            com.whatsapp.stickers.stickerpack.StickerPackDownloader.A01(r5, r4, r3, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "StickerPackDownloader/finished fetching stickers/sticker pack id: "
            r1.append(r0)
            java.lang.String r7 = r2.A0H
            X.C17890vO.A1A(r1, r7)
            boolean r10 = r2.A0S
            if (r10 == 0) goto L_0x039d
            java.lang.String r12 = r2.A0L
            if (r12 == 0) goto L_0x045f
            java.lang.String r0 = "StickerPackDownloader/updateAvatarStickerPackTrayIcon"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r5.A0C
            java.lang.Object r0 = r0.get()
            X.2iM r0 = (X.C56992iM) r0
            X.C18070vi.A0X(r7)
            X.1Lp r0 = r0.A00
            X.1ga r0 = r0.A07()
            r0.A0E(r7)
            java.lang.Object r8 = r22.get()
            X.6pn r8 = (X.C133966pn) r8
            java.util.List r0 = r2.A07
            r16 = r0
            X.C18070vi.A0X(r16)
            boolean r0 = r16.isEmpty()
            if (r0 != 0) goto L_0x0398
            X.00H r0 = r8.A01
            java.lang.Object r9 = r0.get()
            X.6cP r9 = (X.C126236cP) r9
            java.util.Iterator r13 = r16.iterator()
        L_0x0364:
            boolean r0 = r13.hasNext()
            r11 = 0
            if (r0 == 0) goto L_0x0384
            java.lang.Object r11 = r13.next()
            r1 = r11
            X.77d r1 = (X.C1418377d) r1
            java.lang.String r0 = r1.A07
            if (r0 != 0) goto L_0x037e
            X.73B r0 = r1.A04
            if (r0 == 0) goto L_0x0364
            java.lang.String r0 = r0.A07
            if (r0 == 0) goto L_0x0364
        L_0x037e:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0364
        L_0x0384:
            X.77d r11 = (X.C1418377d) r11
            if (r11 != 0) goto L_0x038e
            java.lang.Object r11 = X.C29431cG.A0b(r16)
            X.77d r11 = (X.C1418377d) r11
        L_0x038e:
            java.lang.String r0 = r11.A0B
            r1 = 0
            if (r0 != 0) goto L_0x03d3
            java.lang.String r0 = "AvatarTrayIconManager/createIcon filePath is null"
        L_0x0395:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0398:
            java.lang.String r0 = "tray_icon_updated"
            com.whatsapp.stickers.stickerpack.StickerPackDownloader.A01(r5, r4, r3, r0)
        L_0x039d:
            X.00H r9 = r5.A08
            X.72N r0 = X.C108945cZ.A0z(r9)
            X.C18070vi.A0X(r7)
            X.725 r1 = r0.A04(r7)
            if (r1 == 0) goto L_0x04d3
            java.lang.String r0 = "StickerPackDownloader/deletePreviouslyInstalledStickerPack"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.List r8 = r1.A07
            X.C18070vi.A0X(r8)
            java.util.List r13 = r2.A07
            X.C18070vi.A0X(r13)
            java.util.ArrayList r12 = X.C29351c6.A0E(r8)
            java.util.Iterator r1 = r8.iterator()
        L_0x03c3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0466
            X.77d r0 = X.C108945cZ.A0x(r1)
            java.lang.String r0 = r0.A0F
            r12.add(r0)
            goto L_0x03c3
        L_0x03d3:
            android.graphics.Bitmap r15 = android.graphics.BitmapFactory.decodeFile(r0)     // Catch:{ all -> 0x03d8 }
            goto L_0x03dd
        L_0x03d8:
            r0 = move-exception
            X.1IU r15 = X.C108945cZ.A1J(r0)
        L_0x03dd:
            boolean r0 = r15 instanceof X.AnonymousClass1IU
            if (r0 == 0) goto L_0x03e2
            r15 = r1
        L_0x03e2:
            android.graphics.Bitmap r15 = (android.graphics.Bitmap) r15
            if (r15 != 0) goto L_0x03e9
            java.lang.String r0 = "AvatarTrayIconManager/createIcon stickerBitmap is null"
            goto L_0x0395
        L_0x03e9:
            X.118 r0 = r9.A00
            android.content.Context r9 = r0.A00
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131165427(0x7f0700f3, float:1.794507E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = 2131103410(0x7f060eb2, float:1.7819285E38)
            int r9 = X.C19740yt.A00(r9, r0)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createBitmap(r1, r1, r0)
            android.graphics.Canvas r14 = X.C108955ca.A0E(r13)
            android.graphics.Paint r12 = X.AnonymousClass3MW.A06()
            r0 = 1
            r12.setAntiAlias(r0)
            r12.setDither(r0)
            r12.setFilterBitmap(r0)
            r12.setColor(r9)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_OVER
            X.C108965cb.A11(r12, r0)
            android.graphics.Rect r11 = X.C108995ce.A0I(r15)
            float r9 = (float) r1
            r1 = 0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1, r1, r9, r9)
            r14.drawARGB(r6, r6, r6, r6)
            r14.drawOval(r0, r12)
            r14.drawBitmap(r15, r11, r0, r12)
            r15.recycle()
            java.io.ByteArrayOutputStream r1 = X.C108945cZ.A15()
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
            byte[] r0 = X.C108955ca.A1a(r0, r13, r1, r6)
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream
            r9.<init>(r0)
            r0 = r16
            java.lang.Object r0 = r0.get(r6)
            X.77d r0 = (X.C1418377d) r0
            java.lang.String r0 = r0.A0H
            if (r0 == 0) goto L_0x0398
            java.io.File r8 = r8.A00(r0, r6)
            if (r8 == 0) goto L_0x0398
            r0 = 500000(0x7a120, double:2.47033E-318)
            X.C64062u9.A0U(r8, r9, r0)
            goto L_0x0398
        L_0x045f:
            java.lang.String r0 = "StickerPackDownloader/avatar stickerpack without tray icon template"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x039d
        L_0x0466:
            java.util.ArrayList r11 = X.C29351c6.A0E(r13)
            java.util.Iterator r1 = r13.iterator()
        L_0x046e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x047e
            X.77d r0 = X.C108945cZ.A0x(r1)
            java.lang.String r0 = r0.A0F
            r11.add(r0)
            goto L_0x046e
        L_0x047e:
            java.util.Set r0 = X.C29431cG.A12(r11)
            java.util.Set r12 = X.C29431cG.A13(r12, r0)
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.util.Iterator r8 = r8.iterator()
        L_0x048e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x04a7
            java.lang.Object r1 = r8.next()
            r0 = r1
            X.77d r0 = (X.C1418377d) r0
            java.lang.String r0 = r0.A0F
            boolean r0 = r12.contains(r0)
            if (r0 != 0) goto L_0x048e
            r11.add(r1)
            goto L_0x048e
        L_0x04a7:
            r11.size()
            java.util.Iterator r12 = r11.iterator()
        L_0x04ae:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x04ce
            X.77d r11 = X.C108945cZ.A0x(r12)
            java.lang.String r0 = r11.A0B
            if (r0 == 0) goto L_0x04ae
            int r0 = r0.length()
            if (r0 == 0) goto L_0x04ae
            java.lang.String r8 = r11.A0F
            if (r8 == 0) goto L_0x04ae
            X.1Ns r1 = r5.A00
            java.lang.String r0 = r11.A0E
            r1.A07(r8, r0)
            goto L_0x04ae
        L_0x04ce:
            java.lang.String r0 = "previous_stickers_deleted"
            com.whatsapp.stickers.stickerpack.StickerPackDownloader.A01(r5, r4, r3, r0)
        L_0x04d3:
            X.72N r0 = X.C108945cZ.A0z(r9)
            int r8 = r0.A02(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "StickerPackDownloader/installStickerPack(order="
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass001.A1L(r1, r8)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r10 == 0) goto L_0x0503
            java.util.Iterator r10 = r17.iterator()
            r1 = 0
        L_0x04f2:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0500
            X.77d r0 = X.C108945cZ.A0x(r10)
            int r0 = r0.A00
            int r1 = r1 + r0
            goto L_0x04f2
        L_0x0500:
            long r0 = (long) r1
            r2.A02 = r0
        L_0x0503:
            X.72N r0 = X.C108945cZ.A0z(r9)
            r0.A06(r2)
            X.72N r0 = X.C108945cZ.A0z(r9)
            X.00H r11 = r0.A04
            java.lang.Object r0 = r11.get()
            X.6fB r0 = (X.C127936fB) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r1 = X.C17880vN.A0C(r0)
            java.lang.String r10 = "pref_key_preview_ids"
            r0 = 0
            java.lang.String r0 = r1.getString(r10, r0)
            if (r0 == 0) goto L_0x0562
            java.util.List r1 = X.C108995ce.A0c(r0)
            if (r1 == 0) goto L_0x0562
            boolean r0 = r1.contains(r7)
            if (r0 == 0) goto L_0x0562
            java.lang.Object r13 = r11.get()
            X.6fB r13 = (X.C127936fB) r13
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.util.Iterator r12 = r1.iterator()
        L_0x053f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0553
            java.lang.Object r1 = r12.next()
            boolean r0 = X.C18070vi.A18(r1, r7)
            if (r0 != 0) goto L_0x053f
            r11.add(r1)
            goto L_0x053f
        L_0x0553:
            X.0vl r0 = r13.A01
            android.content.SharedPreferences$Editor r1 = X.C17890vO.A0A(r0)
            java.lang.String r0 = ","
            java.lang.String r0 = X.C108995ce.A0X(r0, r11)
            X.C17880vN.A1E(r1, r10, r0)
        L_0x0562:
            java.lang.String r0 = "stickerpack_installed"
            com.whatsapp.stickers.stickerpack.StickerPackDownloader.A01(r5, r4, r3, r0)
            X.00H r0 = r5.A0D
            java.lang.Object r0 = r0.get()
            X.6qY r0 = (X.C134416qY) r0
            r0.A02(r7)
            X.72N r0 = X.C108945cZ.A0z(r9)
            X.725 r1 = r0.A04(r7)
            if (r1 == 0) goto L_0x05af
            r0 = r23
            r1.A07 = r0
            r1.A09 = r6
            r1.A00 = r8
            r0 = 1
            r1.A0B = r0
            if (r4 == 0) goto L_0x05a7
            if (r3 == 0) goto L_0x05a7
            X.19T r5 = r5.A02
            int r6 = r4.intValue()
            int r7 = r3.intValue()
            java.lang.String r8 = "stickerpack_size"
            long r9 = r2.A02
            r5.markerAnnotate((int) r6, (int) r7, (java.lang.String) r8, (long) r9)
            java.util.List r0 = r2.A07
            int r2 = r0.size()
            java.lang.String r0 = "stickerpack_amount"
            r5.markerAnnotate((int) r6, (int) r7, (java.lang.String) r0, (int) r2)
        L_0x05a7:
            X.6H8 r8 = new X.6H8
            r0 = r23
            r8.<init>(r1, r0)
            return r8
        L_0x05af:
            java.lang.String r0 = "Unable to get sticker pack from database"
            goto L_0x0031
        L_0x05b3:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MZ.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C123206Tn r2 = (C123206Tn) obj;
        C18070vi.A0d(r2, 0);
        C17960vV.A07(r2);
        A00(r2);
    }

    public AnonymousClass6MZ(C18030ve r2, AnonymousClass18K r3, C136936ue r4, AnonymousClass2LK r5, AnonymousClass725 r6, AnonymousClass88A r7, StickerPackDownloader stickerPackDownloader, Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
        C18070vi.A0w(r2, r4, r5, stickerPackDownloader, r3);
        this.A08 = r2;
        this.A0A = r4;
        this.A0B = r5;
        this.A02 = stickerPackDownloader;
        this.A09 = r3;
        this.A0C = r7;
        this.A05 = num;
        this.A0D = num2;
        this.A07 = z;
        this.A04 = num3;
        this.A03 = num4;
        this.A06 = AnonymousClass725.A00(r6);
        this.A0E = r6.A0X;
        this.A00 = "unknown";
    }
}
