package X;

import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.ClA  reason: case insensitive filesystem */
public final class C25740ClA {
    public static final C25740ClA A07 = new C25740ClA(new Object(), new Object(), (BOI) null, C25099CXs.A00, "");
    public final C6C A00;
    @Deprecated
    public final BOH A01;
    public final C25094CXg A02;
    public final C25116CYp A03;
    @Deprecated
    public final BOI A04;
    public final C25099CXs A05;
    public final String A06;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.BOH, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.CXg, java.lang.Object] */
    static {
        new Object();
        new Object();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25740ClA)) {
            return false;
        }
        C25740ClA clA = (C25740ClA) obj;
        return Util.A0D(this.A06, clA.A06) && this.A00.equals(clA.A00) && Util.A0D(this.A03, clA.A03) && Util.A0D(this.A02, clA.A02) && Util.A0D(this.A05, clA.A05);
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A05, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0N(this.A02, (C17880vN.A03(this.A06) + AnonymousClass001.A0l(this.A03)) * 31)));
    }

    public C25740ClA(BOH boh, C25094CXg cXg, BOI boi, C25099CXs cXs, String str) {
        this.A06 = str;
        this.A03 = boi;
        this.A04 = boi;
        this.A02 = cXg;
        this.A05 = cXs;
        this.A00 = boh;
        this.A01 = boh;
    }
}
