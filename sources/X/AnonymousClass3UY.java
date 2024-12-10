package X;

import android.content.Intent;
import java.util.ArrayList;

/* renamed from: X.3UY  reason: invalid class name */
public final class AnonymousClass3UY extends AnonymousClass1J2 {
    public AnonymousClass206 A00;
    public String A01;
    public String A02;
    public ArrayList A03;
    public final C22801Dg A04 = new C22801Dg();
    public final AnonymousClass1QB A05;
    public final AnonymousClass1BI A06;
    public final C41731wy A07 = AnonymousClass3MW.A0o();
    public final C41731wy A08 = AnonymousClass3MW.A0o();
    public final C41731wy A09 = AnonymousClass3MW.A0o();
    public final C41731wy A0A = AnonymousClass3MW.A0o();
    public final Intent A0B;
    public final C73103Oz A0C;
    public final C18000vb A0D;

    public final void A0U(String str) {
        C18070vi.A0d(str, 0);
        this.A01 = str;
        this.A03 = C20103A7h.A03(this.A0D, str);
        String str2 = this.A01;
        this.A02 = str2;
        this.A00 = null;
        this.A04.A0F(str2);
    }

    public AnonymousClass3UY(Intent intent, C73103Oz r3, C18000vb r4, AnonymousClass1QB r5, AnonymousClass1BI r6) {
        C18070vi.A0j(r4, r5);
        this.A0D = r4;
        this.A05 = r5;
        this.A06 = r6;
        this.A0B = intent;
        this.A0C = r3;
        String stringExtra = intent.getStringExtra("query");
        if (stringExtra != null) {
            A0U(stringExtra);
        }
    }

    public final void A0T(Integer num) {
        Integer num2;
        int intValue = num.intValue();
        boolean z = true;
        if (intValue == 0 || intValue == 1) {
            num2 = AnonymousClass00R.A00;
        } else {
            num2 = AnonymousClass00R.A01;
        }
        AnonymousClass206 r3 = this.A00;
        if (r3 == null) {
            C73103Oz r2 = this.A0C;
            r3 = null;
            if (!r2.isEmpty()) {
                int count = r2.getCount();
                while (true) {
                    count--;
                    if (-1 < count) {
                        AnonymousClass206 A072 = r2.getItem(count);
                        if (A072 != null) {
                            r3 = A072;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        if (this.A00 != null) {
            z = false;
        }
        C41731wy r22 = this.A0A;
        C34141jz A0B2 = this.A05.A0B(this.A06);
        A0B2.A05(this.A01);
        r22.A0F(new C87064Ud(r3, A0B2, num2, z));
    }
}
