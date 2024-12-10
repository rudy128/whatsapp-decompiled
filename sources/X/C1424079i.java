package X;

import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.79i  reason: invalid class name and case insensitive filesystem */
public class C1424079i implements AnonymousClass02H {
    public final /* synthetic */ ContactPickerFragment A00;

    public boolean C1U(Menu menu, AnonymousClass02B r3) {
        return false;
    }

    public C1424079i(ContactPickerFragment contactPickerFragment) {
        this.A00 = contactPickerFragment;
    }

    public /* synthetic */ void A00() {
        ContactPickerFragment contactPickerFragment = this.A00;
        boolean z = contactPickerFragment.A27().getBoolean("skip_preview", false);
        ArrayList arrayList = contactPickerFragment.A33;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (contactPickerFragment.A1d.A00(C108945cZ.A0M(it)) != 1) {
                    z = true;
                    break;
                }
            }
        }
        contactPickerFragment.A0S.CGP(new AnonymousClass7RK(30, (Object) this, z));
    }

    public boolean BqR(Menu menu, AnonymousClass02B r8) {
        ContactPickerFragment contactPickerFragment = this.A00;
        if (contactPickerFragment.A3S || contactPickerFragment.A3c || contactPickerFragment.A3a || contactPickerFragment.A3e) {
            C18070vi.A0d(contactPickerFragment.A1U, 0);
            menu.add(0, 2131432625, 0, 2131899381).setIcon(2131232506).setShowAsAction(2);
            return true;
        }
        if (!contactPickerFragment.A0T.A0N()) {
            contactPickerFragment.A0l.A02.get();
            MenuItem add = menu.add(0, 2131432595, 0, 2131892450);
            if (AnonymousClass112.A03()) {
                AnonymousClass6W6.A00(add, AnonymousClass3MZ.A09(contactPickerFragment).getString(2131892450));
            }
            add.setShowAsAction(1);
        }
        MenuItem add2 = menu.add(0, 2131432599, 0, 2131891995);
        if (AnonymousClass112.A03()) {
            AnonymousClass6W6.A00(add2, AnonymousClass3MZ.A09(contactPickerFragment).getString(2131891995));
        }
        add2.setShowAsAction(1);
        return true;
    }

    public void BrJ(AnonymousClass02B r7) {
        ContactPickerFragment contactPickerFragment = this.A00;
        Set set = contactPickerFragment.A4I;
        set.clear();
        Map map = contactPickerFragment.A4G;
        set.addAll(map.keySet());
        Handler handler = contactPickerFragment.A48;
        Runnable runnable = contactPickerFragment.A4C;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 200);
        map.clear();
        contactPickerFragment.A2J();
        contactPickerFragment.A0E = null;
    }

    public boolean Bks(MenuItem menuItem, AnonymousClass02B r12) {
        int i;
        int i2 = null;
        if (menuItem.getItemId() == 2131432595) {
            ContactPickerFragment contactPickerFragment = this.A00;
            int A04 = contactPickerFragment.A0V.A04(AnonymousClass18O.A1N);
            if (A04 <= 0 || contactPickerFragment.A4G.size() <= A04) {
                C86464Rs r1 = (C86464Rs) contactPickerFragment.A2H.get();
                if (contactPickerFragment.A3V) {
                    i2 = 0;
                }
                r1.A01(i2);
                contactPickerFragment.A1k(AnonymousClass1LU.A1j(contactPickerFragment.A1n(), contactPickerFragment.A4G.keySet()));
            } else {
                C142977Bn r7 = contactPickerFragment.A0r;
                Object[] objArr = new Object[1];
                C17880vN.A1T(objArr, A04, 0);
                r7.BhR(contactPickerFragment.A19.A0K(objArr, 2131755029, (long) A04));
            }
            contactPickerFragment.A2F();
        } else if (menuItem.getItemId() == 2131432599) {
            ContactPickerFragment contactPickerFragment2 = this.A00;
            AnonymousClass1FL A1D = contactPickerFragment2.A1D();
            int A02 = contactPickerFragment2.A1I.A02((AnonymousClass1EC) null) - 1;
            if (C108965cb.A0W(contactPickerFragment2).A00.A02()) {
                AnonymousClass1VD A0W = C108965cb.A0W(contactPickerFragment2);
                AnonymousClass1GP supportFragmentManager = A1D.getSupportFragmentManager();
                C18070vi.A0d(supportFragmentManager, 0);
                C20098A7b.A01(A0W.A00(), supportFragmentManager);
                return false;
            }
            if (A02 <= 0 || contactPickerFragment2.A4G.size() <= A02 - 1) {
                contactPickerFragment2.A1a.A00(4);
                A1D.startActivity(AnonymousClass1LU.A1i(A1D, C22971Dz.A0B(contactPickerFragment2.A4G.keySet()), 4));
                if (C18020vd.A05(C18040vf.A02, ((C38721rm) contactPickerFragment2.A2K.get()).A01, 5288)) {
                    ((C38721rm) contactPickerFragment2.A2K.get()).A00();
                }
            } else {
                C142977Bn r72 = contactPickerFragment2.A0r;
                C18000vb r6 = contactPickerFragment2.A19;
                long j = (long) i;
                Object[] objArr2 = new Object[1];
                C17880vN.A1T(objArr2, A02 - 1, 0);
                r72.BhR(r6.A0K(objArr2, 2131755188, j));
            }
            contactPickerFragment2.A2F();
            return false;
        } else if (menuItem.getItemId() == 2131432625) {
            this.A00.A2b(new C70563Bp(this, 9));
            return false;
        }
        return false;
    }
}
