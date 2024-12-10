package X;

import com.whatsapp.calling.areffects.CallArEffectsViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.areffects.CallArEffectsViewModel", f = "CallArEffectsViewModel.kt", i = {0}, l = {235}, m = "handleOnCleared", n = {"this"}, s = {"L$0"})
/* renamed from: X.4uA  reason: invalid class name and case insensitive filesystem */
public final class C100224uA extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CallArEffectsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100224uA(CallArEffectsViewModel callArEffectsViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = callArEffectsViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0X(this);
    }
}
