package X;

import android.text.Editable;
import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet;
import com.whatsapp.imagine.InputPrompt;

/* renamed from: X.7yB  reason: invalid class name */
public final class AnonymousClass7yB extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AiImagineBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7yB(AiImagineBottomSheet aiImagineBottomSheet) {
        super(1);
        this.this$0 = aiImagineBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InputPrompt inputPrompt;
        AiImagineBottomSheet aiImagineBottomSheet = this.this$0;
        if (AnonymousClass3MX.A1a((Boolean) obj) && (inputPrompt = aiImagineBottomSheet.A0Q) != null) {
            C111225jD r0 = aiImagineBottomSheet.A0J;
            if (r0 == null) {
                AnonymousClass3MW.A1H();
                throw null;
            }
            inputPrompt.setText((Editable) r0.A0P.A06());
        }
        return C27621Wu.A00;
    }
}
