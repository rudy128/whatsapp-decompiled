package X;

import com.whatsapp.events.EventInfoViewModel$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.3Va  reason: invalid class name and case insensitive filesystem */
public final class C73353Va extends AnonymousClass1J2 implements AnonymousClass1WS {
    public final AnonymousClass11S A00;
    public final AnonymousClass118 A01;
    public final C84854Lc A02;
    public final C84854Lc A03;
    public final AnonymousClass1CJ A04;
    public final AnonymousClass1MZ A05;
    public final AnonymousClass1WX A06;
    public final C24751Ln A07;
    public final C88124Yk A08;
    public final C82984Cx A09;
    public final AnonymousClass205 A0A;
    public final AnonymousClass1W6 A0B;
    public final C30361do A0C;
    public final C18600wl A0D;
    public final AnonymousClass1G4 A0E;
    public final AnonymousClass1G1 A0F;
    public final C94174kA A0G;
    public final C24671Lf A0H;
    public final C24681Lg A0I;

    public static void A03(C73353Va r3, AnonymousClass206 r4) {
        AnonymousClass205 r0;
        C18070vi.A0d(r4, 0);
        if (r4 instanceof C445823z) {
            String str = r4.A0v.A01;
            C445823z r02 = ((AnonymousClass4YZ) r3.A0F.getValue()).A00;
            if (r02 == null || (r0 = r02.A0v) == null) {
                r0 = r3.A0A;
            }
            if (C18070vi.A18(str, r0.A01)) {
                r3.A08.A00((C445823z) r4, "EventInfoViewModel", new C100955Aj(r3, 1));
            }
        }
    }

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
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

    public /* synthetic */ void Bya(Collection collection, Map map) {
    }

    public /* synthetic */ void Byb(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byc(AnonymousClass1BI r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Byd(Collection collection) {
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

    public C73353Va(AnonymousClass11S r12, C24671Lf r13, AnonymousClass118 r14, AnonymousClass1CJ r15, AnonymousClass1MZ r16, C24681Lg r17, AnonymousClass1WX r18, C24751Ln r19, C88124Yk r20, C82984Cx r21, AnonymousClass205 r22, AnonymousClass1W6 r23, C30361do r24, C18600wl r25) {
        AnonymousClass1WX r6 = r18;
        C88124Yk r2 = r20;
        C18070vi.A0w(r12, r14, r15, r2, r6);
        C24751Ln r5 = r19;
        AnonymousClass1W6 r1 = r23;
        C18600wl r3 = r25;
        C24681Lg r4 = r17;
        C18070vi.A0x(r1, r5, r4, r13, r3);
        C30361do r0 = r24;
        AnonymousClass1MZ r7 = r16;
        C72473Md.A1L(r7, r0);
        this.A00 = r12;
        this.A01 = r14;
        this.A04 = r15;
        this.A08 = r2;
        this.A06 = r6;
        this.A0B = r1;
        this.A07 = r5;
        this.A0I = r4;
        this.A0H = r13;
        this.A0D = r3;
        this.A05 = r7;
        this.A0C = r0;
        this.A0A = r22;
        this.A09 = r21;
        AnonymousClass1G7 A18 = AnonymousClass3MW.A18(new AnonymousClass4YZ((C445823z) null, C82954Cu.MAIN, AnonymousClass000.A13(), AnonymousClass000.A13(), true));
        this.A0E = A18;
        this.A0F = A18;
        Integer num = AnonymousClass00R.A00;
        C84854Lc r02 = new C84854Lc(new C27178DXn(0));
        this.A02 = r02;
        this.A03 = r02;
        C94174kA r26 = new C94174kA(this, 7);
        this.A0G = r26;
        C30451dy.A02(num, r3, new EventInfoViewModel$1(this, (C30391dr) null), C41561wd.A00(this));
        r4.registerObserver(this);
        r13.registerObserver(r26);
    }

    public static ArrayList A00(C445823z r3, C73353Va r4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C80873yE(r3, r4.A09));
        arrayList.add(new C80863yD(r3));
        return arrayList;
    }

    public void A0S() {
        this.A0I.unregisterObserver(this);
        this.A0H.unregisterObserver(this.A0G);
    }

    public final void A0T() {
        Object value;
        AnonymousClass4YZ r0;
        AnonymousClass1G4 r2 = this.A0E;
        do {
            value = r2.getValue();
            r0 = (AnonymousClass4YZ) value;
        } while (!r2.BFK(value, new AnonymousClass4YZ(r0.A00, C82954Cu.BACK_TO_MAIN, r0.A03, r0.A02, r0.A04)));
    }

    public final void A0U(boolean z) {
        Object value;
        AnonymousClass4YZ r0;
        AnonymousClass1G4 r2 = this.A0E;
        do {
            value = r2.getValue();
            r0 = (AnonymousClass4YZ) value;
        } while (!r2.BFK(value, new AnonymousClass4YZ(r0.A00, C82954Cu.EDIT, r0.A03, r0.A02, z)));
    }

    public void ByQ(AnonymousClass206 r10, AnonymousClass206 r11) {
        AnonymousClass205 r0;
        Object value;
        AnonymousClass4YZ r02;
        C445823z r4;
        ArrayList A002;
        C18070vi.A0h(r10, r11);
        if ((r10 instanceof C445823z) && (r11 instanceof C445823z)) {
            String str = r10.A0v.A01;
            C445823z r03 = ((AnonymousClass4YZ) this.A0F.getValue()).A00;
            if (r03 == null || (r0 = r03.A0v) == null) {
                r0 = this.A0A;
            }
            if (C18070vi.A18(str, r0.A01)) {
                AnonymousClass1G4 r2 = this.A0E;
                do {
                    value = r2.getValue();
                    r02 = (AnonymousClass4YZ) value;
                    r4 = (C445823z) r11;
                    A002 = A00(r4, this);
                } while (!r2.BFK(value, new AnonymousClass4YZ(r4, r02.A01, r02.A03, A002, r02.A04)));
            }
        }
    }

    public void ByH(AnonymousClass206 r1, int i) {
        A03(this, r1);
    }

    public void ByK(AnonymousClass206 r1, int i) {
        A03(this, r1);
    }
}
