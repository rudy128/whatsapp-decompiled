package X;

/* renamed from: X.9Iv  reason: invalid class name and case insensitive filesystem */
public enum C179659Iv {
    A04("NONE", 1),
    A05("REQUESTER_ACCOUNT_DELETED", 3),
    A08("REQUESTER_NOT_AUTHORIZED", 5),
    A07("REQUESTER_FORBIDDEN", 5),
    A0A("REQUEST_DELETED", 3),
    A06("REQUESTER_ALREADY_IN_GROUP", 2),
    A09("REQUEST_APPROVED_BUT_COMMUNITY_IS_FULL", 1),
    A03("GROUP_LIMIT_REACHED", 1),
    A02("DEFAULT", 1);
    
    public final int statusMapping;
    public final int value;

    /* access modifiers changed from: public */
    static {
        C179659Iv[] r0;
        A00 = C19780yz.A00(r0);
    }

    /* access modifiers changed from: public */
    C179659Iv(String str, int i) {
        this.value = r2;
        this.statusMapping = i;
    }
}
