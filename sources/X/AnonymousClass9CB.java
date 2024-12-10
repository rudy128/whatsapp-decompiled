package X;

import android.content.ContentValues;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9CB  reason: invalid class name */
public final class AnonymousClass9CB extends C24861Ly {
    public final C24851Lx A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9CB(C24851Lx r2, C24811Lt r3) {
        super(r3);
        C18070vi.A0d(r2, 2);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0048, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004c, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004f, code lost:
        throw r0;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x0034=Splitter:B:14:0x0034, B:18:0x003b=Splitter:B:18:0x003b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0I(com.whatsapp.jid.UserJid r8) {
        /*
            r7 = this;
            r6 = 0
            java.lang.String r5 = A04(r7, r8)
            X.1Lt r0 = r7.A00
            X.1at r4 = r0.get()
            java.lang.String r2 = "SELECT automated_type FROM wa_biz_profiles WHERE jid = ?"
            r3 = 1
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x0049 }
            r1[r6] = r5     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "CONTACT_BUSINESS_AUTOMATED_TYPE"
            android.database.Cursor r2 = X.C24861Ly.A03(r4, r2, r0, r1)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "automated_type"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0042 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x003b
            boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x003b
            int r0 = r2.getInt(r1)     // Catch:{ all -> 0x0042 }
            if (r0 == r3) goto L_0x0034
            r3 = 2
            if (r0 == r3) goto L_0x0034
            r3 = 0
        L_0x0034:
            r2.close()     // Catch:{ all -> 0x0049 }
            r4.close()
            return r3
        L_0x003b:
            r2.close()     // Catch:{ all -> 0x0049 }
            r4.close()
            return r6
        L_0x0042:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0049 }
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9CB.A0I(com.whatsapp.jid.UserJid):int");
    }

    /* JADX WARNING: type inference failed for: r6v36, types: [X.ADD, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02a3, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        X.CDX.A00(r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02a7, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x05a4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:?, code lost:
        X.CDX.A00(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x05a8, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x05ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x05af, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x05b9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x05bd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x05c0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x05c1, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x05c4, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x03e7 A[SYNTHETIC, Splitter:B:225:0x03e7] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0401 A[SYNTHETIC, Splitter:B:233:0x0401] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x045c A[SYNTHETIC, Splitter:B:260:0x045c] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0499  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x04c0 A[SYNTHETIC, Splitter:B:284:0x04c0] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x04da A[SYNTHETIC, Splitter:B:292:0x04da] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x053f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C20044A4n A0J(com.whatsapp.jid.UserJid r22) {
        /*
            r21 = this;
            r7 = 0
            r1 = r22
            if (r22 != 0) goto L_0x000b
            java.lang.String r0 = "contact-mgr-db/cannot get business profile details by null jid"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r7
        L_0x000b:
            r0 = r21
            java.lang.String r18 = A04(r0, r1)
            X.1Lt r0 = r0.A00
            r20 = r0
            X.1at r5 = r20.get()
            java.lang.String r2 = "SELECT _id, jid, email, business_description, address, tag, latitude, longitude, vertical, has_catalog, address_postal_code, address_city_id, address_city_name, commerce_experience, shop_url, cart_enabled, commerce_manager_url, direct_connection_enabled, is_shop_banned, default_postcode, location_name, galaxy_business_enabled, cover_photo_url, cover_photo_id, custom_url, member_since, capi_calling_enabled, is_responsive, postcode_type, price_tier_id, business_blocked_status, survey_sampling_rate, is_offerings_eligible, automated_type, is_typing_indicator_enabled, calling_hidden_entry_points, business_has_shopping_flow FROM wa_biz_profiles WHERE jid = ?"
            java.lang.String[] r1 = X.C108975cc.A1b(r18)     // Catch:{ all -> 0x05be }
            java.lang.String r0 = "CONTACT_BIZ_PROFILES"
            android.database.Cursor r2 = X.C24861Ly.A03(r5, r2, r0, r1)     // Catch:{ all -> 0x05be }
            int r0 = r2.getCount()     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x05b0
            X.A4n r1 = new X.A4n     // Catch:{ all -> 0x05b7 }
            r1.<init>()     // Catch:{ all -> 0x05b7 }
            r8 = 0
            r4 = 1
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x05b7 }
            r11 = 0
            if (r0 == 0) goto L_0x05b0
            X.1Dw r6 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x05b7 }
            r3 = 1
            java.lang.String r0 = r2.getString(r4)     // Catch:{ all -> 0x05b7 }
            com.whatsapp.jid.UserJid r0 = r6.A04(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x05b0
            int r17 = r2.getInt(r8)     // Catch:{ all -> 0x05b7 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x05b7 }
            r1.A09 = r0     // Catch:{ all -> 0x05b7 }
            r0 = 2
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05b7 }
            r1.A0I = r0     // Catch:{ all -> 0x05b7 }
            r0 = 3
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05b7 }
            r1.A0H = r0     // Catch:{ all -> 0x05b7 }
            r0 = 5
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05b7 }
            r1.A0M = r0     // Catch:{ all -> 0x05b7 }
            r6 = 4
            r0 = 10
            java.lang.String r13 = r2.getString(r6)     // Catch:{ all -> 0x05b7 }
            java.lang.String r12 = r2.getString(r0)     // Catch:{ all -> 0x05b7 }
            r9 = 6
            r6 = 7
            r8 = 11
            r0 = 12
            java.lang.String r14 = r2.getString(r8)     // Catch:{ all -> 0x05b7 }
            java.lang.String r15 = r2.getString(r0)     // Catch:{ all -> 0x05b7 }
            boolean r0 = r2.isNull(r9)     // Catch:{ all -> 0x05b7 }
            r8 = 0
            if (r0 == 0) goto L_0x0087
            r10 = r7
            goto L_0x008f
        L_0x0087:
            double r9 = r2.getDouble(r9)     // Catch:{ all -> 0x05b7 }
            java.lang.Double r10 = java.lang.Double.valueOf(r9)     // Catch:{ all -> 0x05b7 }
        L_0x008f:
            boolean r0 = r2.isNull(r6)     // Catch:{ all -> 0x05b7 }
            if (r0 != 0) goto L_0x009d
            double r8 = r2.getDouble(r6)     // Catch:{ all -> 0x05b7 }
            java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch:{ all -> 0x05b7 }
        L_0x009d:
            java.lang.String r0 = ""
            if (r14 != 0) goto L_0x00a2
            r14 = r0
        L_0x00a2:
            if (r15 == 0) goto L_0x00a5
            r0 = r15
        L_0x00a5:
            X.AEG r6 = new X.AEG     // Catch:{ all -> 0x05b7 }
            r6.<init>(r10, r8, r14, r0)     // Catch:{ all -> 0x05b7 }
            X.AEH r0 = new X.AEH     // Catch:{ all -> 0x05b7 }
            r0.<init>(r6, r7, r13, r12)     // Catch:{ all -> 0x05b7 }
            r1.A08 = r0     // Catch:{ all -> 0x05b7 }
            r6 = 8
            boolean r0 = r2.isNull(r6)     // Catch:{ all -> 0x05b7 }
            if (r0 != 0) goto L_0x00bd
            java.lang.String r11 = r2.getString(r6)     // Catch:{ all -> 0x05b7 }
        L_0x00bd:
            r1.A0N = r11     // Catch:{ all -> 0x05b7 }
            r0 = 9
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x05b7 }
            boolean r0 = X.AnonymousClass000.A1T(r0, r4)
            r1.A0W = r0     // Catch:{ all -> 0x05b7 }
            r0 = 13
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05b7 }
            r1.A0E = r0     // Catch:{ all -> 0x05b7 }
            r0 = 36
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x05b7 }
            boolean r0 = X.AnonymousClass000.A1T(r0, r4)
            r1.A0X = r0     // Catch:{ all -> 0x05b7 }
            r0 = 14
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05b7 }
            r1.A0K = r0     // Catch:{ all -> 0x05b7 }
            r0 = 15
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x05b7 }
            boolean r0 = X.AnonymousClass000.A1T(r0, r4)
            r1.A0Z = r0     // Catch:{ all -> 0x05b7 }
            r0 = 16
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05b7 }
            r1.A0F = r0     // Catch:{ all -> 0x05b7 }
            r0 = 17
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x05b7 }
            boolean r0 = X.AnonymousClass000.A1T(r0, r4)
            r1.A0a = r0     // Catch:{ all -> 0x05b7 }
            r0 = 18
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x05b7 }
            boolean r0 = X.AnonymousClass000.A1T(r0, r4)
            r1.A0e = r0     // Catch:{ all -> 0x05b7 }
            r0 = 21
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x05b7 }
            boolean r0 = X.AnonymousClass000.A1T(r0, r4)
            r1.A0b = r0     // Catch:{ all -> 0x05b7 }
            r0 = 24
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05b7 }
            r1.A0G = r0     // Catch:{ all -> 0x05b7 }
            r0 = 25
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05b7 }
            r1.A0J = r0     // Catch:{ all -> 0x05b7 }
            r0 = 26
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x05b7 }
            boolean r0 = X.AnonymousClass000.A1T(r0, r4)
            r1.A0Y = r0     // Catch:{ all -> 0x05b7 }
            r0 = 27
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x05b7 }
            boolean r0 = X.AnonymousClass000.A1T(r0, r4)
            r1.A0d = r0     // Catch:{ all -> 0x05b7 }
            r0 = 32
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == r4) goto L_0x0150
            r3 = 0
        L_0x0150:
            r1.A0c = r3     // Catch:{ all -> 0x05b7 }
            r0 = 34
            boolean r0 = X.AnonymousClass24X.A01(r2, r0)     // Catch:{ all -> 0x05b7 }
            r1.A0f = r0     // Catch:{ all -> 0x05b7 }
            r0 = 30
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x0164
            r1.A0C = r0     // Catch:{ all -> 0x05b7 }
        L_0x0164:
            r0 = 19
            java.lang.String r8 = r2.getString(r0)     // Catch:{ all -> 0x05b7 }
            r0 = 20
            java.lang.String r6 = r2.getString(r0)     // Catch:{ all -> 0x05b7 }
            r0 = 28
            java.lang.String r4 = r2.getString(r0)     // Catch:{ all -> 0x05b7 }
            r3 = 31
            boolean r0 = r2.isNull(r3)     // Catch:{ all -> 0x05b7 }
            if (r0 != 0) goto L_0x0197
            int r9 = r2.getInt(r3)     // Catch:{ all -> 0x05b7 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x05b7 }
            if (r3 != 0) goto L_0x018a
            r3 = 0
            goto L_0x0195
        L_0x018a:
            if (r9 < 0) goto L_0x0191
            r0 = 100
            if (r9 > r0) goto L_0x0191
            goto L_0x0195
        L_0x0191:
            java.lang.Integer r3 = X.AnonymousClass3MY.A0f()     // Catch:{ all -> 0x05b7 }
        L_0x0195:
            r1.A0A = r3     // Catch:{ all -> 0x05b7 }
        L_0x0197:
            r3 = 33
            boolean r0 = r2.isNull(r3)     // Catch:{ all -> 0x05b7 }
            if (r0 != 0) goto L_0x01a5
            int r0 = r2.getInt(r3)     // Catch:{ all -> 0x05b7 }
            r1.A00 = r0     // Catch:{ all -> 0x05b7 }
        L_0x01a5:
            r3 = 35
            boolean r0 = r2.isNull(r3)     // Catch:{ all -> 0x05b7 }
            if (r0 != 0) goto L_0x01b3
            int r0 = r2.getInt(r3)     // Catch:{ all -> 0x05b7 }
            r1.A01 = r0     // Catch:{ all -> 0x05b7 }
        L_0x01b3:
            if (r8 == 0) goto L_0x01be
            if (r6 == 0) goto L_0x01be
            X.ADr r0 = new X.ADr     // Catch:{ all -> 0x05b7 }
            r0.<init>(r8, r6, r4)     // Catch:{ all -> 0x05b7 }
            r1.A03 = r0     // Catch:{ all -> 0x05b7 }
        L_0x01be:
            r0 = 23
            java.lang.String r4 = r2.getString(r0)     // Catch:{ all -> 0x05b7 }
            if (r4 == 0) goto L_0x01d9
            int r0 = r4.length()     // Catch:{ all -> 0x05b7 }
            if (r0 == 0) goto L_0x01d9
            r0 = 22
            java.lang.String r3 = r2.getString(r0)     // Catch:{ all -> 0x05b7 }
            X.AEA r0 = new X.AEA     // Catch:{ all -> 0x05b7 }
            r0.<init>(r4, r7, r7, r3)     // Catch:{ all -> 0x05b7 }
            r1.A05 = r0     // Catch:{ all -> 0x05b7 }
        L_0x01d9:
            if (r16 == 0) goto L_0x05b0
            java.lang.String r0 = java.lang.String.valueOf(r17)     // Catch:{ all -> 0x05b7 }
            java.lang.String[] r4 = X.C108975cc.A1b(r0)     // Catch:{ all -> 0x05b7 }
            X.1at r3 = r20.get()     // Catch:{ all -> 0x05b7 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x05a9 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x05a9 }
            java.lang.String r6 = "SELECT websites FROM wa_biz_profiles_websites WHERE wa_biz_profile_id = ? ORDER BY _id ASC"
            java.lang.String r0 = "CONTACT_BIZ_PROFILES_WEBSITES"
            android.database.Cursor r0 = r8.A0A(r6, r0, r4)     // Catch:{ all -> 0x05a9 }
            if (r0 == 0) goto L_0x0214
            java.util.ArrayList r8 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x05a2 }
        L_0x01fa:
            boolean r6 = r0.moveToNext()     // Catch:{ all -> 0x05a2 }
            if (r6 == 0) goto L_0x0209
            r6 = 0
            java.lang.String r6 = r0.getString(r6)     // Catch:{ all -> 0x05a2 }
            r8.add(r6)     // Catch:{ all -> 0x05a2 }
            goto L_0x01fa
        L_0x0209:
            java.util.List r6 = r1.A0V     // Catch:{ all -> 0x05a2 }
            r6.clear()     // Catch:{ all -> 0x05a2 }
            r6.addAll(r8)     // Catch:{ all -> 0x05a2 }
            r0.close()     // Catch:{ all -> 0x05a9 }
        L_0x0214:
            r3.close()     // Catch:{ all -> 0x05b7 }
            X.1at r3 = r20.get()     // Catch:{ all -> 0x05b7 }
            X.C18070vi.A0b(r3)     // Catch:{ all -> 0x05a9 }
            r0 = 0
            r11 = 1
            java.lang.String[] r8 = new java.lang.String[r11]     // Catch:{ all -> 0x05a9 }
            r8[r0] = r18     // Catch:{ all -> 0x05a9 }
            java.lang.String r6 = "CONTACT_BIZ_PROFILES_HOURS"
            java.lang.String r0 = "SELECT time_zone, hours_note, day_of_week, mode, open_time, close_time, wa_biz_profiles_hours._id FROM wa_biz_profiles INNER JOIN wa_biz_profiles_hours ON (wa_biz_profiles._id = wa_biz_profiles_hours.wa_biz_profile_id) WHERE wa_biz_profiles.jid = ?"
            android.database.Cursor r0 = X.C24861Ly.A03(r3, r0, r6, r8)     // Catch:{ all -> 0x05a9 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x05a9 }
            int r6 = r0.getCount()     // Catch:{ all -> 0x05a2 }
            if (r6 <= 0) goto L_0x02c5
            java.util.ArrayList r12 = X.AnonymousClass8BV.A0w(r0)     // Catch:{ all -> 0x05a2 }
            r10 = r7
            r9 = r7
        L_0x023b:
            boolean r6 = r0.moveToNext()     // Catch:{ all -> 0x05a2 }
            if (r6 == 0) goto L_0x02b8
            boolean r6 = r0.isFirst()     // Catch:{ all -> 0x05a2 }
            if (r6 == 0) goto L_0x0250
            r6 = 0
            java.lang.String r10 = r0.getString(r6)     // Catch:{ all -> 0x05a2 }
            java.lang.String r9 = r0.getString(r11)     // Catch:{ all -> 0x05a2 }
        L_0x0250:
            r6 = 2
            int r15 = r0.getInt(r6)     // Catch:{ all -> 0x05a2 }
            r6 = 3
            int r14 = r0.getInt(r6)     // Catch:{ all -> 0x05a2 }
            r8 = 4
            boolean r6 = r0.isNull(r8)     // Catch:{ all -> 0x05a2 }
            if (r6 == 0) goto L_0x0263
            r13 = r7
            goto L_0x026b
        L_0x0263:
            int r6 = r0.getInt(r8)     // Catch:{ all -> 0x05a2 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x05a2 }
        L_0x026b:
            r8 = 5
            boolean r6 = r0.isNull(r8)     // Catch:{ all -> 0x05a2 }
            if (r6 == 0) goto L_0x0273
            goto L_0x027c
        L_0x0273:
            int r6 = r0.getInt(r8)     // Catch:{ all -> 0x05a2 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x05a2 }
            goto L_0x027d
        L_0x027c:
            r8 = r7
        L_0x027d:
            if (r14 != 0) goto L_0x02af
            if (r13 == 0) goto L_0x0284
            if (r8 == 0) goto L_0x0284
            goto L_0x02af
        L_0x0284:
            r6 = 6
            int r6 = r0.getInt(r6)     // Catch:{ all -> 0x05a2 }
            X.1au r13 = r20.A06()     // Catch:{ Exception -> 0x02a8 }
            java.lang.String r15 = "wa_biz_profiles_hours"
            java.lang.String r14 = "wa_biz_profiles_hours._id = ?"
            java.lang.String[] r8 = new java.lang.String[r11]     // Catch:{ all -> 0x02a1 }
            java.lang.String r16 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x02a1 }
            r6 = 0
            r8[r6] = r16     // Catch:{ all -> 0x02a1 }
            X.C24861Ly.A02(r13, r15, r14, r8)     // Catch:{ all -> 0x02a1 }
            r13.close()     // Catch:{ Exception -> 0x02a8 }
            goto L_0x023b
        L_0x02a1:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x02a3 }
        L_0x02a3:
            r6 = move-exception
            X.CDX.A00(r13, r8)     // Catch:{ Exception -> 0x02a8 }
            throw r6     // Catch:{ Exception -> 0x02a8 }
        L_0x02a8:
            r8 = move-exception
            java.lang.String r6 = "BusinessProfileStore/Error deleting business day config"
            com.whatsapp.util.Log.w(r6, r8)     // Catch:{ all -> 0x05a2 }
            goto L_0x023b
        L_0x02af:
            X.AE8 r6 = new X.AE8     // Catch:{ all -> 0x05a2 }
            r6.<init>(r13, r8, r15, r14)     // Catch:{ all -> 0x05a2 }
            r12.add(r6)     // Catch:{ all -> 0x05a2 }
            goto L_0x023b
        L_0x02b8:
            int r6 = r12.size()     // Catch:{ all -> 0x05a2 }
            if (r6 <= 0) goto L_0x02c5
            X.ADs r6 = new X.ADs     // Catch:{ all -> 0x05a2 }
            r6.<init>(r10, r9, r12)     // Catch:{ all -> 0x05a2 }
            r1.A04 = r6     // Catch:{ all -> 0x05a2 }
        L_0x02c5:
            r0.close()     // Catch:{ all -> 0x05a9 }
            r3.close()     // Catch:{ all -> 0x05b7 }
            X.1at r3 = r20.get()     // Catch:{ all -> 0x05b7 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x05a9 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x05a9 }
            java.lang.String r6 = X.C182129Te.A00     // Catch:{ all -> 0x05a9 }
            java.lang.String r0 = "CONTACT_BIZ_PROFILES_CATEGORIES"
            android.database.Cursor r0 = r8.A0A(r6, r0, r4)     // Catch:{ all -> 0x05a9 }
            if (r0 == 0) goto L_0x030f
            int r6 = r0.getCount()     // Catch:{ all -> 0x05a2 }
            if (r6 <= 0) goto L_0x030c
            java.util.ArrayList r10 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x05a2 }
        L_0x02e8:
            boolean r6 = r0.moveToNext()     // Catch:{ all -> 0x05a2 }
            if (r6 == 0) goto L_0x0304
            r6 = 0
            java.lang.String r9 = r0.getString(r6)     // Catch:{ all -> 0x05a2 }
            java.lang.String r8 = r0.getString(r11)     // Catch:{ all -> 0x05a2 }
            if (r9 == 0) goto L_0x02e8
            if (r8 == 0) goto L_0x02e8
            X.AEQ r6 = new X.AEQ     // Catch:{ all -> 0x05a2 }
            r6.<init>(r9, r8)     // Catch:{ all -> 0x05a2 }
            r10.add(r6)     // Catch:{ all -> 0x05a2 }
            goto L_0x02e8
        L_0x0304:
            java.util.List r6 = r1.A0P     // Catch:{ all -> 0x05a2 }
            r6.clear()     // Catch:{ all -> 0x05a2 }
            r6.addAll(r10)     // Catch:{ all -> 0x05a2 }
        L_0x030c:
            r0.close()     // Catch:{ all -> 0x05a9 }
        L_0x030f:
            r3.close()     // Catch:{ all -> 0x05b7 }
            X.1at r3 = r20.get()     // Catch:{ all -> 0x05b7 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x05a9 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x05a9 }
            java.lang.String r6 = X.C182159Th.A00     // Catch:{ all -> 0x05a9 }
            java.lang.String r0 = "CONTACT_BIZ_PROFILES_SERVICE_AREAS"
            android.database.Cursor r0 = r8.A0A(r6, r0, r4)     // Catch:{ all -> 0x05a9 }
            r6 = 1
            if (r0 == 0) goto L_0x0394
            int r8 = r0.getCount()     // Catch:{ all -> 0x05a2 }
            if (r8 <= 0) goto L_0x0391
            java.util.ArrayList r8 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x05a2 }
        L_0x0330:
            boolean r9 = r0.moveToNext()     // Catch:{ all -> 0x05a2 }
            if (r9 == 0) goto L_0x0389
            r9 = 0
            java.lang.String r14 = r0.getString(r9)     // Catch:{ all -> 0x05a2 }
            boolean r9 = r0.isNull(r6)     // Catch:{ all -> 0x05a2 }
            r13 = 0
            if (r9 == 0) goto L_0x0344
            r12 = r7
            goto L_0x034c
        L_0x0344:
            int r9 = r0.getInt(r6)     // Catch:{ all -> 0x05a2 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x05a2 }
        L_0x034c:
            r10 = 2
            boolean r9 = r0.isNull(r10)     // Catch:{ all -> 0x05a2 }
            if (r9 == 0) goto L_0x0355
            r11 = r7
            goto L_0x035d
        L_0x0355:
            double r9 = r0.getDouble(r10)     // Catch:{ all -> 0x05a2 }
            java.lang.Double r11 = java.lang.Double.valueOf(r9)     // Catch:{ all -> 0x05a2 }
        L_0x035d:
            r10 = 3
            boolean r9 = r0.isNull(r10)     // Catch:{ all -> 0x05a2 }
            if (r9 != 0) goto L_0x036c
            double r9 = r0.getDouble(r10)     // Catch:{ all -> 0x05a2 }
            java.lang.Double r13 = java.lang.Double.valueOf(r9)     // Catch:{ all -> 0x05a2 }
        L_0x036c:
            if (r14 == 0) goto L_0x0330
            if (r12 == 0) goto L_0x0330
            if (r11 == 0) goto L_0x0330
            if (r13 == 0) goto L_0x0330
            int r19 = r12.intValue()     // Catch:{ all -> 0x05a2 }
            double r15 = r11.doubleValue()     // Catch:{ all -> 0x05a2 }
            double r17 = r13.doubleValue()     // Catch:{ all -> 0x05a2 }
            X.AE9 r13 = new X.AE9     // Catch:{ all -> 0x05a2 }
            r13.<init>(r14, r15, r17, r19)     // Catch:{ all -> 0x05a2 }
            r8.add(r13)     // Catch:{ all -> 0x05a2 }
            goto L_0x0330
        L_0x0389:
            java.util.List r6 = r1.A0U     // Catch:{ all -> 0x05a2 }
            r6.clear()     // Catch:{ all -> 0x05a2 }
            r6.addAll(r8)     // Catch:{ all -> 0x05a2 }
        L_0x0391:
            r0.close()     // Catch:{ all -> 0x05a9 }
        L_0x0394:
            r3.close()     // Catch:{ all -> 0x05b7 }
            X.1at r3 = r20.get()     // Catch:{ all -> 0x05b7 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x05a9 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x05a9 }
            java.lang.String r6 = "SELECT country_code FROM wa_biz_profiles_direct_connection_allowed_country_codes WHERE wa_biz_profile_id = ?"
            java.lang.String r0 = "CONTACT_BIZ_PROFILES_DIRECT_CONNECTION_ALLOWED_COUNTRY_CODES"
            android.database.Cursor r0 = r8.A0A(r6, r0, r4)     // Catch:{ all -> 0x05a9 }
            if (r0 == 0) goto L_0x03d7
            int r6 = r0.getCount()     // Catch:{ all -> 0x05a2 }
            if (r6 <= 0) goto L_0x03d7
            java.util.ArrayList r10 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x05a2 }
            r9 = 0
        L_0x03b5:
            boolean r6 = r0.moveToNext()     // Catch:{ all -> 0x05a2 }
            if (r6 == 0) goto L_0x03d0
            java.lang.String r8 = r0.getString(r9)     // Catch:{ all -> 0x05a2 }
            if (r8 == 0) goto L_0x03b5
            java.lang.String r6 = "NULL"
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x05a2 }
            if (r6 == 0) goto L_0x03ca
            goto L_0x03ce
        L_0x03ca:
            r10.add(r8)     // Catch:{ all -> 0x05a2 }
            goto L_0x03b5
        L_0x03ce:
            r6 = 0
            goto L_0x03db
        L_0x03d0:
            r1.A0S = r7     // Catch:{ all -> 0x05a2 }
            java.util.ArrayList r6 = X.C17880vN.A10(r10)     // Catch:{ all -> 0x05a2 }
            goto L_0x03e3
        L_0x03d7:
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x05a2 }
        L_0x03db:
            r1.A0S = r7     // Catch:{ all -> 0x05a2 }
            if (r6 == 0) goto L_0x03e5
            java.util.ArrayList r6 = X.C17880vN.A10(r6)     // Catch:{ all -> 0x05a2 }
        L_0x03e3:
            r1.A0S = r6     // Catch:{ all -> 0x05a2 }
        L_0x03e5:
            if (r0 == 0) goto L_0x03ea
            r0.close()     // Catch:{ all -> 0x05a9 }
        L_0x03ea:
            r3.close()     // Catch:{ all -> 0x05b7 }
            X.1at r3 = r20.get()     // Catch:{ all -> 0x05b7 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x05a9 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x05a9 }
            java.lang.String r6 = X.C182139Tf.A00     // Catch:{ all -> 0x05a9 }
            java.lang.String r0 = "CONTACT_BIZ_PROFILES_TRUST_SIGNALS"
            android.database.Cursor r0 = r8.A0A(r6, r0, r4)     // Catch:{ all -> 0x05a9 }
            r13 = 1
            if (r0 == 0) goto L_0x0446
            int r6 = r0.getCount()     // Catch:{ all -> 0x05a2 }
            if (r6 <= 0) goto L_0x0443
            r12 = 0
        L_0x0408:
            boolean r6 = r0.moveToNext()     // Catch:{ all -> 0x05a2 }
            if (r6 == 0) goto L_0x0443
            r14 = 0
            java.lang.String r11 = r0.getString(r14)     // Catch:{ all -> 0x05a2 }
            int r10 = r0.getInt(r13)     // Catch:{ all -> 0x05a2 }
            r6 = 2
            java.lang.String r9 = r0.getString(r6)     // Catch:{ all -> 0x05a2 }
            r6 = 3
            int r8 = r0.getInt(r6)     // Catch:{ all -> 0x05a2 }
            r6 = 4
            int r6 = r0.getInt(r6)     // Catch:{ all -> 0x05a2 }
            if (r6 != r13) goto L_0x0429
            r14 = 1
        L_0x0429:
            if (r11 == 0) goto L_0x0435
            if (r9 == 0) goto L_0x0435
            X.AEB r6 = new X.AEB     // Catch:{ all -> 0x05a2 }
            r6.<init>(r11, r9, r8, r14)     // Catch:{ all -> 0x05a2 }
            if (r10 != r13) goto L_0x043a
            r7 = r6
        L_0x0435:
            if (r12 != 0) goto L_0x043b
            if (r7 == 0) goto L_0x0408
            goto L_0x043b
        L_0x043a:
            r12 = r6
        L_0x043b:
            X.ADg r6 = new X.ADg     // Catch:{ all -> 0x05a2 }
            r6.<init>(r12, r7)     // Catch:{ all -> 0x05a2 }
            r1.A06 = r6     // Catch:{ all -> 0x05a2 }
            goto L_0x0408
        L_0x0443:
            r0.close()     // Catch:{ all -> 0x05a9 }
        L_0x0446:
            r3.close()     // Catch:{ all -> 0x05b7 }
            X.1at r3 = r20.get()     // Catch:{ all -> 0x05b7 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x05a9 }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x05a9 }
            java.lang.String r6 = "SELECT catalog_feature_type FROM wa_biz_profiles_dc_enabled_features WHERE wa_biz_profile_id = ?"
            java.lang.String r0 = "CONTACT_BIZ_PROFILES_DC_ENABLED_FEATURES"
            android.database.Cursor r0 = r7.A0A(r6, r0, r4)     // Catch:{ all -> 0x05a9 }
            if (r0 == 0) goto L_0x0483
            java.util.ArrayList r8 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x05a2 }
        L_0x0460:
            boolean r6 = r0.moveToNext()     // Catch:{ all -> 0x05a2 }
            if (r6 == 0) goto L_0x0478
            r6 = 0
            java.lang.String r7 = r0.getString(r6)     // Catch:{ all -> 0x05a2 }
            if (r7 == 0) goto L_0x0460
            X.ADD r6 = new X.ADD     // Catch:{ all -> 0x05a2 }
            r6.<init>()     // Catch:{ all -> 0x05a2 }
            r6.A00 = r7     // Catch:{ all -> 0x05a2 }
            r8.add(r6)     // Catch:{ all -> 0x05a2 }
            goto L_0x0460
        L_0x0478:
            java.util.List r6 = r1.A0R     // Catch:{ all -> 0x05a2 }
            r6.clear()     // Catch:{ all -> 0x05a2 }
            r6.addAll(r8)     // Catch:{ all -> 0x05a2 }
            r0.close()     // Catch:{ all -> 0x05a9 }
        L_0x0483:
            r3.close()     // Catch:{ all -> 0x05b7 }
            X.1at r3 = r20.get()     // Catch:{ all -> 0x05b7 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x05a9 }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x05a9 }
            java.lang.String r6 = X.C182149Tg.A00     // Catch:{ all -> 0x05a9 }
            java.lang.String r0 = "CONTACT_BIZ_PROFILES_PRICE_TIER"
            android.database.Cursor r0 = r7.A0A(r6, r0, r4)     // Catch:{ all -> 0x05a9 }
            if (r0 == 0) goto L_0x049a
            goto L_0x049c
        L_0x049a:
            r9 = 0
            goto L_0x04bc
        L_0x049c:
            boolean r6 = r0.moveToNext()     // Catch:{ all -> 0x05a2 }
            if (r6 == 0) goto L_0x049a
            java.lang.String r6 = "_id"
            java.lang.String r8 = X.C17890vO.A0S(r0, r6)     // Catch:{ all -> 0x05a2 }
            X.C18070vi.A0X(r8)     // Catch:{ all -> 0x05a2 }
            java.lang.String r6 = "name"
            java.lang.String r7 = X.C17890vO.A0S(r0, r6)     // Catch:{ all -> 0x05a2 }
            java.lang.String r6 = "symbol"
            java.lang.String r6 = X.C17890vO.A0S(r0, r6)     // Catch:{ all -> 0x05a2 }
            X.ADt r9 = new X.ADt     // Catch:{ all -> 0x05a2 }
            r9.<init>(r8, r7, r6)     // Catch:{ all -> 0x05a2 }
        L_0x04bc:
            r1.A07 = r9     // Catch:{ all -> 0x05a2 }
            if (r0 == 0) goto L_0x04c3
            r0.close()     // Catch:{ all -> 0x05a9 }
        L_0x04c3:
            r3.close()     // Catch:{ all -> 0x05b7 }
            X.1at r3 = r20.get()     // Catch:{ all -> 0x05b7 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x05a9 }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x05a9 }
            java.lang.String r6 = X.C182169Ti.A00     // Catch:{ all -> 0x05a9 }
            java.lang.String r0 = "CONTACT_BIZ_PROFILES_SERVICE_OFFERINGS"
            android.database.Cursor r0 = r7.A0A(r6, r0, r4)     // Catch:{ all -> 0x05a9 }
            r8 = 1
            if (r0 == 0) goto L_0x0522
            int r6 = r0.getCount()     // Catch:{ all -> 0x05a2 }
            if (r6 <= 0) goto L_0x051f
            java.util.ArrayList r7 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x05a2 }
        L_0x04e4:
            boolean r6 = r0.moveToNext()     // Catch:{ all -> 0x05a2 }
            if (r6 == 0) goto L_0x051d
            java.lang.String r6 = "wa_biz_category_service_offerings_id"
            java.lang.String r12 = X.C17890vO.A0S(r0, r6)     // Catch:{ all -> 0x05a2 }
            java.lang.String r6 = "is_offered"
            int r6 = X.C17890vO.A01(r0, r6)     // Catch:{ all -> 0x05a2 }
            boolean r14 = X.AnonymousClass000.A1T(r6, r8)
            java.lang.String r6 = "category_id"
            java.lang.String r11 = X.C17890vO.A0S(r0, r6)     // Catch:{ all -> 0x05a2 }
            java.lang.String r6 = "category_name"
            java.lang.String r10 = X.C17890vO.A0S(r0, r6)     // Catch:{ all -> 0x05a2 }
            java.lang.String r6 = "offering_name"
            java.lang.String r13 = X.C17890vO.A0S(r0, r6)     // Catch:{ all -> 0x05a2 }
            if (r11 == 0) goto L_0x04e4
            if (r10 == 0) goto L_0x04e4
            if (r12 == 0) goto L_0x04e4
            if (r13 == 0) goto L_0x04e4
            X.AEL r9 = new X.AEL     // Catch:{ all -> 0x05a2 }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x05a2 }
            r7.add(r9)     // Catch:{ all -> 0x05a2 }
            goto L_0x04e4
        L_0x051d:
            r1.A0O = r7     // Catch:{ all -> 0x05a2 }
        L_0x051f:
            r0.close()     // Catch:{ all -> 0x05a9 }
        L_0x0522:
            r3.close()     // Catch:{ all -> 0x05b7 }
            X.1at r3 = r20.get()     // Catch:{ all -> 0x05b7 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x05a9 }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x05a9 }
            java.lang.String r6 = "SELECT sub_description, commands, prompts, commands_description, bot_description FROM wa_biz_profiles_bot_attributes WHERE wa_biz_profile_id = ?"
            java.lang.String r0 = "CONTACT_BIZ_PROFILES_BOT_ATTRIBUTES"
            android.database.Cursor r0 = r7.A0A(r6, r0, r4)     // Catch:{ all -> 0x05a9 }
            X.C72453Mb.A1R(r0)     // Catch:{ all -> 0x05a2 }
            boolean r4 = r0.moveToNext()     // Catch:{ all -> 0x05a2 }
            if (r4 == 0) goto L_0x0595
            java.lang.String r4 = "bot_description"
            java.lang.String r4 = X.C17890vO.A0S(r0, r4)     // Catch:{ all -> 0x05a2 }
            r1.A0B = r4     // Catch:{ all -> 0x05a2 }
            java.lang.String r4 = "sub_description"
            java.lang.String r4 = X.C17890vO.A0S(r0, r4)     // Catch:{ all -> 0x05a2 }
            r1.A0L = r4     // Catch:{ all -> 0x05a2 }
            java.lang.String r4 = "commands"
            java.lang.String r4 = X.C17890vO.A0S(r0, r4)     // Catch:{ all -> 0x05a2 }
            java.util.ArrayList r7 = X.C446024b.A01(r4)     // Catch:{ all -> 0x05a2 }
            boolean r4 = X.C17880vN.A1X(r7)     // Catch:{ all -> 0x05a2 }
            if (r4 == 0) goto L_0x056e
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x05a2 }
            r6.addAll(r7)     // Catch:{ all -> 0x05a2 }
            java.util.List r4 = r1.A0Q     // Catch:{ all -> 0x05a2 }
            r4.clear()     // Catch:{ all -> 0x05a2 }
            r4.addAll(r6)     // Catch:{ all -> 0x05a2 }
        L_0x056e:
            java.lang.String r4 = "prompts"
            java.lang.String r4 = X.C17890vO.A0S(r0, r4)     // Catch:{ all -> 0x05a2 }
            java.util.ArrayList r7 = X.AnonymousClass24Y.A01(r4)     // Catch:{ all -> 0x05a2 }
            boolean r4 = X.C17880vN.A1X(r7)     // Catch:{ all -> 0x05a2 }
            if (r4 == 0) goto L_0x058d
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x05a2 }
            r6.addAll(r7)     // Catch:{ all -> 0x05a2 }
            java.util.List r4 = r1.A0T     // Catch:{ all -> 0x05a2 }
            r4.clear()     // Catch:{ all -> 0x05a2 }
            r4.addAll(r6)     // Catch:{ all -> 0x05a2 }
        L_0x058d:
            java.lang.String r4 = "commands_description"
            java.lang.String r4 = X.C17890vO.A0S(r0, r4)     // Catch:{ all -> 0x05a2 }
            r1.A0D = r4     // Catch:{ all -> 0x05a2 }
        L_0x0595:
            r0.close()     // Catch:{ all -> 0x05a9 }
            r3.close()     // Catch:{ all -> 0x05b7 }
            r2.close()     // Catch:{ all -> 0x05be }
            r5.close()
            return r1
        L_0x05a2:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x05a4 }
        L_0x05a4:
            r1 = move-exception
            X.CDX.A00(r0, r4)     // Catch:{ all -> 0x05a9 }
            throw r1     // Catch:{ all -> 0x05a9 }
        L_0x05a9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x05ab }
        L_0x05ab:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x05b7 }
            throw r0     // Catch:{ all -> 0x05b7 }
        L_0x05b0:
            r2.close()     // Catch:{ all -> 0x05be }
            r5.close()
            return r7
        L_0x05b7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x05b9 }
        L_0x05b9:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x05be }
            throw r0     // Catch:{ all -> 0x05be }
        L_0x05be:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x05c0 }
        L_0x05c0:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9CB.A0J(com.whatsapp.jid.UserJid):X.A4n");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0441, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0445, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0448, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0449, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x044c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L(java.util.Map r20) {
        /*
            r19 = this;
            r8 = 0
            android.content.ContentValues r7 = X.C17880vN.A08()
            r6 = r19
            X.1Lt r0 = r6.A00
            X.1au r4 = r0.A06()
            X.1xA r5 = r4.BD0()     // Catch:{ all -> 0x0446 }
            java.util.Iterator r18 = X.AnonymousClass000.A15(r20)     // Catch:{ all -> 0x043f }
        L_0x0015:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x043f }
            r15 = 0
            if (r0 == 0) goto L_0x0435
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r18)     // Catch:{ all -> 0x043f }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x043f }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x043f }
            java.lang.Object r9 = r0.getValue()     // Catch:{ all -> 0x043f }
            X.AEW r9 = (X.AEW) r9     // Catch:{ all -> 0x043f }
            X.A4n r0 = r6.A0J(r1)     // Catch:{ all -> 0x043f }
            if (r0 == 0) goto L_0x003f
            X.AEW r0 = r0.A01()     // Catch:{ all -> 0x043f }
            if (r9 == 0) goto L_0x0042
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x043f }
            if (r0 == 0) goto L_0x0042
            goto L_0x0015
        L_0x003f:
            if (r9 != 0) goto L_0x0042
            goto L_0x0015
        L_0x0042:
            X.C17960vV.A07(r1)     // Catch:{ all -> 0x043f }
            r6.A0K(r1)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = A04(r6, r1)     // Catch:{ all -> 0x043f }
            if (r9 == 0) goto L_0x0015
            r7.clear()     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "jid"
            r7.put(r0, r1)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "tag"
            java.lang.String r0 = r9.A0M     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "address"
            X.AEH r2 = r9.A08     // Catch:{ all -> 0x043f }
            java.lang.String r0 = r2.A03     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "address_postal_code"
            java.lang.String r0 = r2.A02     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "address_city_id"
            X.AEG r2 = r2.A00     // Catch:{ all -> 0x043f }
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "address_city_name"
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "business_description"
            java.lang.String r0 = r9.A0H     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "email"
            java.lang.String r0 = r9.A0I     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "latitude"
            java.lang.Double r0 = r2.A02     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "longitude"
            java.lang.Double r0 = r2.A03     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "vertical"
            java.lang.String r0 = r9.A0N     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "has_catalog"
            boolean r0 = r9.A0Z     // Catch:{ all -> 0x043f }
            X.AnonymousClass8BT.A13(r7, r1, r0)     // Catch:{ all -> 0x043f }
            X.ADs r12 = r9.A04     // Catch:{ all -> 0x043f }
            if (r12 == 0) goto L_0x00b9
            java.lang.String r1 = "time_zone"
            java.lang.String r0 = r12.A01     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "hours_note"
            java.lang.String r0 = r12.A00     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
        L_0x00b9:
            java.lang.String r1 = "commerce_experience"
            java.lang.String r0 = r9.A0E     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "business_has_shopping_flow"
            boolean r0 = r9.A0a     // Catch:{ all -> 0x043f }
            X.AnonymousClass8BT.A13(r7, r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "cart_enabled"
            boolean r0 = r9.A0X     // Catch:{ all -> 0x043f }
            X.AnonymousClass8BT.A13(r7, r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "commerce_manager_url"
            java.lang.String r0 = r9.A0F     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "direct_connection_enabled"
            boolean r0 = r9.A0Y     // Catch:{ all -> 0x043f }
            X.AnonymousClass8BT.A13(r7, r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "is_shop_banned"
            boolean r0 = r9.A0f     // Catch:{ all -> 0x043f }
            X.AnonymousClass8BT.A13(r7, r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "is_responsive"
            boolean r0 = r9.A0d     // Catch:{ all -> 0x043f }
            X.AnonymousClass8BT.A13(r7, r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "business_blocked_status"
            java.lang.String r0 = r9.A0C     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            X.ADr r2 = r9.A03     // Catch:{ all -> 0x043f }
            if (r2 == 0) goto L_0x010a
            java.lang.String r1 = "default_postcode"
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "location_name"
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "postcode_type"
            java.lang.String r0 = r2.A02     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
        L_0x010a:
            java.lang.String r1 = "galaxy_business_enabled"
            boolean r0 = r9.A0b     // Catch:{ all -> 0x043f }
            X.AnonymousClass8BT.A13(r7, r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "custom_url"
            java.lang.String r0 = r9.A0G     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            X.AEA r2 = r9.A05     // Catch:{ all -> 0x043f }
            if (r2 == 0) goto L_0x012a
            java.lang.String r1 = "cover_photo_url"
            java.lang.String r0 = r2.A03     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "cover_photo_id"
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
        L_0x012a:
            java.lang.String r1 = "member_since"
            java.lang.String r0 = r9.A0J     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "capi_calling_enabled"
            boolean r0 = r9.A0W     // Catch:{ all -> 0x043f }
            X.AnonymousClass8BT.A13(r7, r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "calling_hidden_entry_points"
            int r0 = r9.A01     // Catch:{ all -> 0x043f }
            X.C17880vN.A18(r7, r1, r0)     // Catch:{ all -> 0x043f }
            X.ADt r11 = r9.A07     // Catch:{ all -> 0x043f }
            if (r11 == 0) goto L_0x014a
            java.lang.String r1 = "price_tier_id"
            java.lang.String r0 = r11.A00     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
        L_0x014a:
            java.lang.String r1 = "survey_sampling_rate"
            java.lang.Integer r0 = r9.A0A     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "is_offerings_eligible"
            boolean r0 = r9.A0c     // Catch:{ all -> 0x043f }
            X.AnonymousClass8BT.A13(r7, r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "is_typing_indicator_enabled"
            boolean r0 = r9.A0e     // Catch:{ all -> 0x043f }
            X.C50072Ta.A00(r7, r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "automated_type"
            int r0 = r9.A00     // Catch:{ all -> 0x043f }
            X.C17880vN.A18(r7, r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "wa_biz_profiles"
            long r2 = X.C24861Ly.A00(r7, r4, r0)     // Catch:{ all -> 0x043f }
            java.util.List r1 = r9.A0V     // Catch:{ all -> 0x043f }
            boolean r0 = X.AnonymousClass000.A1a(r1)     // Catch:{ all -> 0x043f }
            java.lang.String r10 = "wa_biz_profile_id"
            if (r0 == 0) goto L_0x0195
            java.util.Iterator r13 = r1.iterator()     // Catch:{ all -> 0x043f }
        L_0x017a:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x043f }
            if (r0 == 0) goto L_0x0195
            java.lang.String r1 = X.C17880vN.A0v(r13)     // Catch:{ all -> 0x043f }
            r7.clear()     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "websites"
            r7.put(r0, r1)     // Catch:{ all -> 0x043f }
            X.C17880vN.A19(r7, r10, r2)     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "wa_biz_profiles_websites"
            X.C24861Ly.A00(r7, r4, r0)     // Catch:{ all -> 0x043f }
            goto L_0x017a
        L_0x0195:
            java.util.List r1 = r9.A0P     // Catch:{ all -> 0x043f }
            boolean r0 = X.AnonymousClass000.A1a(r1)     // Catch:{ all -> 0x043f }
            if (r0 == 0) goto L_0x01c7
            java.util.Iterator r14 = r1.iterator()     // Catch:{ all -> 0x043f }
        L_0x01a1:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x043f }
            if (r0 == 0) goto L_0x01c7
            java.lang.Object r13 = r14.next()     // Catch:{ all -> 0x043f }
            X.AEQ r13 = (X.AEQ) r13     // Catch:{ all -> 0x043f }
            r7.clear()     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "category_id"
            java.lang.String r0 = r13.A00     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "category_name"
            java.lang.String r0 = r13.A01     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            X.C17880vN.A19(r7, r10, r2)     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "wa_biz_profiles_categories"
            X.C24861Ly.A00(r7, r4, r0)     // Catch:{ all -> 0x043f }
            goto L_0x01a1
        L_0x01c7:
            if (r12 == 0) goto L_0x021b
            java.util.List r0 = r12.A02     // Catch:{ all -> 0x043f }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x043f }
        L_0x01cf:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x043f }
            if (r0 == 0) goto L_0x021b
            java.lang.Object r12 = r13.next()     // Catch:{ all -> 0x043f }
            X.AE8 r12 = (X.AE8) r12     // Catch:{ all -> 0x043f }
            r7.clear()     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "day_of_week"
            if (r12 == 0) goto L_0x0219
            int r0 = r12.A00     // Catch:{ all -> 0x043f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x043f }
        L_0x01e8:
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "mode"
            if (r12 == 0) goto L_0x0217
            int r0 = r12.A01     // Catch:{ all -> 0x043f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x043f }
        L_0x01f5:
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "open_time"
            if (r12 == 0) goto L_0x0215
            java.lang.Integer r0 = r12.A03     // Catch:{ all -> 0x043f }
        L_0x01fe:
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "close_time"
            if (r12 == 0) goto L_0x0213
            java.lang.Integer r0 = r12.A02     // Catch:{ all -> 0x043f }
        L_0x0207:
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            X.C17880vN.A19(r7, r10, r2)     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "wa_biz_profiles_hours"
            X.C24861Ly.A00(r7, r4, r0)     // Catch:{ all -> 0x043f }
            goto L_0x01cf
        L_0x0213:
            r0 = r15
            goto L_0x0207
        L_0x0215:
            r0 = r15
            goto L_0x01fe
        L_0x0217:
            r0 = r15
            goto L_0x01f5
        L_0x0219:
            r0 = r15
            goto L_0x01e8
        L_0x021b:
            X.ADg r12 = r9.A06     // Catch:{ all -> 0x043f }
            if (r12 == 0) goto L_0x0227
            X.AEB r1 = r12.A00     // Catch:{ all -> 0x043f }
            if (r1 != 0) goto L_0x022e
            X.AEB r0 = r12.A01     // Catch:{ all -> 0x043f }
            if (r0 != 0) goto L_0x022e
        L_0x0227:
            java.util.List r1 = r9.A0U     // Catch:{ all -> 0x043f }
            boolean r0 = X.AnonymousClass000.A1a(r1)     // Catch:{ all -> 0x043f }
            goto L_0x0247
        L_0x022e:
            X.AEB r0 = r12.A01     // Catch:{ all -> 0x043f }
            if (r1 == 0) goto L_0x023b
            r14 = r4
            r15 = r8
            r16 = r2
            r12 = r7
            r13 = r1
            A06(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x043f }
        L_0x023b:
            if (r0 == 0) goto L_0x0227
            r15 = 1
            r12 = r7
            r13 = r0
            r14 = r4
            r16 = r2
            A06(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x043f }
            goto L_0x0227
        L_0x0247:
            if (r0 == 0) goto L_0x028f
            java.util.Iterator r13 = r1.iterator()     // Catch:{ all -> 0x043f }
        L_0x024d:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x043f }
            if (r0 == 0) goto L_0x028f
            java.lang.Object r12 = r13.next()     // Catch:{ all -> 0x043f }
            X.AE9 r12 = (X.AE9) r12     // Catch:{ all -> 0x043f }
            if (r12 == 0) goto L_0x024d
            r7.clear()     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "area_description"
            java.lang.String r0 = r12.A03     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            int r0 = r12.A02     // Catch:{ all -> 0x043f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "radius"
            r7.put(r0, r1)     // Catch:{ all -> 0x043f }
            double r0 = r12.A00     // Catch:{ all -> 0x043f }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "center_latitude"
            r7.put(r0, r1)     // Catch:{ all -> 0x043f }
            double r0 = r12.A01     // Catch:{ all -> 0x043f }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "center_longitude"
            r7.put(r0, r1)     // Catch:{ all -> 0x043f }
            X.C17880vN.A19(r7, r10, r2)     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "wa_biz_profiles_service_areas"
            X.C24861Ly.A00(r7, r4, r0)     // Catch:{ all -> 0x043f }
            goto L_0x024d
        L_0x028f:
            java.util.List r0 = r9.A0R     // Catch:{ all -> 0x043f }
            if (r0 != 0) goto L_0x02cc
            java.lang.String r1 = "NULL"
            r7.clear()     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "country_code"
            r7.put(r0, r1)     // Catch:{ all -> 0x043f }
            X.C17880vN.A19(r7, r10, r2)     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "wa_biz_profiles_direct_connection_allowed_country_codes"
            X.C24861Ly.A00(r7, r4, r0)     // Catch:{ all -> 0x043f }
        L_0x02a5:
            java.util.List r0 = r9.A0S     // Catch:{ all -> 0x043f }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x043f }
        L_0x02ab:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x043f }
            if (r0 == 0) goto L_0x02ed
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x043f }
            X.ADD r0 = (X.ADD) r0     // Catch:{ all -> 0x043f }
            if (r0 == 0) goto L_0x02ab
            r7.clear()     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "catalog_feature_type"
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            X.C17880vN.A19(r7, r10, r2)     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "wa_biz_profiles_dc_enabled_features"
            X.C24861Ly.A00(r7, r4, r0)     // Catch:{ all -> 0x043f }
            goto L_0x02ab
        L_0x02cc:
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x043f }
        L_0x02d0:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x043f }
            if (r0 == 0) goto L_0x02a5
            java.lang.String r1 = X.C17880vN.A0v(r12)     // Catch:{ all -> 0x043f }
            if (r1 == 0) goto L_0x02d0
            r7.clear()     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "country_code"
            r7.put(r0, r1)     // Catch:{ all -> 0x043f }
            X.C17880vN.A19(r7, r10, r2)     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "wa_biz_profiles_direct_connection_allowed_country_codes"
            X.C24861Ly.A00(r7, r4, r0)     // Catch:{ all -> 0x043f }
            goto L_0x02d0
        L_0x02ed:
            if (r11 == 0) goto L_0x032a
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x043f }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x043f }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x043f }
            boolean r0 = r0.inTransaction()     // Catch:{ all -> 0x043f }
            X.C17960vV.A0D(r0)     // Catch:{ all -> 0x043f }
            r7.clear()     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "_id"
            java.lang.String r12 = r11.A00     // Catch:{ all -> 0x043f }
            r7.put(r0, r12)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "name"
            java.lang.String r0 = r11.A01     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "symbol"
            java.lang.String r0 = r11.A02     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String[] r11 = X.C17880vN.A1a(r12, r8)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "wa_biz_profiles_price_tiers"
            java.lang.String r0 = "_id=?"
            long r13 = X.C24861Ly.A01(r7, r4, r1, r0, r11)     // Catch:{ all -> 0x043f }
            r11 = 0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x032a
            X.C24861Ly.A00(r7, r4, r1)     // Catch:{ all -> 0x043f }
        L_0x032a:
            java.util.List r1 = r9.A0O     // Catch:{ all -> 0x043f }
            boolean r0 = X.AnonymousClass000.A1a(r1)     // Catch:{ all -> 0x043f }
            if (r0 == 0) goto L_0x03b9
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x043f }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x043f }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x043f }
            boolean r0 = r0.inTransaction()     // Catch:{ all -> 0x043f }
            X.C17960vV.A0D(r0)     // Catch:{ all -> 0x043f }
            r7.clear()     // Catch:{ all -> 0x043f }
            java.util.Iterator r17 = r1.iterator()     // Catch:{ all -> 0x043f }
        L_0x0347:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x043f }
            if (r0 == 0) goto L_0x03b9
            java.lang.Object r11 = r17.next()     // Catch:{ all -> 0x043f }
            X.AEL r11 = (X.AEL) r11     // Catch:{ all -> 0x043f }
            r7.clear()     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "category_id"
            java.lang.String r0 = r11.A00     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "category_name"
            java.lang.String r0 = r11.A01     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "_id"
            java.lang.String r12 = r11.A03     // Catch:{ all -> 0x043f }
            r7.put(r0, r12)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "offering_name"
            java.lang.String r0 = r11.A02     // Catch:{ all -> 0x043f }
            r7.put(r1, r0)     // Catch:{ all -> 0x043f }
            java.lang.String[] r13 = X.C17880vN.A1a(r12, r8)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "wa_biz_category_service_offerings"
            java.lang.String r0 = "_id=?"
            long r15 = X.C24861Ly.A01(r7, r4, r1, r0, r13)     // Catch:{ all -> 0x043f }
            r13 = 0
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0387
            X.C24861Ly.A00(r7, r4, r1)     // Catch:{ all -> 0x043f }
        L_0x0387:
            r7.clear()     // Catch:{ all -> 0x043f }
            boolean r0 = r11.A04     // Catch:{ all -> 0x043f }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "is_offered"
            r7.put(r0, r1)     // Catch:{ all -> 0x043f }
            X.C17880vN.A19(r7, r10, r2)     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "wa_biz_category_service_offerings_id"
            r7.put(r0, r12)     // Catch:{ all -> 0x043f }
            java.lang.String[] r11 = X.C17880vN.A1Z()     // Catch:{ all -> 0x043f }
            r11[r8] = r12     // Catch:{ all -> 0x043f }
            r0 = 1
            X.C17880vN.A1V(r11, r0, r2)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = "wa_biz_profile_to_service_offerings"
            java.lang.String r0 = "wa_biz_category_service_offerings_id=? = ? AND wa_biz_profile_id = ?"
            long r13 = X.C24861Ly.A01(r7, r4, r1, r0, r11)     // Catch:{ all -> 0x043f }
            r11 = 0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0347
            X.C24861Ly.A00(r7, r4, r1)     // Catch:{ all -> 0x043f }
            goto L_0x0347
        L_0x03b9:
            java.lang.String r13 = r9.A0B     // Catch:{ all -> 0x043f }
            if (r13 == 0) goto L_0x03c3
            int r0 = r13.length()     // Catch:{ all -> 0x043f }
            if (r0 != 0) goto L_0x03e7
        L_0x03c3:
            java.lang.String r0 = r9.A0L     // Catch:{ all -> 0x043f }
            if (r0 == 0) goto L_0x03cd
            int r0 = r0.length()     // Catch:{ all -> 0x043f }
            if (r0 != 0) goto L_0x03e7
        L_0x03cd:
            java.lang.String r0 = r9.A0D     // Catch:{ all -> 0x043f }
            if (r0 == 0) goto L_0x03d7
            int r0 = r0.length()     // Catch:{ all -> 0x043f }
            if (r0 != 0) goto L_0x03e7
        L_0x03d7:
            java.util.List r0 = r9.A0Q     // Catch:{ all -> 0x043f }
            boolean r0 = X.AnonymousClass000.A1a(r0)     // Catch:{ all -> 0x043f }
            if (r0 != 0) goto L_0x03e7
            java.util.List r0 = r9.A0T     // Catch:{ all -> 0x043f }
            boolean r0 = X.AnonymousClass000.A1a(r0)     // Catch:{ all -> 0x043f }
            if (r0 == 0) goto L_0x0015
        L_0x03e7:
            java.lang.String r12 = r9.A0L     // Catch:{ all -> 0x043f }
            java.lang.String r11 = r9.A0D     // Catch:{ all -> 0x043f }
            java.util.List r1 = r9.A0Q     // Catch:{ all -> 0x043f }
            java.util.List r9 = r9.A0T     // Catch:{ all -> 0x043f }
            r7.clear()     // Catch:{ all -> 0x043f }
            X.C17880vN.A19(r7, r10, r2)     // Catch:{ all -> 0x043f }
            if (r13 == 0) goto L_0x0402
            int r0 = r13.length()     // Catch:{ all -> 0x043f }
            if (r0 == 0) goto L_0x0402
            java.lang.String r0 = "bot_description"
            r7.put(r0, r13)     // Catch:{ all -> 0x043f }
        L_0x0402:
            if (r12 == 0) goto L_0x040f
            int r0 = r12.length()     // Catch:{ all -> 0x043f }
            if (r0 == 0) goto L_0x040f
            java.lang.String r0 = "sub_description"
            r7.put(r0, r12)     // Catch:{ all -> 0x043f }
        L_0x040f:
            if (r11 == 0) goto L_0x041c
            int r0 = r11.length()     // Catch:{ all -> 0x043f }
            if (r0 == 0) goto L_0x041c
            java.lang.String r0 = "commands_description"
            r7.put(r0, r11)     // Catch:{ all -> 0x043f }
        L_0x041c:
            java.lang.String r1 = X.C446024b.A00(r1)     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "commands"
            r7.put(r0, r1)     // Catch:{ all -> 0x043f }
            java.lang.String r1 = X.AnonymousClass24Y.A00(r9)     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "prompts"
            r7.put(r0, r1)     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "wa_biz_profiles_bot_attributes"
            X.C24861Ly.A00(r7, r4, r0)     // Catch:{ all -> 0x043f }
            goto L_0x0015
        L_0x0435:
            r5.A00()     // Catch:{ all -> 0x043f }
            r5.close()     // Catch:{ all -> 0x0446 }
            r4.close()
            return
        L_0x043f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0441 }
        L_0x0441:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0446 }
            throw r0     // Catch:{ all -> 0x0446 }
        L_0x0446:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0448 }
        L_0x0448:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9CB.A0L(java.util.Map):void");
    }

    public static String A04(AnonymousClass9CB r0, UserJid userJid) {
        String A06 = C22971Dz.A06(r0.A00.A00(userJid));
        C17960vV.A07(A06);
        C18070vi.A0X(A06);
        return A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0K(com.whatsapp.jid.UserJid r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0008
            java.lang.String r0 = "contact-mgr-db/cannot delete business profile details by null jid"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0008:
            java.lang.String r4 = A04(r5, r6)
            X.1Lt r0 = r5.A00
            X.1au r3 = r0.A06()
            java.lang.String r2 = "wa_biz_profiles"
            java.lang.String r1 = "wa_biz_profiles.jid = ?"
            java.lang.String[] r0 = X.C108975cc.A1b(r4)     // Catch:{ all -> 0x0021 }
            X.C24861Ly.A02(r3, r2, r1, r0)     // Catch:{ all -> 0x0021 }
            r3.close()
            return
        L_0x0021:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9CB.A0K(com.whatsapp.jid.UserJid):void");
    }

    public static final void A06(ContentValues contentValues, AEB aeb, C28791au r4, int i, long j) {
        contentValues.clear();
        C17880vN.A19(contentValues, "wa_biz_profile_id", j);
        contentValues.put("account_id", aeb.A02);
        C17880vN.A18(contentValues, "account_type", i);
        contentValues.put("account_display_name", aeb.A01);
        contentValues.put("account_fan_count", Integer.valueOf(aeb.A00));
        contentValues.put("account_has_media_post", Boolean.valueOf(aeb.A03));
        C24861Ly.A00(contentValues, r4, "wa_biz_profiles_linked_accounts_table");
    }
}
