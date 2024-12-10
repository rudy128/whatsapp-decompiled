package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Kg  reason: invalid class name and case insensitive filesystem */
public class C24421Kg extends AnonymousClass10T implements C24411Kf {
    public C59912n5 A00;
    public final long A01;
    public final Handler A02 = new C24471Kl(Looper.getMainLooper(), this);
    public final AnonymousClass190 A03;
    public final C23651Hc A04;
    public final AnonymousClass11P A05;
    public final C18030ve A06;
    public final AnonymousClass1KX A07;
    public final C24391Kd A08;
    public final C18010vc A09;
    public final C24441Ki A0A;
    public final C24381Kc A0B;
    public final AnonymousClass11A A0C;
    public final AnonymousClass10I A0D;
    public final C220218h A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final Object A0H = new Object();
    public final Object A0I = new Object();
    public final AtomicBoolean A0J = new AtomicBoolean(false);
    public volatile boolean A0K;
    public volatile AnonymousClass37I A0L;
    public volatile boolean A0M;

    public static C190089kM A00(C24421Kg r16, String str, String str2, String str3, int i, boolean z) {
        C24421Kg r7 = r16;
        C59912n5 A0B2 = r7.A0B();
        AnonymousClass11P r3 = r7.A05;
        C18030ve r4 = r7.A06;
        C220218h r9 = r7.A0E;
        return new C190089kM(C696437z.A01(r7.A03, r7.A04, r3, r4, r7.A07, (C88214Yt) r7.A0G.get(), r7, A0B2, r9, str, str2, str3, i, 0, r7.A01, false, z));
    }

    private synchronized AnonymousClass37I A01() {
        if (this.A0L == null) {
            this.A0L = new AnonymousClass37I(this.A05, (AnonymousClass1OZ) this.A0F.get(), this);
        }
        return this.A0L;
    }

    public static synchronized void A07(C24421Kg r3) {
        synchronized (r3) {
            if (!C18020vd.A05(C18040vf.A02, r3.A06, 149) || r3.A0M) {
                if (r3.A0K) {
                    r3.A0D.CGF(new C146767Qn(r3, 46));
                }
            }
        }
    }

    public void BlT() {
        this.A0M = true;
        if (C18020vd.A05(C18040vf.A02, this.A06, 149)) {
            A07(this);
        }
    }

    public void onAppBackgrounded() {
        this.A0M = false;
    }

    public C24421Kg(AnonymousClass190 r6, C23651Hc r7, AnonymousClass11P r8, C18030ve r9, AnonymousClass1KX r10, C24391Kd r11, C18010vc r12, C24381Kc r13, AnonymousClass11A r14, AnonymousClass10I r15, C220218h r16, AnonymousClass00H r17, AnonymousClass00H r18) {
        C24441Ki r4 = new C24441Ki();
        this.A05 = r8;
        this.A06 = r9;
        this.A0E = r16;
        this.A03 = r6;
        this.A0B = r13;
        this.A0D = r15;
        this.A0F = r17;
        this.A04 = r7;
        this.A0C = r14;
        this.A0G = r18;
        this.A07 = r10;
        this.A09 = r12;
        this.A08 = r11;
        this.A0A = r4;
        this.A01 = 1000;
    }

    public static HashSet A03(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.getString(i));
        }
        return hashSet;
    }

    private void A04() {
        Log.i("routeselector/setuprouterequesttimer");
        C59912n5 A0B2 = A0B();
        if (A0B2 != null) {
            Handler handler = this.A02;
            handler.removeMessages(0);
            long elapsedRealtime = (A0B2.A02 - SystemClock.elapsedRealtime()) - 60000;
            StringBuilder sb = new StringBuilder();
            sb.append("routeselector/settimerorupdateroutes/creating timer task with delay ");
            sb.append(elapsedRealtime);
            Log.i(sb.toString());
            handler.sendEmptyMessageDelayed(0, elapsedRealtime);
        }
    }

    public static void A05(C24421Kg r14) {
        boolean z;
        String str;
        C24391Kd r6 = r14.A08;
        synchronized (r6) {
            z = false;
            if (AnonymousClass11P.A01(r6.A01) <= r6.A00) {
                z = true;
            }
        }
        if (z) {
            Log.i("routeselector/requestupdatedroutinginfo throttled");
            return;
        }
        AnonymousClass37I A012 = r14.A01();
        C59912n5 A0B2 = r14.A0B();
        if (A0B2 == null) {
            str = null;
        } else {
            str = A0B2.A0B;
        }
        synchronized (A012) {
            Log.i("routeselector/requestupdatedroutinginfo");
            if (A012.A00 == 0) {
                AnonymousClass1OZ r8 = A012.A01;
                String A0B3 = r8.A0B();
                if (r8.A0N(A012, new C29621ca(new C29621ca("media_conn", str != null ? new AnonymousClass1MD[]{new AnonymousClass1MD("last_id", str)} : null), "iq", new AnonymousClass1MD[]{new AnonymousClass1MD((Jid) C173438v4.A00, "to"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B3), new AnonymousClass1MD("xmlns", "w:m"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set")}), A0B3, 124, 32000)) {
                    A012.A00 = SystemClock.elapsedRealtime();
                } else {
                    Log.i("app/sendgetmediaroutinginfo not sent");
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("routeselector/requestupdatedroutinginfo/not sending request; inFlightMediaRoutingRequestTime=");
            sb.append(A012.A00);
            Log.w(sb.toString());
        }
    }

    public static void A06(C24421Kg r38) {
        Boolean bool;
        C24421Kg r2 = r38;
        if (C18020vd.A05(C18040vf.A02, r2.A06, 149) && r2.A0J.compareAndSet(false, true)) {
            C59912n5 r4 = null;
            String string = r2.A09.A05("route_selector_prefs").getString("media_conn", (String) null);
            AnonymousClass11P r9 = r2.A05;
            if (string != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    String string2 = jSONObject.getString("auth_token");
                    long j = jSONObject.getLong("conn_ttl");
                    long j2 = jSONObject.getLong("auth_ttl");
                    long j3 = jSONObject.getLong("max_buckets");
                    JSONArray jSONArray = jSONObject.getJSONArray("hosts");
                    int length = jSONArray.length();
                    ArrayList arrayList = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        arrayList.add(new C58142kD(jSONObject2.getString("hostname"), A02("ip4", jSONObject2), A02("ip6", jSONObject2), A02("class", jSONObject2), A02("fallback_hostname", jSONObject2), A02("fallback_ip4", jSONObject2), A02("fallback_ip6", jSONObject2), A02("fallback_class", jSONObject2), A02(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, jSONObject2), A03(jSONObject2.optJSONArray("upload")), A03(jSONObject2.optJSONArray("download")), A03(jSONObject2.optJSONArray("download_buckets")), jSONObject2.optBoolean("force_ip")));
                    }
                    long j4 = (jSONObject.getLong("send_time_abs_ms") - AnonymousClass11P.A01(r9)) + SystemClock.elapsedRealtime();
                    String A022 = A02("last_id", jSONObject);
                    boolean z = jSONObject.getBoolean("is_new");
                    int i2 = jSONObject.getInt("max_autodownload_retry");
                    int i3 = jSONObject.getInt("max_manual_retry");
                    String optString = jSONObject.optString("ip_token", (String) null);
                    if (jSONObject.has("set_ip_token")) {
                        bool = Boolean.valueOf(jSONObject.optBoolean("set_ip_token"));
                    } else {
                        bool = null;
                    }
                    r4 = new C59912n5(bool, string2, A022, optString, arrayList, i2, i3, j, j2, j3, j4, z);
                } catch (JSONException e) {
                    Log.e("routingresponse/can't parse json", e);
                }
            }
            synchronized (r2.A0H) {
                if (r2.A00 == null && r4 != null && r4.A02 > SystemClock.elapsedRealtime()) {
                    A08(r2, r4);
                }
            }
        }
    }

    public static void A08(C24421Kg r30, C59912n5 r31) {
        StringBuilder sb = new StringBuilder();
        sb.append("routeselector/setroutinginfo/got a RoutingResponse with ");
        C59912n5 r9 = r31;
        sb.append(r9.A0C.size());
        sb.append(" route classes");
        Log.i(sb.toString());
        C24421Kg r14 = r30;
        r14.A0A.A00.A02();
        synchronized (r14.A0H) {
            C59912n5 r1 = r14.A00;
            if (r1 == null || r9.A0D) {
                r14.A00 = r9;
                r14.notifyAllObservers(new C20723AWd(r9, 28));
            } else {
                List list = r1.A0C;
                long j = r9.A05;
                long j2 = r9.A03;
                long j3 = r9.A06;
                long j4 = r9.A07;
                String str = r9.A0B;
                int i = r9.A00;
                int i2 = r9.A01;
                long j5 = j2;
                int i3 = i2;
                long j6 = j;
                String str2 = r9.A0A;
                List list2 = list;
                int i4 = i;
                Boolean bool = r9.A08;
                String str3 = str;
                r14.A00 = new C59912n5(bool, r9.A09, str3, str2, list2, i4, i3, j6, j5, j3, j4, false);
                Log.i("routeselector/setroutinginfo/previous hosts retained");
            }
        }
        Object obj = r14.A0I;
        synchronized (obj) {
            obj.notifyAll();
        }
        r14.A04();
    }

    public static boolean A09(C24421Kg r7) {
        Log.i("routeselector/requestroutinginfoifnulloralmostexpired");
        A06(r7);
        C59912n5 A0B2 = r7.A0B();
        if (A0B2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("routeselector/isroutinginfonulloralmostexpired/expiring at ");
            long j = A0B2.A04;
            sb.append(j);
            sb.append(" (");
            sb.append(j - SystemClock.elapsedRealtime());
            sb.append("ms from now)");
            Log.i(sb.toString());
            if (j > SystemClock.elapsedRealtime() + 120000) {
                if (r7.A02.hasMessages(0)) {
                    return false;
                }
                r7.A04();
                return false;
            }
        }
        A05(r7);
        return true;
    }

    public C190089kM A0A(C1602387r r22, int i) {
        BCG r4;
        String str;
        Boolean bool;
        C1602387r r2 = r22;
        C17960vV.A0D(true);
        C59912n5 A0B2 = A0B();
        if (r2 instanceof C696137w) {
            String str2 = ((C696137w) r2).A00;
            C18030ve r42 = this.A06;
            String str3 = null;
            if (!(A0B2 == null || (str = A0B2.A0A) == null || !C18020vd.A05(C18040vf.A02, r42, 12149) || (bool = A0B2.A08) == null || !bool.booleanValue())) {
                str3 = str;
            }
            r4 = new C21049Adf(this.A01, str2, str3);
        } else {
            int i2 = i;
            if (r2 instanceof C696037v) {
                C696037v r23 = (C696037v) r2;
                AnonymousClass11P r5 = this.A05;
                C18030ve r6 = this.A06;
                C220218h r11 = this.A0E;
                AnonymousClass1KX r7 = this.A07;
                long j = this.A01;
                r4 = new C696337y(C696437z.A01(this.A03, this.A04, r5, r6, r7, (C88214Yt) this.A0G.get(), this, A0B2, r11, r23.A01, (String) null, (String) null, i2, 0, j, false, false), r23.A00, j);
            } else if (r2 instanceof AnonymousClass2NY) {
                AnonymousClass2NY r24 = (AnonymousClass2NY) r2;
                return A00(this, r24.A00, r24.A01, r24.A01, i2, false);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown url generator type: ");
                sb.append(r2);
                throw new AssertionError(sb.toString());
            }
        }
        return new C190089kM(r4);
    }

    public C59912n5 A0B() {
        C59912n5 r0;
        synchronized (this.A0H) {
            r0 = this.A00;
        }
        return r0;
    }

    public C696437z A0C(String str, String str2, String str3, int i, int i2) {
        C59912n5 A0B2 = A0B();
        AnonymousClass11P r3 = this.A05;
        C18030ve r4 = this.A06;
        C220218h r9 = this.A0E;
        return C696437z.A01(this.A03, this.A04, r3, r4, this.A07, (C88214Yt) this.A0G.get(), this, A0B2, r9, str, str2, str3, i, i2, this.A01, false, false);
    }

    public void A0D() {
        boolean z;
        Log.i("routeselector/requestroutesandwaitforauth");
        if (A09(this)) {
            C59912n5 r0 = this.A00;
            if (r0 == null || r0.A02 <= SystemClock.elapsedRealtime()) {
                Log.i("routeselector/requestroutesandwaitforauth/waiting for response");
                C17960vV.A01();
                long uptimeMillis = SystemClock.uptimeMillis();
                while (true) {
                    C59912n5 r02 = this.A00;
                    if (r02 == null || r02.A02 <= SystemClock.elapsedRealtime()) {
                        AnonymousClass37I A012 = A01();
                        synchronized (A012) {
                            z = false;
                            if (A012.A00 > 0) {
                                z = true;
                            }
                        }
                        if (!z) {
                            Log.w("routeselector/waitforroutingresponse/giving up because no request in flight");
                            return;
                        }
                        Object obj = this.A0I;
                        synchronized (obj) {
                            try {
                                obj.wait(1000);
                            } catch (InterruptedException e) {
                                Log.w("routeselector/waitforroutingresponse/interrupted while waiting on route selection", e);
                            }
                            C59912n5 r03 = this.A00;
                            if (r03 == null || r03.A02 <= SystemClock.elapsedRealtime()) {
                                Log.w("routeselector/waitforroutingresponse/routing response still not available");
                            }
                            if (20000 + uptimeMillis < SystemClock.uptimeMillis()) {
                                Log.w("routeselector/waitforroutingresponse/waited too long for routing response! Give up");
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                while (true) {
                }
            }
        }
    }

    public void A0E(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("routeselector/onmediatransfererrororresponsecode/code ");
        sb.append(i);
        Log.i(sb.toString());
        if (i == 401 || i == 403) {
            A05(this);
        }
    }

    public static String A02(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }
}
