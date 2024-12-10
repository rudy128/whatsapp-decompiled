package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.6wy  reason: invalid class name and case insensitive filesystem */
public final class C138376wy {
    public final AnonymousClass00H A00;
    public final C18030ve A01;
    public final AnonymousClass1LU A02;
    public final AnonymousClass129 A03;

    public static final void A00(Context context, String str) {
        Intent A0G = C108945cZ.A0G("android.intent.action.SEND");
        A0G.setType("text/plain");
        A0G.putExtra("android.intent.extra.TEXT", str);
        A5E.A00().A03().A05(context, Intent.createChooser(A0G, (CharSequence) null));
    }

    public C138376wy(C18030ve r1, AnonymousClass1LU r2, AnonymousClass129 r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = r4;
    }
}
