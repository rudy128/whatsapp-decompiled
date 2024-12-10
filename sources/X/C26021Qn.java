package X;

import android.database.Cursor;
import android.os.SystemClock;
import java.util.ArrayList;

/* renamed from: X.1Qn  reason: invalid class name and case insensitive filesystem */
public class C26021Qn {
    public final C25951Qg A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass1LW A03;
    public final AnonymousClass1LY A04;
    public final AnonymousClass1Cd A05;

    public static ArrayList A00(C26021Qn r11, AnonymousClass1BI r12, int i) {
        Cursor A0A;
        C17960vV.A01();
        C28781at A042 = r11.A05.get();
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                A0A = ((C28801av) A042).A02.A0A(C50952Wk.A02, "GET_INTERACTIVE_MESSAGES_BY_CHAT_JID", new String[]{Integer.toString(i), Long.toString(r11.A03.A09(r12)), Long.toString(System.currentTimeMillis() - 2419200000L)});
                ArrayList arrayList = new ArrayList();
                if (A0A != null) {
                    while (A0A.moveToNext()) {
                        AnonymousClass206 A022 = ((AnonymousClass1W6) r11.A01.get()).A02(A0A, r12);
                        if (A022 != null) {
                            arrayList.add(A022);
                        }
                    }
                }
                if (A0A != null) {
                    A0A.close();
                }
                r11.A04.A01("OrderMessageManager/getInteractiveMessages", SystemClock.uptimeMillis() - uptimeMillis);
                return arrayList;
            } catch (Throwable th) {
                r11.A04.A01("OrderMessageManager/getInteractiveMessages", SystemClock.uptimeMillis() - uptimeMillis);
                throw th;
            }
            throw th;
        } finally {
            try {
                A042.close();
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
    }

    public C26021Qn(AnonymousClass11P r1, AnonymousClass1LW r2, AnonymousClass1LY r3, C25951Qg r4, AnonymousClass1Cd r5, AnonymousClass00H r6) {
        this.A01 = r6;
        this.A00 = r4;
        this.A05 = r5;
        this.A02 = r1;
        this.A03 = r2;
        this.A04 = r3;
    }

    public AnonymousClass21K A01(String str) {
        Throwable th;
        AnonymousClass21K r1;
        C17960vV.A01();
        C25951Qg r0 = this.A00;
        C17960vV.A01();
        C28781at A042 = r0.A01.get();
        try {
            Cursor A0A = ((C28801av) A042).A02.A0A(C50952Wk.A03, "GET_CHECKOUT_MESSAGES_BY_MESSAGE_ID", new String[]{str});
            A042.close();
            try {
                if (A0A.moveToNext()) {
                    AnonymousClass206 A012 = ((AnonymousClass1W6) this.A01.get()).A01(A0A);
                    if (A012 instanceof AnonymousClass21K) {
                        r1 = (AnonymousClass21K) A012;
                        A0A.close();
                        return r1;
                    }
                }
                r1 = null;
                A0A.close();
                return r1;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            A042.close();
            throw th;
        }
    }

    public ArrayList A02() {
        Throwable th;
        C17960vV.A01();
        C25951Qg r0 = this.A00;
        C17960vV.A01();
        C28781at A042 = r0.A01.get();
        try {
            Cursor A0A = ((C28801av) A042).A02.A0A(C50952Wk.A04, "GET_CHECKOUT_MESSAGES", (String[]) null);
            A042.close();
            try {
                ArrayList arrayList = new ArrayList();
                if (A0A != null) {
                    while (A0A.moveToNext()) {
                        AnonymousClass21L r02 = (AnonymousClass21L) ((AnonymousClass1W6) this.A01.get()).A01(A0A);
                        if (r02 != null) {
                            arrayList.add(r02);
                        }
                    }
                }
                if (A0A != null) {
                    A0A.close();
                }
                return arrayList;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            A042.close();
            throw th;
        }
    }
}
