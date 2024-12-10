package X;

import com.whatsapp.metaai.voice.ui.MetaAiVoiceInputBottomSheet;
import com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel;

/* renamed from: X.7Bg  reason: invalid class name and case insensitive filesystem */
public final class C142907Bg implements C24401Ke {
    public final /* synthetic */ MetaAiVoiceInputBottomSheet A00;

    public void BlT() {
    }

    public C142907Bg(MetaAiVoiceInputBottomSheet metaAiVoiceInputBottomSheet) {
        this.A00 = metaAiVoiceInputBottomSheet;
    }

    public void onAppBackgrounded() {
        MetaAiVoiceViewModel A0m = C108945cZ.A0m(this.A00.A0S);
        MetaAiVoiceViewModel.A08(A0m, 11, 12);
        ((C93644jJ) A0m.A0U.get()).A01();
    }
}
