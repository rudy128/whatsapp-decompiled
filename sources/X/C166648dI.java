package X;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.registration.RegisterName;

/* renamed from: X.8dI  reason: invalid class name and case insensitive filesystem */
public final class C166648dI extends C161028Bb {
    public int A00;
    public final /* synthetic */ RegisterName A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166648dI(AnonymousClass11C r8, AnonymousClass11P r9, C18000vb r10, C18030ve r11, RegisterName registerName) {
        super(registerName, r8, r9, r10, r11, 2131625699);
        this.A01 = registerName;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x020c, code lost:
        if (X.C17880vN.A0B(r21).getBoolean("reg_profile_pic_tapped_key", false) != false) goto L_0x020e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(int r24) {
        /*
            r23 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RegisterName/updatestate/state "
            r8 = r24
            X.C17900vP.A0j(r0, r1, r8)
            r3 = r23
            r3.A00 = r8
            com.whatsapp.registration.RegisterName r7 = r3.A01
            X.0vl r2 = r7.A01
            java.lang.Object r0 = r2.getValue()
            com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel r0 = (com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel) r0
            boolean r0 = r0.A0V()
            r4 = 0
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "RegisterName/updateState/disable audio guidance"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r2.getValue()
            com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel r0 = (com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel) r0
            r0.A0U(r4)
            java.lang.Object r0 = r2.getValue()
            com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel r0 = (com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel) r0
            X.4Mq r0 = r0.A0D
            X.0vl r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.C17890vO.A0A(r0)
            java.lang.String r0 = "reg_audio_guidance_feature_id"
            X.C17880vN.A1C(r1, r0, r4)
            java.lang.Object r6 = r2.getValue()
            com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel r6 = (com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel) r6
            X.1OX r5 = X.C41561wd.A00(r6)
            X.0wl r2 = r6.A0H
            r1 = 0
            com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel$cleanupAudioFiles$1 r0 = new com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel$cleanupAudioFiles$1
            r0.<init>(r6, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r5)
        L_0x0056:
            r6 = 1
            if (r8 == r6) goto L_0x0081
            X.1CM r0 = r7.A07
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x0081
            X.1Vy r0 = r7.A11
            if (r0 == 0) goto L_0x007d
            r0.A02()
            r0 = 2131431633(0x7f0b10d1, float:1.8485E38)
            android.view.View r0 = X.C123576Uz.A00(r3, r0)
            r0.setVisibility(r4)
            r0 = 2131433807(0x7f0b194f, float:1.848941E38)
            android.view.View r0 = X.C123576Uz.A00(r3, r0)
            r0.setVisibility(r4)
            return
        L_0x007d:
            java.lang.String r0 = "mediaMigrationUtil"
            goto L_0x03f8
        L_0x0081:
            r0 = 2131431633(0x7f0b10d1, float:1.8485E38)
            android.view.View r0 = X.C123576Uz.A00(r3, r0)
            r2 = 4
            r0.setVisibility(r2)
            r0 = 2131433807(0x7f0b194f, float:1.848941E38)
            android.view.View r0 = X.C123576Uz.A00(r3, r0)
            r0.setVisibility(r2)
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BR.A08(r7)
            java.lang.String r0 = "com.whatsapp.registername.initializer_start_time"
            X.C17880vN.A1B(r1, r0)
            android.view.View r0 = r7.A01
            if (r0 == 0) goto L_0x00a6
            r0.setVisibility(r2)
        L_0x00a6:
            android.os.Handler r0 = r7.A1e
            r0.removeMessages(r4)
            java.lang.String r0 = "RegisterName/sync/finished"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.19F r0 = r7.A0e
            if (r0 == 0) goto L_0x03f3
            r0.A04()
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BR.A08(r7)
            java.lang.String r0 = "check_new_reg_from_referral"
            X.C17880vN.A1F(r1, r0, r6)
            X.0z4 r5 = r7.A0A
            X.11P r0 = r3.A05
            long r1 = X.AnonymousClass11P.A01(r0)
            android.content.SharedPreferences$Editor r5 = X.C19830z4.A00(r5)
            java.lang.String r0 = "registration_success_time_ms"
            X.C17880vN.A1D(r5, r0, r1)
            X.1de r0 = r7.A0o
            if (r0 == 0) goto L_0x03f0
            r0.A00()
            android.content.Intent r1 = X.AnonymousClass1LU.A0A(r7)
            java.lang.String r0 = "show_payment_account_recovery"
            r1.putExtra(r0, r6)
            r7.startActivity(r1)
            r7.finish()
            r1 = 0
            com.whatsapp.registration.RegisterName.A1n = r1
            X.AnonymousClass4Yv.A00(r7, r4)
            X.1Vv r0 = r7.A0z
            if (r0 == 0) goto L_0x03ea
            X.1jH r0 = r7.A0y
            if (r0 == 0) goto L_0x03e4
            r8 = 2
            r0.A01(r6, r8)
            X.1jH r0 = r7.A0y
            if (r0 == 0) goto L_0x03e1
            r0.A01(r8, r8)
            android.content.SharedPreferences r0 = X.C72453Mb.A0M(r7)
            java.lang.String r12 = "eula_accepted_time"
            r1 = 0
            long r4 = r0.getLong(r12, r1)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x02e5
            X.00H r0 = r7.A18
            if (r0 == 0) goto L_0x03de
            boolean r0 = X.C72463Mc.A1W(r0)
            r20 = 3
            if (r0 == 0) goto L_0x011e
            r20 = 4
        L_0x011e:
            com.whatsapp.registration.RegisterName.A0s(r7, r8)
            X.00H r0 = r7.A1I
            if (r0 == 0) goto L_0x03db
            java.lang.Object r11 = r0.get()
            X.9dt r11 = (X.C186249dt) r11
            android.content.Context r19 = r3.getContext()
            X.C18070vi.A0X(r19)
            X.0z4 r0 = r7.A0A
            r22 = r0
            X.C18070vi.A0X(r22)
            java.lang.Integer r0 = r7.A1Q
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x03d6
            int r18 = r0.intValue()
            java.lang.Integer r0 = r7.A1P
            if (r0 == 0) goto L_0x03d1
            int r17 = r0.intValue()
            java.lang.Integer r10 = r7.A1N
            java.lang.Integer r9 = r7.A1O
            X.1E7 r0 = r7.A0Y
            r16 = r0
            boolean r15 = r7.A1S
            boolean r14 = r7.A1U
            X.118 r0 = r7.A0R
            if (r0 == 0) goto L_0x03ce
            java.lang.String r13 = X.AnonymousClass9R1.A00(r0)
            X.8s9 r8 = new X.8s9
            r8.<init>()
            X.00H r0 = r11.A01
            java.lang.Object r0 = r0.get()
            X.2ZS r0 = (X.AnonymousClass2ZS) r0
            java.util.concurrent.atomic.AtomicReference r0 = r0.A00
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r8.A0E = r0
            long r2 = java.lang.System.currentTimeMillis()
            r0 = r22
            X.00H r0 = r0.A00
            r21 = r0
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r21)
            r4 = 0
            long r0 = r0.getLong(r12, r4)
            java.lang.Long r0 = X.C108945cZ.A1B(r2, r0)
            r8.A0C = r0
            long r2 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r21)
            java.lang.String r0 = "message_store_verified_time"
            long r0 = r1.getLong(r0, r4)
            java.lang.Long r0 = X.C108945cZ.A1B(r2, r0)
            r8.A0D = r0
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r21)
            java.lang.String r0 = "registration_attempt_skip_with_no_vertical"
            r2 = 0
            boolean r0 = r1.getBoolean(r0, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A01 = r0
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r21)
            java.lang.String r0 = "registration_retry_fetching_biz_profile"
            boolean r0 = r1.getBoolean(r0, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A05 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r8.A0A = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r8.A07 = r0
            X.1Vp r1 = new X.1Vp
            r0 = r19
            r1.<init>(r0)
            boolean r0 = r1.A01()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A00 = r0
            if (r10 != 0) goto L_0x01fc
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r21)
            java.lang.String r1 = "reg_backup_status_key"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x03c5
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r21)
            int r0 = X.AnonymousClass8BT.A01(r0, r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
        L_0x01fc:
            r8.A08 = r10
            r3 = 0
            if (r15 != 0) goto L_0x020e
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r21)
            java.lang.String r0 = "reg_profile_pic_tapped_key"
            boolean r1 = r1.getBoolean(r0, r2)
            r0 = 0
            if (r1 == 0) goto L_0x020f
        L_0x020e:
            r0 = 1
        L_0x020f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A04 = r0
            if (r16 == 0) goto L_0x023b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            r8.A03 = r0
            if (r14 == 0) goto L_0x023b
            if (r9 != 0) goto L_0x0239
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r21)
            java.lang.String r1 = "reg_profile_pic_source_key"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x03c2
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r21)
            int r0 = X.AnonymousClass8BT.A01(r0, r1)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        L_0x0239:
            r8.A09 = r9
        L_0x023b:
            java.lang.String r0 = r22.A0j()
            byte[] r0 = X.A9B.A0Y(r0)
            java.lang.String r0 = X.AnonymousClass8BT.A0x(r0)
            r8.A0G = r0
            java.lang.String r0 = r22.A0p()
            if (r0 == 0) goto L_0x0269
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r21)
            java.lang.String r0 = "pref_wfs_pw"
            r2 = 0
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 == 0) goto L_0x0269
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r21)
            java.lang.String r0 = "pref_wfs_id_sign"
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 == 0) goto L_0x0269
            r3 = 1
        L_0x0269:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r8.A02 = r0
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r21)
            java.lang.String r1 = "pref_wfs_source"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x03bf
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r21)
            int r0 = X.AnonymousClass8BT.A01(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0287:
            r8.A0B = r0
            X.0ve r2 = r11.A00
            r0 = 7315(0x1c93, float:1.025E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x029b
            java.lang.String r0 = r22.A0a()
            r8.A0F = r0
        L_0x029b:
            r0 = 10504(0x2908, float:1.4719E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x02a9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r8.A06 = r0
        L_0x02a9:
            r0 = 11133(0x2b7d, float:1.56E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x02b3
            r8.A0H = r13
        L_0x02b3:
            X.00H r0 = r7.A1I
            if (r0 == 0) goto L_0x03db
            java.lang.Object r15 = r0.get()
            X.00H r14 = r7.A1M
            if (r14 == 0) goto L_0x03cb
            X.18K r3 = r7.A0h
            if (r3 == 0) goto L_0x03c8
            X.10I r2 = r7.A05
            X.C18070vi.A0X(r2)
            X.11S r1 = r7.A02
            X.C18070vi.A0X(r1)
            X.188 r0 = r7.A0g
            if (r0 == 0) goto L_0x03f6
            r3.CC4(r8)
            r3.Bio()
            r18 = 16
            X.7Py r13 = new X.7Py
            r16 = r1
            r17 = r0
            r13.<init>(r14, r15, r16, r17, r18)
            r2.CGF(r13)
        L_0x02e5:
            android.content.SharedPreferences r0 = X.C72453Mb.A0M(r7)
            java.lang.String r2 = "is_latam_tos_shown_during_reg"
            boolean r0 = X.C17880vN.A1W(r0, r2)
            if (r0 == 0) goto L_0x0311
            X.00H r0 = r7.A1I
            if (r0 == 0) goto L_0x03db
            r0.get()
            X.8qh r1 = new X.8qh
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.A00 = r0
            X.00H r0 = r7.A1I
            if (r0 == 0) goto L_0x03db
            r0.get()
            X.18K r0 = r7.A0h
            if (r0 == 0) goto L_0x03c8
            r0.CC4(r1)
        L_0x0311:
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BR.A08(r7)
            java.lang.String r0 = "message_store_verified_time"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            android.content.SharedPreferences$Editor r1 = r0.remove(r12)
            java.lang.String r0 = "registration_retry_fetching_biz_profile"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "registration_attempt_skip_with_no_vertical"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "registration_sibling_app_phone_number"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "registration_sibling_app_country_code"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "registration_sibling_app_min_storage_needed"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "sister_app_content_provider_is_enabled"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "direct_migration_start_time"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "direct_db_migration_timeout_in_secs"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "migrate_from_consumer_app_directly"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "direct_migration_session_id"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "google_migrate_import_start_time"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "registration_use_sms_retriever"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "reg_backup_status_key"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "reg_profile_pic_source_key"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "reg_profile_pic_tapped_key"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "email_address"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "registration_code"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "pref_autoconf_secure_verifier"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            android.content.SharedPreferences$Editor r1 = r0.remove(r2)
            java.lang.String r0 = "less_beep_beep_identi"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "less_beep_beep_time"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "pref_has_seen_contact_primer_during_email_reg"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "sms_retriever_retry_count"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "sms_retriever_app_inactive_retry_count"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "pref_phone_number_hint_during_reg_shown"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "pref_wa_old_device_name"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "registration_last_code_method"
            X.C17880vN.A1B(r1, r0)
            return
        L_0x03bf:
            r0 = 0
            goto L_0x0287
        L_0x03c2:
            r9 = 0
            goto L_0x0239
        L_0x03c5:
            r10 = 0
            goto L_0x01fc
        L_0x03c8:
            java.lang.String r0 = "wamRuntime"
            goto L_0x03f8
        L_0x03cb:
            java.lang.String r0 = "wamDailyEventDailyCron"
            goto L_0x03f8
        L_0x03ce:
            java.lang.String r0 = "waContext"
            goto L_0x03f8
        L_0x03d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r1)
            throw r0
        L_0x03d6:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r1)
            throw r0
        L_0x03db:
            java.lang.String r0 = "regWamUtil"
            goto L_0x03f8
        L_0x03de:
            java.lang.String r0 = "contactAccessHelper"
            goto L_0x03f8
        L_0x03e1:
            java.lang.String r0 = "backupTokenProtocolHelper"
            goto L_0x03f8
        L_0x03e4:
            java.lang.String r0 = "backupTokenProtocolHelper"
            X.C18070vi.A11(r0)
            throw r1
        L_0x03ea:
            java.lang.String r0 = "directMigrationLogging"
            X.C18070vi.A11(r0)
            throw r1
        L_0x03f0:
            java.lang.String r0 = "badgeNotificationHelper"
            goto L_0x03f8
        L_0x03f3:
            java.lang.String r0 = "abPropsManager"
            goto L_0x03f8
        L_0x03f6:
            java.lang.String r0 = "wamAttributeStore"
        L_0x03f8:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166648dI.A00(int):void");
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        C28281Zt.A03(AnonymousClass4Z9.A00(getContext(), 2130970286), this);
        Window window = getWindow();
        if (window != null) {
            window.setFormat(1);
            window.addFlags(ZipDecompressor.UNZIP_BUFFER_SIZE);
            window.setSoftInputMode(3);
        }
        if (bundle != null) {
            i = bundle.getInt("state");
        } else {
            i = 0;
        }
        A00(i);
        RegisterName registerName = this.A01;
        View findViewById = findViewById(2131433470);
        AnonymousClass3Ma.A1A(findViewById, registerName, 45);
        registerName.A01 = findViewById;
        AnonymousClass00H r0 = registerName.A16;
        if (r0 == null) {
            C18070vi.A11("accountSwitcher");
            throw null;
        } else if (C17880vN.A0I(r0).A0J(false)) {
            View A002 = C123576Uz.A00(this, 2131435549);
            C18070vi.A0z(A002, "null cannot be cast to non-null type com.whatsapp.WaTextView");
            ((TextView) A002).setText(2131886381);
        }
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        C18070vi.A0X(onSaveInstanceState);
        onSaveInstanceState.putInt("state", this.A00);
        return onSaveInstanceState;
    }
}
