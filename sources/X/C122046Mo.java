package X;

import android.content.Context;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.6Mo  reason: invalid class name and case insensitive filesystem */
public class C122046Mo extends AnonymousClass70X {
    public final VideoSurfaceView A00;

    public C122046Mo(Context context, String str, boolean z) {
        C122096Mt r2 = new C122096Mt(context, this);
        this.A00 = r2;
        r2.setVideoPath(str);
        r2.A09 = new AnonymousClass75S(this, 0);
        r2.A08 = new AnonymousClass75Q(this, 3);
        r2.setLooping(z);
    }
}
