package X;

import android.graphics.Bitmap;
import android.util.Pair;
import com.whatsapp.jid.UserJid;

/* renamed from: X.70A  reason: invalid class name */
public class AnonymousClass70A {
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Bitmap A08;
    public Pair A09;
    public C106595Wl A0A = C92724hn.A00;
    public AnonymousClass4ZN A0B;
    public AnonymousClass4ZN A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public final AnonymousClass1E7 A0g;
    public final UserJid A0h;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass70A)) {
            return false;
        }
        AnonymousClass70A r5 = (AnonymousClass70A) obj;
        if (A00(this, r5)) {
            AnonymousClass1E7 r1 = r5.A0g;
            AnonymousClass1E7 r2 = this.A0g;
            return r1.equals(r2) && r1.A0B() == r2.A0B() && C42171xk.A00(r5.A09, this.A09) && r5.A0N == this.A0N && r5.A0J == this.A0J && r5.A0E == this.A0E && r5.A0O == this.A0O && r5.A0K == this.A0K && r5.A03 == this.A03 && r5.A0F == this.A0F && r5.A02 == this.A02 && r5.A0a == this.A0a && r5.A0S == this.A0S && r5.A0R == this.A0R && C42171xk.A00(r5.A0C, this.A0C) && r5.A0W == this.A0W && r5.A0b == this.A0b && r5.A0D == this.A0D && r5.A04 == this.A04 && C42171xk.A00(r5.A08, this.A08) && r5.A0T == this.A0T && r5.A0U == this.A0U && r5.A0V == this.A0V && r5.A0I == this.A0I && r5.A0e == this.A0e && r5.A0Q == this.A0Q && r5.A06 == this.A06 && r5.A0f == this.A0f && r5.A0H == this.A0H && r5.A0P == this.A0P && r5.A0c == this.A0c && r5.A0Z == this.A0Z && r5.A0Y == this.A0Y && r5.A07 == this.A07 && r5.A0M == this.A0M && r5.A0L == this.A0L && r5.A0d == this.A0d && r5.A05 == this.A05 && r5.A00 == this.A00 && r5.A0X == this.A0X && r5.A0A == this.A0A && r5.A0G == this.A0G && r5.A0B == this.A0B && r5.A01 == this.A01;
        }
    }

    public static boolean A00(AnonymousClass70A r1, AnonymousClass70A r2) {
        return r1.A0h.equals(r2.A0h);
    }

    public boolean A01() {
        Pair pair = this.A09;
        if (C108965cb.A01(pair) != -1 || C108965cb.A00(pair) == -1) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((AnonymousClass000.A0N(this.A09, AnonymousClass000.A0N(this.A0g, AnonymousClass000.A0N(this.A0h, 217))) + (this.A0N ? 1 : 0)) * 31) + (this.A0J ? 1 : 0)) * 31) + (this.A0E ? 1 : 0)) * 31) + (this.A0O ? 1 : 0)) * 31) + (this.A0K ? 1 : 0)) * 31) + this.A03) * 31) + (this.A0F ? 1 : 0)) * 31) + this.A02) * 31) + (this.A0a ? 1 : 0)) * 31) + (this.A0S ? 1 : 0)) * 31) + (this.A0R ? 1 : 0)) * 31) + AnonymousClass001.A0k(this.A0C)) * 31) + (this.A0W ? 1 : 0)) * 31) + (this.A0b ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + this.A04) * 31) + AnonymousClass001.A0k(this.A08)) * 31) + (this.A0T ? 1 : 0)) * 31) + (this.A0U ? 1 : 0)) * 31) + (this.A0V ? 1 : 0)) * 31) + (this.A0I ? 1 : 0)) * 31) + (this.A0e ? 1 : 0)) * 31) + (this.A0Q ? 1 : 0)) * 31) + (this.A0f ? 1 : 0)) * 31) + this.A06) * 31) + (this.A0H ? 1 : 0)) * 31) + (this.A0P ? 1 : 0)) * 31) + (this.A0c ? 1 : 0)) * 31) + (this.A0Z ? 1 : 0)) * 31) + (this.A0Y ? 1 : 0)) * 31) + this.A07) * 31) + (this.A0M ? 1 : 0)) * 31) + (this.A0L ? 1 : 0)) * 31) + (this.A0d ? 1 : 0)) * 31) + this.A05) * 31) + AnonymousClass001.A0k(Float.valueOf(this.A00))) * 31) + (this.A0X ? 1 : 0)) * 31) + AnonymousClass001.A0k(this.A0A)) * 31) + (this.A0G ? 1 : 0)) * 31) + AnonymousClass001.A0k(this.A0B)) * 31) + AnonymousClass001.A0k(Float.valueOf(this.A01));
    }

    public final String toString() {
        return this.A0h.toString();
    }

    public AnonymousClass70A(AnonymousClass1E7 r2, UserJid userJid) {
        this.A0h = userJid;
        this.A0g = r2;
    }
}
