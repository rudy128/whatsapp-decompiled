package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;

public final class AQd implements AnonymousClass1L0 {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqh() {
    }

    public void Bqi() {
        AnonymousClass190 r2;
        String A002;
        String str;
        ((C20113A7w) this.A02.get()).A08();
        AnonymousClass00H r4 = this.A00;
        C196169uZ r3 = (C196169uZ) r4.get();
        PhoneUserJid A003 = AnonymousClass11S.A00(r3.A00);
        synchronized (r3) {
            C196129uV r1 = r3.A01;
            C187719gG A012 = r1.A01();
            if (!(A012 == null || A003 == null || r3.A04(A003, A012))) {
                r1.A04();
                Log.i("ExportEncryptionManager/onCheckPrefetchedKeyConsistency(); cleared prefetched key, a different user is now logged in or key is old");
            }
        }
        ((C196169uZ) r4.get()).A01();
        AnonymousClass00H r12 = this.A01;
        ((A7R) r12.get()).A06();
        A7R a7r = (A7R) r12.get();
        C20006A2w a2w = a7r.A08;
        boolean z = false;
        if (a2w.A05()) {
            AnonymousClass00H r9 = a2w.A02.A01;
            if (C17880vN.A0B(r9).getLong("/export/provider/timestamp", 0) != 0 && Math.abs(System.currentTimeMillis() - C17880vN.A0B(r9).getLong("/export/provider/timestamp", 0)) > C20006A2w.A07) {
                z = true;
            }
        }
        if (z) {
            a2w.A01();
            r2 = a7r.A02;
            A002 = a2w.A01();
            str = "xpm-export-provider-expired";
        } else if (!a2w.A05()) {
            AnonymousClass00H r92 = a2w.A02.A01;
            if (C17880vN.A0B(r92).getLong("/export/provider_closed/timestamp", 0) != 0 && Math.abs(System.currentTimeMillis() - C17880vN.A0B(r92).getLong("/export/provider_closed/timestamp", 0)) > C20006A2w.A06) {
                a2w.A00();
                r2 = a7r.A02;
                A002 = a2w.A00();
                str = "xpm-export-metadata-expired";
            } else {
                return;
            }
        } else {
            return;
        }
        r2.A0G(str, A002, false);
        a7r.A05();
    }

    public AQd(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }
}
