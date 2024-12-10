package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.1h0  reason: invalid class name and case insensitive filesystem */
public class C32321h0 {
    public final AnonymousClass11P A00;
    public final AnonymousClass1LW A01;
    public final AnonymousClass1DL A02;
    public final AnonymousClass1Cd A03;

    public void A01(AnonymousClass205 r7) {
        AnonymousClass1LW r1 = this.A01;
        AnonymousClass1BI r0 = r7.A00;
        C17960vV.A07(r0);
        String[] strArr = {String.valueOf(r1.A09(r0)), String.valueOf(r7.A02 ? 1 : 0), r7.A01};
        C28791au A05 = this.A03.A05();
        try {
            ((C28801av) A05).A02.A04("receipt_orphaned", "chat_row_id = ? AND from_me = ? AND key_id = ?", "DELETE_ORPHANED_RECEIPTS_SQL", strArr);
            StringBuilder sb = new StringBuilder();
            sb.append("orphanedreceiptstore/deleteOrphanedReceipts key:");
            sb.append(r7);
            Log.i(sb.toString());
            A05.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public ArrayList A00(AnonymousClass205 r19) {
        Cursor A0A;
        ArrayList arrayList = new ArrayList();
        AnonymousClass1LW r1 = this.A01;
        AnonymousClass205 r2 = r19;
        AnonymousClass1BI r0 = r2.A00;
        C17960vV.A07(r0);
        String[] strArr = {String.valueOf(r1.A09(r0)), String.valueOf(r2.A02 ? 1 : 0), r2.A01};
        C28781at A04 = this.A03.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT receipt_device_jid_row_id, receipt_recipient_jid_row_id, status, timestamp FROM receipt_orphaned WHERE chat_row_id = ? AND from_me = ? AND key_id = ? ORDER BY _id ASC", "GET_ORPHANED_RECEIPTS_SQL", strArr);
            int columnIndexOrThrow = A0A.getColumnIndexOrThrow("receipt_device_jid_row_id");
            int columnIndexOrThrow2 = A0A.getColumnIndexOrThrow("receipt_recipient_jid_row_id");
            int columnIndexOrThrow3 = A0A.getColumnIndexOrThrow("status");
            int columnIndexOrThrow4 = A0A.getColumnIndexOrThrow("timestamp");
            while (A0A.moveToNext()) {
                AnonymousClass1DL r10 = this.A02;
                DeviceJid deviceJid = (DeviceJid) r10.A0E(DeviceJid.class, A0A.getLong(columnIndexOrThrow));
                if (deviceJid != null) {
                    arrayList.add(new C59542mT(deviceJid, (UserJid) r10.A0E(UserJid.class, A0A.getLong(columnIndexOrThrow2)), A0A.getInt(columnIndexOrThrow3), A0A.getLong(columnIndexOrThrow4)));
                }
            }
            A0A.close();
            A04.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public C32321h0(AnonymousClass11P r1, AnonymousClass1LW r2, AnonymousClass1DL r3, AnonymousClass1Cd r4) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }
}
