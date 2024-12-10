package X;

/* renamed from: X.36v  reason: invalid class name and case insensitive filesystem */
public class C693436v implements AnonymousClass229 {
    public boolean A00;
    public int[] A01;
    public byte[] A02;
    public final AnonymousClass21V A03;
    public transient boolean A04;

    public synchronized void A01() {
        this.A01 = null;
        this.A02 = null;
        AnonymousClass21V r2 = this.A03;
        AnonymousClass206.A00(r2).A0R = false;
        this.A00 = true;
        r2.A0C.A00();
    }

    public synchronized void A02(byte[] bArr, int[] iArr) {
        AnonymousClass21V r2;
        if (iArr != null) {
            this.A01 = iArr;
        }
        if (bArr != null && bArr.length > 0) {
            r2 = this.A03;
            if (!r2.A0w() && ((r2 instanceof AnonymousClass21Y) || (r2 instanceof C440922c) || this.A01 != null)) {
                AnonymousClass206.A00(r2).A0R = true;
                this.A02 = bArr;
                r2.A0C.A00();
            }
        }
        r2 = this.A03;
        AnonymousClass206.A00(r2).A0R = false;
        bArr = null;
        this.A02 = bArr;
        r2.A0C.A00();
    }

    public synchronized void A03(byte[] bArr, int[] iArr) {
        if (!this.A03.A0C.A03) {
            A02(bArr, iArr);
        }
    }

    public synchronized void A04(byte[] bArr, int[] iArr) {
        A02(bArr, iArr);
        this.A00 = true;
    }

    public synchronized byte[] A06() {
        return this.A02;
    }

    public synchronized int[] A07() {
        return this.A01;
    }

    public boolean A05() {
        return AnonymousClass206.A00(this.A03).A0R;
    }

    public C693436v(AnonymousClass21V r1) {
        this.A03 = r1;
    }

    public static boolean A00(C26551So r2) {
        if (C63972u0.A08(r2) || r2 == C26551So.A0p || r2 == C26551So.A0E || r2 == C26551So.A0t || r2 == C26551So.A0K || r2 == C26551So.A0o || r2 == C26551So.A0h || r2 == C26551So.A0H || r2 == C26551So.A0J || r2 == C26551So.A0I || r2 == C26551So.A09 || r2 == C26551So.A0Q || r2 == C26551So.A0R || r2 == C26551So.A0A || r2 == C26551So.A0V) {
            return true;
        }
        return false;
    }
}
