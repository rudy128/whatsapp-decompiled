package X;

/* renamed from: X.2BH  reason: invalid class name */
public final class AnonymousClass2BH extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass2BH DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int PRIVATEKEY_FIELD_NUMBER = 3;
    public static final int PUBLICKEY_FIELD_NUMBER = 2;
    public int bitField0_;
    public int id_;
    public DSQ privateKey_;
    public DSQ publicKey_;

    static {
        AnonymousClass2BH r1 = new AnonymousClass2BH();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2BH.class);
    }

    public AnonymousClass2BH() {
        DSQ dsq = DSQ.A00;
        this.publicKey_ = dsq;
        this.privateKey_ = dsq;
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
                A1Z[1] = "id_";
                A1Z[2] = "publicKey_";
                A1Z[3] = "privateKey_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001\u0003ည\u0002", A1Z);
            case 3:
                return new AnonymousClass2BH();
            case 4:
                return new C45652Ax();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2BH.class) {
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
