package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.392  reason: invalid class name */
public final class AnonymousClass392 implements C447124m, C447224n, C447324o, C436720l {
    public final AnonymousClass00H A00;

    public AnonymousClass392(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void BdY(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        ((C57202ih) this.A00.get()).A00((AnonymousClass22O) r2);
    }

    public void CQL(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        ((C57202ih) this.A00.get()).A00((AnonymousClass22O) r2);
    }

    public void BL9(AnonymousClass206 r42) {
        Cursor A0A;
        int i;
        AnonymousClass206 r1 = r42;
        C18070vi.A0d(r1, 0);
        C57202ih r7 = (C57202ih) this.A00.get();
        AnonymousClass22J r12 = (AnonymousClass22J) r1;
        AnonymousClass205 r9 = r12.A0v;
        C28781at A04 = r7.A01.get();
        try {
            C23141Ev r11 = ((C28801av) A04).A02;
            String[] strArr = new String[1];
            C17880vN.A1U(strArr, 0, r12.A0x);
            Cursor A0A2 = r11.A0A("SELECT _id, timestamp, video_call, group_jid_row_id, is_joinable_group_call, is_dnd_mode_on, offer_silence_reason FROM missed_call_logs WHERE message_row_id = ? ORDER BY timestamp ASC", "getMessageCallLog/QUERY_MISSED_CALL_LOGS", strArr);
            try {
                if (A0A2.moveToNext()) {
                    String[] strArr2 = new String[1];
                    C17880vN.A1U(strArr2, 0, C17890vO.A06(A0A2, "_id"));
                    A0A = r11.A0A("SELECT _id, jid, call_result FROM missed_call_log_participant WHERE call_logs_row_id = ? ORDER BY _id ASC", "getMessageCallLog/QUERY_MISSED_CALL_LOG_PARTICIPANTS", strArr2);
                    long A06 = C17890vO.A06(A0A2, "_id");
                    long A062 = C17890vO.A06(A0A2, "timestamp");
                    boolean A1R = AnonymousClass000.A1R(C17890vO.A01(A0A2, "video_call"));
                    int A01 = C17890vO.A01(A0A2, "group_jid_row_id");
                    boolean A1R2 = AnonymousClass000.A1R(C17890vO.A01(A0A2, "is_joinable_group_call"));
                    int A012 = C17890vO.A01(A0A2, "is_dnd_mode_on");
                    int columnIndexOrThrow = A0A2.getColumnIndexOrThrow("offer_silence_reason");
                    if (A0A2.isNull(columnIndexOrThrow)) {
                        i = 0;
                    } else {
                        i = A0A2.getInt(columnIndexOrThrow);
                    }
                    ArrayList A13 = AnonymousClass000.A13();
                    while (A0A.moveToNext()) {
                        long A063 = C17890vO.A06(A0A, "_id");
                        UserJid A02 = C22941Dw.A02(C17890vO.A0S(A0A, "jid"));
                        if (C22971Dz.A0Y(A02)) {
                            A13.add(new C178109Bv(A02, C17890vO.A01(A0A, "call_result"), A063));
                        }
                    }
                    C179559Il r4 = C179559Il.A04;
                    C179559Il A002 = C181809Rx.A00(A012);
                    Jid A0B = r7.A00.A0B((long) A01);
                    C36321nh r43 = GroupJid.Companion;
                    GroupJid A003 = C36321nh.A00(A0B);
                    C178119Bw r18 = null;
                    AnonymousClass1BI r44 = r9.A00;
                    UserJid A004 = C22941Dw.A00(r44);
                    if (!C22971Dz.A0d(A004)) {
                        C17900vP.A0X(r44, "CallLog/fromFMessage V1 bad UserJid: ", AnonymousClass000.A10());
                    } else {
                        r18 = new C178119Bw((C59292m4) null, (DeviceJid) null, A003, r12, new C89444cT(0, A004, r9.A01, r9.A02), A002, (AnonymousClass2Q4) null, (C58332kW) null, (String) null, A13, 0, 2, i, 0, A06, A062, 0, A1R, true, A1R2);
                    }
                    A0A.close();
                    A0A2.close();
                    A04.close();
                    if (r18 != null) {
                        List singletonList = Collections.singletonList(r18);
                        List list = r12.A00;
                        list.clear();
                        list.addAll(singletonList);
                        Collections.sort(list, new C21486Akr(45));
                        return;
                    }
                    return;
                }
                A0A2.close();
                A04.close();
                return;
            } catch (Throwable th) {
                if (A0A2 != null) {
                    A0A2.close();
                }
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A04.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }
}
