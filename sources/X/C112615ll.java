package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;

/* renamed from: X.5ll  reason: invalid class name and case insensitive filesystem */
public final class C112615ll extends C40611uz {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final /* synthetic */ AnonymousClass72m A03;

    public C112615ll(AnonymousClass72m r1, int i, int i2, boolean z) {
        this.A03 = r1;
        this.A02 = z;
        this.A01 = i;
        this.A00 = i2;
    }

    public void A05(Rect rect, View view, C38021qZ r8, RecyclerView recyclerView) {
        int i;
        super.A05(rect, view, r8, recyclerView);
        C17960vV.A0C(recyclerView instanceof ShapePickerRecyclerView);
        ShapePickerRecyclerView shapePickerRecyclerView = (ShapePickerRecyclerView) recyclerView;
        int A002 = RecyclerView.A00(view);
        if (A002 != -1) {
            AnonymousClass71G A003 = C112395lP.A00(this.A03.A0I, A002);
            ShapePickerRecyclerView.A06(shapePickerRecyclerView);
            int i2 = shapePickerRecyclerView.A01;
            int actualShapeSpacing = shapePickerRecyclerView.getActualShapeSpacing();
            int i3 = A003.A02;
            if (i3 == 0) {
                int i4 = A003.A01 % i2;
                int i5 = (i4 * actualShapeSpacing) / i2;
                int i6 = actualShapeSpacing - (((i4 + 1) * actualShapeSpacing) / i2);
                boolean z = this.A02;
                int i7 = i5;
                if (z) {
                    i7 = i6;
                }
                rect.left = i7;
                if (!z) {
                    i5 = i6;
                }
                rect.right = i5;
                i = this.A01;
            } else if (i3 == 1) {
                i = this.A00;
            } else {
                return;
            }
            rect.top = i;
        }
    }
}
