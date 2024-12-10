package X;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.Dc9  reason: case insensitive filesystem */
public class C27337Dc9 extends FutureTask {
    public final /* synthetic */ C27078DTd A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27337Dc9(C27078DTd dTd, Callable callable) {
        super(callable);
        this.A00 = dTd;
    }

    public void done() {
        try {
            Object obj = get();
            C27078DTd dTd = this.A00;
            if (!dTd.A03.get()) {
                dTd.A00(obj);
            }
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (ExecutionException e2) {
            throw BE6.A0o("An error occurred while executing doInBackground()", e2.getCause());
        } catch (CancellationException unused) {
            C27078DTd dTd2 = this.A00;
            if (!dTd2.A03.get()) {
                dTd2.A00((Object) null);
            }
        } catch (Throwable th) {
            throw BE6.A0o("An error occurred while executing doInBackground()", th);
        }
    }
}
