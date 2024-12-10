package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.D9h  reason: case insensitive filesystem */
public class C26684D9h implements E41 {
    public final C24357Bzs A00;
    public final C25238CbZ A01;
    public final AtomicBoolean A02;
    public final AtomicBoolean A03;
    public final /* synthetic */ CTJ A04;

    /* JADX WARNING: type inference failed for: r11v3, types: [X.E9Q, X.D9p] */
    /* JADX WARNING: type inference failed for: r12v6, types: [X.D9k] */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e9, code lost:
        if (X.BE9.A0E("progressive.enable_throttling_data_source", r8) != 0) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0174, code lost:
        if (r0.A02 != false) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x023d, code lost:
        if (r16 != false) goto L_0x00eb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01e8  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.E9Q BHH() {
        /*
            r29 = this;
            r3 = 1
            r2 = r29
            X.CbZ r1 = r2.A01
            int r0 = r1.A01
            r11 = 0
            if (r3 != r0) goto L_0x0015
            X.BPF r2 = new X.BPF
            r2.<init>(r11)
        L_0x000f:
            X.D9j r0 = new X.D9j
            r0.<init>(r2)
            return r0
        L_0x0015:
            X.Bzs r4 = r2.A00
            X.Bzs r12 = X.C24357Bzs.PROGRESSIVE
            if (r4 != r12) goto L_0x0033
            X.D47 r0 = r1.A0C
            android.net.Uri r0 = r0.A05
            boolean r0 = X.C93.A00(r0)
            if (r0 == 0) goto L_0x0033
            X.CTJ r0 = r2.A04
            android.content.Context r1 = r0.A00
            X.DRp r0 = r0.A04
            java.lang.String r0 = r0.userAgent
            X.D9o r2 = new X.D9o
            r2.<init>(r1, r0)
            goto L_0x000f
        L_0x0033:
            X.Bzs r0 = X.C24357Bzs.DASH_TEXT
            r3 = 0
            if (r4 != r0) goto L_0x0061
            X.D47 r0 = r1.A0C
            android.net.Uri r0 = r0.A04
            boolean r1 = X.C93.A00(r0)
            X.CTJ r0 = r2.A04
            if (r1 == 0) goto L_0x0055
            android.content.Context r1 = r0.A00
            X.DRp r0 = r0.A04
            java.lang.String r0 = r0.userAgent
            X.D9o r2 = new X.D9o
            r2.<init>(r1, r0)
        L_0x004f:
            X.D9j r0 = new X.D9j
            r0.<init>(r2)
            return r0
        L_0x0055:
            X.DRp r0 = r0.A04
            java.lang.String r1 = r0.userAgent
            r0 = 8000(0x1f40, float:1.121E-41)
            X.BPL r2 = new X.BPL
            r2.<init>(r3, r1, r0)
            goto L_0x004f
        L_0x0061:
            X.CTJ r8 = r2.A04
            X.Cqn r3 = r8.A01
            X.D47 r10 = r1.A0C
            java.lang.String r9 = r10.A0H
            java.lang.String r7 = r10.A0B
            java.lang.String r6 = r10.A0C
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A03
            r27 = r0
            X.ByY r2 = r1.A03
            X.ByI r1 = r10.A06
            boolean r0 = r10.A0M
            r20 = 0
            r19 = 0
            X.CZH r5 = new X.CZH
            r21 = r5
            r22 = r2
            r23 = r1
            r24 = r9
            r25 = r7
            r26 = r6
            r28 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            if (r4 != r12) goto L_0x0092
            r20 = 1
        L_0x0092:
            java.util.Map r0 = r10.A0I
            r26 = r0
            r12 = 0
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r10 = r8.A03
            X.Cu9 r0 = r8.A02
            int r9 = X.C26185Cu9.A00(r0, r11)
            java.lang.String r18 = ""
            X.DRp r6 = r3.A0B
            boolean r0 = r6.enableTransferListenerCallbackPerfFix
            X.DBh r2 = new X.DBh
            r2.<init>(r0)
            java.util.Map r8 = r3.A0D
            java.lang.String r7 = "dash.use_liger_for_vod"
            boolean r0 = r8.containsKey(r7)
            r1 = 0
            if (r0 == 0) goto L_0x00bc
            int r0 = X.BE9.A0E(r7, r8)
            if (r0 == 0) goto L_0x00bc
            r1 = 1
        L_0x00bc:
            java.lang.String r17 = "Apache"
            r7 = 1
            if (r1 != 0) goto L_0x01f8
            boolean r0 = r6.enableLocalSocketProxy
            if (r0 != 0) goto L_0x01f8
            boolean r0 = r6.enableIgHttpDataSource
            if (r0 != 0) goto L_0x01f8
            boolean r0 = r6.enableFBLiteHttpDataSource
            if (r0 != 0) goto L_0x01f8
            java.lang.String r7 = "CacheManager_default"
            java.lang.String r1 = "using default data source for apache"
            java.lang.Object[] r0 = new java.lang.Object[r11]
            X.C25922Cog.A01(r7, r1, r0)
            java.lang.String r0 = r6.userAgent
            X.BPL r11 = new X.BPL
            r11.<init>(r12, r0, r9)
            java.lang.String r1 = "progressive.enable_throttling_data_source"
            boolean r0 = r8.containsKey(r1)
            if (r0 == 0) goto L_0x0123
            int r0 = X.BE9.A0E(r1, r8)
            if (r0 == 0) goto L_0x0123
        L_0x00eb:
            if (r20 == 0) goto L_0x0123
            java.lang.String r7 = "progressive.throttling_buffer_low"
            boolean r0 = r8.containsKey(r7)
            if (r0 == 0) goto L_0x00fb
            int r0 = X.BE9.A0E(r7, r8)
            if (r0 <= 0) goto L_0x0123
        L_0x00fb:
            java.lang.String r1 = "progressive.throttling_buffer_high"
            boolean r0 = r8.containsKey(r1)
            if (r0 == 0) goto L_0x0109
            int r0 = X.BE9.A0E(r1, r8)
            if (r0 <= 0) goto L_0x0123
        L_0x0109:
            boolean r0 = r8.containsKey(r7)
            if (r0 == 0) goto L_0x01f3
            int r7 = X.BE9.A0E(r7, r8)
        L_0x0113:
            boolean r0 = r8.containsKey(r1)
            if (r0 == 0) goto L_0x01ef
            int r1 = X.BE9.A0E(r1, r8)
        L_0x011d:
            X.D9r r0 = new X.D9r
            r0.<init>(r11, r7, r1)
            r11 = r0
        L_0x0123:
            java.lang.String r7 = "CacheManager_default"
            java.lang.Object[] r12 = X.BE6.A1a()
            r12[r19] = r17
            java.lang.String r1 = r5.A04
            r0 = 1
            r12[r0] = r1
            r0 = 8000(0x1f40, float:1.121E-41)
            X.BE8.A1M(r12, r0)
            r0 = 3
            X.C17880vN.A1T(r12, r9, r0)
            java.lang.String r0 = "Created %s Data Source for video %s (timeout_ms connect=%d read=%d)"
            X.C25922Cog.A01(r7, r0, r12)
            r3.A03()
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            java.util.ArrayList r0 = X.C17880vN.A10(r0)
            r2.A00 = r0
            int r9 = r4.value
            r27.get()
            boolean r0 = r6.enableExcessiveNumUriRedirectLogging
            if (r0 != 0) goto L_0x01e8
            r0 = 0
        L_0x0155:
            com.facebook.exoplayer.datasource.FbHttpProxyDataSource r12 = new com.facebook.exoplayer.datasource.FbHttpProxyDataSource
            r20 = r11
            r21 = r2
            r22 = r0
            r23 = r5
            r24 = r6
            r25 = r9
            r19 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25)
            X.DRe r0 = r6.cache
            boolean r0 = r0.skipCacheBeforeInited
            if (r0 == 0) goto L_0x017c
            X.BVm r0 = r3.A03
            if (r0 == 0) goto L_0x017c
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x017c
        L_0x0176:
            X.D9j r0 = new X.D9j
            r0.<init>(r12)
            return r0
        L_0x017c:
            if (r1 == 0) goto L_0x018e
            r0 = r18
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x018e
            java.lang.String r0 = "0"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x019b
        L_0x018e:
            java.lang.Object[] r1 = X.BE7.A1b(r1)
            java.lang.String r0 = "Invalid videoId is %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            android.util.Log.e(r7, r0)
        L_0x019b:
            java.lang.String r1 = "prefetch.block_on_same_cache_key_timeout_ms"
            boolean r0 = r8.containsKey(r1)
            if (r0 == 0) goto L_0x01e5
            int r19 = X.BE9.A0E(r1, r8)
        L_0x01a7:
            java.lang.String r1 = "prefetch.prefetch_max_cache_file_size"
            boolean r0 = r8.containsKey(r1)
            if (r0 == 0) goto L_0x01b6
            java.lang.String r0 = X.C17880vN.A0s(r1, r8)
            java.lang.Long.parseLong(r0)
        L_0x01b6:
            boolean r9 = r6.reduceMemoryDataSinkMemorySpike
            X.DRg r0 = r6.abrSetting
            boolean r8 = r0.hashUrlForUnique
            boolean r7 = r6.enableDynamicPrefetchCacheFileSize
            long r0 = r6.minCacheFileSizeForDynamicChunkingInBytes
            X.D9p r11 = new X.D9p
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r27
            r20 = r0
            r22 = r9
            r23 = r8
            r24 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r23, r24)
            r12 = r11
            boolean r0 = r26.isEmpty()
            if (r0 != 0) goto L_0x0176
            X.D9k r12 = new X.D9k
            r0 = r26
            r12.<init>(r11, r0)
            goto L_0x0176
        L_0x01e5:
            r19 = 8000(0x1f40, float:1.121E-41)
            goto L_0x01a7
        L_0x01e8:
            X.CNa r0 = new X.CNa
            r0.<init>(r10, r3)
            goto L_0x0155
        L_0x01ef:
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L_0x011d
        L_0x01f3:
            r7 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0113
        L_0x01f8:
            java.lang.String r0 = r6.userAgent
            X.BPL r11 = new X.BPL
            r11.<init>(r12, r0, r9)
            boolean r0 = r6.enableFBLiteHttpDataSource
            if (r0 == 0) goto L_0x0211
            java.lang.String r1 = "progressive.enable_throttling_data_source"
            boolean r0 = r8.containsKey(r1)
            if (r0 == 0) goto L_0x0241
            int r0 = X.BE9.A0E(r1, r8)
            if (r0 == 0) goto L_0x0241
        L_0x0211:
            r16 = 1
        L_0x0213:
            boolean r0 = r6.logOnApacheFallback
            if (r0 == 0) goto L_0x023d
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x023d
            r3.A04 = r7
            java.lang.String r15 = "dummy"
            X.CKm r14 = r3.A0A
            java.lang.String r13 = r5.A04
            java.lang.String r12 = "CACHE"
            java.lang.String r7 = "FALL_BACK_TO_APACHE"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "apache fallback: "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r15, r1)
            X.BVo r0 = new X.BVo
            r0.<init>(r13, r12, r7, r1)
            X.Cub r0 = r14.A00
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r0 = r0.A09
            r0.A00()
        L_0x023d:
            if (r16 == 0) goto L_0x0123
            goto L_0x00eb
        L_0x0241:
            r16 = 0
            goto L_0x0213
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26684D9h.BHH():X.E9Q");
    }

    public C26684D9h(C24357Bzs bzs, C25238CbZ cbZ, CTJ ctj, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2) {
        this.A04 = ctj;
        this.A01 = cbZ;
        this.A00 = bzs;
        this.A03 = atomicBoolean;
        this.A02 = atomicBoolean2;
    }
}
