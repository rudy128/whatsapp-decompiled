package X;

/* renamed from: X.1VG  reason: invalid class name */
public enum AnonymousClass1VG {
    TOOLTIP_ADD_PARTICIPANT("in_call_tooltip_cool_off_timestamp", 0),
    TOOLTIP_SCREEN_SHARING("in_call_tooltip_cool_off_timestamp", 1),
    TOOLTIP_AR_EFFECT("in_call_tooltip_cool_off_timestamp", 2),
    BANNER("calling_awareness_banner_cool_off_timestamp", 3);
    
    public final String coolOffKey;
    public final String lastSeenKey;

    /* access modifiers changed from: public */
    static {
        AnonymousClass1VG[] r1;
        A00 = C19780yz.A00(r1);
    }

    /* access modifiers changed from: public */
    AnonymousClass1VG(String str, int i) {
        this.lastSeenKey = r2;
        this.coolOffKey = str;
    }
}
