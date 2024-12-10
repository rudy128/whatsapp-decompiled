package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.9zF  reason: invalid class name and case insensitive filesystem */
public class C198989zF {
    public final C18030ve A00;

    public C198989zF(C18030ve r1) {
        this.A00 = r1;
    }

    public static Matcher A00(C198989zF r1, String str) {
        if (!TextUtils.isEmpty(str)) {
            String A0I = r1.A00.A0I(265);
            if (!TextUtils.isEmpty(A0I)) {
                try {
                    C17960vV.A07(A0I);
                    Pattern compile = Pattern.compile(C17880vN.A16(A0I).getJSONArray("url").getJSONObject(0).getString("regex"));
                    C17960vV.A07(str);
                    return compile.matcher(str);
                } catch (Exception e) {
                    Log.e((Throwable) e);
                    throw new AnonymousClass9LQ((Throwable) e);
                }
            } else {
                throw new AnonymousClass9LQ("SHOPS_STOREFRONT_URLS_CONFIG_CODE was null/empty");
            }
        } else {
            throw new AnonymousClass9LQ("Shop url was null");
        }
    }

    public boolean A01(String str) {
        try {
            return A00(this, str).matches();
        } catch (AnonymousClass9LQ e) {
            Log.e((Throwable) e);
            return false;
        }
    }
}
