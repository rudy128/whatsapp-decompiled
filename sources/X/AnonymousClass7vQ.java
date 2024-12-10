package X;

import com.whatsapp.stickers.flow.StickerPackFlow;

/* renamed from: X.7vQ  reason: invalid class name */
public final class AnonymousClass7vQ extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass6H6 $observer;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7vQ(AnonymousClass6H6 r2, StickerPackFlow stickerPackFlow) {
        super(0);
        this.this$0 = stickerPackFlow;
        this.$observer = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C17880vN.A0V(this.this$0.A05).unregisterObserver(this.$observer);
        return C27621Wu.A00;
    }
}
