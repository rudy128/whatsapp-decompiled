package X;

import com.whatsapp.community.mex.GetSuggestedGroupsGraphQlHandler;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.mex.GetSuggestedGroupsGraphQlHandler", f = "GetSuggestedGroupsGraphQlHandler.kt", i = {0}, l = {42}, m = "fetch", n = {"parentGroupJid"}, s = {"L$0"})
/* renamed from: X.4ur  reason: invalid class name and case insensitive filesystem */
public final class C100654ur extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetSuggestedGroupsGraphQlHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100654ur(GetSuggestedGroupsGraphQlHandler getSuggestedGroupsGraphQlHandler, C30391dr r2) {
        super(r2);
        this.this$0 = getSuggestedGroupsGraphQlHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((AnonymousClass1EC) null, (AnonymousClass1EC) null, this);
    }
}
