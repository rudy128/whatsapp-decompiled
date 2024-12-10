package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;

/* renamed from: X.38a  reason: invalid class name and case insensitive filesystem */
public final class C696538a implements C108635c2 {
    public String A00 = "";
    public final AnonymousClass11S A01;
    public final AnonymousClass118 A02;
    public final C18030ve A03;

    public View BbT(View view) {
        C18070vi.A0d(view, 0);
        return view.findViewById(2131435265);
    }

    public void CJs(String str) {
        C18070vi.A0d(str, 0);
        this.A00 = str;
    }

    public List BMb() {
        return C18070vi.A0L(this.A02, 2131895804);
    }

    public String BXZ() {
        return C18070vi.A0G(this.A02, 2131895803);
    }

    public boolean Bh4() {
        if (!this.A01.A0N()) {
            if (!C18020vd.A05(C18040vf.A02, this.A03, 1396)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Drawable getIcon() {
        return C24261Jm.A00(this.A02.A00, 2131232292);
    }

    public C696538a(AnonymousClass11S r2, AnonymousClass118 r3, C18030ve r4) {
        C18070vi.A0o(r3, r2, r4);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }

    public String BTj() {
        return "avatar";
    }

    public String BWD() {
        return "";
    }

    public String BWI() {
        return this.A00;
    }

    public int Bac() {
        return 22;
    }

    public /* synthetic */ boolean BgM() {
        return false;
    }

    public /* synthetic */ boolean CLm() {
        return true;
    }
}
