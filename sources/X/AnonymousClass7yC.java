package X;

import android.content.Context;
import android.text.Editable;
import android.text.style.ForegroundColorSpan;
import android.util.Range;
import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet;
import com.whatsapp.imagine.InputPrompt;

/* renamed from: X.7yC  reason: invalid class name */
public final class AnonymousClass7yC extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AiImagineBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7yC(AiImagineBottomSheet aiImagineBottomSheet) {
        super(1);
        this.this$0 = aiImagineBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Editable editable;
        Context A1n;
        Range range = (Range) obj;
        AiImagineBottomSheet aiImagineBottomSheet = this.this$0;
        InputPrompt inputPrompt = aiImagineBottomSheet.A0Q;
        if (!(inputPrompt == null || (editable = inputPrompt.getEditable()) == null || (A1n = aiImagineBottomSheet.A1n()) == null)) {
            C83704Gi.A00(editable, AnonymousClass3MW.A15(ForegroundColorSpan.class));
            if (range != null) {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C19740yt.A00(A1n, 2131101858));
                Comparable lower = range.getLower();
                C18070vi.A0X(lower);
                int A0M = AnonymousClass000.A0M(lower);
                Comparable upper = range.getUpper();
                C18070vi.A0X(upper);
                editable.setSpan(foregroundColorSpan, A0M, AnonymousClass000.A0M(upper), 33);
            }
        }
        return C27621Wu.A00;
    }
}
