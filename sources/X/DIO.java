package X;

import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class DIO implements E5D {
    public final C22995BYv A00;

    public DIO(C22995BYv bYv) {
        this.A00 = bYv;
    }

    public final void accept(Object obj, Object obj2) {
        ((TaskCompletionSource) obj2).setResult(((C23018BZu) obj).A0B(this.A00.A08));
    }
}
