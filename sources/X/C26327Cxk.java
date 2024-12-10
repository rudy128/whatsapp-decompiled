package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.whatsapp.videoplayback.BloksVideoPlayerView;

/* renamed from: X.Cxk  reason: case insensitive filesystem */
public final class C26327Cxk implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ BloksVideoPlayerView A00;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public C26327Cxk(BloksVideoPlayerView bloksVideoPlayerView) {
        this.A00 = bloksVideoPlayerView;
    }

    public void onActivityPaused(Activity activity) {
        BloksVideoPlayerView bloksVideoPlayerView = this.A00;
        C25192Caj caj = bloksVideoPlayerView.A09;
        bloksVideoPlayerView.A09 = new C25192Caj(caj.A01, caj.A02, false);
        bloksVideoPlayerView.A02();
    }

    public void onActivityResumed(Activity activity) {
        BloksVideoPlayerView bloksVideoPlayerView = this.A00;
        C25192Caj caj = bloksVideoPlayerView.A09;
        bloksVideoPlayerView.A09 = new C25192Caj(caj.A01, caj.A02, true);
        bloksVideoPlayerView.A02();
    }
}
