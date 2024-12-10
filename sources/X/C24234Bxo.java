package X;

/* renamed from: X.Bxo  reason: case insensitive filesystem */
public enum C24234Bxo {
    RAW_GYROSCOPE(5),
    RAW_ACCELEROMETER(6),
    RAW_MAGNETOMETER(7);
    
    public final int mCppValue;

    /* access modifiers changed from: public */
    static {
        new C24234Bxo("UNKNOWN", 0, 0);
        new C24234Bxo("ATTITUDE", 1, 1);
        new C24234Bxo("GRAVITY", 2, 2);
        new C24234Bxo("ACCELERATION", 3, 3);
        new C24234Bxo("ROTATION_RATE", 4, 4);
        RAW_GYROSCOPE = new C24234Bxo("RAW_GYROSCOPE", 5, 5);
        RAW_ACCELEROMETER = new C24234Bxo("RAW_ACCELEROMETER", 6, 6);
        RAW_MAGNETOMETER = new C24234Bxo("RAW_MAGNETOMETER", 7, 7);
    }

    /* access modifiers changed from: public */
    C24234Bxo(int i) {
        this.mCppValue = i;
    }
}
