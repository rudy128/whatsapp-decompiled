package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel;
import com.whatsapp.calling.views.VoipCallControlRingingDotsIndicator;

/* renamed from: X.3mi  reason: invalid class name and case insensitive filesystem */
public class C76173mi extends AnonymousClass3ZY {
    public C76533nV A00;
    public final Drawable A01;
    public final View A02;
    public final ImageView A03;
    public final C42141xh A04;
    public final AnonymousClass3N3 A05;
    public final C24921Me A06;
    public final C42971z2 A07;
    public final C37451pZ A08;
    public final C28931bI A09;
    public final C28931bI A0A;
    public final C28931bI A0B;
    public final Runnable A0C = new C146427Pb(this, 17);
    public final boolean A0D;
    public final AnonymousClass11C A0E;
    public final AnonymousClass1DC A0F;
    public final C28931bI A0G;
    public final C28931bI A0H;

    public static void A00(View view, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(C29111bd.A00(0.0f, 0.0f, 0.6f, 1.0f));
        alphaAnimation.setDuration(750);
        alphaAnimation.setRepeatCount(1);
        alphaAnimation.setRepeatMode(2);
        view.startAnimation(alphaAnimation);
    }

    public static void A02(C76173mi r12) {
        r12.A0G.A04(8);
        C28931bI r4 = r12.A0A;
        r4.A04(0);
        View view = r12.A0H;
        view.setContentDescription(AnonymousClass3MW.A0x(view.getResources(), r12.A04.A01.getText(), AnonymousClass3MW.A1a(), 0, 2131898217));
        ParticipantsListViewModel participantsListViewModel = r12.A00;
        if (!(participantsListViewModel == null || participantsListViewModel.A06.A07().A08 == null || !Boolean.FALSE.equals(participantsListViewModel.A0F.A06()))) {
            r4.A02().postDelayed(new C146427Pb(r12, 16), 2000);
        }
        AnonymousClass3Ob r5 = new AnonymousClass3Ob((VoipCallControlRingingDotsIndicator) r4.A02(), 0.14f, 0.66f, 800, 100, 1500);
        r5.setRepeatCount(-1);
        C74613c2.A00(r5, r12, 0);
        r4.A02().startAnimation(r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.C86594Sg r23) {
        /*
            r22 = this;
            r2 = r23
            boolean r1 = r2 instanceof X.C76533nV
            java.lang.String r0 = "Unknown list item type"
            X.C17960vV.A0F(r1, r0)
            if (r1 == 0) goto L_0x00c7
            r6 = r22
            X.1bI r3 = r6.A0A
            android.view.View r0 = r3.A00
            if (r0 == 0) goto L_0x001c
            android.view.View r1 = r3.A02()
            java.lang.Runnable r0 = r6.A0C
            r1.removeCallbacks(r0)
        L_0x001c:
            X.3nV r2 = (X.C76533nV) r2
            r6.A00 = r2
            X.1BI r0 = r2.A03
            boolean r0 = r0 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0040
            android.view.View r0 = r6.A0H
            android.view.ViewGroup$MarginLayoutParams r7 = X.AnonymousClass3MW.A0B(r0)
            int r5 = r7.leftMargin
            int r4 = r7.topMargin
            int r2 = r7.rightMargin
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131168781(0x7f070e0d, float:1.7951874E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r7.setMargins(r5, r4, r2, r0)
        L_0x0040:
            android.view.View r5 = r6.A0H
            r0 = 0
            X.AnonymousClass1HF.A0f(r5, r0)
            r7 = 0
            r5.setClickable(r7)
            X.3nV r2 = r6.A00
            int r1 = r2.A00
            r0 = 11
            r4 = 8
            if (r1 != r0) goto L_0x0060
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x0060
            X.1bI r0 = r6.A0G
            int r0 = r0.A01()
            if (r0 == 0) goto L_0x0065
        L_0x0060:
            X.1bI r0 = r6.A0G
            r0.A04(r4)
        L_0x0065:
            X.1bI r10 = r6.A09
            r10.A04(r4)
            r3.A04(r4)
            r6.A0C()
            X.3nV r0 = r6.A00
            X.1BI r0 = r0.A03
            r5.setTag(r0)
            X.3nV r0 = r6.A00
            if (r0 == 0) goto L_0x0087
            X.1pZ r8 = r6.A08
            X.1E7 r3 = r0.A02
            android.widget.ImageView r2 = r6.A03
            r1 = 1
            X.1z2 r0 = r6.A07
            r8.A05(r2, r0, r3, r1)
        L_0x0087:
            X.3nV r0 = r6.A00
            X.1BI r0 = r0.A03
            boolean r1 = r0 instanceof com.whatsapp.jid.GroupJid
            X.1bI r0 = r6.A0H
            if (r1 == 0) goto L_0x01e1
            r0.A04(r7)
        L_0x0094:
            X.3nV r12 = r6.A00
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x00cf
            X.1xh r0 = r6.A04
            r0.A02()
            android.widget.ImageView r1 = r6.A03
            r0 = 0
            r1.setOnClickListener(r0)
            r0 = 2
            r1.setImportantForAccessibility(r0)
        L_0x00a9:
            X.3nV r0 = r6.A00
            boolean r0 = r0.A06
            r2 = 0
            if (r0 == 0) goto L_0x00cb
            r0 = 7
            X.C90274do.A00(r5, r6, r0)
        L_0x00b4:
            X.3nV r0 = r6.A00
            if (r0 == 0) goto L_0x00c8
            int r1 = r0.A01
            r0 = 2
            if (r1 != r0) goto L_0x00c8
            X.1bI r0 = r6.A0B
            X.4dQ r2 = new X.4dQ
            r2.<init>(r6, r4)
        L_0x00c4:
            r0.A05(r2)
        L_0x00c7:
            return
        L_0x00c8:
            X.1bI r0 = r6.A0B
            goto L_0x00c4
        L_0x00cb:
            r5.setOnLongClickListener(r2)
            goto L_0x00b4
        L_0x00cf:
            int r2 = r12.A01
            r9 = 1
            boolean r1 = X.AnonymousClass000.A1O(r2)
            X.1BI r11 = r12.A03
            boolean r0 = r11 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0184
            int r0 = r12.A00
            if (r0 != r9) goto L_0x0184
        L_0x00e0:
            X.1bI r3 = r6.A0B
            r0 = 8
        L_0x00e4:
            r3.A04(r0)
            boolean r2 = r12.A05
            X.1E7 r13 = r12.A02
            boolean r0 = r13.A0B()
            if (r0 != 0) goto L_0x017e
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x017e
            X.1Me r1 = r6.A06
            boolean r0 = X.C24921Me.A06(r13)
            if (r0 == 0) goto L_0x017e
            X.1xh r8 = r6.A04
            java.lang.String r1 = X.AnonymousClass3MX.A17(r1, r13)
            com.whatsapp.TextEmojiLabel r0 = r8.A01
            r0.setText(r1)
        L_0x0108:
            int r1 = r12.A00
            if (r1 != r9) goto L_0x01a0
            r15 = 1065353216(0x3f800000, float:1.0)
            boolean r1 = r6.A0D
            if (r1 != 0) goto L_0x011c
            android.view.View r0 = r6.A02
            r0.setAlpha(r15)
            android.widget.ImageView r0 = r6.A03
            r0.setAlpha(r15)
        L_0x011c:
            if (r2 != 0) goto L_0x0163
            if (r1 != 0) goto L_0x0163
            android.view.View r11 = X.AnonymousClass3MY.A0I(r10, r7)
            android.view.animation.AnimationSet r10 = new android.view.animation.AnimationSet
            r10.<init>(r7)
            r0 = 0
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r0, r15)
            r0 = 500(0x1f4, double:2.47E-321)
            r2.setDuration(r0)
            r14 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r13 = new android.view.animation.ScaleAnimation
            r19 = r14
            r20 = r9
            r21 = r14
            r16 = r14
            r17 = r15
            r18 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r13.setDuration(r0)
            r12 = 1045220557(0x3e4ccccd, float:0.2)
            r1 = 1070805811(0x3fd33333, float:1.65)
            r0 = 1057803469(0x3f0ccccd, float:0.55)
            android.view.animation.Interpolator r0 = X.C29111bd.A00(r12, r1, r0, r15)
            r13.setInterpolator(r0)
            r10.addAnimation(r13)
            r10.addAnimation(r2)
            r11.startAnimation(r10)
        L_0x0163:
            android.content.res.Resources r10 = r5.getResources()
            r2 = 2131898183(0x7f122f47, float:1.9431277E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            com.whatsapp.TextEmojiLabel r0 = r8.A01
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = X.AnonymousClass3MW.A0x(r10, r0, r1, r7, r2)
            r5.setContentDescription(r0)
            r3.A04(r4)
            goto L_0x00a9
        L_0x017e:
            X.1xh r8 = r6.A04
            r8.A05(r13)
            goto L_0x0108
        L_0x0184:
            if (r1 == 0) goto L_0x00e0
            r0 = 2
            if (r2 != r0) goto L_0x0199
            X.3N3 r1 = r6.A05
        L_0x018b:
            X.1bI r3 = r6.A0B
            android.view.View r0 = r3.A02()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageDrawable(r1)
            r0 = 0
            goto L_0x00e4
        L_0x0199:
            if (r2 != r9) goto L_0x019e
            android.graphics.drawable.Drawable r1 = r6.A01
            goto L_0x018b
        L_0x019e:
            r1 = 0
            goto L_0x018b
        L_0x01a0:
            r0 = 11
            if (r1 == r0) goto L_0x01b1
            if (r2 == 0) goto L_0x01b1
            boolean r0 = X.C22971Dz.A0d(r11)
            if (r0 == 0) goto L_0x00a9
            A02(r6)
            goto L_0x00a9
        L_0x01b1:
            r1 = 1050253722(0x3e99999a, float:0.3)
            boolean r0 = r6.A0D
            if (r0 != 0) goto L_0x01c2
            android.view.View r0 = r6.A02
            r0.setAlpha(r1)
            android.widget.ImageView r0 = r6.A03
            r0.setAlpha(r1)
        L_0x01c2:
            if (r2 == 0) goto L_0x01c9
            A01(r6)
            goto L_0x00a9
        L_0x01c9:
            android.content.res.Resources r3 = r5.getResources()
            r2 = 2131898196(0x7f122f54, float:1.9431303E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            com.whatsapp.TextEmojiLabel r0 = r8.A01
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = X.AnonymousClass3MW.A0x(r3, r0, r1, r7, r2)
            r5.setContentDescription(r0)
            goto L_0x00a9
        L_0x01e1:
            r0.A04(r4)
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76173mi.A0B(X.4Sg):void");
    }

    public void A0C() {
        this.A02.clearAnimation();
        this.A03.clearAnimation();
        View view = this.A0A.A00;
        if (view != null) {
            view.clearAnimation();
        }
    }

    public C76173mi(View view, C72043Kk r6, ParticipantsListViewModel participantsListViewModel, C24921Me r8, C42971z2 r9, C37451pZ r10, AnonymousClass11C r11, AnonymousClass1DC r12, boolean z) {
        super(view, participantsListViewModel);
        this.A02 = AnonymousClass1HF.A06(view, 2131432903);
        this.A0H = C28931bI.A00(view, 2131435892);
        this.A06 = r8;
        this.A0E = r11;
        this.A07 = r9;
        this.A08 = r10;
        this.A0F = r12;
        this.A04 = C42141xh.A01(view, r6, 2131432903);
        this.A03 = AnonymousClass3MW.A0G(view, 2131427946);
        this.A09 = C28931bI.A00(view, 2131429359);
        if (z) {
            C28931bI A002 = C28931bI.A00(view, 2131434727);
            this.A0G = A002;
            C98254qp.A00(A002, this, 5);
        } else {
            this.A0G = C28931bI.A00(view, 2131434726);
        }
        C28931bI A003 = C28931bI.A00(view, 2131437022);
        this.A0B = A003;
        C98254qp.A00(A003, this, 6);
        this.A0A = C28931bI.A00(view, 2131434729);
        this.A0D = z;
        float f = AnonymousClass3Ma.A09(view).density;
        this.A05 = new AnonymousClass3N3(18.0f * f, 16.0f * f, f * 28.0f);
        Context context = this.A0H.getContext();
        this.A01 = AnonymousClass4aX.A05(context, AnonymousClass3MX.A06(context, 2131233239), 2131103289);
    }

    public static void A01(C76173mi r6) {
        View A022;
        if (!r6.A0D) {
            r6.A02.setAlpha(0.3f);
            r6.A03.setAlpha(0.3f);
        }
        r6.A0A.A04(8);
        C28931bI r3 = r6.A0G;
        if (r3.A01() != 0) {
            AnonymousClass3MY.A0I(r3, 0).setAlpha(0.0f);
            r3.A02().animate().setDuration(500).alpha(1.0f).start();
        }
        if (AnonymousClass1Y5.A0D(r6.A0E.A0M())) {
            A022 = r6.A0H;
        } else {
            A022 = r3.A02();
        }
        AnonymousClass48l.A00(A022, r6, 21);
        View view = r6.A0H;
        AnonymousClass4aR.A07(view, AnonymousClass3MW.A0x(view.getResources(), r6.A04.A01.getText(), AnonymousClass3MW.A1a(), 0, 2131898197), (CharSequence) null);
    }
}
