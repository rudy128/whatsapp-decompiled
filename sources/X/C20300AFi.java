package X;

import android.view.ViewTreeObserver;

/* renamed from: X.AFi  reason: case insensitive filesystem */
public class C20300AFi implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final Object A01;

    public C20300AFi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006c, code lost:
        r3 = r4.A07;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreDraw() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0019;
                case 1: goto L_0x0051;
                case 2: goto L_0x0064;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r5.A01
            com.whatsapp.registration.phonenumberentry.ChangeNumber r1 = (com.whatsapp.registration.phonenumberentry.ChangeNumber) r1
            android.widget.ScrollView r0 = r1.A06
            if (r0 == 0) goto L_0x00a3
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnPreDrawListener(r5)
            com.whatsapp.registration.phonenumberentry.ChangeNumber.A10(r1)
        L_0x0017:
            r0 = 0
            return r0
        L_0x0019:
            java.lang.Object r0 = r5.A01
            X.8DG r0 = (X.AnonymousClass8DG) r0
            android.view.View r1 = r0.A02
            android.view.ViewTreeObserver r0 = r1.getViewTreeObserver()
            r0.removeOnPreDrawListener(r5)
            int r0 = r1.getHeight()
            float r0 = (float) r0
            r1.setTranslationY(r0)
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r0 = 0
            android.view.ViewPropertyAnimator r1 = r1.translationY(r0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            android.animation.TimeInterpolator r0 = (android.animation.TimeInterpolator) r0
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r0)
            r0 = 0
            android.view.ViewPropertyAnimator r2 = r1.setListener(r0)
            r0 = 250(0xfa, double:1.235E-321)
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            r0.start()
            goto L_0x0017
        L_0x0051:
            java.lang.Object r1 = r5.A01
            com.whatsapp.account.delete.DeleteAccountConfirmation r1 = (com.whatsapp.account.delete.DeleteAccountConfirmation) r1
            android.widget.ScrollView r0 = r1.A01
            if (r0 == 0) goto L_0x00a3
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnPreDrawListener(r5)
            com.whatsapp.account.delete.DeleteAccountConfirmation.A03(r1)
            goto L_0x0017
        L_0x0064:
            java.lang.Object r0 = r5.A01
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity r0 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity) r0
            X.99t r4 = r0.A02
            if (r4 == 0) goto L_0x00a1
            android.view.View r3 = r4.A07
            r0 = 2131434969(0x7f0b1dd9, float:1.8491767E38)
            android.view.View r0 = r3.findViewById(r0)
            if (r0 == 0) goto L_0x00a1
            int[] r2 = r4.A0B
            r0.getLocationOnScreen(r2)
            int[] r1 = r4.A0A
            r3.getLocationOnScreen(r1)
            android.widget.TextView r0 = r4.A04
            float r3 = r0.getX()
            r0 = 0
            r2 = r2[r0]
            r0 = r1[r0]
            int r2 = r2 - r0
            float r1 = (float) r2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00a1
            X.C1776299t.A0E = r2
            android.widget.TextView r0 = r4.A04
            r0.setX(r1)
            android.widget.TextView r1 = r4.A05
            int r0 = X.C1776299t.A0E
            float r0 = (float) r0
            r1.setX(r0)
        L_0x00a1:
            r0 = 1
            return r0
        L_0x00a3:
            java.lang.String r0 = "scrollView"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20300AFi.onPreDraw():boolean");
    }
}
