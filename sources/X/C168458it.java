package X;

import org.json.JSONObject;

/* renamed from: X.8it  reason: invalid class name and case insensitive filesystem */
public final class C168458it extends C168468iu {
    public final int A00;
    public final C1404571m A01;
    public final JSONObject A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C168458it) {
                C168458it r5 = (C168458it) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00 || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, (AnonymousClass000.A0L(this.A01) + this.A00) * 31);
    }

    public C168458it(C1404571m r1, JSONObject jSONObject, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = jSONObject;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ErrorResponse(error=");
        A10.append(this.A01);
        A10.append(", targetErrorCode=");
        A10.append(this.A00);
        A10.append(", rawResponse=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
