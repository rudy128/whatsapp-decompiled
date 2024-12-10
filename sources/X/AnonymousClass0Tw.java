package X;

import java.util.LinkedHashMap;

/* renamed from: X.0Tw  reason: invalid class name */
public final class AnonymousClass0Tw implements C17180uF {
    public final AnonymousClass0IA A00;

    /* renamed from: A00 */
    public AnonymousClass0UB CRl(C16590sg r18) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AnonymousClass0IA r12 = this.A00;
        AnonymousClass06w r0 = r12.A01;
        int[] iArr = r0.A02;
        Object[] objArr = r0.A04;
        long[] jArr = r0.A03;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((AnonymousClass001.A0q(j) & -9187201950435737472L) != -9187201950435737472L) {
                    int A0D = 8 - AnonymousClass000.A0D(i, length);
                    for (int i2 = 0; i2 < A0D; i2++) {
                        if ((255 & j) < 128) {
                            int i3 = (i << 3) + i2;
                            linkedHashMap.put(Integer.valueOf(iArr[i3]), ((AnonymousClass0I9) objArr[i3]).A00(r18.BPS()));
                        }
                        j >>= 8;
                    }
                    if (A0D != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return new AnonymousClass0UB(linkedHashMap, r12.A00);
    }

    public AnonymousClass0Tw(AnonymousClass0IA r1) {
        this.A00 = r1;
    }
}
