package X;

/* renamed from: X.8af  reason: invalid class name and case insensitive filesystem */
public final class C165148af extends C23577Bm6 implements C22356B4k {
    public static final int CURRENT_INDEX_FIELD_NUMBER = 2;
    public static final C165148af DEFAULT_INSTANCE;
    public static final int DEVICE_INDEXES_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER = null;
    public static final int RAW_ID_FIELD_NUMBER = 1;
    public int bitField0_;
    public int currentIndex_;
    public int deviceIndexesMemoizedSerializedSize = -1;
    public C28667EDj deviceIndexes_ = Bm7.A02;
    public int rawId_;

    static {
        C165148af r1 = new C165148af();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C165148af.class);
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
                A1Z[1] = "rawId_";
                A1Z[2] = "currentIndex_";
                A1Z[3] = "deviceIndexes_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003+", A1Z);
            case 3:
                return new C165148af();
            case 4:
                return new AnonymousClass8SO();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165148af.class) {
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
