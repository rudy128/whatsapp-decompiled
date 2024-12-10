package X;

import android.view.View;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;

/* renamed from: X.5qO  reason: invalid class name and case insensitive filesystem */
public final class C114245qO extends C6X {
    public boolean A00;
    public final /* synthetic */ AnonymousClass6Gp A01;

    public void A03(View view, int i) {
        C18070vi.A0d(view, 0);
        if (i == 4) {
            AnonymousClass6p9 r2 = this.A01.A0N;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("StatusPlaybackBaseFragment/onPlaybackExit ");
            StatusPlaybackBaseFragment statusPlaybackBaseFragment = r2.A01;
            C17900vP.A0b(statusPlaybackBaseFragment, A10);
            AnonymousClass89M r1 = (AnonymousClass89M) statusPlaybackBaseFragment.A1B();
            if (r1 != null) {
                StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) r1;
                statusPlaybackActivity.A02 = 1;
                StatusPlaybackActivity.A0q(statusPlaybackActivity);
                statusPlaybackActivity.finish();
                statusPlaybackActivity.overridePendingTransition(0, 0);
            }
        } else if (i == 3) {
            AnonymousClass6Gp r12 = this.A01;
            if (r12.A01.A0J != 3) {
                AnonymousClass1HF.A0a(view, -view.getTop());
                r12.A0K().A0H(false);
                this.A00 = false;
                r12.A0N();
            }
        }
    }

    public C114245qO(AnonymousClass6Gp r1) {
        this.A01 = r1;
    }

    public void A02(View view, float f) {
        int i = (f > 0.95f ? 1 : (f == 0.95f ? 0 : -1));
        AnonymousClass6Gp r3 = this.A01;
        if (i > 0) {
            AnonymousClass6Gp.A07(r3);
        } else {
            AnonymousClass6Gp.A09(r3, false, false);
        }
        View view2 = r3.A0L().A02;
        if (view2 != null) {
            float f2 = 1.0f;
            if (f < 0.5f) {
                f2 = 2.0f * f;
            }
            view2.setAlpha(f2);
            AnonymousClass89M r4 = (AnonymousClass89M) r3.A0N.A01.A1B();
            if (r4 != null) {
                AnonymousClass01E r42 = (AnonymousClass01E) r4;
                float f3 = 0.0f;
                if (f >= 0.9f) {
                    f3 = 1.0f - ((1.0f - f) * 10.0f);
                }
                View findViewById = r42.findViewById(2131436760);
                findViewById.setVisibility(0);
                findViewById.setBackgroundColor(((int) (255.0f * f3)) << 24);
                C108975cc.A0r(r42.findViewById(2131436759));
            }
            if (!this.A00) {
                r3.A0K().A0H(true);
                this.A00 = true;
                return;
            }
            return;
        }
        C18070vi.A11("contentSheet");
        throw null;
    }
}
