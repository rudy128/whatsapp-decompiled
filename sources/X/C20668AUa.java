package X;

import android.content.SharedPreferences;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.AUa  reason: case insensitive filesystem */
public class C20668AUa implements C22554BCn {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20668AUa(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public /* synthetic */ void Bpi(String str) {
        if (1 - this.A00 == 0) {
            C167228ff r1 = ((C188689hp) this.A01).A06;
            r1.A0D.A04(str);
            C167228ff.A02(r1, AnonymousClass00R.A04);
        }
    }

    public /* synthetic */ void Bpq() {
        if (1 - this.A00 == 0) {
            C167228ff.A02(((C188689hp) this.A01).A06, AnonymousClass00R.A03);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (r3 != 0) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqr(long r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 1: goto L_0x0006;
                case 2: goto L_0x0005;
                case 3: goto L_0x0077;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r0 = r7.A01
            X.9hp r0 = (X.C188689hp) r0
            X.8ff r5 = r0.A06
            long r1 = r5.A0m
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0025
            X.181 r6 = r5.A0B
            long r3 = r5.A0m
            long r1 = r8 - r3
            X.2rU r0 = r5.A0W
            X.2qf r0 = r0.A03
            boolean r3 = r0.A03
            r0 = 0
            if (r3 == 0) goto L_0x0022
            r0 = 4
        L_0x0022:
            r6.A07(r1, r0)
        L_0x0025:
            r5.A0m = r8
            X.9i7 r2 = r5.A0a
            long r0 = r5.A0m
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A09 = r0
            java.util.concurrent.FutureTask r0 = r5.A02
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L_0x0005
            X.2rU r1 = r5.A0W
            boolean r0 = r1 instanceof X.AnonymousClass68R
            if (r0 == 0) goto L_0x0072
            r0 = r1
            X.68R r0 = (X.AnonymousClass68R) r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x006e
            X.2h8 r0 = r1.A02
            java.io.File r1 = r0.A07
            X.C17960vV.A07(r1)
            boolean r0 = r1.exists()
            X.C17960vV.A0D(r0)
            long r3 = r1.length()
        L_0x0058:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0063
        L_0x005e:
            r0 = 100
            long r8 = r8 * r0
            long r1 = r8 / r3
        L_0x0063:
            int r0 = (int) r1
            X.1TJ r1 = r5.A0G
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04(r0)
            return
        L_0x006e:
            r3 = 65536(0x10000, double:3.2379E-319)
            goto L_0x005e
        L_0x0072:
            X.2h8 r0 = r1.A02
            long r3 = r0.A03
            goto L_0x0058
        L_0x0077:
            java.lang.Object r0 = r7.A02
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20668AUa.Bqr(long):void");
    }

    public void Bt0(String str) {
        StringBuilder sb;
        String str2;
        SharedPreferences.Editor putInt;
        switch (this.A00) {
            case 0:
                sb = AnonymousClass000.A10();
                str2 = "app/CrashLogs/uploadServerOkay/error received: ";
                break;
            case 1:
                sb = AnonymousClass000.A10();
                str2 = "mediaupload/error = ";
                break;
            case 2:
                sb = AnonymousClass000.A10();
                str2 = "mediaupload/finalizeupload/error = ";
                break;
            case 3:
                sb = AnonymousClass000.A10();
                str2 = "ProfiloUploadService/Error: ";
                break;
            default:
                C56002gj r4 = (C56002gj) this.A01;
                AnonymousClass00H r3 = r4.A05.A00;
                int A002 = C17890vO.A00(C17900vP.A02(r3), "qpl_failed_upload_count");
                C19830z4 A0K = C17880vN.A0K(r3);
                int i = A002 + 1;
                SharedPreferences.Editor A003 = C19830z4.A00(A0K);
                if (i == 0) {
                    putInt = A003.remove("qpl_failed_upload_count");
                } else {
                    putInt = A003.putInt("qpl_failed_upload_count", i);
                }
                putInt.apply();
                if (i >= 5) {
                    AnonymousClass19A r2 = r4.A04;
                    StringBuilder A11 = AnonymousClass000.A11(str);
                    A11.append(" (");
                    A11.append(i);
                    r2.BKY(AnonymousClass8BU.A0q(A11));
                }
                r4.A00 = false;
                ((ConditionVariable) this.A02).open();
                return;
        }
        C17900vP.A0e(str2, str, sb);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.9hT, java.lang.Object] */
    public void C3W(String str, Map map) {
        switch (this.A00) {
            case 0:
                try {
                    if ("only_exception".equals(C17880vN.A16(str).optString("upload", ""))) {
                        ((C51062Wv) this.A02).A00 = "exception_only";
                        return;
                    } else {
                        ((C51062Wv) this.A02).A00 = "exception_and_logs";
                        return;
                    }
                } catch (JSONException unused) {
                    ((C51062Wv) this.A02).A00 = "exception_and_logs";
                    return;
                }
            case 1:
                C188689hp r3 = (C188689hp) this.A01;
                r3.A00 = new Object();
                if (!((C188579he) this.A02).A0A) {
                    try {
                        JSONObject A16 = C17880vN.A16(str);
                        r3.A00.A08 = A16.optString("url");
                        r3.A00.A03 = A16.optString("handle");
                        r3.A00.A01 = A16.optString("enc_handle");
                        r3.A00.A00 = A16.optString("direct_path");
                        r3.A00.A04 = A16.optString("meta_hmac");
                        r3.A00.A02 = A16.optString("fbid");
                        r3.A00.A07 = A16.optString("ts");
                        r3.A00.A09 = C181429Ql.A00(A16);
                        String optString = A16.optString("thumbnail_info");
                        if (!TextUtils.isEmpty(optString)) {
                            JSONObject A162 = C17880vN.A16(optString);
                            r3.A00.A05 = A162.optString("thumbnail_direct_path");
                            r3.A00.A06 = A162.optString("thumbnail_sha256");
                        }
                    } catch (JSONException e) {
                        Log.e("mediaupload/jsonexception", e);
                    }
                }
                r3.A02 = true;
                return;
            case 2:
                String str2 = null;
                try {
                    JSONObject A163 = C17880vN.A16(str);
                    str2 = A163.optString("url");
                    ((C187319fc) this.A02).A02 = A163.optString("direct_path");
                } catch (JSONException e2) {
                    Log.e("mediaupload/jsonexception", e2);
                }
                ((C187319fc) this.A02).A03 = str2;
                return;
            case 3:
                return;
            default:
                C56002gj r1 = (C56002gj) this.A01;
                r1.A00 = true;
                C17880vN.A1B(C19830z4.A00(C17880vN.A0K(r1.A05.A00)), "qpl_failed_upload_count");
                ((ConditionVariable) this.A02).open();
                return;
        }
    }
}
