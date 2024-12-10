package X;

import com.whatsapp.calling.incallnotifbanner.viewmodel.mergers.ParticipantInvitationBannerMerger$merge$2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.7C6  reason: invalid class name */
public final class AnonymousClass7C6 implements E6S {
    public final AnonymousClass00H A00;
    public final AnonymousClass1OS A01;
    public final C18600wl A02;

    public /* bridge */ /* synthetic */ Object Bjj(E8B e8b, E8B e8b2, C30391dr r14) {
        AnonymousClass7C7 r6 = (AnonymousClass7C7) e8b;
        AnonymousClass7C7 r7 = (AnonymousClass7C7) e8b2;
        C122636Rd r1 = r6.A04;
        if (r1 != r7.A04) {
            return null;
        }
        if (r1 != C122636Rd.A0E && r1 != C122636Rd.A0F) {
            return null;
        }
        List list = r6.A0B;
        Set A12 = C29431cG.A12(list);
        List list2 = r7.A0B;
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list2) {
            AnonymousClass3MZ.A1V(next, A13, A12.contains(next) ? 1 : 0);
        }
        return C30451dy.A00(r14, this.A02, new ParticipantInvitationBannerMerger$merge$2(r6, r7, this, C29431cG.A0k(A13, list), (C30391dr) null));
    }

    public AnonymousClass7C6(AnonymousClass00H r1, AnonymousClass1OS r2, C18600wl r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
