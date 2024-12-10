package X;

/* renamed from: X.2RF  reason: invalid class name */
public enum AnonymousClass2RF implements E68 {
    Android(0),
    SMBA(1),
    IPhone(2),
    SMBI(3),
    WEB(4),
    UWP(5),
    DARWIN(6);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass2RF(int i) {
        this.value = i;
    }

    public static AnonymousClass2RF A00(int i) {
        switch (i) {
            case 0:
                return Android;
            case 1:
                return SMBA;
            case 2:
                return IPhone;
            case 3:
                return SMBI;
            case 4:
                return WEB;
            case 5:
                return UWP;
            case 6:
                return DARWIN;
            default:
                return null;
        }
    }

    public final int BVW() {
        return this.value;
    }
}
