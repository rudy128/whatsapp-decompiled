package com.whatsapp.conversationslist;

import X.A9Q;
import X.AGB;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FY;
import X.AnonymousClass4Yv;
import X.AnonymousClass4a6;
import X.AnonymousClass8BT;
import X.C108945cZ;
import X.C137116uw;
import X.C20151A9n;
import X.C36271nc;
import X.C63662tU;
import X.C63932tv;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;

public class SmsDefaultAppWarning extends AnonymousClass1FY {
    public C36271nc A00;
    public boolean A01;

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A00 = (C36271nc) r1.A4x.get();
        }
    }

    public Dialog onCreateDialog(int i) {
        C73203Rj r3;
        int i2;
        if (i == 0) {
            r3 = AnonymousClass4a6.A00(this);
            r3.A0D(2131898479);
            r3.A0Y(new C20151A9n(this, 31), 2131896235);
            r3.A0X(new C20151A9n(this, 32), 2131896244);
            C20151A9n.A00(r3, this, 33, 2131896245);
            i2 = 9;
        } else if (i != 1) {
            return super.onCreateDialog(i);
        } else {
            r3 = AnonymousClass4a6.A00(this);
            r3.A0D(2131898478);
            r3.A0Y(new C20151A9n(this, 34), 2131896235);
            C20151A9n.A00(r3, this, 35, 2131896245);
            i2 = 10;
        }
        A9Q.A00(r3, this, i2);
        return r3.create();
    }

    public SmsDefaultAppWarning(int i) {
        this.A01 = false;
        AGB.A00(this, 39);
    }

    public void onCreate(Bundle bundle) {
        ActivityInfo activityInfo;
        super.onCreate(bundle);
        Intent A0G = C108945cZ.A0G("android.intent.action.SENDTO");
        A0G.setData(AnonymousClass8BT.A06(this));
        ResolveInfo resolveActivity = getPackageManager().resolveActivity(A0G, 0);
        if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null || !"com.whatsapp".equals(activityInfo.packageName)) {
            AnonymousClass4Yv.A01(this, 1);
        } else {
            AnonymousClass4Yv.A01(this, 0);
        }
    }

    public SmsDefaultAppWarning() {
        this(0);
    }
}
