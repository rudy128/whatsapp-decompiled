package X;

/* renamed from: X.8Yr  reason: invalid class name and case insensitive filesystem */
public final class C164398Yr extends C23577Bm6 implements C22356B4k {
    public static final C164398Yr DEFAULT_INSTANCE;
    public static final int EMBEDDED_MESSAGE_FIELD_NUMBER = 1;
    public static final int EMBEDDED_MUSIC_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public int contentCase_ = 0;
    public Object content_;

    static {
        C164398Yr r1 = new C164398Yr();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164398Yr.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[5];
                objArr[0] = "content_";
                AnonymousClass8BU.A1P(objArr, "contentCase_");
                objArr[3] = C164408Ys.class;
                objArr[4] = C165998cB.class;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", objArr);
            case 3:
                return new C164398Yr();
            case 4:
                return new AnonymousClass8SB();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164398Yr.class) {
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
