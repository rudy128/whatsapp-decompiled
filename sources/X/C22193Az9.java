package X;

import com.whatsapp.group.GetSubgroupsManager;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.Az9  reason: case insensitive filesystem */
public final class C22193Az9 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ GetSubgroupsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22193Az9(GetSubgroupsManager getSubgroupsManager) {
        super(1);
        this.this$0 = getSubgroupsManager;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        GroupJid groupJid = (GroupJid) obj;
        C18070vi.A0d(groupJid, 0);
        return Boolean.valueOf(this.this$0.A00.A0J(groupJid));
    }
}
