package X;

import android.content.ContentValues;

/* renamed from: X.2pY  reason: invalid class name and case insensitive filesystem */
public final class C61362pY {
    public final AnonymousClass1Cd A00;
    public final C18030ve A01;

    public C61362pY(AnonymousClass1Cd r1, C18030ve r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public static final void A00(C28791au r9, String str, long j) {
        ContentValues A08 = C17880vN.A08();
        C17880vN.A19(A08, "lid_row_id", j);
        A08.put("display_name", str);
        C23141Ev r5 = ((C28801av) r9).A02;
        String[] A1Y = C17880vN.A1Y();
        C17880vN.A1V(A1Y, 0, j);
        if (((long) r5.A02(A08, "lid_display_name", "lid_row_id = ?", "LidDisplayNameStore/INSERT_DISPLAY_NAME", A1Y)) <= 0) {
            r5.A09("lid_display_name", "LidDisplayNameStore/INSERT_DISPLAY_NAME", A08, 5);
        }
    }
}
