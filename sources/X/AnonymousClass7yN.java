package X;

import com.whatsapp.WaTextView;
import com.whatsapp.bot.metaai.voice.MetaAiVoiceMultimodalComposerActivity;
import com.whatsapp.metaai.voice.ui.MetaAiSpeechIndicatorView;

/* renamed from: X.7yN  reason: invalid class name */
public final class AnonymousClass7yN extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ MetaAiVoiceMultimodalComposerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7yN(MetaAiVoiceMultimodalComposerActivity metaAiVoiceMultimodalComposerActivity) {
        super(1);
        this.this$0 = metaAiVoiceMultimodalComposerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        WaTextView waTextView;
        int i;
        AnonymousClass1D6 r8 = (AnonymousClass1D6) obj;
        AnonymousClass6RF r6 = (AnonymousClass6RF) r8.first;
        boolean A1Y = AnonymousClass000.A1Y(r8.second);
        if (r6 != null) {
            MetaAiSpeechIndicatorView metaAiSpeechIndicatorView = this.this$0.A0B;
            if (metaAiSpeechIndicatorView == null) {
                C18070vi.A11("fullScreenDynamicAnimation");
                throw null;
            }
            metaAiSpeechIndicatorView.setSpeechIndicatorState(r6);
        }
        MetaAiVoiceMultimodalComposerActivity metaAiVoiceMultimodalComposerActivity = this.this$0;
        WaTextView waTextView2 = metaAiVoiceMultimodalComposerActivity.A08;
        if (A1Y) {
            if (waTextView2 != null) {
                C29261bv.A08(waTextView2, 2132084413);
                WaTextView waTextView3 = metaAiVoiceMultimodalComposerActivity.A08;
                if (waTextView3 != null) {
                    AnonymousClass3MX.A1C(metaAiVoiceMultimodalComposerActivity.getApplicationContext(), waTextView3, 2131103152);
                    int ordinal = r6.ordinal();
                    if (ordinal != 0) {
                        waTextView = metaAiVoiceMultimodalComposerActivity.A08;
                        if (ordinal != 1) {
                            if (waTextView != null) {
                                waTextView.setText((CharSequence) null);
                            }
                        } else if (waTextView != null) {
                            i = 2131899178;
                            waTextView.setText(i);
                        }
                    } else {
                        waTextView = metaAiVoiceMultimodalComposerActivity.A08;
                        if (waTextView != null) {
                            i = 2131892209;
                            waTextView.setText(i);
                        }
                    }
                }
            }
            C18070vi.A11("statusIndicatorText");
            throw null;
        }
        if (waTextView2 != null) {
            C29261bv.A08(waTextView2, 2132084419);
            WaTextView waTextView4 = metaAiVoiceMultimodalComposerActivity.A08;
            if (waTextView4 != null) {
                AnonymousClass3MX.A1C(metaAiVoiceMultimodalComposerActivity.getApplicationContext(), waTextView4, 2131103154);
                waTextView = metaAiVoiceMultimodalComposerActivity.A08;
                if (waTextView != null) {
                    i = 2131899179;
                    waTextView.setText(i);
                }
            }
        }
        C18070vi.A11("statusIndicatorText");
        throw null;
        return C27621Wu.A00;
    }
}
