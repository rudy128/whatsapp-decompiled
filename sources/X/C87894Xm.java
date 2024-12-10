package X;

import com.whatsapp.fieldstats.helper.sharecontentjourney.ShareContentUserJourneyLogger$logAction$queueingResult$1;
import java.util.List;

/* renamed from: X.4Xm  reason: invalid class name and case insensitive filesystem */
public final class C87894Xm {
    public static final List A09;
    public C86814Te A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass11P A02;
    public final C18030ve A03;
    public final AnonymousClass18K A04;
    public final C18100vl A05 = AnonymousClass1DF.A01(new C99064sD(16));
    public final C18100vl A06 = C99154sM.A01(this, 22);
    public final C18600wl A07;
    public final AnonymousClass1OX A08;

    public final void A00() {
        C86814Te r1 = this.A00;
        C86814Te r0 = null;
        if (r1 != null) {
            r0 = new C86814Te(r1.A01, true);
        }
        this.A00 = r0;
    }

    static {
        Integer[] numArr = new Integer[13];
        AnonymousClass000.A1L(numArr, 32);
        AnonymousClass000.A1M(numArr, 31);
        AnonymousClass3Ma.A1S(numArr, 26);
        C17890vO.A1G(numArr, 33);
        AnonymousClass3Ma.A1T(numArr, 29);
        AnonymousClass3Ma.A1U(numArr, 28);
        numArr[6] = 99;
        C17890vO.A1I(numArr, 104);
        numArr[8] = 103;
        numArr[9] = 102;
        numArr[10] = 25;
        numArr[11] = 99;
        A09 = C18070vi.A0O(30, numArr, 12);
    }

    public final void A01(AnonymousClass1GV r9, int i) {
        IllegalStateException A0n;
        C99244sV A002 = C99244sV.A00(r9, 27);
        if (C18020vd.A05(C18040vf.A02, this.A03, 10516)) {
            AnonymousClass4P8 r6 = new AnonymousClass4P8(i, System.currentTimeMillis());
            AnonymousClass1OX r4 = this.A08;
            Object CQ0 = ((C108495bn) this.A06.getValue()).CQ0(C30451dy.A02(AnonymousClass00R.A01, AnonymousClass1OR.A00, new ShareContentUserJourneyLogger$logAction$queueingResult$1(r6, this, (C30391dr) null, A002), r4));
            if (!(!(CQ0 instanceof AnonymousClass4PR))) {
                AnonymousClass190 r2 = this.A01;
                if (CQ0 instanceof AnonymousClass5WK) {
                    A0n = AnonymousClass000.A0n("Channel is closed");
                } else {
                    A0n = AnonymousClass000.A0n("Channel is full");
                }
                r2.A0E("WamShareContentUserJourney/Unable to queue event", (String) null, A0n);
            }
        }
    }

    public C87894Xm(AnonymousClass190 r3, AnonymousClass11P r4, C18030ve r5, AnonymousClass18K r6, C18600wl r7, AnonymousClass1OX r8) {
        C18070vi.A0w(r4, r5, r3, r6, r7);
        C18070vi.A0d(r8, 6);
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
        this.A04 = r6;
        this.A07 = r7;
        this.A08 = r8;
    }
}
