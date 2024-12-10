package X;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;

/* renamed from: X.6G2  reason: invalid class name */
public abstract class AnonymousClass6G2 extends C109915eN implements C23521Gp, C43091zF {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public C18000vb A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final ArgbEvaluator A0A;
    public final Paint A0B;
    public final C18100vl A0C;
    public final boolean A0D;

    public AnonymousClass6G2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            this.A06 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
        this.A0B = C108945cZ.A0K(1);
        this.A0A = new ArgbEvaluator();
        int A012 = C62762rw.A01(context, 3.0f);
        this.A09 = A012;
        this.A05 = A012;
        this.A0D = AnonymousClass3MW.A1Z(getWaLocale());
        this.A0C = AnonymousClass1DF.A01(new C153357pO(this));
    }

    public void Bzw(int i) {
    }

    public void Bzx(int i, float f, int i2) {
    }

    public void C64(C43191zP r1) {
    }

    public void C65(C43191zP r5) {
        int i;
        double d;
        C18070vi.A0d(r5, 0);
        if (this.A03 > this.A04) {
            if (this.A0D) {
                d = 1.0d - r5.A07.A00;
            } else {
                d = r5.A07.A00;
            }
            i = C22339B3q.A00(d);
        } else {
            i = 0;
        }
        setScrollX(i);
    }

    public abstract int getCurrentPage();

    public abstract void setCurrentPage(int i);

    public final void setWaLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final C18000vb getWaLocale() {
        C18000vb r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waLocale");
        throw null;
    }

    public final void setActiveColor(int i) {
        this.A01 = i;
        invalidate();
    }

    public final void setDarkMode(boolean z) {
        this.A08 = z;
        invalidate();
    }

    public final void setInactiveColor(int i) {
        this.A02 = i;
        invalidate();
    }

    public final void setPageCount(int i) {
        this.A03 = i;
        invalidate();
    }

    public final int getActiveColor() {
        return this.A01;
    }

    public final boolean getAnimatePageDotSelection() {
        return this.A07;
    }

    public final int getDefaultSize() {
        return this.A09;
    }

    public final ArgbEvaluator getEvaluator() {
        return this.A0A;
    }

    public final int getInactiveColor() {
        return this.A02;
    }

    public final int getPageCount() {
        return this.A03;
    }

    public final Paint getPaint() {
        return this.A0B;
    }

    public final float getScrollOffset() {
        return this.A00;
    }

    public final C18100vl getScrollSpring() {
        return this.A0C;
    }

    public final int getScrollingItemCountThreshold() {
        return this.A04;
    }

    public final int getSpacing() {
        return this.A05;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C43191zP) this.A0C.getValue()).A04.add(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C43191zP r4 = (C43191zP) this.A0C.getValue();
        C43201zQ r3 = r4.A07;
        double d = r3.A00;
        r4.A00 = d;
        r4.A09.A00 = d;
        r3.A01 = 0.0d;
        r4.A04.remove(this);
    }

    public void setAlpha(float f) {
        super.setAlpha(f);
        this.A0B.setAlpha((int) (f * 255.0f));
        invalidate();
    }

    public void Bzy(int i) {
        setCurrentPage(i);
    }

    public final void setAnimatePageDotSelection(boolean z) {
        this.A07 = z;
    }

    public final void setScrollOffset(float f) {
        this.A00 = f;
    }

    public final void setScrollingItemCountThreshold(int i) {
        this.A04 = i;
    }

    public final void setSpacing(int i) {
        this.A05 = i;
    }
}
