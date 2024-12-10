package X;

import android.net.Uri;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;

/* renamed from: X.1zi  reason: invalid class name and case insensitive filesystem */
public abstract class C43381zi {
    public static List A00;

    public static final boolean A00(C18030ve r3, AnonymousClass1BI r4) {
        C18070vi.A0d(r3, 1);
        if (r4 != null) {
            String rawString = r4.getRawString();
            String A01 = C18020vd.A01(C18040vf.A02, r3, 1924);
            C18070vi.A0X(A01);
            if (A01.length() <= 0 || !C18070vi.A18(rawString, A01)) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final boolean A01(C18030ve r4, Jid jid) {
        C18070vi.A0d(r4, 0);
        if (jid == null) {
            return false;
        }
        C18040vf r2 = C18040vf.A02;
        if (!C18020vd.A05(r2, r4, 1377)) {
            return false;
        }
        List list = A00;
        if (list == null) {
            String A01 = C18020vd.A01(r2, r4, 1607);
            C18070vi.A0X(A01);
            if (A01.length() == 0) {
                return false;
            }
            list = AnonymousClass1YF.A0S(A01, new String[]{","}, 0);
            A00 = list;
        }
        return list.contains(jid.user);
    }

    public static final boolean A02(C18030ve r6, C61762qD r7) {
        C18070vi.A0d(r6, 0);
        if (2 == r7.A07) {
            String str = r7.A01;
            C18070vi.A0W(str);
            try {
                Uri parse = Uri.parse(str);
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                String host = parse.getHost();
                if (host != null && AnonymousClass1YF.A0Y(host, "whatsapp.com", false) && C18070vi.A18(parse.getPath(), "/survey/")) {
                    if (!queryParameterNames.contains("oid")) {
                        if (queryParameterNames.contains("session")) {
                        }
                    }
                    if (!C18020vd.A05(C18040vf.A02, r6, 1377)) {
                        return false;
                    }
                    return true;
                }
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("InAppSurveyUtils/isInAppSurveyURL/<");
                sb.append(str);
                sb.append("> is not a valid URL. Error=");
                sb.append(e);
                Log.e(sb.toString());
            }
        }
        return false;
    }
}
