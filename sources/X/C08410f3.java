package X;

/* renamed from: X.0f3  reason: invalid class name and case insensitive filesystem */
public final class C08410f3 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C06850Zx $hitTestResult;
    public final /* synthetic */ C16720su $hitTestSource;
    public final /* synthetic */ boolean $isInLayer;
    public final /* synthetic */ boolean $isTouchEvent;
    public final /* synthetic */ long $pointerPosition;
    public final /* synthetic */ AnonymousClass0XW $this_hit;
    public final /* synthetic */ C01850Ad this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08410f3(AnonymousClass0XW r2, C06850Zx r3, C16720su r4, C01850Ad r5, long j, boolean z, boolean z2) {
        super(0);
        this.this$0 = r5;
        this.$this_hit = r2;
        this.$hitTestSource = r4;
        this.$pointerPosition = j;
        this.$hitTestResult = r3;
        this.$isTouchEvent = z;
        this.$isInLayer = z2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int i;
        C01850Ad r3 = this.this$0;
        AnonymousClass0XW r1 = this.$this_hit;
        C16720su r2 = this.$hitTestSource;
        if (((AnonymousClass0XX) r2).A00 != 0) {
            i = 8;
        } else {
            i = 16;
        }
        r3.A0E(AnonymousClass0F6.A00(r1, i), this.$hitTestResult, r2, this.$pointerPosition, this.$isTouchEvent, this.$isInLayer);
        return C27621Wu.A00;
    }
}
