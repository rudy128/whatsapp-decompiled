package X;

/* renamed from: X.Dmj  reason: case insensitive filesystem */
public final class C27848Dmj extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C25194Cal $parentBounds;
    public final /* synthetic */ long $popupContentSize;
    public final /* synthetic */ C98484rE $popupPosition;
    public final /* synthetic */ long $windowSize;
    public final /* synthetic */ BJD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27848Dmj(C25194Cal cal, BJD bjd, C98484rE r4, long j, long j2) {
        super(0);
        this.$popupPosition = r4;
        this.this$0 = bjd;
        this.$parentBounds = cal;
        this.$windowSize = j;
        this.$popupContentSize = j2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C98484rE r5 = this.$popupPosition;
        E0D e0d = this.this$0.A01;
        C25194Cal cal = this.$parentBounds;
        long j = this.$popupContentSize;
        C06330Xx r9 = (C06330Xx) e0d;
        long CCp = r9.A02.CCp();
        if (CCp == AnonymousClass0QY.A02) {
            CCp = r9.A00;
        }
        r9.A00 = CCp;
        int ordinal = r9.A01.ordinal();
        int i = 0;
        if (ordinal != 0) {
            if (ordinal == 2) {
                i = AnonymousClass000.A0G(j) / 2;
            } else if (ordinal == 1) {
                i = AnonymousClass000.A0G(j);
            } else {
                throw AnonymousClass3MW.A14();
            }
        }
        long A00 = C7A.A00(C22339B3q.A01(AnonymousClass0QY.A01(CCp)), C22339B3q.A01(AnonymousClass0QY.A02(CCp)));
        r5.element = C7A.A00((cal.A01 + AnonymousClass000.A0G(A00)) - i, cal.A03 + AnonymousClass000.A0H(A00));
        return C27621Wu.A00;
    }
}
