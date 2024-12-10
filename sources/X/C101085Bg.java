package X;

import com.whatsapp.bot.creation.viewmodel.AiCreationViewModel;
import com.whatsapp.bot.creation.viewmodel.AiCreationViewModel$createGenAiPersona$1;

/* renamed from: X.5Bg  reason: invalid class name and case insensitive filesystem */
public final class C101085Bg extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AiCreationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101085Bg(AiCreationViewModel aiCreationViewModel) {
        super(0);
        this.this$0 = aiCreationViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C25701Ph r5 = new C25701Ph(C25691Pg.SUSPEND, 1, 1);
        AiCreationViewModel aiCreationViewModel = this.this$0;
        String str = (String) aiCreationViewModel.A00.A02("description");
        if (str != null) {
            AnonymousClass3MX.A1Q(new AiCreationViewModel$createGenAiPersona$1(aiCreationViewModel, str, (C30391dr) null), C41561wd.A00(aiCreationViewModel));
        }
        return r5;
    }
}
