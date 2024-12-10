package X;

import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1vb  reason: invalid class name and case insensitive filesystem */
public class C40971vb {
    public int A00 = 100;
    public int A01 = 1000;
    public AnonymousClass2PI A02;
    public C49162Pk A03;
    public AnonymousClass2PJ A04;
    public AnonymousClass2PK A05;
    public C62102qn A06;
    public C41031vh A07;
    public boolean A08 = true;
    public final AnonymousClass1KB A09;
    public final AnonymousClass11S A0A;
    public final AnonymousClass1HQ A0B;
    public final C40961va A0C;
    public final AnonymousClass1M9 A0D;
    public final C23581Gv A0E;
    public final C24671Lf A0F;
    public final C24921Me A0G;
    public final AnonymousClass11P A0H;
    public final AnonymousClass1TD A0I;
    public final C27081Uq A0J;
    public final C18030ve A0K;
    public final AnonymousClass126 A0L;
    public final C25221Nj A0M;
    public final C25191Ng A0N;
    public final C40981vc A0O;
    public final C40951vZ A0P;
    public final C24901Mc A0Q;
    public final AnonymousClass10I A0R;
    public final C34191k5 A0S;
    public final C39491tA A0T;
    public final AnonymousClass1IV A0U;
    public final AnonymousClass1VT A0V;
    public final AnonymousClass00H A0W;
    public final AnonymousClass00H A0X;

    public static void A00(C40971vb r13, List list) {
        String str;
        if (list == null) {
            str = "CallsHistoryDataSource/notifyCallItemsUpdated task result null";
        } else {
            C41031vh r1 = r13.A07;
            if (r1 != null) {
                ArrayList arrayList = new ArrayList(list);
                Log.i("CallsHistoryViewModel/onCallLogUpdated");
                CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = r1.A00;
                if (callsHistoryFragmentViewModel.A0J || callsHistoryFragmentViewModel.A0K) {
                    callsHistoryFragmentViewModel.A0K = false;
                    C49112Pf r12 = callsHistoryFragmentViewModel.A0B;
                    if (r12 != null) {
                        r12.A0B(true);
                    }
                    C41041vi r5 = callsHistoryFragmentViewModel.A0S;
                    Lock lock = callsHistoryFragmentViewModel.A0s;
                    LinkedHashMap linkedHashMap = callsHistoryFragmentViewModel.A0r;
                    ArrayList arrayList2 = callsHistoryFragmentViewModel.A0p;
                    C24901Mc r10 = callsHistoryFragmentViewModel.A0j;
                    C49112Pf r4 = new C49112Pf(r5, callsHistoryFragmentViewModel, callsHistoryFragmentViewModel.A0Z, callsHistoryFragmentViewModel.A0g, callsHistoryFragmentViewModel.A0i, r10, arrayList, arrayList2, linkedHashMap, lock);
                    callsHistoryFragmentViewModel.A0B = r4;
                    r4.A02.executeOnExecutor(callsHistoryFragmentViewModel.A0D, new Void[0]);
                    return;
                }
                str = "CallsHistoryViewModel/onCallLogUpdated skip due to no active observer";
            } else {
                return;
            }
        }
        Log.i(str);
    }

    public void A01() {
        C49162Pk r1 = this.A03;
        if (r1 != null) {
            r1.A0B(true);
        }
        C49162Pk r2 = new C49162Pk(this);
        this.A03 = r2;
        this.A0R.CGM(r2, new Void[0]);
    }

    public void A02() {
        AnonymousClass2PK r1 = this.A05;
        if (r1 != null) {
            r1.A0B(true);
        }
        AnonymousClass2PK r2 = new AnonymousClass2PK(this);
        this.A05 = r2;
        this.A0R.CGD(r2, new Void[0]);
    }

    public C40971vb(AnonymousClass1KB r13, AnonymousClass11S r14, AnonymousClass1HQ r15, C40961va r16, AnonymousClass1M9 r17, C24671Lf r18, C24921Me r19, AnonymousClass11P r20, AnonymousClass1TD r21, C27081Uq r22, C18030ve r23, AnonymousClass126 r24, C25191Ng r25, C40951vZ r26, C24901Mc r27, AnonymousClass10I r28, C39491tA r29, AnonymousClass1VT r30, AnonymousClass00H r31, AnonymousClass00H r32) {
        C70273Ak r6 = new C70273Ak(this, 0);
        this.A0S = r6;
        C70283Al r4 = new C70283Al(this, 1);
        this.A0U = r4;
        C66772yi r3 = new C66772yi(this, 1);
        this.A0E = r3;
        C40991vd r2 = new C40991vd(this);
        this.A0O = r2;
        C683733c r1 = new C683733c(this, 0);
        this.A0M = r1;
        this.A0H = r20;
        C18030ve r5 = r23;
        this.A0K = r5;
        this.A09 = r13;
        this.A0A = r14;
        this.A0R = r28;
        this.A0B = r15;
        this.A0Q = r27;
        AnonymousClass1VT r7 = r30;
        this.A0V = r7;
        this.A0D = r17;
        this.A0G = r19;
        this.A0W = r31;
        C39491tA r8 = r29;
        this.A0T = r8;
        C24671Lf r11 = r18;
        this.A0F = r11;
        this.A0L = r24;
        this.A0I = r21;
        this.A0J = r22;
        C40951vZ r9 = r26;
        this.A0P = r9;
        this.A0X = r32;
        C25191Ng r10 = r25;
        this.A0N = r10;
        this.A0C = r16;
        r7.registerObserver(r4);
        r8.registerObserver(r6);
        r11.registerObserver(r3);
        if (C40811vJ.A0W(r5)) {
            r9.registerObserver(r2);
            r10.registerObserver(r1);
        }
        C18040vf r12 = C18040vf.A02;
        if (C18020vd.A05(r12, r5, 4119)) {
            this.A01 = C18020vd.A00(r12, r5, 4120);
            this.A00 = C18020vd.A00(r12, r5, 4284);
        }
    }
}
