package X;

import android.database.Cursor;
import java.util.List;

/* renamed from: X.8ux  reason: invalid class name and case insensitive filesystem */
public class C173368ux extends A3R {
    public final C25161Nd A00;
    public final C22621Co A01;
    public final AnonymousClass1CJ A02;
    public final C19959A0q A03;
    public final C47632Jd A04;
    public final AnonymousClass1Nb A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass122 A07;
    public final AnonymousClass00H A08;

    public static void A00(C173368ux r15, AnonymousClass1BI r16, List list, long j) {
        AnonymousClass1BI r9 = r16;
        long A072 = r15.A02.A07(r9);
        AnonymousClass122 r8 = r15.A07;
        AnonymousClass11P r3 = r15.A06;
        C54242dp BUp = r8.BUp(r9, 100, A072, AnonymousClass11P.A01(r3));
        try {
            Cursor cursor = BUp.A00;
            if (cursor != null) {
                if (cursor.moveToFirst()) {
                    do {
                        AnonymousClass206 A022 = C17880vN.A0c(r15.A08).A02(cursor, r9);
                        if (A022 != null && A022.A0x != A072 && !A022.A0v.A02 && A022.A0G >= AnonymousClass11P.A01(r3) - j) {
                            list.add(A022);
                        }
                    } while (cursor.moveToNext());
                }
                cursor.close();
            }
        } catch (Throwable th) {
            Cursor cursor2 = BUp.A00;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    public C173368ux(C25161Nd r1, AnonymousClass11P r2, C22621Co r3, AnonymousClass1CJ r4, AnonymousClass122 r5, C19959A0q a0q, C47632Jd r7, AnonymousClass1Nb r8, AnonymousClass00H r9) {
        this.A06 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A07 = r5;
        this.A08 = r9;
        this.A05 = r8;
        this.A00 = r1;
        this.A04 = r7;
        this.A03 = a0q;
    }
}
