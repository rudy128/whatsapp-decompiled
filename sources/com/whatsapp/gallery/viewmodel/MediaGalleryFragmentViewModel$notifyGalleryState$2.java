package com.whatsapp.gallery.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass856;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$notifyGalleryState$2", f = "MediaGalleryFragmentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MediaGalleryFragmentViewModel$notifyGalleryState$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass856 $state;
    public int label;
    public final /* synthetic */ MediaGalleryFragmentViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaGalleryFragmentViewModel$notifyGalleryState$2(AnonymousClass856 r2, MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = mediaGalleryFragmentViewModel;
        this.$state = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MediaGalleryFragmentViewModel$notifyGalleryState$2(this.$state, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.this$0.A04.A0F(this.$state);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaGalleryFragmentViewModel$notifyGalleryState$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
