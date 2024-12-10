package X;

import com.whatsapp.community.mex.TransferCommunityOwnershipGraphQlHandler;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.mex.TransferCommunityOwnershipGraphQlHandler", f = "TransferCommunityOwnershipGraphQlHandler.kt", i = {}, l = {34}, m = "sendMexTransferOwnershipMutation", n = {}, s = {})
/* renamed from: X.AnB  reason: case insensitive filesystem */
public final class C21620AnB extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TransferCommunityOwnershipGraphQlHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21620AnB(TransferCommunityOwnershipGraphQlHandler transferCommunityOwnershipGraphQlHandler, C30391dr r2) {
        super(r2);
        this.this$0 = transferCommunityOwnershipGraphQlHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((GroupJid) null, (UserJid) null, this);
    }
}
