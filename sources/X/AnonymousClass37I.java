package X;

import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.37I  reason: invalid class name */
public class AnonymousClass37I implements AnonymousClass1O5 {
    public long A00 = 0;
    public final AnonymousClass1OZ A01;
    public final AnonymousClass11P A02;
    public final C24421Kg A03;

    public void BrD(String str) {
        synchronized (this) {
            this.A00 = 0;
        }
        Log.w("routeselector/on delivery failure");
        C17900vP.A0k("routeselector/onmediaroutingrequesterror/code ", AnonymousClass000.A10(), 0);
    }

    public void Bt9(C29621ca r10, String str) {
        synchronized (this) {
            this.A00 = 0;
        }
        Set set = C60942or.A00;
        Iterator A032 = C29621ca.A03(r10, "error");
        while (A032.hasNext()) {
            C29621ca A0a = C17880vN.A0a(A032);
            if (A0a != null) {
                try {
                    int A0A = A0a.A0A("code", 0);
                    if (A0A != 0) {
                        Pair A0E = C17890vO.A0E(Integer.valueOf(A0A), A0a.A0A("backoff", 0));
                        C24421Kg r4 = this.A03;
                        int A0M = AnonymousClass000.A0M(A0E.first);
                        int A0M2 = AnonymousClass000.A0M(A0E.second);
                        C17900vP.A0k("routeselector/onmediaroutingrequesterror/code ", AnonymousClass000.A10(), A0M);
                        if (503 == A0M) {
                            C24391Kd r2 = r4.A08;
                            synchronized (r2) {
                                r2.A00 = 0;
                                Log.i("ChatdMediaThrottleManager/resetThrottle");
                            }
                            Handler handler = r4.A02;
                            C24441Ki r42 = r4.A0A;
                            long A012 = r42.A00.A01();
                            long j = 0;
                            if (A012 != 0) {
                                long j2 = A012 * 1000;
                                j = ((3 * j2) / 4) + Math.abs(r42.A01.nextLong() % (j2 / 2));
                                StringBuilder A10 = AnonymousClass000.A10();
                                A10.append("fibonaccibackoffhandler/sleep/");
                                A10.append(j);
                                C17890vO.A1A(A10, " milliseconds");
                            }
                            handler.sendEmptyMessageDelayed(0, j);
                            return;
                        } else if (507 == A0M && A0M2 > 0) {
                            C24391Kd r6 = r4.A08;
                            long j3 = (long) A0M2;
                            synchronized (r6) {
                                long A013 = AnonymousClass11P.A01(r6.A01) + (Math.min(j3, 10800) * 1000);
                                r6.A00 = A013;
                                C17900vP.A0m("ChatdMediaThrottleManager/setThrottle until ", AnonymousClass000.A10(), A013);
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                } catch (AnonymousClass1UI e) {
                    Log.e("MediaConnFactory/getErrorCodeAndBackoffFromIqResponse CorruptStreamException ", e);
                }
            }
        }
    }

    public static JSONArray A00(Set set) {
        if (set == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object put : set) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    public void C7Z(C29621ca r51, String str) {
        long j;
        synchronized (this) {
            j = this.A00;
            this.A00 = 0;
        }
        C24421Kg r2 = this.A03;
        Set set = C60942or.A00;
        C29621ca A0L = r51.A0L("media_conn");
        String A0Q = A0L.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
        String A0P = A0L.A0P("auth");
        long A0E = A0L.A0E(A0L.A0P("ttl"), "ttl");
        long A0E2 = A0L.A0E(A0L.A0P("auth_ttl"), "auth_ttl");
        long A0D = A0L.A0D("max_buckets", 0);
        int A0A = A0L.A0A("is_new", 1);
        int A0A2 = A0L.A0A("max_auto_download_retry", 3);
        int A0A3 = A0L.A0A("max_manual_retry", 3);
        String A0Q2 = A0L.A0Q("ip_token", (String) null);
        String A0Q3 = A0L.A0Q("set_ip_token", (String) null);
        Boolean bool = null;
        if (A0Q3 != null) {
            try {
                bool = Boolean.valueOf(AnonymousClass000.A1O(Integer.parseInt(A0Q3)));
            } catch (NumberFormatException unused) {
            }
        }
        C29621ca[] r4 = A0L.A02;
        ArrayList A13 = AnonymousClass000.A13();
        if (r4 != null) {
            for (C29621ca r0 : r4) {
                if ("host".equals(r0.A00)) {
                    String A0P2 = r0.A0P("hostname");
                    String A0Q4 = r0.A0Q("ip4", (String) null);
                    String A0Q5 = r0.A0Q("ip6", (String) null);
                    String A0Q6 = r0.A0Q("class", (String) null);
                    String A0Q7 = r0.A0Q("fallback_hostname", (String) null);
                    String A0Q8 = r0.A0Q("fallback_ip4", (String) null);
                    String A0Q9 = r0.A0Q("fallback_ip6", (String) null);
                    String A0Q10 = r0.A0Q("fallback_class", (String) null);
                    C29621ca A0K = r0.A0K("upload");
                    Set set2 = C60942or.A00;
                    A13.add(new C58142kD(A0P2, A0Q4, A0Q5, A0Q6, A0Q7, A0Q8, A0Q9, A0Q10, r0.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null), C60942or.A00(A0K, set2), C60942or.A00(r0.A0K("download"), set2), C60942or.A00(r0.A0K("download_buckets"), (Set) null), "true".equals(r0.A0Q("force_ip", (String) null))));
                }
            }
        }
        C59912n5 r31 = new C59912n5(bool, A0P, A0Q, A0Q2, A13, A0A2, A0A3, A0E, A0E2, A0D, j, AnonymousClass000.A1T(A0A, 1));
        C24391Kd r5 = r2.A08;
        synchronized (r5) {
            r5.A00 = 0;
            Log.i("ChatdMediaThrottleManager/resetThrottle");
        }
        C24421Kg.A08(r2, r31);
        if (C18020vd.A05(C18040vf.A02, r2.A06, 149)) {
            AnonymousClass11P r7 = r2.A05;
            C59912n5 A0B = r2.A0B();
            String str2 = null;
            if (A0B != null) {
                try {
                    JSONObject A15 = C17880vN.A15();
                    A15.put("auth_token", A0B.A09);
                    A15.put("conn_ttl", A0B.A05);
                    A15.put("auth_ttl", A0B.A03);
                    A15.put("max_buckets", A0B.A06);
                    List<C58142kD> list = A0B.A0C;
                    JSONArray jSONArray = new JSONArray();
                    for (C58142kD r13 : list) {
                        JSONObject A152 = C17880vN.A15();
                        A152.put("hostname", r13.A04);
                        A152.put("ip4", r13.A05);
                        A152.put("ip6", r13.A06);
                        A152.put("class", r13.A07);
                        A152.put("fallback_hostname", r13.A00);
                        A152.put("fallback_ip4", r13.A01);
                        A152.put("fallback_ip6", r13.A02);
                        A152.put("fallback_class", r13.A03);
                        A152.put("upload", A00(r13.A0B));
                        A152.put("download", A00(r13.A09));
                        A152.put("download_buckets", A00(r13.A0A));
                        A152.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r13.A08);
                        A152.put("force_ip", r13.A0C);
                        jSONArray.put(A152);
                    }
                    A15.put("hosts", jSONArray);
                    A15.put("send_time_abs_ms", (A0B.A07 - SystemClock.elapsedRealtime()) + AnonymousClass11P.A01(r7));
                    A15.put("last_id", A0B.A0B);
                    A15.put("is_new", A0B.A0D);
                    A15.put("max_autodownload_retry", A0B.A00);
                    A15.put("max_manual_retry", A0B.A01);
                    A15.put("ip_token", A0B.A0A);
                    A15.put("set_ip_token", A0B.A08);
                    str2 = A15.toString();
                } catch (JSONException e) {
                    Log.e("routingresponse/can't serialize json", e);
                }
            }
            C17880vN.A1E(r2.A09.A05("route_selector_prefs").edit(), "media_conn", str2);
        }
    }

    public AnonymousClass37I(AnonymousClass11P r3, AnonymousClass1OZ r4, C24421Kg r5) {
        this.A02 = r3;
        this.A01 = r4;
        this.A03 = r5;
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
