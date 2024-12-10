package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.Jid;

/* renamed from: X.1pf  reason: invalid class name and case insensitive filesystem */
public final class C37511pf {
    public final C37521pg A00;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.1Ly, X.1pg] */
    public C37511pf(C24811Lt r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = new C24861Ly(r2);
    }

    public final synchronized void A01(C61532pq r7) {
        C28791au A06;
        C37521pg r2 = this.A00;
        Jid jid = r7.A01;
        if (jid == null) {
            C17960vV.A0F(false, "setOrUpdateLastEntryPoint/jid is null");
        } else {
            AnonymousClass1Ez r3 = new AnonymousClass1Ez(true);
            r3.A04();
            ContentValues contentValues = new ContentValues(4);
            contentValues.put("jid", jid.getRawString());
            contentValues.put("entry_point_type", r7.A03);
            contentValues.put("entry_point_id", r7.A02);
            contentValues.put("entry_point_time", Long.valueOf(r7.A00));
            try {
                A06 = r2.A00.A06();
                C24861Ly.A05(contentValues, A06, "wa_last_entry_point");
                A06.close();
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("setOrUpdateLastEntryPoint/unable to update entry point for jid ");
                sb.append(jid);
                C17960vV.A09(sb.toString(), e);
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
            r3.A01();
        }
        return;
        throw th;
    }

    public final C61532pq A00(AnonymousClass1BI r14) {
        Cursor A03;
        C61532pq r7;
        C37521pg r0 = this.A00;
        AnonymousClass1Ez r6 = new AnonymousClass1Ez(true);
        r6.A04();
        C28781at A05 = r0.A00.get();
        try {
            A03 = C24861Ly.A03(A05, "SELECT jid, entry_point_type, entry_point_id, entry_point_time FROM wa_last_entry_point WHERE jid = ?", "CONTACT_ENTRY_POINT", new String[]{r14.getRawString()});
            if (A03.moveToNext()) {
                int columnIndexOrThrow = A03.getColumnIndexOrThrow("jid");
                int columnIndexOrThrow2 = A03.getColumnIndexOrThrow("entry_point_type");
                int columnIndexOrThrow3 = A03.getColumnIndexOrThrow("entry_point_id");
                int columnIndexOrThrow4 = A03.getColumnIndexOrThrow("entry_point_time");
                r7 = new C61532pq(Jid.Companion.A02(A03.getString(columnIndexOrThrow)), A03.getString(columnIndexOrThrow2), A03.getString(columnIndexOrThrow3), A03.getLong(columnIndexOrThrow4));
            } else {
                r7 = null;
            }
            A03.close();
            A05.close();
            r6.A01();
            return r7;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }
}
