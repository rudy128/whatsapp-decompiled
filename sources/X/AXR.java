package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.security.KeyStore;
import java.security.KeyStoreException;
import org.json.JSONException;
import org.json.JSONObject;

public class AXR implements AnonymousClass3M8 {
    public final C190259kd A00;
    public final AnonymousClass1QL A01;
    public final AnonymousClass1QD A02;
    public final C184739bR A03;
    public final A5B A04;

    public void BIG(String str, boolean z) {
    }

    public void CRC(C170278pb r1) {
    }

    public void BIC() {
        this.A02.A03().edit().putString("payments_setup_country_specific_info", (String) null).apply();
        this.A00.A00(false);
        this.A04.A04("personal");
        C184739bR r3 = this.A03;
        C190189kW r0 = (C190189kW) r3.A01.A00.get();
        if (r0 != null) {
            try {
                KeyStore keyStore = r0.A00;
                if (keyStore.containsAlias("alias-payments-br-trusted-device-key")) {
                    keyStore.deleteEntry("alias-payments-br-trusted-device-key");
                }
            } catch (KeyStoreException unused) {
                Log.e("PAY: Secp256r1KeyStoreHelper/deleteKeyPair failed");
            }
        }
        try {
            AnonymousClass1QD r2 = r3.A00;
            String A06 = r2.A06();
            if (!TextUtils.isEmpty(A06)) {
                JSONObject A16 = C17880vN.A16(A06);
                A16.remove("td");
                AnonymousClass8BT.A1G(r2, A16);
            }
        } catch (JSONException e) {
            Log.w("PAY: TrustedDeviceKeyStore delete failed", e);
        }
    }

    public void BII() {
        AnonymousClass1QD r2 = this.A02;
        C17880vN.A1B(AnonymousClass8BU.A07(r2).remove("pix_prominence_used").remove("pix_prominence_total_orders_sent_l30").remove("pix_prominence_last_order_query_timestamp"), "pix_used");
        C17880vN.A1B(AnonymousClass8BU.A07(r2), "payment_brazil_p2p_banner_deprecation_dismissed");
    }

    public boolean CLf() {
        AnonymousClass1QD r2 = this.A02;
        if (!C17880vN.A1W(r2.A03(), "payments_card_can_receive_payment") || !this.A01.A0F() || !r2.A03().getString("pref_income_verification_state", "not_required").equals("collected")) {
            return true;
        }
        return false;
    }

    public void CQQ(long j, boolean z) {
        AnonymousClass1QD r3 = this.A02;
        C17880vN.A1F(AnonymousClass8BU.A07(r3), "payment_account_recoverable", z);
        if (!z) {
            r3.A0H(0);
        } else if (j > 0) {
            r3.A0H(j * 1000);
        } else {
            r3.A0B();
        }
    }

    public AXR(AnonymousClass1QL r1, AnonymousClass1QD r2, C184739bR r3, A5B a5b, C190259kd r5) {
        this.A04 = a5b;
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A00 = r5;
    }
}
