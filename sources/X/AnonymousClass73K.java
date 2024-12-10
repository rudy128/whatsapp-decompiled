package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.73K  reason: invalid class name */
public abstract class AnonymousClass73K {
    public static final C18180vt A00 = new C18180vt(1, 1);
    public static final Set A01;

    static {
        Integer[] numArr = new Integer[29];
        AnonymousClass000.A1L(numArr, 128525);
        numArr[1] = 128514;
        numArr[2] = 128558;
        numArr[3] = 128546;
        AnonymousClass3Ma.A1T(numArr, 128591);
        numArr[5] = 128079;
        numArr[6] = 127881;
        C17890vO.A1I(numArr, 128175);
        C17890vO.A0x(128077, 128514, numArr);
        numArr[10] = 128558;
        numArr[11] = 128546;
        numArr[12] = 10084;
        numArr[13] = 128522;
        numArr[14] = 129392;
        numArr[15] = 129321;
        numArr[16] = 128154;
        numArr[17] = 129315;
        numArr[18] = 128518;
        numArr[19] = 128293;
        numArr[20] = 128588;
        numArr[21] = 129395;
        numArr[22] = 128557;
        numArr[23] = 128532;
        numArr[24] = 129402;
        numArr[25] = 128562;
        numArr[26] = 129327;
        numArr[27] = 128545;
        numArr[28] = 128548;
        A01 = C200410p.A0S(numArr);
    }

    public static final String A00(Context context, AnonymousClass77K r3) {
        int i;
        int i2;
        String A0k;
        C18070vi.A0d(r3, 0);
        int i3 = r3.A00;
        if (i3 == 0) {
            A0k = context.getString(2131896351);
        } else {
            Resources resources = context.getResources();
            if (i3 == 1) {
                i = r3.A01.size();
                i2 = 2131755400;
            } else if (i3 != 2) {
                return "";
            } else {
                i = r3.A02.size();
                i2 = 2131755401;
            }
            A0k = C72473Md.A0k(resources, i, i2);
        }
        C18070vi.A0X(A0k);
        return A0k;
    }

    public static final boolean A02(AnonymousClass1KB r5, AnonymousClass11C r6, String str) {
        ClipboardManager A09 = r6.A09();
        if (A09 == null) {
            r5.A08(2131897878, 0);
            return false;
        } else if (str == null || str.length() == 0) {
            return true;
        } else {
            try {
                A09.setPrimaryClip(ClipData.newPlainText(str, str));
                r5.A08(2131891618, 0);
                return true;
            } catch (NullPointerException | SecurityException e) {
                Log.e("invitelink/copy/npe", e);
                r5.A08(2131897878, 0);
                return false;
            }
        }
    }

    public static final boolean A03(C139106yE r2, boolean z) {
        if (r2 == null || !r2.A01()) {
            return false;
        }
        if (r2.A01 > 0 || z) {
            return true;
        }
        return false;
    }

    public static final ArrayList A01(String str) {
        ArrayList A13 = AnonymousClass000.A13();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                if (C108965cb.A1b(A01, jSONArray.getInt(i))) {
                    C17890vO.A1D(A13, jSONArray.getInt(i));
                }
            }
        } catch (JSONException e) {
            C17900vP.A0h("statusreply/statusreactions/invalid emoji list JSONArray:", str, AnonymousClass000.A10(), e);
        }
        return A13;
    }
}
