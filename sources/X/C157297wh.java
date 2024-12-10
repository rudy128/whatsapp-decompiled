package X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.7wh  reason: invalid class name and case insensitive filesystem */
public final class C157297wh extends AnonymousClass11G implements C18090vk {
    public static final C157297wh A00 = new C157297wh();

    public C157297wh() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        HandlerThread handlerThread = new HandlerThread("BloksScriptDispatchLowPriThread", 10);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }
}
