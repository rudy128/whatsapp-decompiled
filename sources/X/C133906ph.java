package X;

import android.os.Handler;
import android.widget.FrameLayout;
import com.whatsapp.videoplayback.ExoPlayerErrorFrame;

/* renamed from: X.6ph  reason: invalid class name and case insensitive filesystem */
public final class C133906ph {
    public AnonymousClass7RS A00;
    public final Handler A01 = new Handler();
    public final ExoPlayerErrorFrame A02;
    public final C121996Mj A03;
    public final boolean A04;

    public final void A00() {
        ExoPlayerErrorFrame exoPlayerErrorFrame = this.A02;
        exoPlayerErrorFrame.setLoadingViewVisibility(8);
        AnonymousClass7RS r1 = this.A00;
        if (r1 != null) {
            this.A01.removeCallbacks(r1);
        }
        if (exoPlayerErrorFrame.getErrorScreenVisibility() == 0) {
            C121996Mj r12 = this.A03;
            if (r12 != null) {
                r12.setPlayControlVisibility(0);
            }
            FrameLayout frameLayout = exoPlayerErrorFrame.A02;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        }
    }

    public final void A01(String str) {
        this.A02.setLoadingViewVisibility(0);
        if (this.A04) {
            AnonymousClass7RS r1 = this.A00;
            if (r1 != null) {
                this.A01.removeCallbacks(r1);
            } else {
                this.A00 = new AnonymousClass7RS(29, str, this);
            }
            AnonymousClass7RS r3 = this.A00;
            if (r3 != null) {
                this.A01.postDelayed(r3, 5000);
            }
        }
    }

    public C133906ph(ExoPlayerErrorFrame exoPlayerErrorFrame, C121996Mj r3, boolean z) {
        this.A02 = exoPlayerErrorFrame;
        this.A03 = r3;
        this.A04 = z;
    }
}
