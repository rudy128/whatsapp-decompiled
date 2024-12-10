package X;

/* renamed from: X.8bp  reason: invalid class name and case insensitive filesystem */
public final class C165828bp extends C23577Bm6 implements C22356B4k {
    public static final int AMOUNT_1000_FIELD_NUMBER = 2;
    public static final int AMOUNT_FIELD_NUMBER = 6;
    public static final int BACKGROUND_FIELD_NUMBER = 7;
    public static final int CURRENCY_CODE_ISO4217_FIELD_NUMBER = 1;
    public static final C165828bp DEFAULT_INSTANCE;
    public static final int EXPIRY_TIMESTAMP_FIELD_NUMBER = 5;
    public static final int NOTE_MESSAGE_FIELD_NUMBER = 4;
    public static volatile C22357B4l PARSER = null;
    public static final int REQUEST_FROM_FIELD_NUMBER = 3;
    public long amount1000_;
    public C164948aK amount_;
    public C165978c9 background_;
    public int bitField0_;
    public String currencyCodeIso4217_ = "";
    public long expiryTimestamp_;
    public C166418cr noteMessage_;
    public String requestFrom_ = "";

    static {
        C165828bp r1 = new C165828bp();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165828bp.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(8);
                A1Z[1] = "currencyCodeIso4217_";
                A1Z[2] = "amount1000_";
                A1Z[3] = "requestFrom_";
                A1Z[4] = "noteMessage_";
                A1Z[5] = "expiryTimestamp_";
                A1Z[6] = "amount_";
                A1Z[7] = "background_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဃ\u0002\u0003ဈ\u0003\u0004ဉ\u0000\u0005ဂ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", A1Z);
            case 3:
                return new C165828bp();
            case 4:
                return new C163008Ti();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165828bp.class) {
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
