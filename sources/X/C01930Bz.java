package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.0Bz  reason: invalid class name and case insensitive filesystem */
public class C01930Bz extends AnonymousClass05E {
    public AnonymousClass0sS A00;
    public boolean A01;
    public boolean A02;
    public C03330Hq[] A03 = new C03330Hq[8];
    public C03330Hq[] A04;
    public Drawable A05;
    public SparseArray A06;
    public Object A07;
    public int[] A08 = new int[0];
    public final AnonymousClass0IS A09 = new AnonymousClass0IS(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C01930Bz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
    }

    public static final int A01(C03330Hq r4, C03330Hq[] r5) {
        if (r5 != null) {
            int length = r5.length;
            for (int i = 0; i < length; i++) {
                if (C18070vi.A18(r5[i], r4)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static final void A04(Drawable drawable, View view) {
        C18070vi.A0d(drawable, 1);
        if (drawable.isStateful()) {
            AnonymousClass000.A17(drawable, view);
        }
    }

    public static final void A05(Drawable drawable, View view) {
        C18070vi.A0d(drawable, 1);
        drawable.setVisible(AnonymousClass000.A1P(view.getVisibility()), false);
        drawable.setCallback(view);
        A04(drawable, view);
    }

    public static /* synthetic */ void getDescriptionOfMountedItems$annotations() {
    }

    public void A0D(int i, int i2, int i3, int i4) {
    }

    public void dispatchDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        AnonymousClass0IS r2 = this.A09;
        r2.A02 = canvas;
        r2.A00 = 0;
        r2.A01 = r2.A03.A03.length;
        super.dispatchDraw(canvas);
        if (r2.A02 != null && r2.A00 < r2.A01) {
            r2.A00();
        }
        r2.A02 = null;
    }

    public void draw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        super.draw(canvas);
        Drawable drawable = this.A05;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Boolean Bw3;
        C18070vi.A0d(motionEvent, 0);
        AnonymousClass0sS r0 = this.A00;
        if (r0 == null || (Bw3 = r0.Bw3(motionEvent, this)) == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return Bw3.booleanValue();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A01 = true;
        A0D(i, i2, i3, i4);
        this.A01 = false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C03330Hq[] r0;
        C18070vi.A0d(motionEvent, 0);
        if (isEnabled() && (r0 = this.A03) != null) {
            for (int length = r0.length - 1; -1 < length; length--) {
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void requestLayout() {
        ViewParent viewParent = this;
        while (viewParent instanceof C01930Bz) {
            if (!((C01930Bz) viewParent).A01) {
                viewParent = viewParent.getParent();
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    public final void setViewTags(SparseArray sparseArray) {
        C18070vi.A0d(sparseArray, 0);
        this.A06 = sparseArray;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public static final int A00(C01930Bz r3, C03330Hq r4) {
        C03330Hq[] r0;
        int A012 = A01(r4, r3.A03);
        if (A012 > -1 || ((r0 = r3.A04) != null && (A012 = A01(r4, r0)) > -1)) {
            return A012;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("\n              Mount item was not found in the list of mounted items.\n              Item to remove: ");
        A10.append(r4.A01.A01((C04240Mk) null));
        A10.append("\n              Mounted items: ");
        A10.append(A02(r3.A03));
        A10.append("\n              Scraped items: ");
        A10.append(A02(r3.A04));
        throw AnonymousClass000.A0n(AnonymousClass1Y7.A01(AnonymousClass000.A0y("\n              ", A10)));
    }

    public static final String A02(C03330Hq[] r6) {
        if (r6 == null) {
            return "<null>";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        int length = r6.length;
        for (int i = 0; i < length; i++) {
            C03330Hq r2 = r6[i];
            A10.append("Item at index: ");
            if (r2 != null) {
                A10.append(i);
                A10.append(" Type: ");
                A10.append(r2.A01.A07.A0E());
                A10.append(" Position in parent: ");
                A10.append(r2.A01.A02);
            } else {
                A10.append(i);
                A10.append(" item is null");
            }
            A10.append("\n");
        }
        String obj = A10.toString();
        C18070vi.A0X(obj);
        return obj;
    }

    private final void A03() {
        if (this.A02) {
            int childCount = getChildCount();
            if (this.A08.length < childCount) {
                this.A08 = new int[(childCount + 5)];
            }
            int i = 0;
            for (C03330Hq r2 : this.A03) {
                if (r2 != null && r2.A01.A07.A04 == AnonymousClass00R.A01) {
                    Object obj = r2.A04;
                    C18070vi.A0z(obj, "null cannot be cast to non-null type android.view.View");
                    this.A08[i] = indexOfChild((View) obj);
                    i++;
                }
            }
            this.A02 = false;
        }
    }

    public static final void A08(C01930Bz r2, C03330Hq r3) {
        Object obj = r3.A04;
        C18070vi.A0z(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
        A05((Drawable) obj, r2);
        r2.invalidate(r3.A01.A03);
    }

    public static final void A09(C01930Bz r5, C03330Hq r6) {
        Object obj = r6.A04;
        C18070vi.A0z(obj, "null cannot be cast to non-null type android.view.View");
        View view = (View) obj;
        r5.A02 = true;
        if (!(view instanceof C01930Bz) || view.getParent() != r5) {
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(r5.generateDefaultLayoutParams());
            }
            boolean z = r5.A01;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (z) {
                super.addViewInLayout(view, -1, layoutParams, true);
            } else {
                super.addView(view, -1, layoutParams);
            }
        } else {
            A06(view);
            view.setVisibility(0);
        }
    }

    public static final void A0A(C01930Bz r2, C03330Hq r3) {
        Object obj = r3.A04;
        C18070vi.A0z(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
        Drawable drawable = (Drawable) obj;
        drawable.setCallback((Drawable.Callback) null);
        r2.invalidate(drawable.getBounds());
    }

    public static final void A0B(C01930Bz r2, C03330Hq r3) {
        Object obj = r3.A04;
        C18070vi.A0z(obj, "null cannot be cast to non-null type android.view.View");
        View view = (View) obj;
        r2.A02 = true;
        if (view.isPressed()) {
            view.setPressed(false);
        }
        if (r2.A01) {
            super.removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    private final void setForegroundLollipop(Drawable drawable) {
        Drawable drawable2 = this.A05;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(drawable2);
            }
            this.A05 = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    AnonymousClass000.A17(drawable, this);
                }
            }
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r7[r10] == null) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.C03330Hq r9, int r10, int r11) {
        /*
            r8 = this;
            java.lang.Object r6 = r9.A04
            r8.invalidate()
            com.facebook.rendercore.RenderTreeNode r0 = r9.A01
            X.0Qf r0 = r0.A07
            java.lang.Integer r0 = r0.A04
            java.lang.Integer r5 = X.AnonymousClass00R.A01
            java.lang.String r4 = "null cannot be cast to non-null type android.view.View"
            if (r0 != r5) goto L_0x001d
            r0 = 1
            r8.A02 = r0
            X.C18070vi.A0z(r6, r4)
            r0 = r6
            android.view.View r0 = (android.view.View) r0
            A07(r0)
        L_0x001d:
            X.0Hq[] r2 = r8.A03
            int r3 = r2.length
            if (r11 < r3) goto L_0x0030
            r0 = r3
        L_0x0023:
            int r0 = r0 * 2
            if (r11 >= r0) goto L_0x0023
            X.0Hq[] r1 = new X.C03330Hq[r0]
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r1, r0, r3)
            r8.A03 = r1
            r2 = r1
        L_0x0030:
            r1 = r2[r11]
            if (r1 == 0) goto L_0x003f
            X.0Hq[] r0 = r8.A04
            if (r0 != 0) goto L_0x003d
            int r0 = r2.length
            X.0Hq[] r0 = new X.C03330Hq[r0]
            r8.A04 = r0
        L_0x003d:
            r0[r11] = r1
        L_0x003f:
            X.0Hq[] r7 = r8.A04
            if (r7 == 0) goto L_0x0048
            r1 = r7[r10]
            r0 = 1
            if (r1 != 0) goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            r3 = 0
            if (r0 == 0) goto L_0x0063
            if (r7 == 0) goto L_0x0061
            r0 = r7[r10]
            r7[r10] = r3
        L_0x0052:
            r2[r11] = r0
            if (r7 == 0) goto L_0x0068
            int r2 = r7.length
            r1 = 0
        L_0x0058:
            if (r1 >= r2) goto L_0x0068
            r0 = r7[r1]
            if (r0 != 0) goto L_0x006a
            int r1 = r1 + 1
            goto L_0x0058
        L_0x0061:
            r0 = r3
            goto L_0x0052
        L_0x0063:
            r0 = r2[r10]
            r2[r10] = r3
            goto L_0x0052
        L_0x0068:
            r8.A04 = r3
        L_0x006a:
            com.facebook.rendercore.RenderTreeNode r0 = r9.A01
            X.0Qf r0 = r0.A07
            java.lang.Integer r0 = r0.A04
            if (r0 != r5) goto L_0x007a
            X.C18070vi.A0z(r6, r4)
            android.view.View r6 = (android.view.View) r6
            A06(r6)
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01930Bz.A0C(X.0Hq, int, int):void");
    }

    public int getMountItemCount() {
        int i = 0;
        for (C03330Hq r0 : this.A03) {
            if (r0 != null) {
                i++;
            }
        }
        return i;
    }

    public Object getTag(int i) {
        Object obj;
        SparseArray sparseArray = this.A06;
        if (sparseArray == null || (obj = sparseArray.get(i)) == null) {
            return super.getTag(i);
        }
        return obj;
    }

    public final void setForegroundCompat(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            C02710Fb.A00(drawable, this);
        } else {
            setForegroundLollipop(drawable);
        }
    }

    public static final void A07(View view) {
        view.cancelPendingInputEvents();
        AnonymousClass1HF.A0S(view);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        for (C03330Hq r2 : this.A03) {
            if (r2 != null && r2.A01.A07.A04 == AnonymousClass00R.A00) {
                Object obj = r2.A04;
                C18070vi.A0z(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                A04((Drawable) obj, this);
            }
        }
        Drawable drawable = this.A05;
        if (drawable != null) {
            AnonymousClass000.A17(drawable, this);
        }
    }

    public int getChildDrawingOrder(int i, int i2) {
        A03();
        AnonymousClass0IS r2 = this.A09;
        if (r2.A02 != null && r2.A00 < r2.A01) {
            r2.A00();
        }
        return this.A08[i2];
    }

    public String getDescriptionOfMountedItems() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("\nMounted Items");
        A10.append(A02(this.A03));
        A10.append("\nScraped Items: ");
        String A0y = AnonymousClass000.A0y(A02(this.A04), A10);
        C18070vi.A0X(A0y);
        return A0y;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        for (C03330Hq r2 : this.A03) {
            if (r2 != null && r2.A01.A07.A04 == AnonymousClass00R.A00) {
                Object obj = r2.A04;
                C18070vi.A0z(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                ((Drawable) obj).jumpToCurrentState();
            }
        }
        Drawable drawable = this.A05;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.A05;
        if (drawable != null) {
            drawable.setBounds(0, 0, getRight(), getBottom());
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        for (C03330Hq r2 : this.A03) {
            if (r2 != null && r2.A01.A07.A04 == AnonymousClass00R.A00) {
                Object obj = r2.A04;
                C18070vi.A0z(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                ((Drawable) obj).setVisible(AnonymousClass000.A1P(i), false);
            }
        }
    }

    public static final void A06(View view) {
        AnonymousClass1HF.A0R(view);
    }

    public final void setInterceptTouchEventHandler(AnonymousClass0sS r1) {
        this.A00 = r1;
    }

    public final void setViewTag(Object obj) {
        this.A07 = obj;
    }

    public Object getTag() {
        Object obj = this.A07;
        if (obj == null) {
            return super.getTag();
        }
        return obj;
    }
}
