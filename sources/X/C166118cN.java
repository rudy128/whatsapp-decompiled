package X;

/* renamed from: X.8cN  reason: invalid class name and case insensitive filesystem */
public final class C166118cN extends C23577Bm6 implements C22356B4k {
    public static final int AVATAR_METADATA_FIELD_NUMBER = 1;
    public static final int BOT_METRICS_METADATA_FIELD_NUMBER = 17;
    public static final int CAPABILITY_METADATA_FIELD_NUMBER = 13;
    public static final C166118cN DEFAULT_INSTANCE;
    public static final int IMAGINE_METADATA_FIELD_NUMBER = 14;
    public static final int INVOKER_JID_FIELD_NUMBER = 5;
    public static final int MEMORY_METADATA_FIELD_NUMBER = 15;
    public static final int MEMU_METADATA_FIELD_NUMBER = 7;
    public static final int MESSAGE_DISCLAIMER_TEXT_FIELD_NUMBER = 11;
    public static final int MODEL_METADATA_FIELD_NUMBER = 10;
    public static volatile C22357B4l PARSER = null;
    public static final int PERSONA_ID_FIELD_NUMBER = 2;
    public static final int PLUGIN_METADATA_FIELD_NUMBER = 3;
    public static final int PROGRESS_INDICATOR_METADATA_FIELD_NUMBER = 12;
    public static final int RENDERING_METADATA_FIELD_NUMBER = 16;
    public static final int SEARCH_METADATA_FIELD_NUMBER = 6;
    public static final int SUGGESTED_PROMPT_METADATA_FIELD_NUMBER = 4;
    public C165488bE avatarMetadata_;
    public int bitField0_;
    public C164338Yl botMetricsMetadata_;
    public AnonymousClass8XR capabilityMetadata_;
    public AnonymousClass8XU imagineMetadata_;
    public String invokerJid_ = "";
    public C164698Zv memoryMetadata_;
    public AnonymousClass8XD memuMetadata_;
    public String messageDisclaimerText_ = "";
    public C164348Ym modelMetadata_;
    public String personaId_ = "";
    public C165988cA pluginMetadata_;
    public AnonymousClass8XV progressIndicatorMetadata_;
    public AnonymousClass8XF renderingMetadata_;
    public C164378Yp searchMetadata_;
    public C165188aj suggestedPromptMetadata_;

    static {
        C166118cN r1 = new C166118cN();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166118cN.class);
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(16);
                A1Z[1] = "avatarMetadata_";
                A1Z[2] = "personaId_";
                A1Z[3] = "pluginMetadata_";
                A1Z[4] = "suggestedPromptMetadata_";
                A1Z[5] = "invokerJid_";
                A1Z[6] = "searchMetadata_";
                A1Z[7] = "memuMetadata_";
                A1Z[8] = "modelMetadata_";
                A1Z[9] = "messageDisclaimerText_";
                A1Z[10] = "progressIndicatorMetadata_";
                A1Z[11] = "capabilityMetadata_";
                A1Z[12] = "imagineMetadata_";
                A1Z[13] = "memoryMetadata_";
                A1Z[14] = "renderingMetadata_";
                A1Z[15] = "botMetricsMetadata_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\nဉ\u0007\u000bဈ\b\fဉ\t\rဉ\n\u000eဉ\u000b\u000fဉ\f\u0010ဉ\r\u0011ဉ\u000e", A1Z);
            case 3:
                return new C166118cN();
            case 4:
                return new AnonymousClass8Rr();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166118cN.class) {
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
