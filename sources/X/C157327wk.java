package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7wk  reason: invalid class name and case insensitive filesystem */
public final class C157327wk extends AnonymousClass11G implements C18090vk {
    public static final C157327wk A00 = new C157327wk();

    public C157327wk() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        List<AnonymousClass6RQ> list = AnonymousClass71I.A05;
        ArrayList A0D = C29351c6.A0D(list);
        for (AnonymousClass6RQ r6 : list) {
            List nCopies = Collections.nCopies(3, new C143327Cy("████", "███████████"));
            C18070vi.A0X(nCopies);
            A0D.add(new C143257Cr(r6, "", C108985cd.A0f(), nCopies, false, true));
        }
        return new C134496qg(A0D, true);
    }
}
