package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* renamed from: X.A3v  reason: case insensitive filesystem */
public final class C20026A3v {
    public final A8T A00;

    public C20026A3v(A8T a8t) {
        C18070vi.A0d(a8t, 1);
        this.A00 = a8t;
    }

    public static final File A00(C62562rb r7, C20026A3v a3v, String str) {
        StringBuilder A10;
        String A002;
        Log.i("MultiAccountSharedPrefReader/getSharedPrefFile");
        A8T a8t = a3v.A00;
        File A0B = a8t.A0B(r7);
        if (A0B == null || !A0B.exists()) {
            A10 = AnonymousClass000.A10();
            A10.append("MultiAccountSharedPrefReader/getSharedPrefFile/Account ");
            A002 = C49842Sd.A00(r7);
        } else {
            File A0u = AnonymousClass8BR.A0u(A0B.getAbsolutePath(), "shared_prefs");
            if (!A0u.exists()) {
                A10 = AnonymousClass000.A10();
                A10.append("MultiAccountSharedPrefReader/getSharedPrefFile/shared prefs for ");
                A002 = C60322np.A01(r7.A07);
            } else {
                File A0u2 = AnonymousClass8BR.A0u(A0u.getAbsolutePath(), str);
                if (A0u2.exists()) {
                    return A0u2;
                }
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("MultiAccountSharedPrefReader/getSharedPrefFile/");
                A102.append(str);
                AnonymousClass8BW.A18(r7, " file for ", A102);
                C17890vO.A19(A102, " doesn't exist");
                return null;
            }
        }
        C17900vP.A0e(A002, " does not exist", A10);
        AnonymousClass8BX.A16(a8t, "MultiAccountSharedPrefReader/getSharedPrefFile/stagingDirLogString/", AnonymousClass000.A10());
        return null;
    }

    public static final String A01(C62562rb r5, C20026A3v a3v, String str, String str2) {
        Log.i("MultiAccountSharedPrefReader/getStringSharedPref");
        File A002 = A00(r5, a3v, AnonymousClass000.A0y(".xml", AnonymousClass000.A11(str)));
        if (A002 == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            AnonymousClass8BW.A18(r5, "MultiAccountSharedPrefReader/getStringSharedPref/", A10);
            C17890vO.A19(A10, ": shared pref file does not exist");
            return null;
        }
        try {
            NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(A002).getElementsByTagName("string");
            int length = elementsByTagName.getLength();
            if (length < 0) {
                return null;
            }
            int i = 0;
            while (true) {
                Node item = elementsByTagName.item(i);
                if (item != null && item.getAttributes().getLength() > 0 && C18070vi.A18(item.getAttributes().item(0).getNodeValue(), str2) && item.getChildNodes().getLength() > 0) {
                    return item.getChildNodes().item(0).getNodeValue();
                }
                if (i == length) {
                    return null;
                }
                i++;
            }
        } catch (IOException | SAXException e) {
            C17900vP.A0X(e, ": ", AnonymousClass8BW.A0o("MultiAccountSharedPrefReader/readStringSharedPrefFromFile/", str2));
            return null;
        }
    }
}
