package X;

/* renamed from: X.C1x  reason: case insensitive filesystem */
public final class C24402C1x extends Exception {
    public final int errorCode;
    public final D48 format;
    public final boolean isRecoverable;

    public C24402C1x(D48 d48, int i, boolean z) {
        super(AnonymousClass001.A1I("AudioTrack write failed: ", AnonymousClass000.A10(), i));
        this.isRecoverable = z;
        this.errorCode = i;
        this.format = d48;
    }
}
