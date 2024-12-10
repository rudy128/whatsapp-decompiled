package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0kF  reason: invalid class name and case insensitive filesystem */
public final class C11530kF extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ AnonymousClass1OS $bottomBar;
    public final /* synthetic */ C36001nB $content;
    public final /* synthetic */ C17100tk $contentWindowInsets;
    public final /* synthetic */ AnonymousClass1OS $fab;
    public final /* synthetic */ int $fabPosition;
    public final /* synthetic */ int $layoutHeight;
    public final /* synthetic */ int $layoutWidth;
    public final /* synthetic */ long $looseConstraints;
    public final /* synthetic */ AnonymousClass1OS $snackbar;
    public final /* synthetic */ C17520un $this_SubcomposeLayout;
    public final /* synthetic */ AnonymousClass1OS $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11530kF(C17100tk r2, C17520un r3, AnonymousClass1OS r4, AnonymousClass1OS r5, AnonymousClass1OS r6, AnonymousClass1OS r7, C36001nB r8, int i, int i2, int i3, int i4, long j) {
        super(1);
        this.$this_SubcomposeLayout = r3;
        this.$topBar = r4;
        this.$snackbar = r5;
        this.$fab = r6;
        this.$fabPosition = i;
        this.$layoutWidth = i2;
        this.$contentWindowInsets = r2;
        this.$looseConstraints = j;
        this.$bottomBar = r7;
        this.$$dirty = i3;
        this.$content = r8;
        this.$layoutHeight = i4;
    }

    public final void A00(AnonymousClass0QZ r27) {
        Object next;
        Object next2;
        Object next3;
        AnonymousClass0HP r8;
        Object next4;
        Integer num;
        Integer num2;
        int i;
        int i2;
        int BNd;
        int intValue;
        int CG9;
        Object next5;
        Object next6;
        int i3;
        C18070vi.A0d(r27, 0);
        List<C17500ul> COj = this.$this_SubcomposeLayout.COj(AnonymousClass0CS.TopBar, this.$topBar);
        long j = this.$looseConstraints;
        ArrayList<AnonymousClass0XJ> arrayList = new ArrayList<>(C29351c6.A0C(COj, 10));
        for (C17500ul Bjb : COj) {
            arrayList.add(Bjb.Bjb(j));
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int i4 = ((AnonymousClass0XJ) next).A00;
                do {
                    Object next7 = it.next();
                    int i5 = ((AnonymousClass0XJ) next7).A00;
                    if (i4 < i5) {
                        next = next7;
                        i4 = i5;
                    }
                } while (it.hasNext());
            }
        }
        int A0J = AnonymousClass000.A0J((AnonymousClass0XJ) next);
        List<C17500ul> COj2 = this.$this_SubcomposeLayout.COj(AnonymousClass0CS.Snackbar, this.$snackbar);
        C17100tk r10 = this.$contentWindowInsets;
        C17520un r9 = this.$this_SubcomposeLayout;
        long j2 = this.$looseConstraints;
        ArrayList<AnonymousClass0XJ> arrayList2 = new ArrayList<>(C29351c6.A0C(COj2, 10));
        for (C17500ul Bjb2 : COj2) {
            int BTy = r10.BTy(r9, r9.getLayoutDirection());
            arrayList2.add(Bjb2.Bjb(C26229CvL.A05((-BTy) - r10.BYN(r9, r9.getLayoutDirection()), -r10.BNd(r9), j2)));
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            next2 = null;
        } else {
            next2 = it2.next();
            if (it2.hasNext()) {
                int i6 = ((AnonymousClass0XJ) next2).A00;
                do {
                    Object next8 = it2.next();
                    int i7 = ((AnonymousClass0XJ) next8).A00;
                    if (i6 < i7) {
                        next2 = next8;
                        i6 = i7;
                    }
                } while (it2.hasNext());
            }
        }
        int A0J2 = AnonymousClass000.A0J((AnonymousClass0XJ) next2);
        Iterator it3 = arrayList2.iterator();
        if (!it3.hasNext()) {
            next3 = null;
        } else {
            next3 = it3.next();
            if (it3.hasNext()) {
                int i8 = ((AnonymousClass0XJ) next3).A01;
                do {
                    Object next9 = it3.next();
                    int i9 = ((AnonymousClass0XJ) next9).A01;
                    if (i8 < i9) {
                        next3 = next9;
                        i8 = i9;
                    }
                } while (it3.hasNext());
            }
        }
        int A0K = AnonymousClass000.A0K((AnonymousClass0XJ) next3);
        List<C17500ul> COj3 = this.$this_SubcomposeLayout.COj(AnonymousClass0CS.Fab, this.$fab);
        C17100tk r102 = this.$contentWindowInsets;
        C17520un r82 = this.$this_SubcomposeLayout;
        long j3 = this.$looseConstraints;
        ArrayList<AnonymousClass0XJ> A13 = AnonymousClass000.A13();
        for (C17500ul Bjb3 : COj3) {
            int BTy2 = r102.BTy(r82, r82.getLayoutDirection());
            AnonymousClass0XJ Bjb4 = Bjb3.Bjb(C26229CvL.A05((-BTy2) - r102.BYN(r82, r82.getLayoutDirection()), -r102.BNd(r82), j3));
            if (!(Bjb4.A00 == 0 || Bjb4.A01 == 0)) {
                A13.add(Bjb4);
            }
        }
        if (!A13.isEmpty()) {
            Iterator it4 = A13.iterator();
            if (!it4.hasNext()) {
                next5 = null;
            } else {
                next5 = it4.next();
                if (it4.hasNext()) {
                    int i10 = ((AnonymousClass0XJ) next5).A01;
                    do {
                        Object next10 = it4.next();
                        int i11 = ((AnonymousClass0XJ) next10).A01;
                        if (i10 < i11) {
                            next5 = next10;
                            i10 = i11;
                        }
                    } while (it4.hasNext());
                }
            }
            C18070vi.A0b(next5);
            int i12 = ((AnonymousClass0XJ) next5).A01;
            Iterator it5 = A13.iterator();
            if (!it5.hasNext()) {
                next6 = null;
            } else {
                next6 = it5.next();
                if (it5.hasNext()) {
                    int i13 = ((AnonymousClass0XJ) next6).A00;
                    do {
                        Object next11 = it5.next();
                        int i14 = ((AnonymousClass0XJ) next11).A00;
                        if (i13 < i14) {
                            next6 = next11;
                            i13 = i14;
                        }
                    } while (it5.hasNext());
                }
            }
            C18070vi.A0b(next6);
            int i15 = ((AnonymousClass0XJ) next6).A00;
            if (this.$fabPosition == 1) {
                C17520un r103 = this.$this_SubcomposeLayout;
                if (r103.getLayoutDirection() == C24246By4.Ltr) {
                    i3 = (this.$layoutWidth - r103.CG9(16.0f)) - i12;
                } else {
                    i3 = r103.CG9(16.0f);
                }
            } else {
                i3 = (this.$layoutWidth - i12) / 2;
            }
            r8 = new AnonymousClass0HP(i3, i15);
        } else {
            r8 = null;
        }
        List<C17500ul> COj4 = this.$this_SubcomposeLayout.COj(AnonymousClass0CS.BottomBar, AnonymousClass0LC.A01(new C13270n8(r8, this.$bottomBar, this.$$dirty), -1455477816, true));
        long j4 = this.$looseConstraints;
        ArrayList<AnonymousClass0XJ> arrayList3 = new ArrayList<>(C29351c6.A0C(COj4, 10));
        for (C17500ul Bjb5 : COj4) {
            arrayList3.add(Bjb5.Bjb(j4));
        }
        Iterator it6 = arrayList3.iterator();
        if (!it6.hasNext()) {
            next4 = null;
        } else {
            next4 = it6.next();
            if (it6.hasNext()) {
                int i16 = ((AnonymousClass0XJ) next4).A00;
                do {
                    Object next12 = it6.next();
                    int i17 = ((AnonymousClass0XJ) next12).A00;
                    if (i16 < i17) {
                        next4 = next12;
                        i16 = i17;
                    }
                } while (it6.hasNext());
            }
        }
        AnonymousClass0XJ r11 = (AnonymousClass0XJ) next4;
        if (r11 != null) {
            num = Integer.valueOf(r11.A00);
        } else {
            num = null;
        }
        if (r8 != null) {
            C17520un r104 = this.$this_SubcomposeLayout;
            C17100tk r112 = this.$contentWindowInsets;
            if (num == null) {
                intValue = r8.A00 + r104.CG9(16.0f);
                CG9 = r112.BNd(r104);
            } else {
                intValue = num.intValue() + r8.A00;
                CG9 = r104.CG9(16.0f);
            }
            num2 = Integer.valueOf(intValue + CG9);
        } else {
            num2 = null;
        }
        if (A0J2 != 0) {
            if (num2 != null) {
                BNd = num2.intValue();
            } else if (num != null) {
                BNd = num.intValue();
            } else {
                BNd = this.$contentWindowInsets.BNd(this.$this_SubcomposeLayout);
            }
            i = A0J2 + BNd;
        } else {
            i = 0;
        }
        C17520un r113 = this.$this_SubcomposeLayout;
        List<C17500ul> COj5 = r113.COj(AnonymousClass0CS.MainContent, AnonymousClass0LC.A01(new C14530pA(this.$contentWindowInsets, r113, num, arrayList, arrayList3, this.$content, A0J, this.$$dirty), 1643221465, true));
        long j5 = this.$looseConstraints;
        ArrayList<AnonymousClass0XJ> arrayList4 = new ArrayList<>(C29351c6.A0C(COj5, 10));
        for (C17500ul Bjb6 : COj5) {
            arrayList4.add(Bjb6.Bjb(j5));
        }
        for (AnonymousClass0XJ A03 : arrayList4) {
            AnonymousClass0QZ.A03(A03, 0.0f, 0, 0);
        }
        for (AnonymousClass0XJ A032 : arrayList) {
            AnonymousClass0QZ.A03(A032, 0.0f, 0, 0);
        }
        int i18 = this.$layoutWidth;
        C17100tk r114 = this.$contentWindowInsets;
        C17520un r105 = this.$this_SubcomposeLayout;
        int i19 = this.$layoutHeight;
        for (AnonymousClass0XJ A033 : arrayList2) {
            AnonymousClass0QZ.A03(A033, 0.0f, r114.BTy(r105, r105.getLayoutDirection()) + ((i18 - A0K) / 2), i19 - i);
        }
        int i20 = this.$layoutHeight;
        for (AnonymousClass0XJ r2 : arrayList3) {
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            AnonymousClass0QZ.A03(r2, 0.0f, 0, i20 - i2);
        }
        if (r8 != null) {
            int i21 = this.$layoutHeight;
            for (AnonymousClass0XJ A034 : A13) {
                int i22 = r8.A01;
                C18070vi.A0b(num2);
                AnonymousClass0QZ.A03(A034, 0.0f, i22, i21 - num2.intValue());
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((AnonymousClass0QZ) obj);
        return C27621Wu.A00;
    }
}
