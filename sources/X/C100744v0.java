package X;

import com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel", f = "BaseArEffectsViewModel.kt", i = {0, 0}, l = {691}, m = "findTrayEffectById", n = {"this", "effectId"}, s = {"L$0", "L$1"})
/* renamed from: X.4v0  reason: invalid class name and case insensitive filesystem */
public final class C100744v0 extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BaseArEffectsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100744v0(BaseArEffectsViewModel baseArEffectsViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = baseArEffectsViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0W((String) null, this);
    }
}
