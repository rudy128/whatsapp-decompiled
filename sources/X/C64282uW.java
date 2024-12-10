package X;

import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2uW  reason: invalid class name and case insensitive filesystem */
public class C64282uW implements NfcAdapter.CreateNdefMessageCallback {
    public final int A00;
    public final Object A01;

    public C64282uW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final NdefMessage createNdefMessage(NfcEvent nfcEvent) {
        if (this.A00 != 0) {
            C27211Ve r10 = (C27211Ve) this.A01;
            Log.i("NfcChatHandlerImpl/onActivityCreated/createndef");
            NdefRecord[] ndefRecordArr = new NdefRecord[2];
            C18100vl r7 = r10.A03;
            Object value = r7.getValue();
            C18070vi.A0X(value);
            byte[] A1A = C18070vi.A1A("application/com.whatsapp.chat", (Charset) value);
            AnonymousClass11S r9 = r10.A00;
            String rawString = AnonymousClass11S.A01(r9).getRawString();
            Object value2 = r7.getValue();
            C18070vi.A0X(value2);
            byte[] A1A2 = C18070vi.A1A(rawString, (Charset) value2);
            JSONObject A15 = C17880vN.A15();
            try {
                A15.put("jid", AnonymousClass11S.A01(r9).getRawString());
                A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, AnonymousClass1PP.A00(r9, r10.A01, false));
                A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r9.A0D());
            } catch (JSONException e) {
                Log.e("NfcChatHandlerImpl/createNdefRecordPayload", e);
            }
            String A0H = C18070vi.A0H(A15);
            Object value3 = r7.getValue();
            C18070vi.A0X(value3);
            ndefRecordArr[0] = new NdefRecord(2, A1A, A1A2, C18070vi.A1A(A0H, (Charset) value3));
            NdefRecord createApplicationRecord = NdefRecord.createApplicationRecord("com.whatsapp");
            C18070vi.A0X(createApplicationRecord);
            ndefRecordArr[1] = createApplicationRecord;
            return new NdefMessage(ndefRecordArr);
        }
        IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) this.A01;
        if (identityVerificationActivity.A0C == null) {
            Log.w("idverification/createndef/no-fingerprint");
            return null;
        }
        NdefRecord[] ndefRecordArr2 = new NdefRecord[2];
        Charset forName = Charset.forName("US-ASCII");
        C18070vi.A0X(forName);
        byte[] A1A3 = C18070vi.A1A("application/com.whatsapp.identity", forName);
        String rawString2 = AnonymousClass11S.A01(identityVerificationActivity.A02).getRawString();
        Charset forName2 = Charset.forName("US-ASCII");
        C18070vi.A0X(forName2);
        byte[] A1A4 = C18070vi.A1A(rawString2, forName2);
        C128396fv r0 = identityVerificationActivity.A0C;
        if (r0 != null) {
            ndefRecordArr2[0] = new NdefRecord(2, A1A3, A1A4, r0.A02.A0M());
            ndefRecordArr2[1] = NdefRecord.createApplicationRecord("com.whatsapp");
            return new NdefMessage(ndefRecordArr2);
        }
        throw C17880vN.A0g();
    }
}
