package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;

/* renamed from: X.3u3  reason: invalid class name */
public class AnonymousClass3u3 extends C78693tN {
    public AnimatorSet A00;
    public AnimatorSet A01;
    public View A02;
    public View A03;
    public FrameLayout A04;
    public TextView A05;
    public ConstraintLayout A06;
    public C19880zA A07;
    public WaTextView A08;
    public ConversationRowImage$RowImageView A09;
    public C28931bI A0A;
    public C28931bI A0B;
    public C28931bI A0C;
    public C28931bI A0D;
    public C28931bI A0E;
    public C28931bI A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public boolean A0I;
    public final AnonymousClass00H A0J = C99054sC.A00(this, 8);
    public final AnonymousClass3M2 A0K = new C98164qg(this);

    public void A1u() {
        AnonymousClass3uP.A0h(this, false);
        A0K(false);
    }

    public boolean A2r() {
        return true;
    }

    private void A0A() {
        FrameLayout frameLayout = this.A04;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        C28931bI r0 = this.A0D;
        if (r0 != null) {
            r0.A04(8);
        }
    }

    private void A0B() {
        boolean A002 = ((C86304Rc) this.A1t.get()).A00();
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A09;
        if (A002) {
            conversationRowImage$RowImageView.setOnTouchListener((View.OnTouchListener) this.A0J.get());
        } else {
            conversationRowImage$RowImageView.setOnClickListener(this.A0F);
        }
    }

    private void A0C() {
        C72453Mb.A1B(this.A04);
        C28931bI r1 = this.A0D;
        if (r1 != null) {
            r1.A04(0);
            A2l(this.A09, getContext().getString(2131886434));
        }
    }

    public static void A0D(Bitmap bitmap, AnonymousClass3u3 r30) {
        TransitionDrawable transitionDrawable;
        AnonymousClass3u3 r14 = r30;
        FrameLayout frameLayout = r14.A04;
        if (frameLayout != null && frameLayout.getVisibility() != 0) {
            C28931bI r0 = r14.A0D;
            C28931bI r18 = r0;
            if (r0 != null) {
                ConversationRowImage$RowImageView conversationRowImage$RowImageView = r14.A09;
                ConversationRowImage$RowImageView conversationRowImage$RowImageView2 = conversationRowImage$RowImageView;
                Resources resources = r14.getResources();
                C18070vi.A0d(conversationRowImage$RowImageView, 0);
                C18070vi.A0d(resources, 2);
                Drawable drawable = conversationRowImage$RowImageView2.getDrawable();
                if (drawable == null) {
                    transitionDrawable = null;
                } else {
                    transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, new BitmapDrawable(resources, bitmap)});
                    transitionDrawable.setCrossFadeEnabled(false);
                }
                ConstraintLayout constraintLayout = r14.A06;
                C28931bI r27 = r14.A0B;
                View A022 = r27.A02();
                C28931bI r26 = r14.A0E;
                View A023 = r26.A02();
                C18070vi.A0d(constraintLayout, 0);
                int A0G2 = C72453Mb.A0G(frameLayout, A022, 1);
                C18070vi.A0d(A023, 3);
                AnimatorSet animatorSet = new AnimatorSet();
                Interpolator accelerateInterpolator = new AccelerateInterpolator();
                Animator[] animatorArr = new Animator[3];
                Property property = View.SCALE_X;
                C18070vi.A0Z(property);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(constraintLayout, property, C72473Md.A1a(0.5f, 1.0f));
                ofFloat.setInterpolator(accelerateInterpolator);
                ofFloat.setDuration(250);
                animatorArr[0] = ofFloat;
                Property property2 = View.SCALE_Y;
                C18070vi.A0Z(property2);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(constraintLayout, property2, C72473Md.A1a(0.5f, 1.0f));
                ofFloat2.setInterpolator(accelerateInterpolator);
                ofFloat2.setDuration(250);
                animatorArr[1] = ofFloat2;
                Property property3 = View.ALPHA;
                C18070vi.A0Z(property3);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(constraintLayout, property3, C72473Md.A1a(0.0f, 1.0f));
                ofFloat3.setInterpolator(accelerateInterpolator);
                ofFloat3.setDuration(250);
                animatorSet.playTogether(C18070vi.A0O(ofFloat3, animatorArr, A0G2));
                animatorSet.addListener(new AnonymousClass3Mm(frameLayout, A023, A022, constraintLayout, 1));
                r14.A01 = animatorSet;
                View view = r14.A02;
                View A024 = r18.A02();
                AnimatorSet animatorSet2 = r14.A01;
                AnimatorSet animatorSet3 = animatorSet2;
                C17960vV.A07(animatorSet3);
                C18070vi.A0d(view, 0);
                C18070vi.A0d(A024, 1);
                C18070vi.A0d(animatorSet2, 3);
                AnimatorSet animatorSet4 = new AnimatorSet();
                Interpolator accelerateInterpolator2 = new AccelerateInterpolator();
                Animator[] animatorArr2 = new Animator[6];
                Property property4 = View.SCALE_X;
                C18070vi.A0Z(property4);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, property4, C72473Md.A1a(1.0f, 0.2f));
                ofFloat4.setInterpolator(accelerateInterpolator2);
                ofFloat4.setDuration(250);
                animatorArr2[0] = ofFloat4;
                Property property5 = View.SCALE_Y;
                C18070vi.A0Z(property5);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, property5, C72473Md.A1a(1.0f, 0.2f));
                ofFloat5.setInterpolator(accelerateInterpolator2);
                ofFloat5.setDuration(250);
                animatorArr2[1] = ofFloat5;
                Property property6 = View.SCALE_X;
                C18070vi.A0Z(property4);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(A024, property6, C72473Md.A1a(1.0f, 0.5f));
                ofFloat6.setInterpolator(accelerateInterpolator2);
                ofFloat6.setDuration(250);
                animatorArr2[2] = ofFloat6;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(A024, property5, C72473Md.A1a(1.0f, 0.5f));
                ofFloat7.setInterpolator(accelerateInterpolator2);
                ofFloat7.setDuration(250);
                animatorArr2[3] = ofFloat7;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(view, property3, C72473Md.A1a(1.0f, 0.0f));
                ofFloat8.setInterpolator(accelerateInterpolator2);
                ofFloat8.setDuration(250);
                animatorArr2[4] = ofFloat8;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(A024, property3, C72473Md.A1a(1.0f, 0.0f));
                ofFloat9.setInterpolator(accelerateInterpolator2);
                ofFloat9.setDuration(250);
                animatorSet4.playTogether(C18070vi.A0O(ofFloat9, animatorArr2, 5));
                animatorSet4.addListener(new C72533Mk(animatorSet3, transitionDrawable, frameLayout, view, A024, 0));
                r14.A00 = animatorSet4;
                r14.setImageDrawable(bitmap, transitionDrawable);
                r14.A00.start();
                r14.A1y();
                C38471rL r1 = r14.A0C;
                frameLayout.setOnClickListener(r1);
                r27.A05(r1);
                r26.A05(r1);
                r14.A0B();
                A0F(conversationRowImage$RowImageView2, r14);
            }
        }
    }

    public static void A0E(Bitmap bitmap, AnonymousClass3u3 r26) {
        TransitionDrawable transitionDrawable;
        AnonymousClass3u3 r2 = r26;
        C28931bI r0 = r2.A0D;
        C28931bI r18 = r0;
        if (r0 != null) {
            ConversationRowImage$RowImageView conversationRowImage$RowImageView = r2.A09;
            Resources resources = r2.getResources();
            C18070vi.A0d(conversationRowImage$RowImageView, 0);
            C18070vi.A0d(resources, 2);
            Drawable drawable = conversationRowImage$RowImageView.getDrawable();
            Bitmap bitmap2 = bitmap;
            if (drawable == null) {
                transitionDrawable = null;
            } else {
                transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, new BitmapDrawable(resources, bitmap2)});
                transitionDrawable.setCrossFadeEnabled(false);
            }
            ConstraintLayout constraintLayout = r2.A06;
            FrameLayout frameLayout = r2.A04;
            C17960vV.A05(frameLayout);
            View A022 = r2.A0E.A02();
            View A023 = r2.A0B.A02();
            WaTextView waTextView = r2.A08;
            C18070vi.A0d(constraintLayout, 0);
            int A0G2 = C72453Mb.A0G(frameLayout, A022, 1);
            C18070vi.A0f(A023, 3, waTextView);
            AnimatorSet animatorSet = new AnimatorSet();
            Interpolator accelerateInterpolator = new AccelerateInterpolator();
            Animator[] animatorArr = new Animator[3];
            Property property = View.SCALE_X;
            C18070vi.A0Z(property);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(constraintLayout, property, C72473Md.A1a(0.5f, 1.0f));
            ofFloat.setInterpolator(accelerateInterpolator);
            ofFloat.setDuration(250);
            animatorArr[0] = ofFloat;
            Property property2 = View.SCALE_Y;
            C18070vi.A0Z(property2);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(constraintLayout, property2, C72473Md.A1a(0.5f, 1.0f));
            ofFloat2.setInterpolator(accelerateInterpolator);
            ofFloat2.setDuration(250);
            animatorArr[1] = ofFloat2;
            Property property3 = View.ALPHA;
            C18070vi.A0Z(property3);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(constraintLayout, property3, C72473Md.A1a(0.0f, 1.0f));
            ofFloat3.setInterpolator(accelerateInterpolator);
            ofFloat3.setDuration(250);
            animatorSet.playTogether(C18070vi.A0O(ofFloat3, animatorArr, A0G2));
            animatorSet.addListener(new C72533Mk(frameLayout, A022, constraintLayout, A023, waTextView, A0G2));
            View view = r2.A02;
            View A024 = r18.A02();
            C18070vi.A0d(view, 0);
            C18070vi.A0d(A024, 1);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Interpolator accelerateInterpolator2 = new AccelerateInterpolator();
            Animator[] animatorArr2 = new Animator[6];
            Property property4 = View.SCALE_X;
            C18070vi.A0Z(property4);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, property4, C72473Md.A1a(1.0f, 0.2f));
            ofFloat4.setInterpolator(accelerateInterpolator2);
            ofFloat4.setDuration(250);
            animatorArr2[0] = ofFloat4;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(A024, property4, C72473Md.A1a(1.0f, 0.5f));
            ofFloat5.setInterpolator(accelerateInterpolator2);
            ofFloat5.setDuration(250);
            animatorArr2[1] = ofFloat5;
            Property property5 = View.SCALE_Y;
            C18070vi.A0Z(property5);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view, property5, C72473Md.A1a(1.0f, 0.2f));
            ofFloat6.setInterpolator(accelerateInterpolator2);
            ofFloat6.setDuration(250);
            animatorArr2[2] = ofFloat6;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(A024, property5, C72473Md.A1a(1.0f, 0.5f));
            ofFloat7.setInterpolator(accelerateInterpolator2);
            ofFloat7.setDuration(250);
            animatorArr2[3] = ofFloat7;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(view, property3, C72473Md.A1a(1.0f, 0.0f));
            ofFloat8.setInterpolator(accelerateInterpolator2);
            ofFloat8.setDuration(250);
            animatorArr2[4] = ofFloat8;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(A024, property3, C72473Md.A1a(1.0f, 0.0f));
            ofFloat9.setInterpolator(accelerateInterpolator2);
            ofFloat9.setDuration(250);
            animatorSet2.playTogether(C18070vi.A0O(ofFloat9, animatorArr2, 5));
            animatorSet2.addListener(new AnonymousClass3Mm(animatorSet, transitionDrawable, view, A024, 0));
            r2.setImageDrawable(bitmap2, transitionDrawable);
            animatorSet2.start();
        }
    }

    private void A0I(C438421d r17, boolean z, boolean z2) {
        View view = this.A02;
        view.setVisibility(0);
        A0A();
        C28931bI r6 = this.A0F;
        C28931bI r7 = this.A0A;
        TextView textView = this.A05;
        AnonymousClass3uL.A0P(view, textView, r6, r7, false, !z);
        if (!AnonymousClass4H3.A00(getFMessage())) {
            textView.setText(2131895332);
            textView.setCompoundDrawablesWithIntrinsicBounds(2131232382, 0, 0, 0);
            textView.setOnClickListener(this.A0E);
            A0B();
            A0F(this.A09, this);
        } else {
            C438421d r0 = r17;
            A2E(textView, (Integer) null, Collections.singletonList(r0), r0.A01);
            textView.setCompoundDrawablesWithIntrinsicBounds(2131231868, 0, 0, 0);
            C38471rL r02 = this.A0D;
            textView.setOnClickListener(r02);
            ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A09;
            conversationRowImage$RowImageView.setOnClickListener(r02);
            A2l(conversationRowImage$RowImageView, C17880vN.A0q(getContext(), textView.getText(), AnonymousClass3MW.A1a(), 0, 2131889011));
            AnonymousClass1Y5.A02(conversationRowImage$RowImageView, 2131887592);
        }
        if (z2) {
            A0C();
        } else {
            C72453Mb.A1M(this.A0D);
        }
    }

    private void A0J(boolean z) {
        View view = this.A02;
        view.setVisibility(8);
        A0A();
        C28931bI r3 = this.A0F;
        C28931bI r4 = this.A0A;
        TextView textView = this.A05;
        AnonymousClass3uL.A0P(view, textView, r3, r4, false, false);
        A0F(this.A09, this);
        textView.setOnClickListener(this.A0F);
        A0B();
        if (z) {
            A0C();
        } else {
            C72453Mb.A1M(this.A0D);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0105, code lost:
        if (X.C79103uS.A1L(r5) == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0149, code lost:
        if (A0N(r5) != false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x014b, code lost:
        if (r23 == false) goto L_0x014d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0K(boolean r23) {
        /*
            r22 = this;
            r5 = r22
            X.21d r4 = r5.getFMessage()
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r3 = r5.A09
            boolean r0 = r5.A2q()
            r3.setPortraitPreviewEnabled(r0)
            r5.setOverlayType(r4)
            X.2rc r0 = r4.A02
            r21 = r0
            r7 = 0
            r2 = 1
            if (r0 != 0) goto L_0x002d
            r3.setImageBitmap(r7)
            r3.A04(r2, r2)
            r3.setOnClickListener(r7)
            android.view.View r1 = r5.A02
            r0 = 4
            r1.setVisibility(r0)
            r5.A0A()
        L_0x002c:
            return
        L_0x002d:
            r6 = r23
            if (r23 == 0) goto L_0x0048
            android.widget.TextView r1 = r5.A05
            java.util.List r0 = java.util.Collections.singletonList(r4)
            r1.setTag(r0)
            r3.setImageBitmap(r7)
            com.whatsapp.WaTextView r1 = r5.A08
            if (r1 == 0) goto L_0x0048
            java.util.List r0 = java.util.Collections.singletonList(r4)
            r1.setTag(r0)
        L_0x0048:
            X.2rc r1 = new X.2rc
            r0 = r21
            r1.<init>(r0)
            r3.setImageData(r1)
            boolean r0 = r5.A0V
            r3.setInAlbum(r0)
            X.5c7 r1 = r5.A0l
            X.21d r0 = r5.getFMessage()
            boolean r0 = r1.Bew(r0)
            r3.setFullWidth(r0)
            boolean r0 = X.C20120A8f.A06(r4)
            r3.A0G = r0
            if (r0 == 0) goto L_0x0086
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165762(0x7f070242, float:1.794575E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.A01 = r0
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165761(0x7f070241, float:1.7945748E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.A00 = r0
        L_0x0086:
            java.lang.String r0 = X.AnonymousClass4W0.A01(r4)
            X.AnonymousClass1Xr.A04(r3, r0)
            android.widget.TextView r1 = r5.A0H
            java.lang.String r0 = X.AnonymousClass4W0.A00(r4)
            X.AnonymousClass1Xr.A04(r1, r0)
            android.widget.ImageView r1 = r5.A0D
            if (r1 == 0) goto L_0x00a1
            java.lang.String r0 = X.AnonymousClass3uL.A0O(r4)
            X.AnonymousClass1Xr.A04(r1, r0)
        L_0x00a1:
            X.AnonymousClass1Y5.A01(r3)
            android.widget.FrameLayout r0 = r5.A04
            if (r0 == 0) goto L_0x0352
            boolean r0 = A0N(r5)
            if (r0 == 0) goto L_0x0352
            X.21d r0 = r5.getFMessage()
            X.2rc r1 = r0.A02
            if (r1 != 0) goto L_0x0347
            r1 = 0
        L_0x00b7:
            X.21V r0 = r5.getFMessage()
            boolean r0 = X.AnonymousClass25A.A11(r0)
            if (r0 == 0) goto L_0x0175
            if (r1 == 0) goto L_0x0171
            android.widget.FrameLayout r8 = r5.A04
            if (r8 == 0) goto L_0x0101
            X.1bI r7 = r5.A0D
            if (r7 == 0) goto L_0x0101
            r0 = 0
            r8.setVisibility(r0)
            android.view.View r1 = r5.A02
            r0 = 8
            r1.setVisibility(r0)
            X.AnonymousClass3MY.A1T(r7, r0)
            r14 = r23 ^ 1
            androidx.constraintlayout.widget.ConstraintLayout r9 = r5.A06
            X.1bI r7 = r5.A0E
            X.1bI r1 = r5.A0B
            X.1bI r0 = r5.A0C
            android.view.View r10 = r0.A02()
            r15 = r2
            r16 = r2
            r11 = r7
            r12 = r1
            r13 = r2
            X.AnonymousClass3uL.A0Q(r9, r10, r11, r12, r13, r14, r15, r16)
            A0F(r3, r5)
            r5.A0B()
            X.1rL r0 = r5.A0C
            r8.setOnClickListener(r0)
            r1.A05(r0)
            r7.A05(r0)
        L_0x0101:
            boolean r0 = X.C79103uS.A1L(r5)
            if (r0 != 0) goto L_0x010a
        L_0x0107:
            r5.A1y()
        L_0x010a:
            X.AnonymousClass3uP.A0W(r3, r5)
            android.view.View r1 = r5.A03
            X.21V r0 = r5.getFMessage()
            java.lang.String r0 = r0.A18()
            r5.A2m(r1, r0)
            X.205 r7 = r4.A0v
            boolean r0 = r7.A02
            r3.setOutgoing(r0)
            r8 = 0
            r3.A0E = r8
            r0 = r21
            r5.setImageViewDimensions(r4, r0)
            X.1gV r0 = r5.A1S
            X.C17960vV.A07(r0)
            boolean r0 = r5.A0I
            if (r0 != 0) goto L_0x014b
            X.21d r0 = r5.getFMessage()
            X.2rc r1 = r0.A02
            if (r1 == 0) goto L_0x016f
            X.00H r0 = r5.A0G
            r0.get()
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x016f
            boolean r0 = A0N(r5)
            if (r0 == 0) goto L_0x016f
        L_0x014b:
            if (r23 != 0) goto L_0x016f
        L_0x014d:
            r5.A2t(r4, r2)
            r5.A0I = r8
            r5.A2n(r4)
            X.0zA r1 = r5.A07
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0382
            X.1BI r0 = r7.A00
            boolean r0 = X.C22971Dz.A0O(r0)
            if (r0 == 0) goto L_0x0382
            r1.A03()
            java.lang.String r0 = "isMarketingMessageHighIntentEnabled"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x016f:
            r2 = 0
            goto L_0x014d
        L_0x0171:
            r5.A2u(r4, r6, r2)
            goto L_0x0101
        L_0x0175:
            boolean r0 = X.C79103uS.A1L(r5)
            if (r0 == 0) goto L_0x02d9
            if (r1 == 0) goto L_0x02d4
            android.widget.FrameLayout r0 = r5.A04
            r20 = r0
            if (r0 == 0) goto L_0x029a
            X.1bI r1 = r5.A0D
            if (r1 == 0) goto L_0x029a
            android.view.View r9 = r1.A02()
            X.1bI r0 = r5.A0E
            android.view.View r19 = r0.A02()
            X.1bI r0 = r5.A0B
            android.view.View r18 = r0.A02()
            if (r23 != 0) goto L_0x02bd
            android.view.View r0 = r1.A02()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x01b7
            android.animation.AnimatorSet r0 = r5.A00
            if (r0 == 0) goto L_0x01ad
            boolean r0 = r0.isStarted()
            if (r0 != 0) goto L_0x01b7
        L_0x01ad:
            android.animation.AnimatorSet r0 = r5.A01
            if (r0 == 0) goto L_0x02bd
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L_0x02bd
        L_0x01b7:
            r14 = 0
            X.C18070vi.A0d(r9, r14)
            android.animation.AnimatorSet r17 = new android.animation.AnimatorSet
            r17.<init>()
            android.view.animation.AccelerateDecelerateInterpolator r11 = new android.view.animation.AccelerateDecelerateInterpolator
            r11.<init>()
            android.view.animation.Interpolator r11 = (android.view.animation.Interpolator) r11
            r0 = 3
            android.animation.Animator[] r10 = new android.animation.Animator[r0]
            android.util.Property r15 = android.view.View.SCALE_X
            X.C18070vi.A0Z(r15)
            r13 = 1056964608(0x3f000000, float:0.5)
            r8 = 1065353216(0x3f800000, float:1.0)
            r0 = 200(0xc8, double:9.9E-322)
            float[] r12 = X.C72473Md.A1a(r13, r8)
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r9, r15, r12)
            r7.setInterpolator(r11)
            r7.setDuration(r0)
            r10[r14] = r7
            android.util.Property r12 = android.view.View.SCALE_Y
            X.C18070vi.A0Z(r12)
            float[] r7 = X.C72473Md.A1a(r13, r8)
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r9, r12, r7)
            r7.setInterpolator(r11)
            r7.setDuration(r0)
            r10[r2] = r7
            android.util.Property r16 = android.view.View.ALPHA
            X.C18070vi.A0Z(r16)
            r7 = 0
            float[] r8 = X.C72473Md.A1a(r7, r8)
            r7 = r16
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r9, r7, r8)
            r8.setInterpolator(r11)
            r8.setDuration(r0)
            r7 = 2
            java.util.List r8 = X.C18070vi.A0O(r8, r10, r7)
            r7 = r17
            r7.playTogether(r8)
            r8 = 17
            X.AnonymousClass3Mo.A00(r7, r9, r8)
            androidx.constraintlayout.widget.ConstraintLayout r9 = r5.A06
            r13 = 0
            X.C18070vi.A0d(r9, r14)
            r11 = 3
            r8 = r18
            r7 = r19
            X.C18070vi.A0f(r8, r11, r7)
            android.animation.AnimatorSet r10 = new android.animation.AnimatorSet
            r10.<init>()
            android.view.animation.AccelerateDecelerateInterpolator r12 = new android.view.animation.AccelerateDecelerateInterpolator
            r12.<init>()
            android.view.animation.Interpolator r12 = (android.view.animation.Interpolator) r12
            android.animation.Animator[] r11 = new android.animation.Animator[r11]
            android.util.Property r8 = android.view.View.SCALE_X
            X.C18070vi.A0Z(r15)
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 1056964608(0x3f000000, float:0.5)
            float[] r7 = X.C72473Md.A1a(r14, r15)
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r9, r8, r7)
            r7.setInterpolator(r12)
            r7.setDuration(r0)
            r11[r13] = r7
            android.util.Property r8 = android.view.View.SCALE_Y
            X.C18070vi.A0Z(r8)
            float[] r7 = X.C72473Md.A1a(r14, r15)
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r9, r8, r7)
            r7.setInterpolator(r12)
            r7.setDuration(r0)
            r11[r2] = r7
            r7 = 0
            float[] r8 = X.C72473Md.A1a(r14, r7)
            r7 = r16
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r9, r7, r8)
            r7.setInterpolator(r12)
            r7.setDuration(r0)
            r0 = 2
            java.util.List r0 = X.C18070vi.A0O(r7, r11, r0)
            r10.playTogether(r0)
            X.3Mk r0 = new X.3Mk
            r11 = r0
            r12 = r20
            r13 = r19
            r14 = r17
            r15 = r18
            r16 = r9
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r10.addListener(r0)
            r10.start()
        L_0x029a:
            android.content.Context r1 = r5.getContext()
            r0 = 2131886434(0x7f120162, float:1.9407447E38)
            java.lang.String r0 = r1.getString(r0)
            r5.A2l(r3, r0)
            android.view.View r1 = r5.A02
            r0 = 8
            r1.setVisibility(r0)
            r5.A0B()
            boolean r0 = r5.A2s(r4)
            if (r0 == 0) goto L_0x0101
            r5.A1s()
            goto L_0x0101
        L_0x02bd:
            r1 = 8
            r0 = r20
            r0.setVisibility(r1)
            r0 = 0
            android.content.Context r1 = X.AnonymousClass3MX.A04(r9, r5, r0)
            r0 = 2131886434(0x7f120162, float:1.9407447E38)
            java.lang.String r0 = r1.getString(r0)
            r5.A2l(r3, r0)
            goto L_0x029a
        L_0x02d4:
            r5.A0J(r2)
            goto L_0x0101
        L_0x02d9:
            if (r1 == 0) goto L_0x0342
            android.widget.FrameLayout r9 = r5.A04
            if (r9 == 0) goto L_0x0101
            com.whatsapp.WaTextView r8 = r5.A08
            java.util.List r13 = java.util.Collections.singletonList(r4)
            long r0 = r4.A01
            r7 = 2131888987(0x7f120b5b, float:1.9412625E38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r10 = r5
            r11 = r8
            r14 = r0
            r10.A2E(r11, r12, r13, r14)
            android.view.View r7 = r5.A02
            int r0 = r7.getVisibility()
            if (r0 != 0) goto L_0x031b
            if (r23 != 0) goto L_0x031b
            r1 = 0
            X.3t9 r0 = new X.3t9
            r0.<init>(r5, r1)
            A0H(r5, r0)
        L_0x0307:
            r0 = 0
            r8.setVisibility(r0)
            X.1rL r0 = r5.A0D
            r8.setOnClickListener(r0)
            r9.setOnClickListener(r0)
            r5.A0B()
            A0F(r3, r5)
            goto L_0x0101
        L_0x031b:
            X.C17960vV.A05(r9)
            r0 = 0
            r9.setVisibility(r0)
            r1 = 8
            r7.setVisibility(r1)
            X.1bI r0 = r5.A0D
            if (r0 == 0) goto L_0x032e
            X.AnonymousClass3MY.A1T(r0, r1)
        L_0x032e:
            r15 = r23 ^ 1
            androidx.constraintlayout.widget.ConstraintLayout r7 = r5.A06
            X.1bI r1 = r5.A0E
            X.1bI r0 = r5.A0B
            r14 = 0
            r17 = r2
            r10 = r7
            r12 = r1
            r13 = r0
            r16 = r2
            X.AnonymousClass3uL.A0Q(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0307
        L_0x0342:
            r5.A0I(r4, r6, r2)
            goto L_0x0101
        L_0x0347:
            X.00H r0 = r5.A0G
            r0.get()
            boolean r1 = r1.A01()
            goto L_0x00b7
        L_0x0352:
            X.21V r0 = r5.getFMessage()
            boolean r0 = X.AnonymousClass25A.A11(r0)
            if (r0 == 0) goto L_0x0365
            boolean r0 = r5.A0L()
            r5.A2u(r4, r6, r0)
            goto L_0x0107
        L_0x0365:
            boolean r1 = X.C79103uS.A1L(r5)
            boolean r0 = r5.A0L()
            if (r1 == 0) goto L_0x037d
            r5.A0J(r0)
            boolean r0 = r5.A2s(r4)
            if (r0 == 0) goto L_0x0107
            r5.A1s()
            goto L_0x0107
        L_0x037d:
            r5.A0I(r4, r6, r0)
            goto L_0x0107
        L_0x0382:
            X.0ve r1 = r5.A0F
            r0 = 3419(0xd5b, float:4.791E-42)
            r1.A0N(r0)
            boolean r0 = r5.A0V
            if (r0 != 0) goto L_0x002c
            r5.A2P(r4)
            r5.A2N(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3u3.A0K(boolean):void");
    }

    private boolean A0L() {
        C62572rc r1;
        if (!(this.A0D == null || (r1 = getFMessage().A02) == null || !((C136906ub) this.A0G.get()).A02(new C134746r5(r1.A08, r1.A06), false))) {
            if (!C18020vd.A05(C18040vf.A02, ((C136906ub) this.A0G.get()).A02, 2653)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A0M(AnonymousClass3u3 r3) {
        if (!C18020vd.A05(C18040vf.A02, r3.A0F, 8394) || ((r3.getFMessage().A0u != 25 && r3.getFMessage().A0u != 57) || C60502o8.A00(r3.getFMessage()) == null || !C60502o8.A00(r3.getFMessage()).A0A)) {
            return false;
        }
        return true;
    }

    private void setImageDrawable(Bitmap bitmap, TransitionDrawable transitionDrawable) {
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A09;
        if (transitionDrawable == null) {
            conversationRowImage$RowImageView.setImageBitmap(bitmap);
        } else {
            conversationRowImage$RowImageView.setImageDrawable(transitionDrawable);
        }
    }

    private void setImageViewDimensions(C438421d r4, C62572rc r5) {
        ConversationRowImage$RowImageView conversationRowImage$RowImageView;
        ImageView.ScaleType scaleType;
        int i;
        int i2 = r5.A08;
        if (i2 == 0 || (i = r5.A06) == 0) {
            int i3 = 100;
            int A002 = C32021gV.A00(r4, 100);
            if (A002 > 0) {
                conversationRowImage$RowImageView = this.A09;
            } else {
                i3 = (int) (C72463Mc.A00(getContext()) * 83.333336f);
                conversationRowImage$RowImageView = this.A09;
                A002 = (i3 * 9) / 16;
            }
            conversationRowImage$RowImageView.A04(i3, A002);
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else {
            conversationRowImage$RowImageView = this.A09;
            conversationRowImage$RowImageView.A04(i2, i);
            if (!this.A0V && !(this instanceof C79023uB)) {
                scaleType = ImageView.ScaleType.MATRIX;
            }
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        conversationRowImage$RowImageView.setScaleType(scaleType);
    }

    public boolean A1V() {
        if (!((C32911hx) this.A1y.get()).A01(getFMessage()) || !this.A0l.CMI()) {
            return false;
        }
        return true;
    }

    public boolean A1X() {
        return C79103uS.A1K(this, getFMessage(), this.A1h);
    }

    public boolean A1Z() {
        return AnonymousClass25A.A0W(this.A0E, getFMessage(), this.A2O);
    }

    public boolean A1c() {
        return AnonymousClass000.A1O(this.A0V ? 1 : 0);
    }

    public void A1v() {
        A0H(this, this.A0K);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        if (A0N(r4) == false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1y() {
        /*
            r4 = this;
            android.widget.FrameLayout r0 = r4.A04
            if (r0 == 0) goto L_0x0030
            boolean r0 = A0N(r4)
            if (r0 == 0) goto L_0x0030
            X.21d r0 = r4.getFMessage()
            X.2rc r1 = r0.A02
            if (r1 == 0) goto L_0x0030
            X.00H r0 = r4.A0G
            r0.get()
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x0030
            X.1bI r2 = r4.A0E
        L_0x001f:
            X.21d r1 = r4.getFMessage()
            X.1hs r0 = r4.A05
            X.C17960vV.A07(r0)
            int r0 = X.C88564a8.A01(r0, r1, r2)
            r4.A2j(r2, r0)
            return
        L_0x0030:
            X.21d r3 = r4.getFMessage()
            X.2rc r1 = r3.A02
            if (r1 == 0) goto L_0x0058
            boolean r0 = r1.A0f
            if (r0 == 0) goto L_0x0058
            boolean r0 = r1.A0d
            if (r0 != 0) goto L_0x0058
            X.1bI r0 = r4.A0F
            int r0 = r0.A01()
            if (r0 == 0) goto L_0x0058
            r2 = 0
            android.widget.FrameLayout r0 = r4.A04
            if (r0 == 0) goto L_0x0054
            boolean r1 = A0N(r4)
            r0 = 1
            if (r1 != 0) goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            r4.A2u(r3, r2, r0)
        L_0x0058:
            X.1bI r2 = r4.A0F
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3u3.A1y():void");
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        if (!(r2 instanceof C442522s)) {
            boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
            super.A2V(r2, z);
            if (z || A1Z) {
                A0K(A1Z);
            }
        }
    }

    public void A2u(AnonymousClass206 r9, boolean z, boolean z2) {
        C38471rL r0;
        View view = this.A02;
        view.setVisibility(0);
        A0A();
        C28931bI r4 = this.A0F;
        C28931bI r5 = this.A0A;
        TextView textView = this.A05;
        AnonymousClass3uL.A0P(view, textView, r4, r5, true, !z);
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A09;
        A2l(conversationRowImage$RowImageView, getContext().getString(2131891256));
        if (r9.A0v.A02) {
            r0 = this.A0F;
        } else {
            r0 = null;
        }
        conversationRowImage$RowImageView.setOnClickListener(r0);
        C38471rL r02 = this.A0C;
        textView.setOnClickListener(r02);
        r4.A05(r02);
        if (z2) {
            A0C();
        } else {
            C72453Mb.A1M(this.A0D);
        }
    }

    public C438421d getFMessage() {
        return (C438421d) ((AnonymousClass21V) this.A0I);
    }

    public int getMainChildMaxWidth() {
        return C88164Yo.A01(this.A09.A08);
    }

    public int getReactionsViewVerticalOverlap() {
        Resources resources;
        int i;
        if (this.A0V) {
            resources = getResources();
            i = 2131168775;
        } else if (!AnonymousClass3MZ.A1b(getFMessage())) {
            return super.getReactionsViewVerticalOverlap();
        } else {
            resources = getResources();
            i = 2131168780;
        }
        return resources.getDimensionPixelOffset(i);
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof C438421d);
        super.setFMessage(r2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3u3(android.content.Context r5, X.C108875cR r6, X.C438421d r7) {
        /*
            r4 = this;
            r4.<init>(r5, r6, r7)
            r4.A1M()
            X.4qg r0 = new X.4qg
            r0.<init>(r4)
            r4.A0K = r0
            r3 = 8
            X.0vq r0 = X.C99054sC.A00(r4, r3)
            r4.A0J = r0
            X.21d r1 = r4.getFMessage()
            boolean r0 = r1.A0w()
            if (r0 == 0) goto L_0x00eb
            X.36w r0 = X.C60502o8.A00(r1)
            if (r0 == 0) goto L_0x00eb
            X.00H r0 = r4.A2B
            X.0ve r2 = X.AnonymousClass3MY.A0W(r0)
            r1 = 11693(0x2dad, float:1.6385E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00eb
            r0 = 2131432770(0x7f0b1542, float:1.8487307E38)
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto L_0x00eb
            X.1bI r2 = X.AnonymousClass3MW.A0p(r0)
            r0 = 2131429544(0x7f0b08a8, float:1.8480764E38)
            X.AnonymousClass3MY.A1B(r4, r0, r3)
            android.view.View r1 = r2.A02()
            r4.A02 = r1
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r1 = r2.A02()
            r0 = 2131429541(0x7f0b08a5, float:1.8480758E38)
            android.widget.TextView r0 = X.C17880vN.A0E(r1, r0)
            r4.A05 = r0
            android.view.View r1 = r2.A02()
            r0 = 2131434181(0x7f0b1ac5, float:1.8490169E38)
            X.1bI r0 = X.C72453Mb.A0s(r1, r0)
            r4.A0F = r0
            android.view.View r1 = r2.A02()
            r0 = 2131428820(0x7f0b05d4, float:1.8479295E38)
            X.1bI r0 = X.C72453Mb.A0s(r1, r0)
            r4.A0A = r0
        L_0x0079:
            r0 = 2131431526(0x7f0b1066, float:1.8484784E38)
            android.view.View r0 = r4.findViewById(r0)
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r0 = (com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView) r0
            r4.A09 = r0
            r0 = 2131431356(0x7f0b0fbc, float:1.8484439E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r4.A04 = r0
            r0 = 2131431355(0x7f0b0fbb, float:1.8484437E38)
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto L_0x009e
            X.1bI r0 = X.AnonymousClass3MW.A0p(r0)
            r4.A0D = r0
        L_0x009e:
            android.widget.FrameLayout r0 = r4.A04
            if (r0 == 0) goto L_0x00d7
            r0 = 2131431354(0x7f0b0fba, float:1.8484435E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r4, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r4.A06 = r0
            r0 = 2131431353(0x7f0b0fb9, float:1.8484433E38)
            X.1bI r0 = X.C72453Mb.A0s(r4, r0)
            r4.A0C = r0
            android.view.View r0 = r0.A02()
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r4.A08 = r0
            r0 = 2131431357(0x7f0b0fbd, float:1.848444E38)
            X.1bI r0 = X.C72453Mb.A0s(r4, r0)
            r4.A0E = r0
            r0 = 2131431352(0x7f0b0fb8, float:1.848443E38)
            X.1bI r0 = X.C72453Mb.A0s(r4, r0)
            r4.A0B = r0
            X.1bI r1 = r4.A0E
            r0 = 23
            X.C98254qp.A00(r1, r4, r0)
        L_0x00d7:
            X.1bI r1 = r4.A0F
            r0 = 4
            X.C98244qo.A00(r1, r0)
            r0 = 2131436057(0x7f0b2219, float:1.8493974E38)
            android.view.View r0 = r4.findViewById(r0)
            r4.A03 = r0
            r0 = 1
            r4.A0K(r0)
            return
        L_0x00eb:
            r0 = 2131429541(0x7f0b08a5, float:1.8480758E38)
            android.widget.TextView r0 = X.C17880vN.A0E(r4, r0)
            r4.A05 = r0
            r0 = 2131434181(0x7f0b1ac5, float:1.8490169E38)
            X.1bI r0 = X.C72453Mb.A0s(r4, r0)
            r4.A0F = r0
            r0 = 2131428820(0x7f0b05d4, float:1.8479295E38)
            X.1bI r0 = X.C72453Mb.A0s(r4, r0)
            r4.A0A = r0
            r0 = 2131429544(0x7f0b08a8, float:1.8480764E38)
            android.view.View r0 = r4.findViewById(r0)
            r4.A02 = r0
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3u3.<init>(android.content.Context, X.5cR, X.21d):void");
    }

    public static void A0F(View view, AnonymousClass3uL r3) {
        r3.A2l(view, r3.getContext().getString(2131886435));
    }

    public static void A0G(AnonymousClass3u3 r6) {
        AnonymousClass1KB r2;
        int i;
        Uri fromFile;
        C438421d fMessage = r6.getFMessage();
        C62572rc A002 = AnonymousClass206.A00(fMessage);
        r6.A0G.get();
        boolean z = false;
        C18070vi.A0d(A002, 0);
        boolean A012 = A002.A01();
        boolean z2 = fMessage.A0v.A02;
        if (z2 || A002.A0V || A012 || A0M(r6)) {
            File file = A002.A0G;
            if (file != null && (fromFile = Uri.fromFile(file)) != null && fromFile.getPath() != null) {
                z = C72473Md.A1Q(fromFile);
            } else if (z2 && !A002.A0U && !A0M(r6)) {
                r6.A0S.A09(2131887918, 0);
                return;
            }
            C79103uS.A1F(A002, fMessage, "ViewMessage/from_me:", AnonymousClass000.A10(), z2);
            if (z || A0M(r6)) {
                r2 = r6.A0S;
                i = 12;
            } else {
                Log.w("ViewMessage/No file");
                if (!r6.A2p()) {
                    r2 = r6.A0S;
                    i = 13;
                } else {
                    return;
                }
            }
            r2.CGP(new C98814rl(r6, fMessage, i));
        }
    }

    public static void A0H(AnonymousClass3u3 r5, AnonymousClass3M2 r6) {
        C438421d fMessage = r5.getFMessage();
        r5.A0I = true;
        C32021gV r0 = r5.A1S;
        C17960vV.A07(r0);
        r0.A0G(r5.A09, fMessage, r6, fMessage.A0v, false);
    }

    public static boolean A0N(AnonymousClass3u3 r5) {
        C62572rc r1 = r5.getFMessage().A02;
        if (r1 == null || !((C136906ub) r5.A0G.get()).A02(new C134746r5(r1.A08, r1.A06), false) || !((C136906ub) r5.A0G.get()).A04(false)) {
            return false;
        }
        return true;
    }

    private void setOverlayType(C438421d r3) {
        Integer num;
        boolean A1b = AnonymousClass3MZ.A1b(r3);
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A09;
        if (!A1b) {
            num = AnonymousClass00R.A00;
        } else if (r3.A0w()) {
            num = AnonymousClass00R.A0C;
        } else {
            num = AnonymousClass00R.A01;
        }
        conversationRowImage$RowImageView.A0C = num;
    }

    public boolean A1Y() {
        return A1f();
    }

    public void A20() {
        super.A20();
        if (this.A03 == null || AnonymousClass74O.A0O(getContext(), this.A03)) {
            if (C79103uS.A1J(this)) {
                C98784ri.A00(this.A1X, this, 14);
            } else {
                A0G(this);
            }
            ((C145127Ka) this.A0H.get()).A03(getFMessage());
        }
    }

    public boolean A2a() {
        return AnonymousClass3MZ.A1b(getFMessage());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (X.C60502o8.A00(getFMessage()).A0A == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2t(X.AnonymousClass206 r15, boolean r16) {
        /*
            r14 = this;
            X.21d r1 = r14.getFMessage()
            boolean r0 = r1.A0w()
            if (r0 == 0) goto L_0x002d
            X.36w r0 = X.C60502o8.A00(r1)
            if (r0 == 0) goto L_0x002d
            X.00H r0 = r14.A2B
            X.0ve r2 = X.AnonymousClass3MY.A0W(r0)
            r1 = 11693(0x2dad, float:1.6385E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x002d
            X.21d r0 = r14.getFMessage()
            X.36w r0 = X.C60502o8.A00(r0)
            boolean r0 = r0.A0A
            r1 = 1
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            X.1gV r5 = r14.A1S
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r2 = r14.A09
            X.3M2 r4 = r14.A0K
            r3 = r15
            if (r1 == 0) goto L_0x0046
            X.205 r6 = r15.A0v
            r1 = 0
            r8 = 0
            r7 = 2000(0x7d0, float:2.803E-42)
            r12 = 1
            r10 = r8
            r11 = r8
            r9 = r8
            r13 = r12
            X.C32021gV.A05(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0046:
            if (r16 == 0) goto L_0x0051
            X.205 r0 = r15.A0v
            r6 = 0
            r1 = r5
            r5 = r0
            r1.A0G(r2, r3, r4, r5, r6)
            return
        L_0x0051:
            r5.A0D(r2, r15, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3u3.A2t(X.206, boolean):void");
    }

    public void dispatchSetPressed(boolean z) {
        boolean isPressed;
        super.dispatchSetPressed(z);
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A09;
        if (conversationRowImage$RowImageView != null && conversationRowImage$RowImageView.A0I != (isPressed = isPressed())) {
            conversationRowImage$RowImageView.A0I = isPressed;
            ConversationRowImage$RowImageView.A01(conversationRowImage$RowImageView);
            conversationRowImage$RowImageView.invalidate();
        }
    }

    public int getBroadcastDrawableId() {
        if ((getFMessage() instanceof C438521e) || !AnonymousClass3MZ.A1b(getFMessage())) {
            return 2131231129;
        }
        return 2131231130;
    }

    public int getCenteredLayoutId() {
        return 2131624850;
    }

    public int getIncomingLayoutId() {
        return 2131624850;
    }

    public int getOutgoingLayoutId() {
        return 2131624852;
    }
}
