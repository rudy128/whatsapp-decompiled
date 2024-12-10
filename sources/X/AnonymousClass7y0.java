package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet;

/* renamed from: X.7y0  reason: invalid class name */
public final class AnonymousClass7y0 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AiImagineBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7y0(AiImagineBottomSheet aiImagineBottomSheet) {
        super(1);
        this.this$0 = aiImagineBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View A02;
        RecyclerView A0Q;
        C28931bI r0 = this.this$0.A0Y;
        if (!(r0 == null || (A02 = r0.A02()) == null || (A0Q = AnonymousClass3MX.A0Q(A02, 2131431555)) == null)) {
            C38391rD r1 = A0Q.A0B;
            if ((r1 instanceof C111945kg) && r1 != null) {
                r1.notifyDataSetChanged();
            }
        }
        return C27621Wu.A00;
    }
}
