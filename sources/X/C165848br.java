package X;

/* renamed from: X.8br  reason: invalid class name and case insensitive filesystem */
public final class C165848br extends C23577Bm6 implements C22356B4k {
    public static final C165848br DEFAULT_INSTANCE;
    public static final int ENABLEGLASSESABR_FIELD_NUMBER = 1;
    public static final int MAXSENDQUEUESIZE_FIELD_NUMBER = 8;
    public static final int MONITORINTERVALMS_FIELD_NUMBER = 2;
    public static volatile C22357B4l PARSER = null;
    public static final int QUEUEGROWTHMARGIN_FIELD_NUMBER = 7;
    public static final int QUEUEHIGHTHRESHOLD_FIELD_NUMBER = 6;
    public static final int QUEUELOWTHRESHOLD_FIELD_NUMBER = 5;
    public static final int SCALEDOWNINTERVALMS_FIELD_NUMBER = 3;
    public static final int SCALEUPINTERVALMS_FIELD_NUMBER = 4;
    public boolean enableGlassesAbr_;
    public int maxSendQueueSize_;
    public int monitorIntervalMs_;
    public int queueGrowthMargin_;
    public int queueHighThreshold_;
    public int queueLowThreshold_;
    public int scaleDownIntervalMs_;
    public int scaleUpIntervalMs_;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Bm6, X.8br] */
    static {
        ? bm6 = new C23577Bm6();
        DEFAULT_INSTANCE = bm6;
        C23577Bm6.A0E(bm6, C165848br.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0007\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b\u0006\u000b\u0007\u000b\b\u000b", new Object[]{"enableGlassesAbr_", "monitorIntervalMs_", "scaleDownIntervalMs_", "scaleUpIntervalMs_", "queueLowThreshold_", "queueHighThreshold_", "queueGrowthMargin_", "maxSendQueueSize_"});
            case 3:
                return new C23577Bm6();
            case 4:
                return new AnonymousClass8RT();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C165848br.class) {
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
