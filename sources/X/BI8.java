package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public final class BI8 extends FrameLayout {
    public ViewGroup A00;
    public BIK A01;
    public C0B A02;

    public final void setMode(C0B c0b) {
        C18070vi.A0d(c0b, 0);
        this.A02 = c0b;
    }

    public final BIK getContentPager() {
        BIK bik = this.A01;
        if (bik != null) {
            return bik;
        }
        C18070vi.A11("contentPager");
        throw null;
    }

    public final ViewGroup getHeaderContainer() {
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            return viewGroup;
        }
        C18070vi.A11("headerContainer");
        throw null;
    }

    public final C0B getMode() {
        return this.A02;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        getContentPager().layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        getHeaderContainer().measure(BE7.A06(View.MeasureSpec.getSize(getMeasuredWidth())), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getMeasuredHeight()), Integer.MIN_VALUE));
        getHeaderContainer().layout(0, 0, getHeaderContainer().getMeasuredWidth(), getHeaderContainer().getMeasuredHeight());
    }

    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        int size = View.MeasureSpec.getSize(i2);
        if (this.A02.wrapsContent) {
            i3 = Integer.MIN_VALUE;
        }
        getContentPager().measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size, i3));
        setMeasuredDimension(getContentPager().getMeasuredWidth(), getContentPager().getMeasuredHeight());
    }
}
