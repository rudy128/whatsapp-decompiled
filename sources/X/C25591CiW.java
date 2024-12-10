package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.dsp.core.typography.TypographyData;

/* renamed from: X.CiW  reason: case insensitive filesystem */
public final class C25591CiW {
    public FrameLayout A00;
    public final Context A01;
    public final Handler A02 = C17890vO.A0D();
    public final C24750CIm A03;
    public final C24751CIn A04;
    public final E6Q A05;

    public static final void A00(FrameLayout frameLayout, C24751CIn cIn, C25591CiW ciW) {
        FrameLayout frameLayout2;
        C25591CiW ciW2 = ciW;
        FrameLayout frameLayout3 = ciW2.A00;
        if (frameLayout3 == null) {
            ciW2.A00 = new FrameLayout(ciW2.A01);
        } else if (!(frameLayout3.getParent() == null || (frameLayout2 = ciW2.A00) == null)) {
            ViewParent parent = frameLayout2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(frameLayout2);
            }
            frameLayout2.removeAllViews();
        }
        boolean BeR = ciW2.A05.BeR();
        Integer num = AnonymousClass00R.A0B;
        C26724DBa dBa = C26724DBa.A00;
        float CNZ = dBa.CNZ(num);
        Context context = ciW2.A01;
        ViewParent viewParent = null;
        C24291Jp A002 = C24291Jp.A00((Resources.Theme) null, context.getResources(), 2131231891);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(A002);
        imageView.setPadding(0, 0, 0, (int) C24515C7j.A00(context, dBa.CNZ(AnonymousClass00R.A0f)));
        imageView.setColorFilter(C25867Cna.A01(C0J.A2H, BeR));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setPadding((int) C24515C7j.A00(context, CNZ), 0, (int) C24515C7j.A00(context, CNZ), 0);
        linearLayout.addView(imageView, layoutParams);
        Integer num2 = AnonymousClass00R.A0C;
        TypographyData A022 = C25867Cna.A02(num2);
        TextView textView = new TextView(context);
        textView.setText(C32.__external__failed_loading_title);
        int A012 = C25867Cna.A01(C0J.A1x, BeR);
        textView.setTextColor(A012);
        float fontSize = A022.getFontSize();
        textView.setTextSize(fontSize);
        textView.setLineSpacing(0.0f, C25867Cna.A00(A022.getLineHeight()));
        textView.setLetterSpacing(A022.getLetterSpacing() / (((float) ((int) fontSize)) / C108965cb.A08(context).scaledDensity));
        textView.setTypeface(C25995CqB.A00().A02.A00(context, ((C24368C0h) A022.getFontFamily()).getValue()));
        textView.setMaxLines(3);
        textView.setPadding(0, 0, 0, (int) C24515C7j.A00(context, dBa.CNZ(AnonymousClass00R.A0b)));
        Integer num3 = AnonymousClass00R.A00;
        TypographyData A023 = C25867Cna.A02(num3);
        TextView textView2 = new TextView(context);
        textView2.setText(C32.__external__failed_loading_message);
        textView2.setTextColor(A012);
        float fontSize2 = A023.getFontSize();
        textView2.setTextSize(fontSize2);
        textView2.setLineSpacing(0.0f, C25867Cna.A00(A023.getLineHeight()));
        textView.setTypeface(C25995CqB.A00().A02.A00(context, ((C24368C0h) A023.getFontFamily()).getValue()));
        textView2.setLetterSpacing(A023.getLetterSpacing() / (((float) ((int) fontSize2)) / C108965cb.A08(context).scaledDensity));
        textView2.setTextSize(15.0f);
        textView2.setMaxLines(7);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        BTJ BDI = dBa.BDI(num3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C24515C7j.A00(context, (float) dBa.BG2(AnonymousClass00R.A0Y)));
        gradientDrawable.setColor(C25867Cna.A01(C0J.A1h, BeR));
        gradientDrawable.setStroke((int) BDI.A00, C25867Cna.A01((C0J) BDI.A01, BeR));
        TypographyData A024 = C25867Cna.A02(AnonymousClass00R.A15);
        Button button = new Button(context);
        button.setBackground(gradientDrawable);
        button.setText(C32.__external__failed_loading_refresh);
        float fontSize3 = A024.getFontSize();
        button.setTextSize(fontSize3);
        button.setTextColor(C25867Cna.A01(C0J.A1m, BeR));
        button.setHeight((int) C24515C7j.A00(context, dBa.CNO(num2)));
        button.setLineSpacing(0.0f, C25867Cna.A00(A024.getLineHeight()));
        button.setTypeface(C25995CqB.A00().A02.A00(context, ((C24368C0h) A024.getFontFamily()).name()));
        button.setLetterSpacing(A024.getLetterSpacing() / (((float) ((int) fontSize3)) / C108965cb.A08(context).scaledDensity));
        int CNZ2 = (int) dBa.CNZ(AnonymousClass00R.A04);
        button.setPadding(CNZ2, 0, CNZ2, 0);
        button.setOnClickListener(new AnonymousClass78Q((Object) cIn, (Object) ciW2, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setGravity(80);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins((int) C24515C7j.A00(context, 20.0f), 0, (int) C24515C7j.A00(context, 20.0f), (int) C24515C7j.A00(context, 20.0f));
        layoutParams2.weight = 1.0f;
        linearLayout2.addView(button, layoutParams2);
        FrameLayout frameLayout4 = ciW2.A00;
        if (frameLayout4 != null) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(C31.company_layer_icons_close_outline_24);
            imageView2.setColorFilter(C25867Cna.A01(C0J.A1t, BeR));
            AnonymousClass3MZ.A1N(imageView2, ciW2, 1);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) C24515C7j.A00(context, 24.0f), (int) C24515C7j.A00(context, 24.0f));
            layoutParams3.setMargins((int) C24515C7j.A00(context, 20.0f), (int) C24515C7j.A00(context, 30.0f), 0, 0);
            layoutParams3.gravity = 51;
            frameLayout4.addView(imageView2, layoutParams3);
        }
        FrameLayout frameLayout5 = ciW2.A00;
        if (frameLayout5 != null) {
            frameLayout5.addView(linearLayout);
        }
        FrameLayout frameLayout6 = ciW2.A00;
        if (frameLayout6 != null) {
            frameLayout6.addView(linearLayout2);
        }
        FrameLayout frameLayout7 = ciW2.A00;
        if (!(frameLayout7 == null || frameLayout7.getParent() == null)) {
            FrameLayout frameLayout8 = ciW2.A00;
            if (frameLayout8 != null) {
                viewParent = frameLayout8.getParent();
            }
            C18070vi.A0z(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) viewParent).removeView(ciW2.A00);
        }
        frameLayout.addView(ciW2.A00);
    }

    public C25591CiW(Context context, C24750CIm cIm, C24751CIn cIn, E6Q e6q) {
        this.A01 = context;
        this.A05 = e6q;
        this.A03 = cIm;
        this.A04 = cIn;
    }
}
