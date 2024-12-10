package com.whatsapp.gallery.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7HH;
import X.C160878Ah;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$maybeCacheMedia$1", f = "MediaGalleryFragmentViewModel.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
public final class MediaGalleryFragmentViewModel$maybeCacheMedia$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C160878Ah $mediaList;
    public int label;
    public final /* synthetic */ MediaGalleryFragmentViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaGalleryFragmentViewModel$maybeCacheMedia$1(C160878Ah r2, MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel, C30391dr r4) {
        super(2, r4);
        this.$mediaList = r2;
        this.this$0 = mediaGalleryFragmentViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MediaGalleryFragmentViewModel$maybeCacheMedia$1(this.$mediaList, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C160878Ah r0 = this.$mediaList;
            if (r0 != null) {
                r0.CFP();
            }
            MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel = this.this$0;
            AnonymousClass7HH r02 = AnonymousClass7HH.A00;
            this.label = 1;
            if (MediaGalleryFragmentViewModel.A00(r02, mediaGalleryFragmentViewModel, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaGalleryFragmentViewModel$maybeCacheMedia$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
