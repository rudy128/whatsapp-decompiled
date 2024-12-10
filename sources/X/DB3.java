package X;

import com.facebook.cameracore.util.Reference;
import java.util.concurrent.atomic.AtomicInteger;

public class DB3 implements Reference {
    public CN2 A00;
    public Object A01;
    public final AtomicInteger A02 = new AtomicInteger(1);

    public void release() {
        int i = 0;
        do {
            AtomicInteger atomicInteger = this.A02;
            int i2 = atomicInteger.get();
            if (i2 == 0) {
                throw AnonymousClass000.A0n("Too many calls to CountedReference#release");
            } else if (!atomicInteger.compareAndSet(i2, i2 - 1)) {
                i++;
            } else if (i2 == 1) {
                CN2 cn2 = this.A00;
                ((CX6) this.A01).A00();
                cn2.A00.offer(this);
                return;
            } else {
                return;
            }
        } while (i < 10);
        throw AnonymousClass8BR.A0w("WTF: Could not release the reference after multiple tries.");
    }

    public void finalize() {
        if (this.A02.getAndSet(0) > 0) {
            CN2 cn2 = this.A00;
            ((CX6) this.A01).A00();
            cn2.A00.offer(this);
        }
    }

    public Object get() {
        if (this.A02.get() > 0) {
            return this.A01;
        }
        throw AnonymousClass000.A0n("Accessing released reference.");
    }

    public DB3(CN2 cn2, Object obj) {
        this.A01 = obj;
        this.A00 = cn2;
    }
}
