package X;

/* renamed from: X.Bxp  reason: case insensitive filesystem */
public enum C24235Bxp {
    A00(0),
    A01(1),
    A02(3),
    A05(5),
    A06(6),
    A07(7),
    A08(8),
    A03(9),
    A09(10),
    A0A(11),
    A04(12);
    
    public final C26001CqI mHttpPriority;

    /* access modifiers changed from: public */
    static {
        A00 = new C24235Bxp(new C26001CqI((byte) 3, true), "DEFAULT", 0);
        A01 = new C24235Bxp(new C26001CqI((byte) 4, false), "PREFETCH", 1);
        new C24235Bxp(new C26001CqI((byte) 3, false), "IMPORTANT_PREFETCH", 2);
        A02 = new C24235Bxp(new C26001CqI((byte) 4, true), "PREFETCH_INCREMENTAL", 3);
        new C24235Bxp(new C26001CqI((byte) 3, true), "IMPORTANT_PREFETCH_INCREMENTAL", 4);
        A05 = new C24235Bxp(new C26001CqI((byte) 5, false), "UNIMPORTANT_PREFETCH", 5);
        A06 = new C24235Bxp(new C26001CqI((byte) 5, true), "UNIMPORTANT_PREFETCH_INCREMENTAL", 6);
        A07 = new C24235Bxp(new C26001CqI((byte) 6, false), "VERY_UNIMPORTANT_PREFETCH", 7);
        A08 = new C24235Bxp(new C26001CqI((byte) 6, true), "VERY_UNIMPORTANT_PREFETCH_INCREMENTAL", 8);
        A03 = new C24235Bxp(new C26001CqI((byte) 0, false), "STREAMING", 9);
        A09 = new C24235Bxp(new C26001CqI((byte) 2, false), "WARMUP", 10);
        A0A = new C24235Bxp(new C26001CqI((byte) 2, true), "WARMUP_INCREMENTAL", 11);
        A04 = new C24235Bxp(new C26001CqI((byte) 0, true), "STREAMING_INCREMENTAL", 12);
    }

    /* access modifiers changed from: public */
    C24235Bxp(int i) {
        this.mHttpPriority = r1;
    }
}
