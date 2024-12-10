package X;

/* renamed from: X.Bzk  reason: case insensitive filesystem */
public enum C24349Bzk {
    SUCCESS(0),
    STREAM_CLOSED(1),
    INVALID_STREAM_ID(2),
    INVALID_FRAME(3),
    CIPHER_NOT_AVAILABLE(4),
    FRAMING_LOST(5),
    UNSUPPORTED_TYPE(6);
    
    public final int code;

    /* access modifiers changed from: public */
    static {
        C24349Bzk[] bzkArr;
        A00 = C19780yz.A00(bzkArr);
    }

    /* access modifiers changed from: public */
    C24349Bzk(int i) {
        this.code = i;
    }
}
