package X;

import com.whatsapp.infra.graphql.mex.argo.JsonValue$Array$iterator$1;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8uQ  reason: invalid class name and case insensitive filesystem */
public final class C173038uQ extends C180759Nu implements Iterable, C18450wR {
    public final JSONArray A00;

    public C173038uQ(JSONArray jSONArray) {
        C18070vi.A0d(jSONArray, 1);
        this.A00 = jSONArray;
    }

    public final void A00(C180759Nu r3) {
        JSONArray jSONArray;
        Object obj;
        C18070vi.A0d(r3, 0);
        if (r3 instanceof C173018uO) {
            this.A00.put(JSONObject.NULL);
        } else if (r3 instanceof C172988uL) {
            this.A00.put(((C172988uL) r3).A00);
        } else {
            if (r3 instanceof C172998uM) {
                jSONArray = this.A00;
                obj = ((C172998uM) r3).A00;
            } else if (r3 instanceof C173008uN) {
                jSONArray = this.A00;
                obj = ((C173008uN) r3).A00;
            } else if (r3 instanceof C173038uQ) {
                this.A00.put(((C173038uQ) r3).A00);
                return;
            } else if (r3 instanceof C173028uP) {
                jSONArray = this.A00;
                obj = ((C173028uP) r3).A00;
            } else {
                return;
            }
            jSONArray.put(obj);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C173038uQ) && C18070vi.A18(this.A00, ((C173038uQ) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.1dr, java.util.Iterator, X.Akx, java.lang.Object] */
    public Iterator iterator() {
        JsonValue$Array$iterator$1 jsonValue$Array$iterator$1 = new JsonValue$Array$iterator$1(this, (C30391dr) null);
        ? obj = new Object();
        obj.A01 = C30581eB.A01(obj, obj, jsonValue$Array$iterator$1);
        return obj;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Array(value=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public C173038uQ() {
        this(AnonymousClass8BR.A1A());
    }
}
