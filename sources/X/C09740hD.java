package X;

/* renamed from: X.0hD  reason: invalid class name and case insensitive filesystem */
public final class C09740hD extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0OP $scrollerPosition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C09740hD(AnonymousClass0OP r2) {
        super(1);
        this.$scrollerPosition = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float A04 = AnonymousClass000.A04(obj);
        float BRr = this.$scrollerPosition.A03.BRr() + A04;
        if (BRr > this.$scrollerPosition.A02.BRr()) {
            A04 = this.$scrollerPosition.A02.BRr() - this.$scrollerPosition.A03.BRr();
        } else if (BRr < 0.0f) {
            A04 = -this.$scrollerPosition.A03.BRr();
        }
        AnonymousClass0OP r2 = this.$scrollerPosition;
        r2.A03.CIw(r2.A03.BRr() + A04);
        return Float.valueOf(A04);
    }
}
