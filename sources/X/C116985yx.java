package X;

import org.json.JSONObject;

/* renamed from: X.5yx  reason: invalid class name and case insensitive filesystem */
public final class C116985yx extends AnonymousClass6T3 {
    public final JSONObject A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C116985yx) && C18070vi.A18(this.A00, ((C116985yx) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C116985yx(JSONObject jSONObject) {
        this.A00 = jSONObject;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(result=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
