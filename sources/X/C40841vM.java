package X;

import java.util.Arrays;

/* renamed from: X.1vM  reason: invalid class name and case insensitive filesystem */
public final class C40841vM {
    public final long A00;
    public final long[] A01;

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (C18070vi.A18(cls2, cls)) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.privacy.usernotice.UserNoticeContentTiming.Duration");
                C40841vM r8 = (C40841vM) obj;
                if (this.A00 == r8.A00) {
                    long[] jArr = this.A01;
                    long[] jArr2 = r8.A01;
                    if (jArr != null) {
                        if (jArr2 == null || !Arrays.equals(jArr, jArr2)) {
                            return false;
                        }
                    } else if (jArr2 != null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        long j = this.A00;
        int i2 = ((int) (j ^ (j >>> 32))) * 31;
        long[] jArr = this.A01;
        if (jArr != null) {
            i = Arrays.hashCode(jArr);
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Duration{staticDurationMillis=");
        sb.append(this.A00);
        sb.append(", repeatDurationMills=");
        String arrays = Arrays.toString(this.A01);
        C18070vi.A0X(arrays);
        sb.append(arrays);
        sb.append('}');
        return sb.toString();
    }

    public C40841vM(long[] jArr, long j) {
        this.A00 = j;
        this.A01 = jArr;
    }
}
