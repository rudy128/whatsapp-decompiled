package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.File;
import java.util.Iterator;

/* renamed from: X.ARn  reason: case insensitive filesystem */
public class C20603ARn implements B80 {
    public final int A00;
    public final Object A01;

    public C20603ARn(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Object CB6(Cursor cursor) {
        String string;
        Integer valueOf;
        Object obj;
        String string2;
        File A17;
        String canonicalPath;
        String str;
        Cursor cursor2 = cursor;
        switch (this.A00) {
            case 0:
                C186439eC r3 = (C186439eC) this.A01;
                AnonymousClass1NT r4 = r3.A00;
                int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("metadata");
                String str2 = null;
                if (cursor2.isNull(columnIndexOrThrow)) {
                    string2 = null;
                } else {
                    string2 = cursor2.getString(columnIndexOrThrow);
                }
                A55 A002 = A55.A00(r4, string2);
                String A0S = C17890vO.A0S(cursor2, "upload_title");
                C18070vi.A0b(A0S);
                String str3 = A0S;
                if (!(A002 == null || (str = A002.A04) == null)) {
                    str3 = str;
                }
                C18070vi.A0b(str3);
                String A07 = C41361wE.A07(r3.A01, str3);
                if (A07 == null || (canonicalPath = A17.getCanonicalPath()) == null) {
                    return null;
                }
                C20002A2r a2r = new C20002A2r(r4, A002, r3.A02, (A17 = C108945cZ.A17(A07)), canonicalPath, A0S, cursor2.getBlob(cursor2.getColumnIndexOrThrow("media_decryption_hash")));
                int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("transaction_id");
                if (!cursor2.isNull(columnIndexOrThrow2)) {
                    str2 = cursor2.getString(columnIndexOrThrow2);
                }
                return new C193409q3(a2r, str2);
            case 1:
                AnonymousClass1NT r32 = ((C199119zT) this.A01).A00;
                int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("metadata");
                String str4 = null;
                if (cursor2.isNull(columnIndexOrThrow3)) {
                    string = null;
                } else {
                    string = cursor2.getString(columnIndexOrThrow3);
                }
                C19990A2d a2d = new C19990A2d(A55.A00(r32, string), C17890vO.A0S(cursor2, "upload_title"), C17890vO.A0S(cursor2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME), C17890vO.A0S(cursor2, "mime_type"), C17890vO.A0S(cursor2, "md5_hash"), C17890vO.A06(cursor2, "size_bytes"), C17890vO.A06(cursor2, "upload_time"));
                long A06 = C17890vO.A06(cursor2, "backup_id");
                int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("state");
                if (cursor2.isNull(columnIndexOrThrow4)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(cursor2.getInt(columnIndexOrThrow4));
                }
                Iterator it = C179529Ii.A00.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        int i = ((C179529Ii) obj).value;
                        if (valueOf == null || i != valueOf.intValue()) {
                        }
                    } else {
                        obj = null;
                    }
                }
                C179529Ii r14 = (C179529Ii) obj;
                if (r14 == null) {
                    r14 = C179529Ii.NONE;
                }
                int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("transaction_id");
                if (!cursor2.isNull(columnIndexOrThrow5)) {
                    str4 = cursor2.getString(columnIndexOrThrow5);
                }
                return new C194789sI(a2d, r14, str4, A06);
            default:
                return C196729vY.A00(cursor2);
        }
    }
}
