package X;

import com.whatsapp.group.view.custom.GroupDetailsCard;

/* renamed from: X.4jG  reason: invalid class name and case insensitive filesystem */
public final class C93614jG implements C107915ap {
    public final /* synthetic */ AnonymousClass1E7 A00;
    public final /* synthetic */ GroupDetailsCard A01;
    public final /* synthetic */ AnonymousClass1EC A02;

    public void CNj(AnonymousClass1E7 r1) {
    }

    public C93614jG(AnonymousClass1E7 r1, GroupDetailsCard groupDetailsCard, AnonymousClass1EC r3) {
        this.A01 = groupDetailsCard;
        this.A00 = r1;
        this.A02 = r3;
    }

    public void CCS(AnonymousClass1E7 r12, boolean z) {
        GroupDetailsCard groupDetailsCard = this.A01;
        AnonymousClass1VP callsManager = groupDetailsCard.getCallsManager();
        AnonymousClass1E7 r3 = this.A00;
        callsManager.CNy(groupDetailsCard.getContext(), this.A02, C63982u1.A04(groupDetailsCard.getMeManager(), groupDetailsCard.getContactManager(), groupDetailsCard.getGroupParticipantsManager(), r3), 10, z);
    }
}
