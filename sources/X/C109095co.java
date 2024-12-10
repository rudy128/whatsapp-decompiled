package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBanner;
import com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel;

/* renamed from: X.5co  reason: invalid class name and case insensitive filesystem */
public class C109095co extends AnimatorListenerAdapter {
    public final /* synthetic */ long A00;
    public final /* synthetic */ VoipInCallNotifBanner A01;

    public C109095co(VoipInCallNotifBanner voipInCallNotifBanner, long j) {
        this.A01 = voipInCallNotifBanner;
        this.A00 = j;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        Handler handler = this.A01.A0G;
        handler.removeMessages(0);
        handler.sendEmptyMessageDelayed(0, this.A00);
    }

    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        C160968Au r1 = this.A01.A05;
        if (r1 instanceof InCallBannerViewModel) {
            ((InCallBannerViewModel) r1).A0T(true);
        }
    }
}
