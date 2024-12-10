package X;

/* renamed from: X.8aM  reason: invalid class name and case insensitive filesystem */
public final class C164958aM extends C23577Bm6 implements C22356B4k {
    public static final int CLIENT_HELLO_HANDSHAKE_MATERIAL_FIELD_NUMBER = 1;
    public static final C164958aM DEFAULT_INSTANCE;
    public static final int IPLS_CLIENT_REQUEST_ENCRYPTED_PAYLOAD_FIELD_NUMBER = 2;
    public static final int IV_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public AnonymousClass8c0 clientHelloHandshakeMaterial_;
    public DSQ iplsClientRequestEncryptedPayload_;
    public DSQ iv_;

    static {
        C164958aM r1 = new C164958aM();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164958aM.class);
    }

    public C164958aM() {
        DSQ dsq = DSQ.A00;
        this.iplsClientRequestEncryptedPayload_ = dsq;
        this.iv_ = dsq;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = AnonymousClass8BW.A1Z();
                A1Z[1] = "clientHelloHandshakeMaterial_";
                A1Z[2] = "iplsClientRequestEncryptedPayload_";
                A1Z[3] = "iv_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", A1Z);
            case 3:
                return new C164958aM();
            case 4:
                return new AnonymousClass8UM();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164958aM.class) {
                    b4l = PARSER;
                    if (b4l == null) {
                        C26105CsP csP = DNE.A01;
                        b4l = C17880vN.A0F(DEFAULT_INSTANCE);
                        PARSER = b4l;
                    }
                }
                return b4l;
            default:
                throw C17880vN.A0y();
        }
    }
}
