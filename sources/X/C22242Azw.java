package X;

import android.content.Intent;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalValidateQrActivity;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalValidateQrViewModel;
import java.math.BigDecimal;

/* renamed from: X.Azw  reason: case insensitive filesystem */
public final class C22242Azw extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ IndiaUpiInternationalValidateQrActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22242Azw(IndiaUpiInternationalValidateQrActivity indiaUpiInternationalValidateQrActivity) {
        super(1);
        this.this$0 = indiaUpiInternationalValidateQrActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass9MV r14 = (AnonymousClass9MV) obj;
        if (r14 instanceof AnonymousClass93p) {
            IndiaUpiInternationalValidateQrActivity indiaUpiInternationalValidateQrActivity = this.this$0;
            ALX alx = indiaUpiInternationalValidateQrActivity.A00;
            if (alx != null) {
                Intent A00 = alx.A00(indiaUpiInternationalValidateQrActivity, true, false);
                IndiaUpiInternationalValidateQrViewModel indiaUpiInternationalValidateQrViewModel = (IndiaUpiInternationalValidateQrViewModel) this.this$0.A02.getValue();
                C18070vi.A0b(A00);
                AEP aep = ((AnonymousClass93p) r14).A00;
                String str = this.this$0.A0f;
                C18070vi.A0d(aep, 1);
                A00.putExtra("extra_payment_handle", AnonymousClass8BT.A0L(AnonymousClass8BR.A0Z(), aep.A09));
                A00.putExtra("extra_merchant_code", aep.A06);
                C144717Ik A0Z = AnonymousClass8BR.A0Z();
                String str2 = aep.A07;
                A00.putExtra("extra_payee_name", AnonymousClass8BR.A0Y(A0Z, String.class, str2, "accountHolderName"));
                A00.putExtra("extra_initiation_mode", aep.A04);
                A00.putExtra("extra_purpose_code", "11");
                A00.putExtra("extra_payment_preset_amount", aep.A08);
                A00.putExtra("extra_payment_preset_min_amount", (String) null);
                A00.putExtra("extra_skip_value_props_display", false);
                String str3 = aep.A02;
                int i = 9;
                if (!str3.equals("DEEP_LINK")) {
                    i = 8;
                }
                A00.putExtra("extra_payments_entry_type", i);
                C18030ve r1 = indiaUpiInternationalValidateQrViewModel.A01;
                BigDecimal bigDecimal = C20092A6u.A00;
                A00.putExtra("extra_payment_preset_max_amount", AnonymousClass8BX.A04(r1));
                A00.putExtra("extra_payee_name", AnonymousClass8BW.A0K(str2, "accountHolderName"));
                A00.putExtra("extra_is_first_payment_method", true);
                A00.putExtra("extra_upi_global_meta_data", aep);
                AnonymousClass8BR.A1D(A00, str);
                A00.putExtra("extra_is_pay_money_only", true);
                A00.putExtra("return-after-pay", "DEEP_LINK".equals(str3));
                A00.putExtra("verify-vpa-in-background", false);
                A00.addFlags(33554432);
                this.this$0.startActivity(A00);
                this.this$0.finish();
            } else {
                C18070vi.A11("paymentActivityLauncher");
                throw null;
            }
        }
        return C27621Wu.A00;
    }
}
