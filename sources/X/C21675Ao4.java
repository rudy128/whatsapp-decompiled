package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.wapdata.generated.profilepicture.outgoing.ProfilePictureRPCManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.wapdata.generated.profilepicture.outgoing.ProfilePictureRPCManager", f = "ProfilePictureRPCManager.kt", i = {0}, l = {169}, m = "sendGetRPCWithResult", n = {"request"}, s = {"L$0"})
/* renamed from: X.Ao4  reason: case insensitive filesystem */
public final class C21675Ao4 extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ProfilePictureRPCManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21675Ao4(ProfilePictureRPCManager profilePictureRPCManager, C30391dr r2) {
        super(r2);
        this.this$0 = profilePictureRPCManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((Jid) null, (String) null, this, 0);
    }
}
