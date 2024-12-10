package X;

/* renamed from: X.9KC  reason: invalid class name */
public enum AnonymousClass9KC implements E68 {
    GET(0),
    PUT(1),
    DELETE(2),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BVW() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw AnonymousClass000.A0k("Can't get the number of an unknown enum value.");
    }

    /* access modifiers changed from: public */
    AnonymousClass9KC(int i) {
        this.value = i;
    }
}
