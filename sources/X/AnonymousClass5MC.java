package X;

/* renamed from: X.5MC  reason: invalid class name */
public final class AnonymousClass5MC extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C98394r4 $observer;
    public final /* synthetic */ AnonymousClass4N1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5MC(C98394r4 r2, AnonymousClass4N1 r3) {
        super(0);
        this.this$0 = r3;
        this.$observer = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        this.this$0.A02.unregisterObserver(this.$observer);
        return C27621Wu.A00;
    }
}
