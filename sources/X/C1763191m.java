package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.whatsapp.payments.ui.BrazilMerchantDetailsListActivity;
import java.util.ArrayList;

/* renamed from: X.91m  reason: invalid class name and case insensitive filesystem */
public abstract class C1763191m extends AnonymousClass939 {
    public AnonymousClass1QS A00;
    public AnonymousClass8G9 A01;

    private C010105w A03(CharSequence charSequence, String str, boolean z) {
        int i = 200;
        if (z) {
            i = 201;
        }
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0S(charSequence);
        A002.A0T(true);
        A002.A0X(new A9V(this, i, 4), 2131898766);
        A002.A0L(new A9Z(this, i, 0, z), str);
        A002.A0G(new A9O(this, i, 2));
        return A002.create();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.6C0, X.1xT] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.94p, X.1xT] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.6Bz, X.1xT] */
    public C42011xT A4b(ViewGroup viewGroup, int i) {
        if (i == 300) {
            View A0G = AnonymousClass8BX.A0G(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131626019);
            ? r2 = new C42011xT(A0G);
            r2.A01 = AnonymousClass3MW.A0G(A0G, 2131433717);
            r2.A04 = AnonymousClass3MW.A0J(A0G, 2131433718);
            r2.A03 = AnonymousClass3MW.A0J(A0G, 2131433719);
            r2.A02 = AnonymousClass3MX.A0K(A0G, 2131437010);
            r2.A00 = (Button) AnonymousClass1HF.A06(A0G, 2131429737);
            return r2;
        } else if (i == 301) {
            View A0G2 = AnonymousClass8BX.A0G(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131626018);
            ? r22 = new C42011xT(A0G2);
            r22.A00 = AnonymousClass3MW.A0G(A0G2, 2131428848);
            r22.A01 = AnonymousClass3MW.A0J(A0G2, 2131428851);
            return r22;
        } else if (i == 303) {
            return new C1765794t(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131626359));
        } else {
            if (i != 305) {
                return super.A4b(viewGroup, i);
            }
            View A0G3 = AnonymousClass8BX.A0G(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131626022);
            ? r23 = new C42011xT(A0G3);
            r23.A01 = AnonymousClass3MW.A0G(A0G3, 2131437012);
            r23.A02 = AnonymousClass3MW.A0J(A0G3, 2131437013);
            r23.A00 = (Button) AnonymousClass1HF.A06(A0G3, 2131429737);
            return r23;
        }
    }

    public Dialog onCreateDialog(int i) {
        if (i == 200) {
            return A03(getString(2131889337), getString(2131895092), false);
        }
        if (i != 201) {
            return super.onCreateDialog(i);
        }
        int i2 = 2131889337;
        if (AnonymousClass8BR.A0O(this.A00).A0V(1).size() > 0) {
            i2 = 2131889338;
        }
        return A03(C43251zV.A05(this, this.A0D, getString(i2)), getString(2131895092), true);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BrazilMerchantDetailsListActivity brazilMerchantDetailsListActivity = (BrazilMerchantDetailsListActivity) this;
        AnonymousClass8G9 r3 = (AnonymousClass8G9) AnonymousClass8BR.A0C(new AnonymousClass8Gg(brazilMerchantDetailsListActivity, brazilMerchantDetailsListActivity.A09, 0), brazilMerchantDetailsListActivity).A00(AnonymousClass8G9.class);
        brazilMerchantDetailsListActivity.A08 = r3;
        r3.A03.A0A(r3.A07, new C20336AGs(brazilMerchantDetailsListActivity, 32));
        AnonymousClass8G9 r32 = brazilMerchantDetailsListActivity.A08;
        this.A01 = r32;
        r32.A00.A0A(r32.A07, new C20337AGt(this, 41));
        AnonymousClass8G9 r33 = this.A01;
        r33.A04.A0A(r33.A07, new C20337AGt(this, 42));
        AnonymousClass8G9 r2 = this.A01;
        C21448AkF.A00(r2.A0P, r2, 2);
        this.A01.setLockIconVisibility(false);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 2131432616, 0, getString(2131895093));
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.9N5, java.lang.Object] */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131432616) {
            return super.onOptionsItemSelected(menuItem);
        }
        AnonymousClass8G9 r5 = this.A01;
        ArrayList A0A = AnonymousClass8BR.A0R(r5.A0M).A0A();
        AnonymousClass1QE r2 = r5.A02;
        StringBuilder A10 = AnonymousClass000.A10();
        C17890vO.A14("Remove merchant account. #methods=", A10, A0A);
        AnonymousClass8BS.A19(r2, A10);
        int i = 1;
        if (A0A.size() <= 1) {
            i = 0;
        }
        ? obj = new Object();
        obj.A00 = i;
        r5.A04.A0F(obj);
        return true;
    }
}
