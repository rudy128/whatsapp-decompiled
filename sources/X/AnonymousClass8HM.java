package X;

import android.text.TextUtils;
import com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity;

/* renamed from: X.8HM  reason: invalid class name */
public class AnonymousClass8HM extends C58342kX {
    public final /* synthetic */ C161748Hp A00;

    public AnonymousClass8HM(C161748Hp r1) {
        this.A00 = r1;
    }

    public int A00(int i) {
        C161748Hp r4 = this.A00;
        C192459oQ r2 = (C192459oQ) r4.A03.get(i);
        int i2 = r2.A00;
        if (i2 != 3 && i2 != 1) {
            return 4;
        }
        AnonymousClass8pS r22 = r2.A01;
        IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = (IndiaUpiBankPickerActivity) r4.A01;
        if (!TextUtils.isEmpty((CharSequence) C108945cZ.A0N(indiaUpiBankPickerActivity.A0H, indiaUpiBankPickerActivity.A0I).first) || r22 == null || !r22.A0K) {
            return 4;
        }
        return 1;
    }
}
