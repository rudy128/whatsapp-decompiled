package X;

import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.1Lb  reason: invalid class name and case insensitive filesystem */
public class C24631Lb {
    public final AnonymousClass1Cd A00;

    public C63322ss A00(AnonymousClass206 r10) {
        Cursor A0A;
        C63322ss r3 = new C63322ss(r10);
        if (r10.A0x != -1) {
            try {
                C28781at A04 = this.A00.get();
                try {
                    A0A = ((C28801av) A04).A02.A0A("SELECT duration, campaign_id, first_seen_timestamp, action_link_url, action_link_button_title FROM message_status_psa_campaign WHERE message_row_id = ?", "GET_STATUS_PSA_INFO_FOR_ROW_ID_SQL", new String[]{Long.toString(r10.A0x)});
                    if (A0A != null) {
                        if (A0A.moveToNext()) {
                            int columnIndexOrThrow = A0A.getColumnIndexOrThrow("campaign_id");
                            int columnIndexOrThrow2 = A0A.getColumnIndexOrThrow("duration");
                            int columnIndexOrThrow3 = A0A.getColumnIndexOrThrow("first_seen_timestamp");
                            int columnIndexOrThrow4 = A0A.getColumnIndexOrThrow("action_link_url");
                            int columnIndexOrThrow5 = A0A.getColumnIndexOrThrow("action_link_button_title");
                            r3.A04 = A0A.getString(columnIndexOrThrow);
                            r3.A00 = A0A.getLong(columnIndexOrThrow2);
                            r3.A01 = A0A.getLong(columnIndexOrThrow3);
                            r3.A03 = A0A.getString(columnIndexOrThrow4);
                            r3.A02 = A0A.getString(columnIndexOrThrow5);
                        }
                        A0A.close();
                    }
                    A04.close();
                    return r3;
                } catch (Throwable th) {
                    A04.close();
                    throw th;
                }
            } catch (RuntimeException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("StatusPsaCampaignStore/getStatusPsaInfo ran into CursorWindowAllocationException ");
                sb.append(e.getStackTrace());
                Log.e(sb.toString());
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
        }
        return r3;
        throw th;
    }

    public C24631Lb(AnonymousClass1Cd r1) {
        this.A00 = r1;
    }
}
