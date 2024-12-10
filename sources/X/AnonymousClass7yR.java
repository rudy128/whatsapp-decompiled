package X;

import com.whatsapp.bot.metaai.voice.MetaAiVoiceMultimodalComposerActivity;
import com.whatsapp.bot.metaai.voice.MetaAiVoiceMultimodalComposerViewModel;

/* renamed from: X.7yR  reason: invalid class name */
public final class AnonymousClass7yR extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ MetaAiVoiceMultimodalComposerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7yR(MetaAiVoiceMultimodalComposerActivity metaAiVoiceMultimodalComposerActivity) {
        super(1);
        this.this$0 = metaAiVoiceMultimodalComposerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean A1a = AnonymousClass3MX.A1a(bool);
        C93644jJ r0 = (C93644jJ) ((MetaAiVoiceMultimodalComposerViewModel) this.this$0.A0N.getValue()).A0A.get();
        r0.A0A = A1a;
        A99 a99 = r0.A00;
        if (a99 != null) {
            a99.A0z(bool);
        }
        return C27621Wu.A00;
    }
}
