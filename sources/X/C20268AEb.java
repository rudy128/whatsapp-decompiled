package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.AEb  reason: case insensitive filesystem */
public final class C20268AEb implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public AnonymousClass9Je A00;
    public AE2 A01;
    public String A02;
    public final int A03;
    public final String A04;
    public final String A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20268AEb(X.AnonymousClass9Je r8, X.AE2 r9, java.lang.String r10) {
        /*
            r7 = this;
            r0 = 1
            r3 = r10
            X.C18070vi.A0d(r10, r0)
            r2 = r9
            if (r9 == 0) goto L_0x000e
            java.lang.String r0 = r9.A02
        L_0x000a:
            r4 = 0
            if (r0 == 0) goto L_0x001f
            goto L_0x0010
        L_0x000e:
            r0 = 0
            goto L_0x000a
        L_0x0010:
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x001b }
            java.lang.String r0 = "description"
            java.lang.String r4 = r1.optString(r0)     // Catch:{ JSONException -> 0x001b }
            goto L_0x001f
        L_0x001b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x001f:
            r6 = 2
            r5 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20268AEb.<init>(X.9Je, X.AE2, java.lang.String):void");
    }

    public final C195059sj A00() {
        String str;
        try {
            AE2 ae2 = this.A01;
            if (ae2 == null || (str = ae2.A02) == null) {
                return null;
            }
            JSONObject jSONObject = C17880vN.A16(str).getJSONObject("wa_flow_response_params");
            C18070vi.A0b(jSONObject);
            return new C195059sj(A6n.A03("flow_id", jSONObject, true), A6n.A03("flow_name", jSONObject, true), A6n.A03("title", jSONObject, true), A6n.A03("response_message", jSONObject, true));
        } catch (JSONException e) {
            Log.e((Throwable) e);
            return null;
        }
    }

    public final boolean A01(C18030ve r4, boolean z) {
        Integer num;
        C18070vi.A0d(r4, 0);
        AE2 ae2 = this.A01;
        if (ae2 == null || (num = ae2.A00) == null || num.intValue() < 3) {
            return false;
        }
        if (!z || C18020vd.A05(C18040vf.A02, r4, 8188)) {
            return true;
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A02);
        AE2 ae2 = this.A01;
        if (ae2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ae2.writeToParcel(parcel, i);
        }
        AnonymousClass9Je r0 = this.A00;
        if (r0 != null) {
            i2 = r0.value;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }

    public C20268AEb(AnonymousClass9Je r1, AE2 ae2, String str, String str2, String str3, int i) {
        this.A05 = str;
        this.A04 = str2;
        this.A03 = i;
        this.A02 = str3;
        this.A01 = ae2;
        this.A00 = r1;
    }
}
