package X;

/* renamed from: X.2Q0  reason: invalid class name */
public class AnonymousClass2Q0 extends C201010v {
    public final C218617r A00;
    public final C26611Su A01;
    public final C18000vb A02;
    public final AnonymousClass1KW A03;
    public final /* synthetic */ C32051gY A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2Q0(C218617r r2, C18000vb r3, AnonymousClass1KW r4, C26611Su r5, C32051gY r6) {
        super("MessageThumbsThread");
        this.A04 = r6;
        this.A00 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02b5, code lost:
        r13 = r5.A04.A00;
        r8 = r6.A03;
        r7 = r6.A02;
        r3 = r5.A0A;
        r2 = r5.A06;
        r1 = r5.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r0.A0A <= 0) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0125, code lost:
        if (X.AnonymousClass74L.A02(r6.A00, r5.A05, r8, r3) >= 262144) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x018c, code lost:
        if (r12 == null) goto L_0x018e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x029b A[ADDED_TO_REGION, Catch:{ InterruptedException -> 0x031f }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02f8 A[Catch:{ InterruptedException -> 0x031f }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x030b A[Catch:{ InterruptedException -> 0x031f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r25 = this;
            r11 = 10
            android.os.Process.setThreadPriority(r11)
        L_0x0005:
            r6 = r25
            X.1gY r5 = r6.A04     // Catch:{ InterruptedException -> 0x031f }
            X.1gZ r0 = r5.A0B     // Catch:{ InterruptedException -> 0x031f }
            java.util.concurrent.LinkedBlockingDeque r0 = r0.A00     // Catch:{ InterruptedException -> 0x031f }
            java.lang.Object r4 = r0.takeLast()     // Catch:{ InterruptedException -> 0x031f }
            X.2l9 r4 = (X.C58722l9) r4     // Catch:{ InterruptedException -> 0x031f }
        L_0x0013:
            java.util.concurrent.atomic.AtomicInteger r15 = r5.A0C     // Catch:{ InterruptedException -> 0x031f }
            int r2 = r15.get()     // Catch:{ InterruptedException -> 0x031f }
            r16 = 1000(0x3e8, double:4.94E-321)
            if (r2 > r11) goto L_0x0310
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ InterruptedException -> 0x031f }
            long r0 = X.AnonymousClass6UB.A00     // Catch:{ InterruptedException -> 0x031f }
            long r2 = r2 - r0
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x002e
            r0 = 50
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x031f }
            goto L_0x0013
        L_0x002e:
            java.lang.Object r10 = r4.A05     // Catch:{ InterruptedException -> 0x031f }
            android.view.View r14 = r4.A00     // Catch:{ InterruptedException -> 0x031f }
            java.lang.Object r0 = r14.getTag()     // Catch:{ InterruptedException -> 0x031f }
            boolean r0 = r10.equals(r0)     // Catch:{ InterruptedException -> 0x031f }
            r2 = 0
            if (r0 == 0) goto L_0x025f
            X.206 r3 = r4.A01     // Catch:{ InterruptedException -> 0x031f }
            boolean r0 = r3 instanceof X.AnonymousClass21V     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x01e7
            X.21V r3 = (X.AnonymousClass21V) r3     // Catch:{ InterruptedException -> 0x031f }
            X.2rc r7 = r3.A02     // Catch:{ InterruptedException -> 0x031f }
            r9 = 1
            r22 = 0
            if (r7 == 0) goto L_0x01a6
            X.1Sb r1 = r5.A08     // Catch:{ InterruptedException -> 0x031f }
            java.lang.String r0 = r7.A0L     // Catch:{ InterruptedException -> 0x031f }
            X.2h4 r0 = r1.A00(r0)     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x005d
            long r0 = r0.A0A     // Catch:{ InterruptedException -> 0x031f }
            int r8 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            r1 = 1
            if (r8 > 0) goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            java.io.File r0 = r7.A0G     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x00f3
            boolean r0 = r0.canRead()     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x00f3
            boolean r0 = r3 instanceof X.C438421d     // Catch:{ InterruptedException -> 0x031f }
            if (r0 != 0) goto L_0x0076
            X.2ra r12 = r7.A0F     // Catch:{ InterruptedException -> 0x031f }
            boolean r0 = r12.A08     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x007e
            boolean r0 = r7.A0U     // Catch:{ InterruptedException -> 0x031f }
            if (r0 != 0) goto L_0x007e
        L_0x0076:
            java.io.File r0 = r7.A0G     // Catch:{ InterruptedException -> 0x031f }
            android.graphics.Bitmap r12 = X.C32051gY.A00(r7, r4, r5, r0, r2)     // Catch:{ InterruptedException -> 0x031f }
            goto L_0x0143
        L_0x007e:
            boolean r0 = r3 instanceof X.AnonymousClass21X     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x00c2
            X.205 r0 = r3.A0v     // Catch:{ InterruptedException -> 0x031f }
            boolean r8 = r0.A02     // Catch:{ InterruptedException -> 0x031f }
            if (r8 == 0) goto L_0x00ba
            boolean r0 = r7.A0V     // Catch:{ InterruptedException -> 0x031f }
            if (r0 != 0) goto L_0x00ba
            boolean r0 = r7.A0U     // Catch:{ InterruptedException -> 0x031f }
            if (r0 != 0) goto L_0x00ba
            boolean r0 = r12.A07     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x00a4
            long r2 = r7.A0D     // Catch:{ InterruptedException -> 0x031f }
            int r0 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r0 < 0) goto L_0x0250
            long r0 = r7.A0E     // Catch:{ InterruptedException -> 0x031f }
            int r13 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r13 <= 0) goto L_0x0250
            long r22 = r2 * r16
            goto L_0x0250
        L_0x00a4:
            long r2 = r7.A0D     // Catch:{ InterruptedException -> 0x031f }
            int r0 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r0 < 0) goto L_0x00ba
            long r0 = r7.A0E     // Catch:{ InterruptedException -> 0x031f }
            int r12 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r12 <= 0) goto L_0x00ba
            java.io.File r0 = r7.A0G     // Catch:{ InterruptedException -> 0x031f }
            long r2 = r2 * r16
            android.graphics.Bitmap r12 = X.C1408873l.A02(r0, r2)     // Catch:{ InterruptedException -> 0x031f }
            goto L_0x0299
        L_0x00ba:
            java.io.File r0 = r7.A0G     // Catch:{ InterruptedException -> 0x031f }
            android.graphics.Bitmap r12 = X.C1408873l.A01(r0)     // Catch:{ InterruptedException -> 0x031f }
            goto L_0x0299
        L_0x00c2:
            boolean r0 = r3 instanceof X.C438921i     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x025f
            java.lang.String r1 = "application/pdf"
            java.lang.String r0 = r3.A06     // Catch:{ InterruptedException -> 0x031f }
            boolean r0 = r1.equals(r0)     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x025f
            java.io.File r0 = r7.A0G     // Catch:{ InterruptedException -> 0x031f }
            java.lang.String r7 = r0.getAbsolutePath()     // Catch:{ InterruptedException -> 0x031f }
            X.3M2 r0 = r4.A04     // Catch:{ InterruptedException -> 0x031f }
            int r3 = r0.BZK()     // Catch:{ InterruptedException -> 0x031f }
            int r0 = r0.BZK()     // Catch:{ InterruptedException -> 0x031f }
            int r2 = r0 / 3
            r0 = 0
            X.C18070vi.A0d(r7, r0)     // Catch:{ InterruptedException -> 0x031f }
            r1 = 480(0x1e0, float:6.73E-43)
            boolean r0 = X.C39761tb.A08()     // Catch:{ InterruptedException -> 0x031f }
            if (r0 != 0) goto L_0x025f
            android.graphics.Bitmap r12 = X.AnonymousClass747.A01(r7, r3, r2, r1, r9)     // Catch:{ InterruptedException -> 0x031f }
            goto L_0x0143
        L_0x00f3:
            boolean r0 = r3 instanceof X.AnonymousClass21Y     // Catch:{ InterruptedException -> 0x031f }
            if (r0 != 0) goto L_0x00fb
            boolean r0 = r3 instanceof X.C440922c     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x0147
        L_0x00fb:
            r0 = r3
            X.21X r0 = (X.AnonymousClass21X) r0     // Catch:{ InterruptedException -> 0x031f }
            boolean r0 = r0.A1I()     // Catch:{ InterruptedException -> 0x031f }
            if (r0 != 0) goto L_0x0127
            if (r1 != 0) goto L_0x0127
            boolean r0 = r3.A0w()     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x0147
            X.0ve r8 = r5.A06     // Catch:{ InterruptedException -> 0x031f }
            r1 = 6508(0x196c, float:9.12E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ InterruptedException -> 0x031f }
            boolean r0 = X.C18020vd.A05(r0, r8, r1)     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x0147
            X.17r r1 = r6.A00     // Catch:{ InterruptedException -> 0x031f }
            X.11Z r0 = r5.A05     // Catch:{ InterruptedException -> 0x031f }
            long r12 = X.AnonymousClass74L.A02(r1, r0, r8, r3)     // Catch:{ InterruptedException -> 0x031f }
            r8 = 262144(0x40000, double:1.295163E-318)
            int r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0147
        L_0x0127:
            X.17r r2 = r5.A03     // Catch:{ InterruptedException -> 0x031f }
            java.io.File r1 = r2.A0O(r3)     // Catch:{ InterruptedException -> 0x031f }
            if (r1 == 0) goto L_0x025f
            boolean r0 = r1.exists()     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x025f
            java.io.File r0 = r2.A0P(r1)     // Catch:{ InterruptedException -> 0x031f }
            boolean r0 = r0.exists()     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x025f
            android.graphics.Bitmap r12 = X.C1408873l.A01(r1)     // Catch:{ InterruptedException -> 0x031f }
        L_0x0143:
            if (r12 == 0) goto L_0x025f
            goto L_0x02ee
        L_0x0147:
            boolean r0 = r3 instanceof X.C438421d     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x01a6
            X.36v r13 = r3.A17()     // Catch:{ InterruptedException -> 0x031f }
            X.17r r12 = r6.A00     // Catch:{ InterruptedException -> 0x031f }
            X.00H r0 = r12.A03     // Catch:{ InterruptedException -> 0x031f }
            java.lang.Object r1 = r0.get()     // Catch:{ InterruptedException -> 0x031f }
            X.1L7 r1 = (X.AnonymousClass1L7) r1     // Catch:{ InterruptedException -> 0x031f }
            java.lang.String r0 = ".Thumbs"
            java.io.File r9 = r1.A08(r0)     // Catch:{ InterruptedException -> 0x031f }
            java.lang.String r8 = ".prog.thumb.jpg"
            java.lang.String r1 = r3.A05     // Catch:{ InterruptedException -> 0x031f }
            java.lang.String r0 = r3.A07     // Catch:{ InterruptedException -> 0x031f }
            java.io.File r1 = X.C218617r.A03(r9, r1, r0, r8)     // Catch:{ InterruptedException -> 0x031f }
            java.io.File r9 = r12.A0O(r3)     // Catch:{ InterruptedException -> 0x031f }
            boolean r0 = X.C63652tT.A04(r3)     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x018e
            if (r13 == 0) goto L_0x018e
            if (r9 == 0) goto L_0x018e
            boolean r0 = r9.exists()     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x018e
            X.1gX r8 = r5.A07     // Catch:{ InterruptedException -> 0x031f }
            X.25F r0 = r3.A0C     // Catch:{ InterruptedException -> 0x031f }
            r8.Bhl(r0)     // Catch:{ InterruptedException -> 0x031f }
            int[] r0 = r13.A07()     // Catch:{ InterruptedException -> 0x031f }
            android.graphics.Bitmap r12 = X.C32051gY.A00(r7, r4, r5, r9, r0)     // Catch:{ InterruptedException -> 0x031f }
            if (r12 != 0) goto L_0x02ee
        L_0x018e:
            boolean r0 = r4.A06     // Catch:{ InterruptedException -> 0x031f }
            if (r0 != 0) goto L_0x025f
            if (r1 == 0) goto L_0x025f
            boolean r0 = r1.exists()     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x025f
            android.graphics.Bitmap r12 = X.C32051gY.A00(r7, r4, r5, r1, r2)     // Catch:{ InterruptedException -> 0x031f }
            if (r12 == 0) goto L_0x025f
            r0 = 4
            com.whatsapp.filter.FilterUtils.A02(r0, r12)     // Catch:{ InterruptedException -> 0x031f }
            goto L_0x02ee
        L_0x01a6:
            boolean r0 = r3 instanceof X.C441322g     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x025f
            X.22g r3 = (X.C441322g) r3     // Catch:{ InterruptedException -> 0x031f }
            boolean r0 = r3.A03     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x025f
            android.content.Context r8 = r14.getContext()     // Catch:{ InterruptedException -> 0x031f }
            X.205 r7 = r3.A0v     // Catch:{ InterruptedException -> 0x031f }
            X.17r r2 = r6.A00     // Catch:{ InterruptedException -> 0x031f }
            java.lang.String r1 = r3.A05     // Catch:{ InterruptedException -> 0x031f }
            java.lang.String r0 = r3.A07     // Catch:{ InterruptedException -> 0x031f }
            java.io.File r3 = r2.A0g(r1, r0)     // Catch:{ InterruptedException -> 0x031f }
            if (r3 == 0) goto L_0x01dc
            boolean r0 = r3.exists()     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x01dc
            android.content.res.Resources r1 = r8.getResources()     // Catch:{ InterruptedException -> 0x031f }
            r0 = 2131166307(0x7f070463, float:1.7946856E38)
            int r2 = r1.getDimensionPixelSize(r0)     // Catch:{ InterruptedException -> 0x031f }
            X.1Su r1 = r6.A01     // Catch:{ InterruptedException -> 0x031f }
            java.lang.String r0 = r7.A01     // Catch:{ InterruptedException -> 0x031f }
            android.graphics.Bitmap r12 = r1.A06(r3, r0, r2, r2)     // Catch:{ InterruptedException -> 0x031f }
            goto L_0x024d
        L_0x01dc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ InterruptedException -> 0x031f }
            java.lang.String r0 = "MessageThumbFetcher/sticker thumbnail doesn't exist: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)     // Catch:{ InterruptedException -> 0x031f }
            goto L_0x025c
        L_0x01e7:
            boolean r0 = r3 instanceof X.AnonymousClass210     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x025f
            X.36w r8 = r4.A02     // Catch:{ InterruptedException -> 0x031f }
            X.3M2 r0 = r4.A04     // Catch:{ InterruptedException -> 0x031f }
            int r0 = r0.BZK()     // Catch:{ InterruptedException -> 0x031f }
            r1 = 8000(0x1f40, float:1.121E-41)
            if (r0 == 0) goto L_0x01fb
            int r1 = java.lang.Math.min(r0, r1)     // Catch:{ InterruptedException -> 0x031f }
        L_0x01fb:
            r0 = 2
            int r2 = java.lang.Math.max(r1, r0)     // Catch:{ InterruptedException -> 0x031f }
            if (r8 == 0) goto L_0x0223
            X.17r r0 = r6.A00     // Catch:{ InterruptedException -> 0x031f }
            java.io.File r7 = r0.A0L(r8)     // Catch:{ InterruptedException -> 0x031f }
            X.2Qz r1 = r8.A0D     // Catch:{ InterruptedException -> 0x031f }
            X.2Qz r0 = X.C49572Qz.FAVICON     // Catch:{ InterruptedException -> 0x031f }
            if (r1 != r0) goto L_0x0216
            r0 = 32
            int r3 = java.lang.Math.min(r0, r2)     // Catch:{ InterruptedException -> 0x031f }
            r1 = r3
            goto L_0x023f
        L_0x0216:
            int r0 = r8.A01     // Catch:{ InterruptedException -> 0x031f }
            int r3 = java.lang.Math.min(r0, r2)     // Catch:{ InterruptedException -> 0x031f }
            int r0 = r8.A00     // Catch:{ InterruptedException -> 0x031f }
            int r1 = java.lang.Math.min(r0, r2)     // Catch:{ InterruptedException -> 0x031f }
            goto L_0x023f
        L_0x0223:
            X.36i r0 = X.AnonymousClass2UX.A00(r3)     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x025f
            X.36i r0 = X.AnonymousClass2UX.A00(r3)     // Catch:{ InterruptedException -> 0x031f }
            java.lang.String r0 = r0.A07     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x025f
            X.17r r1 = r6.A00     // Catch:{ InterruptedException -> 0x031f }
            X.36i r0 = X.AnonymousClass2UX.A00(r3)     // Catch:{ InterruptedException -> 0x031f }
            java.lang.String r0 = r0.A07     // Catch:{ InterruptedException -> 0x031f }
            java.io.File r7 = r1.A0R(r0)     // Catch:{ InterruptedException -> 0x031f }
            r1 = r2
            goto L_0x0240
        L_0x023f:
            r2 = r3
        L_0x0240:
            if (r7 == 0) goto L_0x025f
            X.25O r0 = new X.25O     // Catch:{ InterruptedException -> 0x031f }
            r0.<init>(r2, r1)     // Catch:{ InterruptedException -> 0x031f }
            X.25P r0 = X.AnonymousClass204.A0A(r0, r7)     // Catch:{ InterruptedException -> 0x031f }
            android.graphics.Bitmap r12 = r0.A02     // Catch:{ InterruptedException -> 0x031f }
        L_0x024d:
            if (r12 != 0) goto L_0x02ee
            goto L_0x025f
        L_0x0250:
            int r2 = r12.A01     // Catch:{ InterruptedException -> 0x031f }
            int r1 = r12.A00     // Catch:{ InterruptedException -> 0x031f }
            android.graphics.RectF r3 = r12.A02     // Catch:{ InterruptedException -> 0x031f }
            java.io.File r12 = r7.A0G     // Catch:{ InterruptedException -> 0x031f }
            if (r12 != 0) goto L_0x026c
            java.lang.String r0 = "mediafileutils/createVideoThumbnail/file=null"
        L_0x025c:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x031f }
        L_0x025f:
            boolean r0 = java.lang.Thread.interrupted()     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x0005
            java.lang.String r0 = "MessageThumbsThread/run/Thread interrupted"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x031f }
            goto L_0x031e
        L_0x026c:
            X.DRK.A04(r12)     // Catch:{ IOException -> 0x0282 }
            android.graphics.Bitmap r12 = X.DRK.A00(r12)     // Catch:{ IOException | IllegalArgumentException -> 0x027b, Exception -> 0x0274 }
            goto L_0x0299
        L_0x0274:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/unexpected gif exception "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ InterruptedException -> 0x031f }
            goto L_0x025f
        L_0x027b:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/gif file not read "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ InterruptedException -> 0x031f }
            goto L_0x025f
        L_0x0282:
            r20 = -1
            X.6c1 r0 = new X.6c1     // Catch:{ InterruptedException -> 0x031f }
            r0.<init>(r12)     // Catch:{ InterruptedException -> 0x031f }
            r21 = 0
            r17 = r0
            r18 = r2
            r19 = r1
            r24 = r21
            r16 = r3
            android.graphics.Bitmap r12 = X.C1408873l.A00(r16, r17, r18, r19, r20, r21, r22, r24)     // Catch:{ InterruptedException -> 0x031f }
        L_0x0299:
            if (r12 == 0) goto L_0x025f
            if (r8 == 0) goto L_0x02ee
            boolean r0 = r7.A0V     // Catch:{ InterruptedException -> 0x031f }
            if (r0 != 0) goto L_0x02ee
            boolean r0 = r7.A0U     // Catch:{ InterruptedException -> 0x031f }
            if (r0 != 0) goto L_0x02ee
            java.lang.String r1 = r7.A0K     // Catch:{ InterruptedException -> 0x031f }
            if (r1 == 0) goto L_0x02ee
            X.17r r0 = r6.A00     // Catch:{ InterruptedException -> 0x031f }
            java.io.File r24 = X.C26511Sk.A0H(r0, r1)     // Catch:{ InterruptedException -> 0x031f }
            boolean r0 = r24.exists()     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x02ee
            X.118 r0 = r5.A04     // Catch:{ InterruptedException -> 0x031f }
            android.content.Context r13 = r0.A00     // Catch:{ InterruptedException -> 0x031f }
            X.1KW r8 = r6.A03     // Catch:{ InterruptedException -> 0x031f }
            X.0vb r7 = r6.A02     // Catch:{ InterruptedException -> 0x031f }
            X.1Sw r3 = r5.A0A     // Catch:{ InterruptedException -> 0x031f }
            X.0ve r2 = r5.A06     // Catch:{ InterruptedException -> 0x031f }
            X.1Nq r1 = r5.A09     // Catch:{ InterruptedException -> 0x031f }
            X.1T1 r0 = r5.A02     // Catch:{ InterruptedException -> 0x031f }
            X.6yp r16 = X.C1409573s.A06     // Catch:{ InterruptedException -> 0x031f }
            r17 = r13
            r18 = r0
            r19 = r7
            r20 = r8
            r21 = r2
            r22 = r1
            r23 = r3
            X.73s r1 = r16.A01(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ InterruptedException -> 0x031f }
            if (r1 == 0) goto L_0x02ee
            boolean r0 = r12.isMutable()     // Catch:{ InterruptedException -> 0x031f }
            if (r0 != 0) goto L_0x02e7
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ InterruptedException -> 0x031f }
            android.graphics.Bitmap r12 = r12.copy(r0, r9)     // Catch:{ InterruptedException -> 0x031f }
        L_0x02e7:
            r0 = 0
            X.C18070vi.A0d(r12, r0)     // Catch:{ InterruptedException -> 0x031f }
            r1.A08(r12, r0, r0, r0)     // Catch:{ InterruptedException -> 0x031f }
        L_0x02ee:
            java.lang.Object r0 = r14.getTag()     // Catch:{ InterruptedException -> 0x031f }
            boolean r0 = r10.equals(r0)     // Catch:{ InterruptedException -> 0x031f }
            if (r0 == 0) goto L_0x030b
            r15.incrementAndGet()     // Catch:{ InterruptedException -> 0x031f }
            X.6j5 r3 = r4.A03     // Catch:{ InterruptedException -> 0x031f }
            android.os.Handler r2 = r5.A01     // Catch:{ InterruptedException -> 0x031f }
            r1 = 26
            X.7RO r0 = new X.7RO     // Catch:{ InterruptedException -> 0x031f }
            r0.<init>(r6, r3, r12, r1)     // Catch:{ InterruptedException -> 0x031f }
            r2.post(r0)     // Catch:{ InterruptedException -> 0x031f }
            goto L_0x025f
        L_0x030b:
            r12.recycle()     // Catch:{ InterruptedException -> 0x031f }
            goto L_0x025f
        L_0x0310:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ InterruptedException -> 0x031f }
            java.lang.String r0 = "MessageThumbsThread/too many result callbacks pending="
            X.C17900vP.A0j(r0, r1, r2)     // Catch:{ InterruptedException -> 0x031f }
            java.lang.Thread.sleep(r16)     // Catch:{ InterruptedException -> 0x031f }
            goto L_0x0013
        L_0x031e:
            return
        L_0x031f:
            r1 = move-exception
            java.lang.String r0 = "MessageThumbsThread/run/InterruptedException"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Q0.run():void");
    }
}
