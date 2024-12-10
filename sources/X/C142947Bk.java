package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.7Bk  reason: invalid class name and case insensitive filesystem */
public class C142947Bk implements C72033Kj {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C142947Bk(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void Bom() {
        Activity activity;
        Intent intent;
        String str;
        switch (this.A00) {
            case 0:
                activity = (Activity) this.A01;
                intent = (Intent) this.A02;
                str = "com.whatsapp.w4b";
                break;
            case 1:
                activity = (Activity) this.A01;
                intent = (Intent) this.A02;
                str = "com.whatsapp";
                break;
            default:
                AnonymousClass1FL r3 = (AnonymousClass1FL) this.A02;
                C17880vN.A1F(C19830z4.A00(((C132346md) this.A01).A00), "android.permission.SCHEDULE_EXACT_ALARM", true);
                Intent A0A = C17880vN.A0A();
                A0A.setAction("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("package:");
                A0A.setData(Uri.parse(AnonymousClass000.A0y(r3.getPackageName(), A10)));
                r3.startActivity(A0A);
                return;
        }
        intent.setPackage(str);
        activity.startActivity(intent);
        activity.finish();
    }
}
