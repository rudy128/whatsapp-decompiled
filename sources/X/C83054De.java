package X;

/* renamed from: X.4De  reason: invalid class name and case insensitive filesystem */
public enum C83054De {
    A04("IGNORE_CASE", 2),
    A06("MULTILINE", 8),
    A05("LITERAL", 16),
    A07("UNIX_LINES", 1),
    A02("COMMENTS", 4),
    A03("DOT_MATCHES_ALL", 32);
    
    public final int mask;
    public final int value;

    /* access modifiers changed from: public */
    static {
        C83054De[] r0;
        A00 = C19780yz.A00(r0);
    }

    /* access modifiers changed from: public */
    C83054De(String str, int i) {
        this.value = r2;
        this.mask = i;
    }
}
