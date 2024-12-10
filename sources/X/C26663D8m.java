package X;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* renamed from: X.D8m  reason: case insensitive filesystem */
public final class C26663D8m implements C28627EBa {
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public long A02;
    public long A03;
    public C25797Cm9 A04;
    public C25797Cm9 A05;
    public Cv1 A06;
    public boolean A07;
    public C25797Cm9 A08;
    public C25797Cm9 A09;
    public ByteBuffer A0A;
    public ByteBuffer A0B;
    public ShortBuffer A0C;
    public boolean A0D;

    public C25797Cm9 BFW(C25797Cm9 cm9) {
        if (cm9.A02 == 2) {
            int i = cm9.A03;
            this.A08 = cm9;
            C25797Cm9 cm92 = new C25797Cm9(i, cm9.A01, 2);
            this.A09 = cm92;
            this.A07 = true;
            return cm92;
        }
        throw new C1I(cm9);
    }

    public ByteBuffer BVr() {
        int i;
        Cv1 cv1 = this.A06;
        if (cv1 != null && (i = cv1.A05 * cv1.A0G * 2) > 0) {
            if (this.A0A.capacity() < i) {
                ByteBuffer A0u = BEA.A0u(i);
                this.A0A = A0u;
                this.A0C = A0u.asShortBuffer();
            } else {
                this.A0A.clear();
                this.A0C.clear();
            }
            ShortBuffer shortBuffer = this.A0C;
            int remaining = shortBuffer.remaining();
            int i2 = cv1.A0G;
            int min = Math.min(remaining / i2, cv1.A05);
            shortBuffer.put(cv1.A0B, 0, i2 * min);
            int i3 = cv1.A05 - min;
            cv1.A05 = i3;
            short[] sArr = cv1.A0B;
            System.arraycopy(sArr, min * i2, sArr, 0, i3 * i2);
            this.A03 += (long) i;
            this.A0A.limit(i);
            this.A0B = this.A0A;
        }
        ByteBuffer byteBuffer = this.A0B;
        this.A0B = C28627EBa.A00;
        return byteBuffer;
    }

    public boolean Be2() {
        int i = this.A09.A03;
        if (i == -1) {
            return false;
        }
        if (C108945cZ.A00(this.A01, 1.0f) >= 1.0E-4f || C108945cZ.A00(this.A00, 1.0f) >= 1.0E-4f || i != this.A08.A03) {
            return true;
        }
        return false;
    }

    public boolean Bed() {
        if (!this.A0D) {
            return false;
        }
        Cv1 cv1 = this.A06;
        if (cv1 == null || cv1.A05 * cv1.A0G * 2 == 0) {
            return true;
        }
        return false;
    }

    public void CDA() {
        Cv1 cv1 = this.A06;
        if (cv1 != null) {
            int i = cv1.A00;
            float f = cv1.A0F;
            float f2 = cv1.A0D;
            int i2 = cv1.A05 + ((int) ((((((float) i) / (f / f2)) + ((float) cv1.A06)) / (cv1.A0E * f2)) + 0.5f));
            short[] sArr = cv1.A0A;
            int i3 = cv1.A0J * 2;
            short[] A042 = Cv1.A04(cv1, sArr, i, i3 + i);
            cv1.A0A = A042;
            int i4 = 0;
            while (true) {
                int i5 = cv1.A0G;
                if (i4 >= i3 * i5) {
                    break;
                }
                A042[(i5 * i) + i4] = 0;
                i4++;
            }
            cv1.A00 += i3;
            Cv1.A01(cv1);
            if (cv1.A05 > i2) {
                cv1.A05 = i2;
            }
            cv1.A00 = 0;
            cv1.A09 = 0;
            cv1.A06 = 0;
        }
        this.A0D = true;
    }

    public void reset() {
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        C25797Cm9 cm9 = C25797Cm9.A04;
        this.A08 = cm9;
        this.A09 = cm9;
        this.A04 = cm9;
        this.A05 = cm9;
        ByteBuffer byteBuffer = C28627EBa.A00;
        this.A0A = byteBuffer;
        this.A0C = byteBuffer.asShortBuffer();
        this.A0B = byteBuffer;
        this.A07 = false;
        this.A06 = null;
        this.A02 = 0;
        this.A03 = 0;
        this.A0D = false;
    }

    public C26663D8m() {
        C25797Cm9 cm9 = C25797Cm9.A04;
        this.A08 = cm9;
        this.A09 = cm9;
        this.A04 = cm9;
        this.A05 = cm9;
        ByteBuffer byteBuffer = C28627EBa.A00;
        this.A0A = byteBuffer;
        this.A0C = byteBuffer.asShortBuffer();
        this.A0B = byteBuffer;
    }

    public void CDB(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            Cv1 cv1 = this.A06;
            C26056CrS.A01(cv1);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.A02 += (long) remaining;
            int remaining2 = asShortBuffer.remaining();
            int i = cv1.A0G;
            int i2 = remaining2 / i;
            short[] A042 = Cv1.A04(cv1, cv1.A0A, cv1.A00, i2);
            cv1.A0A = A042;
            asShortBuffer.get(A042, cv1.A00 * i, ((i * i2) * 2) / 2);
            cv1.A00 += i2;
            Cv1.A01(cv1);
            BE8.A1G(byteBuffer, remaining);
        }
    }

    public void flush() {
        if (Be2()) {
            C25797Cm9 cm9 = this.A08;
            this.A04 = cm9;
            C25797Cm9 cm92 = this.A09;
            this.A05 = cm92;
            if (this.A07) {
                this.A06 = new Cv1(this.A01, this.A00, cm9.A03, cm9.A01, cm92.A03);
            } else {
                Cv1 cv1 = this.A06;
                if (cv1 != null) {
                    cv1.A00 = 0;
                    cv1.A05 = 0;
                    cv1.A06 = 0;
                    cv1.A04 = 0;
                    cv1.A03 = 0;
                    cv1.A09 = 0;
                    cv1.A08 = 0;
                    cv1.A07 = 0;
                    cv1.A02 = 0;
                    cv1.A01 = 0;
                }
            }
        }
        this.A0B = C28627EBa.A00;
        this.A02 = 0;
        this.A03 = 0;
        this.A0D = false;
    }
}
