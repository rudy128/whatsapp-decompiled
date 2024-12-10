package X;

import com.whatsapp.voipcalling.CallInfo;

/* renamed from: X.4Yd  reason: invalid class name and case insensitive filesystem */
public final class C88054Yd {
    public final C18100vl A00;
    public final C18100vl A01;
    public final C18100vl A02;
    public final C18100vl A03;
    public final C18100vl A04 = AnonymousClass1DF.A01(new AnonymousClass5EH(this));
    public final C18100vl A05;
    public final C18100vl A06;

    public final synchronized void A02(long j) {
        C18100vl r2 = this.A02;
        CallInfo callInfo = (CallInfo) AnonymousClass3MW.A17(r2).getValue();
        if (callInfo != null) {
            callInfo.callDuration = j;
            AnonymousClass3MW.A17(r2).setValue(callInfo);
        }
    }

    public final void A03(CallInfo callInfo, C179419Hw r5) {
        C18070vi.A0d(r5, 1);
        synchronized (this) {
            AnonymousClass3MW.A17(this.A02).setValue(callInfo);
        }
        int ordinal = r5.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            AnonymousClass3MW.A17(this.A03).setValue(callInfo);
        }
    }

    public final CallInfo A01() {
        return (CallInfo) AnonymousClass3MW.A17(this.A02).getValue();
    }

    public C88054Yd() {
        AnonymousClass4U2 r1 = new AnonymousClass4U2(0, false, false);
        Integer num = AnonymousClass00R.A01;
        this.A00 = AnonymousClass1DF.A00(num, new AnonymousClass5HU(r1));
        this.A01 = AnonymousClass1DF.A00(num, new AnonymousClass5PV(C25691Pg.SUSPEND));
        this.A05 = AnonymousClass1DF.A01(new AnonymousClass5EI(this));
        this.A02 = AnonymousClass1DF.A00(num, new AnonymousClass5HU((Object) null));
        this.A03 = AnonymousClass1DF.A00(num, new AnonymousClass5HU((Object) null));
        this.A06 = AnonymousClass1DF.A01(new AnonymousClass5EJ(this));
    }

    public static AnonymousClass4U2 A00(AnonymousClass00H r0) {
        return (AnonymousClass4U2) ((AnonymousClass1G1) ((C88054Yd) r0.get()).A04.getValue()).getValue();
    }
}
