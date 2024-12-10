package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import com.whatsapp.util.Log;

/* renamed from: X.3cq  reason: invalid class name and case insensitive filesystem */
public abstract class C74813cq extends AnonymousClass3QR implements C108325bW {
    public Fragment A00;
    public AnonymousClass4SD A01;

    public void C7y() {
    }

    public void C7z() {
    }

    public abstract void setContentView(int i);

    public static void A00(C74813cq r3) {
        AnonymousClass4SD r0 = r3.A01;
        if (r0 == null) {
            Fragment fragment = r3.A00;
            C18070vi.A0d(fragment, 0);
            r0 = (AnonymousClass4SD) ((AnonymousClass1K1) ((C006602x) C000400h.A00(C006602x.class, fragment))).A63.get();
            r3.A01 = r0;
        }
        r0.A02 = r3;
    }

    public Fragment getHost() {
        Fragment fragment = this.A00;
        C17960vV.A07(fragment);
        return fragment;
    }

    public ListAdapter getListAdapter() {
        ListAdapter listAdapter;
        AnonymousClass4SD r1 = this.A01;
        synchronized (r1) {
            listAdapter = r1.A00;
        }
        return listAdapter;
    }

    public ListView getListView() {
        AnonymousClass4SD r2 = this.A01;
        if (r2.A01 == null) {
            r2.A02.setContentView(17367060);
        }
        ListView listView = r2.A01;
        C17960vV.A05(listView);
        return listView;
    }

    public AnonymousClass1FY getWaBaseActivity() {
        Fragment fragment = this.A00;
        if (fragment != null) {
            AnonymousClass1FL A1B = fragment.A1B();
            if (A1B instanceof AnonymousClass1FY) {
                return (AnonymousClass1FY) A1B;
            }
        }
        try {
            return (AnonymousClass1FY) C72453Mb.A0L(this);
        } catch (IllegalStateException e) {
            Log.e("No activity available", e);
            return null;
        }
    }

    public void setListAdapter(ListAdapter listAdapter) {
        this.A01.A01(listAdapter);
    }

    public void setSelection(int i) {
        ListView listView = this.A01.A01;
        C17960vV.A05(listView);
        listView.setSelection(i);
    }

    public void C7p() {
        AnonymousClass1FY waBaseActivity = getWaBaseActivity();
        waBaseActivity.getClass();
        waBaseActivity.A4D();
    }

    public Dialog C7r(int i) {
        AnonymousClass1FY waBaseActivity = getWaBaseActivity();
        waBaseActivity.getClass();
        return waBaseActivity.A48(i);
    }

    public boolean C7s(Menu menu) {
        AnonymousClass1FY waBaseActivity = getWaBaseActivity();
        waBaseActivity.getClass();
        return waBaseActivity.A4Z(menu);
    }

    public boolean C7u(int i, KeyEvent keyEvent) {
        AnonymousClass1FY waBaseActivity = getWaBaseActivity();
        waBaseActivity.getClass();
        return waBaseActivity.A4Y(i, keyEvent);
    }

    public boolean C7v(int i, KeyEvent keyEvent) {
        AnonymousClass1FY waBaseActivity = getWaBaseActivity();
        waBaseActivity.getClass();
        return AnonymousClass1FY.A0W(keyEvent, waBaseActivity, i);
    }

    public boolean C7w(Menu menu) {
        AnonymousClass1FY waBaseActivity = getWaBaseActivity();
        waBaseActivity.getClass();
        return waBaseActivity.A4a(menu);
    }

    public void C7x(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    public void C80() {
        getWaBaseActivity().getClass();
    }

    public void setHost(Fragment fragment) {
        this.A00 = fragment;
    }
}
