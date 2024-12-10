package X;

/* renamed from: X.2rW  reason: invalid class name and case insensitive filesystem */
public class C62512rW {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C62512rW)) {
                return false;
            }
            C62512rW r7 = (C62512rW) obj;
            if (!(this.A01 == r7.A01 && this.A05 == r7.A05 && this.A02 == r7.A02 && this.A04 == r7.A04 && this.A03 == r7.A03 && this.A00 == r7.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        AnonymousClass000.A1L(objArr, this.A01);
        C17890vO.A1M(objArr, this.A05);
        C17890vO.A1N(objArr, this.A02);
        C17890vO.A1O(objArr, this.A04);
        C17890vO.A1P(objArr, this.A03);
        return AnonymousClass000.A0P(Integer.valueOf(this.A00), objArr, 5);
    }

    public C62512rW(int i, int i2, long j, long j2, long j3, long j4) {
        this.A01 = i;
        this.A05 = j;
        this.A02 = j2;
        this.A04 = j3;
        this.A03 = j4;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserDeviceInfo{rawId=");
        A10.append(this.A01);
        A10.append(", timestampInSec=");
        A10.append(this.A05);
        A10.append(", expectedTimestampInSec=");
        A10.append(this.A02);
        A10.append(", expectedTimestampLastDeviceJobTsInMilliSec=");
        A10.append(this.A04);
        A10.append(", expectedTimestampUpdateTsInMilliSec=");
        A10.append(this.A03);
        A10.append(", accountEncryptionType=");
        A10.append(this.A00);
        return C17890vO.A0b(A10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62512rW(X.AnonymousClass2RD r12, int r13, long r14, long r16, long r18, long r20) {
        /*
            r11 = this;
            r2 = 0
            int r1 = r12.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x001d
            if (r1 == r2) goto L_0x0010
            java.lang.String r0 = "unsupported ADVEncryptionType"
            X.C17960vV.A0F(r2, r0)
        L_0x0010:
            r0 = r11
            r1 = r13
            r3 = r14
            r5 = r16
            r7 = r18
            r9 = r20
            r0.<init>((int) r1, (int) r2, (long) r3, (long) r5, (long) r7, (long) r9)
            return
        L_0x001d:
            r2 = 1
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62512rW.<init>(X.2RD, int, long, long, long, long):void");
    }
}
