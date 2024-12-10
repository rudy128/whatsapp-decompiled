package X;

public final class DKC implements EAD {
    public final CBH A00;
    public final C28663EDa A01;
    public final CBJ A02;

    public final Object CT0() {
        return ((C23469BhY) ((C23484Bho) this.A01).A06(5)).A02();
    }

    public final boolean CT5(Object obj, Object obj2) {
        return BE8.A1S(((C23484Bho) obj).zzb.equals(((C23484Bho) obj2).zzb) ? 1 : 0);
    }

    public final void CT7(E9H e9h, Object obj) {
        throw AnonymousClass000.A0s("zzc");
    }

    public final void CT8(C25572CiB ciB, Object obj, byte[] bArr, int i, int i2) {
        C23484Bho bho = (C23484Bho) obj;
        if (bho.zzb == C25840Cmu.A05) {
            bho.zzb = new C25840Cmu();
        }
        throw BE7.A0a();
    }

    public final void CTR(Object obj) {
        ((C23484Bho) obj).zzb.A02 = false;
        throw AnonymousClass000.A0s("zzc");
    }

    public final boolean CTY(Object obj) {
        throw AnonymousClass000.A0s("zzc");
    }

    public final int zza(Object obj) {
        return ((C23484Bho) obj).zzb.hashCode();
    }

    public final int zzb(Object obj) {
        C25840Cmu cmu = ((C23484Bho) obj).zzb;
        int i = cmu.A01;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < cmu.A00; i2++) {
                int i3 = cmu.A03[i2] >>> 3;
                boolean z = C23450BhF.A05;
                i += (BEB.A02(1 << 3) << 1) + 1 + BEB.A02(i3) + C23450BhF.A03((DSO) cmu.A04[i2], 3);
            }
            cmu.A01 = i;
        }
        return i;
    }

    public DKC(CBH cbh, C28663EDa eDa, CBJ cbj) {
        this.A02 = cbj;
        this.A00 = cbh;
        this.A01 = eDa;
    }

    public final void CTK(Object obj, Object obj2) {
        C26301CxE.A0S(obj, obj2);
    }
}
