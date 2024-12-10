package X;

import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity;
import org.json.JSONObject;

public class AZ6 implements BD4 {
    public C18030ve A00;
    public Integer A01;
    public final AnonymousClass18K A02;
    public final C20031A4a A03;
    public final AnonymousClass1QK A04;
    public final AXS A05;

    public static void A04(AZ6 az6, Integer num, String str) {
        az6.BiL(num, str, (String) null, 1);
    }

    public C171858sO A07(Integer num, Integer num2, String str, String str2) {
        return A06((C20112A7u) null, num, num2, str, str2, (String) null, (String) null, false);
    }

    public void A0C(Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z) {
        this.A02.CC7(A06((C20112A7u) null, num, num2, str, str2, str3, str4, z));
    }

    public void BiM(C20112A7u a7u, Integer num, String str, String str2, int i) {
        BiJ(a7u, num, str, str2, (String) null, (String) null, i, false, false, false);
    }

    public static void A00(C171858sO r3, C20112A7u a7u) {
        if (a7u != null) {
            JSONObject jSONObject = a7u.A01;
            if (jSONObject.has("is_payment_account_setup")) {
                r3.A01 = Boolean.valueOf(jSONObject.optBoolean("is_payment_account_setup"));
                jSONObject.remove("is_payment_account_setup");
            }
            AnonymousClass8BX.A1A(r3, a7u, jSONObject);
        }
    }

    public static void A02(C171858sO r1, AnonymousClass91T r2) {
        r2.A0S.BiH(r1);
    }

    public static void A03(AZ6 az6, IndiaUpiBankAccountAddedLandingActivity indiaUpiBankAccountAddedLandingActivity, Integer num, Integer num2) {
        AZ6 az62 = az6;
        az62.A0B(IndiaUpiBankAccountAddedLandingActivity.A03(indiaUpiBankAccountAddedLandingActivity), num, num2, indiaUpiBankAccountAddedLandingActivity.A0c, "registration_complete", indiaUpiBankAccountAddedLandingActivity.A0f);
    }

    public C20112A7u A08(C20284AEs aEs, C20112A7u a7u) {
        String str;
        if (a7u == null) {
            a7u = C20112A7u.A02();
        }
        if (aEs instanceof AnonymousClass8pQ) {
            str = ((AnonymousClass8pQ) aEs).A01;
        } else {
            str = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
        }
        a7u.A07("payment_method", str);
        return a7u;
    }

    public C171858sO BHN() {
        C171858sO r1 = new C171858sO();
        C20031A4a.A00(r1, this.A03);
        C63572tK r0 = C63572tK.A0E;
        r1.A0R = "IN";
        A0D(this.A05.A0G());
        r1.A0F = this.A01;
        return r1;
    }

    public void Bi2(C70513Bj r3, Integer num, String str, String str2, int i) {
        int i2;
        C171368rb r1 = new C171368rb();
        r1.A01 = Integer.valueOf(i);
        r1.A08 = str;
        if (num != null) {
            r1.A00 = num;
        }
        r1.A06 = str2;
        if (r3 != null) {
            r1.A05 = r3.A06;
            r1.A07 = r3.A08;
            r1.A04 = r3.A05;
            r1.A02 = Integer.valueOf(r3.A01);
            i2 = 1;
        } else {
            i2 = 2;
        }
        r1.A03 = Integer.valueOf(i2);
        this.A02.CC7(r1);
    }

    public void BiH(C171858sO r2) {
        C20031A4a.A00(r2, this.A03);
        C63572tK r0 = C63572tK.A0E;
        r2.A0R = "IN";
        this.A02.CC7(r2);
    }

    public void COK() {
        this.A03.A02();
    }

    public void reset() {
        C20031A4a.A01(this.A03);
    }

    public AZ6(AnonymousClass18K r1, AnonymousClass1QK r2, AXS axs, C20031A4a a4a) {
        this.A02 = r1;
        this.A03 = a4a;
        this.A04 = r2;
        this.A05 = axs;
    }

    public static void A01(C171858sO r1, C20112A7u a7u, AZ6 az6, boolean z) {
        r1.A05 = Boolean.valueOf(z);
        A00(r1, a7u);
        az6.A02.CC7(r1);
    }

    public C171858sO A05(A7B a7b, int i) {
        C171858sO BHN = BHN();
        BHN.A0C = Integer.valueOf(AnonymousClass8BY.A03(BHN, a7b, i));
        BHN.A08 = C17880vN.A0j();
        return BHN;
    }

    public C171858sO A06(C20112A7u a7u, Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z) {
        C171858sO BHN = BHN();
        BHN.A0b = str;
        BHN.A06 = Boolean.valueOf(z);
        BHN.A08 = num;
        if (C18020vd.A05(C18040vf.A02, this.A00, 1330)) {
            BHN.A0W = str3;
            BHN.A0X = str4;
        }
        if (num2 != null) {
            BHN.A07 = num2;
        }
        if (str2 != null) {
            BHN.A0a = str2;
        }
        A00(BHN, a7u);
        return BHN;
    }

    public void A09(C20284AEs aEs, A7B a7b, int i) {
        String str;
        C171858sO A052 = A05(a7b, i);
        C170278pb r0 = aEs.A08;
        if (r0 == null) {
            str = "";
        } else {
            str = ((AnonymousClass8pS) r0).A0B;
        }
        A052.A0O = str;
        this.A02.CC7(A052);
    }

    public void A0A(A7B a7b, int i, int i2) {
        C171858sO BHN = BHN();
        BHN.A0B = Integer.valueOf(i);
        if (a7b != null) {
            BHN.A0S = String.valueOf(a7b.A00);
            BHN.A0T = a7b.A07;
        }
        BHN.A0A = Integer.valueOf(i2);
        BHN.A08 = C17880vN.A0j();
        BHN.A0b = "api_event";
        C17960vV.A07(BHN);
        BiH(BHN);
    }

    public void A0B(C20112A7u a7u, Integer num, Integer num2, String str, String str2, String str3) {
        C171858sO A07 = A07(num, num2, str2, str3);
        A07.A0Y = str;
        A00(A07, a7u);
        this.A02.CC7(A07);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        r3.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Integer r2 = X.C17880vN.A0h()
            if (r4 == 0) goto L_0x000e
            int r0 = r4.hashCode()
            r1 = 2
            switch(r0) {
                case 81882: goto L_0x0011;
                case 2023329: goto L_0x001b;
                case 2212537: goto L_0x0029;
                default: goto L_0x000e;
            }
        L_0x000e:
            r3.A01 = r2
            return
        L_0x0011:
            java.lang.String r0 = "SBI"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 4
            goto L_0x0024
        L_0x001b:
            java.lang.String r0 = "AXIS"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 3
        L_0x0024:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0035
        L_0x0029:
            java.lang.String r0 = "HDFC"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x000e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x0035:
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AZ6.A0D(java.lang.String):void");
    }

    public void Bi4(A7B a7b, int i) {
        BiH(A05(a7b, i));
    }

    public void BiI(Integer num, String str, String str2, int i, boolean z) {
        C171858sO A07 = A07(Integer.valueOf(i), num, str, str2);
        A07.A05 = Boolean.valueOf(z);
        this.A02.CC7(A07);
    }

    public void BiJ(C20112A7u a7u, Integer num, String str, String str2, String str3, String str4, int i, boolean z, boolean z2, boolean z3) {
        C171858sO A06 = A06((C20112A7u) null, Integer.valueOf(i), num, str, str2, str3, str4, z2);
        A06.A05 = Boolean.valueOf(z);
        A06.A00 = Boolean.valueOf(z3);
        A06.A01 = Boolean.valueOf(this.A04.A0D());
        A00(A06, a7u);
        this.A02.CC7(A06);
    }

    public void BiL(Integer num, String str, String str2, int i) {
        this.A02.CC7(A07(Integer.valueOf(i), num, str, str2));
    }
}
