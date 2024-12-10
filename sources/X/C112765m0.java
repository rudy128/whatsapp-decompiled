package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet;

/* renamed from: X.5m0  reason: invalid class name and case insensitive filesystem */
public final class C112765m0 extends D70 {
    public final /* synthetic */ AiImagineBottomSheet A00;

    public C112765m0(AiImagineBottomSheet aiImagineBottomSheet) {
        this.A00 = aiImagineBottomSheet;
    }

    public boolean Bw2(MotionEvent motionEvent, RecyclerView recyclerView) {
        boolean A15 = C18070vi.A15(recyclerView, motionEvent);
        CIZ ciz = this.A00.A09;
        if (ciz != null) {
            ciz.A00.onTouchEvent(motionEvent);
        }
        return A15;
    }
}
