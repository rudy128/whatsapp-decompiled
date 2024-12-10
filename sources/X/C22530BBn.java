package X;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* renamed from: X.BBn  reason: case insensitive filesystem */
public interface C22530BBn {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, C24898COr cOr, CancellationSignal cancellationSignal, Executor executor, E7A e7a);

    void onGetCredential(Context context, C24740CIc cIc, CancellationSignal cancellationSignal, Executor executor, E7A e7a);
}
