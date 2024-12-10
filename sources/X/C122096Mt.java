package X;

import android.content.Context;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.6Mt  reason: invalid class name and case insensitive filesystem */
public class C122096Mt extends VideoSurfaceView {
    public final /* synthetic */ C122046Mo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C122096Mt(Context context, C122046Mo r2) {
        super(context);
        this.A00 = r2;
    }

    public void start() {
        AnonymousClass88R r0;
        if (A06() && (r0 = this.A00.A0A) != null) {
            r0.C6F();
        }
        super.start();
    }
}
