package X;

import android.media.MediaCodec;
import android.os.HandlerThread;

public final class D97 implements C28492E3x {
    public final C27271Vk A00;
    public final C27271Vk A01;
    public final boolean A02;

    public D97(boolean z) {
        DMl dMl = new DMl(0);
        DMl dMl2 = new DMl(1);
        this.A00 = dMl;
        this.A01 = dMl2;
        this.A02 = z;
    }

    public static /* synthetic */ HandlerThread A00() {
        return new HandlerThread(AnonymousClass000.A0y("Video", BE6.A0u("ExoPlayer:MediaCodecAsyncAdapter:")));
    }

    public static /* synthetic */ HandlerThread A01() {
        return new HandlerThread(AnonymousClass000.A0y("Video", BE6.A0u("ExoPlayer:MediaCodecQueueingThread:")));
    }

    public D99 A02(String str) {
        try {
            C25304Cd8.A01(AnonymousClass001.A1H("createCodec:", str, AnonymousClass000.A10()));
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            try {
                D99 d99 = new D99(createByCodecName, (HandlerThread) this.A00.get(), (HandlerThread) this.A01.get(), this.A02);
                try {
                    C25304Cd8.A00();
                    return d99;
                } catch (Exception e) {
                    d99.release();
                    throw e;
                }
            } catch (Exception e2) {
                if (createByCodecName != null) {
                    createByCodecName.release();
                }
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    public C28610EAe BH9(String str, boolean z) {
        throw AnonymousClass04E.createAndThrow();
    }
}
