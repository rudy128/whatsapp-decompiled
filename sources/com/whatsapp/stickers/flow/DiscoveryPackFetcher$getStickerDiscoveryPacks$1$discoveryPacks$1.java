package com.whatsapp.stickers.flow;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1OS;
import X.C108945cZ;
import X.C130626jk;
import X.C139636zC;
import X.C17890vO;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.DiscoveryPackFetcher$getStickerDiscoveryPacks$1$discoveryPacks$1", f = "DiscoveryPackFetcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DiscoveryPackFetcher$getStickerDiscoveryPacks$1$discoveryPacks$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C130626jk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiscoveryPackFetcher$getStickerDiscoveryPacks$1$discoveryPacks$1(C130626jk r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new DiscoveryPackFetcher$getStickerDiscoveryPacks$1$discoveryPacks$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new DiscoveryPackFetcher$getStickerDiscoveryPacks$1$discoveryPacks$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C130626jk r4 = this.this$0;
            List A05 = C108945cZ.A0z(r4.A01).A05();
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("DiscoveryPackFetcher/getDiscoveryPackHolders fetched ");
            int i = 0;
            A10.append(AnonymousClass001.A0m(A05));
            C17890vO.A1A(A10, " packs from db");
            if (A05 == null || A05.isEmpty()) {
                A05 = ((C139636zC) r4.A04.get()).A01();
            }
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("DiscoveryPackFetcher/getDiscoveryPackHolders final ");
            if (A05 != null) {
                i = A05.size();
            }
            A102.append(i);
            C17890vO.A1A(A102, " packs fetched");
            if (A05 == null) {
                return null;
            }
            Iterator it = A05.iterator();
            while (it.hasNext()) {
                C108945cZ.A0y(it).A08 = true;
            }
            return A05;
        }
        throw AnonymousClass000.A0l();
    }
}
