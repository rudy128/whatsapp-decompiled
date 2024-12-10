package X;

import com.whatsapp.conversation.conversationrow.components.contextcard.GroupDescriptionAddUpsellViewModel;
import com.whatsapp.protocol.SetGroupDescriptionProtocolHelper;

/* renamed from: X.2yx  reason: invalid class name and case insensitive filesystem */
public class C66922yx implements C28527E6b {
    public final int A00;
    public final Object A01;

    public C66922yx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public GroupDescriptionAddUpsellViewModel BGQ(AnonymousClass1EC r10) {
        AnonymousClass10E r2;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            r2 = ((AnonymousClass10H) obj).A00;
        } else {
            r2 = ((AnonymousClass1K2) obj).A01;
        }
        AnonymousClass10I AL1 = AnonymousClass10E.AL1(r2);
        AnonymousClass1M9 A50 = AnonymousClass10E.A50(r2);
        AnonymousClass10G r1 = r2.A00;
        return new GroupDescriptionAddUpsellViewModel(A50, (AnonymousClass4QW) r1.A4V.get(), r10, (SetGroupDescriptionProtocolHelper) r1.A4U.get(), AL1, (C18600wl) r2.A9E.get());
    }
}
