package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.whatsapp.bot.metaai.voice.MetaAiVoiceMultimodalComposerActivity;
import com.whatsapp.bot.metaai.voice.MetaAiVoiceMultimodalComposerViewModel;
import com.whatsapp.contact.picker.ContactPickerBottomSheetActivity;

/* renamed from: X.78V  reason: invalid class name */
public class AnonymousClass78V implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass78V(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFocusChange(View view, boolean z) {
        C28931bI r1;
        Window window;
        int i;
        switch (this.A00) {
            case 0:
                MetaAiVoiceMultimodalComposerActivity metaAiVoiceMultimodalComposerActivity = (MetaAiVoiceMultimodalComposerActivity) this.A01;
                if (z) {
                    C18100vl r12 = metaAiVoiceMultimodalComposerActivity.A0N;
                    if (((MetaAiVoiceMultimodalComposerViewModel) r12.getValue()).A00) {
                        ((MetaAiVoiceMultimodalComposerViewModel) r12.getValue()).A00 = false;
                        return;
                    }
                    AnonymousClass3MY.A1L(((MetaAiVoiceMultimodalComposerViewModel) r12.getValue()).A07, true);
                    MetaAiVoiceMultimodalComposerActivity.A0Q(metaAiVoiceMultimodalComposerActivity);
                    MetaAiVoiceMultimodalComposerActivity.A0c(metaAiVoiceMultimodalComposerActivity, C122426Qf.TEXT_INPUT);
                    return;
                }
                return;
            case 1:
                AnonymousClass70Q r3 = (AnonymousClass70Q) this.A01;
                if (!z && (r1 = r3.A05) != null && r1.A00 != null && r1.A01() == 0) {
                    r3.A09(false);
                    return;
                }
                return;
            case 2:
                C116505xr r13 = (C116505xr) this.A01;
                r13.A06.A00();
                r13.A03.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                return;
            case 3:
                Fragment fragment = (Fragment) this.A01;
                if (z) {
                    ((ContactPickerBottomSheetActivity) fragment.A1D()).A02.A0W(3);
                    return;
                }
                return;
            default:
                AnonymousClass71R r2 = (AnonymousClass71R) this.A01;
                Drawable background = r2.A0A.getBackground();
                int i2 = 204;
                if (z) {
                    i2 = 230;
                }
                background.setAlpha(i2);
                AnonymousClass1L4 r0 = r2.A0E;
                if (z) {
                    r0.A02(view);
                    window = r2.A02.getWindow();
                    i = 5;
                } else {
                    r0.A01(view);
                    window = r2.A02.getWindow();
                    i = 3;
                }
                window.setSoftInputMode(i);
                return;
        }
    }
}
