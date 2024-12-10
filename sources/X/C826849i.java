package X;

import android.content.ContentValues;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.settings.SettingsDataUsageActivity;
import com.whatsapp.settings.SettingsNotifications;
import com.whatsapp.settings.SettingsTabActivity;
import com.whatsapp.util.Log;

/* renamed from: X.49i  reason: invalid class name and case insensitive filesystem */
public class C826849i extends A34 {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C826849i(AnonymousClass1F9 r2, SettingsDataUsageActivity settingsDataUsageActivity) {
        super(r2, true);
        this.A00 = 2;
        this.A01 = settingsDataUsageActivity;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C41851xA BD0;
        switch (this.A00) {
            case 0:
                C78953tz r1 = (C78953tz) this.A01;
                C34651kr r2 = (C34651kr) r1.getIntegratorManager().get();
                UserJid A1D = C79103uS.A1D(r1);
                C18070vi.A0z(A1D, "null cannot be cast to non-null type com.whatsapp.jid.InteropUserJid");
                AnonymousClass1ED r12 = (AnonymousClass1ED) A1D;
                C18070vi.A0d(r12, 0);
                int i = r12.A00;
                if (i <= 0) {
                    return null;
                }
                Integer valueOf = Integer.valueOf(i);
                C89514ca r0 = (C89514ca) r2.A01(C18070vi.A0M(valueOf)).get(valueOf);
                if (r0 != null) {
                    return r0.A04;
                }
                return null;
            case 1:
                AnonymousClass4aY r22 = (AnonymousClass4aY) this.A01;
                int A0H = r22.A3s.A0H(r22.A3R);
                return C17890vO.A0F(Boolean.valueOf(AnonymousClass4aY.A2D(r22, A0H)), A0H);
            case 2:
                Log.i("settings-data-usage-activity/load storage data/load cache in background");
                return ((SettingsDataUsageActivity) this.A01).A0N.A02().A04;
            case 3:
                SettingsNotifications settingsNotifications = (SettingsNotifications) this.A01;
                AnonymousClass1Nb r4 = settingsNotifications.A0J;
                ContentValues contentValues = new ContentValues(8);
                contentValues.put("use_custom_notifications", false);
                contentValues.put("message_tone", (String) null);
                contentValues.put("message_vibrate", (String) null);
                contentValues.put("message_popup", (String) null);
                contentValues.put("message_light", (String) null);
                contentValues.put("call_tone", (String) null);
                contentValues.put("call_vibrate", (String) null);
                contentValues.put("low_pri_notifications", false);
                C28791au A06 = r4.A0U().A06();
                try {
                    BD0 = A06.BD0();
                    C23141Ev r9 = ((C28801av) A06).A02;
                    r9.A02(contentValues, "settings", (String) null, "resetNotificationSettings/UPDATE_CHAT_SETTINGS", (String[]) null);
                    int A04 = r9.A04("settings", "(mute_end < ? or mute_end is NULL) and (status_muted is NULL or status_muted = 0) and (media_visibility = 0)", "resetNotificationSettings/DELETE_CHAT_SETTINGS", new String[]{Long.toString(System.currentTimeMillis())});
                    BD0.A00();
                    C17900vP.A0j("chat-settings-store/deleted-count", AnonymousClass000.A10(), A04);
                    BD0.close();
                    A06.close();
                    C28781at A05 = r4.A0U().get();
                    try {
                        r4.A0Q.clear();
                        C25201Nh r02 = r4.A00;
                        if (r02 != null) {
                            r02.A0J();
                            r4.A00.A0P(A05);
                        }
                        A05.close();
                        if (settingsNotifications.A0A.A2I()) {
                            return null;
                        }
                        C17880vN.A1F(C19830z4.A00(settingsNotifications.A0A), "conversation_sound", true);
                        return null;
                    } catch (Throwable th) {
                        AnonymousClass0DT.A00(th, th);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    A06.close();
                    throw th;
                }
            default:
                return Boolean.valueOf(C17880vN.A0I(((SettingsTabActivity) this.A01).A0k).A0H());
        }
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        String str;
        switch (this.A00) {
            case 0:
                String str2 = (String) obj;
                if (str2 == null || str2.length() == 0) {
                    str = "ConversationRowFX/updateInteropContactPhotoBadge no icon url";
                    break;
                } else {
                    C78953tz r3 = (C78953tz) this.A01;
                    ((AnonymousClass4SJ) r3.getInteropImageLoader().get()).A01(new C97994qO(r3, 3), str2);
                    return;
                }
                break;
            case 1:
                Pair pair = (Pair) obj;
                if (AnonymousClass000.A1Y(pair.first)) {
                    AnonymousClass4aY r2 = (AnonymousClass4aY) this.A01;
                    AnonymousClass4aY.A1M(r2, AnonymousClass000.A0M(pair.second));
                    r2.A4T.A04(0);
                    r2.A4T.A07(new C98214ql(this, pair, 4));
                    return;
                }
                return;
            case 2:
                Number number = (Number) obj;
                if (number != null) {
                    SettingsDataUsageActivity settingsDataUsageActivity = (SettingsDataUsageActivity) this.A01;
                    if (settingsDataUsageActivity.A03 == -1) {
                        Log.i("settings-data-usage-activity/load storage data/cache data fetched");
                        long longValue = number.longValue();
                        settingsDataUsageActivity.A03 = longValue;
                        settingsDataUsageActivity.A0B.setText(C88584aA.A04(settingsDataUsageActivity.A00, longValue));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                SettingsNotifications.A0V((SettingsNotifications) this.A01);
                return;
            default:
                if (AnonymousClass000.A1Y(obj)) {
                    SettingsTabActivity settingsTabActivity = (SettingsTabActivity) this.A01;
                    if (settingsTabActivity.A0e == null) {
                        str = "SettingsTabActivity/executeShouldShowBadgeTask/accountSwitcherBadge == null";
                        break;
                    } else {
                        Log.i("SettingsTabActivity/executeShouldShowBadgeTask/shouldShowBadge");
                        settingsTabActivity.A0k.get();
                        C28931bI r1 = settingsTabActivity.A0e;
                        C18070vi.A0d(r1, 0);
                        r1.A04(0);
                        return;
                    }
                } else {
                    return;
                }
        }
        Log.w(str);
    }

    public C826849i(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
