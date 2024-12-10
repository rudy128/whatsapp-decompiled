package X;

import android.os.SystemClock;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import java.util.Map;

/* renamed from: X.73j  reason: invalid class name and case insensitive filesystem */
public final class C1408673j {
    public static final C18100vl A05 = AnonymousClass1DF.A01(C157477wz.A00);
    public C136436to A00;
    public final AnonymousClass18K A01;
    public final C200710s A02;
    public final AnonymousClass00H A03;
    public final C18030ve A04;

    public static final void A03(C199429zz r4, C1408673j r5, AnonymousClass64O r6, AnonymousClass1BI r7, boolean z) {
        int valueOf;
        boolean z2 = false;
        if (r4 != null && r4.A04.contains(r7)) {
            z2 = true;
        }
        if (z) {
            valueOf = 1;
        } else {
            int i = 3;
            if (z2) {
                i = 2;
            }
            valueOf = Integer.valueOf(i);
        }
        r6.A01 = valueOf;
        boolean A052 = C18020vd.A05(C18040vf.A02, r5.A04, 11846);
        if (r4 != null) {
            AnonymousClass9IL r1 = AnonymousClass9IL.ADHOC_MEMBERS;
            r6.A04 = r4.A00(r1, r7);
            Map map = r4.A03;
            r6.A05 = A02(r1, map);
            AnonymousClass9IL r12 = AnonymousClass9IL.LGC_MEMBERS;
            r6.A0C = r4.A00(r12, r7);
            r6.A0D = A02(r12, map);
            AnonymousClass9IL r13 = AnonymousClass9IL.STARRED_CONTACTS;
            r6.A0G = r4.A00(r13, r7);
            r6.A0H = A02(r13, map);
            AnonymousClass9IL r14 = AnonymousClass9IL.GROUP_CHAT_MEMBERS;
            r6.A0A = r4.A00(r14, r7);
            r6.A0B = A02(r14, map);
            AnonymousClass9IL r15 = AnonymousClass9IL.ONE_ON_ONE;
            r6.A0E = r4.A00(r15, r7);
            r6.A0F = A02(r15, map);
            if (A052) {
                AnonymousClass9IL r16 = AnonymousClass9IL.FAVORITES;
                r6.A08 = r4.A00(r16, r7);
                r6.A09 = A02(r16, map);
                AnonymousClass9IL r17 = AnonymousClass9IL.FAVORITE_GROUP_CHAT_MEMBERS;
                r6.A06 = r4.A00(r17, r7);
                r6.A07 = A02(r17, map);
            }
        }
    }

    public static final C1183563d A00(C1408673j r3, String str) {
        C136436to r2 = r3.A00;
        Boolean bool = null;
        if (r2 == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("CallUserJourney/");
            A10.append(str);
            C17890vO.A1B(A10, " received null event, did you start a session?");
        } else if (r2.A02) {
            C1183563d r4 = new C1183563d();
            r4.A03 = Integer.valueOf(r2.A04);
            r4.A02 = Integer.valueOf(r2.A03);
            r4.A05 = ((C189339iv) r3.A03.get()).A00();
            r4.A06 = r2.A06;
            CallInfo callInfo = r2.A05;
            if (callInfo != null) {
                CallState[] callStateArr = new CallState[2];
                callStateArr[0] = CallState.ACTIVE;
                bool = Boolean.valueOf(C18070vi.A0O(CallState.CONNECTED_LONELY, callStateArr, 1).contains(callInfo.callState));
            }
            r4.A00 = bool;
            r4.A04 = Long.valueOf(SystemClock.uptimeMillis());
            return r4;
        }
        return null;
    }

    public static final AnonymousClass64O A01(C1408673j r3, String str) {
        C136436to r2 = r3.A00;
        if (r2 == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("WamSelectParticipantFromPicker/");
            A10.append(str);
            C17890vO.A1B(A10, " received null event, did you start a session?");
            return null;
        }
        AnonymousClass64O r1 = new AnonymousClass64O();
        r1.A0K = r2.A07.toString();
        r1.A0J = r2.A06;
        r1.A0I = ((C189339iv) r3.A03.get()).A00();
        r1.A03 = Integer.valueOf(r2.A04);
        r1.A02 = C17880vN.A0m();
        return r1;
    }

    public C1408673j(C18030ve r2, AnonymousClass18K r3, AnonymousClass10I r4, AnonymousClass00H r5) {
        C18070vi.A0s(r4, r5, r3, r2);
        this.A03 = r5;
        this.A01 = r3;
        this.A04 = r2;
        this.A02 = C200710s.A00(r4);
    }

    public static Long A02(Object obj, Map map) {
        return Long.valueOf(((Number) AnonymousClass1D7.A06(obj, map)).longValue());
    }
}
