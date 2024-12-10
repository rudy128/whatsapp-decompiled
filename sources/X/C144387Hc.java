package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.7Hc  reason: invalid class name and case insensitive filesystem */
public class C144387Hc implements C1606889n {
    public final int A00;
    public final Object A01;

    public C144387Hc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C7F(Bitmap bitmap, boolean z) {
        ImageView imageView;
        Bitmap A27;
        VideoSurfaceView videoSurfaceView;
        switch (this.A00) {
            case 0:
                MediaComposerFragment mediaComposerFragment = (MediaComposerFragment) this.A01;
                C18070vi.A0d(bitmap, 1);
                if (C18020vd.A05(C18040vf.A02, C108955ca.A0R(mediaComposerFragment.A2B()), 11003) && (imageView = mediaComposerFragment.A03) != null) {
                    A27 = mediaComposerFragment.A27(bitmap);
                    break;
                } else {
                    return;
                }
            case 1:
                ((ImageComposerFragment) this.A01).A01 = bitmap;
                return;
            default:
                VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this.A01;
                C18070vi.A0d(bitmap, 1);
                AnonymousClass70X r0 = videoComposerFragment.A0W;
                View view = null;
                if (r0 != null) {
                    view = r0.A09();
                }
                if ((view instanceof VideoSurfaceView) && (videoSurfaceView = (VideoSurfaceView) view) != null) {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("VideoView/setVideoDimensions: ");
                    A10.append(width);
                    C17900vP.A0j("x", A10, height);
                    videoSurfaceView.A07 = width;
                    videoSurfaceView.A06 = height;
                    videoSurfaceView.setBackground(C108965cb.A05(bitmap, videoSurfaceView));
                }
                if (VideoComposerFragment.A0G(videoComposerFragment) && (imageView = videoComposerFragment.A03) != null) {
                    A27 = videoComposerFragment.A27(bitmap);
                    break;
                } else {
                    return;
                }
                break;
        }
        imageView.setImageBitmap(A27);
    }

    public /* synthetic */ void BCw() {
    }

    public /* synthetic */ void Bti() {
    }
}
