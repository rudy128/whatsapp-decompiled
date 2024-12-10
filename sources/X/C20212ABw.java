package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ABw  reason: case insensitive filesystem */
public final class C20212ABw implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z;
        ArrayList arrayList;
        C18070vi.A0d(parcel, 0);
        C170318pf r5 = new C170318pf();
        r5.A0P(parcel);
        Class<C1418477e> cls = C1418477e.class;
        r5.A0E = (C1418477e) AnonymousClass3Ma.A08(parcel, cls);
        r5.A0X = parcel.readString();
        r5.A0V = parcel.readString();
        r5.A0T = parcel.readString();
        r5.A0U = parcel.readString();
        Class<String> cls2 = String.class;
        r5.A0C = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), cls2, parcel.readString(), "legalName");
        r5.A0R = parcel.readString();
        r5.A0S = parcel.readString();
        r5.A0B = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), cls2, parcel.readString(), "legalName");
        r5.A05 = parcel.readLong();
        r5.A0K = parcel.readString();
        r5.A04 = parcel.readLong();
        r5.A01 = parcel.readInt();
        r5.A00 = parcel.readInt();
        r5.A02 = parcel.readInt();
        r5.A0Y = parcel.readString();
        r5.A0D = (C1418477e) AnonymousClass3Ma.A08(parcel, cls);
        r5.A0M = parcel.readString();
        r5.A0W = parcel.readString();
        r5.A0O = parcel.readString();
        r5.A0P = parcel.readString();
        String readString = parcel.readString();
        if (readString != null) {
            r5.A0H = new C196219ue(readString);
        }
        int readInt = parcel.readInt();
        boolean z2 = false;
        if (readInt > 0) {
            z = true;
        } else if (readInt == 0) {
            z = false;
        } else {
            z = null;
        }
        r5.A0J = z;
        String readString2 = parcel.readString();
        if (readString2 != null) {
            r5.A0I = new ADS(readString2);
        }
        String readString3 = parcel.readString();
        if (readString3 != null) {
            r5.A0G = new C190159kT(readString3);
        }
        r5.A0N = parcel.readString();
        r5.A08 = (C1418477e) AnonymousClass3Ma.A08(parcel, cls);
        if (parcel.readInt() == 1) {
            z2 = true;
        }
        r5.A0a = z2;
        r5.A09 = (C1418477e) AnonymousClass3Ma.A08(parcel, cls);
        r5.A0A = (C1418477e) AnonymousClass3Ma.A08(parcel, cls);
        r5.A0F = (ADP) AnonymousClass3Ma.A08(parcel, ADP.class);
        String readString4 = parcel.readString();
        if (readString4 != null) {
            try {
                JSONArray jSONArray = new JSONArray(readString4);
                arrayList = AnonymousClass000.A13();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        arrayList.add(new C20244ADc(C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject)));
                    }
                }
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiTransactionOfferData/fromJsonArray threw: ", e);
                arrayList = null;
            }
            r5.A0Z = arrayList;
        }
        Class<C22565BDa> cls3 = C22565BDa.class;
        r5.A07 = (C22565BDa) AnonymousClass3Ma.A08(parcel, cls3);
        r5.A0Q = parcel.readString();
        r5.A0L = parcel.readString();
        r5.A06 = (C22565BDa) AnonymousClass3Ma.A08(parcel, cls3);
        return r5;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C170318pf[i];
    }
}
