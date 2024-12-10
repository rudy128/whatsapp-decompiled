package X;

/* renamed from: X.39m  reason: invalid class name and case insensitive filesystem */
public final class C700339m implements AnonymousClass3LK {
    public final AnonymousClass00H A00;

    public C700339m(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void CCb(AnonymousClass206 r8, C49702Rn r9, int i) {
        C18070vi.A0d(r8, 0);
        if (i == 6) {
            C32581hQ.A00(r8);
            C28791au A05 = ((C32581hQ) this.A00.get()).A00.A05();
            try {
                C23141Ev r5 = ((C28801av) A05).A02;
                String[] A1Y = C17880vN.A1Y();
                C17890vO.A1J(A1Y, r8.A0x);
                r5.A04("message_future", "message_row_id = ?", "DELETE_MESSAGE_FUTURE_SQL", A1Y);
                A05.close();
                if (r9 != null) {
                    throw C17900vP.A07(C700339m.class);
                }
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        }
    }
}
