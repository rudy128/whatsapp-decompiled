package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class AlertDialogLayout extends LinearLayoutCompat {
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int childCount = getChildCount();
        View view = null;
        int i9 = 0;
        View view2 = null;
        View view3 = null;
        int i10 = 0;
        while (true) {
            i3 = i;
            i4 = i2;
            if (i10 < childCount) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    int id = childAt.getId();
                    if (id == 2131436287) {
                        view = childAt;
                    } else if (id == 2131428582) {
                        view2 = childAt;
                    } else if ((id == 2131429511 || id == 2131429748) && view3 == null) {
                        view3 = childAt;
                    }
                }
                i10++;
            } else {
                int mode = View.MeasureSpec.getMode(i4);
                int size = View.MeasureSpec.getSize(i4);
                int mode2 = View.MeasureSpec.getMode(i3);
                int paddingTop = getPaddingTop() + getPaddingBottom();
                if (view != null) {
                    view.measure(i3, 0);
                    paddingTop += view.getMeasuredHeight();
                    i5 = View.combineMeasuredStates(0, view.getMeasuredState());
                } else {
                    i5 = 0;
                }
                if (view2 != null) {
                    view2.measure(i3, 0);
                    i6 = A00(view2);
                    i7 = view2.getMeasuredHeight() - i6;
                    paddingTop += i6;
                    i5 = View.combineMeasuredStates(i5, view2.getMeasuredState());
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (view3 != null) {
                    if (mode != 0) {
                        i9 = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode);
                    }
                    view3.measure(i3, i9);
                    i8 = view3.getMeasuredHeight();
                    paddingTop += i8;
                    i5 = View.combineMeasuredStates(i5, view3.getMeasuredState());
                } else {
                    i8 = 0;
                }
                int i11 = size - paddingTop;
                if (view2 != null) {
                    int i12 = paddingTop - i6;
                    int min = Math.min(i11, i7);
                    if (min > 0) {
                        i11 -= min;
                        i6 += min;
                    }
                    view2.measure(i3, View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
                    paddingTop = i12 + view2.getMeasuredHeight();
                    i5 = View.combineMeasuredStates(i5, view2.getMeasuredState());
                }
                if (view3 != null && i11 > 0) {
                    view3.measure(i3, View.MeasureSpec.makeMeasureSpec(i8 + i11, mode));
                    paddingTop = (paddingTop - i8) + view3.getMeasuredHeight();
                    i5 = View.combineMeasuredStates(i5, view3.getMeasuredState());
                }
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt2 = getChildAt(i14);
                    if (childAt2.getVisibility() != 8) {
                        i13 = Math.max(i13, childAt2.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(i13 + getPaddingLeft() + getPaddingRight(), i3, i5), View.resolveSizeAndState(paddingTop, i4, 0));
                if (mode2 != 1073741824) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt3 = getChildAt(i15);
                        if (childAt3.getVisibility() != 8) {
                            ViewGroup.LayoutParams layoutParams = childAt3.getLayoutParams();
                            if (layoutParams.width == -1) {
                                int i16 = layoutParams.height;
                                layoutParams.height = childAt3.getMeasuredHeight();
                                measureChildWithMargins(childAt3, makeMeasureSpec, 0, i4, 0);
                                layoutParams.height = i16;
                            }
                        }
                    }
                    return;
                }
                return;
            }
        }
        super.onMeasure(i3, i4);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int A00(View view) {
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return A00(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        int intrinsicHeight;
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int i8 = this.A05;
        int i9 = i8 & 112;
        int i10 = i8 & 8388615;
        if (i9 != 16) {
            paddingTop = getPaddingTop();
            if (i9 == 80) {
                paddingTop = ((paddingTop + i4) - i2) - measuredHeight;
            }
        } else {
            paddingTop = getPaddingTop() + (((i4 - i2) - measuredHeight) / 2);
        }
        Drawable drawable = this.A07;
        if (drawable == null) {
            intrinsicHeight = 0;
        } else {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                int i12 = layoutParams.gravity;
                if (i12 < 0) {
                    i12 = i10;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i12, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i6 = i5 - layoutParams.rightMargin;
                } else if (absoluteGravity != 5) {
                    i6 = layoutParams.leftMargin + paddingLeft;
                } else {
                    i5 = paddingRight - measuredWidth;
                    i6 = i5 - layoutParams.rightMargin;
                }
                if (A0D(i11)) {
                    paddingTop += intrinsicHeight;
                }
                int i13 = paddingTop + layoutParams.topMargin;
                childAt.layout(i6, i13, measuredWidth + i6, measuredHeight2 + i13);
                paddingTop = i13 + measuredHeight2 + layoutParams.bottomMargin;
            }
        }
    }

    public AlertDialogLayout(Context context) {
        super(context, (AttributeSet) null);
    }
}
