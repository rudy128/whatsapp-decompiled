package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.android.di.BaseEntryPoint;
import java.util.List;

/* renamed from: X.38I  reason: invalid class name */
public class AnonymousClass38I implements C108635c2 {
    public String A00 = "";
    public final AnonymousClass118 A01;

    public AnonymousClass38I(AnonymousClass118 r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public void CJs(String str) {
        C18070vi.A0d(str, 0);
        this.A00 = str;
    }

    public List BMb() {
        if (this instanceof AnonymousClass2OL) {
            return C18070vi.A0L(this.A01, 2131895906);
        }
        String[] A1Z = C17880vN.A1Z();
        AnonymousClass118 r2 = this.A01;
        A1Z[0] = C18070vi.A0G(r2, 2131888742);
        return C18070vi.A0O(C18070vi.A0G(r2, 2131895906), A1Z, 1);
    }

    public String BTj() {
        if (this instanceof AnonymousClass2OM) {
            return "terms";
        }
        if (this instanceof AnonymousClass2OL) {
            return "get_help";
        }
        if (this instanceof AnonymousClass2OK) {
            return "app_info";
        }
        return "help";
    }

    public String BWD() {
        if ((this instanceof AnonymousClass2OM) || (this instanceof AnonymousClass2OL) || (this instanceof AnonymousClass2OK)) {
            return "help";
        }
        return "";
    }

    public String BXZ() {
        if (this instanceof AnonymousClass2OM) {
            return C18070vi.A0G(this.A01, 2131896019);
        }
        if (this instanceof AnonymousClass2OL) {
            return C18070vi.A0G(this.A01, 2131895905);
        }
        boolean z = this instanceof AnonymousClass2OK;
        AnonymousClass118 r1 = this.A01;
        if (z) {
            return C18070vi.A0G(r1, 2131895793);
        }
        return C18070vi.A0G(r1, 2131899401);
    }

    public View BbT(View view) {
        int i;
        if (this instanceof AnonymousClass2OM) {
            C18070vi.A0d(view, 0);
            i = 2131436039;
        } else if (this instanceof AnonymousClass2OL) {
            C18070vi.A0d(view, 0);
            i = 2131431108;
        } else if (this instanceof AnonymousClass2OK) {
            C18070vi.A0d(view, 0);
            i = 2131427360;
        } else {
            C18070vi.A0d(view, 0);
            i = 2131435288;
        }
        return view.findViewById(i);
    }

    public Drawable getIcon() {
        Context context = this.A01.A00;
        C18070vi.A0X(context);
        return new C74733cO(C24261Jm.A00(context, 2131231968), ((BaseEntryPoint) AnonymousClass00E.A00(context, BaseEntryPoint.class)).CS9());
    }

    public String BWI() {
        return this.A00;
    }

    public int Bac() {
        return 6;
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
}
