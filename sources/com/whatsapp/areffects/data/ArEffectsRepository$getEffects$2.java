package com.whatsapp.areffects.data;

import X.AnonymousClass1OS;
import X.AnonymousClass4D9;
import X.C183829Zt;
import X.C18560wh;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.data.ArEffectsRepository$getEffects$2", f = "ArEffectsRepository.kt", i = {0}, l = {64}, m = "invokeSuspend", n = {"cachedEffectsMap"}, s = {"L$0"})
public final class ArEffectsRepository$getEffects$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Set $categories;
    public final /* synthetic */ C18560wh $coroutineContext;
    public final /* synthetic */ AnonymousClass4D9 $surface;
    public Object L$0;
    public int label;
    public final /* synthetic */ C183829Zt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectsRepository$getEffects$2(C183829Zt r2, AnonymousClass4D9 r3, Set set, C30391dr r5, C18560wh r6) {
        super(2, r5);
        this.this$0 = r2;
        this.$surface = r3;
        this.$categories = set;
        this.$coroutineContext = r6;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new ArEffectsRepository$getEffects$2(this.this$0, this.$surface, this.$categories, r8, this.$coroutineContext);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0057, code lost:
        if (r5 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a0, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a1, code lost:
        com.whatsapp.util.Log.e("ArEffectsCacheDataSource/getEffects Failed to read from file", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a7, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        com.whatsapp.util.Log.e("ArEffectsCacheDataSource/getEffects Error parsing data from file", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01b9, code lost:
        com.whatsapp.util.Log.e("ArEffectsRepository/getEffects Fetch failed, returning cached effects", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01be, code lost:
        return r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r13.label
            r1 = 1
            if (r0 == 0) goto L_0x0014
            if (r0 != r1) goto L_0x000f
            java.lang.Object r3 = r13.L$0
            java.util.Map r3 = (java.util.Map) r3
            goto L_0x0142
        L_0x000f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0014:
            X.C30691eM.A01(r14)
            X.9Zt r0 = r13.this$0
            X.00H r0 = r0.A00
            java.lang.Object r9 = r0.get()
            X.9AZ r9 = (X.AnonymousClass9AZ) r9
            X.4D9 r8 = r13.$surface
            java.util.Set r3 = r13.$categories
            X.C108975cc.A12(r8, r3, r1)
            int r0 = X.C200510q.A00(r3)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r0)
            java.util.Iterator r12 = r3.iterator()
        L_0x0035:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r7 = r12.next()
            r11 = r7
            X.4DE r11 = (X.AnonymousClass4DE) r11
            X.C18070vi.A0d(r11, r1)
            X.AnonymousClass9AZ.A00(r9)
            java.util.Map r10 = r9.A02
            java.util.Map r0 = X.AnonymousClass8BS.A0u(r8, r10)
            r4 = 0
            if (r0 == 0) goto L_0x0065
            java.lang.Object r5 = r0.get(r11)
            X.9uU r5 = (X.C196119uU) r5
            if (r5 == 0) goto L_0x0066
        L_0x0059:
            long r3 = java.lang.System.currentTimeMillis()
            X.9py r4 = r5.A00(r3)
        L_0x0061:
            r6.put(r7, r4)
            goto L_0x0035
        L_0x0065:
            r5 = r4
        L_0x0066:
            boolean r0 = X.C22781De.A03()
            if (r0 != 0) goto L_0x0061
            com.facebook.stash.core.FileStash r3 = r9.A00
            if (r3 == 0) goto L_0x0061
            java.lang.String r0 = X.AnonymousClass9P8.A00(r11, r8)
            java.io.File r3 = r3.getFilePath(r0)
            if (r3 == 0) goto L_0x0061
            java.nio.charset.Charset r0 = X.C26571Sq.A05     // Catch:{ IOException -> 0x00a0, JSONException -> 0x00a7 }
            java.lang.String r0 = X.AnonymousClass3Gr.A00(r3, r0)     // Catch:{ IOException -> 0x00a0, JSONException -> 0x00a7 }
            org.json.JSONObject r0 = X.C17880vN.A16(r0)     // Catch:{ IOException -> 0x00a0, JSONException -> 0x00a7 }
            X.9uU r5 = X.AnonymousClass9P9.A00(r0)     // Catch:{ IOException -> 0x00a0, JSONException -> 0x00a7 }
            monitor-enter(r10)     // Catch:{ IOException -> 0x00a0, JSONException -> 0x00a7 }
            java.lang.Object r0 = r10.get(r8)     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x0096
            java.util.Map r0 = X.AnonymousClass8BW.A0u()     // Catch:{ all -> 0x009d }
            r10.put(r8, r0)     // Catch:{ all -> 0x009d }
        L_0x0096:
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x009d }
            r0.put(r11, r5)     // Catch:{ all -> 0x009d }
            monitor-exit(r10)     // Catch:{ IOException -> 0x00a0, JSONException -> 0x00a7 }
            goto L_0x00ad
        L_0x009d:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ IOException -> 0x00a0, JSONException -> 0x00a7 }
            throw r0     // Catch:{ IOException -> 0x00a0, JSONException -> 0x00a7 }
        L_0x00a0:
            r3 = move-exception
            java.lang.String r0 = "ArEffectsCacheDataSource/getEffects Failed to read from file"
            com.whatsapp.util.Log.e(r0, r3)
            goto L_0x00ad
        L_0x00a7:
            r3 = move-exception
            java.lang.String r0 = "ArEffectsCacheDataSource/getEffects Error parsing data from file"
            com.whatsapp.util.Log.e(r0, r3)
        L_0x00ad:
            if (r5 == 0) goto L_0x0061
            goto L_0x0059
        L_0x00b0:
            java.util.LinkedHashMap r5 = X.C17880vN.A13()
            java.util.Iterator r4 = X.AnonymousClass000.A15(r6)
        L_0x00b8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00d2
            java.util.Map$Entry r3 = X.AnonymousClass000.A16(r4)
            java.lang.Object r0 = r3.getValue()
            X.9py r0 = (X.C193369py) r0
            if (r0 == 0) goto L_0x00ce
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x00b8
        L_0x00ce:
            X.C108985cd.A1T(r3, r5)
            goto L_0x00b8
        L_0x00d2:
            java.util.Set r8 = r5.keySet()
            java.util.LinkedHashMap r5 = X.C17880vN.A13()
            java.util.Iterator r4 = X.AnonymousClass000.A15(r6)
        L_0x00de:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00f2
            java.util.Map$Entry r3 = X.AnonymousClass000.A16(r4)
            java.lang.Object r0 = r3.getValue()
            if (r0 == 0) goto L_0x00de
            X.C108985cd.A1R(r5, r3)
            goto L_0x00de
        L_0x00f2:
            java.util.LinkedHashMap r3 = X.C108995ce.A0b(r5)
            java.util.Iterator r5 = X.AnonymousClass000.A15(r5)
        L_0x00fa:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x011b
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r5)
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x0116
            X.9py r0 = (X.C193369py) r0
            java.util.List r0 = r0.A00
            r3.put(r4, r0)
            goto L_0x00fa
        L_0x0116:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x011b:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0122
            return r3
        L_0x0122:
            X.9Zt r0 = r13.this$0     // Catch:{ 4tK -> 0x01b8 }
            X.00H r0 = r0.A01     // Catch:{ 4tK -> 0x01b8 }
            java.lang.Object r5 = X.C18070vi.A0E(r0)     // Catch:{ 4tK -> 0x01b8 }
            X.5te r5 = (X.C115255te) r5     // Catch:{ 4tK -> 0x01b8 }
            X.4D9 r6 = r13.$surface     // Catch:{ 4tK -> 0x01b8 }
            X.0wh r0 = r13.$coroutineContext     // Catch:{ 4tK -> 0x01b8 }
            r13.L$0 = r3     // Catch:{ 4tK -> 0x01b8 }
            r13.label = r1     // Catch:{ 4tK -> 0x01b8 }
            r7 = 0
            com.whatsapp.areffects.data.ArEffectsRemoteDataSource$getEffects$2 r4 = new com.whatsapp.areffects.data.ArEffectsRemoteDataSource$getEffects$2     // Catch:{ 4tK -> 0x01b8 }
            r9 = r7
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ 4tK -> 0x01b8 }
            java.lang.Object r14 = X.C30451dy.A00(r13, r0, r4)     // Catch:{ 4tK -> 0x01b8 }
            if (r14 != r2) goto L_0x0145
            return r2
        L_0x0142:
            X.C30691eM.A01(r14)     // Catch:{ 4tK -> 0x01b8 }
        L_0x0145:
            java.util.Map r14 = (java.util.Map) r14     // Catch:{ 4tK -> 0x01b8 }
            X.9Zt r0 = r13.this$0     // Catch:{ 4tK -> 0x01b8 }
            X.00H r0 = r0.A00     // Catch:{ 4tK -> 0x01b8 }
            java.lang.Object r8 = r0.get()     // Catch:{ 4tK -> 0x01b8 }
            X.9AZ r8 = (X.AnonymousClass9AZ) r8     // Catch:{ 4tK -> 0x01b8 }
            X.4D9 r7 = r13.$surface     // Catch:{ 4tK -> 0x01b8 }
            X.C108975cc.A12(r7, r14, r1)     // Catch:{ 4tK -> 0x01b8 }
            X.AnonymousClass9AZ.A00(r8)     // Catch:{ 4tK -> 0x01b8 }
            java.util.Map r10 = r8.A02     // Catch:{ 4tK -> 0x01b8 }
            monitor-enter(r10)     // Catch:{ 4tK -> 0x01b8 }
            java.lang.Object r11 = r10.get(r7)     // Catch:{ all -> 0x01b5 }
            if (r11 != 0) goto L_0x0169
            java.util.Map r11 = X.AnonymousClass8BW.A0u()     // Catch:{ all -> 0x01b5 }
            r10.put(r7, r11)     // Catch:{ all -> 0x01b5 }
        L_0x0169:
            java.util.Map r11 = (java.util.Map) r11     // Catch:{ all -> 0x01b5 }
            java.util.LinkedHashMap r9 = X.C108995ce.A0b(r14)     // Catch:{ all -> 0x01b5 }
            java.util.Iterator r12 = X.AnonymousClass000.A15(r14)     // Catch:{ all -> 0x01b5 }
        L_0x0173:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x01b5 }
            if (r0 == 0) goto L_0x01a0
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r12)     // Catch:{ all -> 0x01b5 }
            java.lang.Object r6 = r0.getKey()     // Catch:{ all -> 0x01b5 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01b5 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01b5 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x01b5 }
            java.util.List r5 = X.C29431cG.A0t(r0)     // Catch:{ all -> 0x01b5 }
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ all -> 0x01b5 }
            java.lang.String r4 = X.C18070vi.A0H(r0)     // Catch:{ all -> 0x01b5 }
            X.9uU r0 = new X.9uU     // Catch:{ all -> 0x01b5 }
            r0.<init>(r4, r5, r1)     // Catch:{ all -> 0x01b5 }
            r9.put(r6, r0)     // Catch:{ all -> 0x01b5 }
            goto L_0x0173
        L_0x01a0:
            r11.putAll(r9)     // Catch:{ all -> 0x01b5 }
            monitor-exit(r10)     // Catch:{ 4tK -> 0x01b8 }
            X.10s r2 = r8.A01     // Catch:{ 4tK -> 0x01b8 }
            r1 = 12
            X.AkM r0 = new X.AkM     // Catch:{ 4tK -> 0x01b8 }
            r0.<init>(r8, r7, r14, r1)     // Catch:{ 4tK -> 0x01b8 }
            r2.execute(r0)     // Catch:{ 4tK -> 0x01b8 }
            java.util.LinkedHashMap r2 = X.AnonymousClass1D7.A09(r3, r14)     // Catch:{ 4tK -> 0x01b8 }
            return r2
        L_0x01b5:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ 4tK -> 0x01b8 }
            throw r0     // Catch:{ 4tK -> 0x01b8 }
        L_0x01b8:
            r1 = move-exception
            java.lang.String r0 = "ArEffectsRepository/getEffects Fetch failed, returning cached effects"
            com.whatsapp.util.Log.e(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.data.ArEffectsRepository$getEffects$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ArEffectsRepository$getEffects$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
