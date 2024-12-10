package X;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;

/* renamed from: X.A9z  reason: case insensitive filesystem */
public class C20163A9z implements DialogInterface.OnShowListener {
    public final int A00;
    public final Object A01;

    public C20163A9z(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onShow(DialogInterface dialogInterface) {
        Button button;
        View.OnClickListener r2;
        Object obj;
        int i;
        switch (this.A00) {
            case 0:
                Object obj2 = this.A01;
                C18070vi.A0d(dialogInterface, 1);
                button = ((C010105w) dialogInterface).A00.A0H;
                r2 = new C177649Aa(obj2, 47);
                break;
            case 1:
                obj = this.A01;
                button = ((C010105w) dialogInterface).A00.A0H;
                i = 14;
                break;
            case 2:
                IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity = (IndiaUpiMandatePaymentActivity) this.A01;
                AFT.A00(((C010105w) dialogInterface).A00.A0H, indiaUpiMandatePaymentActivity, dialogInterface, 13);
                indiaUpiMandatePaymentActivity.A0S.BiI((Integer) null, "decline_mandate_dialogue", indiaUpiMandatePaymentActivity.A04, 0, true);
                return;
            default:
                obj = this.A01;
                button = ((C010105w) dialogInterface).A00.A0H;
                i = 18;
                break;
        }
        r2 = new AFT(obj, dialogInterface, i);
        button.setOnClickListener(r2);
    }
}
