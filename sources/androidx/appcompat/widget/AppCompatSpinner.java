package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass02D;
import X.AnonymousClass03U;
import X.AnonymousClass057;
import X.AnonymousClass0Rj;
import X.C05250Rk;
import X.C05360Rw;
import X.C16940tT;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class AppCompatSpinner extends Spinner {
    public static final int[] A08 = {16843505};
    public int A00;
    public C16940tT A01;
    public SpinnerAdapter A02;
    public AnonymousClass0Rj A03;
    public final Context A04;
    public final Rect A05;
    public final AnonymousClass03U A06;
    public final boolean A07;

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public int A02(Drawable drawable, SpinnerAdapter spinnerAdapter) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        Rect rect = this.A05;
        drawable.getPadding(rect);
        return i2 + rect.left + rect.right;
    }

    public int getDropDownHorizontalOffset() {
        C16940tT r0 = this.A01;
        if (r0 != null) {
            return r0.BSY();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        C16940tT r0 = this.A01;
        if (r0 != null) {
            return r0.BbP();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.A01 != null) {
            return this.A00;
        }
        return super.getDropDownWidth();
    }

    public Drawable getPopupBackground() {
        C16940tT r0 = this.A01;
        if (r0 != null) {
            return r0.BNI();
        }
        return super.getPopupBackground();
    }

    public CharSequence getPrompt() {
        C16940tT r0 = this.A01;
        if (r0 != null) {
            return r0.BSV();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        AnonymousClass03U r0 = this.A06;
        if (r0 != null) {
            return AnonymousClass000.A0X(r0.A00);
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AnonymousClass03U r0 = this.A06;
        if (r0 != null) {
            return AnonymousClass000.A0Z(r0.A00);
        }
        return null;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        AnonymousClass057 r4 = (AnonymousClass057) parcelable;
        super.onRestoreInstanceState(r4.getSuperState());
        if (r4.A00 && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C05250Rk(this, 2));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass0Rj r0 = this.A03;
        if (r0 == null || !r0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C16940tT r2 = this.A01;
        if (r2 == null) {
            return super.performClick();
        }
        if (r2.BgV()) {
            return true;
        }
        r2.CMY(A01(this), A00(this));
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.A07) {
            this.A02 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        C16940tT r2 = this.A01;
        if (r2 != null) {
            Context context = this.A04;
            if (context == null) {
                context = getContext();
            }
            r2.CHm(new C05360Rw(context.getTheme(), spinnerAdapter));
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C16940tT r0 = this.A01;
        if (r0 != null) {
            r0.CJ7(i);
            r0.CJ6(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i) {
        C16940tT r0 = this.A01;
        if (r0 != null) {
            r0.CLK(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.A01 != null) {
            this.A00 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C16940tT r0 = this.A01;
        if (r0 != null) {
            r0.CI3(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AnonymousClass02D.A03().A09(this.A04, i));
    }

    public void setPrompt(CharSequence charSequence) {
        C16940tT r0 = this.A01;
        if (r0 != null) {
            r0.CKF(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AnonymousClass03U r0 = this.A06;
        if (r0 != null) {
            r0.A04(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AnonymousClass03U r0 = this.A06;
        if (r0 != null) {
            r0.A05(mode);
        }
    }

    public static int A00(View view) {
        return view.getTextAlignment();
    }

    public static int A01(View view) {
        return view.getTextDirection();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass03U r0 = this.A06;
        if (r0 != null) {
            r0.A01();
        }
    }

    public final C16940tT getInternalPopup() {
        return this.A01;
    }

    public Context getPopupContext() {
        return this.A04;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C16940tT r1 = this.A01;
        if (r1 != null && r1.BgV()) {
            r1.dismiss();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A01 != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), A02(getBackground(), getAdapter())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.view.View$BaseSavedState, X.057, android.os.Parcelable] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r1 == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            X.057 r2 = new X.057
            r2.<init>(r0)
            X.0tT r0 = r3.A01
            if (r0 == 0) goto L_0x0014
            boolean r1 = r0.BgV()
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r2.A00 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.onSaveInstanceState():android.os.Parcelable");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AnonymousClass03U r0 = this.A06;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AnonymousClass03U r0 = this.A06;
        if (r0 != null) {
            r0.A03(i);
        }
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [X.01k, android.content.ContextWrapper] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        if (r6 != null) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[SYNTHETIC, Splitter:B:10:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12, android.content.res.Resources.Theme r13) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.A05 = r0
            X.AnonymousClass000.A1A(r8)
            int[] r7 = X.C002501d.A0L
            r2 = 0
            X.01c r4 = X.C002401c.A00(r9, r10, r7, r11, r2)
            X.03U r0 = new X.03U
            r0.<init>(r8)
            r8.A06 = r0
            if (r13 == 0) goto L_0x002b
            X.01k r1 = new X.01k
            r1.<init>(r9)
            r1.A02 = r13
        L_0x0024:
            r8.A04 = r1
        L_0x0026:
            r0 = -1
            r5 = 0
            if (r12 != r0) goto L_0x0068
            goto L_0x003d
        L_0x002b:
            r1 = 4
            android.content.res.TypedArray r0 = r4.A02
            int r0 = r0.getResourceId(r1, r2)
            if (r0 == 0) goto L_0x003a
            X.01k r1 = new X.01k
            r1.<init>(r9, r0)
            goto L_0x0024
        L_0x003a:
            r8.A04 = r9
            goto L_0x0026
        L_0x003d:
            int[] r0 = A08     // Catch:{ Exception -> 0x0050, all -> 0x0061 }
            android.content.res.TypedArray r6 = r9.obtainStyledAttributes(r10, r0, r11, r2)     // Catch:{ Exception -> 0x0050, all -> 0x0061 }
            boolean r0 = r6.hasValue(r2)     // Catch:{ Exception -> 0x004e }
            if (r0 == 0) goto L_0x0065
            int r12 = r6.getInt(r2, r2)     // Catch:{ Exception -> 0x004e }
            goto L_0x0065
        L_0x004e:
            r3 = move-exception
            goto L_0x0052
        L_0x0050:
            r3 = move-exception
            r6 = r5
        L_0x0052:
            java.lang.String r1 = "AppCompatSpinner"
            java.lang.String r0 = "Could not read android:spinnerMode"
            android.util.Log.i(r1, r0, r3)     // Catch:{ all -> 0x005a }
            goto L_0x0063
        L_0x005a:
            r0 = move-exception
            if (r6 == 0) goto L_0x0062
            r6.recycle()
            throw r0
        L_0x0061:
            r0 = move-exception
        L_0x0062:
            throw r0
        L_0x0063:
            if (r6 == 0) goto L_0x0068
        L_0x0065:
            r6.recycle()
        L_0x0068:
            r3 = 1
            if (r12 == 0) goto L_0x00ce
            if (r12 != r3) goto L_0x00a0
            android.content.Context r0 = r8.A04
            X.06Q r6 = new X.06Q
            r6.<init>(r0, r10, r8, r11)
            android.content.Context r0 = r8.A04
            X.01c r7 = X.C002401c.A00(r0, r10, r7, r11, r2)
            r1 = 3
            r0 = -2
            android.content.res.TypedArray r2 = r7.A02
            int r0 = r2.getLayoutDimension(r1, r0)
            r8.A00 = r0
            android.graphics.drawable.Drawable r0 = r7.A03(r3)
            r6.CI3(r0)
            r1 = 2
            android.content.res.TypedArray r0 = r4.A02
            java.lang.String r0 = r0.getString(r1)
            r6.A02 = r0
            r2.recycle()
            r8.A01 = r6
            X.06M r0 = new X.06M
            r0.<init>(r8, r8, r6, r3)
            r8.A03 = r0
        L_0x00a0:
            r0 = 0
            android.content.res.TypedArray r4 = r4.A02
            java.lang.CharSequence[] r2 = r4.getTextArray(r0)
            if (r2 == 0) goto L_0x00ba
            r0 = 17367048(0x1090008, float:2.5162948E-38)
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r1.<init>(r9, r0, r2)
            r0 = 2131627155(0x7f0e0c93, float:1.8881566E38)
            r1.setDropDownViewResource(r0)
            r8.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00ba:
            r4.recycle()
            r8.A07 = r3
            android.widget.SpinnerAdapter r0 = r8.A02
            if (r0 == 0) goto L_0x00c8
            r8.setAdapter((android.widget.SpinnerAdapter) r0)
            r8.A02 = r5
        L_0x00c8:
            X.03U r0 = r8.A06
            r0.A06(r10, r11)
            return
        L_0x00ce:
            X.0SG r2 = new X.0SG
            r2.<init>(r8)
            r8.A01 = r2
            r1 = 2
            android.content.res.TypedArray r0 = r4.A02
            java.lang.String r0 = r0.getString(r1)
            r2.A01 = r0
            goto L_0x00a0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971326);
    }

    public AppCompatSpinner(Context context, int i) {
        this(context, (AttributeSet) null, 2130971326, i);
    }
}
