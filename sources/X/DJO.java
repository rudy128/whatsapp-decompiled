package X;

public final class DJO implements E9l {
    public final CB2 A00;
    public final C28454E1u A01;
    public final CB6 A02;

    public DJO(CB2 cb2, C28454E1u e1u, CB6 cb6) {
        this.A02 = cb6;
        this.A00 = cb2;
        this.A01 = e1u;
    }

    public final C23267BeH CTU() {
        if (this.A01 instanceof C23267BeH) {
            return new C23273BeN();
        }
        C23266BeG beG = new C23266BeG(C23273BeN.zzb);
        C23266BeG.A00(beG);
        return beG.A00;
    }

    public final void CTb(Object obj) {
        C26136Csz csz = ((C23267BeH) obj).zzc;
        if (csz.A01) {
            csz.A01 = false;
        }
        throw AnonymousClass000.A0s("zzb");
    }

    public final void CTf(C25571CiA ciA, Object obj, byte[] bArr, int i, int i2) {
        C23267BeH beH = (C23267BeH) obj;
        if (beH.zzc == C26136Csz.A04) {
            beH.zzc = C26136Csz.A00();
        }
        throw null;
    }

    public final boolean CTg(Object obj, Object obj2) {
        return BE8.A1S(((C23267BeH) obj).zzc.equals(((C23267BeH) obj2).zzc) ? 1 : 0);
    }

    public final int zza(Object obj) {
        return ((C23267BeH) obj).zzc.hashCode();
    }

    public final void CTd(Object obj, Object obj2) {
        C25451Cg2.A00(obj, obj2);
    }
}
