package X;

import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel", f = "GalleryPickerViewModel.kt", i = {0, 0, 0, 0}, l = {598}, m = "checkFolderBuckets", n = {"this", "collector", "mediaList", "includeMediaTypes"}, s = {"L$0", "L$1", "L$3", "I$0"})
/* renamed from: X.7V7  reason: invalid class name */
public final class AnonymousClass7V7 extends C30421du {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GalleryPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7V7(GalleryPickerViewModel galleryPickerViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = galleryPickerViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GalleryPickerViewModel.A07((GalleryPickerViewModel.BucketsCollector) null, this.this$0, this, 0);
    }
}
