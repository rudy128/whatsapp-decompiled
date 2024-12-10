package X;

/* renamed from: X.2BQ  reason: invalid class name */
public final class AnonymousClass2BQ extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass2BQ DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int PRIVATEKEY_FIELD_NUMBER = 3;
    public static final int PUBLICKEY_FIELD_NUMBER = 2;
    public static final int SIGNATURE_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_FIELD_NUMBER = 5;
    public int bitField0_;
    public int id_;
    public DSQ privateKey_;
    public DSQ publicKey_;
    public DSQ signature_;
    public long timestamp_;

    static {
        AnonymousClass2BQ r1 = new AnonymousClass2BQ();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2BQ.class);
    }

    public AnonymousClass2BQ() {
        DSQ dsq = DSQ.A00;
        this.publicKey_ = dsq;
        this.privateKey_ = dsq;
        this.signature_ = dsq;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(6);
                A1Z[1] = "id_";
                A1Z[2] = "publicKey_";
                A1Z[3] = "privateKey_";
                A1Z[4] = "signature_";
                A1Z[5] = "timestamp_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005စ\u0004", A1Z);
            case 3:
                return new AnonymousClass2BQ();
            case 4:
                return new C45672Az();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2BQ.class) {
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
