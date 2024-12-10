package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.actionfeedback.view.ActionFeedbackViewGroup;
import com.whatsapp.util.Log;

/* renamed from: X.4qm  reason: invalid class name and case insensitive filesystem */
public class C98224qm implements C38531rR {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C98224qm(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final void Bvu(View view) {
        if (this.A00 != 0) {
            AnonymousClass4aY r6 = (AnonymousClass4aY) this.A02;
            int i = this.A01;
            ImageView A0I = AnonymousClass3MX.A0I(AnonymousClass3MW.A0P(r6), 2131433503);
            if (A0I == null) {
                Log.e("conversation/oncreate paymentBtn is null");
                return;
            }
            A0I.setImageDrawable(r6.A3s.A0N(A0I.getContext(), r6.A3k.A02(), 2131101222, 2131169467));
            C90104dX.A00(A0I, r6, i, 15);
            r6.A4U = C72453Mb.A0r(AnonymousClass3MW.A0P(r6), 2131433506);
            return;
        }
        int i2 = this.A01;
        ActionFeedbackViewGroup actionFeedbackViewGroup = (ActionFeedbackViewGroup) view;
        C18070vi.A0b(actionFeedbackViewGroup);
        C75393hQ.A00(actionFeedbackViewGroup, i2);
    }
}
