package X;

import com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler", f = "ConversationFilterMenuHandler.kt", i = {0, 0}, l = {290}, m = "setupContextMenuForFavorites", n = {"this", "menu"}, s = {"L$0", "L$1"})
/* renamed from: X.4us  reason: invalid class name and case insensitive filesystem */
public final class C100664us extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ConversationFilterMenuHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100664us(ConversationFilterMenuHandler conversationFilterMenuHandler, C30391dr r2) {
        super(r2);
        this.this$0 = conversationFilterMenuHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ConversationFilterMenuHandler.A01((C03610Iy) null, this.this$0, this);
    }
}
