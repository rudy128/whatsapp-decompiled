package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;

/* renamed from: X.38M  reason: invalid class name */
public final class AnonymousClass38M implements C108635c2 {
    public String A00 = "";
    public final AnonymousClass118 A01;
    public final C18030ve A02;

    public void CJs(String str) {
        C18070vi.A0d(str, 0);
        this.A00 = str;
    }

    public String BXZ() {
        boolean A05 = C18020vd.A05(C18040vf.A02, this.A02, 455);
        AnonymousClass118 r1 = this.A01;
        int i = 2131890651;
        if (A05) {
            i = 2131890652;
        }
        String A012 = r1.A01(i);
        C18070vi.A0b(A012);
        return A012;
    }

    public AnonymousClass38M(AnonymousClass118 r2, C18030ve r3) {
        C18070vi.A0j(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
    }

    public /* synthetic */ List BMb() {
        return C18460wS.A00;
    }

    public String BTj() {
        return "account_report";
    }

    public String BWD() {
        return "request_account_info";
    }

    public String BWI() {
        return this.A00;
    }

    public int Bac() {
        return 2;
    }

    public /* synthetic */ View BbT(View view) {
        return null;
    }

    public /* synthetic */ boolean BgM() {
        return false;
    }

    public /* synthetic */ boolean Bh4() {
        return true;
    }

    public /* synthetic */ boolean CLm() {
        return true;
    }

    public /* synthetic */ Drawable getIcon() {
        return null;
    }
}
