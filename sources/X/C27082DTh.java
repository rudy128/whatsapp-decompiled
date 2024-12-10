package X;

import android.os.Handler;
import com.facebook.smartcapture.ui.DefaultCaptureOverlayFragment;

/* renamed from: X.DTh  reason: case insensitive filesystem */
public class C27082DTh implements Runnable {
    public final int A00;
    public final Object A01;

    public C27082DTh(BFG bfg, int i) {
        this.A00 = i;
        if (13 - i != 0) {
            this.A01 = bfg;
        } else {
            this.A01 = bfg;
        }
    }

    public static C27082DTh A00(Object obj, int i) {
        return new C27082DTh(obj, i);
    }

    public static void A01(Handler handler, Object obj, int i) {
        handler.post(new C27082DTh(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r8v6, types: [java.util.HashSet, java.util.AbstractCollection] */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0604, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0606, code lost:
        r2.A07.open();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x060b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x067a, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x067f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0691, code lost:
        X.BUO.A01((X.BUO) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0696, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x06e4, code lost:
        if (r6.A0A() != false) goto L_0x06e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0795, code lost:
        r0.invalidateSelf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0798, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        X.BUN.A02((X.BUN) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:697:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:716:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r16 = this;
            r3 = r16
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x05fb;
                case 1: goto L_0x0987;
                case 2: goto L_0x05d8;
                case 3: goto L_0x05bb;
                case 4: goto L_0x097f;
                case 5: goto L_0x0557;
                case 6: goto L_0x0923;
                case 7: goto L_0x0801;
                case 8: goto L_0x0544;
                case 9: goto L_0x07cf;
                case 10: goto L_0x0799;
                case 11: goto L_0x078e;
                case 12: goto L_0x078e;
                case 13: goto L_0x0789;
                case 14: goto L_0x077f;
                case 15: goto L_0x06ba;
                case 16: goto L_0x06ae;
                case 17: goto L_0x0697;
                case 18: goto L_0x068b;
                case 19: goto L_0x0688;
                case 20: goto L_0x0688;
                case 21: goto L_0x053c;
                case 22: goto L_0x0007;
                case 23: goto L_0x0007;
                case 24: goto L_0x0680;
                case 25: goto L_0x0521;
                case 26: goto L_0x0508;
                case 27: goto L_0x04ee;
                case 28: goto L_0x04d4;
                case 29: goto L_0x09bf;
                case 30: goto L_0x04c7;
                case 31: goto L_0x066b;
                case 32: goto L_0x04bb;
                case 33: goto L_0x04af;
                case 34: goto L_0x04a1;
                case 35: goto L_0x047c;
                case 36: goto L_0x0661;
                case 37: goto L_0x064e;
                case 38: goto L_0x01ae;
                case 39: goto L_0x0646;
                case 40: goto L_0x0616;
                case 41: goto L_0x098f;
                case 42: goto L_0x019a;
                case 43: goto L_0x0186;
                case 44: goto L_0x0172;
                case 45: goto L_0x015e;
                case 46: goto L_0x014a;
                case 47: goto L_0x0064;
                case 48: goto L_0x060c;
                case 49: goto L_0x000f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r3.A01
        L_0x0009:
            X.BUN r0 = (X.BUN) r0
            X.BUN.A02(r0)
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r6 = r3.A01
            X.CTv r6 = (X.C25019CTv) r6
            java.lang.Object[] r5 = X.AnonymousClass3MW.A1a()
            java.util.concurrent.ConcurrentLinkedQueue r4 = r6.A05
            int r2 = r4.size()
            java.util.Map r1 = r6.A04
            int r0 = r1.size()
            int r2 = r2 + r0
            X.AnonymousClass000.A1L(r5, r2)
            java.lang.String r3 = "PlayerWarmupScheduler"
            java.lang.String r0 = "processQueue, queueSize=%d"
            X.C25922Cog.A01(r3, r0, r5)
            java.util.concurrent.atomic.AtomicReference r0 = r6.A06
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x000e
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0042
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000e
        L_0x0042:
            boolean r0 = r6.A09
            r2 = 0
            if (r0 == 0) goto L_0x000e
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0060
            java.util.Iterator r0 = X.AnonymousClass8BU.A0x(r1)
            r0.next()
            r0 = 0
            r1.remove(r0)
        L_0x0058:
            java.lang.String r1 = "warmup queue is empty"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            X.C25922Cog.A01(r3, r1, r0)
            return
        L_0x0060:
            r4.poll()
            goto L_0x0058
        L_0x0064:
            java.lang.Object r1 = r3.A01
            X.Cub r1 = (X.C26204Cub) r1
            X.DRp r2 = r1.A0A
            boolean r0 = r2.preventPreallocateIfNotEmpty
            r3 = 1
            if (r0 == 0) goto L_0x0079
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0G
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r3)
            if (r0 != 0) goto L_0x0079
            return
        L_0x0079:
            X.CUX r1 = new X.CUX
            r1.<init>()
            r1.A0L = r3
            r1.A0K = r3
            int r0 = r2.maxMediaCodecInstancesPerCodecName
            r1.A02 = r0
            int r0 = r2.maxMediaCodecInstancesTotal
            r1.A03 = r0
            boolean r0 = r2.skipMediaCodecStopOnRelease
            r1.A0P = r0
            boolean r0 = r2.skipAudioMediaCodecStopOnRelease
            r1.A0O = r0
            boolean r0 = r2.enableCodecDeadlockFix
            r1.A0B = r0
            boolean r0 = r2.enableAsynchronousBufferQueueing
            r1.A09 = r0
            boolean r0 = r2.enableSynchronizeCodecInteractionsWithQueueing
            r1.A0N = r0
            boolean r0 = r2.enableSeamlessAudioCodecAdaptation
            r1.A0M = r0
            boolean r0 = r2.enableDrmSessionStore
            r1.A0F = r0
            boolean r0 = r2.enableLowLatencyDecoding
            r1.A0G = r0
            boolean r0 = r2.enableLowLatencyDecodingOverrideSDKGating
            r1.A0H = r0
            boolean r0 = r2.enableMediaCodecReuseOptimizeLock
            r1.A0I = r0
            java.lang.String r0 = r2.useMediaCodecPoolingForCodecByName
            r1.A07 = r0
            boolean r0 = r2.enableMediaCodecReuseOptimizeRelease
            r1.A0J = r0
            boolean r0 = r2.useVersion2_18Workarounds
            r1.A0R = r0
            boolean r0 = r2.useCodecNeedsEosBufferTimestampWorkaround
            r1.A0Q = r0
            int r0 = r2.releaseThreadInterval
            r1.A04 = r0
            boolean r0 = r2.disablePoolingForDav1dMediaCodec
            r1.A08 = r0
            boolean r0 = r2.enableAudioTrackRetry
            r1.A0A = r0
            X.Cj6 r10 = new X.Cj6
            r10.<init>(r1)
            boolean r1 = r2.enableVp9CodecPreallocation
            java.lang.String r0 = "video/avc"
            r2 = 0
            if (r1 == 0) goto L_0x00f3
            java.lang.String[] r7 = X.C17880vN.A1Z()
            r7[r2] = r0
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            r7[r3] = r0
        L_0x00e4:
            boolean r1 = r10.A09
            boolean r0 = r10.A0N
            X.D96 r3 = new X.D96
            r3.<init>(r1, r0)
            java.lang.String r6 = "audio/mp4a-latm"
            X.Csh r8 = X.C26119Csh.A04
            monitor-enter(r8)
            goto L_0x00f8
        L_0x00f3:
            java.lang.String[] r7 = new java.lang.String[r3]
            r7[r2] = r0
            goto L_0x00e4
        L_0x00f8:
            int r0 = r8.A00     // Catch:{ all -> 0x09cb }
            monitor-exit(r8)
            if (r0 > 0) goto L_0x000e
            boolean r0 = r10.A0L
            if (r0 == 0) goto L_0x000e
            int r5 = r7.length     // Catch:{ C1L | C1o | IllegalStateException -> 0x000e }
            r4 = 0
        L_0x0103:
            r0 = r7[r4]     // Catch:{ C1L | C1o | IllegalStateException -> 0x000e }
            java.util.List r1 = X.C26283Cwe.A03(r0, r2)     // Catch:{ C1L | C1o | IllegalStateException -> 0x000e }
            boolean r0 = r1.isEmpty()     // Catch:{ C1L | C1o | IllegalStateException -> 0x000e }
            if (r0 != 0) goto L_0x0123
            java.lang.Object r0 = r1.get(r2)     // Catch:{ C1L | C1o | IllegalStateException -> 0x000e }
            X.Csn r0 = (X.C26125Csn) r0     // Catch:{ C1L | C1o | IllegalStateException -> 0x000e }
            if (r0 == 0) goto L_0x0123
            java.lang.Integer r11 = X.AnonymousClass00R.A00     // Catch:{ C1L | C1o | IllegalStateException -> 0x000e }
            java.lang.String r12 = r0.A02     // Catch:{ C1L | C1o | IllegalStateException -> 0x000e }
            r13 = 1
            X.EAe r9 = r8.A02(r3, r10, r12, r13)     // Catch:{ C1L | C1o | IllegalStateException -> 0x000e }
            r8.A03(r9, r10, r11, r12, r13)     // Catch:{ C1L | C1o | IllegalStateException -> 0x000e }
        L_0x0123:
            int r4 = r4 + 1
            if (r4 < r5) goto L_0x0103
            java.util.List r1 = X.C26283Cwe.A03(r6, r2)     // Catch:{ C1L | C1o | IllegalStateException -> 0x000e }
            boolean r0 = r1.isEmpty()     // Catch:{ C1L | C1o | IllegalStateException -> 0x000e }
            if (r0 != 0) goto L_0x000e
            java.lang.Object r0 = r1.get(r2)     // Catch:{ C1L | C1o | IllegalStateException -> 0x000e }
            X.Csn r0 = (X.C26125Csn) r0     // Catch:{ C1L | C1o | IllegalStateException -> 0x000e }
            if (r0 == 0) goto L_0x000e
            java.lang.Integer r6 = X.AnonymousClass00R.A00     // Catch:{ C1L | C1o | IllegalStateException -> 0x000e }
            java.lang.String r0 = r0.A02     // Catch:{ C1L | C1o | IllegalStateException -> 0x000e }
            X.EAe r4 = r8.A02(r3, r10, r0, r2)     // Catch:{ C1L | C1o | IllegalStateException -> 0x000e }
            r3 = r8
            r5 = r10
            r7 = r0
            r8 = r2
            r3.A03(r4, r5, r6, r7, r8)     // Catch:{ C1L | C1o | IllegalStateException -> 0x000e }
            goto L_0x09ca
        L_0x014a:
            java.lang.Object r0 = r3.A01
            java.util.Iterator r1 = X.DGH.A00(r0)
        L_0x0150:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000e
            X.EAh r0 = X.BE6.A0U(r1)
            r0.C0j()
            goto L_0x0150
        L_0x015e:
            java.lang.Object r0 = r3.A01
            java.util.Iterator r1 = X.DGH.A00(r0)
        L_0x0164:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000e
            X.EAh r0 = X.BE6.A0U(r1)
            r0.C1c()
            goto L_0x0164
        L_0x0172:
            java.lang.Object r0 = r3.A01
            java.util.Iterator r1 = X.DGH.A00(r0)
        L_0x0178:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000e
            X.EAh r0 = X.BE6.A0U(r1)
            r0.CA1()
            goto L_0x0178
        L_0x0186:
            java.lang.Object r0 = r3.A01
            java.util.Iterator r1 = X.DGH.A00(r0)
        L_0x018c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000e
            X.EAh r0 = X.BE6.A0U(r1)
            r0.CA0()
            goto L_0x018c
        L_0x019a:
            java.lang.Object r0 = r3.A01
            java.util.Iterator r1 = X.DGH.A00(r0)
        L_0x01a0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000e
            X.EAh r0 = X.BE6.A0U(r1)
            r0.BsN()
            goto L_0x01a0
        L_0x01ae:
            java.lang.Object r1 = r3.A01
            X.BVd r1 = (X.C22915BVd) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.CRO r10 = r1.A01
            X.0vl r0 = r10.A00
            java.lang.Object r4 = r0.getValue()
            X.DG7 r4 = (X.DG7) r4
            java.util.HashMap r3 = X.C17880vN.A11()
            X.CaB r0 = r4.A02
            java.util.HashMap r0 = r0.A00()
            java.util.Iterator r13 = X.C17890vO.A0i(r0)
        L_0x01ce:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x025b
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r13)
            java.lang.String r12 = X.C17880vN.A0x(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x01ce
            java.lang.Object r5 = r1.getValue()
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            java.lang.String r0 = "size_config"
            org.json.JSONObject r0 = r5.optJSONObject(r0)
            r7 = 0
            if (r0 == 0) goto L_0x0259
            X.8Qu r6 = X.AnonymousClass8Qu.A00(r0)
        L_0x01f5:
            java.lang.String r0 = "staleness_config"
            org.json.JSONObject r11 = r5.optJSONObject(r0)
            if (r11 == 0) goto L_0x0257
            java.lang.String r2 = "stale_age_s"
            r0 = -1
            long r0 = r11.optLong(r2, r0)
            r8 = 0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x024a
            r8 = r7
        L_0x020c:
            if (r6 != 0) goto L_0x0211
            if (r8 != 0) goto L_0x0211
            goto L_0x01ce
        L_0x0211:
            java.lang.String r0 = "cache_name"
            java.lang.String r2 = r5.optString(r0)
            java.lang.String r1 = "eviction_type"
            java.lang.String r0 = "file"
            java.lang.String r1 = r5.optString(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0226
            r7 = r2
        L_0x0226:
            X.BVl r2 = new X.BVl
            r2.<init>(r6, r8, r1, r7)
            X.BVh r0 = r2.A02
            if (r0 != 0) goto L_0x0234
            X.8Qu r0 = r2.A01
            if (r0 != 0) goto L_0x0234
            goto L_0x01ce
        L_0x0234:
            java.lang.String r0 = r2.A00
            if (r0 != 0) goto L_0x0242
            java.lang.String r1 = "feature_name"
            java.lang.String r0 = "n/a"
            java.lang.String r0 = r5.optString(r1, r0)
            r2.A00 = r0
        L_0x0242:
            java.io.File r0 = X.C108945cZ.A17(r12)
            r3.put(r0, r2)
            goto L_0x01ce
        L_0x024a:
            java.lang.String r8 = "is_itemized"
            r2 = 0
            boolean r2 = r11.optBoolean(r8, r2)
            X.BVh r8 = new X.BVh
            r8.<init>(r0, r2)
            goto L_0x020c
        L_0x0257:
            r8 = r7
            goto L_0x020c
        L_0x0259:
            r6 = r7
            goto L_0x01f5
        L_0x025b:
            java.util.Map r0 = r4.A04
            monitor-enter(r0)
            r3.putAll(r0)     // Catch:{ all -> 0x09ce }
            monitor-exit(r0)     // Catch:{ all -> 0x09ce }
            java.util.Iterator r3 = X.C17890vO.A0i(r3)
        L_0x0266:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0278
            java.lang.Object r2 = r3.next()
            java.util.concurrent.Executor r1 = r4.A05
            r0 = 24
            X.C27076DTa.A01(r4, r2, r1, r0)
            goto L_0x0266
        L_0x0278:
            X.0vl r0 = r10.A01
            java.lang.Object r9 = r0.getValue()
            X.DG8 r9 = (X.DG8) r9
            java.util.HashMap r7 = X.C17880vN.A11()
            X.CaB r8 = r9.A00
            java.util.HashMap r0 = r8.A00()
            java.util.Iterator r4 = X.C17890vO.A0i(r0)
        L_0x028e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x02c9
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r4)
            java.lang.String r3 = X.C17880vN.A0x(r0)
            java.lang.Object r1 = r0.getValue()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x028e
            X.8Qu r2 = X.AnonymousClass8Qu.A00(r1)
            if (r2 != 0) goto L_0x02b2
            r8.A01(r3)
            goto L_0x028e
        L_0x02b2:
            java.lang.String r0 = "feature_name"
            java.lang.String r1 = r1.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x02c0
            java.lang.String r1 = "n/a"
        L_0x02c0:
            X.BVg r0 = new X.BVg
            r0.<init>(r2, r1)
            r7.put(r3, r0)
            goto L_0x028e
        L_0x02c9:
            int[] r11 = X.C20055A5d.A03()
            r6 = 15
            r5 = 0
        L_0x02d0:
            r1 = r11[r5]
            java.lang.String r4 = X.C20055A5d.A02(r1)
            X.8Qu r3 = X.C20055A5d.A00(r1)
            if (r3 == 0) goto L_0x0316
            if (r4 == 0) goto L_0x0316
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0316
            X.E52 r0 = r9.A01
            X.E51 r0 = (X.E51) r0
            X.A53 r0 = r0.BN4()
            java.util.Set r0 = r0.A04(r1)
            java.util.Iterator r2 = r0.iterator()
        L_0x02f2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0316
            java.lang.Object r0 = r2.next()
            java.io.File r0 = (java.io.File) r0
            java.lang.String r1 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x0303 }
            goto L_0x0307
        L_0x0303:
            java.lang.String r1 = r0.getAbsolutePath()
        L_0x0307:
            boolean r0 = r7.containsKey(r1)
            if (r0 != 0) goto L_0x02f2
            X.BVg r0 = new X.BVg
            r0.<init>(r3, r4)
            r7.put(r1, r0)
            goto L_0x02f2
        L_0x0316:
            int r5 = r5 + 1
            if (r5 < r6) goto L_0x02d0
            java.util.Iterator r15 = X.C17890vO.A0i(r7)
            r13 = 0
        L_0x0320:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x036c
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r15)
            java.lang.String r7 = X.C17880vN.A0x(r0)
            java.lang.Object r11 = r0.getValue()
            X.BVg r11 = (X.C22918BVg) r11
            X.C5o r12 = r11.A00
            X.8Qu r12 = (X.AnonymousClass8Qu) r12
            X.E52 r6 = r9.A01
            r0 = r6
            X.E7j r0 = (X.C28558E7j) r0
            boolean r0 = r0.BfP()
            if (r0 == 0) goto L_0x0369
            long r4 = r12.A01
        L_0x0345:
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0320
            java.io.File r3 = X.C108945cZ.A17(r7)
            X.CPi r0 = X.C25871Cnf.A01(r3)
            long r1 = r0.A02
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x035b
            r9.A00(r11, r3, r1)
            goto L_0x0320
        L_0x035b:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0320
            r6.BIM(r3)
            r8.A01(r7)
            r3.mkdirs()
            goto L_0x0320
        L_0x0369:
            long r4 = r12.A00
            goto L_0x0345
        L_0x036c:
            X.0vl r0 = r10.A02
            java.lang.Object r7 = r0.getValue()
            X.DG5 r7 = (X.DG5) r7
            java.util.HashMap r11 = X.C17880vN.A11()
            X.CaB r6 = r7.A00
            java.util.HashMap r0 = r6.A00()
            java.util.Iterator r10 = X.C17890vO.A0i(r0)
        L_0x0382:
            boolean r0 = r10.hasNext()
            r1 = -1
            if (r0 == 0) goto L_0x03d5
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r10)
            java.lang.String r8 = X.C17880vN.A0x(r0)
            java.lang.Object r9 = r0.getValue()
            org.json.JSONObject r9 = (org.json.JSONObject) r9
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0382
            java.lang.String r0 = "stale_age_s"
            long r3 = r9.optLong(r0, r1)
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x03ac
            r6.A01(r8)
            goto L_0x0382
        L_0x03ac:
            java.lang.String r5 = "is_itemized"
            r0 = 0
            boolean r0 = r9.optBoolean(r5, r0)
            X.BVh r5 = new X.BVh
            r5.<init>(r3, r0)
            java.lang.String r0 = "feature_name"
            java.lang.String r3 = r9.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x03c6
            java.lang.String r3 = "n/a"
        L_0x03c6:
            java.lang.String r0 = "usage_timestamp_s"
            long r1 = r9.optLong(r0, r1)
            X.BVj r0 = new X.BVj
            r0.<init>(r5, r3, r1)
            r11.put(r8, r0)
            goto L_0x0382
        L_0x03d5:
            int[] r12 = X.C20055A5d.A03()
            r10 = 15
            r9 = 0
        L_0x03dc:
            r3 = r12[r9]
            java.lang.String r8 = X.C20055A5d.A02(r3)
            X.BVh r5 = X.C20055A5d.A01(r3)
            if (r5 == 0) goto L_0x0422
            if (r8 == 0) goto L_0x0422
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x0422
            X.E52 r0 = r7.A01
            X.E51 r0 = (X.E51) r0
            X.A53 r0 = r0.BN4()
            java.util.Set r0 = r0.A04(r3)
            java.util.Iterator r4 = r0.iterator()
        L_0x03fe:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0422
            java.lang.Object r0 = r4.next()
            java.io.File r0 = (java.io.File) r0
            java.lang.String r3 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x040f }
            goto L_0x0413
        L_0x040f:
            java.lang.String r3 = r0.getAbsolutePath()
        L_0x0413:
            boolean r0 = r11.containsKey(r3)
            if (r0 != 0) goto L_0x03fe
            X.BVj r0 = new X.BVj
            r0.<init>(r5, r8, r1)
            r11.put(r3, r0)
            goto L_0x03fe
        L_0x0422:
            int r9 = r9 + 1
            if (r9 < r10) goto L_0x03dc
            java.util.Iterator r12 = X.C17890vO.A0i(r11)
        L_0x042a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x000e
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r12)
            java.lang.String r5 = X.C17880vN.A0x(r0)
            java.lang.Object r1 = r0.getValue()
            X.BVj r1 = (X.C22921BVj) r1
            java.io.File r4 = X.C108945cZ.A17(r5)
            long r10 = java.lang.System.currentTimeMillis()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r8
            long r2 = r1.A00
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x0454
            long r2 = r4.lastModified()
            long r2 = r2 / r8
        L_0x0454:
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x045d
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x045d
            goto L_0x042a
        L_0x045d:
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x042a
            X.C5o r0 = r1.A00
            X.BVh r0 = (X.C22919BVh) r0
            long r0 = r0.A00
            long r2 = r2 + r0
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x042a
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x042a
            X.E52 r0 = r7.A01
            r0.BIM(r4)
            r6.A01(r5)
            r4.mkdirs()
            goto L_0x042a
        L_0x047c:
            java.lang.Object r2 = r3.A01
            com.facebook.smartcapture.ui.DefaultCaptureOverlayFragment r2 = (com.facebook.smartcapture.ui.DefaultCaptureOverlayFragment) r2
            android.widget.ProgressBar r0 = r2.A04
            X.C18070vi.A0b(r0)
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r0 = 0
            android.view.ViewPropertyAnimator r0 = r1.alpha(r0)
            r0.start()
            android.animation.ObjectAnimator r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            r0.removeAllListeners()
            android.animation.ObjectAnimator r0 = r2.A00
            X.C18070vi.A0b(r0)
            r0.removeAllUpdateListeners()
            return
        L_0x04a1:
            java.lang.Object r0 = r3.A01
            com.facebook.smartcapture.components.RectDetectionVisualizerView r0 = (com.facebook.smartcapture.components.RectDetectionVisualizerView) r0
            android.os.Handler r2 = r0.A00
            if (r2 == 0) goto L_0x000e
            r0 = 33
            r2.postDelayed(r3, r0)
            return
        L_0x04af:
            java.lang.Object r0 = r3.A01
            com.facebook.smartcapture.components.DottedAlignmentView r0 = (com.facebook.smartcapture.components.DottedAlignmentView) r0
            android.animation.ValueAnimator r0 = r0.A05
            if (r0 == 0) goto L_0x000e
            r0.start()
            return
        L_0x04bb:
            java.lang.Object r0 = r3.A01
            com.facebook.smartcapture.components.DottedAlignmentView r0 = (com.facebook.smartcapture.components.DottedAlignmentView) r0
            android.animation.ValueAnimator r0 = r0.A05
            if (r0 == 0) goto L_0x000e
            r0.cancel()
            return
        L_0x04c7:
            r0 = 0
            android.os.Process.setThreadPriority(r0)
            boolean r0 = com.facebook.profilo.provider.stacktrace.CPUProfiler.sInitialized     // Catch:{ Exception -> 0x09d2 }
            if (r0 == 0) goto L_0x000e
            com.facebook.profilo.provider.stacktrace.CPUProfiler.nativeLoggerLoop()     // Catch:{ Exception -> 0x09d2 }
            goto L_0x09d1
        L_0x04d4:
            java.lang.Object r0 = r3.A01
            X.CXw r0 = (X.C25103CXw) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x04de:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r1.next()
            X.BCw r0 = (X.BCw) r0
            r0.C74()
            goto L_0x04de
        L_0x04ee:
            java.lang.Object r0 = r3.A01
            X.CXw r0 = (X.C25103CXw) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x04f8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r1.next()
            X.BCw r0 = (X.BCw) r0
            r0.C6M()
            goto L_0x04f8
        L_0x0508:
            java.lang.Object r0 = r3.A01
            X.CvG r0 = (X.C26225CvG) r0
            X.CZh r0 = r0.A0N
            java.util.List r2 = r0.A00
            int r1 = r2.size()
            r0 = 0
            if (r0 >= r1) goto L_0x000e
            r2.get(r0)
            java.lang.String r0 = "onPreviewStopped"
            java.lang.NullPointerException r3 = X.AnonymousClass000.A0s(r0)
            throw r3
        L_0x0521:
            java.lang.Object r0 = r3.A01
            X.CvG r0 = (X.C26225CvG) r0
            X.CZh r0 = r0.A0M
            java.util.List r3 = r0.A00
            int r2 = r3.size()
            r1 = 0
        L_0x052e:
            if (r1 >= r2) goto L_0x000e
            java.lang.Object r0 = r3.get(r1)
            X.E4i r0 = (X.E4i) r0
            r0.C1k()
            int r1 = r1 + 1
            goto L_0x052e
        L_0x053c:
            java.lang.Object r0 = r3.A01
            X.DE8 r0 = (X.DE8) r0
            java.lang.Object r0 = r0.A01
            goto L_0x0009
        L_0x0544:
            java.lang.Object r0 = r3.A01
            X.CPR r0 = (X.CPR) r0
            X.CuB r3 = r0.A02
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.A09
            boolean r0 = r2.get()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r1 = r3.A02
            monitor-enter(r1)
            goto L_0x09dd
        L_0x0557:
            java.lang.Object r4 = r3.A01
            X.CqX r4 = (X.C26016CqX) r4
            java.lang.Boolean r1 = X.AnonymousClass000.A0h()
            int r0 = X.C26016CqX.A0K
            r4.A07 = r1
            X.CW9 r2 = r4.A0H
            X.CwN r1 = r2.A02
            r0 = 1
            r1.A0E = r0
            java.util.Set r3 = r1.A0Q
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r0 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.LONG_PRESS
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x05b9
            int r0 = r1.A00
            if (r0 != 0) goto L_0x057f
            int r0 = r1.A01
            if (r0 != 0) goto L_0x057f
            X.C26273CwN.A01(r1)
        L_0x057f:
            r0 = 0
        L_0x0580:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A06 = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x000e
            android.view.MotionEvent r0 = r4.A05
            if (r0 == 0) goto L_0x000e
            float r0 = r0.getX()
            r4.A00 = r0
            android.view.MotionEvent r0 = r4.A05
            float r7 = r0.getY()
            r4.A01 = r7
            float r6 = r4.A00
            java.util.Map r4 = r1.A0K
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureType r3 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureType.LONG_PRESS
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L_0x0b06
            java.lang.Object r0 = r4.get(r3)
            long r4 = X.C17880vN.A05(r0)
            boolean r0 = X.C26273CwN.A08(r1, r4)
            if (r0 == 0) goto L_0x0b19
            return
        L_0x05b9:
            r0 = 1
            goto L_0x0580
        L_0x05bb:
            java.lang.Object r0 = r3.A01
            com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceListenerWrapper r0 = (com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceListenerWrapper) r0
            X.9cb r1 = r0.mListener
            if (r1 == 0) goto L_0x000e
            X.C17960vV.A02()
            X.4Pe r0 = r1.A01
            X.4DE r1 = r1.A00
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r0 = r0.A00
            X.0vl r0 = r0.A0B
            java.lang.Object r0 = r0.getValue()
            X.4Qt r0 = (X.C86214Qt) r0
            r0.A00(r1)
            return
        L_0x05d8:
            java.lang.Object r2 = r3.A01
            X.CyL r2 = (X.C26359CyL) r2
            android.media.ImageReader r0 = r2.A03
            if (r0 == 0) goto L_0x05f2
            int r1 = r0.getWidth()
            int r0 = r2.A02
            if (r1 != r0) goto L_0x05f2
            android.media.ImageReader r0 = r2.A03
            int r1 = r0.getHeight()
            int r0 = r2.A01
            if (r1 == r0) goto L_0x05f8
        L_0x05f2:
            X.C26359CyL.A01(r2)
            X.C26359CyL.A00(r2)
        L_0x05f8:
            boolean r0 = r2.A06
            goto L_0x0604
        L_0x05fb:
            java.lang.Object r2 = r3.A01
            X.CyL r2 = (X.C26359CyL) r2
            X.C26359CyL.A00(r2)
            boolean r0 = r2.A05
        L_0x0604:
            if (r0 == 0) goto L_0x000e
            android.os.ConditionVariable r0 = r2.A07
            r0.open()
            return
        L_0x060c:
            java.lang.Object r0 = r3.A01
            X.BVp r0 = (X.C22927BVp) r0
            X.DGM r0 = r0.A00
            r0.BsN()
            return
        L_0x0616:
            java.lang.Object r3 = r3.A01
            X.Cqn r3 = (X.C26029Cqn) r3
            X.DRp r0 = r3.A0B
            X.DRe r0 = r0.cache
            boolean r0 = r0.cacheManagerWaitForCacheInitialization
            if (r0 == 0) goto L_0x0642
            X.BVm r2 = r3.A03
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0642
            java.lang.Object r1 = r2.A01     // Catch:{ InterruptedException -> 0x0637 }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x0637 }
            boolean r0 = r2.A02     // Catch:{ all -> 0x0634 }
            if (r0 != 0) goto L_0x0632
            r1.wait()     // Catch:{ all -> 0x0634 }
        L_0x0632:
            monitor-exit(r1)     // Catch:{ all -> 0x0634 }
            goto L_0x0642
        L_0x0634:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0634 }
            throw r0     // Catch:{ InterruptedException -> 0x0637 }
        L_0x0637:
            java.lang.String r2 = "CacheManager_default"
            java.lang.Object[] r1 = X.BE6.A1Z()
            java.lang.String r0 = "mCache.waitForInit() has been interrupted"
            X.BE7.A1M(r0, r2, r1)
        L_0x0642:
            r3.A04()
            return
        L_0x0646:
            java.lang.Object r0 = r3.A01
            X.Cqn r0 = (X.C26029Cqn) r0
            r0.A04()
            return
        L_0x064e:
            java.lang.Object r0 = r3.A01
            com.facebook.smartcapture.view.IdCaptureActivity r0 = (com.facebook.smartcapture.view.IdCaptureActivity) r0
            X.DEn r0 = r0.A03
            if (r0 != 0) goto L_0x065d
            java.lang.String r0 = "presenter"
            X.C18070vi.A11(r0)
            r3 = 0
            throw r3
        L_0x065d:
            r0.A02()
            return
        L_0x0661:
            java.lang.Object r0 = r3.A01
            com.facebook.smartcapture.ui.DefaultCaptureOverlayFragment r0 = (com.facebook.smartcapture.ui.DefaultCaptureOverlayFragment) r0
            android.widget.ProgressBar r1 = r0.A03
            X.C18070vi.A0b(r1)
            goto L_0x067a
        L_0x066b:
            java.lang.Object r0 = r3.A01
            com.facebook.smartcapture.components.ContourView r0 = (com.facebook.smartcapture.components.ContourView) r0
            com.facebook.smartcapture.components.DottedAlignmentView r1 = r0.A0C
            r0 = 32
            X.DTh r0 = A00(r1, r0)
            r1.post(r0)
        L_0x067a:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0680:
            java.lang.Object r0 = r3.A01
            X.E9C r0 = (X.E9C) r0
            r0.Bny()
            return
        L_0x0688:
            java.lang.Object r0 = r3.A01
            goto L_0x0691
        L_0x068b:
            java.lang.Object r0 = r3.A01
            X.DE8 r0 = (X.DE8) r0
            java.lang.Object r0 = r0.A01
        L_0x0691:
            X.BUO r0 = (X.BUO) r0
            X.BUO.A01(r0)
            return
        L_0x0697:
            java.lang.Object r0 = r3.A01
            X.DEC r0 = (X.DEC) r0
            android.view.Choreographer r1 = r0.A04
            if (r1 != 0) goto L_0x06a5
            android.view.Choreographer r1 = android.view.Choreographer.getInstance()
            r0.A04 = r1
        L_0x06a5:
            X.D4X r0 = r0.A01
            r1.removeFrameCallback(r0)
            r1.postFrameCallback(r0)
            return
        L_0x06ae:
            java.lang.Object r0 = r3.A01
            X.Cqi r0 = (X.C26024Cqi) r0
            java.util.concurrent.Executor r1 = r0.A07
            java.lang.Runnable r0 = r0.A06
            r1.execute(r0)
            return
        L_0x06ba:
            java.lang.Object r7 = r3.A01
            X.Cqi r7 = (X.C26024Cqi) r7
            long r1 = android.os.SystemClock.uptimeMillis()
            monitor-enter(r7)
            X.DRJ r6 = r7.A03     // Catch:{ all -> 0x077c }
            int r5 = r7.A00     // Catch:{ all -> 0x077c }
            r0 = 0
            r7.A03 = r0     // Catch:{ all -> 0x077c }
            r0 = 0
            r7.A00 = r0     // Catch:{ all -> 0x077c }
            java.lang.Integer r0 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x077c }
            r7.A04 = r0     // Catch:{ all -> 0x077c }
            r7.A01 = r1     // Catch:{ all -> 0x077c }
            monitor-exit(r7)     // Catch:{ all -> 0x077c }
            r1 = 1
            r0 = r5 & 1
            if (r0 == r1) goto L_0x06e6
            r1 = 4
            r0 = r5 & 4
            if (r0 == r1) goto L_0x06e6
            if (r6 == 0) goto L_0x076e
            boolean r0 = r6.A0A()     // Catch:{ all -> 0x0772 }
            if (r0 == 0) goto L_0x076b
        L_0x06e6:
            X.E19 r9 = r7.A05     // Catch:{ all -> 0x0772 }
            X.DCz r9 = (X.C26770DCz) r9     // Catch:{ all -> 0x0772 }
            int r0 = r9.A00     // Catch:{ all -> 0x0772 }
            if (r0 == 0) goto L_0x0713
            if (r6 == 0) goto L_0x0708
            java.lang.Object r3 = r9.A01     // Catch:{ all -> 0x0772 }
            X.BSY r3 = (X.BSY) r3     // Catch:{ all -> 0x0772 }
            X.E4X r2 = r3.A03     // Catch:{ all -> 0x0772 }
            X.DRJ.A03(r6)     // Catch:{ all -> 0x0772 }
            X.Clu r1 = r6.A07     // Catch:{ all -> 0x0772 }
            boolean r0 = r3.A04     // Catch:{ all -> 0x0772 }
            X.E97 r0 = r2.createImageTranscoder(r1, r0)     // Catch:{ all -> 0x0772 }
            X.C26208Cuj.A01(r0)     // Catch:{ all -> 0x0772 }
            X.BSY.A00(r6, r3, r0, r5)     // Catch:{ all -> 0x0772 }
            goto L_0x076b
        L_0x0708:
            java.lang.Object r0 = r9.A01     // Catch:{ all -> 0x0772 }
            X.BSY r0 = (X.BSY) r0     // Catch:{ all -> 0x0772 }
            X.CcD r1 = r0.A00     // Catch:{ all -> 0x0772 }
            r0 = 0
            r1.A07(r0, r5)     // Catch:{ all -> 0x0772 }
            goto L_0x076e
        L_0x0713:
            if (r6 == 0) goto L_0x076e
            java.lang.Object r4 = r9.A02     // Catch:{ all -> 0x0772 }
            X.BSZ r4 = (X.BSZ) r4     // Catch:{ all -> 0x0772 }
            X.ECs r3 = r4.A04     // Catch:{ all -> 0x0772 }
            r0 = r3
            X.DDI r0 = (X.DDI) r0     // Catch:{ all -> 0x0772 }
            X.Cbv r2 = r0.A07     // Catch:{ all -> 0x0772 }
            X.DRJ.A03(r6)     // Catch:{ all -> 0x0772 }
            X.Clu r0 = r6.A07     // Catch:{ all -> 0x0772 }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x0772 }
            java.lang.String r0 = "image_format"
            r3.CD2(r0, r1)     // Catch:{ all -> 0x0772 }
            android.net.Uri r8 = r2.A03     // Catch:{ all -> 0x0772 }
            if (r8 == 0) goto L_0x0740
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x0772 }
        L_0x0734:
            r6.A08 = r0     // Catch:{ all -> 0x0772 }
            java.lang.Object r3 = r9.A01     // Catch:{ all -> 0x0772 }
            X.DDE r3 = (X.DDE) r3     // Catch:{ all -> 0x0772 }
            X.ByV r2 = r3.A01     // Catch:{ all -> 0x0772 }
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x0772 }
            goto L_0x0742
        L_0x0740:
            r0 = 0
            goto L_0x0734
        L_0x0742:
            r1 = r5 & 16
            r0 = 16
            boolean r1 = X.AnonymousClass000.A1T(r1, r0)
            X.ByV r0 = X.C24272ByV.ALWAYS     // Catch:{ all -> 0x0772 }
            if (r2 == r0) goto L_0x0754
            X.ByV r0 = X.C24272ByV.AUTO     // Catch:{ all -> 0x0772 }
            if (r2 != r0) goto L_0x0766
            if (r1 != 0) goto L_0x0766
        L_0x0754:
            boolean r0 = r3.A04     // Catch:{ all -> 0x0772 }
            if (r0 != 0) goto L_0x075e
            boolean r0 = X.C20012A3c.A01(r8)     // Catch:{ all -> 0x0772 }
            if (r0 != 0) goto L_0x0766
        L_0x075e:
            r0 = 2048(0x800, float:2.87E-42)
            int r0 = X.C9I.A00(r6, r0)     // Catch:{ all -> 0x0772 }
            r6.A03 = r0     // Catch:{ all -> 0x0772 }
        L_0x0766:
            int r0 = r4.A00     // Catch:{ all -> 0x0772 }
            X.BSZ.A02(r6, r4, r5, r0)     // Catch:{ all -> 0x0772 }
        L_0x076b:
            r6.close()
        L_0x076e:
            X.C26024Cqi.A01(r7)
            return
        L_0x0772:
            r3 = move-exception
            if (r6 == 0) goto L_0x0778
            r6.close()
        L_0x0778:
            X.C26024Cqi.A01(r7)
            throw r3
        L_0x077c:
            r3 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x077c }
            throw r3
        L_0x077f:
            X.Ckd r1 = X.C25707Ckd.A02
            java.lang.Object r0 = r3.A01
            X.BFG r0 = (X.BFG) r0
            r1.A01(r0)
            return
        L_0x0789:
            java.lang.Object r0 = r3.A01
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            goto L_0x0795
        L_0x078e:
            java.lang.Object r0 = r3.A01
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.unscheduleSelf(r3)
        L_0x0795:
            r0.invalidateSelf()
            return
        L_0x0799:
            java.lang.Object r5 = r3.A01
            X.DBj r5 = (X.C26732DBj) r5
            monitor-enter(r5)
            r0 = 0
            r5.A03 = r0     // Catch:{ all -> 0x07cc }
            X.E7V r0 = r5.A06     // Catch:{ all -> 0x07cc }
            long r3 = r0.now()     // Catch:{ all -> 0x07cc }
            long r0 = r5.A00     // Catch:{ all -> 0x07cc }
            long r3 = r3 - r0
            r1 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x07c7
            X.DBk r1 = r5.A02     // Catch:{ all -> 0x07cc }
            if (r1 == 0) goto L_0x07bf
            boolean r0 = r1.A08     // Catch:{ all -> 0x07cc }
            if (r0 == 0) goto L_0x07c1
            X.E96 r0 = r1.A06     // Catch:{ all -> 0x07cc }
            if (r0 == 0) goto L_0x07bf
            r0.C6z()     // Catch:{ all -> 0x07cc }
        L_0x07bf:
            monitor-exit(r5)     // Catch:{ all -> 0x07cc }
            goto L_0x07cb
        L_0x07c1:
            X.E9u r0 = r1.A05     // Catch:{ all -> 0x07cc }
            r0.clear()     // Catch:{ all -> 0x07cc }
            goto L_0x07bf
        L_0x07c7:
            X.C26732DBj.A00(r5)     // Catch:{ all -> 0x07cc }
            goto L_0x07bf
        L_0x07cb:
            return
        L_0x07cc:
            r3 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x07cc }
            throw r3
        L_0x07cf:
            java.lang.Object r3 = r3.A01
            X.CSh r3 = (X.C24982CSh) r3
            java.lang.Object r2 = r3.A03
            monitor-enter(r2)
            java.util.ArrayList r1 = r3.A01     // Catch:{ all -> 0x07fe }
            java.util.ArrayList r0 = r3.A00     // Catch:{ all -> 0x07fe }
            r3.A01 = r0     // Catch:{ all -> 0x07fe }
            r3.A00 = r1     // Catch:{ all -> 0x07fe }
            monitor-exit(r2)     // Catch:{ all -> 0x07fe }
            java.util.ArrayList r0 = r3.A01
            int r2 = r0.size()
            r1 = 0
        L_0x07e6:
            java.util.ArrayList r0 = r3.A01
            if (r1 >= r2) goto L_0x07fa
            java.lang.Object r0 = r0.get(r1)
            X.DTh r0 = (X.C27082DTh) r0
            java.lang.Object r0 = r0.A01
            X.BFG r0 = (X.BFG) r0
            r0.A01()
            int r1 = r1 + 1
            goto L_0x07e6
        L_0x07fa:
            r0.clear()
            return
        L_0x07fe:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x07fe }
            throw r3
        L_0x0801:
            java.lang.Object r6 = r3.A01
            X.CuB r6 = (X.C26187CuB) r6
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            int r0 = r1.getPriority()
            r1.setPriority(r0)
            java.lang.String r1 = "LightSharedPreferences.tryLoadSharedPreference"
            java.lang.reflect.Method r0 = X.AnonymousClass1CH.A03
            android.os.Trace.beginSection(r1)
            r5 = 1
            java.lang.Object r7 = r6.A02     // Catch:{ all -> 0x0917 }
            monitor-enter(r7)     // Catch:{ all -> 0x0917 }
            X.Cjm r11 = r6.A01     // Catch:{ all -> 0x0914 }
            java.util.Map r4 = r6.A05     // Catch:{ all -> 0x0914 }
            X.0vp r0 = r11.A01     // Catch:{ all -> 0x0914 }
            java.lang.Object r10 = r0.get()     // Catch:{ all -> 0x0914 }
            java.io.File r10 = (java.io.File) r10     // Catch:{ all -> 0x0914 }
            boolean r0 = r10.exists()     // Catch:{ all -> 0x0914 }
            if (r0 == 0) goto L_0x0908
            java.io.FileInputStream r2 = X.C108945cZ.A18(r10)     // Catch:{ C1O | ArrayStoreException | IllegalArgumentException -> 0x08cf, IOException -> 0x08cc }
            r1 = 512(0x200, float:7.175E-43)
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ C1O | ArrayStoreException | IllegalArgumentException -> 0x08cf, IOException -> 0x08cc }
            r0.<init>(r2, r1)     // Catch:{ C1O | ArrayStoreException | IllegalArgumentException -> 0x08cf, IOException -> 0x08cc }
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch:{ C1O | ArrayStoreException | IllegalArgumentException -> 0x08cf, IOException -> 0x08cc }
            r2.<init>(r0)     // Catch:{ C1O | ArrayStoreException | IllegalArgumentException -> 0x08cf, IOException -> 0x08cc }
            int r3 = r2.readUnsignedByte()     // Catch:{ all -> 0x08c2 }
            if (r3 != r5) goto L_0x0848
            int r0 = r2.readInt()     // Catch:{ all -> 0x08c2 }
            goto L_0x08b9
        L_0x0848:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x08c2 }
            java.lang.String r0 = "Expected version 1; got "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r3)     // Catch:{ all -> 0x08c2 }
            X.C1O r1 = new X.C1O     // Catch:{ all -> 0x08c2 }
            r1.<init>(r0)     // Catch:{ all -> 0x08c2 }
            goto L_0x086d
        L_0x0858:
            int r8 = r2.readUnsignedByte()     // Catch:{ all -> 0x08c2 }
            java.lang.String r3 = r2.readUTF()     // Catch:{ all -> 0x08c2 }
            switch(r8) {
                case 0: goto L_0x08ad;
                case 1: goto L_0x088e;
                case 2: goto L_0x0885;
                case 3: goto L_0x087c;
                case 4: goto L_0x0873;
                case 5: goto L_0x086e;
                case 6: goto L_0x0897;
                default: goto L_0x0863;
            }     // Catch:{ all -> 0x08c2 }
        L_0x0863:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x08c2 }
            java.lang.String r0 = "Unsupported type with ordinal: "
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A13(r0, r1, r8)     // Catch:{ all -> 0x08c2 }
        L_0x086d:
            throw r1     // Catch:{ all -> 0x08c2 }
        L_0x086e:
            java.lang.String r8 = r2.readUTF()     // Catch:{ all -> 0x08c2 }
            goto L_0x08b5
        L_0x0873:
            double r0 = r2.readDouble()     // Catch:{ all -> 0x08c2 }
            java.lang.Double r8 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x08c2 }
            goto L_0x08b5
        L_0x087c:
            float r0 = r2.readFloat()     // Catch:{ all -> 0x08c2 }
            java.lang.Float r8 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x08c2 }
            goto L_0x08b5
        L_0x0885:
            long r0 = r2.readLong()     // Catch:{ all -> 0x08c2 }
            java.lang.Long r8 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x08c2 }
            goto L_0x08b5
        L_0x088e:
            int r0 = r2.readInt()     // Catch:{ all -> 0x08c2 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x08c2 }
            goto L_0x08b5
        L_0x0897:
            int r0 = r2.readInt()     // Catch:{ all -> 0x08c2 }
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ all -> 0x08c2 }
            r8.<init>(r0)     // Catch:{ all -> 0x08c2 }
        L_0x08a0:
            int r1 = r0 + -1
            if (r0 <= 0) goto L_0x08b5
            java.lang.String r0 = r2.readUTF()     // Catch:{ all -> 0x08c2 }
            r8.add(r0)     // Catch:{ all -> 0x08c2 }
            r0 = r1
            goto L_0x08a0
        L_0x08ad:
            boolean r0 = r2.readBoolean()     // Catch:{ all -> 0x08c2 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x08c2 }
        L_0x08b5:
            r4.put(r3, r8)     // Catch:{ all -> 0x08c2 }
            r0 = r9
        L_0x08b9:
            int r9 = r0 + -1
            if (r0 <= 0) goto L_0x08be
            goto L_0x0858
        L_0x08be:
            r2.close()     // Catch:{ C1O | ArrayStoreException | IllegalArgumentException -> 0x08cf, IOException -> 0x08cc }
            goto L_0x0908
        L_0x08c2:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x08c7 }
            goto L_0x08cb
        L_0x08c7:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ C1O | ArrayStoreException | IllegalArgumentException -> 0x08cf, IOException -> 0x08cc }
        L_0x08cb:
            throw r1     // Catch:{ C1O | ArrayStoreException | IllegalArgumentException -> 0x08cf, IOException -> 0x08cc }
        L_0x08cc:
            r9 = move-exception
            r8 = 0
            goto L_0x08d1
        L_0x08cf:
            r9 = move-exception
            r8 = 1
        L_0x08d1:
            java.lang.Class<X.Cjm> r4 = X.C25656Cjm.class
            java.lang.String r3 = "Failed to read or parse SharedPreferences from: %s; Raw file: %s"
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1b()     // Catch:{ all -> 0x08fd }
            java.lang.String r1 = r10.getAbsolutePath()     // Catch:{ all -> 0x08fd }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x08fd }
            java.lang.String r0 = r11.A00()     // Catch:{ all -> 0x08fd }
            r2[r5] = r0     // Catch:{ all -> 0x08fd }
            boolean r0 = X.BE8.A1R()     // Catch:{ all -> 0x08fd }
            if (r0 == 0) goto L_0x08f7
            java.lang.String r1 = r4.getSimpleName()     // Catch:{ all -> 0x08fd }
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r3, (java.lang.Object[]) r2)     // Catch:{ all -> 0x08fd }
            X.C26294Cx6.A09(r1, r0, r9)     // Catch:{ all -> 0x08fd }
        L_0x08f7:
            if (r8 == 0) goto L_0x0908
            r10.delete()     // Catch:{ all -> 0x08fd }
            goto L_0x0908
        L_0x08fd:
            r2 = move-exception
            X.AnonymousClass0DT.A00(r2, r9)     // Catch:{ all -> 0x0914 }
            java.lang.String r1 = "LightSharedPreferencesStorage"
            java.lang.String r0 = "Error while logging exception"
            X.C26294Cx6.A09(r1, r0, r2)     // Catch:{ all -> 0x0914 }
        L_0x0908:
            monitor-exit(r7)     // Catch:{ all -> 0x0914 }
            r6.A0A = r5
            java.util.concurrent.CountDownLatch r0 = r6.A07
            r0.countDown()
            android.os.Trace.endSection()
            return
        L_0x0914:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0914 }
            throw r0     // Catch:{ all -> 0x0917 }
        L_0x0917:
            r1 = move-exception
            r6.A0A = r5
            java.util.concurrent.CountDownLatch r0 = r6.A07
            r0.countDown()
            android.os.Trace.endSection()
            throw r1
        L_0x0923:
            java.lang.String r5 = "%s: worker finished; %d workers left"
            java.lang.Object r6 = r3.A01     // Catch:{ all -> 0x095c }
            X.Dc5 r6 = (X.C27333Dc5) r6     // Catch:{ all -> 0x095c }
            java.util.concurrent.BlockingQueue r4 = r6.A01     // Catch:{ all -> 0x095c }
            java.lang.Object r0 = r4.poll()     // Catch:{ all -> 0x095c }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x095c }
            if (r0 == 0) goto L_0x0937
            r0.run()     // Catch:{ all -> 0x095c }
            goto L_0x0940
        L_0x0937:
            java.lang.Class<X.Dc5> r2 = X.C27333Dc5.class
            java.lang.String r1 = "%s: Worker has nothing to run"
            java.lang.String r0 = r6.A00     // Catch:{ all -> 0x095c }
            X.C26265CwA.A02(r2, r0, r1)     // Catch:{ all -> 0x095c }
        L_0x0940:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A02
            int r3 = r0.decrementAndGet()
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0950
            X.C27333Dc5.A00(r6)
            return
        L_0x0950:
            java.lang.Class<X.Dc5> r2 = X.C27333Dc5.class
            java.lang.String r1 = r6.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            X.C26265CwA.A01(r2, r1, r0, r5)
            return
        L_0x095c:
            r4 = move-exception
            java.lang.Object r1 = r3.A01
            X.Dc5 r1 = (X.C27333Dc5) r1
            java.util.concurrent.atomic.AtomicInteger r0 = r1.A02
            int r3 = r0.decrementAndGet()
            java.util.concurrent.BlockingQueue r0 = r1.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0973
            X.C27333Dc5.A00(r1)
            throw r4
        L_0x0973:
            java.lang.Class<X.Dc5> r2 = X.C27333Dc5.class
            java.lang.String r1 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            X.C26265CwA.A01(r2, r1, r0, r5)
            throw r4
        L_0x097f:
            java.lang.Object r0 = r3.A01
            X.CwN r0 = (X.C26273CwN) r0
            X.C26273CwN.A01(r0)
            return
        L_0x0987:
            java.lang.Object r0 = r3.A01
            X.CyL r0 = (X.C26359CyL) r0
            X.C26359CyL.A01(r0)
            return
        L_0x098f:
            java.lang.Object r2 = r3.A01     // Catch:{ all -> 0x09b6 }
            X.CiM r2 = (X.C25582CiM) r2     // Catch:{ all -> 0x09b6 }
            java.util.List r1 = r2.A01     // Catch:{ all -> 0x09b6 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x09b6 }
            if (r0 != 0) goto L_0x09b2
            monitor-enter(r1)     // Catch:{ all -> 0x09b6 }
            X.BVn r0 = new X.BVn     // Catch:{ all -> 0x09af }
            r0.<init>(r1)     // Catch:{ all -> 0x09af }
            r1.clear()     // Catch:{ all -> 0x09af }
            monitor-exit(r1)     // Catch:{ all -> 0x09af }
            X.CKm r0 = r2.A00     // Catch:{ all -> 0x09b6 }
            X.Cub r0 = r0.A00     // Catch:{ all -> 0x09b6 }
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r0 = r0.A09     // Catch:{ all -> 0x09b6 }
            r0.A00()     // Catch:{ all -> 0x09b6 }
            goto L_0x09b2
        L_0x09af:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x09af }
            throw r0     // Catch:{ all -> 0x09b6 }
        L_0x09b2:
            X.C25582CiM.A00(r2)
            return
        L_0x09b6:
            r1 = move-exception
            java.lang.Object r0 = r3.A01
            X.CiM r0 = (X.C25582CiM) r0
            X.C25582CiM.A00(r0)
            throw r1
        L_0x09bf:
            java.lang.String r1 = "Unhandled camera exception"
            java.lang.Object r0 = r3.A01
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.RuntimeException r3 = X.BE6.A0o(r1, r0)
            throw r3
        L_0x09ca:
            return
        L_0x09cb:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x09ce:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x09ce }
            throw r3
        L_0x09d1:
            return
        L_0x09d2:
            r2 = move-exception
            java.lang.String r1 = "StackFrameThread"
            java.lang.String r0 = r2.getMessage()
            android.util.Log.e(r1, r0, r2)
            return
        L_0x09dd:
            r0 = 0
            r2.set(r0)     // Catch:{ all -> 0x0b03 }
            java.util.Map r0 = r3.A05     // Catch:{ all -> 0x0b03 }
            java.util.HashMap r6 = X.BE6.A10(r0)     // Catch:{ all -> 0x0b03 }
            monitor-exit(r1)     // Catch:{ all -> 0x0b03 }
            X.Cjm r5 = r3.A01     // Catch:{ IOException -> 0x0afa }
            X.0vp r0 = r5.A01     // Catch:{ IOException -> 0x0afa }
            java.lang.Object r4 = r0.get()     // Catch:{ IOException -> 0x0afa }
            java.io.File r4 = (java.io.File) r4     // Catch:{ IOException -> 0x0afa }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0afa }
            java.lang.String r0 = r4.getName()     // Catch:{ IOException -> 0x0afa }
            r1.append(r0)     // Catch:{ IOException -> 0x0afa }
            java.lang.String r0 = "."
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ IOException -> 0x0afa }
            java.lang.String r1 = ".tmp"
            java.io.File r0 = r4.getParentFile()     // Catch:{ IOException -> 0x0afa }
            java.io.File r3 = java.io.File.createTempFile(r2, r1, r0)     // Catch:{ IOException -> 0x0afa }
            java.io.FileOutputStream r2 = X.C108945cZ.A19(r3)     // Catch:{ IOException -> 0x0afa }
            r1 = 512(0x200, float:7.175E-43)
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0afa }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x0afa }
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0afa }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0afa }
            r0 = 1
            r2.writeByte(r0)     // Catch:{ all -> 0x0af5 }
            int r0 = r6.size()     // Catch:{ all -> 0x0af5 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0af5 }
            java.util.Iterator r7 = X.AnonymousClass000.A15(r6)     // Catch:{ all -> 0x0af5 }
        L_0x0a2c:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0af5 }
            if (r0 == 0) goto L_0x0ad0
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r7)     // Catch:{ all -> 0x0af5 }
            java.lang.String r1 = X.C17880vN.A0x(r0)     // Catch:{ all -> 0x0af5 }
            java.lang.Object r6 = r0.getValue()     // Catch:{ all -> 0x0af5 }
            boolean r0 = r6 instanceof java.lang.Boolean     // Catch:{ all -> 0x0af5 }
            if (r0 == 0) goto L_0x0a44
            r0 = 0
            goto L_0x0a67
        L_0x0a44:
            boolean r0 = r6 instanceof java.lang.Integer     // Catch:{ all -> 0x0af5 }
            if (r0 == 0) goto L_0x0a4a
            r0 = 1
            goto L_0x0a67
        L_0x0a4a:
            boolean r0 = r6 instanceof java.lang.Long     // Catch:{ all -> 0x0af5 }
            if (r0 == 0) goto L_0x0a50
            r0 = 2
            goto L_0x0a67
        L_0x0a50:
            boolean r0 = r6 instanceof java.lang.Float     // Catch:{ all -> 0x0af5 }
            if (r0 == 0) goto L_0x0a56
            r0 = 3
            goto L_0x0a67
        L_0x0a56:
            boolean r0 = r6 instanceof java.lang.Double     // Catch:{ all -> 0x0af5 }
            if (r0 == 0) goto L_0x0a5c
            r0 = 4
            goto L_0x0a67
        L_0x0a5c:
            boolean r0 = r6 instanceof java.lang.String     // Catch:{ all -> 0x0af5 }
            if (r0 == 0) goto L_0x0a62
            r0 = 5
            goto L_0x0a67
        L_0x0a62:
            boolean r0 = r6 instanceof java.util.Set     // Catch:{ all -> 0x0af5 }
            if (r0 == 0) goto L_0x0ac2
            r0 = 6
        L_0x0a67:
            r2.write(r0)     // Catch:{ all -> 0x0af5 }
            r2.writeUTF(r1)     // Catch:{ all -> 0x0af5 }
            switch(r0) {
                case 0: goto L_0x0a8b;
                case 1: goto L_0x0a93;
                case 2: goto L_0x0a9b;
                case 3: goto L_0x0aa5;
                case 4: goto L_0x0ab0;
                case 5: goto L_0x0abb;
                default: goto L_0x0a70;
            }     // Catch:{ all -> 0x0af5 }
        L_0x0a70:
            java.util.Set r6 = (java.util.Set) r6     // Catch:{ all -> 0x0af5 }
            int r0 = r6.size()     // Catch:{ all -> 0x0af5 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0af5 }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x0af5 }
        L_0x0a7d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0af5 }
            if (r0 == 0) goto L_0x0a2c
            java.lang.String r0 = X.C17880vN.A0v(r1)     // Catch:{ all -> 0x0af5 }
            r2.writeUTF(r0)     // Catch:{ all -> 0x0af5 }
            goto L_0x0a7d
        L_0x0a8b:
            boolean r0 = X.AnonymousClass000.A1Y(r6)     // Catch:{ all -> 0x0af5 }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x0af5 }
            goto L_0x0a2c
        L_0x0a93:
            int r0 = X.BE6.A0F(r6)     // Catch:{ all -> 0x0af5 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0af5 }
            goto L_0x0a2c
        L_0x0a9b:
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x0af5 }
            long r0 = r6.longValue()     // Catch:{ all -> 0x0af5 }
            r2.writeLong(r0)     // Catch:{ all -> 0x0af5 }
            goto L_0x0a2c
        L_0x0aa5:
            java.lang.Float r6 = (java.lang.Float) r6     // Catch:{ all -> 0x0af5 }
            float r0 = r6.floatValue()     // Catch:{ all -> 0x0af5 }
            r2.writeFloat(r0)     // Catch:{ all -> 0x0af5 }
            goto L_0x0a2c
        L_0x0ab0:
            java.lang.Double r6 = (java.lang.Double) r6     // Catch:{ all -> 0x0af5 }
            double r0 = r6.doubleValue()     // Catch:{ all -> 0x0af5 }
            r2.writeDouble(r0)     // Catch:{ all -> 0x0af5 }
            goto L_0x0a2c
        L_0x0abb:
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0af5 }
            r2.writeUTF(r6)     // Catch:{ all -> 0x0af5 }
            goto L_0x0a2c
        L_0x0ac2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0af5 }
            java.lang.String r0 = "Unsupported type: "
            X.BE9.A1G(r6, r0, r1)     // Catch:{ all -> 0x0af5 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0j(r1)     // Catch:{ all -> 0x0af5 }
            throw r0     // Catch:{ all -> 0x0af5 }
        L_0x0ad0:
            r2.close()     // Catch:{ IOException -> 0x0afa }
            java.lang.Object r2 = r5.A00     // Catch:{ IOException -> 0x0afa }
            monitor-enter(r2)     // Catch:{ IOException -> 0x0afa }
            boolean r0 = r3.renameTo(r4)     // Catch:{ all -> 0x0af2 }
            if (r0 != 0) goto L_0x0af0
            boolean r0 = r3.delete()     // Catch:{ all -> 0x0af2 }
            if (r0 != 0) goto L_0x0ae9
            java.lang.String r1 = "LightSharedPreferencesStorage"
            java.lang.String r0 = "Unable to delete temporary preferences file."
            X.C26294Cx6.A07(r1, r0)     // Catch:{ all -> 0x0af2 }
        L_0x0ae9:
            java.lang.String r0 = "Failed to replace the current preference file!"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x0af2 }
            throw r0     // Catch:{ all -> 0x0af2 }
        L_0x0af0:
            monitor-exit(r2)     // Catch:{ all -> 0x0af2 }
            return
        L_0x0af2:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0af2 }
            goto L_0x0af9
        L_0x0af5:
            r0 = move-exception
            r2.close()     // Catch:{ IOException -> 0x0afa }
        L_0x0af9:
            throw r0     // Catch:{ IOException -> 0x0afa }
        L_0x0afa:
            r2 = move-exception
            java.lang.String r1 = "LightSharedPreferencesImpl"
            java.lang.String r0 = "Commit to disk failed."
            X.C26294Cx6.A0B(r1, r0, r2)
            return
        L_0x0b03:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0b03 }
            throw r3
        L_0x0b06:
            long r4 = X.C26273CwN.A00(r1, r3)
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r8 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.BEGAN
            float r10 = r2.A00
            float r11 = r2.A01
            r9 = 1
            com.facebook.cameracore.mediapipeline.services.touch.implementation.LongPressGesture r3 = new com.facebook.cameracore.mediapipeline.services.touch.implementation.LongPressGesture
            r3.<init>(r4, r6, r7, r8, r9, r10, r11)
            X.C26273CwN.A05(r1, r3)
        L_0x0b19:
            com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture$GestureState r8 = com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture.GestureState.CHANGED
            float r10 = r2.A00
            float r11 = r2.A01
            r9 = 1
            com.facebook.cameracore.mediapipeline.services.touch.implementation.LongPressGesture r3 = new com.facebook.cameracore.mediapipeline.services.touch.implementation.LongPressGesture
            r3.<init>(r4, r6, r7, r8, r9, r10, r11)
            X.C26273CwN.A05(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27082DTh.run():void");
    }

    public C27082DTh(DefaultCaptureOverlayFragment defaultCaptureOverlayFragment) {
        this.A00 = 35;
        this.A01 = defaultCaptureOverlayFragment;
    }

    public C27082DTh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
