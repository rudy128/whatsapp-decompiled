package X;

/* renamed from: X.2R6  reason: invalid class name */
public enum AnonymousClass2R6 implements E68 {
    SYNC_TO_DEVICE(0),
    NOT_SYNC_TO_DEVICE(1),
    UNRECOGNIZED(-1);
    
    public final int value;

    public final int BVW() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw AnonymousClass000.A0k("Can't get the number of an unknown enum value.");
    }

    /* access modifiers changed from: public */
    AnonymousClass2R6(int i) {
        this.value = i;
    }
}
