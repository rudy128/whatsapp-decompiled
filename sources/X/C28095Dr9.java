package X;

import java.util.concurrent.Executor;

/* renamed from: X.Dr9  reason: case insensitive filesystem */
public final class C28095Dr9 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ String $appId;
    public final /* synthetic */ String $cacheKey;
    public final /* synthetic */ String $cacheLookupDedupeKey;
    public final /* synthetic */ C22821Di $callback;
    public final /* synthetic */ boolean $diskCacheEnabled;
    public final /* synthetic */ boolean $isPayloadPrebundled = false;
    public final /* synthetic */ C25206Caz $queryInfo;
    public final /* synthetic */ Executor $responseThreadExecutor;
    public final /* synthetic */ CX0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28095Dr9(CX0 cx0, C25206Caz caz, String str, String str2, String str3, Executor executor, C22821Di r8, boolean z) {
        super(1);
        this.this$0 = cx0;
        this.$cacheLookupDedupeKey = str;
        this.$callback = r8;
        this.$cacheKey = str2;
        this.$appId = str3;
        this.$queryInfo = caz;
        this.$diskCacheEnabled = z;
        this.$responseThreadExecutor = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r8.$isPayloadPrebundled != false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r9) {
        /*
            r8 = this;
            X.CZp r9 = (X.C25139CZp) r9
            if (r9 == 0) goto L_0x005c
            X.1D6 r6 = r9.A00
        L_0x0006:
            X.CX0 r0 = r8.this$0
            java.util.Set r1 = r0.A03
            java.lang.String r0 = r8.$cacheLookupDedupeKey
            r1.remove(r0)
            if (r6 == 0) goto L_0x0042
            java.lang.Object r5 = r6.first
            X.CO9 r5 = (X.CO9) r5
            boolean r0 = r5 instanceof X.C23727BoY
            if (r0 == 0) goto L_0x003f
            X.1Di r4 = r8.$callback
            java.lang.String r3 = r8.$cacheKey
            X.BoY r5 = (X.C23727BoY) r5
            com.instagram.common.bloks.payload.BloksComponentQueryResources r2 = r5.A01
            java.lang.Object r1 = r6.second
            X.CO7 r1 = (X.CO7) r1
            X.BoV r0 = new X.BoV
            r0.<init>(r1, r2, r3)
            r4.invoke(r0)
            X.1Di r4 = r8.$callback
            java.lang.String r3 = r8.$cacheKey
            X.Cad r2 = r5.A00
            java.lang.Object r1 = r6.second
            X.CO7 r1 = (X.CO7) r1
            X.BoU r0 = new X.BoU
            r0.<init>(r2, r1, r3)
            r4.invoke(r0)
        L_0x003f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0042:
            X.CX0 r1 = r8.this$0
            java.lang.String r3 = r8.$cacheKey
            java.lang.String r4 = r8.$appId
            X.Caz r2 = r8.$queryInfo
            boolean r0 = r8.$diskCacheEnabled
            if (r0 == 0) goto L_0x0053
            boolean r0 = r8.$isPayloadPrebundled
            r7 = 1
            if (r0 == 0) goto L_0x0054
        L_0x0053:
            r7 = 0
        L_0x0054:
            java.util.concurrent.Executor r5 = r8.$responseThreadExecutor
            X.1Di r6 = r8.$callback
            r1.A00(r2, r3, r4, r5, r6, r7)
            goto L_0x003f
        L_0x005c:
            r6 = 0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28095Dr9.invoke(java.lang.Object):java.lang.Object");
    }
}
