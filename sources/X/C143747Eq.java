package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.7Eq  reason: invalid class name and case insensitive filesystem */
public final class C143747Eq implements AnonymousClass1L0 {
    public final AnonymousClass1UD A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqi() {
    }

    public void Bqh() {
        AnonymousClass1UD r1 = this.A00;
        if (r1.A01()) {
            if (C18020vd.A05(C18040vf.A01, r1.A00, 10351)) {
                C127236e1 r12 = (C127236e1) this.A02.get();
                long A012 = AnonymousClass11P.A01(r12.A00);
                C19830z4 r3 = r12.A01;
                if (A012 - C17890vO.A05(C17890vO.A0B(r3), "pref_last_updated_imagine_edit_suggestions_ts") > TimeUnit.DAYS.toMillis(1)) {
                    C17880vN.A1B(C19830z4.A00(r3), "pref_imagine_edit_suggestions");
                }
            }
        }
    }

    public C143747Eq(AnonymousClass1UD r1, C18030ve r2, AnonymousClass00H r3) {
        C18070vi.A0o(r3, r2, r1);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
