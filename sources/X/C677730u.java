package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.events.EventStartAlarmReceiver;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.30u  reason: invalid class name and case insensitive filesystem */
public final class C677730u implements AnonymousClass1WS {
    public final C18030ve A00;
    public final AnonymousClass1R8 A01;
    public final AnonymousClass118 A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public final void A04(C445823z r7) {
        C18070vi.A0d(r7, 0);
        Log.i("EventStartAlarmManager Scheduling alarm for event start notification");
        AnonymousClass1R8 r0 = this.A01;
        long j = r7.A00;
        r0.A00.A02(A00(r7), 0, j, true);
    }

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public void ByH(AnonymousClass206 r3, int i) {
        C18070vi.A0d(r3, 0);
        if (i != -1 && i != 22) {
            return;
        }
        if (r3.A0v.A02) {
            A02(r3);
        } else {
            A03(r3, false);
        }
    }

    public void ByK(AnonymousClass206 r2, int i) {
        C18070vi.A0d(r2, 0);
        if (i == 41) {
            A03(r2, true);
        }
    }

    public /* synthetic */ void ByN(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByR(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByY(Collection collection, int i) {
        AnonymousClass2TK.A00(this, collection, i);
    }

    public /* synthetic */ void ByZ(AnonymousClass1BI r1) {
    }

    public void Bya(Collection collection, Map map) {
        C18070vi.A0d(collection, 0);
        ArrayList<C445823z> A13 = AnonymousClass000.A13();
        for (Object next : collection) {
            if (next instanceof C445823z) {
                A13.add(next);
            }
        }
        for (C445823z A012 : A13) {
            A01(A012, this);
        }
    }

    public /* synthetic */ void Byb(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byc(AnonymousClass1BI r1, Collection collection, boolean z) {
    }

    public void Byd(Collection collection) {
        C18070vi.A0d(collection, 0);
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : collection) {
            if (next instanceof C445823z) {
                A13.add(next);
            }
        }
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            if (A0Y.A0v.A02) {
                A02(A0Y);
            } else {
                A03(A0Y, false);
            }
        }
    }

    public /* synthetic */ void Bz8(C29681ch r1) {
    }

    public /* synthetic */ void Bz9(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BzA(C29681ch r1, boolean z) {
    }

    public /* synthetic */ void BzC(C29681ch r1) {
    }

    public /* synthetic */ void C0d(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    private final PendingIntent A00(C445823z r5) {
        Context context = this.A02.A00;
        Intent intent = new Intent(context, EventStartAlarmReceiver.class);
        intent.setAction("com.whatsapp.alarm.EVENT_START_ACTION");
        AnonymousClass205 r0 = r5.A0v;
        AnonymousClass4aU.A00(intent, r0);
        PendingIntent A012 = C1408573i.A01(context, r0.hashCode(), intent, 1073741824);
        C18070vi.A0X(A012);
        return A012;
    }

    public static final void A01(C445823z r1, C677730u r2) {
        Log.i("EventStartAlarmManager Cancelling scheduled alarm for event start notification alarm");
        AnonymousClass1R8 r0 = r2.A01;
        PendingIntent A002 = r2.A00(r1);
        AlarmManager A05 = r0.A00.A00.A05();
        if (A05 != null) {
            A05.cancel(A002);
        }
    }

    private final void A02(AnonymousClass206 r4) {
        if (r4 instanceof C445823z) {
            C445823z r42 = (C445823z) r4;
            if (!((C88194Yr) this.A03.get()).A04(r42)) {
                if (C18020vd.A05(C18040vf.A02, this.A00, 7306)) {
                    A04(r42);
                }
            }
        }
    }

    private final void A03(AnonymousClass206 r5, boolean z) {
        if (r5 instanceof C445823z) {
            C445823z r3 = (C445823z) r5;
            if (!((C88194Yr) this.A03.get()).A04(r3)) {
                if (C18020vd.A05(C18040vf.A02, this.A00, 7306)) {
                    ((C88124Yk) this.A04.get()).A01(r3, "EventStartAlarmManager", new C71073Dr(this, r5, z));
                }
            }
        }
    }

    public C677730u(AnonymousClass1R8 r1, AnonymousClass118 r2, C18030ve r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r2, r3, r1, r4, r5);
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = r1;
        this.A04 = r4;
        this.A03 = r5;
    }

    public void ByQ(AnonymousClass206 r3, AnonymousClass206 r4) {
        boolean A15 = C18070vi.A15(r3, r4);
        if ((r3 instanceof C445823z) && (r4 instanceof C445823z)) {
            Log.i("EventStartAlarmManager Event message is edited");
            A01((C445823z) r3, this);
            if (r4.A0v.A02) {
                A02(r4);
            } else {
                A03(r4, A15);
            }
        }
    }
}
