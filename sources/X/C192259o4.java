package X;

import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.9o4  reason: invalid class name and case insensitive filesystem */
public class C192259o4 {
    public final C20047A4q A00;
    public final AnonymousClass00H A01;

    public AnonymousClass206 A00(C60012nF r6, String str) {
        try {
            JSONArray jSONArray = new JSONArray(this.A00.A02(r6, str));
            if (jSONArray.getInt(0) == 1) {
                String string = jSONArray.getString(1);
                boolean z = jSONArray.getBoolean(2);
                String string2 = jSONArray.getString(3);
                C22931Dv r0 = AnonymousClass1BI.A00;
                AnonymousClass206 A012 = AnonymousClass1W2.A01(AnonymousClass205.A01(C22931Dv.A01(string2), string, z), this.A01);
                if (A012 != null) {
                    return A012;
                }
                throw new SecurityException("Message not found");
            }
            throw new SecurityException("Decryption failed - version mismatch");
        } catch (AnonymousClass11T | JSONException e) {
            throw new SecurityException("Decryption failed", e);
        }
    }

    public C192259o4(C20047A4q a4q, AnonymousClass00H r2) {
        this.A01 = r2;
        this.A00 = a4q;
    }

    public String A01(AnonymousClass205 r4, C60012nF r5) {
        JSONArray A1A = AnonymousClass8BR.A1A();
        JSONArray put = A1A.put(1).put(r4.A01).put(r4.A02);
        AnonymousClass1BI r0 = r4.A00;
        C17960vV.A07(r0);
        put.put(r0.getRawString());
        return this.A00.A03(r5, A1A.toString());
    }
}
