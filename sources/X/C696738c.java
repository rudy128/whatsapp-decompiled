package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.List;

/* renamed from: X.38c  reason: invalid class name and case insensitive filesystem */
public final class C696738c implements C108635c2 {
    public String A00 = "";
    public final C19880zA A01;
    public final C19880zA A02;
    public final C19880zA A03;
    public final AnonymousClass11S A04;
    public final AnonymousClass118 A05;

    public View BbT(View view) {
        C18070vi.A0d(view, 0);
        return view.findViewById(2131434037);
    }

    public void CJs(String str) {
        C18070vi.A0d(str, 0);
        this.A00 = str;
    }

    public String BXZ() {
        this.A02.A03();
        throw AnonymousClass000.A0s("getSmbPremiumToolsTitleStringId");
    }

    public boolean Bh4() {
        C19880zA r1 = this.A03;
        if (!r1.A07() || this.A04.A0N()) {
            return false;
        }
        r1.A03();
        throw AnonymousClass000.A0s("isOnlyPremiumFeatureEnabled");
    }

    public Drawable getIcon() {
        this.A01.A03();
        throw AnonymousClass000.A0s("getSettingsPremiumIconId");
    }

    public C696738c(C19880zA r2, C19880zA r3, C19880zA r4, AnonymousClass11S r5, AnonymousClass118 r6) {
        C18070vi.A0w(r6, r2, r5, r3, r4);
        this.A05 = r6;
        this.A02 = r2;
        this.A04 = r5;
        this.A03 = r3;
        this.A01 = r4;
    }

    public /* synthetic */ List BMb() {
        return C18460wS.A00;
    }

    public String BTj() {
        return "premium_subscription";
    }

    public String BWD() {
        return "";
    }

    public String BWI() {
        return this.A00;
    }

    public int Bac() {
        return 10;
    }

    public /* synthetic */ boolean BgM() {
        return false;
    }

    public /* synthetic */ boolean CLm() {
        return true;
    }
}
