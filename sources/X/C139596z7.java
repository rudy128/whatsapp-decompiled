package X;

import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6z7  reason: invalid class name and case insensitive filesystem */
public abstract class C139596z7 {
    public boolean A00;
    public final AnonymousClass11E A01;
    public final AnonymousClass11P A02;
    public final C18000vb A03;
    public final AnonymousClass18K A04;
    public final C1607189q A05;
    public final AnonymousClass8AO A06;
    public final C19960A0r A07;
    public final AnonymousClass10I A08;
    public final Map A09 = C17880vN.A13();
    public final AnonymousClass896 A0A;

    public boolean A02(C138516xD r6) {
        try {
            JSONObject A15 = C17880vN.A15();
            A15.put("request_etag", r6.A04);
            A15.put("language", r6.A03);
            A15.put("cache_fetch_time", r6.A00);
            A15.put("last_fetch_attempt_time", r6.A01);
            A15.put("language_attempted_to_fetch", r6.A05);
            this.A0A.CIj(C18070vi.A0H(A15));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public static final void A00(C121906Ly r2, C139596z7 r3, C122596Qz r4) {
        Map map = r3.A09;
        Object obj = map.get(r4);
        if (obj == null) {
            obj = AnonymousClass000.A13();
            map.put(r4, obj);
        }
        ((List) obj).add(r2);
    }

    public C138516xD A01() {
        String BQd = this.A0A.BQd();
        if (BQd == null) {
            return new C138516xD((Integer) null, (String) null, (String) null, (String) null, 0, 0);
        }
        try {
            C138516xD r4 = new C138516xD((Integer) null, (String) null, (String) null, (String) null, 0, 0);
            JSONObject A16 = C17880vN.A16(BQd);
            String optString = A16.optString("request_etag");
            C18070vi.A0b(optString);
            String str = null;
            if (AnonymousClass1YF.A0T(optString)) {
                optString = null;
            }
            r4.A04 = optString;
            r4.A00 = A16.optLong("cache_fetch_time", 0);
            String optString2 = A16.optString("language");
            C18070vi.A0b(optString2);
            if (AnonymousClass1YF.A0T(optString2)) {
                optString2 = null;
            }
            r4.A03 = optString2;
            r4.A01 = A16.optLong("last_fetch_attempt_time", 0);
            String optString3 = A16.optString("language_attempted_to_fetch");
            C18070vi.A0b(optString3);
            if (!AnonymousClass1YF.A0T(optString3)) {
                str = optString3;
            }
            r4.A05 = str;
            return r4;
        } catch (JSONException unused) {
            return new C138516xD((Integer) null, (String) null, (String) null, (String) null, 0, 0);
        }
    }

    public C139596z7(AnonymousClass11E r2, AnonymousClass11P r3, C18000vb r4, AnonymousClass18K r5, C1607189q r6, AnonymousClass896 r7, AnonymousClass8AO r8, C19960A0r a0r, AnonymousClass10I r10) {
        C18070vi.A0w(r3, r10, r5, r4, r8);
        C18070vi.A0q(r2, r7, r6);
        C18070vi.A0d(a0r, 9);
        this.A02 = r3;
        this.A08 = r10;
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = r8;
        this.A01 = r2;
        this.A0A = r7;
        this.A05 = r6;
        this.A07 = a0r;
    }
}
