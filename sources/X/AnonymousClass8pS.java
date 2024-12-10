package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8pS  reason: invalid class name */
public final class AnonymousClass8pS extends AnonymousClass8pW {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00 = -1;
    public int A01;
    public C1418477e A02;
    public C1418477e A03;
    public C1418477e A04;
    public C1418477e A05;
    public C1418477e A06;
    public C1418477e A07;
    public C1418477e A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public ArrayList A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public int A0L = 1;

    public String A04() {
        Object obj;
        Object obj2;
        Number number;
        int intValue;
        Number number2;
        int intValue2;
        Number number3;
        int intValue3;
        Object obj3;
        try {
            JSONObject A0B2 = A0B();
            A0B2.put("v", this.A0L);
            String str = this.A09;
            if (str != null) {
                A0B2.put("accountProvider", str);
            }
            if (!C20061A5k.A02(this.A02)) {
                C1418477e r0 = this.A02;
                if (r0 != null) {
                    obj3 = r0.A00;
                } else {
                    obj3 = null;
                }
                A0B2.put("accountHolderName", obj3);
            }
            C1418477e r02 = this.A06;
            if (!(r02 == null || (number3 = (Number) r02.A00) == null || (intValue3 = number3.intValue()) < 0)) {
                A0B2.put("otpLength", intValue3);
            }
            C1418477e r03 = this.A03;
            if (!(r03 == null || (number2 = (Number) r03.A00) == null || (intValue2 = number2.intValue()) < 0)) {
                A0B2.put("atmPinLength", intValue2);
            }
            C1418477e r04 = this.A07;
            if (!(r04 == null || (number = (Number) r04.A00) == null || (intValue = number.intValue()) < 0)) {
                A0B2.put("upiPinLength", intValue);
            }
            C1418477e r3 = this.A05;
            if (!C20061A5k.A03(r3)) {
                if (r3 != null) {
                    obj2 = r3.A00;
                } else {
                    obj2 = null;
                }
                A0B2.put("miscBankInfo", obj2);
            }
            C1418477e r32 = this.A08;
            if (!C20061A5k.A03(r32)) {
                if (r32 != null) {
                    obj = r32.A00;
                } else {
                    obj = null;
                }
                A0B2.put("vpaHandle", obj);
            }
            String str2 = this.A0E;
            if (str2 != null) {
                A0B2.put("vpaId", str2);
            }
            String str3 = this.A0B;
            if (str3 != null) {
                A0B2.put("bankCode", str3);
            }
            int i = this.A01;
            if (i >= 0) {
                A0B2.put("pinFormat", i);
            }
            C1418477e r05 = this.A04;
            if (r05 != null) {
                A0B2.put("isMpinSet", r05.A00);
            }
            String str4 = this.A0A;
            if (str4 != null) {
                A0B2.put("accountType", str4);
            }
            A0B2.put("isAadhaarEnabled", this.A0H);
            A0B2.put("defaultDebitP2m", this.A0G);
            A0B2.put("isInternationalPayEnabled", this.A0J);
            return A0B2.toString();
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiMethodData toDBString threw: ", e);
            return null;
        }
    }

    public void A05(AnonymousClass1KI r13, C29621ca r14, int i) {
        String str;
        Collection collection;
        C18070vi.A0d(r14, 2);
        boolean z = true;
        if (i == 2) {
            str = null;
            this.A01 = AnonymousClass8BW.A0K(r14.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) null), "bankName");
            this.A09 = r14.A0Q("provider-type", (String) null);
            this.A03 = r14.A0Q("image", (String) null);
            this.A0B = r14.A0Q("code", (String) null);
            this.A04 = r14.A0Q("bank-phone-number", (String) null);
            this.A0K = AnonymousClass8BU.A1T(r14, "popular-bank", "1");
            String A0Q = r14.A0Q("psp-routing", (String) null);
            if (!(A0Q == null || A0Q.length() == 0)) {
                List A0v = C108965cb.A0v(A0Q, ",", 0);
                if (!A0v.isEmpty()) {
                    ListIterator A18 = C108955ca.A18(A0v);
                    while (true) {
                        if (A18.hasPrevious()) {
                            if (C108985cd.A08(A18) != 0) {
                                collection = C108985cd.A0t(A0v, A18);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    this.A0F = C17880vN.A10(collection);
                }
                collection = C18460wS.A00;
                this.A0F = C17880vN.A10(collection);
            }
            if (this.A00 == -1) {
                this.A00 = C20099A7c.A01(C29621ca.A02(r14, "version"), -1);
            }
        } else {
            try {
                this.A09 = C29621ca.A02(r14, "provider");
                Class<String> cls = String.class;
                this.A02 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), cls, C29621ca.A02(r14, "account-name"), "accountHolderName");
                this.A04 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), Boolean.class, Boolean.valueOf(AnonymousClass000.A1T(C20099A7c.A01(C29621ca.A02(r14, "is-mpin-set"), 0), 1)), "isPinSet");
                Class<Integer> cls2 = Integer.class;
                this.A06 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), cls2, Integer.valueOf(C20099A7c.A01(C29621ca.A02(r14, "otp-length"), 0)), "otpLength");
                this.A03 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), cls2, Integer.valueOf(C20099A7c.A01(C29621ca.A02(r14, "atm-pin-length"), 0)), "atmPinLength");
                this.A07 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), cls2, Integer.valueOf(C20099A7c.A01(C29621ca.A02(r14, "mpin-length"), 0)), "pinLength");
                str = null;
                this.A08 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), cls, r14.A0Q("vpa", (String) null), "upiHandle");
                this.A0E = r14.A0Q("vpa-id", (String) null);
                this.A0B = r14.A0Q("code", (String) null);
                this.A01 = C20099A7c.A01(r14.A0Q("pin-format-version", (String) null), 0);
                this.A05 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), cls, r14.A0Q("upi-bank-info", (String) null), "bankInfo");
                this.A03 = r14.A0Q("image", (String) null);
                this.A04 = r14.A0Q("bank-phone-number", (String) null);
                this.A09 = null;
                this.A01 = AnonymousClass8BW.A0K(r14.A0Q("bank-name", (String) null), "bankName");
                this.A06 = r14.A0Q("credential-id", (String) null);
                this.A02 = AnonymousClass8BW.A0K(r14.A0Q("account-number", (String) null), "bankAccountNumber");
                this.A00 = C20099A7c.A02(r14.A0Q("created", (String) null));
                this.A07 = AnonymousClass000.A1T(C20099A7c.A01(r14.A0Q("default-credit", (String) null), 0), 1);
                this.A08 = AnonymousClass000.A1T(C20099A7c.A01(r14.A0Q("default-debit", (String) null), 0), 1);
                if (C20099A7c.A01(r14.A0Q("default-debit-p2m", (String) null), 0) != 1) {
                    z = false;
                }
                this.A0G = z;
                this.A0A = r14.A0Q("account-type", (String) null);
            } catch (Exception e) {
                Log.e("PAY: IndiaUpiMethodData fromNetwork", e);
                return;
            }
        }
        String A0Q2 = r14.A0Q("transaction-prefix", str);
        if (!(A0Q2 == null || A0Q2.length() == 0)) {
            this.A0D = A0Q2;
        }
        this.A0H = AnonymousClass8BU.A1T(r14, "is-aadhaar-enabled", "1");
        this.A0J = AnonymousClass8BU.A1T(r14, "is_international_pay_enabled", "1");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A07, i);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeParcelable(this.A05, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A08, i);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeStringList(this.A0F);
        byte[] bArr = this.A09;
        if (bArr != null) {
            i2 = bArr.length;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        byte[] bArr2 = this.A09;
        if (bArr2 != null) {
            parcel.writeByteArray(bArr2);
        }
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
    }

    public void A06(String str) {
        C18070vi.A0d(str, 0);
        try {
            JSONObject A16 = C17880vN.A16(str);
            this.A03 = A16.optString("bankImageURL", (String) null);
            this.A04 = A16.optString("bankPhoneNumber", (String) null);
            this.A0L = A16.optInt("v", 1);
            Class<String> cls = String.class;
            this.A02 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), cls, A16.optString("accountHolderName", (String) null), "accountHolderName");
            Class<Integer> cls2 = Integer.class;
            this.A06 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), cls2, Integer.valueOf(A16.optInt("otpLength", -1)), "otpLength");
            this.A03 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), cls2, Integer.valueOf(A16.optInt("atmPinLength", -1)), "atmPinLength");
            this.A07 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), cls2, Integer.valueOf(A16.optInt("upiPinLength", -1)), "pinLength");
            this.A05 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), cls, A16.optString("miscBankInfo", (String) null), "bankInfo");
            this.A08 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), cls, A16.optString("vpaHandle", (String) null), "upiHandle");
            this.A0E = A16.optString("vpaId", (String) null);
            this.A0B = A16.optString("bankCode", (String) null);
            String optString = A16.optString("accountProvider", "");
            if (!C18070vi.A18(optString, this.A0B)) {
                this.A09 = optString;
            }
            this.A01 = A16.optInt("pinFormat", 0);
            this.A04 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), Boolean.class, Boolean.valueOf(A16.optBoolean("isMpinSet", false)), "isPinSet");
            this.A0A = A16.optString("accountType", (String) null);
            this.A0H = A16.optBoolean("isAadhaarEnabled", false);
            this.A0G = A16.optBoolean("defaultDebitP2m");
            this.A0J = A16.optBoolean("isInternationalPayEnabled", false);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiMethodData fromDBString threw: ", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        r0 = r1.equals(r0);
        r1 = 2131888263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0057, code lost:
        if (r0 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0C() {
        /*
            r2 = this;
            java.lang.String r1 = r2.A0A
            if (r1 == 0) goto L_0x000b
            int r0 = r1.hashCode()
            switch(r0) {
                case -1704036199: goto L_0x004e;
                case -240997565: goto L_0x0044;
                case 77569: goto L_0x003a;
                case 77579: goto L_0x0030;
                case 358786314: goto L_0x002d;
                case 1844922713: goto L_0x0023;
                case 1878996346: goto L_0x0019;
                case 1996005113: goto L_0x000f;
                default: goto L_0x000b;
            }
        L_0x000b:
            r1 = 2131888265(0x7f120889, float:1.941116E38)
        L_0x000e:
            return r1
        L_0x000f:
            java.lang.String r0 = "CREDIT"
            boolean r0 = r1.equals(r0)
            r1 = 2131888261(0x7f120885, float:1.9411152E38)
            goto L_0x0057
        L_0x0019:
            java.lang.String r0 = "CREDIT_LINE"
            boolean r0 = r1.equals(r0)
            r1 = 2131897396(0x7f122c34, float:1.942968E38)
            goto L_0x0057
        L_0x0023:
            java.lang.String r0 = "CURRENT"
            boolean r0 = r1.equals(r0)
            r1 = 2131888262(0x7f120886, float:1.9411154E38)
            goto L_0x0057
        L_0x002d:
            java.lang.String r0 = "OD_UNSECURED"
            goto L_0x0046
        L_0x0030:
            java.lang.String r0 = "NRO"
            boolean r0 = r1.equals(r0)
            r1 = 2131897398(0x7f122c36, float:1.9429684E38)
            goto L_0x0057
        L_0x003a:
            java.lang.String r0 = "NRE"
            boolean r0 = r1.equals(r0)
            r1 = 2131897397(0x7f122c35, float:1.9429682E38)
            goto L_0x0057
        L_0x0044:
            java.lang.String r0 = "OD_SECURED"
        L_0x0046:
            boolean r0 = r1.equals(r0)
            r1 = 2131888263(0x7f120887, float:1.9411156E38)
            goto L_0x0057
        L_0x004e:
            java.lang.String r0 = "SAVINGS"
            boolean r0 = r1.equals(r0)
            r1 = 2131888264(0x7f120888, float:1.9411158E38)
        L_0x0057:
            if (r0 != 0) goto L_0x000e
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8pS.A0C():int");
    }

    public void A07(List list) {
        throw AnonymousClass04E.createAndThrow();
    }

    public String toString() {
        int i;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ accountProvider: ");
        A10.append(this.A09);
        A10.append(" issuerName: ");
        A10.append(this.A01);
        A10.append(" bankImageUrl: ");
        A10.append(this.A03);
        A10.append(" icon length: ");
        byte[] bArr = this.A09;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        A10.append(i);
        StringBuilder A0y = AnonymousClass8BT.A0y(" otpLength: ", A10);
        A0y.append(this.A06);
        C20088A6q.A04(A0y, A10);
        StringBuilder A0y2 = AnonymousClass8BT.A0y(" upiPinLength: ", A10);
        A0y2.append(this.A07);
        C20088A6q.A04(A0y2, A10);
        StringBuilder A0y3 = AnonymousClass8BT.A0y(" atmPinLength: ", A10);
        A0y3.append(this.A03);
        C20088A6q.A04(A0y3, A10);
        A10.append(" vpaHandle: ");
        A10.append(this.A08);
        A10.append(" vpaId: ");
        A10.append(this.A0E);
        A10.append(" bankPhoneNumber: ");
        A10.append(this.A04);
        A10.append(" bankCode: ");
        A10.append(this.A0B);
        StringBuilder A0y4 = AnonymousClass8BT.A0y(" pinFormat: ", A10);
        A0y4.append(this.A01);
        C20088A6q.A04(A0y4, A10);
        A10.append(" pspRouting: ");
        A10.append(this.A0F);
        A10.append(" supportPhoneNumber: ");
        A10.append(this.A0C);
        A10.append(" transactionPrefix: ");
        A10.append(this.A0D);
        A10.append(" banksListVersion: ");
        A10.append(this.A00);
        return AnonymousClass000.A0y(" ]", A10);
    }
}
