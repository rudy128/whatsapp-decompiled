package X;

import android.database.Cursor;
import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel", f = "GalleryPickerViewModel.kt", i = {0, 0, 0, 0}, l = {692}, m = "processWhatsappCursorBucket", n = {"this", "cursor", "collector", "includeMediaTypes"}, s = {"L$0", "L$1", "L$2", "I$0"})
/* renamed from: X.7V0  reason: invalid class name */
public final class AnonymousClass7V0 extends C30421du {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GalleryPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7V0(GalleryPickerViewModel galleryPickerViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = galleryPickerViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GalleryPickerViewModel.A03((Cursor) null, (GalleryPickerViewModel.BucketsCollector) null, this.this$0, this, 0);
    }
}
