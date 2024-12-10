package X;

import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel", f = "GalleryPickerViewModel.kt", i = {0, 0, 0, 1, 1, 1}, l = {771, 624}, m = "getWhatsappBucketCollector", n = {"this", "$this$withLock_u24default$iv", "includeMediaTypes", "$this$withLock_u24default$iv", "$this$getWhatsappBucketCollector_u24lambda_u2416_u24lambda_u2415", "whatsappBucketCollector"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2"})
/* renamed from: X.7V8  reason: invalid class name */
public final class AnonymousClass7V8 extends C30421du {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GalleryPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7V8(GalleryPickerViewModel galleryPickerViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = galleryPickerViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GalleryPickerViewModel.A0B(this.this$0, this, 0);
    }
}
