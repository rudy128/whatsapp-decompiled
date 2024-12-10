package X;

import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1MV  reason: invalid class name */
public class AnonymousClass1MV {
    public final AnonymousClass190 A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1DL A02;
    public final AnonymousClass1Cd A03;
    public final AnonymousClass10I A04;

    public static void A00(AnonymousClass1MV r10, AnonymousClass1E9 r11, String str, Collection collection) {
        C41851xA BD0;
        AnonymousClass1DL r4 = r10.A02;
        long A09 = r4.A09(r11);
        C28791au A05 = r10.A03.A05();
        try {
            BD0 = A05.BD0();
            C60042nI A0D = ((C28801av) A05).A02.A0D(str, "UPDATE_GROUP_PARTICIPANT_DEVICES_SENT_SENDER_KEY_FOR_DEVICE_SQL");
            SQLiteStatement sQLiteStatement = A0D.A00;
            sQLiteStatement.bindLong(1, 1);
            sQLiteStatement.bindLong(3, A09);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                DeviceJid deviceJid = (DeviceJid) it.next();
                sQLiteStatement.bindLong(2, r4.A09(deviceJid));
                UserJid userJid = deviceJid.userJid;
                C17960vV.A0G(!TextUtils.isEmpty(userJid.getRawString()), "participant-user-store/invalid-jid");
                if (r10.A01.A0O(userJid)) {
                    userJid = AnonymousClass1E5.A00;
                }
                sQLiteStatement.bindLong(4, r4.A09(userJid));
                A0D.A00();
            }
            BD0.A00();
            BD0.close();
            A05.close();
            return;
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

    public void A02(C199410f r10, AnonymousClass1E9 r11, UserJid userJid, long j) {
        C28791au A05;
        StringBuilder sb = new StringBuilder();
        sb.append("ParticipantDeviceStore/updateParticipantDevices ");
        sb.append(r11);
        sb.append(" ");
        sb.append(userJid);
        sb.append(" ");
        sb.append(j);
        sb.append(" ");
        sb.append(r10);
        Log.i(sb.toString());
        AnonymousClass1Cd r2 = this.A03;
        C28791au A052 = r2.A05();
        try {
            C41851xA BD1 = A052.BD1();
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ParticipantDeviceStore/deleteParticipantDevices ");
                sb2.append(r11);
                sb2.append(" ");
                sb2.append(j);
                Log.i(sb2.toString());
                long A09 = this.A02.A09(r11);
                A05 = r2.A05();
                C60042nI A0D = ((C28801av) A05).A02.A0D("DELETE FROM group_participant_device WHERE group_participant_row_id IN (SELECT _id FROM group_participant_user WHERE group_jid_row_id = ? AND user_jid_row_id = ?)", "deleteParticipantDevices/DELETE_GROUP_PARTICIPANT_DEVICES_SQL");
                A0D.A00.bindAllArgsAsStrings(new String[]{String.valueOf(A09), String.valueOf(j)});
                int i = 2;
                do {
                    i--;
                } while (i != 0);
                A0D.A00();
                A05.close();
                A01(r10, r11, userJid, j);
                BD1.A00();
                BD1.close();
                A052.close();
                return;
            } catch (Throwable th) {
                BD1.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A052.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public void A03(AnonymousClass1E9 r8) {
        StringBuilder sb = new StringBuilder();
        sb.append("ParticipantDeviceStore/resetSentSenderKeyForAllParticipants ");
        sb.append(r8);
        Log.i(sb.toString());
        long A09 = this.A02.A09(r8);
        C28791au A05 = this.A03.A05();
        try {
            C60042nI A0D = ((C28801av) A05).A02.A0D("UPDATE group_participant_device SET sent_sender_key = ? WHERE group_participant_row_id IN (SELECT _id FROM group_participant_user WHERE group_jid_row_id = ?)", "resetSentSenderKeyForAllParticipants/UPDATE_GROUP_PARTICIPANT_DEVICES_SENT_SENDER_KEY_FOR_GROUP_SQL");
            A0D.A00.bindAllArgsAsStrings(new String[]{"0", String.valueOf(A09)});
            int i = 2;
            do {
                i--;
            } while (i != 0);
            A0D.A00();
            A05.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public AnonymousClass1MV(AnonymousClass190 r1, AnonymousClass11S r2, AnonymousClass1DL r3, AnonymousClass1Cd r4, AnonymousClass10I r5) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
    }

    public void A01(C199410f r12, AnonymousClass1E9 r13, UserJid userJid, long j) {
        C41851xA BD1;
        long j2;
        long j3;
        C17960vV.A0G(!r12.isEmpty(), "ParticipantDeviceStore/addParticipantDevices/empty devices");
        AnonymousClass1DL r4 = this.A02;
        long A09 = r4.A09(r13);
        C28791au A05 = this.A03.A05();
        try {
            BD1 = A05.BD1();
            C60042nI A0D = ((C28801av) A05).A02.A0D("INSERT INTO group_participant_device (group_participant_row_id, device_jid_row_id, sent_sender_key, sent_add_on_sender_key) SELECT _id, ?, ?, ? FROM group_participant_user WHERE group_jid_row_id = ? AND user_jid_row_id = ?", "INSERT_GROUP_PARTICIPANT_DEVICE_SQL");
            SQLiteStatement sQLiteStatement = A0D.A00;
            sQLiteStatement.bindLong(4, A09);
            sQLiteStatement.bindLong(5, j);
            AnonymousClass1IZ it = r12.iterator();
            while (it.hasNext()) {
                C59232ly r6 = (C59232ly) it.next();
                DeviceJid deviceJid = r6.A02;
                if (!deviceJid.userJid.equals(userJid)) {
                    AnonymousClass190 r62 = this.A00;
                    StringBuilder sb = new StringBuilder();
                    sb.append("incorrect device jid ");
                    sb.append(deviceJid);
                    sb.append(" for user ");
                    sb.append(userJid);
                    r62.A0G("ParticipantDeviceStore/incorrect device jid", sb.toString(), false);
                } else {
                    sQLiteStatement.bindLong(1, r4.A09(deviceJid));
                    if (r6.A01) {
                        j2 = 1;
                    } else {
                        j2 = 0;
                    }
                    sQLiteStatement.bindLong(2, j2);
                    if (r6.A00) {
                        j3 = 1;
                    } else {
                        j3 = 0;
                    }
                    sQLiteStatement.bindLong(3, j3);
                    A0D.A01();
                }
            }
            BD1.A00();
            BD1.close();
            A05.close();
            return;
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
