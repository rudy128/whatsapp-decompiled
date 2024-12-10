package X;

/* renamed from: X.BzN  reason: case insensitive filesystem */
public enum C24326BzN {
    Dummy(0),
    AREngine_ForcePhase4Audio(5),
    WorldTracker_ARCoreSupported(6),
    WorldTracker_EnableHitTestWithDepth(16);
    
    public final int mCppValue;

    public static void A00(String str, Object[] objArr, int i) {
        objArr[i] = new C24326BzN(str, i, i);
    }

    /* access modifiers changed from: public */
    C24326BzN(int i) {
        this.mCppValue = i;
    }
}
