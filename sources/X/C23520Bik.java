package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* renamed from: X.Bik  reason: case insensitive filesystem */
public class C23520Bik extends C26155CtN {
    public static final int[] A02;
    public boolean A00;
    public final AccessibilityManager A01;

    static {
        int[] A1W = C108945cZ.A1W();
        A1W[0] = 2130971312;
        A1W[1] = 2130971314;
        A02 = A1W;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r1 == -1) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        r8 = (android.view.ViewGroup) r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C23520Bik A00(android.content.Context r7, android.view.View r8, java.lang.CharSequence r9, int r10) {
        /*
            r1 = 0
        L_0x0001:
            boolean r0 = r8 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r0 != 0) goto L_0x006a
            boolean r0 = r8 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L_0x0067
            int r1 = r8.getId()
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            if (r1 == r0) goto L_0x006a
            r1 = r8
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L_0x0015:
            android.view.ViewParent r8 = r8.getParent()
            boolean r0 = r8 instanceof android.view.View
            if (r0 == 0) goto L_0x0021
            android.view.View r8 = (android.view.View) r8
            if (r8 != 0) goto L_0x0001
        L_0x0021:
            r8 = r1
        L_0x0022:
            if (r8 == 0) goto L_0x006d
            if (r7 != 0) goto L_0x002a
            android.content.Context r7 = r8.getContext()
        L_0x002a:
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r7)
            int[] r0 = A02
            android.content.res.TypedArray r5 = r7.obtainStyledAttributes(r0)
            r4 = 0
            r3 = -1
            int r2 = r5.getResourceId(r4, r3)
            r0 = 1
            int r1 = r5.getResourceId(r0, r3)
            r5.recycle()
            if (r2 == r3) goto L_0x0049
            r0 = 2131626092(0x7f0e086c, float:1.887941E38)
            if (r1 != r3) goto L_0x004c
        L_0x0049:
            r0 = 2131625073(0x7f0e0471, float:1.8877344E38)
        L_0x004c:
            android.view.View r0 = r6.inflate(r0, r8, r4)
            com.google.android.material.snackbar.SnackbarContentLayout r0 = (com.google.android.material.snackbar.SnackbarContentLayout) r0
            X.Bik r1 = new X.Bik
            r1.<init>(r7, r0, r8, r0)
            X.BIE r0 = r1.A0J
            android.view.View r0 = r0.getChildAt(r4)
            com.google.android.material.snackbar.SnackbarContentLayout r0 = (com.google.android.material.snackbar.SnackbarContentLayout) r0
            android.widget.TextView r0 = r0.A02
            r0.setText(r9)
            r1.A00 = r10
            return r1
        L_0x0067:
            if (r8 == 0) goto L_0x0021
            goto L_0x0015
        L_0x006a:
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            goto L_0x0022
        L_0x006d:
            java.lang.String r0 = "No suitable parent found from the given view. Please provide a valid view."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23520Bik.A00(android.content.Context, android.view.View, java.lang.CharSequence, int):X.Bik");
    }

    public static C23520Bik A02(View view, CharSequence charSequence, int i) {
        return A00((Context) null, view, charSequence, i);
    }

    public int A05() {
        int i = this.A00;
        if (i == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int i2 = 0;
            if (this.A00) {
                i2 = 4;
            }
            return this.A01.getRecommendedTimeoutMillis(i, i2 | 1 | 2);
        } else if (!this.A00 || !this.A01.isTouchExplorationEnabled()) {
            return i;
        } else {
            return -2;
        }
    }

    public void A0E(int i) {
        ((SnackbarContentLayout) AnonymousClass3MY.A0F(this.A0J)).A01.setTextColor(i);
    }

    public void A0F(View.OnClickListener onClickListener, int i) {
        A0G(this.A0G.getText(i), onClickListener);
    }

    public void A0G(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button button = ((SnackbarContentLayout) this.A0J.getChildAt(0)).A01;
        if (!TextUtils.isEmpty(charSequence)) {
            this.A00 = true;
            button.setVisibility(0);
            button.setText(charSequence);
            button.setOnClickListener(new AnonymousClass78Q((Object) this, (Object) onClickListener, 4));
            return;
        }
        button.setVisibility(8);
        button.setOnClickListener((View.OnClickListener) null);
        this.A00 = false;
    }

    public C23520Bik(Context context, View view, ViewGroup viewGroup, E2T e2t) {
        super(context, view, viewGroup, e2t);
        this.A01 = BEA.A0O(viewGroup);
    }

    public static C23520Bik A01(View view, int i, int i2) {
        return A00((Context) null, view, view.getResources().getText(i), i2);
    }
}
