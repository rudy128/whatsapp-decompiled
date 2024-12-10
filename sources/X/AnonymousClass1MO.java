package X;

import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import java.util.Collections;

/* renamed from: X.1MO  reason: invalid class name */
public class AnonymousClass1MO {
    public C201110w A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass1MP A02;

    public C201110w A00() {
        C201110w r0;
        Cursor A0A;
        synchronized (this) {
            if (this.A00 == null) {
                C28781at A05 = this.A02.get();
                try {
                    A0A = ((C28801av) A05).A02.A0A(C50642Vf.A00, "getDevices/QUERY_DEVICES", (String[]) null);
                    int columnIndexOrThrow = A0A.getColumnIndexOrThrow("device_id");
                    int columnIndexOrThrow2 = A0A.getColumnIndexOrThrow("platform_type");
                    int columnIndexOrThrow3 = A0A.getColumnIndexOrThrow("device_os");
                    int columnIndexOrThrow4 = A0A.getColumnIndexOrThrow("last_active");
                    int columnIndexOrThrow5 = A0A.getColumnIndexOrThrow("login_time");
                    int columnIndexOrThrow6 = A0A.getColumnIndexOrThrow("logout_time");
                    int columnIndexOrThrow7 = A0A.getColumnIndexOrThrow("adv_key_index");
                    int columnIndexOrThrow8 = A0A.getColumnIndexOrThrow("full_sync_required");
                    int columnIndexOrThrow9 = A0A.getColumnIndexOrThrow("place_name");
                    int columnIndexOrThrow10 = A0A.getColumnIndexOrThrow("nickname");
                    int columnIndexOrThrow11 = A0A.getColumnIndexOrThrow("support_bot_user_agent_chat_history");
                    int columnIndexOrThrow12 = A0A.getColumnIndexOrThrow("support_cag_reactions_and_polls_history");
                    int columnIndexOrThrow13 = A0A.getColumnIndexOrThrow("support_recent_sync_chunk_message_tuning");
                    int columnIndexOrThrow14 = A0A.getColumnIndexOrThrow("support_hosted_group_msg");
                    int columnIndexOrThrow15 = A0A.getColumnIndexOrThrow("support_fbid_bot_chat_history");
                    int columnIndexOrThrow16 = A0A.getColumnIndexOrThrow("support_biz_hosted_msg");
                    int columnIndexOrThrow17 = A0A.getColumnIndexOrThrow("support_call_log_history");
                    int columnIndexOrThrow18 = A0A.getColumnIndexOrThrow("inline_initial_hist_sync_payload_enabled");
                    int columnIndexOrThrow19 = A0A.getColumnIndexOrThrow("full_sync_days_limit");
                    int columnIndexOrThrow20 = A0A.getColumnIndexOrThrow("full_sync_size_mb_limit");
                    int columnIndexOrThrow21 = A0A.getColumnIndexOrThrow("storage_quota_mb");
                    int columnIndexOrThrow22 = A0A.getColumnIndexOrThrow("recent_sync_days_limit");
                    int columnIndexOrThrow23 = A0A.getColumnIndexOrThrow("companion_meta_nonce");
                    int columnIndexOrThrow24 = A0A.getColumnIndexOrThrow("support_add_on_history_sync_migration");
                    int columnIndexOrThrow25 = A0A.getColumnIndexOrThrow("support_message_association");
                    C201210x r5 = new C201210x();
                    while (A0A.moveToNext()) {
                        DeviceJid A06 = DeviceJid.Companion.A06(A0A.getString(columnIndexOrThrow));
                        if (A06 != null) {
                            AnonymousClass2RG A002 = AnonymousClass2RG.A00(A0A.getInt(columnIndexOrThrow2));
                            boolean z = false;
                            if (A0A.getInt(columnIndexOrThrow11) == 1) {
                                z = true;
                            }
                            boolean z2 = false;
                            if (A0A.getInt(columnIndexOrThrow12) == 1) {
                                z2 = true;
                            }
                            C62142qr r33 = new C62142qr(Integer.valueOf(AnonymousClass1Eu.A00(A0A, columnIndexOrThrow19, 0)), Integer.valueOf(AnonymousClass1Eu.A00(A0A, columnIndexOrThrow20, 0)), Integer.valueOf(AnonymousClass1Eu.A00(A0A, columnIndexOrThrow21, 0)), Integer.valueOf(AnonymousClass1Eu.A00(A0A, columnIndexOrThrow22, 0)), z, z2, AnonymousClass1Eu.A05(A0A, columnIndexOrThrow13), AnonymousClass1Eu.A05(A0A, columnIndexOrThrow14), AnonymousClass1Eu.A05(A0A, columnIndexOrThrow15), AnonymousClass1Eu.A05(A0A, columnIndexOrThrow16), AnonymousClass1Eu.A05(A0A, columnIndexOrThrow17), AnonymousClass1Eu.A05(A0A, columnIndexOrThrow18), AnonymousClass1Eu.A05(A0A, columnIndexOrThrow24), AnonymousClass1Eu.A05(A0A, columnIndexOrThrow25));
                            String string = A0A.getString(columnIndexOrThrow3);
                            long j = A0A.getLong(columnIndexOrThrow4);
                            long j2 = A0A.getLong(columnIndexOrThrow5);
                            long j3 = A0A.getLong(columnIndexOrThrow6);
                            int i = A0A.getInt(columnIndexOrThrow7);
                            boolean z3 = false;
                            if (1 == A0A.getInt(columnIndexOrThrow8)) {
                                z3 = true;
                            }
                            r5.put(A06, new C88344Zh(r33, A06, A002, string, A0A.getString(columnIndexOrThrow9), A0A.getString(columnIndexOrThrow10), A0A.getString(columnIndexOrThrow23), i, j, j2, j3, z3));
                        }
                    }
                    this.A00 = r5.build();
                    A0A.close();
                    A05.close();
                } catch (Throwable th) {
                    try {
                        A05.close();
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                    }
                    throw th;
                }
            }
            r0 = this.A00;
        }
        return r0;
        throw th;
    }

    public void A01(C199410f r8) {
        C28791au A06 = this.A02.A06();
        try {
            C41851xA BD0 = A06.BD0();
            try {
                synchronized (this) {
                    String[] A0j = C22971Dz.A0j(r8);
                    String join = TextUtils.join(", ", Collections.nCopies(A0j.length, "?"));
                    StringBuilder sb = new StringBuilder();
                    sb.append("device_id IN (");
                    sb.append(join);
                    sb.append(")");
                    ((C28801av) A06).A02.A04("devices", sb.toString(), "removeDevices/DELETE_DEVICES", A0j);
                    BD0.A00();
                    this.A00 = null;
                }
                BD0.close();
                A06.close();
            } catch (Throwable th) {
                BD0.close();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A06.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public AnonymousClass1MO(AnonymousClass190 r7, AnonymousClass11P r8, AnonymousClass118 r9, AnonymousClass1Cb r10, AnonymousClass1CP r11, AnonymousClass1CO r12) {
        this.A01 = r8;
        this.A02 = new AnonymousClass1MP(r9.A00, r7, r10, r11, r12);
    }
}
