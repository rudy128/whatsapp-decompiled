package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.util.List;

/* renamed from: X.3bn  reason: invalid class name and case insensitive filesystem */
public class C74513bn extends C110745gz {
    public View A00;
    public C75373hL A01;
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0L();
    public final AnonymousClass181 A03;
    public final C108355bZ A04;
    public final C86434Rp A05;
    public final C87814Xd A06;
    public final AnonymousClass4XK A07;
    public final C84864Ld A08;
    public final AnonymousClass4VG A09;
    public final C80443xB A0A = new AnonymousClass28I((C40411uf) new AnonymousClass3W0(3));
    public final C18030ve A0B;
    public final AnonymousClass1BI A0C;
    public final C32011gU A0D;
    public final AnonymousClass1PU A0E;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.28I, X.3xB] */
    public C74513bn(Context context, AnonymousClass181 r4, C108355bZ r5, C86434Rp r6, C87814Xd r7, AnonymousClass4XK r8, C84864Ld r9, AnonymousClass4VG r10, C18030ve r11, AnonymousClass1BI r12, C32011gU r13, AnonymousClass1PU r14) {
        super(context, 2132083618);
        this.A0C = r12;
        this.A0B = r11;
        this.A0D = r13;
        this.A03 = r4;
        this.A0E = r14;
        this.A04 = r5;
        this.A09 = r10;
        this.A07 = r8;
        this.A08 = r9;
        this.A06 = r7;
        this.A05 = r6;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [X.3hL, X.7Fe] */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624739);
        RecyclerView recyclerView = (RecyclerView) C123576Uz.A00(this, 2131434277);
        AnonymousClass3Ma.A15(getContext(), recyclerView);
        C80443xB r6 = this.A0A;
        recyclerView.setAdapter(r6);
        AnonymousClass2AI r5 = new AnonymousClass2AI();
        AnonymousClass4VG r2 = this.A09;
        List<C89294cE> list = r2.A0A;
        if (list != null) {
            for (C89294cE r3 : list) {
                r5.add((Object) new AnonymousClass4NK(this.A02, r3));
            }
        }
        r6.A0U(r5.build());
        View A002 = C123576Uz.A00(this, 2131435148);
        this.A00 = A002;
        C89924dF.A00(A002, this, 44);
        C89924dF.A00(C123576Uz.A00(this, 2131429132), this, 43);
        C18030ve r62 = this.A0B;
        C32011gU r52 = this.A0D;
        AnonymousClass181 r4 = this.A03;
        C20941Abv A012 = this.A05.A01(this.A06, r2, false);
        C18070vi.A0s(r62, r52, r4, A012);
        String str = A012.A0E;
        if (str != null) {
            ? r0 = new C143887Fe(r4, r62, r52, str);
            r0.A08 = str;
            r0.A0O(A012);
            this.A01 = r0;
            WebPagePreviewView webPagePreviewView = (WebPagePreviewView) C123576Uz.A00(this, 2131437042);
            webPagePreviewView.A0P(this.A01, (List) null, false);
            View findViewById = webPagePreviewView.findViewById(2131432018);
            if (findViewById != null) {
                findViewById.setBackgroundResource(2131232888);
            }
            Drawable A022 = C27831Xu.A02(this.A04.BS0(AnonymousClass00R.A01, 2, false).mutate());
            C27831Xu.A0C(A022, AnonymousClass3MZ.A02(getContext(), getContext(), 2130968691, 2131099735));
            webPagePreviewView.setForeground(A022);
            this.A02.A0C(new C91604fx(this, 12));
            View A003 = C123576Uz.A00(this, 2131429948);
            BottomSheetBehavior A023 = BottomSheetBehavior.A02(A003);
            A023.A0W(3);
            A023.A0h = true;
            A023.A0Y(A003.getHeight(), false);
            AnonymousClass4XK.A00(this.A07, this.A0C.getRawString(), 3, true);
            return;
        }
        throw C17880vN.A0g();
    }
}
