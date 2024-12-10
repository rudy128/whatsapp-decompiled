package X;

import com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerUseCase;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerUseCase", f = "MinimizedCallBannerUseCase.kt", i = {0, 0, 0, 1, 1, 1}, l = {104, 112}, m = "onCallStateModelUpdated", n = {"this", "callStateModel", "showReturnToCallText", "this", "callStateModel", "viewState"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "L$2"})
/* renamed from: X.4vG  reason: invalid class name and case insensitive filesystem */
public final class C100904vG extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MinimizedCallBannerUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100904vG(MinimizedCallBannerUseCase minimizedCallBannerUseCase, C30391dr r2) {
        super(r2);
        this.this$0 = minimizedCallBannerUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01((C86534Sa) null, this, false, false, false);
    }
}
