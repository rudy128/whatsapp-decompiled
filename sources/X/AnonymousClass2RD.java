package X;

/* renamed from: X.2RD  reason: invalid class name */
public enum AnonymousClass2RD implements E68 {
    E2EE(0),
    HOSTED(1);
    
    public final int value;

    public static AnonymousClass2RD A00(int i) {
        if (i == 0) {
            return E2EE;
        }
        if (i != 1) {
            return null;
        }
        return HOSTED;
    }

    /* access modifiers changed from: public */
    AnonymousClass2RD(int i) {
        this.value = i;
    }

    public final int BVW() {
        return this.value;
    }
}
