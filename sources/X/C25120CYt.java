package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.CYt  reason: case insensitive filesystem */
public final class C25120CYt {
    public JSONArray A00 = AnonymousClass8BR.A1A();
    public final long A01;
    public final C3P A02;
    public final C25393Ceu A03 = C25393Ceu.A00;

    public final synchronized void A00(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        this.A00.put(jSONObject);
    }

    public synchronized String toString() {
        return C18070vi.A0H(this.A00);
    }

    public C25120CYt(C3P c3p) {
        this.A02 = c3p;
        this.A01 = System.currentTimeMillis();
    }
}
