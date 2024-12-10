package com.whatsapp.areffects.viewmodel.viewstate;

import X.AnonymousClass000;
import X.AnonymousClass20G;
import X.C18090vk;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C86744Sw;
import X.C92674hi;
import X.C92684hj;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.viewstate.ArEffectsBannerViewState$persistentBannerContent$2$1", f = "ArEffectsBannerViewState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ArEffectsBannerViewState$persistentBannerContent$2$1 extends C30431dv implements AnonymousClass20G {
    public final /* synthetic */ C18090vk $retryLoadTray;
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectsBannerViewState$persistentBannerContent$2$1(C30391dr r2, C18090vk r3) {
        super(4, r2);
        this.$retryLoadTray = r3;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            boolean z = this.Z$0;
            List list = (List) this.L$0;
            boolean z2 = this.Z$1;
            if (z && z2) {
                return new C92684hj(this.$retryLoadTray);
            }
            C86744Sw r0 = (C86744Sw) C29431cG.A0c(list);
            if (r0 != null) {
                return new C92674hi(r0.A01);
            }
            return null;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean A1Y = AnonymousClass000.A1Y(obj);
        boolean A1Y2 = AnonymousClass000.A1Y(obj3);
        ArEffectsBannerViewState$persistentBannerContent$2$1 arEffectsBannerViewState$persistentBannerContent$2$1 = new ArEffectsBannerViewState$persistentBannerContent$2$1((C30391dr) obj4, this.$retryLoadTray);
        arEffectsBannerViewState$persistentBannerContent$2$1.Z$0 = A1Y;
        arEffectsBannerViewState$persistentBannerContent$2$1.L$0 = obj2;
        arEffectsBannerViewState$persistentBannerContent$2$1.Z$1 = A1Y2;
        return arEffectsBannerViewState$persistentBannerContent$2$1.invokeSuspend(C27621Wu.A00);
    }
}
