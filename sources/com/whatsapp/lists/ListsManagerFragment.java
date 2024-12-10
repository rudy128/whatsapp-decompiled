package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass02n;
import X.AnonymousClass18K;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1G4;
import X.AnonymousClass1GP;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3W9;
import X.AnonymousClass3X7;
import X.AnonymousClass4KB;
import X.AnonymousClass5Af;
import X.AnonymousClass5IB;
import X.AnonymousClass5IC;
import X.AnonymousClass5ID;
import X.AnonymousClass5IE;
import X.AnonymousClass5O3;
import X.AnonymousClass5T5;
import X.AnonymousClass5T6;
import X.AnonymousClass5T8;
import X.BM5;
import X.C100995An;
import X.C156067tl;
import X.C156077tm;
import X.C18070vi;
import X.C18090vk;
import X.C18100vl;
import X.C24141Ja;
import X.C27201Vd;
import X.C28391a8;
import X.C30391dr;
import X.C37451pZ;
import X.C38501rO;
import X.C41561wd;
import X.C41761x1;
import X.C72043Kk;
import X.C72453Mb;
import X.C81603zV;
import X.C84084Hu;
import X.C85964Pp;
import X.C88334Zg;
import X.C91074f6;
import X.C91644g1;
import X.C99274sY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.wds.components.button.WDSButton;

public final class ListsManagerFragment extends Hilt_ListsManagerFragment {
    public BM5 A00;
    public RecyclerView A01;
    public AnonymousClass4KB A02;
    public C72043Kk A03;
    public C41761x1 A04;
    public AnonymousClass3X7 A05;
    public WDSButton A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public boolean A0B;
    public C18090vk A0C;
    public final AnonymousClass02n A0D = CDw(new C91074f6(this, 11), new Object());
    public final C18100vl A0E;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625379, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C41761x1 r0;
        boolean z;
        C18100vl r4;
        AnonymousClass1GP supportFragmentManager;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        this.A06 = AnonymousClass3MW.A0r(view2, 2131429711);
        this.A01 = AnonymousClass3MX.A0Q(view2, 2131434428);
        AnonymousClass00H r02 = this.A07;
        if (r02 != null) {
            C37451pZ A062 = ((C27201Vd) r02.get()).A06(A14(), "list-fragment");
            Bundle bundle2 = this.A06;
            if (bundle2 != null) {
                r0 = (C41761x1) C24141Ja.A00(bundle2, C41761x1.class, "labelInfo");
            } else {
                r0 = null;
            }
            Bundle bundle3 = this.A06;
            if (bundle3 != null) {
                z = bundle3.getBoolean("is_edit", false);
            } else {
                z = false;
            }
            this.A0B = z;
            KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) view2;
            EmojiSearchContainer emojiSearchContainer = (EmojiSearchContainer) AnonymousClass3MX.A0C(view2, 2131430335);
            C72043Kk r9 = this.A03;
            if (r9 != null) {
                AnonymousClass4KB r7 = this.A02;
                if (r7 != null) {
                    AnonymousClass3X7 r6 = new AnonymousClass3X7(r7, keyboardPopupLayout, r9, A062, emojiSearchContainer, new AnonymousClass5O3(r0, this), new AnonymousClass5T5(this));
                    this.A05 = r6;
                    RecyclerView recyclerView = this.A01;
                    if (recyclerView != null) {
                        recyclerView.setAdapter(r6);
                    }
                    if (r0 != null) {
                        this.A04 = r0;
                        int i = r0.A02;
                        if (i == 4 || i == 0) {
                            r4 = this.A0E;
                            ListsManagerViewModel listsManagerViewModel = (ListsManagerViewModel) r4.getValue();
                            listsManagerViewModel.A05 = true;
                            listsManagerViewModel.A00 = r0;
                            AnonymousClass3MX.A1Q(new ListsManagerViewModel$getConversations$1(r0, listsManagerViewModel, (C30391dr) null), C41561wd.A00(listsManagerViewModel));
                            ((ListsManagerViewModel) r4.getValue()).A0W(r0.A06);
                            AnonymousClass3X7 r5 = this.A05;
                            if (r5 == null) {
                                C18070vi.A11("adapter");
                                throw null;
                            }
                            r5.A01 = C88334Zg.A00(((ListsManagerViewModel) r4.getValue()).A0B);
                            AnonymousClass3X7 r2 = this.A05;
                            if (r2 == null) {
                                C18070vi.A11("adapter");
                                throw null;
                            }
                            boolean A1T = AnonymousClass000.A1T(i, 4);
                            r2.A03 = A1T;
                            ((ListsManagerViewModel) r4.getValue()).A0X(this.A0B, true);
                            if (A1T) {
                                AnonymousClass3X7 r62 = this.A05;
                                if (r62 == null) {
                                    C18070vi.A11("adapter");
                                    throw null;
                                }
                                AnonymousClass3W9 r8 = new AnonymousClass3W9(new AnonymousClass5IB(this), new C100995An(r62, 6), true);
                                this.A0C = new AnonymousClass5Af(r62, 20);
                                C91644g1.A00(A1G(), r62.A00, new AnonymousClass5T6(this), 45);
                                BM5 bm5 = new BM5(r8);
                                this.A00 = bm5;
                                bm5.A0D(this.A01);
                            }
                        } else {
                            r4 = this.A0E;
                            ListsManagerViewModel listsManagerViewModel2 = (ListsManagerViewModel) r4.getValue();
                            listsManagerViewModel2.A00 = r0;
                            AnonymousClass1G4 r52 = listsManagerViewModel2.A0B;
                            C88334Zg r22 = (C88334Zg) r52.getValue();
                            r52.setValue(new C88334Zg(r22.A00, listsManagerViewModel2.A0V(), r22.A01, r22.A03, r22.A04));
                        }
                    } else {
                        r4 = this.A0E;
                        ((ListsManagerViewModel) r4.getValue()).A0X(true, false);
                    }
                    AnonymousClass3MX.A1Q(new ListsManagerFragment$onViewCreated$5(r0, this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
                    C41761x1 r23 = this.A04;
                    WDSButton wDSButton = this.A06;
                    if (r23 == null) {
                        C72453Mb.A1C(wDSButton);
                        WDSButton wDSButton2 = this.A06;
                        if (wDSButton2 != null) {
                            C84084Hu.A00(wDSButton2, new AnonymousClass5T8(this));
                        }
                        ListsManagerViewModel listsManagerViewModel3 = (ListsManagerViewModel) r4.getValue();
                        int i2 = A15().getInt("arg_entry_point", -1);
                        Integer valueOf = Integer.valueOf(i2);
                        if (i2 == -1) {
                            valueOf = null;
                        }
                        Integer A0f = AnonymousClass3MY.A0f();
                        AnonymousClass18K r24 = ((C85964Pp) listsManagerViewModel3.A01.get()).A00;
                        C81603zV r03 = new C81603zV();
                        r03.A00 = 1;
                        r03.A01 = null;
                        r03.A04 = null;
                        r03.A02 = A0f;
                        r03.A05 = null;
                        r03.A03 = valueOf;
                        r24.CC7(r03);
                    } else {
                        C72453Mb.A1D(wDSButton);
                    }
                    AnonymousClass1FL A1B = A1B();
                    if (A1B != null && (supportFragmentManager = A1B.getSupportFragmentManager()) != null) {
                        AnonymousClass00H r04 = this.A08;
                        if (r04 != null) {
                            C38501rO r1 = (C38501rO) r04.get();
                            if (r1.A07() && !((C28391a8) r1.A05.get()).A04()) {
                                new Hilt_ListsEducationalBottomSheetFragment().A2C(supportFragmentManager, "LIST_NUX");
                                return;
                            }
                            return;
                        }
                        C18070vi.A11("listsUtil");
                        throw null;
                    }
                    return;
                }
                C18070vi.A11("textInputViewHolderFactory");
                throw null;
            }
            C18070vi.A11("textEmojiLabelViewControllerFactory");
            throw null;
        }
        C18070vi.A11("contactPhotos");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A25(X.C30391dr r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C100684uu
            if (r0 == 0) goto L_0x0026
            r6 = r11
            X.4uu r6 = (X.C100684uu) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r9 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r8 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 == r4) goto L_0x0063
            if (r0 != r8) goto L_0x002c
            java.lang.Object r0 = r6.L$0
            X.C30691eM.A01(r9)
            return r0
        L_0x0026:
            X.4uu r6 = new X.4uu
            r6.<init>(r10, r11)
            goto L_0x0012
        L_0x002c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0031:
            X.C30691eM.A01(r9)
            X.1x1 r7 = r10.A04
            if (r7 != 0) goto L_0x003b
            X.42b r9 = X.AnonymousClass42b.A00
            return r9
        L_0x003b:
            com.whatsapp.lists.ListsManagerViewModel r3 = X.AnonymousClass3Ma.A0p(r10)
            android.os.Bundle r1 = r10.A15()
            java.lang.String r0 = "arg_entry_point"
            r2 = -1
            int r0 = r1.getInt(r0, r2)
            java.lang.Integer r1 = X.AnonymousClass3MW.A0v(r0)
            int r0 = r1.intValue()
            if (r0 != r2) goto L_0x0055
            r1 = 0
        L_0x0055:
            r6.L$0 = r10
            r6.L$1 = r7
            r6.label = r4
            java.lang.Object r9 = r3.A0T(r7, r1, r6)
            if (r9 == r5) goto L_0x0092
            r1 = r10
            goto L_0x006e
        L_0x0063:
            java.lang.Object r7 = r6.L$1
            X.1x1 r7 = (X.C41761x1) r7
            java.lang.Object r1 = r6.L$0
            com.whatsapp.lists.ListsManagerFragment r1 = (com.whatsapp.lists.ListsManagerFragment) r1
            X.C30691eM.A01(r9)
        L_0x006e:
            X.0vk r0 = r1.A0C
            if (r0 == 0) goto L_0x0091
            com.whatsapp.lists.ListsManagerViewModel r4 = X.AnonymousClass3Ma.A0p(r1)
            java.lang.Object r3 = r0.invoke()
            java.util.List r3 = (java.util.List) r3
            r6.L$0 = r9
            r6.L$1 = r0
            r6.label = r8
            X.0wl r2 = r4.A0A
            r1 = 0
            com.whatsapp.lists.ListsManagerViewModel$reorderFavoritesIfNeeded$2 r0 = new com.whatsapp.lists.ListsManagerViewModel$reorderFavoritesIfNeeded$2
            r0.<init>(r7, r4, r3, r1)
            java.lang.Object r0 = X.C30451dy.A00(r6, r2, r0)
            if (r0 == r5) goto L_0x0092
            return r9
        L_0x0091:
            return r9
        L_0x0092:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.ListsManagerFragment.A25(X.1dr):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.02h] */
    public ListsManagerFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5ID(new AnonymousClass5IC(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(ListsManagerViewModel.class);
        this.A0E = C99274sY.A00(new AnonymousClass5IE(A002), new C156077tm(this, A002), new C156067tl(A002), A15);
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        AnonymousClass3Ma.A0p(this).A04 = A15().getBoolean("arg_skip_contacts", false);
    }
}
