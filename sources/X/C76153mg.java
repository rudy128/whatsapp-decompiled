package X;

import android.view.View;
import com.whatsapp.WaImageView;
import com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel;

/* renamed from: X.3mg  reason: invalid class name and case insensitive filesystem */
public class C76153mg extends AnonymousClass3ZY {
    public final WaImageView A00;
    public final boolean A01;

    public C76153mg(View view, ParticipantsListViewModel participantsListViewModel, boolean z) {
        super(view, participantsListViewModel);
        this.A01 = z;
        WaImageView A0R = AnonymousClass3MW.A0R(view, 2131435362);
        this.A00 = A0R;
        if (z) {
            A0R.setBackgroundResource(2131232780);
        }
        C90034dQ.A01(view, participantsListViewModel, 13);
    }
}
