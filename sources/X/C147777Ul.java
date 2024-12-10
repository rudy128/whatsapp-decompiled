package X;

import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel", f = "GalleryPickerViewModel.kt", i = {0, 0, 0}, l = {651, 662}, m = "checkWhatsappBucket", n = {"this", "collector", "includeMediaTypes"}, s = {"L$0", "L$1", "I$0"})
/* renamed from: X.7Ul  reason: invalid class name and case insensitive filesystem */
public final class C147777Ul extends C30421du {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GalleryPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147777Ul(GalleryPickerViewModel galleryPickerViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = galleryPickerViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GalleryPickerViewModel.A08((GalleryPickerViewModel.BucketsCollector) null, this.this$0, this, 0);
    }
}
