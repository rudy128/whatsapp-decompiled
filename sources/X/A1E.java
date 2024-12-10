package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.infra.graphql.generated.bizintegrity.BizIntegrityQueryResponseImpl;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public final class A1E {
    public final AnonymousClass2ZY A00;
    public final AnonymousClass9CA A01;
    public final C184019aH A02;
    public final C185679cy A03;
    public final C24671Lf A04;
    public final AnonymousClass11A A05;
    public final ConcurrentHashMap A06 = AnonymousClass8BR.A17();

    public A1E(AnonymousClass2ZY r2, AnonymousClass9CA r3, C184019aH r4, C185679cy r5, C24671Lf r6, AnonymousClass11A r7) {
        C72473Md.A1M(r3, r6, r7, 2);
        C18070vi.A0d(r4, 6);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A02 = r4;
    }

    public final void A01(UserJid userJid) {
        C195609tc A0I;
        synchronized (this) {
            ConcurrentHashMap concurrentHashMap = this.A06;
            if (!concurrentHashMap.containsKey(userJid) && (A0I = this.A01.A0I(userJid)) != null) {
                concurrentHashMap.put(userJid, A0I);
                this.A05.A00(new C21451AkI(this, userJid, 1));
            }
        }
    }

    public final void A02(UserJid userJid) {
        AnonymousClass1E7 A0E;
        long j;
        C184019aH r3 = this.A02;
        if (C18020vd.A05(C18040vf.A02, r3.A01, 11064) && (A0E = r3.A00.A0E(userJid)) != null && A0E.A0G()) {
            C185679cy r4 = this.A03;
            C1769996t r32 = r4.A00;
            C193589qL r0 = (C193589qL) r32.A02(userJid);
            if (r0 != null) {
                j = r0.A00;
            } else {
                j = 0;
            }
            long millis = TimeUnit.SECONDS.toMillis(AnonymousClass8BR.A05(r4.A02, 11065));
            AnonymousClass11P r42 = r4.A01;
            if (AnonymousClass11P.A01(r42) - j >= millis) {
                C172728tv r2 = new C172728tv(this, userJid);
                AnonymousClass2ZY r5 = this.A00;
                A7K A002 = A7K.A00();
                GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
                GraphQlCallInput graphQlCallInput2 = new GraphQlCallInput();
                graphQlCallInput2.A05("jid", userJid.getRawString());
                graphQlCallInput.A06("query_input", C18070vi.A0M(graphQlCallInput2));
                C162478Kx.A02(GraphQlCallInput.A02, graphQlCallInput, "INTERACTIVE");
                A002.A04(graphQlCallInput, "input");
                r5.A00.A01(AIj.A00(A002, BizIntegrityQueryResponseImpl.class, "BizIntegrityQuery")).A03(r2);
                r32.A07(new C193589qL(userJid, AnonymousClass11P.A01(r42)));
            }
        }
    }

    public static final boolean A00(A1E a1e, AnonymousClass1E7 r2) {
        C195609tc r0;
        Jid A012 = AnonymousClass1E7.A01(r2);
        if (A012 == null) {
            return true;
        }
        ConcurrentHashMap concurrentHashMap = a1e.A06;
        if (!concurrentHashMap.containsKey(A012) || (r0 = (C195609tc) concurrentHashMap.get(A012)) == null) {
            return true;
        }
        return "SUSPICIOUS".equals(r0.A08);
    }
}
