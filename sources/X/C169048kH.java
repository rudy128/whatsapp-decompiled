package X;

/* renamed from: X.8kH  reason: invalid class name and case insensitive filesystem */
public final class C169048kH extends C184199aZ {
    public final int A00;

    public C169048kH(int i) {
        super("frequently_contacted_biz");
        this.A00 = 0;
        if (i > 0) {
            this.A00 = i;
            return;
        }
        throw AnonymousClass000.A0k("FrequentlyContactedBizWidget max list size cannot be zero or negative");
    }
}
