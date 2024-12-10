package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9kf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C190279kf {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IndiaUpiSecureQrCodeViewModel A01;

    public final void A00(A7B a7b, String str) {
        C20118A8b A002;
        IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel = this.A01;
        int i = this.A00;
        if (a7b != null) {
            C22801Dg r2 = indiaUpiSecureQrCodeViewModel.A00;
            C20118A8b a8b = (C20118A8b) AnonymousClass8BS.A0W(r2);
            a8b.A04 = "01";
            r2.A0F(a8b);
        } else if (!(TextUtils.isEmpty(str) || (A002 = C20118A8b.A00(Uri.parse(str), "SCANNED_QR_CODE")) == null || A002.A0I == null)) {
            indiaUpiSecureQrCodeViewModel.A00.A0F(A002);
            if (A002.A0A == null) {
                AXS axs = indiaUpiSecureQrCodeViewModel.A06;
                synchronized (axs) {
                    try {
                        AnonymousClass1QD r6 = axs.A01;
                        JSONObject A0c = AnonymousClass8BY.A0c(r6);
                        A0c.put("signedQrCode", str);
                        A0c.put("signedQrCodeTs", AnonymousClass11P.A01(axs.A00));
                        AnonymousClass8BT.A1G(r6, A0c);
                    } catch (JSONException e) {
                        Log.w("PAY: IndiaUpiPaymentSharedPrefs storeQrSignature threw: ", e);
                    }
                }
            }
        }
        IndiaUpiSecureQrCodeViewModel.A03(indiaUpiSecureQrCodeViewModel, 0, i);
        return;
    }

    public /* synthetic */ C190279kf(IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel, int i) {
        this.A01 = indiaUpiSecureQrCodeViewModel;
        this.A00 = i;
    }
}
