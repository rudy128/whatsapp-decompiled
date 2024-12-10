package X;

import com.facebook.cameracore.ardelivery.listener.CancelableToken;
import java.util.concurrent.atomic.AtomicBoolean;

public final /* synthetic */ class AIL implements CancelableToken {
    public final /* synthetic */ AtomicBoolean A00;

    public final boolean cancel() {
        AtomicBoolean atomicBoolean = this.A00;
        C18070vi.A0d(atomicBoolean, 0);
        return atomicBoolean.compareAndSet(false, true);
    }

    public /* synthetic */ AIL(AtomicBoolean atomicBoolean) {
        this.A00 = atomicBoolean;
    }
}
