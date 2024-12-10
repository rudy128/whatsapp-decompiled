package X;

/* renamed from: X.Bzj  reason: case insensitive filesystem */
public enum C24348Bzj {
    CLOSED(0),
    LOST(1),
    ENCRYPTION_FAILED(2),
    SETUP_FAILED(3),
    AUTHENTICATION_FAILED(4),
    PEER_AUTHENTICATION_FAILED(5),
    UNSUPPORTED_TYPE(6);
    
    public final int code;

    /* access modifiers changed from: public */
    static {
        C24348Bzj[] bzjArr;
        A00 = C19780yz.A00(bzjArr);
    }

    /* access modifiers changed from: public */
    C24348Bzj(int i) {
        this.code = i;
    }
}
