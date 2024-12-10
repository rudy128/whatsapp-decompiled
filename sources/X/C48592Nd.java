package X;

import android.content.Context;
import com.whatsapp.android.di.BaseEntryPoint;

/* renamed from: X.2Nd  reason: invalid class name and case insensitive filesystem */
public abstract class C48592Nd extends C161048Be {
    public AnonymousClass190 A00;
    public AnonymousClass1H3 A01;
    public C18000vb A02;
    public C18030ve A03;

    public void attachBaseContext(Context context) {
        BaseEntryPoint baseEntryPoint = (BaseEntryPoint) AnonymousClass00E.A00(context, BaseEntryPoint.class);
        this.A03 = baseEntryPoint.BAL();
        this.A00 = baseEntryPoint.BG6();
        this.A02 = baseEntryPoint.CS9();
        AnonymousClass10E r1 = (AnonymousClass10E) baseEntryPoint;
        AnonymousClass1H4 r3 = new AnonymousClass1H4((C18000vb) r1.Ao8.A00.AJU.ABz.get());
        this.A01 = r3;
        super.attachBaseContext(new AnonymousClass1H5(context, r3, this.A02, this.A03, C000200d.A00(r1.A9s)));
    }

    public String A09() {
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0a(this, A10);
        return AnonymousClass000.A0y("/onTimeout", A10);
    }

    public void onTimeout(int i, int i2) {
        super.onTimeout(i, i2);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("wabaseintent/ontimeout/");
        C17900vP.A0a(this, A10);
        A10.append("/");
        A10.append(i);
        C17900vP.A0j("/", A10, i2);
        AnonymousClass190 r3 = this.A00;
        String A09 = A09();
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("startId=");
        A102.append(i);
        r3.A0G(A09, AnonymousClass001.A1I(",fgsType=", A102, i2), false);
        stopSelf();
    }
}
