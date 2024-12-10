package X;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.2Df  reason: invalid class name */
public final class AnonymousClass2Df extends C24801Ls {
    public final AnonymousClass1CO A00;
    public final AnonymousClass00H A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2Df(AnonymousClass190 r7, AnonymousClass118 r8, AnonymousClass1Cb r9, AnonymousClass1CO r10, AnonymousClass00H r11) {
        super(r8.A00, r7, r9, "account_switcher.db", 4);
        C18070vi.A0o(r8, r7, r10);
        C18070vi.A0g(r11, 4, r9);
        this.A00 = r10;
        this.A01 = r11;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C18070vi.A0d(sQLiteDatabase, 0);
        sQLiteDatabase.execSQL("CREATE TABLE notifications (account_lid TEXT NOT NULL, notification_type TEXT NOT NULL, sender_jid TEXT NOT NULL, group_jid TEXT DEFAULT '' NOT NULL, call_id TEXT DEFAULT '' NOT NULL, call_status INTEGER DEFAULT 0 NOT NULL, timestamp INTEGER NOT NULL, display_name TEXT DEFAULT '' NOT NULL, count INTEGER DEFAULT 1 NOT NULL, sender_pn_jid TEXT DEFAULT '' NOT NULL, PRIMARY KEY(account_lid, sender_jid, notification_type, call_id, call_status, group_jid))");
    }

    public C23141Ev A09() {
        String databaseName = getDatabaseName();
        return AnonymousClass1Eu.A03(super.A04(), (AnonymousClass1CP) this.A01.get(), this.A00, databaseName);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r3, int r4, int r5) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountSwitcherDbHelper/upgrading db from "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " to "
            X.C17900vP.A0j(r0, r1, r5)
            r1 = 4
            if (r5 != r1) goto L_0x004c
            r0 = 2
            if (r4 >= r0) goto L_0x0046
            java.lang.String r0 = "AccountSwitcherDbHelper/processing db upgrade from 1 to 2"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r3 == 0) goto L_0x0028
            java.lang.String r0 = "DROP TABLE IF EXISTS notifications"
            r3.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE notifications (account_lid TEXT NOT NULL, notification_type TEXT NOT NULL, sender_jid TEXT NOT NULL, group_jid TEXT DEFAULT '' NOT NULL, call_id TEXT DEFAULT '' NOT NULL, call_status INTEGER DEFAULT 0 NOT NULL, timestamp INTEGER NOT NULL, display_name TEXT DEFAULT '' NOT NULL, count INTEGER DEFAULT 1 NOT NULL, sender_pn_jid TEXT DEFAULT '' NOT NULL, PRIMARY KEY(account_lid, sender_jid, notification_type, call_id, call_status, group_jid))"
            r3.execSQL(r0)
        L_0x0028:
            java.lang.String r0 = "AccountSwitcherDbHelper/processing db upgrade from 2 to 3"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r3 == 0) goto L_0x0034
            java.lang.String r0 = "ALTER TABLE notifications ADD COLUMN display_name TEXT DEFAULT '' NOT NULL"
            r3.execSQL(r0)
        L_0x0034:
            java.lang.String r0 = "AccountSwitcherDbHelper/processing db upgrade from 3 to 4"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r3 == 0) goto L_0x0045
            java.lang.String r0 = "ALTER TABLE notifications ADD COLUMN count INTEGER DEFAULT 1 NOT NULL"
            r3.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE notifications ADD COLUMN sender_pn_jid TEXT DEFAULT '' NOT NULL"
            r3.execSQL(r0)
        L_0x0045:
            return
        L_0x0046:
            r0 = 3
            if (r4 < r0) goto L_0x0028
            if (r4 >= r1) goto L_0x0045
            goto L_0x0034
        L_0x004c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown upgrade destination version: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " -> "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r5)
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Df.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
