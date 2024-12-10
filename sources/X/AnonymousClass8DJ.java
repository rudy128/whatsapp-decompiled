package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.8DJ  reason: invalid class name */
public class AnonymousClass8DJ extends FrameLayout implements AnonymousClass009 {
    public ImageView A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public AnonymousClass031 A04;
    public boolean A05;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A04;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public void setBottomDividerSpaceVisibility(int i) {
        float f = 0.0f;
        if (i == 0) {
            f = 24.0f;
        }
        setPadding(C62762rw.A01(getContext(), 24.0f), 0, C62762rw.A01(getContext(), 24.0f), C62762rw.A01(getContext(), f));
    }

    public void setCard(AnonymousClass8pK r8) {
        int A002;
        TextView textView = this.A02;
        Context context = getContext();
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = C20085A6m.A04(r8.A01);
        A1b[1] = C20284AEs.A03(r8.A00);
        AnonymousClass3MY.A0y(context, textView, A1b, 2131899034);
        TextView textView2 = this.A03;
        AnonymousClass3MY.A0y(getContext(), textView2, new Object[]{C20284AEs.A02(r8)}, 2131899035);
        ImageView imageView = this.A01;
        int i = r8.A01;
        if (i == 0) {
            A002 = 2131231837;
        } else {
            A002 = A8e.A00(i);
        }
        imageView.setImageResource(A002);
    }

    public void setCardNameTextViewVisibility(int i) {
        this.A02.setVisibility(i);
    }

    public void setCardNetworkIconVisibility(int i) {
        this.A01.setVisibility(i);
    }

    public void setCardNumberTextColor(int i) {
        this.A03.setTextColor(i);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((int) (((float) (View.MeasureSpec.getSize(i) - (getPaddingLeft() + getPaddingRight()))) * 0.62f)) + getPaddingTop() + getPaddingBottom(), 1073741824));
    }
}
