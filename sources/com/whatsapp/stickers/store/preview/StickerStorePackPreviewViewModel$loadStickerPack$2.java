package com.whatsapp.stickers.store.preview;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass205;
import X.C108945cZ;
import X.C144797Is;
import X.C145687Mf;
import X.C17880vN;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C441522i;
import X.C62572rc;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel$loadStickerPack$2", f = "StickerStorePackPreviewViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerStorePackPreviewViewModel$loadStickerPack$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass205 $fMessageKey;
    public int label;
    public final /* synthetic */ StickerStorePackPreviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerStorePackPreviewViewModel$loadStickerPack$2(AnonymousClass205 r2, StickerStorePackPreviewViewModel stickerStorePackPreviewViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = stickerStorePackPreviewViewModel;
        this.$fMessageKey = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new StickerStorePackPreviewViewModel$loadStickerPack$2(this.$fMessageKey, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        File file;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C441522i r4 = (C441522i) C108945cZ.A0s(this.$fMessageKey, C17880vN.A0c(this.this$0.A05));
            this.this$0.A01.A0E(r4);
            if (r4 == null) {
                this.this$0.A00.A0E(C145687Mf.A00);
            } else {
                C62572rc r0 = r4.A02;
                if (r0 != null) {
                    file = r0.A0G;
                } else {
                    file = null;
                }
                StickerStorePackPreviewViewModel.A03(r4, this.this$0, file);
                if (file == null) {
                    StickerStorePackPreviewViewModel stickerStorePackPreviewViewModel = this.this$0;
                    stickerStorePackPreviewViewModel.A03.A0D(new C144797Is(stickerStorePackPreviewViewModel, r4, 8), r4, 1);
                }
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerStorePackPreviewViewModel$loadStickerPack$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
