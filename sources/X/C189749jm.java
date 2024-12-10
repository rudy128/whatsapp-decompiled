package X;

import com.whatsapp.infra.graphql.generated.username.UsernameCheckResponseImpl;
import com.whatsapp.profile.viewmodel.UsernameSetViewModel;

/* renamed from: X.9jm  reason: invalid class name and case insensitive filesystem */
public final class C189749jm {
    public final AnonymousClass1PY A00;

    public C189749jm(AnonymousClass1PY r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A00(UsernameSetViewModel usernameSetViewModel, String str) {
        A7K A002 = A7K.A00();
        A002.A07("username", str);
        this.A00.A01(AIj.A00(A002, UsernameCheckResponseImpl.class, "UsernameCheck")).A04(new C21535Ali(usernameSetViewModel, 38));
    }
}
