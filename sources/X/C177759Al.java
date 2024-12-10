package X;

import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import java.util.ArrayList;

/* renamed from: X.9Al  reason: invalid class name and case insensitive filesystem */
public class C177759Al extends A34 {
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A00;

    public C177759Al(PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity) {
        this.A00 = paymentGroupParticipantPickerActivity;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A00;
        paymentGroupParticipantPickerActivity.CEx();
        AnonymousClass8D9 r1 = paymentGroupParticipantPickerActivity.A0E;
        ArrayList arrayList = paymentGroupParticipantPickerActivity.A0N;
        r1.A00 = arrayList;
        r1.notifyDataSetChanged();
        C003401n supportActionBar = paymentGroupParticipantPickerActivity.getSupportActionBar();
        if (supportActionBar != null) {
            C18000vb r5 = paymentGroupParticipantPickerActivity.A00;
            long A06 = AnonymousClass8BR.A06(arrayList);
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass000.A1L(A1a, arrayList.size());
            supportActionBar.A0R(r5.A0K(A1a, 2131755250, A06));
        }
    }
}
