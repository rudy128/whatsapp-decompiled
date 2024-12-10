package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.1Lt  reason: invalid class name and case insensitive filesystem */
public class C24811Lt extends C24801Ls {
    public final AnonymousClass118 A00;
    public final AnonymousClass11O A01;
    public final AnonymousClass1CO A02;
    public final AnonymousClass1CT A03;
    public final C24841Lw A04;
    public final AnonymousClass00H A05;

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.1F1] */
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (this) {
            C23141Ev A012 = A01(sQLiteDatabase);
            Log.i("creating contacts database version 95");
            C22781De.A03();
            try {
                SQLiteDatabase sQLiteDatabase2 = A012.A00;
                sQLiteDatabase2.beginTransaction();
                ? obj = new Object();
                AnonymousClass1F6 r5 = new AnonymousClass1F6();
                Set<AnonymousClass12T> set = (Set) this.A03.A00.get();
                for (AnonymousClass12T BLt : set) {
                    BLt.BLt(r5);
                }
                r5.A05(A012, "WaDatabaseHelper");
                r5.A02(A012);
                for (AnonymousClass12T BLp : set) {
                    BLp.BLp(obj, r5);
                }
                r5.A03(A012, "WaDatabaseHelper");
                for (AnonymousClass12T BLv : set) {
                    BLv.BLv(r5);
                }
                r5.A04(A012, "WaDatabaseHelper");
                AnonymousClass31X.A00(A012);
                sQLiteDatabase2.setTransactionSuccessful();
                this.A01.A00.edit().remove("force_wadb_check").apply();
                sQLiteDatabase2.endTransaction();
                C22781De.A03();
                this.A00 = A012;
            } catch (Throwable th) {
                C22781De.A03();
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.10T, X.1Lw] */
    public C24811Lt(AnonymousClass190 r8, AnonymousClass118 r9, AnonymousClass11O r10, AnonymousClass1Cb r11, AnonymousClass1CO r12, AnonymousClass1CT r13, AnonymousClass00H r14, String str) {
        super(r9.A00, r8, r11, str, 95);
        this.A04 = new AnonymousClass10T();
        this.A00 = r9;
        this.A02 = r12;
        this.A03 = r13;
        this.A05 = r14;
        this.A01 = r10;
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Downgrading contacts database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        Log.w(sb.toString());
        onCreate(sQLiteDatabase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0086, code lost:
        r6.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_hours_trigger");
        X.C28331Zy.A01(r6, "wa_biz_profiles_hours");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0091, code lost:
        r6.execSQL("DROP TRIGGER IF EXISTS group_admin_settings_deletion_trigger");
        X.C28331Zy.A01(r6, "wa_group_admin_settings");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x009c, code lost:
        X.C28331Zy.A01(r6, "wa_block_list");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a2, code lost:
        r6.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_categories_trigger");
        X.C28331Zy.A01(r6, "wa_biz_profiles_categories");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00ad, code lost:
        X.C28331Zy.A01(r6, "wa_group_add_black_list");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b3, code lost:
        X.C28331Zy.A01(r6, "wa_props");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b9, code lost:
        X.C28331Zy.A01(r6, "wa_last_entry_point");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00bf, code lost:
        r6.execSQL("DROP TABLE IF EXISTS wa_contact_capabilities");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c2, code lost:
        X.C28331Zy.A01(r6, "wa_last_seen_block_list");
        X.C28331Zy.A01(r6, "wa_profile_photo_block_list");
        X.C28331Zy.A01(r6, "wa_about_block_list");
        X.C28331Zy.A01(r6, "wa_pix_block_list");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00da, code lost:
        X.C28331Zy.A01(r6, "wa_trusted_contacts");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00e0, code lost:
        X.C28331Zy.A01(r6, "wa_trusted_contacts_send");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e6, code lost:
        X.C28331Zy.A01(r6, "subgroup_info");
        r6.execSQL("DROP TABLE IF EXISTS group_relationship");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00f1, code lost:
        r6.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_linked_accounts_trigger");
        X.C28331Zy.A01(r6, "wa_biz_profiles_linked_accounts_table");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00fc, code lost:
        X.C28331Zy.A01(r6, "group_membership_count");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0101, code lost:
        X.C28331Zy.A01(r6, "dismissed_chat");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0106, code lost:
        r6.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_service_areas_trigger");
        X.C28331Zy.A01(r6, "wa_biz_profiles_service_areas");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0111, code lost:
        X.C28331Zy.A01(r6, "group_membership_approval_requests");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0116, code lost:
        r6.execSQL("DROP TRIGGER IF EXISTS contact_bd_for_business_profiles");
        r6.execSQL("DROP TRIGGER IF EXISTS contact_bu_for_business_profiles");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x011c, code lost:
        r6.execSQL("DROP TRIGGER IF EXISTS wa_biz_profiles_bd_direct_connection_allowed_country_codes_trigger");
        X.C28331Zy.A01(r6, "wa_biz_profiles_direct_connection_allowed_country_codes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0127, code lost:
        r6.execSQL("DROP TRIGGER IF EXISTS before_delete_dc_enabled_features_trigger");
        X.C28331Zy.A01(r6, "wa_biz_profiles_dc_enabled_features");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0132, code lost:
        X.C28331Zy.A01(r6, "quick_promotion_payload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0137, code lost:
        X.C28331Zy.A01(r6, "non_admin_group_membership_approval_requests");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x013c, code lost:
        X.C28331Zy.A01(r6, "wa_biz_profiles_price_tiers");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0142, code lost:
        r6.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_biz_profile_to_service_offerings_trigger");
        X.C28331Zy.A01(r6, "wa_biz_profile_to_service_offerings");
        X.C28331Zy.A01(r6, "wa_biz_category_service_offerings");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0153, code lost:
        X.C28331Zy.A01(r6, "recently_accepted_deeplink_invites");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x015a, code lost:
        if (r8 < 19) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x015c, code lost:
        r2 = new android.content.ContentValues(1);
        r2.put("tag", (java.lang.String) null);
        r6.update("wa_biz_profiles", r2, (java.lang.String) null, (java.lang.String[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x016c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0049, code lost:
        X.C28331Zy.A01(r6, "system_contacts_version_table");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x004f, code lost:
        X.C28331Zy.A01(r6, "wa_vnames");
        X.C28331Zy.A01(r6, "wa_vnames_localized");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005b, code lost:
        X.C28331Zy.A01(r6, "wa_contact_storage_usage");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0061, code lost:
        r6.execSQL("DROP TRIGGER IF EXISTS contact_bu_for_business_profiles");
        r6.execSQL("DROP TRIGGER IF EXISTS contact_bd_for_business_profiles");
        X.C28331Zy.A01(r6, "wa_biz_profiles");
        r6.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_websites_trigger");
        X.C28331Zy.A01(r6, "wa_biz_profiles_websites");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0075, code lost:
        X.C28331Zy.A01(r6, "wa_group_descriptions");
        X.C28331Zy.A01(r6, "wa_contacts");
        r6.execSQL("CREATE TABLE wa_biz_profiles (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, email TEXT, address TEXT, business_description TEXT, tag TEXT)");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r6, int r7, int r8) {
        /*
            r5 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Upgrading contacts database from version "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " to "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r4 = "DROP TABLE IF EXISTS wa_contact_capabilities"
            java.lang.String r3 = "wa_biz_profiles"
            java.lang.String r2 = "DROP TRIGGER IF EXISTS contact_bd_for_business_profiles"
            java.lang.String r1 = "DROP TRIGGER IF EXISTS contact_bu_for_business_profiles"
            switch(r7) {
                case 3: goto L_0x0046;
                case 4: goto L_0x0046;
                case 5: goto L_0x0046;
                case 6: goto L_0x0040;
                case 7: goto L_0x0049;
                case 8: goto L_0x0049;
                case 9: goto L_0x004f;
                case 10: goto L_0x004f;
                case 11: goto L_0x005b;
                case 12: goto L_0x005b;
                case 13: goto L_0x005b;
                case 14: goto L_0x005b;
                case 15: goto L_0x005b;
                case 16: goto L_0x005b;
                case 17: goto L_0x005b;
                case 18: goto L_0x0061;
                case 19: goto L_0x0075;
                case 20: goto L_0x0086;
                case 21: goto L_0x0086;
                case 22: goto L_0x0086;
                case 23: goto L_0x0086;
                case 24: goto L_0x0086;
                case 25: goto L_0x0091;
                case 26: goto L_0x009c;
                case 27: goto L_0x009c;
                case 28: goto L_0x009c;
                case 29: goto L_0x00a2;
                case 30: goto L_0x00a2;
                case 31: goto L_0x00a2;
                case 32: goto L_0x00ad;
                case 33: goto L_0x00ad;
                case 34: goto L_0x00b3;
                case 35: goto L_0x00b3;
                case 36: goto L_0x00b9;
                case 37: goto L_0x00b9;
                case 38: goto L_0x00b9;
                case 39: goto L_0x00bf;
                case 40: goto L_0x00c2;
                case 41: goto L_0x00c2;
                case 42: goto L_0x00c2;
                case 43: goto L_0x00c2;
                case 44: goto L_0x00c2;
                case 45: goto L_0x00c2;
                case 46: goto L_0x00c2;
                case 47: goto L_0x00c2;
                case 48: goto L_0x00c2;
                case 49: goto L_0x00da;
                case 50: goto L_0x00da;
                case 51: goto L_0x00e0;
                case 52: goto L_0x00e6;
                case 53: goto L_0x00e6;
                case 54: goto L_0x00f1;
                case 55: goto L_0x00f1;
                case 56: goto L_0x00fc;
                case 57: goto L_0x00fc;
                case 58: goto L_0x00fc;
                case 59: goto L_0x00fc;
                case 60: goto L_0x0101;
                case 61: goto L_0x0101;
                case 62: goto L_0x0101;
                case 63: goto L_0x0101;
                case 64: goto L_0x0106;
                case 65: goto L_0x0106;
                case 66: goto L_0x0106;
                case 67: goto L_0x0106;
                case 68: goto L_0x0111;
                case 69: goto L_0x0116;
                case 70: goto L_0x0116;
                case 71: goto L_0x011c;
                case 72: goto L_0x011c;
                case 73: goto L_0x011c;
                case 74: goto L_0x011c;
                case 75: goto L_0x011c;
                case 76: goto L_0x0127;
                case 77: goto L_0x0127;
                case 78: goto L_0x0132;
                case 79: goto L_0x0137;
                case 80: goto L_0x013c;
                case 81: goto L_0x013c;
                case 82: goto L_0x013c;
                case 83: goto L_0x013c;
                case 84: goto L_0x013c;
                case 85: goto L_0x013c;
                case 86: goto L_0x0142;
                case 87: goto L_0x0142;
                case 88: goto L_0x0142;
                case 89: goto L_0x0142;
                case 90: goto L_0x0153;
                case 91: goto L_0x0153;
                case 92: goto L_0x0153;
                case 93: goto L_0x0158;
                case 94: goto L_0x0158;
                default: goto L_0x0028;
            }
        L_0x0028:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unrecognized old database version; oldVersion="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r5.onCreate(r6)
        L_0x003f:
            return
        L_0x0040:
            java.lang.String r0 = "DROP INDEX wa_contact_capabilities_jid_index"
            r6.execSQL(r0)
            goto L_0x0049
        L_0x0046:
            r6.execSQL(r4)
        L_0x0049:
            java.lang.String r0 = "system_contacts_version_table"
            X.C28331Zy.A01(r6, r0)
        L_0x004f:
            java.lang.String r0 = "wa_vnames"
            X.C28331Zy.A01(r6, r0)
            java.lang.String r0 = "wa_vnames_localized"
            X.C28331Zy.A01(r6, r0)
        L_0x005b:
            java.lang.String r0 = "wa_contact_storage_usage"
            X.C28331Zy.A01(r6, r0)
        L_0x0061:
            r6.execSQL(r1)
            r6.execSQL(r2)
            X.C28331Zy.A01(r6, r3)
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_websites_trigger"
            r6.execSQL(r0)
            java.lang.String r0 = "wa_biz_profiles_websites"
            X.C28331Zy.A01(r6, r0)
        L_0x0075:
            java.lang.String r0 = "wa_group_descriptions"
            X.C28331Zy.A01(r6, r0)
            java.lang.String r0 = "wa_contacts"
            X.C28331Zy.A01(r6, r0)
            java.lang.String r0 = "CREATE TABLE wa_biz_profiles (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, email TEXT, address TEXT, business_description TEXT, tag TEXT)"
            r6.execSQL(r0)
        L_0x0086:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_hours_trigger"
            r6.execSQL(r0)
            java.lang.String r0 = "wa_biz_profiles_hours"
            X.C28331Zy.A01(r6, r0)
        L_0x0091:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS group_admin_settings_deletion_trigger"
            r6.execSQL(r0)
            java.lang.String r0 = "wa_group_admin_settings"
            X.C28331Zy.A01(r6, r0)
        L_0x009c:
            java.lang.String r0 = "wa_block_list"
            X.C28331Zy.A01(r6, r0)
        L_0x00a2:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_categories_trigger"
            r6.execSQL(r0)
            java.lang.String r0 = "wa_biz_profiles_categories"
            X.C28331Zy.A01(r6, r0)
        L_0x00ad:
            java.lang.String r0 = "wa_group_add_black_list"
            X.C28331Zy.A01(r6, r0)
        L_0x00b3:
            java.lang.String r0 = "wa_props"
            X.C28331Zy.A01(r6, r0)
        L_0x00b9:
            java.lang.String r0 = "wa_last_entry_point"
            X.C28331Zy.A01(r6, r0)
        L_0x00bf:
            r6.execSQL(r4)
        L_0x00c2:
            java.lang.String r0 = "wa_last_seen_block_list"
            X.C28331Zy.A01(r6, r0)
            java.lang.String r0 = "wa_profile_photo_block_list"
            X.C28331Zy.A01(r6, r0)
            java.lang.String r0 = "wa_about_block_list"
            X.C28331Zy.A01(r6, r0)
            java.lang.String r0 = "wa_pix_block_list"
            X.C28331Zy.A01(r6, r0)
        L_0x00da:
            java.lang.String r0 = "wa_trusted_contacts"
            X.C28331Zy.A01(r6, r0)
        L_0x00e0:
            java.lang.String r0 = "wa_trusted_contacts_send"
            X.C28331Zy.A01(r6, r0)
        L_0x00e6:
            java.lang.String r0 = "subgroup_info"
            X.C28331Zy.A01(r6, r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS group_relationship"
            r6.execSQL(r0)
        L_0x00f1:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_linked_accounts_trigger"
            r6.execSQL(r0)
            java.lang.String r0 = "wa_biz_profiles_linked_accounts_table"
            X.C28331Zy.A01(r6, r0)
        L_0x00fc:
            java.lang.String r0 = "group_membership_count"
            X.C28331Zy.A01(r6, r0)
        L_0x0101:
            java.lang.String r0 = "dismissed_chat"
            X.C28331Zy.A01(r6, r0)
        L_0x0106:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_service_areas_trigger"
            r6.execSQL(r0)
            java.lang.String r0 = "wa_biz_profiles_service_areas"
            X.C28331Zy.A01(r6, r0)
        L_0x0111:
            java.lang.String r0 = "group_membership_approval_requests"
            X.C28331Zy.A01(r6, r0)
        L_0x0116:
            r6.execSQL(r2)
            r6.execSQL(r1)
        L_0x011c:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS wa_biz_profiles_bd_direct_connection_allowed_country_codes_trigger"
            r6.execSQL(r0)
            java.lang.String r0 = "wa_biz_profiles_direct_connection_allowed_country_codes"
            X.C28331Zy.A01(r6, r0)
        L_0x0127:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS before_delete_dc_enabled_features_trigger"
            r6.execSQL(r0)
            java.lang.String r0 = "wa_biz_profiles_dc_enabled_features"
            X.C28331Zy.A01(r6, r0)
        L_0x0132:
            java.lang.String r0 = "quick_promotion_payload"
            X.C28331Zy.A01(r6, r0)
        L_0x0137:
            java.lang.String r0 = "non_admin_group_membership_approval_requests"
            X.C28331Zy.A01(r6, r0)
        L_0x013c:
            java.lang.String r0 = "wa_biz_profiles_price_tiers"
            X.C28331Zy.A01(r6, r0)
        L_0x0142:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_biz_profile_to_service_offerings_trigger"
            r6.execSQL(r0)
            java.lang.String r0 = "wa_biz_profile_to_service_offerings"
            X.C28331Zy.A01(r6, r0)
            java.lang.String r0 = "wa_biz_category_service_offerings"
            X.C28331Zy.A01(r6, r0)
        L_0x0153:
            java.lang.String r0 = "recently_accepted_deeplink_invites"
            X.C28331Zy.A01(r6, r0)
        L_0x0158:
            r0 = 19
            if (r8 < r0) goto L_0x003f
            r0 = 1
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>(r0)
            r1 = 0
            java.lang.String r0 = "tag"
            r2.put(r0, r1)
            r6.update(r3, r2, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24811Lt.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    private C23141Ev A01(SQLiteDatabase sQLiteDatabase) {
        String databaseName = getDatabaseName();
        return AnonymousClass1Eu.A03(sQLiteDatabase, (AnonymousClass1CP) this.A05.get(), this.A02, databaseName);
    }

    public void A08() {
        super.A08();
        this.A04.notifyAllObservers(new C20735AWq(45));
    }

    public C23141Ev A09() {
        try {
            return A01(super.A04());
        } catch (SQLiteDatabaseCorruptException e) {
            Log.w("Contacts database is corrupt. Removing...", e);
            A08();
            return A01(super.A04());
        } catch (SQLiteException e2) {
            e = e2;
            String obj = e.toString();
            if (obj.contains("file is encrypted")) {
                Log.w("Contacts database is encrypted. Removing...", e);
                A08();
                return A01(super.A04());
            }
            if (obj.contains("upgrade read-only database")) {
                Log.w("Client actually opened database as read-only and can't upgrade. Switching to writable...", e);
                return A01(super.A04());
            }
            throw e;
        } catch (StackOverflowError e3) {
            e = e3;
            Log.w("StackOverflowError during db init check");
            for (StackTraceElement methodName : e.getStackTrace()) {
                if (methodName.getMethodName().equals("onCorruption")) {
                    Log.w("Contacts database is corrupt. Found via StackOverflowError. Removing...");
                    A08();
                    return A01(super.A04());
                }
            }
            throw e;
        }
    }

    public C24811Lt(AnonymousClass190 r10, AnonymousClass118 r11, AnonymousClass11O r12, AnonymousClass1Cb r13, AnonymousClass1CO r14, AnonymousClass1CT r15, AnonymousClass00H r16) {
        this(r10, r11, r12, r13, r14, r15, r16, "wa.db");
    }
}
