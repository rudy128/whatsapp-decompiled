package X;

import com.whatsapp.gifvideopreview.GifVideoPreviewActivity;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.801  reason: invalid class name */
public final class AnonymousClass801 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ GifVideoPreviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass801(GifVideoPreviewActivity gifVideoPreviewActivity) {
        super(1);
        this.this$0 = gifVideoPreviewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (C18070vi.A18(obj, C139696zI.A00)) {
            GifVideoPreviewActivity gifVideoPreviewActivity = this.this$0;
            if (!gifVideoPreviewActivity.isFinishing()) {
                VideoSurfaceView videoSurfaceView = gifVideoPreviewActivity.A06;
                if (videoSurfaceView != null) {
                    videoSurfaceView.start();
                }
                C72453Mb.A1D(gifVideoPreviewActivity.A00);
            }
        }
        return C27621Wu.A00;
    }
}
