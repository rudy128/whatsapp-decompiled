package X;

import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Ax  reason: invalid class name and case insensitive filesystem */
public class C177869Ax extends A34 {
    public final ArrayList A00;
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A01;

    public C177869Ax(PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity, ArrayList arrayList) {
        ArrayList arrayList2;
        this.A01 = paymentGroupParticipantPickerActivity;
        if (arrayList != null) {
            arrayList2 = C17880vN.A10(arrayList);
        } else {
            arrayList2 = null;
        }
        this.A00 = arrayList2;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A01;
        paymentGroupParticipantPickerActivity.A0D = null;
        AnonymousClass8D9 r0 = paymentGroupParticipantPickerActivity.A0E;
        r0.A00 = (List) obj;
        r0.notifyDataSetChanged();
    }
}
