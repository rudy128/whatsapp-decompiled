package X;

import com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingActivity;
import com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel;

/* renamed from: X.7yf  reason: invalid class name and case insensitive filesystem */
public final class C157797yf extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ MetaAiVoiceSettingActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157797yf(MetaAiVoiceSettingActivity metaAiVoiceSettingActivity) {
        super(1);
        this.this$0 = metaAiVoiceSettingActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Integer num = ((MetaAiVoiceSettingViewModel) this.this$0.A0C.getValue()).A01;
        if (!C18070vi.A18(num, obj)) {
            MetaAiVoiceSettingActivity.A03(this.this$0);
            MetaAiVoiceSettingActivity metaAiVoiceSettingActivity = this.this$0;
            metaAiVoiceSettingActivity.A05.A0J(new C21434Ak1(metaAiVoiceSettingActivity, obj, num, 5));
        }
        return C27621Wu.A00;
    }
}
