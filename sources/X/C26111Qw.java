package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.1Qw  reason: invalid class name and case insensitive filesystem */
public final class C26111Qw {
    public final C26101Qv A00;
    public final C26091Qu A01;
    public final AnonymousClass1Cd A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public C26111Qw(C26101Qv r2, C26091Qu r3, AnonymousClass1Cd r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r2, 4);
        C18070vi.A0d(r6, 5);
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = r6;
    }

    public final Set A03(AnonymousClass205 r2) {
        C18070vi.A0d(r2, 0);
        return A01(this, r2).A05(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(java.util.Set r5) {
        /*
            r4 = this;
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.1Cd r0 = r4.A02
            X.1au r3 = r0.A05()
            X.1xA r2 = r3.BD0()     // Catch:{ all -> 0x0029 }
            X.1Qu r0 = r4.A01     // Catch:{ all -> 0x0022 }
            r0.A09(r5)     // Catch:{ all -> 0x0022 }
            X.1Qv r0 = r4.A00     // Catch:{ all -> 0x0022 }
            r0.A09(r5)     // Catch:{ all -> 0x0022 }
            r2.A00()     // Catch:{ all -> 0x0022 }
            r2.close()     // Catch:{ all -> 0x0029 }
            r3.close()
            return
        L_0x0022:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0029 }
            throw r0     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002b }
        L_0x002b:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26111Qw.A05(java.util.Set):void");
    }

    public static final C26081Qt A00(C26111Qw r1, AnonymousClass206 r2) {
        Object obj;
        if (r2 instanceof C442522s) {
            obj = r1.A04.get();
            C18070vi.A0X(obj);
        } else if (r2 instanceof AnonymousClass212) {
            obj = r1.A00;
        } else {
            obj = r1.A01;
        }
        return (C26081Qt) obj;
    }

    public static final C26081Qt A01(C26111Qw r2, AnonymousClass205 r3) {
        Object obj;
        AnonymousClass206 A05 = ((AnonymousClass1W6) r2.A03.get()).A01.A05(r3);
        if (A05 instanceof C442522s) {
            obj = r2.A04.get();
            C18070vi.A0X(obj);
        } else if (A05 == null) {
            obj = r2.A00;
        } else {
            obj = r2.A01;
        }
        return (C26081Qt) obj;
    }

    public final Set A02(AnonymousClass206 r4) {
        AnonymousClass206 A032 = ((AnonymousClass1W6) this.A03.get()).A01.A03(r4.A0x);
        if (A032 != null) {
            C26091Qu r1 = this.A01;
            AnonymousClass205 r0 = A032.A0v;
            C18070vi.A0W(r0);
            return r1.A05(r0);
        }
        Set A05 = this.A00.A05(r4.A0v);
        C18070vi.A0b(A05);
        return A05;
    }

    public final void A04(DeviceJid deviceJid, AnonymousClass206 r26, long j) {
        String str;
        C28791au A05;
        String str2;
        AnonymousClass206 r5 = r26;
        C26081Qt A002 = A00(this, r5);
        DeviceJid deviceJid2 = deviceJid;
        long j2 = j;
        if (A002 instanceof AnonymousClass2De) {
            C002100z r3 = ((AnonymousClass2De) A002).A00;
            AnonymousClass205 r2 = r5.A0v;
            C18070vi.A0W(r2);
            C56852i8 r22 = (C56852i8) r3.A04(r2);
            if (r22 != null) {
                r22.A00(deviceJid2, j2);
                return;
            }
            return;
        } else if (!r5.A0z && r5.A0x != -1) {
            C56852i8 A012 = A002.A01(r5);
            StringBuilder sb = new StringBuilder();
            String A032 = A002.A03();
            sb.append(A032);
            sb.append("updateDeviceReceiptsForMessage key=");
            AnonymousClass205 r6 = r5.A0v;
            sb.append(r6);
            sb.append("; deviceJid=");
            sb.append(deviceJid2);
            sb.append("; receipt=");
            sb.append(A012.A00.get(deviceJid2));
            sb.append("; timestamp=");
            sb.append(j2);
            Log.i(sb.toString());
            if (A012.A00(deviceJid2, j2)) {
                long A09 = A002.A02.A09(deviceJid2);
                ContentValues contentValues = new ContentValues(3);
                boolean z = A002 instanceof C26091Qu;
                if (z) {
                    str = "message_row_id";
                } else {
                    str = "message_add_on_row_id";
                }
                contentValues.put(str, Long.valueOf(r5.A0x));
                contentValues.put("receipt_device_timestamp", Long.valueOf(j2));
                contentValues.put("receipt_device_jid_row_id", Long.valueOf(A09));
                try {
                    A05 = A002.A04.A05();
                    C23141Ev r9 = ((C28801av) A05).A02;
                    if (z) {
                        str2 = "receipt_device";
                    } else {
                        str2 = "message_add_on_receipt_device";
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append("=? AND ");
                    sb2.append("receipt_device_jid_row_id");
                    sb2.append("=?");
                    String obj = sb2.toString();
                    String[] strArr = {String.valueOf(r5.A0x), String.valueOf(A09)};
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(A032);
                    sb3.append("writeDeviceReceipt/UPDATE_RECEIPT_DEVICE");
                    if (((long) r9.A02(contentValues, str2, obj, sb3.toString(), strArr)) == 0) {
                        contentValues.put("primary_device_version", A002.A05.A00(deviceJid2.userJid));
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(A032);
                        sb4.append("writeDeviceReceipt/INSERT_RECEIPT_DEVICE");
                        if (r9.A05(str2, sb4.toString(), contentValues) == -1) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(A032);
                            sb5.append("writedevicereceipt/replace/failed ");
                            sb5.append(r6);
                            sb5.append(" ");
                            sb5.append(deviceJid2);
                            Log.e(sb5.toString());
                            AnonymousClass190 r32 = A002.A01;
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("key=");
                            sb6.append(r6);
                            sb6.append(" device=");
                            sb6.append(deviceJid2);
                            r32.A0G("ReceiptsMessageStore: replace failed", sb6.toString(), true);
                        }
                    }
                    A05.close();
                    return;
                } catch (SQLiteDatabaseCorruptException e) {
                    Log.e((Throwable) e);
                    A002.A03.A03();
                    return;
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                }
            } else {
                return;
            }
        } else {
            return;
        }
        throw th;
    }
}
