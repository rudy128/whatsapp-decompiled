package X;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.DTe  reason: case insensitive filesystem */
public abstract class C27079DTe implements Runnable {
    public final TaskCompletionSource a;

    public C27079DTe() {
        this.a = null;
    }

    public C27079DTe(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.a;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public static Parcel A00(C26395Cyv cyv) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(cyv.A00);
        obtain.writeInt(1);
        return obtain;
    }

    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }
}
