package X;

import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.stickerpack.StickerPackDownloader", f = "StickerPackDownloader.kt", i = {}, l = {345}, m = "executeStickerDownloadInParallel-yxL6bBk", n = {}, s = {})
/* renamed from: X.7TY  reason: invalid class name */
public final class AnonymousClass7TY extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StickerPackDownloader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TY(StickerPackDownloader stickerPackDownloader, C30391dr r2) {
        super(r2);
        this.this$0 = stickerPackDownloader;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C108985cd.A0e(StickerPackDownloader.A00((AnonymousClass725) null, (C1597785v) null, this.this$0, this, (C18090vk) null, (AnonymousClass1OX) null));
    }
}
