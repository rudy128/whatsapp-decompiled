package X;

import android.content.Context;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.6po  reason: invalid class name and case insensitive filesystem */
public final class C133976po {
    public String A00;
    public String A01;
    public String A02 = "BACK";
    public final AnonymousClass1KB A03;
    public final AnonymousClass118 A04;
    public final C18000vb A05;

    public final void A01(Context context, Toolbar toolbar, AnonymousClass86A r10, String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        if (str3 == null) {
            str3 = "BACK";
        }
        this.A02 = str3;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WA Flows :  setFdsBackState - Thread name ");
        C17890vO.A19(A10, Thread.currentThread().getName());
        this.A03.A0J(new C146617Py(this, toolbar, context, r10, 27));
    }

    public final C74743cP A00() {
        if (C18070vi.A18(this.A02, "NONE")) {
            return null;
        }
        C18000vb r3 = this.A05;
        Context context = this.A04.A00;
        int i = 2131233200;
        if (C18070vi.A18(this.A02, "CLOSE")) {
            i = 2131233243;
        }
        return AnonymousClass3NL.A00(context, r3, i);
    }

    public C133976po(AnonymousClass1KB r2, AnonymousClass118 r3, C18000vb r4) {
        C18070vi.A0o(r2, r3, r4);
        this.A03 = r2;
        this.A04 = r3;
        this.A05 = r4;
    }
}
