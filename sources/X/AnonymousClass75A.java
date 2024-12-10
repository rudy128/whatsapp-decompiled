package X;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import java.util.List;

/* renamed from: X.75A  reason: invalid class name */
public class AnonymousClass75A implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass75A(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C1410073x r0;
        View findViewById;
        View rootView;
        if (this.A00 != 0) {
            AnonymousClass7JF r2 = (AnonymousClass7JF) this.A01;
            View view = (View) this.A02;
            AnonymousClass69Z r4 = (AnonymousClass69Z) this.A03;
            DoodleView doodleView = r2.A0P;
            doodleView.invalidate();
            C136986uj r1 = r2.A0W;
            r1.A07(0);
            r2.A0J.A03();
            AnonymousClass7JF.A05(r2);
            r1.A04();
            r1.A0B = false;
            AnonymousClass70N r12 = r2.A0V;
            C139446yr r02 = r12.A03;
            List list = r12.A04;
            C18070vi.A0d(list, 0);
            List list2 = r02.A00;
            if (!list2.isEmpty()) {
                ((C123436Ul) C50582Uz.A00(list2)).A01(list);
            }
            String A12 = AnonymousClass3Ma.A12((EditText) view.findViewById(2131434209));
            if (!A12.equals(r4.A03)) {
                AnonymousClass70N r13 = doodleView.A0M;
                AnonymousClass70N.A00(r4.A0C(), r4, r13);
                r4.A03 = A12;
                AnonymousClass69Z.A00(r4);
                doodleView.invalidate();
                if (r4 != r13.A01) {
                    doodleView.A0J.A06();
                    return;
                }
                return;
            }
            return;
        }
        AnonymousClass69c r5 = (AnonymousClass69c) this.A01;
        C130396jM r22 = (C130396jM) this.A02;
        AnonymousClass7JF r14 = (AnonymousClass7JF) this.A03;
        if (r5 == null) {
            String str = r22.A04;
            if (str.length() > 0) {
                DoodleView doodleView2 = r14.A0P;
                float f = r22.A00;
                AnonymousClass6pZ r03 = r22.A06;
                int i = r03.A03;
                int i2 = r22.A01;
                int i3 = r22.A03;
                int i4 = r03.A02;
                int i5 = r22.A02;
                AnonymousClass69c r8 = new AnonymousClass69c(doodleView2.getContext(), doodleView2.A06, doodleView2.A07, doodleView2.A08);
                r8.A0a(str, f, i2, i3, i4);
                r8.A0K(i);
                doodleView2.A04(r8, i5);
            }
        } else {
            if (r22.A04.length() == 0) {
                r0 = r14.A0O;
            } else {
                AnonymousClass70N r04 = r14.A0V;
                C139446yr r3 = r04.A03;
                List list3 = r04.A04;
                C18070vi.A0d(list3, 0);
                List list4 = r3.A00;
                if (!list4.isEmpty()) {
                    ((C123436Ul) C50582Uz.A00(list4)).A01(list3);
                }
                DoodleView doodleView3 = r14.A0P;
                String str2 = r22.A04;
                float f2 = r22.A00;
                AnonymousClass6pZ r05 = r22.A06;
                int i6 = r05.A03;
                int i7 = r22.A01;
                int i8 = r22.A03;
                int i9 = r05.A02;
                if (!(str2.equals(r5.A0C) && r5.A07 == f2 && r5.A05.getColor() == i6 && i7 == r5.A09 && i8 == r5.A0A && i9 == r5.A0G.A02)) {
                    AnonymousClass70N r23 = doodleView3.A0M;
                    AnonymousClass70N.A00(r5.A0C(), r5, r23);
                    r5.A0a(str2, f2, i7, i8, i9);
                    r5.A0K(i6);
                    doodleView3.invalidate();
                    if (r5 != r23.A01) {
                        r0 = doodleView3.A0J;
                    }
                }
            }
            r0.A06();
        }
        C19830z4 r06 = r14.A0F;
        C17880vN.A1C(C19830z4.A00(r06), "text_tool_media_composer_font", r14.A02);
        C109225d1 r24 = r14.A04;
        if (!(r24 == null || (findViewById = r24.findViewById(16908290)) == null || (rootView = findViewById.getRootView()) == null)) {
            AnonymousClass3MX.A1A(r14.A09.getContext(), rootView, 2131102739);
        }
        r14.A0P.invalidate();
        C136986uj r32 = r14.A0W;
        r32.A07(0);
        r14.A0J.A03();
        AnonymousClass7JF.A05(r14);
        r32.A04();
        r32.A0B = false;
    }
}
