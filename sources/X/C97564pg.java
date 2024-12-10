package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.4pg  reason: invalid class name and case insensitive filesystem */
public class C97564pg implements AnonymousClass1O5 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public C97564pg(C75033dN r1, AnonymousClass12M r2, int i, boolean z) {
        this.A00 = i;
        this.A01 = r2;
        if (i != 0) {
            this.A02 = r1;
            this.A03 = z;
        } else {
            this.A03 = z;
            this.A02 = r1;
        }
    }

    public void BrD(String str) {
        String str2;
        if (this.A00 != 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("GroupIqResponseUtil/remove-admin/delivery fail; groupId=");
            str2 = C17890vO.A0V(((C75033dN) this.A02).A03, A10);
        } else {
            str2 = "GroupXmppMethod/Leave group/delivery fail";
        }
        Log.i(str2);
    }

    public void Bt9(C29621ca r3, String str) {
        ((C75033dN) this.A02).CGB(C60482o6.A00(r3));
    }

    public void C7Z(C29621ca r8, String str) {
        C75033dN r1;
        int A0M;
        String str2;
        if (this.A00 != 0) {
            Jid A0F = r8.A0F(AnonymousClass1EC.class, "from");
            if (A0F == null) {
                r1 = (C75033dN) this.A02;
                A0M = 800;
            } else {
                HashMap A11 = C17880vN.A11();
                HashMap A112 = C17880vN.A11();
                if (this.A03) {
                    str2 = "admin";
                } else {
                    str2 = "demote";
                }
                C20060A5j.A02(r8, str2, A11, A112);
                AnonymousClass126 r2 = (AnonymousClass126) ((AnonymousClass12M) this.A01).A06.get();
                StringBuilder A10 = AnonymousClass000.A10();
                C17890vO.A1A(A10, C72483Me.A0X(A0F, "groupmgr/onDemoteGroupParticipants/", A10, A11, A112));
                if (A112.size() > 0) {
                    r2.A0O(3004, A112);
                }
                ((C75033dN) this.A02).run();
                return;
            }
        } else {
            C29621ca A0K = r8.A0K("leave");
            if (A0K != null) {
                ArrayList A13 = AnonymousClass000.A13();
                List<C29621ca> A0R = A0K.A0R("group");
                ArrayList A132 = AnonymousClass000.A13();
                for (C29621ca r5 : A0R) {
                    String A0Q = r5.A0Q("error", (String) null);
                    Jid A0F2 = r5.A0F(AnonymousClass1EC.class, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    if (A0Q == null) {
                        A13.add(A0F2);
                    } else {
                        A132.add(C17890vO.A0E(A0F2, Integer.parseInt(A0Q)));
                    }
                }
                if (A13.size() > 0) {
                    ((AnonymousClass126) ((AnonymousClass12M) this.A01).A06.get()).A0h(A13, this.A03);
                }
                if (A132.size() == 1) {
                    r1 = (C75033dN) this.A02;
                    A0M = AnonymousClass000.A0M(((Pair) A132.get(0)).second);
                }
            }
            ((C75033dN) this.A02).run();
            return;
        }
        r1.CGB(A0M);
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
