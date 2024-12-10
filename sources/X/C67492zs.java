package X;

import android.database.Cursor;

/* renamed from: X.2zs  reason: invalid class name and case insensitive filesystem */
public final class C67492zs implements AnonymousClass1L0 {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqh() {
    }

    public void Bqi() {
        Cursor A002;
        long j;
        try {
            C53522cf r1 = (C53522cf) this.A04.get();
            AnonymousClass00H r8 = r1.A01;
            String A022 = ((C24621La) r8.get()).A02("JidMapTableTimestampBackFill_sort_id_backfill_completed");
            if (A022 == null || !Boolean.parseBoolean(A022)) {
                AnonymousClass1Cd r4 = ((C24711Lj) r1.A00.get()).A00;
                C28781at A042 = r4.get();
                try {
                    A002 = C23141Ev.A00(((C28801av) A042).A02, "SELECT COUNT(1) as count \nFROM jid_map \nWHERE sort_id IS NULL ", "JidMapStore/TOTAL_ROWS_WITH_NULL_SORT_ID");
                    if (A002.moveToFirst()) {
                        j = C17890vO.A06(A002, "count");
                    } else {
                        j = 0;
                    }
                    A002.close();
                    A042.close();
                    if (j != 0) {
                        A042 = r4.A05();
                        for (int i = 0; ((long) i) < (j / 1000) + 1; i++) {
                            ((C28801av) A042).A02.A0E("UPDATE jid_map\nSET sort_id = lid_row_id\nWHERE lid_row_id IN (\n  SELECT lid_row_id \n  FROM jid_map \n  WHERE sort_id IS NULL \n  LIMIT 1000\n)", "JidMapStore/BACKFILL_SORT_ID_WITH_LIMIT");
                        }
                        A042.close();
                    }
                    ((C24621La) r8.get()).A06("JidMapTableTimestampBackFill_sort_id_backfill_completed", String.valueOf(true));
                } catch (Throwable th) {
                    A042.close();
                    throw th;
                }
            }
            A00(this.A02);
            A00(this.A03);
            A00(this.A08);
            A00(this.A05);
            A00(this.A07);
            A00(this.A00);
            AnonymousClass00H r2 = this.A06;
            A00(r2);
            C17890vO.A0q(C17880vN.A0V(this.A01), 17);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("ChatLidMigrationMidnightDailyCron migrations completed until ");
            r2.get();
            C17890vO.A1A(A10, "update_account_jid_for_pn_chats_conflicting");
            return;
            throw th;
        } catch (AnonymousClass4E2 unused) {
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public C67492zs(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r2, r3, r4, r5, r6);
        C18070vi.A0q(r7, r8, r9);
        C18070vi.A0d(r10, 9);
        this.A03 = r2;
        this.A04 = r3;
        this.A01 = r4;
        this.A02 = r5;
        this.A08 = r6;
        this.A05 = r7;
        this.A06 = r8;
        this.A07 = r9;
        this.A00 = r10;
    }

    public static void A00(AnonymousClass00H r0) {
        ((AnonymousClass4VM) r0.get()).A02();
    }
}
