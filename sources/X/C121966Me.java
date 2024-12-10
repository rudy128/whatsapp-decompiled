package X;

/* renamed from: X.6Me  reason: invalid class name and case insensitive filesystem */
public final class C121966Me extends C201010v {
    public final C26641Sx A00;
    public volatile boolean A01;
    public final /* synthetic */ C26631Sw A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121966Me(C26631Sw r2, C26641Sx r3) {
        super("StickerImageFileLoader");
        this.A02 = r2;
        this.A00 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r16 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            r2 = 0
            r6 = r2
        L_0x0007:
            r5 = r16
            boolean r0 = r5.A01     // Catch:{ InterruptedException -> 0x029a }
            if (r0 != 0) goto L_0x029a
            X.1Sx r4 = r5.A00     // Catch:{ InterruptedException -> 0x029a }
            monitor-enter(r4)     // Catch:{ InterruptedException -> 0x029a }
            java.util.PriorityQueue r3 = r4.A00     // Catch:{ all -> 0x0297 }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0297 }
            if (r0 == 0) goto L_0x001d
            r0 = 5000(0x1388, double:2.4703E-320)
            r4.wait(r0)     // Catch:{ all -> 0x0297 }
        L_0x001d:
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0297 }
            if (r0 != 0) goto L_0x002a
            java.lang.Object r14 = r3.remove()     // Catch:{ all -> 0x0297 }
            X.2mx r14 = (X.C59832mx) r14     // Catch:{ all -> 0x0297 }
            goto L_0x002b
        L_0x002a:
            r14 = 0
        L_0x002b:
            monitor-exit(r4)     // Catch:{ InterruptedException -> 0x029a }
            if (r14 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r3 = r2
            goto L_0x0033
        L_0x0031:
            java.lang.Integer r3 = r14.A05     // Catch:{ InterruptedException -> 0x029a }
        L_0x0033:
            boolean r0 = r5.A01     // Catch:{ InterruptedException -> 0x029a }
            if (r0 == 0) goto L_0x0039
            goto L_0x0283
        L_0x0039:
            if (r14 == 0) goto L_0x0277
            if (r3 == 0) goto L_0x004e
            X.1Sw r0 = r5.A02     // Catch:{ InterruptedException -> 0x029a }
            X.00H r0 = r0.A09     // Catch:{ InterruptedException -> 0x029a }
            X.70I r4 = X.C108945cZ.A0q(r0)     // Catch:{ InterruptedException -> 0x029a }
            int r1 = r3.intValue()     // Catch:{ InterruptedException -> 0x029a }
            java.lang.String r0 = "sticker_queue_run"
            r4.A03(r1, r0)     // Catch:{ InterruptedException -> 0x029a }
        L_0x004e:
            X.77d r4 = r14.A04     // Catch:{ InterruptedException -> 0x029a }
            boolean r0 = r4.A0N     // Catch:{ InterruptedException -> 0x029a }
            if (r0 == 0) goto L_0x0103
            X.1Sw r13 = r5.A02     // Catch:{ InterruptedException -> 0x029a }
            X.00H r0 = r13.A0A     // Catch:{ InterruptedException -> 0x029a }
            java.lang.Object r8 = r0.get()     // Catch:{ InterruptedException -> 0x029a }
            X.6gY r8 = (X.C128706gY) r8     // Catch:{ InterruptedException -> 0x029a }
            java.lang.String r0 = r4.A0B     // Catch:{ InterruptedException -> 0x029a }
            java.lang.String r7 = "local_file_exists"
            if (r0 != 0) goto L_0x00f1
            java.lang.String r6 = r4.A07     // Catch:{ InterruptedException -> 0x029a }
            if (r6 == 0) goto L_0x009f
            X.00H r0 = r8.A00     // Catch:{ InterruptedException -> 0x029a }
            java.lang.Object r5 = r0.get()     // Catch:{ InterruptedException -> 0x029a }
            X.6uS r5 = (X.C136816uS) r5     // Catch:{ InterruptedException -> 0x029a }
            X.6zL r1 = new X.6zL     // Catch:{ InterruptedException -> 0x029a }
            r1.<init>(r6)     // Catch:{ InterruptedException -> 0x029a }
            java.lang.String[] r0 = r4.A0R     // Catch:{ InterruptedException -> 0x029a }
            java.io.File r5 = r5.A00(r1, r0)     // Catch:{ InterruptedException -> 0x029a }
            boolean r0 = r5.exists()     // Catch:{ InterruptedException -> 0x029a }
            if (r0 == 0) goto L_0x00b0
            long r11 = r5.length()     // Catch:{ InterruptedException -> 0x029a }
            r9 = 0
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b0
            java.lang.Integer r6 = r14.A05     // Catch:{ InterruptedException -> 0x029a }
            if (r6 == 0) goto L_0x009c
            X.00H r0 = r8.A01     // Catch:{ InterruptedException -> 0x029a }
            X.70I r1 = X.C108945cZ.A0q(r0)     // Catch:{ InterruptedException -> 0x029a }
            int r0 = r6.intValue()     // Catch:{ InterruptedException -> 0x029a }
            r1.A03(r0, r7)     // Catch:{ InterruptedException -> 0x029a }
        L_0x009c:
            X.C108945cZ.A1O(r4, r5)     // Catch:{ InterruptedException -> 0x029a }
        L_0x009f:
            boolean r0 = r14.A07     // Catch:{ InterruptedException -> 0x029a }
            if (r0 != 0) goto L_0x0212
            X.1KB r10 = r13.A02     // Catch:{ InterruptedException -> 0x029a }
            X.11C r11 = r13.A03     // Catch:{ InterruptedException -> 0x029a }
            com.whatsapp.media.WamediaManager r12 = r13.A05     // Catch:{ InterruptedException -> 0x029a }
            java.util.concurrent.ConcurrentHashMap r15 = r13.A0F     // Catch:{ InterruptedException -> 0x029a }
            X.C26631Sw.A03(r10, r11, r12, r13, r14, r15)     // Catch:{ InterruptedException -> 0x029a }
            goto L_0x0280
        L_0x00b0:
            r5.getAbsolutePath()     // Catch:{ InterruptedException -> 0x029a }
            X.00H r0 = r8.A02     // Catch:{ InterruptedException -> 0x029a }
            java.lang.Object r1 = r0.get()     // Catch:{ InterruptedException -> 0x029a }
            X.6lV r1 = (X.C131686lV) r1     // Catch:{ InterruptedException -> 0x029a }
            r0 = 1
            java.lang.Object r5 = r1.A00(r4, r5, r0)     // Catch:{ InterruptedException -> 0x029a }
            boolean r0 = r5 instanceof X.AnonymousClass1IU     // Catch:{ InterruptedException -> 0x029a }
            if (r0 == 0) goto L_0x00c5
            r5 = 0
        L_0x00c5:
            java.io.File r5 = (java.io.File) r5     // Catch:{ InterruptedException -> 0x029a }
            java.lang.Integer r0 = r14.A05     // Catch:{ InterruptedException -> 0x029a }
            if (r0 == 0) goto L_0x00ee
            if (r5 == 0) goto L_0x009f
            X.00H r6 = r8.A01     // Catch:{ InterruptedException -> 0x029a }
            X.70I r1 = X.C108945cZ.A0q(r6)     // Catch:{ InterruptedException -> 0x029a }
            int r8 = r0.intValue()     // Catch:{ InterruptedException -> 0x029a }
            java.lang.String r0 = "sticker_downloaded"
            X.70I r1 = X.AnonymousClass70I.A00(r1, r6, r0, r8)     // Catch:{ InterruptedException -> 0x029a }
            X.6EB r0 = X.AnonymousClass6EB.A00     // Catch:{ InterruptedException -> 0x029a }
            long r10 = r5.length()     // Catch:{ InterruptedException -> 0x029a }
            X.19T r6 = r1.A01     // Catch:{ InterruptedException -> 0x029a }
            r7 = 354170068(0x151c34d4, float:3.1545623E-26)
            java.lang.String r9 = r0.A00     // Catch:{ InterruptedException -> 0x029a }
            r6.markerAnnotate((int) r7, (int) r8, (java.lang.String) r9, (long) r10)     // Catch:{ InterruptedException -> 0x029a }
            goto L_0x009c
        L_0x00ee:
            if (r5 == 0) goto L_0x009f
            goto L_0x009c
        L_0x00f1:
            java.lang.Integer r5 = r14.A05     // Catch:{ InterruptedException -> 0x029a }
            if (r5 == 0) goto L_0x009f
            X.00H r0 = r8.A01     // Catch:{ InterruptedException -> 0x029a }
            X.70I r1 = X.C108945cZ.A0q(r0)     // Catch:{ InterruptedException -> 0x029a }
            int r0 = r5.intValue()     // Catch:{ InterruptedException -> 0x029a }
            r1.A03(r0, r7)     // Catch:{ InterruptedException -> 0x029a }
            goto L_0x009f
        L_0x0103:
            boolean r0 = r4.A0O     // Catch:{ InterruptedException -> 0x029a }
            X.1Sw r13 = r5.A02     // Catch:{ InterruptedException -> 0x029a }
            if (r0 == 0) goto L_0x0171
            X.00H r0 = r13.A0B     // Catch:{ InterruptedException -> 0x029a }
            java.lang.Object r7 = r0.get()     // Catch:{ InterruptedException -> 0x029a }
            X.6f5 r7 = (X.C127876f5) r7     // Catch:{ InterruptedException -> 0x029a }
            boolean r0 = r14.A02()     // Catch:{ InterruptedException -> 0x029a }
            if (r0 == 0) goto L_0x016a
            java.lang.String r1 = r4.A0F     // Catch:{ InterruptedException -> 0x029a }
            java.lang.String r0 = "loading-hash"
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ InterruptedException -> 0x029a }
            if (r0 != 0) goto L_0x016a
            java.lang.String r0 = r4.A0B     // Catch:{ InterruptedException -> 0x029a }
            if (r0 != 0) goto L_0x016a
            java.lang.String r6 = r4.A0I     // Catch:{ Exception -> 0x0163 }
            if (r6 == 0) goto L_0x009f
            X.00H r0 = r7.A01     // Catch:{ Exception -> 0x0163 }
            java.lang.Object r5 = r0.get()     // Catch:{ Exception -> 0x0163 }
            X.72H r5 = (X.AnonymousClass72H) r5     // Catch:{ Exception -> 0x0163 }
            X.00H r0 = r7.A00     // Catch:{ Exception -> 0x0163 }
            java.lang.Object r0 = X.C18070vi.A0E(r0)     // Catch:{ Exception -> 0x0163 }
            X.0ve r0 = (X.C18030ve) r0     // Catch:{ Exception -> 0x0163 }
            boolean r1 = X.C137456vU.A01(r0)     // Catch:{ Exception -> 0x0163 }
            X.73B r0 = r4.A04     // Catch:{ Exception -> 0x0163 }
            X.77d r1 = r5.A03(r0, r6, r1)     // Catch:{ Exception -> 0x0163 }
            java.lang.String r0 = r1.A0B     // Catch:{ Exception -> 0x0163 }
            r4.A0B = r0     // Catch:{ Exception -> 0x0163 }
            java.lang.String r0 = r1.A0F     // Catch:{ Exception -> 0x0163 }
            r4.A0F = r0     // Catch:{ Exception -> 0x0163 }
            java.lang.String r0 = r1.A0D     // Catch:{ Exception -> 0x0163 }
            r4.A0D = r0     // Catch:{ Exception -> 0x0163 }
            java.lang.String r0 = r1.A0A     // Catch:{ Exception -> 0x0163 }
            r4.A0A = r0     // Catch:{ Exception -> 0x0163 }
            java.lang.String r0 = r1.A0B     // Catch:{ Exception -> 0x0163 }
            if (r0 == 0) goto L_0x0159
            r4.A0B = r0     // Catch:{ Exception -> 0x0163 }
        L_0x0159:
            X.73B r0 = r4.A04     // Catch:{ Exception -> 0x0163 }
            if (r0 != 0) goto L_0x009f
            X.73B r0 = r1.A04     // Catch:{ Exception -> 0x0163 }
            r4.A04 = r0     // Catch:{ Exception -> 0x0163 }
            goto L_0x009f
        L_0x0163:
            java.lang.String r0 = "ExternalStickerImageFileLoaderExtension/prepareExternalSticker/failure downloading from url"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x029a }
            goto L_0x009f
        L_0x016a:
            java.lang.String r0 = "ExternalStickerImageFileLoaderExtension/prepareExternalSticker/sticker cannot be downloaded"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x029a }
            goto L_0x009f
        L_0x0171:
            X.00H r0 = r13.A0D     // Catch:{ InterruptedException -> 0x029a }
            java.lang.Object r6 = r0.get()     // Catch:{ InterruptedException -> 0x029a }
            X.6f6 r6 = (X.C127886f6) r6     // Catch:{ InterruptedException -> 0x029a }
            java.lang.String r0 = r4.A0B     // Catch:{ InterruptedException -> 0x029a }
            boolean r8 = r14.A08     // Catch:{ InterruptedException -> 0x029a }
            r5 = 0
            if (r0 != 0) goto L_0x0182
            r9 = r2
            goto L_0x0186
        L_0x0182:
            java.io.File r9 = X.C108945cZ.A17(r0)     // Catch:{ InterruptedException -> 0x029a }
        L_0x0186:
            java.lang.String r7 = r4.A0F     // Catch:{ InterruptedException -> 0x029a }
            boolean r0 = r14.A02()     // Catch:{ InterruptedException -> 0x029a }
            if (r0 == 0) goto L_0x009f
            if (r7 == 0) goto L_0x009f
            java.lang.String r0 = "loading-hash"
            boolean r0 = r7.equals(r0)     // Catch:{ InterruptedException -> 0x029a }
            if (r0 != 0) goto L_0x009f
            if (r9 == 0) goto L_0x01a3
            boolean r1 = r9.exists()     // Catch:{ InterruptedException -> 0x029a }
            r0 = 1
            if (r1 != r0) goto L_0x01a3
            goto L_0x009f
        L_0x01a3:
            java.lang.String r0 = r4.A0D     // Catch:{ InterruptedException -> 0x029a }
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = r4.A0A     // Catch:{ InterruptedException -> 0x029a }
            if (r0 == 0) goto L_0x009f
            if (r8 == 0) goto L_0x01d4
            if (r9 == 0) goto L_0x01b1
            r5 = r9
            goto L_0x01d4
        L_0x01b1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ InterruptedException -> 0x029a }
            X.C108995ce.A1N(r1, r7)     // Catch:{ InterruptedException -> 0x029a }
            java.lang.String r0 = ".webp"
            java.lang.String r5 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ InterruptedException -> 0x029a }
            X.00H r0 = r6.A00     // Catch:{ InterruptedException -> 0x029a }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x029a }
            X.17r r0 = (X.C218617r) r0     // Catch:{ InterruptedException -> 0x029a }
            X.2hC r0 = r0.A08()     // Catch:{ InterruptedException -> 0x029a }
            java.io.File r1 = r0.A02     // Catch:{ InterruptedException -> 0x029a }
            r0 = 0
            X.C218617r.A07(r1, r0)     // Catch:{ InterruptedException -> 0x029a }
            java.io.File r5 = X.C17880vN.A0e(r1, r5)     // Catch:{ InterruptedException -> 0x029a }
        L_0x01d4:
            X.00H r0 = r6.A01     // Catch:{ InterruptedException -> 0x029a }
            java.lang.Object r1 = X.C18070vi.A0E(r0)     // Catch:{ InterruptedException -> 0x029a }
            X.6yU r1 = (X.C139236yU) r1     // Catch:{ InterruptedException -> 0x029a }
            r0 = 0
            X.6Tx r1 = r1.A01(r4, r5, r0)     // Catch:{ InterruptedException -> 0x029a }
            boolean r0 = r1 instanceof X.AnonymousClass6IA     // Catch:{ InterruptedException -> 0x029a }
            java.lang.String r5 = "StickerImageFileLoader/prepareNormalSticker/sticker cannot be downloaded"
            if (r0 == 0) goto L_0x0209
            X.6IA r1 = (X.AnonymousClass6IA) r1     // Catch:{ InterruptedException -> 0x029a }
            X.77d r1 = r1.A00     // Catch:{ InterruptedException -> 0x029a }
            java.lang.String r0 = r1.A0B     // Catch:{ InterruptedException -> 0x029a }
            if (r0 == 0) goto L_0x0205
            r4.A0B = r0     // Catch:{ InterruptedException -> 0x029a }
        L_0x01f1:
            java.lang.String r0 = r1.A09     // Catch:{ InterruptedException -> 0x029a }
            if (r0 == 0) goto L_0x01f7
            r4.A09 = r0     // Catch:{ InterruptedException -> 0x029a }
        L_0x01f7:
            X.73B r0 = r4.A04     // Catch:{ InterruptedException -> 0x029a }
            if (r0 != 0) goto L_0x01ff
            X.73B r0 = r1.A04     // Catch:{ InterruptedException -> 0x029a }
            r4.A04 = r0     // Catch:{ InterruptedException -> 0x029a }
        L_0x01ff:
            java.lang.String r0 = r1.A06     // Catch:{ InterruptedException -> 0x029a }
            r4.A06 = r0     // Catch:{ InterruptedException -> 0x029a }
            goto L_0x009f
        L_0x0205:
            com.whatsapp.util.Log.e((java.lang.String) r5)     // Catch:{ InterruptedException -> 0x029a }
            goto L_0x01f1
        L_0x0209:
            boolean r0 = r1 instanceof X.AnonymousClass6I9     // Catch:{ InterruptedException -> 0x029a }
            if (r0 == 0) goto L_0x009f
            com.whatsapp.util.Log.e((java.lang.String) r5)     // Catch:{ InterruptedException -> 0x029a }
            goto L_0x009f
        L_0x0212:
            boolean r0 = r14.A02()     // Catch:{ InterruptedException -> 0x029a }
            if (r0 == 0) goto L_0x0280
            java.lang.String r6 = r14.A06     // Catch:{ InterruptedException -> 0x029a }
            android.graphics.drawable.Drawable r5 = X.C26631Sw.A00(r4, r13, r6)     // Catch:{ InterruptedException -> 0x029a }
            if (r5 != 0) goto L_0x025f
            X.17r r3 = r13.A01     // Catch:{ InterruptedException -> 0x029a }
            X.11C r1 = r13.A03     // Catch:{ InterruptedException -> 0x029a }
            com.whatsapp.media.WamediaManager r0 = r13.A05     // Catch:{ InterruptedException -> 0x029a }
            byte[] r3 = X.C60582oG.A01(r3, r1, r0, r4)     // Catch:{ InterruptedException -> 0x029a }
            if (r3 == 0) goto L_0x024c
            boolean r0 = r4.A02()     // Catch:{ InterruptedException -> 0x029a }
            if (r0 == 0) goto L_0x0252
            java.lang.String r1 = r4.A0F     // Catch:{ InterruptedException -> 0x029a }
            X.00H r0 = r13.A0C     // Catch:{ InterruptedException -> 0x029a }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x029a }
            X.72L r0 = (X.AnonymousClass72L) r0     // Catch:{ InterruptedException -> 0x029a }
            X.1rd r5 = r0.A04(r1, r3)     // Catch:{ InterruptedException -> 0x029a }
            if (r5 == 0) goto L_0x024c
            java.util.concurrent.ConcurrentHashMap r1 = r13.A0F     // Catch:{ InterruptedException -> 0x029a }
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference     // Catch:{ InterruptedException -> 0x029a }
            r0.<init>(r5)     // Catch:{ InterruptedException -> 0x029a }
            r1.put(r6, r0)     // Catch:{ InterruptedException -> 0x029a }
        L_0x024c:
            X.1KB r0 = r13.A02     // Catch:{ InterruptedException -> 0x029a }
            r14.A01(r5, r0)     // Catch:{ InterruptedException -> 0x029a }
            goto L_0x0280
        L_0x0252:
            java.lang.String r0 = r4.A0F     // Catch:{ InterruptedException -> 0x029a }
            X.C17960vV.A07(r0)     // Catch:{ InterruptedException -> 0x029a }
            X.C18070vi.A0X(r0)     // Catch:{ InterruptedException -> 0x029a }
            android.graphics.drawable.Drawable r5 = X.C26631Sw.A01(r13, r14, r0, r3)     // Catch:{ InterruptedException -> 0x029a }
            goto L_0x024c
        L_0x025f:
            if (r3 == 0) goto L_0x024c
            X.00H r4 = r13.A09     // Catch:{ InterruptedException -> 0x029a }
            X.70I r1 = X.C108945cZ.A0q(r4)     // Catch:{ InterruptedException -> 0x029a }
            int r3 = r3.intValue()     // Catch:{ InterruptedException -> 0x029a }
            java.lang.String r0 = "in_memory_cache_hit"
            X.70I r1 = X.AnonymousClass70I.A00(r1, r4, r0, r3)     // Catch:{ InterruptedException -> 0x029a }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ InterruptedException -> 0x029a }
            r1.A02(r3, r0)     // Catch:{ InterruptedException -> 0x029a }
            goto L_0x024c
        L_0x0277:
            if (r6 != 0) goto L_0x0280
            X.1Sw r0 = r5.A02     // Catch:{ InterruptedException -> 0x029a }
            r0.A00 = r2     // Catch:{ InterruptedException -> 0x029a }
            r5.interrupt()     // Catch:{ InterruptedException -> 0x029a }
        L_0x0280:
            r6 = r14
            goto L_0x0007
        L_0x0283:
            if (r3 == 0) goto L_0x0296
            X.1Sw r0 = r5.A02     // Catch:{ InterruptedException -> 0x029a }
            X.00H r0 = r0.A09     // Catch:{ InterruptedException -> 0x029a }
            X.70I r2 = X.C108945cZ.A0q(r0)     // Catch:{ InterruptedException -> 0x029a }
            int r1 = r3.intValue()     // Catch:{ InterruptedException -> 0x029a }
            java.lang.Integer r0 = X.AnonymousClass00R.A0C     // Catch:{ InterruptedException -> 0x029a }
            r2.A02(r1, r0)     // Catch:{ InterruptedException -> 0x029a }
        L_0x0296:
            return
        L_0x0297:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ InterruptedException -> 0x029a }
            throw r0     // Catch:{ InterruptedException -> 0x029a }
        L_0x029a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121966Me.run():void");
    }
}
