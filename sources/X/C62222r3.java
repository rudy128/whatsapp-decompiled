package X;

import java.math.BigDecimal;
import org.json.JSONObject;

/* renamed from: X.2r3  reason: invalid class name and case insensitive filesystem */
public final class C62222r3 {
    public int A00;
    public long A01;
    public AnonymousClass1KJ A02;

    public final void A01(AnonymousClass1KN r7) {
        C18070vi.A0d(r7, 0);
        BigDecimal bigDecimal = r7.A00;
        int pow = (int) Math.pow(10.0d, (double) bigDecimal.scale());
        this.A01 = (long) (bigDecimal.doubleValue() * ((double) pow));
        this.A00 = pow;
    }

    public final ARR A00() {
        long j = this.A01;
        int i = this.A00;
        if (i <= 0) {
            i = 1;
        }
        AnonymousClass1KJ r0 = this.A02;
        C17960vV.A07(r0);
        C18070vi.A0X(r0);
        return C196669vR.A00(r0, i, j);
    }

    public C62222r3(JSONObject jSONObject) {
        AnonymousClass1KJ r4;
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject != null) {
            this.A01 = jSONObject2.optLong("value", -1);
            this.A00 = jSONObject2.optInt("offset", -1);
            jSONObject2.optInt("currencyType", -1);
            JSONObject optJSONObject = jSONObject2.optJSONObject("currency");
            AnonymousClass1KJ[] r0 = AnonymousClass1KI.A01;
            if (optJSONObject != null) {
                BigDecimal bigDecimal = AnonymousClass1KL.A0D;
                String optString = optJSONObject.optString("code");
                String optString2 = optJSONObject.optString("symbol");
                int optInt = optJSONObject.optInt("currencyType");
                int optInt2 = optJSONObject.optInt("offset");
                int optInt3 = optJSONObject.optInt("weight");
                int optInt4 = optJSONObject.optInt("displayExponent");
                String optString3 = optJSONObject.optString("currencyIconText");
                String optString4 = optJSONObject.optString("requestCurrencyIconText");
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("maxValue");
                if (optJSONObject2 != null) {
                    AnonymousClass1KN A002 = AnonymousClass2TQ.A00(optJSONObject2.optString("amount", ""), optInt4);
                    if (A002 != null) {
                        JSONObject optJSONObject3 = optJSONObject.optJSONObject("minValue");
                        if (optJSONObject3 != null) {
                            AnonymousClass1KN A003 = AnonymousClass2TQ.A00(optJSONObject3.optString("amount", ""), optInt4);
                            if (A003 != null) {
                                C18070vi.A0b(optString);
                                C18070vi.A0b(optString2);
                                C18070vi.A0b(optString3);
                                C18070vi.A0b(optString4);
                                r4 = new AnonymousClass1KL(A002, A003, optString, optString2, optString3, optString4, optInt, optInt2, optInt4, optInt3);
                            } else {
                                throw AnonymousClass000.A0n("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass000.A0n("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass000.A0n("Required value was null.");
                    }
                } else {
                    throw AnonymousClass000.A0n("Required value was null.");
                }
            } else {
                r4 = AnonymousClass1KL.A0C;
            }
            this.A02 = r4;
        }
    }

    public C62222r3() {
    }
}
