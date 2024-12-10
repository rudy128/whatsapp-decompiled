package X;

import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel", f = "GalleryPickerViewModel.kt", i = {0}, l = {393}, m = "processWhatsappCursorBucket", n = {"mediaList"}, s = {"L$0"})
/* renamed from: X.7U4  reason: invalid class name */
public final class AnonymousClass7U4 extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GalleryPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7U4(GalleryPickerViewModel galleryPickerViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = galleryPickerViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GalleryPickerViewModel.A05((C129026h8) null, (GalleryPickerViewModel.BucketsCollector) null, this.this$0, (Map) null, this, 0, false);
    }
}
