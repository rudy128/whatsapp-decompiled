package com.whatsapp.areffects.data;

import X.AnonymousClass1OS;
import X.C160988Aw;
import X.C183829Zt;
import X.C18560wh;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.data.ArEffectsRepository$getSingleEffect$2", f = "ArEffectsRepository.kt", i = {0}, l = {114}, m = "invokeSuspend", n = {"cachedEffect"}, s = {"L$0"})
public final class ArEffectsRepository$getSingleEffect$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C18560wh $coroutineContext;
    public final /* synthetic */ String $effectId;
    public final /* synthetic */ C160988Aw $requestWrapper;
    public Object L$0;
    public int label;
    public final /* synthetic */ C183829Zt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectsRepository$getSingleEffect$2(C183829Zt r2, C160988Aw r3, String str, C30391dr r5, C18560wh r6) {
        super(2, r5);
        this.this$0 = r2;
        this.$effectId = str;
        this.$requestWrapper = r3;
        this.$coroutineContext = r6;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new ArEffectsRepository$getSingleEffect$2(this.this$0, this.$requestWrapper, this.$effectId, r8, this.$coroutineContext);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        if (r4 == null) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a5 A[Catch:{ 4tK -> 0x00e2 }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1g4 r8 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r10.label
            r6 = 1
            if (r0 == 0) goto L_0x000d
            if (r0 != r6) goto L_0x00f8
            java.lang.Object r5 = r10.L$0
            goto L_0x00a6
        L_0x000d:
            X.C30691eM.A01(r11)
            X.9Zt r0 = r10.this$0
            X.00H r0 = r0.A00
            java.lang.Object r1 = r0.get()
            X.9AZ r1 = (X.AnonymousClass9AZ) r1
            java.lang.String r7 = r10.$effectId
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.AnonymousClass9AZ.A00(r1)
            java.util.Map r5 = r1.A03
            java.lang.Object r4 = r5.get(r7)
            X.9uU r4 = (X.C196119uU) r4
            if (r4 != 0) goto L_0x006d
            boolean r0 = X.C22781De.A03()
            r3 = 0
            if (r0 != 0) goto L_0x0075
            com.facebook.stash.core.FileStash r2 = r1.A00
            if (r2 == 0) goto L_0x0075
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.C17970vW.A04(r7)
            r1.append(r0)
            java.lang.String r0 = ".json"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.io.File r1 = r2.getFilePath(r0)
            if (r1 == 0) goto L_0x0075
            java.nio.charset.Charset r0 = X.C26571Sq.A05     // Catch:{ IOException -> 0x0065, JSONException -> 0x0061 }
            java.lang.String r0 = X.AnonymousClass3Gr.A00(r1, r0)     // Catch:{ IOException -> 0x0065, JSONException -> 0x0061 }
            org.json.JSONObject r0 = X.C17880vN.A16(r0)     // Catch:{ IOException -> 0x0065, JSONException -> 0x0061 }
            X.9uU r4 = X.AnonymousClass9P9.A00(r0)     // Catch:{ IOException -> 0x0065, JSONException -> 0x0061 }
            r5.put(r7, r4)     // Catch:{ IOException -> 0x0065, JSONException -> 0x0061 }
            goto L_0x006b
        L_0x0061:
            r1 = move-exception
            java.lang.String r0 = "ArEffectsCacheDataSource/getEffects Error parsing data from file"
            goto L_0x0068
        L_0x0065:
            r1 = move-exception
            java.lang.String r0 = "ArEffectsCacheDataSource/getEffects Failed to read from file"
        L_0x0068:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x006b:
            if (r4 == 0) goto L_0x0075
        L_0x006d:
            long r0 = java.lang.System.currentTimeMillis()
            X.9py r3 = r4.A00(r0)
        L_0x0075:
            if (r3 == 0) goto L_0x0084
            java.util.List r0 = r3.A00
            java.lang.Object r5 = X.C29431cG.A0c(r0)
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0085
            if (r5 == 0) goto L_0x0085
            return r5
        L_0x0084:
            r5 = 0
        L_0x0085:
            X.9Zt r0 = r10.this$0     // Catch:{ 4tK -> 0x00e2 }
            X.00H r0 = r0.A01     // Catch:{ 4tK -> 0x00e2 }
            java.lang.Object r7 = r0.get()     // Catch:{ 4tK -> 0x00e2 }
            X.5te r7 = (X.C115255te) r7     // Catch:{ 4tK -> 0x00e2 }
            java.lang.String r4 = r10.$effectId     // Catch:{ 4tK -> 0x00e2 }
            X.8Aw r3 = r10.$requestWrapper     // Catch:{ 4tK -> 0x00e2 }
            X.0wh r2 = r10.$coroutineContext     // Catch:{ 4tK -> 0x00e2 }
            r10.L$0 = r5     // Catch:{ 4tK -> 0x00e2 }
            r10.label = r6     // Catch:{ 4tK -> 0x00e2 }
            r1 = 0
            com.whatsapp.areffects.data.ArEffectsRemoteDataSource$getSingleEffect$2 r0 = new com.whatsapp.areffects.data.ArEffectsRemoteDataSource$getSingleEffect$2     // Catch:{ 4tK -> 0x00e2 }
            r0.<init>(r7, r3, r4, r1)     // Catch:{ 4tK -> 0x00e2 }
            java.lang.Object r11 = X.C30451dy.A00(r10, r2, r0)     // Catch:{ 4tK -> 0x00e2 }
            if (r11 != r8) goto L_0x00a9
            return r8
        L_0x00a6:
            X.C30691eM.A01(r11)     // Catch:{ 4tK -> 0x00e2 }
        L_0x00a9:
            X.9Zt r0 = r10.this$0     // Catch:{ 4tK -> 0x00e2 }
            X.00H r0 = r0.A00     // Catch:{ 4tK -> 0x00e2 }
            java.lang.Object r9 = r0.get()     // Catch:{ 4tK -> 0x00e2 }
            X.9AZ r9 = (X.AnonymousClass9AZ) r9     // Catch:{ 4tK -> 0x00e2 }
            java.lang.String r8 = r10.$effectId     // Catch:{ 4tK -> 0x00e2 }
            X.C108975cc.A12(r8, r11, r6)     // Catch:{ 4tK -> 0x00e2 }
            X.AnonymousClass9AZ.A00(r9)     // Catch:{ 4tK -> 0x00e2 }
            java.util.Map r7 = r9.A03     // Catch:{ 4tK -> 0x00e2 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ 4tK -> 0x00e2 }
            java.util.List r4 = X.C18070vi.A0M(r11)     // Catch:{ 4tK -> 0x00e2 }
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ 4tK -> 0x00e2 }
            java.lang.String r1 = X.C18070vi.A0H(r0)     // Catch:{ 4tK -> 0x00e2 }
            X.9uU r0 = new X.9uU     // Catch:{ 4tK -> 0x00e2 }
            r0.<init>(r1, r4, r2)     // Catch:{ 4tK -> 0x00e2 }
            r7.put(r8, r0)     // Catch:{ 4tK -> 0x00e2 }
            X.10s r2 = r9.A01     // Catch:{ 4tK -> 0x00e2 }
            r1 = 14
            X.AkJ r0 = new X.AkJ     // Catch:{ 4tK -> 0x00e2 }
            r0.<init>(r1, r8, r9)     // Catch:{ 4tK -> 0x00e2 }
            r2.execute(r0)     // Catch:{ 4tK -> 0x00e2 }
            return r11
        L_0x00e2:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ArEffectsRepository/getSingleEffect Fetch failed, cache is null: "
            r1.append(r0)
            if (r5 == 0) goto L_0x00ef
            r6 = 0
        L_0x00ef:
            r1.append(r6)
            X.C17880vN.A1M(r1, r2)
            if (r5 == 0) goto L_0x00fc
            return r5
        L_0x00f8:
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0l()
        L_0x00fc:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.data.ArEffectsRepository$getSingleEffect$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ArEffectsRepository$getSingleEffect$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
