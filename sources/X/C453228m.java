package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.28m  reason: invalid class name and case insensitive filesystem */
public class C453228m extends C42011xT {
    public LottieAnimationView A00;
    public final View A01;
    public final View A02;
    public final ViewStub A03;
    public final TextEmojiLabel A04;
    public final C36531o3 A05;
    public final AnonymousClass11C A06;
    public final C18000vb A07;
    public final C18030ve A08;
    public final C36401np A09;

    public C453228m(View view, C32111gf r14, C36531o3 r15, AnonymousClass11C r16, C18000vb r17, C18030ve r18, C36401np r19) {
        super(view);
        this.A02 = view;
        C18030ve r4 = r18;
        this.A08 = r4;
        C36401np r8 = r19;
        this.A09 = r8;
        AnonymousClass11C r5 = r16;
        this.A06 = r5;
        this.A07 = r17;
        this.A05 = r15;
        this.A01 = AnonymousClass1HF.A06(view, 2131430361);
        View A062 = AnonymousClass1HF.A06(view, 2131430360);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass1HF.A06(view, 2131430362);
        this.A04 = textEmojiLabel;
        C43421zm.A04((TextView) AnonymousClass1HF.A06(view, 2131430368));
        textEmojiLabel.setText(r8.A05(textEmojiLabel.getContext(), new C98764rg((Object) this, 15), view.getContext().getString(2131888523), "learn-more"));
        textEmojiLabel.setMovementMethod(new C39441t5(r4));
        textEmojiLabel.setAccessibilityHelper(new C39411t2(textEmojiLabel, r5));
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r4, 5543)) {
            A062.setVisibility(8);
        } else {
            A062.setVisibility(0);
            A062.setOnClickListener(new C90004dN(r14, view, 11));
        }
        this.A03 = (ViewStub) AnonymousClass1HF.A06(view, 2131430364);
        if (C22891Dp.A02) {
            Context context = this.A0H.getContext();
            C18070vi.A0d(context, 0);
            if (C18020vd.A05(r2, AnonymousClass1J8.A00(context), 8819)) {
                ViewStub viewStub = this.A03;
                viewStub.setLayoutResource(2131625199);
                LottieAnimationView lottieAnimationView = (LottieAnimationView) viewStub.inflate();
                this.A00 = lottieAnimationView;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) lottieAnimationView.getLayoutParams();
                marginLayoutParams.bottomMargin = this.A01.getResources().getDimensionPixelSize(2131169546);
                this.A00.setLayoutParams(marginLayoutParams);
                this.A04.setText(2131888524);
                View view2 = this.A02;
                AnonymousClass1HF.A06(view2, 2131430365);
                TextView textView = (TextView) AnonymousClass1HF.A06(view2, 2131430367);
                ImageView imageView = (ImageView) AnonymousClass1HF.A06(view2, 2131430366);
                String string = view2.getContext().getString(2131888548, AnonymousClass000.A1b("learn-more", 1));
                textView.setText(this.A09.A06(textView.getContext(), new C98764rg((Object) this, 16), string, "learn-more", AnonymousClass1YL.A00(textView.getContext(), 2130971981, 2131101293)));
                textView.setMovementMethod(new C39441t5(this.A08));
                AnonymousClass1HF.A0f(textView, new C39411t2(textView, this.A06));
                imageView.setImageDrawable(new C74743cP(C24261Jm.A00(view2.getContext(), 2131231229), this.A07));
                imageView.setOnClickListener(new C89894dC(this, 35));
            }
        }
        ViewStub viewStub2 = this.A03;
        viewStub2.setLayoutResource(2131625200);
        viewStub2.inflate();
        this.A04.setText(2131888524);
        View view22 = this.A02;
        AnonymousClass1HF.A06(view22, 2131430365);
        TextView textView2 = (TextView) AnonymousClass1HF.A06(view22, 2131430367);
        ImageView imageView2 = (ImageView) AnonymousClass1HF.A06(view22, 2131430366);
        String string2 = view22.getContext().getString(2131888548, AnonymousClass000.A1b("learn-more", 1));
        textView2.setText(this.A09.A06(textView2.getContext(), new C98764rg((Object) this, 16), string2, "learn-more", AnonymousClass1YL.A00(textView2.getContext(), 2130971981, 2131101293)));
        textView2.setMovementMethod(new C39441t5(this.A08));
        AnonymousClass1HF.A0f(textView2, new C39411t2(textView2, this.A06));
        imageView2.setImageDrawable(new C74743cP(C24261Jm.A00(view22.getContext(), 2131231229), this.A07));
        imageView2.setOnClickListener(new C89894dC(this, 35));
    }
}
