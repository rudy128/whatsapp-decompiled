package X;

/* renamed from: X.0jl  reason: invalid class name and case insensitive filesystem */
public final class C11270jl extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22811Dh $handledByChild;
    public final /* synthetic */ AnonymousClass0HB $startEvent;
    public final /* synthetic */ AnonymousClass09W this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11270jl(AnonymousClass0HB r2, AnonymousClass09W r3, C22811Dh r4) {
        super(1);
        this.$handledByChild = r4;
        this.$startEvent = r2;
        this.this$0 = r3;
    }

    /* renamed from: A00 */
    public final Boolean invoke(AnonymousClass09W r5) {
        C22811Dh r3 = this.$handledByChild;
        boolean z = r3.element;
        boolean A0N = r5.A0N(this.$startEvent);
        AnonymousClass09W r0 = this.this$0;
        if (A0N) {
            AnonymousClass0QV.A05(r0).getDragAndDropManager().CE0(r5);
        }
        r3.element = z | A0N;
        return AnonymousClass000.A0i();
    }
}
