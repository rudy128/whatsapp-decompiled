package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.infra.graphql.generated.groups.QueryLinkedGroupInfoResponseImpl;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;

/* renamed from: X.4RI  reason: invalid class name */
public final class AnonymousClass4RI {
    public final AnonymousClass190 A00;
    public final C34511kb A01;
    public final C18030ve A02;
    public final C85104Mc A03;
    public final C22509BAq A04;
    public final AnonymousClass1EC A05;
    public final AnonymousClass1OZ A06;

    public final void A00(GroupJid groupJid) {
        AnonymousClass1OZ r10 = this.A06;
        String A0B = r10.A0B();
        C34511kb r0 = this.A01;
        AnonymousClass1EC r6 = this.A05;
        GroupJid A022 = r0.A02(r6);
        GroupJid groupJid2 = groupJid;
        if (C18020vd.A05(C18040vf.A02, this.A02, 10797)) {
            C85104Mc r5 = this.A03;
            C22509BAq bAq = this.A04;
            AnonymousClass1PY r7 = r5.A01;
            A7K a7k = new A7K();
            GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
            graphQlCallInput.A05("group_jid", groupJid2.getRawString());
            graphQlCallInput.A05("sub_group_jid_hint", C72463Mc.A0n(A022));
            graphQlCallInput.A05("query_context", "LINKED");
            a7k.A04(graphQlCallInput, "input");
            r7.A01(new AIj(a7k, QueryLinkedGroupInfoResponseImpl.class, "QueryLinkedGroupInfo")).A04(new C106175Uv(r5, bAq));
            return;
        }
        ArrayList A13 = AnonymousClass000.A13();
        A13.add(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "sub_group"));
        A13.add(new AnonymousClass1MD((Jid) groupJid2, "jid"));
        if (A022 != null) {
            A13.add(new AnonymousClass1MD((Jid) A022, "sub_group_jid"));
        }
        C29621ca r3 = new C29621ca("query_linked", (AnonymousClass1MD[]) A13.toArray(new AnonymousClass1MD[0]));
        AnonymousClass1MD[] r2 = new AnonymousClass1MD[4];
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B, r2, 0);
        C17880vN.A1Q("xmlns", "w:g2", r2, 1);
        C17890vO.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r2);
        r10.A0I(new C20967AcL(this.A00, this.A04), C29621ca.A00(r6, r3, r2), A0B, 298, 32000);
    }

    public AnonymousClass4RI(AnonymousClass190 r1, C34511kb r2, C18030ve r3, C85104Mc r4, C22509BAq bAq, AnonymousClass1EC r6, AnonymousClass1OZ r7) {
        C18070vi.A0w(r3, r1, r7, r2, r4);
        this.A02 = r3;
        this.A00 = r1;
        this.A06 = r7;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = bAq;
    }
}
