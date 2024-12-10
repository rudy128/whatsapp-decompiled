package com.facebook.smartcapture.ui;

import X.AFE;
import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass6VZ;
import X.AnonymousClass7PS;
import X.BE9;
import X.BH4;
import X.BVO;
import X.C108945cZ;
import X.C108955ca;
import X.C17880vN;
import X.C18070vi;
import X.C24261Jm;
import X.C26264Cw9;
import X.C26305CxO;
import X.C27082DTh;
import X.C39151sZ;
import X.C72463Mc;
import X.CDP;
import X.CIZ;
import X.D55;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.smartcapture.components.ContourView;
import com.facebook.smartcapture.components.DottedAlignmentView;
import com.facebook.smartcapture.components.RectDetectionVisualizerView;
import java.util.Map;

public class DefaultCaptureOverlayFragment extends CaptureOverlayFragment {
    public ObjectAnimator A00;
    public ImageButton A01;
    public ImageView A02;
    public ProgressBar A03;
    public ProgressBar A04;
    public TextView A05;
    public ContourView A06;
    public RectDetectionVisualizerView A07;
    public PhotoRequirementsView A08;
    public TextTipView A09;
    public final View.OnClickListener A0A = new AFE(this, 3);
    public final Animator.AnimatorListener A0B = new C26305CxO(this, 1);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625059, viewGroup, false);
        C18070vi.A0X(inflate);
        PhotoRequirementsView photoRequirementsView = new PhotoRequirementsView(A14(), (AttributeSet) null);
        photoRequirementsView.setId(2131433810);
        ((ViewGroup) inflate).addView(photoRequirementsView, new C39151sZ(-1, -1));
        return inflate;
    }

    public void A21(Bundle bundle, View view) {
        TextView A0E;
        Drawable A002;
        ImageView imageView;
        C18070vi.A0d(view, 0);
        this.A02 = AnonymousClass3MW.A0H(view, 2131431855);
        if (!(this.A00 == null || (A002 = C24261Jm.A00(A14(), 2131231675)) == null || (imageView = this.A02) == null)) {
            imageView.setImageDrawable(A002);
        }
        this.A06 = (ContourView) view.findViewById(2131429539);
        this.A09 = (TextTipView) view.findViewById(2131436087);
        this.A07 = (RectDetectionVisualizerView) view.findViewById(2131434425);
        this.A01 = (ImageButton) view.findViewById(2131428451);
        this.A03 = (ProgressBar) view.findViewById(2131433721);
        this.A04 = (ProgressBar) view.findViewById(2131433722);
        TextView A0E2 = C17880vN.A0E(view, 2131431400);
        A0E2.setText(A14().getResources().getText(2131898628));
        this.A05 = A0E2;
        PhotoRequirementsView photoRequirementsView = (PhotoRequirementsView) view.findViewById(2131433810);
        this.A08 = photoRequirementsView;
        if (!(this.A00 == null || photoRequirementsView == null)) {
            LayoutInflater A0D = AnonymousClass3MZ.A0D(photoRequirementsView);
            View inflate = A0D.inflate(2131626459, photoRequirementsView, false);
            photoRequirementsView.A00 = inflate;
            C18070vi.A0b(inflate);
            ViewGroup viewGroup = (ViewGroup) inflate.findViewById(2131433808);
            View view2 = photoRequirementsView.A00;
            if (!(view2 == null || (A0E = C17880vN.A0E(view2, 2131436461)) == null)) {
                A0E.setText(2131898626);
            }
            CIZ ciz = new CIZ(photoRequirementsView.getContext(), new BH4(photoRequirementsView), (Handler) null);
            View view3 = photoRequirementsView.A00;
            if (view3 != null) {
                view3.setOnTouchListener(new D55(ciz, 1));
            }
            AnonymousClass7PS[] r4 = new AnonymousClass7PS[3];
            r4[0] = new AnonymousClass7PS(2131898623, 2131898620, C24261Jm.A00(AnonymousClass3MY.A04(photoRequirementsView), 2131231806));
            r4[1] = new AnonymousClass7PS(2131898624, 2131898621, C24261Jm.A00(AnonymousClass3MY.A04(photoRequirementsView), 2131231806));
            for (AnonymousClass7PS r1 : C18070vi.A0O(new AnonymousClass7PS(2131898625, 2131898622, C24261Jm.A00(AnonymousClass3MY.A04(photoRequirementsView), 2131231806)), r4, 2)) {
                int A0M = AnonymousClass000.A0M(r1.first);
                int A0M2 = AnonymousClass000.A0M(r1.second);
                Drawable drawable = (Drawable) r1.third;
                View inflate2 = A0D.inflate(2131626458, viewGroup, false);
                C18070vi.A0z(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
                C18070vi.A0d(inflate2, 3);
                ImageView A0H = AnonymousClass3MW.A0H(inflate2, 2131431861);
                TextView A0E3 = C17880vN.A0E(inflate2, 2131436461);
                TextView A0E4 = C17880vN.A0E(inflate2, 2131436460);
                if (drawable != null) {
                    A0H.setImageDrawable(drawable);
                } else {
                    A0H.setVisibility(8);
                }
                A0E3.setText(A0M);
                A0E4.setText(A0M2);
                viewGroup.addView(inflate2);
            }
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(2131429114);
        C26264Cw9 cw9 = new C26264Cw9();
        cw9.A0C(constraintLayout);
        if (C72463Mc.A00(A14()) < 2.0f) {
            C26264Cw9.A03(cw9, 2131431400).A02.A0p = (int) A14().getResources().getDimension(2131166983);
        }
        cw9.A0A(constraintLayout);
        ImageView imageView2 = this.A02;
        C18070vi.A0b(imageView2);
        AnonymousClass3MZ.A1N(imageView2, this, 4);
        TextView textView = this.A05;
        if (textView != null) {
            textView.setOnClickListener(this.A0A);
        }
        ImageButton imageButton = this.A01;
        if (imageButton != null) {
            AnonymousClass3MZ.A1N(imageButton, this, 5);
        }
        ProgressBar progressBar = this.A04;
        C18070vi.A0b(progressBar);
        progressBar.setProgress(0);
        ProgressBar progressBar2 = this.A04;
        C18070vi.A0b(progressBar2);
        progressBar2.setMax(100);
        ProgressBar progressBar3 = this.A04;
        C18070vi.A0z(progressBar3, "null cannot be cast to non-null type android.widget.ProgressBar");
        int[] A1W = C108945cZ.A1W();
        // fill-array-data instruction
        A1W[0] = 0;
        A1W[1] = 100;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar3, "progress", A1W);
        this.A00 = ofInt;
        C18070vi.A0b(ofInt);
        ofInt.setStartDelay(500);
        ObjectAnimator objectAnimator = this.A00;
        C18070vi.A0b(objectAnimator);
        objectAnimator.setDuration(2000);
        RectDetectionVisualizerView rectDetectionVisualizerView = this.A07;
        C18070vi.A0b(rectDetectionVisualizerView);
        rectDetectionVisualizerView.setVisibility(8);
        TextTipView textTipView = this.A09;
        C18070vi.A0b(textTipView);
        textTipView.setVisibility(8);
        TextTipView textTipView2 = this.A09;
        if (textTipView2 != null) {
            CDP cdp = this.A00;
            C18070vi.A0b(cdp);
            BVO bvo = this.A00;
            C18070vi.A0d(cdp, 0);
            textTipView2.A00 = bvo;
            AnonymousClass3MX.A1B(AnonymousClass3MY.A04(textTipView2), textTipView2.A01, 2131231806);
            Context context = textTipView2.getContext();
            C18070vi.A0b(context);
            AnonymousClass6VZ.A00(context, 2130971018);
            Map map = textTipView2.A02;
            Integer A0h = BE9.A0h(C108955ca.A0e(), new Object(), map);
            map.put(BE9.A0i(A0h, new Object(), map), map.get(A0h));
        }
        Context A14 = A14();
        ProgressBar progressBar4 = this.A03;
        C18070vi.A0b(progressBar4);
        C18070vi.A0d(progressBar4, 1);
        progressBar4.getIndeterminateDrawable().setColorFilter(AnonymousClass6VZ.A00(A14, 2130971018), PorterDuff.Mode.SRC_IN);
    }

    public void A1t() {
        super.A1t();
        ContourView contourView = this.A06;
        C18070vi.A0b(contourView);
        DottedAlignmentView dottedAlignmentView = contourView.A0C;
        dottedAlignmentView.post(C27082DTh.A00(dottedAlignmentView, 32));
    }

    public void A1u() {
        super.A1u();
        RectDetectionVisualizerView rectDetectionVisualizerView = this.A07;
        C18070vi.A0b(rectDetectionVisualizerView);
        rectDetectionVisualizerView.postInvalidate();
    }
}
