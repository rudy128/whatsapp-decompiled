package X;

/* renamed from: X.8cm  reason: invalid class name and case insensitive filesystem */
public final class C166368cm extends C23577Bm6 implements C22356B4k {
    public static final int APP_STATE_FATAL_EXCEPTION_NOTIFICATION_FIELD_NUMBER = 10;
    public static final int APP_STATE_SYNC_KEY_REQUEST_FIELD_NUMBER = 8;
    public static final int APP_STATE_SYNC_KEY_SHARE_FIELD_NUMBER = 7;
    public static final int BOT_FEEDBACK_MESSAGE_FIELD_NUMBER = 18;
    public static final int CLOUD_API_THREAD_CONTROL_NOTIFICATION_FIELD_NUMBER = 22;
    public static final C166368cm DEFAULT_INSTANCE;
    public static final int DISAPPEARING_MODE_FIELD_NUMBER = 11;
    public static final int EDITED_MESSAGE_FIELD_NUMBER = 14;
    public static final int EPHEMERAL_EXPIRATION_FIELD_NUMBER = 4;
    public static final int EPHEMERAL_SETTING_TIMESTAMP_FIELD_NUMBER = 5;
    public static final int HISTORY_SYNC_NOTIFICATION_FIELD_NUMBER = 6;
    public static final int INITIAL_SECURITY_NOTIFICATION_SETTING_SYNC_FIELD_NUMBER = 9;
    public static final int INVOKER_JID_FIELD_NUMBER = 19;
    public static final int KEY_FIELD_NUMBER = 1;
    public static final int MEDIA_NOTIFY_MESSAGE_FIELD_NUMBER = 21;
    public static volatile C22357B4l PARSER = null;
    public static final int PEER_DATA_OPERATION_REQUEST_MESSAGE_FIELD_NUMBER = 16;
    public static final int PEER_DATA_OPERATION_REQUEST_RESPONSE_MESSAGE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_MS_FIELD_NUMBER = 15;
    public static final int TYPE_FIELD_NUMBER = 2;
    public C164448Yw appStateFatalExceptionNotification_;
    public AnonymousClass8XG appStateSyncKeyRequest_;
    public AnonymousClass2B3 appStateSyncKeyShare_;
    public int bitField0_;
    public C165648bX botFeedbackMessage_;
    public C165238ao cloudApiThreadControlNotification_;
    public C166328ci disappearingMode_;
    public C166418cr editedMessage_;
    public int ephemeralExpiration_;
    public long ephemeralSettingTimestamp_;
    public C166088cK historySyncNotification_;
    public C164008Xe initialSecurityNotificationSettingSync_;
    public String invokerJid_ = "";
    public C166408cq key_;
    public C164728Zy mediaNotifyMessage_;
    public C165678ba peerDataOperationRequestMessage_;
    public C164878aD peerDataOperationRequestResponseMessage_;
    public long timestampMs_;
    public int type_;

    static {
        C166368cm r1 = new C166368cm();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, C166368cm.class);
    }

    public C179839Kc A0R() {
        C179839Kc A00 = C179839Kc.A00(this.type_);
        if (A00 == null) {
            return C179839Kc.REVOKE;
        }
        return A00;
    }

    public final Object A0P(Integer num, Object obj) {
        C22357B4l b4l;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C17890vO.A1Z(20);
                A1Z[1] = "key_";
                A1Z[2] = "type_";
                A1Z[3] = AKX.A00;
                A1Z[4] = "ephemeralExpiration_";
                A1Z[5] = "ephemeralSettingTimestamp_";
                A1Z[6] = "historySyncNotification_";
                A1Z[7] = "appStateSyncKeyShare_";
                A1Z[8] = "appStateSyncKeyRequest_";
                A1Z[9] = "initialSecurityNotificationSettingSync_";
                A1Z[10] = "appStateFatalExceptionNotification_";
                A1Z[11] = "disappearingMode_";
                A1Z[12] = "editedMessage_";
                A1Z[13] = "timestampMs_";
                A1Z[14] = "peerDataOperationRequestMessage_";
                A1Z[15] = "peerDataOperationRequestResponseMessage_";
                A1Z[16] = "botFeedbackMessage_";
                A1Z[17] = "invokerJid_";
                A1Z[18] = "mediaNotifyMessage_";
                A1Z[19] = "cloudApiThreadControlNotification_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u0012\u0000\u0001\u0001\u0016\u0012\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0004ဋ\u0002\u0005ဂ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000bဉ\t\u000eဉ\n\u000fဂ\u000b\u0010ဉ\f\u0011ဉ\r\u0012ဉ\u000e\u0013ဈ\u000f\u0015ဉ\u0010\u0016ဉ\u0011", A1Z);
            case 3:
                return new C166368cm();
            case 4:
                return new C163898Wt();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (C166368cm.class) {
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
