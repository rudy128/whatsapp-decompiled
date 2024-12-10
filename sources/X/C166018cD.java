package X;

/* renamed from: X.8cD  reason: invalid class name and case insensitive filesystem */
public final class C166018cD extends C23577Bm6 implements C22356B4k {
    public static final C166018cD DEFAULT_INSTANCE;
    public static final int DOCUMENT_TYPES_FIELD_NUMBER = 10;
    public static final int FEATURES_FIELD_NUMBER = 11;
    public static volatile C22357B4l PARSER = null;
    public static final int SUPPORTS_DOCUMENT_MESSAGES_FIELD_NUMBER = 3;
    public static final int SUPPORTS_E2E_AUDIO_FIELD_NUMBER = 8;
    public static final int SUPPORTS_E2E_DOCUMENT_FIELD_NUMBER = 9;
    public static final int SUPPORTS_E2E_IMAGE_FIELD_NUMBER = 6;
    public static final int SUPPORTS_E2E_VIDEO_FIELD_NUMBER = 7;
    public static final int SUPPORTS_MEDIA_RETRY_FIELD_NUMBER = 5;
    public static final int SUPPORTS_STARRED_MESSAGES_FIELD_NUMBER = 2;
    public static final int SUPPORTS_URL_MESSAGES_FIELD_NUMBER = 4;
    public static final int USES_PARTICIPANT_IN_KEY_FIELD_NUMBER = 1;
    public int bitField0_;
    public String documentTypes_ = "";
    public DSQ features_ = DSQ.A00;
    public boolean supportsDocumentMessages_;
    public boolean supportsE2EAudio_;
    public boolean supportsE2EDocument_;
    public boolean supportsE2EImage_;
    public boolean supportsE2EVideo_;
    public boolean supportsMediaRetry_;
    public boolean supportsStarredMessages_;
    public boolean supportsUrlMessages_;
    public boolean usesParticipantInKey_;

    static {
        C166018cD r1 = new C166018cD();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166018cD.class);
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
                A1Z[1] = "usesParticipantInKey_";
                A1Z[2] = "supportsStarredMessages_";
                A1Z[3] = "supportsDocumentMessages_";
                A1Z[4] = "supportsUrlMessages_";
                A1Z[5] = "supportsMediaRetry_";
                A1Z[6] = "supportsE2EImage_";
                A1Z[7] = "supportsE2EVideo_";
                A1Z[8] = "supportsE2EAudio_";
                A1Z[9] = "supportsE2EDocument_";
                A1Z[10] = "documentTypes_";
                A1Z[11] = "features_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဈ\t\u000bည\n", A1Z);
            case 3:
                return new C166018cD();
            case 4:
                return new C163688Vy();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166018cD.class) {
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
