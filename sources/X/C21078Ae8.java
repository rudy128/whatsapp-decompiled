package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.infra.graphql.generated.username.UsernameSetResponseImpl;
import com.whatsapp.infra.graphql.generated.usync.UsyncQueryResponseImpl;
import com.whatsapp.infra.graphql.generated.usync.calls.XWA2WAUserQueryInput;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.profile.viewmodel.UsernameSetViewModel;

/* renamed from: X.Ae8  reason: case insensitive filesystem */
public final class C21078Ae8 implements C108425bg {
    public final AnonymousClass4bI A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1PY A02;
    public final C189749jm A03;

    public void BIO(UsernameSetViewModel usernameSetViewModel) {
        A00(usernameSetViewModel, (String) null);
    }

    public void Bb8(B9U b9u) {
        PhoneUserJid A002 = AnonymousClass11S.A00(this.A01);
        if (A002 != null) {
            GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
            GraphQlCallInput graphQlCallInput2 = new GraphQlCallInput();
            graphQlCallInput2.A05("jid", A002.getRawString());
            graphQlCallInput.A06("query_input", AnonymousClass8BR.A11(graphQlCallInput2, new XWA2WAUserQueryInput[1], 0));
            C162478Kx.A02(GraphQlCallInput.A02, graphQlCallInput, "INTERACTIVE");
            A7K A012 = A7K.A01(graphQlCallInput);
            A012.A06("include_username", true);
            A012.A06("include_lid", false);
            A012.A06("include_reachability", false);
            this.A02.A01(AIj.A00(A012, UsyncQueryResponseImpl.class, "UsyncQuery")).A04(new C21531Ale(b9u, this, 5));
            return;
        }
        throw AnonymousClass000.A0n("My JID is null");
    }

    public void CLI(UsernameSetViewModel usernameSetViewModel, String str) {
        C18070vi.A0d(str, 0);
        A00(usernameSetViewModel, str);
    }

    public C21078Ae8(AnonymousClass11S r1, AnonymousClass1PY r2, C189749jm r3, AnonymousClass4bI r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = r4;
    }

    private final void A00(UsernameSetViewModel usernameSetViewModel, String str) {
        A7K A002 = A7K.A00();
        A002.A07("username", str);
        this.A02.A01(AIj.A00(A002, UsernameSetResponseImpl.class, "UsernameSet")).A04(new C21535Ali(usernameSetViewModel, 48));
    }

    public void BEl(UsernameSetViewModel usernameSetViewModel, String str) {
        C18070vi.A0h(str, usernameSetViewModel);
        this.A03.A00(usernameSetViewModel, str);
    }
}
