package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;

public final class D9M implements C28649ECi, C28648ECh {
    public C28648ECh A00;
    public C28601E9s A01 = new D9W(new C28601E9s[0]);
    public C26539D3a A02;
    public C28649ECi[] A03;
    public final C28649ECi[] A04;
    public final C88 A05;
    public final ArrayList A06 = AnonymousClass000.A13();
    public final IdentityHashMap A07 = new IdentityHashMap();

    public void BEV(long j) {
        ArrayList arrayList = this.A06;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C28601E9s) arrayList.get(i)).BEV(j);
            }
            return;
        }
        this.A01.BEV(j);
    }

    public boolean BFn(long j, long j2) {
        ArrayList arrayList = this.A06;
        if (arrayList.isEmpty()) {
            return this.A01.BFn(j, j2);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C28649ECi) arrayList.get(i)).BFn(j, j2);
        }
        return false;
    }

    public void BIl(long j, boolean z) {
        for (C28649ECi BIl : this.A03) {
            BIl.BIl(j, z);
        }
    }

    public long BMc(C25721Ckr ckr, long j) {
        return this.A03[0].BMc(ckr, j);
    }

    public long BNp(long j) {
        return this.A01.BNp(j);
    }

    public long BNq() {
        return this.A01.BNq();
    }

    public long BVO() {
        return this.A01.BVO();
    }

    public C26539D3a Bag() {
        return this.A02;
    }

    public void BjV() {
        C28649ECi[] eCiArr = this.A04;
        int i = 0;
        do {
            eCiArr[i].BjV();
            i++;
        } while (i < 2);
    }

    public /* bridge */ /* synthetic */ void BqD(C28601E9s e9s) {
        this.A00.BqD(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: X.D3X[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C1a(X.C28649ECi r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = r10.A06
            r0.remove(r11)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x004a
            X.ECi[] r9 = r10.A04
            r8 = 2
            r2 = 0
            r1 = 0
        L_0x0010:
            r0 = r9[r2]
            X.D3a r0 = r0.Bag()
            int r0 = r0.A01
            int r1 = r1 + r0
            int r2 = r2 + 1
            if (r2 < r8) goto L_0x0010
            X.D3X[] r7 = new X.D3X[r1]
            r6 = 0
            r5 = 0
        L_0x0021:
            r0 = r9[r6]
            X.D3a r4 = r0.Bag()
            int r3 = r4.A01
            r2 = 0
        L_0x002a:
            if (r2 >= r3) goto L_0x003a
            int r1 = r5 + 1
            X.1IX r0 = r4.A02
            java.lang.Object r0 = r0.get(r2)
            r7[r5] = r0
            int r2 = r2 + 1
            r5 = r1
            goto L_0x002a
        L_0x003a:
            int r6 = r6 + 1
            if (r6 < r8) goto L_0x0021
            X.D3a r0 = new X.D3a
            r0.<init>(r7)
            r10.A02 = r0
            X.ECh r0 = r10.A00
            r0.C1a(r10)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D9M.C1a(X.ECi):void");
    }

    public void CCK(C28648ECh eCh, long j) {
        this.A00 = eCh;
        ArrayList arrayList = this.A06;
        C28649ECi[] eCiArr = this.A04;
        Collections.addAll(arrayList, eCiArr);
        int i = 0;
        do {
            eCiArr[i].CCK(this, j);
            i++;
        } while (i < 2);
    }

    public long CDQ() {
        C28649ECi[] eCiArr = this.A04;
        long CDQ = eCiArr[0].CDQ();
        char c = 1;
        while (c < 2) {
            if (eCiArr[c].CDQ() == -9223372036854775807L) {
                c = 2;
            } else {
                throw AnonymousClass000.A0n("Child reported discontinuity.");
            }
        }
        if (CDQ != -9223372036854775807L) {
            C28649ECi[] eCiArr2 = this.A03;
            int length = eCiArr2.length;
            int i = 0;
            while (i < length) {
                C28649ECi eCi = eCiArr2[i];
                if (eCi == eCiArr[0] || eCi.CHB(CDQ, false) == CDQ) {
                    i++;
                } else {
                    throw AnonymousClass000.A0n("Unexpected child seekToUs result.");
                }
            }
        }
        return CDQ;
    }

    public long CHB(long j, boolean z) {
        long CHB = this.A03[0].CHB(j, z);
        int i = 1;
        while (true) {
            C28649ECi[] eCiArr = this.A03;
            if (i >= eCiArr.length) {
                return CHB;
            }
            if (eCiArr[i].CHB(CHB, z) == CHB) {
                i++;
            } else {
                throw AnonymousClass000.A0n("Unexpected child seekToUs result.");
            }
        }
    }

    public long CHG(E90[] e90Arr, C28650ECj[] eCjArr, boolean[] zArr, boolean[] zArr2, long j) {
        E90[] e90Arr2;
        E90 e90;
        int A0D;
        long j2 = j;
        int length = eCjArr.length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        int i = 0;
        while (true) {
            e90Arr2 = e90Arr;
            if (i >= length) {
                break;
            }
            E90 e902 = e90Arr[i];
            if (e902 == null) {
                A0D = -1;
            } else {
                A0D = BE9.A0D(e902, this.A07);
            }
            iArr[i] = A0D;
            iArr2[i] = -1;
            C26679D9c d9c = eCjArr[i];
            if (d9c != null) {
                D3X d3x = d9c.A02;
                int i2 = 0;
                while (true) {
                    C28649ECi[] eCiArr = this.A04;
                    if (i2 >= 2) {
                        break;
                    } else if (eCiArr[i2].Bag().A02.indexOf(d3x) >= 0) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            i++;
        }
        IdentityHashMap identityHashMap = this.A07;
        identityHashMap.clear();
        E90[] e90Arr3 = new E90[length];
        E90[] e90Arr4 = new E90[length];
        C28650ECj[] eCjArr2 = new C28650ECj[length];
        C28649ECi[] eCiArr2 = this.A04;
        ArrayList A0z = C17880vN.A0z(2);
        int i3 = 0;
        do {
            for (int i4 = 0; i4 < length; i4++) {
                C28650ECj eCj = null;
                if (iArr[i4] == i3) {
                    e90 = e90Arr[i4];
                } else {
                    e90 = null;
                }
                e90Arr4[i4] = e90;
                if (iArr2[i4] == i3) {
                    eCj = eCjArr[i4];
                }
                eCjArr2[i4] = eCj;
            }
            long CHG = eCiArr2[i3].CHG(e90Arr4, eCjArr2, zArr, zArr2, j2);
            if (i3 == 0) {
                j2 = CHG;
            } else if (CHG != j2) {
                throw AnonymousClass000.A0n("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < length; i5++) {
                boolean z2 = true;
                if (iArr2[i5] == i3) {
                    C26056CrS.A03(AnonymousClass000.A1W(e90Arr4[i5]));
                    e90Arr3[i5] = e90Arr4[i5];
                    C17890vO.A0z(e90Arr4[i5], identityHashMap, i3);
                    z = true;
                } else if (iArr[i5] == i3) {
                    if (e90Arr4[i5] != null) {
                        z2 = false;
                    }
                    C26056CrS.A03(z2);
                }
            }
            if (z) {
                A0z.add(eCiArr2[i3]);
            }
            i3++;
        } while (i3 < 2);
        System.arraycopy(e90Arr3, 0, e90Arr2, 0, length);
        C28649ECi[] eCiArr3 = new C28649ECi[A0z.size()];
        this.A03 = eCiArr3;
        A0z.toArray(eCiArr3);
        this.A01 = new D9W(this.A03);
        return j2;
    }

    public void CK0(boolean z) {
        ArrayList arrayList = this.A06;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C28601E9s) arrayList.get(i)).CK0(z);
            }
            return;
        }
        this.A01.CK0(z);
    }

    public void CQr(byte b, boolean z) {
        ArrayList arrayList = this.A06;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C28601E9s) arrayList.get(i)).CQr(b, z);
            }
            return;
        }
        this.A01.CQr(b, z);
    }

    public D9M(C88 c88, C28649ECi... eCiArr) {
        this.A05 = c88;
        this.A04 = eCiArr;
    }
}
