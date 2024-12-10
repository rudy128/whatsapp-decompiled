package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.2BZ  reason: invalid class name */
public final class AnonymousClass2BZ extends C23577Bm6 implements AnonymousClass3MI {
    public static final int ACTIVE_MODE_UPTIME_MILLIS_FIELD_NUMBER = 10;
    public static final int ATTEMPT_NUMBER_FIELD_NUMBER = 2;
    public static final int CONNECT_SERVER_TIME_MILLIS_FIELD_NUMBER = 5;
    public static final int CONNECT_UPTIME_MILLIS_FIELD_NUMBER = 6;
    public static final AnonymousClass2BZ DEFAULT_INSTANCE;
    public static final int DISCONNECTED_FIELD_NUMBER = 15;
    public static final int EXPECTED_FIELD_NUMBER = 3;
    public static final int FIRST_ATTEMPT_CONNECT_UPTIME_MILLIS_FIELD_NUMBER = 9;
    public static final int IS_OFFLINE_COMPLETE_RECEIVED_FIELD_NUMBER = 13;
    public static final int LAST_STANZA_RECEIVED_UPTIME_MILLIS_FIELD_NUMBER = 11;
    public static final int OFFLINE_PREVIEW_UPTIME_MILLIS_FIELD_NUMBER = 7;
    public static final int OLDEST_STANZA_TIME_MILLIS_FIELD_NUMBER = 12;
    public static final int ON_TRICKLE_MODE_FIELD_NUMBER = 14;
    public static volatile C22357B4l PARSER = null;
    public static final int RECEIVED_FIELD_NUMBER = 4;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int STARTED_ON_FOREGROUND_FIELD_NUMBER = 8;
    public long activeModeUptimeMillis_;
    public int attemptNumber_;
    public int bitField0_;
    public long connectServerTimeMillis_;
    public long connectUptimeMillis_;
    public boolean disconnected_;
    public AnonymousClass2BJ expected_;
    public long firstAttemptConnectUptimeMillis_;
    public boolean isOfflineCompleteReceived_;
    public long lastStanzaReceivedUptimeMillis_;
    public long offlinePreviewUptimeMillis_;
    public long oldestStanzaTimeMillis_;
    public boolean onTrickleMode_;
    public AnonymousClass2BJ received_;
    public String sessionId_ = "";
    public boolean startedOnForeground_;

    static {
        AnonymousClass2BZ r1 = new AnonymousClass2BZ();
        DEFAULT_INSTANCE = r1;
        C23577Bm6.A0E(r1, AnonymousClass2BZ.class);
    }

    public AnonymousClass2BJ BRS() {
        AnonymousClass2BJ r0 = this.expected_;
        if (r0 == null) {
            return AnonymousClass2BJ.DEFAULT_INSTANCE;
        }
        return r0;
    }

    public AnonymousClass2BJ BXy() {
        AnonymousClass2BJ r0 = this.received_;
        if (r0 == null) {
            return AnonymousClass2BJ.DEFAULT_INSTANCE;
        }
        return r0;
    }

    public boolean BcV() {
        return AnonymousClass000.A1O(this.bitField0_ & 512);
    }

    public boolean Bce() {
        return AnonymousClass000.A1O(this.bitField0_ & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
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
                A1Z[1] = "sessionId_";
                A1Z[2] = "attemptNumber_";
                A1Z[3] = "expected_";
                A1Z[4] = "received_";
                A1Z[5] = "connectServerTimeMillis_";
                A1Z[6] = "connectUptimeMillis_";
                A1Z[7] = "offlinePreviewUptimeMillis_";
                A1Z[8] = "startedOnForeground_";
                A1Z[9] = "firstAttemptConnectUptimeMillis_";
                A1Z[10] = "activeModeUptimeMillis_";
                A1Z[11] = "lastStanzaReceivedUptimeMillis_";
                A1Z[12] = "oldestStanzaTimeMillis_";
                A1Z[13] = "isOfflineCompleteReceived_";
                A1Z[14] = "onTrickleMode_";
                A1Z[15] = "disconnected_";
                return C23577Bm6.A0B(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဃ\u0004\u0006ဃ\u0005\u0007ဃ\u0006\bဇ\u0007\tဃ\b\nဃ\t\u000bဃ\n\fဃ\u000b\rဇ\f\u000eဇ\r\u000fဇ\u000e", A1Z);
            case 3:
                return new AnonymousClass2BZ();
            case 4:
                return new AnonymousClass2B0();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C22357B4l b4l2 = PARSER;
                if (b4l2 != null) {
                    return b4l2;
                }
                synchronized (AnonymousClass2BZ.class) {
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

    public long BMS() {
        return this.activeModeUptimeMillis_;
    }

    public int BNB() {
        return this.attemptNumber_;
    }

    public long BPD() {
        return this.connectServerTimeMillis_;
    }

    public long BPE() {
        return this.connectUptimeMillis_;
    }

    public boolean BQi() {
        return this.disconnected_;
    }

    public long BRk() {
        return this.firstAttemptConnectUptimeMillis_;
    }

    public boolean BTN() {
        return this.isOfflineCompleteReceived_;
    }

    public long BTs() {
        return this.lastStanzaReceivedUptimeMillis_;
    }

    public long BVa() {
        return this.offlinePreviewUptimeMillis_;
    }

    public long BVd() {
        return this.oldestStanzaTimeMillis_;
    }

    public boolean BVl() {
        return this.onTrickleMode_;
    }

    public String BZ4() {
        return this.sessionId_;
    }

    public boolean BZZ() {
        return this.startedOnForeground_;
    }
}
