package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.5e4  reason: invalid class name and case insensitive filesystem */
public abstract class C109825e4 extends SurfaceView implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public static void A00(VideoSurfaceView videoSurfaceView) {
        videoSurfaceView.A01 = 0;
        videoSurfaceView.A05 = 0;
        videoSurfaceView.A0C = null;
        videoSurfaceView.A0B = null;
        videoSurfaceView.A02 = -1;
    }

    public void A04() {
        if (!this.A01) {
            this.A01 = true;
            ((VideoSurfaceView) this).A0D = (WamediaManager) ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10.ABs.get();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C109825e4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A04();
    }
}
