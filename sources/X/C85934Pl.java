package X;

import com.whatsapp.util.Log;
import org.json.JSONException;

/* renamed from: X.4Pl  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C85934Pl {
    public final /* synthetic */ AnonymousClass3uP A00;

    public final void A00(C195309t8 r10, int i) {
        AnonymousClass3uP r2 = this.A00;
        C108885cS A02 = C88404Zo.A02(r2);
        if (A02 == null) {
            Log.e("ConversationRow/dynamicReplyOnClickCallback/error: not click in Conversation");
        } else {
            C20271AEe aEe = r10.A02;
            if (aEe != null) {
                try {
                    ((C34811l7) r2.A2A.get()).A03(A02.CFa(), (AnonymousClass5XY) null, r2.getFMessage(), aEe, i);
                } catch (JSONException unused) {
                    Log.e("[PAY] : ConversationRow exception processing NFM message");
                }
            } else {
                A02.CHL(r2.getFMessage(), r10);
            }
        }
        r2.A1u();
    }

    public /* synthetic */ C85934Pl(AnonymousClass3uP r1) {
        this.A00 = r1;
    }
}
