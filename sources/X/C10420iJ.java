package X;

/* renamed from: X.0iJ  reason: invalid class name and case insensitive filesystem */
public final class C10420iJ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0HD $colorFilter;
    public final /* synthetic */ C16980tX $imageBitmap;
    public final /* synthetic */ float $radius;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10420iJ(AnonymousClass0HD r2, C16980tX r3, float f) {
        super(1);
        this.$radius = f;
        this.$imageBitmap = r3;
        this.$colorFilter = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C17480uj r10 = (C17480uj) obj;
        r10.BJR();
        float f = this.$radius;
        C16980tX r8 = this.$imageBitmap;
        AnonymousClass0HD r7 = this.$colorFilter;
        AnonymousClass0t6 BQs = r10.BQs();
        long BZL = BQs.BZL();
        C16800tF A00 = AnonymousClass0WZ.A00(BQs);
        ((C05890Wc) A00).A00.BOJ().CPp(f, 0.0f);
        A00.CG8(45.0f, AnonymousClass0QY.A03);
        C04820Pb.A01(r7, r8, r10);
        AnonymousClass001.A1P(BQs, BZL);
        return C27621Wu.A00;
    }
}
