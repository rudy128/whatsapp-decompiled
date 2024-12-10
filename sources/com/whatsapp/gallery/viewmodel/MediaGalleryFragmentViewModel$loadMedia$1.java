package com.whatsapp.gallery.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7HG;
import X.AnonymousClass87B;
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

@DebugMetadata(c = "com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$loadMedia$1", f = "MediaGalleryFragmentViewModel.kt", i = {0}, l = {82}, m = "invokeSuspend", n = {"mediaList"}, s = {"L$0"})
public final class MediaGalleryFragmentViewModel$loadMedia$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass87B $mediaListCreator;
    public final /* synthetic */ boolean $unmounted;
    public Object L$0;
    public int label;
    public final /* synthetic */ MediaGalleryFragmentViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaGalleryFragmentViewModel$loadMedia$1(AnonymousClass87B r2, MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel, C30391dr r4, boolean z) {
        super(2, r4);
        this.this$0 = mediaGalleryFragmentViewModel;
        this.$mediaListCreator = r2;
        this.$unmounted = z;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new MediaGalleryFragmentViewModel$loadMedia$1(this.$mediaListCreator, this.this$0, r6, this.$unmounted);
    }

    public final Object invokeSuspend(Object obj) {
        C160878Ah r4;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            r4 = null;
            this.this$0.A06.get();
            AnonymousClass87B r2 = this.$mediaListCreator;
            boolean z = this.$unmounted;
            C18070vi.A0d(r2, 0);
            C160878Ah BHY = r2.BHY(!z);
            BHY.getCount();
            C160878Ah r42 = BHY;
            MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel = this.this$0;
            AnonymousClass7HG r0 = new AnonymousClass7HG(BHY, this.$unmounted);
            this.L$0 = BHY;
            this.label = 1;
            if (MediaGalleryFragmentViewModel.A00(r0, mediaGalleryFragmentViewModel, this) == r6) {
                return r6;
            }
        } else if (i == 1) {
            r4 = (C160878Ah) this.L$0;
            try {
                C30691eM.A01(obj);
            } catch (CancellationException unused) {
                if (r4 != null) {
                    r4.close();
                }
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaGalleryFragmentViewModel$loadMedia$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
