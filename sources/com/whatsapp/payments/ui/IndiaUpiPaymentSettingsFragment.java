package com.whatsapp.payments.ui;

import X.A54;
import X.A5H;
import X.A5V;
import X.A8e;
import X.AFP;
import X.AFT;
import X.AFV;
import X.AFZ;
import X.ALX;
import X.AQF;
import X.ATZ;
import X.AXA;
import X.AXS;
import X.AZ6;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass11C;
import X.AnonymousClass11E;
import X.AnonymousClass11O;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass122;
import X.AnonymousClass18O;
import X.AnonymousClass1E8;
import X.AnonymousClass1FL;
import X.AnonymousClass1FR;
import X.AnonymousClass1HF;
import X.AnonymousClass1J8;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4AC;
import X.AnonymousClass4AG;
import X.AnonymousClass4VT;
import X.AnonymousClass4W6;
import X.AnonymousClass4XT;
import X.AnonymousClass4Yv;
import X.AnonymousClass5a6;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass8BY;
import X.AnonymousClass8Dk;
import X.AnonymousClass8FO;
import X.AnonymousClass8GH;
import X.AnonymousClass8pN;
import X.AnonymousClass8pS;
import X.AnonymousClass9BV;
import X.AnonymousClass9RN;
import X.AnonymousClass9YV;
import X.BBX;
import X.C144717Ik;
import X.C161728Hm;
import X.C170278pb;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C184789bW;
import X.C189689je;
import X.C191339mR;
import X.C191529mk;
import X.C191759n8;
import X.C194439rj;
import X.C195859u1;
import X.C195929uA;
import X.C197269wQ;
import X.C19740yt;
import X.C198369yE;
import X.C20063A5m;
import X.C20080A6g;
import X.C20098A7b;
import X.C20110A7s;
import X.C20112A7u;
import X.C20284AEs;
import X.C20337AGt;
import X.C20814AZr;
import X.C21427Aju;
import X.C21435Ak2;
import X.C21447AkE;
import X.C21448AkF;
import X.C22459B8r;
import X.C24751Ln;
import X.C25351CeA;
import X.C26166Ctg;
import X.C26302CxJ;
import X.C29431cG;
import X.C30931ek;
import X.C32981i4;
import X.C33331ie;
import X.C33661jB;
import X.C33701jF;
import X.C37451pZ;
import X.C60442o2;
import X.C678831f;
import X.C70513Bj;
import X.C72463Mc;
import X.C72473Md;
import X.C72933Og;
import X.C86914To;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.WaTextView;
import com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity;
import com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity;
import com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel;
import com.whatsapp.payments.ui.widget.TransactionsExpandableView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.banners.WDSBanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.wawebrtc.MediaCodecVideoEncoder;

public class IndiaUpiPaymentSettingsFragment extends Hilt_IndiaUpiPaymentSettingsFragment implements BBX, C22459B8r, AnonymousClass5a6 {
    public View A00 = null;
    public View A01 = null;
    public View A02 = null;
    public View A03 = null;
    public ImageView A04;
    public AnonymousClass1L9 A05;
    public WaTextView A06;
    public AnonymousClass11E A07;
    public AnonymousClass9BV A08;
    public C678831f A09;
    public AnonymousClass11C A0A;
    public AnonymousClass11O A0B;
    public AnonymousClass122 A0C;
    public C24751Ln A0D;
    public C32981i4 A0E;
    public AnonymousClass1LU A0F;
    public AXS A0G;
    public C20080A6g A0H;
    public C33331ie A0I;
    public ALX A0J;
    public C191339mR A0K;
    public C20110A7s A0L;
    public C33701jF A0M;
    public C191529mk A0N;
    public C195859u1 A0O;
    public A54 A0P;
    public AZ6 A0Q;
    public AQF A0R;
    public C184789bW A0S;
    public A5H A0T;
    public C195929uA A0U;
    public AnonymousClass8FO A0V;
    public C198369yE A0W;
    public C161728Hm A0X;
    public IndiaPaymentSettingsViewModel A0Y;
    public C30931ek A0Z;
    public AnonymousClass4VT A0a;
    public AnonymousClass00H A0b;
    public AnonymousClass00H A0c;
    public AnonymousClass00H A0d;
    public List A0e;
    public C37451pZ A0f;

    public void Bl5(boolean z) {
        boolean z2 = z;
        if (this.A0H.A0A(this.A0G.A0G())) {
            PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
            paymentBottomSheet.A02 = new IndiaUpiAccountTypeSelectionFragment(new C20814AZr(this, paymentBottomSheet, z));
            C20098A7b.A03(paymentBottomSheet, A1B().getSupportFragmentManager(), "IndiaUpiAccountTypeSelectionFragment");
        } else if (z || this.A0G.A0S()) {
            A0B(this, "settingsAddPayment", (String) null, 2, 5, z2, false);
        } else {
            A0A(this, (String) null);
        }
    }

    public void CAu() {
    }

    public boolean CMD() {
        return true;
    }

    public static String A00(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment, String str) {
        JSONObject jSONObject;
        String A0I2 = indiaUpiPaymentSettingsFragment.A02.A0I(3480);
        try {
            C17960vV.A07(A0I2);
            jSONObject = C17880vN.A16(A0I2);
        } catch (JSONException e) {
            Log.e("Error converting abProps to Json", e);
            jSONObject = C17880vN.A15();
        }
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return jSONObject.getString("en");
        } catch (JSONException e2) {
            C17900vP.A0h("Error reading video suffix for language tag ", str, AnonymousClass000.A10(), e2);
            return "X0-QiPD4kqs";
        }
    }

    public static void A04(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment) {
        String str;
        C170278pb r0;
        AnonymousClass8pN r3 = (AnonymousClass8pN) AnonymousClass8BR.A0R(indiaUpiPaymentSettingsFragment.A0a).A07();
        C17960vV.A07(r3);
        AnonymousClass1FL A1D = indiaUpiPaymentSettingsFragment.A1D();
        if (r3 == null || (r0 = r3.A08) == null) {
            str = null;
        } else {
            str = ((AnonymousClass8pS) r0).A0A;
        }
        indiaUpiPaymentSettingsFragment.A1k(IndiaUpiPinPrimerFullSheetActivity.A03(A1D, r3, str, false));
    }

    public static void A08(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment) {
        boolean z;
        if (!C18020vd.A05(C18040vf.A02, indiaUpiPaymentSettingsFragment.A02, 3740) || (!C17880vN.A1W(indiaUpiPaymentSettingsFragment.A0W.A03(), "pref_p2m_hybrid_v2_tos_accepted") && indiaUpiPaymentSettingsFragment.A0w.size() <= 0)) {
            z = false;
        } else {
            z = true;
        }
        View view = indiaUpiPaymentSettingsFragment.A01;
        boolean z2 = false;
        if (z) {
            z2 = true;
        }
        view.setClickable(z2);
        indiaUpiPaymentSettingsFragment.A06.setEnabled(z2);
        indiaUpiPaymentSettingsFragment.A04.setEnabled(z2);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel;
        View view2 = view;
        super.A21(bundle, view2);
        new C189689je(this.A0T).A00(A1D());
        this.A0f = this.A0J.A06(A1n(), "payment-settings");
        C161728Hm r2 = new C161728Hm(A1n(), (GridLayoutManager) this.A18.getLayoutManager(), this.A0f, this.A02, new AnonymousClass9YV(this), this.A0W.A02);
        this.A0X = r2;
        this.A18.setAdapter(r2);
        Bundle bundle2 = this.A06;
        String str2 = null;
        if (bundle2 != null && bundle2.getBoolean("extra_send_to_upi_id", false)) {
            new C191759n8(A1D(), (AnonymousClass1FR) A1D(), this.A0J, this.A0K, "payment_home", false).A00((PaymentBottomSheet) null);
        }
        IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel2 = this.A0Y;
        if (!(indiaPaymentSettingsViewModel2 == null || this.A04 == null)) {
            C20337AGt.A00(this, indiaPaymentSettingsViewModel2.A01, 19);
            C20337AGt.A00(this, this.A0Y.A00, 20);
        }
        if (this.A0E.A09(AnonymousClass18O.A0X)) {
            ViewStub viewStub = (ViewStub) view2.findViewById(2131428079);
            if (AnonymousClass1J8.A02(this.A02)) {
                viewStub.setLayoutResource(2131626399);
                viewStub.inflate();
                WDSBanner wDSBanner = (WDSBanner) view2.findViewById(2131428058);
                AnonymousClass4XT r5 = new AnonymousClass4XT();
                r5.A02 = new AnonymousClass4AC(new AnonymousClass4AG(2131232298));
                r5.A03 = AnonymousClass4W6.A00(view2.getContext(), 2131897614);
                r5.A05 = false;
                wDSBanner.setState(r5.A01());
                AFT.A00(wDSBanner, this, view2, 17);
                wDSBanner.A07();
            } else {
                viewStub.setLayoutResource(2131626398);
                viewStub.inflate();
                AnonymousClass8BU.A15(view2, 2131434065, C19740yt.A00(A14(), 2131102102));
                Context A14 = A14();
                C18030ve r11 = this.A02;
                AnonymousClass1KB r8 = this.A0B;
                C26302CxJ.A0K(A14, Uri.parse("https://faq.whatsapp.com/general/payments/about-payments-data"), this.A05, r8, AnonymousClass3MX.A0V(view2, 2131433627), this.A0A, r11, AnonymousClass3MX.A16(this, "learn-more", AnonymousClass3MW.A1a(), 0, 2131897613), "learn-more");
                AnonymousClass3MY.A1B(view2, 2131433626, 0);
            }
        }
        this.A03 = AnonymousClass1HF.A06(view2, 2131434480);
        this.A02 = AnonymousClass1HF.A06(view2, 2131434479);
        this.A01 = AnonymousClass1HF.A06(view2, 2131433645);
        this.A04 = AnonymousClass3MW.A0G(view2, 2131429898);
        this.A06 = AnonymousClass3MW.A0T(view2, 2131429900);
        this.A03.setVisibility(0);
        this.A02.setVisibility(0);
        this.A01.setVisibility(0);
        AFP.A00(this.A01, this, 19);
        this.A06.setText(2131893726);
        A5V a5v = this.A0g;
        if (bundle2 != null) {
            str = bundle2.getString("notification-type");
            str2 = bundle2.getString("step-up-id");
        } else {
            str = null;
        }
        a5v.A07(str, str2);
        this.A19 = new AXA(this, 1);
        View inflate = A16().inflate(2131626508, this.A05, false);
        if (this.A05.getChildCount() > 0) {
            this.A05.removeAllViews();
        }
        this.A05.addView(inflate);
        this.A05.setVisibility(0);
        if (bundle2 != null && bundle2.getBoolean("extra_is_invalid_deep_link_url", false)) {
            AnonymousClass4Yv.A01(A1D(), 101);
        }
        if (this.A0G.A0R() && this.A0W.A03().getInt("payments_upi_transactions_sync_status", 0) == 0 && (indiaPaymentSettingsViewModel = this.A0Y) != null) {
            long j = indiaPaymentSettingsViewModel.A07.A03().getLong("payments_upi_last_transactions_sync_time", 0);
            if (j == 0 || AnonymousClass11P.A01(indiaPaymentSettingsViewModel.A05) - j > IndiaPaymentSettingsViewModel.A0E) {
                IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel3 = this.A0Y;
                C21435Ak2.A00(indiaPaymentSettingsViewModel3.A0B, indiaPaymentSettingsViewModel3, 1, Integer.valueOf(C18020vd.A00(C18040vf.A02, indiaPaymentSettingsViewModel3.A03, 1782)), 46);
            }
        }
        this.A0V = (AnonymousClass8FO) AnonymousClass3Ma.A0I(this).A00(AnonymousClass8FO.class);
        this.A0a = AnonymousClass8BY.A0P(A1B(), this.A0B, this.A0F, this.A0Q, this.A0n);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        A2N(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0066, code lost:
        A06(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0069, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2J(int r5) {
        /*
            r4 = this;
            r0 = 19
            r3 = 0
            if (r5 == r0) goto L_0x006a
            switch(r5) {
                case 119: goto L_0x0035;
                case 120: goto L_0x0039;
                case 121: goto L_0x0066;
                case 122: goto L_0x005a;
                case 123: goto L_0x003d;
                case 124: goto L_0x0041;
                case 125: goto L_0x0045;
                case 126: goto L_0x0052;
                case 127: goto L_0x0056;
                default: goto L_0x0008;
            }
        L_0x0008:
            switch(r5) {
                case 132: goto L_0x000f;
                case 133: goto L_0x0025;
                case 134: goto L_0x002d;
                case 135: goto L_0x0029;
                case 136: goto L_0x0047;
                default: goto L_0x000b;
            }
        L_0x000b:
            super.A2J(r5)
            return
        L_0x000f:
            X.1FL r1 = r4.A1D()
            java.lang.Class<com.whatsapp.payments.ui.IndiaPaymentTransactionHistoryActivity> r0 = com.whatsapp.payments.ui.IndiaPaymentTransactionHistoryActivity.class
            android.content.Intent r2 = X.AnonymousClass8BR.A07(r1, r0)
            java.lang.String r0 = "extra_show_requests"
            r2.putExtra(r0, r3)
            java.lang.String r1 = "extra_payment_service_name"
            r0 = 0
            r2.putExtra(r1, r0)
            goto L_0x008b
        L_0x0025:
            r4.A2I()
            return
        L_0x0029:
            A09(r4)
            return
        L_0x002d:
            X.10I r1 = r4.A0n
            r0 = 41
            X.C21447AkE.A01(r1, r4, r0)
            return
        L_0x0035:
            r4.A2R()
            return
        L_0x0039:
            A01(r4)
            return
        L_0x003d:
            A05(r4)
            return
        L_0x0041:
            A02(r4)
            return
        L_0x0045:
            r0 = 0
            goto L_0x004e
        L_0x0047:
            X.9bW r1 = r4.A0S
            r0 = 1
            r1.A00 = r0
            java.lang.String r0 = "send_first_payment_banner"
        L_0x004e:
            r4.A2N(r0)
            return
        L_0x0052:
            A04(r4)
            return
        L_0x0056:
            A03(r4)
            return
        L_0x005a:
            X.1QL r0 = r4.A0T
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x0066
            A07(r4)
            return
        L_0x0066:
            A06(r4)
            return
        L_0x006a:
            X.1FL r0 = r4.A1D()
            android.content.Intent r2 = X.AnonymousClass8BS.A04(r0)
            java.lang.String r0 = "extra_skip_value_props_display"
            r2.putExtra(r0, r3)
            java.lang.String r1 = "extra_payments_entry_type"
            r0 = 9
            r2.putExtra(r1, r0)
            android.os.Bundle r0 = r4.A06
            if (r0 == 0) goto L_0x008b
            java.lang.String r1 = "extra_deep_link_url"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            r2.putExtra(r1, r0)
        L_0x008b:
            r4.A1k(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment.A2J(int):void");
    }

    public void A2R() {
        if (C18020vd.A05(C18040vf.A02, this.A02, 7019)) {
            C21427Aju.A00(this.A0n, this, 19);
        }
        Intent A072 = AnonymousClass8BR.A07(A1n(), IndiaUpiContactPicker.class);
        A072.putExtra("for_payment_merchants", true);
        A1k(A072);
    }

    public String BUt(C20284AEs aEs) {
        String A062 = this.A0H.A06(aEs, this.A0w, false);
        if (A062 == null) {
            return super.BUt(aEs);
        }
        return A062;
    }

    public void Bqm() {
        TransactionsExpandableView transactionsExpandableView = this.A1C;
        transactionsExpandableView.post(new C21448AkF(transactionsExpandableView, 10));
        TransactionsExpandableView transactionsExpandableView2 = this.A1B;
        transactionsExpandableView2.post(new C21448AkF(transactionsExpandableView2, 10));
    }

    public void CHl(boolean z) {
        A5V a5v;
        View view = this.A0B;
        if (view != null) {
            ViewGroup A0C2 = AnonymousClass3MW.A0C(view, 2131427518);
            int i = 0;
            if (this.A00 == null && (a5v = this.A0g) != null) {
                if (a5v.A08.A04() != null) {
                    this.A0P.A05(AnonymousClass9RN.A00(this.A0L, this.A0g.A08.A04()));
                }
                if (!this.A0P.A04().isEmpty()) {
                    A0C2.removeAllViews();
                    AnonymousClass8Dk r4 = new AnonymousClass8Dk(A14());
                    ArrayList A042 = this.A0P.A04();
                    r4.A00(new C194439rj(new ATZ(this), (C70513Bj) C29431cG.A0s(A042).get(0), A042.size()));
                    A0C2.addView(r4);
                    this.A00 = A0C2;
                }
            }
            if (!z) {
                i = 8;
            }
            A0C2.setVisibility(i);
        }
    }

    public void CRI(List list) {
        this.A0R.A04(list);
        super.CRI(list);
        AnonymousClass8GH r2 = this.A0h;
        if (r2 != null) {
            r2.A03 = list;
            r2.A0X(this.A0d, this.A0i);
        }
    }

    public void CRV(List list) {
        this.A0g.A04();
        this.A0R.A04(list);
        super.CRV(list);
        AnonymousClass8GH r2 = this.A0h;
        if (r2 != null) {
            r2.A04 = list;
            r2.A0X(this.A0d, this.A0i);
        }
    }

    public static void A01(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment) {
        Intent A042 = AnonymousClass8BS.A04(indiaUpiPaymentSettingsFragment.A1D());
        A042.putExtra("extra_payments_entry_type", 1);
        A042.putExtra("extra_referral_screen", C17890vO.A0Z("notify_verification_banner", AnonymousClass000.A11("payment_home"), '.'));
        A042.putExtra("extra_payment_flow_entry_point", 2);
        A042.putExtra("extra_setup_mode", 2);
        A042.putExtra("extra_is_first_payment_method", true);
        A042.putExtra("extra_skip_value_props_display", true);
        C60442o2.A00(A042, indiaUpiPaymentSettingsFragment.A0K, "accountRecoveryBanner");
        indiaUpiPaymentSettingsFragment.A1k(A042);
    }

    public static void A02(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment) {
        String str;
        Intent A072 = AnonymousClass8BR.A07(indiaUpiPaymentSettingsFragment.A1D(), IndiaUpiMapperValuePropsActivity.class);
        A072.putExtra("extra_referral_screen", C17890vO.A0Z("add_upi_number_banner", AnonymousClass000.A11("payment_home"), '.'));
        C144717Ik A0Z2 = AnonymousClass8BR.A0Z();
        Class<String> cls = String.class;
        List list = indiaUpiPaymentSettingsFragment.A0e.A00;
        if (list == null || list.isEmpty()) {
            str = null;
        } else {
            str = A8e.A05(list);
        }
        A072.putExtra("extra_payment_name", AnonymousClass8BR.A0Y(A0Z2, cls, str, "accountHolderName"));
        indiaUpiPaymentSettingsFragment.A1k(A072);
    }

    public static void A03(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment) {
        indiaUpiPaymentSettingsFragment.A1k(AnonymousClass1LU.A1h(indiaUpiPaymentSettingsFragment.A1D(), "CONTINUE", new int[]{1, 2}, false));
    }

    public static void A05(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment) {
        Intent A0B2 = AnonymousClass8BX.A0B(indiaUpiPaymentSettingsFragment.A1D());
        A0B2.putExtra("extra_payments_entry_type", 5);
        A0B2.putExtra("extra_is_first_payment_method", true);
        A0B2.putExtra("extra_skip_value_props_display", true);
        A0B2.putExtra("extra_referral_screen", C17890vO.A0Z("finish_setup", AnonymousClass000.A11("payment_home"), '.'));
        C60442o2.A00(A0B2, indiaUpiPaymentSettingsFragment.A0K, "resumeOnboardingBanner");
        indiaUpiPaymentSettingsFragment.A1k(A0B2);
    }

    public static void A06(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment) {
        Intent A0B2 = AnonymousClass8BX.A0B(indiaUpiPaymentSettingsFragment.A1D());
        A0B2.putExtra("extra_payments_entry_type", 5);
        A0B2.putExtra("extra_is_first_payment_method", true);
        A0B2.putExtra("extra_skip_value_props_display", true);
        A0B2.putExtra("extra_referral_screen", C17890vO.A0Z("warm_welcome_banner", AnonymousClass000.A11("payment_home"), '.'));
        C60442o2.A00(A0B2, indiaUpiPaymentSettingsFragment.A0K, "warmWelcomeBanner");
        indiaUpiPaymentSettingsFragment.A1k(A0B2);
    }

    public static void A07(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment) {
        Intent A072 = AnonymousClass8BR.A07(indiaUpiPaymentSettingsFragment.A1D(), IndiaUpiQrTabActivity.class);
        if (indiaUpiPaymentSettingsFragment.A0T.A0D()) {
            A072.putExtra("extra_account_holder_name", A8e.A05(indiaUpiPaymentSettingsFragment.A0w));
        }
        indiaUpiPaymentSettingsFragment.A1k(A072);
    }

    public static void A09(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment) {
        Intent A072 = AnonymousClass8BR.A07(indiaUpiPaymentSettingsFragment.A1n(), IndiaUpiPaymentInvitePickerActivity.class);
        A072.putExtra("referral_screen", "payment_home");
        A072.putExtra("extra_multi_invite_picker_title", 2131893907);
        indiaUpiPaymentSettingsFragment.A0Q.BiI(Integer.valueOf(MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT), "payment_home", (String) null, 1, true);
        indiaUpiPaymentSettingsFragment.startActivityForResult(A072, 501);
    }

    public static void A0A(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment, String str) {
        String str2;
        Intent A072 = AnonymousClass1LU.A07(indiaUpiPaymentSettingsFragment.A1n());
        A072.putExtra("extra_payments_entry_type", 5);
        A072.putExtra("extra_skip_value_props_display", true);
        A072.putExtra("extra_is_first_payment_method", false);
        if (str != null) {
            A072.putExtra("extra_payment_method_type", str);
            if ("CREDIT".equals(str)) {
                str2 = "add_credit_card";
            } else {
                str2 = "add_credit_line";
            }
            A072.putExtra("extra_referral_screen", str2);
        }
        indiaUpiPaymentSettingsFragment.startActivityForResult(A072, 1008);
    }

    public static void A0B(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment, String str, String str2, int i, int i2, boolean z, boolean z2) {
        String str3;
        Intent A042 = AnonymousClass8BS.A04(indiaUpiPaymentSettingsFragment.A1n());
        A042.putExtra("extra_setup_mode", i);
        A042.putExtra("extra_payments_entry_type", i2);
        A042.putExtra("extra_is_first_payment_method", z);
        A042.putExtra("extra_skip_value_props_display", z2);
        if (C20063A5m.A03(str2)) {
            A042.putExtra("extra_payment_method_type", str2);
            if ("CREDIT".equals(str2)) {
                str3 = "add_credit_card";
            } else {
                str3 = "add_credit_line";
            }
            A042.putExtra("extra_referral_screen", str3);
        }
        C60442o2.A00(A042, indiaUpiPaymentSettingsFragment.A0K, str);
        indiaUpiPaymentSettingsFragment.A1k(A042);
    }

    public static void A0C(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment, List list) {
        AnonymousClass1FL A1B = indiaUpiPaymentSettingsFragment.A1B();
        if (A1B != null && !A1B.isFinishing()) {
            list.size();
            boolean isEmpty = list.isEmpty();
            View view = indiaUpiPaymentSettingsFragment.A02;
            if (isEmpty) {
                view.setVisibility(8);
                indiaUpiPaymentSettingsFragment.A08.setVisibility(8);
                return;
            }
            view.setVisibility(0);
            indiaUpiPaymentSettingsFragment.A08.setVisibility(0);
            int size = list.size();
            C20112A7u A032 = C20112A7u.A03(new C20112A7u[0]);
            A032.A08("recent_merchant_displayed", true);
            A032.A06("number_merchant_displayed", size);
            indiaUpiPaymentSettingsFragment.A0Q.BiM(A032, (Integer) null, "payment_home", (String) null, 0);
            C161728Hm r1 = indiaUpiPaymentSettingsFragment.A0X;
            List list2 = r1.A00;
            list2.clear();
            list2.addAll(list);
            r1.notifyDataSetChanged();
        }
    }

    public void A1j() {
        super.A1j();
        this.A0R.A03(this);
    }

    public void A1t() {
        super.A1t();
        this.A0W.A0O(false);
        C21447AkE.A01(this.A0n, this, 42);
    }

    public void A1u() {
        super.A1u();
        this.A0W.A0O(false);
        C21447AkE.A01(this.A0n, this, 43);
        this.A0g.A04();
        IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = this.A0Y;
        if (indiaPaymentSettingsViewModel != null) {
            boolean A0d2 = indiaPaymentSettingsViewModel.A0d();
            AnonymousClass3MY.A1M(indiaPaymentSettingsViewModel.A01, A0d2);
            if (A0d2) {
                C21427Aju.A00(indiaPaymentSettingsViewModel.A0B, indiaPaymentSettingsViewModel, 41);
            }
        }
        A08(this);
    }

    public void A1v() {
        super.A1v();
        AQF aqf = this.A0R;
        aqf.A00.clear();
        aqf.A02.add(AnonymousClass3MW.A0z(this));
    }

    public void A1w(int i, int i2, Intent intent) {
        super.A1w(i, i2, intent);
        if (i != 1008) {
            if (i != 1009) {
                return;
            }
            if (i2 == -1 && intent != null && intent.getIntExtra("extra_remove_payment_account", 0) >= 1) {
                if (intent.getIntExtra("extra_remove_payment_account", 0) == 2) {
                    Intent A042 = AnonymousClass8BS.A04(A1n());
                    A042.putExtra("extra_setup_mode", 2);
                    A1k(A042);
                    return;
                }
                C72463Mc.A1A(this);
                return;
            }
        }
        this.A0f.A01(false);
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A0W = new C198369yE(this.A02);
    }

    public boolean A24(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131432619) {
            return super.A24(menuItem);
        }
        A1k(AnonymousClass8BR.A07(A1n(), IndiaUpiQrCodeScanActivity.class));
        return true;
    }

    public C72933Og BMY() {
        JSONObject jSONObject;
        Context A1n = A1n();
        C18000vb r6 = this.A01;
        String language = C26166Ctg.A03().getLanguage();
        ArrayList A13 = AnonymousClass000.A13();
        String A0I2 = this.A02.A0I(3480);
        try {
            C17960vV.A07(A0I2);
            jSONObject = C17880vN.A16(A0I2);
        } catch (JSONException e) {
            Log.e("Error converting abProps to Json", e);
            jSONObject = C17880vN.A15();
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String A0v = C17880vN.A0v(keys);
            boolean equals = language.equals(A0v);
            String A012 = C25351CeA.A01(Locale.forLanguageTag(A0v));
            if (equals) {
                A13.add(0, new C86914To(A012, A0v));
            } else {
                A13.add(new C86914To(A012, A0v));
            }
        }
        C18070vi.A0j(A1n, r6);
        return new C72933Og(A1n, r6, A13, false);
    }

    public void C0I(C20284AEs aEs) {
        startActivityForResult(AnonymousClass8BW.A09(A1n(), aEs, IndiaUpiBankAccountDetailsActivity.class), 1009);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.widget.LinearLayout, X.8DZ, android.view.View, android.view.ViewGroup] */
    public void CR0(List list) {
        String str;
        super.CR0(list);
        if (A1b() && A1B() != null) {
            ? linearLayout = new LinearLayout(A14());
            if (!linearLayout.A0E) {
                linearLayout.A0E = true;
                AnonymousClass10E A0O2 = AnonymousClass3MW.A0O(linearLayout.generatedComponent());
                linearLayout.A0A = AnonymousClass3MZ.A0i(A0O2);
                linearLayout.A0C = AnonymousClass8BU.A0V(A0O2);
                linearLayout.A0B = AnonymousClass8BV.A0G(A0O2);
            }
            AnonymousClass3MZ.A0D(linearLayout).inflate(2131625595, linearLayout, true);
            linearLayout.setOrientation(1);
            linearLayout.A02 = AnonymousClass3MW.A0H(linearLayout, 2131434136);
            linearLayout.A08 = C17880vN.A0E(linearLayout, 2131434155);
            linearLayout.A07 = C17880vN.A0E(linearLayout, 2131434154);
            linearLayout.A09 = linearLayout.A0A.A05(linearLayout.getContext(), "india-upi-payment-settings-header-row");
            linearLayout.A03 = AnonymousClass8BR.A0A(linearLayout, 2131434130);
            LinearLayout A0A2 = AnonymousClass8BR.A0A(linearLayout, 2131435188);
            linearLayout.A05 = A0A2;
            AnonymousClass3MW.A0H(A0A2, 2131433693).setImageDrawable(linearLayout.A0C.A0N(linearLayout.getContext(), linearLayout.A0B.A02(), 2131101245, 2131167015));
            LinearLayout A0A3 = AnonymousClass8BR.A0A(linearLayout, 2131434811);
            linearLayout.A04 = A0A3;
            linearLayout.A06 = AnonymousClass3MW.A0J(A0A3, 2131434807);
            linearLayout.A00 = linearLayout.findViewById(2131430079);
            linearLayout.A01 = AnonymousClass3MW.A0G(linearLayout, 2131434131);
            C72463Mc.A0x(A1n(), AnonymousClass3MZ.A09(this), linearLayout, 2130970830, 2131102245);
            C72473Md.A0y(linearLayout);
            AFP.A00(linearLayout.A05, this, 20);
            AFP.A00(linearLayout.A04, this, 21);
            this.A06.removeAllViews();
            if (this.A0T.A0D() || this.A0G.A0R()) {
                List list2 = this.A0e.A00;
                if (list2 == null || list2.isEmpty()) {
                    str = null;
                } else {
                    str = A8e.A05(list2);
                }
                String A002 = AXS.A00(this.A0G);
                if (TextUtils.isEmpty(str)) {
                    str = this.A0B.A00.getString("push_name", "");
                    this.A0X.A0B((C33661jB) null, AnonymousClass8BU.A0U(this.A0a));
                }
                boolean A003 = C197269wQ.A00(this.A02, this.A0G.A0G());
                AnonymousClass11S r0 = this.A0C;
                r0.A0I();
                AnonymousClass1E8 r02 = r0.A0D;
                if (A003) {
                    linearLayout.A00(r02, str, A002);
                    linearLayout.A01.setVisibility(0);
                    linearLayout.A01.setColorFilter(linearLayout.getResources().getColor(2131102093));
                    TypedValue typedValue = new TypedValue();
                    linearLayout.getContext().getTheme().resolveAttribute(16843534, typedValue, true);
                    linearLayout.A03.setBackgroundResource(typedValue.resourceId);
                    linearLayout.A03.setOnClickListener(new AFV(18, str, this));
                } else {
                    linearLayout.A00(r02, str, A002);
                    linearLayout.A03.setOnLongClickListener(new AFZ(0, A002, this));
                }
            }
            this.A06.addView(linearLayout);
            this.A06.setVisibility(0);
            this.A01.setVisibility(0);
            A08(this);
        }
    }
}
