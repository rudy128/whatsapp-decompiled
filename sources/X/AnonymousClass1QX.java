package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteConstraintException;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1QX  reason: invalid class name */
public class AnonymousClass1QX {
    public final AnonymousClass1DL A00;
    public final AnonymousClass1Cd A01;
    public final AnonymousClass1LW A02;
    public final C24751Ln A03;
    public final AnonymousClass1NG A04;

    public static UserJid A00(AnonymousClass1QX r1, UserJid userJid) {
        UserJid A0D;
        if (userJid == null) {
            return null;
        }
        if (r1.A04.A04()) {
            if (!(userJid instanceof PhoneUserJid)) {
                return userJid;
            }
            A0D = r1.A03.A0A((PhoneUserJid) userJid);
        } else if (!(userJid instanceof AnonymousClass1E2)) {
            return userJid;
        } else {
            A0D = r1.A03.A0D((AnonymousClass1E1) userJid);
        }
        if (A0D != null) {
            return A0D;
        }
        return userJid;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:9|(2:11|12)|17|(1:19)|20|21|22|23|24|25|26|27|32) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00fa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass1QX r8, X.AnonymousClass22U r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            long r0 = r9.A0x
            r6 = 0
            r3 = 1
            r5 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r2 = 0
            if (r4 <= 0) goto L_0x000c
            r2 = 1
        L_0x000c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "OrderMessageStore/fillOrderDataIfAvailable/message must have row_id set; key="
            r1.append(r0)
            X.205 r0 = r9.A0v
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C17960vV.A0G(r2, r0)
            java.lang.String[] r2 = new java.lang.String[r3]
            long r0 = r9.A0x
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r5] = r0
            X.1Cd r0 = r8.A01
            X.1at r6 = r0.get()
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x012e }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x012e }
            android.database.Cursor r2 = r0.A0A(r10, r11, r2)     // Catch:{ all -> 0x012e }
            boolean r0 = r2.moveToLast()     // Catch:{ all -> 0x0122 }
            if (r0 == 0) goto L_0x011b
            X.1DL r5 = r8.A00     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "order_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0122 }
            r9.A08 = r0     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "order_title"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0122 }
            r9.A09 = r0     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "item_count"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0122 }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0122 }
            r9.A00 = r0     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "message"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0122 }
            r9.A07 = r0     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "status"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0122 }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0122 }
            r9.A02 = r0     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "surface"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0122 }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0122 }
            r9.A03 = r0     // Catch:{ all -> 0x0122 }
            java.lang.Class<com.whatsapp.jid.UserJid> r4 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "seller_jid"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0122 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0122 }
            com.whatsapp.jid.Jid r0 = r5.A0E(r4, r0)     // Catch:{ all -> 0x0122 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0122 }
            r9.A04 = r0     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "token"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0122 }
            r9.A0A = r0     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "currency_code"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0122 }
            r9.A06 = r0     // Catch:{ all -> 0x0122 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0122 }
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = r9.A06     // Catch:{ IllegalArgumentException -> 0x00da }
            X.A6S r4 = new X.A6S     // Catch:{ IllegalArgumentException -> 0x00da }
            r4.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x00da }
            java.lang.String r0 = "total_amount_1000"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ IllegalArgumentException -> 0x00da }
            long r0 = r2.getLong(r0)     // Catch:{ IllegalArgumentException -> 0x00da }
            java.math.BigDecimal r0 = X.C197309wU.A00(r4, r0)     // Catch:{ IllegalArgumentException -> 0x00da }
            r9.A0B = r0     // Catch:{ IllegalArgumentException -> 0x00da }
            goto L_0x00dd
        L_0x00da:
            r0 = 0
            r9.A06 = r0     // Catch:{ all -> 0x0122 }
        L_0x00dd:
            java.lang.String r0 = "thumbnail"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0122 }
            byte[] r0 = r2.getBlob(r0)     // Catch:{ all -> 0x0122 }
            if (r0 == 0) goto L_0x00ed
            r9.A1G(r0, r12)     // Catch:{ all -> 0x0122 }
        L_0x00ed:
            java.lang.String r0 = "message_version"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ IllegalArgumentException -> 0x00fa }
            int r0 = r2.getInt(r0)     // Catch:{ IllegalArgumentException -> 0x00fa }
            r9.A01 = r0     // Catch:{ IllegalArgumentException -> 0x00fa }
            goto L_0x00fc
        L_0x00fa:
            r9.A01 = r3     // Catch:{ all -> 0x0122 }
        L_0x00fc:
            java.lang.String r0 = "catalog_type"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ IllegalArgumentException -> 0x0109 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ IllegalArgumentException -> 0x0109 }
            r9.A05 = r0     // Catch:{ IllegalArgumentException -> 0x0109 }
            goto L_0x0113
        L_0x0109:
            r1 = move-exception
            java.lang.String r0 = "FMessageOrder/fillOrderData: no catalog type"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = "UNKNOWN"
            r9.A05 = r0     // Catch:{ all -> 0x0122 }
        L_0x0113:
            com.whatsapp.jid.UserJid r0 = r9.A04     // Catch:{ all -> 0x0122 }
            com.whatsapp.jid.UserJid r0 = A00(r8, r0)     // Catch:{ all -> 0x0122 }
            r9.A04 = r0     // Catch:{ all -> 0x0122 }
        L_0x011b:
            r2.close()     // Catch:{ all -> 0x012e }
            r6.close()
            return
        L_0x0122:
            r1 = move-exception
            if (r2 == 0) goto L_0x012d
            r2.close()     // Catch:{ all -> 0x0129 }
            goto L_0x012d
        L_0x0129:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x012e }
        L_0x012d:
            throw r1     // Catch:{ all -> 0x012e }
        L_0x012e:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0133 }
            throw r1
        L_0x0133:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QX.A01(X.1QX, X.22U, java.lang.String, java.lang.String, boolean):void");
    }

    public void A02(AnonymousClass22U r7) {
        C28791au A05;
        try {
            A05 = this.A01.A05();
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_row_id", Long.valueOf(r7.A0x));
            C63432t4.A01(contentValues, "order_id", r7.A08);
            C63432t4.A01(contentValues, "order_title", r7.A09);
            contentValues.put("item_count", Integer.valueOf(r7.A00));
            contentValues.put("message_version", Integer.valueOf(r7.A01));
            contentValues.put("status", Integer.valueOf(r7.A02));
            contentValues.put("surface", Integer.valueOf(r7.A03));
            contentValues.put("catalog_type", r7.A05);
            C63432t4.A01(contentValues, "message", r7.A07);
            UserJid A002 = A00(this, r7.A04);
            if (A002 != null) {
                contentValues.put("seller_jid", Long.valueOf(this.A00.A09(A002)));
            }
            C63432t4.A01(contentValues, "token", r7.A0A);
            if (r7.A0O() != null) {
                C63432t4.A03(contentValues, "thumbnail", r7.A0O().A01());
            }
            String str = r7.A06;
            if (!(str == null || r7.A0B == null)) {
                contentValues.put("currency_code", str);
                contentValues.put("total_amount_1000", Long.valueOf(r7.A0B.multiply(C197309wU.A00).longValue()));
            }
            boolean z = false;
            if (((C28801av) A05).A02.A09("message_order", "INSERT_MESSAGE_ORDER_SQL", contentValues, 5) == r7.A0x) {
                z = true;
            }
            C17960vV.A0H(z, "OrderMessageStore/insertOrUpdateOrderMessage/inserted row should have same row_id");
            A05.close();
            return;
        } catch (SQLiteConstraintException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("OrderMessageStore/insertOrUpdateOrderMessage/fail to insert. Error message is: ");
            sb.append(e);
            Log.e(sb.toString());
            return;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public AnonymousClass1QX(AnonymousClass1LW r1, AnonymousClass1DL r2, AnonymousClass1Cd r3, C24751Ln r4, AnonymousClass1NG r5) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r1;
        this.A03 = r4;
        this.A04 = r5;
    }
}
