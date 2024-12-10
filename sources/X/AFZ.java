package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.util.Log;

public class AFZ implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public AFZ(int i, String str, Object obj) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final boolean onLongClick(View view) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C161588Gc r4 = (C161588Gc) obj;
            String str = this.A02;
            ClipboardManager A09 = r4.A0N.A09();
            if (A09 != null) {
                try {
                    A09.setPrimaryClip(ClipData.newPlainText(str, str));
                    r4.A0I.A08(2131897006, 0);
                    return true;
                } catch (NullPointerException | SecurityException e) {
                    r4.A0g.A0A("getTransactionIdRow paymentTransactionID", e);
                }
            }
            r4.A0I.A08(2131897878, 0);
            return true;
        }
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) obj;
        String str2 = this.A02;
        ClipboardManager A092 = indiaUpiPaymentSettingsFragment.A0A.A09();
        if (A092 == null) {
            return true;
        }
        try {
            A092.setPrimaryClip(ClipData.newPlainText(str2, str2));
            indiaUpiPaymentSettingsFragment.A0B.A0G(indiaUpiPaymentSettingsFragment.A1H(2131898299), 1);
            return true;
        } catch (NullPointerException | SecurityException e2) {
            Log.e("indiaupi/clipboard/", e2);
            return true;
        }
    }
}
