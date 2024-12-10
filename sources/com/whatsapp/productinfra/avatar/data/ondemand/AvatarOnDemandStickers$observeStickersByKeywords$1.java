package com.whatsapp.productinfra.avatar.data.ondemand;

import X.AnonymousClass1OS;
import X.C108935cY;
import X.C123096Tc;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$observeStickersByKeywords$1", f = "AvatarOnDemandStickers.kt", i = {0, 0, 1, 2, 2, 3, 4, 4, 4, 5, 5}, l = {107, 109, 128, 130, 145, 157, 166}, m = "invokeSuspend", n = {"$this$flow", "qplInstanceKey", "qplInstanceKey", "$this$flow", "qplInstanceKey", "it", "$this$flow", "stableIds", "qplInstanceKey", "$this$flow", "stableIds"}, s = {"L$0", "I$0", "I$0", "L$0", "I$0", "L$1", "L$0", "L$1", "I$0", "L$0", "L$1"})
public final class AvatarOnDemandStickers$observeStickersByKeywords$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C108935cY $fetchStickersSignal;
    public final /* synthetic */ String[] $keywords;
    public final /* synthetic */ C123096Tc $searchType;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AvatarOnDemandStickers this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarOnDemandStickers$observeStickersByKeywords$1(C123096Tc r2, AvatarOnDemandStickers avatarOnDemandStickers, C30391dr r4, C108935cY r5, String[] strArr) {
        super(2, r4);
        this.this$0 = avatarOnDemandStickers;
        this.$searchType = r2;
        this.$fetchStickersSignal = r5;
        this.$keywords = strArr;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        AvatarOnDemandStickers$observeStickersByKeywords$1 avatarOnDemandStickers$observeStickersByKeywords$1 = new AvatarOnDemandStickers$observeStickersByKeywords$1(this.$searchType, this.this$0, r8, this.$fetchStickersSignal, this.$keywords);
        avatarOnDemandStickers$observeStickersByKeywords$1.L$0 = obj;
        return avatarOnDemandStickers$observeStickersByKeywords$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010f, code lost:
        if (r9 != r4) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0128, code lost:
        if (r9 == null) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012a, code lost:
        r2 = r11.this$0;
        r11.L$0 = r2;
        r11.I$0 = r8;
        r11.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0137, code lost:
        if (r3.BJt(r9, r11) != r4) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0139, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013a, code lost:
        com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers.A00(r11.this$0).A03(r8, "sticker_search_initialized");
        r0 = r11.this$0;
        r1 = r11.$keywords;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r7 = (X.C1193067o) r0.A04.get();
        r11.L$0 = r3;
        r11.I$0 = r8;
        r11.label = 3;
        r9 = X.C30451dy.A00(r11, r7.A00, new com.whatsapp.productinfra.avatar.stickers.search.AvatarStickerSearchProvider$searchAwait$2(r7, (X.C30391dr) null, (java.lang.String[]) java.util.Arrays.copyOf(r1, r1.length)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0169, code lost:
        if (r9 != r4) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0175, code lost:
        X.C108945cZ.A0p(r2.A02).A02(3, "observe_stickers_failed", "search not initialized");
        com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers.A00(r2).A02(r8, X.AnonymousClass00R.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018a, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r9 = (java.util.List) r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d8 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            r9 = r12
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r11.label
            java.lang.String r6 = "observe_stickers_failed"
            r10 = 0
            r5 = 3
            switch(r0) {
                case 0: goto L_0x00de;
                case 1: goto L_0x011f;
                case 2: goto L_0x016c;
                case 3: goto L_0x001e;
                case 4: goto L_0x019e;
                case 5: goto L_0x007a;
                case 6: goto L_0x0011;
                case 7: goto L_0x01c1;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0011:
            java.lang.Object r0 = r11.L$1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r3 = r11.L$0
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            X.C30691eM.A01(r12)
            goto L_0x00b8
        L_0x001e:
            int r8 = r11.I$0
            java.lang.Object r3 = r11.L$0
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            X.C30691eM.A01(r12)     // Catch:{ all -> 0x002a }
        L_0x0027:
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x002a }
            goto L_0x002f
        L_0x002a:
            r0 = move-exception
            X.1IU r9 = X.C108945cZ.A1J(r0)
        L_0x002f:
            X.6Tc r1 = r11.$searchType
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r11.this$0
            java.lang.Throwable r7 = X.C30671eK.A00(r9)
            if (r7 != 0) goto L_0x018b
            java.util.List r9 = (java.util.List) r9
            X.70I r1 = com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers.A00(r0)
            java.lang.String r0 = "sticker_search_done"
            r1.A03(r8, r0)
            X.6Tc r6 = r11.$searchType
            java.util.ArrayList r5 = X.C29351c6.A0D(r9)
            java.util.Iterator r2 = r9.iterator()
        L_0x004e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r2.next()
            X.6zL r0 = (X.C139726zL) r0
            java.lang.String r1 = r0.A00
            X.6Dx r0 = new X.6Dx
            r0.<init>(r1)
            r5.add(r0)
            goto L_0x004e
        L_0x0065:
            X.6Dw r1 = new X.6Dw
            r1.<init>(r6, r5)
            r11.L$0 = r3
            r11.L$1 = r9
            r11.I$0 = r8
            r0 = 5
            r11.label = r0
            java.lang.Object r0 = r3.BJt(r1, r11)
            if (r0 != r4) goto L_0x0088
            return r4
        L_0x007a:
            int r8 = r11.I$0
            java.lang.Object r0 = r11.L$1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r3 = r11.L$0
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            X.C30691eM.A01(r12)
            r9 = r0
        L_0x0088:
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r11.this$0
            X.70I r1 = com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers.A00(r0)
            java.lang.String r0 = "loading_stickers_emitted_to_ui"
            r1.A03(r8, r0)
            X.5cY r0 = r11.$fetchStickersSignal
            if (r0 == 0) goto L_0x00d9
            boolean r0 = r0.BeK()
            if (r0 != 0) goto L_0x00d9
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r11.this$0
            X.70I r1 = com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers.A00(r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r1.A02(r8, r0)
            X.5cY r1 = r11.$fetchStickersSignal
            r11.L$0 = r3
            r11.L$1 = r9
            r0 = 6
            r11.label = r0
            java.lang.Object r0 = r1.BCp(r11)
            if (r0 == r4) goto L_0x0111
            r0 = r9
        L_0x00b8:
            r9 = r0
            r8 = r10
        L_0x00ba:
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r7 = r11.this$0
            X.6Tc r6 = r11.$searchType
            X.6jw r0 = r7.A01
            X.1G0 r0 = r0.A07
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1 r5 = new com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1
            r5.<init>(r6, r7, r8, r9, r10)
            X.5WQ r1 = X.AnonymousClass4Z6.A00(r5, r0)
            r11.L$0 = r10
            r11.L$1 = r10
            r0 = 7
            r11.label = r0
            java.lang.Object r0 = X.C88604aC.A02(r11, r1, r3)
            if (r0 != r4) goto L_0x01c4
            return r4
        L_0x00d9:
            java.lang.Integer r8 = X.AnonymousClass3MW.A0v(r8)
            goto L_0x00ba
        L_0x00de:
            X.C30691eM.A01(r12)
            java.lang.Object r3 = r11.L$0
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r11.this$0
            X.70I r0 = com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers.A00(r0)
            int r8 = r0.A01()
            X.6Tc r1 = r11.$searchType
            boolean r0 = r1 instanceof X.C120456Dt
            if (r0 == 0) goto L_0x0112
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r11.this$0
            X.70I r1 = com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers.A00(r0)
            java.lang.String r0 = "sticker_search_started"
        L_0x00fd:
            r1.A03(r8, r0)
        L_0x0100:
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r2 = r11.this$0
            X.6Tc r1 = r11.$searchType
            r11.L$0 = r3
            r11.I$0 = r8
            r0 = 1
            r11.label = r0
            java.lang.Object r9 = com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers.A02(r1, r2, r11, r8)
            if (r9 != r4) goto L_0x0128
        L_0x0111:
            return r4
        L_0x0112:
            boolean r0 = r1 instanceof X.C120446Ds
            if (r0 == 0) goto L_0x0100
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r11.this$0
            X.70I r1 = com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers.A00(r0)
            java.lang.String r0 = "sticker_category_requested"
            goto L_0x00fd
        L_0x011f:
            int r8 = r11.I$0
            java.lang.Object r3 = r11.L$0
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            X.C30691eM.A01(r12)
        L_0x0128:
            if (r9 == 0) goto L_0x013a
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r2 = r11.this$0
            r11.L$0 = r2
            r11.I$0 = r8
            r0 = 2
            r11.label = r0
            java.lang.Object r0 = r3.BJt(r9, r11)
            if (r0 != r4) goto L_0x0175
            return r4
        L_0x013a:
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r11.this$0
            X.70I r1 = com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers.A00(r0)
            java.lang.String r0 = "sticker_search_initialized"
            r1.A03(r8, r0)
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = r11.this$0
            java.lang.String[] r1 = r11.$keywords
            X.00H r0 = r0.A04     // Catch:{ all -> 0x002a }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x002a }
            X.67o r7 = (X.C1193067o) r7     // Catch:{ all -> 0x002a }
            int r0 = r1.length     // Catch:{ all -> 0x002a }
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ all -> 0x002a }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ all -> 0x002a }
            r11.L$0 = r3     // Catch:{ all -> 0x002a }
            r11.I$0 = r8     // Catch:{ all -> 0x002a }
            r11.label = r5     // Catch:{ all -> 0x002a }
            X.0wl r1 = r7.A00     // Catch:{ all -> 0x002a }
            com.whatsapp.productinfra.avatar.stickers.search.AvatarStickerSearchProvider$searchAwait$2 r0 = new com.whatsapp.productinfra.avatar.stickers.search.AvatarStickerSearchProvider$searchAwait$2     // Catch:{ all -> 0x002a }
            r0.<init>(r7, r10, r2)     // Catch:{ all -> 0x002a }
            java.lang.Object r9 = X.C30451dy.A00(r11, r1, r0)     // Catch:{ all -> 0x002a }
            if (r9 != r4) goto L_0x0027
            goto L_0x018a
        L_0x016c:
            int r8 = r11.I$0
            java.lang.Object r2 = r11.L$0
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r2 = (com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers) r2
            X.C30691eM.A01(r12)
        L_0x0175:
            X.00H r0 = r2.A02
            X.6ue r1 = X.C108945cZ.A0p(r0)
            java.lang.String r0 = "search not initialized"
            r1.A02(r5, r6, r0)
            X.70I r1 = com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers.A00(r2)
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r1.A02(r8, r0)
            goto L_0x01c4
        L_0x018a:
            return r4
        L_0x018b:
            X.6Dv r2 = new X.6Dv
            r2.<init>(r1, r7)
            r11.L$0 = r0
            r11.L$1 = r7
            r1 = 4
            r11.label = r1
            java.lang.Object r1 = r3.BJt(r2, r11)
            if (r1 != r4) goto L_0x01a9
            return r4
        L_0x019e:
            java.lang.Object r7 = r11.L$1
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            java.lang.Object r0 = r11.L$0
            com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers r0 = (com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers) r0
            X.C30691eM.A01(r12)
        L_0x01a9:
            X.00H r0 = r0.A02
            X.6ue r2 = X.C108945cZ.A0p(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "search failed ("
            java.lang.String r0 = X.C108955ca.A10(r0, r1, r7)
            java.lang.String r0 = X.C17900vP.A0B(r0, r1)
            r2.A02(r5, r6, r0)
            goto L_0x01c4
        L_0x01c1:
            X.C30691eM.A01(r12)
        L_0x01c4:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$observeStickersByKeywords$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarOnDemandStickers$observeStickersByKeywords$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
