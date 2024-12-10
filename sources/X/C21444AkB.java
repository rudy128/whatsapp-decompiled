package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.contact.sync.FetchTask$run$1;
import com.whatsapp.infra.graphql.generated.usync.ContactIntegrityQueryResponseImpl;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.AkB  reason: case insensitive filesystem */
public final class C21444AkB implements Runnable {
    public final C26811To A00;
    public final AnonymousClass12E A01;
    public final C26931Ua A02;
    public final AnonymousClass11P A03;
    public final C19830z4 A04;
    public final AnonymousClass1PY A05;
    public final AtomicInteger A06;
    public final C34331kJ A07;
    public final AnonymousClass1UN A08;
    public final UserJid A09;
    public final AnonymousClass1OX A0A;

    public static final void A00(C21444AkB akB, AtomicInteger atomicInteger) {
        long j;
        AtomicInteger atomicInteger2 = atomicInteger;
        if (atomicInteger.get() != 10) {
            C19830z4 r8 = akB.A04;
            int i = 2;
            if (r8.A0D() == 2) {
                int i2 = atomicInteger.get();
                long j2 = 1;
                if (2 <= i2) {
                    long j3 = 0;
                    while (true) {
                        j = j3 + j2;
                        if (i == i2) {
                            break;
                        }
                        i++;
                        long j4 = j2;
                        j2 = j;
                        j3 = j4;
                    }
                    j2 = j;
                }
                long convert = TimeUnit.MILLISECONDS.convert(j2, TimeUnit.SECONDS);
                C34331kJ r4 = akB.A07;
                AnonymousClass1OX r13 = akB.A0A;
                AnonymousClass1PY r10 = akB.A05;
                AnonymousClass12E r5 = akB.A01;
                r4.A05(new C21444AkB(akB.A00, r4, r5, akB.A02, akB.A03, r8, akB.A08, r10, akB.A09, atomicInteger2, r13), convert);
                return;
            }
        }
        atomicInteger.set(0);
        akB.A04.A0D();
    }

    public void run() {
        if (this.A04.A0D() != 1) {
            AtomicInteger atomicInteger = this.A06;
            if (atomicInteger.incrementAndGet() > 10) {
                atomicInteger.set(0);
                return;
            }
            ArrayList A13 = AnonymousClass000.A13();
            GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
            graphQlCallInput.A05("jid", AnonymousClass8BW.A0d(this.A09));
            A13.add(graphQlCallInput);
            GraphQlCallInput graphQlCallInput2 = new GraphQlCallInput();
            graphQlCallInput2.A06("query_input", A13);
            C162478Kx.A02(GraphQlCallInput.A02, graphQlCallInput2, "BACKGROUND");
            AIj A002 = AIj.A00(A7K.A01(graphQlCallInput2), ContactIntegrityQueryResponseImpl.class, "ContactIntegrityQuery");
            AnonymousClass3MX.A1Q(new FetchTask$run$1(A002, this, (C30391dr) null), this.A0A);
        }
    }

    public C21444AkB(C26811To r1, C34331kJ r2, AnonymousClass12E r3, C26931Ua r4, AnonymousClass11P r5, C19830z4 r6, AnonymousClass1UN r7, AnonymousClass1PY r8, UserJid userJid, AtomicInteger atomicInteger, AnonymousClass1OX r11) {
        this.A0A = r11;
        this.A04 = r6;
        this.A05 = r8;
        this.A07 = r2;
        this.A01 = r3;
        this.A00 = r1;
        this.A03 = r5;
        this.A08 = r7;
        this.A02 = r4;
        this.A09 = userJid;
        this.A06 = atomicInteger;
    }
}
