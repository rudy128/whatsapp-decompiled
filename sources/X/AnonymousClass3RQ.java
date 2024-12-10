package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.3RQ  reason: invalid class name */
public final class AnonymousClass3RQ extends PopupWindow {
    public final View A00;
    public final AnonymousClass1FU A01;
    public final C80053wT A02;
    public final C18000vb A03;
    public final Runnable A04;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00a9, code lost:
        if (r1 == false) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3RQ(android.view.View r11, X.AnonymousClass1FU r12, X.AnonymousClass11C r13, X.C18000vb r14, X.AnonymousClass206 r15, com.whatsapp.reactions.ReactionsTrayViewModel r16, java.lang.Runnable r17, boolean r18) {
        /*
            r10 = this;
            r5 = 1
            int r4 = X.C72453Mb.A0G(r14, r13, r5)
            r0 = 3
            X.C72473Md.A1M(r12, r11, r15, r0)
            r0 = 7
            r1 = r16
            X.C18070vi.A0d(r1, r0)
            r10.<init>()
            r10.A03 = r14
            r10.A01 = r12
            r10.A00 = r11
            r0 = r17
            r10.A04 = r0
            X.3wT r2 = new X.3wT
            r2.<init>(r12, r1)
            r10.A02 = r2
            android.widget.FrameLayout r3 = new android.widget.FrameLayout
            r3.<init>(r12)
            X.205 r0 = r15.A0v
            boolean r6 = r0.A02
            r8 = 8388611(0x800003, float:1.1754948E-38)
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r6 == 0) goto L_0x0037
            r0 = 8388613(0x800005, float:1.175495E-38)
        L_0x0037:
            if (r18 != 0) goto L_0x003a
            r8 = r0
        L_0x003a:
            int r0 = X.C72453Mb.A08(r12)
            r1.A03 = r0
            android.graphics.Rect r6 = X.AnonymousClass3MW.A07()
            android.view.View r0 = X.AnonymousClass3MZ.A0F(r12)
            r0.getWindowVisibleDisplayFrame(r6)
            android.view.View r0 = X.AnonymousClass3MZ.A0F(r12)
            int r9 = r0.getWidth()
            int r0 = r1.A03
            r7 = 0
            if (r0 != r4) goto L_0x00e5
            int r1 = r6.right
            int r0 = r6.left
            int r1 = r1 - r0
            int r9 = r9 - r1
        L_0x005e:
            X.1FU r0 = r10.A01
            android.content.res.Resources r0 = r0.getResources()
            r6 = 2131168779(0x7f070e0b, float:1.795187E38)
            int r1 = r0.getDimensionPixelOffset(r6)
            X.1FU r0 = r10.A01
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getDimensionPixelOffset(r6)
            int r0 = r0 + r9
            r3.setPadding(r1, r7, r0, r7)
            r3.setClipToPadding(r7)
            r6 = -2
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r6, r6, r8)
            r3.addView(r2, r0)
            r10.setContentView(r3)
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131102739(0x7f060c13, float:1.7817924E38)
            int r1 = r1.getColor(r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r10.setBackgroundDrawable(r0)
            r10.setTouchable(r5)
            android.view.accessibility.AccessibilityManager r0 = r13.A0M()
            if (r0 == 0) goto L_0x00ab
            boolean r1 = r0.isTouchExplorationEnabled()
            r0 = 1
            if (r1 != 0) goto L_0x00ac
        L_0x00ab:
            r0 = 0
        L_0x00ac:
            r10.setFocusable(r0)
            r10.setOutsideTouchable(r5)
            boolean r0 = X.AnonymousClass112.A06()
            if (r0 == 0) goto L_0x00cf
            X.C83994Hl.A00(r10)
        L_0x00bb:
            r0 = -1
            r10.setWidth(r0)
            r10.setHeight(r6)
            r10.setInputMethodMode(r4)
            r1 = 7
            X.4dr r0 = new X.4dr
            r0.<init>(r3, r10, r1)
            r10.setTouchInterceptor(r0)
            return
        L_0x00cf:
            X.0vl r0 = X.AnonymousClass4II.A00
            java.lang.Object r2 = r0.getValue()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto L_0x00bb
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r1[r7] = r0
            r2.invoke(r10, r1)
            goto L_0x00bb
        L_0x00e5:
            r9 = 0
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3RQ.<init>(android.view.View, X.1FU, X.11C, X.0vb, X.206, com.whatsapp.reactions.ReactionsTrayViewModel, java.lang.Runnable, boolean):void");
    }

    public final void A00(int i, int i2, boolean z) {
        int i3;
        AnonymousClass1FU r8 = this.A01;
        int max = (int) Math.max(0.0d, (double) (0 - r8.getResources().getDimensionPixelOffset(2131168779)));
        int dimensionPixelSize = getContentView().getResources().getDimensionPixelSize(2131168420);
        C80053wT r6 = this.A02;
        View view = this.A00;
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = r6.getLayoutParams();
        C18070vi.A0z(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        C18000vb r3 = this.A03;
        int i4 = 3;
        if (AnonymousClass3MY.A1b(r3)) {
            i4 = 5;
        }
        r6.A01(width, AnonymousClass000.A1T(layoutParams2.gravity & 7, i4), max);
        int i5 = (-(view.getHeight() + (r6.getMeasuredHeight() - (dimensionPixelSize * 2)) + i2)) + i;
        if (z) {
            Window window = r8.getWindow();
            int i6 = 0;
            if ((window.getDecorView().getSystemUiVisibility() & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                Rect A07 = AnonymousClass3MW.A07();
                window.getDecorView().getWindowVisibleDisplayFrame(A07);
                i3 = A07.top;
                Toolbar toolbar = r8.A02;
                if (toolbar != null) {
                    i6 = toolbar.getHeight();
                }
            } else {
                i3 = 0;
            }
            int A08 = C72463Mc.A08(getContentView());
            int top = (view.getTop() - i6) - i3;
            if (i + top < r6.getMeasuredHeight() + i2) {
                i5 = -(((view.getHeight() + top) + dimensionPixelSize) - A08);
            }
        }
        Pair A0E = C17890vO.A0E(Integer.valueOf(max), i5);
        Object obj = A0E.second;
        C18070vi.A0W(obj);
        showAsDropDown(view, 0, AnonymousClass000.A0M(obj));
        Rect A072 = AnonymousClass3MW.A07();
        view.getGlobalVisibleRect(A072);
        int i7 = Resources.getSystem().getDisplayMetrics().widthPixels;
        int i8 = A072.left;
        Object obj2 = A0E.first;
        C18070vi.A0W(obj2);
        int A0M = i8 + AnonymousClass000.A0M(obj2);
        int i9 = i7 - A072.right;
        Object obj3 = A0E.first;
        C18070vi.A0W(obj3);
        int A0M2 = i9 + AnonymousClass000.A0M(obj3);
        ViewGroup.LayoutParams layoutParams3 = r6.getLayoutParams();
        C18070vi.A0z(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        int i10 = 3;
        if (AnonymousClass3MY.A1b(r3)) {
            i10 = 5;
        }
        r6.A02(A0M, A0M2, AnonymousClass000.A1T(layoutParams4.gravity & 7, i10));
    }

    public void dismiss() {
        super.dismiss();
        Runnable runnable = this.A04;
        if (runnable != null) {
            runnable.run();
        }
    }
}
