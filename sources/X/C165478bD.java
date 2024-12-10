package X;

/* renamed from: X.8bD  reason: invalid class name and case insensitive filesystem */
public final class C165478bD extends C23577Bm6 implements C22356B4k {
    public static final C165478bD DEFAULT_INSTANCE;
    public static final int ISSUER_SERIAL_FIELD_NUMBER = 2;
    public static final int KEY_FIELD_NUMBER = 3;
    public static final int NOT_AFTER_FIELD_NUMBER = 5;
    public static final int NOT_BEFORE_FIELD_NUMBER = 4;
    public static volatile C22357B4l PARSER = null;
    public static final int SERIAL_FIELD_NUMBER = 1;
    public int bitField0_;
    public int issuerSerial_;
    public DSQ key_ = DSQ.A00;
    public long notAfter_;
    public long notBefore_;
    public int serial_;

    static {
        C165478bD r1 = new C165478bD();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165478bD.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1b = AnonymousClass8BW.A1b();
                A1b[1] = "serial_";
                A1b[2] = "issuerSerial_";
                A1b[3] = "key_";
                A1b[4] = "notBefore_";
                A1b[5] = "notAfter_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ည\u0002\u0004ဃ\u0003\u0005ဃ\u0004", A1b);
            case 3:
                return new C165478bD();
            case 4:
                return new C162568Rf();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165478bD.class) {
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
