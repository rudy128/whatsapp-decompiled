package X;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: X.6o4  reason: invalid class name and case insensitive filesystem */
public final class C133036o4 {
    public final AnonymousClass1T6 A00;
    public final C200710s A01;
    public final AnonymousClass10I A02;
    public final LinkedHashMap A03 = C17880vN.A13();
    public final LinkedHashSet A04 = C17880vN.A14();
    public final AnonymousClass1G4 A05;
    public final AnonymousClass1G1 A06;
    public final C18030ve A07;

    public final void A00(Uri uri, C83094Du r22) {
        Uri uri2 = uri;
        C18070vi.A0d(uri2, 0);
        AnonymousClass34B A0C = this.A00.A0C(C63722ta.A00(uri2, (C61382pa) null, new AnonymousClass68e(this.A07), new C62022qf(false, false, true), C26551So.A0E, (AnonymousClass73B) null, (String) null, 0, true, false, true), true);
        A0C.A0Z = "mms";
        C145937Ne r0 = new C145937Ne(A0C, this, 0);
        C200710s r2 = this.A01;
        A0C.A07(r0, r2);
        A0C.A0L.A03(new C145937Ne(A0C, this, 1), r2);
        r2.execute(new C21368Aix(this, uri2, A0C, r22, 40));
    }

    public C133036o4(C18030ve r2, AnonymousClass1T6 r3, AnonymousClass10I r4) {
        C18070vi.A0o(r2, r4, r3);
        this.A07 = r2;
        this.A02 = r4;
        this.A00 = r3;
        AnonymousClass1G7 A002 = C34071js.A00((Object) null);
        this.A05 = A002;
        this.A06 = A002;
        this.A01 = C200710s.A00(r4);
    }
}
