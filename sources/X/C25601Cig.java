package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.dsp.core.typography.TypographyData;

/* renamed from: X.Cig  reason: case insensitive filesystem */
public final class C25601Cig {
    public FrameLayout A00;
    public final Context A01;
    public final Handler A02 = C17890vO.A0D();
    public final C24750CIm A03;
    public final C123686Vl A04;
    public final E6Q A05;
    public final boolean A06;

    /* JADX WARNING: type inference failed for: r5v0, types: [X.BIg, android.widget.ImageView, android.view.View] */
    public static final void A00(FrameLayout frameLayout, C25601Cig cig) {
        boolean BeR = cig.A05.BeR();
        Interpolator interpolator = BFD.A09;
        Context context = cig.A01;
        int A012 = C25867Cna.A01(C0J.A23, BeR);
        Integer num = AnonymousClass00R.A0R;
        C26724DBa dBa = C26724DBa.A00;
        BFD bfd = new BFD(context, A012, (int) C24515C7j.A00(context, dBa.CNO(num)));
        ? imageView = new ImageView(context);
        BFD bfd2 = null;
        if (bfd instanceof Animatable) {
            bfd2 = bfd;
        }
        imageView.A00 = bfd2;
        imageView.setImageDrawable(bfd);
        FrameLayout frameLayout2 = cig.A00;
        if (frameLayout2 == null) {
            frameLayout2 = new FrameLayout(context);
            cig.A00 = frameLayout2;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        if (!cig.A06) {
            Integer num2 = AnonymousClass00R.A0C;
            BTJ BDI = dBa.BDI(num2);
            float f = BDI.A00;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C24515C7j.A00(context, (float) dBa.BG2(AnonymousClass00R.A0Y)));
            gradientDrawable.setStroke((int) f, C25867Cna.A01((C0J) BDI.A01, BeR));
            gradientDrawable.setColor(C25867Cna.A01(C0J.A25, BeR));
            TypographyData A022 = C25867Cna.A02(AnonymousClass00R.A15);
            Button button = new Button(context);
            button.setBackgroundDrawable(gradientDrawable);
            button.setText(C32.dialog_cancel);
            button.setTextSize(A022.getFontSize());
            button.setTextColor(C25867Cna.A01(C0J.A2C, BeR));
            button.setHeight((int) C24515C7j.A00(context, dBa.CNO(num2)));
            button.setLineSpacing(0.0f, C25867Cna.A00(A022.getLineHeight()));
            button.setTypeface(C25995CqB.A00().A02.A00(context, ((C24368C0h) A022.getFontFamily()).name()));
            button.setLetterSpacing(A022.getLetterSpacing() / (((float) ((int) A022.getFontSize())) / C108965cb.A08(context).scaledDensity));
            AnonymousClass3MZ.A1N(button, cig, 2);
            button.setAlpha(0.0f);
            AnonymousClass1HC A0B = AnonymousClass1HF.A0B(button);
            A0B.A09(3000);
            A0B.A03(1.0f);
            A0B.A08(200);
            A0B.A0A(new LinearInterpolator());
            A0B.A02();
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setGravity(80);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins((int) C24515C7j.A00(context, 20.0f), 0, (int) C24515C7j.A00(context, 20.0f), (int) C24515C7j.A00(context, 20.0f));
            layoutParams2.weight = 1.0f;
            linearLayout.addView(button, layoutParams2);
            frameLayout2.addView(linearLayout);
        }
        frameLayout2.addView(imageView, layoutParams);
        frameLayout.addView(frameLayout2);
        Animatable animatable = imageView.A00;
        if (animatable != null) {
            animatable.start();
        }
        imageView.A01 = true;
    }

    public C25601Cig(Context context, C24750CIm cIm, E6Q e6q, C123686Vl r5, boolean z) {
        this.A01 = context;
        this.A05 = e6q;
        this.A03 = cIm;
        this.A04 = r5;
        this.A06 = z;
    }
}
