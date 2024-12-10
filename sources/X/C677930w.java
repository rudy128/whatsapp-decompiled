package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Collections;

/* renamed from: X.30w  reason: invalid class name and case insensitive filesystem */
public final class C677930w implements C26701Td {
    public final AnonymousClass11S A00;
    public final AnonymousClass1TK A01;
    public final C41911xI A02;
    public final AnonymousClass00H A03;

    public /* synthetic */ void BqZ(C59312m6 r1, boolean z) {
    }

    public /* synthetic */ void BrL(C59312m6 r1) {
    }

    public void BrO(C59312m6 r4) {
        C18070vi.A0d(r4, 0);
        C17880vN.A1F(C17890vO.A0A(this.A01.A02), "has_suppressed_banner", false);
        this.A02.A01();
    }

    public /* synthetic */ void BrP(C199410f r1, String str, int i) {
    }

    public /* synthetic */ void BrS(C59312m6 r1) {
    }

    public void BrT(C199410f r14) {
        C116365x9 r1;
        C18070vi.A0d(r14, 0);
        if (!this.A00.A0N()) {
            AnonymousClass1IZ it = r14.iterator();
            while (it.hasNext()) {
                DeviceJid A0R = C17880vN.A0R(it);
                C41911xI r12 = this.A02;
                C18070vi.A0b(A0R);
                C26811To r3 = r12.A01;
                if (r3.A0T() && (r1 = (C116365x9) ((C58862lN) r12.A02.get()).A00("device_capabilities")) != null) {
                    C18070vi.A0d(A0R, 0);
                    AnonymousClass1CQ r10 = AnonymousClass1CQ.A00;
                    C18070vi.A0z(r10, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                    r3.A0N(Collections.singletonList(new C116945yt(C62382rJ.A02, (C19999A2n) null, A0R, (String) null, r10, AnonymousClass11P.A01(r1.A00))));
                    r3.A0I();
                }
                ((C131536lG) this.A03.get()).A00(A0R);
            }
        }
    }

    public /* synthetic */ void BrU() {
    }

    public C677930w(AnonymousClass11S r1, AnonymousClass1TK r2, C41911xI r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r3, r4, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }
}
