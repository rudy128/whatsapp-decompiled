package X;

/* renamed from: X.8bX  reason: invalid class name and case insensitive filesystem */
public final class C165648bX extends C23577Bm6 implements C22356B4k {
    public static final C165648bX DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 2;
    public static final int KIND_NEGATIVE_FIELD_NUMBER = 4;
    public static final int KIND_POSITIVE_FIELD_NUMBER = 5;
    public static final int KIND_REPORT_FIELD_NUMBER = 6;
    public static final int MESSAGE_KEY_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 3;
    public int bitField0_;
    public long kindNegative_;
    public long kindPositive_;
    public int kindReport_;
    public int kind_;
    public C166408cq messageKey_;
    public String text_ = "";

    static {
        C165648bX r1 = new C165648bX();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165648bX.class);
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
                A1Z[1] = "messageKey_";
                A1Z[2] = "kind_";
                A1Z[3] = AK3.A00;
                A1Z[4] = "text_";
                A1Z[5] = "kindNegative_";
                A1Z[6] = "kindPositive_";
                A1Z[7] = "kindReport_";
                A1Z[8] = AK4.A00;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဃ\u0003\u0005ဃ\u0004\u0006ဌ\u0005", A1Z);
            case 3:
                return new C165648bX();
            case 4:
                return new AnonymousClass8ST();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165648bX.class) {
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
