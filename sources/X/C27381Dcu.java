package X;

import com.whatsapp.conversation.conversationrow.components.contextcard.GroupDescriptionAddUpsellViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.components.contextcard.GroupDescriptionAddUpsellViewModel", f = "GroupDescriptionAddUpsellViewModel.kt", i = {0}, l = {98}, m = "sendSetGroupDescription", n = {"this"}, s = {"L$0"})
/* renamed from: X.Dcu  reason: case insensitive filesystem */
public final class C27381Dcu extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GroupDescriptionAddUpsellViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27381Dcu(GroupDescriptionAddUpsellViewModel groupDescriptionAddUpsellViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = groupDescriptionAddUpsellViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GroupDescriptionAddUpsellViewModel.A00(this.this$0, (String) null, this);
    }
}
