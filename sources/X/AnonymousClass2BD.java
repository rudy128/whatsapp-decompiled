package X;

/* renamed from: X.2BD  reason: invalid class name */
public final class AnonymousClass2BD extends C23577Bm6 implements C22356B4k {
    public static final int ADV_SECRET_FIELD_NUMBER = 3;
    public static final int COMPANION_IDENTITY_KEY_FIELD_NUMBER = 2;
    public static final int COMPANION_PUBLIC_KEY_FIELD_NUMBER = 1;
    public static final AnonymousClass2BD DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER;
    public DSQ advSecret_;
    public int bitField0_;
    public DSQ companionIdentityKey_;
    public DSQ companionPublicKey_;

    static {
        AnonymousClass2BD r1 = new AnonymousClass2BD();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2BD.class);
    }

    public AnonymousClass2BD() {
        DSQ dsq = DSQ.A00;
        this.companionPublicKey_ = dsq;
        this.companionIdentityKey_ = dsq;
        this.advSecret_ = dsq;
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
                A1Z[1] = "companionPublicKey_";
                A1Z[2] = "companionIdentityKey_";
                A1Z[3] = "advSecret_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", A1Z);
            case 3:
                return new AnonymousClass2BD();
            case 4:
                return new C45452Ab();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2BD.class) {
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
