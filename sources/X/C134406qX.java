package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6qX  reason: invalid class name and case insensitive filesystem */
public final class C134406qX {
    public final C127536eW A00;

    public C134406qX(C127536eW r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final List A00(C122716Rq r5) {
        C18070vi.A0d(r5, 0);
        C127536eW r2 = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(r5.name());
        String A0y = AnonymousClass000.A0y("_downloaded", A10);
        C18070vi.A0d(A0y, 0);
        String A0r = C17880vN.A0r(C17880vN.A0C(r2.A01), A0y);
        if (A0r == null) {
            return C18460wS.A00;
        }
        return AnonymousClass708.A07.A01(A0r);
    }

    public final void A02(String str) {
        C18070vi.A0d(str, 0);
        C127536eW r2 = this.A00;
        String A0y = AnonymousClass000.A0y("_cancel", AnonymousClass000.A11(str));
        C18070vi.A0d(A0y, 0);
        C17880vN.A1B(C17890vO.A0A(r2.A01), A0y);
    }

    public final void A01(C122716Rq r9, List list) {
        String str;
        C127536eW r3 = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(r9.name());
        String A0y = AnonymousClass000.A0y("_downloaded", A10);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass708 r6 = (AnonymousClass708) it.next();
            JSONObject A15 = C17880vN.A15();
            A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r6.A06);
            A15.put("version", r6.A01);
            A15.put("hash", r6.A04);
            A15.put("uncompressedFileSizeInBytes", r6.A00);
            A15.put("modelExtension", r6.A05);
            if (r6.A03.intValue() != 0) {
                str = "BROTLI";
            } else {
                str = "NONE";
            }
            A15.put("compressionType", str);
            A15.put("feature", r6.A02.name());
            jSONArray.put(A15);
        }
        String A0H = C18070vi.A0H(jSONArray);
        C18070vi.A0d(A0y, 0);
        C17880vN.A1E(C17890vO.A0A(r3.A01), A0y, A0H);
    }
}
