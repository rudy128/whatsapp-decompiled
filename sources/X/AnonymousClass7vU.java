package X;

/* renamed from: X.7vU  reason: invalid class name */
public final class AnonymousClass7vU extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass7GJ $avatarStickerShapeObserver;
    public final /* synthetic */ AnonymousClass00H $recentShapesEventObservers;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7vU(AnonymousClass7GJ r2, AnonymousClass00H r3) {
        super(0);
        this.$recentShapesEventObservers = r3;
        this.$avatarStickerShapeObserver = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C17880vN.A0V(this.$recentShapesEventObservers).unregisterObserver(this.$avatarStickerShapeObserver);
        return C27621Wu.A00;
    }
}
