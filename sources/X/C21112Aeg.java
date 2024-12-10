package X;

import android.content.Intent;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;

/* renamed from: X.Aeg  reason: case insensitive filesystem */
public final /* synthetic */ class C21112Aeg implements AnonymousClass1TI {
    public final /* synthetic */ IndiaUpiSendPaymentActivity A00;
    public final /* synthetic */ boolean A01;

    public final void accept(Object obj) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        boolean z = this.A01;
        C20284AEs aEs = (C20284AEs) obj;
        indiaUpiSendPaymentActivity.A0B = aEs;
        Intent A03 = IndiaUpiPinPrimerFullSheetActivity.A03(indiaUpiSendPaymentActivity, (AnonymousClass8pN) aEs, indiaUpiSendPaymentActivity.A0b, z);
        int i = 1016;
        if (z) {
            i = 1017;
        }
        indiaUpiSendPaymentActivity.startActivityForResult(A03, i);
    }

    public /* synthetic */ C21112Aeg(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity, boolean z) {
        this.A00 = indiaUpiSendPaymentActivity;
        this.A01 = z;
    }
}
