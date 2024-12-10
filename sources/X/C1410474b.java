package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.camera.DragGalleryStripIndicator;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;
import org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText;

/* renamed from: X.74b  reason: invalid class name and case insensitive filesystem */
public class C1410474b implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C1410474b(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.A00) {
            case 0:
                AnonymousClass701 r4 = (AnonymousClass701) this.A02;
                int i = this.A01;
                float A002 = C108985cd.A00(valueAnimator);
                RecyclerView recyclerView = r4.A0B;
                recyclerView.getLayoutParams().height = (int) (((float) i) * A002);
                recyclerView.requestLayout();
                DragGalleryStripIndicator dragGalleryStripIndicator = r4.A0D;
                if (dragGalleryStripIndicator != null) {
                    dragGalleryStripIndicator.setOffset(A002);
                    return;
                }
                return;
            case 1:
                int i2 = this.A01;
                TitleBarView titleBarView = ((C136986uj) this.A02).A0I;
                float A003 = C108985cd.A00(valueAnimator);
                C109455dT r1 = titleBarView.A0T;
                if (r1 == null) {
                    C18070vi.A11("textToolDrawable");
                    throw null;
                }
                r1.A01 = 0.0f;
                r1.A02 = i2;
                r1.A00 = A003;
                r1.invalidateSelf();
                return;
            case 2:
                AnonymousClass7M6 r3 = (AnonymousClass7M6) this.A02;
                int A004 = (int) (((float) this.A01) * (C108985cd.A00(valueAnimator) / 100.0f));
                ViewGroup.MarginLayoutParams A0B = AnonymousClass3MW.A0B(r3.A01);
                A0B.topMargin = -A004;
                r3.A01.setLayoutParams(A0B);
                return;
            default:
                FormItemEditText formItemEditText = (FormItemEditText) this.A02;
                formItemEditText.A0J[this.A01] = ((Number) valueAnimator.getAnimatedValue()).floatValue();
                formItemEditText.invalidate();
                return;
        }
    }
}
