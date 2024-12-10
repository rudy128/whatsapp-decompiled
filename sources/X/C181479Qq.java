package X;

import com.whatsapp.util.Log;

/* renamed from: X.9Qq  reason: invalid class name and case insensitive filesystem */
public abstract class C181479Qq {
    public static final String A00(C19830z4 r3) {
        String A0m = r3.A0m();
        if (A0m == null && (A0m = C17890vO.A0B(r3).getString("saved_user_before_logout", (String) null)) == null) {
            return null;
        }
        try {
            A8M a8m = A8M.A00;
            String A14 = C108955ca.A14(AnonymousClass8BW.A1W(C108975cc.A1O(A0m), "SHA-256"));
            C18070vi.A0X(A14);
            return A14;
        } catch (Exception e) {
            Log.e("p2p/fpm/ChatTransferViewModel//getHashedUser/Exception", e);
            return null;
        }
    }
}
