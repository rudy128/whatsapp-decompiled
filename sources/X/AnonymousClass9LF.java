package X;

/* renamed from: X.9LF  reason: invalid class name */
public class AnonymousClass9LF extends Exception {
    public final Exception innerException;

    public String toString() {
        return this.innerException.toString();
    }

    public AnonymousClass9LF(Exception exc) {
        this.innerException = exc;
    }
}
