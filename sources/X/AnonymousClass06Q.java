package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: X.06Q  reason: invalid class name */
public class AnonymousClass06Q extends AnonymousClass0SF implements C16940tT {
    public int A00;
    public ListAdapter A01;
    public CharSequence A02;
    public final Rect A03 = new Rect();
    public final /* synthetic */ AppCompatSpinner A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass06Q(Context context, AttributeSet attributeSet, AppCompatSpinner appCompatSpinner, int i) {
        super(context, attributeSet, i, 0);
        this.A04 = appCompatSpinner;
        this.A06 = appCompatSpinner;
        this.A0F = true;
        this.A0A.setFocusable(true);
        this.A07 = new C05340Ru(this, appCompatSpinner, 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r9 = this;
            android.widget.PopupWindow r3 = r9.A0A
            android.graphics.drawable.Drawable r0 = r3.getBackground()
            androidx.appcompat.widget.AppCompatSpinner r4 = r9.A04
            android.graphics.Rect r6 = r4.A05
            if (r0 == 0) goto L_0x007c
            r0.getPadding(r6)
            boolean r0 = X.C002801g.A01
            int r1 = r4.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L_0x0078
            int r2 = r6.right
        L_0x001a:
            int r8 = r4.getPaddingLeft()
            int r7 = r4.getPaddingRight()
            int r5 = r4.getWidth()
            int r1 = r4.A00
            r0 = -2
            if (r1 != r0) goto L_0x006d
            android.widget.ListAdapter r1 = r9.A01
            android.widget.SpinnerAdapter r1 = (android.widget.SpinnerAdapter) r1
            android.graphics.drawable.Drawable r0 = r3.getBackground()
            int r3 = r4.A02(r0, r1)
            android.content.res.Resources r0 = X.AnonymousClass000.A0Y(r4)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.widthPixels
            int r0 = r6.left
            int r1 = r1 - r0
            int r0 = r6.right
            int r1 = r1 - r0
            if (r3 <= r1) goto L_0x004a
            r3 = r1
        L_0x004a:
            int r0 = r5 - r8
            int r0 = r0 - r7
            int r0 = java.lang.Math.max(r3, r0)
        L_0x0051:
            r9.A03(r0)
        L_0x0054:
            boolean r0 = X.C002801g.A01
            int r1 = r4.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L_0x0068
            int r5 = r5 - r7
            int r0 = r9.A03
            int r5 = r5 - r0
            int r0 = r9.A00
            int r5 = r5 - r0
            int r2 = r2 + r5
        L_0x0065:
            r9.A01 = r2
            return
        L_0x0068:
            int r0 = r9.A00
            int r8 = r8 + r0
            int r2 = r2 + r8
            goto L_0x0065
        L_0x006d:
            r0 = -1
            if (r1 != r0) goto L_0x0074
            int r0 = r5 - r8
            int r0 = r0 - r7
            goto L_0x0051
        L_0x0074:
            r9.A03(r1)
            goto L_0x0054
        L_0x0078:
            int r0 = r6.left
            int r2 = -r0
            goto L_0x001a
        L_0x007c:
            r0 = 0
            r6.right = r0
            r6.left = r0
            r2 = 0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass06Q.A04():void");
    }

    public void CMY(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        PopupWindow popupWindow = this.A0A;
        boolean isShowing = popupWindow.isShowing();
        A04();
        popupWindow.setInputMethodMode(2);
        super.CMX();
        C009205e r1 = this.A0B;
        r1.setChoiceMode(1);
        C03740Kl.A01(r1, i);
        C03740Kl.A00(r1, i2);
        AppCompatSpinner appCompatSpinner = this.A04;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        C009205e r12 = this.A0B;
        if (popupWindow.isShowing() && r12 != null) {
            r12.A07 = false;
            r12.setSelection(selectedItemPosition);
            if (r12.getChoiceMode() != 0) {
                r12.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) != null) {
            C05250Rk r13 = new C05250Rk(this, 3);
            viewTreeObserver.addOnGlobalLayoutListener(r13);
            popupWindow.setOnDismissListener(new C05370Rx(r13, this));
        }
    }

    public CharSequence BSV() {
        return this.A02;
    }

    public void CHm(ListAdapter listAdapter) {
        super.CHm(listAdapter);
        this.A01 = listAdapter;
    }

    public void CJ7(int i) {
        this.A00 = i;
    }

    public void CKF(CharSequence charSequence) {
        this.A02 = charSequence;
    }
}
