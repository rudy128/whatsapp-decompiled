package X;

/* renamed from: X.8av  reason: invalid class name and case insensitive filesystem */
public final class C165308av extends C23577Bm6 implements C22356B4k {
    public static final int ASSOCIATION_TYPE_FOR_MESSAGE_ASSOCIATION_FIELD_NUMBER = 4;
    public static final int BOTMESSAGEINFO_FIELD_NUMBER = 1;
    public static final int CALLLOGMESSAGEINFO_FIELD_NUMBER = 3;
    public static final C165308av DEFAULT_INSTANCE;
    public static final int EDIT_VERSION_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER;
    public int associationTypeForMessageAssociation_;
    public int bitField0_;
    public C164118Xp botMessageInfo_;
    public C164128Xq callLogMessageInfo_;
    public int editVersion_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.8av, X.Bm6] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, C165308av.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1a = AnonymousClass8BW.A1a();
                A1a[1] = "botMessageInfo_";
                A1a[2] = "editVersion_";
                A1a[3] = "callLogMessageInfo_";
                A1a[4] = "associationTypeForMessageAssociation_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001\u0003ဉ\u0002\u0004ဋ\u0003", A1a);
            case 3:
                return new C23577Bm6();
            case 4:
                return new AnonymousClass8UU();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165308av.class) {
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
