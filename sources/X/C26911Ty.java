package X;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Ty  reason: invalid class name and case insensitive filesystem */
public final class C26911Ty {
    public final C18100vl A00;
    public final C18100vl A01;
    public final C18100vl A02;
    public final C18100vl A03;
    public final C18100vl A04;
    public final C18100vl A05;
    public final C18100vl A06;
    public final C18100vl A07;
    public final C18100vl A08;
    public final C18100vl A09;
    public final C18100vl A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final C18100vl A0F;
    public final C18100vl A0G;
    public final C26901Tx A0H;

    public final void A0C(BAE bae, UserJid userJid) {
        A0D(new C20471AMi(this, bae, 0), userJid);
    }

    public final void A0E(BAF baf, UserJid userJid, boolean z) {
        C18070vi.A0d(userJid, 0);
        ((AnonymousClass10I) this.A0E.getValue()).CGF(new AnonymousClass7RT(this, userJid, baf, 5, z));
    }

    public final void A0F(C36211nW r2, UserJid userJid, String str) {
        C18070vi.A0d(userJid, 0);
        C18070vi.A0d(r2, 2);
        A07(userJid, str).A00(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x014d, code lost:
        if (r1 != null) goto L_0x0110;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G(X.AEW r10, com.whatsapp.jid.UserJid r11) {
        /*
            r9 = this;
            r3 = 0
            X.C18070vi.A0d(r11, r3)
            if (r10 == 0) goto L_0x0150
            X.0vl r0 = r9.A0A
            java.lang.Object r0 = r0.getValue()
            X.11S r0 = (X.AnonymousClass11S) r0
            boolean r0 = r0.A0O(r11)
            if (r0 == 0) goto L_0x00d8
            X.0vl r0 = r9.A0D
            java.lang.Object r2 = r0.getValue()
            X.0z4 r2 = (X.C19830z4) r2
            X.0vl r0 = r9.A0B
            java.lang.Object r0 = r0.getValue()
            X.11P r0 = (X.AnonymousClass11P) r0
            long r0 = X.AnonymousClass11P.A01(r0)
            android.content.SharedPreferences$Editor r4 = X.C19830z4.A00(r2)
            java.lang.String r2 = "smb_last_my_business_profile_sync_time"
            android.content.SharedPreferences$Editor r0 = r4.putLong(r2, r0)
            r0.apply()
            X.0vl r0 = r9.A01
            java.lang.Object r4 = r0.getValue()
            X.2de r4 = (X.C54132de) r4
            X.2uz r5 = r10.A02
            if (r5 == 0) goto L_0x00d8
            java.lang.String r2 = "incomplete_profile"
            java.lang.String r0 = "warning"
            X.2ux r1 = new X.2ux
            r1.<init>(r2, r0)
            X.11S r0 = r4.A00
            boolean r0 = X.AnonymousClass9PU.A00(r0, r10)
            java.util.List r6 = r5.A02
            if (r0 == 0) goto L_0x00ab
            r6.remove(r1)
        L_0x0059:
            X.0z4 r4 = r4.A01
            java.lang.String r2 = r5.A00
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r4)
            java.lang.String r0 = "smb_searchability_intent"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
            r0.apply()
            java.lang.String r2 = r5.A01
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r4)
            java.lang.String r0 = "smb_searchability_status"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
            r0.apply()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r6.iterator()
        L_0x0084:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r6 = r8.next()
            X.2ux r6 = (X.C64552ux) r6
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r1 = "id"
            java.lang.String r0 = r6.A01
            r2.put(r1, r0)
            java.lang.String r1 = "level"
            java.lang.String r0 = r6.A00
            r2.put(r1, r0)
            java.lang.String r0 = r2.toString()
            r7.add(r0)
            goto L_0x0084
        L_0x00ab:
            boolean r0 = r6.contains(r1)
            if (r0 != 0) goto L_0x0059
            r6.add(r1)
            goto L_0x0059
        L_0x00b5:
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r4)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r7)
            java.lang.String r0 = "smb_searchability_issues"
            android.content.SharedPreferences$Editor r0 = r2.putStringSet(r0, r1)
            r0.apply()
            boolean r2 = r5.A03
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r4)
            java.lang.String r0 = "smb_is_profile_edit_disabled"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.apply()
        L_0x00d8:
            X.AEW r1 = r9.A08(r11)
            boolean r0 = A05(r9, r10, r1)
            if (r0 == 0) goto L_0x00ec
            java.util.Set r0 = java.util.Collections.singleton(r11)
            X.C18070vi.A0X(r0)
            A02(r9, r0)
        L_0x00ec:
            boolean r0 = A04(r9, r10, r1)
            if (r0 == 0) goto L_0x00fc
            java.util.Set r0 = java.util.Collections.singleton(r11)
            X.C18070vi.A0X(r0)
            A01(r9, r0)
        L_0x00fc:
            int r2 = r10.A00
            if (r2 != 0) goto L_0x014d
            if (r1 == 0) goto L_0x0122
            int r0 = r1.A00
            if (r0 == 0) goto L_0x0110
            java.util.Set r0 = java.util.Collections.singleton(r11)
            X.C18070vi.A0X(r0)
            A00(r9, r0)
        L_0x0110:
            int r1 = r1.A00
            r0 = 1
            if (r1 != r0) goto L_0x0122
            if (r2 != 0) goto L_0x0122
            X.0vl r0 = r9.A0G
            java.lang.Object r0 = r0.getValue()
            X.2nQ r0 = (X.C60122nQ) r0
            r0.A01(r11, r3)
        L_0x0122:
            X.0vl r0 = r9.A04
            java.lang.Object r1 = r0.getValue()
            X.9CB r1 = (X.AnonymousClass9CB) r1
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r0.put(r11, r10)
            r1.A0L(r0)
            boolean r0 = A03(r9, r10)
            if (r0 == 0) goto L_0x0150
            X.0vl r0 = r9.A07
            java.lang.Object r2 = r0.getValue()
            X.A2z r2 = (X.C20009A2z) r2
            X.2xv r1 = new X.2xv
            r1.<init>(r9)
            r0 = 1
            r2.A05(r1, r10, r11, r0)
            return
        L_0x014d:
            if (r1 == 0) goto L_0x0122
            goto L_0x0110
        L_0x0150:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26911Ty.A0G(X.AEW, com.whatsapp.jid.UserJid):void");
    }

    public final void A0H(UserJid userJid, String str) {
        C18070vi.A0d(userJid, 0);
        C18070vi.A0d(str, 1);
        String rawString = userJid.getRawString();
        SharedPreferences.Editor A002 = C19830z4.A00((C19830z4) this.A0D.getValue());
        StringBuilder sb = new StringBuilder();
        sb.append("dc_default_postcode_");
        sb.append(rawString);
        A002.putString(sb.toString(), str).apply();
    }

    public final boolean A0K(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        C18100vl r1 = this.A07;
        if (((C20009A2z) r1.getValue()).A02(userJid) == null || ((C20009A2z) r1.getValue()).A08(userJid)) {
            return false;
        }
        return true;
    }

    static {
        TimeUnit.HOURS.toMillis(24);
    }

    public static final void A01(C26911Ty r5, Set set) {
        if (((AnonymousClass1PV) r5.A0F.getValue()).A02()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AnonymousClass1BI r3 = (AnonymousClass1BI) it.next();
                AnonymousClass122 r2 = (AnonymousClass122) ((AnonymousClass121) r5.A06.getValue());
                if (r2.A0a.A09(r3)) {
                    AnonymousClass2M8 A012 = r2.A15.A01(r3, false);
                    AnonymousClass122.A07(r2, A012, -1);
                    r2.A0J(A012, -1);
                }
            }
        }
    }

    public static final boolean A03(C26911Ty r0, AEW aew) {
        if ((((C192179nw) r0.A03.getValue()).A00() & 128) <= 0 || aew == null || !aew.A0Y) {
            return false;
        }
        return true;
    }

    public static final boolean A04(C26911Ty r3, AEW aew, AEW aew2) {
        C18020vd r2 = (C18020vd) r3.A00.getValue();
        C18070vi.A0X(r2);
        boolean A052 = C18020vd.A05(C18040vf.A02, r2, 4873);
        boolean z = false;
        if (!A052 || aew == null || aew.A00 != 1 || r3.A06(aew, aew2)) {
            return false;
        }
        if (aew2 != null && aew2.A00 == 1) {
            z = true;
        }
        return !z;
    }

    public static final boolean A05(C26911Ty r4, AEW aew, AEW aew2) {
        C18030ve r0 = (C18030ve) r4.A00.getValue();
        C18070vi.A0X(r0);
        boolean z = false;
        if (!C84104Hw.A00(r0) || aew == null || aew.A00 != 2 || r4.A06(aew, aew2)) {
            return false;
        }
        if (aew2 != null && aew2.A00 == 2) {
            z = true;
        }
        return true ^ z;
    }

    private final boolean A06(AEW aew, AEW aew2) {
        UserJid userJid;
        if (!((AnonymousClass11S) this.A0A.getValue()).A0N() || aew2 != null || (userJid = aew.A09) == null || ((C57492jA) ((AnonymousClass1PV) this.A0F.getValue()).A01.get()).A00(userJid) == -1) {
            return false;
        }
        return true;
    }

    public final C20987Acf A07(UserJid userJid, String str) {
        C26901Tx r1 = this.A0H;
        int A002 = ((C192179nw) this.A03.getValue()).A00();
        AnonymousClass10E r12 = r1.A00.A00;
        AnonymousClass1OZ r8 = (AnonymousClass1OZ) r12.A6N.get();
        C26911Ty r5 = (C26911Ty) r12.A1J.get();
        C39511tC r6 = (C39511tC) r12.A1K.get();
        return new C20987Acf((AnonymousClass190) r12.A31.get(), (AnonymousClass1KB) r12.A4b.get(), (AnonymousClass11S) r12.A63.get(), r5, r6, userJid, r8, (C20004A2u) r12.A0v.get(), str, A002);
    }

    public final AEW A08(UserJid userJid) {
        C20044A4n A0J = ((AnonymousClass9CB) this.A04.getValue()).A0J(userJid);
        if (A0J == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        AnonymousClass00H r7 = ((C54132de) this.A01.getValue()).A01.A00;
        String string = ((SharedPreferences) r7.get()).getString("smb_searchability_intent", (String) null);
        String string2 = ((SharedPreferences) r7.get()).getString("smb_searchability_status", (String) null);
        ArrayList arrayList2 = new ArrayList(((SharedPreferences) r7.get()).getStringSet("smb_searchability_issues", new HashSet()));
        ArrayList arrayList3 = new ArrayList();
        try {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = new JSONObject((String) it.next());
                String string3 = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                String string4 = jSONObject.getString("level");
                C18070vi.A0b(string3);
                C18070vi.A0b(string4);
                arrayList3.add(new C64552ux(string3, string4));
            }
            arrayList = arrayList3;
        } catch (JSONException unused) {
            Log.e("BusinessAccountSettingsManager/getBusinessAccountSettings invalid issue list JSON");
        }
        A0J.A02 = new C64572uz(string, string2, arrayList, false);
        return A0J.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A09(com.whatsapp.jid.UserJid r7) {
        /*
            r6 = this;
            X.0vl r0 = r6.A04
            java.lang.Object r1 = r0.getValue()
            X.9CB r1 = (X.AnonymousClass9CB) r1
            r5 = 0
            if (r7 != 0) goto L_0x0011
            java.lang.String r0 = "contact-mgr-db/cannot get business description details by null jid"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r5
        L_0x0011:
            X.1Lx r0 = r1.A00
            com.whatsapp.jid.UserJid r0 = r0.A00(r7)
            java.lang.String r4 = X.C22971Dz.A06(r0)
            X.C17960vV.A07(r4)
            X.C18070vi.A0X(r4)
            X.1Lt r0 = r1.A00
            X.1at r3 = r0.get()
            java.lang.String r2 = "SELECT _id, jid, email, business_description, address, tag, latitude, longitude, vertical, has_catalog, address_postal_code, address_city_id, address_city_name, commerce_experience, shop_url, cart_enabled, commerce_manager_url, direct_connection_enabled, is_shop_banned, default_postcode, location_name, galaxy_business_enabled, cover_photo_url, cover_photo_id, custom_url, member_since, capi_calling_enabled, is_responsive, postcode_type, price_tier_id, business_blocked_status, survey_sampling_rate, is_offerings_eligible, automated_type, is_typing_indicator_enabled, calling_hidden_entry_points, business_has_shopping_flow FROM wa_biz_profiles WHERE jid = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0053 }
            r0 = 0
            r1[r0] = r4     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = "CONTACT_BIZ_PROFILES"
            android.database.Cursor r2 = X.C24861Ly.A03(r3, r2, r0, r1)     // Catch:{ all -> 0x0053 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = "business_description"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r5 = r2.getString(r0)     // Catch:{ all -> 0x004c }
        L_0x0045:
            r2.close()     // Catch:{ all -> 0x0053 }
            r3.close()
            return r5
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26911Ty.A09(com.whatsapp.jid.UserJid):java.lang.String");
    }

    public final String A0A(UserJid userJid) {
        return ((C20009A2z) this.A07.getValue()).A02(userJid);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap A0B() {
        /*
            r9 = this;
            X.0vl r0 = r9.A04
            java.lang.Object r8 = r0.getValue()
            X.9CB r8 = (X.AnonymousClass9CB) r8
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            X.1Lt r0 = r8.A00
            X.1at r5 = r0.get()
            java.lang.String r2 = "SELECT jid, tag FROM wa_biz_profiles"
            java.lang.String r1 = "CONTACT_BIZ_PROFILES"
            r0 = 0
            android.database.Cursor r6 = X.C24861Ly.A03(r5, r2, r1, r0)     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "jid"
            int r4 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "tag"
            int r3 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0050 }
        L_0x0029:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0049
            X.1Lx r2 = r8.A00     // Catch:{ all -> 0x0050 }
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = r6.getString(r4)     // Catch:{ all -> 0x0050 }
            com.whatsapp.jid.UserJid r0 = r1.A04(r0)     // Catch:{ all -> 0x0050 }
            com.whatsapp.jid.UserJid r1 = r2.A00(r0)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0029
            java.lang.String r0 = r6.getString(r3)     // Catch:{ all -> 0x0050 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0050 }
            goto L_0x0029
        L_0x0049:
            r6.close()     // Catch:{ all -> 0x0057 }
            r5.close()
            return r7
        L_0x0050:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x0057 }
            throw r0     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26911Ty.A0B():java.util.HashMap");
    }

    public final void A0D(B77 b77, UserJid userJid) {
        String str;
        ((AnonymousClass10I) this.A0E.getValue()).CGF(new C21455AkM(this, userJid, b77, 18));
        A2H a2h = (A2H) this.A05.getValue();
        String A012 = C18020vd.A01(C18040vf.A02, a2h.A05, 1763);
        C18070vi.A0X(A012);
        if (userJid != null && (str = userJid.user) != null && AnonymousClass1YF.A0Y(A012, str, false)) {
            if (!a2h.A00) {
                a2h.A00 = true;
                Context context = a2h.A02.A00;
                C18070vi.A0X(context);
                ((C29831cw) a2h.A06.get()).A01(context, new C161128Bv(a2h, 8), new IntentFilter("android.intent.action.LOCALE_CHANGED"), true);
            }
            if (a2h.A03()) {
                a2h.A02();
            }
        }
    }

    public final void A0I(UserJid userJid, boolean z) {
        ((AnonymousClass10I) this.A0E.getValue()).CGF(new AnonymousClass7RF(this, userJid, 8, z));
    }

    public final boolean A0J() {
        if ((((C192179nw) this.A03.getValue()).A00() & 128) > 0) {
            return true;
        }
        return false;
    }

    public static final void A00(C26911Ty r12, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI r7 = (AnonymousClass1BI) it.next();
            AnonymousClass122 r4 = (AnonymousClass122) ((AnonymousClass121) r12.A06.getValue());
            if (r4.A0a.A09(r7)) {
                AnonymousClass2MD A032 = r4.A11.A03(r7, (String) null, 2, AnonymousClass11P.A01(r4.A0A));
                AnonymousClass122.A07(r4, A032, -1);
                StringBuilder sb = new StringBuilder();
                sb.append("CoreMessageStore/downgrade from bot system msg when automatedType downgrade; jid=");
                sb.append(r7);
                Log.i(sb.toString());
                r4.A0J(A032, -1);
            }
        }
    }

    public static final void A02(C26911Ty r7, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI r5 = (AnonymousClass1BI) it.next();
            AnonymousClass122 r4 = (AnonymousClass122) ((AnonymousClass121) r7.A06.getValue());
            if (r4.A0a.A09(r5)) {
                AnonymousClass2M8 A012 = r4.A15.A01(r5, true);
                AnonymousClass122.A07(r4, A012, -1);
                StringBuilder sb = new StringBuilder();
                sb.append("CoreMessageStore/3p bot system msg when automatedType updated; jid=");
                sb.append(r5);
                Log.i(sb.toString());
                r4.A0J(A012, -1);
            }
        }
    }

    public C26911Ty(C26901Tx r21, AnonymousClass00H r22, AnonymousClass00H r23, AnonymousClass00H r24, AnonymousClass00H r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34, AnonymousClass00H r35, AnonymousClass00H r36, AnonymousClass00H r37, AnonymousClass00H r38) {
        AnonymousClass00H r19 = r22;
        C18070vi.A0d(r19, 1);
        AnonymousClass00H r18 = r23;
        C18070vi.A0d(r18, 2);
        AnonymousClass00H r17 = r24;
        C18070vi.A0d(r17, 3);
        AnonymousClass00H r16 = r25;
        C18070vi.A0d(r16, 4);
        AnonymousClass00H r12 = r26;
        C18070vi.A0d(r12, 5);
        AnonymousClass00H r15 = r27;
        C18070vi.A0d(r15, 6);
        AnonymousClass00H r11 = r28;
        C18070vi.A0d(r11, 7);
        AnonymousClass00H r13 = r29;
        C18070vi.A0d(r13, 8);
        AnonymousClass00H r14 = r30;
        C18070vi.A0d(r14, 9);
        AnonymousClass00H r10 = r31;
        C18070vi.A0d(r10, 10);
        AnonymousClass00H r9 = r32;
        C18070vi.A0d(r9, 11);
        AnonymousClass00H r8 = r33;
        C18070vi.A0d(r8, 12);
        AnonymousClass00H r7 = r34;
        C18070vi.A0d(r7, 13);
        AnonymousClass00H r6 = r35;
        C18070vi.A0d(r6, 14);
        AnonymousClass00H r5 = r36;
        C18070vi.A0d(r5, 15);
        AnonymousClass00H r4 = r37;
        C18070vi.A0d(r4, 16);
        AnonymousClass00H r3 = r38;
        C18070vi.A0d(r3, 17);
        C26901Tx r1 = r21;
        C18070vi.A0d(r1, 18);
        this.A0H = r1;
        this.A0C = new C18110vm(new AnonymousClass3Gt(r15, 11));
        this.A04 = new C18110vm(new C26921Tz(this, r14));
        this.A03 = new C18110vm(new AnonymousClass3Gt(r13, 3));
        this.A0A = new C18110vm(new AnonymousClass3Gt(r17, 9));
        this.A0B = new C18110vm(new AnonymousClass3Gt(r19, 10));
        this.A00 = new C18110vm(new AnonymousClass3Gt(r18, 0));
        this.A0E = new C18110vm(new AnonymousClass3Gt(r16, 13));
        this.A0G = new C18110vm(new AnonymousClass3Gt(r12, 15));
        this.A0D = new C18110vm(new AnonymousClass3Gt(r11, 12));
        this.A06 = new C18110vm(new AnonymousClass3Gt(r10, 5));
        this.A07 = new C18110vm(new AnonymousClass3Gt(r9, 6));
        this.A0F = new C18110vm(new AnonymousClass3Gt(r8, 14));
        this.A08 = new C18110vm(new AnonymousClass3Gt(r7, 7));
        this.A02 = new C18110vm(new AnonymousClass3Gt(r6, 2));
        this.A01 = new C18110vm(new AnonymousClass3Gt(r5, 1));
        this.A05 = new C18110vm(new AnonymousClass3Gt(r4, 4));
        this.A09 = new C18110vm(new AnonymousClass3Gt(r3, 8));
        Boolean bool = C17960vV.A01;
    }
}
