package X;

import android.app.Activity;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker;
import com.whatsapp.contact.picker.AddGroupParticipantsSelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: X.3cp  reason: invalid class name and case insensitive filesystem */
public abstract class C74803cp extends C75103e0 implements C108325bW {
    public AnonymousClass00H A00;

    public synchronized void A4b(ListAdapter listAdapter) {
        ((AnonymousClass4SD) this.A00.get()).A01(listAdapter);
    }

    public static AnonymousClass1IX A0Q(AnonymousClass1IX r3, AnonymousClass3gf r4) {
        if (r3 != null) {
            return r3;
        }
        ArrayList arrayList = new ArrayList();
        r4.A06.A0v(arrayList);
        Collections.sort(arrayList, new C146987Rj(r4.A08, r4.A0F));
        return AnonymousClass1IX.copyOf((Collection) arrayList);
    }

    public static AnonymousClass4U5 A0V(AddGroupParticipantsSelector addGroupParticipantsSelector, AnonymousClass1E7 r2) {
        AnonymousClass4U5 r0 = (AnonymousClass4U5) addGroupParticipantsSelector.A0K.get(r2.A0J);
        if (r0 == null) {
            return AddGroupParticipantsSelector.A0d;
        }
        return r0;
    }

    public static C1408673j A0c(GroupCallParticipantPicker groupCallParticipantPicker) {
        return (C1408673j) groupCallParticipantPicker.A0H.get();
    }

    public static void A0r(AnonymousClass1K1 r1, AnonymousClass10E r2, AnonymousClass10G r3, C76733o2 r4) {
        r4.A0I = (AnonymousClass1NN) r2.A2q.get();
        r4.A0J = (AnonymousClass1MZ) r2.A4t.get();
        r4.A02 = (C23721Hj) r3.A5b.get();
        r4.A0Q = C000200d.A00(r2.A1H);
        r4.A0V = C000200d.A00(r2.A74);
        r4.A07 = (C107245Yy) r1.A3y.get();
        r4.A0T = C000200d.A00(r2.A3J);
        r4.A0D = AnonymousClass1K1.A0p(r1);
        r4.A06 = (C107235Yx) r1.A19.get();
        r4.A09 = (C107255Yz) r1.A1A.get();
        r4.A0S = C000200d.A00(r2.A2d);
        r4.A0W = C000200d.A00(r2.AAd);
        r4.A03 = (C84154Ih) r1.A1B.get();
    }

    public static void A0s(AnonymousClass1K1 r1, AnonymousClass10E r2, AnonymousClass10G r3, AnonymousClass3gf r4) {
        r4.A0N = C000200d.A00(r2.A4u);
        r4.A0O = C000200d.A00(r1.A4W);
        r4.A05 = (C72043Kk) r3.A1j.get();
        r4.A0G = (AnonymousClass129) r2.A4I.get();
        r4.A0Q = C000200d.A00(r2.ABd);
        r4.A0C = (C37311pJ) r1.A4y.get();
        r4.A0P = C000200d.A00(r2.A72);
        r4.A0E = (C219217x) r2.ABj.get();
    }

    public static void A0v(AnonymousClass1K1 r0, AnonymousClass10E r1, C76733o2 r2) {
        r2.A00 = C000200d.A00(r0.A63);
        r2.A0L = (AnonymousClass1R2) r1.A8L.get();
        r2.A0H = (AnonymousClass1CJ) r1.A2H.get();
    }

    public static void A0x(GroupCallParticipantPicker groupCallParticipantPicker) {
        AnonymousClass1GP supportFragmentManager = groupCallParticipantPicker.getSupportFragmentManager();
        C18070vi.A0d(supportFragmentManager, 0);
        C20098A7b.A01(((AnonymousClass1VD) groupCallParticipantPicker.A0G.get()).A00(), supportFragmentManager);
    }

    public void A2p() {
        ((AnonymousClass4SD) this.A00.get()).A00();
    }

    public void C80() {
    }

    public ListView getListView() {
        AnonymousClass4SD r2 = (AnonymousClass4SD) this.A00.get();
        if (r2.A01 == null) {
            r2.A02.setContentView(17367060);
        }
        ListView listView = r2.A01;
        C17960vV.A05(listView);
        return listView;
    }

    public void onDestroy() {
        AnonymousClass4SD r0 = (AnonymousClass4SD) this.A00.get();
        r0.A04.removeCallbacks(r0.A05);
        super.onDestroy();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        AnonymousClass4SD r2 = (AnonymousClass4SD) this.A00.get();
        if (r2.A01 == null) {
            r2.A02.setContentView(17367060);
        }
        C108325bW r0 = r2.A02;
        C17960vV.A07(r0);
        r0.C7x(bundle);
    }

    public static LayoutInflater A03(Activity activity, C76783oH r4) {
        r4.A0F(activity.getResources().getDimensionPixelSize(2131165198), activity.getResources().getDimensionPixelSize(2131165198));
        return activity.getLayoutInflater();
    }

    public static void A0d(Activity activity, Transition transition, TransitionSet transitionSet, View view) {
        transition.addTarget(view);
        transitionSet.addTransition(transition);
        activity.getWindow().setReturnTransition(transitionSet);
    }

    public static void A0q(AnonymousClass1K1 r1, AnonymousClass10E r2, AnonymousClass10G r3, GroupCallParticipantPicker groupCallParticipantPicker, AnonymousClass00S r5) {
        groupCallParticipantPicker.A08 = C000200d.A00(r5);
        groupCallParticipantPicker.A0A = C000200d.A00(r2.A2X);
        groupCallParticipantPicker.A07 = C000200d.A00(r3.A1S);
        groupCallParticipantPicker.A0H = C000200d.A00(r3.A4R);
        groupCallParticipantPicker.A0K = C000200d.A00(r2.ABV);
        groupCallParticipantPicker.A03 = (C37311pJ) r1.A4y.get();
        groupCallParticipantPicker.A0F = C000200d.A00(r2.A8k);
        groupCallParticipantPicker.A0G = C000200d.A00(r2.A9J);
        groupCallParticipantPicker.A0B = C000200d.A00(r2.A2b);
        groupCallParticipantPicker.A04 = (C219217x) r2.ABj.get();
        groupCallParticipantPicker.A0E = C000200d.A00(r2.A8W);
        groupCallParticipantPicker.A0J = C000200d.A00(r2.ABT);
        groupCallParticipantPicker.A0C = C000200d.A00(r2.A72);
        groupCallParticipantPicker.A0D = C000200d.A00(r3.A3I);
        groupCallParticipantPicker.A09 = C000200d.A00(r1.A0Q);
    }

    public static void A0t(AnonymousClass1K1 r1, AnonymousClass10E r2, AnonymousClass10G r3, AnonymousClass3gf r4, AnonymousClass00S r5) {
        r4.A00 = C000200d.A00(r5);
        r4.A04 = (C36271nc) r3.A4x.get();
        r4.A0B = (AnonymousClass733) r3.A2s.get();
        r4.A0I = C000200d.A00(r2.A0F);
        r4.A09 = (C27201Vd) r2.A2j.get();
        r4.A06 = (AnonymousClass1M9) r2.A2f.get();
        r4.A08 = (C24921Me) r2.ABX.get();
        r4.A0J = C000200d.A00(r2.A0x);
        r4.A07 = (C24671Lf) r2.A2g.get();
        r4.A0L = C000200d.A00(r2.A2b);
        r4.A0F = (C18000vb) r2.ABz.get();
        r4.A0K = C000200d.A00(r2.A2A);
        r4.A0M = C000200d.A00(r1.A0l);
    }

    public static void A0u(AnonymousClass1K1 r1, AnonymousClass10E r2, AnonymousClass10G r3, C79333vF r4, C18140vp r5) {
        r4.A0D = (AnonymousClass1LU) r5.get();
        r4.A0C = (AnonymousClass18K) r2.A9B.get();
        r4.A0A = (AnonymousClass1QB) r2.A4T.get();
        r4.A05 = (C24671Lf) r2.A2g.get();
        r4.A0G = C000200d.A00(r2.A2A);
        r4.A0B = (AnonymousClass1Cd) r2.A6i.get();
        r4.A09 = (AnonymousClass1WP) r2.A3k.get();
        r4.A08 = (AnonymousClass1Q9) r2.A3j.get();
        r4.A0J = C000200d.A00(r3.A4e);
        r4.A0H = C000200d.A00(r2.A4u);
        r4.A02 = (C56472hW) r1.A2M.get();
        r4.A01 = C19890zB.A00;
        r4.A0I = C000200d.A00(r1.A4u);
    }

    public static void A0w(AnonymousClass10E r1, AnonymousClass10G r2, C76733o2 r3, C18140vp r4) {
        r3.A04 = (C33251iW) r4.get();
        r3.A0X = C000200d.A00(r2.A55);
        r3.A0U = C000200d.A00(r1.A3w);
        r3.A0G = (AnonymousClass1LW) r1.A2G.get();
        r3.A0E = (AnonymousClass1M9) r1.A2f.get();
        r3.A0C = (C31191fA) r1.A25.get();
        r3.A0R = C000200d.A00(r1.A24);
        r3.A0N = (AnonymousClass1PU) r1.A4j.get();
        r3.A0M = (AnonymousClass1Nb) r1.A2E.get();
        r3.A0K = (AnonymousClass1QJ) r1.A8F.get();
        r3.A05 = (C195529tU) r1.A1t.get();
        r3.A0F = (C219217x) r1.ABj.get();
    }

    public void C7x(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((AnonymousClass4SD) this.A00.get()).A02 = this;
    }
}
