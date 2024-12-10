package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.preference.PreferenceFragmentCompat;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.8I7  reason: invalid class name */
public class AnonymousClass8I7 extends C40611uz {
    public int A00;
    public Drawable A01;
    public boolean A02 = true;
    public final /* synthetic */ PreferenceFragmentCompat A03;

    public AnonymousClass8I7(PreferenceFragmentCompat preferenceFragmentCompat) {
        this.A03 = preferenceFragmentCompat;
    }

    public void A03(Canvas canvas, C38021qZ r9, RecyclerView recyclerView) {
        if (this.A01 != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (A00(childAt, recyclerView)) {
                    int A022 = AnonymousClass3MW.A02(childAt, (int) childAt.getY());
                    this.A01.setBounds(0, A022, width, this.A00 + A022);
                    this.A01.draw(canvas);
                }
            }
        }
    }

    private boolean A00(View view, RecyclerView recyclerView) {
        C42011xT A0Q = recyclerView.A0Q(view);
        if (!(A0Q instanceof AnonymousClass8J3) || !((AnonymousClass8J3) A0Q).A01) {
            return false;
        }
        boolean z = this.A02;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        C42011xT A0Q2 = recyclerView.A0Q(recyclerView.getChildAt(indexOfChild + 1));
        if (!(A0Q2 instanceof AnonymousClass8J3) || !((AnonymousClass8J3) A0Q2).A00) {
            return false;
        }
        return true;
    }

    public void A05(Rect rect, View view, C38021qZ r4, RecyclerView recyclerView) {
        if (A00(view, recyclerView)) {
            rect.bottom = this.A00;
        }
    }
}
