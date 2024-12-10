package X;

import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.widget.AudioVolumeView;

/* renamed from: X.7ME  reason: invalid class name */
public class AnonymousClass7ME implements AnonymousClass89N {
    public final int A00;
    public final Object A01;

    public AnonymousClass7ME(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Blo(boolean z) {
        if (this.A00 == 0) {
            ((AnonymousClass6Ga) this.A01).A0J(z);
        }
    }

    public void Blq(int i, int i2) {
        AudioVolumeView audioVolumeView;
        if (this.A00 != 0) {
            StatusPlaybackBaseFragment statusPlaybackBaseFragment = (StatusPlaybackBaseFragment) this.A01;
            if (statusPlaybackBaseFragment.A00 && i2 != 0) {
                int i3 = i + 1;
                if (i == 0) {
                    i3 = 0;
                }
                float f = (((float) i3) * 1.0f) / ((float) (i2 + 1));
                C131096kV r0 = statusPlaybackBaseFragment.A05;
                if (r0 != null) {
                    r0.A0F.A04(0);
                }
                C131096kV r02 = statusPlaybackBaseFragment.A05;
                if (r02 != null && (audioVolumeView = (AudioVolumeView) r02.A0F.A02()) != null) {
                    audioVolumeView.setVolume(f);
                    Runnable runnable = statusPlaybackBaseFragment.A0C;
                    audioVolumeView.removeCallbacks(runnable);
                    audioVolumeView.postDelayed(runnable, 1500);
                }
            }
        }
    }
}
