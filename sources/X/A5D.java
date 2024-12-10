package X;

import android.content.Context;
import android.content.Intent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;
import java.util.Map;

public class A5D {
    public static Map A0G = new C71233El(1);
    public static Map A0H = new C71233El(2);
    public final C19880zA A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass1KI A02;
    public final C31061ex A03;
    public final AnonymousClass1QS A04;
    public final C175998zc A05;
    public final C191749n7 A06;
    public final C191129m4 A07;
    public final A5Y A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass1L9 A0C;
    public final C36751oP A0D;
    public final C30931ek A0E;
    public final AnonymousClass1R2 A0F;

    public boolean A02(AW0 aw0, C20279AEn aEn, String str) {
        if (aw0 == null || !aw0.A0L()) {
            return (!AnonymousClass1EG.A0H(str) && ((C190269ke) this.A09.get()).A00(7751, str)) || (aEn != null && this.A0F.A0q(aEn));
        }
        return false;
    }

    public void A00(Context context, C194929sW r5, AnonymousClass1BI r6, String str, String str2, String str3, boolean z) {
        this.A0B.get();
        Intent A0G2 = C72463Mc.A0G(context);
        A0G2.setClassName(context.getPackageName(), "com.whatsapp.payments.ui.BrazilPaymentPixOnboardingActivityV2");
        AnonymousClass8BR.A1D(A0G2, str);
        A0G2.putExtra("previous_screen", str2);
        A0G2.putExtra("extra_receiver_jid", C22971Dz.A06(r6));
        A0G2.putExtra("extra_is_edit_mode_enabled", z);
        if (z && r5 != null) {
            A0G2.putExtra("pix_info_key_type", r5.A02);
            A0G2.putExtra("pix_info_key_value", r5.A03);
            A0G2.putExtra("pix_info_display_name", r5.A01);
            A0G2.putExtra("extra_pix_info_key_credential_id", r5.A00);
        }
        if (str3 != null) {
            A0G2.putExtra("campaign_id", str3);
        }
        A0G2.setFlags(603979776);
        context.startActivity(A0G2);
    }

    public void A01(Context context, String str) {
        AnonymousClass1KB r5 = this.A01;
        r5.A07(0, 2131891797);
        HashMap A11 = C17880vN.A11();
        A11.put("action", "start");
        HashMap A112 = C17880vN.A11();
        A112.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "modal");
        HashMap A113 = C17880vN.A11();
        A113.put("style", A112);
        A11.put("presentation", A113);
        HashMap A114 = C17880vN.A11();
        A114.put("device_id", this.A0E.A01());
        C191129m4 r7 = this.A07;
        C20130A8q a8q = r7.A01;
        a8q.A0F(A114);
        C194579rx r10 = new C194579rx("br_merchant_onboarding", (String) null, A11);
        C20908AbO abO = new C20908AbO(this, 0);
        C20900AbG abG = new C20900AbG(this, 0);
        C21132Af0 af0 = new C21132Af0();
        a8q.A0L.put("BRMerchantData", abO);
        r7.A02.CGF(new C21462AkT(r7, abG, new C20904AbK(af0, this, 0), r10, str));
        af0.A0A(new C21133Af1(context, this, 9), r5.A05);
    }

    public A5D(C19880zA r2, AnonymousClass1L9 r3, AnonymousClass1KB r4, C36751oP r5, AnonymousClass1KI r6, C31061ex r7, AnonymousClass1QS r8, C175998zc r9, C191749n7 r10, C191129m4 r11, A5Y a5y, C30931ek r13, AnonymousClass1R2 r14, AnonymousClass00H r15, AnonymousClass00H r16, AnonymousClass00H r17) {
        this.A01 = r4;
        this.A0B = r15;
        this.A00 = r2;
        this.A0C = r3;
        this.A0E = r13;
        this.A04 = r8;
        this.A0A = r16;
        this.A07 = r11;
        this.A03 = r7;
        this.A02 = r6;
        this.A05 = r9;
        this.A08 = a5y;
        this.A06 = r10;
        this.A0D = r5;
        this.A09 = r17;
        this.A0F = r14;
    }

    public A5D() {
    }
}
