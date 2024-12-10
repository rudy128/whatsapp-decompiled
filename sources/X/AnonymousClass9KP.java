package X;

/* renamed from: X.9KP  reason: invalid class name */
public enum AnonymousClass9KP implements E68 {
    UNDEFINED(0),
    REACTION(1),
    EVENT_RESPONSE(2),
    POLL_UPDATE(3),
    PIN_IN_CHAT(4);
    
    public final int value;

    public static AnonymousClass9KP A00(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return REACTION;
        }
        if (i == 2) {
            return EVENT_RESPONSE;
        }
        if (i == 3) {
            return POLL_UPDATE;
        }
        if (i != 4) {
            return null;
        }
        return PIN_IN_CHAT;
    }

    /* access modifiers changed from: public */
    AnonymousClass9KP(int i) {
        this.value = i;
    }

    public final int BVW() {
        return this.value;
    }
}
