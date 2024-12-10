package X;

import org.json.JSONObject;

/* renamed from: X.8uP  reason: invalid class name and case insensitive filesystem */
public final class C173028uP extends C180759Nu {
    public final JSONObject A00;

    public C173028uP(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 1);
        this.A00 = jSONObject;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C173028uP) && C18070vi.A18(this.A00, ((C173028uP) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public final void A00(C180759Nu r3, String str) {
        JSONObject jSONObject;
        Object obj;
        C18070vi.A0h(str, r3);
        if (r3 instanceof C173018uO) {
            this.A00.put(str, JSONObject.NULL);
        } else if (r3 instanceof C172988uL) {
            this.A00.put(str, ((C172988uL) r3).A00);
        } else {
            if (r3 instanceof C172998uM) {
                jSONObject = this.A00;
                obj = ((C172998uM) r3).A00;
            } else if (r3 instanceof C173008uN) {
                jSONObject = this.A00;
                obj = ((C173008uN) r3).A00;
            } else if (r3 instanceof C173038uQ) {
                jSONObject = this.A00;
                obj = ((C173038uQ) r3).A00;
            } else if (r3 instanceof C173028uP) {
                this.A00.put(str, ((C173028uP) r3).A00);
                return;
            } else {
                return;
            }
            jSONObject.put(str, obj);
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Object(value=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public C173028uP() {
        this(C17880vN.A15());
    }
}
