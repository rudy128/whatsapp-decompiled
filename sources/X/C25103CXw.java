package X;

import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.CXw  reason: case insensitive filesystem */
public final class C25103CXw {
    public CopyOnWriteArraySet A00 = new CopyOnWriteArraySet();

    public void A00() {
        if (!this.A00.isEmpty()) {
            C26078Crs.A00(C27082DTh.A00(this, 27));
        }
    }

    public Object clone() {
        throw new CloneNotSupportedException("CameraLifecycleNotifier is a singleton and cannot be cloned!");
    }
}
