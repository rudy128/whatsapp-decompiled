package X;

import com.whatsapp.util.Log;

/* renamed from: X.301  reason: invalid class name */
public final class AnonymousClass301 implements C72113Kr {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public void Bqf() {
        synchronized ("RemoveSelfMappingFromRepositoryOneTimeCleanUpCron/alreadyCleanedUp_v2") {
            AnonymousClass00H r1 = this.A00;
            if (!((C26301Rp) r1.get()).A0O("RemoveSelfMappingFromRepositoryOneTimeCleanUpCron/alreadyCleanedUp_v2")) {
                Log.i("RemoveSelfMappingFromRepositoryOneTimeCleanUpCron/cleanUp");
                if (((C57832ji) this.A01.get()).A00()) {
                    C26301Rp.A04((C26301Rp) r1.get(), "RemoveSelfMappingFromRepositoryOneTimeCleanUpCron/alreadyCleanedUp_v2", String.valueOf(true));
                }
            }
        }
    }

    public AnonymousClass301(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
