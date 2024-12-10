package X;

import com.whatsapp.community.TransferCommunityOwnershipActivity;

/* renamed from: X.5Ey  reason: invalid class name and case insensitive filesystem */
public final class C102045Ey extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ TransferCommunityOwnershipActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102045Ey(TransferCommunityOwnershipActivity transferCommunityOwnershipActivity) {
        super(0);
        this.this$0 = transferCommunityOwnershipActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        TransferCommunityOwnershipActivity transferCommunityOwnershipActivity = this.this$0;
        AnonymousClass4J4 r3 = transferCommunityOwnershipActivity.A01;
        if (r3 != null) {
            Object value = transferCommunityOwnershipActivity.A08.getValue();
            C18070vi.A0d(value, 1);
            return new C91774gE(r3, value, 5);
        }
        C18070vi.A11("transferCommunityOwnershipViewModelFactory");
        throw null;
    }
}
