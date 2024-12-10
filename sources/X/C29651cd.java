package X;

import android.app.Service;
import android.content.Context;
import com.whatsapp.android.di.BaseEntryPoint;

/* renamed from: X.1cd  reason: invalid class name and case insensitive filesystem */
public abstract class C29651cd extends Service {
    public AnonymousClass1H3 A00;
    public C18000vb A01;
    public C18030ve A02;

    public void attachBaseContext(Context context) {
        String str;
        Context context2 = context;
        C18070vi.A0d(context, 0);
        BaseEntryPoint baseEntryPoint = (BaseEntryPoint) AnonymousClass00E.A00(context, BaseEntryPoint.class);
        C18030ve BAL = baseEntryPoint.BAL();
        C18070vi.A0d(BAL, 0);
        this.A02 = BAL;
        C18000vb CS9 = baseEntryPoint.CS9();
        C18070vi.A0d(CS9, 0);
        this.A01 = CS9;
        AnonymousClass10E r2 = (AnonymousClass10E) baseEntryPoint;
        AnonymousClass1H4 r4 = new AnonymousClass1H4((C18000vb) r2.Ao8.A00.AJU.ABz.get());
        this.A00 = r4;
        C18030ve r6 = this.A02;
        if (r6 != null) {
            C18000vb r5 = this.A01;
            if (r5 != null) {
                super.attachBaseContext(new AnonymousClass1H5(context2, r4, r5, r6, C000200d.A00(r2.A9s)));
                return;
            }
            str = "whatsAppLocale";
        } else {
            str = "abProps";
        }
        C18070vi.A11(str);
        throw null;
    }
}
