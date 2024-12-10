package X;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* renamed from: X.2wP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C65422wP implements Continuation {
    public static final /* synthetic */ C65422wP A00 = new Object();

    public final Object then(Task task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(String.valueOf(task.getException()))));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }
}
