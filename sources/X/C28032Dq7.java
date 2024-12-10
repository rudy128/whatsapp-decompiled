package X;

/* renamed from: X.Dq7  reason: case insensitive filesystem */
public final class C28032Dq7 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C25213Cb9 $typefaceRequest;
    public final /* synthetic */ CMN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28032Dq7(C25213Cb9 cb9, CMN cmn) {
        super(1);
        this.this$0 = cmn;
        this.$typefaceRequest = cb9;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CMN cmn = this.this$0;
        C77 c77 = cmn.A01;
        C25213Cb9 cb9 = this.$typefaceRequest;
        synchronized (c77) {
            cmn.A00.A02(cb9, obj);
        }
        return C27621Wu.A00;
    }
}
