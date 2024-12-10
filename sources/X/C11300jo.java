package X;

/* renamed from: X.0jo  reason: invalid class name and case insensitive filesystem */
public final class C11300jo extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22821Di $layerBlock;
    public final /* synthetic */ long $offset;
    public final /* synthetic */ long $offsetDelta;
    public final /* synthetic */ AnonymousClass0XJ $placeable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11300jo(AnonymousClass0XJ r2, C22821Di r3, long j, long j2) {
        super(1);
        this.$placeable = r2;
        this.$offset = j;
        this.$offsetDelta = j2;
        this.$layerBlock = r3;
    }

    public final void A00() {
        AnonymousClass0XJ r8 = this.$placeable;
        long j = this.$offset;
        long j2 = this.$offsetDelta;
        int i = ((int) (j2 & 4294967295L)) + ((int) (j & 4294967295L));
        C22821Di r0 = this.$layerBlock;
        AnonymousClass0QZ.A06(r8, r0, ((int) (j2 >> 32)) + ((int) (j >> 32)), i);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00();
        return C27621Wu.A00;
    }
}
