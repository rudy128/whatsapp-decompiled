package X;

/* renamed from: X.7F0  reason: invalid class name */
public final class AnonymousClass7F0 implements C72113Kr {
    public final C132726nS A00;

    public void Bqf() {
        long j;
        long j2;
        long j3;
        long A04;
        C132726nS r8 = this.A00;
        C18100vl r9 = r8.A03;
        long j4 = C18070vi.A03(r9).getLong("/ntp/last_event_timestamp", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (j4 == 0) {
            synchronized (r8) {
                C17880vN.A1D(C108995ce.A0E(r9), "/ntp/last_event_timestamp", currentTimeMillis);
            }
            return;
        }
        long j5 = currentTimeMillis - j4;
        synchronized (r8) {
            j = (long) C18070vi.A03(r9).getInt("/ntp/started", 0);
            j2 = (long) C18070vi.A03(r9).getInt("/ntp/succeeded", 0);
            j3 = (long) C18070vi.A03(r9).getInt("/ntp/failed", 0);
            A04 = C17890vO.A04(C18070vi.A03(r9), "/ntp/work_manager_init");
            C17880vN.A1D(C108995ce.A0E(r9).remove("/ntp/started").remove("/ntp/succeeded").remove("/ntp/failed"), "/ntp/last_event_timestamp", currentTimeMillis);
        }
        AnonymousClass63C r1 = new AnonymousClass63C();
        r1.A02 = Long.valueOf(j);
        r1.A03 = Long.valueOf(j2);
        r1.A01 = Long.valueOf(j3);
        r1.A00 = Long.valueOf(j5);
        r1.A04 = Long.valueOf(A04);
        r8.A00.CC7(r1);
    }

    public AnonymousClass7F0(C132726nS r1) {
        this.A00 = r1;
    }
}
