package X;

import android.app.Activity;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;

/* renamed from: X.2Uq  reason: invalid class name and case insensitive filesystem */
public abstract class C50492Uq {
    public static final Uri A00(Activity activity, C25181Nf r12, AnonymousClass6GM r13, AnonymousClass206 r14, boolean z) {
        File A0C;
        AnonymousClass206 r10 = r14;
        C29681ch r4 = (C29681ch) r14.A0v.A00;
        if (r4 != null) {
            AnonymousClass1E7 A01 = r12.A01(r4);
            C20947Ac1 ac1 = new C20947Ac1(r4, AnonymousClass9Id.UPDATE_CARD, "", "", (int) r14.A0y);
            Activity activity2 = activity;
            C18070vi.A0d(activity, 0);
            AnonymousClass72S A012 = r13.A01(activity2, A01, r10, ac1, z);
            if (!(A012 == null || (A0C = A012.A0C()) == null)) {
                return FileProvider.A00(activity2, A0C, C19620yd.A06);
            }
        }
        return null;
    }
}
