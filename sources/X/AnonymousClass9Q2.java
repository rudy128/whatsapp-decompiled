package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.infra.graphql.generated.nativecontacts.ContactsBackupQueryResponseImpl;
import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.9Q2  reason: invalid class name */
public abstract class AnonymousClass9Q2 {
    public static final void A00(AnonymousClass11S r3, C19830z4 r4, AnonymousClass1PY r5, C18090vk r6) {
        PhoneUserJid A01 = AnonymousClass11S.A01(r3);
        C18070vi.A0X(A01);
        GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
        graphQlCallInput.A05("jid", A01.getRawString());
        GraphQlCallInput graphQlCallInput2 = new GraphQlCallInput();
        AnonymousClass1IX of = AnonymousClass1IX.of(graphQlCallInput);
        C18070vi.A0X(of);
        graphQlCallInput2.A06("query_input", of);
        AIj.A01(A7K.A01(graphQlCallInput2), r5, ContactsBackupQueryResponseImpl.class, "ContactsBackupQuery").A04(new C22253B0h(r4, r6));
    }
}
