package X;

import android.database.Cursor;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* renamed from: X.49e  reason: invalid class name and case insensitive filesystem */
public class C826449e extends A34 {
    public int A00;
    public long A01 = 1;
    public C54242dp A02;
    public AnonymousClass206 A03;
    public final C87064Ud A04;
    public final AnonymousClass122 A05;
    public final AnonymousClass1QA A06;
    public final AnonymousClass1NJ A07;
    public final AnonymousClass1BI A08;
    public final AnonymousClass1W6 A09;
    public final WeakReference A0A;
    public final AnonymousClass11P A0B;

    public void A0F() {
        C107995ax r2 = (C107995ax) this.A0A.get();
        this.A01 = this.A06.BS5();
        if (r2 != null) {
            r2.BqM(this.A04);
        }
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C107995ax r3 = (C107995ax) this.A0A.get();
        if (r3 != null) {
            r3.BqL(this.A02, this.A03, this.A00);
        }
    }

    public C826449e(C107995ax r3, C87064Ud r4, AnonymousClass11P r5, AnonymousClass122 r6, AnonymousClass1QA r7, AnonymousClass1NJ r8, AnonymousClass1W6 r9) {
        this.A0B = r5;
        this.A07 = r8;
        this.A06 = r7;
        this.A05 = r6;
        this.A09 = r9;
        AnonymousClass1BI r0 = r4.A01.A03;
        C17960vV.A07(r0);
        this.A08 = r0;
        this.A04 = r4;
        this.A0A = AnonymousClass3MW.A0z(r3);
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass1QA r9 = this.A06;
        C87064Ud r8 = this.A04;
        C61482pl BLE = r9.BLE(r8.A00, r8.A01, AnonymousClass000.A1Z(r8.A02, AnonymousClass00R.A00), r8.A03);
        long j = BLE.A01;
        if (j > 0) {
            AnonymousClass122 r13 = this.A05;
            AnonymousClass1BI r7 = this.A08;
            this.A02 = r13.BUp(r7, 100, r13.A0a.A06(r7, 100, j, -1), -1);
            this.A03 = this.A09.A01.A03(j);
            this.A00 = this.A07.A00(C199410f.of(), r7, this.A02.A02, BLE.A02);
            Cursor cursor = this.A02.A00;
            if (cursor != null) {
                this.A02.A00.moveToPosition(Math.max(0, (cursor.getCount() - this.A00) - 50));
            }
        }
        if (this.A01 != 1) {
            return null;
        }
        AnonymousClass1FU.A0X(elapsedRealtime, 300);
        return null;
    }
}
