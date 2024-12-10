package X;

/* renamed from: X.8bc  reason: invalid class name and case insensitive filesystem */
public final class C165698bc extends C23577Bm6 implements C22356B4k {
    public static final int ACCESSIBILITY_LABEL_FIELD_NUMBER = 4;
    public static final C165698bc DEFAULT_INSTANCE;
    public static final int EMOJIS_FIELD_NUMBER = 3;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    public static final int IS_ANIMATED_FIELD_NUMBER = 2;
    public static final int IS_LOTTIE_FIELD_NUMBER = 5;
    public static final int MIMETYPE_FIELD_NUMBER = 6;
    public static volatile C22357B4l PARSER;
    public String accessibilityLabel_ = "";
    public int bitField0_;
    public EE9 emojis_ = C23579Bm9.A02;
    public String fileName_ = "";
    public boolean isAnimated_;
    public boolean isLottie_;
    public String mimetype_ = "";

    static {
        C165698bc r1 = new C165698bc();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165698bc.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(7);
                A1Z[1] = "fileName_";
                A1Z[2] = "isAnimated_";
                A1Z[3] = "emojis_";
                A1Z[4] = "accessibilityLabel_";
                A1Z[5] = "isLottie_";
                A1Z[6] = "mimetype_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004ဈ\u0002\u0005ဇ\u0003\u0006ဈ\u0004", A1Z);
            case 3:
                return new C165698bc();
            case 4:
                return new C163078Tp();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165698bc.class) {
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
