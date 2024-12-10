package X;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1uE  reason: invalid class name and case insensitive filesystem */
public final class C40141uE {
    /* JADX WARNING: type inference failed for: r5v0, types: [X.1tn, java.lang.Object] */
    public final C40131uD A01(C40081u8... r26) {
        int i;
        C40081u8[] r6 = r26;
        int length = r6.length;
        int i2 = 0;
        ArrayList arrayList = new ArrayList(new AnonymousClass1ZV(r6, false));
        C29391cC.A0G(arrayList);
        ArrayList arrayList2 = new ArrayList(length);
        for (int i3 = 0; i3 < length; i3++) {
            arrayList2.add(-1);
        }
        Object[] array = arrayList2.toArray(new Integer[0]);
        if (array != null) {
            Integer[] numArr = (Integer[]) array;
            ArrayList A06 = AnonymousClass1ZU.A06(Arrays.copyOf(numArr, numArr.length));
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                A06.set(AnonymousClass1ZU.A03(r26[i4], arrayList, arrayList.size()), Integer.valueOf(i5));
                i4++;
                i5++;
            }
            if (((C40081u8) arrayList.get(0)).A01() > 0) {
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    C40081u8 r7 = (C40081u8) arrayList.get(i6);
                    int i7 = i6 + 1;
                    while (i7 < arrayList.size()) {
                        C40081u8 r9 = (C40081u8) arrayList.get(i7);
                        C18070vi.A0c(r7, 0);
                        C40081u8 r0 = C40091u9.A00;
                        if (!r9.A03(r7, r7.A01())) {
                            continue;
                            break;
                        } else if (r9.A01() == r7.A01()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("duplicate option: ");
                            sb.append(r9);
                            throw new IllegalArgumentException(sb.toString());
                        } else if (((Number) A06.get(i7)).intValue() > ((Number) A06.get(i6)).intValue()) {
                            arrayList.remove(i7);
                            A06.remove(i7);
                        } else {
                            i7++;
                        }
                    }
                }
                ? obj = new Object();
                ArrayList arrayList3 = arrayList;
                A00(arrayList3, A06, obj, 0, 0, arrayList.size(), 0);
                int[] iArr = new int[((int) (obj.A00 / 4))];
                while (true) {
                    long j = obj.A00;
                    if (j == 0) {
                        return new C40131uD(iArr, (C40081u8[]) r6.clone());
                    }
                    int i8 = i2 + 1;
                    if (j >= 4) {
                        C39911tq r4 = obj.A01;
                        if (r4 == null) {
                            C18070vi.A0R();
                            throw null;
                        }
                        int i9 = r4.A01;
                        int i10 = r4.A00;
                        if (((long) (i10 - i9)) < 4) {
                            i = ((obj.A00() & 255) << 24) | ((obj.A00() & 255) << 16) | ((obj.A00() & 255) << 8) | (obj.A00() & 255);
                        } else {
                            byte[] bArr = r4.A06;
                            int i11 = i9 + 1;
                            int i12 = i11 + 1;
                            int i13 = i12 + 1;
                            int i14 = i13 + 1;
                            i = ((bArr[i9] & 255) << 24) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8) | (bArr[i13] & 255);
                            obj.A00 = j - 4;
                            if (i14 == i10) {
                                obj.A01 = r4.A00();
                                C39901tp.A01(r4);
                            } else {
                                r4.A01 = i14;
                            }
                        }
                        iArr[i2] = i;
                        i2 = i8;
                    } else {
                        throw new EOFException();
                    }
                }
            } else {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
        } else {
            throw new AnonymousClass2QY("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [X.1tn, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v1, types: [X.1tn, java.lang.Object] */
    private final void A00(List list, List list2, C39881tn r24, int i, int i2, int i3, long j) {
        int i4;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        if (i6 < i7) {
            int i8 = i6;
            while (true) {
                List list3 = list;
                if (i8 >= i7) {
                    C40081u8 r8 = (C40081u8) list3.get(i6);
                    C40081u8 r11 = (C40081u8) list3.get(i3 - 1);
                    List list4 = list2;
                    if (i5 == r8.A01()) {
                        i4 = ((Number) list4.get(i6)).intValue();
                        i6 = i2 + 1;
                        r8 = (C40081u8) list3.get(i6);
                    } else {
                        i4 = -1;
                    }
                    C39881tn r3 = r24;
                    if (r8.A00(i5) != r11.A00(i5)) {
                        int i9 = 1;
                        for (int i10 = i6 + 1; i10 < i7; i10++) {
                            if (((C40081u8) list3.get(i10 - 1)).A00(i5) != ((C40081u8) list3.get(i10)).A00(i5)) {
                                i9++;
                            }
                        }
                        long j2 = j + (r3.A00 / 4) + 2 + ((long) (i9 * 2));
                        r3.A07(i9);
                        r3.A07(i4);
                        for (int i11 = i6; i11 < i7; i11++) {
                            byte A00 = ((C40081u8) list3.get(i11)).A00(i5);
                            if (i11 == i6 || A00 != ((C40081u8) list3.get(i11 - 1)).A00(i5)) {
                                r3.A07(A00 & 255);
                            }
                        }
                        ? obj = new Object();
                        while (i6 < i7) {
                            byte A002 = ((C40081u8) list3.get(i6)).A00(i5);
                            int i12 = i6 + 1;
                            while (true) {
                                if (i12 < i7) {
                                    if (A002 != ((C40081u8) list3.get(i12)).A00(i5)) {
                                        break;
                                    }
                                    i12++;
                                } else {
                                    i12 = i7;
                                    break;
                                }
                            }
                            if (i6 + 1 == i12 && i + 1 == ((C40081u8) list3.get(i6)).A01()) {
                                r3.A07(((Number) list4.get(i6)).intValue());
                            } else {
                                r3.A07(-((int) (j2 + (obj.A00 / 4))));
                                A00(list3, list4, obj, i + 1, i6, i12, j2);
                            }
                            i6 = i12;
                        }
                        do {
                        } while (obj.CDN(r3) != -1);
                        return;
                    }
                    int min = Math.min(r8.A01(), r11.A01());
                    int i13 = 0;
                    int i14 = i5;
                    while (i14 < min && r8.A00(i14) == r11.A00(i14)) {
                        i13++;
                        i14++;
                    }
                    long j3 = j + (r3.A00 / 4) + 2 + ((long) i13) + 1;
                    r3.A07(-i13);
                    r3.A07(i4);
                    int i15 = i + i13;
                    while (i5 < i15) {
                        r3.A07(r8.A00(i5) & 255);
                        i5++;
                    }
                    if (i6 + 1 != i7) {
                        ? obj2 = new Object();
                        r3.A07(-((int) ((obj2.A00 / 4) + j3)));
                        A00(list3, list4, obj2, i15, i6, i7, j3);
                        do {
                        } while (obj2.CDN(r3) != -1);
                        return;
                    } else if (i15 == ((C40081u8) list3.get(i6)).A01()) {
                        r3.A07(((Number) list4.get(i6)).intValue());
                        return;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } else if (((C40081u8) list3.get(i8)).A01() >= i5) {
                    i8++;
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
