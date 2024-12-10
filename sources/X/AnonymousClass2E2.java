package X;

/* renamed from: X.2E2  reason: invalid class name */
public final class AnonymousClass2E2 extends C26821Tp {
    public final String index;
    public final byte[] mutationMac;
    public final C62382rJ operation;
    public final int reason;
    public final C166378cn syncActionValue;
    public final C19999A2n syncdKeyId;
    public final int version;

    public AnonymousClass2E2(C62382rJ r3, C19999A2n a2n, C166378cn r5, String str, Throwable th, byte[] bArr, int i, int i2) {
        super(AnonymousClass001.A1I("MalformedMutationException with reason ", AnonymousClass000.A10(), i), th);
        this.reason = i;
        this.index = str;
        this.version = i2;
        this.mutationMac = bArr;
        this.syncdKeyId = a2n;
        this.operation = r3;
        this.syncActionValue = r5;
    }

    public String getMessage() {
        return super.getMessage();
    }
}
