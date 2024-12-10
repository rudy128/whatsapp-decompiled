package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

public final class A2Y {
    public static final C189059iR A02 = new Object();
    public final AnonymousClass9IT A00;
    public final Long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof A2Y) {
                A2Y a2y = (A2Y) obj;
                if (this.A00 != a2y.A00 || !C18070vi.A18(this.A01, a2y.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A01);
    }

    public A2Y(AnonymousClass9IT r1, Long l) {
        this.A00 = r1;
        this.A01 = l;
    }

    public final JSONObject A00() {
        JSONObject A15 = C17880vN.A15();
        A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, this.A00.value);
        Long l = this.A01;
        if (l != null) {
            A15.put("permission_seconds", l.longValue());
        }
        return A15;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ReplyOption(type=");
        A10.append(this.A00);
        A10.append(", durationSeconds=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
