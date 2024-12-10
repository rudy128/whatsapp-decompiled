package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.1gF  reason: invalid class name and case insensitive filesystem */
public class C31861gF {
    public final /* synthetic */ C31841gD A00;

    public C31861gF(C31841gD r1) {
        this.A00 = r1;
    }

    public void A00(AnonymousClass206 r8, int i) {
        C62642rj r5 = this.A00.A00;
        C29621ca A05 = C63952ty.A05(r8, i);
        AnonymousClass205 r4 = r8.A0v;
        AnonymousClass1BI r1 = r4.A00;
        if (!C22971Dz.A0e(r1) && !C22971Dz.A0N(r1) && !C22971Dz.A0N(r8.A0H()) && A05.A0Q("participant", (String) null) != null) {
            String A0Q = A05.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "delivery?");
            StringBuilder sb = new StringBuilder();
            sb.append("ConnectionWriter/sendMessageReceived sending 1:1 receipt with participant attr key=");
            sb.append(r4);
            Log.w(sb.toString());
            if (!r5.A0B.getAndSet(true)) {
                AnonymousClass190 r3 = r5.A04;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("type=");
                sb2.append(A0Q);
                sb2.append(" msg=");
                sb2.append(r8.A0u);
                r3.A0G("sending_individual_receipt_with_participant", sb2.toString(), false);
            }
        }
        r5.A03(A05, r8.A10);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("WriterThread/write/message-received; message.key=");
        sb3.append(r4);
        Log.i(sb3.toString());
    }

    public void A01(C29621ca r4, int i, long j) {
        this.A00.A00.A03(r4, j);
        StringBuilder sb = new StringBuilder();
        sb.append("WriterThread/write/type=");
        sb.append(i);
        sb.append(" tag=");
        sb.append(r4.A00);
        sb.append(", loggableStanzaId=");
        sb.append(j);
        sb.append(", id=");
        sb.append(r4.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null));
        Log.i(sb.toString());
    }

    public void A02(C60132nR r5) {
        this.A00.A00.A03(C63952ty.A06(r5.A04, r5), r5.A00);
        StringBuilder sb = new StringBuilder();
        sb.append("WriterThread/write/send-stanza-received; stanzaKey=");
        sb.append(r5);
        Log.i(sb.toString());
    }
}
