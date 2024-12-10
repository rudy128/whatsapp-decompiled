package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.4gi  reason: invalid class name and case insensitive filesystem */
public class C92074gi implements C72033Kj {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C92074gi(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void Bom() {
        AnonymousClass1FL r2;
        C36531o3 r1;
        String str;
        switch (this.A00) {
            case 0:
                r2 = (AnonymousClass1FL) this.A02;
                r1 = AnonymousClass3MW.A0a(((AnonymousClass3uP) this.A01).A1q);
                str = "about-disappearing-messages";
                break;
            case 1:
                r2 = (AnonymousClass1FL) this.A02;
                r1 = AnonymousClass3MW.A0a(((AnonymousClass3uP) this.A01).A1q);
                str = "report-to-admin";
                break;
            default:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(((C40751vD) ((AnonymousClass4YQ) this.A01).A01.get()).A03());
                ((Context) this.A02).startActivity(intent);
                return;
        }
        r1.A01(r2, str);
    }
}
