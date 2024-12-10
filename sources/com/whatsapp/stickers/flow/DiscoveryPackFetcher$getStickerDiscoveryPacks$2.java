package com.whatsapp.stickers.flow;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1OS;
import X.AnonymousClass725;
import X.C130626jk;
import X.C133966pn;
import X.C137456vU;
import X.C18030ve;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.DiscoveryPackFetcher$getStickerDiscoveryPacks$2", f = "DiscoveryPackFetcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DiscoveryPackFetcher$getStickerDiscoveryPacks$2 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C130626jk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiscoveryPackFetcher$getStickerDiscoveryPacks$2(C130626jk r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        DiscoveryPackFetcher$getStickerDiscoveryPacks$2 discoveryPackFetcher$getStickerDiscoveryPacks$2 = new DiscoveryPackFetcher$getStickerDiscoveryPacks$2(this.this$0, r4);
        discoveryPackFetcher$getStickerDiscoveryPacks$2.L$0 = obj;
        return discoveryPackFetcher$getStickerDiscoveryPacks$2;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass725 r4 = (AnonymousClass725) this.L$0;
            C130626jk r0 = this.this$0;
            AnonymousClass00H r3 = r0.A03;
            File A00 = ((C133966pn) r3.get()).A00(AnonymousClass725.A00(r4), C137456vU.A00((C18030ve) C18070vi.A0E(r0.A00)));
            if (A00 == null || !A00.exists()) {
                ((C133966pn) r3.get()).A01(r4);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DiscoveryPackFetcher$getStickerDiscoveryPacks$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
