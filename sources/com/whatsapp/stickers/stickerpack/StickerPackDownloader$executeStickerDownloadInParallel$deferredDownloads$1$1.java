package com.whatsapp.stickers.stickerpack;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OW;
import X.AnonymousClass1OX;
import X.AnonymousClass3MW;
import X.AnonymousClass6I9;
import X.AnonymousClass6IA;
import X.C108945cZ;
import X.C123306Tx;
import X.C139236yU;
import X.C1418377d;
import X.C145667Md;
import X.C1597785v;
import X.C17900vP;
import X.C18070vi;
import X.C18090vk;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.stickerpack.StickerPackDownloader$executeStickerDownloadInParallel$deferredDownloads$1$1", f = "StickerPackDownloader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackDownloader$executeStickerDownloadInParallel$deferredDownloads$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C1597785v $batchStickerDownloadListener;
    public final /* synthetic */ AnonymousClass1OX $coroutineScope;
    public final /* synthetic */ C18090vk $onStickerDownloaded;
    public final /* synthetic */ boolean $shouldUpdateHash;
    public final /* synthetic */ C1418377d $sticker;
    public int label;
    public final /* synthetic */ StickerPackDownloader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackDownloader$executeStickerDownloadInParallel$deferredDownloads$1$1(C1418377d r2, C1597785v r3, StickerPackDownloader stickerPackDownloader, C30391dr r5, C18090vk r6, AnonymousClass1OX r7, boolean z) {
        super(2, r5);
        this.$batchStickerDownloadListener = r3;
        this.$coroutineScope = r7;
        this.this$0 = stickerPackDownloader;
        this.$sticker = r2;
        this.$shouldUpdateHash = z;
        this.$onStickerDownloaded = r6;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        C1597785v r2 = this.$batchStickerDownloadListener;
        AnonymousClass1OX r6 = this.$coroutineScope;
        StickerPackDownloader stickerPackDownloader = this.this$0;
        return new StickerPackDownloader$executeStickerDownloadInParallel$deferredDownloads$1$1(this.$sticker, r2, stickerPackDownloader, r10, this.$onStickerDownloaded, r6, this.$shouldUpdateHash);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        IllegalStateException A0n;
        if (this.label == 0) {
            C30691eM.A01(obj);
            if (C108945cZ.A1T(((C145667Md) this.$batchStickerDownloadListener).A00)) {
                AnonymousClass1OW.A04(new CancellationException("cancelled"), this.$coroutineScope);
                A0n = AnonymousClass000.A0n("cancelled");
            } else {
                C1418377d r2 = this.$sticker;
                C18070vi.A0b(r2);
                C123306Tx A01 = ((C139236yU) C18070vi.A0E(this.this$0.A09)).A01(r2, (File) null, this.$shouldUpdateHash);
                if (A01 instanceof AnonymousClass6I9) {
                    AnonymousClass1OX r4 = this.$coroutineScope;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("error: ");
                    String str = ((AnonymousClass6I9) A01).A00;
                    AnonymousClass1OW.A04(new CancellationException(AnonymousClass000.A0y(str, A10)), r4);
                    A0n = AnonymousClass000.A0n(C17900vP.A0A("error: ", str));
                } else if (A01 instanceof AnonymousClass6IA) {
                    this.$onStickerDownloaded.invoke();
                    obj2 = ((AnonymousClass6IA) A01).A00;
                    return new C30671eK(obj2);
                } else {
                    throw AnonymousClass3MW.A14();
                }
            }
            obj2 = C30691eM.A00(A0n);
            return new C30671eK(obj2);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerPackDownloader$executeStickerDownloadInParallel$deferredDownloads$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
