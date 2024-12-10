package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ADT implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final AD9 A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
    }

    public ADT(AD9 ad9, String str, String str2, String str3, boolean z) {
        C18070vi.A0j(str, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A00 = ad9;
        this.A03 = str3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0084 A[Catch:{ JSONException -> 0x008a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject A00() {
        /*
            r7 = this;
            org.json.JSONObject r3 = X.C17880vN.A15()
            java.lang.String r1 = "service"
            java.lang.String r0 = r7.A01     // Catch:{ JSONException -> 0x008a }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x008a }
            java.lang.String r1 = "step_up_id"
            java.lang.String r0 = r7.A02     // Catch:{ JSONException -> 0x008a }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x008a }
            java.lang.String r1 = "sticky_service_hub_cta"
            boolean r0 = r7.A04     // Catch:{ JSONException -> 0x008a }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x008a }
            X.AD9 r6 = r7.A00     // Catch:{ JSONException -> 0x008a }
            r1 = 0
            if (r6 == 0) goto L_0x0027
            java.lang.String r0 = r6.A00     // Catch:{ JSONException -> 0x008a }
        L_0x0020:
            java.lang.String r2 = "WEBVIEW"
            boolean r0 = X.C18070vi.A18(r0, r2)     // Catch:{ JSONException -> 0x008a }
            goto L_0x0029
        L_0x0027:
            r0 = r1
            goto L_0x0020
        L_0x0029:
            java.lang.String r4 = "step_up_challenge"
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.payments.stepup.WebViewChallenge"
            X.C18070vi.A0z(r6, r0)     // Catch:{ JSONException -> 0x008a }
            X.90b r6 = (X.C1762490b) r6     // Catch:{ JSONException -> 0x008a }
            org.json.JSONObject r5 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x008a }
            java.lang.String r1 = "challenge_id"
            java.lang.String r0 = r6.A00     // Catch:{ JSONException -> 0x004c }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x004c }
            java.lang.String r0 = "type"
            r5.put(r0, r2)     // Catch:{ JSONException -> 0x004c }
            java.lang.String r1 = "auth_required"
            boolean r0 = r6.A01     // Catch:{ JSONException -> 0x004c }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x004c }
            goto L_0x007d
        L_0x004c:
            r1 = move-exception
            java.lang.String r0 = "PAY: WebViewChallenge toJson threw exception "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ JSONException -> 0x008a }
            goto L_0x007d
        L_0x0053:
            if (r6 == 0) goto L_0x0057
            java.lang.String r1 = r6.A00     // Catch:{ JSONException -> 0x008a }
        L_0x0057:
            java.lang.String r2 = "DOC_UPLOAD"
            boolean r0 = X.C18070vi.A18(r1, r2)     // Catch:{ JSONException -> 0x008a }
            if (r0 == 0) goto L_0x0080
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.payments.stepup.DocumentUploadChallenge"
            X.C18070vi.A0z(r6, r0)     // Catch:{ JSONException -> 0x008a }
            X.90a r6 = (X.C1762390a) r6     // Catch:{ JSONException -> 0x008a }
            org.json.JSONObject r5 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x008a }
            java.lang.String r1 = "challenge_id"
            java.lang.String r0 = r6.A00     // Catch:{ JSONException -> 0x0077 }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x0077 }
            java.lang.String r0 = "type"
            r5.put(r0, r2)     // Catch:{ JSONException -> 0x0077 }
            goto L_0x007d
        L_0x0077:
            r1 = move-exception
            java.lang.String r0 = "PAY: DocumentUploadChallenge toJson threw exception "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ JSONException -> 0x008a }
        L_0x007d:
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x008a }
        L_0x0080:
            java.lang.String r1 = r7.A03     // Catch:{ JSONException -> 0x008a }
            if (r1 == 0) goto L_0x0090
            java.lang.String r0 = "step_up_reason"
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x008a }
            return r3
        L_0x008a:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentStepUpInfo toJson threw exception "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0090:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ADT.A00():org.json.JSONObject");
    }
}
