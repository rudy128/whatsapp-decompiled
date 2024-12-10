package X;

import android.os.RemoteException;
import com.facebook.android.exoplayer2.Timeline;
import com.whatsapp.videoplayback.HeroPlaybackControlView;

/* renamed from: X.6rZ  reason: invalid class name and case insensitive filesystem */
public class C135046rZ {
    public final /* synthetic */ C26378Cye A00;
    public final /* synthetic */ HeroPlaybackControlView A01;

    public C135046rZ(C26378Cye cye, HeroPlaybackControlView heroPlaybackControlView) {
        this.A01 = heroPlaybackControlView;
        this.A00 = cye;
    }

    public Timeline A00() {
        C26205Cuc cuc;
        C26206Cue cue;
        C26270CwF cwF = this.A00.A0D;
        try {
            C26378Cye cye = cwF.A0B;
            if (!AnonymousClass000.A1O((cye.A0N > 0 ? 1 : (cye.A0N == 0 ? 0 : -1)))) {
                C26378Cye.A06(cye, "Before isSeekable, service player was evicted. Skip refreshing service player state", new Object[0]);
                return null;
            }
            C26204Cub A002 = C26270CwF.A00(cwF);
            C26381Cyh A003 = A002.A0U.A00(cye.A0N);
            if (!(A003 == null || (cuc = A003.A12) == null || (cue = cuc.A01) == null)) {
                return cue.A07.A03;
            }
            return null;
        } catch (RemoteException e) {
            C26378Cye.A05(cwF.A0B, "Error occurs while getCurrentWindowIndex", e, new Object[0]);
        }
    }

    public void A01(long j) {
        int i = (int) j;
        C109005cf.A0U(this.A00, Integer.valueOf(i), new Object[2], i);
    }

    public boolean A02() {
        C26378Cye cye = this.A00;
        if (cye.A0A || cye.A0D.A08) {
            return true;
        }
        return false;
    }
}
