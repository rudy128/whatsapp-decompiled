package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Ack  reason: case insensitive filesystem */
public abstract class C20992Ack implements AnonymousClass1O5 {
    public final Context A00;
    public final C33711jG A01;
    public final AnonymousClass119 A02;

    public abstract void A04(A7B a7b);

    public abstract void A05(A7B a7b);

    public abstract void A06(C29621ca r1);

    public void Bt9(C29621ca r8, String str) {
        ArrayList arrayList;
        if (!(this instanceof C175428yh) || 11 - ((C175428yh) this).A00 != 0) {
            arrayList = A03(r8);
        } else {
            arrayList = AnonymousClass000.A13();
            Iterator A03 = C29621ca.A03(r8, "error");
            while (A03.hasNext()) {
                C29621ca A0a = C17880vN.A0a(A03);
                if (A0a != null) {
                    String A0Q = A0a.A0Q("code", (String) null);
                    String A0Q2 = A0a.A0Q("text", (String) null);
                    String A0Q3 = A0a.A0Q("auth-ticket-fp", (String) null);
                    if (A0Q != null) {
                        int parseInt = Integer.parseInt(A0Q);
                        A7B A002 = A7B.A00();
                        A002.A00 = parseInt;
                        A002.A07 = A0Q2;
                        A002.A05 = A0Q3;
                        arrayList.add(A002);
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A7B a7b = (A7B) it.next();
            C33711jG r0 = this.A01;
            int i = a7b.A00;
            C33701jF r2 = r0.A00;
            if (r2 != null && (i == 404 || i == 440 || i == 449)) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("paymentsLifecycleManager.reinitialize(true) via PaymentsLifecycleManager::onPaymentIqError(");
                A10.append(i);
                C17890vO.A1A(A10, ")");
                r2.A01(true, false);
            }
            this.A02.CGP(new C70653Bz(this, a7b, 26));
        }
    }

    public void C7Z(C29621ca r4, String str) {
        this.A02.CGP(new C70653Bz(this, r4, 27));
    }

    public C20992Ack(Context context, C33711jG r2, AnonymousClass119 r3) {
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
    }

    public static ArrayList A03(C29621ca r6) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator A03 = C29621ca.A03(r6, "error");
        while (A03.hasNext()) {
            C29621ca A0a = C17880vN.A0a(A03);
            if (A0a != null) {
                String A0Q = A0a.A0Q("code", (String) null);
                String A0Q2 = A0a.A0Q("text", (String) null);
                A0a.A0Q("display_title", (String) null);
                String A0Q3 = A0a.A0Q("display_text", (String) null);
                if (A0Q != null) {
                    int parseInt = Integer.parseInt(A0Q);
                    A7B A002 = A7B.A00();
                    A002.A00 = parseInt;
                    A002.A07 = A0Q2;
                    A002.A06 = A0Q3;
                    A13.add(A002);
                    if (parseInt == 454) {
                        A002.A04 = A0a.A0K("step_up");
                    }
                }
            }
        }
        return A13;
    }

    public void BrD(String str) {
        A7B A002 = A7B.A00();
        int i = 6;
        if (AnonymousClass11E.A02(this.A00)) {
            i = -2;
        }
        A002.A00 = i;
        this.A02.CGP(new C70653Bz(this, A002, 28));
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
