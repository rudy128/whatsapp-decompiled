package X;

/* renamed from: X.CWv  reason: case insensitive filesystem */
public class C25085CWv {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Integer A04;

    public String toString() {
        StringBuilder sb;
        long j;
        int intValue = this.A04.intValue();
        if (intValue == 4) {
            sb = BE6.A0u("target_buffer_size_reached");
            sb.append(". Target:");
            sb.append(this.A02);
            sb.append(". Allocation:");
            j = this.A03;
        } else if (intValue == 2) {
            sb = BE6.A0u("buffer_draining_above_low_watermark");
            sb.append(". Low watermark:");
            j = this.A01;
        } else if (intValue != 3) {
            switch (intValue) {
                case 0:
                    return "unknown";
                case 1:
                    return "paused";
                default:
                    return "target_buffer_size_reached";
            }
        } else {
            sb = BE6.A0u("above_high_watermark");
            sb.append(". High watermark:");
            j = this.A00;
        }
        return C17880vN.A0u(sb, j);
    }

    public C25085CWv(Integer num, long j, long j2, long j3, long j4) {
        this.A04 = num;
        this.A02 = j;
        this.A03 = j2;
        this.A01 = j3;
        this.A00 = j4;
    }
}
