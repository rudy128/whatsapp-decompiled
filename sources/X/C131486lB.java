package X;

import com.whatsapp.util.Log;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.6lB  reason: invalid class name and case insensitive filesystem */
public final class C131486lB {
    public final C19830z4 A00;

    public C131486lB(C19830z4 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final String A00() {
        String A0u = C108955ca.A0u(this.A00);
        if (A0u.length() == 0) {
            A0u = "1234567890";
        }
        try {
            byte[] digest = C108945cZ.A1I().digest(C108975cc.A1O(A0u));
            C18070vi.A0b(digest);
            return C200410p.A0J(AnonymousClass83R.A00, digest);
        } catch (NoSuchAlgorithmException unused) {
            Log.e("WaBloksPreRegistrationUserHelper/getPreRegistrationUserId got NoSuchAlgorithmException");
            return "1234567890";
        }
    }
}
