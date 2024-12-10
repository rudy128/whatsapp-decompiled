package X;

/* renamed from: X.0iK  reason: invalid class name and case insensitive filesystem */
public final class C10430iK extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ boolean $isLeft;
    public final /* synthetic */ boolean $isStartHandle;
    public final /* synthetic */ C16250rx $offsetProvider;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10430iK(C16250rx r2, boolean z, boolean z2) {
        super(1);
        this.$offsetProvider = r2;
        this.$isStartHandle = z;
        this.$isLeft = z2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass0CM r5;
        Integer num;
        C16520sO r11 = (C16520sO) obj;
        long CCp = this.$offsetProvider.CCp();
        AnonymousClass0PS r3 = AnonymousClass0G2.A00;
        if (this.$isStartHandle) {
            r5 = AnonymousClass0CM.SelectionStart;
        } else {
            r5 = AnonymousClass0CM.SelectionEnd;
        }
        if (this.$isLeft) {
            num = AnonymousClass00R.A00;
        } else {
            num = AnonymousClass00R.A0C;
        }
        r11.CHj(r3, new AnonymousClass0K2(r5, num, CCp, AnonymousClass000.A1O((CCp > AnonymousClass0QY.A02 ? 1 : (CCp == AnonymousClass0QY.A02 ? 0 : -1)))));
        return C27621Wu.A00;
    }
}
