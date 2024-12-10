package X;

/* renamed from: X.7OA  reason: invalid class name */
public class AnonymousClass7OA implements AnonymousClass88W {
    public final int A00;
    public final Object A01;

    public AnonymousClass7OA(AnonymousClass74M r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final void BE1() {
        switch (this.A00) {
            case 0:
                AnonymousClass74M.A07((AnonymousClass74M) this.A01);
                return;
            case 1:
                ((AnonymousClass74M) this.A01).A0Z(true, false);
                return;
            case 2:
                AnonymousClass11P.A01(((AnonymousClass74M) this.A01).A0n);
                return;
            case 3:
                AnonymousClass74M r4 = (AnonymousClass74M) this.A01;
                AnonymousClass72K r0 = r4.A0J;
                if (r0 == null || AnonymousClass72K.A00(r0).isRecording()) {
                    int i = r4.A03 + 1;
                    r4.A03 = i;
                    if (r4.A1O && i == 6) {
                        r4.A15.A0H.setVisibility(4);
                        if (C18020vd.A05(C18040vf.A02, r4.A0q, 1140)) {
                            C19830z4 r2 = r4.A0o;
                            if (!C17880vN.A1W(C17890vO.A0B(r2), "ptt_draft_preview_error_count_reached")) {
                                C17880vN.A1F(C19830z4.A00(r2), "ptt_draft_preview_error_count_reached", true);
                                r4.A0d.A0G("voice_visualization_error_count_reached_critical_event_name", (String) null, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ((AnonymousClass74M) this.A01).A02++;
                return;
        }
    }
}
