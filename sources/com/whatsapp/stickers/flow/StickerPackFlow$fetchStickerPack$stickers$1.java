package com.whatsapp.stickers.flow;

import X.AnonymousClass1OS;
import X.AnonymousClass725;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.StickerPackFlow$fetchStickerPack$stickers$1", f = "StickerPackFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackFlow$fetchStickerPack$stickers$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass725 $stickerPack;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackFlow$fetchStickerPack$stickers$1(AnonymousClass725 r2, StickerPackFlow stickerPackFlow, C30391dr r4) {
        super(2, r4);
        this.$stickerPack = r2;
        this.this$0 = stickerPackFlow;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        StickerPackFlow$fetchStickerPack$stickers$1 stickerPackFlow$fetchStickerPack$stickers$1 = new StickerPackFlow$fetchStickerPack$stickers$1(this.$stickerPack, this.this$0, r5);
        stickerPackFlow$fetchStickerPack$stickers$1.L$0 = obj;
        return stickerPackFlow$fetchStickerPack$stickers$1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0041 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            if (r0 != 0) goto L_0x0089
            X.C30691eM.A01(r5)
            X.725 r1 = r4.$stickerPack
            boolean r0 = r1.A0W
            if (r0 == 0) goto L_0x0067
            boolean r0 = r1.A0U
            if (r0 != 0) goto L_0x0067
            com.whatsapp.stickers.flow.StickerPackFlow r0 = r4.this$0
            X.00H r0 = r0.A08     // Catch:{ all -> 0x0047 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x0047 }
            X.6pr r3 = (X.C134006pr) r3     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = X.AnonymousClass725.A00(r1)     // Catch:{ all -> 0x0047 }
            android.util.Pair r0 = X.C137416vQ.A00(r0)     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0044
            java.lang.Object r2 = r0.first     // Catch:{ Exception -> 0x0041 }
            X.C18070vi.A0W(r2)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r1 = r0.second     // Catch:{ Exception -> 0x0041 }
            X.C18070vi.A0W(r1)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0041 }
            boolean r0 = X.C18070vi.A15(r2, r1)     // Catch:{ Exception -> 0x0041 }
            X.725 r0 = r3.A00(r2, r1, r0)     // Catch:{ Exception -> 0x0041 }
            java.util.List r1 = r0.A07     // Catch:{ Exception -> 0x0041 }
            X.C18070vi.A0b(r1)     // Catch:{ Exception -> 0x0041 }
            goto L_0x004c
        L_0x0041:
            X.0wS r1 = X.C18460wS.A00     // Catch:{ all -> 0x0047 }
            goto L_0x004c
        L_0x0044:
            X.0wS r1 = X.C18460wS.A00     // Catch:{ all -> 0x0047 }
            goto L_0x004c
        L_0x0047:
            r0 = move-exception
            X.1IU r1 = X.C108945cZ.A1J(r0)
        L_0x004c:
            X.725 r3 = r4.$stickerPack
            java.lang.Throwable r2 = X.C30671eK.A00(r1)
            if (r2 == 0) goto L_0x0064
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "StickerPackFlow/packFlow failed to get stickers from pack "
            r1.append(r0)
            java.lang.String r0 = r3.A0H
            X.C108985cd.A1M(r0, r1, r2)
            X.0wS r1 = X.C18460wS.A00
        L_0x0064:
            java.util.List r1 = (java.util.List) r1
            goto L_0x007b
        L_0x0067:
            com.whatsapp.stickers.flow.StickerPackFlow r0 = r4.this$0
            X.00H r0 = r0.A07
            java.lang.Object r1 = r0.get()
            X.6uZ r1 = (X.C136886uZ) r1
            X.725 r0 = r4.$stickerPack
            java.lang.String r0 = X.AnonymousClass725.A00(r0)
            java.util.ArrayList r1 = r1.A03(r0)
        L_0x007b:
            com.whatsapp.stickers.flow.StickerPackFlow r0 = r4.this$0
            X.00H r0 = r0.A04
            java.lang.Object r0 = r0.get()
            X.70H r0 = (X.AnonymousClass70H) r0
            r0.A06(r1)
            return r1
        L_0x0089:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.flow.StickerPackFlow$fetchStickerPack$stickers$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerPackFlow$fetchStickerPack$stickers$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
