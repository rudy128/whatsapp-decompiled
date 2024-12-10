package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;

/* renamed from: X.69n  reason: invalid class name and case insensitive filesystem */
public class C1197069n extends AnonymousClass6z6 {
    public static final int[] A01 = {2131232115, 2131231881, 2131231880, 2131232316, 2131231859, 2131231882, 2131231883, 2131231879};
    public static final int[] A02 = {2131889725, 2131889723, 2131889722, 2131889720, 2131889727, 2131889724, 2131889726, 2131889721};
    public final C112625lm A00;

    public C1197069n(RecyclerView recyclerView, C126126cE r6, ShapePickerRecyclerView shapePickerRecyclerView) {
        super(recyclerView, r6, shapePickerRecyclerView, false);
        Resources A0Y = AnonymousClass000.A0Y(recyclerView);
        C112625lm r0 = new C112625lm(A0Y.getDimensionPixelSize(2131168682), A0Y.getDimensionPixelSize(2131168680), A0Y.getDimensionPixelSize(2131168681));
        this.A00 = r0;
        recyclerView.A0r(r0);
    }

    public void A01(C113105mY r8, boolean z) {
        int i;
        super.A01(r8, z);
        ImageView imageView = r8.A01;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        RecyclerView recyclerView = this.A05;
        Resources A0Y = AnonymousClass000.A0Y(recyclerView);
        int i2 = 2131168712;
        if (z) {
            i2 = 2131168711;
        }
        int dimensionPixelSize = A0Y.getDimensionPixelSize(i2);
        float f = (float) dimensionPixelSize;
        float A002 = AnonymousClass3MW.A00(AnonymousClass000.A0Y(recyclerView), 2131168679);
        float f2 = 1.0f;
        if (z) {
            f2 = 0.9f;
        }
        int i3 = ((int) (f - (A002 * f2))) / 2;
        C108955ca.A1I(imageView, dimensionPixelSize, layoutParams);
        imageView.setPadding(i3, i3, i3, i3);
        View view = r8.A0H;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (z) {
            i = AnonymousClass000.A0Y(recyclerView).getDimensionPixelOffset(2131168680);
        } else {
            i = -2;
        }
        layoutParams2.width = i;
        view.setLayoutParams(layoutParams2);
        this.A00.A00 = z;
    }
}
