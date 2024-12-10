package X;

import android.view.View;
import com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel;

/* renamed from: X.3mf  reason: invalid class name and case insensitive filesystem */
public final class C76143mf extends AnonymousClass3ZY {
    public final C18100vl A00;
    public final C18100vl A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76143mf(View view, ParticipantsListViewModel participantsListViewModel, boolean z) {
        super(view, participantsListViewModel);
        C18070vi.A0d(view, 1);
        if (z) {
            view.setMinimumHeight(view.getResources().getDimensionPixelSize(2131169388));
            C39351sv A012 = C43531zx.A01(view);
            A012.A03 = view.getResources().getDimensionPixelSize(2131168159);
            C43531zx.A03(view, A012);
        }
        this.A01 = AnonymousClass1DF.A01(new AnonymousClass5DH(view));
        this.A00 = AnonymousClass1DF.A01(new AnonymousClass5DG(view));
    }
}
