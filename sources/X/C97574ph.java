package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4ph  reason: invalid class name and case insensitive filesystem */
public class C97574ph implements AnonymousClass1O5 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C97574ph(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj;
        this.A02 = obj3;
    }

    public void BrD(String str) {
        if (this.A00 != 0) {
            ((C21132Af0) this.A03).A0C(AnonymousClass4E1.A00);
        } else {
            C17900vP.A0f("GroupXmppMethods/sendGetGroupProfile/onDeliveryFailure; iq=", str, AnonymousClass000.A10());
        }
    }

    public void Bt9(C29621ca r8, String str) {
        C83044Dd r1;
        if (this.A00 != 0) {
            C18070vi.A0d(r8, 1);
            int A09 = r8.A0L("error").A09("code");
            C21132Af0 af0 = (C21132Af0) this.A03;
            C83044Dd[] values = C83044Dd.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    r1 = C83044Dd.A03;
                    break;
                }
                r1 = values[i];
                if (r1.code == A09) {
                    break;
                }
                i++;
            }
            af0.A0C(new C83134Dy(r1));
            return;
        }
        ((C108075b5) this.A03).onError(C60482o6.A00(r8));
    }

    public void C7Z(C29621ca r8, String str) {
        AnonymousClass4DW r1;
        if (this.A00 != 0) {
            C18070vi.A0d(r8, 1);
            boolean A18 = C18070vi.A18(r8.A0G(GroupJid.class, "from"), this.A01);
            C17960vV.A0F(A18, "Group Jid in request and response don't match.");
            if (!A18) {
                ((C21132Af0) this.A03).A0C(AnonymousClass4E0.A00);
                return;
            }
            C29621ca A0L = r8.A0L("cancel_membership_requests").A0L("participant");
            boolean A182 = C18070vi.A18(A0L.A0G(UserJid.class, "jid"), this.A02);
            C17960vV.A0F(A182, "Requester Jid in request and response don't match.");
            if (!A182) {
                ((C21132Af0) this.A03).A0C(AnonymousClass4E0.A00);
            }
            String A0Q = A0L.A0Q("error", (String) null);
            if (A0Q == null) {
                ((C21132Af0) this.A03).A0B(C27621Wu.A00);
                return;
            }
            C21132Af0 af0 = (C21132Af0) this.A03;
            int parseInt = Integer.parseInt(A0Q);
            AnonymousClass4DW[] values = AnonymousClass4DW.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    r1 = AnonymousClass4DW.DEFAULT;
                    break;
                }
                r1 = values[i];
                if (r1.code == parseInt) {
                    break;
                }
                i++;
            }
            af0.A0C(new C83144Dz(r1));
            return;
        }
        C29621ca A0L2 = r8.A0L("picture");
        A0L2.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
        A0L2.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
        A0L2.A0Q("url", (String) null);
        ((C108075b5) this.A03).BvP(A0L2.A01);
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
