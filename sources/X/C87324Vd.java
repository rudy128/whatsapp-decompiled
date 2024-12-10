package X;

import androidx.lifecycle.CoroutineLiveData;
import androidx.lifecycle.FlowLiveDataConversions$asFlow$1;
import androidx.lifecycle.FlowLiveDataConversions$asLiveData$1;

/* renamed from: X.4Vd  reason: invalid class name and case insensitive filesystem */
public abstract class C87324Vd {
    /* JADX WARNING: type inference failed for: r3v0, types: [X.1Dg, androidx.lifecycle.CoroutineLiveData, X.1DS] */
    public static final CoroutineLiveData A00(C18560wh r5, C23421Fz r6) {
        C18070vi.A0d(r6, 0);
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1((C30391dr) null, r6);
        ? r3 = new C22801Dg();
        AnonymousClass1OE r1 = new AnonymousClass1OE((AnonymousClass1OB) r5.get(AnonymousClass1OB.A00));
        C18600wl r0 = C23871Hy.A00;
        r3.A00 = new C85614Ob(r3, new C101015Ar(r3), flowLiveDataConversions$asLiveData$1, AnonymousClass1OW.A02(AnonymousClass1OQ.A03(((AnonymousClass1IT) AnonymousClass1IN.A00).A01, r5).plus(r1)));
        if (r6 instanceof AnonymousClass1G1) {
            boolean A03 = C001600u.A00().A03();
            Object value = ((AnonymousClass1G1) r6).getValue();
            if (A03) {
                r3.A0F(value);
            } else {
                r3.A0E(value);
                return r3;
            }
        }
        return r3;
    }

    public static final C23421Fz A01(AnonymousClass1DS r5) {
        C18070vi.A0d(r5, 0);
        AnonymousClass5WL A00 = AnonymousClass4I4.A00(new FlowLiveDataConversions$asFlow$1(r5, (C30391dr) null));
        C25691Pg r2 = C25691Pg.DROP_OLDEST;
        boolean z = A00 instanceof AnonymousClass1G5;
        AnonymousClass1OR r1 = AnonymousClass1OR.A00;
        if (z) {
            return A00.BLm(r1, r2, 0);
        }
        return new AnonymousClass5WR(r1, r2, A00, 0);
    }
}
