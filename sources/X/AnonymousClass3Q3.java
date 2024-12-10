package X;

import android.view.View;
import android.widget.LinearLayout;

/* renamed from: X.3Q3  reason: invalid class name */
public abstract class AnonymousClass3Q3 extends LinearLayout {
    public boolean A00;

    public abstract View getPrimaryNameView();

    public abstract View getSecondaryNameView();

    public abstract void setShouldTruncateNameViewWhenNeeded(boolean z);

    public void A00(boolean z) {
        int A09;
        int A092;
        View view = (View) getParent();
        if (view != null) {
            View secondaryNameView = getSecondaryNameView();
            layout(view.getPaddingLeft(), view.getPaddingTop(), C72463Mc.A09(view), view.getPaddingTop() + getMeasuredHeight());
            int top = secondaryNameView.getTop();
            int bottom = secondaryNameView.getBottom();
            if (z) {
                A09 = getPaddingLeft();
                A092 = getPaddingLeft() + secondaryNameView.getWidth();
            } else {
                A09 = C72463Mc.A09(this) - secondaryNameView.getWidth();
                A092 = C72463Mc.A09(this);
            }
            secondaryNameView.layout(A09, top, A092, bottom);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        View childAt = getChildAt(0);
        View secondaryNameView = getSecondaryNameView();
        if (childAt == null || secondaryNameView == null) {
            C17960vV.A0F(false, "ConversationRowParticipantHeaderBaseView should have both primary and secondary name views.");
        } else if (!this.A00) {
        } else {
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                int A0C = C72453Mb.A0C(this);
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int i3 = 0;
                if (secondaryNameView.getVisibility() != 8) {
                    AnonymousClass3MY.A1C(secondaryNameView, measuredHeight - paddingTop, Integer.MIN_VALUE, View.MeasureSpec.makeMeasureSpec(measuredWidth - A0C, Integer.MIN_VALUE));
                    i3 = secondaryNameView.getMeasuredWidth();
                }
                AnonymousClass3MY.A1C(childAt, measuredHeight - paddingTop, Integer.MIN_VALUE, View.MeasureSpec.makeMeasureSpec(Math.max((measuredWidth - i3) - A0C, 0), Integer.MIN_VALUE));
            }
        }
    }
}
