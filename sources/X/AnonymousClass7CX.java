package X;

import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7CX  reason: invalid class name */
public final class AnonymousClass7CX implements BCR {
    public AnonymousClass86T A00 = new AnonymousClass7CY(1);
    public C132596n6 A01;
    public int A02 = 1;
    public int A03;
    public RecyclerView A04;
    public ShimmerFrameLayout A05;
    public C139606z8 A06;
    public C112175l3 A07;
    public final AnonymousClass6a1 A08;
    public final AnonymousClass2YK A09;
    public final AnonymousClass2YO A0A;
    public final C18000vb A0B;

    public AnonymousClass7CX(AnonymousClass6a1 r3, AnonymousClass2YK r4, AnonymousClass2YO r5, C18000vb r6) {
        C18070vi.A0d(r6, 1);
        C18070vi.A0p(r4, r5, r3);
        this.A0B = r6;
        this.A09 = r4;
        this.A0A = r5;
        this.A08 = r3;
    }

    public void C8V(C20245ADd aDd, AnonymousClass77B r14, int i, boolean z) {
        this.A02 = 2;
        AnonymousClass77B r8 = r14;
        List list = r14.A01;
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            C20245ADd aDd2 = aDd;
            int i3 = i;
            if (it.hasNext()) {
                Object next = it.next();
                int i4 = i2 + 1;
                if (i2 < 0) {
                    AnonymousClass1ZU.A0B();
                    break;
                } else {
                    A0D.add(new AnonymousClass77A((AD8) next, true, C123726Vp.A00(aDd, r14, this.A03, i2), AnonymousClass000.A1T(i2, i)));
                    i2 = i4;
                }
            } else {
                C139606z8 r6 = this.A06;
                if (r6 == null) {
                    C18070vi.A11("dropdownController");
                } else {
                    r6.A01(aDd2, r8, A0D, i3, z);
                    A00(aDd, r14, i);
                    return;
                }
            }
        }
        throw null;
    }

    public void C8d(C20245ADd aDd, AnonymousClass77B r3, int i) {
        this.A02 = 1;
        A00(aDd, r3, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0075, code lost:
        if (r0.A02() != false) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(X.C20245ADd r8, X.AnonymousClass77B r9, int r10) {
        /*
            r7 = this;
            X.6n6 r2 = r7.A01
            java.lang.String r6 = "titleController"
            if (r2 == 0) goto L_0x0095
            java.lang.String r1 = r9.A00
            int r0 = r7.A02
            r2.A01 = r1
            r2.A00 = r0
            com.facebook.shimmer.ShimmerFrameLayout r0 = r7.A05
            java.lang.String r4 = "shimmerView"
            if (r0 == 0) goto L_0x006b
            r0.A01()
            X.6n6 r1 = r7.A01
            if (r1 == 0) goto L_0x0095
            r5 = 0
            r0 = 0
            r3 = -1
            android.widget.TextView r2 = r1.A02
            r2.setBackground(r0)
            r1 = -2
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r3, r1)
            r2.setLayoutParams(r0)
            java.util.List r0 = r9.A01
            boolean r1 = r0.isEmpty()
            r3 = 8
            com.facebook.shimmer.ShimmerFrameLayout r0 = r7.A05
            if (r1 == 0) goto L_0x0053
            if (r0 == 0) goto L_0x006b
            r0.setVisibility(r3)
            X.6n6 r0 = r7.A01
            if (r0 == 0) goto L_0x0095
            android.widget.TextView r1 = r0.A02
            java.lang.String r0 = r0.A01
            r1.setText(r0)
        L_0x0048:
            X.5l3 r1 = r7.A07
            if (r1 != 0) goto L_0x0099
            java.lang.String r0 = "adapter"
        L_0x004e:
            X.C18070vi.A11(r0)
        L_0x0051:
            r0 = 0
            throw r0
        L_0x0053:
            if (r0 == 0) goto L_0x006b
            r0.setVisibility(r5)
            androidx.recyclerview.widget.RecyclerView r2 = r7.A04
            if (r2 != 0) goto L_0x005f
            java.lang.String r0 = "carouselView"
            goto L_0x004e
        L_0x005f:
            int r1 = r7.A02
            r0 = 2
            r4 = 1
            if (r1 != r0) goto L_0x006f
            X.6z8 r0 = r7.A06
            if (r0 != 0) goto L_0x0071
            java.lang.String r4 = "dropdownController"
        L_0x006b:
            X.C18070vi.A11(r4)
            goto L_0x0051
        L_0x006f:
            r3 = 0
            goto L_0x0077
        L_0x0071:
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x006f
        L_0x0077:
            r2.setVisibility(r3)
            X.ADd r3 = X.C196499vA.A01(r9, r10)
            X.6n6 r2 = r7.A01
            if (r2 == 0) goto L_0x0095
            java.lang.String r1 = r3.A01
            java.util.Map r0 = r9.A02
            X.ADo r0 = X.C196499vA.A00(r3, r8, r0)
            if (r0 == 0) goto L_0x0091
            boolean r0 = r0.A02
            if (r0 != r4) goto L_0x0091
            r5 = 1
        L_0x0091:
            r2.A00(r1, r5)
            goto L_0x0048
        L_0x0095:
            X.C18070vi.A11(r6)
            goto L_0x0051
        L_0x0099:
            r1.A03 = r9
            r0 = 0
            r1.A04 = r0
            r1.A01 = r8
            r1.A00 = r10
            r1.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7CX.A00(X.ADd, X.77B, int):void");
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.6uy, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v0, types: [X.6uz, java.lang.Object] */
    public void A01(AnonymousClass1GP r15, AnonymousClass1F9 r16, ShimmerFrameLayout shimmerFrameLayout, UserJid userJid, int i) {
        String str;
        ShimmerFrameLayout shimmerFrameLayout2 = shimmerFrameLayout;
        this.A05 = shimmerFrameLayout2;
        int i2 = i;
        this.A03 = i2;
        TextView A0E = AnonymousClass3Ma.A0E(shimmerFrameLayout2, 2131436672);
        this.A04 = (RecyclerView) C18070vi.A05(shimmerFrameLayout2, 2131436673);
        TextView A0E2 = AnonymousClass3Ma.A0E(shimmerFrameLayout2, 2131436671);
        AnonymousClass6a1 r1 = this.A08;
        AnonymousClass7CZ r9 = new AnonymousClass7CZ(this, 1);
        AnonymousClass10E r0 = r1.A00.A02;
        C18030ve A8q = AnonymousClass10E.A8q(r0);
        AnonymousClass1GP r6 = r15;
        AnonymousClass1F9 r7 = r16;
        this.A06 = new C139606z8(A0E2, r6, r7, new Object(), r9, new Object(), AnonymousClass10E.A6R(r0), A8q, i2);
        this.A01 = new C132596n6(A0E, AnonymousClass10E.A6Q(this.A0A.A00.A02));
        ShimmerFrameLayout shimmerFrameLayout3 = this.A05;
        if (shimmerFrameLayout3 == null) {
            str = "shimmerView";
        } else {
            shimmerFrameLayout3.A01();
            RecyclerView recyclerView = this.A04;
            str = "carouselView";
            if (recyclerView != null) {
                recyclerView.A0r(new AnonymousClass3XT(this.A0B, AnonymousClass000.A0Y(shimmerFrameLayout2).getDimensionPixelSize(2131168367)));
                C112175l3 r12 = new C112175l3((C124976aI) this.A09.A00.A01.A0m.get(), userJid);
                this.A07 = r12;
                RecyclerView recyclerView2 = this.A04;
                if (recyclerView2 != null) {
                    str = "adapter";
                    recyclerView2.setAdapter(r12);
                    C112175l3 r2 = this.A07;
                    if (r2 != null) {
                        r2.A02 = new AnonymousClass7CZ(this, 2);
                        return;
                    }
                }
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void Bcv() {
        ShimmerFrameLayout shimmerFrameLayout = this.A05;
        String str = "shimmerView";
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.A01();
            ShimmerFrameLayout shimmerFrameLayout2 = this.A05;
            if (shimmerFrameLayout2 != null) {
                shimmerFrameLayout2.setVisibility(8);
                C132596n6 r1 = this.A01;
                str = "titleController";
                if (r1 != null) {
                    TextView textView = r1.A02;
                    textView.setBackground((Drawable) null);
                    textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    C132596n6 r0 = this.A01;
                    if (r0 != null) {
                        r0.A02.setText(r0.A01);
                        return;
                    }
                }
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void Bql() {
        String str;
        ShimmerFrameLayout shimmerFrameLayout = this.A05;
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.setVisibility(0);
            ShimmerFrameLayout shimmerFrameLayout2 = this.A05;
            if (shimmerFrameLayout2 != null) {
                shimmerFrameLayout2.A02();
                C112175l3 r3 = this.A07;
                if (r3 == null) {
                    str = "adapter";
                } else {
                    if (!r3.A04) {
                        r3.A04 = true;
                        int size = r3.A03.A01.size();
                        r3.A03 = C123716Vo.A00();
                        if (size < 5) {
                            r3.A0J(0, size);
                            r3.A01.A02(size, 5 - size);
                        } else {
                            r3.A0J(0, 5);
                            r3.A01.A03(5, size - 5);
                        }
                    }
                    C132596n6 r5 = this.A01;
                    if (r5 == null) {
                        str = "titleController";
                    } else {
                        TextView textView = r5.A02;
                        Drawable A012 = AnonymousClass03S.A01(textView.getContext(), 2131233121);
                        int dimensionPixelSize = textView.getResources().getDimensionPixelSize(2131168361);
                        TextView textView2 = r5.A02;
                        textView2.setBackground(A012);
                        textView2.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, -2));
                        C139606z8 r2 = this.A06;
                        if (r2 == null) {
                            str = "dropdownController";
                        } else {
                            r2.A01((C20245ADd) null, C123716Vo.A00(), C18460wS.A00, 0, false);
                            RecyclerView recyclerView = this.A04;
                            if (recyclerView == null) {
                                C18070vi.A11("carouselView");
                                throw null;
                            } else {
                                recyclerView.setVisibility(0);
                                return;
                            }
                        }
                    }
                }
                C18070vi.A11(str);
                throw null;
            }
        }
        C18070vi.A11("shimmerView");
        throw null;
    }
}
