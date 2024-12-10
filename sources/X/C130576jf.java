package X;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.settings.SettingsRowIconText;

/* renamed from: X.6jf  reason: invalid class name and case insensitive filesystem */
public final class C130576jf {
    public final LottieAnimationView A00;
    public final LottieAnimationView A01;
    public final TextEmojiLabel A02;
    public final TextEmojiLabel A03;
    public final TextEmojiLabel A04;
    public final WaImageView A05;
    public final SettingsRowIconText A06;
    public final SettingsRowIconText A07;

    public C130576jf(View view) {
        LottieAnimationView lottieAnimationView;
        int i;
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass3MX.A0C(view, 2131436723);
        this.A04 = textEmojiLabel;
        this.A03 = (TextEmojiLabel) AnonymousClass3MX.A0C(view, 2131436722);
        textEmojiLabel.setText(2131897784);
        this.A05 = AnonymousClass3MW.A0S(view, 2131436725);
        this.A01 = (LottieAnimationView) view.findViewById(2131427739);
        this.A00 = (LottieAnimationView) view.findViewById(2131427738);
        this.A07 = (SettingsRowIconText) view.findViewById(2131434808);
        this.A06 = (SettingsRowIconText) view.findViewById(2131429312);
        this.A02 = AnonymousClass3MX.A0W(view, 2131427736);
        boolean z = C22891Dp.A02;
        LottieAnimationView lottieAnimationView2 = this.A00;
        if (z) {
            lottieAnimationView2.setAnimation(2132017252);
            lottieAnimationView = this.A01;
            i = 2132017253;
        } else {
            lottieAnimationView2.setAnimation(2132017154);
            lottieAnimationView = this.A01;
            i = 2132017155;
        }
        lottieAnimationView.setAnimation(i);
    }
}
