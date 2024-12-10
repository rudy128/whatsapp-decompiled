package X;

import com.facebook.cameracore.util.Reference;
import java.util.concurrent.atomic.AtomicBoolean;

public class DB2 implements Reference {
    public final DB3 A00;
    public final AtomicBoolean A01 = C108965cb.A0w();

    public void finalize() {
        if (!this.A01.getAndSet(true)) {
            this.A00.release();
        }
    }

    public Object get() {
        if (!this.A01.get()) {
            return this.A00.get();
        }
        throw AnonymousClass000.A0n("Accessing released reference.");
    }

    public void release() {
        if (!this.A01.getAndSet(true)) {
            this.A00.release();
            return;
        }
        throw AnonymousClass000.A0n("Reference was already released.");
    }

    public DB2(DB3 db3) {
        this.A00 = db3;
    }
}
