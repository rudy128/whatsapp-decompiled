package X;

public enum C17 implements E68 {
    UNKNOWN_APP(0),
    OTA(1),
    BUG_REPORTER(2),
    LIVE_STREAMING(3),
    VIDEO_CALLING(4),
    MEDIA_IMPORT(5),
    CLOUD_CONFIGURATION(6),
    CAPTURE(7),
    ASSISTANT(8),
    PHONE_CALL(9),
    AUDIO_PLAYBACK(10),
    SHARING(11),
    PAIRING(13),
    APP_MANAGER(14),
    BT_MESSAGING(15),
    AUDIO_DATA_COLLECTION(16),
    VERIFIED_SESSIONS(17),
    AUTOCAPTURE(18),
    WIFI(19),
    CLOUD_OTA(20),
    CAPTURE_VIDEO(21),
    HEARING(22),
    MEDIA_PROCESSING(23),
    LOCATION_SERVICE(24),
    SG_ML_RUNTIME(25),
    HOME_AP_TELEMETRY(26),
    STREAMING_SDK(27),
    MMAI_LIVE(28),
    WARP_CALLING(29),
    WORKOUT(30),
    TRANSLATION(31),
    WARP_SDK(32),
    WIRELESS_INSIGHT_NON_APP(101),
    RETAIL_DEMO_PLAYBACK(501),
    EXAMPLE(1001),
    TEST1(1002),
    CONSTELLATION_MEDIA_CAPTURE(2001),
    EXTERNAL_DEVICE_INTERFACE(2002),
    AI_MEMORY_ASSISTANT(2003),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BVW() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw BE7.A0X();
    }

    /* access modifiers changed from: public */
    C17(int i) {
        this.value = i;
    }

    public static C17 A00(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_APP;
            case 1:
                return OTA;
            case 2:
                return BUG_REPORTER;
            case 3:
                return LIVE_STREAMING;
            default:
                return VIDEO_CALLING;
        }
    }
}
