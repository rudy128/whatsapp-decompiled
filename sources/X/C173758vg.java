package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* renamed from: X.8vg  reason: invalid class name and case insensitive filesystem */
public class C173758vg extends AnonymousClass8HW {
    public final C19880zA A00;
    public final AnonymousClass2Y9 A01;
    public final AnonymousClass2YA A02;
    public final AnonymousClass2YB A03;
    public final AnonymousClass2YC A04;
    public final AnonymousClass2YD A05;
    public final C37201p8 A06 = ((C37201p8) AnonymousClass12Q.A03(C37201p8.class));

    /* JADX WARNING: type inference failed for: r3v1, types: [X.8xj, X.1xT] */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.8xj, X.1xT] */
    /* JADX WARNING: type inference failed for: r3v7, types: [X.8xj, X.1xT] */
    /* JADX WARNING: type inference failed for: r3v12, types: [X.8xj, X.1xT] */
    /* JADX WARNING: type inference failed for: r3v16, types: [X.8xj, X.1xT] */
    public C175028xj A0X(ViewGroup viewGroup, int i) {
        if (i == 57) {
            List list = C42011xT.A0I;
            View inflate = C72463Mc.A0K(viewGroup, 0).inflate(2131626759, viewGroup, false);
            ImageView A0C = AnonymousClass3Ma.A0C(inflate, 2131430274);
            Drawable background = A0C.getBackground();
            if (background != null) {
                Drawable A022 = C27831Xu.A02(background);
                C27831Xu.A0C(A022, C19740yt.A00(inflate.getContext(), 2131103230));
                A0C.setBackground(A022);
                AnonymousClass8BS.A10(inflate.getContext(), A0C, 2131101222);
                return new C42011xT(inflate);
            }
            throw C17890vO.A0K();
        } else if (i == 71) {
            C37201p8 r3 = this.A06;
            List list2 = C42011xT.A0I;
            View A0B = AnonymousClass3MX.A0B(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131626500, false);
            Context A0A = C72483Me.A0A(r3);
            try {
                return new C42011xT(A0B);
            } finally {
                AnonymousClass12Q.A04();
                AnonymousClass114.A02(A0A);
            }
        } else if (i != 79) {
            switch (i) {
                case 59:
                    break;
                case 60:
                    AnonymousClass2YC r32 = this.A04;
                    List list3 = C42011xT.A0I;
                    return new C174848xR(C72463Mc.A0K(viewGroup, 0).inflate(2131626752, viewGroup, false), AnonymousClass10E.A6Q(r32.A00.A02));
                case 61:
                    List list4 = C42011xT.A0I;
                    return new C42011xT(AnonymousClass3MX.A0B(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131624347, false));
                case 62:
                    AnonymousClass2YB r33 = this.A03;
                    View A09 = AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131626753);
                    AnonymousClass10E r0 = r33.A00.A02;
                    return new C174898xW(A09, AnonymousClass10E.A8r(r0), (C183269Xp) r0.A00.A2d.get());
                case 63:
                    AnonymousClass2YA r34 = this.A02;
                    List list5 = C42011xT.A0I;
                    View A0B2 = AnonymousClass3MX.A0B(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131626758, false);
                    AnonymousClass10E r02 = r34.A00.A02;
                    C18030ve A8r = AnonymousClass10E.A8r(r02);
                    return new C174798xM(A0B2, AnonymousClass3MZ.A0N(r02), AnonymousClass10E.A12(r02), AnonymousClass3Ma.A0a(r02), A8r);
                case 64:
                    List list6 = C42011xT.A0I;
                    return new C42011xT(AnonymousClass3MX.A0B(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131626841, false));
                default:
                    switch (i) {
                        case 66:
                            return new C42011xT(AnonymousClass8BX.A0G(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625884));
                        case C166418cr.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                            break;
                        case C166388co.MESSAGE_ADD_ONS_FIELD_NUMBER:
                            return new C174558wy(AnonymousClass8HW.A00(viewGroup));
                        case 69:
                            AnonymousClass2Y9 r1 = this.A01;
                            List list7 = C42011xT.A0I;
                            return new C174958xc(viewGroup, AnonymousClass1K1.A1K(r1.A00.A00));
                        default:
                            return super.BqY(viewGroup, i);
                    }
            }
            return new C174648x7(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131626760));
        } else {
            AnonymousClass2YD r12 = this.A05;
            List list8 = C42011xT.A0I;
            return new C174948xb(viewGroup, AnonymousClass1K1.A1K(r12.A00.A00));
        }
    }

    public C173758vg(C19880zA r2, AnonymousClass2Y3 r3, AnonymousClass2Y4 r4, AnonymousClass2Y9 r5, AnonymousClass2YA r6, AnonymousClass2YB r7, AnonymousClass2YC r8, AnonymousClass2YD r9) {
        super(r2, r3, r4);
        this.A01 = r5;
        this.A02 = r6;
        this.A03 = r7;
        this.A04 = r8;
        this.A05 = r9;
        this.A00 = r2;
    }
}
