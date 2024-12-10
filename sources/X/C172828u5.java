package X;

/* renamed from: X.8u5  reason: invalid class name and case insensitive filesystem */
public final class C172828u5 extends C173518vD {
    public final Throwable cause;
    public final boolean isRecoverable = true;
    public final String suppressedReason = "Suppressed by ABProps";

    public C172828u5(Throwable th) {
        super("Suppressed by ABProps", "CLIENT", "mex-unknown-error", th, 417);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
