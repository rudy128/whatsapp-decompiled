package X;

/* renamed from: X.4Dd  reason: invalid class name and case insensitive filesystem */
public enum C83044Dd {
    A02("BAD_REQUEST", false),
    A04("GROUP_NOT_FOUND", false),
    A05("GROUP_SUSPENDED", false),
    A07("RATE_LIMITED", true),
    A06("INTERNAL_SERVER_ERROR", true),
    A03("DEFAULT", false);
    
    public final int code;
    public final boolean isRecoverable;

    /* access modifiers changed from: public */
    static {
        C83044Dd[] r1;
        A00 = C19780yz.A00(r1);
    }

    /* access modifiers changed from: public */
    C83044Dd(String str, boolean z) {
        this.code = r2;
        this.isRecoverable = z;
    }
}
