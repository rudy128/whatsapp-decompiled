package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.1HR  reason: invalid class name */
public class AnonymousClass1HR implements AnonymousClass1HQ {
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02 = C221618v.A00(C216216s.class);
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public static boolean A00(AnonymousClass1HR r3) {
        if (!C18020vd.A05(C18040vf.A02, r3.A00, 12564)) {
            return false;
        }
        CallInfo BO3 = r3.BO3();
        if (BO3 == null || BO3.callEnding || BO3.callState == CallState.NONE) {
            return true;
        }
        return false;
    }

    public CallInfo BO3() {
        C18030ve r4 = this.A00;
        C216216s r3 = (C216216s) this.A02.get();
        AnonymousClass00H r2 = this.A03;
        C18070vi.A0d(r4, 0);
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        if (C18020vd.A05(C18040vf.A01, r4, 8032)) {
            return ((C88054Yd) r2.get()).A01();
        }
        r3.A00.incrementAndGet();
        return Voip.getCallInfo();
    }

    public boolean BeE() {
        if (Voip.A03(this.A00) != CallState.LINK || Voip.getCurrentCallLinkState() == 4) {
            return false;
        }
        return true;
    }

    public int CQ1() {
        CallState A032 = Voip.A03(this.A00);
        if (A032 != null && A032 != CallState.NONE) {
            return Voip.turnScreenShareOff();
        }
        Log.w("turnScreenSharingOff ignored as no call active");
        return 670007;
    }

    public AnonymousClass1HR(C18030ve r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        this.A00 = r2;
        this.A04 = r3;
        this.A03 = r4;
        this.A01 = r5;
    }

    public void BjM() {
        CallInfo BO3 = BO3();
        if (BO3 != null && BO3.isBotCall) {
            AnonymousClass7R9 r1 = new AnonymousClass7R9((Object) this, 9);
            if (C22781De.A03()) {
                ((AnonymousClass10I) this.A04.get()).CGN(r1);
            } else {
                r1.run();
            }
        }
    }
}
