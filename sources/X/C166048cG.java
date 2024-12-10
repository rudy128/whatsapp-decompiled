package X;

/* renamed from: X.8cG  reason: invalid class name and case insensitive filesystem */
public final class C166048cG extends C23577Bm6 implements C22356B4k {
    public static final int BOT_MESSAGE_SECRET_FIELD_NUMBER = 6;
    public static final int BOT_METADATA_FIELD_NUMBER = 7;
    public static final int CAPI_CREATED_GROUP_FIELD_NUMBER = 11;
    public static final C166048cG DEFAULT_INSTANCE;
    public static final int DEVICE_LIST_METADATA_FIELD_NUMBER = 1;
    public static final int DEVICE_LIST_METADATA_VERSION_FIELD_NUMBER = 2;
    public static final int MESSAGE_ADD_ON_DURATION_IN_SECS_FIELD_NUMBER = 5;
    public static final int MESSAGE_ADD_ON_EXPIRY_TYPE_FIELD_NUMBER = 9;
    public static final int MESSAGE_ASSOCIATION_FIELD_NUMBER = 10;
    public static final int MESSAGE_SECRET_FIELD_NUMBER = 3;
    public static final int PADDING_BYTES_FIELD_NUMBER = 4;
    public static volatile C22357B4l PARSER = null;
    public static final int REPORTING_TOKEN_VERSION_FIELD_NUMBER = 8;
    public static final int SUPPORT_PAYLOAD_FIELD_NUMBER = 12;
    public int bitField0_;
    public DSQ botMessageSecret_;
    public C166118cN botMetadata_;
    public boolean capiCreatedGroup_;
    public int deviceListMetadataVersion_;
    public C165958c6 deviceListMetadata_;
    public int messageAddOnDurationInSecs_;
    public int messageAddOnExpiryType_ = 1;
    public C164938aJ messageAssociation_;
    public DSQ messageSecret_;
    public DSQ paddingBytes_;
    public int reportingTokenVersion_;
    public String supportPayload_ = "";

    static {
        C166048cG r1 = new C166048cG();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166048cG.class);
    }

    public C166048cG() {
        DSQ dsq = DSQ.A00;
        this.messageSecret_ = dsq;
        this.paddingBytes_ = dsq;
        this.botMessageSecret_ = dsq;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(14);
                A1Z[1] = "deviceListMetadata_";
                A1Z[2] = "deviceListMetadataVersion_";
                A1Z[3] = "messageSecret_";
                A1Z[4] = "paddingBytes_";
                A1Z[5] = "messageAddOnDurationInSecs_";
                A1Z[6] = "botMessageSecret_";
                A1Z[7] = "botMetadata_";
                A1Z[8] = "reportingTokenVersion_";
                A1Z[9] = "messageAddOnExpiryType_";
                A1Z[10] = C20415AKe.A00;
                A1Z[11] = "messageAssociation_";
                A1Z[12] = "capiCreatedGroup_";
                A1Z[13] = "supportPayload_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဋ\u0004\u0006ည\u0005\u0007ဉ\u0006\bင\u0007\tဌ\b\nဉ\t\u000bဇ\n\fဈ\u000b", A1Z);
            case 3:
                return new C166048cG();
            case 4:
                return new C163938Wx();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166048cG.class) {
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
