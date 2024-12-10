package X;

/* renamed from: X.2mV  reason: invalid class name and case insensitive filesystem */
public final class C59562mV {
    public final long A00;
    public final long A01;
    public final long A02;
    public final String A03;

    public C59562mV(String str, long j, long j2, long j3) {
        C18070vi.A0d(str, 1);
        this.A03 = str;
        this.A02 = j;
        this.A00 = j2;
        this.A01 = j3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59562mV) {
                C59562mV r8 = (C59562mV) obj;
                if (!(C18070vi.A18(this.A03, r8.A03) && this.A02 == r8.A02 && this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A01, AnonymousClass001.A0K(this.A00, AnonymousClass001.A0K(this.A02, C17880vN.A03(this.A03))));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("JobStatsSnapshot(jobName=");
        A10.append(this.A03);
        A10.append(", totalJobsAddedToQueueSinceLastWindow=");
        A10.append(this.A02);
        A10.append(", maxRetryCount=");
        A10.append(this.A00);
        A10.append(", maxRunningTime=");
        return C17900vP.A0E(A10, this.A01);
    }
}
