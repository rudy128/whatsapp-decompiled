package X;

import android.os.SystemClock;
import java.util.Set;

/* renamed from: X.4Pt  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C85994Pt {
    public final /* synthetic */ AnonymousClass4SY A00;

    public final void A00(C81833zs r5, Set set) {
        String str;
        AnonymousClass4SY r3 = this.A00;
        C18070vi.A0d(r3, 0);
        if (r3.A03 != null) {
            r3.A00();
        }
        if (set == null || (str = Integer.valueOf(set.size()).toString()) == null) {
            str = "large";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupPresenceHelper/GroupChatOpen sent ");
        A10.append(str);
        C17890vO.A1A(A10, " subs");
        C26241Rj r0 = r3.A0H;
        r0.A0E.add(r3.A0G);
        r3.A04 = set;
        r3.A03 = r5;
        r3.A02 = SystemClock.elapsedRealtime();
    }

    public /* synthetic */ C85994Pt(AnonymousClass4SY r1) {
        this.A00 = r1;
    }
}
