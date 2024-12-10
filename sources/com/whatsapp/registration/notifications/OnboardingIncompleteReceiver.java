package com.whatsapp.registration.notifications;

import X.A8V;
import X.A9B;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass118;
import X.AnonymousClass11P;
import X.AnonymousClass195;
import X.AnonymousClass19D;
import X.AnonymousClass1CM;
import X.AnonymousClass1D6;
import X.AnonymousClass1LU;
import X.C000200d;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C19830z4;
import X.C27301Vn;
import X.C49332Qb;
import X.C59872n1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public final class OnboardingIncompleteReceiver extends BroadcastReceiver {
    public AnonymousClass195 A00;
    public AnonymousClass11P A01;
    public AnonymousClass118 A02;
    public C27301Vn A03;
    public C19830z4 A04;
    public AnonymousClass19D A05;
    public C59872n1 A06;
    public AnonymousClass1CM A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public final Object A0A;
    public volatile boolean A0B;

    public void onReceive(Context context, Intent intent) {
        String str;
        int i;
        int i2;
        Context context2 = context;
        if (!this.A0B) {
            synchronized (this.A0A) {
                if (!this.A0B) {
                    AnonymousClass10G A10 = AnonymousClass10E.A10(context);
                    AnonymousClass10E r2 = A10.AJU;
                    this.A05 = (AnonymousClass19D) r2.A02.get();
                    this.A00 = (AnonymousClass195) r2.A0L.get();
                    this.A08 = C000200d.A00(r2.A4U);
                    this.A06 = (C59872n1) A10.A4I.get();
                    this.A07 = (AnonymousClass1CM) r2.A9V.get();
                    this.A04 = (C19830z4) r2.ABl.get();
                    this.A01 = (AnonymousClass11P) r2.AAv.get();
                    this.A02 = (AnonymousClass118) r2.ABY.get();
                    this.A09 = C000200d.A00(r2.ABd);
                    this.A03 = (C27301Vn) r2.A9A.get();
                    this.A0B = true;
                }
            }
        }
        boolean A17 = C18070vi.A17(context, intent);
        Log.i("OnboardingIncompleteReceiver/onReceive()");
        C19830z4 r0 = this.A04;
        if (r0 != null) {
            C17880vN.A1F(C19830z4.A00(r0), "pref_onboarding_incomplete_notif_scheduled", false);
            C59872n1 r1 = this.A06;
            if (r1 == null) {
                str = "registrationNotificationManager";
            } else if (r1.A02(C49332Qb.A03)) {
                AnonymousClass19D r3 = this.A05;
                if (r3 != null) {
                    int A002 = C18020vd.A00(C18040vf.A02, r3, 7978);
                    if (A002 == A17) {
                        i = 2131893018;
                        i2 = 2131893020;
                    } else if (A002 == 2) {
                        i = 2131893019;
                        i2 = 2131893021;
                    } else {
                        return;
                    }
                    AnonymousClass118 r02 = this.A02;
                    if (r02 != null) {
                        String A0F = C18070vi.A0F(r02.A00, i);
                        AnonymousClass118 r03 = this.A02;
                        if (r03 != null) {
                            String A0F2 = C18070vi.A0F(r03.A00, 2131899103);
                            AnonymousClass118 r04 = this.A02;
                            if (r04 != null) {
                                String string = r04.A00.getString(i2, AnonymousClass000.A1b(A0F2, A17 ? 1 : 0));
                                C18070vi.A0X(string);
                                AnonymousClass1D6 A012 = AnonymousClass1D6.A01(A0F, string);
                                String str2 = (String) A012.first;
                                String str3 = (String) A012.second;
                                AnonymousClass00H r05 = this.A09;
                                if (r05 != null) {
                                    r05.get();
                                    Intent A0A2 = AnonymousClass1LU.A0A(context);
                                    A0A2.putExtra("extra_onboarding_incomplete_notification_clicked", A17);
                                    if (this.A01 != null) {
                                        C27301Vn r8 = this.A03;
                                        if (r8 != null) {
                                            A9B.A0M(context2, A0A2, r8, str2, str2, str3);
                                            C19830z4 r06 = this.A04;
                                            if (r06 != null) {
                                                C17880vN.A1F(C19830z4.A00(r06), "pref_onboarding_incomplete_notif_shown", A17);
                                                AnonymousClass00H r07 = this.A08;
                                                if (r07 != null) {
                                                    ((A8V) r07.get()).A0E("onboarding_incomplete_notification_shown", "onboarding_incomplete_notification_step");
                                                    Log.i("OnboardingIncompleteReceiver/onReceive/notification-sent");
                                                    return;
                                                }
                                                str = "funnelLogger";
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
                    str = "abPreChatdProps";
                }
            } else {
                return;
            }
            C18070vi.A11(str);
            throw null;
        }
        str = "sharedPreferences";
        C18070vi.A11(str);
        throw null;
    }

    public OnboardingIncompleteReceiver(int i) {
        this.A0B = false;
        this.A0A = C17880vN.A0p();
    }

    public OnboardingIncompleteReceiver() {
        this(0);
    }
}
