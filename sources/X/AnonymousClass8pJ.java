package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8pJ  reason: invalid class name */
public final class AnonymousClass8pJ extends AnonymousClass8pV {
    public static final Parcelable.Creator CREATOR = new Object();

    public void A07(List list) {
        throw AnonymousClass04E.createAndThrow();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03.size());
        Iterator A0i = C17890vO.A0i(this.A03);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            parcel.writeString(C17880vN.A0x(A16));
            parcel.writeString(((ADJ) A16.getValue()).A00);
        }
    }

    public void A05(AnonymousClass1KI r6, C29621ca r7, int i) {
        if (r7 == null) {
            AnonymousClass8BS.A1F("BrazilCustomPaymentMethodData", "fromNetwork: the customPaymentNode is null");
            return;
        }
        try {
            this.A00 = r7.A0P("country");
            this.A01 = r7.A0P("credential-id");
            this.A02 = r7.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            C29621ca A0K = r7.A0K("metadata_info");
            if (A0K != null) {
                this.A03 = C17880vN.A11();
                Iterator A03 = C29621ca.A03(A0K, "metadata");
                while (A03.hasNext()) {
                    C29621ca A0a = C17880vN.A0a(A03);
                    AnonymousClass8BT.A1R(A0a.A0P("key"), A0a.A0P("value"), this.A03);
                }
            }
        } catch (AnonymousClass1UI e) {
            AnonymousClass8BS.A1F("BrazilCustomPaymentMethodData", C17900vP.A0C("Error creating an instance of BrazilCustomPaymentMethodData. Exception = ", AnonymousClass000.A10(), e));
        }
    }

    public void A06(String str) {
        if (str != null) {
            try {
                JSONObject A16 = C17880vN.A16(str);
                try {
                    Iterator<String> keys = A16.keys();
                    while (keys.hasNext()) {
                        String A0v = C17880vN.A0v(keys);
                        if ("method_type".equalsIgnoreCase(A0v)) {
                            this.A02 = C18070vi.A0J(A0v, A16);
                        }
                        HashMap hashMap = this.A03;
                        C18070vi.A0b(A0v);
                        AnonymousClass8BT.A1R(A0v, C18070vi.A0J(A0v, A16), hashMap);
                    }
                } catch (JSONException e) {
                    AnonymousClass8BS.A1F("BrazilCustomPaymentMethodData", AnonymousClass001.A1E(e, "fromJSONObject threw: ", AnonymousClass000.A10()));
                }
            } catch (JSONException e2) {
                C17900vP.A0X(e2, "BrazilCustomPaymentMethodData fromDBString threw: ", AnonymousClass000.A10());
            }
        }
    }

    public AnonymousClass8pJ() {
        HashMap A11 = C17880vN.A11();
        this.A00 = "BR";
        this.A01 = "";
        this.A02 = "";
        this.A03 = A11;
    }

    public String A04() {
        try {
            JSONObject A15 = C17880vN.A15();
            try {
                Iterator A0i = C17890vO.A0i(this.A03);
                while (A0i.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A0i);
                    A15.put(C17880vN.A0x(A16), ((ADJ) A16.getValue()).A00);
                }
                String str = this.A02;
                if (str.length() != 0) {
                    A15.put("method_type", str);
                }
            } catch (Exception e) {
                AnonymousClass8BS.A1F("BrazilCustomPaymentMethodData", AnonymousClass001.A1E(e, "toJSONObject threw an exception : ", AnonymousClass000.A10()));
            }
            return A15.toString();
        } catch (Exception e2) {
            C17900vP.A0X(e2, "BrazilCustomPaymentMethodData: toDBString threw ", AnonymousClass000.A10());
            return null;
        }
    }
}
