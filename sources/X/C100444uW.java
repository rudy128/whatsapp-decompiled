package X;

import com.whatsapp.lists.picker.ListsContactPickerViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.picker.ListsContactPickerViewModel", f = "ListsContactPickerViewModel.kt", i = {}, l = {87}, m = "loadListConversations", n = {}, s = {})
/* renamed from: X.4uW  reason: invalid class name and case insensitive filesystem */
public final class C100444uW extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ListsContactPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100444uW(ListsContactPickerViewModel listsContactPickerViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = listsContactPickerViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ListsContactPickerViewModel.A00((C41761x1) null, this.this$0, this);
    }
}
