package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

public class AFL implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    public final void onClick(View view) {
        String str;
        Object obj;
        String str2;
        Drawable drawable;
        boolean z;
        boolean z2;
        Object obj2;
        if (this.A00 != 0) {
            BDB bdb = (BDB) this.A01;
            int BJm = bdb.BJm();
            boolean BDg = bdb.BDg();
            if (BJm == 0) {
                if (BDg) {
                    str2 = this.A05;
                    obj2 = this.A02;
                } else {
                    str2 = this.A06;
                    obj2 = this.A03;
                }
                drawable = (Drawable) obj2;
                z = true;
                z2 = false;
            } else {
                if (BDg) {
                    str = this.A05;
                    obj = this.A02;
                } else {
                    str = this.A06;
                    obj = this.A03;
                }
                drawable = (Drawable) obj;
                z = true;
                z2 = true;
            }
            bdb.BAJ(drawable, this, str2, z, z2);
            return;
        }
        Runnable runnable = (Runnable) this.A01;
        Activity activity = (Activity) this.A02;
        C132216mP r4 = (C132216mP) this.A03;
        AnonymousClass1MB r0 = (AnonymousClass1MB) this.A04;
        String str3 = this.A05;
        String str4 = this.A06;
        if (runnable != null) {
            runnable.run();
        }
        boolean A002 = r0.A00();
        StringBuilder A10 = AnonymousClass000.A10();
        C17890vO.A10("blocked +", str3, str4, A10);
        activity.startActivity(r4.A00.A00((Bundle) null, (AnonymousClass770) null, (Integer) null, A10.toString(), (String) null, (ArrayList) null, (ArrayList) null, A002));
        AnonymousClass4Yv.A00(activity, 124);
    }

    public AFL(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A05 = str;
        this.A06 = str2;
    }
}
