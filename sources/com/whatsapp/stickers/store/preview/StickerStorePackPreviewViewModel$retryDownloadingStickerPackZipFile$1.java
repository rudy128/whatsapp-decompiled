package com.whatsapp.stickers.store.preview;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C144797Is;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C441522i;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel$retryDownloadingStickerPackZipFile$1", f = "StickerStorePackPreviewViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerStorePackPreviewViewModel$retryDownloadingStickerPackZipFile$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C441522i $stickerPackMessage;
    public int label;
    public final /* synthetic */ StickerStorePackPreviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerStorePackPreviewViewModel$retryDownloadingStickerPackZipFile$1(C441522i r2, StickerStorePackPreviewViewModel stickerStorePackPreviewViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = stickerStorePackPreviewViewModel;
        this.$stickerPackMessage = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new StickerStorePackPreviewViewModel$retryDownloadingStickerPackZipFile$1(this.$stickerPackMessage, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            StickerStorePackPreviewViewModel stickerStorePackPreviewViewModel = this.this$0;
            C441522i r3 = this.$stickerPackMessage;
            stickerStorePackPreviewViewModel.A03.A0D(new C144797Is(stickerStorePackPreviewViewModel, r3, 8), r3, 1);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerStorePackPreviewViewModel$retryDownloadingStickerPackZipFile$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
