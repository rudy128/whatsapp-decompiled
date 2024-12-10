package X;

import com.whatsapp.WaTextView;
import com.whatsapp.bot.metaai.voice.MetaAiVoiceMultimodalComposerActivity;

/* renamed from: X.7yM  reason: invalid class name */
public final class AnonymousClass7yM extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ MetaAiVoiceMultimodalComposerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7yM(MetaAiVoiceMultimodalComposerActivity metaAiVoiceMultimodalComposerActivity) {
        super(1);
        this.this$0 = metaAiVoiceMultimodalComposerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number = (Number) obj;
        WaTextView waTextView = this.this$0.A08;
        if (waTextView == null) {
            C18070vi.A11("statusIndicatorText");
            throw null;
        }
        waTextView.setVisibility(AnonymousClass3MY.A03(number));
        return C27621Wu.A00;
    }
}
