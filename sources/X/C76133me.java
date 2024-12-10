package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.WaImageView;
import com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel;

/* renamed from: X.3me  reason: invalid class name and case insensitive filesystem */
public class C76133me extends AnonymousClass3ZY {
    public final WaImageView A00;
    public final boolean A01;

    public C76133me(View view, ParticipantsListViewModel participantsListViewModel, boolean z) {
        super(view, participantsListViewModel);
        this.A01 = z;
        WaImageView A0R = AnonymousClass3MW.A0R(view, 2131427626);
        this.A00 = A0R;
        TextView A0J = AnonymousClass3MW.A0J(view, 2131427628);
        if (z) {
            A0J.setText(2131887613);
            A0R.setBackgroundResource(2131232780);
            return;
        }
        A0J.setText(2131898163);
    }
}
