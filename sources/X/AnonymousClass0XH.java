package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0XH  reason: invalid class name */
public final class AnonymousClass0XH implements C17530uo, C17510um {
    public final AnonymousClass0Jo A00;
    public final C16610si A01;
    public final C17520un A02;
    public final HashMap A03 = new HashMap();

    public float BQU() {
        return this.A02.BQU();
    }

    public float BRu() {
        return this.A02.BRu();
    }

    public boolean BfO() {
        return this.A02.BfO();
    }

    public C16820tH BhL(Map map, C22821Di r3, int i, int i2) {
        return this.A02.BhL(map, r3, i, i2);
    }

    public int CG9(float f) {
        return this.A02.CG9(f);
    }

    public float CPP(long j) {
        return this.A02.CPP(j);
    }

    public float CPQ(float f) {
        return this.A02.CPQ(f);
    }

    public C24246By4 getLayoutDirection() {
        return this.A02.getLayoutDirection();
    }

    public List BjY(int i, long j) {
        HashMap hashMap = this.A03;
        Integer valueOf = Integer.valueOf(i);
        List list = (List) hashMap.get(valueOf);
        ArrayList arrayList = list;
        if (list == null) {
            C16610si r0 = this.A01;
            Object BTi = r0.BTi(i);
            List COj = this.A02.COj(BTi, this.A00.A02(BTi, ((AnonymousClass0V1) r0).A01.A00(i), i));
            int size = COj.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                AnonymousClass001.A1T(arrayList2, COj, i2, j);
            }
            hashMap.put(valueOf, arrayList2);
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public float CPE(long j) {
        return this.A02.CPE(j);
    }

    public float CPF(float f) {
        return this.A02.CPF(f);
    }

    public float CPG(int i) {
        return this.A02.CPG(i);
    }

    public long CPH(long j) {
        return this.A02.CPH(j);
    }

    public long CPT(long j) {
        return this.A02.CPT(j);
    }

    public long CPU(float f) {
        return this.A02.CPU(f);
    }

    public long CPV(float f) {
        return this.A02.CPV(f);
    }

    public AnonymousClass0XH(AnonymousClass0Jo r2, C17520un r3) {
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = (C16610si) r2.A01().invoke();
    }
}
