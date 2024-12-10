package X;

import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.AUd  reason: case insensitive filesystem */
public class C20671AUd implements C22554BCn {
    public C195479tP A00;
    public final AnonymousClass1SV A01;
    public final AnonymousClass1KX A02;
    public final C187309fb A03;
    public final String A04;
    public final String A05;
    public final C24361Ka A06;
    public final C183199Xi A07;

    public /* synthetic */ void Bqr(long j) {
    }

    public void Bpi(String str) {
        C183199Xi r0 = this.A07;
        if (r0 != null) {
            C167228ff.A02(r0.A00, AnonymousClass00R.A06);
        }
    }

    public void Bpq() {
        C183199Xi r0 = this.A07;
        if (r0 != null) {
            C167228ff.A02(r0.A00, AnonymousClass00R.A05);
        }
    }

    public void C3W(String str, Map map) {
        try {
            JSONObject A16 = C17880vN.A16(str);
            if (!A16.has("resume")) {
                return;
            }
            if ("complete".equals(A16.optString("resume"))) {
                this.A00.A05 = A16.optString("url");
                this.A00.A03 = A16.optString("direct_path");
                this.A00.A06 = C181429Ql.A00(A16);
                this.A00.A02 = C179449Hz.COMPLETE;
                return;
            }
            this.A00.A01 = A16.optInt("resume");
            this.A00.A02 = C179449Hz.RESUME;
        } catch (JSONException e) {
            Log.w("mediaupload/MMS upload resume form post failed to parse JSON response; ", e);
            this.A00.A02 = C179449Hz.FAILURE;
        }
    }

    public C20671AUd(C24361Ka r1, AnonymousClass1SV r2, AnonymousClass1KX r3, C183199Xi r4, C187309fb r5, String str, String str2) {
        this.A06 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = str;
        this.A07 = r4;
        this.A03 = r5;
        this.A05 = str2;
    }

    public void Bt0(String str) {
        C17900vP.A0e("httpresumecheck/error = ", str, AnonymousClass000.A10());
    }
}
