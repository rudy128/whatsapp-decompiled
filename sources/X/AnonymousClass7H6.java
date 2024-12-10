package X;

import android.database.ContentObserver;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/* renamed from: X.7H6  reason: invalid class name */
public final class AnonymousClass7H6 implements C160878Ah {
    public int A00;
    public int A01;
    public long[] A02;
    public final PriorityQueue A03;
    public final int[] A04;
    public final C160878Ah[] A05;

    public AnonymousClass7H6(C160878Ah[] r6, int i) {
        Object obj;
        C18070vi.A0d(r6, 1);
        C160878Ah[] r4 = (C160878Ah[]) r6.clone();
        this.A05 = r4;
        if (i == 1) {
            obj = new Object();
        } else {
            obj = new Object();
        }
        PriorityQueue priorityQueue = new PriorityQueue(4, (Comparator) obj);
        this.A03 = priorityQueue;
        this.A02 = new long[16];
        this.A01 = 0;
        int length = r4.length;
        this.A04 = new int[length];
        this.A00 = -1;
        priorityQueue.clear();
        for (int i2 = 0; i2 < length; i2++) {
            C132776nZ r1 = new C132776nZ(this.A05[i2], i2);
            if (r1.A00()) {
                this.A03.add(r1);
            }
        }
    }

    public HashMap BNm() {
        C160878Ah[] r2 = this.A05;
        HashMap A11 = C17880vN.A11();
        if (r2.length > 0) {
            A11.putAll(r2[0].BNm());
        }
        return A11;
    }

    public AnonymousClass8B2 BUY(int i) {
        if (i < 0 || i > getCount()) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("index ");
            A10.append(i);
            A10.append(" out of range max is ");
            throw new IndexOutOfBoundsException(C17880vN.A0t(A10, getCount()));
        }
        int[] iArr = this.A04;
        Arrays.fill(iArr, 0);
        int i2 = this.A01;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long j = this.A02[i4];
            int i5 = (int) (4294967295L & j);
            int i6 = (int) (j >> 32);
            if (i3 + i5 > i) {
                return this.A05[i6].BUY(iArr[i6] + (i - i3));
            }
            i3 += i5;
            iArr[i6] = iArr[i6] + i5;
        }
        while (true) {
            PriorityQueue priorityQueue = this.A03;
            C132776nZ r5 = (C132776nZ) priorityQueue.poll();
            if (r5 == null) {
                return null;
            }
            int i7 = r5.A03;
            if (i7 == this.A00) {
                int i8 = this.A01 - 1;
                long[] jArr = this.A02;
                jArr[i8] = jArr[i8] + 1;
            } else {
                this.A00 = i7;
                long[] jArr2 = this.A02;
                int length = jArr2.length;
                int i9 = this.A01;
                if (length == i9) {
                    long[] jArr3 = new long[(i9 * 2)];
                    System.arraycopy(jArr2, 0, jArr3, 0, i9);
                    this.A02 = jArr3;
                    jArr2 = jArr3;
                }
                int i10 = this.A01;
                this.A01 = i10 + 1;
                jArr2[i10] = 1 | (((long) this.A00) << 32);
            }
            if (i3 == i) {
                AnonymousClass8B2 r1 = r5.A01;
                if (!r5.A00()) {
                    return r1;
                }
                priorityQueue.add(r5);
                return r1;
            }
            if (r5.A00()) {
                priorityQueue.add(r5);
            }
            i3++;
        }
    }

    public void CFP() {
        for (C160878Ah CFP : this.A05) {
            CFP.CFP();
        }
    }

    public void close() {
        for (C160878Ah close : this.A05) {
            close.close();
        }
    }

    public int getCount() {
        int i = 0;
        for (C160878Ah count : this.A05) {
            i += count.getCount();
        }
        return i;
    }

    public boolean isEmpty() {
        C160878Ah[] r4 = this.A05;
        int length = r4.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (!r4[i].isEmpty()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        return !z;
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        for (C160878Ah registerContentObserver : this.A05) {
            registerContentObserver.registerContentObserver(contentObserver);
        }
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        for (C160878Ah unregisterContentObserver : this.A05) {
            unregisterContentObserver.unregisterContentObserver(contentObserver);
        }
    }

    public AnonymousClass8B2 CCk(int i) {
        return BUY(i);
    }
}
