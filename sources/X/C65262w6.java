package X;

import android.content.Context;

/* renamed from: X.2w6  reason: invalid class name and case insensitive filesystem */
public class C65262w6 implements AnonymousClass115 {
    public final int A00;

    public C65262w6(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object Bha(Object obj) {
        if (this.A00 == 0) {
            return new C221618v((AnonymousClass114) obj);
        }
        Context context = (Context) obj;
        if (AnonymousClass114.A02 == null) {
            AnonymousClass114.A02 = context.getApplicationContext();
            if (AnonymousClass114.A02 == null) {
                throw AnonymousClass000.A0n("An application must be set on the injector ```FbInjector.setApplication(app)``` before you can start performing injections");
            }
        }
        return new C221518u(context, new C220818n(AnonymousClass114.A02));
    }
}
