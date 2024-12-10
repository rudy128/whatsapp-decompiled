package X;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8pG  reason: invalid class name */
public abstract class AnonymousClass8pG extends C64502us {
    public C22565BDa A00;
    public ADR A01;
    public C20280AEo A02;
    public Boolean A03;
    public boolean A04;

    public int describeContents() {
        return 0;
    }

    public int A08() {
        if (this instanceof C170308pe) {
            return 0;
        }
        if (this instanceof C170298pd) {
            return ((C170298pd) this).A00;
        }
        if (this instanceof C170318pf) {
            return ((C170318pf) this).A00;
        }
        return 0;
    }

    public int A09() {
        if (this instanceof C170308pe) {
            return 0;
        }
        if (this instanceof C170298pd) {
            return ((C170298pd) this).A01;
        }
        if (this instanceof C170318pf) {
            return ((C170318pf) this).A01;
        }
        return 0;
    }

    public long A0A() {
        if (this instanceof C170308pe) {
            return ((C170308pe) this).A00;
        }
        if (this instanceof C170298pd) {
            return ((C170298pd) this).A02;
        }
        if (this instanceof C170318pf) {
            return ((C170318pf) this).A04;
        }
        return ((C170288pc) this).A00;
    }

    public long A0B() {
        if (this instanceof C170318pf) {
            return ((C170318pf) this).A05;
        }
        return 0;
    }

    public C20274AEh A0C() {
        if (this instanceof C170308pe) {
            return ((C170308pe) this).A01;
        }
        return null;
    }

    public C1418477e A0D() {
        if (this instanceof C170318pf) {
            return ((C170318pf) this).A0B;
        }
        return null;
    }

    public C1418477e A0E() {
        if (this instanceof C170318pf) {
            return ((C170318pf) this).A0C;
        }
        return null;
    }

    public String A0F() {
        if ((this instanceof C170308pe) || (this instanceof C170298pd) || !(this instanceof C170318pf)) {
            return null;
        }
        return ((C170318pf) this).A0V;
    }

    public String A0G() {
        if ((this instanceof C170308pe) || (this instanceof C170298pd) || !(this instanceof C170318pf)) {
            return null;
        }
        return ((C170318pf) this).A0R;
    }

    public String A0H() {
        if (this instanceof C170318pf) {
            return ((C170318pf) this).A0Q;
        }
        return null;
    }

    public String A0I() {
        if (this instanceof C170308pe) {
            return ((C170308pe) this).A07;
        }
        if ((this instanceof C170298pd) || !(this instanceof C170318pf)) {
            return null;
        }
        return ((C170318pf) this).A0T;
    }

    public String A0J() {
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        if (this instanceof C170308pe) {
            C170308pe r2 = (C170308pe) this;
            try {
                JSONObject A0L = r2.A0L();
                long j = r2.A00;
                if (j > 0) {
                    A0L.put("expiryTs", j);
                }
                String str2 = r2.A05;
                if (str2 != null) {
                    A0L.put("nonce", str2);
                }
                String str3 = r2.A03;
                if (str3 != null) {
                    A0L.put("amount", str3);
                }
                String str4 = r2.A04;
                if (str4 != null) {
                    A0L.put("deviceId", str4);
                }
                String str5 = r2.A07;
                if (str5 != null) {
                    A0L.put("sender-alias", str5);
                }
                Boolean bool = r2.A02;
                if (bool != null) {
                    A0L.put("isFirstSend", bool.booleanValue());
                }
                String str6 = r2.A06;
                if (str6 != null) {
                    A0L.put("pspTransactionId", str6);
                }
                C20274AEh aEh = r2.A01;
                if (aEh != null) {
                    JSONObject A15 = C17880vN.A15();
                    A15.put("max_count", aEh.A00);
                    A15.put("selected_count", aEh.A01);
                    ARR arr = aEh.A02;
                    C17960vV.A07(arr);
                    A15.put("due_amount_obj", arr.CPM());
                    ARR arr2 = aEh.A03;
                    C17960vV.A07(arr2);
                    A15.put("interest_obj", arr2.CPM());
                    A0L.put("installment", A15);
                }
                return A0L.toString();
            } catch (JSONException e) {
                e = e;
                str = "PAY: BrazilTransactionCountryData toDBString threw: ";
                Log.w(str, e);
                return null;
            }
        } else if (this instanceof C170298pd) {
            C170298pd r3 = (C170298pd) this;
            try {
                JSONObject A0L2 = r3.A0L();
                String str7 = r3.A04;
                if (str7 != null) {
                    A0L2.put("pspTransactionId", str7);
                }
                String str8 = r3.A03;
                if (str8 != null) {
                    A0L2.put("pspReceiptURL", str8);
                }
                return A0L2.toString();
            } catch (JSONException e2) {
                e = e2;
                str = "PAY: P2mLiteTransactionMetadata metaDataToDbString threw: ";
                Log.w(str, e);
                return null;
            }
        } else if (this instanceof C170318pf) {
            C170318pf r5 = (C170318pf) this;
            try {
                JSONObject A0L3 = r5.A0L();
                A0L3.put("v", r5.A03);
                String str9 = r5.A0V;
                if (str9 != null) {
                    A0L3.put("seqNum", str9);
                }
                String str10 = r5.A0K;
                if (str10 != null) {
                    A0L3.put("deviceId", str10);
                }
                long j2 = r5.A04;
                if (j2 > 0) {
                    A0L3.put("expiryTs", j2);
                }
                int i = r5.A01;
                if (i > 0) {
                    A0L3.put("previousStatus", i);
                }
                String str11 = r5.A0R;
                if (str11 != null) {
                    A0L3.put("receiverVpa", str11);
                }
                String str12 = r5.A0S;
                if (str12 != null) {
                    A0L3.put("receiverVpaId", str12);
                }
                C1418477e r22 = r5.A0B;
                if (!C20061A5k.A03(r22)) {
                    if (r22 != null) {
                        obj6 = r22.A00;
                    } else {
                        obj6 = null;
                    }
                    A0L3.put("receiverName", obj6);
                }
                String str13 = r5.A0T;
                if (str13 != null) {
                    A0L3.put("senderVpa", str13);
                }
                String str14 = r5.A0U;
                if (str14 != null) {
                    A0L3.put("senderVpaId", str14);
                }
                C1418477e r23 = r5.A0C;
                if (!C20061A5k.A03(r23)) {
                    if (r23 != null) {
                        obj5 = r23.A00;
                    } else {
                        obj5 = null;
                    }
                    A0L3.put("senderName", obj5);
                }
                int i2 = r5.A00;
                if (i2 > 0) {
                    A0L3.put("counter", i2);
                }
                int i3 = r5.A02;
                if (i3 > 0) {
                    A0L3.put("previousType", i3);
                }
                String str15 = r5.A0Y;
                if (str15 != null) {
                    A0L3.put("url", str15);
                }
                String str16 = r5.A0W;
                if (str16 != null) {
                    A0L3.put("syncStatus", str16);
                }
                C1418477e r24 = r5.A0D;
                if (!C20061A5k.A03(r24)) {
                    if (r24 != null) {
                        obj4 = r24.A00;
                    } else {
                        obj4 = null;
                    }
                    A0L3.put("upiBankInfo", obj4);
                }
                String str17 = r5.A0O;
                if (str17 != null) {
                    A0L3.put("mcc", str17);
                }
                String str18 = r5.A0P;
                if (str18 != null) {
                    A0L3.put("purposeCode", str18);
                }
                C196219ue r0 = r5.A0H;
                if (r0 != null) {
                    A0L3.put("indiaUpiMandateMetadata", r0.A01());
                }
                Boolean bool2 = r5.A0J;
                if (bool2 != null) {
                    A0L3.put("isFirstSend", bool2);
                }
                ADS ads = r5.A0I;
                if (ads != null) {
                    A0L3.put("indiaUpiTransactionComplaintData", ads.A00());
                }
                C190159kT r02 = r5.A0G;
                if (r02 != null) {
                    A0L3.put("indiaUpiInternationalTransactionDetailData", r02.A00());
                }
                String str19 = r5.A0N;
                if (str19 != null) {
                    A0L3.put("mandateTransactionId", str19);
                }
                if (!C20061A5k.A02(r5.A08)) {
                    C1418477e r03 = r5.A08;
                    if (r03 != null) {
                        obj3 = r03.A00;
                    } else {
                        obj3 = null;
                    }
                    A0L3.put("note", obj3);
                }
                String str20 = r5.A0L;
                if (!(str20 == null || str20.length() == 0)) {
                    A0L3.put("encryptedInteropNote", str20);
                }
                Boolean bool3 = r5.A03;
                if (bool3 != null) {
                    A0L3.put("isPendingRequestViewed", bool3);
                }
                A0L3.put("isP2mHybrid", r5.A0a);
                if (!C20061A5k.A02(r5.A09)) {
                    C1418477e r04 = r5.A09;
                    if (r04 != null) {
                        obj2 = r04.A00;
                    } else {
                        obj2 = null;
                    }
                    A0L3.put("paymentInstrumentType", obj2);
                }
                if (!C20061A5k.A02(r5.A0A)) {
                    C1418477e r05 = r5.A0A;
                    if (r05 != null) {
                        obj = r05.A00;
                    } else {
                        obj = null;
                    }
                    A0L3.put("pspTransactionId", obj);
                }
                String str21 = r5.A0Q;
                if (str21 != null) {
                    A0L3.put("receiverTpapName", str21);
                }
                ADP adp = r5.A0F;
                if (adp != null) {
                    JSONObject A152 = C17880vN.A15();
                    A152.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, adp.A01);
                    A152.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, adp.A00);
                    A0L3.put("externalPaymentMethod", A152);
                }
                List list = r5.A0Z;
                if (list != null) {
                    A0L3.put("offers", C20244ADc.A01.A00(list));
                }
                C22565BDa bDa = r5.A07;
                if (bDa != null) {
                    A0L3.put("offerAmount", bDa.CPM());
                }
                C22565BDa bDa2 = r5.A06;
                if (bDa2 != null) {
                    A0L3.put("feeAmount", bDa2.CPM());
                }
                return A0L3.toString();
            } catch (JSONException e3) {
                Log.w("PAY: IndiaUpiTransactionMetadata toDBString threw: ", e3);
                return null;
            }
        } else {
            C170288pc r4 = (C170288pc) this;
            JSONObject A0L4 = r4.A0L();
            A0L4.put("expiryTs", r4.A00);
            String str22 = r4.A01;
            if (str22 != null) {
                A0L4.put("pspTransactionId", str22);
            }
            return A0L4.toString();
        }
    }

    public String A0K() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        if ((this instanceof C170308pe) || (this instanceof C170298pd) || !(this instanceof C170318pf)) {
            return null;
        }
        C170318pf r4 = (C170318pf) this;
        try {
            JSONObject A15 = C17880vN.A15();
            A15.put("v", r4.A03);
            C1418477e r2 = r4.A0E;
            if (!C20061A5k.A03(r2)) {
                if (r2 != null) {
                    obj7 = r2.A00;
                } else {
                    obj7 = null;
                }
                A15.put("blob", obj7);
            }
            String str = r4.A0X;
            if (!(str == null || str.length() == 0)) {
                A15.put("token", str);
            }
            String str2 = r4.A0T;
            if (str2 != null) {
                A15.put("senderVpa", str2);
            }
            String str3 = r4.A0U;
            if (str3 != null) {
                A15.put("senderVpaId", str3);
            }
            C1418477e r22 = r4.A0C;
            if (!C20061A5k.A03(r22)) {
                if (r22 != null) {
                    obj6 = r22.A00;
                } else {
                    obj6 = null;
                }
                A15.put("senderName", obj6);
            }
            String str4 = r4.A0R;
            if (str4 != null) {
                A15.put("receiverVpa", str4);
            }
            String str5 = r4.A0S;
            if (str5 != null) {
                A15.put("receiverVpaId", str5);
            }
            C1418477e r23 = r4.A0B;
            if (!C20061A5k.A03(r23)) {
                if (r23 != null) {
                    obj5 = r23.A00;
                } else {
                    obj5 = null;
                }
                A15.put("receiverName", obj5);
            }
            String str6 = r4.A0K;
            if (str6 != null) {
                A15.put("deviceId", str6);
            }
            C1418477e r24 = r4.A0D;
            if (!C20061A5k.A03(r24)) {
                if (r24 != null) {
                    obj4 = r24.A00;
                } else {
                    obj4 = null;
                }
                A15.put("upiBankInfo", obj4);
            }
            if (!C20061A5k.A02(r4.A08)) {
                C1418477e r0 = r4.A08;
                if (r0 != null) {
                    obj3 = r0.A00;
                } else {
                    obj3 = null;
                }
                A15.put("note", obj3);
            }
            String str7 = r4.A0L;
            if (!(str7 == null || str7.length() == 0)) {
                A15.put("encryptedInteropNote", str7);
            }
            A15.put("isP2mHybrid", r4.A0a);
            if (!C20061A5k.A02(r4.A09)) {
                C1418477e r02 = r4.A09;
                if (r02 != null) {
                    obj2 = r02.A00;
                } else {
                    obj2 = null;
                }
                A15.put("paymentInstrumentType", obj2);
            }
            if (!C20061A5k.A02(r4.A0A)) {
                C1418477e r03 = r4.A0A;
                if (r03 != null) {
                    obj = r03.A00;
                } else {
                    obj = null;
                }
                A15.put("pspTransactionId", obj);
            }
            ADP adp = r4.A0F;
            if (adp != null) {
                JSONObject A152 = C17880vN.A15();
                A152.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, adp.A01);
                A152.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, adp.A00);
                A15.put("externalPaymentMethod", A152);
            }
            List list = r4.A0Z;
            if (list != null) {
                A15.put("offers", C20244ADc.A01.A00(list));
            }
            C22565BDa bDa = r4.A07;
            if (bDa != null) {
                A15.put("offerAmount", bDa.CPM());
            }
            String str8 = r4.A0Q;
            if (str8 != null) {
                A15.put("receiverTpapName", str8);
            }
            C22565BDa bDa2 = r4.A06;
            if (bDa2 != null) {
                A15.put("feeAmount", bDa2.CPM());
            }
            return A15.toString();
        } catch (JSONException e) {
            C17900vP.A0Z(e, "PAY: IndiaUpiTransactionMetadata toDBString threw: ", AnonymousClass000.A10());
            return null;
        }
    }

    public void A0M(int i) {
        if (this instanceof C170308pe) {
            return;
        }
        if (this instanceof C170298pd) {
            ((C170298pd) this).A01 = i;
        } else if (this instanceof C170318pf) {
            ((C170318pf) this).A01 = i;
        }
    }

    public void A0N(int i) {
        if (!(this instanceof C170308pe) && !(this instanceof C170298pd) && (this instanceof C170318pf)) {
            ((C170318pf) this).A02 = i;
        }
    }

    public void A0O(long j) {
        if (this instanceof C170318pf) {
            ((C170318pf) this).A05 = j;
        }
    }

    public void A0Q(Parcel parcel) {
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
        parcel.writeParcelable(this.A00, 0);
        parcel.writeParcelable(this.A02, 0);
        parcel.writeSerializable(this.A03);
    }

    public void A0R(AnonymousClass8pG r2) {
        this.A04 = r2.A04;
        C22565BDa bDa = r2.A00;
        if (bDa != null) {
            this.A00 = bDa;
        }
        ADR adr = r2.A01;
        if (adr != null) {
            this.A01 = adr;
        }
        C20280AEo aEo = r2.A02;
        if (aEo != null) {
            this.A02 = aEo;
        }
        Boolean bool = r2.A03;
        if (bool != null) {
            this.A03 = bool;
        }
    }

    public void A0S(String str) {
        if (!(this instanceof C170308pe) && !(this instanceof C170298pd) && (this instanceof C170318pf)) {
            ((C170318pf) this).A0V = str;
        }
    }

    public void A0T(String str) {
        if (this instanceof C170318pf) {
            C18070vi.A0d(str, 0);
            ((C170318pf) this).A08 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, str, "interopNote");
        }
    }

    public void A0U(String str) {
        if (!(this instanceof C170308pe) && !(this instanceof C170298pd) && (this instanceof C170318pf)) {
            ((C170318pf) this).A0R = str;
        }
    }

    public void A0V(String str) {
        if (this instanceof C170308pe) {
            C18070vi.A0d(str, 0);
            ((C170308pe) this).A07 = str;
        } else if (!(this instanceof C170298pd) && (this instanceof C170318pf)) {
            C18070vi.A0d(str, 0);
            ((C170318pf) this).A0T = str;
        }
    }

    public void A0W(String str) {
        if (this instanceof C170318pf) {
            ((C170318pf) this).A0C = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, str, "legalName");
        }
    }

    public boolean A0X() {
        C1418477e r0;
        String str;
        if (!(this instanceof C170318pf)) {
            return false;
        }
        C170318pf r3 = (C170318pf) this;
        if (!r3.A0a || (r0 = r3.A09) == null) {
            return false;
        }
        if (!"upi".equalsIgnoreCase((String) r0.A00) || (str = r3.A0T) == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        int A1O;
        String str3;
        String str4;
        if (this instanceof C170308pe) {
            C170308pe r2 = (C170308pe) this;
            C18070vi.A0d(parcel, 0);
            r2.A0Q(parcel);
            parcel.writeString(r2.A05);
            parcel.writeString(r2.A04);
            parcel.writeString(r2.A03);
            parcel.writeSerializable(r2.A02);
            parcel.writeString(r2.A06);
            parcel.writeParcelable(r2.A01, 0);
            return;
        }
        if (this instanceof C170298pd) {
            C170298pd r1 = (C170298pd) this;
            C18070vi.A0d(parcel, 0);
            r1.A0Q(parcel);
            parcel.writeString(r1.A04);
            str = r1.A03;
        } else if (this instanceof C170318pf) {
            C170318pf r22 = (C170318pf) this;
            C18070vi.A0d(parcel, 0);
            r22.A0Q(parcel);
            parcel.writeParcelable(r22.A0E, i);
            parcel.writeString(r22.A0X);
            parcel.writeString(r22.A0V);
            parcel.writeString(r22.A0T);
            parcel.writeString(r22.A0U);
            parcel.writeString((String) AnonymousClass8BT.A0q(r22.A0C));
            parcel.writeString(r22.A0R);
            parcel.writeString(r22.A0S);
            parcel.writeString((String) AnonymousClass8BT.A0q(r22.A0B));
            parcel.writeLong(r22.A05);
            parcel.writeString(r22.A0K);
            parcel.writeLong(r22.A04);
            parcel.writeInt(r22.A01);
            parcel.writeInt(r22.A00);
            parcel.writeInt(r22.A02);
            parcel.writeString(r22.A0Y);
            parcel.writeParcelable(r22.A0D, i);
            parcel.writeString(r22.A0M);
            parcel.writeString(r22.A0W);
            parcel.writeString(r22.A0O);
            parcel.writeString(r22.A0P);
            C196219ue r0 = r22.A0H;
            String str5 = null;
            if (r0 != null) {
                str2 = r0.A01();
            } else {
                str2 = null;
            }
            parcel.writeString(str2);
            Boolean bool = r22.A0J;
            if (bool == null) {
                A1O = -1;
            } else {
                A1O = AnonymousClass000.A1O(bool.booleanValue() ? 1 : 0);
            }
            parcel.writeInt(A1O);
            ADS ads = r22.A0I;
            if (ads != null) {
                str3 = ads.A00();
            } else {
                str3 = null;
            }
            parcel.writeString(str3);
            C190159kT r02 = r22.A0G;
            if (r02 != null) {
                str4 = r02.A00();
            } else {
                str4 = null;
            }
            parcel.writeString(str4);
            parcel.writeString(r22.A0N);
            parcel.writeParcelable(r22.A08, i);
            parcel.writeInt(r22.A0a ? 1 : 0);
            parcel.writeParcelable(r22.A09, i);
            parcel.writeParcelable(r22.A0A, i);
            parcel.writeParcelable(r22.A0F, i);
            List list = r22.A0Z;
            if (list != null) {
                str5 = C20244ADc.A01.A00(list).toString();
            }
            parcel.writeString(str5);
            parcel.writeParcelable(r22.A07, i);
            parcel.writeString(r22.A0Q);
            parcel.writeString(r22.A0L);
            parcel.writeParcelable(r22.A06, i);
            return;
        } else {
            C170288pc r23 = (C170288pc) this;
            C18070vi.A0d(parcel, 0);
            r23.A0Q(parcel);
            parcel.writeLong(r23.A00);
            str = r23.A01;
        }
        parcel.writeString(str);
    }

    /* JADX WARNING: type inference failed for: r0v22, types: [X.ADC, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v12, types: [X.2r3, java.lang.Object] */
    public void A06(String str) {
        C20280AEo aEo;
        ArrayList arrayList;
        try {
            JSONObject A16 = C17880vN.A16(str);
            this.A04 = A16.optBoolean("messageDeleted", false);
            JSONObject optJSONObject = A16.optJSONObject("money");
            if (optJSONObject != null) {
                ? obj = new Object();
                obj.A02 = AnonymousClass1KL.A0C;
                obj.A00();
                this.A00 = AnonymousClass8BU.A0I(optJSONObject);
            }
            JSONObject optJSONObject2 = A16.optJSONObject("incentive");
            if (optJSONObject2 != null) {
                this.A01 = new ADR(C108955ca.A11("offer-id", optJSONObject2), optJSONObject2.optString("offer-claim-id"), optJSONObject2.optString("parent-transaction-id"), optJSONObject2.optString("incentive-payment-id"));
            }
            JSONObject optJSONObject3 = A16.optJSONObject("order");
            if (optJSONObject3 != null) {
                String optString = optJSONObject3.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                String str2 = "";
                if (optString == null) {
                    optString = str2;
                }
                String optString2 = optJSONObject3.optString("message_id");
                if (optString2 == null) {
                    optString2 = str2;
                }
                long optLong = optJSONObject3.optLong("expiry_ts");
                String optString3 = optJSONObject3.optString("payment_config_id");
                JSONArray optJSONArray = optJSONObject3.optJSONArray("beneficiaries");
                if (optJSONArray == null || optJSONArray.length() == 0) {
                    arrayList = null;
                } else {
                    arrayList = AnonymousClass000.A13();
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        Object obj2 = optJSONArray.get(i);
                        C18070vi.A0z(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                        JSONObject jSONObject = (JSONObject) obj2;
                        String optString4 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                        String optString5 = jSONObject.optString("address_line1");
                        String optString6 = jSONObject.optString("address_line2");
                        String optString7 = jSONObject.optString("city");
                        String optString8 = jSONObject.optString("state");
                        String optString9 = jSONObject.optString("country");
                        String optString10 = jSONObject.optString("postal_code");
                        C108995ce.A1H(optString4, optString5, optString6, optString7);
                        C18070vi.A0b(optString8);
                        C18070vi.A0b(optString9);
                        C18070vi.A0b(optString10);
                        C18070vi.A0w(optString4, optString5, optString6, optString7, optString8);
                        C18070vi.A0l(optString9, optString10);
                        ? obj3 = new Object();
                        obj3.A04 = optString4;
                        obj3.A00 = optString5;
                        obj3.A01 = optString6;
                        obj3.A02 = optString7;
                        obj3.A06 = optString8;
                        obj3.A03 = optString9;
                        obj3.A05 = optString10;
                        arrayList.add(obj3);
                    }
                }
                String optString11 = optJSONObject3.optString("order-type");
                if (optString11 != null) {
                    str2 = optString11;
                }
                aEo = new C20280AEo(optString, optString2, optString3, str2, arrayList, optLong);
            } else {
                String optString12 = A16.optString("orderId");
                long optLong2 = A16.optLong("orderExpiryTsInSec");
                String optString13 = A16.optString("orderMessageId");
                if (!TextUtils.isEmpty(optString12) && !TextUtils.isEmpty(optString13)) {
                    aEo = new C20280AEo(optLong2, optString12, optString13);
                }
                this.A03 = Boolean.valueOf(A16.optBoolean("isPendingRequestViewed", false));
            }
            this.A02 = aEo;
            this.A03 = Boolean.valueOf(A16.optBoolean("isPendingRequestViewed", false));
        } catch (JSONException e) {
            Log.w("PAY: PaymentTransactionCountryData fromDBString threw: ", e);
        }
    }

    public JSONObject A0L() {
        JSONArray jSONArray;
        JSONObject A15 = C17880vN.A15();
        boolean z = this.A04;
        if (z) {
            A15.put("messageDeleted", z);
        }
        C22565BDa bDa = this.A00;
        if (bDa != null) {
            A15.put("money", bDa.CPM());
        }
        ADR adr = this.A01;
        if (adr != null) {
            JSONObject A152 = C17880vN.A15();
            try {
                A152.put("offer-id", adr.A02);
                String str = adr.A01;
                if (str != null) {
                    A152.put("offer-claim-id", str);
                }
                String str2 = adr.A03;
                if (str2 != null) {
                    A152.put("parent-transaction-id", str2);
                }
                String str3 = adr.A00;
                if (str3 != null) {
                    A152.put("incentive-payment-id", str3);
                }
            } catch (JSONException e) {
                Log.w("PAY: PaymentIncentiveData toJson threw: ", e);
            }
            A15.put("incentive", A152);
        }
        C20280AEo aEo = this.A02;
        if (aEo != null) {
            AnonymousClass84U A002 = AnonymousClass84U.A00(new C22184Az0(aEo));
            String str4 = aEo.A04;
            if (!(str4 == null || str4.length() == 0)) {
                A002.put("payment_config_id", str4);
            }
            List<ADC> list = aEo.A05;
            if (list != null && !list.isEmpty()) {
                if (!C137476vW.A00(list)) {
                    jSONArray = AnonymousClass8BR.A1A();
                    for (ADC adc : list) {
                        JSONObject A153 = C17880vN.A15();
                        if (adc != null) {
                            AnonymousClass8BY.A0x(adc, jSONArray, A153);
                        }
                    }
                } else {
                    jSONArray = null;
                }
                A002.put("beneficiaries", jSONArray);
            }
            String str5 = aEo.A03;
            if (!(str5 == null || str5.length() == 0)) {
                A002.put("order-type", str5);
            }
            A15.put("order", A002);
        }
        Boolean bool = this.A03;
        if (bool != null) {
            A15.put("isPendingRequestViewed", bool.booleanValue());
        }
        return A15;
    }

    public void A0P(Parcel parcel) {
        this.A04 = C17890vO.A1R(parcel.readByte());
        this.A00 = (C22565BDa) AnonymousClass3Ma.A08(parcel, C22565BDa.class);
        this.A02 = (C20280AEo) AnonymousClass3Ma.A08(parcel, C20280AEo.class);
        this.A03 = (Boolean) parcel.readSerializable();
    }
}
