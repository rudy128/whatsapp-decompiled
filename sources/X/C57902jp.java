package X;

import com.whatsapp.util.Log;

/* renamed from: X.2jp  reason: invalid class name and case insensitive filesystem */
public final class C57902jp {
    public final AnonymousClass1FL A00;
    public final AnonymousClass1FR A01;
    public final C87884Xl A02;
    public final AnonymousClass1NM A03;
    public final AnonymousClass11Z A04;
    public final AnonymousClass1BI A05;

    public boolean A00() {
        if (this.A03.A02()) {
            Log.w("ExportChatAction/execute/need-sd-card");
            AnonymousClass1FR r2 = this.A01;
            int i = 2131892427;
            if (AnonymousClass11Z.A00()) {
                i = 2131892426;
            }
            r2.BhQ(i);
            return true;
        }
        this.A02.A02(this.A00, this.A01, this.A05);
        return true;
    }

    public C57902jp(AnonymousClass1FL r2, AnonymousClass1FR r3, C87884Xl r4, AnonymousClass1NM r5, AnonymousClass11Z r6, AnonymousClass1BI r7) {
        C18070vi.A0w(r6, r5, r4, r7, r3);
        C18070vi.A0d(r2, 6);
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r4;
        this.A05 = r7;
        this.A01 = r3;
        this.A00 = r2;
    }
}
