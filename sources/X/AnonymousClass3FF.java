package X;

import com.whatsapp.community.CommunityMembersDirectory;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.CommunityMembersDirectory", f = "CommunityMembersDirectory.kt", i = {0}, l = {135}, m = "getCommunityDirectoryPhoneUserJids", n = {"this"}, s = {"L$0"})
/* renamed from: X.3FF  reason: invalid class name */
public final class AnonymousClass3FF extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CommunityMembersDirectory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3FF(CommunityMembersDirectory communityMembersDirectory, C30391dr r2) {
        super(r2);
        this.this$0 = communityMembersDirectory;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.BOz((AnonymousClass1EC) null, this);
    }
}
