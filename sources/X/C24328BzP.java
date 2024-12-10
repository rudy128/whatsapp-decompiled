package X;

/* renamed from: X.BzP  reason: case insensitive filesystem */
public enum C24328BzP {
    NORMAL_MODE("normal"),
    LOW_MEMORY_MODE("low"),
    FALLBACK_MODE("critical");
    
    public final String loggingValue;

    /* access modifiers changed from: public */
    static {
        C24328BzP[] bzPArr;
        A00 = C19780yz.A00(bzPArr);
    }

    /* access modifiers changed from: public */
    C24328BzP(String str) {
        this.loggingValue = str;
    }
}
