package X;

/* renamed from: X.Dok  reason: case insensitive filesystem */
public final class C27948Dok extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C28668EDk $msg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27948Dok(C28668EDk eDk) {
        super(1);
        this.$msg = eDk;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C24374C0r c0r;
        BTY bty = (BTY) obj;
        C18070vi.A0d(bty, 0);
        bty.A05 = BEA.A0v(AnonymousClass8BS.A1P(((C23652BnL) this.$msg).uuid_));
        int i = ((C23652BnL) this.$msg).state_;
        if (i == 0) {
            c0r = C24374C0r.READY;
        } else if (i != 1) {
            c0r = C24374C0r.UNRECOGNIZED;
        } else {
            c0r = C24374C0r.MAIN;
        }
        bty.A03 = c0r;
        return C27621Wu.A00;
    }
}
