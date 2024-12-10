package X;

import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.80K  reason: invalid class name */
public final class AnonymousClass80K extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass6BJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass80K(AnonymousClass6BJ r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Menu menu;
        MenuItem findItem;
        Toolbar toolbar = this.this$0.A02;
        if (!(toolbar == null || (menu = toolbar.getMenu()) == null || (findItem = menu.findItem(10002)) == null)) {
            findItem.setIcon(AnonymousClass6BJ.A0V(this.this$0));
        }
        return C27621Wu.A00;
    }
}
