package X;

import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.37K  reason: invalid class name */
public final class AnonymousClass37K implements AnonymousClass1O5 {
    public C192629oi A00 = null;
    public List A01 = null;
    public final AnonymousClass11S A02;
    public final C63922tu A03;
    public final C26761Tj A04;
    public final C26371Rw A05;
    public final AnonymousClass1TZ A06;
    public final AnonymousClass1TS A07;
    public final AnonymousClass1OZ A08;
    public final AnonymousClass10I A09;

    public AnonymousClass37K(AnonymousClass11S r2, C63922tu r3, C26761Tj r4, C26371Rw r5, AnonymousClass1TZ r6, AnonymousClass1TS r7, AnonymousClass1OZ r8, AnonymousClass10I r9) {
        C18070vi.A0w(r2, r9, r8, r5, r6);
        C18070vi.A0l(r7, r4);
        this.A02 = r2;
        this.A09 = r9;
        this.A08 = r8;
        this.A05 = r5;
        this.A06 = r6;
        this.A07 = r7;
        this.A04 = r4;
        this.A03 = r3;
    }

    public static final synchronized C192629oi A00(AnonymousClass37K r2) {
        C192629oi r1;
        synchronized (r2) {
            r1 = r2.A00;
            if (r1 != null) {
                r2.A00 = null;
                r2.A01 = null;
            } else {
                throw C17880vN.A0g();
            }
        }
        return r1;
    }

    public void C7Z(C29621ca r7, String str) {
        AnonymousClass10I r2;
        C70623Bv r1;
        boolean A17 = C18070vi.A17(str, r7);
        C17900vP.A0f("sync-request-handler/onSuccess iqId:", str, AnonymousClass000.A10());
        try {
            this.A09.CGF(new C98804rk(this, new C63812tj(r7), 49));
        } catch (AnonymousClass2E1 e) {
            A00(this);
            r2 = this.A09;
            r1 = new C70623Bv(this, e, 0);
            r2.CGF(r1);
        } catch (C26831Tq e2) {
            A00(this);
            r2 = this.A09;
            r1 = new C70623Bv(this, e2, A17 ? 1 : 0);
            r2.CGF(r1);
        }
    }

    public void BrD(String str) {
        C17900vP.A0e("sync-request-handler/onDeliveryFailure iqId:", str, C18070vi.A0K(str));
        this.A09.CGF(new C98764rg((Object) this, 38));
    }

    public void Bt9(C29621ca r10, String str) {
        C18070vi.A0h(str, r10);
        C17900vP.A0e("sync-request-handler/onError iqId:", str, AnonymousClass000.A10());
        C29621ca A0K = r10.A0K("error");
        if (A0K != null) {
            int A0A = A0K.A0A("code", -1);
            if (A0A != -1) {
                String A022 = C29621ca.A02(A0K, "text");
                Long l = null;
                try {
                    long A0D = A0K.A0D("backoff", -1);
                    if (A0D != -1) {
                        l = Long.valueOf(A0D * 1000);
                    }
                } catch (AnonymousClass1UI e) {
                    Log.e("SyncRequestHandler/getServerProvidedBackoffInMs the provided backoff is not an integral value.", e);
                }
                this.A09.CGF(new C70783Cm(this, l, A022, A0A, 8));
                return;
            }
            throw AnonymousClass1UI.A01(AnonymousClass001.A1E(r10, "Expected attribute code in ", AnonymousClass000.A10()));
        }
        throw AnonymousClass1UI.A01(AnonymousClass001.A1E(r10, "Expected child error in ", AnonymousClass000.A10()));
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
