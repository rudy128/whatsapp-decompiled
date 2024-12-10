package X;

import android.content.Context;
import android.net.Uri;
import java.util.Set;

/* renamed from: X.7Bi  reason: invalid class name and case insensitive filesystem */
public final class C142927Bi implements AnonymousClass86P {
    public final /* synthetic */ AnonymousClass1KB A00;
    public final /* synthetic */ AnonymousClass11C A01;
    public final /* synthetic */ AnonymousClass6Go A02;

    public void Bwf(String str) {
        String str2 = str;
        C18070vi.A0d(str, 2);
        boolean A0V = AnonymousClass1YF.A0V(C124326Xx.A00(str), "…");
        AnonymousClass6Go r5 = this.A02;
        r5.A0P();
        AnonymousClass206 r2 = ((AnonymousClass6Gn) r5).A07;
        Context A0J = r5.A0J();
        String A0w = C108955ca.A0w(r2);
        AnonymousClass1L8 r4 = r5.A00;
        Set BX2 = r5.A02.BX2(r2.A0H(), r2, str);
        boolean z = true;
        if (r5.A03.A0E(Uri.parse(str)) == 1) {
            z = false;
        }
        C137406vP.A00(A0J, r4, r5, str2, A0w, BX2, A0V, z);
    }

    public C142927Bi(AnonymousClass1KB r1, AnonymousClass11C r2, AnonymousClass6Go r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
