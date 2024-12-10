package X;

import com.whatsapp.bot.metaai.voice.MetaAiVoiceMultimodalComposerActivity;
import com.whatsapp.metaai.voice.ui.MetaAiSpeechIndicatorView;

/* renamed from: X.7yL  reason: invalid class name */
public final class AnonymousClass7yL extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ MetaAiVoiceMultimodalComposerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7yL(MetaAiVoiceMultimodalComposerActivity metaAiVoiceMultimodalComposerActivity) {
        super(1);
        this.this$0 = metaAiVoiceMultimodalComposerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number = (Number) obj;
        MetaAiSpeechIndicatorView metaAiSpeechIndicatorView = this.this$0.A0B;
        if (metaAiSpeechIndicatorView == null) {
            C18070vi.A11("fullScreenDynamicAnimation");
            throw null;
        }
        C18070vi.A0b(number);
        metaAiSpeechIndicatorView.A04(number.floatValue());
        return C27621Wu.A00;
    }
}
