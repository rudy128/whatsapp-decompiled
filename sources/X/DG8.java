package X;

import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class DG8 implements C28511E4v {
    public final C25160CaB A00;
    public final E52 A01;

    public /* bridge */ /* synthetic */ void C09(C25649Cjf cjf, C24473C5o c5o, File file) {
        String str;
        JSONObject jSONObject;
        long j;
        AnonymousClass8Qu r9 = (AnonymousClass8Qu) c5o;
        File file2 = file;
        if (r9.A03) {
            try {
                str = file.getCanonicalPath();
            } catch (IOException unused) {
                str = file.getAbsolutePath();
            }
            C25160CaB caB = this.A00;
            String string = caB.A00.getString(C17880vN.A0t(AnonymousClass000.A11(caB.A01), str.hashCode()), (String) null);
            if (string == null) {
                string = "{}";
            }
            try {
                jSONObject = C17880vN.A16(string);
            } catch (JSONException unused2) {
                jSONObject = C17880vN.A15();
            }
            long optLong = jSONObject.optLong("last_measured_size", -1);
            E52 e52 = this.A01;
            if (((C28558E7j) e52).BfP()) {
                j = r9.A01;
            } else {
                j = r9.A00;
            }
            if (optLong > j) {
                e52.BIM(file);
                file.mkdirs();
            }
        }
        ((E50) this.A01).BRR(AnonymousClass00R.A00).execute(new C21368Aix(this, file2, cjf, r9, 8));
    }

    public DG8(E52 e52) {
        this.A01 = e52;
        this.A00 = ((C28513E4x) e52).BZj("max_size");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C22918BVg r8, java.io.File r9, long r10) {
        /*
            r7 = this;
            java.lang.String r4 = r9.getCanonicalPath()     // Catch:{ IOException -> 0x0005 }
            goto L_0x0009
        L_0x0005:
            java.lang.String r4 = r9.getAbsolutePath()     // Catch:{ JSONException -> 0x004f }
        L_0x0009:
            org.json.JSONObject r3 = r8.CPJ()     // Catch:{ JSONException -> 0x004f }
            X.C5o r0 = r8.A00     // Catch:{ JSONException -> 0x004f }
            X.8Qu r0 = (X.AnonymousClass8Qu) r0     // Catch:{ JSONException -> 0x004f }
            boolean r0 = r0.A03     // Catch:{ JSONException -> 0x004f }
            if (r0 == 0) goto L_0x004a
            r1 = 0
            java.lang.String r5 = "last_measured_size"
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0047
            X.CaB r6 = r7.A00     // Catch:{ JSONException -> 0x004f }
            java.lang.String r0 = r6.A01     // Catch:{ JSONException -> 0x004f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)     // Catch:{ JSONException -> 0x004f }
            int r0 = r4.hashCode()     // Catch:{ JSONException -> 0x004f }
            java.lang.String r2 = X.C17880vN.A0t(r1, r0)     // Catch:{ JSONException -> 0x004f }
            android.content.SharedPreferences r1 = r6.A00     // Catch:{ JSONException -> 0x004f }
            r0 = 0
            java.lang.String r0 = r1.getString(r2, r0)     // Catch:{ JSONException -> 0x004f }
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "{}"
        L_0x0038:
            org.json.JSONObject r2 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x003d }
            goto L_0x0041
        L_0x003d:
            org.json.JSONObject r2 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x004f }
        L_0x0041:
            r0 = -1
            long r10 = r2.optLong(r5, r0)     // Catch:{ JSONException -> 0x004f }
        L_0x0047:
            r3.put(r5, r10)     // Catch:{ JSONException -> 0x004f }
        L_0x004a:
            X.CaB r0 = r7.A00     // Catch:{ JSONException -> 0x004f }
            r0.A02(r4, r3)     // Catch:{ JSONException -> 0x004f }
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DG8.A00(X.BVg, java.io.File, long):void");
    }
}
