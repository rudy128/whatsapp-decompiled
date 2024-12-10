package X;

import android.view.ViewTreeObserver;

/* renamed from: X.4eR  reason: invalid class name and case insensitive filesystem */
public class C90664eR implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final Object A01;

    public C90664eR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(ViewTreeObserver viewTreeObserver, Object obj, int i) {
        viewTreeObserver.addOnPreDrawListener(new C90664eR(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        r0 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011b, code lost:
        if (r1 != 0) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0197, code lost:
        X.C18070vi.A11("scrollView");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x019d, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        r0 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        r1.setElevation(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreDraw() {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0021;
                case 1: goto L_0x0143;
                case 2: goto L_0x017d;
                case 3: goto L_0x018c;
                case 4: goto L_0x003a;
                case 5: goto L_0x0066;
                case 6: goto L_0x00fc;
                case 7: goto L_0x0123;
                case 8: goto L_0x0133;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r8.A01
            com.whatsapp.twofactor.SettingsTwoFactorAuthActivity r2 = (com.whatsapp.twofactor.SettingsTwoFactorAuthActivity) r2
            android.widget.ScrollView r0 = r2.A05
            X.AnonymousClass3MX.A1G(r0, r8)
            android.widget.ScrollView r1 = r2.A05
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            android.view.View r1 = r2.A03
            if (r0 == 0) goto L_0x0038
            int r0 = r2.A00
        L_0x001b:
            float r0 = (float) r0
        L_0x001c:
            r1.setElevation(r0)
        L_0x001f:
            r0 = 0
            return r0
        L_0x0021:
            java.lang.Object r2 = r8.A01
            com.whatsapp.account.delete.DeleteAccountFeedback r2 = (com.whatsapp.account.delete.DeleteAccountFeedback) r2
            android.widget.ScrollView r0 = r2.A04
            X.AnonymousClass3MX.A1G(r0, r8)
            android.widget.ScrollView r1 = r2.A04
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            android.view.View r1 = r2.A02
            if (r0 == 0) goto L_0x0038
            int r0 = r2.A00
            goto L_0x001b
        L_0x0038:
            r0 = 0
            goto L_0x001c
        L_0x003a:
            java.lang.Object r4 = r8.A01
            X.3Zj r4 = (X.C74323Zj) r4
            X.AnonymousClass3MX.A1G(r4, r8)
            r0 = 1
            r4.A0E = r0
            int r3 = r4.getHeight()
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r0 = 0
            r1.height = r0
            r4.requestLayout()
            r0 = 2
            X.3OU r2 = new X.3OU
            r2.<init>(r8, r3, r0)
            r0 = 10
            X.C74613c2.A00(r2, r8, r0)
            r0 = 250(0xfa, double:1.235E-321)
            r2.setDuration(r0)
            r4.startAnimation(r2)
            goto L_0x001f
        L_0x0066:
            java.lang.Object r4 = r8.A01
            X.4Wt r4 = (X.C87734Wt) r4
            X.3Zj r3 = r4.A04
            android.view.View r0 = r3.A05
            X.AnonymousClass3MX.A1G(r0, r8)
            android.view.View r0 = r3.A05
            int r0 = r0.getMeasuredHeight()
            r4.A00 = r0
            android.widget.TextView r0 = r3.A07
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            int r2 = X.C87734Wt.A00(r0)
            r4.A01 = r2
            android.view.ViewGroup r0 = r3.A06
            r7 = 0
            android.view.View r0 = r0.getChildAt(r7)
            int r0 = X.C87734Wt.A00(r0)
            int r2 = r2 + r0
            r4.A01 = r2
            android.view.View r5 = r3.A05
            android.view.ViewGroup r1 = r3.A06
            r6 = 0
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00b1
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass3MW.A0B(r1)
            int r0 = r0.topMargin
            int r7 = r7 + r0
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass3MW.A0B(r1)
            int r0 = r0.bottomMargin
            int r6 = r7 + r0
        L_0x00b1:
            android.view.ViewParent r0 = r1.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L_0x00f4
            android.view.ViewParent r1 = r1.getParent()
        L_0x00bd:
            android.view.View r1 = (android.view.View) r1
            if (r1 == r5) goto L_0x00ea
            int r0 = r1.getPaddingTop()
            int r6 = r6 + r0
            int r0 = r1.getPaddingTop()
            int r6 = r6 + r0
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00e1
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass3MW.A0B(r1)
            int r0 = r0.topMargin
            int r6 = r6 + r0
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass3MW.A0B(r1)
            int r0 = r0.bottomMargin
            int r6 = r6 + r0
        L_0x00e1:
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x00ea
            goto L_0x00bd
        L_0x00ea:
            int r0 = r5.getPaddingTop()
            int r6 = r6 + r0
            int r0 = r5.getPaddingTop()
            int r6 = r6 + r0
        L_0x00f4:
            int r2 = r2 + r6
            r4.A01 = r2
            r3.requestLayout()
            goto L_0x001f
        L_0x00fc:
            java.lang.Object r1 = r8.A01
            com.whatsapp.labelitem.view.bottomsheet.AddToListFragment r1 = (com.whatsapp.labelitem.view.bottomsheet.AddToListFragment) r1
            androidx.core.widget.NestedScrollView r0 = r1.A00
            if (r0 == 0) goto L_0x010d
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x010d
            r0.removeOnPreDrawListener(r8)
        L_0x010d:
            X.1bI r2 = r1.A07
            if (r2 == 0) goto L_0x001f
            androidx.core.widget.NestedScrollView r0 = r1.A00
            if (r0 == 0) goto L_0x011d
            int r1 = r0.getScrollY()
            r0 = 8
            if (r1 == 0) goto L_0x011e
        L_0x011d:
            r0 = 0
        L_0x011e:
            r2.A04(r0)
            goto L_0x001f
        L_0x0123:
            java.lang.Object r1 = r8.A01
            com.whatsapp.registration.ChangeNumberOverview r1 = (com.whatsapp.registration.ChangeNumberOverview) r1
            android.widget.ScrollView r0 = r1.A00
            if (r0 == 0) goto L_0x0197
            X.AnonymousClass3MX.A1G(r0, r8)
            com.whatsapp.registration.ChangeNumberOverview.A03(r1)
            goto L_0x001f
        L_0x0133:
            java.lang.Object r1 = r8.A01
            com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts r1 = (com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts) r1
            android.widget.ScrollView r0 = r1.A03
            if (r0 == 0) goto L_0x0197
            X.AnonymousClass3MX.A1G(r0, r8)
            com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts.A03(r1)
            goto L_0x001f
        L_0x0143:
            java.lang.Object r6 = r8.A01
            X.3uC r6 = (X.C79033uC) r6
            X.00H r5 = r6.A05
            java.lang.Object r0 = r5.get()
            X.16w r0 = (X.C216516w) r0
            java.util.HashSet r0 = r0.A00
            X.205 r4 = r6.A04
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x0179
            X.9lW r0 = r6.A03
            java.lang.String r3 = "carousel_message_render_tag"
            java.util.Map r2 = r0.A02
            java.lang.Object r1 = r2.get(r3)
            X.19a r1 = (X.C222119a) r1
            if (r1 == 0) goto L_0x016e
            r0 = 2
            r1.A0C(r0)
            r2.remove(r3)
        L_0x016e:
            java.lang.Object r0 = r5.get()
            X.16w r0 = (X.C216516w) r0
            java.util.HashSet r0 = r0.A00
            r0.add(r4)
        L_0x0179:
            X.AnonymousClass3MX.A1G(r6, r8)
            goto L_0x0195
        L_0x017d:
            java.lang.Object r1 = r8.A01
            X.3cp r1 = (X.C74803cp) r1
            android.widget.ListView r0 = r1.getListView()
            X.AnonymousClass3MX.A1G(r0, r8)
            r1.A2Z()
            goto L_0x0195
        L_0x018c:
            java.lang.Object r0 = r8.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.1gV r0 = r0.A4J
            r0.A0C()
        L_0x0195:
            r0 = 1
            return r0
        L_0x0197:
            java.lang.String r0 = "scrollView"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90664eR.onPreDraw():boolean");
    }
}
