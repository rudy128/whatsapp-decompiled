package X;

import android.view.Menu;
import android.view.MenuItem;

/* renamed from: X.5Rm  reason: invalid class name and case insensitive filesystem */
public final class C105305Rm extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C77853rb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105305Rm(C77853rb r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MenuItem findItem;
        C88034Yb r7 = (C88034Yb) obj;
        C77853rb r5 = this.this$0;
        C18070vi.A0b(r7);
        Menu menu = r5.A00;
        if (menu == null || ((findItem = menu.findItem(60)) != null && findItem.isVisible())) {
            r5.A01.invalidateOptionsMenu();
        }
        if (r7.A04) {
            AnonymousClass01E r4 = r5.A01;
            AnonymousClass3MW.A1W(r4);
            C73203Rj A00 = C88034Yb.A00(r4, r7);
            A00.A0D(r7.A00);
            A00.A0g(r4, new C91494fm(r7, r5, 9), 2131897145);
            C73203Rj.A05(r4, A00, 2, 2131889490);
            AnonymousClass3MY.A1G(A00);
        } else {
            int i = r7.A00;
            AnonymousClass01E r0 = r5.A01;
            AnonymousClass3MW.A1W(r0);
            ((AnonymousClass1FU) r0).BhQ(i);
        }
        return C27621Wu.A00;
    }
}
