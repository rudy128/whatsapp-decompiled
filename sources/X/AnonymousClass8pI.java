package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8pI  reason: invalid class name */
public class AnonymousClass8pI extends C64502us {
    public static final Parcelable.Creator CREATOR = new Object();
    public long A00 = -1;
    public C197839xL A01;
    public C1416876o A02;
    public UserJid A03;
    public String A04;
    public int A05;
    public C197829xK A06;
    public boolean A07;

    public static final int A00(String str) {
        if (str == null) {
            return 0;
        }
        int hashCode = str.hashCode();
        return hashCode != 116014 ? hashCode != 3387444 ? (hashCode != 97229420 || !str.equals("fbpay")) ? 0 : 1 : str.equals("novi") ? 2 : 0 : str.equals("upi") ? 3 : 0;
    }

    public void A07(List list) {
        throw AnonymousClass04E.createAndThrow();
    }

    public int describeContents() {
        return 0;
    }

    public static final C197829xK A01(AnonymousClass8pI r1) {
        C197829xK r0 = r1.A06;
        if (r0 != null) {
            return r0;
        }
        C197829xK r02 = new C197829xK();
        r1.A06 = r02;
        return r02;
    }

    public static final String A02(int i) {
        if (i == 0) {
            throw AnonymousClass8BR.A0v(AnonymousClass001.A1I("PAY: getPaymentServiceEnumName/invalid service enum: ", AnonymousClass000.A10(), i));
        } else if (i == 1) {
            return "fbpay";
        } else {
            if (i == 3) {
                return "upi";
            }
            throw AnonymousClass8BR.A0v(AnonymousClass001.A1I("PAY: getPaymentServiceEnumName/invalid service enum: ", AnonymousClass000.A10(), i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0068, code lost:
        if (r1 != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0056, code lost:
        if (r1 == false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass1KI r7, X.C29621ca r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.AnonymousClass8pF
            if (r0 == 0) goto L_0x007e
            r4 = r6
            X.8pF r4 = (X.AnonymousClass8pF) r4
            r0 = 2
            X.C18070vi.A0d(r8, r0)
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = "user"
            r5 = 0
            java.lang.String r0 = r8.A0Q(r0, r5)
            com.whatsapp.jid.UserJid r0 = r1.A04(r0)
            r4.A03 = r0
            X.7Ik r1 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r0 = "vpa"
            java.lang.String r0 = r8.A0Q(r0, r5)
            X.77e r0 = X.AnonymousClass8BT.A0L(r1, r0)
            r4.A01 = r0
            java.lang.String r0 = "vpa-id"
            java.lang.String r0 = r8.A0Q(r0, r5)
            r4.A02 = r0
            X.7Ik r2 = X.AnonymousClass8BR.A0Z()
            java.lang.String r0 = "user-name"
            java.lang.String r1 = r8.A0Q(r0, r5)
            java.lang.String r0 = "accountHolderName"
            X.77e r0 = X.AnonymousClass8BR.A0Y(r2, r3, r1, r0)
            r4.A00 = r0
            java.lang.String r0 = "nodal"
            java.lang.String r0 = r8.A0Q(r0, r5)
            r3 = 1
            java.lang.String r2 = "1"
            if (r0 == 0) goto L_0x0058
            boolean r1 = r0.equals(r2)
            r0 = 1
            if (r1 != 0) goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            r4.A03 = r0
            java.lang.String r0 = "nodal-allowed"
            java.lang.String r0 = r8.A0Q(r0, r5)
            if (r0 == 0) goto L_0x006a
            boolean r1 = r0.equals(r2)
            r0 = 0
            if (r1 == 0) goto L_0x006b
        L_0x006a:
            r0 = 1
        L_0x006b:
            r4.A04 = r0
            java.lang.String r0 = "notif-allowed"
            java.lang.String r0 = r8.A0Q(r0, r5)
            if (r0 == 0) goto L_0x007c
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x007c
            r3 = 0
        L_0x007c:
            r4.A05 = r3
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8pI.A05(X.1KI, X.1ca, int):void");
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [X.76o, java.lang.Object] */
    public void A06(String str) {
        if (str != null) {
            try {
                JSONObject A16 = C17880vN.A16(str);
                C197829xK A012 = A01(this);
                JSONObject optJSONObject = A16.optJSONObject("consumer_status");
                if (optJSONObject != null) {
                    Iterator A0s = AnonymousClass8BS.A0s(optJSONObject);
                    while (A0s.hasNext()) {
                        String A0v = C17880vN.A0v(A0s);
                        int A002 = A00(A0v);
                        if (A002 != 0) {
                            String optString = optJSONObject.optString(A0v);
                            A012.A01.put(Integer.valueOf(A002), optString);
                        }
                    }
                }
                C1416876o r10 = this.A02;
                C1416876o r102 = r10;
                if (r10 == null) {
                    HashMap A11 = C17880vN.A11();
                    ? obj = new Object();
                    obj.A00 = A11;
                    this.A02 = obj;
                    r102 = obj;
                }
                JSONObject optJSONObject2 = A16.optJSONObject("incentive");
                if (optJSONObject2 != null) {
                    try {
                        Iterator A0s2 = AnonymousClass8BS.A0s(optJSONObject2);
                        while (A0s2.hasNext()) {
                            String A0v2 = C17880vN.A0v(A0s2);
                            JSONArray optJSONArray = optJSONObject2.optJSONArray(A0v2);
                            if (optJSONArray != null) {
                                HashSet A12 = C17880vN.A12();
                                int length = optJSONArray.length();
                                for (int i = 0; i < length; i++) {
                                    C17880vN.A1R(A12, optJSONArray.getLong(i));
                                }
                                HashMap hashMap = r102.A00;
                                C18070vi.A0b(A0v2);
                                hashMap.put(A0v2, A12);
                            }
                        }
                    } catch (JSONException e) {
                        Log.e("PAY: PaymentContactInfoCountryData/IncentiveTransactions/setIdTransactionMapfromJSON/failed to parse idJSON array", e);
                    }
                }
                C197839xL r5 = this.A01;
                if (r5 == null) {
                    r5 = new C197839xL();
                    this.A01 = r5;
                }
                JSONObject optJSONObject3 = A16.optJSONObject("eligible_offers");
                if (optJSONObject3 != null) {
                    try {
                        JSONObject jSONObject = optJSONObject3.getJSONObject("dhash");
                        Iterator A0s3 = AnonymousClass8BS.A0s(jSONObject);
                        while (A0s3.hasNext()) {
                            String A0v3 = C17880vN.A0v(A0s3);
                            int A003 = A00(A0v3);
                            if (A003 != 0) {
                                String optString2 = jSONObject.optString(A0v3);
                                r5.A01.put(Integer.valueOf(A003), optString2);
                            }
                        }
                        JSONObject jSONObject2 = optJSONObject3.getJSONObject("offers");
                        Iterator A0s4 = AnonymousClass8BS.A0s(jSONObject2);
                        while (A0s4.hasNext()) {
                            String A0v4 = C17880vN.A0v(A0s4);
                            int A004 = A00(A0v4);
                            if (A004 != 0) {
                                String optString3 = jSONObject2.optString(A0v4);
                                r5.A00.put(Integer.valueOf(A004), optString3);
                            }
                        }
                    } catch (JSONException e2) {
                        C17900vP.A0X(e2, "PAY: PaymentContactInfoCountryData/fromDbString/exception: ", AnonymousClass000.A10());
                    }
                }
            } catch (JSONException e3) {
                C17900vP.A0X(e3, "PAY: PaymentContactInfoCountryData/fromDbString/exception: ", AnonymousClass000.A10());
            }
        }
    }

    public int A08() {
        if (this instanceof AnonymousClass8pF) {
            return 1;
        }
        return this.A05;
    }

    public String A09() {
        Object obj;
        if (!(this instanceof AnonymousClass8pF)) {
            return "";
        }
        C1418477e r0 = ((AnonymousClass8pF) this).A01;
        if (r0 != null) {
            obj = r0.A00;
        } else {
            obj = null;
        }
        return (String) obj;
    }

    public void A0A(int i) {
        if (!(this instanceof AnonymousClass8pF)) {
            this.A05 = i;
        }
    }

    public final void A0B(Parcel parcel) {
        this.A03 = UserJid.Companion.A04(parcel.readString());
        A0E(C17890vO.A1R(parcel.readInt()));
        A0A(parcel.readInt());
        this.A04 = parcel.readString();
        this.A00 = parcel.readLong();
        this.A06 = new C197829xK(parcel);
        this.A02 = (C1416876o) AnonymousClass3Ma.A08(parcel, C1416876o.class);
        this.A01 = new C197839xL(parcel);
    }

    public final void A0C(Parcel parcel, int i) {
        parcel.writeString(C22971Dz.A06(this.A03));
        parcel.writeInt(A0F() ? 1 : 0);
        parcel.writeInt(A08());
        parcel.writeString(this.A04);
        parcel.writeLong(this.A00);
        C197829xK A012 = A01(this);
        parcel.writeLong(A012.A00);
        Map map = A012.A01;
        parcel.writeInt(map.size());
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            parcel.writeInt(AnonymousClass8BV.A04(A16));
            parcel.writeString(AnonymousClass8BR.A10(A16));
        }
        parcel.writeParcelable(this.A02, i);
        C197839xL r3 = this.A01;
        if (r3 == null) {
            r3 = new C197839xL();
            this.A01 = r3;
        }
        Map map2 = r3.A01;
        parcel.writeInt(map2.size());
        Iterator A152 = AnonymousClass000.A15(map2);
        while (A152.hasNext()) {
            Map.Entry A162 = AnonymousClass000.A16(A152);
            parcel.writeInt(AnonymousClass8BV.A04(A162));
            parcel.writeString(AnonymousClass8BR.A10(A162));
        }
        Map map3 = r3.A00;
        parcel.writeInt(map3.size());
        Iterator A153 = AnonymousClass000.A15(map3);
        while (A153.hasNext()) {
            Map.Entry A163 = AnonymousClass000.A16(A153);
            parcel.writeInt(AnonymousClass8BV.A04(A163));
            parcel.writeString(AnonymousClass8BR.A10(A163));
        }
    }

    public void A0D(String str) {
        if (this instanceof AnonymousClass8pF) {
            ((AnonymousClass8pF) this).A01 = AnonymousClass8BT.A0L(AnonymousClass8BR.A0Z(), str);
        }
    }

    public void A0E(boolean z) {
        if (!(this instanceof AnonymousClass8pF)) {
            this.A07 = z;
        }
    }

    public boolean A0F() {
        if (this instanceof AnonymousClass8pF) {
            return false;
        }
        return this.A07;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this instanceof AnonymousClass8pF) {
            AnonymousClass8pF r1 = (AnonymousClass8pF) this;
            C18070vi.A0d(parcel, 0);
            r1.A0C(parcel, i);
            parcel.writeParcelable(r1.A01, i);
            parcel.writeString(r1.A02);
            return;
        }
        C18070vi.A0d(parcel, 0);
        A0C(parcel, i);
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [X.76o, java.lang.Object] */
    public String A04() {
        try {
            JSONObject A15 = C17880vN.A15();
            C197829xK A012 = A01(this);
            LinkedHashMap A13 = C17880vN.A13();
            JSONObject A152 = C17880vN.A15();
            Iterator A153 = AnonymousClass000.A15(A012.A01);
            while (A153.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A153);
                A13.put(A02(AnonymousClass8BV.A04(A16)), A16.getValue());
                try {
                    A152.putOpt(A02(AnonymousClass8BV.A04(A16)), A16.getValue());
                } catch (JSONException e) {
                    C17900vP.A0X(e, "PAY: ConsumerStatusData/getDataHashesDbString/exception: ", AnonymousClass000.A10());
                }
            }
            A15.putOpt("consumer_status", new JSONObject(A13));
            C1416876o r1 = this.A02;
            C1416876o r12 = r1;
            if (r1 == null) {
                HashMap A11 = C17880vN.A11();
                ? obj = new Object();
                obj.A00 = A11;
                this.A02 = obj;
                r12 = obj;
            }
            JSONObject A154 = C17880vN.A15();
            try {
                HashMap hashMap = r12.A00;
                Iterator A0k = C17890vO.A0k(hashMap);
                while (A0k.hasNext()) {
                    Object next = A0k.next();
                    C18070vi.A0X(next);
                    String str = (String) next;
                    AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(str);
                    if (abstractCollection != null) {
                        JSONArray A1A = AnonymousClass8BR.A1A();
                        Iterator it = abstractCollection.iterator();
                        while (it.hasNext()) {
                            AnonymousClass8BS.A1J(it, A1A);
                        }
                        A154.put(str, A1A);
                    }
                }
            } catch (JSONException unused) {
                Log.e("PAY: PaymentContactInfoCountryData/IncentiveTransactions/toJson/ failed to build json");
            }
            A15.putOpt("incentive", A154);
            C197839xL r9 = this.A01;
            if (r9 == null) {
                r9 = new C197839xL();
                this.A01 = r9;
            }
            JSONObject A155 = C17880vN.A15();
            try {
                LinkedHashMap A132 = C17880vN.A13();
                JSONObject A156 = C17880vN.A15();
                Iterator A157 = AnonymousClass000.A15(r9.A01);
                while (A157.hasNext()) {
                    Map.Entry A162 = AnonymousClass000.A16(A157);
                    A132.put(A02(AnonymousClass8BV.A04(A162)), A162.getValue());
                    try {
                        A156.putOpt(A02(AnonymousClass8BV.A04(A162)), A162.getValue());
                    } catch (JSONException e2) {
                        C17900vP.A0X(e2, "PAY: EligibleOfferData/getOfferIdsForDbJson/exception: ", AnonymousClass000.A10());
                    }
                }
                A155.putOpt("dhash", new JSONObject(A132));
                LinkedHashMap A133 = C17880vN.A13();
                JSONObject A158 = C17880vN.A15();
                Iterator A159 = AnonymousClass000.A15(r9.A00);
                while (A159.hasNext()) {
                    Map.Entry A163 = AnonymousClass000.A16(A159);
                    A133.put(A02(AnonymousClass8BV.A04(A163)), A163.getValue());
                    try {
                        A158.putOpt(A02(AnonymousClass8BV.A04(A163)), A163.getValue());
                    } catch (JSONException e3) {
                        C17900vP.A0X(e3, "PAY: EligibleOfferData/getOfferIdsForDbJson/exception: ", AnonymousClass000.A10());
                    }
                }
                A155.putOpt("offers", new JSONObject(A133));
            } catch (JSONException e4) {
                C17900vP.A0X(e4, "PAY: EligibleOfferData/getOfferIdsForDbJson/exception: ", AnonymousClass000.A10());
            }
            A15.putOpt("eligible_offers", A155);
            return A15.toString();
        } catch (JSONException e5) {
            C17900vP.A0X(e5, "PAY: PaymentContactInfoCountryData/toDBString/exception: ", AnonymousClass000.A10());
            return null;
        }
    }
}
