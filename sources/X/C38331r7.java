package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1r7  reason: invalid class name and case insensitive filesystem */
public abstract class C38331r7 {
    public int A00 = Integer.MIN_VALUE;
    public final Rect A01 = new Rect();
    public final C38251qy A02;

    public static C38331r7 A00(C38251qy r2, int i) {
        int i2 = 0;
        if (i != 0) {
            i2 = 1;
            if (i != 1) {
                throw new IllegalArgumentException("invalid orientation");
            }
        }
        return new AnonymousClass28F(r2, i2);
    }

    public int A01() {
        AnonymousClass28F r1 = (AnonymousClass28F) this;
        switch (r1.A00) {
            case 0:
                return r1.A02.A03;
            case 1:
                return r1.A02.A00;
            default:
                return 0;
        }
    }

    public int A02() {
        int i;
        int i2;
        AnonymousClass28F r1 = (AnonymousClass28F) this;
        switch (r1.A00) {
            case 0:
                C38251qy r0 = r1.A02;
                i = r0.A03;
                i2 = r0.A0N();
                break;
            case 1:
                C38251qy r02 = r1.A02;
                i = r02.A00;
                i2 = r02.A0L();
                break;
            default:
                return 0;
        }
        return i - i2;
    }

    public int A03() {
        AnonymousClass28F r1 = (AnonymousClass28F) this;
        switch (r1.A00) {
            case 0:
                return r1.A02.A04;
            case 1:
                return r1.A02.A01;
            default:
                return 0;
        }
    }

    public int A04() {
        AnonymousClass28F r1 = (AnonymousClass28F) this;
        switch (r1.A00) {
            case 0:
                return r1.A02.A0M();
            case 1:
                return r1.A02.A0O();
            default:
                return 0;
        }
    }

    public int A05() {
        int i;
        int i2;
        AnonymousClass28F r1 = (AnonymousClass28F) this;
        switch (r1.A00) {
            case 0:
                C38251qy r12 = r1.A02;
                i = r12.A03 - r12.A0M();
                i2 = r12.A0N();
                break;
            case 1:
                C38251qy r13 = r1.A02;
                i = r13.A00 - r13.A0O();
                i2 = r13.A0L();
                break;
            default:
                return 0;
        }
        return i - i2;
    }

    public int A06(View view) {
        int i;
        int i2;
        switch (((AnonymousClass28F) this).A00) {
            case 0:
                i = view.getRight() + ((C38491rN) view.getLayoutParams()).A03.right;
                i2 = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
                break;
            case 1:
                i = view.getBottom() + ((C38491rN) view.getLayoutParams()).A03.bottom;
                i2 = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
                break;
            default:
                return 0;
        }
        return i + i2;
    }

    public int A07(View view) {
        int i;
        int i2;
        switch (((AnonymousClass28F) this).A00) {
            case 0:
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                Rect rect = ((C38491rN) view.getLayoutParams()).A03;
                i = view.getMeasuredWidth() + rect.left + rect.right + marginLayoutParams.leftMargin;
                i2 = marginLayoutParams.rightMargin;
                break;
            case 1:
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                Rect rect2 = ((C38491rN) view.getLayoutParams()).A03;
                i = view.getMeasuredHeight() + rect2.top + rect2.bottom + marginLayoutParams2.topMargin;
                i2 = marginLayoutParams2.bottomMargin;
                break;
            default:
                return 0;
        }
        return i + i2;
    }

    public int A08(View view) {
        int i;
        int i2;
        switch (((AnonymousClass28F) this).A00) {
            case 0:
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                Rect rect = ((C38491rN) view.getLayoutParams()).A03;
                i = view.getMeasuredHeight() + rect.top + rect.bottom + marginLayoutParams.topMargin;
                i2 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                Rect rect2 = ((C38491rN) view.getLayoutParams()).A03;
                i = view.getMeasuredWidth() + rect2.left + rect2.right + marginLayoutParams2.leftMargin;
                i2 = marginLayoutParams2.rightMargin;
                break;
            default:
                return 0;
        }
        return i + i2;
    }

    public int A09(View view) {
        int i;
        int i2;
        switch (((AnonymousClass28F) this).A00) {
            case 0:
                i = view.getLeft() - ((C38491rN) view.getLayoutParams()).A03.left;
                i2 = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
                break;
            case 1:
                i = view.getTop() - ((C38491rN) view.getLayoutParams()).A03.top;
                i2 = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
                break;
            default:
                return 0;
        }
        return i - i2;
    }

    public int A0A(View view) {
        AnonymousClass28F r2 = (AnonymousClass28F) this;
        switch (r2.A00) {
            case 0:
                C38251qy r1 = r2.A02;
                Rect rect = r2.A01;
                r1.A0T(rect, view);
                return rect.right;
            case 1:
                C38251qy r12 = r2.A02;
                Rect rect2 = r2.A01;
                r12.A0T(rect2, view);
                return rect2.bottom;
            default:
                return 0;
        }
    }

    public int A0B(View view) {
        AnonymousClass28F r2 = (AnonymousClass28F) this;
        switch (r2.A00) {
            case 0:
                C38251qy r1 = r2.A02;
                Rect rect = r2.A01;
                r1.A0T(rect, view);
                return rect.left;
            case 1:
                C38251qy r12 = r2.A02;
                Rect rect2 = r2.A01;
                r12.A0T(rect2, view);
                return rect2.top;
            default:
                return 0;
        }
    }

    public void A0C(int i) {
        AnonymousClass28F r1 = (AnonymousClass28F) this;
        switch (r1.A00) {
            case 0:
                r1.A02.A10(i);
                return;
            case 1:
                r1.A02.A11(i);
                return;
            default:
                return;
        }
    }

    public C38331r7(C38251qy r2) {
        this.A02 = r2;
    }
}
