package com.google.android.material.datepicker;

import X.A8Y;
import X.AnonymousClass000;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass8DE;
import X.AnonymousClass8EJ;
import X.C17880vN;
import X.C17890vO;
import X.C188209h3;
import X.C19760yx;
import X.C21349Aie;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import java.util.Iterator;

public final class MaterialCalendarGridView extends GridView {
    public final Calendar A00;
    public final boolean A01;

    public void onFocusChanged(boolean z, int i, Rect rect) {
        int A02;
        boolean z2 = false;
        if (z) {
            if (i == 33) {
                AnonymousClass8DE r0 = (AnonymousClass8DE) super.getAdapter();
                A02 = (r0.A02() + r0.A04.A01) - 1;
            } else if (i == 130) {
                A02 = ((AnonymousClass8DE) super.getAdapter()).A02();
            } else {
                z2 = true;
            }
            setSelection(A02);
            return;
        }
        super.onFocusChanged(z2, i, rect);
    }

    public final void onDraw(Canvas canvas) {
        Object obj;
        int A02;
        int left;
        int A022;
        int left2;
        int i;
        int width;
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        AnonymousClass8DE r9 = (AnonymousClass8DE) super.getAdapter();
        C188209h3 r8 = r9.A00;
        int max = Math.max(r9.A02(), getFirstVisiblePosition());
        int A023 = r9.A02();
        C21349Aie aie = r9.A04;
        int min = Math.min((A023 + aie.A01) - 1, getLastVisiblePosition());
        Long A03 = r9.getItem(max);
        Long A032 = r9.getItem(min);
        Iterator it = AnonymousClass000.A13().iterator();
        while (it.hasNext()) {
            C19760yx r0 = (C19760yx) it.next();
            Object obj2 = r0.A00;
            if (!(obj2 == null || (obj = r0.A01) == null)) {
                long A05 = C17880vN.A05(obj2);
                long A052 = C17880vN.A05(obj);
                if (!(A03 == null || A032 == null)) {
                    long longValue = A032.longValue();
                    if (A05 <= longValue) {
                        long longValue2 = A03.longValue();
                        if (A052 >= longValue2) {
                            boolean A1R = C17890vO.A1R(getLayoutDirection());
                            if (A05 < longValue2) {
                                if (max % aie.A02 == 0) {
                                    left = 0;
                                } else {
                                    View childAt = getChildAt((max - 1) - getFirstVisiblePosition());
                                    if (!A1R) {
                                        left = childAt.getRight();
                                    } else {
                                        left = childAt.getLeft();
                                    }
                                }
                                A02 = max;
                            } else {
                                Calendar calendar = this.A00;
                                calendar.setTimeInMillis(A05);
                                A02 = r9.A02() + (calendar.get(5) - 1);
                                View childAt2 = getChildAt(A02 - getFirstVisiblePosition());
                                left = childAt2.getLeft() + (childAt2.getWidth() / 2);
                            }
                            if (A052 > longValue) {
                                if ((min + 1) % aie.A02 == 0) {
                                    left2 = getWidth();
                                } else {
                                    View childAt3 = getChildAt(min - getFirstVisiblePosition());
                                    if (!A1R) {
                                        left2 = childAt3.getRight();
                                    } else {
                                        left2 = childAt3.getLeft();
                                    }
                                }
                                A022 = min;
                            } else {
                                Calendar calendar2 = this.A00;
                                calendar2.setTimeInMillis(A052);
                                A022 = r9.A02() + (calendar2.get(5) - 1);
                                View childAt4 = getChildAt(A022 - getFirstVisiblePosition());
                                left2 = childAt4.getLeft() + (childAt4.getWidth() / 2);
                            }
                            int itemId = (int) r9.getItemId(A022);
                            for (int itemId2 = (int) r9.getItemId(A02); itemId2 <= itemId; itemId2++) {
                                int numColumns = getNumColumns() * itemId2;
                                int numColumns2 = (getNumColumns() + numColumns) - 1;
                                View childAt5 = getChildAt(numColumns - getFirstVisiblePosition());
                                int top = childAt5.getTop();
                                Rect rect = r8.A01.A04;
                                int i2 = top + rect.top;
                                int bottom = childAt5.getBottom() - rect.bottom;
                                if (!A1R) {
                                    i = left;
                                    if (numColumns > A02) {
                                        i = 0;
                                    }
                                    if (A022 <= numColumns2) {
                                        width = left2;
                                    }
                                    width = getWidth();
                                } else {
                                    int i3 = left2;
                                    if (A022 > numColumns2) {
                                        i3 = 0;
                                    }
                                    if (numColumns <= A02) {
                                        width = left;
                                    }
                                    width = getWidth();
                                }
                                canvas2.drawRect((float) i, (float) i2, (float) width, (float) bottom, r8.A00);
                            }
                        }
                    }
                }
            }
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.A01) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof AnonymousClass8DE) {
            super.setAdapter(listAdapter);
            return;
        }
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = MaterialCalendarGridView.class.getCanonicalName();
        A1b[1] = AnonymousClass8DE.class.getCanonicalName();
        throw AnonymousClass000.A0k(String.format("%1$s must have its Adapter set to a %2$s", A1b));
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = A8Y.A07((Calendar) null);
        if (MaterialDatePicker.A03(getContext(), 16843277)) {
            setNextFocusLeftId(2131428815);
            setNextFocusRightId(2131429338);
        }
        this.A01 = MaterialDatePicker.A03(getContext(), 2130970597);
        AnonymousClass1HF.A0f(this, new AnonymousClass8EJ(this, 4));
    }

    public AnonymousClass8DE A00() {
        return (AnonymousClass8DE) super.getAdapter();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((BaseAdapter) super.getAdapter()).notifyDataSetChanged();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (super.onKeyDown(i, keyEvent)) {
            if (getSelectedItemPosition() != -1 && getSelectedItemPosition() < ((AnonymousClass8DE) super.getAdapter()).A02()) {
                if (19 == i) {
                    setSelection(((AnonymousClass8DE) super.getAdapter()).A02());
                }
            }
            return true;
        }
        return false;
    }

    public void setSelection(int i) {
        if (i < ((AnonymousClass8DE) super.getAdapter()).A02()) {
            i = ((AnonymousClass8DE) super.getAdapter()).A02();
        }
        super.setSelection(i);
    }

    public MaterialCalendarGridView(Context context) {
        this(context, (AttributeSet) null);
    }

    public /* bridge */ /* synthetic */ void setAdapter(Adapter adapter) {
        setAdapter((ListAdapter) adapter);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
