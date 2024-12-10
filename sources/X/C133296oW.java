package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.6oW  reason: invalid class name and case insensitive filesystem */
public final class C133296oW {
    public long A00;
    public long A01;
    public C1418377d A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public List A0N;
    public List A0O;
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

    public AnonymousClass725 A00() {
        if (TextUtils.isEmpty(this.A0E)) {
            this.A0E = this.A05;
        }
        if (TextUtils.isEmpty(this.A0G)) {
            this.A0G = this.A07;
        }
        if (TextUtils.isEmpty(this.A0I)) {
            this.A0I = this.A08;
        }
        if (TextUtils.isEmpty(this.A03)) {
            this.A03 = this.A04;
        }
        if (!this.A0Z) {
            C17960vV.A08(this.A0E, "sticker pack id cannot be null");
            C17960vV.A08(this.A0G, "sticker pack name cannot be null");
            C17960vV.A08(this.A0I, "sticker pack publisher cannot be null");
        }
        if (this.A0N == null) {
            this.A0N = AnonymousClass000.A13();
        }
        if (this.A0O == null) {
            this.A0O = AnonymousClass000.A13();
        }
        return new AnonymousClass725(this);
    }
}
