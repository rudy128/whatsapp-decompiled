package X;

/* renamed from: X.9KY  reason: invalid class name */
public enum AnonymousClass9KY implements E68 {
    UPLOAD_STICKER(0),
    SEND_RECENT_STICKER_BOOTSTRAP(1),
    GENERATE_LINK_PREVIEW(2),
    HISTORY_SYNC_ON_DEMAND(3),
    PLACEHOLDER_MESSAGE_RESEND(4),
    WAFFLE_LINKING_NONCE_FETCH(5),
    FULL_HISTORY_SYNC_ON_DEMAND(6),
    COMPANION_META_NONCE_FETCH(7);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass9KY(int i) {
        this.value = i;
    }

    public static AnonymousClass9KY A00(int i) {
        switch (i) {
            case 0:
                return UPLOAD_STICKER;
            case 1:
                return SEND_RECENT_STICKER_BOOTSTRAP;
            case 2:
                return GENERATE_LINK_PREVIEW;
            case 3:
                return HISTORY_SYNC_ON_DEMAND;
            case 4:
                return PLACEHOLDER_MESSAGE_RESEND;
            case 5:
                return WAFFLE_LINKING_NONCE_FETCH;
            case 6:
                return FULL_HISTORY_SYNC_ON_DEMAND;
            case 7:
                return COMPANION_META_NONCE_FETCH;
            default:
                return null;
        }
    }

    public final int BVW() {
        return this.value;
    }
}
