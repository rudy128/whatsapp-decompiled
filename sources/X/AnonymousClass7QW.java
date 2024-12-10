package X;

import android.util.Log;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7QW  reason: invalid class name */
public class AnonymousClass7QW implements Runnable {
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public final void run() {
        IllegalStateException illegalStateException;
        long j;
        AnonymousClass721 r9 = (AnonymousClass721) this.A00;
        AnonymousClass01E r0 = (AnonymousClass01E) this.A01;
        String str = this.A06;
        String str2 = this.A07;
        String str3 = this.A08;
        String str4 = this.A09;
        C131806lh r10 = (C131806lh) this.A02;
        C135566sP r11 = (C135566sP) this.A03;
        List<C126966da> list = (List) this.A04;
        C1604788q r1 = (C1604788q) this.A05;
        C18070vi.A0d(r1, 9);
        if (!r11.A02) {
            C18070vi.A0d("WfalLauncherProxy/launchInternal - launch Async Controller", 0);
            C129426hm r12 = (C129426hm) r9.A09.get();
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("AlLoadLatencyLogger/logTriggerFetch for ");
            C18070vi.A0d(C17880vN.A0t(A10, r12.A00), 0);
            r12.A03.markerPoint(r12.A00, r12.A01, "FETCH_ASYNC_ACTION");
            C130536jb r4 = (C130536jb) r9.A06.get();
            boolean A0B = C28281Zt.A0B(r0);
            String A002 = r10.A00();
            AnonymousClass7C3 r21 = new AnonymousClass7C3(r0, r1, r9, str2, str3);
            C28111Yx.A03(str, "App id cannot be null");
            AnonymousClass1GP supportFragmentManager = r0.getSupportFragmentManager();
            C185219cE r92 = r4.A07;
            C25545Chi chi = r4.A01;
            CMC cmc = r4.A06;
            String str5 = str4;
            CXY cxy = new CXY(r0, supportFragmentManager, r4.A00, chi, r4.A05, cmc, r92, str5, (Map) null, A0B);
            if (list != null) {
                for (C126966da r13 : list) {
                    cxy.A00.put(r13.A00, r13.A01);
                }
            }
            r4.A04.A00(r0, r4.A02, cxy);
            r4.A03.A03((ADL) null, new AnonymousClass7OT(r0, r21, r4, cxy, 0), (Boolean) null, str, A002, (String) null);
            return;
        }
        C18070vi.A0d("WfalLauncherProxy/launchInternal - launch SQ", 0);
        C129426hm r5 = (C129426hm) r9.A09.get();
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("AlLoadLatencyLogger/logTriggerFetch for ");
        C18070vi.A0d(C17880vN.A0t(A102, r5.A00), 0);
        r5.A03.markerPoint(r5.A00, r5.A01, "FETCH_SCREEN_QUERY");
        C130286jB r122 = (C130286jB) r9.A07.get();
        boolean A0B2 = C28281Zt.A0B(r0);
        long j2 = r11.A00;
        String A003 = r10.A00();
        AnonymousClass7C3 r15 = new AnonymousClass7C3(r0, r1, r9, str2, str3);
        AnonymousClass1GP supportFragmentManager2 = r0.getSupportFragmentManager();
        C185219cE r112 = r122.A06;
        C25545Chi chi2 = r122.A01;
        CMC cmc2 = r122.A05;
        CXY cxy2 = new CXY(r0, supportFragmentManager2, r122.A00, chi2, r122.A04, cmc2, r112, str4, (Map) null, A0B2);
        if (list != null) {
            for (C126966da r14 : list) {
                cxy2.A00.put(r14.A00, r14.A01);
            }
        }
        r122.A03.A00(r0, r122.A02, cxy2);
        C07 c07 = D8F.A0R;
        C08 c08 = D8F.A0N;
        C06 c06 = D8F.A0Q;
        Integer num = AnonymousClass00R.A0C;
        C0B c0b = C0B.FULL_SHEET;
        D8F d8f = new D8F((D3N) null, (D3N) null, C23774BpJ.A00, (D3E) null, (D3L) null, c08, (D3P) null, C05.SAME_SIZE, c06, c07, c0b, (C123686Vl) null, num, (Integer) null, (Integer) null, AnonymousClass00R.A00, (String) null, 16542, false, false, false, false, false);
        if (C18070vi.A18(str, "com.bloks.www.fx.waffle.reg")) {
            try {
                JSONObject optJSONObject = C17880vN.A16(A003).optJSONObject("server_params");
                if (optJSONObject != null) {
                    j = optJSONObject.optLong("target_account_type", -1);
                } else {
                    j = -1;
                }
                String str6 = "";
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("access_token", str6);
                    if (optString != null) {
                        str6 = optString;
                    }
                }
                if (j == -1 || str6.length() == 0) {
                    Log.e("AccountLinkingScreenQueryLauncher", "account type or access token missing for NTA screen query");
                } else {
                    LinkedHashMap A13 = C17880vN.A13();
                    BitSet bitSet = new BitSet(2);
                    A13.put("access_token", str6);
                    bitSet.set(0);
                    A13.put("account_type", Long.valueOf(j));
                    bitSet.set(1);
                    if (bitSet.nextClearBit(0) >= 2) {
                        LinkedHashMap A132 = C17880vN.A13();
                        Iterator A15 = AnonymousClass000.A15(A13);
                        while (A15.hasNext()) {
                            Map.Entry A16 = AnonymousClass000.A16(A15);
                            if (AnonymousClass6YP.A00.contains(A16.getKey())) {
                                C108985cd.A1R(A132, A16);
                            }
                        }
                        new C25078CWn("com.bloks.www.fx.waffle.reg", (String) null, AnonymousClass1D7.A0F(A13), A132, j2).A00(r0, d8f, new CLX(cxy2.A00()));
                        r15.BJB(true);
                        return;
                    }
                    illegalStateException = AnonymousClass000.A0n("Missing required params");
                    throw illegalStateException;
                }
            } catch (JSONException unused) {
                r15.BJB(false);
                return;
            }
        } else if (C18070vi.A18(str, "com.bloks.www.fx.waffle.main_settings")) {
            JSONObject optJSONObject2 = C17880vN.A16(A003).optJSONObject("server_params");
            String str7 = "";
            if (optJSONObject2 != null) {
                String optString2 = optJSONObject2.optString("flow", str7);
                if (optString2 != null) {
                    str7 = optString2;
                }
            }
            if (str7.length() == 0) {
                Log.e("AccountLinkingScreenQueryLauncher", "entrypoint is missing for AC main settings screen query");
            } else {
                LinkedHashMap A133 = C17880vN.A13();
                BitSet bitSet2 = new BitSet(0);
                if (j2 == 0) {
                    j2 = 2;
                }
                A133.put("entrypoint", str7);
                if (bitSet2.nextClearBit(0) >= 0) {
                    LinkedHashMap A134 = C17880vN.A13();
                    Iterator A152 = AnonymousClass000.A15(A133);
                    while (A152.hasNext()) {
                        Map.Entry A162 = AnonymousClass000.A16(A152);
                        if (AnonymousClass6YQ.A00.contains(A162.getKey())) {
                            C108985cd.A1R(A134, A162);
                        }
                    }
                    new C25078CWn("com.bloks.www.fx.waffle.main_settings", "fx_waffle_main_settings", AnonymousClass1D7.A0F(A133), A134, j2).A00(r0, d8f, new CLX(cxy2.A00()));
                    r15.BJB(true);
                    return;
                }
                illegalStateException = AnonymousClass000.A0n("Missing required params");
                throw illegalStateException;
            }
        } else {
            return;
        }
        r15.BJB(false);
    }

    public AnonymousClass7QW(AnonymousClass01E r1, C1604788q r2, C131806lh r3, AnonymousClass721 r4, C135566sP r5, String str, String str2, String str3, String str4, List list) {
        this.A00 = r4;
        this.A01 = r1;
        this.A06 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A09 = str4;
        this.A02 = r3;
        this.A03 = r5;
        this.A04 = list;
        this.A05 = r2;
    }
}
