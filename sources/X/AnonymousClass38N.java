package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;

/* renamed from: X.38N  reason: invalid class name */
public final class AnonymousClass38N implements C108635c2 {
    public String A00 = "";
    public final C19880zA A01;
    public final AnonymousClass118 A02;

    public View BbT(View view) {
        C18070vi.A0d(view, 0);
        return view.findViewById(2131428575);
    }

    public void CJs(String str) {
        C18070vi.A0d(str, 0);
        this.A00 = str;
    }

    public String BXZ() {
        this.A01.A03();
        throw AnonymousClass000.A0s("getSmbBusinessTitleStringId");
    }

    public Drawable getIcon() {
        return C24261Jm.A00(this.A02.A00, 2131232334);
    }

    public AnonymousClass38N(C19880zA r2, AnonymousClass118 r3) {
        C18070vi.A0j(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
    }

    public /* synthetic */ List BMb() {
        return C18460wS.A00;
    }

    public String BTj() {
        return "business_tools";
    }

    public String BWD() {
        return "";
    }

    public String BWI() {
        return this.A00;
    }

    public int Bac() {
        return 1;
    }

    public /* synthetic */ boolean BgM() {
        return false;
    }

    public boolean Bh4() {
        return false;
    }

    public /* synthetic */ boolean CLm() {
        return true;
    }
}
