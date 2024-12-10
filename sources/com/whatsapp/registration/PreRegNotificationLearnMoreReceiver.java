package com.whatsapp.registration;

import X.AnonymousClass10E;
import X.AnonymousClass129;
import X.AnonymousClass1L9;
import X.C17880vN;
import X.C18070vi;
import X.C19830z4;
import X.C27301Vn;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public final class PreRegNotificationLearnMoreReceiver extends BroadcastReceiver {
    public AnonymousClass1L9 A00;
    public C27301Vn A01;
    public C19830z4 A02;
    public AnonymousClass129 A03;
    public final Object A04;
    public volatile boolean A05;

    public void onReceive(Context context, Intent intent) {
        String str;
        if (!this.A05) {
            synchronized (this.A04) {
                if (!this.A05) {
                    AnonymousClass10E r1 = AnonymousClass10E.A10(context).AJU;
                    this.A00 = (AnonymousClass1L9) r1.A0E.get();
                    this.A03 = (AnonymousClass129) r1.A4I.get();
                    this.A01 = (C27301Vn) r1.A9A.get();
                    this.A02 = (C19830z4) r1.ABl.get();
                    this.A05 = true;
                }
            }
        }
        C18070vi.A0h(context, intent);
        AnonymousClass129 r12 = this.A03;
        if (r12 != null) {
            Intent flags = new Intent("android.intent.action.VIEW", r12.A04("30035737")).setFlags(268435456);
            C18070vi.A0X(flags);
            AnonymousClass1L9 r0 = this.A00;
            if (r0 != null) {
                r0.A08(context, flags);
                C19830z4 r02 = this.A02;
                if (r02 != null) {
                    SharedPreferences.Editor A002 = C19830z4.A00(r02);
                    A002.remove("show_pre_reg_do_not_share_code_warning");
                    A002.apply();
                    C27301Vn r2 = this.A01;
                    if (r2 != null) {
                        r2.BEJ(20, "PreRegNotificationLearnMoreReceiver");
                        return;
                    }
                    str = "waNotificationManager";
                } else {
                    str = "waSharedPreferences";
                }
            } else {
                str = "activityUtils";
            }
        } else {
            str = "faqLinkFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public PreRegNotificationLearnMoreReceiver(int i) {
        this.A05 = false;
        this.A04 = C17880vN.A0p();
    }

    public PreRegNotificationLearnMoreReceiver() {
        this(0);
    }
}
