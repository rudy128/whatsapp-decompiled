package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.9FA  reason: invalid class name */
public final class AnonymousClass9FA extends AnonymousClass9CP {
    public final String A00;
    public final AnonymousClass9DG A01;

    public AnonymousClass9FA(C29621ca r27, AnonymousClass9F7 r28) {
        String str;
        Jid jid;
        C29621ca r14 = r27;
        C29621ca.A04(r14, "iq");
        C29621ca r6 = (C29621ca) r28.A00;
        C62672rm A0s = AnonymousClass8BR.A0s();
        String[] strArr = new String[2];
        AnonymousClass8BR.A1K(strArr, 0, 1, "result");
        Class<String> cls = String.class;
        Long A0X = C108975cc.A0X();
        Long A0j = AnonymousClass8BU.A0j();
        C62672rm r13 = A0s;
        Class<String> cls2 = cls;
        Long l = A0j;
        String str2 = (String) r13.A04(r14, cls2, A0X, l, (Object) null, strArr);
        if (str2 != null) {
            this.A00 = str2;
            C18070vi.A0d(C20021A3n.A00, 0);
            C18070vi.A0d(r6, 1);
            if (A0s.A09(r14, "iq")) {
                String[] strArr2 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
                String[] strArr3 = new String[1];
                Long A0Z = AnonymousClass8BW.A0Z(PublicKeyCredentialControllerUtility.JSON_KEY_ID, strArr3, 0);
                Object A05 = A0s.A05(r6, cls, A0Z, A0j, (Object) null, strArr3, false);
                if (!(A05 == null || (str = (String) r13.A05(r14, cls2, A0Z, l, A05, strArr2, true)) == null)) {
                    String[] A1Z = AnonymousClass8BS.A1Z(1, 0);
                    Class<Jid> cls3 = Jid.class;
                    Object A052 = A0s.A05(r6, cls3, A0Z, A0j, (Object) null, AnonymousClass8BS.A1X(1, 0), false);
                    if (!(A052 == null || (jid = (Jid) A0s.A05(r14, cls3, A0Z, A0j, A052, A1Z, true)) == null)) {
                        String str3 = (String) A0s.A05(r14, cls, A0Z, A0j, "result", AnonymousClass8BS.A1a(1, 0), false);
                        if (str3 != null) {
                            this.A01 = new AnonymousClass9DG(jid, r14, str, str3, 29);
                            this.A00 = r14;
                            return;
                        }
                    }
                }
            }
            throw AnonymousClass1O9.A00(A0s);
        }
        throw AnonymousClass1O9.A00(A0s);
    }
}
