package com.whatsapp.settings.notificationsandsounds;

import X.AGG;
import X.AHH;
import X.AR8;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass02n;
import X.AnonymousClass10I;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1EC;
import X.AnonymousClass1FL;
import X.AnonymousClass1GP;
import X.AnonymousClass1NN;
import X.AnonymousClass1Nb;
import X.AnonymousClass1Q1;
import X.AnonymousClass201;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass5Z0;
import X.AnonymousClass7vE;
import X.AnonymousClass7vF;
import X.AnonymousClass9VV;
import X.B0O;
import X.B6V;
import X.C1406772n;
import X.C146527Pl;
import X.C17880vN;
import X.C17900vP;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C20098A7b;
import X.C20319AGb;
import X.C21552Alz;
import X.C217217d;
import X.C21729Arf;
import X.C21994Avw;
import X.C21995Avx;
import X.C21996Avy;
import X.C25231Nk;
import X.C28741ap;
import X.C37961qT;
import X.C90874em;
import X.C95444mF;
import X.C99274sY;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.whatsapp.preference.WaMuteSettingPreference;
import com.whatsapp.preference.WaRingtonePreference;
import com.whatsapp.settings.ActivityLevelNotificationSettingBottomSheet;
import com.whatsapp.util.Log;

public final class NotificationsAndSoundsFragment extends Hilt_NotificationsAndSoundsFragment {
    public AnonymousClass9VV A00;
    public AnonymousClass5Z0 A01;
    public AnonymousClass1Q1 A02;
    public AnonymousClass1NN A03;
    public C18030ve A04;
    public AnonymousClass1BI A05;
    public WaMuteSettingPreference A06;
    public WaMuteSettingPreference A07;
    public AnonymousClass1Nb A08;
    public AnonymousClass10I A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public C28741ap A0C = new AR8(this, 2);
    public AnonymousClass201 A0D;
    public final CompoundButton.OnCheckedChangeListener A0E = new C90874em(this, 27);
    public final CompoundButton.OnCheckedChangeListener A0F = new C90874em(this, 26);
    public final B6V A0G = new AHH(this, 9);
    public final C18100vl A0H;
    public final AnonymousClass02n A0I;
    public final C25231Nk A0J = new C95444mF(this, 19);
    public final AGG A0K;

    public static final void A00(Bundle bundle, NotificationsAndSoundsFragment notificationsAndSoundsFragment) {
        String str;
        C18070vi.A0d(bundle, 2);
        NotificationsAndSoundsViewModel notificationsAndSoundsViewModel = (NotificationsAndSoundsViewModel) notificationsAndSoundsFragment.A0H.getValue();
        if (bundle.getBoolean("is_mute_call_key")) {
            str = "jid_call_mute";
        } else {
            str = "jid_message_mute";
        }
        notificationsAndSoundsViewModel.A0T(str, String.valueOf(bundle.getInt("mute_selection_key")));
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        AnonymousClass1NN r1 = this.A03;
        if (r1 != null) {
            r1.registerObserver(this.A0J);
            AnonymousClass1Q1 r12 = this.A02;
            if (r12 != null) {
                r12.registerObserver(this.A0C);
                C18100vl r4 = this.A0H;
                NotificationsAndSoundsViewModel notificationsAndSoundsViewModel = (NotificationsAndSoundsViewModel) r4.getValue();
                notificationsAndSoundsViewModel.A03.A0A(A1G(), new C21552Alz(new C21729Arf(this, 5)));
                notificationsAndSoundsViewModel.A01.A0A(A1G(), new C21552Alz(new C21729Arf(this, 6)));
                notificationsAndSoundsViewModel.A02.A0A(A1G(), new C21552Alz(new C21729Arf(this, 7)));
                notificationsAndSoundsViewModel.A07.A0A(A1G(), new C21552Alz(new B0O(this)));
                NotificationsAndSoundsViewModel notificationsAndSoundsViewModel2 = (NotificationsAndSoundsViewModel) r4.getValue();
                AnonymousClass1BI r3 = this.A05;
                notificationsAndSoundsViewModel2.A00 = r3;
                notificationsAndSoundsViewModel2.A08.CGF(new C146527Pl(notificationsAndSoundsViewModel2, r3, 34));
                this.A02.setItemAnimator((C37961qT) null);
                A1E().A0t(new C20319AGb(this, 6), A1G(), "mute_dialog_request_key");
                return;
            }
            str = "chatObservers";
        } else {
            str = "conversationObservers";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A02(NotificationsAndSoundsFragment notificationsAndSoundsFragment, String str, String str2) {
        WaRingtonePreference waRingtonePreference;
        if ((C18070vi.A18(str2, "jid_message_tone") || C18070vi.A18(str2, "jid_call_ringtone")) && str != null && (waRingtonePreference = (WaRingtonePreference) notificationsAndSoundsFragment.BLF(str2)) != null) {
            waRingtonePreference.A01 = str;
            waRingtonePreference.A0H(C217217d.A06(notificationsAndSoundsFragment.A00, str));
        }
    }

    public static final void A03(NotificationsAndSoundsFragment notificationsAndSoundsFragment, String str, String str2) {
        ListPreference listPreference;
        String str3;
        CharSequence charSequence;
        if ((C18070vi.A18(str2, "jid_message_vibration") || C18070vi.A18(str2, "jid_call_vibration")) && str != null && (listPreference = (ListPreference) notificationsAndSoundsFragment.BLF(str2)) != null) {
            listPreference.A0S(str);
            CharSequence[] charSequenceArr = listPreference.A01;
            if (charSequenceArr == null || (charSequence = charSequenceArr[Integer.parseInt(str)]) == null) {
                str3 = null;
            } else {
                str3 = charSequence.toString();
            }
            listPreference.A0H(str3);
        }
    }

    public boolean C1T(Preference preference) {
        if (C18070vi.A18(preference.A0J, "jid_message_tone") || C18070vi.A18(preference.A0J, "jid_call_ringtone")) {
            this.A0K.A00 = preference.A0J;
            this.A0I.A02((C1406772n) null, ((WaRingtonePreference) preference).A0R());
            return true;
        } else if (!C18070vi.A18(preference.A0J, "jid_message_activity_level")) {
            return super.C1T(preference);
        } else {
            if (this.A05 instanceof AnonymousClass1EC) {
                AnonymousClass1GP supportFragmentManager = A1D().getSupportFragmentManager();
                AnonymousClass1BI r5 = this.A05;
                C18070vi.A0z(r5, "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid");
                AnonymousClass201 r4 = this.A0D;
                if (r4 == null) {
                    C18070vi.A11("currentActivityLevel");
                    throw null;
                }
                C18070vi.A0d(r5, 1);
                ActivityLevelNotificationSettingBottomSheet activityLevelNotificationSettingBottomSheet = new ActivityLevelNotificationSettingBottomSheet();
                Bundle A0D2 = C17880vN.A0D();
                A0D2.putInt(PublicKeyCredentialControllerUtility.JSON_KEY_ID, 17);
                AnonymousClass3MY.A15(A0D2, r5, "arg_group_jid");
                A0D2.putString("current_activity_level_value", r4.toString());
                activityLevelNotificationSettingBottomSheet.A1R(A0D2);
                C20098A7b.A01(activityLevelNotificationSettingBottomSheet, supportFragmentManager);
                return true;
            }
            Log.e("onPreferenceTreeClick/Activity level appears for non group chat");
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.02h] */
    public NotificationsAndSoundsFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C21995Avx(new C21994Avw(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(NotificationsAndSoundsViewModel.class);
        this.A0H = new C99274sY(new C21996Avy(A002), new AnonymousClass7vF(this, A002), new AnonymousClass7vE(A002), A15);
        AGG agg = new AGG(this);
        this.A0K = agg;
        this.A0I = CDw(agg, new Object());
    }

    public static final void A01(AnonymousClass201 r4, NotificationsAndSoundsFragment notificationsAndSoundsFragment) {
        boolean z;
        int i;
        C17900vP.A0Y(r4, "NotificationsAndSoundsFragment/updateActivityLevel/", AnonymousClass000.A10());
        Preference BLF = notificationsAndSoundsFragment.BLF("jid_message_activity_level");
        NotificationsAndSoundsViewModel notificationsAndSoundsViewModel = (NotificationsAndSoundsViewModel) notificationsAndSoundsFragment.A0H.getValue();
        if (notificationsAndSoundsFragment.A05 instanceof AnonymousClass1EC) {
            if (C18020vd.A05(C18040vf.A02, notificationsAndSoundsViewModel.A04, 11088)) {
                if (r4 != null) {
                    notificationsAndSoundsFragment.A0D = r4;
                    if (BLF != null) {
                        AnonymousClass1FL A1D = notificationsAndSoundsFragment.A1D();
                        int ordinal = r4.ordinal();
                        if (ordinal == 0 || ordinal == 1) {
                            i = 2131897138;
                        } else if (ordinal == 2 || ordinal == 3) {
                            i = 2131897139;
                        } else {
                            throw AnonymousClass3MW.A14();
                        }
                        BLF.A0H(A1D.getString(i));
                    } else {
                        return;
                    }
                } else if (BLF == null) {
                    return;
                }
                z = true;
                BLF.A0N(z);
            }
        }
        if (BLF != null) {
            z = false;
            BLF.A0N(z);
        }
    }

    public void A1s() {
        String str;
        super.A1s();
        AnonymousClass1NN r1 = this.A03;
        if (r1 != null) {
            r1.unregisterObserver(this.A0J);
            AnonymousClass1Q1 r12 = this.A02;
            if (r12 != null) {
                r12.unregisterObserver(this.A0C);
                return;
            }
            str = "chatObservers";
        } else {
            str = "conversationObservers";
        }
        C18070vi.A11(str);
        throw null;
    }
}
