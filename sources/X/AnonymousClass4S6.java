package X;

import com.whatsapp.ListItemWithLeftIcon;

/* renamed from: X.4S6  reason: invalid class name */
public final class AnonymousClass4S6 {
    public final AnonymousClass1KB A00;
    public final AnonymousClass1Nb A01;
    public final AnonymousClass10I A02;
    public final C88534a3 A03;

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.02h] */
    public final void A00(AnonymousClass01E r9, ListItemWithLeftIcon listItemWithLeftIcon, AnonymousClass1BI r11) {
        AnonymousClass1BI r5 = r11;
        C18070vi.A0j(listItemWithLeftIcon, r11);
        if (A01()) {
            this.A02.CGF(new AnonymousClass3C5(this, r11, new C91274fQ(new C91264fP(listItemWithLeftIcon, 12), this, 1), 26));
            listItemWithLeftIcon.setOnClickListener(new AnonymousClass48k(r9, r9.CDw(new C91064f5(r11, this, listItemWithLeftIcon, 1), new Object()), r5, this, 5));
        }
    }

    public final boolean A01() {
        C88534a3 r1 = this.A03;
        if (r1.A09()) {
            if (!C18020vd.A05(C18040vf.A02, r1.A01, 9215)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass4S6(AnonymousClass1KB r1, AnonymousClass1Nb r2, AnonymousClass10I r3, C88534a3 r4) {
        C18070vi.A0s(r1, r3, r4, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }
}
