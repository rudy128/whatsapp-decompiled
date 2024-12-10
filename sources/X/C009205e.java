package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* renamed from: X.05e  reason: invalid class name and case insensitive filesystem */
public class C009205e extends ListView {
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public C06470Yl A05;
    public boolean A06;
    public boolean A07;
    public AnonymousClass04U A08;
    public C20294AFc A09;
    public boolean A0A;
    public final Rect A0B = new Rect();

    public C009205e(Context context, boolean z) {
        super(context, (AttributeSet) null, 2130969408);
        this.A0A = z;
        setCacheColorHint(0);
    }

    public void onDetachedFromWindow() {
        this.A05 = null;
        super.onDetachedFromWindow();
    }

    private void setSelectorEnabled(boolean z) {
        AnonymousClass04U r0 = this.A08;
        if (r0 != null) {
            r0.A01 = z;
        }
    }

    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.A0B;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.A05 == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            Drawable selector = getSelector();
            if (selector != null && this.A06 && isPressed()) {
                AnonymousClass000.A17(selector, this);
            }
        }
    }

    public boolean hasFocus() {
        if (this.A0A || super.hasFocus()) {
            return true;
        }
        return false;
    }

    public boolean hasWindowFocus() {
        if (this.A0A || super.hasWindowFocus()) {
            return true;
        }
        return false;
    }

    public boolean isFocused() {
        if (this.A0A || super.isFocused()) {
            return true;
        }
        return false;
    }

    public boolean isInTouchMode() {
        if ((!this.A0A || !this.A07) && !super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.A05 == null) {
            C06470Yl r1 = new C06470Yl(this);
            this.A05 = r1;
            r1.A00.post(r1);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (Build.VERSION.SDK_INT < 30 || !AnonymousClass0O9.A01()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        AnonymousClass0O9.A00(childAt, this, pointToPosition);
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.A06 && isPressed()) {
                    AnonymousClass000.A17(selector, this);
                    return onHoverEvent;
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.04U, android.graphics.drawable.Drawable$Callback, android.graphics.drawable.Drawable] */
    public void setSelector(Drawable drawable) {
        AnonymousClass04U r2;
        if (drawable != null) {
            ? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.A00;
            if (drawable3 != null) {
                drawable3.setCallback((Drawable.Callback) null);
            }
            drawable2.A00 = drawable;
            drawable.setCallback(drawable2);
            drawable2.A01 = true;
            r2 = drawable2;
        } else {
            r2 = null;
        }
        this.A08 = r2;
        super.setSelector(r2);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.A02 = rect.left;
        this.A04 = rect.top;
        this.A03 = rect.right;
        this.A01 = rect.bottom;
    }

    private void A01(View view, float f, float f2, int i) {
        A02(view, i);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C27831Xu.A0A(selector, f, f2);
        }
    }

    private void A02(View view, int i) {
        boolean z;
        Drawable selector = getSelector();
        boolean z2 = true;
        if (selector == null || i == -1) {
            z = false;
        } else {
            z = true;
            selector.setVisible(false, false);
        }
        Rect rect = this.A0B;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.A02;
        rect.top -= this.A04;
        rect.right += this.A03;
        rect.bottom += this.A01;
        boolean A042 = A04();
        if (view.isEnabled() != A042) {
            A03(!A042);
            if (i != -1) {
                refreshDrawableState();
            }
        }
        if (z) {
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z2 = false;
            }
            selector.setVisible(z2, false);
            C27831Xu.A0A(selector, exactCenterX, exactCenterY);
        }
    }

    private void A03(boolean z) {
        if (C1401770f.A00()) {
            C03760Kn.A00(this, z);
            return;
        }
        Field field = C02820Fn.A00;
        if (field != null) {
            try {
                field.set(this, Boolean.valueOf(z));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean A04() {
        if (C1401770f.A00()) {
            return C03760Kn.A01(this);
        }
        Field field = C02820Fn.A00;
        if (field == null) {
            return false;
        }
        try {
            return field.getBoolean(this);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return false;
        }
    }

    public int A05(int i, int i2) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i3 = listPaddingTop + listPaddingBottom;
        if (adapter != null) {
            if (dividerHeight <= 0 || divider == null) {
                dividerHeight = 0;
            }
            int count = adapter.getCount();
            View view = null;
            int i4 = 0;
            for (int i5 = 0; i5 < count; i5++) {
                int itemViewType = adapter.getItemViewType(i5);
                if (itemViewType != i4) {
                    view = null;
                    i4 = itemViewType;
                }
                view = adapter.getView(i5, view, this);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = generateDefaultLayoutParams();
                    view.setLayoutParams(layoutParams);
                }
                int i6 = layoutParams.height;
                if (i6 > 0) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                }
                view.measure(i, makeMeasureSpec);
                view.forceLayout();
                if (i5 > 0) {
                    i3 += dividerHeight;
                }
                i3 += view.getMeasuredHeight();
                if (i3 >= i2) {
                    return i2;
                }
            }
        }
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r7 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06(android.view.MotionEvent r10, int r11) {
        /*
            r9 = this;
            int r7 = r10.getActionMasked()
            r5 = 1
            r6 = 0
            if (r7 == r5) goto L_0x0023
            r0 = 2
            if (r7 == r0) goto L_0x0025
            r0 = 3
            if (r7 == r0) goto L_0x00a5
        L_0x000e:
            r3 = 1
        L_0x000f:
            X.AFc r0 = r9.A09
            if (r0 != 0) goto L_0x001a
            X.AFc r0 = new X.AFc
            r0.<init>(r9)
            r9.A09 = r0
        L_0x001a:
            r0.A02(r5)
            X.AFc r0 = r9.A09
            r0.onTouch(r9, r10)
        L_0x0022:
            return r3
        L_0x0023:
            r3 = 0
            goto L_0x0026
        L_0x0025:
            r3 = 1
        L_0x0026:
            int r1 = r10.findPointerIndex(r11)
            if (r1 < 0) goto L_0x00a5
            float r0 = r10.getX(r1)
            int r2 = (int) r0
            float r0 = r10.getY(r1)
            int r1 = (int) r0
            int r4 = r9.pointToPosition(r2, r1)
            r0 = -1
            if (r4 == r0) goto L_0x00a6
            int r0 = r9.getFirstVisiblePosition()
            int r0 = r4 - r0
            android.view.View r3 = r9.getChildAt(r0)
            float r8 = (float) r2
            float r2 = (float) r1
            r9.A06 = r5
            A00(r9, r8, r2)
            boolean r0 = r9.isPressed()
            if (r0 != 0) goto L_0x0057
            r9.setPressed(r5)
        L_0x0057:
            r9.layoutChildren()
            int r1 = r9.A00
            r0 = -1
            if (r1 == r0) goto L_0x0075
            int r0 = r9.getFirstVisiblePosition()
            int r1 = r1 - r0
            android.view.View r1 = r9.getChildAt(r1)
            if (r1 == 0) goto L_0x0075
            if (r1 == r3) goto L_0x0075
            boolean r0 = r1.isPressed()
            if (r0 == 0) goto L_0x0075
            r1.setPressed(r6)
        L_0x0075:
            r9.A00 = r4
            int r0 = r3.getLeft()
            float r0 = (float) r0
            float r1 = r8 - r0
            int r0 = r3.getTop()
            float r0 = (float) r0
            float r0 = r2 - r0
            A00(r3, r1, r0)
            boolean r0 = r3.isPressed()
            if (r0 != 0) goto L_0x0091
            r3.setPressed(r5)
        L_0x0091:
            r9.A01(r3, r8, r2, r4)
            r9.setSelectorEnabled(r6)
            r9.refreshDrawableState()
            if (r7 != r5) goto L_0x000e
            long r0 = r9.getItemIdAtPosition(r4)
            r9.performItemClick(r3, r4, r0)
            goto L_0x000e
        L_0x00a5:
            r3 = 0
        L_0x00a6:
            r9.A06 = r6
            r9.setPressed(r6)
            r9.drawableStateChanged()
            int r1 = r9.A00
            int r0 = r9.getFirstVisiblePosition()
            int r1 = r1 - r0
            android.view.View r0 = r9.getChildAt(r1)
            if (r0 == 0) goto L_0x00be
            r0.setPressed(r6)
        L_0x00be:
            if (r3 != 0) goto L_0x000f
            X.AFc r0 = r9.A09
            if (r0 == 0) goto L_0x0022
            r0.A02(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C009205e.A06(android.view.MotionEvent, int):boolean");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.A00 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C06470Yl r2 = this.A05;
        if (r2 != null) {
            C009205e r1 = r2.A00;
            r1.A05 = null;
            r1.removeCallbacks(r2);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.A07 = z;
    }

    public static void A00(View view, float f, float f2) {
        view.drawableHotspotChanged(f, f2);
    }
}
