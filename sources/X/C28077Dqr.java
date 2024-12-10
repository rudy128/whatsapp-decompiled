package X;

/* renamed from: X.Dqr  reason: case insensitive filesystem */
public final class C28077Dqr extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C25647Cjd $blockingResult;
    public final /* synthetic */ C24496C6o $link;
    public final /* synthetic */ C25057CVn $rolloverData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28077Dqr(C25647Cjd cjd, C24496C6o c6o, C25057CVn cVn) {
        super(1);
        this.$link = c6o;
        this.$rolloverData = cVn;
        this.$blockingResult = cjd;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C22867BTb bTb = (C22867BTb) obj;
        C18070vi.A0d(bTb, 0);
        C24496C6o c6o = this.$link;
        bTb.A08 = c6o.A07();
        bTb.A07 = c6o.A06();
        bTb.A02 = this.$rolloverData;
        bTb.A00 = this.$blockingResult;
        return C27621Wu.A00;
    }
}
