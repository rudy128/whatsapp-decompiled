package X;

/* renamed from: X.C1u  reason: case insensitive filesystem */
public abstract class C24399C1u extends Exception {
    public final int errorCode;
    public final long timestampMs;

    public C24399C1u(String str, Throwable th, int i, long j) {
        super(str, th);
        this.errorCode = i;
        this.timestampMs = j;
    }
}
