package X;

import android.database.Cursor;

/* renamed from: X.1Qb  reason: invalid class name and case insensitive filesystem */
public class C25901Qb {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1Cd A01;
    public final AnonymousClass11S A02;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00c2 A[Catch:{ SQLiteConstraintException -> 0x012a, all -> 0x0152 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0123 A[Catch:{ SQLiteConstraintException -> 0x012a, all -> 0x0152 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass00H r18, java.lang.Object r19) {
        /*
            r5 = r19
            java.lang.Object r6 = r18.get()
            X.1Qb r6 = (X.C25901Qb) r6
            X.218 r5 = (X.AnonymousClass218) r5
            long r1 = r5.A0x
            r7 = 0
            r13 = 0
            r4 = 1
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            r2 = 0
            if (r0 <= 0) goto L_0x0016
            r2 = 1
        L_0x0016:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationMessageStore/insertOrUpdateLocationMessage/message must have row_id set; key="
            r1.append(r0)
            X.205 r3 = r5.A0v
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            X.C17960vV.A0G(r2, r0)
            int r0 = r5.A0E()
            r2 = 0
            if (r0 != r4) goto L_0x0034
            r2 = 1
        L_0x0034:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationMessageStore/insertOrUpdateLocationMessage/message in main storage; key="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            X.C17960vV.A0G(r2, r0)
            X.1Cd r0 = r6.A01
            X.1au r12 = r0.A05()
            android.content.ContentValues r15 = new android.content.ContentValues     // Catch:{ all -> 0x0152 }
            r15.<init>()     // Catch:{ all -> 0x0152 }
            long r0 = r5.A0x     // Catch:{ SQLiteConstraintException -> 0x012a }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            java.lang.String r0 = "message_row_id"
            r15.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x012a }
            X.1LW r1 = r6.A00     // Catch:{ SQLiteConstraintException -> 0x012a }
            X.1BI r0 = r3.A00     // Catch:{ SQLiteConstraintException -> 0x012a }
            X.C17960vV.A07(r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            long r0 = r1.A09(r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            java.lang.String r0 = "chat_row_id"
            r15.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x012a }
            double r0 = r5.A00     // Catch:{ SQLiteConstraintException -> 0x012a }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            java.lang.String r0 = "latitude"
            r15.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x012a }
            double r0 = r5.A01     // Catch:{ SQLiteConstraintException -> 0x012a }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            java.lang.String r0 = "longitude"
            r15.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x012a }
            boolean r0 = r5 instanceof X.AnonymousClass21B     // Catch:{ SQLiteConstraintException -> 0x012a }
            java.lang.String r8 = "live_location_sequence_number"
            java.lang.String r9 = "live_location_share_duration"
            java.lang.String r11 = "url"
            java.lang.String r10 = "place_address"
            java.lang.String r2 = "place_name"
            java.lang.String r3 = "live_location_final_timestamp"
            java.lang.String r6 = "live_location_final_longitude"
            java.lang.String r7 = "live_location_final_latitude"
            if (r0 == 0) goto L_0x00c3
            r1 = r5
            X.21B r1 = (X.AnonymousClass21B) r1     // Catch:{ SQLiteConstraintException -> 0x012a }
            java.lang.String r0 = r1.A01     // Catch:{ SQLiteConstraintException -> 0x012a }
            X.C63432t4.A01(r15, r2, r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            java.lang.String r0 = r1.A00     // Catch:{ SQLiteConstraintException -> 0x012a }
            X.C63432t4.A01(r15, r10, r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            java.lang.String r0 = r1.A02     // Catch:{ SQLiteConstraintException -> 0x012a }
            X.C63432t4.A01(r15, r11, r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            r15.putNull(r9)     // Catch:{ SQLiteConstraintException -> 0x012a }
            r15.putNull(r8)     // Catch:{ SQLiteConstraintException -> 0x012a }
        L_0x00b5:
            r15.putNull(r7)     // Catch:{ SQLiteConstraintException -> 0x012a }
            r15.putNull(r6)     // Catch:{ SQLiteConstraintException -> 0x012a }
            r15.putNull(r3)     // Catch:{ SQLiteConstraintException -> 0x012a }
        L_0x00be:
            int r0 = r5.A02     // Catch:{ SQLiteConstraintException -> 0x012a }
            if (r0 != r4) goto L_0x0106
            goto L_0x0105
        L_0x00c3:
            boolean r0 = r5 instanceof X.AnonymousClass219     // Catch:{ SQLiteConstraintException -> 0x012a }
            if (r0 == 0) goto L_0x00be
            r15.putNull(r2)     // Catch:{ SQLiteConstraintException -> 0x012a }
            r15.putNull(r10)     // Catch:{ SQLiteConstraintException -> 0x012a }
            r15.putNull(r11)     // Catch:{ SQLiteConstraintException -> 0x012a }
            r2 = r5
            X.219 r2 = (X.AnonymousClass219) r2     // Catch:{ SQLiteConstraintException -> 0x012a }
            int r0 = r2.A00     // Catch:{ SQLiteConstraintException -> 0x012a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            r15.put(r9, r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            long r0 = r2.A01     // Catch:{ SQLiteConstraintException -> 0x012a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            r15.put(r8, r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            X.2nL r2 = r2.A02     // Catch:{ SQLiteConstraintException -> 0x012a }
            if (r2 == 0) goto L_0x00b5
            double r0 = r2.A00     // Catch:{ SQLiteConstraintException -> 0x012a }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            r15.put(r7, r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            double r0 = r2.A01     // Catch:{ SQLiteConstraintException -> 0x012a }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            r15.put(r6, r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            long r0 = r2.A05     // Catch:{ SQLiteConstraintException -> 0x012a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            r15.put(r3, r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            goto L_0x00be
        L_0x0105:
            r0 = 0
        L_0x0106:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            java.lang.String r0 = "map_download_status"
            r15.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x012a }
            r0 = r12
            X.1av r0 = (X.C28801av) r0     // Catch:{ SQLiteConstraintException -> 0x012a }
            X.1Ev r2 = r0.A02     // Catch:{ SQLiteConstraintException -> 0x012a }
            java.lang.String r1 = "message_location"
            java.lang.String r0 = "INSERT_MESSAGE_LOCATION_SQL"
            long r6 = r2.A06(r1, r0, r15)     // Catch:{ SQLiteConstraintException -> 0x012a }
            long r1 = r5.A0x     // Catch:{ SQLiteConstraintException -> 0x012a }
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L_0x0124
            r1 = 1
        L_0x0124:
            java.lang.String r0 = "LocationMessageStore/insertOrUpdateLocationMessage/inserted row should have same row_id"
            X.C17960vV.A0H(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x012a }
            goto L_0x014e
        L_0x012a:
            r3 = move-exception
            java.lang.String r0 = "message_row_id"
            r15.remove(r0)     // Catch:{ all -> 0x0152 }
            r0 = r12
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0152 }
            X.1Ev r14 = r0.A02     // Catch:{ all -> 0x0152 }
            java.lang.String r16 = "message_location"
            java.lang.String r17 = "message_row_id = ?"
            java.lang.String[] r2 = new java.lang.String[r4]     // Catch:{ all -> 0x0152 }
            long r0 = r5.A0x     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0152 }
            r2[r13] = r0     // Catch:{ all -> 0x0152 }
            java.lang.String r18 = "UPDATE_MESSAGE_LOCATION_SQL"
            r19 = r2
            int r0 = r14.A02(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0152 }
            if (r0 == r4) goto L_0x014e
            throw r3     // Catch:{ all -> 0x0152 }
        L_0x014e:
            r12.close()
            return
        L_0x0152:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0157 }
            throw r1
        L_0x0157:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25901Qb.A00(X.00H, java.lang.Object):void");
    }

    public void A01(AnonymousClass218 r8) {
        Cursor A0A;
        boolean z = false;
        if (r8.A0x > 0) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("LocationMessageStore/fillLocationInfo/message must have row_id set; key=");
        sb.append(r8.A0v);
        C17960vV.A0G(z, sb.toString());
        String[] strArr = {Long.toString(r8.A0x)};
        C28781at A04 = this.A01.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT latitude, longitude, place_name, place_address, url, live_location_share_duration, live_location_sequence_number, live_location_final_latitude, live_location_final_longitude, live_location_final_timestamp, map_download_status FROM message_location WHERE message_row_id = ?", "GET_LOCATION_MESSAGE_BY_ROW_ID_SQL", strArr);
            if (A0A.moveToNext()) {
                r8.A18(A0A, this.A02);
            }
            A0A.close();
            A04.close();
            return;
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

    public C25901Qb(AnonymousClass11S r1, AnonymousClass1LW r2, AnonymousClass1Cd r3) {
        this.A00 = r2;
        this.A02 = r1;
        this.A01 = r3;
    }
}
