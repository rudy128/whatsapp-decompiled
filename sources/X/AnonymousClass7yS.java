package X;

import android.text.Editable;
import com.whatsapp.bot.metaai.voice.MetaAiVoiceMultimodalComposerActivity;
import com.whatsapp.bot.metaai.voice.MetaAiVoiceMultimodalComposerViewModel;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.7yS  reason: invalid class name */
public final class AnonymousClass7yS extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ MetaAiVoiceMultimodalComposerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7yS(MetaAiVoiceMultimodalComposerActivity metaAiVoiceMultimodalComposerActivity) {
        super(1);
        this.this$0 = metaAiVoiceMultimodalComposerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1D6 r5 = (AnonymousClass1D6) obj;
        C122426Qf r1 = (C122426Qf) r5.first;
        String str = (String) r5.second;
        MetaAiVoiceMultimodalComposerActivity.A0c(this.this$0, r1);
        if (r1 == C122426Qf.TRANSCRIPTION) {
            MetaAiVoiceMultimodalComposerActivity.A03(this.this$0);
            MentionableEntry mentionableEntry = this.this$0.A0A;
            if (mentionableEntry != null) {
                mentionableEntry.clearFocus();
                if (str.length() > 0) {
                    ((MetaAiVoiceMultimodalComposerViewModel) this.this$0.A0N.getValue()).A0Y(AnonymousClass00R.A00);
                }
            }
            C18070vi.A11("chatBarEntry");
            throw null;
        }
        MentionableEntry mentionableEntry2 = this.this$0.A0A;
        if (mentionableEntry2 != null) {
            mentionableEntry2.setText(Editable.Factory.getInstance().newEditable(str));
            return C27621Wu.A00;
        }
        C18070vi.A11("chatBarEntry");
        throw null;
    }
}
