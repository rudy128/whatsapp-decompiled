package X;

import android.database.Cursor;

/* renamed from: X.4RF  reason: invalid class name */
public class AnonymousClass4RF {
    public final AnonymousClass11S A00;
    public final AnonymousClass4PC A01;
    public final AnonymousClass1PT A02;
    public final AnonymousClass1QO A03;
    public final C34811l7 A04;
    public final C36751oP A05;
    public final AnonymousClass00H A06;

    public boolean A00(C54242dp r7, AnonymousClass1BI r8, AnonymousClass206 r9) {
        Cursor cursor;
        if (r7 == null || (cursor = r7.A00) == null || cursor.isClosed() || !cursor.moveToFirst()) {
            return true;
        }
        AnonymousClass206 A0h = C72463Mc.A0h(cursor, r8, this.A06);
        return A0h == null || A0h.A0y < r9.A0y;
    }

    public AnonymousClass4RF(AnonymousClass11S r1, C34811l7 r2, AnonymousClass4PC r3, C36751oP r4, AnonymousClass1PT r5, AnonymousClass1QO r6, AnonymousClass00H r7) {
        this.A00 = r1;
        this.A02 = r5;
        this.A01 = r3;
        this.A06 = r7;
        this.A04 = r2;
        this.A03 = r6;
        this.A05 = r4;
    }
}
