package X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import androidx.preference.PreferenceScreen;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2Ko  reason: invalid class name and case insensitive filesystem */
public class C47942Ko extends AnonymousClass10T {
    public final C19880zA A00;
    public final C19880zA A01;
    public final AnonymousClass190 A02;
    public final AnonymousClass1KB A03;
    public final C33621j7 A04;
    public final AnonymousClass1NT A05;
    public final AnonymousClass1UW A06;
    public final C32951i1 A07;
    public final AnonymousClass11C A08;
    public final AnonymousClass118 A09;
    public final C219217x A0A;
    public final C19830z4 A0B;
    public final AnonymousClass1P3 A0C;
    public final AnonymousClass1Cd A0D;
    public final AnonymousClass1WZ A0E;
    public final C33701jF A0F;
    public final C33841jT A0G;
    public final AnonymousClass1Nb A0H;
    public final AnonymousClass10I A0I;
    public final AnonymousClass1DA A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final AnonymousClass00H A0Q;
    public final AnonymousClass00H A0R;
    public final AnonymousClass00H A0S;
    public final AnonymousClass00H A0T;
    public final C19880zA A0U;
    public final C19880zA A0V;
    public final C19880zA A0W;
    public final C19880zA A0X;
    public final C19880zA A0Y;
    public final C19880zA A0Z;
    public final C19880zA A0a;
    public final C19880zA A0b;
    public final C19880zA A0c;
    public final C19880zA A0d;
    public final AnonymousClass11S A0e;
    public final C32531hL A0f;
    public final C53022br A0g;
    public final C26811To A0h;
    public final AnonymousClass1VJ A0i;
    public final AnonymousClass11R A0j;
    public final C22611Cn A0k;
    public final C192719or A0l;
    public final AnonymousClass1MO A0m;
    public final AnonymousClass1KH A0n;
    public final AnonymousClass7IU A0o;
    public final C33631j8 A0p;
    public final C18030ve A0q;
    public final C27131Uv A0r;
    public final AnonymousClass1SS A0s;
    public final C32431hB A0t;
    public final C25011Mn A0u;
    public final C32291gx A0v;
    public final AnonymousClass1DC A0w;
    public final C52692bK A0x;
    public final AnonymousClass19K A0y;
    public final AnonymousClass00H A0z;
    public final AnonymousClass00H A10;
    public final AnonymousClass00H A11;
    public final AnonymousClass00H A12;
    public final AnonymousClass00H A13;
    public final AnonymousClass00H A14;
    public final AnonymousClass00H A15;
    public final AnonymousClass00H A16;
    public final AnonymousClass00H A17;
    public final AnonymousClass00H A18;
    public final C18140vp A19;

    private void A00(Context context, Runnable runnable, boolean z) {
        C18040vf r5;
        Set emptySet;
        C32431hB r52 = this.A0t;
        synchronized (r52.A0C) {
            Iterator it = r52.A0B().iterator();
            while (it.hasNext()) {
                C32431hB.A06(r52, C17880vN.A0b(it), false, true, true);
            }
        }
        this.A0v.A0E(false);
        C20114A7x a7x = (C20114A7x) this.A11.get();
        synchronized (a7x) {
            a7x.A04.clear();
            a7x.A05.clear();
            a7x.A06.clear();
            C18030ve r1 = a7x.A01;
            r5 = C18040vf.A02;
            if (C18020vd.A05(r5, r1, 8209)) {
                a7x.A07.clear();
            }
        }
        this.A03.A0J(new C70613Bu(this, 17));
        ((C136796uQ) this.A0M.get()).A01();
        C33841jT r3 = this.A0G;
        r3.A09();
        C59932n7 r0 = (C59932n7) this.A0K.get();
        r0.A01 = false;
        r0.A00 = null;
        r0.A04.A1r((String) null, (String) null);
        ((C37551pj) this.A0O.get()).A0C();
        C19830z4 r2 = this.A0B;
        r2.A1F(0);
        C17880vN.A1D(C17890vO.A0B(r2).edit(), "native_contacts_enter_integrity_unknown_timestamp", 0);
        r2.A1M(0);
        r2.A1N(0);
        r2.A1O(0);
        r2.A1P(0);
        this.A06.A02();
        r2.A1G(0);
        r2.A25(true);
        r2.A26(false);
        ((AnonymousClass1UZ) this.A0P.get()).A00(false);
        C138616xO r7 = (C138616xO) ((C60122nQ) this.A0R.get()).A00.get();
        ((AnonymousClass1H7) r7.A04.getValue()).A02();
        AnonymousClass00H r6 = r7.A03;
        ((C138936xw) r6.get()).A01("biz_bot");
        ((AnonymousClass1H7) r7.A05.getValue()).A02();
        ((C138936xw) r6.get()).A01("meta_ai_biz");
        C19880zA r12 = this.A01;
        if (r12.A07()) {
            C19880zA.A02(r12);
            throw AnonymousClass000.A0s("clear");
        }
        r3.A0D((String) null, (String) null, (String) null);
        C33701jF r32 = this.A0F;
        AnonymousClass1QS r13 = r32.A01;
        synchronized (r13) {
            AZ8 az8 = r13.A01;
            if (az8 == null) {
                Log.e("resetFeatureData/defaultPaymentServiceByCountry is null");
            } else {
                AnonymousClass3M8 BPV = az8.BPV();
                if (BPV != null) {
                    BPV.BII();
                }
            }
        }
        r32.A01(true, true);
        Context context2 = this.A09.A00;
        AnonymousClass10I r33 = this.A0I;
        r33.CGF(new C21455AkM(this, context2, runnable, 7));
        Log.i("deleteaccountconfirm/removeDatabasesAndResetState() done");
        File filesDir = context.getFilesDir();
        filesDir.toString();
        for (int i = 0; i < context.fileList().length; i++) {
        }
        if (z) {
            emptySet = Collections.singleton("Logs");
        } else {
            emptySet = Collections.emptySet();
        }
        C64062u9.A0K(filesDir, emptySet);
        r33.CGF(new C21422Ajp(2));
        C32951i1 r62 = this.A07;
        synchronized (r62) {
            r62.A08().commit();
            C33001i6 r14 = r62.A07;
            C33001i6.A01(r14).edit().clear().commit();
            C33001i6.A00(r14).edit().clear().commit();
        }
        String externalStorageState = Environment.getExternalStorageState();
        C17900vP.A0f("deleteacctconfirm/externalmedia-state ", externalStorageState, AnonymousClass000.A10());
        if (this.A0A.A0K(externalStorageState)) {
            A8L.A03(C33621j7.A00(this.A04).A04);
        }
        this.A0f.A02();
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append(context.getPackageName());
        SharedPreferences sharedPreferences = context.getSharedPreferences(AnonymousClass000.A0y("_preferences", A102), 0);
        if (!sharedPreferences.edit().clear().commit()) {
            Log.e("deleteacctconfirm/cleanup/clear failed");
        }
        A02();
        if (!sharedPreferences.edit().putString("version", "2.24.24.78").commit()) {
            Log.e("deleteacctconfirm/cleanup/setversion failed");
        }
        String A0f2 = r2.A0f();
        C19830z4.A00(r2).remove(AnonymousClass001.A1H("gdrive_last_successful_backup_timestamp:", A0f2, AnonymousClass000.A10())).remove(AnonymousClass001.A1H("gdrive_last_successful_backup_total_size:", A0f2, AnonymousClass000.A10())).remove(AnonymousClass001.A1H("gdrive_last_successful_backup_media_size:", A0f2, AnonymousClass000.A10())).remove(AnonymousClass001.A1H("gdrive_last_successful_backup_video_size:", A0f2, AnonymousClass000.A10())).remove(AnonymousClass001.A1H("gdrive_last_successful_backup_encrypted:", A0f2, AnonymousClass000.A10())).remove("gdrive_backup_start_timestamp").remove("gdrive_next_prompt_for_setup_timestamp").remove("gdrive_old_media_encryption_status").remove("gdrive_old_media_encryption_start_time").remove("gdrive_last_restore_file_encryption_metadata").remove("gdrive_successive_backup_failed_count").remove("gdrive_already_uploaded_bytes").remove("gdrive_user_initiated_backup").remove("gdrive_activity_state").remove("gdrive_activity_msgstore_init_key").remove("gdrive_account_name").remove("gdrive_setup_user_prompted_count").commit();
        C17880vN.A1B(C19830z4.A00(r2), "contactless_jids_store");
        ((AnonymousClass1NP) this.A0N.get()).A07().edit().remove("gdrive_error_code").remove("gdrive_state").remove("interface_gdrive_backup_frequency").remove("interface_gdrive_backup_network_setting").remove("gdrive_approx_media_download_size").remove("gdrive_include_videos_in_backup").remove("gdrive_media_restore_network_setting").remove("gdrive_restore_overwrite_local_files").remove("gdrive_restore_start_timestamp").remove("gdrive_already_downloaded_bytes").commit();
        AnonymousClass11R r22 = this.A0j;
        boolean A052 = C18020vd.A05(r5, this.A0q, 12289);
        AnonymousClass11Q.A00(r22.A00).clear().commit();
        SharedPreferences sharedPreferences2 = r22.A01.A00;
        C17880vN.A1C(sharedPreferences2.edit(), "registration_device_id", 0);
        SharedPreferences.Editor putInt = sharedPreferences2.edit().putInt("companion_registration_state", 0);
        if (A052) {
            putInt.apply();
        } else {
            putInt.commit();
        }
        CookieManager instance = CookieManager.getInstance();
        instance.removeAllCookies((ValueCallback) null);
        instance.removeSessionCookies((ValueCallback) null);
        r33.CGF(new C70613Bu(instance, 16));
        WebStorage.getInstance().deleteAllData();
    }

    public void A01() {
        C33841jT.A03(this.A0G, 6, true);
        notifyAllObservers(new C20735AWq(7));
        AnonymousClass3C0 r12 = new AnonymousClass3C0(this, new AtomicInteger(2), 32);
        C33621j7 r1 = this.A04;
        Context context = this.A09.A00;
        C203211r A002 = C33621j7.A00(r1);
        String A0f2 = A002.A07.A0f();
        AnonymousClass11S r13 = A002.A00;
        r13.A0I();
        if (r13.A00 == null || TextUtils.isEmpty(A0f2)) {
            Log.i("deleteacctconfirm/not registered or no google account so no google backup deletion");
            r12.run();
        } else {
            PhoneUserJid A012 = AnonymousClass11S.A01(r13);
            ConditionVariable conditionVariable = new ConditionVariable(false);
            C45812Bt r11 = new C45812Bt(conditionVariable, A002);
            ConditionVariable conditionVariable2 = new ConditionVariable(false);
            C64212uP r6 = new C64212uP(conditionVariable2, A002, r11);
            AnonymousClass00H r3 = A002.A0B;
            r3.get();
            context.bindService(AnonymousClass1LU.A1M(context, (String) null), r6, 1);
            r3.get();
            Intent A1M = AnonymousClass1LU.A1M(context, "action_delete");
            A1M.putExtra("account_name", A0f2);
            A1M.putExtra("jid_user", A012.user);
            AnonymousClass10I r2 = A002.A0A;
            r2.CGF(new C21455AkM(conditionVariable2, context, A1M, 13));
            r2.CGD(new AnonymousClass2PV(context, conditionVariable2, conditionVariable, A002, r11, r12), new Void[0]);
        }
        this.A0u.A00();
        ((C219017v) this.A17.get()).A0F(false, 13);
        A00(context, r12, false);
        if (Build.VERSION.SDK_INT >= 26) {
            C39571tI.A00(context, this.A08);
        }
        C20000A2o a2o = (C20000A2o) this.A19.get();
        a2o.A01.A07(-1);
        A4A a4a = a2o.A00.A01;
        try {
            AiK A003 = A4A.A00(a4a);
            if (A003 != null) {
                A003.close();
                AiK.A07(A003.A06);
            }
            a4a.A03 = null;
            A4A.A00(a4a);
            a4a.A00 = C17880vN.A11();
            A4A.A01(a4a);
        } catch (IOException unused) {
            Log.e("BkCacheSaveOnDiskHelper/clearAllEntries exception wile clearing all entries");
        }
    }

    public void A02() {
        Context context = this.A09.A00;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append(context.getPackageName());
        String A0y2 = AnonymousClass000.A0y("_preferences", A102);
        SharedPreferences sharedPreferences = context.getSharedPreferences("_has_set_default_values", 0);
        C195659th r1 = new C195659th(context);
        r1.A07 = A0y2;
        r1.A02 = null;
        r1.A02 = null;
        r1.A02(context, (PreferenceScreen) null, 2132279304);
        C17880vN.A1F(sharedPreferences.edit(), "_has_set_default_values", true);
    }

    public void A03() {
        C192719or r3 = this.A0l;
        synchronized (r3) {
            r3.A01();
            File databasePath = r3.A02.A00.getDatabasePath("commerce.db");
            boolean delete = databasePath.delete();
            AnonymousClass1Eu.A07(databasePath, "CommerceDBStorage/removeDatabase");
            C17900vP.A0n("CommerceDBStorage/removeDatabase/deleted", AnonymousClass000.A10(), delete);
        }
        AnonymousClass11S r0 = this.A0e;
        r0.A0F();
        r0.A0G();
        C27131Uv r2 = this.A0r;
        synchronized (r2) {
            synchronized (r2.A0T) {
                try {
                    Map map = r2.A03;
                    if (map != null) {
                        map.clear();
                    }
                    r2.A0c.clear();
                    r2.A0a.clear();
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                    throw th;
                }
            }
            synchronized (r2.A0U) {
                try {
                    Map map2 = r2.A04;
                    if (map2 != null) {
                        map2.clear();
                    }
                    r2.A0Z.clear();
                    r2.A0b.clear();
                } catch (Throwable th2) {
                    while (true) {
                        th = th2;
                        break;
                    }
                }
            }
            Map map3 = r2.A0Y;
            synchronized (map3) {
                try {
                    map3.clear();
                } catch (Throwable th3) {
                    while (true) {
                        th = th3;
                        break;
                    }
                }
            }
            r2.A0K.A00.A08();
        }
        this.A0k.A02();
        try {
            this.A0x.A00.A08();
        } catch (IllegalArgumentException e) {
            C17960vV.A09("contact-mgr-db/unable to remove database ", e);
        }
        AnonymousClass72N r32 = (AnonymousClass72N) this.A18.get();
        synchronized (r32) {
            ((C24801Ls) r32.A06.get()).close();
            File databasePath2 = r32.A01.A00.getDatabasePath("stickers.db");
            C18070vi.A0X(databasePath2);
            boolean delete2 = databasePath2.delete();
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append(databasePath2.getPath());
            boolean delete3 = delete2 | new File(AnonymousClass000.A0y("-journal", A102)).delete();
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append(databasePath2.getPath());
            boolean delete4 = delete3 | new File(AnonymousClass000.A0y("-shm", A103)).delete();
            StringBuilder A104 = AnonymousClass000.A10();
            A104.append(databasePath2.getPath());
            C17900vP.A0n("StickerDbStorage/removeDatabase/deleted", AnonymousClass000.A10(), new File(AnonymousClass000.A0y("-wal", A104)).delete() | delete4);
        }
        AnonymousClass7IU r1 = this.A0o;
        Log.i("emojidictionarystore/deletedatabase");
        r1.A02.A08();
        C53022br r12 = this.A0g;
        Log.i("language-pack-store/deletedatabase");
        r12.A00.A08();
        AnonymousClass1KH r13 = this.A0n;
        synchronized (r13) {
            AnonymousClass2Di r02 = r13.A00;
            if (r02 != null) {
                r02.A08();
            }
            r13.A09 = false;
        }
        AnonymousClass1MO r14 = this.A0m;
        synchronized (r14) {
            r14.A02.A08();
            r14.A00 = null;
        }
        AnonymousClass1SS r15 = this.A0s;
        Log.i("MediaJobDataStore/deletedatabases");
        r15.A02.A08();
        ((C143877Fd) this.A14.get()).A0B();
        C26811To r33 = this.A0h;
        AnonymousClass1S2 r22 = r33.A0M;
        synchronized (r22) {
            Set set = r22.A00;
            if (set != null) {
                set.clear();
            }
        }
        AnonymousClass1TP r16 = r33.A0D;
        Log.i("HistorySyncWorkManager/stopHistorySync");
        ((A7W) r16.A00.get()).A0A("HISTORY_SYNC_WORK_UNIQUE_NAME");
        r33.A0P.A08();
        C17900vP.A0J(C25851Pw.A00(r33.A0I));
        C54442e9 r17 = (C54442e9) this.A13.get();
        r17.A01.A0A();
        r17.A00.A02();
        C62582rd r18 = (C62582rd) r17.A02.A05.get();
        C17890vO.A1E(r18.A09);
        C17890vO.A1E(r18.A06);
        C17890vO.A1E(r18.A07);
        C17890vO.A1E(r18.A08);
        C63332st r23 = (C63332st) r18.A05.get();
        synchronized (r23) {
            C17900vP.A0J(C17880vN.A0C(r23.A01));
        }
        if (((C39541tF) this.A15.get()).A00()) {
            C33971jg.A00((C33971jg) this.A16.get()).edit().clear().commit();
        }
        C57302ir r24 = (C57302ir) ((AnonymousClass10E) ((C000100c) C000400h.A00(C000100c.class, this.A09.A00))).Ao8.A00.A0g.get();
        Log.i("BusinessDirectoryStorageManager/onAccountDeleted");
        AnonymousClass2KW r19 = r24.A01;
        Log.i("BusinessDirectorySharedPrefManager/clear");
        C17900vP.A0J(r19.A00());
        r24.A00().delete();
        File A0e2 = C17880vN.A0e(r24.A00.A00.getFilesDir(), "biz_directory");
        if (!A0e2.exists()) {
            A0e2.mkdirs();
        }
        A0e2.delete();
        if (C20135A8w.A08(this.A0q)) {
            A4G a4g = (A4G) this.A10.get();
            Log.i("BusinessSearchRecentSearchManager/onAccountDeleted");
            List list = a4g.A00;
            C18070vi.A0W(list);
            synchronized (list) {
                list.clear();
            }
            A4G.A00(a4g).delete();
            File A0e3 = C17880vN.A0e(a4g.A02.A00.getFilesDir(), "business_search");
            if (!A0e3.exists()) {
                A0e3.mkdirs();
            }
            A0e3.delete();
        }
        Log.i("deleteaccountconfirm/removeDatabases() async operations done");
        return;
        throw th;
    }

    public void A04(boolean z) {
        AnonymousClass11R r3 = this.A0j;
        C18030ve r2 = this.A0q;
        C18040vf r1 = C18040vf.A02;
        boolean A052 = C18020vd.A05(r1, r2, 12289);
        SharedPreferences.Editor putInt = r3.A01.A00.edit().putInt("companion_registration_state", 9);
        if (A052) {
            putInt.apply();
        } else {
            putInt.commit();
        }
        notifyAllObservers(new C20735AWq(7));
        A7W a7w = (A7W) this.A0y.get();
        a7w.A06.BKq(new AnonymousClass8KQ(a7w));
        Context context = this.A09.A00;
        this.A0u.A00();
        boolean z2 = false;
        ((C219017v) this.A17.get()).A0F(false, 13);
        if (z) {
            this.A0i.A02(true);
        }
        if (C18020vd.A05(r1, r2, 2489) && !C17880vN.A0I(this.A0z).A0E()) {
            try {
                ActivityManager A042 = this.A08.A04();
                if (A042 == null) {
                    Runtime.getRuntime().exec(AnonymousClass001.A1H("pm clear ", context.getPackageName(), AnonymousClass000.A10()));
                    return;
                } else if (A042.clearApplicationUserData()) {
                    return;
                }
            } catch (IOException | SecurityException e) {
                this.A02.A0E("DeleteAccount/clearApplicationUserData/failed to clear, falling back to old cleanup flow", e.getMessage(), e);
            }
        } else if (this.A0e.A0N() && C18020vd.A05(r1, r2, 624)) {
            z2 = true;
        }
        A00(context, (Runnable) null, z2);
    }

    public C47942Ko(C19880zA r2, C19880zA r3, C19880zA r4, C19880zA r5, C19880zA r6, C19880zA r7, C19880zA r8, C19880zA r9, C19880zA r10, C19880zA r11, C19880zA r12, C19880zA r13, AnonymousClass190 r14, AnonymousClass1KB r15, AnonymousClass11S r16, C32531hL r17, C33621j7 r18, AnonymousClass1NT r19, C53022br r20, C26811To r21, AnonymousClass1VJ r22, AnonymousClass1UW r23, C32951i1 r24, AnonymousClass11R r25, AnonymousClass11C r26, AnonymousClass118 r27, C219217x r28, C19830z4 r29, AnonymousClass1P3 r30, C22611Cn r31, AnonymousClass1Cd r32, AnonymousClass1WZ r33, C192719or r34, AnonymousClass1MO r35, AnonymousClass1KH r36, AnonymousClass7IU r37, C33631j8 r38, C18030ve r39, C27131Uv r40, AnonymousClass1SS r41, C32431hB r42, C25011Mn r43, C32291gx r44, C33701jF r45, C33841jT r46, AnonymousClass1Nb r47, AnonymousClass1DC r48, AnonymousClass10I r49, C52692bK r50, AnonymousClass1DA r51, AnonymousClass19K r52, AnonymousClass00H r53, AnonymousClass00H r54, AnonymousClass00H r55, AnonymousClass00H r56, AnonymousClass00H r57, AnonymousClass00H r58, AnonymousClass00H r59, AnonymousClass00H r60, AnonymousClass00H r61, AnonymousClass00H r62, AnonymousClass00H r63, AnonymousClass00H r64, AnonymousClass00H r65, AnonymousClass00H r66, AnonymousClass00H r67, AnonymousClass00H r68, AnonymousClass00H r69, AnonymousClass00H r70, AnonymousClass00H r71, AnonymousClass00H r72, AnonymousClass00H r73, C18140vp r74) {
        super(r69);
        Boolean bool = C17960vV.A01;
        this.A0q = r39;
        this.A03 = r15;
        this.A0K = r53;
        this.A02 = r14;
        this.A0e = r16;
        this.A09 = r27;
        this.A0I = r49;
        this.A14 = r54;
        this.A0u = r43;
        this.A0Y = r3;
        this.A0h = r21;
        this.A0J = r51;
        this.A0n = r36;
        this.A0b = r2;
        this.A04 = r18;
        this.A16 = r55;
        this.A0w = r48;
        this.A08 = r26;
        this.A19 = r74;
        this.A0z = r56;
        this.A0y = r52;
        this.A0O = r57;
        this.A05 = r19;
        this.A18 = r58;
        this.A07 = r24;
        this.A0H = r47;
        this.A0l = r34;
        this.A0g = r20;
        this.A0s = r41;
        this.A0C = r30;
        this.A0f = r17;
        this.A0p = r38;
        this.A0Q = r59;
        this.A11 = r60;
        this.A0v = r44;
        this.A0D = r32;
        this.A0G = r46;
        this.A0d = r4;
        this.A0A = r28;
        this.A0B = r29;
        this.A0m = r35;
        this.A0j = r25;
        this.A0i = r22;
        this.A0o = r37;
        this.A0t = r42;
        this.A17 = r61;
        this.A0c = r5;
        this.A0x = r50;
        this.A13 = r62;
        this.A0r = r40;
        this.A0a = r6;
        this.A0N = r63;
        this.A0Z = r7;
        this.A0W = r8;
        this.A0F = r45;
        this.A0V = r10;
        this.A0E = r33;
        this.A0L = r64;
        this.A0M = r65;
        this.A0k = r31;
        this.A0S = r66;
        this.A0T = r67;
        this.A0U = r9;
        this.A01 = r11;
        this.A12 = r68;
        this.A0X = r12;
        this.A10 = r70;
        this.A0R = r71;
        this.A00 = r13;
        this.A15 = r72;
        this.A06 = r23;
        this.A0P = r73;
    }
}
