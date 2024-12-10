package X;

/* renamed from: X.8bx  reason: invalid class name and case insensitive filesystem */
public final class C165908bx extends C23577Bm6 implements C22356B4k {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 5;
    public static final int CORRECT_ANSWER_FIELD_NUMBER = 8;
    public static final C165908bx DEFAULT_INSTANCE;
    public static final int ENC_KEY_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int POLL_MEDIA_TYPE_FIELD_NUMBER = 6;
    public static final int POLL_TYPE_FIELD_NUMBER = 7;
    public static final int SELECTABLE_OPTIONS_COUNT_FIELD_NUMBER = 4;
    public int bitField0_;
    public C166278cd contextInfo_;
    public AnonymousClass8ZD correctAnswer_;
    public DSQ encKey_ = DSQ.A00;
    public String name_ = "";
    public EE9 options_ = C23579Bm9.A02;
    public int pollMediaType_ = 1;
    public int pollType_;
    public int selectableOptionsCount_;

    static {
        C165908bx r1 = new C165908bx();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165908bx.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(12);
                A1Z[1] = "encKey_";
                A1Z[2] = "name_";
                A1Z[3] = "options_";
                A1Z[4] = AnonymousClass8ZD.class;
                A1Z[5] = "selectableOptionsCount_";
                A1Z[6] = "contextInfo_";
                A1Z[7] = "pollMediaType_";
                A1Z[8] = AKW.A00;
                A1Z[9] = "pollType_";
                A1Z[10] = AKV.A00;
                A1Z[11] = "correctAnswer_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဋ\u0002\u0005ဉ\u0003\u0006ဌ\u0004\u0007ဌ\u0005\bဉ\u0006", A1Z);
            case 3:
                return new C165908bx();
            case 4:
                return new AnonymousClass8TY();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165908bx.class) {
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
