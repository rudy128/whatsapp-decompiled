package X;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import com.whatsapp.bot.metaai.voice.MetaAiVoiceMultimodalComposerActivity;
import com.whatsapp.bot.metaai.voice.MetaAiVoiceMultimodalComposerViewModel;
import com.whatsapp.textstatus.AddTextStatusActivity;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.77i  reason: invalid class name and case insensitive filesystem */
public class C1418877i implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;

    public C1418877i(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void afterTextChanged(Editable editable) {
        String str;
        if (this.A00 != 0) {
            AddTextStatusActivity addTextStatusActivity = (AddTextStatusActivity) this.A01;
            boolean z = false;
            if (addTextStatusActivity.A0E) {
                C112015kn r1 = addTextStatusActivity.A08;
                if (r1 == null) {
                    C18070vi.A11("adapter");
                    throw null;
                }
                r1.A01 = null;
                r1.notifyDataSetChanged();
                addTextStatusActivity.A0E = false;
            }
            AddTextStatusActivity.A0Q(addTextStatusActivity);
            String str2 = addTextStatusActivity.A0D;
            if (str2 == null || str2.length() == 0) {
                addTextStatusActivity.A05.CGN(AnonymousClass7RI.A00(addTextStatusActivity, 47));
            }
            WDSButton wDSButton = addTextStatusActivity.A09;
            if (wDSButton == null) {
                C18070vi.A11("clearButton");
                throw null;
            }
            if ((editable != null && editable.length() > 0) || ((str = addTextStatusActivity.A0D) != null && str.length() > 0)) {
                z = true;
            }
            wDSButton.setEnabled(z);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Integer num;
        if (this.A00 == 0) {
            if (!(charSequence == null || charSequence.length() == 0)) {
                ((MetaAiVoiceMultimodalComposerViewModel) ((MetaAiVoiceMultimodalComposerActivity) this.A01).A0N.getValue()).A0Y(AnonymousClass00R.A01);
            }
            MetaAiVoiceMultimodalComposerActivity metaAiVoiceMultimodalComposerActivity = (MetaAiVoiceMultimodalComposerActivity) this.A01;
            if (C18070vi.A19(((MetaAiVoiceMultimodalComposerViewModel) metaAiVoiceMultimodalComposerActivity.A0N.getValue()).A03.A06(), false)) {
                num = AnonymousClass00R.A0C;
            } else {
                MetaAiVoiceMultimodalComposerActivity.A0c(metaAiVoiceMultimodalComposerActivity, C122426Qf.TEXT_INPUT);
                if (charSequence == null || charSequence.length() <= 0) {
                    num = AnonymousClass00R.A01;
                } else {
                    num = AnonymousClass00R.A00;
                }
            }
            MetaAiVoiceMultimodalComposerActivity.A0d(metaAiVoiceMultimodalComposerActivity, num);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
