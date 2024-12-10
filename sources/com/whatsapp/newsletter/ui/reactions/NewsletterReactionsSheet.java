package com.whatsapp.newsletter.ui.reactions;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass11P;
import X.AnonymousClass1L9;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass7AS;
import X.AnonymousClass7BO;
import X.AnonymousClass7C9;
import X.AnonymousClass8BG;
import X.C108955ca;
import X.C111205iq;
import X.C112305lG;
import X.C113845nr;
import X.C115125tR;
import X.C124916aC;
import X.C124926aD;
import X.C130126iv;
import X.C134836rE;
import X.C136216tS;
import X.C1409073n;
import X.C147027Rn;
import X.C1582780b;
import X.C1582880c;
import X.C1582980d;
import X.C1583180f;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18070vi;
import X.C18460wS;
import X.C24921Me;
import X.C27201Vd;
import X.C30391dr;
import X.C34001jj;
import X.C36251na;
import X.C41681wt;
import X.C63892tr;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.whatsapp.newsletter.ui.reactions.viewmodel.GetReactionSendersUseCase$invoke$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class NewsletterReactionsSheet extends Hilt_NewsletterReactionsSheet {
    public ViewPager2 A00;
    public MaterialButton A01;
    public MaterialButton A02;
    public MaterialButtonToggleGroup A03;
    public AnonymousClass1L9 A04;
    public C124916aC A05;
    public C24921Me A06;
    public C27201Vd A07;
    public C18000vb A08;
    public C111205iq A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public List A0C = C18460wS.A00;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        if (!this.A0C.isEmpty()) {
            return AnonymousClass3MX.A0A(layoutInflater, viewGroup, 2131626240);
        }
        C34001jj r0 = new C34001jj(A1F());
        r0.A07(this);
        r0.A01();
        A1F().A0b();
        return null;
    }

    public void A21(Bundle bundle, View view) {
        String str;
        AnonymousClass7C9 r3;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        super.A21(bundle, view2);
        view2.getLayoutParams().height = AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131168433);
        this.A03 = (MaterialButtonToggleGroup) view2.findViewById(2131434370);
        this.A01 = (MaterialButton) view2.findViewById(2131434360);
        this.A02 = (MaterialButton) view2.findViewById(2131434361);
        this.A00 = (ViewPager2) view2.findViewById(2131434362);
        MaterialButtonToggleGroup materialButtonToggleGroup = this.A03;
        if (materialButtonToggleGroup != null) {
            materialButtonToggleGroup.A06.add(new AnonymousClass7BO(this, 3));
        }
        C124916aC r1 = this.A05;
        if (r1 != null) {
            List list = this.A0C;
            boolean z4 = true;
            if (list.size() <= 1) {
                z4 = false;
            }
            C36251na r12 = r1.A00;
            AnonymousClass10E r0 = r12.A02;
            AnonymousClass11P A6O = AnonymousClass10E.A6O(r0);
            this.A09 = new C111205iq((C124926aD) r12.A01.A1C.get(), AnonymousClass3MZ.A0U(r0), A6O, AnonymousClass3Ma.A0d(r0), C108955ca.A0b(r0), list, z4);
            ViewPager2 viewPager2 = this.A00;
            if (viewPager2 != null) {
                View childAt = viewPager2.getChildAt(0);
                if ((childAt instanceof RecyclerView) && childAt != null) {
                    childAt.setNestedScrollingEnabled(false);
                }
                viewPager2.A04(new C113845nr(this, 3));
                viewPager2.setAdapter(new C112305lG(this));
            }
            C111205iq r9 = this.A09;
            if (r9 == null) {
                str = "viewModel";
            } else {
                AnonymousClass7AS.A00(A1G(), r9.A04, new C1582780b(this), 4);
                AnonymousClass7AS.A00(A1G(), r9.A01, new C1582880c(this), 4);
                AnonymousClass7AS.A00(A1G(), r9.A03, new C1582980d(this), 4);
                ArrayList A13 = AnonymousClass000.A13();
                LinkedHashMap A132 = C17880vN.A13();
                LinkedHashMap A133 = C17880vN.A13();
                List list2 = r9.A09;
                Iterator it = list2.iterator();
                long j = 0;
                String str2 = null;
                String str3 = null;
                loop0:
                while (true) {
                    if (it.hasNext()) {
                        AnonymousClass206 A0Y = C17880vN.A0Y(it);
                        AnonymousClass8BG A012 = C63892tr.A01(A0Y);
                        if ((A012 instanceof AnonymousClass7C9) && (r3 = (AnonymousClass7C9) A012) != null) {
                            Iterator BMh = r3.BMh();
                            while (BMh.hasNext()) {
                                C115125tR r122 = (C115125tR) BMh.next();
                                String str4 = r122.A02;
                                String A022 = C1409073n.A02(str4);
                                if (A022 == null) {
                                    break loop0;
                                }
                                String A042 = C1409073n.A03.A04(A022);
                                if (r9.A0B) {
                                    z = false;
                                    StringBuilder A11 = AnonymousClass000.A11(A042);
                                    AnonymousClass205 r11 = A0Y.A0v;
                                    String A0V = C17890vO.A0V(r11, A11);
                                    if (r122.A01) {
                                        String A0H = C18070vi.A0H(r11);
                                        boolean z5 = r122.A01;
                                        StringBuilder A112 = AnonymousClass000.A11(A0H);
                                        A112.append('_');
                                        A112.append(z5);
                                        LinkedHashMap linkedHashMap = A132;
                                        linkedHashMap.put(A0V, new C136216tS(A0Y, C17890vO.A0Z(A042, A112, '_'), str4, (List) null, 1, true));
                                    }
                                } else {
                                    z = r122.A01;
                                    if (z) {
                                        str3 = str4;
                                        str2 = A042;
                                    }
                                }
                                C136216tS r2 = (C136216tS) A133.get(A042);
                                if (r2 != null) {
                                    i = r2.A00;
                                } else {
                                    i = 0;
                                }
                                int i2 = (int) r122.A00;
                                C136216tS r22 = (C136216tS) A133.get(A042);
                                if (r22 != null) {
                                    z2 = r22.A05;
                                } else {
                                    z2 = false;
                                }
                                j += (long) i2;
                                boolean z6 = r122.A01;
                                StringBuilder A113 = AnonymousClass000.A11("aggregate");
                                A113.append('_');
                                A113.append(z6);
                                String A0Z = C17890vO.A0Z(str4, A113, '_');
                                int i3 = i + i2;
                                if (!z2) {
                                    z3 = false;
                                    if (!z) {
                                        A133.put(A042, new C136216tS(A0Y, A0Z, A042, (List) null, i3, z3));
                                    }
                                }
                                z3 = true;
                                A133.put(A042, new C136216tS(A0Y, A0Z, A042, (List) null, i3, z3));
                            }
                            continue;
                        }
                    } else {
                        if (str3 != null && !C18070vi.A18(str2, str3)) {
                            C136216tS r23 = (C136216tS) A133.get(str2);
                            if (r23 != null) {
                                String str5 = r23.A02;
                                int i4 = r23.A00;
                                boolean z7 = r23.A05;
                                A133.put(str3, new C136216tS(r23.A01, str5, str3, r23.A04, i4, z7));
                            }
                            C41681wt.A03(A133).remove(str2);
                        }
                        A13.addAll(A132.values());
                        Collection values = A133.values();
                        ArrayList A134 = AnonymousClass000.A13();
                        for (Object next : values) {
                            if (((C136216tS) next).A05) {
                                A134.add(next);
                            }
                        }
                        A13.addAll(C147027Rn.A00(A134, 23));
                        Collection values2 = A133.values();
                        ArrayList A135 = AnonymousClass000.A13();
                        for (Object next2 : values2) {
                            AnonymousClass3MZ.A1V(next2, A135, ((C136216tS) next2).A05 ? 1 : 0);
                        }
                        A13.addAll(C147027Rn.A00(A135, 24));
                        r9.A00.A0F(new C134836rE(A13, j));
                    }
                }
                C130126iv r6 = r9.A07;
                C1583180f r5 = new C1583180f(r9);
                AnonymousClass3MW.A1X(r6.A04, new GetReactionSendersUseCase$invoke$1(r6, list2, (C30391dr) null, r5), r6.A05);
                return;
            }
        } else {
            str = "viewModelFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A1r() {
        super.A1r();
    }

    public void A1s() {
        super.A1s();
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
    }
}
