package com.whatsapp.gallery.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass853;
import X.AnonymousClass858;
import X.AnonymousClass87B;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$loadSections$1", f = "MediaGalleryFragmentViewModel.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
public final class MediaGalleryFragmentViewModel$loadSections$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $approxFirstPageThumbCount;
    public final /* synthetic */ AnonymousClass853 $bucketsProvider;
    public final /* synthetic */ AnonymousClass858 $listener;
    public final /* synthetic */ AnonymousClass87B $mediaListCreator;
    public final /* synthetic */ List $sectionBuckets;
    public final /* synthetic */ boolean $unmounted;
    public int label;
    public final /* synthetic */ MediaGalleryFragmentViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaGalleryFragmentViewModel$loadSections$1(AnonymousClass853 r2, AnonymousClass87B r3, AnonymousClass858 r4, MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel, List list, C30391dr r7, int i, boolean z) {
        super(2, r7);
        this.this$0 = mediaGalleryFragmentViewModel;
        this.$unmounted = z;
        this.$approxFirstPageThumbCount = i;
        this.$bucketsProvider = r2;
        this.$mediaListCreator = r3;
        this.$listener = r4;
        this.$sectionBuckets = list;
    }

    public final C30391dr create(Object obj, C30391dr r11) {
        MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel = this.this$0;
        boolean z = this.$unmounted;
        return new MediaGalleryFragmentViewModel$loadSections$1(this.$bucketsProvider, this.$mediaListCreator, this.$listener, mediaGalleryFragmentViewModel, this.$sectionBuckets, r11, this.$approxFirstPageThumbCount, z);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            boolean z = this.$unmounted;
            int i2 = this.$approxFirstPageThumbCount;
            AnonymousClass853 r4 = this.$bucketsProvider;
            AnonymousClass87B r5 = this.$mediaListCreator;
            AnonymousClass858 r6 = this.$listener;
            List list = this.$sectionBuckets;
            this.label = 1;
            if (((LoadSectionsUseCase) this.this$0.A07.get()).A01(r4, r5, r6, list, this, i2, z) == r2) {
                return r2;
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
        return ((MediaGalleryFragmentViewModel$loadSections$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
