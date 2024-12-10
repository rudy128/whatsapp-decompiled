package com.whatsapp.gallery.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7HF;
import X.C160878Ah;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$cacheMedia$1", f = "MediaGalleryFragmentViewModel.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
public final class MediaGalleryFragmentViewModel$cacheMedia$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C160878Ah $mediaList;
    public int label;
    public final /* synthetic */ MediaGalleryFragmentViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaGalleryFragmentViewModel$cacheMedia$1(C160878Ah r2, MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = mediaGalleryFragmentViewModel;
        this.$mediaList = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MediaGalleryFragmentViewModel$cacheMedia$1(this.$mediaList, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.this$0.A05.get();
            C160878Ah r2 = this.$mediaList;
            C18070vi.A0d(r2, 0);
            int count = r2.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                r2.BUY(i2);
            }
            MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel = this.this$0;
            AnonymousClass7HF r0 = new AnonymousClass7HF(this.$mediaList);
            this.label = 1;
            if (MediaGalleryFragmentViewModel.A00(r0, mediaGalleryFragmentViewModel, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            try {
                C30691eM.A01(obj);
            } catch (CancellationException unused) {
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaGalleryFragmentViewModel$cacheMedia$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
