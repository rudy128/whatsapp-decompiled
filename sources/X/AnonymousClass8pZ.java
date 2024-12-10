package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8pZ  reason: invalid class name */
public final class AnonymousClass8pZ extends AnonymousClass8pX {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public int A01 = -1;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public void A05(AnonymousClass1KI r7, C29621ca r8, int i) {
        C20284AEs A08;
        int i2;
        C18070vi.A0e(r7, 0, r8);
        boolean equals = "1".equals(C29621ca.A02(r8, "can-sell"));
        boolean equals2 = "1".equals(C29621ca.A02(r8, "can-payout"));
        boolean equals3 = "1".equals(C29621ca.A02(r8, "can-add-payout"));
        int A002 = (equals ? 1 : 0) + AnonymousClass8BU.A00(equals2 ? 1 : 0);
        int i3 = 0;
        if (equals3) {
            i3 = 4;
        }
        this.A01 = A002 + i3;
        String A0Q = r8.A0Q("display-state", (String) null);
        if (A0Q == null || A0Q.length() == 0) {
            A0Q = "ACTIVE";
        }
        this.A07 = A0Q;
        this.A09 = r8.A0Q("merchant-id", (String) null);
        this.A0E = AnonymousClass8BU.A1T(r8, "p2m-eligible", "1");
        this.A0F = AnonymousClass8BU.A1T(r8, "p2p-eligible", "1");
        this.A0C = r8.A0Q("support-phone-number", (String) null);
        this.A03 = r8.A0Q("business-name", (String) null);
        this.A03 = r8.A0Q("gateway-name", (String) null);
        try {
            this.A00 = r8.A0A("max_installment_count", 0);
        } catch (AnonymousClass1UI e) {
            C17900vP.A0X(e, "Exception in parsing maxInstallmentCount: ", AnonymousClass000.A10());
        }
        this.A04 = r8.A0Q("country", (String) null);
        this.A05 = r8.A0Q("credential-id", (String) null);
        this.A02 = C20099A7c.A03(r8.A0Q("created", (String) null));
        this.A06 = r8.A0Q("dashboard-url", (String) null);
        this.A0B = r8.A0Q("provider_contact_website", (String) null);
        this.A08 = r8.A0Q("logo-uri", (String) null);
        this.A05 = r8.A0Q("provider-type", (String) null);
        this.A01 = C20099A7c.A01(r8.A0Q("pix-onboarding-state", (String) null), -1);
        this.A0D = AnonymousClass000.A13();
        Iterator A032 = C29621ca.A03(r8, "payout");
        while (A032.hasNext()) {
            C29621ca A0a = C17880vN.A0a(A032);
            String A022 = C29621ca.A02(A0a, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            if ("bank".equals(A022)) {
                AnonymousClass8pR r0 = new AnonymousClass8pR();
                r0.A05(r7, A0a, 0);
                A08 = r0.A08();
                i2 = r0.A00;
            } else if ("prepaid-card".equals(A022)) {
                AnonymousClass8pT r1 = new AnonymousClass8pT();
                r1.A05(r7, A0a, 0);
                r1.A00 = 8;
                A08 = r1.A08();
                i2 = r1.A01;
            }
            A08.A04 = i2;
            A08.A0C = this.A05;
            this.A0D.add(A08);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A03);
        parcel.writeString(this.A03);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeByte(this.A0E ? (byte) 1 : 0);
        parcel.writeByte(this.A0F ? (byte) 1 : 0);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A01);
    }

    public void A06(String str) {
        if (str != null) {
            try {
                JSONObject A16 = C17880vN.A16(str);
                A0C(A16);
                this.A01 = A16.optInt("state", 0);
                this.A09 = A16.optString("merchantId", (String) null);
                this.A0E = A16.optBoolean("p2mEligible", false);
                this.A0F = A16.optBoolean("p2pEligible", false);
                this.A0C = A16.optString("supportPhoneNumber", (String) null);
                this.A06 = A16.optString("dashboardUrl", (String) null);
                this.A04 = A16.optString("notificationType", (String) null);
                this.A03 = A16.optString("gatewayName", (String) null);
                this.A0B = A16.optString("providerContactWebsite", (String) null);
                this.A08 = A16.optString("logoUri", (String) null);
                this.A00 = A16.optInt("maxInstallmentCount");
                this.A05 = A16.optString("providerType", (String) null);
                this.A01 = A16.optInt("pixOnboardingState");
            } catch (JSONException e) {
                C17900vP.A0Z(e, "PAY: BrazilMerchantMethodData fromDBString threw: ", AnonymousClass000.A10());
            }
        }
    }

    public String A04() {
        JSONObject A0B = A0B();
        try {
            A0B.put("v", 1);
            String str = this.A06;
            if (!(str == null || str.length() == 0)) {
                A0B.put("dashboardUrl", str);
            }
            String str2 = this.A04;
            if (!(str2 == null || str2.length() == 0)) {
                A0B.put("notificationType", str2);
            }
            String str3 = this.A03;
            if (!(str3 == null || str3.length() == 0)) {
                A0B.put("gatewayName", str3);
            }
            String str4 = this.A0B;
            if (!(str4 == null || str4.length() == 0)) {
                A0B.put("providerContactWebsite", str4);
            }
            A0B.put("p2mEligible", this.A0E);
            A0B.put("p2pEligible", this.A0F);
            A0B.put("logoUri", this.A08);
            A0B.put("maxInstallmentCount", this.A00);
            String str5 = this.A05;
            if (!(str5 == null || str5.length() == 0)) {
                A0B.put("providerType", str5);
            }
            A0B.put("pixOnboardingState", this.A01);
            return A0B.toString();
        } catch (JSONException e) {
            C17900vP.A0Z(e, "PAY: BrazilMerchantMethodData toDBString threw: ", AnonymousClass000.A10());
            return null;
        }
    }

    public void A07(List list) {
        throw AnonymousClass04E.createAndThrow();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ merchantId: ");
        String str = this.A09;
        A10.append(str);
        A10.append(" p2mEligible: ");
        A10.append(this.A0E);
        A10.append(" p2pEligible: ");
        A10.append(this.A0F);
        A10.append(" state: ");
        A10.append(this.A01);
        A10.append(" supportPhoneNumber: ");
        A10.append(this.A0C);
        A10.append(" dashboardUrl: ");
        A10.append(this.A06);
        A10.append(" merchantId: ");
        A10.append(str);
        A10.append(" businessName: ");
        A10.append(this.A03);
        A10.append(" displayState: ");
        A10.append(this.A07);
        A10.append(" providerContactWebsite: ");
        A10.append(this.A0B);
        A10.append(" logoUri: ");
        A10.append(this.A08);
        A10.append("maxInstallmentCount: ");
        A10.append(this.A00);
        A10.append("providerType: ");
        A10.append(this.A05);
        A10.append("pixOnboardingState: ");
        A10.append(this.A01);
        return C17890vO.A0c(A10, ']');
    }
}
