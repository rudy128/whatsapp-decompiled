package com.whatsapp.stickers.store.preview;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C136996uk;
import X.C1409173o;
import X.C145677Me;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C441522i;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel$downloadStickerPackZipFile$1$1", f = "StickerStorePackPreviewViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerStorePackPreviewViewModel$downloadStickerPackZipFile$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C136996uk $downloadData;
    public final /* synthetic */ C1409173o $result;
    public final /* synthetic */ C441522i $stickerPackMessage;
    public int label;
    public final /* synthetic */ StickerStorePackPreviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerStorePackPreviewViewModel$downloadStickerPackZipFile$1$1(C1409173o r2, C136996uk r3, C441522i r4, StickerStorePackPreviewViewModel stickerStorePackPreviewViewModel, C30391dr r6) {
        super(2, r6);
        this.$result = r2;
        this.this$0 = stickerStorePackPreviewViewModel;
        this.$stickerPackMessage = r4;
        this.$downloadData = r3;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        C1409173o r1 = this.$result;
        StickerStorePackPreviewViewModel stickerStorePackPreviewViewModel = this.this$0;
        return new StickerStorePackPreviewViewModel$downloadStickerPackZipFile$1$1(r1, this.$downloadData, this.$stickerPackMessage, stickerStorePackPreviewViewModel, r8);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            boolean A03 = this.$result.A03();
            StickerStorePackPreviewViewModel stickerStorePackPreviewViewModel = this.this$0;
            if (A03) {
                StickerStorePackPreviewViewModel.A03(this.$stickerPackMessage, stickerStorePackPreviewViewModel, this.$downloadData.A03());
            } else {
                stickerStorePackPreviewViewModel.A00.A0E(new C145677Me(StickerStorePackPreviewViewModel.A00(this.$stickerPackMessage, stickerStorePackPreviewViewModel, (File) null)));
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerStorePackPreviewViewModel$downloadStickerPackZipFile$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
