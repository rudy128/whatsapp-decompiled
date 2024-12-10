package X;

import android.view.Menu;
import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.calling.callhistory.view.CallsHistoryClearCallLogDialogFragment;
import com.whatsapp.calling.callhistory.view.CallsHistoryFragment;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1mE  reason: invalid class name and case insensitive filesystem */
public class C35431mE implements AnonymousClass02H {
    public final /* synthetic */ CallsHistoryFragment A00;

    public boolean BqR(Menu menu, AnonymousClass02B r8) {
        C137526vb.A00(menu);
        menu.add(0, 2131432535, 0, 2131888327).setIcon(2131231847).setShowAsAction(2);
        CallsHistoryFragment callsHistoryFragment = this.A00;
        if (C18020vd.A05(C18040vf.A02, callsHistoryFragment.A0T, 4023)) {
            menu.add(0, 2131432537, 0, 2131888318).setIcon(C50142Th.A00(callsHistoryFragment, 2131231845)).setShowAsAction(0);
        }
        return true;
    }

    public C35431mE(CallsHistoryFragment callsHistoryFragment) {
        this.A00 = callsHistoryFragment;
    }

    public void BrJ(AnonymousClass02B r8) {
        CallsHistoryFragment callsHistoryFragment = this.A00;
        if (!CallsHistoryFragment.A0D(callsHistoryFragment)) {
            HashMap hashMap = callsHistoryFragment.A1A;
            for (AnonymousClass28W A0D : hashMap.values()) {
                A0D.A0D(false, true, false);
            }
            HashMap hashMap2 = callsHistoryFragment.A19;
            for (AnonymousClass28W A0D2 : hashMap2.values()) {
                A0D2.A0D(false, true, false);
            }
            hashMap.clear();
            Set keySet = hashMap.keySet();
            C18070vi.A0d(keySet, 0);
            ((C41261w4) callsHistoryFragment.A0m.get()).A0B = keySet;
            hashMap2.clear();
            Set keySet2 = hashMap2.keySet();
            C18070vi.A0d(keySet2, 0);
            ((C41261w4) callsHistoryFragment.A0m.get()).A0A = keySet2;
            RecyclerView recyclerView = callsHistoryFragment.A03;
            C17960vV.A05(recyclerView);
            recyclerView.A0f(0);
        }
        callsHistoryFragment.A02 = null;
    }

    public boolean C1U(Menu menu, AnonymousClass02B r9) {
        CallsHistoryFragment callsHistoryFragment = this.A00;
        if (!callsHistoryFragment.A1b()) {
            Log.w("CallsHistoryFragmentV2/onPrepareActionMode not attached to an activity");
            return false;
        } else if (!CallsHistoryFragment.A0D(callsHistoryFragment) || AnonymousClass1Y5.A0D(callsHistoryFragment.A0L.A0M())) {
            menu.findItem(2131432535).setVisible(!CallsHistoryFragment.A0D(callsHistoryFragment));
            r9.A0B(String.format(callsHistoryFragment.A0N.A0N(), "%d", new Object[]{Integer.valueOf(callsHistoryFragment.A1A.size() + callsHistoryFragment.A19.size())}));
            AnonymousClass1FL A1D = callsHistoryFragment.A1D();
            AnonymousClass1L9.A03(A1D.findViewById(2131427510), A1D.getWindowManager());
            return true;
        } else {
            r9.A05();
            return true;
        }
    }

    public boolean Bks(MenuItem menuItem, AnonymousClass02B r16) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131432535) {
            CallsHistoryFragment callsHistoryFragment = this.A00;
            CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = callsHistoryFragment.A0C;
            HashMap hashMap = callsHistoryFragment.A1A;
            Set keySet = new HashMap(hashMap).keySet();
            C51712Zi r8 = new C51712Zi(callsHistoryFragmentViewModel);
            Lock lock = callsHistoryFragmentViewModel.A0s;
            AnonymousClass1TD r9 = callsHistoryFragmentViewModel.A0d;
            new C49062Pa(callsHistoryFragmentViewModel.A0R, r8, r9, callsHistoryFragmentViewModel.A0p, callsHistoryFragmentViewModel.A0r, keySet, lock).A02.executeOnExecutor(callsHistoryFragmentViewModel.A0D, new Void[0]);
            hashMap.clear();
            CallsHistoryFragmentViewModel callsHistoryFragmentViewModel2 = callsHistoryFragment.A0C;
            HashMap hashMap2 = callsHistoryFragment.A19;
            Set keySet2 = new HashMap(hashMap2).keySet();
            if (!keySet2.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                List<C62482rT> list = callsHistoryFragmentViewModel2.A0G;
                if (list != null) {
                    for (C62482rT r82 : list) {
                        Iterator it = keySet2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((String) it.next()).equals(r82.A03.getRawString())) {
                                    arrayList.add(Long.valueOf(r82.A01));
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    C40971vb r3 = callsHistoryFragmentViewModel2.A0R;
                    r3.A0R.CGF(new C21431Ajy(r3, arrayList, 15));
                }
            }
            hashMap2.clear();
            Set keySet3 = hashMap.keySet();
            C18070vi.A0d(keySet3, 0);
            ((C41261w4) callsHistoryFragment.A0m.get()).A0B = keySet3;
            Set keySet4 = hashMap2.keySet();
            C18070vi.A0d(keySet4, 0);
            ((C41261w4) callsHistoryFragment.A0m.get()).A0A = keySet4;
            AnonymousClass02B r0 = callsHistoryFragment.A02;
            if (r0 == null) {
                return true;
            }
            r0.A05();
            return true;
        } else if (itemId != 2131432537) {
            return false;
        } else {
            new CallsHistoryClearCallLogDialogFragment().A2C(this.A00.A1F(), (String) null);
            return false;
        }
    }
}
