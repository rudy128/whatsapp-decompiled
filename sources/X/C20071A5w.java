package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.A5w  reason: case insensitive filesystem */
public final class C20071A5w {
    public static final C20071A5w A00 = new Object();

    public static final AnonymousClass9DG A00(C29621ca r21, C29621ca r22, C62672rm r23) {
        C29621ca r12 = r21;
        C62672rm r3 = r23;
        if (!r3.A09(r12, "iq")) {
            return null;
        }
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        Class<String> cls = String.class;
        String[] strArr2 = new String[1];
        Long A0Z = AnonymousClass8BW.A0Z(PublicKeyCredentialControllerUtility.JSON_KEY_ID, strArr2, 0);
        Long A0j = AnonymousClass8BU.A0j();
        C29621ca r4 = r22;
        Object A05 = r3.A05(r4, cls, A0Z, A0j, (Object) null, strArr2, false);
        if (A05 == null) {
            return null;
        }
        C62672rm r11 = r3;
        String str = (String) r11.A05(r12, cls, A0Z, A0j, A05, strArr, true);
        if (str == null) {
            return null;
        }
        String[] A1Z = AnonymousClass8BS.A1Z(1, 0);
        Class<Jid> cls2 = Jid.class;
        Object A052 = r3.A05(r4, cls2, A0Z, A0j, (Object) null, AnonymousClass8BS.A1X(1, 0), false);
        if (A052 == null) {
            return null;
        }
        Jid jid = (Jid) r3.A05(r12, cls2, A0Z, A0j, A052, A1Z, true);
        if (jid == null) {
            return null;
        }
        String str2 = (String) r11.A05(r12, cls, A0Z, A0j, "error", AnonymousClass8BS.A1a(1, 0), false);
        if (str2 == null) {
            return null;
        }
        return new AnonymousClass9DG(jid, r12, str, str2, 0);
    }

    public static final AnonymousClass9DG A01(C29621ca r22, C29621ca r23, C62672rm r24) {
        C29621ca r13 = r22;
        C62672rm r4 = r24;
        if (!r4.A09(r13, "iq")) {
            return null;
        }
        String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        Class<String> cls = String.class;
        String[] strArr2 = new String[1];
        Long A0Z = AnonymousClass8BW.A0Z(PublicKeyCredentialControllerUtility.JSON_KEY_ID, strArr2, 0);
        Long A0j = AnonymousClass8BU.A0j();
        C29621ca r5 = r23;
        Object A05 = r4.A05(r5, cls, A0Z, A0j, (Object) null, strArr2, false);
        if (A05 == null) {
            return null;
        }
        C62672rm r12 = r4;
        String str = (String) r12.A05(r13, cls, A0Z, A0j, A05, strArr, true);
        if (str == null) {
            return null;
        }
        String[] A1Z = AnonymousClass8BS.A1Z(1, 0);
        Class<Jid> cls2 = Jid.class;
        Object A052 = r4.A05(r5, cls2, A0Z, A0j, (Object) null, AnonymousClass8BS.A1X(1, 0), false);
        if (A052 == null) {
            return null;
        }
        Jid jid = (Jid) r4.A05(r13, cls2, A0Z, A0j, A052, A1Z, true);
        if (jid == null) {
            return null;
        }
        String str2 = (String) r12.A05(r13, cls, A0Z, A0j, "result", AnonymousClass8BS.A1a(1, 0), false);
        if (str2 == null) {
            return null;
        }
        return new AnonymousClass9DG(jid, r13, str, str2, 1);
    }
}
