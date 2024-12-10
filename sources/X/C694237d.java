package X;

/* renamed from: X.37d  reason: invalid class name and case insensitive filesystem */
public class C694237d implements AnonymousClass8AF {
    public final C31131f4 A00;
    public final C19830z4 A01;

    public int BXk(long j) {
        return C17890vO.A0B(this.A01).getInt(C17890vO.A0a("ptt_saved_playback_position_", AnonymousClass000.A10(), j), -1);
    }

    public void CEy(long j) {
        C17880vN.A1B(C19830z4.A00(this.A01), C17890vO.A0a("ptt_saved_playback_position_", AnonymousClass000.A10(), j));
    }

    public void CIb() {
        C441822l r0;
        C145777Mo A002 = this.A00.A00();
        if (A002 != null && (r0 = A002.A0K) != null) {
            long j = r0.A0x;
            C17880vN.A1C(C19830z4.A00(this.A01), C17890vO.A0a("ptt_saved_playback_position_", AnonymousClass000.A10(), j), A002.A09());
        }
    }

    public void CKH(long j, int i) {
        C17880vN.A1C(C19830z4.A00(this.A01), C17890vO.A0a("ptt_saved_playback_position_", AnonymousClass000.A10(), j), i);
    }

    public C694237d(C31131f4 r1, C19830z4 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
