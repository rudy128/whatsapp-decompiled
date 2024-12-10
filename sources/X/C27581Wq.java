package X;

/* renamed from: X.1Wq  reason: invalid class name and case insensitive filesystem */
public enum C27581Wq {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;
    
    public static final C27591Wr Companion = null;

    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Object, X.1Wr] */
    /* access modifiers changed from: public */
    static {
        Companion = new Object();
    }

    public final C23401Fx A00() {
        switch (ordinal()) {
            case 0:
            case 4:
                return C23401Fx.CREATED;
            case 1:
            case 3:
                return C23401Fx.STARTED;
            case 2:
                return C23401Fx.RESUMED;
            case 5:
                return C23401Fx.DESTROYED;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(" has no target state");
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
