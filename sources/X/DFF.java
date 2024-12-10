package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public class DFF implements AnonymousClass0sQ {
    public final C24936CQj A00;
    public final Boolean A01;

    public static void A00(DOZ doz, DFF dff, String str, Throwable th, boolean z) {
        String str2;
        String str3;
        String str4;
        C24936CQj cQj = dff.A00;
        if (cQj != null) {
            if (doz == null) {
                str2 = null;
            } else {
                str2 = (String) DOZ.A00(doz, 2131428171);
            }
            if (th != null) {
                str3 = th.toString();
            } else {
                str3 = "Undefined error";
            }
            if (str2 == null) {
                str2 = null;
            }
            boolean A16 = C18070vi.A16(str, str3);
            C23836Bqt bqt = new C23836Bqt();
            bqt.A03 = "";
            bqt.A00 = C17890vO.A0L();
            StringBuilder A11 = AnonymousClass000.A11(str);
            A11.append(" (cause: ");
            bqt.A04 = C17900vP.A0B(str3, A11);
            bqt.A01 = ((AnonymousClass16T) cQj.A02.get()).A00;
            if (str2 != null) {
                try {
                    JSONObject A162 = C17880vN.A16(C17880vN.A16(str2).getString("callsite"));
                    bqt.A02 = A162.optString("feature", "unknown");
                    bqt.A05 = A162.optString("oncall", "unknown");
                    bqt.A06 = A162.optString("product", "unknown");
                } catch (JSONException e) {
                    AnonymousClass190 r2 = cQj.A00;
                    if (r2 != null) {
                        r2.A0G("wa_bloks_mins_crash_logs", "Failed to parse loggingID", A16);
                        Log.w("WaCrashLogsImpl/exception happened. ", e);
                    } else {
                        str4 = "crashLogs";
                    }
                }
            }
            AnonymousClass18K r0 = cQj.A01;
            if (r0 != null) {
                r0.CC4(bqt);
                return;
            }
            str4 = "wamRuntime";
            C18070vi.A11(str4);
            throw null;
        }
    }

    public void CFK(AnonymousClass0CT r3, String str, String str2, Throwable th) {
        A00((DOZ) null, this, str2, th, false);
    }

    public DFF(C24936CQj cQj, Boolean bool) {
        this.A00 = cQj;
        this.A01 = bool;
    }
}
