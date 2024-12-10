package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.1Qv  reason: invalid class name and case insensitive filesystem */
public class C26101Qv extends C26081Qt {
    public final AnonymousClass1LW A00;

    public C26101Qv(AnonymousClass190 r8, AnonymousClass1LW r9, AnonymousClass1DL r10, C22611Cn r11, AnonymousClass1Cd r12, C26071Qs r13) {
        super(r8, r10, r11, r12, r13, 250);
        this.A00 = r9;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.2S4, java.lang.Object] */
    public static C56852i8 A00(C26101Qv r10, AnonymousClass205 r11) {
        String str;
        Cursor A0A;
        C56852i8 r7 = new C56852i8();
        AnonymousClass1BI r1 = r11.A00;
        C17960vV.A07(r1);
        String[] strArr = new String[3];
        strArr[0] = String.valueOf(r10.A00.A09(r1));
        if (r11.A02) {
            str = "1";
        } else {
            str = "0";
        }
        strArr[1] = str;
        strArr[2] = r11.A01;
        C28781at A04 = r10.A04.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT receipt_device_jid_row_id, receipt_device_timestamp FROM message_add_on JOIN message_add_on_receipt_device ON message_add_on._id = message_add_on_receipt_device.message_add_on_row_id WHERE chat_row_id = ? AND from_me = ? AND key_id = ?", "GET_MESSAGE_ADD_ON_DEVICE_RECEIPTS_SQL", strArr);
            int columnIndexOrThrow = A0A.getColumnIndexOrThrow("receipt_device_jid_row_id");
            int columnIndexOrThrow2 = A0A.getColumnIndexOrThrow("receipt_device_timestamp");
            while (A0A.moveToNext()) {
                long j = A0A.getLong(columnIndexOrThrow);
                AnonymousClass1DL r8 = r10.A02;
                DeviceJid deviceJid = (DeviceJid) r8.A0E(DeviceJid.class, j);
                if (deviceJid != null) {
                    long j2 = A0A.getLong(columnIndexOrThrow2);
                    ? obj = new Object();
                    obj.A00 = j2;
                    r7.A00.put(deviceJid, obj);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MessageAddOnReceiptDeviceStore//getmessagedevicereceipts: got a null deviceJid for ");
                    sb.append(r11);
                    sb.append(", deviceJidRowId=");
                    sb.append(j);
                    sb.append(", jid=");
                    sb.append(r8.A0B(j));
                    Log.e(sb.toString());
                }
            }
            A0A.close();
            A04.close();
            return r7;
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
}
