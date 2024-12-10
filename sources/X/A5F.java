package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog$Builder;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.Hilt_BrazilAccountRecoveryEligibilityBottomSheet;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public class A5F {
    public AnonymousClass1KB A00;
    public AnonymousClass11S A01;
    public AnonymousClass11P A02;
    public C19830z4 A03;
    public AnonymousClass122 A04;
    public AnonymousClass1KI A05;
    public C19944A0b A06;
    public AnonymousClass1QL A07;
    public AnonymousClass1QD A08;
    public C31061ex A09;
    public C20110A7s A0A;
    public AnonymousClass1QO A0B;
    public C33701jF A0C;
    public AnonymousClass1QS A0D;
    public C191529mk A0E;
    public C191369mU A0F;
    public A54 A0G;
    public BD4 A0H;
    public A5H A0I;
    public C195929uA A0J;
    public C30931ek A0K;
    public C30951em A0L;
    public AnonymousClass10I A0M;
    public AnonymousClass00H A0N;

    public void A03(AnonymousClass1FY r11, String str, String str2, boolean z) {
        BD4 bd4 = this.A0H;
        C17960vV.A07(bd4);
        String str3 = str;
        bd4.BiL((Integer) null, "prompt_warn_setup_without_recover", str, 0);
        AnonymousClass1FY r5 = r11;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r11);
        alertDialog$Builder.setTitle(r11.getString(2131886359));
        int i = 2131886358;
        if ("receive_flow".equals(str)) {
            i = 2131886357;
        }
        alertDialog$Builder.A0S(r11.getString(i));
        alertDialog$Builder.A0L(new C20143A9f(r5, this, str3, str2, z), r11.getString(2131896067));
        alertDialog$Builder.A0J(new A9U(3, str, this), r11.getString(2131893738));
        alertDialog$Builder.A0C();
    }

    public static void A00(AnonymousClass1FY r12, A5F a5f) {
        C17880vN.A1B(AnonymousClass8BU.A07(a5f.A08).remove("payment_account_recovered").remove("payment_account_recoverable"), "payment_account_recoverable_time_ms");
        AnonymousClass1KB r3 = a5f.A00;
        AnonymousClass10I r11 = a5f.A0M;
        C30931ek r10 = a5f.A0K;
        AnonymousClass1QS r9 = a5f.A0D;
        AnonymousClass1FY r2 = r12;
        new C192839p4(r2, r3, a5f.A04, AnonymousClass8BR.A0a(a5f.A0N), a5f.A08, a5f.A09, a5f.A0C, r9, r10, r11).A00((C33661jB) null);
    }

    public static void A01(AnonymousClass1FY r16, A5F a5f, String str, List list, int i, boolean z, boolean z2) {
        String str2;
        if (!z2) {
            r16.finish();
            return;
        }
        Intent A032 = AnonymousClass8BS.A03(r16);
        HashMap A11 = C17880vN.A11();
        A5F a5f2 = a5f;
        List list2 = list;
        int i2 = i;
        if (!a5f2.A0I.A05() || a5f2.A0I.A02() == 1) {
            if (!C18020vd.A05(C18040vf.A02, a5f2.A0B.A02, 2984) || i <= 0) {
                str2 = "brpay_p_add_card";
            } else if (i2 > 1) {
                JSONObject A022 = a5f2.A06.A02(list2);
                if (A022 != null) {
                    A11.put("cards", A022.toString());
                }
                A11.put("single_card", "false");
                str2 = "brpay_p_card_select_options";
            } else {
                AnonymousClass8pY r1 = (AnonymousClass8pY) C108955ca.A0p(list2);
                A11.put("credential_id", r1.A0H);
                A11.put("last4", r1.A0J);
                A11.put("single_card", "true");
                str2 = "brpay_p_add_cvv_card";
            }
            A032.putExtra("screen_name", str2);
        } else {
            A032.putExtra("screen_name", "brpay_p_add_biometric");
            A11.put("pin", str);
            if (i == 0) {
                A11.put("screen_open_after_bio", "show_add_card");
            } else if (i2 == 1) {
                AnonymousClass8pY r2 = (AnonymousClass8pY) C108955ca.A0p(list2);
                A11.put("credential_id", r2.A0H);
                A11.put("last4", r2.A0J);
                A11.put("screen_open_after_bio", "show_add_cvv_card");
                A11.put("single_card", "true");
            } else {
                A11.put("screen_open_after_bio", "show_select_card");
                JSONObject A023 = a5f2.A06.A02(list2);
                if (A023 != null) {
                    A11.put("cards", A023.toString());
                }
                A11.put("single_card", "false");
            }
        }
        A11.put("verification_needed", "1");
        A032.putExtra("screen_params", A11);
        r16.A3q(A032, z);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.payments.ui.BrazilAccountRecoveryEligibilityBottomSheet, androidx.fragment.app.Fragment, com.whatsapp.payments.ui.Hilt_BrazilAccountRecoveryEligibilityBottomSheet, androidx.fragment.app.DialogFragment] */
    public void A02(AnonymousClass1FY r4, String str, String str2) {
        ? hilt_BrazilAccountRecoveryEligibilityBottomSheet = new Hilt_BrazilAccountRecoveryEligibilityBottomSheet();
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putString("referral_screen", str2);
        hilt_BrazilAccountRecoveryEligibilityBottomSheet.A1R(A0D2);
        hilt_BrazilAccountRecoveryEligibilityBottomSheet.A05 = new C186979f4(r4, this, str2, str);
        r4.CMl(hilt_BrazilAccountRecoveryEligibilityBottomSheet);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.9vd] */
    public void A04(AnonymousClass1FY r7, boolean z) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = new PinBottomSheetDialogFragment();
        pinBottomSheetDialogFragment.A08 = new Object();
        pinBottomSheetDialogFragment.A0B = true;
        C72453Mb.A1B(pinBottomSheetDialogFragment.A0A);
        pinBottomSheetDialogFragment.A09 = new AZX(r7, pinBottomSheetDialogFragment, this, z, true);
        r7.CMl(pinBottomSheetDialogFragment);
    }
}
