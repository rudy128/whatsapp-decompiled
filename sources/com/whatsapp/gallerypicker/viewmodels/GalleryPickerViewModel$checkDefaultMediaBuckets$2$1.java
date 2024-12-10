package com.whatsapp.gallerypicker.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108945cZ;
import X.C129026h8;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$checkDefaultMediaBuckets$2$1", f = "GalleryPickerViewModel.kt", i = {}, l = {420}, m = "invokeSuspend", n = {}, s = {})
public final class GalleryPickerViewModel$checkDefaultMediaBuckets$2$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C129026h8 $bucket;
    public final /* synthetic */ Map $cameraMediaListCounts;
    public final /* synthetic */ GalleryPickerViewModel.BucketsCollector $collector;
    public final /* synthetic */ boolean $dropdownFilters;
    public final /* synthetic */ int $includeMediaTypes;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ GalleryPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryPickerViewModel$checkDefaultMediaBuckets$2$1(C129026h8 r2, GalleryPickerViewModel.BucketsCollector bucketsCollector, GalleryPickerViewModel galleryPickerViewModel, Map map, C30391dr r6, int i, boolean z) {
        super(2, r6);
        this.this$0 = galleryPickerViewModel;
        this.$bucket = r2;
        this.$collector = bucketsCollector;
        this.$includeMediaTypes = i;
        this.$dropdownFilters = z;
        this.$cameraMediaListCounts = map;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        GalleryPickerViewModel galleryPickerViewModel = this.this$0;
        GalleryPickerViewModel$checkDefaultMediaBuckets$2$1 galleryPickerViewModel$checkDefaultMediaBuckets$2$1 = new GalleryPickerViewModel$checkDefaultMediaBuckets$2$1(this.$bucket, this.$collector, galleryPickerViewModel, this.$cameraMediaListCounts, r10, this.$includeMediaTypes, this.$dropdownFilters);
        galleryPickerViewModel$checkDefaultMediaBuckets$2$1.L$0 = obj;
        return galleryPickerViewModel$checkDefaultMediaBuckets$2$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            GalleryPickerViewModel galleryPickerViewModel = this.this$0;
            C129026h8 r3 = this.$bucket;
            GalleryPickerViewModel.BucketsCollector bucketsCollector = this.$collector;
            int i2 = this.$includeMediaTypes;
            boolean z = this.$dropdownFilters;
            Map map = this.$cameraMediaListCounts;
            try {
                this.label = 1;
                if (GalleryPickerViewModel.A05(r3, bucketsCollector, galleryPickerViewModel, map, this, i2, z) == r2) {
                    return r2;
                }
            } catch (Throwable th) {
                obj2 = C108945cZ.A1J(th);
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        obj2 = C27621Wu.A00;
        return new C30671eK(obj2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GalleryPickerViewModel$checkDefaultMediaBuckets$2$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
