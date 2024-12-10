package X;

import com.whatsapp.infra.graphql.generated.autoconf.GetAutoConfConfidenceChallengeResponseImpl;
import com.whatsapp.util.Log;

/* renamed from: X.AQk  reason: case insensitive filesystem */
public final class C20574AQk implements C72113Kr {
    public final AnonymousClass11P A00;
    public final C19830z4 A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass1CM A03;

    public void Bqf() {
        StringBuilder A10;
        String str;
        AnonymousClass00H r7 = this.A01.A00;
        if (AnonymousClass8BT.A01(C17880vN.A0B(r7), "autoconf_cf_type") != 1) {
            A10 = AnonymousClass000.A10();
            A10.append("AutoConfConfidencePingMidnightDailyCron");
            str = "/onDailyCronNoMessageStore/confidence framework not enabled, skip ping";
        } else if (!this.A03.A04()) {
            A10 = AnonymousClass000.A10();
            A10.append("AutoConfConfidencePingMidnightDailyCron");
            str = "/onDailyCronNoMessageStore/registration not verified, skip ping";
        } else {
            boolean z = C17880vN.A0B(r7).getBoolean("resend_confidence_ping", true);
            A10 = AnonymousClass000.A10();
            if (!z) {
                A10.append("AutoConfConfidencePingMidnightDailyCron");
                str = "/onDailyCronNoMessageStore/ping not allowed due to previous failure, skip ping";
            } else {
                A10.append("AutoConfConfidencePingMidnightDailyCron");
                C17890vO.A1A(A10, "/onDailyCronNoMessageStore/start auth challenge request");
                long A04 = C17890vO.A04(C17880vN.A0B(r7), "autoconf_cf_last_ping");
                if (A04 > 0) {
                    if ((A04 + 259200000) - AnonymousClass11P.A01(this.A00) >= 0) {
                        return;
                    }
                }
                AnonymousClass8BW.A12(C17880vN.A0B(r7), "autoconf_cf_last_ping", AnonymousClass11P.A01(this.A00));
                C186259du r2 = (C186259du) this.A02.get();
                Log.i("AutoConfConfidencePingManager/requestChallenge");
                C20674AUg aUg = new C20674AUg((AnonymousClass1PY) C18070vi.A0E(r2.A02));
                byte[] A05 = r2.A01.A05((String) null);
                if (A05 == null) {
                    Log.e("AutoConfConfidencePingManager/requestChallenge/failed to query clientStartMessage from FEO2 client");
                    return;
                }
                Log.i("AutoConfConfidencePingManager/requestChallenge/successfully queried clientStartMessage, request confidence challenge");
                String A14 = C108955ca.A14(A05);
                C72453Mb.A1R(A14);
                aUg.A00 = r2;
                A7K A002 = A7K.A00();
                A002.A07("clientStartMessage", A14);
                aUg.A01.A00(AIj.A00(A002, GetAutoConfConfidenceChallengeResponseImpl.class, "GetAutoConfConfidenceChallenge"), aUg).A00();
                return;
            }
        }
        C17890vO.A1A(A10, str);
    }

    public C20574AQk(AnonymousClass11P r1, C19830z4 r2, AnonymousClass1CM r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r3;
        this.A02 = r4;
    }
}
