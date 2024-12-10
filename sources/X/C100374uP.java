package X;

import com.whatsapp.community.mex.AllowNonAdminSubGroupCreationGraphQlHandler;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.mex.AllowNonAdminSubGroupCreationGraphQlHandler", f = "AllowNonAdminSubGroupCreationGraphQlHandler.kt", i = {0}, l = {40}, m = "setAllow", n = {"this"}, s = {"L$0"})
/* renamed from: X.4uP  reason: invalid class name and case insensitive filesystem */
public final class C100374uP extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AllowNonAdminSubGroupCreationGraphQlHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100374uP(AllowNonAdminSubGroupCreationGraphQlHandler allowNonAdminSubGroupCreationGraphQlHandler, C30391dr r2) {
        super(r2);
        this.this$0 = allowNonAdminSubGroupCreationGraphQlHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((AnonymousClass1EC) null, this, false);
    }
}
