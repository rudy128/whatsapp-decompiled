package X;

/* renamed from: X.7vX  reason: invalid class name */
public final class AnonymousClass7vX extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass6H6 $stickerObserver;
    public final /* synthetic */ AnonymousClass00H $stickerObservers;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7vX(AnonymousClass6H6 r2, AnonymousClass00H r3) {
        super(0);
        this.$stickerObservers = r3;
        this.$stickerObserver = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C17880vN.A0V(this.$stickerObservers).unregisterObserver(this.$stickerObserver);
        return C27621Wu.A00;
    }
}
