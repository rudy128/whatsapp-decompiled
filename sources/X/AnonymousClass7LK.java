package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;

/* renamed from: X.7LK  reason: invalid class name */
public class AnonymousClass7LK implements AnonymousClass1O5 {
    public final C127306e8 A00;
    public final AnonymousClass1OZ A01;
    public final AnonymousClass1KB A02;

    public void BrD(String str) {
        Log.e("ChatSupportTicketProtocolHelper/onDeliveryFailure");
        AnonymousClass1KB r3 = this.A02;
        C127306e8 r2 = this.A00;
        r2.getClass();
        r3.CGP(new C146447Pd(r2, 8));
    }

    public void C7Z(C29621ca r6, String str) {
        AnonymousClass1KB r2;
        Runnable runnable;
        String str2;
        C29621ca A0K = r6.A0K(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
        AnonymousClass1BI r4 = null;
        if (A0K != null) {
            C29621ca A0K2 = A0K.A0K("ticket_id");
            if (A0K2 != null) {
                str2 = A0K2.A0M();
            } else {
                str2 = null;
            }
            C29621ca A0K3 = A0K.A0K("group_jid");
            if (A0K3 != null) {
                try {
                    GroupJid A03 = GroupJid.Companion.A03(A0K3.A0M());
                    r4 = A03 == null ? C22931Dv.A01(A0K3.A0M()) : A03;
                } catch (AnonymousClass11T unused) {
                    Log.e("ChatSupportTicketProtocolHelper/onSuccess called with invalid jid");
                }
            }
            if (str2 != null) {
                C17900vP.A0f("ChatSupportTicketProtocolHelper/onSuccess called, ticketId=", str2, AnonymousClass000.A10());
                r2 = this.A02;
                runnable = new C21467AkY(this, r4, str2, 34);
                r2.CGP(runnable);
            }
        }
        Log.e("ChatSupportTicketProtocolHelper/onSuccess called but ticketId is null, posting an error");
        r2 = this.A02;
        runnable = new C146447Pd(this, 7);
        r2.CGP(runnable);
    }

    public AnonymousClass7LK(AnonymousClass1KB r1, C127306e8 r2, AnonymousClass1OZ r3) {
        this.A02 = r1;
        this.A01 = r3;
        this.A00 = r2;
    }

    public void Bt9(C29621ca r6, String str) {
        C17900vP.A0X(r6, "ChatSupportTicketProtocolHelper/onError: error response:", AnonymousClass000.A10());
        C29621ca A0K = r6.A0K("error");
        if (A0K != null) {
            int A0A = A0K.A0A("code", 0);
            this.A02.CGP(new C21454AkL(this, C29621ca.A02(A0K, "text"), A0A, 6));
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
