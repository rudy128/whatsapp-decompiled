package com.whatsapp.gallery.viewmodel.usecase;

import X.AnonymousClass1OS;
import X.C160878Ah;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase$postReportBuckets$2", f = "LoadSectionsUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LoadSectionsUseCase$postReportBuckets$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $buckets;
    public final /* synthetic */ boolean $firstIncomplete;
    public final /* synthetic */ C160878Ah $mediaList;
    public final /* synthetic */ List $sectionBuckets;
    public int label;
    public final /* synthetic */ LoadSectionsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadSectionsUseCase$postReportBuckets$2(C160878Ah r2, LoadSectionsUseCase loadSectionsUseCase, List list, List list2, C30391dr r6, boolean z) {
        super(2, r6);
        this.this$0 = loadSectionsUseCase;
        this.$mediaList = r2;
        this.$firstIncomplete = z;
        this.$buckets = list;
        this.$sectionBuckets = list2;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        LoadSectionsUseCase loadSectionsUseCase = this.this$0;
        return new LoadSectionsUseCase$postReportBuckets$2(this.$mediaList, loadSectionsUseCase, this.$buckets, this.$sectionBuckets, r9, this.$firstIncomplete);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            if (r0 != 0) goto L_0x007c
            X.C30691eM.A01(r6)
            com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase r0 = r5.this$0
            X.858 r1 = r0.A01
            if (r1 == 0) goto L_0x0032
            X.8Ah r4 = r5.$mediaList
            X.7HQ r1 = (X.AnonymousClass7HQ) r1
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            com.whatsapp.gallery.MediaGalleryFragmentBase r3 = r1.A00
            int r0 = r4.getCount()
            r3.A01 = r0
            X.0ve r2 = r3.A27()
            r1 = 10211(0x27e3, float:1.4309E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = "MediaGalleryFragmentBase/updateMedia updated from mediaList with new media"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3.A0G = r4
        L_0x0032:
            boolean r1 = r5.$firstIncomplete
            com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase r0 = r5.this$0
            int r0 = r0.A00
            if (r1 == 0) goto L_0x005c
            if (r0 != 0) goto L_0x0048
            java.util.List r0 = r5.$buckets
            r0.size()
        L_0x0041:
            java.util.List r1 = r5.$sectionBuckets
            java.util.List r0 = r5.$buckets
            r1.addAll(r0)
        L_0x0048:
            com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase r0 = r5.this$0
            X.858 r0 = r0.A01
            if (r0 == 0) goto L_0x007a
            X.7HQ r0 = (X.AnonymousClass7HQ) r0
            com.whatsapp.gallery.MediaGalleryFragmentBase r1 = r0.A00
            r1.A2B()
            r0 = 0
            r1.A2E(r0)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x005c:
            if (r0 != 0) goto L_0x0068
            java.util.List r0 = r5.$sectionBuckets
            r0.size()
            java.util.List r0 = r5.$sectionBuckets
            r0.clear()
        L_0x0068:
            java.util.List r0 = r5.$buckets
            r0.size()
            com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase r2 = r5.this$0
            int r1 = r2.A00
            java.util.List r0 = r5.$buckets
            int r0 = X.C108945cZ.A0A(r0, r1)
            r2.A00 = r0
            goto L_0x0041
        L_0x007a:
            r0 = 0
            return r0
        L_0x007c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.viewmodel.usecase.LoadSectionsUseCase$postReportBuckets$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((LoadSectionsUseCase$postReportBuckets$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
