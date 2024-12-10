package X;

/* renamed from: X.0f5  reason: invalid class name and case insensitive filesystem */
public final class C08430f5 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ float $distanceFromEdge;
    public final /* synthetic */ C06850Zx $hitTestResult;
    public final /* synthetic */ C16720su $hitTestSource;
    public final /* synthetic */ boolean $isInLayer;
    public final /* synthetic */ boolean $isTouchEvent;
    public final /* synthetic */ long $pointerPosition;
    public final /* synthetic */ AnonymousClass0XW $this_speculativeHit;
    public final /* synthetic */ C01850Ad this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08430f5(AnonymousClass0XW r2, C06850Zx r3, C16720su r4, C01850Ad r5, float f, long j, boolean z, boolean z2) {
        super(0);
        this.this$0 = r5;
        this.$this_speculativeHit = r2;
        this.$hitTestSource = r4;
        this.$pointerPosition = j;
        this.$hitTestResult = r3;
        this.$isTouchEvent = z;
        this.$isInLayer = z2;
        this.$distanceFromEdge = f;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int i;
        C01850Ad r3 = this.this$0;
        AnonymousClass0XW r1 = this.$this_speculativeHit;
        C16720su r2 = this.$hitTestSource;
        if (((AnonymousClass0XX) r2).A00 != 0) {
            i = 8;
        } else {
            i = 16;
        }
        AnonymousClass0XW A00 = AnonymousClass0F6.A00(r1, i);
        long j = this.$pointerPosition;
        r3.A0D(A00, this.$hitTestResult, r2, this.$distanceFromEdge, j, this.$isTouchEvent, this.$isInLayer);
        return C27621Wu.A00;
    }
}
