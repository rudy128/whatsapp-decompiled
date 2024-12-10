package X;

/* renamed from: X.6Rd  reason: invalid class name and case insensitive filesystem */
public enum C122636Rd {
    A05("CALL_ON_HOLD", true),
    A09("MUTED_BY_OTHERS", false),
    A0A("MUTE_REQUEST_FAILED", false),
    A0F("NEW_PARTICIPANT_JOINED", false),
    A0E("NEW_PARTICIPANT_INVITED", false),
    A0H("REMOVE_USER_SUCCESS", false),
    A04("BLOCK_USER_SUCCESS", false),
    A0G("REMOVE_OR_BLOCK_USER_FAILED", false),
    A0I("REMOVING_USER", false),
    A0J("SCREEN_SHARING_STARTED", false),
    A0K("SCREEN_SHARING_STOPPED", false),
    A02("AR_EFFECTS", false),
    A0C("NETWORK_HEALTH_POOR", false),
    A07("HIGH_DATA_USAGE", false),
    A0D("NETWORK_HEALTH_POOR_V2", false),
    A0B("NETWORK_HEALTH_NO_NETWORK", false),
    A0L("VIDEO_UPGRADE_FAILED", false),
    A06("GLASSES_STATUS", false),
    A03("AR_EFFECTS_PERSISTENT", true),
    A08("MUTED", true);
    
    public final boolean isPersistent;
    public final int priority;

    /* access modifiers changed from: public */
    static {
        C122636Rd[] r14;
        A00 = C19780yz.A00(r14);
    }

    /* access modifiers changed from: public */
    C122636Rd(String str, boolean z) {
        this.priority = r2;
        this.isPersistent = z;
    }
}
