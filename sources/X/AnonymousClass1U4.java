package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.companiondevice.hosteddevicepairing.HostedDeviceAccountEncryptionTypeTransitionController$startAccountTransition$1;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.1U4  reason: invalid class name */
public class AnonymousClass1U4 implements C26701Td {
    public static final long[] A0B = {300000, 3600000, 7200000};
    public final AnonymousClass1U3 A00;
    public final AnonymousClass11P A01;
    public final C19830z4 A02;
    public final AnonymousClass1RK A03;
    public final C18030ve A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass190 A06;
    public final AnonymousClass1RH A07;
    public final AnonymousClass11S A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;

    public static void A00(AnonymousClass1U4 r13, long j, long j2, boolean z) {
        AnonymousClass1U4 r10 = r13;
        AnonymousClass1U3 r1 = r13.A00;
        C19830z4 r0 = r1.A01;
        long j3 = j;
        try {
            AnonymousClass2BB A032 = r1.A03(r1.A02(AnonymousClass2RD.E2EE, r0.A03(), r0.A02(), j));
            if (A032 != null) {
                AnonymousClass378 r9 = new AnonymousClass378(r10, (AnonymousClass1OZ) r10.A09.get(), j3, j2, z);
                AnonymousClass1OZ r102 = r9.A01;
                String A0B2 = r102.A0B();
                r102.A0I(r9, new C29621ca(new C29621ca("key-index-list", A032.A0M(), new AnonymousClass1MD[]{new AnonymousClass1MD("ts", r9.A00)}), "iq", new AnonymousClass1MD[]{new AnonymousClass1MD((Jid) C173438v4.A00, "to"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2), new AnonymousClass1MD("xmlns", "md"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set")}), A0B2, 268, 32000);
                return;
            }
        } catch (Exception e) {
            Log.e("CompanionDeviceAdvUtil/createADVSignedKeyIndexList ", e);
        }
        Log.e("DeviceKeyIndexListUpdateHandler/updateKeyIndexList fail to generate index list");
        r10.A04(-1);
    }

    public void A03() {
        if (((C57652jQ) this.A05.get()).A00()) {
            A01(this, "update_key_index_list_generic");
            return;
        }
        long A012 = this.A00.A01();
        if (A012 != -1) {
            A00(this, A012, AnonymousClass11P.A01(this.A01), false);
            return;
        }
        Log.e("DeviceKeyIndexListUpdateHandler/updateKeyIndexList/fail to generate ts");
        A04(-1);
    }

    public /* synthetic */ void BqZ(C59312m6 r1, boolean z) {
    }

    public /* synthetic */ void BrL(C59312m6 r1) {
    }

    public /* synthetic */ void BrO(C59312m6 r1) {
    }

    public /* synthetic */ void BrP(C199410f r1, String str, int i) {
    }

    public /* synthetic */ void BrS(C59312m6 r1) {
    }

    public /* synthetic */ void BrU() {
    }

    public static void A01(AnonymousClass1U4 r10, String str) {
        C54712ea r3 = (C54712ea) r10.A0A.get();
        C179319Hm r7 = C179319Hm.UNPAIRING;
        String str2 = str;
        C198589ya A002 = r10.A07.A00((DeviceJid) null, str);
        C71033Dn r11 = new C71033Dn(0);
        synchronized (r3) {
            AnonymousClass1OB r0 = r3.A00;
            if (r0 == null || !r0.Be2()) {
                StringBuilder sb = new StringBuilder();
                sb.append("HostedDeviceAccountEncryptionTransitionController/transitioning to ");
                sb.append(r7);
                sb.append(" for ");
                sb.append(str2);
                Log.i(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Missing logger for ");
                sb2.append(r7);
                sb2.append(" due to ");
                sb2.append(str2);
                Log.e(sb2.toString());
                C55712gF r5 = (C55712gF) r3.A02.get();
                Object obj = r5.A04.get();
                C18070vi.A0X(obj);
                Object obj2 = r5.A05.get();
                C18070vi.A0X(obj2);
                Object obj3 = r5.A06.get();
                C18070vi.A0X(obj3);
                ArrayList A062 = AnonymousClass1ZU.A06(obj, obj2, obj3);
                if (((SharedPreferences) r5.A00.A00.get()).getBoolean("smb_coex_lazy_sys_msg_enabled", false)) {
                    Object obj4 = r5.A03.get();
                    C18070vi.A0X(obj4);
                    A062.add(obj4);
                }
                if (C18020vd.A05(C18040vf.A02, r5.A01, 11514)) {
                    Object obj5 = r5.A02.get();
                    C18070vi.A0X(obj5);
                    A062.add(obj5);
                }
                AnonymousClass2AI r02 = new AnonymousClass2AI();
                r02.addAll(A062);
                AnonymousClass1IX build = r02.build();
                C18070vi.A0X(build);
                AnonymousClass1OX r2 = r3.A03;
                HostedDeviceAccountEncryptionTypeTransitionController$startAccountTransition$1 hostedDeviceAccountEncryptionTypeTransitionController$startAccountTransition$1 = new HostedDeviceAccountEncryptionTypeTransitionController$startAccountTransition$1(build, A002, r7, (BCS) null, str2, (C30391dr) null, r11);
                r3.A00 = C30451dy.A02(AnonymousClass00R.A00, AnonymousClass1OR.A00, hostedDeviceAccountEncryptionTypeTransitionController$startAccountTransition$1, r2);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("HostedDeviceAccountEncryptionTransitionController/transitioning job already active to ");
                sb3.append(r7);
                sb3.append(" for ");
                sb3.append(str2);
                Log.w(sb3.toString());
            }
        }
    }

    public static boolean A02(AnonymousClass1U4 r3) {
        if (C18020vd.A00(C18040vf.A02, r3.A04, 477) == 0 || ((!(!r3.A03.A06().isEmpty()) && !((C57652jQ) r3.A05.get()).A00()) || r3.A08.A0N())) {
            return false;
        }
        return true;
    }

    public void A04(int i) {
        long A012 = AnonymousClass11P.A01(this.A01);
        AnonymousClass1U3 r4 = this.A00;
        C19830z4 r3 = r4.A01;
        C19830z4.A00(r3).putLong("adv_key_index_list_last_failure_time", A012).apply();
        C19830z4.A00(r3).remove("adv_key_index_list_require_update").apply();
        int i2 = ((SharedPreferences) r3.A00.get()).getInt("adv_key_index_list_update_retry_count", 0) + 1;
        C19830z4.A00(r3).putInt("adv_key_index_list_update_retry_count", i2).apply();
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceKeyIndexListUpdateHandler/onError code=");
        sb.append(i);
        sb.append("; retryCount=");
        sb.append(i2);
        Log.e(sb.toString());
        if (i2 > 5) {
            Log.e("DeviceKeyIndexListUpdateHandler/onError logout all devices");
            this.A06.A0G("adv-key-index-list-update", "key index list update fails for more than 5 times", true);
            r4.A04();
        }
    }

    public AnonymousClass1U4(AnonymousClass190 r1, AnonymousClass1RH r2, AnonymousClass11S r3, AnonymousClass1U3 r4, AnonymousClass11P r5, C19830z4 r6, AnonymousClass1RK r7, C18030ve r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        this.A01 = r5;
        this.A04 = r8;
        this.A06 = r1;
        this.A08 = r3;
        this.A09 = r9;
        this.A02 = r6;
        this.A0A = r11;
        this.A03 = r7;
        this.A00 = r4;
        this.A07 = r2;
        this.A05 = r10;
    }

    public void BrT(C199410f r2) {
        if (!r2.isEmpty() && A02(this)) {
            A03();
        }
    }
}
