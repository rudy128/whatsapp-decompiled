package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import androidx.fragment.app.Fragment;

/* renamed from: X.7Pm  reason: invalid class name and case insensitive filesystem */
public final class C146537Pm implements Runnable {
    public Throwable A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ Fragment A02;
    public final /* synthetic */ Runnable A03;

    public C146537Pm(Handler handler, Fragment fragment, Runnable runnable) {
        this.A02 = fragment;
        this.A01 = handler;
        this.A03 = runnable;
        Thread currentThread = Thread.currentThread();
        StringBuilder sb = new StringBuilder("Runnable instantiated on thread id: ");
        sb.append(currentThread.getId());
        sb.append(", name: ");
        this.A00 = new Throwable(AnonymousClass000.A0y(currentThread.getName(), sb));
    }

    public void run() {
        try {
            Fragment fragment = this.A02;
            Context A1n = fragment.A1n();
            boolean z = true;
            boolean A1W = AnonymousClass000.A1W(fragment.A0B);
            boolean A1X = AnonymousClass000.A1X(A1n);
            if (!(A1n instanceof ContextWrapper) || ((ContextWrapper) A1n).getBaseContext() != null) {
                z = false;
            }
            if (!A1W || A1X || z) {
                this.A01.post(this);
            } else {
                this.A03.run();
            }
        } catch (Throwable th) {
            Throwable th2 = this.A00;
            C26294Cx6.A07("CDSThreadTracing", "--- start debug trace");
            C26294Cx6.A0B("CDSThreadTracing", "Thread tracing stacktrace", th2);
            C26294Cx6.A07("CDSThreadTracing", "--- end debug trace");
            throw th;
        }
    }
}
