package com.whatsapp.events;

import X.AnonymousClass10I;
import X.AnonymousClass2DT;
import X.AnonymousClass2Z3;
import X.C17880vN;
import X.C18030ve;
import android.content.Context;
import android.content.Intent;

public final class EventStartAlarmReceiver extends AnonymousClass2DT {
    public AnonymousClass2Z3 A00;
    public C18030ve A01;
    public AnonymousClass10I A02;
    public final Object A03;
    public volatile boolean A04;

    public EventStartAlarmReceiver(int i) {
        this.A04 = false;
        this.A03 = C17880vN.A0p();
    }

    public void onReceive(Context context, Intent intent) {
        A00(context);
        super.onReceive(context, intent);
    }

    public EventStartAlarmReceiver() {
        this(0);
    }
}
