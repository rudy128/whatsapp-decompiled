package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.1PD  reason: invalid class name */
public class AnonymousClass1PD {
    public final AnonymousClass11P A00;
    public final AnonymousClass1MH A01;

    public void A00(int i, byte[] bArr) {
        C28791au A06 = this.A01.A06();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("prekey_id", Integer.valueOf(i));
            contentValues.put("timestamp", Long.valueOf(AnonymousClass11P.A01(this.A00) / 1000));
            contentValues.put("record", bArr);
            ((C28801av) A06).A02.A08("signed_prekeys", "SignalSignedPreKeyStore/saveSignedPreKey", contentValues);
            StringBuilder sb = new StringBuilder();
            sb.append("SignalSignedPreKeyStore/saveSignedPreKey stored signed pre key with id ");
            sb.append(i);
            Log.i(sb.toString());
            A06.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public byte[] A01(int i) {
        Cursor A0B;
        C28781at A05 = this.A01.get();
        try {
            A0B = ((C28801av) A05).A02.A0B("signed_prekeys", new String[]{"record"}, "prekey_id = ?", new String[]{String.valueOf(i)}, (String) null, (String) null, (String) null, "SignalSignedPreKeyStore/getSignedPreKey");
            if (A0B != null) {
                if (A0B.moveToNext()) {
                    byte[] blob = A0B.getBlob(A0B.getColumnIndexOrThrow("record"));
                    A0B.close();
                    A05.close();
                    return blob;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("SignalSignedPreKeyStore/getSignedPreKey no signed prekey available with id ");
            sb.append(i);
            Log.e(sb.toString());
            if (A0B != null) {
                A0B.close();
            }
            A05.close();
            return null;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass1PD(AnonymousClass11P r1, AnonymousClass1MH r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
