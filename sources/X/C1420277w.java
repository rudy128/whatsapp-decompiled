package X;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView;
import com.whatsapp.search.views.itemviews.MessageGifVideoPlayer;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.77w  reason: invalid class name and case insensitive filesystem */
public class C1420277w implements TextureView.SurfaceTextureListener {
    public final int A00;
    public final Object A01;

    public C1420277w(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        switch (this.A00) {
            case 0:
                AnonymousClass6UI r2 = (AnonymousClass6UI) this.A01;
                DRB drb = r2.A01;
                if (drb != null) {
                    drb.A0B(surfaceTexture);
                    r2.A01.A0D(surfaceTexture, i, i2);
                    r2.A01.setCornerRadius(r2.A00);
                    return;
                }
                return;
            case 1:
                MessageGifVideoPlayer messageGifVideoPlayer = (MessageGifVideoPlayer) this.A01;
                messageGifVideoPlayer.A01 = new Surface(surfaceTexture);
                MessageGifVideoPlayer.A03(messageGifVideoPlayer);
                MediaPlayer mediaPlayer = messageGifVideoPlayer.A00;
                if (mediaPlayer != null) {
                    mediaPlayer.setSurface(messageGifVideoPlayer.A01);
                    return;
                }
                return;
            default:
                C121986Mi r3 = (C121986Mi) this.A01;
                if (r3.A09 != null) {
                    Surface surface = new Surface(surfaceTexture);
                    r3.A0A = surface;
                    r3.A09.setSurface(surface);
                    if (r3.A00 == 0) {
                        try {
                            r3.A09.setDataSource(r3.A0B);
                            r3.A09.prepareAsync();
                            r3.A00 = 1;
                            return;
                        } catch (IOException e) {
                            r3.A00 = -1;
                            r3.A03 = -1;
                            if (r3.A07 != null) {
                                r3.post(new AnonymousClass7RJ(this, 20));
                            }
                            Log.e("mediaview/unable-to-play", e);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.A00) {
            case 0:
                DRB drb = ((AnonymousClass6UI) this.A01).A01;
                if (drb == null) {
                    return true;
                }
                drb.A0C(surfaceTexture);
                return true;
            case 1:
                MessageGifVideoPlayer messageGifVideoPlayer = (MessageGifVideoPlayer) this.A01;
                MediaPlayer mediaPlayer = messageGifVideoPlayer.A00;
                if (mediaPlayer != null) {
                    mediaPlayer.setSurface((Surface) null);
                    MessageGifVideoPlayer.A02(messageGifVideoPlayer);
                }
                Surface surface = messageGifVideoPlayer.A01;
                C17960vV.A07(surface);
                surface.release();
                messageGifVideoPlayer.A01 = null;
                return true;
            default:
                C121986Mi r2 = (C121986Mi) this.A01;
                MediaPlayer mediaPlayer2 = r2.A09;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setSurface((Surface) null);
                }
                Surface surface2 = r2.A0A;
                if (surface2 != null) {
                    surface2.release();
                    r2.A0A = null;
                }
                r2.A0H = false;
                return false;
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        switch (this.A00) {
            case 0:
                DRB drb = ((AnonymousClass6UI) this.A01).A01;
                if (drb != null) {
                    drb.A0D(surfaceTexture, i, i2);
                    return;
                }
                return;
            case 1:
                MessageGifVideoPlayer.A03((MessageGifVideoPlayer) this.A01);
                return;
            default:
                return;
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (2 - this.A00 == 0) {
            C121986Mi r5 = (C121986Mi) this.A01;
            if (!r5.A0H) {
                r5.A0H = AnonymousClass000.A1R((surfaceTexture.getTimestamp() > 0 ? 1 : (surfaceTexture.getTimestamp() == 0 ? 0 : -1)));
            }
        }
    }
}
