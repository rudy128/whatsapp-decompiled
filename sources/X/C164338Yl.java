package X;

/* renamed from: X.8Yl  reason: invalid class name and case insensitive filesystem */
public final class C164338Yl extends C23577Bm6 implements C22356B4k {
    public static final C164338Yl DEFAULT_INSTANCE;
    public static final int DESTINATION_ENTRY_POINT_FIELD_NUMBER = 2;
    public static final int DESTINATION_ID_FIELD_NUMBER = 1;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public int destinationEntryPoint_ = 2;
    public String destinationId_ = "";

    static {
        C164338Yl r1 = new C164338Yl();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164338Yl.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = AnonymousClass8BW.A1Z();
                A1Z[1] = "destinationId_";
                A1Z[2] = "destinationEntryPoint_";
                A1Z[3] = C20402AJp.A00;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", A1Z);
            case 3:
                return new C164338Yl();
            case 4:
                return new AnonymousClass8Rs();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164338Yl.class) {
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
