package X;

/* renamed from: X.Bzh  reason: case insensitive filesystem */
public enum C24346Bzh {
    SUCCESS(0),
    BUFFER_TOO_SMALL(1),
    FRAME_INCOMPLETE(2),
    FRAME_INVALID(3),
    SIGNATURE_INVALID(4),
    FAILED(5);
    
    public final int rawValue;

    /* access modifiers changed from: public */
    static {
        C24346Bzh[] bzhArr;
        A00 = C19780yz.A00(bzhArr);
    }

    /* access modifiers changed from: public */
    C24346Bzh(int i) {
        this.rawValue = i;
    }
}
