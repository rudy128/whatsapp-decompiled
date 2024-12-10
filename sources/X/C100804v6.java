package X;

import android.view.View;
import com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler", f = "ConversationFilterMenuHandler.kt", i = {0, 0, 0}, l = {103}, m = "showContextMenuIfAvailableImpl", n = {"this", "chip", "popupMenu"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.4v6  reason: invalid class name and case insensitive filesystem */
public final class C100804v6 extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ConversationFilterMenuHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100804v6(ConversationFilterMenuHandler conversationFilterMenuHandler, C30391dr r2) {
        super(r2);
        this.this$0 = conversationFilterMenuHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ConversationFilterMenuHandler.A00((View) null, (C41531wa) null, this.this$0, this, 0);
    }
}
