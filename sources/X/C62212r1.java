package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: X.2r1  reason: invalid class name and case insensitive filesystem */
public class C62212r1 {
    public final int A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C62212r1)) {
            return false;
        }
        C62212r1 r7 = (C62212r1) obj;
        return r7.A01 == this.A01 && r7.A00 == this.A00;
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        C17890vO.A1L(objArr, this.A01);
        AnonymousClass000.A1M(objArr, this.A00);
        return Arrays.hashCode(objArr);
    }

    public C62212r1(String str) {
        JSONObject A16 = C17880vN.A16(str);
        this.A00 = A16.getInt("update_count");
        this.A01 = A16.getLong(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public C62212r1(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }
}
