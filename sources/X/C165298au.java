package X;

/* renamed from: X.8au  reason: invalid class name and case insensitive filesystem */
public final class C165298au extends C23577Bm6 implements C22356B4k {
    public static final C165298au DEFAULT_INSTANCE;
    public static final int DOWNLOAD_AUDIO_FIELD_NUMBER = 2;
    public static final int DOWNLOAD_DOCUMENTS_FIELD_NUMBER = 4;
    public static final int DOWNLOAD_IMAGES_FIELD_NUMBER = 1;
    public static final int DOWNLOAD_VIDEO_FIELD_NUMBER = 3;
    public static volatile C22357B4l PARSER;
    public int bitField0_;
    public boolean downloadAudio_;
    public boolean downloadDocuments_;
    public boolean downloadImages_;
    public boolean downloadVideo_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Bm6, X.8au] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, C165298au.class);
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
                A1a[1] = "downloadImages_";
                A1a[2] = "downloadAudio_";
                A1a[3] = "downloadVideo_";
                A1a[4] = "downloadDocuments_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", A1a);
            case 3:
                return new C23577Bm6();
            case 4:
                return new AnonymousClass8UB();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165298au.class) {
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
