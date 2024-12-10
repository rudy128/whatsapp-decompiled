package X;

import com.whatsapp.bot.creation.viewmodel.AiCreationViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.creation.viewmodel.AiCreationViewModel", f = "AiCreationViewModel.kt", i = {0, 0, 1, 1}, l = {135, 138}, m = "completeQuickPersonaCreation", n = {"this", "completeCreateParam", "bot", "botProfile"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* renamed from: X.4ui  reason: invalid class name and case insensitive filesystem */
public final class C100564ui extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AiCreationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100564ui(AiCreationViewModel aiCreationViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = aiCreationViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0T((AnonymousClass4V7) null, this);
    }
}
