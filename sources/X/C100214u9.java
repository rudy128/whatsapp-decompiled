package X;

import com.whatsapp.bot.creation.service.AiCreationService;
import com.whatsapp.bot.creation.viewmodel.AiCreationViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.creation.viewmodel.AiCreationViewModel", f = "AiCreationViewModel.kt", i = {0}, l = {129}, m = "generatePersonaImage", n = {"this"}, s = {"L$0"})
/* renamed from: X.4u9  reason: invalid class name and case insensitive filesystem */
public final class C100214u9 extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AiCreationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100214u9(AiCreationViewModel aiCreationViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = aiCreationViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        AiCreationViewModel aiCreationViewModel = this.this$0;
        C100214u9 r5 = this;
        if ((Integer.MIN_VALUE & i) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            r5 = new C100214u9(aiCreationViewModel, this);
        }
        Object obj2 = r5.result;
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i2 = r5.label;
        if (i2 == 0) {
            C30691eM.A01(obj2);
            AiCreationService aiCreationService = aiCreationViewModel.A01;
            r5.L$0 = aiCreationViewModel;
            r5.label = 1;
            obj2 = aiCreationService.A00(r5);
            if (obj2 == r3) {
                return r3;
            }
        } else if (i2 == 1) {
            aiCreationViewModel = (AiCreationViewModel) r5.L$0;
            C30691eM.A01(obj2);
        } else {
            throw AnonymousClass000.A0l();
        }
        aiCreationViewModel.A00.A04("generated_image", obj2);
        return obj2;
    }
}
