package X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import com.whatsapp.BoundedLinearLayout;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.conversation.ConversationAttachmentContentView;

/* renamed from: X.3d2  reason: invalid class name and case insensitive filesystem */
public class C74863d2 extends AnonymousClass3RR {
    public View A00;
    public BoundedLinearLayout A01;
    public ConversationAttachmentContentView A02;
    public int A03;
    public C18030ve A04;
    public final WaEditText A05;
    public final Runnable A06 = new C70563Bp(this, 43);
    public final View A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C74863d2(android.app.Activity r10, android.view.View r11, X.AnonymousClass190 r12, X.AnonymousClass5YX r13, com.whatsapp.WaEditText r14, X.AnonymousClass11C r15, X.C19830z4 r16, X.C18030ve r17, X.AnonymousClass1L4 r18, X.AnonymousClass1DC r19) {
        /*
            r9 = this;
            r5 = r13
            r2 = r9
            r3 = r10
            r4 = r12
            r6 = r15
            r7 = r16
            r8 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1 = 43
            X.3Bp r0 = new X.3Bp
            r0.<init>(r9, r1)
            r9.A06 = r0
            android.view.View r5 = (android.view.View) r5
            r9.A07 = r5
            r9.A05 = r14
            r9.A00 = r11
            r0 = r17
            r9.A04 = r0
            r0 = 0
            r1 = r19
            X.C18070vi.A0d(r1, r0)
            r0 = 2131231688(0x7f0803c8, float:1.8079464E38)
            r9.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74863d2.<init>(android.app.Activity, android.view.View, X.190, X.5YX, com.whatsapp.WaEditText, X.11C, X.0z4, X.0ve, X.1L4, X.1DC):void");
    }

    public static Rect A02(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect A072 = AnonymousClass3MW.A07();
        int i = iArr[0];
        A072.left = i;
        A072.top = iArr[1];
        A072.right = i + view.getWidth();
        A072.bottom = AnonymousClass3MW.A02(view, iArr[1]);
        return A072;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r1 == r4.A00) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(com.whatsapp.community.ConversationCommunityViewModel r12, X.C115095tO r13, X.AnonymousClass1BI r14, boolean r15) {
        /*
            r11 = this;
            r10 = 0
            r11.A02 = r10
            r11.A07()
            X.5YX r3 = r11.A04
            r3.setKeyboardPopup(r11)
            r0 = 1
            com.whatsapp.KeyboardPopupLayout r3 = (com.whatsapp.KeyboardPopupLayout) r3
            r3.A0A = r0
            android.view.View r0 = r11.getContentView()
            r6 = r12
            r7 = r13
            r8 = r14
            if (r0 == 0) goto L_0x00aa
            com.whatsapp.conversation.ConversationAttachmentContentView r4 = r11.A02
            android.app.Activity r2 = r11.A03
            int r1 = X.C72453Mb.A08(r2)
            X.1BI r0 = r4.A0H
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x00aa
            X.5tO r0 = r4.A0D
            if (r13 != r0) goto L_0x00aa
            com.whatsapp.community.ConversationCommunityViewModel r0 = r4.A0C
            if (r12 != r0) goto L_0x00aa
            boolean r0 = r4.A0T
            if (r10 != r0) goto L_0x00aa
            int r0 = r4.A00
            if (r1 != r0) goto L_0x00aa
        L_0x0039:
            r5 = -1
            int r0 = r11.A0B(r5)
            r11.A01 = r0
            android.view.View r4 = r11.A00
            r0 = 2131232028(0x7f08051c, float:1.8080154E38)
            r1 = 2131101210(0x7f06061a, float:1.7814823E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3MX.A06(r2, r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A05(r2, r0, r1)
            X.AnonymousClass4W7.A00(r0, r4)
            int r0 = r11.A01
            r11.setHeight(r0)
            r11.setWidth(r5)
            android.view.View r5 = r11.A07
            r1 = 1000000(0xf4240, float:1.401298E-39)
            r0 = 8388659(0x800033, float:1.1755015E-38)
            r11.showAtLocation(r5, r0, r10, r1)
            boolean r0 = r11.A0A()
            if (r0 == 0) goto L_0x0085
            java.lang.String r1 = "lenovo"
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0085
            r5.getClass()
            r0 = 42
            X.3Bp r4 = new X.3Bp
            r4.<init>(r5, r0)
            r0 = 60
            r5.postDelayed(r4, r0)
        L_0x0085:
            r3.A0A = r10
            X.0ve r4 = r11.A04
            X.C18070vi.A0d(r4, r10)
            r3 = 1
            r1 = 8306(0x2072, float:1.1639E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x0112
            int r0 = X.C72453Mb.A08(r2)
            if (r0 != r3) goto L_0x0112
            com.whatsapp.WaEditText r2 = r11.A05
            r1 = 32
            X.7RK r0 = new X.7RK
            r0.<init>((int) r1, (java.lang.Object) r11, (boolean) r15)
            r2.post(r0)
            return
        L_0x00aa:
            android.app.Activity r2 = r11.A03
            android.widget.RelativeLayout r4 = new android.widget.RelativeLayout
            r4.<init>(r2)
            android.view.LayoutInflater r5 = r2.getLayoutInflater()
            r0 = 2131624219(0x7f0e011b, float:1.8875612E38)
            r1 = 1
            r5.inflate(r0, r4, r1)
            r11.setContentView(r4)
            X.AnonymousClass3RR.A00(r11)
            X.11C r0 = r11.A05
            android.view.accessibility.AccessibilityManager r0 = r0.A0M()
            if (r0 == 0) goto L_0x0110
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto L_0x0110
        L_0x00d0:
            r11.setFocusable(r1)
            r1 = 4
            X.4dr r0 = new X.4dr
            r0.<init>(r4, r11, r1)
            r11.setTouchInterceptor(r0)
            r0 = 2131429510(0x7f0b0886, float:1.8480695E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r4, r0)
            com.whatsapp.BoundedLinearLayout r1 = (com.whatsapp.BoundedLinearLayout) r1
            r11.A01 = r1
            r0 = 2131429564(0x7f0b08bc, float:1.8480804E38)
            android.view.View r5 = X.AnonymousClass1HF.A06(r1, r0)
            com.whatsapp.conversation.ConversationAttachmentContentView r5 = (com.whatsapp.conversation.ConversationAttachmentContentView) r5
            r11.A02 = r5
            int r9 = X.C72453Mb.A08(r2)
            r5.A0H(r6, r7, r8, r9, r10)
            r4.setVisibility(r10)
            com.whatsapp.BoundedLinearLayout r0 = r11.A01
            r0.setVisibility(r10)
            r1 = 2130968694(0x7f040076, float:1.7546049E38)
            r0 = 2131099771(0x7f06007b, float:1.7811905E38)
            int r0 = X.AnonymousClass3Ma.A00(r2, r1, r0)
            r4.setBackgroundColor(r0)
            goto L_0x0039
        L_0x0110:
            r1 = 0
            goto L_0x00d0
        L_0x0112:
            com.whatsapp.WaEditText r0 = r11.A05
            r11.A09(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74863d2.A0F(com.whatsapp.community.ConversationCommunityViewModel, X.5tO, X.1BI, boolean):void");
    }

    public static void A03(C74863d2 r4, boolean z) {
        ((KeyboardPopupLayout) r4.A04).A09 = true;
        WaEditText waEditText = r4.A05;
        Runnable runnable = r4.A06;
        waEditText.removeCallbacks(runnable);
        r4.A07.A01(waEditText);
        if (z) {
            runnable.run();
        } else {
            waEditText.postDelayed(runnable, 500);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (X.C72453Mb.A08(r3) == r2) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E() {
        /*
            r5 = this;
            X.0ve r4 = r5.A04
            android.app.Activity r3 = r5.A03
            boolean r2 = X.C18070vi.A16(r4, r3)
            r1 = 8306(0x2072, float:1.1639E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x005c
            int r1 = X.C72453Mb.A08(r3)
            r0 = 1
            if (r1 != r2) goto L_0x005c
        L_0x0019:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "AttachPopupWindowV2"
            if (r0 == 0) goto L_0x005e
            r2.append(r1)
            java.lang.String r0 = "/transitionToKeyboardWithAnrFix"
            X.C17890vO.A1A(r2, r0)
            r0 = 1
            r5.A02 = r0
            r5.A07()
            r5.dismiss()
            com.whatsapp.WaEditText r3 = r5.A05
            boolean r0 = r3.isFocused()
            if (r0 != 0) goto L_0x004c
            boolean r0 = r3.requestFocus()
            if (r0 != 0) goto L_0x004c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)
            java.lang.String r0 = "/transitionToKeyboardWithAnrFix/keyboard may not appear"
            X.C17890vO.A19(r1, r0)
            r5.A08(r3)
        L_0x004c:
            X.1L4 r0 = r5.A07
            r0.A02(r3)
            java.lang.Runnable r2 = r5.A06
            r3.removeCallbacks(r2)
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x005c:
            r0 = 0
            goto L_0x0019
        L_0x005e:
            r2.append(r1)
            java.lang.String r0 = "/transitionToKeyboards"
            X.C17890vO.A1A(r2, r0)
            com.whatsapp.WaEditText r0 = r5.A05
            r5.A08(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74863d2.A0E():void");
    }

    public void A0C() {
        super.A0C();
        View view = this.A00;
        Activity activity = this.A03;
        AnonymousClass4W7.A00(AnonymousClass4aX.A03(activity, 2130971978, 2131103153, this.A03), view);
        AnonymousClass3MY.A0w(activity, view, 2131886755);
        this.A02.A0E();
    }
}
