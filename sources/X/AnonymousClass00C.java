package X;

import android.content.Context;
import java.lang.Thread;

/* renamed from: X.00C  reason: invalid class name */
public class AnonymousClass00C implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler A00 = Thread.getDefaultUncaughtExceptionHandler();
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass007 A02;
    public final /* synthetic */ C17930vS A03;

    public AnonymousClass00C(Context context, AnonymousClass007 r3, C17930vS r4) {
        this.A02 = r3;
        this.A01 = context;
        this.A03 = r4;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        AnonymousClass197.A02(AnonymousClass197.A00(this.A01, this.A03, th), this.A00, thread, th);
    }
}
