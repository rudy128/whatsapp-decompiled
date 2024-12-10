package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.Locale;

/* renamed from: X.4iP  reason: invalid class name and case insensitive filesystem */
public class C93084iP implements C108355bZ {
    public final C106685Wu A00;
    public final C18140vp A01 = A00(this, 6);
    public final C18140vp A02 = A00(this, 11);
    public final C18140vp A03 = A00(this, 14);
    public final C18140vp A04 = A00(this, 12);
    public final C18140vp A05 = A00(this, 21);
    public final C18140vp A06 = A00(this, 22);
    public final C18140vp A07 = A00(this, 18);
    public final C18140vp A08 = A00(this, 17);
    public final C18140vp A09 = A00(this, 25);
    public final C18140vp A0A = A00(this, 7);
    public final C18140vp A0B = A00(this, 29);
    public final C18140vp A0C = A00(this, 19);
    public final C18140vp A0D = A00(this, 26);
    public final C18140vp A0E = A00(this, 20);
    public final C18140vp A0F = A00(this, 30);
    public final C18140vp A0G = A00(this, 4);
    public final C18140vp A0H = A00(this, 2);
    public final C18140vp A0I = A00(this, 27);
    public final C18140vp A0J = A00(this, 9);
    public final C18140vp A0K = A00(this, 3);
    public final C18140vp A0L = A00(this, 15);
    public final C18140vp A0M = A00(this, 28);
    public final C18140vp A0N = A00(this, 16);
    public final C18140vp A0O = A00(this, 5);
    public final C18140vp A0P = A00(this, 24);
    public final C18140vp A0Q = A00(this, 23);
    public final C18140vp A0R = A00(this, 13);
    public final C18140vp A0S = A00(this, 8);
    public final C18140vp A0T = A00(this, 10);

    public C93084iP(C106685Wu r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
        C18070vi.A0X(C72463Mc.A0p(this).toLowerCase(Locale.ROOT));
    }

    public Rect BNj(int i) {
        C18140vp r0;
        if (i != 1) {
            if (i == 2) {
                r0 = this.A0Q;
            } else if (i == 3) {
                r0 = this.A0R;
            } else {
                throw new AssertionError(AnonymousClass001.A1I("Unreachable code: direction=", AnonymousClass000.A10(), i));
            }
            Rect rect = (Rect) C72463Mc.A0m(r0);
            C18070vi.A0X(rect);
            return rect;
        }
        C18140vp r1 = this.A0P;
        Rect rect2 = new Rect((Rect) C72463Mc.A0m(r1));
        int i2 = ((Rect) r1.get()).left / 4;
        rect2.right = i2;
        rect2.left = i2;
        return rect2;
    }

    public Drawable BZi(int i) {
        C18140vp r0;
        Drawable newDrawable;
        if (i == 2) {
            r0 = this.A0A;
        } else {
            r0 = this.A0J;
        }
        Drawable drawable = (Drawable) C72463Mc.A0m(r0);
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null || (newDrawable = constantState.newDrawable()) == null) {
            return drawable;
        }
        return newDrawable;
    }

    public static C23731Hk A00(Object obj, int i) {
        C23731Hk A002 = C23731Hk.A00(new DWR(obj, i));
        C18070vi.A0b(A002);
        return A002;
    }

    public Drawable BQF() {
        Drawable newDrawable;
        C18140vp r1 = this.A02;
        Drawable.ConstantState constantState = ((Drawable) C72463Mc.A0m(r1)).getConstantState();
        if (constantState != null && (newDrawable = constantState.newDrawable()) != null) {
            return newDrawable;
        }
        Drawable drawable = (Drawable) r1.get();
        C18070vi.A0X(drawable);
        return drawable;
    }

    public Drawable BS0(Integer num, int i, boolean z) {
        C18140vp r0;
        Drawable newDrawable;
        if (num == AnonymousClass00R.A00) {
            if (i == 3) {
                if (z) {
                    C18140vp r1 = this.A0O;
                    C18070vi.A0d(r1, 0);
                    r1.get();
                }
                r0 = this.A0K;
            } else {
                if (z) {
                    C18140vp r12 = this.A0F;
                    C18070vi.A0d(r12, 0);
                    r12.get();
                }
                r0 = this.A0B;
            }
        } else if (i == 3) {
            if (z) {
                C18140vp r13 = this.A0M;
                C18070vi.A0d(r13, 0);
                r13.get();
            }
            r0 = this.A0I;
        } else {
            if (z) {
                C18140vp r14 = this.A0D;
                C18070vi.A0d(r14, 0);
                r14.get();
            }
            r0 = this.A09;
        }
        Drawable drawable = (Drawable) C72463Mc.A0m(r0);
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null || (newDrawable = constantState.newDrawable()) == null) {
            return drawable;
        }
        return newDrawable;
    }
}
