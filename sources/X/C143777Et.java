package X;

import android.content.SharedPreferences;

/* renamed from: X.7Et  reason: invalid class name and case insensitive filesystem */
public final class C143777Et implements AnonymousClass1L0 {
    public final AnonymousClass18K A00;
    public final AnonymousClass00H A01;

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqi() {
    }

    public void Bqh() {
        C1184063i r11 = new C1184063i();
        AnonymousClass00H r1 = this.A01;
        r11.A00 = C108965cb.A0l(A00(r1), "ptv_pause_automatic_count", 0);
        r11.A01 = C108965cb.A0l(A00(r1), "ptv_pause_count", 0);
        r11.A02 = C108965cb.A0l(A00(r1), "ptv_react_count", 0);
        r11.A03 = C108965cb.A0l(A00(r1), "ptv_receive_count", 0);
        r11.A04 = C108965cb.A0l(A00(r1), "ptv_reply_count", 0);
        r11.A05 = C108965cb.A0l(A00(r1), "ptv_resume_count", 0);
        r11.A06 = C108965cb.A0l(A00(r1), "ptv_unmute_count", 0);
        this.A00.CC4(r11);
        C144977Jk r12 = (C144977Jk) r1.get();
        C17880vN.A1B(C144977Jk.A00(r12), "ptv_pause_automatic_count");
        C17880vN.A1B(C144977Jk.A00(r12), "ptv_pause_count");
        C17880vN.A1B(C144977Jk.A00(r12), "ptv_react_count");
        C17880vN.A1B(C144977Jk.A00(r12), "ptv_receive_count");
        C17880vN.A1B(C144977Jk.A00(r12), "ptv_reply_count");
        C17880vN.A1B(C144977Jk.A00(r12), "ptv_resume_count");
        C17880vN.A1B(C144977Jk.A00(r12), "ptv_unmute_count");
    }

    public C143777Et(AnonymousClass18K r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public static SharedPreferences A00(AnonymousClass00H r0) {
        return (SharedPreferences) ((C144977Jk) r0.get()).A01.getValue();
    }
}
