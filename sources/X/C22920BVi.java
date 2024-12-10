package X;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: X.BVi  reason: case insensitive filesystem */
public final class C22920BVi extends C24473C5o implements C28514E4y {
    public static final C22920BVi A00 = new Object();

    public int hashCode() {
        return Arrays.hashCode(new boolean[]{false, false, false, false});
    }

    public boolean equals(Object obj) {
        if (obj instanceof C22920BVi) {
            return true;
        }
        return false;
    }

    public JSONObject CPJ() {
        JSONObject A15 = C17880vN.A15();
        A15.put("is_user_scoped", false);
        A15.put("keep_data_between_sessions", false);
        A15.put("userid_in_path", false);
        A15.put("keep_data_on_account_removal", false);
        return A15;
    }
}
