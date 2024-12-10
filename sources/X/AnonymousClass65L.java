package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.whatsapp.WaImageView;
import com.whatsapp.gallery.ui.RotatableThumbnailImageView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.65L  reason: invalid class name */
public class AnonymousClass65L extends C112225l8 {
    public C113555nH A0U(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        C113555nH A0U = super.BqY(viewGroup, i);
        View view = A0U.A0H;
        float dimension = AnonymousClass000.A0Y(view).getDimension(2131166901);
        if ((view instanceof CardView) && view != null) {
            C147157Sa A09 = AnonymousClass1b2.A09(C1590683c.A00, new C99434so(view, 1));
            C18070vi.A0z(A09, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
            RotatableThumbnailImageView rotatableThumbnailImageView = (RotatableThumbnailImageView) AnonymousClass1b2.A04(A09);
            if (rotatableThumbnailImageView != null) {
                rotatableThumbnailImageView.setCornerRadius(dimension);
            }
        }
        return A0U;
    }

    public static final void A00(C113555nH r5, int i) {
        ViewGroup viewGroup;
        if (i == 0) {
            View view = r5.A0H;
            if ((view instanceof CardView) && (viewGroup = (ViewGroup) view) != null) {
                Iterator A00 = C99434so.A00(viewGroup, 1);
                while (A00.hasNext()) {
                    if (C18070vi.A18(AnonymousClass3MX.A0E(A00).getTag(), 2131231878)) {
                        return;
                    }
                }
                WaImageView waImageView = new WaImageView(r5.A03.getContext());
                waImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                waImageView.setScaleType(ImageView.ScaleType.CENTER);
                waImageView.setImageResource(2131231878);
                waImageView.setTag(2131231878);
                viewGroup.addView(waImageView);
            }
        }
    }

    public /* bridge */ /* synthetic */ void A0P(C42011xT r3, List list, int i) {
        C113555nH r32 = (C113555nH) r3;
        C18070vi.A0e(r32, 0, list);
        if (list.isEmpty()) {
            Bmc(r32, i);
            return;
        }
        Object obj = list.get(0);
        C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.gallery.SelectedStackedMediaDiffCallback.SelectedMediaDiff");
        AnonymousClass8B2 r0 = ((C134346qR) obj).A00;
        if (r0 != null) {
            r32.A0B(r0);
        }
        A00(r32, i);
    }

    public int A0Q() {
        int size = this.A01.size();
        if (size > 3) {
            return 3;
        }
        return size;
    }
}
