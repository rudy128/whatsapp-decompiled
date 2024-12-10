package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.util.List;
import java.util.Set;

/* renamed from: X.4QG  reason: invalid class name */
public final class AnonymousClass4QG {
    public final C18030ve A00;
    public final AnonymousClass00H A01;

    public final void A00(AnonymousClass5a0 r25, AnonymousClass1EC r26, List list, Set set) {
        C29621ca r2;
        AnonymousClass1EC r15 = r26;
        List list2 = list;
        int A17 = C18070vi.A17(r15, list2);
        AnonymousClass00H r0 = this.A01;
        String A0T = C17890vO.A0T(r0);
        AnonymousClass1OZ A0U = C17880vN.A0U(r0);
        int size = list2.size();
        C29621ca[] r7 = new C29621ca[size];
        for (int i = 0; i < size; i++) {
            Jid jid = (Jid) list2.get(i);
            if (!set.contains(jid) || !AnonymousClass3MX.A1Z(this.A00)) {
                AnonymousClass1MD[] r02 = new AnonymousClass1MD[A17];
                C17880vN.A1I(jid, "jid", r02, 0);
                r2 = new C29621ca("group", r02);
            } else {
                C29621ca r03 = new C29621ca("hidden_group", new AnonymousClass1MD[0]);
                AnonymousClass1MD[] r1 = new AnonymousClass1MD[A17];
                C17880vN.A1I(jid, "jid", r1, 0);
                r2 = new C29621ca(r03, "group", r1);
            }
            r7[i] = r2;
        }
        AnonymousClass1MD[] r3 = new AnonymousClass1MD[A17];
        C17880vN.A1Q("link_type", "sub_group", r3, 0);
        C29621ca r32 = new C29621ca(new C29621ca("link", r3, r7), "links", (AnonymousClass1MD[]) null);
        AnonymousClass1MD[] r22 = new AnonymousClass1MD[4];
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0T, r22, 0);
        C17880vN.A1Q("xmlns", "w:g2", r22, A17);
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r22, 2);
        C17880vN.A1I(r15, "to", r22, 3);
        C29621ca r12 = new C29621ca(r32, "iq", r22);
        A0U.A0I(new C97534pd(r25), r12, A0T, 301, 32000);
    }

    public AnonymousClass4QG(C18030ve r1, AnonymousClass00H r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
