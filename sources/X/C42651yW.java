package X;

import android.database.Cursor;

/* renamed from: X.1yW  reason: invalid class name and case insensitive filesystem */
public abstract class C42651yW {
    public static C59042lf A00(String str, long j) {
        int length;
        if ((j >= 1 || j == -2 || j == -3 || j == -5) && str != null && 5 <= (length = str.length()) && length <= 20) {
            return new C59042lf(j, str);
        }
        return null;
    }

    public static AnonymousClass1E7 A01(Cursor cursor, C18000vb r8) {
        boolean z;
        AnonymousClass1E7 r2 = new AnonymousClass1E7(AnonymousClass1BI.A00.A02(cursor.getString(cursor.getColumnIndexOrThrow("jid"))));
        r2.A0M(cursor.getLong(cursor.getColumnIndexOrThrow("_id")));
        r2.A0N = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow("phone_type")));
        r2.A0X = cursor.getString(cursor.getColumnIndexOrThrow("phone_label"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("number"));
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("raw_contact_id"));
        r2.A0H = A00(string, j);
        if (!C22971Dz.A0T(r2.A0J) || !(j == -4 || j == -3)) {
            z = false;
        } else {
            z = true;
        }
        r2.A0o = z;
        r2.A09 = cursor.getInt(cursor.getColumnIndexOrThrow("sync_policy"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("display_name"));
        if (r2.A0H != null || r2.A0F() || C22971Dz.A0N(r2.A0J) || r2.A0o || r2.A09 == 1) {
            String A04 = C63942tw.A04(string2);
            String A042 = C63942tw.A04(string);
            if (A04 != null && A04.equals(A042)) {
                string2 = r8.A0G(string2);
            }
            r2.A0R = string2;
        } else {
            r2.A0P = string2;
        }
        boolean z2 = false;
        boolean z3 = false;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("is_whatsapp_user")) == 1) {
            z3 = true;
        }
        r2.A10 = z3;
        r2.A0T = cursor.getString(cursor.getColumnIndexOrThrow("given_name"));
        r2.A0S = cursor.getString(cursor.getColumnIndexOrThrow("family_name"));
        r2.A0Y = cursor.getString(cursor.getColumnIndexOrThrow("sort_name"));
        r2.A0W = cursor.getString(cursor.getColumnIndexOrThrow("nickname"));
        r2.A0Q = cursor.getString(cursor.getColumnIndexOrThrow("company"));
        r2.A0b = cursor.getString(cursor.getColumnIndexOrThrow("title"));
        if (cursor.getInt(cursor.getColumnIndexOrThrow("is_starred")) == 1) {
            z2 = true;
        }
        r2.A0s = z2;
        r2.A01 = cursor.getInt(cursor.getColumnIndexOrThrow("is_contact_synced"));
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0284, code lost:
        if (r1.getInt(r5) != 1) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x029a, code lost:
        if (r1.getInt(r5) != 1) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02b0, code lost:
        if (r1.getInt(r5) <= 0) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03a2, code lost:
        if (r1.getInt(r5) != 1) goto L_0x03a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass1E7 A02(android.database.Cursor r17, X.C18000vb r18) {
        /*
            java.lang.String r0 = "jid"
            r1 = r17
            int r0 = r1.getColumnIndexOrThrow(r0)
            java.lang.String r2 = r1.getString(r0)
            X.1Dv r0 = X.AnonymousClass1BI.A00
            X.1BI r2 = r0.A02(r2)
            X.1E7 r0 = new X.1E7
            r0.<init>(r2)
            java.lang.String r2 = "status"
            int r2 = r1.getColumnIndexOrThrow(r2)
            java.lang.String r2 = r1.getString(r2)
            r0.A0Z = r2
            java.lang.String r2 = "status_timestamp"
            int r2 = r1.getColumnIndexOrThrow(r2)
            long r2 = r1.getLong(r2)
            r0.A0F = r2
            java.lang.String r2 = "_id"
            int r2 = r1.getColumnIndexOrThrow(r2)
            long r2 = r1.getLong(r2)
            r0.A0M(r2)
            java.lang.String r2 = "phone_type"
            int r2 = r1.getColumnIndexOrThrow(r2)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.A0N = r2
            java.lang.String r2 = "phone_label"
            int r2 = r1.getColumnIndexOrThrow(r2)
            java.lang.String r2 = r1.getString(r2)
            r0.A0X = r2
            java.lang.String r2 = "history_sync_initial_phash"
            int r2 = r1.getColumnIndexOrThrow(r2)
            java.lang.String r2 = r1.getString(r2)
            r0.A0U = r2
            java.lang.String r2 = "number"
            int r2 = r1.getColumnIndexOrThrow(r2)
            java.lang.String r6 = r1.getString(r2)
            java.lang.String r2 = "raw_contact_id"
            int r2 = r1.getColumnIndexOrThrow(r2)
            long r3 = r1.getLong(r2)
            X.2lf r2 = A00(r6, r3)
            r0.A0H = r2
            X.1BI r2 = r0.A0J
            boolean r2 = X.C22971Dz.A0T(r2)
            if (r2 == 0) goto L_0x0487
            r7 = -4
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0094
            r7 = -3
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0487
        L_0x0094:
            r2 = 1
        L_0x0095:
            r0.A0o = r2
            java.lang.String r2 = "sync_policy"
            int r4 = r1.getColumnIndexOrThrow(r2)
            boolean r2 = r1.isNull(r4)
            r3 = 0
            if (r2 != 0) goto L_0x0483
            int r2 = r1.getInt(r4)
            r0.A09 = r2
        L_0x00ab:
            java.lang.String r2 = "display_name"
            int r2 = r1.getColumnIndexOrThrow(r2)
            java.lang.String r5 = r1.getString(r2)
            X.2lf r2 = r0.A0H
            if (r2 != 0) goto L_0x0469
            boolean r2 = r0.A0F()
            if (r2 != 0) goto L_0x0469
            X.1BI r2 = r0.A0J
            boolean r2 = X.C22971Dz.A0N(r2)
            if (r2 != 0) goto L_0x0469
            boolean r2 = r0.A0o
            if (r2 != 0) goto L_0x0469
            int r4 = r0.A09
            r2 = 1
            if (r4 == r2) goto L_0x0469
            r0.A0P = r5
        L_0x00d2:
            java.lang.String r2 = "is_whatsapp_user"
            int r2 = r1.getColumnIndexOrThrow(r2)
            int r5 = r1.getInt(r2)
            r2 = 1
            r4 = 0
            if (r5 != r2) goto L_0x00e1
            r4 = 1
        L_0x00e1:
            r0.A10 = r4
            java.lang.String r4 = "photo_ts"
            int r4 = r1.getColumnIndexOrThrow(r4)
            int r4 = r1.getInt(r4)
            r0.A07 = r4
            java.lang.String r4 = "thumb_ts"
            int r4 = r1.getColumnIndexOrThrow(r4)
            int r4 = r1.getInt(r4)
            r0.A08 = r4
            java.lang.String r4 = "photo_id_timestamp"
            int r4 = r1.getColumnIndexOrThrow(r4)
            long r4 = r1.getLong(r4)
            r0.A0E = r4
            java.lang.String r4 = "given_name"
            int r4 = r1.getColumnIndexOrThrow(r4)
            java.lang.String r4 = r1.getString(r4)
            r0.A0T = r4
            java.lang.String r4 = "family_name"
            int r4 = r1.getColumnIndexOrThrow(r4)
            java.lang.String r4 = r1.getString(r4)
            r0.A0S = r4
            java.lang.String r4 = "wa_name"
            int r4 = r1.getColumnIndexOrThrow(r4)
            java.lang.String r4 = r1.getString(r4)
            r0.A0c = r4
            java.lang.String r4 = "sort_name"
            int r4 = r1.getColumnIndexOrThrow(r4)
            java.lang.String r4 = r1.getString(r4)
            r0.A0Y = r4
            java.lang.String r4 = "nickname"
            int r4 = r1.getColumnIndexOrThrow(r4)
            java.lang.String r4 = r1.getString(r4)
            r0.A0W = r4
            java.lang.String r4 = "company"
            int r4 = r1.getColumnIndexOrThrow(r4)
            java.lang.String r4 = r1.getString(r4)
            r0.A0Q = r4
            java.lang.String r4 = "title"
            int r4 = r1.getColumnIndexOrThrow(r4)
            java.lang.String r4 = r1.getString(r4)
            r0.A0b = r4
            java.lang.String r4 = "status_autodownload_disabled"
            int r4 = r1.getColumnIndexOrThrow(r4)
            int r5 = r1.getInt(r4)
            r4 = 0
            if (r5 != r2) goto L_0x016e
            r4 = 1
        L_0x016e:
            r0.A14 = r4
            java.lang.String r4 = "keep_timestamp"
            int r4 = r1.getColumnIndexOrThrow(r4)
            long r4 = r1.getLong(r4)
            r0.A0D = r4
            java.lang.String r4 = "is_spam_reported"
            int r4 = r1.getColumnIndexOrThrow(r4)
            int r5 = r1.getInt(r4)
            r4 = 0
            if (r5 != r2) goto L_0x018a
            r4 = 1
        L_0x018a:
            r0.A0x = r4
            java.lang.String r4 = "description"
            int r4 = r1.getColumnIndexOrThrow(r4)
            java.lang.String r11 = r1.getString(r4)
            r6 = 0
            if (r11 != 0) goto L_0x042a
            X.1yX r4 = X.C42661yX.A05
            r0.A0M = r4
        L_0x019d:
            java.lang.String r4 = "restrict_mode"
            int r4 = r1.getColumnIndexOrThrow(r4)
            int r5 = r1.getInt(r4)
            r4 = 0
            if (r5 != r2) goto L_0x01ab
            r4 = 1
        L_0x01ab:
            r0.A13 = r4
            java.lang.String r4 = "announcement_group"
            int r4 = r1.getColumnIndexOrThrow(r4)
            int r5 = r1.getInt(r4)
            r4 = 0
            if (r5 != r2) goto L_0x01bb
            r4 = 1
        L_0x01bb:
            r0.A0f = r4
            java.lang.String r4 = "no_frequently_forwarded"
            int r4 = r1.getColumnIndexOrThrow(r4)
            int r5 = r1.getInt(r4)
            r4 = 0
            if (r5 != r2) goto L_0x01cb
            r4 = 1
        L_0x01cb:
            r0.A11 = r4
            java.lang.String r4 = "ephemeral_duration"
            int r4 = r1.getColumnIndexOrThrow(r4)
            int r4 = r1.getInt(r4)
            r0.A04 = r4
            java.lang.String r4 = "creator_jid"
            int r4 = r1.getColumnIndexOrThrow(r4)
            java.lang.String r5 = r1.getString(r4)
            X.1Dw r4 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r4 = r4.A04(r5)
            r0.A0K = r4
            java.lang.String r4 = "in_app_support"
            int r4 = r1.getColumnIndexOrThrow(r4)
            int r5 = r1.getInt(r4)
            r4 = 0
            if (r5 != r2) goto L_0x01f9
            r4 = 1
        L_0x01f9:
            r0.A0j = r4
            java.lang.String r4 = "is_suspended"
            int r4 = r1.getColumnIndexOrThrow(r4)
            int r5 = r1.getInt(r4)
            r4 = 0
            if (r5 != r2) goto L_0x0209
            r4 = 1
        L_0x0209:
            r0.A0t = r4
            java.lang.String r4 = "group_state"
            int r4 = r1.getColumnIndexOrThrow(r4)
            int r4 = r1.getInt(r4)
            r0.A05 = r4
            java.lang.String r4 = "require_membership_approval"
            int r4 = r1.getColumnIndexOrThrow(r4)
            int r5 = r1.getInt(r4)
            r4 = 0
            if (r5 != r2) goto L_0x0225
            r4 = 1
        L_0x0225:
            r0.A12 = r4
            java.lang.String r4 = "member_add_mode"
            int r4 = r1.getColumnIndexOrThrow(r4)
            int r4 = r1.getInt(r4)
            r0.A06 = r4
            java.lang.String r4 = "incognito"
            int r4 = r1.getColumnIndexOrThrow(r4)
            int r5 = r1.getInt(r4)
            r4 = 0
            if (r5 != r2) goto L_0x0241
            r4 = 1
        L_0x0241:
            r0.A0k = r4
            java.lang.String r4 = "is_pending_requests_banner_acknowledged"
            int r4 = r1.getColumnIndexOrThrow(r4)
            int r5 = r1.getInt(r4)
            r4 = 0
            if (r5 != r2) goto L_0x0251
            r4 = 1
        L_0x0251:
            r0.A0v = r4
            java.lang.String r4 = "is_pending_suggestions_banner_acknowledged"
            int r4 = r1.getColumnIndexOrThrow(r4)
            int r5 = r1.getInt(r4)
            r4 = 0
            if (r5 != r2) goto L_0x0261
            r4 = 1
        L_0x0261:
            r0.A0w = r4
            java.lang.String r4 = "addressing_mode"
            int r4 = r1.getColumnIndexOrThrow(r4)
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r4 = X.C42671yY.A00(r4)
            r0.A0O = r4
            java.lang.String r4 = "allow_non_admin_subgroup_creation"
            int r5 = r1.getColumnIndexOrThrow(r4)
            boolean r4 = r1.isNull(r5)
            if (r4 != 0) goto L_0x0286
            int r5 = r1.getInt(r5)
            r4 = 1
            if (r5 == r2) goto L_0x0287
        L_0x0286:
            r4 = 0
        L_0x0287:
            r0.A0e = r4
            java.lang.String r4 = "history_enabled"
            int r5 = r1.getColumnIndexOrThrow(r4)
            boolean r4 = r1.isNull(r5)
            if (r4 != 0) goto L_0x029c
            int r5 = r1.getInt(r5)
            r4 = 1
            if (r5 == r2) goto L_0x029d
        L_0x029c:
            r4 = 0
        L_0x029d:
            r0.A0i = r4
            java.lang.String r4 = "is_hidden_subgroup"
            int r5 = r1.getColumnIndexOrThrow(r4)
            boolean r4 = r1.isNull(r5)
            if (r4 != 0) goto L_0x02b2
            int r5 = r1.getInt(r5)
            r4 = 1
            if (r5 > 0) goto L_0x02b3
        L_0x02b2:
            r4 = 0
        L_0x02b3:
            r0.A0n = r4
            java.lang.String r4 = "e2ee_state"
            int r5 = r1.getColumnIndexOrThrow(r4)
            boolean r4 = r1.isNull(r5)
            if (r4 != 0) goto L_0x02c7
            int r4 = r1.getInt(r5)
            r0.A03 = r4
        L_0x02c7:
            java.lang.String r4 = "verified_level"
            int r4 = r1.getColumnIndexOrThrow(r4)
            int r4 = r1.getInt(r4)
            r14 = 1
            if (r4 == r2) goto L_0x02dc
            r14 = 2
            if (r4 == r14) goto L_0x02dc
            r14 = 3
            if (r4 == r14) goto L_0x02dc
            r14 = 0
        L_0x02dc:
            r0.A0A = r14
            java.lang.String r4 = "verified_name"
            int r4 = r1.getColumnIndexOrThrow(r4)
            java.lang.String r13 = r1.getString(r4)
            java.lang.String r9 = "identity_unconfirmed_since"
            int r4 = r1.getColumnIndexOrThrow(r9)
            boolean r5 = r1.isNull(r4)
            java.lang.String r4 = "issuer"
            int r4 = r1.getColumnIndexOrThrow(r4)
            java.lang.String r12 = r1.getString(r4)
            if (r5 != 0) goto L_0x03fc
            r0.A0A = r3
        L_0x0301:
            java.lang.String r4 = "serial"
            int r4 = r1.getColumnIndexOrThrow(r4)
            long r16 = r1.getLong(r4)
            int r4 = r1.getColumnIndexOrThrow(r9)
            int r15 = r1.getInt(r4)
            java.lang.String r4 = "host_storage"
            int r4 = r1.getColumnIndexOrThrow(r4)
            java.lang.String r4 = r1.getString(r4)
            int r8 = X.C42681yZ.A01(r4)
            java.lang.String r4 = "actual_actors"
            int r4 = r1.getColumnIndexOrThrow(r4)
            java.lang.String r4 = r1.getString(r4)
            int r7 = X.C42681yZ.A00(r4)
            java.lang.String r4 = "privacy_mode_ts"
            int r4 = r1.getColumnIndexOrThrow(r4)
            long r4 = r1.getLong(r4)
            X.1ya r11 = new X.1ya
            r11.<init>((int) r8, (long) r4, (int) r7)
            r0.A0N(r6)
            r0.A0V = r12
            X.1BI r4 = r0.A0J
            com.whatsapp.jid.UserJid r10 = X.C22941Dw.A01(r4)
            boolean r18 = X.C42701yb.A01(r10)
            X.1yf r9 = new X.1yf
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r18)
            r0.A0G = r9
            java.lang.String r4 = "is_sidelist_synced"
            int r4 = r1.getColumnIndexOrThrow(r4)
            int r5 = r1.getInt(r4)
            r4 = 0
            if (r5 != r2) goto L_0x0363
            r4 = 1
        L_0x0363:
            r0.A0z = r4
            java.lang.String r4 = "is_business_synced"
            int r4 = r1.getColumnIndexOrThrow(r4)
            int r5 = r1.getInt(r4)
            r4 = 0
            if (r5 != r2) goto L_0x0373
            r4 = 1
        L_0x0373:
            r0.A0u = r4
            java.lang.String r4 = "disappearing_mode_duration"
            int r4 = r1.getColumnIndexOrThrow(r4)
            int r4 = r1.getInt(r4)
            r0.A02 = r4
            java.lang.String r4 = "disappearing_mode_timestamp"
            int r4 = r1.getColumnIndexOrThrow(r4)
            int r4 = r1.getInt(r4)
            long r4 = (long) r4
            r0.A0B = r4
            java.lang.String r4 = "is_report_to_admin_enabled"
            int r5 = r1.getColumnIndex(r4)
            r4 = -1
            if (r5 <= r4) goto L_0x03a4
            boolean r4 = r1.isNull(r5)
            if (r4 != 0) goto L_0x03a4
            int r5 = r1.getInt(r5)
            r4 = 1
            if (r5 == r2) goto L_0x03a5
        L_0x03a4:
            r4 = 0
        L_0x03a5:
            r0.A0r = r4
            java.lang.String r4 = "is_starred"
            int r5 = r1.getColumnIndexOrThrow(r4)
            boolean r4 = r1.isNull(r5)
            if (r4 != 0) goto L_0x03ba
            int r4 = r1.getInt(r5)
            if (r4 != r2) goto L_0x03ba
            r3 = 1
        L_0x03ba:
            r0.A0s = r3
            java.lang.String r2 = "automated_type"
            int r2 = r1.getColumnIndexOrThrow(r2)
            int r2 = r1.getInt(r2)
            r0.A00 = r2
            java.lang.String r2 = "status_emoji"
            int r2 = r1.getColumnIndexOrThrow(r2)
            java.lang.String r2 = r1.getString(r2)
            r0.A0a = r2
            java.lang.String r2 = "is_contact_synced"
            int r2 = r1.getColumnIndexOrThrow(r2)
            int r2 = r1.getInt(r2)
            r0.A01 = r2
            java.lang.String r4 = "is_reachable"
            int r2 = r1.getColumnIndex(r4)
            boolean r2 = r1.isNull(r2)
            r3 = 1
            if (r2 != 0) goto L_0x03f9
            int r2 = r1.getColumnIndexOrThrow(r4)
            int r1 = r1.getInt(r2)
            if (r1 == r3) goto L_0x03f9
            r3 = 0
        L_0x03f9:
            r0.A0q = r3
            return r0
        L_0x03fc:
            if (r13 == 0) goto L_0x0427
            java.lang.String r5 = "expires"
            int r4 = r1.getColumnIndexOrThrow(r5)
            boolean r4 = r1.isNull(r4)
            if (r4 != 0) goto L_0x0427
            int r4 = r1.getColumnIndexOrThrow(r5)
            long r10 = r1.getLong(r4)
            r7 = 0
            int r4 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x0427
            long r7 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r4
            int r4 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x0427
            r0.A0A = r3
            goto L_0x0301
        L_0x0427:
            r6 = r13
            goto L_0x0301
        L_0x042a:
            java.lang.String r4 = "description_id_string"
            int r4 = r1.getColumnIndexOrThrow(r4)
            java.lang.String r10 = r1.getString(r4)
            java.lang.String r4 = "description_setter_jid"
            int r4 = r1.getColumnIndexOrThrow(r4)
            java.lang.String r8 = r1.getString(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            if (r4 == 0) goto L_0x0445
            r10 = r6
        L_0x0445:
            java.lang.String r4 = "description_time"
            int r4 = r1.getColumnIndexOrThrow(r4)
            int r4 = r1.getInt(r4)
            long r4 = (long) r4
            boolean r7 = android.text.TextUtils.isEmpty(r8)
            if (r7 == 0) goto L_0x0462
            r9 = r6
        L_0x0457:
            X.1yX r7 = new X.1yX
            r8 = r6
            r12 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            r0.A0M = r7
            goto L_0x019d
        L_0x0462:
            X.1Dw r7 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r9 = r7.A04(r8)
            goto L_0x0457
        L_0x0469:
            java.lang.String r4 = X.C63942tw.A04(r5)
            java.lang.String r2 = X.C63942tw.A04(r6)
            if (r4 == 0) goto L_0x047f
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x047f
            r2 = r18
            java.lang.String r5 = r2.A0G(r5)
        L_0x047f:
            r0.A0R = r5
            goto L_0x00d2
        L_0x0483:
            r0.A09 = r3
            goto L_0x00ab
        L_0x0487:
            r2 = 0
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42651yW.A02(android.database.Cursor, X.0vb):X.1E7");
    }
}
