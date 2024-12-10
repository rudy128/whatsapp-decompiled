package X;

/* renamed from: X.1O9  reason: invalid class name */
public abstract class AnonymousClass1O9 extends Exception implements AnonymousClass1O8 {
    public final Throwable cause;
    public final String message;

    public /* synthetic */ boolean A02() {
        return ((AnonymousClass1UI) this).isRecoverable;
    }

    public static AnonymousClass1UI A00(C62672rm r1) {
        return new AnonymousClass1UI(r1.A00);
    }

    public AnonymousClass1O9(String str, Throwable th) {
        super(str, th);
        this.message = str;
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public String getMessage() {
        return this.message;
    }
}
