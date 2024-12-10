package X;

import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.payments.ui.BrazilPixKeySettingActivity;
import com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.Azo  reason: case insensitive filesystem */
public final class C22234Azo extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BrazilPixKeySettingActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22234Azo(BrazilPixKeySettingActivity brazilPixKeySettingActivity) {
        super(1);
        this.this$0 = brazilPixKeySettingActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C194929sW r8 = (C194929sW) obj;
        BrazilPixKeySettingActivity brazilPixKeySettingActivity = this.this$0;
        brazilPixKeySettingActivity.A02 = r8;
        if (r8 != null) {
            PaymentMethodRow paymentMethodRow = brazilPixKeySettingActivity.A07;
            String str = "paymentMethodRow";
            if (paymentMethodRow != null) {
                AnonymousClass8BV.A14(brazilPixKeySettingActivity, paymentMethodRow, 2131887387);
                PaymentMethodRow paymentMethodRow2 = brazilPixKeySettingActivity.A07;
                if (paymentMethodRow2 != null) {
                    paymentMethodRow2.setAccountId(r8.A03);
                    PaymentMethodRow paymentMethodRow3 = brazilPixKeySettingActivity.A07;
                    if (paymentMethodRow3 != null) {
                        paymentMethodRow3.A03(r8.A01, false);
                        PaymentMethodRow paymentMethodRow4 = brazilPixKeySettingActivity.A07;
                        if (paymentMethodRow4 != null) {
                            paymentMethodRow4.A04.A01();
                            if (!brazilPixKeySettingActivity.A0C) {
                                if (BrazilPixKeySettingActivity.A0Q(brazilPixKeySettingActivity)) {
                                    PaymentMethodRow paymentMethodRow5 = brazilPixKeySettingActivity.A07;
                                    if (paymentMethodRow5 != null) {
                                        paymentMethodRow5.A05.setImageResource(2131231847);
                                        paymentMethodRow5.A05.setVisibility(0);
                                        int A00 = C19740yt.A00(brazilPixKeySettingActivity, 2131101222);
                                        int applyDimension = (int) TypedValue.applyDimension(1, 24.0f, C108965cb.A08(brazilPixKeySettingActivity));
                                        PaymentMethodRow paymentMethodRow6 = brazilPixKeySettingActivity.A07;
                                        if (paymentMethodRow6 != null) {
                                            ImageView A0H = AnonymousClass3MW.A0H(paymentMethodRow6, 2131433580);
                                            AnonymousClass3MX.A1F(A0H, applyDimension);
                                            A0H.getLayoutParams().width = applyDimension;
                                            AnonymousClass4aX.A0D(A0H, A00);
                                        }
                                    }
                                }
                                View findViewById = brazilPixKeySettingActivity.findViewById(2131429895);
                                AnonymousClass8BU.A15(findViewById, 2131429897, C19740yt.A00(brazilPixKeySettingActivity, 2131101222));
                                C17880vN.A0E(findViewById, 2131429899).setText(2131887397);
                                brazilPixKeySettingActivity.A05.A0C(brazilPixKeySettingActivity);
                                AFO.A00(findViewById, brazilPixKeySettingActivity, 6);
                                if (BrazilPixKeySettingActivity.A0Q(brazilPixKeySettingActivity)) {
                                    findViewById.setVisibility(8);
                                    PaymentMethodRow paymentMethodRow7 = brazilPixKeySettingActivity.A07;
                                    if (paymentMethodRow7 != null) {
                                        AFO.A00(paymentMethodRow7.findViewById(2131433580), brazilPixKeySettingActivity, 7);
                                    }
                                }
                                BrazilPixKeySettingViewModel brazilPixKeySettingViewModel = brazilPixKeySettingActivity.A06;
                                if (brazilPixKeySettingViewModel == null) {
                                    str = "brazilPixKeySettingViewModel";
                                } else {
                                    C20339AGv.A00(brazilPixKeySettingActivity, brazilPixKeySettingViewModel.A01, new C22233Azn(brazilPixKeySettingActivity), 37);
                                    C30921ej r0 = brazilPixKeySettingActivity.A04;
                                    if (r0 != null) {
                                        C30911ei A002 = r0.A00();
                                        if (A002 != null) {
                                            if (C18020vd.A05(C18040vf.A02, A002.A00, 12117)) {
                                                AnonymousClass3Ma.A0x(brazilPixKeySettingActivity, 2131430259).A04(0);
                                                View findViewById2 = brazilPixKeySettingActivity.findViewById(2131430258);
                                                AnonymousClass8BU.A15(findViewById2, 2131430260, C19740yt.A00(brazilPixKeySettingActivity, 2131101222));
                                                C17880vN.A0E(findViewById2, 2131430261).setText(2131887396);
                                                AnonymousClass3Ma.A1D(findViewById2, brazilPixKeySettingActivity, 29);
                                            }
                                        }
                                        PaymentMethodRow paymentMethodRow8 = (PaymentMethodRow) brazilPixKeySettingActivity.findViewById(2131435718);
                                        if (!BrazilPixKeySettingActivity.A0Q(brazilPixKeySettingActivity)) {
                                            paymentMethodRow8.setVisibility(8);
                                        } else {
                                            paymentMethodRow8.A03.setText(C17880vN.A0q(brazilPixKeySettingActivity, brazilPixKeySettingActivity.A09, new Object[1], 0, 2131887401));
                                            paymentMethodRow8.A03(brazilPixKeySettingActivity.getString(2131887400), false);
                                            int applyDimension2 = (int) TypedValue.applyDimension(1, 40.0f, C108965cb.A08(brazilPixKeySettingActivity));
                                            ImageView A0H2 = AnonymousClass3MW.A0H(paymentMethodRow8, 2131433590);
                                            AnonymousClass3MX.A1F(A0H2, applyDimension2);
                                            A0H2.getLayoutParams().width = applyDimension2;
                                            A0H2.setImageResource(2131233522);
                                            paymentMethodRow8.A05(false);
                                            brazilPixKeySettingActivity.A05.A0C(brazilPixKeySettingActivity);
                                            AFO.A00(paymentMethodRow8, brazilPixKeySettingActivity, 5);
                                        }
                                        brazilPixKeySettingActivity.A0C = true;
                                    } else {
                                        str = "paymentsGeoGating";
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C18070vi.A11(str);
            throw null;
        }
        return C27621Wu.A00;
    }
}
