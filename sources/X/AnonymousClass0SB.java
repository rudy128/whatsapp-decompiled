package X;

/* renamed from: X.0SB  reason: invalid class name */
public class AnonymousClass0SB implements C004301w {
    public final /* synthetic */ AnonymousClass03I A00;

    public AnonymousClass0SB(AnonymousClass03I r1) {
        this.A00 = r1;
    }

    public void Bp9(C003301m r3, boolean z) {
        if (r3 instanceof AnonymousClass068) {
            r3.A06().A0a(false);
        }
        C004301w A08 = this.A00.A08();
        if (A08 != null) {
            A08.Bp9(r3, z);
        }
    }

    public boolean Bzb(C003301m r4) {
        AnonymousClass03I r2 = this.A00;
        if (r4 == r2.A05) {
            return false;
        }
        r2.A00 = ((AnonymousClass068) r4).getItem().getItemId();
        C004301w A08 = r2.A08();
        if (A08 != null) {
            return A08.Bzb(r4);
        }
        return false;
    }
}
