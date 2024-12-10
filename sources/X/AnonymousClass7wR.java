package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7wR  reason: invalid class name */
public final class AnonymousClass7wR extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C1597785v $batchStickerDownloadListener;
    public final /* synthetic */ AtomicInteger $downloadedStickerCount;
    public final /* synthetic */ AnonymousClass725 $stickerPack;
    public final /* synthetic */ int $totalStickerCount;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7wR(AnonymousClass725 r2, C1597785v r3, AtomicInteger atomicInteger, int i) {
        super(0);
        this.$downloadedStickerCount = atomicInteger;
        this.$totalStickerCount = i;
        this.$batchStickerDownloadListener = r3;
        this.$stickerPack = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C1597785v r2 = this.$batchStickerDownloadListener;
        String A00 = AnonymousClass725.A00(this.$stickerPack);
        AnonymousClass6MZ r22 = ((C145667Md) r2).A00;
        Object[] A1b = AnonymousClass3MX.A1b(A00, 0);
        C17880vN.A1T(A1b, (int) (((double) (((float) this.$downloadedStickerCount.getAndIncrement()) / ((float) this.$totalStickerCount))) * 100.0d), 1);
        r22.A0C(A1b);
        return C27621Wu.A00;
    }
}
