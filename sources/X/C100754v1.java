package X;

import com.whatsapp.calling.areffects.CallArEffectsViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.areffects.CallArEffectsViewModel", f = "CallArEffectsViewModel.kt", i = {0, 0, 0}, l = {341}, m = "toggleCameraProcessorOn", n = {"this", "errors", "i"}, s = {"L$0", "L$1", "I$0"})
/* renamed from: X.4v1  reason: invalid class name and case insensitive filesystem */
public final class C100754v1 extends C30421du {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CallArEffectsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100754v1(CallArEffectsViewModel callArEffectsViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = callArEffectsViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CallArEffectsViewModel.A09(this.this$0, this);
    }
}
