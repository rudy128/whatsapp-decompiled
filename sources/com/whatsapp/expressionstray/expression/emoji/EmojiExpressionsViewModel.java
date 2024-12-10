package com.whatsapp.expressionstray.expression.emoji;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1G4;
import X.AnonymousClass1J2;
import X.AnonymousClass1KW;
import X.AnonymousClass1ZU;
import X.AnonymousClass3MW;
import X.AnonymousClass4W8;
import X.C108485bm;
import X.C117445zn;
import X.C117515zv;
import X.C117525zw;
import X.C117535zx;
import X.C1193167q;
import X.C1193267r;
import X.C131546lH;
import X.C135736sg;
import X.C17880vN;
import X.C18010vc;
import X.C18030ve;
import X.C18070vi;
import X.C18600wl;
import X.C19830z4;
import X.C217517g;
import X.C25691Pg;
import X.C29351c6;
import X.C30391dr;
import X.C34071js;
import X.C41561wd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class EmojiExpressionsViewModel extends AnonymousClass1J2 {
    public C108485bm A00 = AnonymousClass4W8.A01(C25691Pg.SUSPEND, -2);
    public boolean A01;
    public boolean A02;
    public final C19830z4 A03;
    public final C1193167q A04;
    public final C1193267r A05;
    public final C18030ve A06;
    public final C18010vc A07;
    public final AnonymousClass00H A08 = C217517g.A00(32769);
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C = C217517g.A00(16385);
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E = C217517g.A00(32768);
    public final AtomicBoolean A0F = new AtomicBoolean(true);
    public final C18600wl A0G;
    public final AnonymousClass1G4 A0H = C34071js.A00((Object) null);
    public final AnonymousClass1KW A0I;
    public final AnonymousClass1G4 A0J = C34071js.A00(C117445zn.A00);

    public EmojiExpressionsViewModel(C19830z4 r5, C1193167q r6, C1193267r r7, AnonymousClass1KW r8, C18030ve r9, C18010vc r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, C18600wl r15) {
        C18070vi.A0d(r8, 1);
        C18070vi.A0p(r7, r6, r11);
        C18070vi.A0d(r5, 5);
        C18070vi.A0x(r10, r12, r13, r14, r15);
        C18070vi.A0d(r9, 11);
        this.A0I = r8;
        this.A05 = r7;
        this.A04 = r6;
        this.A0D = r11;
        this.A03 = r5;
        this.A07 = r10;
        this.A09 = r12;
        this.A0A = r13;
        this.A0B = r14;
        this.A0G = r15;
        this.A06 = r9;
    }

    public static final ArrayList A00(EmojiExpressionsViewModel emojiExpressionsViewModel, Integer num, List list, int i) {
        EmojiExpressionsViewModel emojiExpressionsViewModel2;
        Integer num2 = num;
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        C135736sg r4 = null;
        boolean z = true;
        while (true) {
            emojiExpressionsViewModel2 = emojiExpressionsViewModel;
            if (!it.hasNext()) {
                break;
            }
            C131546lH r8 = (C131546lH) it.next();
            if (r8 instanceof C117515zv) {
                if (C17880vN.A1X(A132)) {
                    ArrayList<C117525zw> A0E2 = C29351c6.A0E(A132);
                    Iterator it2 = A132.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        C18070vi.A0z(next, "null cannot be cast to non-null type com.whatsapp.expressionstray.expression.emoji.grid.EmojiExpressionsViewItem.EmojiItem");
                        A0E2.add(next);
                    }
                    ArrayList A0E3 = C29351c6.A0E(A0E2);
                    for (C117525zw r0 : A0E2) {
                        A0E3.add(r0.A03);
                    }
                    int[][] iArr = (int[][]) A0E3.toArray(new int[0][]);
                    ArrayList A0E4 = C29351c6.A0E(A0E2);
                    for (C117525zw r02 : A0E2) {
                        A0E4.add(r02.A04);
                    }
                    int[][] iArr2 = (int[][]) A0E4.toArray(new int[0][]);
                    AnonymousClass1KW r03 = emojiExpressionsViewModel2.A0I;
                    C18070vi.A0b(r4);
                    Integer num3 = null;
                    if (z) {
                        num3 = num2;
                    }
                    A13.add(new C117535zx(r03, r4, num3, iArr, iArr2));
                    A132.clear();
                    if (z) {
                        z = false;
                    }
                }
                r4 = r8.A00();
                A13.add(r8);
            } else if (r8 instanceof C117525zw) {
                if (r4 == null) {
                    r4 = r8.A00();
                }
                C135736sg A002 = r8.A00();
                if (!C18070vi.A18(A002, r4) || A132.size() >= i) {
                    ArrayList<C117525zw> A0E5 = C29351c6.A0E(A132);
                    Iterator it3 = A132.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        C18070vi.A0z(next2, "null cannot be cast to non-null type com.whatsapp.expressionstray.expression.emoji.grid.EmojiExpressionsViewItem.EmojiItem");
                        A0E5.add(next2);
                    }
                    ArrayList A0E6 = C29351c6.A0E(A0E5);
                    for (C117525zw r04 : A0E5) {
                        A0E6.add(r04.A03);
                    }
                    int[][] iArr3 = (int[][]) A0E6.toArray(new int[0][]);
                    ArrayList A0E7 = C29351c6.A0E(A0E5);
                    for (C117525zw r05 : A0E5) {
                        A0E7.add(r05.A04);
                    }
                    int[][] iArr4 = (int[][]) A0E7.toArray(new int[0][]);
                    AnonymousClass1KW r06 = emojiExpressionsViewModel2.A0I;
                    C18070vi.A0b(r4);
                    Integer num4 = null;
                    if (z) {
                        num4 = num2;
                    }
                    A13.add(new C117535zx(r06, r4, num4, iArr3, iArr4));
                    A132.clear();
                    A132.add(r8);
                    r4 = A002;
                    if (z) {
                        z = false;
                    }
                } else {
                    A132.add(r8);
                }
            }
        }
        if (C17880vN.A1X(A132)) {
            ArrayList<C117525zw> A0E8 = C29351c6.A0E(A132);
            Iterator it4 = A132.iterator();
            while (it4.hasNext()) {
                Object next3 = it4.next();
                C18070vi.A0z(next3, "null cannot be cast to non-null type com.whatsapp.expressionstray.expression.emoji.grid.EmojiExpressionsViewItem.EmojiItem");
                A0E8.add(next3);
            }
            ArrayList A0E9 = C29351c6.A0E(A0E8);
            for (C117525zw r07 : A0E8) {
                A0E9.add(r07.A03);
            }
            int[][] iArr5 = (int[][]) A0E9.toArray(new int[0][]);
            ArrayList A0E10 = C29351c6.A0E(A0E8);
            for (C117525zw r08 : A0E8) {
                A0E10.add(r08.A04);
            }
            int[][] iArr6 = (int[][]) A0E10.toArray(new int[0][]);
            AnonymousClass1KW r1 = emojiExpressionsViewModel2.A0I;
            C18070vi.A0b(r4);
            if (!z) {
                num2 = null;
            }
            A13.add(new C117535zx(r1, r4, num2, iArr5, iArr6));
        }
        return A13;
    }

    public static final List A03(C135736sg r7, List list) {
        ArrayList A0z = C17880vN.A0z(C29351c6.A0C(list, 10));
        if (r7 == null) {
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AnonymousClass1ZU.A0B();
                    throw null;
                }
                C135736sg r5 = (C135736sg) next;
                if (i == 0) {
                    r5 = new C135736sg(r5.A01, r5.A00, r5.A02, true);
                }
                A0z.add(r5);
                i = i2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C135736sg r1 = (C135736sg) it.next();
                String str = r1.A02;
                A0z.add(new C135736sg(r1.A01, r1.A00, str, C18070vi.A18(str, r7.A02)));
            }
        }
        return A0z;
    }

    public final void A0T(int[] iArr, int i) {
        AnonymousClass3MW.A1X(this.A0G, new EmojiExpressionsViewModel$onEmojiSelected$1(this, (C30391dr) null, iArr, i), C41561wd.A00(this));
    }
}
