package X;

/* renamed from: X.8c1  reason: invalid class name */
public final class AnonymousClass8c1 extends C23577Bm6 implements C22356B4k {
    public static final AnonymousClass8c1 DEFAULT_INSTANCE;
    public static final int HEK_KEY_SIGNATURE_FIELD_NUMBER = 3;
    public static final int HEK_PUB_FIELD_NUMBER = 1;
    public static final int HK_KEY_SIGNATURE_FIELD_NUMBER = 4;
    public static final int HK_PUB_FIELD_NUMBER = 2;
    public static final int HSM_CHALLENGE_FIELD_NUMBER = 5;
    public static final int KEM_PUB_FIELD_NUMBER = 6;
    public static final int KEM_PUB_SIGNATURE_FIELD_NUMBER = 7;
    public static volatile C22357B4l PARSER = null;
    public static final int SESSION_ID_SIGNATURE_FIELD_NUMBER = 8;
    public int bitField0_;
    public DSQ hekKeySignature_;
    public DSQ hekPub_;
    public DSQ hkKeySignature_;
    public DSQ hkPub_;
    public DSQ hsmChallenge_;
    public DSQ kemPubSignature_;
    public DSQ kemPub_;
    public DSQ sessionIdSignature_;

    static {
        AnonymousClass8c1 r1 = new AnonymousClass8c1();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8c1.class);
    }

    public AnonymousClass8c1() {
        DSQ dsq = DSQ.A00;
        this.hekPub_ = dsq;
        this.hkPub_ = dsq;
        this.hekKeySignature_ = dsq;
        this.hkKeySignature_ = dsq;
        this.hsmChallenge_ = dsq;
        this.kemPub_ = dsq;
        this.kemPubSignature_ = dsq;
        this.sessionIdSignature_ = dsq;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(9);
                A1Z[1] = "hekPub_";
                A1Z[2] = "hkPub_";
                A1Z[3] = "hekKeySignature_";
                A1Z[4] = "hkKeySignature_";
                A1Z[5] = "hsmChallenge_";
                A1Z[6] = "kemPub_";
                A1Z[7] = "kemPubSignature_";
                A1Z[8] = "sessionIdSignature_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ည\u0004\u0006ည\u0005\u0007ည\u0006\bည\u0007", A1Z);
            case 3:
                return new AnonymousClass8c1();
            case 4:
                return new AnonymousClass8UR();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8c1.class) {
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
