package X;

import android.media.MediaPlayer;
import com.whatsapp.search.views.itemviews.MessageGifVideoPlayer;

/* renamed from: X.66K  reason: invalid class name */
public class AnonymousClass66K extends C42061xY {
    public final C111295jU A00;
    public final C116435xG A01;

    public void A0D() {
        C116435xG r1 = this.A01;
        if (r1 instanceof C120846Fp) {
            MessageGifVideoPlayer messageGifVideoPlayer = ((C120846Fp) r1).A02;
            messageGifVideoPlayer.setVisibility(8);
            MediaPlayer mediaPlayer = messageGifVideoPlayer.A00;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                messageGifVideoPlayer.A00 = null;
                messageGifVideoPlayer.A07 = false;
                messageGifVideoPlayer.A08 = false;
                messageGifVideoPlayer.A09 = false;
            }
        }
    }

    public void A0E(boolean z) {
        this.A01.setScrolling(z);
    }

    public void A0F(boolean z) {
        this.A01.setShouldPlay(z);
    }

    public boolean A0G() {
        if (this.A01 instanceof C120846Fp) {
            return true;
        }
        return false;
    }

    public AnonymousClass66K(C111295jU r1, C116435xG r2) {
        super(r2);
        this.A01 = r2;
        this.A00 = r1;
    }
}
