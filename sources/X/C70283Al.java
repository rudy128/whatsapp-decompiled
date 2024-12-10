package X;

import com.whatsapp.HomeActivity;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.3Al  reason: invalid class name and case insensitive filesystem */
public class C70283Al implements AnonymousClass1IV {
    public final int A00;
    public final Object A01;

    public C70283Al(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bn7(C178119Bw r15) {
        C89444cT r2;
        switch (this.A00) {
            case 0:
                ((C23281Fk) this.A01).A03.A06 = true;
                return;
            case 1:
                Log.i("CallsHistoryDataSource/onCallEnded");
                C40971vb r3 = (C40971vb) this.A01;
                if (r3.A07 != null) {
                    try {
                        r2 = C40811vJ.A05(r3.A0B);
                    } catch (UnsatisfiedLinkError e) {
                        Log.e((Throwable) e);
                        r2 = null;
                    }
                    C178119Bw r10 = r15;
                    if (C62102qn.A00(r3.A0A, r3.A0K, r15, r2)) {
                        if (!r15.A0O()) {
                            C17890vO.A0t(r3.A03);
                        }
                        C41031vh r22 = r3.A07;
                        Log.i("CallsHistoryViewModel/onCallEnded");
                        if (!AnonymousClass000.A1T(r15.A07, 3)) {
                            CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = r22.A00;
                            if (!callsHistoryFragmentViewModel.A0J) {
                                Log.i("CallsHistoryViewModel/onCallEnded fully refresh the call history as the call items might be outdated");
                                callsHistoryFragmentViewModel.A0K = true;
                                callsHistoryFragmentViewModel.A0R.A01();
                                return;
                            }
                            C49142Pi r0 = callsHistoryFragmentViewModel.A08;
                            if (r0 != null) {
                                r0.A0B(true);
                            }
                            C41051vj r1 = callsHistoryFragmentViewModel.A0T;
                            Lock lock = callsHistoryFragmentViewModel.A0s;
                            LinkedHashMap linkedHashMap = callsHistoryFragmentViewModel.A0r;
                            ArrayList arrayList = callsHistoryFragmentViewModel.A0p;
                            AnonymousClass11P r5 = callsHistoryFragmentViewModel.A0b;
                            C18030ve r7 = callsHistoryFragmentViewModel.A0h;
                            C24901Mc r9 = callsHistoryFragmentViewModel.A0j;
                            C49142Pi r02 = new C49142Pi(r1, callsHistoryFragmentViewModel, callsHistoryFragmentViewModel.A0Z, callsHistoryFragmentViewModel.A0a, r5, callsHistoryFragmentViewModel.A0g, r7, callsHistoryFragmentViewModel.A0i, r9, r10, arrayList, linkedHashMap, lock);
                            callsHistoryFragmentViewModel.A08 = r02;
                            AnonymousClass1J2.A01(callsHistoryFragmentViewModel, r02);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BnG(C178119Bw r2, boolean z) {
        if (1 - this.A00 == 0) {
            Log.i("CallsHistoryDataSource/onCallMissed");
        }
    }

    public void BnJ(C178119Bw r7) {
        if (this.A00 == 0) {
            HomeActivity homeActivity = (HomeActivity) this.A01;
            ((C31131f4) homeActivity.A1X.get()).A04();
            AnonymousClass4aV.A02(homeActivity.A01, (C31131f4) homeActivity.A1X.get());
            ArrayList A0B = r7.A0B();
            boolean A0W = r7.A0W();
            boolean z = true;
            boolean A1P = AnonymousClass000.A1P(A0B.size());
            if (A0B.size() <= 2) {
                z = false;
            }
            HomeActivity.A1F(homeActivity, new C135166rl(A0W, A1P, z));
            homeActivity.A03.A06 = false;
        }
    }

    public /* synthetic */ void BnK(AnonymousClass1BI r3, CallState callState, String str) {
        if (2 - this.A00 == 0) {
            ConversationsFragment.A0m((ConversationsFragment) this.A01, Collections.singletonList(r3));
        }
    }

    public void C5e() {
        if (this.A00 == 0) {
            HomeActivity homeActivity = (HomeActivity) this.A01;
            AnonymousClass4aV.A02(homeActivity.A01, (C31131f4) homeActivity.A1X.get());
        }
    }

    public /* synthetic */ void Bmn() {
    }

    public /* synthetic */ void BnH(long j, boolean z, boolean z2, boolean z3, boolean z4) {
    }
}
