package X;

import com.whatsapp.calling.banner.viewmodel.AnimateBannerUseCase;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.banner.viewmodel.AnimateBannerUseCase", f = "AnimateBannerUseCase.kt", i = {0}, l = {34}, m = "shouldEntryAnimateAfterDelay", n = {"entryAnimate"}, s = {"Z$0"})
/* renamed from: X.4uE  reason: invalid class name and case insensitive filesystem */
public final class C100264uE extends C30421du {
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AnimateBannerUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100264uE(AnimateBannerUseCase animateBannerUseCase, C30391dr r2) {
        super(r2);
        this.this$0 = animateBannerUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((C86534Sa) null, this);
    }
}
