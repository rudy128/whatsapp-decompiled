package X;

import com.whatsapp.status.playback.widget.StatusPlaybackProgressView;
import com.whatsapp.util.Log;

/* renamed from: X.6oj  reason: invalid class name and case insensitive filesystem */
public final class C133426oj {
    public final /* synthetic */ AnonymousClass6Gp A00;

    public C133426oj(AnonymousClass6Gp r1) {
        this.A00 = r1;
    }

    public void A00() {
        StringBuilder A10 = AnonymousClass000.A10();
        C108985cd.A1H(this, "playbackPage/onPlaybackContentFinished page=", A10);
        AnonymousClass6Gp r3 = this.A00;
        C17900vP.A0b(r3.A0N.A01, A10);
        StatusPlaybackProgressView statusPlaybackProgressView = r3.A02;
        if (statusPlaybackProgressView != null) {
            C1596985n r1 = r3.A0O;
            C18070vi.A0d(r1, 0);
            if (statusPlaybackProgressView.A00 == r1) {
                statusPlaybackProgressView.A00 = null;
            }
            statusPlaybackProgressView.invalidate();
        }
        if (C108965cb.A1X(r3.A0J)) {
            if (C18020vd.A05(C18040vf.A02, r3.A0M.A01, 11675)) {
                Log.i("playbackPage/onPlaybackContentFinished talbackEnabled so we stop");
                r3.A0P();
                return;
            }
        }
        if (!r3.A06) {
            AnonymousClass7RH.A00(r3.A0D, r3, 46);
        }
    }

    public void A01() {
        StringBuilder A10 = AnonymousClass000.A10();
        C108985cd.A1H(this, "playbackPage/onPlaybackContentStarted page=", A10);
        AnonymousClass6Gp r1 = this.A00;
        C17900vP.A0b(r1.A0N.A01, A10);
        r1.A0M();
    }
}
