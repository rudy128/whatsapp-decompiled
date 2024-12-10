package X;

/* renamed from: X.BeG  reason: case insensitive filesystem */
public final class C23266BeG extends DRw {
    public C23267BeH A00;
    public final C23267BeH A01;

    public static void A00(C23266BeG beG) {
        C23267BeH beH = beG.A00;
        if ((beH.zzd & Integer.MIN_VALUE) != 0) {
            C25658Cjo.A02.A00(beH.getClass()).CTb(beH);
            beH.zzd &= Integer.MAX_VALUE;
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C23266BeG beG = new C23266BeG(C23273BeN.zzb);
        A00(this);
        beG.A00 = this.A00;
        return beG;
    }

    public C23266BeG(C23267BeH beH) {
        this.A01 = beH;
        if ((beH.zzd & Integer.MIN_VALUE) != 0) {
            throw AnonymousClass000.A0k("Default instance must be immutable.");
        }
        this.A00 = new C23273BeN();
    }

    public C23266BeG() {
        this(C23273BeN.zzb);
    }
}
