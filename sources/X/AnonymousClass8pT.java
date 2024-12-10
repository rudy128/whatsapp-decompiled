package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8pT  reason: invalid class name */
public final class AnonymousClass8pT extends AnonymousClass8pY {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public int A08 = 1;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x014d, code lost:
        if (X.AnonymousClass8BU.A1T(r4, "default-eligible-p2p", "1") != false) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x00a3, code lost:
        if ("1".equals(X.C29621ca.A02(r8, "default-debit")) != false) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass1KI r7, X.C29621ca r8, int r9) {
        /*
            r6 = this;
            r0 = 2
            X.C18070vi.A0d(r8, r0)
            java.lang.String r0 = "verified"
            java.lang.String r0 = X.C29621ca.A02(r8, r0)
            java.lang.String r5 = "1"
            boolean r0 = r5.equals(r0)
            r6.A0a = r0
            java.lang.String r0 = "automatic-binding"
            java.lang.String r0 = X.C29621ca.A02(r8, r0)
            boolean r0 = r5.equals(r0)
            r6.A06 = r0
            java.lang.String r0 = "bank-name"
            r2 = 0
            java.lang.String r1 = r8.A0Q(r0, r2)
            java.lang.String r0 = "bankName"
            X.77e r0 = X.AnonymousClass8BW.A0K(r1, r0)
            r6.A08 = r0
            java.lang.String r0 = "bank-phone-number"
            java.lang.String r0 = r8.A0Q(r0, r2)
            r6.A0B = r0
            java.lang.String r3 = "image"
            java.lang.String r0 = r8.A0Q(r3, r2)
            r6.A0A = r0
            java.lang.String r0 = "time-last-added"
            java.lang.String r4 = r8.A0Q(r0, r2)
            r0 = -1
            long r0 = X.C20099A7c.A04(r4, r0)
            r6.A06 = r0
            java.lang.String r0 = "pending-verification-type"
            java.lang.String r0 = r8.A0Q(r0, r2)
            r6.A0O = r0
            java.lang.String r0 = "country"
            java.lang.String r0 = r8.A0Q(r0, r2)
            r6.A0G = r0
            java.lang.String r0 = "credential-id"
            java.lang.String r0 = r8.A0Q(r0, r2)
            r6.A0H = r0
            java.lang.String r0 = "type"
            java.lang.String r0 = r8.A0Q(r0, r2)
            int r0 = X.C20085A6m.A00(r0)
            r6.A00 = r0
            java.lang.String r0 = "created"
            java.lang.String r0 = r8.A0Q(r0, r2)
            long r0 = X.C20099A7c.A03(r0)
            r6.A05 = r0
            java.lang.String r0 = "network-type"
            java.lang.String r0 = r8.A0Q(r0, r2)
            int r0 = X.C20085A6m.A01(r0)
            r6.A01 = r0
            java.lang.String r0 = "last4"
            java.lang.String r0 = r8.A0Q(r0, r2)
            r6.A0J = r0
            java.lang.String r0 = "default-debit-p2p"
            boolean r0 = X.AnonymousClass8BU.A1T(r8, r0, r5)
            r2 = 0
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "default-debit"
            java.lang.String r0 = X.C29621ca.A02(r8, r0)
            boolean r1 = r5.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x00a6
        L_0x00a5:
            r0 = 1
        L_0x00a6:
            r6.A0W = r0
            java.lang.String r0 = "default-credit-p2p"
            java.lang.String r0 = X.C29621ca.A02(r8, r0)
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x00c0
            java.lang.String r0 = "default-credit"
            java.lang.String r0 = X.C29621ca.A02(r8, r0)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00c1
        L_0x00c0:
            r2 = 1
        L_0x00c1:
            r6.A0V = r2
            java.lang.String r0 = "default-debit-p2m"
            java.lang.String r0 = X.C29621ca.A02(r8, r0)
            boolean r0 = r5.equals(r0)
            r6.A0S = r0
            java.lang.String r0 = "default-credit-p2m"
            java.lang.String r0 = X.C29621ca.A02(r8, r0)
            boolean r0 = r5.equals(r0)
            r6.A0R = r0
            java.lang.String r0 = "needs-device-binding"
            java.lang.String r0 = X.C29621ca.A02(r8, r0)
            boolean r0 = r5.equals(r0)
            r6.A07 = r0
            java.lang.String r0 = "binding-type"
            r2 = 0
            java.lang.String r0 = r8.A0Q(r0, r2)
            r6.A02 = r0
            java.lang.String r0 = "token-id"
            java.lang.String r0 = r8.A0Q(r0, r2)
            r6.A05 = r0
            java.lang.String r0 = "p2p-eligible"
            boolean r0 = X.AnonymousClass8BU.A1T(r8, r0, r5)
            r6.A0Y = r0
            java.lang.String r0 = "p2m-eligible"
            boolean r0 = X.AnonymousClass8BU.A1T(r8, r0, r5)
            r6.A0U = r0
            java.lang.String r0 = "state"
            java.lang.String r0 = r8.A0Q(r0, r2)
            if (r0 != 0) goto L_0x0112
            java.lang.String r0 = "UNSET"
        L_0x0112:
            r6.A0F = r0
            java.lang.String r0 = "display-state"
            java.lang.String r1 = r8.A0Q(r0, r2)
            if (r1 == 0) goto L_0x0122
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0124
        L_0x0122:
            java.lang.String r1 = "ACTIVE"
        L_0x0124:
            r6.A0I = r1
            java.lang.String r0 = "capabilities"
            X.1ca r4 = r8.A0K(r0)
            if (r4 == 0) goto L_0x01c0
            java.lang.String r0 = "editable"
            boolean r0 = X.AnonymousClass8BU.A1T(r4, r0, r5)
            r6.A0P = r0
            java.lang.String r0 = "verifiable"
            boolean r0 = X.AnonymousClass8BU.A1T(r4, r0, r5)
            r6.A0Z = r0
            java.lang.String r0 = "default-eligible"
            boolean r0 = X.AnonymousClass8BU.A1T(r4, r0, r5)
            if (r0 != 0) goto L_0x014f
            java.lang.String r0 = "default-eligible-p2p"
            boolean r1 = X.AnonymousClass8BU.A1T(r4, r0, r5)
            r0 = 0
            if (r1 == 0) goto L_0x0150
        L_0x014f:
            r0 = 1
        L_0x0150:
            r6.A0X = r0
            java.lang.String r0 = "default-eligible-p2m"
            boolean r0 = X.AnonymousClass8BU.A1T(r4, r0, r5)
            r6.A0T = r0
            java.lang.String r0 = "p2p-send"
            java.lang.String r0 = r4.A0Q(r0, r2)
            java.lang.String r0 = X.AnonymousClass8pY.A00(r0)
            if (r0 != 0) goto L_0x017a
            boolean r0 = r6.A0Y
            if (r0 == 0) goto L_0x01f6
            java.lang.String r1 = "ACTIVE"
            java.lang.String r0 = r6.A0I
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01f6
            boolean r0 = r6.A0a
            if (r0 == 0) goto L_0x01f3
            java.lang.String r0 = "ENABLED"
        L_0x017a:
            r6.A0N = r0
            java.lang.String r0 = "p2p-receive"
            java.lang.String r0 = r4.A0Q(r0, r2)
            java.lang.String r0 = X.AnonymousClass8pY.A00(r0)
            if (r0 != 0) goto L_0x018c
            java.lang.String r0 = r6.A0B()
        L_0x018c:
            r6.A0M = r0
            java.lang.String r0 = "p2m-send"
            java.lang.String r0 = r4.A0Q(r0, r2)
            java.lang.String r0 = X.AnonymousClass8pY.A00(r0)
            if (r0 != 0) goto L_0x01ae
            boolean r0 = r6.A0U
            if (r0 == 0) goto L_0x01f0
            java.lang.String r1 = "ACTIVE"
            java.lang.String r0 = r6.A0I
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01f0
            boolean r0 = r6.A0a
            if (r0 == 0) goto L_0x01ed
            java.lang.String r0 = "ENABLED"
        L_0x01ae:
            r6.A0L = r0
            java.lang.String r0 = "p2m-receive"
            java.lang.String r0 = r4.A0Q(r0, r2)
            java.lang.String r0 = X.AnonymousClass8pY.A00(r0)
            if (r0 != 0) goto L_0x01be
            java.lang.String r0 = "DISABLED"
        L_0x01be:
            r6.A0K = r0
        L_0x01c0:
            java.lang.String r0 = "verification-status"
            java.lang.String r0 = r8.A0Q(r0, r2)
            if (r0 == 0) goto L_0x01ce
            int r0 = X.C20284AEs.A00(r0)
            r6.A01 = r0
        L_0x01ce:
            X.1ca r1 = r8.A0K(r3)
            java.lang.String r0 = "image-content-id"
            if (r1 == 0) goto L_0x01f9
            java.lang.String r0 = r1.A0Q(r0, r2)
            r6.A0C = r0
            java.lang.String r0 = "image-url"
            java.lang.String r0 = r1.A0Q(r0, r2)
            r6.A0E = r0
            java.lang.String r0 = "image-label-color"
            java.lang.String r0 = r1.A0Q(r0, r2)
            r6.A0D = r0
            return
        L_0x01ed:
            java.lang.String r0 = "REQUIRES_VERIFICATION"
            goto L_0x01ae
        L_0x01f0:
            java.lang.String r0 = "DISABLED"
            goto L_0x01ae
        L_0x01f3:
            java.lang.String r0 = "REQUIRES_VERIFICATION"
            goto L_0x017a
        L_0x01f6:
            java.lang.String r0 = "DISABLED"
            goto L_0x017a
        L_0x01f9:
            java.lang.String r0 = r8.A0Q(r0, r2)
            r6.A0C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8pT.A05(X.1KI, X.1ca, int):void");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeByte(this.A0a ? (byte) 1 : 0);
        parcel.writeParcelable(this.A08, i);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0O);
        parcel.writeByte(this.A0Q ? (byte) 1 : 0);
        parcel.writeInt(this.A03);
        parcel.writeByte(this.A0Y ? (byte) 1 : 0);
        parcel.writeByte(this.A0U ? (byte) 1 : 0);
        parcel.writeLong(this.A06);
        parcel.writeInt(this.A04);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A0W ? (byte) 1 : 0);
        parcel.writeByte(this.A0V ? (byte) 1 : 0);
        parcel.writeByte(this.A0S ? (byte) 1 : 0);
        parcel.writeByte(this.A0R ? (byte) 1 : 0);
        parcel.writeString(this.A0J);
        parcel.writeLong(this.A05);
        parcel.writeInt(this.A01);
        parcel.writeByte(this.A06 ? (byte) 1 : 0);
        parcel.writeByte(this.A07 ? (byte) 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0D);
        Long l = this.A09;
        if (l == null) {
            l = C17890vO.A0L();
        }
        parcel.writeLong(l.longValue());
        parcel.writeString(this.A04);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0I);
        parcel.writeByte(this.A0P ? (byte) 1 : 0);
        parcel.writeByte(this.A0Z ? (byte) 1 : 0);
        parcel.writeByte(this.A0X ? (byte) 1 : 0);
        parcel.writeByte(this.A0T ? (byte) 1 : 0);
        parcel.writeString(this.A0N);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0K);
    }

    public void A06(String str) {
        String str2;
        String str3;
        if (str != null) {
            try {
                JSONObject A16 = C17880vN.A16(str);
                this.A0a = A16.optBoolean("verified", false);
                this.A08 = AnonymousClass8BW.A0K(A16.optString("bankName", (String) null), "bankName");
                this.A07 = AnonymousClass8BW.A0K(A16.optString("bankCode", (String) null), "bankCode");
                this.A0B = A16.optString("bankPhoneNumber", (String) null);
                this.A0A = A16.optString("bankLogoUrl", this.A0A);
                this.A06 = A16.optLong("timeLastAdded", -1);
                this.A0O = A16.optString("verificationType", (String) null);
                this.A0Q = A16.optBoolean("otpNumberMatch", false);
                this.A02 = A16.optInt("otpLength", 8);
                String optString = A16.optString("displayState", (String) null);
                if (optString == null || optString.length() == 0) {
                    optString = "ACTIVE";
                }
                this.A0I = optString;
                this.A0P = A16.optBoolean("editable", false);
                this.A0Z = A16.optBoolean("verifiable", false);
                String str4 = "p2pDefaultEligible";
                if (!A16.has(str4)) {
                    str4 = "defaultEligible";
                }
                this.A0X = A16.optBoolean(str4, false);
                this.A0T = A16.optBoolean("p2mDefaultEligible", false);
                if (!this.A0Y || !"ACTIVE".equals(this.A0I)) {
                    str2 = "DISABLED";
                } else if (this.A0a) {
                    str2 = "ENABLED";
                } else {
                    str2 = "REQUIRES_VERIFICATION";
                }
                this.A0N = A16.optString("p2pSend", str2);
                this.A0M = A16.optString("p2pReceive", A0B());
                if (!this.A0U || !"ACTIVE".equals(this.A0I)) {
                    str3 = "DISABLED";
                } else if (this.A0a) {
                    str3 = "ENABLED";
                } else {
                    str3 = "REQUIRES_VERIFICATION";
                }
                this.A0L = A16.optString("p2mSend", str3);
                this.A0K = A16.optString("p2mReceive", "DISABLED");
                this.A08 = A16.optInt("v", 1);
                this.A03 = A16.optInt("paymentRails", 0);
                this.A0Y = A16.optBoolean("p2pEligible", false);
                this.A0U = A16.optBoolean("p2mEligible", false);
                this.A07 = A16.optBoolean("needsDeviceBinding", false);
                this.A06 = A16.optBoolean("automaticBinding", false);
                this.A02 = A16.optString("bindingType", (String) null);
                this.A05 = A16.optString("tokenId", (String) null);
                this.A0C = A16.optString("cardImageContentId", (String) null);
                this.A0E = A16.optString("cardImageUrl", (String) null);
                this.A0D = A16.optString("cardImageLabelColor", (String) null);
                this.A0J = A16.optString("lastFour", (String) null);
                this.A09 = Long.valueOf(A16.optLong("cardDataUpdatedTimeMillis", 0));
                this.A04 = A16.optString("notificationType", (String) null);
                this.A0F = A16.optString("cardState", "UNSET");
                this.A01 = A16.optInt("verificationStatus");
            } catch (JSONException e) {
                C17900vP.A0Z(e, "PAY: BrazilCardMethodData fromDBString threw: ", AnonymousClass000.A10());
            }
        }
    }

    public String A04() {
        try {
            JSONObject A15 = C17880vN.A15();
            try {
                A15.put("verified", this.A0a);
                C1418477e r2 = this.A08;
                if (!C20061A5k.A03(r2)) {
                    A15.put("bankName", r2.A00);
                }
                C1418477e r22 = this.A07;
                if (!C20061A5k.A03(r22)) {
                    A15.put("bankCode", r22.A00);
                }
                String str = this.A0B;
                if (str != null) {
                    A15.put("bankPhoneNumber", str);
                }
                String str2 = this.A0A;
                if (str2 != null) {
                    A15.put("bankLogoUrl", str2);
                }
                long j = this.A06;
                if (j >= 0) {
                    A15.put("timeLastAdded", j);
                }
                String str3 = this.A0O;
                if (str3 != null) {
                    A15.put("verificationType", str3);
                }
                if ("otp".equals(this.A0O)) {
                    A15.put("otpNumberMatch", this.A0Q);
                }
                int i = this.A02;
                if (i >= 0) {
                    A15.put("otpLength", i);
                }
                String str4 = this.A0I;
                if (str4 != null) {
                    A15.put("displayState", str4);
                }
                try {
                    A15.put("editable", this.A0P);
                    A15.put("verifiable", this.A0Z);
                    A15.put("p2pDefaultEligible", this.A0X);
                    A15.put("p2mDefaultEligible", this.A0T);
                    A15.put("p2pSend", this.A0N);
                    A15.put("p2pReceive", this.A0M);
                    A15.put("p2mSend", this.A0L);
                    A15.put("p2mReceive", this.A0K);
                } catch (JSONException e) {
                    C17900vP.A0Z(e, "PAY: PaymentMethodCardCountryData/addCapabilitiesToJson threw: ", AnonymousClass000.A10());
                }
            } catch (JSONException e2) {
                C17900vP.A0Z(e2, "PAY: PaymentMethodCardCountryData toJSONObject threw: ", AnonymousClass000.A10());
            }
            A15.put("v", this.A08);
            A15.put("paymentRails", this.A03);
            A15.put("needsDeviceBinding", this.A07);
            A15.put("automaticBinding", this.A06);
            String str5 = this.A02;
            if (str5 != null) {
                A15.put("bindingType", str5);
            }
            String str6 = this.A05;
            if (str6 != null) {
                A15.put("tokenId", str6);
            }
            String str7 = this.A0C;
            if (str7 != null) {
                A15.put("cardImageContentId", str7);
            }
            String str8 = this.A0E;
            if (str8 != null) {
                A15.put("cardImageUrl", str8);
            }
            String str9 = this.A0D;
            if (str9 != null) {
                A15.put("cardImageLabelColor", str9);
            }
            String str10 = this.A0J;
            if (str10 != null) {
                A15.put("lastFour", str10);
            }
            Long l = this.A09;
            if (l != null) {
                A15.put("cardDataUpdatedTimeMillis", l.longValue());
            }
            A15.put("notificationType", this.A04);
            A15.put("cardState", this.A0F);
            A15.put("p2pEligible", this.A0Y);
            A15.put("p2mEligible", this.A0U);
            A15.put("verificationStatus", this.A01);
            return A15.toString();
        } catch (JSONException e3) {
            C17900vP.A0Z(e3, "PAY: BrazilCardMethodData toDBString threw: ", AnonymousClass000.A10());
            return null;
        }
    }

    public void A07(List list) {
        throw AnonymousClass04E.createAndThrow();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ verified: ");
        A10.append(this.A0a);
        A10.append(" automaticBinding: ");
        A10.append(this.A06);
        A10.append(" accountType: ");
        A10.append(this.A00);
        A10.append(" bankName: ");
        A10.append(this.A08);
        A10.append(" bankPhoneNumber: ");
        A10.append(this.A0B);
        A10.append(" bankLogoUrl: ");
        A10.append(this.A0A);
        A10.append(" verificationType: ");
        A10.append(this.A0O);
        A10.append(" otpNumberMatch: ");
        A10.append(this.A0Q);
        A10.append(" paymentRails: ");
        A10.append(this.A03);
        A10.append(" p2pEligible: ");
        A10.append(this.A0Y);
        A10.append(" p2mEligible: ");
        A10.append(this.A0U);
        A10.append(" timeLastAdded: ");
        A10.append(this.A06);
        A10.append(" needsDeviceBinding: ");
        A10.append(this.A07);
        A10.append(" bindingType: ");
        A10.append(this.A02);
        A10.append(" cardImageContentId: ");
        A10.append(this.A0C);
        A10.append(" cardImageUrl: ");
        A10.append(this.A0E);
        A10.append(" cardImageLabelColor: ");
        A10.append(this.A0D);
        A10.append(" notificationType: ");
        A10.append(this.A04);
        A10.append(" lastFour: ");
        A10.append(this.A0J);
        A10.append("payoutVerificationStatus: ");
        A10.append(this.A01);
        A10.append(" displayState: ");
        StringBuilder A0y = AnonymousClass8BT.A0y(this.A0I, A10);
        A0y.append(" capabilities { editable: ");
        A0y.append(this.A0P);
        A0y.append(", verifiable: ");
        A0y.append(this.A0Z);
        A0y.append(", p2pDefaultEligible: ");
        A0y.append(this.A0X);
        A0y.append(", p2mDefaultEligible: ");
        A0y.append(this.A0T);
        A0y.append(", p2pSend: ");
        A0y.append(this.A0N);
        A0y.append(", p2pReceive: ");
        A0y.append(this.A0M);
        A0y.append(", p2mSend: ");
        A0y.append(this.A0L);
        A0y.append(", p2mReceive: ");
        A0y.append(this.A0K);
        C108985cd.A1L("}", A0y, A10);
        return AnonymousClass000.A0y(" ]", A10);
    }
}
