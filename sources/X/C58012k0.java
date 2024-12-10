package X;

import com.whatsapp.util.Log;

/* renamed from: X.2k0  reason: invalid class name and case insensitive filesystem */
public final class C58012k0 {
    public final AnonymousClass1MZ A00;
    public final C18030ve A01;
    public final AnonymousClass18K A02;
    public final C25241Nl A03;
    public final AnonymousClass1PU A04;
    public final AnonymousClass1CJ A05;
    public final C24901Mc A06;

    public final boolean A00(AnonymousClass1EC r5, boolean z, boolean z2) {
        String str;
        AnonymousClass1CJ r3 = this.A05;
        if (AnonymousClass1CJ.A00(r3, r5) == null) {
            Log.i("NotificationHighlightUtils/skipping as chat is not in cache");
            return false;
        }
        int A062 = r3.A06(r5);
        if (A062 != 0 && A062 != 2 && A062 != 6) {
            str = "NotificationHighlightUtils/group type not eligible";
        } else if (r3.A0Q(r5)) {
            str = "NotificationHighlightUtils/archived";
        } else if (r3.A0S(r5)) {
            str = "NotificationHighlightUtils/locked";
        } else if (this.A06.A09(r5, z)) {
            str = "NotificationHighlightUtils/block-add footer";
        } else if (z2 || this.A00.A0J(r5)) {
            return true;
        } else {
            str = "NotificationHighlightUtils/not participant";
        }
        Log.i(str);
        return false;
    }

    public C58012k0(AnonymousClass1CJ r1, AnonymousClass1MZ r2, C18030ve r3, AnonymousClass18K r4, C25241Nl r5, C24901Mc r6, AnonymousClass1PU r7) {
        C18070vi.A0w(r3, r1, r4, r6, r7);
        C18070vi.A0l(r5, r2);
        this.A01 = r3;
        this.A05 = r1;
        this.A02 = r4;
        this.A06 = r6;
        this.A04 = r7;
        this.A03 = r5;
        this.A00 = r2;
    }
}
