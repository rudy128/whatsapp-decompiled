package X;

/* renamed from: X.8bd  reason: invalid class name and case insensitive filesystem */
public final class C165708bd extends C23577Bm6 implements C22356B4k {
    public static final int CALL_VIBRATE_FIELD_NUMBER = 6;
    public static final C165708bd DEFAULT_INSTANCE;
    public static final int LOW_PRIORITY_NOTIFICATIONS_FIELD_NUMBER = 4;
    public static final int MESSAGE_LIGHT_FIELD_NUMBER = 3;
    public static final int MESSAGE_POPUP_FIELD_NUMBER = 2;
    public static final int MESSAGE_VIBRATE_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER = null;
    public static final int REACTIONS_MUTED_FIELD_NUMBER = 5;
    public int bitField0_;
    public String callVibrate_ = "";
    public boolean lowPriorityNotifications_;
    public String messageLight_ = "";
    public String messagePopup_ = "";
    public String messageVibrate_ = "";
    public boolean reactionsMuted_;

    static {
        C165708bd r1 = new C165708bd();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165708bd.class);
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
                A1Z[1] = "messageVibrate_";
                A1Z[2] = "messagePopup_";
                A1Z[3] = "messageLight_";
                A1Z[4] = "lowPriorityNotifications_";
                A1Z[5] = "reactionsMuted_";
                A1Z[6] = "callVibrate_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဈ\u0005", A1Z);
            case 3:
                return new C165708bd();
            case 4:
                return new AnonymousClass8UG();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165708bd.class) {
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
