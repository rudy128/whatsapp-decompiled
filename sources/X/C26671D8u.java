package X;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.D8u  reason: case insensitive filesystem */
public class C26671D8u implements C28585E8y {
    public static final D48 A0U = D48.A00("application/x-emsg");
    public static final byte[] A0V = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public SparseArray A0C;
    public C25689CkK A0D;
    public D9O A0E;
    public C26207Cui A0F;
    public boolean A0G;
    public boolean A0H;
    public C28586E8z[] A0I;
    public C28586E8z[] A0J;
    public final C25521ChJ A0K = new C25521ChJ();
    public final C26207Cui A0L = new C26207Cui(16);
    public final C26207Cui A0M;
    public final C26207Cui A0N;
    public final C26207Cui A0O;
    public final C26207Cui A0P;
    public final ArrayDeque A0Q;
    public final ArrayDeque A0R;
    public final List A0S = Collections.unmodifiableList(Collections.emptyList());
    public final byte[] A0T;

    public boolean CNV(C26036Cqw cqw) {
        return C25374CeZ.A00(cqw, true);
    }

    private void A01(long j) {
        String str;
        DUU duu;
        Object obj;
        int i;
        int i2;
        int i3;
        int i4;
        String str2;
        byte[] bArr;
        long A0A2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Object obj2;
        Object obj3;
        CU2 A032;
        while (true) {
            ArrayDeque arrayDeque = this.A0Q;
            if (arrayDeque.isEmpty() || ((C22769BOi) arrayDeque.peek()).A00 != j) {
                this.A02 = 0;
                this.A00 = 0;
            } else {
                C22769BOi bOi = (C22769BOi) arrayDeque.pop();
                int i11 = bOi.A00;
                if (i11 == 1836019574) {
                    boolean z = true;
                    int i12 = 0;
                    DUU A002 = A00(bOi.A02);
                    C22769BOi A003 = bOi.A00(1836475768);
                    C26056CrS.A01(A003);
                    SparseArray A0Q2 = BE6.A0Q();
                    List list = A003.A02;
                    int size = list.size();
                    long j2 = -9223372036854775807L;
                    for (int i13 = 0; i13 < size; i13++) {
                        C22768BOh bOh = (C22768BOh) list.get(i13);
                        if (bOh.A00 == 1953654136) {
                            C26207Cui cui = bOh.A00;
                            Pair create = Pair.create(Integer.valueOf(C26207Cui.A02(cui, 12)), new CR5(cui.A05() - 1, cui.A05(), cui.A05(), cui.A03()));
                            A0Q2.put(C108965cb.A01(create), create.second);
                        } else if (bOh.A00 == 1835362404) {
                            C26207Cui cui2 = bOh.A00;
                            if (C26207Cui.A00(cui2) == 0) {
                                j2 = cui2.A09();
                            } else {
                                j2 = cui2.A0A();
                            }
                        }
                    }
                    SparseArray A0Q3 = BE6.A0Q();
                    List list2 = bOi.A01;
                    int size2 = list2.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        C22769BOi bOi2 = (C22769BOi) list2.get(i14);
                        if (bOi2.A00 == 1953653099 && (A032 = C26169Ctl.A03(A002, bOi2, bOi.A01(1836476516), j2, false)) != null) {
                            A0Q3.put(A032.A00, A032);
                        }
                    }
                    int size3 = A0Q3.size();
                    SparseArray sparseArray = this.A0C;
                    if (sparseArray.size() != 0) {
                        if (sparseArray.size() != size3) {
                            z = false;
                        }
                        C26056CrS.A03(z);
                        while (i12 < size3) {
                            CU2 cu2 = (CU2) A0Q3.valueAt(i12);
                            int i15 = cu2.A00;
                            C25689CkK ckK = (C25689CkK) sparseArray.get(i15);
                            if (A0Q2.size() == 1) {
                                obj3 = A0Q2.valueAt(0);
                            } else {
                                obj3 = A0Q2.get(i15);
                                C26056CrS.A01(obj3);
                            }
                            CR5 cr5 = (CR5) obj3;
                            ckK.A05 = cu2;
                            C26056CrS.A01(cr5);
                            ckK.A04 = cr5;
                            ckK.A06.BLZ(cu2.A07);
                            ckK.A01();
                            i12++;
                        }
                    } else {
                        while (i12 < size3) {
                            CU2 cu22 = (CU2) A0Q3.valueAt(i12);
                            C25689CkK ckK2 = new C25689CkK(this.A0E.A05(i12));
                            int i16 = cu22.A00;
                            if (A0Q2.size() == 1) {
                                obj2 = A0Q2.valueAt(0);
                            } else {
                                obj2 = A0Q2.get(i16);
                                C26056CrS.A01(obj2);
                            }
                            CR5 cr52 = (CR5) obj2;
                            ckK2.A05 = cu22;
                            C26056CrS.A01(cr52);
                            ckK2.A04 = cr52;
                            ckK2.A06.BLZ(cu22.A07);
                            ckK2.A01();
                            sparseArray.put(i16, ckK2);
                            this.A08 = Math.max(this.A08, cu22.A04);
                            i12++;
                        }
                        if (this.A0J == null) {
                            C28586E8z[] e8zArr = new C28586E8z[2];
                            this.A0J = e8zArr;
                            C28586E8z[] e8zArr2 = (C28586E8z[]) Arrays.copyOf(e8zArr, 0);
                            this.A0J = e8zArr2;
                            for (C28586E8z BLZ : e8zArr2) {
                                BLZ.BLZ(A0U);
                            }
                        }
                        if (this.A0I == null) {
                            List list3 = this.A0S;
                            C28586E8z[] e8zArr3 = new C28586E8z[list3.size()];
                            this.A0I = e8zArr3;
                            for (int i17 = 0; i17 < e8zArr3.length; i17++) {
                                C28586E8z A052 = this.A0E.A05(sparseArray.size() + 1 + i17);
                                A052.BLZ((D48) list3.get(i17));
                                e8zArr3 = this.A0I;
                                e8zArr3[i17] = A052;
                            }
                        }
                        D9O d9o = this.A0E;
                        d9o.A0G = true;
                        d9o.A0O.post(d9o.A0U);
                    }
                } else if (i11 == 1836019558) {
                    SparseArray sparseArray2 = this.A0C;
                    byte[] bArr2 = this.A0T;
                    List list4 = bOi.A01;
                    int size4 = list4.size();
                    for (int i18 = 0; i18 < size4; i18++) {
                        C22769BOi bOi3 = (C22769BOi) list4.get(i18);
                        if (bOi3.A00 == 1953653094) {
                            C26207Cui cui3 = bOi3.A01(1952868452).A00;
                            int A022 = C26207Cui.A02(cui3, 8) & 16777215;
                            int A033 = cui3.A03();
                            if (sparseArray2.size() == 1) {
                                obj = sparseArray2.valueAt(0);
                            } else {
                                obj = sparseArray2.get(A033);
                            }
                            C25689CkK ckK3 = (C25689CkK) obj;
                            if (ckK3 == null) {
                                continue;
                            } else {
                                if ((A022 & 1) != 0) {
                                    long A0A3 = cui3.A0A();
                                    CUJ cuj = ckK3.A07;
                                    cuj.A03 = A0A3;
                                    cuj.A02 = A0A3;
                                }
                                CR5 cr53 = ckK3.A04;
                                if ((A022 & 2) != 0) {
                                    i = cui3.A05() - 1;
                                } else {
                                    i = cr53.A02;
                                }
                                if ((A022 & 8) != 0) {
                                    i2 = cui3.A05();
                                } else {
                                    i2 = cr53.A00;
                                }
                                if ((A022 & 16) != 0) {
                                    i3 = cui3.A05();
                                } else {
                                    i3 = cr53.A03;
                                }
                                if ((A022 & 32) != 0) {
                                    i4 = cui3.A05();
                                } else {
                                    i4 = cr53.A01;
                                }
                                CUJ cuj2 = ckK3.A07;
                                cuj2.A05 = new CR5(i, i2, i3, i4);
                                long j3 = cuj2.A04;
                                ckK3.A01();
                                if (bOi3.A01(1952867444) != null) {
                                    C26207Cui cui4 = bOi3.A01(1952867444).A00;
                                    if (C26207Cui.A00(cui4) == 1) {
                                        j3 = cui4.A0A();
                                    } else {
                                        j3 = cui4.A09();
                                    }
                                }
                                List list5 = bOi3.A02;
                                int size5 = list5.size();
                                int i19 = 0;
                                int i20 = 0;
                                for (int i21 = 0; i21 < size5; i21++) {
                                    C22768BOh bOh2 = (C22768BOh) list5.get(i21);
                                    if (bOh2.A00 == 1953658222) {
                                        C26207Cui cui5 = bOh2.A00;
                                        cui5.A0I(12);
                                        int A053 = cui5.A05();
                                        if (A053 > 0) {
                                            i20 += A053;
                                            i19++;
                                        }
                                    }
                                }
                                ckK3.A02 = 0;
                                ckK3.A00 = 0;
                                ckK3.A01 = 0;
                                cuj2.A01 = i19;
                                cuj2.A00 = i20;
                                if (cuj2.A0A.length < i19) {
                                    cuj2.A0C = new long[i19];
                                    cuj2.A0A = new int[i19];
                                }
                                if (cuj2.A09.length < i20) {
                                    int i22 = (i20 * 125) / 100;
                                    cuj2.A09 = new int[i22];
                                    cuj2.A0B = new long[i22];
                                    cuj2.A0E = new boolean[i22];
                                    cuj2.A0D = new boolean[i22];
                                }
                                int i23 = 0;
                                int i24 = 0;
                                for (int i25 = 0; i25 < size5; i25++) {
                                    C22768BOh bOh3 = (C22768BOh) list5.get(i25);
                                    if (bOh3.A00 == 1953658222) {
                                        int i26 = i23 + 1;
                                        C26207Cui cui6 = bOh3.A00;
                                        C26207Cui cui7 = cui6;
                                        long j4 = j3;
                                        int A023 = C26207Cui.A02(cui6, 8) & 16777215;
                                        CU2 cu23 = ckK3.A05;
                                        CR5 cr54 = cuj2.A05;
                                        int[] iArr = cuj2.A0A;
                                        int A054 = cui7.A05();
                                        iArr[i23] = A054;
                                        long[] jArr = cuj2.A0C;
                                        long[] jArr2 = jArr;
                                        long j5 = cuj2.A03;
                                        jArr[i23] = j5;
                                        if ((A023 & 1) != 0) {
                                            jArr2[i23] = j5 + ((long) cui7.A03());
                                        }
                                        boolean A1O = AnonymousClass000.A1O(A023 & 4);
                                        int i27 = cr54.A01;
                                        int i28 = i27;
                                        int i29 = i27;
                                        if (A1O) {
                                            i28 = cui7.A05();
                                        }
                                        boolean A1O2 = AnonymousClass000.A1O(A023 & 256);
                                        boolean A1O3 = AnonymousClass000.A1O(A023 & 512);
                                        boolean A1O4 = AnonymousClass000.A1O(A023 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
                                        boolean A1O5 = AnonymousClass000.A1O(A023 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
                                        long[] jArr3 = cu23.A08;
                                        long j6 = 0;
                                        if (jArr3 != null && jArr3.length == 1 && jArr3[0] == 0) {
                                            j6 = cu23.A09[0];
                                        }
                                        int[] iArr2 = cuj2.A09;
                                        long[] jArr4 = cuj2.A0B;
                                        boolean[] zArr = cuj2.A0E;
                                        int i30 = i24 + A054;
                                        long j7 = cu23.A06;
                                        if (i23 > 0) {
                                            j4 = cuj2.A04;
                                        }
                                        while (true) {
                                            i6 = i30;
                                            if (i24 >= i6) {
                                                break;
                                            }
                                            if (A1O2) {
                                                i7 = cui7.A05();
                                            } else {
                                                i7 = cr54.A00;
                                            }
                                            if (A1O3) {
                                                i8 = cui7.A05();
                                            } else {
                                                i8 = cr54.A03;
                                            }
                                            if (i24 == 0 && A1O) {
                                                A1O = true;
                                                i9 = i28;
                                            } else if (A1O4) {
                                                i9 = cui7.A03();
                                            } else {
                                                i9 = i29;
                                            }
                                            if (A1O5) {
                                                i10 = cui7.A03();
                                                A1O5 = true;
                                            } else {
                                                A1O5 = false;
                                                i10 = 0;
                                            }
                                            jArr4[i24] = BE8.A0E((((long) i10) + j4) - j6, j7);
                                            zArr[i24] = AnonymousClass000.A1P((i9 >> 16) & 1);
                                            iArr2[i24] = i8;
                                            j4 += (long) i7;
                                            i24++;
                                        }
                                        cuj2.A04 = j4;
                                        i24 = i6;
                                        i23 = i26;
                                    }
                                }
                                CSG csg = ckK3.A05.A0A[cuj2.A05.A02];
                                C22768BOh A012 = bOi3.A01(1935763834);
                                if (A012 != null) {
                                    C26207Cui cui8 = A012.A00;
                                    int i31 = csg.A00;
                                    boolean z2 = true;
                                    if ((C26207Cui.A02(cui8, 8) & 16777215 & 1) == 1) {
                                        cui8.A0J(8);
                                    }
                                    int A042 = cui8.A04();
                                    int A055 = cui8.A05();
                                    int i32 = cuj2.A00;
                                    if (A055 == i32) {
                                        if (A042 == 0) {
                                            boolean[] zArr2 = cuj2.A0D;
                                            i5 = 0;
                                            for (int i33 = 0; i33 < A055; i33++) {
                                                int A043 = cui8.A04();
                                                i5 += A043;
                                                zArr2[i33] = C108975cc.A1D(A043, i31);
                                            }
                                        } else {
                                            if (A042 <= i31) {
                                                z2 = false;
                                            }
                                            i5 = A042 * A055;
                                            Arrays.fill(cuj2.A0D, 0, A055, z2);
                                        }
                                        cuj2.A0F.A0G(i5);
                                        cuj2.A07 = true;
                                        cuj2.A08 = true;
                                    } else {
                                        StringBuilder A10 = AnonymousClass000.A10();
                                        A10.append("Length mismatch: ");
                                        A10.append(A055);
                                        throw C24215BxS.A00(AnonymousClass001.A1I(", ", A10, i32));
                                    }
                                }
                                C22768BOh A013 = bOi3.A01(1935763823);
                                if (A013 != null) {
                                    C26207Cui cui9 = A013.A00;
                                    int A024 = C26207Cui.A02(cui9, 8);
                                    if ((16777215 & A024 & 1) == 1) {
                                        cui9.A0J(8);
                                    }
                                    int A056 = cui9.A05();
                                    if (A056 == 1) {
                                        int i34 = (A024 >> 24) & 255;
                                        long j8 = cuj2.A02;
                                        if (i34 == 0) {
                                            A0A2 = cui9.A09();
                                        } else {
                                            A0A2 = cui9.A0A();
                                        }
                                        cuj2.A02 = j8 + A0A2;
                                    } else {
                                        throw C24215BxS.A00(AnonymousClass001.A1I("Unexpected saio entry count: ", AnonymousClass000.A10(), A056));
                                    }
                                }
                                C22768BOh A014 = bOi3.A01(1936027235);
                                if (A014 != null) {
                                    A02(cuj2, A014.A00, 0);
                                }
                                C22768BOh A015 = bOi3.A01(1935828848);
                                C22768BOh A016 = bOi3.A01(1936158820);
                                if (!(A015 == null || A016 == null)) {
                                    C26207Cui cui10 = A015.A00;
                                    C26207Cui cui11 = A016.A00;
                                    if (csg != null) {
                                        str2 = csg.A02;
                                    } else {
                                        str2 = null;
                                    }
                                    int A025 = C26207Cui.A02(cui10, 8);
                                    if (cui10.A03() == 1936025959) {
                                        if (((A025 >> 24) & 255) == 1) {
                                            cui10.A0J(4);
                                        }
                                        if (cui10.A03() == 1) {
                                            int A026 = C26207Cui.A02(cui11, 8);
                                            if (cui11.A03() == 1936025959) {
                                                int i35 = (A026 >> 24) & 255;
                                                if (i35 == 1) {
                                                    if (cui11.A09() == 0) {
                                                        throw C24215BxS.A00("Variable length description in sgpd found (unsupported)");
                                                    }
                                                } else if (i35 >= 2) {
                                                    cui11.A0J(4);
                                                }
                                                if (cui11.A09() == 1) {
                                                    int A017 = C26207Cui.A01(cui11, 1);
                                                    int i36 = (A017 & 240) >> 4;
                                                    int i37 = A017 & 15;
                                                    if (cui11.A04() == 1) {
                                                        int A044 = cui11.A04();
                                                        byte[] bArr3 = new byte[16];
                                                        cui11.A0K(bArr3, 0, 16);
                                                        if (A044 == 0) {
                                                            int A045 = cui11.A04();
                                                            bArr = new byte[A045];
                                                            cui11.A0K(bArr, 0, A045);
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        cuj2.A07 = true;
                                                        cuj2.A06 = new CSG(str2, bArr3, bArr, A044, i36, i37, true);
                                                    }
                                                } else {
                                                    throw C24215BxS.A00("Entry count in sgpd != 1 (unsupported).");
                                                }
                                            }
                                        } else {
                                            throw C24215BxS.A00("Entry count in sbgp != 1 (unsupported).");
                                        }
                                    }
                                }
                                int size6 = list5.size();
                                for (int i38 = 0; i38 < size6; i38++) {
                                    C22768BOh bOh4 = (C22768BOh) list5.get(i38);
                                    if (bOh4.A00 == 1970628964) {
                                        C26207Cui cui12 = bOh4.A00;
                                        cui12.A0I(8);
                                        byte[] bArr4 = bArr2;
                                        cui12.A0K(bArr4, 0, 16);
                                        if (Arrays.equals(bArr4, A0V)) {
                                            A02(cuj2, cui12, 16);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    DUU A004 = A00(bOi.A02);
                    if (A004 != null) {
                        int size7 = sparseArray2.size();
                        for (int i39 = 0; i39 < size7; i39++) {
                            C25689CkK ckK4 = (C25689CkK) sparseArray2.valueAt(i39);
                            CU2 cu24 = ckK4.A05;
                            CSG csg2 = cu24.A0A[ckK4.A07.A05.A02];
                            if (csg2 != null) {
                                str = csg2.A02;
                            } else {
                                str = null;
                            }
                            C28586E8z e8z = ckK4.A06;
                            D48 d48 = cu24.A07;
                            if (Util.A0D(A004.A02, str)) {
                                duu = A004;
                            } else {
                                duu = new DUU(str, A004.A03);
                            }
                            C25702CkX ckX = new C25702CkX(d48);
                            ckX.A00(duu);
                            e8z.BLZ(new D48(ckX));
                        }
                    }
                    long j9 = this.A0A;
                    if (j9 != -9223372036854775807L) {
                        int size8 = sparseArray2.size();
                        for (int i40 = 0; i40 < size8; i40++) {
                            C25689CkK ckK5 = (C25689CkK) sparseArray2.valueAt(i40);
                            int i41 = ckK5.A01;
                            while (true) {
                                CUJ cuj3 = ckK5.A07;
                                if (i41 >= cuj3.A00 || cuj3.A0B[i41] >= j9) {
                                } else {
                                    if (cuj3.A0E[i41]) {
                                        ckK5.A03 = i41;
                                    }
                                    i41++;
                                }
                            }
                        }
                        this.A0A = -9223372036854775807L;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((C22769BOi) arrayDeque.peek()).A01.add(bOi);
                }
            }
        }
        this.A02 = 0;
        this.A00 = 0;
    }

    public static void A02(CUJ cuj, C26207Cui cui, int i) {
        int A022 = C26207Cui.A02(cui, i + 8) & 16777215;
        if ((A022 & 1) == 0) {
            boolean A1O = AnonymousClass000.A1O(A022 & 2);
            int A052 = cui.A05();
            int i2 = cuj.A00;
            if (A052 == i2) {
                Arrays.fill(cuj.A0D, 0, A052, A1O);
                C26207Cui cui2 = cuj.A0F;
                cui2.A0G(cui.A00 - cui.A01);
                cuj.A07 = true;
                cuj.A08 = true;
                cui.A0K(cui2.A02, 0, cui2.A00);
                cui2.A0I(0);
                cuj.A08 = false;
                return;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Length mismatch: ");
            A10.append(A052);
            throw C24215BxS.A00(AnonymousClass001.A1I(", ", A10, i2));
        }
        throw C24215BxS.A00("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [java.lang.Object, X.Cui] */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03f1, code lost:
        if (r6 == 1701671783) goto L_0x03f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0643, code lost:
        if (r14 != 3) goto L_0x0645;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x06cf, code lost:
        if (r10.A0D[r3] == false) goto L_0x06d1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x07db A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int CDJ(X.C26036Cqw r30, X.C24761CIy r31) {
        /*
            r29 = this;
        L_0x0000:
            r0 = r29
            int r2 = r0.A02
            r1 = r30
            if (r2 == 0) goto L_0x0288
            r13 = 1
            if (r2 == r13) goto L_0x0085
            r12 = 2
            if (r2 == r12) goto L_0x005a
            r9 = 0
            r11 = 4
            r5 = 1
            r4 = 0
            r8 = 3
            if (r2 != r8) goto L_0x04de
            X.CkK r10 = r0.A0D
            if (r10 != 0) goto L_0x045f
            android.util.SparseArray r15 = r0.A0C
            int r14 = r15.size()
            r10 = 0
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = 0
        L_0x0026:
            if (r13 >= r14) goto L_0x0048
            java.lang.Object r3 = r15.valueAt(r13)
            X.CkK r3 = (X.C25689CkK) r3
            int r6 = r3.A02
            X.CUJ r2 = r3.A07
            int r2 = r2.A01
            if (r6 == r2) goto L_0x0045
            X.CUJ r2 = r3.A07
            long[] r6 = r2.A0C
            int r2 = r3.A02
            r6 = r6[r2]
            int r2 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x0045
            r10 = r3
            r16 = r6
        L_0x0045:
            int r13 = r13 + 1
            goto L_0x0026
        L_0x0048:
            if (r10 != 0) goto L_0x0444
            long r5 = r0.A09
            long r2 = r1.A02
            long r5 = r5 - r2
            int r2 = (int) r5
            if (r2 < 0) goto L_0x043d
            r1.A02(r2)
            r0.A02 = r4
            r0.A00 = r4
            goto L_0x0000
        L_0x005a:
            android.util.SparseArray r11 = r0.A0C
            int r10 = r11.size()
            r4 = 0
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = 0
        L_0x0067:
            if (r9 >= r10) goto L_0x0343
            java.lang.Object r2 = r11.valueAt(r9)
            X.CkK r2 = (X.C25689CkK) r2
            X.CUJ r3 = r2.A07
            boolean r2 = r3.A08
            if (r2 == 0) goto L_0x0082
            long r7 = r3.A02
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0082
            java.lang.Object r4 = r11.valueAt(r9)
            X.CkK r4 = (X.C25689CkK) r4
            r5 = r7
        L_0x0082:
            int r9 = r9 + 1
            goto L_0x0067
        L_0x0085:
            long r2 = r0.A07
            int r5 = (int) r2
            int r2 = r0.A00
            int r5 = r5 - r2
            X.Cui r2 = r0.A0F
            if (r2 == 0) goto L_0x0283
            byte[] r4 = r2.A02
            r3 = 8
            r2 = 0
            r1.A05(r4, r3, r5, r2)
            int r3 = r0.A01
            X.Cui r2 = r0.A0F
            X.BOh r4 = new X.BOh
            r4.<init>(r2, r3)
            java.util.ArrayDeque r3 = r0.A0Q
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x00ba
            java.lang.Object r2 = r3.peek()
            X.BOi r2 = (X.C22769BOi) r2
            java.util.List r2 = r2.A02
            r2.add(r4)
        L_0x00b3:
            long r1 = r1.A02
            r0.A01(r1)
            goto L_0x0000
        L_0x00ba:
            int r3 = r4.A00
            r2 = 1936286840(0x73696478, float:1.8491255E31)
            if (r3 != r2) goto L_0x0157
            X.Cui r9 = r4.A00
            long r2 = r1.A02
            int r5 = X.C26207Cui.A00(r9)
            r4 = 4
            r9.A0J(r4)
            long r24 = r9.A09()
            if (r5 != 0) goto L_0x0126
            long r20 = r9.A09()
            long r4 = r9.A09()
        L_0x00db:
            long r2 = r2 + r4
            r22 = 1000000(0xf4240, double:4.940656E-318)
            long r18 = com.facebook.android.exoplayer2.util.Util.A06(r20, r22, r24)
            r4 = 2
            r9.A0J(r4)
            int r8 = r9.A06()
            int[] r7 = new int[r8]
            long[] r10 = new long[r8]
            long[] r6 = new long[r8]
            long[] r5 = new long[r8]
            r16 = r18
            r4 = 0
        L_0x00f6:
            if (r4 >= r8) goto L_0x012f
            int r12 = r9.A03()
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = r11 & r12
            if (r11 != 0) goto L_0x07b2
            long r14 = r9.A09()
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = r12 & r11
            r7[r4] = r12
            r10[r4] = r2
            r5[r4] = r16
            long r20 = r20 + r14
            long r14 = com.facebook.android.exoplayer2.util.Util.A06(r20, r22, r24)
            long r11 = r14 - r16
            r6[r4] = r11
            r11 = 4
            r9.A0J(r11)
            r11 = r7[r4]
            long r11 = (long) r11
            long r2 = r2 + r11
            int r4 = r4 + 1
            r16 = r14
            goto L_0x00f6
        L_0x0126:
            long r20 = r9.A0A()
            long r4 = r9.A0A()
            goto L_0x00db
        L_0x012f:
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            X.D8y r2 = new X.D8y
            r2.<init>(r7, r10, r6, r5)
            android.util.Pair r5 = android.util.Pair.create(r3, r2)
            java.lang.Object r2 = r5.first
            long r2 = X.C17880vN.A05(r2)
            r0.A0B = r2
            X.D9O r4 = r0.A0E
            java.lang.Object r2 = r5.second
            X.E8W r2 = (X.E8W) r2
            r4.A07 = r2
            android.os.Handler r3 = r4.A0O
            java.lang.Runnable r2 = r4.A0U
            r3.post(r2)
            r0.A0G = r13
            goto L_0x00b3
        L_0x0157:
            r2 = 1701671783(0x656d7367, float:7.0083103E22)
            if (r3 != r2) goto L_0x00b3
            X.E9Q r2 = r1.A05
            android.net.Uri r10 = r2.Bb3()
            if (r10 == 0) goto L_0x00b3
            X.Cui r7 = r4.A00
            X.E8z[] r2 = r0.A0J
            if (r2 == 0) goto L_0x00b3
            int r2 = r2.length
            if (r2 == 0) goto L_0x00b3
            int r4 = X.C26207Cui.A00(r7)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x018b
            if (r4 == r13) goto L_0x01c3
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "Skipping unsupported emsg version: "
            java.lang.String r3 = X.AnonymousClass001.A1I(r2, r3, r4)
            java.lang.String r2 = "FragmentedMp4Extractor"
            android.util.Log.w(r2, r3)
            goto L_0x00b3
        L_0x018b:
            java.lang.String r19 = r7.A0B()
            X.C26056CrS.A01(r19)
            java.lang.String r20 = r7.A0B()
            X.C26056CrS.A01(r20)
            long r4 = r7.A09()
            long r2 = r7.A09()
            long r8 = X.BE8.A0E(r2, r4)
            long r2 = r0.A0B
            int r6 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r6 == 0) goto L_0x01bd
            long r2 = r2 + r8
        L_0x01ac:
            long r21 = r7.A09()
            r23 = 1000(0x3e8, double:4.94E-321)
            r25 = r4
            long r22 = com.facebook.android.exoplayer2.util.Util.A06(r21, r23, r25)
            long r24 = r7.A09()
            goto L_0x01f2
        L_0x01bd:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01ac
        L_0x01c3:
            long r4 = r7.A09()
            long r2 = r7.A0A()
            long r2 = X.BE8.A0E(r2, r4)
            long r18 = r7.A09()
            r20 = 1000(0x3e8, double:4.94E-321)
            r22 = r4
            long r22 = com.facebook.android.exoplayer2.util.Util.A06(r18, r20, r22)
            long r24 = r7.A09()
            java.lang.String r19 = r7.A0B()
            X.C26056CrS.A01(r19)
            java.lang.String r20 = r7.A0B()
            X.C26056CrS.A01(r20)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01f2:
            int r5 = r7.A00
            int r4 = r7.A01
            int r5 = r5 - r4
            byte[] r4 = new byte[r5]
            r6 = 0
            r7.A0K(r4, r6, r5)
            X.D9I r7 = new X.D9I
            r21 = r4
            r18 = r7
            r18.<init>(r19, r20, r21, r22, r24)
            X.ChJ r4 = r0.A0K
            java.io.ByteArrayOutputStream r12 = r4.A00
            r12.reset()
            java.io.DataOutputStream r11 = r4.A01     // Catch:{ IOException -> 0x07b9 }
            java.lang.String r4 = r7.A03     // Catch:{ IOException -> 0x07b9 }
            r11.writeBytes(r4)     // Catch:{ IOException -> 0x07b9 }
            r11.writeByte(r6)     // Catch:{ IOException -> 0x07b9 }
            java.lang.String r4 = r7.A04     // Catch:{ IOException -> 0x07b9 }
            if (r4 != 0) goto L_0x021d
            java.lang.String r4 = ""
        L_0x021d:
            r11.writeBytes(r4)     // Catch:{ IOException -> 0x07b9 }
            r11.writeByte(r6)     // Catch:{ IOException -> 0x07b9 }
            long r4 = r7.A01     // Catch:{ IOException -> 0x07b9 }
            X.C25521ChJ.A00(r11, r4)     // Catch:{ IOException -> 0x07b9 }
            long r4 = r7.A02     // Catch:{ IOException -> 0x07b9 }
            X.C25521ChJ.A00(r11, r4)     // Catch:{ IOException -> 0x07b9 }
            byte[] r4 = r7.A05     // Catch:{ IOException -> 0x07b9 }
            r11.write(r4)     // Catch:{ IOException -> 0x07b9 }
            r11.flush()     // Catch:{ IOException -> 0x07b9 }
            byte[] r4 = r12.toByteArray()     // Catch:{ IOException -> 0x07b9 }
            X.Cui r15 = new X.Cui
            r15.<init>()
            r15.A02 = r4
            int r7 = r4.length
            r15.A00 = r7
            int r4 = r15.A01
            int r7 = r7 - r4
            X.E8z[] r14 = r0.A0J
            int r12 = r14.length
            r11 = 0
        L_0x024a:
            if (r11 >= r12) goto L_0x025c
            r5 = r14[r11]
            r15.A0I(r6)
            r4 = r5
            X.D91 r4 = (X.D91) r4
            r4.A01 = r10
            r5.CGY(r15, r7)
            int r11 = r11 + 1
            goto L_0x024a
        L_0x025c:
            int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x0271
            java.util.ArrayDeque r3 = r0.A0R
            X.CMj r2 = new X.CMj
            r2.<init>(r8, r7)
            r3.addLast(r2)
            int r2 = r0.A03
            int r2 = r2 + r7
            r0.A03 = r2
            goto L_0x00b3
        L_0x0271:
            X.E8z[] r5 = r0.A0J
            int r4 = r5.length
        L_0x0274:
            if (r6 >= r4) goto L_0x00b3
            r11 = r5[r6]
            r15 = 0
            r12 = 0
            r14 = r7
            r16 = r2
            r11.CGa(r12, r13, r14, r15, r16)
            int r6 = r6 + 1
            goto L_0x0274
        L_0x0283:
            r1.A02(r5)
            goto L_0x00b3
        L_0x0288:
            int r2 = r0.A00
            r10 = 8
            r9 = 0
            r11 = 1
            if (r2 != 0) goto L_0x02ad
            X.Cui r4 = r0.A0L
            byte[] r2 = r4.A02
            boolean r2 = r1.A05(r2, r9, r10, r11)
            if (r2 != 0) goto L_0x029c
            r0 = -1
            return r0
        L_0x029c:
            r0.A00 = r10
            r4.A0I(r9)
            long r2 = r4.A09()
            r0.A07 = r2
            int r2 = r4.A03()
            r0.A01 = r2
        L_0x02ad:
            long r2 = r0.A07
            r5 = 1
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x02f4
            X.Cui r3 = r0.A0L
            byte[] r2 = r3.A02
            r1.A05(r2, r10, r10, r9)
            int r2 = r0.A00
            int r2 = r2 + 8
            r0.A00 = r2
            long r4 = r3.A0A()
        L_0x02c6:
            r0.A07 = r4
        L_0x02c8:
            long r7 = r0.A07
            int r12 = r0.A00
            long r5 = (long) r12
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x07db
            long r3 = r1.A02
            long r1 = r3 - r5
            int r6 = r0.A01
            r5 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r6 != r5) goto L_0x031e
            android.util.SparseArray r12 = r0.A0C
            int r11 = r12.size()
            r10 = 0
        L_0x02e3:
            if (r10 >= r11) goto L_0x041b
            java.lang.Object r5 = r12.valueAt(r10)
            X.CkK r5 = (X.C25689CkK) r5
            X.CUJ r5 = r5.A07
            r5.A02 = r1
            r5.A03 = r1
            int r10 = r10 + 1
            goto L_0x02e3
        L_0x02f4:
            r5 = 0
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x02c8
            long r4 = r1.A04
            r6 = -1
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0312
            java.util.ArrayDeque r3 = r0.A0Q
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x0312
            java.lang.Object r2 = r3.peek()
            X.BOi r2 = (X.C22769BOi) r2
            long r4 = r2.A00
        L_0x0312:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x02c8
            long r2 = r1.A02
            long r4 = r4 - r2
            int r2 = r0.A00
            long r2 = (long) r2
            long r4 = r4 + r2
            goto L_0x02c6
        L_0x031e:
            r13 = 1835295092(0x6d646174, float:4.4175247E27)
            r5 = 0
            if (r6 != r13) goto L_0x0366
            r0.A0D = r5
            long r7 = r7 + r1
            r0.A09 = r7
            boolean r3 = r0.A0G
            if (r3 != 0) goto L_0x0341
            X.D9O r6 = r0.A0E
            long r4 = r0.A08
            X.D8x r3 = new X.D8x
            r3.<init>(r4, r1)
            r6.A07 = r3
            android.os.Handler r2 = r6.A0O
            java.lang.Runnable r1 = r6.A0U
            r2.post(r1)
            r0.A0G = r11
        L_0x0341:
            r1 = 2
            goto L_0x0346
        L_0x0343:
            if (r4 != 0) goto L_0x034a
            r1 = 3
        L_0x0346:
            r0.A02 = r1
            goto L_0x0000
        L_0x034a:
            long r2 = r1.A02
            long r5 = r5 - r2
            int r0 = (int) r5
            if (r0 < 0) goto L_0x07bf
            r1.A02(r0)
            X.CUJ r5 = r4.A07
            X.Cui r4 = r5.A0F
            byte[] r3 = r4.A02
            int r2 = r4.A00
            r0 = 0
            r1.A05(r3, r0, r2, r0)
            r4.A0I(r0)
            r5.A08 = r0
            goto L_0x0000
        L_0x0366:
            r1 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r6 == r1) goto L_0x041b
            r1 = 1953653099(0x7472616b, float:7.681346E31)
            if (r6 == r1) goto L_0x041b
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r6 == r1) goto L_0x041b
            r1 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r6 == r1) goto L_0x041b
            r1 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r6 == r1) goto L_0x041b
            r1 = 1953653094(0x74726166, float:7.6813435E31)
            if (r6 == r1) goto L_0x041b
            r1 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r6 == r1) goto L_0x041b
            r1 = 1701082227(0x65647473, float:6.742798E22)
            if (r6 == r1) goto L_0x041b
            r1 = 1751411826(0x68646c72, float:4.3148E24)
            if (r6 == r1) goto L_0x03f3
            r1 = 1835296868(0x6d646864, float:4.418049E27)
            if (r6 == r1) goto L_0x03f3
            r1 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r6 == r1) goto L_0x03f3
            r1 = 1936286840(0x73696478, float:1.8491255E31)
            if (r6 == r1) goto L_0x03f3
            r1 = 1937011556(0x73747364, float:1.9367383E31)
            if (r6 == r1) goto L_0x03f3
            r1 = 1952867444(0x74666474, float:7.3014264E31)
            if (r6 == r1) goto L_0x03f3
            r1 = 1952868452(0x74666864, float:7.301914E31)
            if (r6 == r1) goto L_0x03f3
            r1 = 1953196132(0x746b6864, float:7.46037E31)
            if (r6 == r1) goto L_0x03f3
            r1 = 1953654136(0x74726578, float:7.6818474E31)
            if (r6 == r1) goto L_0x03f3
            r1 = 1953658222(0x7472756e, float:7.683823E31)
            if (r6 == r1) goto L_0x03f3
            r1 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 == r1) goto L_0x03f3
            r1 = 1935763834(0x7361697a, float:1.785898E31)
            if (r6 == r1) goto L_0x03f3
            r1 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r6 == r1) goto L_0x03f3
            r1 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r6 == r1) goto L_0x03f3
            r1 = 1970628964(0x75756964, float:3.1109627E32)
            if (r6 == r1) goto L_0x03f3
            r1 = 1935828848(0x73626770, float:1.7937577E31)
            if (r6 == r1) goto L_0x03f3
            r1 = 1936158820(0x73677064, float:1.8336489E31)
            if (r6 == r1) goto L_0x03f3
            r1 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r6 == r1) goto L_0x03f3
            r1 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r6 == r1) goto L_0x03f3
            r2 = 1701671783(0x656d7367, float:7.0083103E22)
            r1 = 0
            if (r6 != r2) goto L_0x03f4
        L_0x03f3:
            r1 = 1
        L_0x03f4:
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r1 == 0) goto L_0x0414
            if (r12 != r10) goto L_0x07cd
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x07c6
            int r1 = (int) r7
            X.Cui r3 = new X.Cui
            r3.<init>(r1)
            r0.A0F = r3
            X.Cui r1 = r0.A0L
            byte[] r2 = r1.A02
            byte[] r1 = r3.A02
            java.lang.System.arraycopy(r2, r9, r1, r9, r10)
        L_0x0410:
            r0.A02 = r11
            goto L_0x0000
        L_0x0414:
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x07d4
            r0.A0F = r5
            goto L_0x0410
        L_0x041b:
            long r3 = r3 + r7
            r1 = 8
            long r3 = r3 - r1
            java.util.ArrayDeque r2 = r0.A0Q
            X.BOi r1 = new X.BOi
            r1.<init>(r6, r3)
            r2.push(r1)
            long r7 = r0.A07
            int r1 = r0.A00
            long r5 = (long) r1
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0437
            r0.A01(r3)
            goto L_0x0000
        L_0x0437:
            r0.A02 = r9
            r0.A00 = r9
            goto L_0x0000
        L_0x043d:
            java.lang.String r0 = "Offset to end of mdat was negative."
            X.BxS r0 = X.C24215BxS.A00(r0)
            throw r0
        L_0x0444:
            X.CUJ r2 = r10.A07
            long[] r3 = r2.A0C
            int r2 = r10.A02
            r6 = r3[r2]
            long r2 = r1.A02
            long r6 = r6 - r2
            int r2 = (int) r6
            if (r2 >= 0) goto L_0x045a
            java.lang.String r3 = "FragmentedMp4Extractor"
            java.lang.String r2 = "Ignoring negative offset to sample data."
            android.util.Log.w(r3, r2)
            r2 = 0
        L_0x045a:
            r1.A02(r2)
            r0.A0D = r10
        L_0x045f:
            X.CUJ r2 = r10.A07
            int[] r2 = r2.A09
            int r6 = r10.A01
            r3 = r2[r6]
            r0.A06 = r3
            int r2 = r10.A03
            if (r6 >= r2) goto L_0x04bc
            r1.A02(r3)
            X.CkK r2 = r0.A0D
            X.CSG r1 = X.C25689CkK.A00(r2)
            if (r1 == 0) goto L_0x0498
            X.CUJ r5 = r2.A07
            X.Cui r3 = r5.A0F
            int r1 = r1.A00
            if (r1 == 0) goto L_0x0483
            r3.A0J(r1)
        L_0x0483:
            int r2 = r2.A01
            boolean r1 = r5.A07
            if (r1 == 0) goto L_0x0498
            boolean[] r1 = r5.A0D
            boolean r1 = r1[r2]
            if (r1 == 0) goto L_0x0498
            int r1 = r3.A06()
            int r1 = r1 * 6
            r3.A0J(r1)
        L_0x0498:
            X.CkK r5 = r0.A0D
            int r1 = r5.A01
            int r1 = r1 + 1
            r5.A01 = r1
            int r1 = r5.A00
            int r3 = r1 + 1
            r5.A00 = r3
            X.CUJ r1 = r5.A07
            int[] r1 = r1.A0A
            int r2 = r5.A02
            r1 = r1[r2]
            if (r3 != r1) goto L_0x04b8
            int r1 = r2 + 1
            r5.A02 = r1
            r5.A00 = r4
            r0.A0D = r9
        L_0x04b8:
            r0.A02 = r8
            goto L_0x07b0
        L_0x04bc:
            X.CU2 r2 = r10.A05
            int r2 = r2.A02
            if (r2 != r5) goto L_0x04ca
            r2 = 8
            int r3 = r3 - r2
            r0.A06 = r3
            r1.A02(r2)
        L_0x04ca:
            X.CkK r7 = r0.A0D
            X.CSG r2 = X.C25689CkK.A00(r7)
            if (r2 != 0) goto L_0x06ba
            r2 = 0
        L_0x04d3:
            r0.A04 = r2
            int r3 = r0.A06
            int r3 = r3 + r2
            r0.A06 = r3
            r0.A02 = r11
            r0.A05 = r4
        L_0x04de:
            X.CkK r3 = r0.A0D
            X.CUJ r2 = r3.A07
            r28 = r2
            X.CU2 r2 = r3.A05
            r27 = r2
            X.E8z r9 = r3.A06
            int r2 = r3.A01
            r19 = r2
            r2 = r28
            long[] r2 = r2.A0B
            r25 = r2[r19]
            r2 = r27
            int r2 = r2.A01
            if (r2 == 0) goto L_0x071b
            X.Cui r10 = r0.A0N
            byte[] r8 = r10.A02
            r8[r4] = r4
            r8[r5] = r4
            r8[r12] = r4
            int r18 = r2 + 1
            int r17 = 4 - r2
        L_0x0508:
            int r2 = r0.A04
            int r6 = r0.A06
            if (r2 >= r6) goto L_0x072c
            int r3 = r0.A05
            if (r3 != 0) goto L_0x0569
            r3 = r17
            r2 = r18
            r1.A05(r8, r3, r2, r4)
            int r2 = X.C26207Cui.A02(r10, r4)
            if (r2 < r5) goto L_0x0711
            int r2 = r2 + -1
            r0.A05 = r2
            X.Cui r2 = r0.A0O
            r2.A0I(r4)
            r9.CGY(r2, r11)
            r9.CGY(r10, r5)
            X.E8z[] r2 = r0.A0I
            int r2 = r2.length
            if (r2 <= 0) goto L_0x0567
            r2 = r27
            X.D48 r2 = r2.A07
            java.lang.String r6 = r2.A0S
            byte r7 = r8[r11]
            java.lang.String r2 = "video/avc"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0548
            r3 = r7 & 31
            r2 = 6
            if (r3 == r2) goto L_0x0557
        L_0x0548:
            java.lang.String r2 = "video/hevc"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0567
            r3 = r7 & 126(0x7e, float:1.77E-43)
            int r3 = r3 >> r5
            r2 = 39
            if (r3 != r2) goto L_0x0567
        L_0x0557:
            r2 = 1
        L_0x0558:
            r0.A0H = r2
            int r2 = r0.A04
            int r2 = r2 + 5
            r0.A04 = r2
            int r2 = r0.A06
            int r2 = r2 + r17
            r0.A06 = r2
            goto L_0x0508
        L_0x0567:
            r2 = 0
            goto L_0x0558
        L_0x0569:
            boolean r2 = r0.A0H
            if (r2 == 0) goto L_0x06a7
            X.Cui r7 = r0.A0M
            r7.A0G(r3)
            byte[] r2 = r7.A02
            r11 = 0
            r1.A05(r2, r4, r3, r4)
            int r2 = r0.A05
            r9.CGY(r7, r2)
            int r6 = r0.A05
            byte[] r12 = r7.A02
            int r4 = r7.A00
            java.lang.Object r16 = X.C24727CHp.A01
            monitor-enter(r16)
            r15 = 0
            r5 = 0
            r13 = 0
        L_0x0589:
            if (r5 < r4) goto L_0x05a7
            int r4 = r4 - r13
            r5 = 0
            r3 = 0
        L_0x058e:
            if (r5 >= r13) goto L_0x05d8
            int[] r2 = X.C24727CHp.A00     // Catch:{ all -> 0x0718 }
            r2 = r2[r5]     // Catch:{ all -> 0x0718 }
            int r2 = r2 - r3
            java.lang.System.arraycopy(r12, r3, r12, r11, r2)     // Catch:{ all -> 0x0718 }
            int r11 = r11 + r2
            int r14 = r11 + 1
            r12[r11] = r15     // Catch:{ all -> 0x0718 }
            int r11 = r14 + 1
            r12[r14] = r15     // Catch:{ all -> 0x0718 }
            int r2 = r2 + 3
            int r3 = r3 + r2
            int r5 = r5 + 1
            goto L_0x058e
        L_0x05a7:
            int r2 = r4 + -2
            if (r5 >= r2) goto L_0x05c0
            byte r2 = r12[r5]     // Catch:{ all -> 0x0718 }
            if (r2 != 0) goto L_0x05bd
            int r2 = r5 + 1
            byte r2 = r12[r2]     // Catch:{ all -> 0x0718 }
            if (r2 != 0) goto L_0x05bd
            int r2 = r5 + 2
            byte r3 = r12[r2]     // Catch:{ all -> 0x0718 }
            r2 = 3
            if (r3 != r2) goto L_0x05bd
            goto L_0x05c1
        L_0x05bd:
            int r5 = r5 + 1
            goto L_0x05a7
        L_0x05c0:
            r5 = r4
        L_0x05c1:
            if (r5 >= r4) goto L_0x0589
            int[] r3 = X.C24727CHp.A00     // Catch:{ all -> 0x0718 }
            int r2 = r3.length     // Catch:{ all -> 0x0718 }
            if (r2 > r13) goto L_0x05d0
            int r2 = r2 * 2
            int[] r3 = java.util.Arrays.copyOf(r3, r2)     // Catch:{ all -> 0x0718 }
            X.C24727CHp.A00 = r3     // Catch:{ all -> 0x0718 }
        L_0x05d0:
            int r2 = r13 + 1
            r3[r13] = r5     // Catch:{ all -> 0x0718 }
            int r5 = r5 + 3
            r13 = r2
            goto L_0x0589
        L_0x05d8:
            int r2 = r4 - r11
            java.lang.System.arraycopy(r12, r3, r12, r11, r2)     // Catch:{ all -> 0x0718 }
            monitor-exit(r16)     // Catch:{ all -> 0x0718 }
            r2 = r27
            X.D48 r2 = r2.A07
            java.lang.String r3 = r2.A0S
            java.lang.String r2 = "video/hevc"
            boolean r2 = r2.equals(r3)
            r7.A0I(r2)
            r7.A0H(r4)
            X.E8z[] r2 = r0.A0I
            r16 = r2
        L_0x05f4:
            int r11 = r7.A00
            int r2 = r7.A01
            int r2 = r11 - r2
            r13 = 1
            if (r2 <= r13) goto L_0x06ab
            r4 = 0
        L_0x05fe:
            int r2 = r7.A01
            int r2 = r11 - r2
            if (r2 != 0) goto L_0x069c
            r4 = -1
        L_0x0605:
            r12 = 0
        L_0x0606:
            int r2 = r7.A01
            int r2 = r11 - r2
            if (r2 != 0) goto L_0x0691
            r12 = -1
        L_0x060d:
            int r3 = r7.A01
            int r5 = r3 + r12
            r2 = -1
            if (r12 == r2) goto L_0x0683
            int r11 = r11 - r3
            if (r12 > r11) goto L_0x0683
            r2 = 4
            if (r4 != r2) goto L_0x068c
            r2 = 8
            if (r12 < r2) goto L_0x068c
            int r15 = r7.A04()
            int r12 = r7.A06()
            r11 = 49
            if (r12 != r11) goto L_0x0681
            int r4 = r7.A03()
        L_0x062e:
            int r14 = r7.A04()
            r3 = 47
            if (r12 != r3) goto L_0x0639
            r7.A0J(r13)
        L_0x0639:
            r2 = 181(0xb5, float:2.54E-43)
            if (r15 != r2) goto L_0x0645
            if (r12 == r11) goto L_0x0641
            if (r12 != r3) goto L_0x0645
        L_0x0641:
            r2 = 3
            r3 = 1
            if (r14 == r2) goto L_0x0646
        L_0x0645:
            r3 = 0
        L_0x0646:
            if (r12 != r11) goto L_0x064f
            r2 = 1195456820(0x47413934, float:49465.203)
            if (r4 == r2) goto L_0x064e
            r13 = 0
        L_0x064e:
            r3 = r3 & r13
        L_0x064f:
            if (r3 == 0) goto L_0x068c
            int r3 = r7.A04()
            r2 = r3 & 64
            if (r2 == 0) goto L_0x068c
            r3 = r3 & 31
            r2 = 1
            r7.A0J(r2)
            int r12 = r3 * 3
            int r11 = r7.A01
            r2 = r16
            int r4 = r2.length
            r3 = 0
        L_0x0667:
            if (r3 >= r4) goto L_0x068c
            r2 = r16[r3]
            r7.A0I(r11)
            r2.CGY(r7, r12)
            r24 = 0
            r21 = 0
            r22 = 1
            r20 = r2
            r23 = r12
            r20.CGa(r21, r22, r23, r24, r25)
            int r3 = r3 + 1
            goto L_0x0667
        L_0x0681:
            r4 = 0
            goto L_0x062e
        L_0x0683:
            java.lang.String r3 = "CeaUtil"
            java.lang.String r2 = "Skipping remainder of malformed SEI NAL unit."
            android.util.Log.w(r3, r2)
            int r5 = r7.A00
        L_0x068c:
            r7.A0I(r5)
            goto L_0x05f4
        L_0x0691:
            int r3 = r7.A04()
            int r12 = r12 + r3
            r2 = 255(0xff, float:3.57E-43)
            if (r3 == r2) goto L_0x0606
            goto L_0x060d
        L_0x069c:
            int r3 = r7.A04()
            int r4 = r4 + r3
            r2 = 255(0xff, float:3.57E-43)
            if (r3 == r2) goto L_0x05fe
            goto L_0x0605
        L_0x06a7:
            int r6 = r9.CGZ(r1, r3)
        L_0x06ab:
            int r2 = r0.A04
            int r2 = r2 + r6
            r0.A04 = r2
            int r2 = r0.A05
            int r2 = r2 - r6
            r0.A05 = r2
            r11 = 4
            r5 = 1
            r4 = 0
            goto L_0x0508
        L_0x06ba:
            int r8 = r2.A00
            if (r8 == 0) goto L_0x06ef
            X.CUJ r2 = r7.A07
            X.Cui r13 = r2.A0F
        L_0x06c2:
            X.CUJ r10 = r7.A07
            int r3 = r7.A01
            boolean r2 = r10.A07
            if (r2 == 0) goto L_0x06d1
            boolean[] r2 = r10.A0D
            boolean r2 = r2[r3]
            r9 = 1
            if (r2 != 0) goto L_0x06d2
        L_0x06d1:
            r9 = 0
        L_0x06d2:
            X.Cui r6 = r7.A09
            byte[] r3 = r6.A02
            r2 = 0
            if (r9 == 0) goto L_0x06db
            r2 = 128(0x80, float:1.794E-43)
        L_0x06db:
            X.BE6.A1N(r3, r2, r8, r4)
            r6.A0I(r4)
            X.E8z r7 = r7.A06
            r7.CGY(r6, r5)
            r7.CGY(r13, r8)
            if (r9 != 0) goto L_0x06fb
            int r2 = r8 + 1
            goto L_0x04d3
        L_0x06ef:
            byte[] r2 = r2.A04
            X.Cui r13 = r7.A08
            int r8 = r2.length
            r13.A02 = r2
            r13.A00 = r8
            r13.A01 = r4
            goto L_0x06c2
        L_0x06fb:
            X.Cui r6 = r10.A0F
            int r3 = r6.A06()
            r2 = -2
            r6.A0J(r2)
            int r2 = r3 * 6
            int r3 = r2 + 2
            r7.CGY(r6, r3)
            int r2 = r8 + 1
            int r2 = r2 + r3
            goto L_0x04d3
        L_0x0711:
            java.lang.String r0 = "Invalid NAL length"
            X.BxS r0 = X.C24215BxS.A00(r0)
            throw r0
        L_0x0718:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x0718 }
            throw r0
        L_0x071b:
            int r2 = r0.A04
            int r6 = r0.A06
            if (r2 >= r6) goto L_0x072c
            int r6 = r6 - r2
            int r3 = r9.CGZ(r1, r6)
            int r2 = r0.A04
            int r2 = r2 + r3
            r0.A04 = r2
            goto L_0x071b
        L_0x072c:
            r1 = r28
            boolean[] r1 = r1.A0E
            boolean r22 = r1[r19]
            X.CkK r3 = r0.A0D
            X.CSG r2 = X.C25689CkK.A00(r3)
            if (r2 == 0) goto L_0x078a
            r1 = 1073741824(0x40000000, float:2.0)
            r22 = r22 | r1
            X.CYq r7 = r2.A01
        L_0x0740:
            if (r3 == 0) goto L_0x0750
            X.CU2 r1 = r3.A05
            if (r1 == 0) goto L_0x0750
            X.D48 r1 = r1.A07
            java.lang.String r2 = r1.A0S
            java.lang.String r1 = "application/x-mp4-vtt"
            if (r2 != r1) goto L_0x0750
            r22 = r22 | 1
        L_0x0750:
            r3 = 0
            r20 = r9
            r21 = r7
            r23 = r6
            r24 = r4
            r20.CGa(r21, r22, r23, r24, r25)
        L_0x075c:
            java.util.ArrayDeque r2 = r0.A0R
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x078c
            java.lang.Object r2 = r2.removeFirst()
            X.CMj r2 = (X.C24841CMj) r2
            int r1 = r0.A03
            int r9 = r2.A00
            int r1 = r1 - r9
            r0.A03 = r1
            long r1 = r2.A01
            long r1 = r1 + r25
            X.E8z[] r8 = r0.A0J
            int r7 = r8.length
            r6 = 0
        L_0x0779:
            if (r6 >= r7) goto L_0x075c
            r10 = r8[r6]
            int r4 = r0.A03
            r11 = 0
            r12 = r5
            r13 = r9
            r14 = r4
            r15 = r1
            r10.CGa(r11, r12, r13, r14, r15)
            int r6 = r6 + 1
            goto L_0x0779
        L_0x078a:
            r7 = 0
            goto L_0x0740
        L_0x078c:
            X.CkK r5 = r0.A0D
            int r1 = r5.A01
            int r1 = r1 + 1
            r5.A01 = r1
            int r1 = r5.A00
            int r4 = r1 + 1
            r5.A00 = r4
            X.CUJ r1 = r5.A07
            int[] r1 = r1.A0A
            int r2 = r5.A02
            r1 = r1[r2]
            if (r4 != r1) goto L_0x07ad
            int r1 = r2 + 1
            r5.A02 = r1
            r5.A00 = r3
            r1 = 0
            r0.A0D = r1
        L_0x07ad:
            r1 = 3
            r0.A02 = r1
        L_0x07b0:
            r0 = 0
            return r0
        L_0x07b2:
            java.lang.String r0 = "Unhandled indirect reference"
            X.BxS r0 = X.C24215BxS.A00(r0)
            throw r0
        L_0x07b9:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        L_0x07bf:
            java.lang.String r0 = "Offset to encryption data was negative."
            X.BxS r0 = X.C24215BxS.A00(r0)
            throw r0
        L_0x07c6:
            java.lang.String r0 = "Leaf atom with length > 2147483647 (unsupported)."
            X.BxS r0 = X.C24215BxS.A00(r0)
            throw r0
        L_0x07cd:
            java.lang.String r0 = "Leaf atom defines extended atom size (unsupported)."
            X.BxS r0 = X.C24215BxS.A00(r0)
            throw r0
        L_0x07d4:
            java.lang.String r0 = "Skipping atom with length > 2147483647 (unsupported)."
            X.BxS r0 = X.C24215BxS.A00(r0)
            throw r0
        L_0x07db:
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            X.BxS r0 = X.C24215BxS.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26671D8u.CDJ(X.Cqw, X.CIy):int");
    }

    public void CH9(long j, long j2) {
        SparseArray sparseArray = this.A0C;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((C25689CkK) sparseArray.valueAt(i)).A01();
        }
        this.A0R.clear();
        this.A03 = 0;
        this.A0A = j2;
        this.A0Q.clear();
        this.A02 = 0;
        this.A00 = 0;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.Cui] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.Cui] */
    public C26671D8u() {
        byte[] bArr = C24727CHp.A02;
        ? obj = new Object();
        obj.A02 = bArr;
        obj.A00 = 4;
        this.A0O = obj;
        this.A0N = new C26207Cui(5);
        this.A0M = new C26207Cui();
        byte[] bArr2 = new byte[16];
        this.A0T = bArr2;
        ? obj2 = new Object();
        obj2.A02 = bArr2;
        obj2.A00 = 16;
        this.A0P = obj2;
        this.A0Q = new ArrayDeque();
        this.A0R = new ArrayDeque();
        this.A0C = BE6.A0Q();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A02 = 0;
        this.A00 = 0;
    }

    public static DUU A00(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C22768BOh bOh = (C22768BOh) list.get(i);
            if (bOh.A00 == 1886614376) {
                if (arrayList == null) {
                    arrayList = AnonymousClass000.A13();
                }
                byte[] bArr = bOh.A00.A02;
                CPA A002 = C85.A00(bArr);
                if (A002 == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C26556D3w((String) null, A002.A01, bArr));
                }
            }
        }
        if (arrayList != null) {
            return new DUU((String) null, (C26556D3w[]) arrayList.toArray(new C26556D3w[arrayList.size()]));
        }
        return null;
    }

    public void Bd7(D9O d9o) {
        this.A0E = d9o;
    }
}
