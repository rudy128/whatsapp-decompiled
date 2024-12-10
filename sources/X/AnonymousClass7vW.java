package X;

/* renamed from: X.7vW  reason: invalid class name */
public final class AnonymousClass7vW extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass00H $recentShapesEventObservers;
    public final /* synthetic */ AnonymousClass7GJ $stickerShapeObserver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7vW(AnonymousClass7GJ r2, AnonymousClass00H r3) {
        super(0);
        this.$recentShapesEventObservers = r3;
        this.$stickerShapeObserver = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C17880vN.A0V(this.$recentShapesEventObservers).unregisterObserver(this.$stickerShapeObserver);
        return C27621Wu.A00;
    }
}
