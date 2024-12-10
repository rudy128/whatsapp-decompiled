package com.whatsapp.phoneid;

import X.AnonymousClass10E;
import X.C17880vN;
import X.C18030ve;
import X.C31391fU;
import X.C450925z;
import X.C65292wA;
import android.content.Context;
import android.content.Intent;

public class PhoneIdRequestReceiver extends C450925z {
    public C18030ve A00;
    public C31391fU A01;
    public C65292wA A02;
    public final Object A03;
    public volatile boolean A04;

    public void onReceive(Context context, Intent intent) {
        if (!this.A04) {
            synchronized (this.A03) {
                if (!this.A04) {
                    AnonymousClass10E r1 = AnonymousClass10E.A10(context).AJU;
                    this.A00 = (C18030ve) r1.A04.get();
                    this.A01 = (C31391fU) r1.A8Q.get();
                    this.A02 = (C65292wA) r1.A8R.get();
                    this.A04 = true;
                }
            }
        }
        super.onReceive(context, intent);
    }

    public PhoneIdRequestReceiver(int i) {
        this.A04 = false;
        this.A03 = C17880vN.A0p();
    }

    public PhoneIdRequestReceiver() {
        this(0);
    }
}
