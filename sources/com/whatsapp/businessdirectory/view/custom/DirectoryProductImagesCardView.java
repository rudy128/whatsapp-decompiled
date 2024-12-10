package com.whatsapp.businessdirectory.view.custom;

import X.AnonymousClass1Y1;
import X.AnonymousClass1b2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass5US;
import X.C147047Rp;
import X.C147157Sa;
import X.C18070vi;
import X.C99434so;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.facebook.shimmer.ShimmerFrameLayout;

public final class DirectoryProductImagesCardView extends CardView {
    public ShimmerFrameLayout A00;
    public final LinearLayout A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DirectoryProductImagesCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final boolean A00() {
        C147157Sa A09 = AnonymousClass1b2.A09(new AnonymousClass5US(ShimmerFrameLayout.class), new C99434so(this.A01, 1));
        C18070vi.A0z(A09, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        C147047Rp r2 = new C147047Rp(A09);
        while (r2.hasNext()) {
            if (AnonymousClass3MW.A0H((View) r2.next(), 2131434115).getDrawable() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean A01() {
        C147157Sa A09 = AnonymousClass1b2.A09(new AnonymousClass5US(ShimmerFrameLayout.class), new C99434so(this.A01, 1));
        C18070vi.A0z(A09, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        C147047Rp r2 = new C147047Rp(A09);
        while (r2.hasNext()) {
            if (AnonymousClass3MW.A0H((View) r2.next(), 2131434112).getDrawable().isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final LinearLayout getImagesContainerView() {
        return this.A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectoryProductImagesCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, linearLayout.getResources().getDimensionPixelSize(2131166470)));
        this.A01 = linearLayout;
        addView(linearLayout);
        setPreventCornerOverlap(false);
        setRadius(getResources().getDimension(2131168354));
        setCardElevation(0.0f);
        setCardBackgroundColor(0);
    }

    public /* synthetic */ DirectoryProductImagesCardView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DirectoryProductImagesCardView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
