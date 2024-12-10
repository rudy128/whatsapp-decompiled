package X;

/* renamed from: X.8c4  reason: invalid class name */
public final class AnonymousClass8c4 extends C23577Bm6 implements C22356B4k {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 1;
    public static final AnonymousClass8c4 DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int END_TIME_FIELD_NUMBER = 8;
    public static final int EXTRA_GUESTS_ALLOWED_FIELD_NUMBER = 9;
    public static final int IS_CANCELED_FIELD_NUMBER = 2;
    public static final int JOIN_LINK_FIELD_NUMBER = 6;
    public static final int LOCATION_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 7;
    public int bitField0_;
    public C166278cd contextInfo_;
    public String description_ = "";
    public long endTime_;
    public boolean extraGuestsAllowed_;
    public boolean isCanceled_;
    public String joinLink_ = "";
    public C166028cE location_;
    public String name_ = "";
    public long startTime_;

    static {
        AnonymousClass8c4 r1 = new AnonymousClass8c4();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass8c4.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(10);
                A1Z[1] = "contextInfo_";
                A1Z[2] = "isCanceled_";
                A1Z[3] = "name_";
                A1Z[4] = "description_";
                A1Z[5] = "location_";
                A1Z[6] = "joinLink_";
                A1Z[7] = "startTime_";
                A1Z[8] = "endTime_";
                A1Z[9] = "extraGuestsAllowed_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဂ\u0007\tဇ\b", A1Z);
            case 3:
                return new AnonymousClass8c4();
            case 4:
                return new C162788Sm();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass8c4.class) {
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
