package X;

import com.whatsapp.lists.picker.ListsContactPickerViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.picker.ListsContactPickerViewModel", f = "ListsContactPickerViewModel.kt", i = {0, 0, 0, 0}, l = {95}, m = "loadSuggestions", n = {"this", "suggestedContacts", "$this$measureTimeUsingUptimeMillis$iv", "start$iv"}, s = {"L$0", "L$1", "L$2", "J$0"})
/* renamed from: X.4vF  reason: invalid class name and case insensitive filesystem */
public final class C100894vF extends C30421du {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ListsContactPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100894vF(ListsContactPickerViewModel listsContactPickerViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = listsContactPickerViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ListsContactPickerViewModel.A03((AnonymousClass4CZ) null, this.this$0, this);
    }
}
