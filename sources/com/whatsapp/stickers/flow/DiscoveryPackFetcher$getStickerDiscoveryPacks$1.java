package com.whatsapp.stickers.flow;

import X.AnonymousClass1OS;
import X.C130626jk;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.DiscoveryPackFetcher$getStickerDiscoveryPacks$1", f = "DiscoveryPackFetcher.kt", i = {0, 1}, l = {38, 39}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
public final class DiscoveryPackFetcher$getStickerDiscoveryPacks$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ C130626jk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiscoveryPackFetcher$getStickerDiscoveryPacks$1(C130626jk r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        DiscoveryPackFetcher$getStickerDiscoveryPacks$1 discoveryPackFetcher$getStickerDiscoveryPacks$1 = new DiscoveryPackFetcher$getStickerDiscoveryPacks$1(this.this$0, r4);
        discoveryPackFetcher$getStickerDiscoveryPacks$1.L$0 = obj;
        return discoveryPackFetcher$getStickerDiscoveryPacks$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L_0x002e
            if (r0 == r5) goto L_0x004a
            if (r0 != r6) goto L_0x005f
            java.lang.Object r1 = r8.L$1
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r8.L$0
            X.1G2 r4 = (X.AnonymousClass1G2) r4
            X.C30691eM.A01(r9)
        L_0x0017:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r1.next()
            r8.L$0 = r4
            r8.L$1 = r1
            r8.label = r6
            java.lang.Object r0 = r4.BJt(r0, r8)
            if (r0 != r7) goto L_0x0017
            return r7
        L_0x002e:
            X.C30691eM.A01(r9)
            java.lang.Object r4 = r8.L$0
            X.1G2 r4 = (X.AnonymousClass1G2) r4
            X.6jk r3 = r8.this$0
            X.0wl r2 = r3.A07
            r1 = 0
            com.whatsapp.stickers.flow.DiscoveryPackFetcher$getStickerDiscoveryPacks$1$discoveryPacks$1 r0 = new com.whatsapp.stickers.flow.DiscoveryPackFetcher$getStickerDiscoveryPacks$1$discoveryPacks$1
            r0.<init>(r3, r1)
            r8.L$0 = r4
            r8.label = r5
            java.lang.Object r9 = X.C30451dy.A00(r8, r2, r0)
            if (r9 != r7) goto L_0x0051
            return r7
        L_0x004a:
            java.lang.Object r4 = r8.L$0
            X.1G2 r4 = (X.AnonymousClass1G2) r4
            X.C30691eM.A01(r9)
        L_0x0051:
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L_0x0057
            X.0wS r9 = X.C18460wS.A00
        L_0x0057:
            java.util.Iterator r1 = r9.iterator()
            goto L_0x0017
        L_0x005c:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x005f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.flow.DiscoveryPackFetcher$getStickerDiscoveryPacks$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DiscoveryPackFetcher$getStickerDiscoveryPacks$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
