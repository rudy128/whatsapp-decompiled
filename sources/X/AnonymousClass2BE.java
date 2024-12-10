package X;

/* renamed from: X.2BE  reason: invalid class name */
public final class AnonymousClass2BE extends C23577Bm6 implements C22356B4k {
    public static final int CONTACT_METADATA_ENCRYPTED_FIELD_NUMBER = 3;
    public static final AnonymousClass2BE DEFAULT_INSTANCE;
    public static final int IV_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public DSQ contactMetadataEncrypted_;
    public DSQ iv_;
    public int keyId_;

    static {
        AnonymousClass2BE r1 = new AnonymousClass2BE();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2BE.class);
    }

    public AnonymousClass2BE() {
        DSQ dsq = DSQ.A00;
        this.iv_ = dsq;
        this.contactMetadataEncrypted_ = dsq;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(4);
                A1Z[1] = "iv_";
                A1Z[2] = "keyId_";
                A1Z[3] = "contactMetadataEncrypted_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဋ\u0001\u0003ည\u0002", A1Z);
            case 3:
                return new AnonymousClass2BE();
            case 4:
                return new AnonymousClass2Ad();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2BE.class) {
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
