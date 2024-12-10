package X;

import android.view.MotionEvent;
import com.whatsapp.mediacomposer.VideoComposerFragment;

/* renamed from: X.698  reason: invalid class name */
public class AnonymousClass698 extends C1419777r {
    public final int A00;
    public final Object A01;

    public AnonymousClass698(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public boolean Boz() {
        if (this.A00 == 0) {
            return false;
        }
        VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this.A01;
        AnonymousClass70X r0 = videoComposerFragment.A0W;
        if ((r0 == null || !r0.A0a()) && C108945cZ.A0v(videoComposerFragment.A2B()).A05()) {
            return true;
        }
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (this.A00 == 0) {
            return false;
        }
        VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this.A01;
        if (C108945cZ.A0v(videoComposerFragment.A2B()).A05()) {
            return false;
        }
        videoComposerFragment.A2X();
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.A00 != 0) {
            VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this.A01;
            AnonymousClass70X r0 = videoComposerFragment.A0W;
            if (r0 == null || !r0.A0a() || !C108945cZ.A0v(videoComposerFragment.A2B()).A05()) {
                return false;
            }
            videoComposerFragment.A2X();
            return true;
        }
        ((VideoComposerFragment) this.A01).A2X();
        return true;
    }
}
