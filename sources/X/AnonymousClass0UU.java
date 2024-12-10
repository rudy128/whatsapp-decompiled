package X;

import java.util.List;

/* renamed from: X.0UU  reason: invalid class name */
public final class AnonymousClass0UU implements C16090rh {
    public static final AnonymousClass0UU A00 = new Object();

    public long BDt(AnonymousClass0Hm r8, C28644ECa eCa) {
        List list = r8.A03;
        AnonymousClass0QY A0e = AnonymousClass000.A0e(AnonymousClass0QY.A03);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0e = AnonymousClass000.A0e(AnonymousClass0QY.A05(A0e.A00, AnonymousClass000.A0f(list, i).A09));
        }
        return AnonymousClass0QY.A03(-eCa.CPQ(64.0f), A0e.A00);
    }
}
