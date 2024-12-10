package X;

/* renamed from: X.8Zq  reason: invalid class name and case insensitive filesystem */
public final class C164648Zq extends C23577Bm6 implements C22356B4k {
    public static final C164648Zq DEFAULT_INSTANCE;
    public static volatile C22357B4l PARSER = null;
    public static final int RANK_FIELD_NUMBER = 2;
    public static final int USER_JID_FIELD_NUMBER = 1;
    public int bitField0_;
    public byte memoizedIsInitialized = 2;
    public int rank_;
    public String userJid_ = "";

    static {
        C164648Zq r1 = new C164648Zq();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C164648Zq.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        int i = 1;
        switch (num.intValue()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                if (obj == null) {
                    i = 0;
                }
                this.memoizedIsInitialized = (byte) i;
                return null;
            case 2:
                Object[] A1R = AnonymousClass8BS.A1R(4);
                A1R[1] = "userJid_";
                A1R[2] = "rank_";
                A1R[3] = C20421AKk.A00;
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဌ\u0001", A1R);
            case 3:
                return new C164648Zq();
            case 4:
                return new AnonymousClass8UE();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C164648Zq.class) {
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
