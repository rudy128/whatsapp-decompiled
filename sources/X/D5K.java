package X;

import android.view.WindowInsetsController;
import java.util.concurrent.atomic.AtomicBoolean;

public final /* synthetic */ class D5K implements WindowInsetsController.OnControllableInsetsChangedListener {
    public final /* synthetic */ AtomicBoolean A00;

    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
        this.A00.set(AnonymousClass000.A1O(i & 8));
    }

    public /* synthetic */ D5K(AtomicBoolean atomicBoolean) {
        this.A00 = atomicBoolean;
    }
}
