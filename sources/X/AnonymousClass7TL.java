package X;

import com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel", f = "ContactPickerViewModel.kt", i = {}, l = {82}, m = "checkBotProfile", n = {}, s = {})
/* renamed from: X.7TL  reason: invalid class name */
public final class AnonymousClass7TL extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ContactPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TL(ContactPickerViewModel contactPickerViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = contactPickerViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ContactPickerViewModel.A00(this.this$0, (UserJid) null, this);
    }
}
