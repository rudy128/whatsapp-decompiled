package X;

import android.view.Choreographer;

/* renamed from: X.0RU  reason: invalid class name */
public final class AnonymousClass0RU implements Choreographer.FrameCallback {
    public final /* synthetic */ AnonymousClass0VZ A00;
    public final /* synthetic */ C22821Di A01;
    public final /* synthetic */ C31761g5 A02;

    public AnonymousClass0RU(AnonymousClass0VZ r1, C22821Di r2, C31761g5 r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void doFrame(long j) {
        Object obj;
        C31761g5 r2 = this.A02;
        try {
            obj = this.A01.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            obj = C30691eM.A00(th);
        }
        r2.resumeWith(obj);
    }
}
