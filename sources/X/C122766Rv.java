package X;

/* renamed from: X.6Rv  reason: invalid class name and case insensitive filesystem */
public enum C122766Rv implements E68 {
    FUTURE(0),
    MEDIA_ALBUM(1),
    BOT_PLUGIN(2),
    EVENT_COVER_IMAGE(3),
    STATUS_TAPPABLE_MESSAGE(6),
    MEDIA_POLL(7),
    STATUS_ADD_YOURS(8);
    
    public final int value;

    /* access modifiers changed from: public */
    C122766Rv(int i) {
        this.value = i;
    }

    public static C122766Rv A00(int i) {
        if (i == 0) {
            return FUTURE;
        }
        if (i == 1) {
            return MEDIA_ALBUM;
        }
        if (i == 2) {
            return BOT_PLUGIN;
        }
        if (i == 3) {
            return EVENT_COVER_IMAGE;
        }
        if (i == 6) {
            return STATUS_TAPPABLE_MESSAGE;
        }
        if (i == 7) {
            return MEDIA_POLL;
        }
        if (i != 8) {
            return null;
        }
        return STATUS_ADD_YOURS;
    }

    public final int BVW() {
        return this.value;
    }
}
