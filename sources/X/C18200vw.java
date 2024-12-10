package X;

/* renamed from: X.0vw  reason: invalid class name and case insensitive filesystem */
public final class C18200vw extends C18190vv {
    public final long A00;
    public final long A01;
    public final long A02;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C18190vv)) {
                return false;
            }
            C18200vw r7 = (C18200vw) ((C18190vv) obj);
            if (!(this.A01 == r7.A01 && this.A00 == r7.A00 && this.A02 == r7.A02)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StartupTime{epochMillis=");
        sb.append(this.A01);
        sb.append(", elapsedRealtime=");
        sb.append(this.A00);
        sb.append(", uptimeMillis=");
        sb.append(this.A02);
        sb.append("}");
        return sb.toString();
    }

    public C18200vw(long j, long j2, long j3) {
        this.A01 = j;
        this.A00 = j2;
        this.A02 = j3;
    }

    public int hashCode() {
        long j = this.A01;
        long j2 = this.A00;
        long j3 = this.A02;
        return ((((1000003 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }
}
