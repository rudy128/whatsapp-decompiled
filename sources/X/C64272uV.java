package X;

import android.media.MediaScannerConnection;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2uV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C64272uV implements MediaScannerConnection.OnScanCompletedListener {
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ AtomicInteger A01;

    public final void onScanCompleted(String str, Uri uri) {
        AtomicInteger atomicInteger = this.A01;
        Runnable runnable = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("fmessageio/rescan/scan completed: file=");
        A10.append(str);
        C17900vP.A0Y(uri, " uri=", A10);
        if (atomicInteger.decrementAndGet() <= 0 && runnable != null) {
            runnable.run();
        }
    }

    public /* synthetic */ C64272uV(Runnable runnable, AtomicInteger atomicInteger) {
        this.A01 = atomicInteger;
        this.A00 = runnable;
    }
}
