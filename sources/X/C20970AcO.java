package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.AcO  reason: case insensitive filesystem */
public final class C20970AcO implements AnonymousClass1O5 {
    public AnonymousClass9WX A00;
    public final C18000vb A01;
    public final AnonymousClass00H A02;

    public void BrD(String str) {
        C17900vP.A0e("GetCommerceTranslationsMetadataProtocolHelper/onDeliveryFailure: Network failed  while sending the payload: ", str, AnonymousClass3MZ.A19(str, 0));
        AnonymousClass9WX r0 = this.A00;
        if (r0 == null) {
            C18070vi.A11("listener");
            throw null;
        } else {
            r0.A00.A07.set(false);
        }
    }

    public void Bt9(C29621ca r4, String str) {
        C18070vi.A0d(r4, 1);
        Log.e("GetCommerceTranslationsMetadataProtocolHelper/response-error");
        C29621ca A0K = r4.A0K("error");
        if (A0K != null) {
            A0K.A0A("code", 0);
        }
        AnonymousClass9WX r0 = this.A00;
        if (r0 == null) {
            C18070vi.A11("listener");
            throw null;
        } else {
            r0.A00.A07.set(false);
        }
    }

    public void C7Z(C29621ca r13, String str) {
        String str2;
        C29621ca A0K;
        C29621ca[] r9;
        C29621ca A0K2;
        String A022;
        Long A04;
        C29621ca A0K3;
        C18070vi.A0d(r13, 1);
        C29621ca A0K4 = r13.A0K("commerce_metadata");
        if (A0K4 == null || (A0K3 = A0K4.A0K("translations")) == null || (str2 = C29621ca.A02(A0K3, "locale")) == null) {
            str2 = "";
        }
        if (str2.length() == 0) {
            Log.e("GetCommerceTranslationsMetadataProtocolHelper/onSuccess can not find locale value in response!");
            AnonymousClass9WX r0 = this.A00;
            if (r0 != null) {
                r0.A00.A07.set(false);
                return;
            }
        } else {
            long A042 = C17880vN.A04(new Date().getTime()) + 86400000;
            if (!(A0K4 == null || (A0K2 = A0K4.A0K("translations")) == null || (A022 = C29621ca.A02(A0K2, "expires_at")) == null || (A04 = AnonymousClass1YD.A04(A022)) == null)) {
                A042 = A04.longValue();
            }
            HashMap A11 = C17880vN.A11();
            if (!(A0K4 == null || (A0K = A0K4.A0K("translations")) == null || (r9 = A0K.A02) == null)) {
                ArrayList A13 = AnonymousClass000.A13();
                for (C29621ca r4 : r9) {
                    C108975cc.A13(r4.A00, "string", r4, A13);
                }
                ArrayList A132 = AnonymousClass000.A13();
                Iterator it = A13.iterator();
                while (it.hasNext()) {
                    C29621ca A0a = C17880vN.A0a(it);
                    if (!(A0a.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) null) == null || A0a.A0Q("value", (String) null) == null)) {
                        String A0Q = A0a.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) null);
                        C18070vi.A0b(A0Q);
                        String A0Q2 = A0a.A0Q("value", (String) null);
                        C18070vi.A0b(A0Q2);
                        A11.put(A0Q, A0Q2);
                    }
                    A132.add(C27621Wu.A00);
                }
            }
            AnonymousClass9WX r02 = this.A00;
            if (r02 != null) {
                A2H a2h = r02.A00;
                a2h.A07.set(false);
                C19830z4 r7 = a2h.A03;
                JSONObject A15 = C17880vN.A15();
                A15.put("locale", str2);
                A15.put("expiresAt", A042);
                JSONArray A1A = AnonymousClass8BR.A1A();
                Iterator A0i = C17890vO.A0i(A11);
                while (A0i.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A0i);
                    JSONObject A152 = C17880vN.A15();
                    A152.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A16.getKey());
                    A152.put("value", A16.getValue());
                    A1A.put(A152);
                }
                C17880vN.A1E(C19830z4.A00(r7), "commerce_metadata_tanslations", AnonymousClass8BS.A0k(A1A, "strings", A15));
                return;
            }
        }
        C18070vi.A11("listener");
        throw null;
    }

    public C20970AcO(C18000vb r1, AnonymousClass00H r2) {
        C18070vi.A0j(r2, r1);
        this.A02 = r2;
        this.A01 = r1;
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
