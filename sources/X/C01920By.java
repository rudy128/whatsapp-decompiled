package X;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: X.0By  reason: invalid class name and case insensitive filesystem */
public class C01920By extends C01930Bz implements C17790vE {
    public C04240Mk A00;
    public final C05140Qp A01 = new C05140Qp(this, AnonymousClass0O7.A01);

    public C01920By(Context context) {
        super(context, (AttributeSet) null);
    }

    public void A0D(int i, int i2, int i3, int i4) {
        C04240Mk r0 = this.A00;
        if (r0 != null) {
            C05140Qp mountState = getMountState();
            mountState.A0J(r0);
            int i5 = 0;
            while (true) {
                C04240Mk r1 = this.A00;
                if (r0 == r1) {
                    break;
                } else if (i5 > 4) {
                    AnonymousClass0MD.A00(AnonymousClass0CT.ERROR, "RenderTreeHostView", "More than 4 recursive mount attempts. Skipping mounting the latest version.", (Throwable) null);
                    return;
                } else {
                    mountState.A0J(r1);
                    i5++;
                    r0 = r1;
                }
            }
        }
        C02700Fa.A00(this);
    }

    public void offsetLeftAndRight(int i) {
        if (i != 0) {
            super.offsetLeftAndRight(i);
            BkX();
        }
    }

    public void offsetTopAndBottom(int i) {
        if (i != 0) {
            super.offsetTopAndBottom(i);
            BkX();
        }
    }

    public void onMeasure(int i, int i2) {
        C04240Mk r2 = this.A00;
        if (r2 == null) {
            setMeasuredDimension(0, 0);
        } else {
            setMeasuredDimension(r2.A03.A03.width(), r2.A03.A03.height());
        }
    }

    public void setRenderTree(C04240Mk r2) {
        if (this.A00 != r2) {
            if (r2 == null) {
                getMountState().A0G();
            }
            this.A00 = r2;
            requestLayout();
        }
    }

    public void BkX() {
        C02770Fh.A00(this, getMountState());
    }

    public final C04240Mk getCurrentRenderTree() {
        return this.A00;
    }

    public C05140Qp getMountState() {
        return this.A01;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getMountState().A0E();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getMountState().A0F();
    }

    public void setRenderTreeUpdateListener(C15890rN r4) {
        C05140Qp mountState = getMountState();
        AnonymousClass0Ke r1 = mountState.A00;
        if (r1 == null) {
            r1 = new AnonymousClass0Ke(mountState, mountState.A06);
        }
        r1.A00 = r4;
        mountState.A00 = r1;
    }

    public void setTranslationX(float f) {
        if (f != getTranslationX()) {
            super.setTranslationX(f);
            BkX();
        }
    }

    public void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            BkX();
        }
    }
}
