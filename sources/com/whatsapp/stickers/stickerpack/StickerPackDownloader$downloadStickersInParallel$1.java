package com.whatsapp.stickers.stickerpack;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass725;
import X.C108955ca;
import X.C1597785v;
import X.C18090vk;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.stickerpack.StickerPackDownloader$downloadStickersInParallel$1", f = "StickerPackDownloader.kt", i = {}, l = {276}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackDownloader$downloadStickersInParallel$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C1597785v $batchStickerDownloadListener;
    public final /* synthetic */ AnonymousClass1OX $downloadScope;
    public final /* synthetic */ C18090vk $onStickerDownloaded;
    public final /* synthetic */ AnonymousClass725 $stickerPack;
    public int label;
    public final /* synthetic */ StickerPackDownloader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackDownloader$downloadStickersInParallel$1(AnonymousClass725 r2, C1597785v r3, StickerPackDownloader stickerPackDownloader, C30391dr r5, C18090vk r6, AnonymousClass1OX r7) {
        super(2, r5);
        this.this$0 = stickerPackDownloader;
        this.$downloadScope = r7;
        this.$stickerPack = r2;
        this.$batchStickerDownloadListener = r3;
        this.$onStickerDownloaded = r6;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new StickerPackDownloader$downloadStickersInParallel$1(this.$stickerPack, this.$batchStickerDownloadListener, this.this$0, r9, this.$onStickerDownloaded, this.$downloadScope);
    }

    public final Object invokeSuspend(Object obj) {
        Object A00;
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            StickerPackDownloader stickerPackDownloader = this.this$0;
            AnonymousClass1OX r8 = this.$downloadScope;
            AnonymousClass725 r3 = this.$stickerPack;
            C1597785v r4 = this.$batchStickerDownloadListener;
            C18090vk r7 = this.$onStickerDownloaded;
            this.label = 1;
            A00 = StickerPackDownloader.A00(r3, r4, stickerPackDownloader, this, r7, r8);
            if (A00 == r2) {
                return r2;
            }
        } else if (i == 1) {
            A00 = C108955ca.A0n(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return new C30671eK(A00);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerPackDownloader$downloadStickersInParallel$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
