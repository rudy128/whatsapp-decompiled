package X;

import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector", f = "GalleryPickerViewModel.kt", i = {0, 1}, l = {200, 206}, m = "addBucket$suspendImpl", n = {"$this", "$this"}, s = {"L$0", "L$0"})
/* renamed from: X.7U1  reason: invalid class name */
public final class AnonymousClass7U1 extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GalleryPickerViewModel.BucketsCollector this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7U1(GalleryPickerViewModel.BucketsCollector bucketsCollector, C30391dr r2) {
        super(r2);
        this.this$0 = bucketsCollector;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GalleryPickerViewModel.BucketsCollector.A00((C139226yS) null, this.this$0, this);
    }
}
