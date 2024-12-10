package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;

/* renamed from: X.2pE  reason: invalid class name and case insensitive filesystem */
public class C61162pE {
    public final AnonymousClass1Cd A00;

    public C61162pE(AnonymousClass1Cd r1) {
        this.A00 = r1;
    }

    public static HashMap A00(C61162pE r7) {
        Cursor A002;
        HashMap A11 = C17880vN.A11();
        C28781at A04 = r7.A00.get();
        try {
            A002 = C23141Ev.A00(((C28801av) A04).A02, "SELECT seq, name FROM SQLITE_SEQUENCE", "SequencesHandler/GET_ALL_SEQUENCES");
            int columnIndexOrThrow = A002.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            int columnIndexOrThrow2 = A002.getColumnIndexOrThrow("seq");
            while (A002.moveToNext()) {
                A11.put(A002.getString(columnIndexOrThrow), C17890vO.A0M(A002, columnIndexOrThrow2));
            }
            A002.close();
            A04.close();
            return A11;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }
}
