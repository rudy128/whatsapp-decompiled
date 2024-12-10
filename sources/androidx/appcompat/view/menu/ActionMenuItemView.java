package androidx.appcompat.view.menu;

import X.AnonymousClass03G;
import X.AnonymousClass03N;
import X.AnonymousClass03P;
import X.AnonymousClass06L;
import X.AnonymousClass0Rj;
import X.C004501y;
import X.C008003p;
import X.C02060Co;
import X.C16540sb;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class ActionMenuItemView extends AnonymousClass03P implements View.OnClickListener, C008003p, C16540sb {
    public C02060Co A00;
    public C004501y A01;
    public AnonymousClass03G A02;
    public int A03;
    public int A04;
    public int A05;
    public Drawable A06;
    public AnonymousClass0Rj A07;
    public CharSequence A08;
    public boolean A09;
    public boolean A0A;

    public boolean CCE() {
        return true;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    private void A0F() {
        CharSequence charSequence;
        CharSequence title;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.A08);
        if (this.A06 != null && (!this.A02.A0J() || (!this.A09 && !this.A0A))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        if (z3) {
            charSequence = this.A08;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.A02.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                title = null;
            } else {
                title = this.A02.getTitle();
            }
            setContentDescription(title);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.A02.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.A02.getTitle();
            }
            AnonymousClass03N.A00(this, charSequence2);
            return;
        }
        AnonymousClass03N.A00(this, tooltipText);
    }

    public void BdW(AnonymousClass03G r3) {
        this.A02 = r3;
        setIcon(r3.getIcon());
        setTitle(r3.A02(this));
        setId(r3.getItemId());
        int i = 8;
        if (r3.isVisible()) {
            i = 0;
        }
        setVisibility(i);
        setEnabled(r3.isEnabled());
        if (r3.hasSubMenu() && this.A07 == null) {
            this.A07 = new AnonymousClass06L(this);
        }
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public void onClick(View view) {
        C004501y r1 = this.A01;
        if (r1 != null) {
            r1.Bdt(this.A02);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass0Rj r0;
        if (!this.A02.hasSubMenu() || (r0 = this.A07) == null || !r0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setExpandedFormat(boolean z) {
        if (this.A0A != z) {
            this.A0A = z;
            AnonymousClass03G r0 = this.A02;
            if (r0 != null) {
                r0.A04();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.A06 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.A03;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        A0F();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.A05 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setTitle(CharSequence charSequence) {
        this.A08 = charSequence;
        A0F();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r2.orientation == 2) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionMenuItemView(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            r4.<init>(r5, r6, r7)
            android.content.res.Resources r3 = r5.getResources()
            android.content.res.Resources r0 = X.AnonymousClass000.A0Y(r4)
            android.content.res.Configuration r2 = r0.getConfiguration()
            int r1 = r2.screenWidthDp
            r0 = 480(0x1e0, float:6.73E-43)
            if (r1 >= r0) goto L_0x001b
            int r2 = r2.orientation
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            r4.A09 = r0
            int[] r0 = X.C002501d.A02
            r2 = 0
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r0, r7, r2)
            int r0 = r1.getDimensionPixelSize(r2, r2)
            r4.A04 = r0
            r1.recycle()
            android.util.DisplayMetrics r0 = r3.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1107296256(0x42000000, float:32.0)
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            r4.A03 = r0
            r4.setOnClickListener(r4)
            r0 = -1
            r4.A05 = r0
            r4.setSaveEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public boolean A0G() {
        return !TextUtils.isEmpty(getText());
    }

    public boolean BkC() {
        return A0G();
    }

    public boolean BkD() {
        if (!A0G() || this.A02.getIcon() != null) {
            return false;
        }
        return true;
    }

    public AnonymousClass03G getItemData() {
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r2.orientation == 2) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigurationChanged(android.content.res.Configuration r4) {
        /*
            r3 = this;
            super.onConfigurationChanged(r4)
            android.content.res.Resources r0 = X.AnonymousClass000.A0Y(r3)
            android.content.res.Configuration r2 = r0.getConfiguration()
            int r1 = r2.screenWidthDp
            r0 = 480(0x1e0, float:6.73E-43)
            if (r1 >= r0) goto L_0x0017
            int r2 = r2.orientation
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            r3.A09 = r0
            r3.A0F()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.onConfigurationChanged(android.content.res.Configuration):void");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean A0G = A0G();
        if (A0G && (i5 = this.A05) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i4 = this.A04;
            i3 = Math.min(size, i4);
        } else {
            i3 = this.A04;
            i4 = i3;
        }
        if (mode != 1073741824 && i4 > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!A0G && this.A06 != null) {
            super.setPadding((getMeasuredWidth() - this.A06.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void setItemInvoker(C004501y r1) {
        this.A01 = r1;
    }

    public void setPopupCallback(C02060Co r1) {
        this.A00 = r1;
    }

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
