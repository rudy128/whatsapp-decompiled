package X;

import com.facebook.msys.mci.Execution;

/* renamed from: X.1HP  reason: invalid class name */
public class AnonymousClass1HP implements Runnable {
    public final /* synthetic */ int A00;

    public AnonymousClass1HP(int i) {
        this.A00 = i;
    }

    public void run() {
        Execution.nativeStartExecutor(this.A00);
    }
}
