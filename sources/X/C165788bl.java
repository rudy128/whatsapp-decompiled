package X;

/* renamed from: X.8bl  reason: invalid class name and case insensitive filesystem */
public final class C165788bl extends C23577Bm6 implements C22356B4k {
    public static final int CALENDAR_FIELD_NUMBER = 7;
    public static final int DAY_OF_MONTH_FIELD_NUMBER = 4;
    public static final int DAY_OF_WEEK_FIELD_NUMBER = 1;
    public static final C165788bl DEFAULT_INSTANCE;
    public static final int HOUR_FIELD_NUMBER = 5;
    public static final int MINUTE_FIELD_NUMBER = 6;
    public static final int MONTH_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int YEAR_FIELD_NUMBER = 2;
    public int bitField0_;
    public int calendar_ = 1;
    public int dayOfMonth_;
    public int dayOfWeek_ = 1;
    public int hour_;
    public int minute_;
    public int month_;
    public int year_;

    static {
        C165788bl r1 = new C165788bl();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165788bl.class);
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
                A1Z[1] = "dayOfWeek_";
                A1Z[2] = AKH.A00;
                A1Z[3] = "year_";
                A1Z[4] = "month_";
                A1Z[5] = "dayOfMonth_";
                A1Z[6] = "hour_";
                A1Z[7] = "minute_";
                A1Z[8] = "calendar_";
                A1Z[9] = AKG.A00;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဌ\u0006", A1Z);
            case 3:
                return new C165788bl();
            case 4:
                return new C162858St();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165788bl.class) {
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
