package X;

/* renamed from: X.AwK  reason: case insensitive filesystem */
public final class C22018AwK extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ long $bytesDownloaded;
    public final /* synthetic */ BC9 $listener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22018AwK(BC9 bc9, long j) {
        super(0);
        this.$listener = bc9;
        this.$bytesDownloaded = j;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        this.$listener.BsA(this.$bytesDownloaded);
        return C27621Wu.A00;
    }
}
