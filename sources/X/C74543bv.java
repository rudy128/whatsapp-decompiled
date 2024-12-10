package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.whatsapp.bot.metaai.imagineme.ImagineMeConsentBottomSheet;

/* renamed from: X.3bv  reason: invalid class name and case insensitive filesystem */
public final class C74543bv extends C90704eV {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ ImagineMeConsentBottomSheet A02;

    public C74543bv(View view, ViewGroup viewGroup, ImagineMeConsentBottomSheet imagineMeConsentBottomSheet) {
        this.A01 = viewGroup;
        this.A02 = imagineMeConsentBottomSheet;
        this.A00 = view;
    }

    public void onAnimationEnd(Animation animation) {
        ViewGroup viewGroup = this.A01;
        viewGroup.removeAllViews();
        AlphaAnimation A0Q = C72463Mc.A0Q();
        A0Q.setDuration(300);
        A0Q.setInterpolator(new AccelerateDecelerateInterpolator());
        View view = this.A00;
        view.startAnimation(A0Q);
        viewGroup.addView(view);
    }
}
