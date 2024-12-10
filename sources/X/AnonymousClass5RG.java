package X;

import com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet;
import java.util.List;

/* renamed from: X.5RG  reason: invalid class name */
public final class AnonymousClass5RG extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CommunityNewSubgroupSwitcherBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5RG(CommunityNewSubgroupSwitcherBottomSheet communityNewSubgroupSwitcherBottomSheet) {
        super(1);
        this.this$0 = communityNewSubgroupSwitcherBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C18070vi.A0d(list, 0);
        C40401ue r0 = this.this$0.A03;
        if (r0 == null) {
            C18070vi.A11("subgroupAdapter");
            throw null;
        }
        r0.A00.A00((Runnable) null, list);
        return C27621Wu.A00;
    }
}
