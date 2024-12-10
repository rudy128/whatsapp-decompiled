package X;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.whatsapp.WaTextView;
import com.whatsapp.collections.centeredrecyclerview.CenteredSelectionRecyclerView;
import com.whatsapp.components.AutoScrollView;

/* renamed from: X.D4x  reason: case insensitive filesystem */
public class C26583D4x implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C26583D4x(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.A00;
        view.removeOnLayoutChangeListener(this);
        if (i9 != 0) {
            AutoScrollView autoScrollView = (AutoScrollView) this.A02;
            boolean A1P = AnonymousClass000.A1P(autoScrollView.getRootView().getLayoutDirection());
            autoScrollView.A03 = A1P;
            HorizontalScrollView horizontalScrollView = autoScrollView.A00;
            horizontalScrollView.setLayoutDirection(A1P ^ true ? 1 : 0);
            WaTextView waTextView = autoScrollView.A09;
            int width = waTextView.getWidth() + autoScrollView.A06;
            int i10 = 1;
            if (autoScrollView.A03) {
                i10 = -1;
            }
            int i11 = -i10;
            int i12 = autoScrollView.A04;
            int i13 = autoScrollView.A07;
            int i14 = i12 + width + i13;
            int i15 = autoScrollView.A05;
            if (i14 < i15) {
                ViewGroup.LayoutParams layoutParams = waTextView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = i14;
                    waTextView.setLayoutParams(layoutParams);
                    ViewGroup.LayoutParams layoutParams2 = horizontalScrollView.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.width = -2;
                        horizontalScrollView.setLayoutParams(layoutParams2);
                        waTextView.setTranslationX((float) (i13 * i11));
                        autoScrollView.A0A.setVisibility(8);
                    } else {
                        throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                } else {
                    throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else {
                autoScrollView.A02 = true;
                ViewGroup.LayoutParams layoutParams3 = horizontalScrollView.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = i15;
                    horizontalScrollView.setLayoutParams(layoutParams3);
                    float f = (float) ((i12 + i13) * i11);
                    long j = autoScrollView.A08 * ((long) (width / i15));
                    waTextView.setTranslationX(f);
                    autoScrollView.A0A.setTranslationX(waTextView.getTranslationX() + ((float) (width * i11)));
                    AutoScrollView.A00(autoScrollView, f, width, i10, i11, j);
                    if (i12 > 0) {
                        horizontalScrollView.setHorizontalFadingEdgeEnabled(true);
                        horizontalScrollView.setFadingEdgeLength(i12);
                        horizontalScrollView.requestLayout();
                    }
                } else {
                    throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            horizontalScrollView.post(new C146437Pc(autoScrollView, 27));
            ((C18090vk) this.A01).invoke();
            return;
        }
        CenteredSelectionRecyclerView.A05((CenteredSelectionRecyclerView) this.A02, ((BL0) ((Parcelable) this.A01)).A00, false);
    }
}
