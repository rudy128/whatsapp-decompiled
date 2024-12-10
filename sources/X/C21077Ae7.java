package X;

import com.whatsapp.infra.graphql.generated.username.UsernameGetResponseImpl;
import com.whatsapp.infra.graphql.generated.username.UsernameSetResponseImpl;
import com.whatsapp.profile.viewmodel.UsernameSetViewModel;

/* renamed from: X.Ae7  reason: case insensitive filesystem */
public final class C21077Ae7 implements C108425bg {
    public final AnonymousClass1PY A00;
    public final C189749jm A01;

    public void BIO(UsernameSetViewModel usernameSetViewModel) {
        A00(usernameSetViewModel, (String) null);
    }

    public void CLI(UsernameSetViewModel usernameSetViewModel, String str) {
        C18070vi.A0d(str, 0);
        A00(usernameSetViewModel, str);
    }

    public C21077Ae7(AnonymousClass1PY r1, C189749jm r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    private final void A00(UsernameSetViewModel usernameSetViewModel, String str) {
        A7K A002 = A7K.A00();
        A002.A07("username", str);
        this.A00.A01(AIj.A00(A002, UsernameSetResponseImpl.class, "UsernameSet")).A04(new C21535Ali(usernameSetViewModel, 44));
    }

    public void BEl(UsernameSetViewModel usernameSetViewModel, String str) {
        C18070vi.A0h(str, usernameSetViewModel);
        this.A01.A00(usernameSetViewModel, str);
    }

    public void Bb8(B9U b9u) {
        this.A00.A01(AIj.A00(A7K.A00(), UsernameGetResponseImpl.class, "UsernameGet")).A04(new C21535Ali(b9u, 41));
    }
}
