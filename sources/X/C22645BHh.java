package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.BHh  reason: case insensitive filesystem */
public final class C22645BHh extends ViewGroup {
    public ViewGroup A00;
    public C04220Mi A01;
    public DOZ A02;
    public C23679Bnm A03;
    public boolean A04;
    public boolean A05;
    public final Rect A06 = AnonymousClass3MW.A07();

    public final Rect getLastKnownLocation() {
        if (this.A00 != null) {
            int[] A1W = C108945cZ.A1W();
            getLocationOnScreen(A1W);
            Rect rect = this.A06;
            int A0I = BE6.A0I(A1W);
            rect.set(A0I, A1W[1], getWidth() + A0I, AnonymousClass3MW.A02(this, A1W[1]));
        }
        return this.A06;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.A04) {
            this.A03.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public void onMeasure(int i, int i2) {
        C23679Bnm bnm = this.A03;
        bnm.measure(i, i2);
        setMeasuredDimension(bnm.getMeasuredWidth(), bnm.getMeasuredHeight());
    }

    public final void setRenderResult(C04220Mi r2, DOZ doz) {
        this.A01 = r2;
        this.A02 = doz;
        this.A03.setRenderResult(r2, doz);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.BV3, X.Bnm] */
    public C22645BHh(Context context) {
        super(context);
        this.A03 = new BV3(context);
        if (!this.A04) {
            this.A04 = true;
            addView(this.A03);
            requestLayout();
        }
        this.A03.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View rootView = getRootView();
        C18070vi.A0z(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) rootView;
        this.A00 = viewGroup;
        if (this.A05) {
            if (this.A04) {
                this.A04 = false;
                removeView(this.A03);
                requestLayout();
            }
            viewGroup.addView(this.A03);
            this.A05 = false;
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getLastKnownLocation();
        this.A00 = null;
    }
}
