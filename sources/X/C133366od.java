package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6od  reason: invalid class name and case insensitive filesystem */
public final class C133366od {
    public final C18030ve A00;

    public C133366od(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final String A00(Uri uri) {
        String str;
        C18030ve r3 = this.A00;
        if (r3.A03.contains(Integer.toString(12726))) {
            str = C18020vd.A01(C18040vf.A02, r3, 12726);
        } else {
            str = "";
        }
        C18070vi.A0b(str);
        List A0s = C108985cd.A0s(str, 1);
        ArrayList A0D = C29351c6.A0D(A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            A0D.add(AnonymousClass1YF.A0I(C17880vN.A0v(it)));
        }
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : A0D) {
            if (((String) next).length() > 0) {
                A13.add(next);
            }
        }
        for (String queryParameter : A13.isEmpty() ? new String[]{"partnertoken"} : C108955ca.A1b(A13)) {
            String queryParameter2 = uri.getQueryParameter(queryParameter);
            if (queryParameter2 != null && queryParameter2.length() != 0) {
                return queryParameter2;
            }
        }
        return null;
    }

    public final String A01(Uri uri) {
        if (!C17890vO.A1R(C18020vd.A00(C18040vf.A02, this.A00, 12822))) {
            return null;
        }
        try {
            String queryParameter = uri.getQueryParameter("text");
            if (queryParameter == null || queryParameter.length() == 0) {
                return null;
            }
            return C137496vY.A00("SHA-256", queryParameter);
        } catch (Exception e) {
            Log.e("ExternalDeepLinkParser/getTextParamSHA256", e);
            return null;
        }
    }
}
