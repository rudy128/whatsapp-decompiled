package X;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.BZc  reason: case insensitive filesystem */
public final class C23002BZc extends C23004BZe {
    public final C25558Chw A00;
    public final TaskCompletionSource A01;
    public final C28444E1k A02;

    public C23002BZc(C28444E1k e1k, C25558Chw chw, TaskCompletionSource taskCompletionSource, int i) {
        super(i);
        this.A01 = taskCompletionSource;
        this.A00 = chw;
        this.A02 = e1k;
        if (i == 2 && chw.A01) {
            throw AnonymousClass000.A0k("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }
}
