package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.A2y  reason: case insensitive filesystem */
public final class C20008A2y {
    public Set A00 = C17880vN.A14();
    public final C18030ve A01;
    public final AXS A02;

    public final synchronized AEC A01() {
        Object obj;
        Iterator it = this.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            AEC aec = (AEC) obj;
            if (C18070vi.A18(aec.A03, "numeric_id") && C18070vi.A18(aec.A02, "available")) {
                break;
            }
        }
        return (AEC) obj;
    }

    public final synchronized ArrayList A02() {
        ArrayList A13;
        Set set = this.A00;
        A13 = AnonymousClass000.A13();
        for (Object next : set) {
            String str = ((AEC) next).A02;
            if (!C18070vi.A18(str, "deregistered") && !C18070vi.A18(str, "blocked")) {
                A13.add(next);
            }
        }
        return C29431cG.A0m(A13);
    }

    public synchronized void A03(AEC aec) {
        Object obj;
        Set set = this.A00;
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C18070vi.A18(((AEC) obj).A01, aec.A01)) {
                break;
            }
        }
        AEC aec2 = (AEC) obj;
        if (aec2 != null && A00(this, C41841x9.A05(aec, C41841x9.A07(aec2, set)))) {
            set.remove(aec2);
            set.add(aec);
        }
    }

    public final synchronized void A04(AEC aec) {
        Object obj;
        synchronized (this) {
            C18070vi.A0d(aec, 0);
            Set set = this.A00;
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C18070vi.A18(((AEC) obj).A01, aec.A01)) {
                    break;
                }
            }
            if (((AEC) obj) != null) {
                A03(aec);
            } else if (!C18070vi.A18(aec.A03, "mobile_number") || !A07()) {
                if (A02().size() != C18020vd.A00(C18040vf.A02, this.A01, 3114) + 1 && !set.contains(aec) && A00(this, C41841x9.A05(aec, set))) {
                    set.add(aec);
                }
            }
        }
    }

    public final synchronized boolean A06() {
        boolean z;
        int i;
        int A002 = C18020vd.A00(C18040vf.A02, this.A01, 3114);
        ArrayList A022 = A02();
        z = false;
        if (!(A022 instanceof Collection) || !A022.isEmpty()) {
            Iterator it = A022.iterator();
            i = 0;
            while (it.hasNext()) {
                if (C18070vi.A18(((AEC) it.next()).A03, "numeric_id") && (i = i + 1) < 0) {
                    AnonymousClass1ZU.A0A();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        if (A002 > i) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r2 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A07() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r0 = r4.A02()     // Catch:{ all -> 0x0026 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0026 }
        L_0x0009:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0023
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0026 }
            r0 = r2
            X.AEC r0 = (X.AEC) r0     // Catch:{ all -> 0x0026 }
            java.lang.String r1 = r0.A03     // Catch:{ all -> 0x0026 }
            java.lang.String r0 = "mobile_number"
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0009
            r0 = 1
            if (r2 != 0) goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            monitor-exit(r4)
            return r0
        L_0x0026:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20008A2y.A07():boolean");
    }

    public final boolean A05() {
        String A0v = C108955ca.A0v(this.A01, 2965);
        if (A0v.length() != 0) {
            List A0s = C108985cd.A0s(A0v, 1);
            String A0G = this.A02.A0G();
            if (!(A0s == null || A0G == null)) {
                return A0s.contains(A0G);
            }
        }
        return false;
    }

    public C20008A2y(C18030ve r10, AXS axs) {
        String A0r;
        C18070vi.A0j(axs, r10);
        this.A02 = axs;
        this.A01 = r10;
        synchronized (axs) {
            A0r = C17880vN.A0r(axs.A01.A03(), "payments_upi_aliases");
        }
        if (A0r != null && A0r.length() != 0) {
            JSONArray jSONArray = new JSONArray(A0r);
            Iterator it = C28851b7.A08(0, jSONArray.length()).iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = jSONArray.getJSONObject(((AnonymousClass20T) it).A00());
                this.A00.add(new AEC(AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, jSONObject.getString("alias"), "upiAlias"), C18070vi.A0J("aliasType", jSONObject), C18070vi.A0J("aliasId", jSONObject), C18070vi.A0J("aliasStatus", jSONObject)));
            }
        }
    }

    public static final boolean A00(C20008A2y a2y, Set set) {
        JSONArray A1A = AnonymousClass8BR.A1A();
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AEC aec = (AEC) it.next();
                JSONObject A15 = C17880vN.A15();
                A15.put("alias", aec.A00.A00);
                A15.put("aliasType", aec.A03);
                A15.put("aliasId", aec.A01);
                A15.put("aliasStatus", aec.A02);
                A1A.put(A15);
            }
            AXS axs = a2y.A02;
            synchronized (axs) {
                AnonymousClass1QD r0 = axs.A01;
                C17880vN.A1E(AnonymousClass8BU.A07(r0), "payments_upi_aliases", A1A.toString());
            }
            return true;
        } catch (JSONException unused) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs setAlias threw: an exception ");
            return false;
        }
    }
}
