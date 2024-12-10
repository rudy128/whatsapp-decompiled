package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.AcL  reason: case insensitive filesystem */
public final class C20967AcL implements AnonymousClass1O5 {
    public final AnonymousClass190 A00;
    public final C22509BAq A01;

    public void BrD(String str) {
        this.A01.onError(500);
    }

    public void C7Z(C29621ca r19, String str) {
        C29621ca r1 = r19;
        boolean A15 = C18070vi.A15(str, r1);
        C29621ca A0K = r1.A0K("linked_group");
        if (A0K != null) {
            List A0R = A0K.A0R("group");
            C18070vi.A0X(A0R);
            if (!A0R.isEmpty()) {
                C29621ca r2 = (C29621ca) A0R.get(A15 ? 1 : 0);
                UserJid userJid = (UserJid) r2.A0F(UserJid.class, "creator");
                long A04 = C20099A7c.A04(r2.A0Q("creation", (String) null), 0) * 1000;
                String A0Q = r2.A0Q("subject", (String) null);
                C20099A7c.A04(r2.A0Q("s_t", (String) null), 0);
                int i = 0;
                if (r2.A0K("default_sub_group") != null) {
                    i = 3;
                }
                String A0Q2 = r2.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
                if (A0Q2 != null) {
                    boolean A1S = AnonymousClass8BX.A1S(r2, "admin_request_required");
                    boolean A1S2 = AnonymousClass8BX.A1S(r2, "hidden_group");
                    try {
                        LinkedHashMap A012 = C21535Ali.A01(r2, this.A00);
                        int A002 = C20099A7c.A00(r2, A012);
                        C22509BAq bAq = this.A01;
                        AnonymousClass1EC A02 = C22971Dz.A02(A0Q2);
                        C18070vi.A0X(A02);
                        bAq.C7D(A02, userJid, AnonymousClass8BW.A0P(r2), A0Q, A012, A002, i, C196859vl.A00(r2), A04, A1S, A1S2);
                    } catch (AnonymousClass11T e) {
                        Log.e("GetSubgroupInfoProtocolCallbackonSuccess/invalid jid exception", e);
                    }
                }
            }
        }
    }

    public C20967AcL(AnonymousClass190 r1, C22509BAq bAq) {
        this.A01 = bAq;
        this.A00 = r1;
    }

    public void Bt9(C29621ca r3, String str) {
        this.A01.onError(AnonymousClass8BW.A01(r3));
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
