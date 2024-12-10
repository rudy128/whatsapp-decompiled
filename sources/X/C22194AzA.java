package X;

import com.whatsapp.group.GroupMembershipApprovalRequestsFragment;
import com.whatsapp.group.GroupPendingRequestsViewModel$sendAction$1;
import java.util.List;

/* renamed from: X.AzA  reason: case insensitive filesystem */
public final class C22194AzA extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ GroupMembershipApprovalRequestsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22194AzA(GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment) {
        super(1);
        this.this$0 = groupMembershipApprovalRequestsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        B5D b5d;
        int A0M = AnonymousClass000.A0M(obj);
        AnonymousClass1KB r0 = this.this$0.A01;
        if (r0 != null) {
            if (r0.A0N()) {
                AnonymousClass8GR r5 = this.this$0.A06;
                if (r5 == null) {
                    str = "viewModel";
                } else {
                    List A10 = AnonymousClass3MW.A10(r5.A02);
                    if (A10 != null) {
                        b5d = (B5D) A10.get(A0M);
                    } else {
                        b5d = null;
                    }
                    if (b5d instanceof AUA) {
                        AUA aua = (AUA) b5d;
                        C179639It r3 = C179639It.A02;
                        aua.A03 = r3;
                        aua.A01 = AnonymousClass11P.A01(r5.A08);
                        r5.A04.A0E(b5d);
                        AnonymousClass3MX.A1Q(new GroupPendingRequestsViewModel$sendAction$1(r3, aua, r5, (C30391dr) null, A0M), C41561wd.A00(r5));
                    }
                }
            }
            return C27621Wu.A00;
        }
        str = "globalUi";
        C18070vi.A11(str);
        throw null;
    }
}
