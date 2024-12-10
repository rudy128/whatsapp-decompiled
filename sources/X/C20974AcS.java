package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.AcS  reason: case insensitive filesystem */
public final class C20974AcS implements AnonymousClass1O5 {
    public final C19830z4 A00;
    public final AnonymousClass1OZ A01;
    public final C189359ix A02;

    public void C7Z(C29621ca r12, String str) {
        Set set;
        C18070vi.A0d(r12, 1);
        C29621ca A0I = r12.A0I();
        C18070vi.A0X(A0I);
        C29621ca.A04(A0I, "list");
        if (C18070vi.A18(A0I.A0P("matched"), "false")) {
            C29621ca[] r10 = A0I.A02;
            if (r10 != null) {
                ArrayList A13 = AnonymousClass000.A13();
                for (C29621ca r2 : r10) {
                    C29621ca.A04(r2, "item");
                    Jid A0F = r2.A0F(UserJid.class, "jid");
                    if (A0F != null) {
                        A13.add(A0F);
                    }
                }
                set = C29431cG.A11(A13);
            } else {
                set = C17880vN.A14();
            }
            if (C18070vi.A18(A0I.A0Q("c_dhash", (String) null), this.A00.A0b())) {
                Log.w("BlocklistV2SetProtocolHelper/onSuccess/only dhash mis-match.");
                this.A02.A00(A0I.A0Q("dhash", (String) null), set, false);
                return;
            }
            Log.w("BlocklistV2SetProtocolHelper/onSuccess/dhash and c_dhash mis-match.");
            this.A02.A00((String) null, set, true);
            return;
        }
        this.A02.A00.A02(C29621ca.A02(A0I, "dhash"));
    }

    public void BrD(String str) {
        this.A02.A00.A00();
    }

    public C20974AcS(C189359ix r1, C19830z4 r2, AnonymousClass1OZ r3) {
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r1;
    }

    public void Bt9(C29621ca r3, String str) {
        this.A02.A00.A01(AnonymousClass8BW.A01(r3));
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
