package X;

public abstract class BSD extends C26766DCv {
    public void finalize() {
        if (!isClosed()) {
            Object[] A1b = AnonymousClass3MW.A1b();
            A1b[0] = C108955ca.A0x(this);
            AnonymousClass000.A1M(A1b, System.identityHashCode(this));
            C26265CwA.A06("CloseableImage", "finalize: %s %x still open.", A1b);
            close();
        }
    }
}
