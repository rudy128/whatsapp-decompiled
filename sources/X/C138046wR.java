package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.6wR  reason: invalid class name and case insensitive filesystem */
public final class C138046wR {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public static final void A00(Activity activity, Uri uri, AnonymousClass1BI r6, int i) {
        C139416yo r1 = new C139416yo(activity);
        r1.A00 = 1;
        r1.A0D = r6.getRawString();
        r1.A01 = i;
        r1.A0S = true;
        r1.A0P = true;
        r1.A0I = AnonymousClass1ZU.A05(uri);
        r1.A0R = true;
        r1.A02 = 37;
        Intent A012 = r1.A01();
        A012.putExtra("disable_shared_activity_transition_animation", true);
        activity.startActivity(A012);
    }

    public C138046wR(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
