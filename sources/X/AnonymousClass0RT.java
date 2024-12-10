package X;

import android.view.Choreographer;

/* renamed from: X.0RT  reason: invalid class name */
public final class AnonymousClass0RT implements Choreographer.FrameCallback {
    public final /* synthetic */ C22821Di A00;
    public final /* synthetic */ C31761g5 A01;

    public AnonymousClass0RT(C22821Di r1, C31761g5 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void doFrame(long j) {
        Object obj;
        C31761g5 r2 = this.A01;
        C05640Vc r0 = C05640Vc.A01;
        try {
            obj = this.A00.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            obj = C30691eM.A00(th);
        }
        r2.resumeWith(obj);
    }
}
