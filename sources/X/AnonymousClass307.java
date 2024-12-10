package X;

import com.whatsapp.imagineme.cron.ImagineMeGetOnboardedStateWorker;

/* renamed from: X.307  reason: invalid class name */
public final class AnonymousClass307 implements C72113Kr {
    public final AnonymousClass19K A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public void Bqf() {
        int A002;
        AnonymousClass00H r1 = this.A01;
        if (((AnonymousClass1UD) r1.get()).A0C()) {
            AnonymousClass00H r7 = this.A02;
            if (((C38731rn) r7.get()).A01() && (A002 = C18020vd.A00(C18040vf.A01, ((AnonymousClass1UD) r1.get()).A00, 11526)) >= 86400) {
                this.A03.get();
                long A04 = C17880vN.A04(System.currentTimeMillis());
                if (((long) (C17890vO.A00(C17880vN.A0C(((C38731rn) r7.get()).A01), "last_imagine_me_onboarded_sync_time_sec") + A002)) <= A04) {
                    C196269uj r12 = new C196269uj(ImagineMeGetOnboardedStateWorker.class);
                    r12.A07("ImagineMeGetOnboardedStateCron");
                    A1B a1b = new A1B();
                    Integer num = AnonymousClass00R.A01;
                    a1b.A00 = num;
                    r12.A03(a1b.A01());
                    ((A7W) this.A00.get()).A03((C162248Jv) r12.A00(), num, "ImagineMeGetOnboardedStateCron").A02();
                    C17880vN.A1C(C17890vO.A0A(((C38731rn) r7.get()).A01), "last_imagine_me_onboarded_sync_time_sec", (int) A04);
                }
            }
        }
    }

    public AnonymousClass307(AnonymousClass19K r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r3, r1, r4);
        this.A03 = r2;
        this.A01 = r3;
        this.A00 = r1;
        this.A02 = r4;
    }
}
