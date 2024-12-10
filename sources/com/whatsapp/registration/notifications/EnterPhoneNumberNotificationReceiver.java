package com.whatsapp.registration.notifications;

import X.A8V;
import X.A9B;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass118;
import X.AnonymousClass11P;
import X.AnonymousClass19D;
import X.AnonymousClass1CM;
import X.AnonymousClass1D6;
import X.AnonymousClass1LU;
import X.C000200d;
import X.C139576z4;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C19830z4;
import X.C27301Vn;
import X.C49332Qb;
import X.C59872n1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public final class EnterPhoneNumberNotificationReceiver extends BroadcastReceiver {
    public AnonymousClass11P A00;
    public AnonymousClass118 A01;
    public C27301Vn A02;
    public C19830z4 A03;
    public AnonymousClass19D A04;
    public C139576z4 A05;
    public C59872n1 A06;
    public AnonymousClass1LU A07;
    public AnonymousClass1CM A08;
    public AnonymousClass00H A09;
    public final Object A0A;
    public volatile boolean A0B;

    public void onReceive(Context context, Intent intent) {
        String str;
        Context context2 = context;
        if (!this.A0B) {
            synchronized (this.A0A) {
                if (!this.A0B) {
                    AnonymousClass10G A10 = AnonymousClass10E.A10(context);
                    AnonymousClass10E r2 = A10.AJU;
                    this.A05 = (C139576z4) r2.A01.get();
                    this.A04 = (AnonymousClass19D) r2.A02.get();
                    this.A09 = C000200d.A00(r2.A4U);
                    this.A06 = (C59872n1) A10.A4I.get();
                    this.A08 = (AnonymousClass1CM) r2.A9V.get();
                    this.A03 = (C19830z4) r2.ABl.get();
                    this.A00 = (AnonymousClass11P) r2.AAv.get();
                    this.A01 = (AnonymousClass118) r2.ABY.get();
                    this.A07 = (AnonymousClass1LU) r2.ABd.get();
                    this.A02 = (C27301Vn) r2.A9A.get();
                    this.A0B = true;
                }
            }
        }
        boolean A17 = C18070vi.A17(context, intent);
        Log.i("EnterPhoneNumberNotificationReceiver/onReceive()");
        C19830z4 r0 = this.A03;
        if (r0 != null) {
            C17880vN.A1F(C19830z4.A00(r0), "pref_enter_phone_number_notif_scheduled", false);
            C59872n1 r02 = this.A06;
            if (r02 != null) {
                C49332Qb r4 = C49332Qb.A02;
                if (r02.A02(r4)) {
                    AnonymousClass118 r03 = this.A01;
                    if (r03 != null) {
                        String A0F = C18070vi.A0F(r03.A00, 2131893019);
                        AnonymousClass118 r04 = this.A01;
                        if (r04 != null) {
                            String A0F2 = C18070vi.A0F(r04.A00, 2131899103);
                            AnonymousClass118 r05 = this.A01;
                            if (r05 != null) {
                                String A0R = C17890vO.A0R(r05.A00, A0F2, A17 ? 1 : 0, 0, 2131889893);
                                C18070vi.A0X(A0R);
                                AnonymousClass1D6 A012 = AnonymousClass1D6.A01(A0F, A0R);
                                String str2 = (String) A012.first;
                                String str3 = (String) A012.second;
                                if (this.A07 != null) {
                                    Intent A0A2 = AnonymousClass1LU.A0A(context);
                                    A0A2.putExtra("extra_enter_phone_number_notification_clicked", A17);
                                    if (this.A00 != null) {
                                        C27301Vn r9 = this.A02;
                                        if (r9 != null) {
                                            A9B.A0M(context2, A0A2, r9, str2, str2, str3);
                                            C19830z4 r06 = this.A03;
                                            if (r06 != null) {
                                                C17880vN.A1F(C19830z4.A00(r06), "pref_enter_phone_number_notif_shown", A17);
                                                AnonymousClass00H r07 = this.A09;
                                                if (r07 != null) {
                                                    A8V a8v = (A8V) r07.get();
                                                    StringBuilder A102 = AnonymousClass000.A10();
                                                    A102.append("enter_phone_number_notification_shown");
                                                    C139576z4 r1 = this.A05;
                                                    if (r1 == null) {
                                                        str = "abOfflineProps";
                                                    } else if (this.A04 != null) {
                                                        a8v.A0E(AnonymousClass000.A0y(r4.A00(r1), A102), "enter_phone_number_notification_step");
                                                        Log.i("EnterPhoneNumberNotificationReceiver/onReceive/notification-sent");
                                                        return;
                                                    } else {
                                                        str = "abPreChatdProps";
                                                    }
                                                } else {
                                                    str = "funnelLogger";
                                                }
                                            }
                                        } else {
                                            str = "waNotificationManager";
                                        }
                                    } else {
                                        str = "time";
                                    }
                                } else {
                                    str = "waIntents";
                                }
                            }
                        }
                    }
                    str = "waContext";
                } else {
                    return;
                }
            } else {
                str = "registrationNotificationManager";
            }
            C18070vi.A11(str);
            throw null;
        }
        str = "sharedPreferences";
        C18070vi.A11(str);
        throw null;
    }

    public EnterPhoneNumberNotificationReceiver(int i) {
        this.A0B = false;
        this.A0A = C17880vN.A0p();
    }

    public EnterPhoneNumberNotificationReceiver() {
        this(0);
    }
}
