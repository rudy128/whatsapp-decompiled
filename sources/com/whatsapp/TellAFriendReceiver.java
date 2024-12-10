package com.whatsapp;

import X.AnonymousClass10E;
import X.AnonymousClass1YF;
import X.C17880vN;
import X.C18070vi;
import X.C36261nb;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public final class TellAFriendReceiver extends BroadcastReceiver {
    public C36261nb A00;
    public final Object A01;
    public volatile boolean A02;

    public void onReceive(Context context, Intent intent) {
        ComponentName componentName;
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    this.A00 = (C36261nb) AnonymousClass10E.A10(context).A2t.get();
                    this.A02 = true;
                }
            }
        }
        boolean A15 = C18070vi.A15(context, intent);
        if (Build.VERSION.SDK_INT >= 22 && (componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT")) != null) {
            String packageName = componentName.getPackageName();
            C18070vi.A0X(packageName);
            if (!AnonymousClass1YF.A0T(packageName)) {
                int intExtra = intent.getIntExtra("extra_invite_source", A15 ? 1 : 0);
                C36261nb r1 = this.A00;
                if (r1 != null) {
                    r1.A01(Integer.valueOf(intExtra), packageName, 2, 1);
                } else {
                    C18070vi.A11("inviteFlowLogger");
                    throw null;
                }
            }
        }
    }

    public TellAFriendReceiver(int i) {
        this.A02 = false;
        this.A01 = C17880vN.A0p();
    }

    public TellAFriendReceiver() {
        this(0);
    }
}
