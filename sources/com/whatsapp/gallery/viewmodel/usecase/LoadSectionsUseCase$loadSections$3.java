package com.whatsapp.gallery.viewmodel.usecase;

import X.AnonymousClass000;
import X.AnonymousClass1FL;
import X.AnonymousClass1OS;
import X.AnonymousClass7HQ;
import X.AnonymousClass858;
import X.C18070vi;
import X.C25511Om;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C72453Mb;
import android.content.Intent;
import com.whatsapp.gallery.GalleryRecentsFragment;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase$loadSections$3", f = "LoadSectionsUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LoadSectionsUseCase$loadSections$3 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ LoadSectionsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadSectionsUseCase$loadSections$3(LoadSectionsUseCase loadSectionsUseCase, C30391dr r3) {
        super(2, r3);
        this.this$0 = loadSectionsUseCase;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new LoadSectionsUseCase$loadSections$3(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new LoadSectionsUseCase$loadSections$3(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Set set;
        Intent intent;
        ArrayList parcelableArrayListExtra;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass858 r0 = this.this$0.A01;
            if (r0 == null) {
                return null;
            }
            MediaGalleryFragmentBase mediaGalleryFragmentBase = ((AnonymousClass7HQ) r0).A00;
            mediaGalleryFragmentBase.A2E(false);
            List list = mediaGalleryFragmentBase.A0b;
            if (mediaGalleryFragmentBase instanceof GalleryRecentsFragment) {
                GalleryRecentsFragment galleryRecentsFragment = (GalleryRecentsFragment) mediaGalleryFragmentBase;
                C18070vi.A0d(list, 0);
                if (galleryRecentsFragment.A0B && C72453Mb.A1a(galleryRecentsFragment.A0h)) {
                    galleryRecentsFragment.A0B = false;
                    AnonymousClass1FL A1B = galleryRecentsFragment.A1B();
                    if (A1B == null || (intent = A1B.getIntent()) == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("result_extra_media_selection")) == null) {
                        set = C25511Om.A00;
                    } else {
                        set = C29431cG.A12(parcelableArrayListExtra);
                    }
                    galleryRecentsFragment.A2I(set);
                }
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
