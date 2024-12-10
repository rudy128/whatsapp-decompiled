package X;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.whatsapp.videoplayback.BloksVideoPlayerView;

public final class D5I implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ BloksVideoPlayerView A00;

    public D5I(BloksVideoPlayerView bloksVideoPlayerView) {
        this.A00 = bloksVideoPlayerView;
    }

    public void onScrollChanged() {
        BloksVideoPlayerView bloksVideoPlayerView = this.A00;
        boolean z = false;
        Rect rect = new Rect(0, 0, C108965cb.A07().widthPixels, C108965cb.A07().heightPixels);
        if (bloksVideoPlayerView.getLocalVisibleRect(rect) && (rect.height() * 100) / bloksVideoPlayerView.getHeight() >= 60 && (rect.width() * 100) / bloksVideoPlayerView.getWidth() >= 60) {
            z = true;
        }
        C25192Caj caj = bloksVideoPlayerView.A09;
        boolean z2 = false;
        if (z) {
            z2 = true;
        }
        bloksVideoPlayerView.A09 = new C25192Caj(caj.A01, z2, caj.A00);
        bloksVideoPlayerView.A02();
    }
}
