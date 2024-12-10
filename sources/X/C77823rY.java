package X;

import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.whatsapp.util.Log;

/* renamed from: X.3rY  reason: invalid class name and case insensitive filesystem */
public class C77823rY extends C75423hT {
    public final AnonymousClass1DC A00;

    public void BqX(Menu menu) {
        C137526vb.A00(menu);
        Log.i("listconversationmenu/oncreateoptionsmenu");
        A02(menu, 21, 2131891715, 2131233414);
        A02(menu, 6, 2131897896, 2131232170);
        C75443hV.A01(menu, this);
        A02(menu, 5, 2131898398, 2131232435);
        AnonymousClass00H r1 = this.A0K;
        if (C72453Mb.A1W(r1)) {
            r1.get();
            r1.get();
            A02(menu, 22, 2131891989, 2131233505);
        }
        SubMenu addSubMenu = menu.addSubMenu(0, 1, 0, 2131899186);
        addSubMenu.clearHeader();
        A0F(addSubMenu);
        A0G(addSubMenu);
        A0E(addSubMenu);
    }

    public boolean Bze(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 21) {
            AnonymousClass01E r3 = this.A01;
            r3.startActivity(AnonymousClass1LU.A12(r3, this.A00.A0J, true), AnonymousClass4ZR.A00(r3, r3.findViewById(2131436426), this.A07));
            return true;
        } else if (itemId != 22) {
            return super.Bze(menuItem);
        } else {
            AnonymousClass00H r1 = this.A0K;
            if (C72453Mb.A1W(r1)) {
                ((C38501rO) r1.get()).A05(this.A01.getSupportFragmentManager(), this.A0G, C17880vN.A0j(), (AnonymousClass1OS) null);
            }
            return true;
        }
    }

    public boolean C1Y(Menu menu) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("listconversationmenu/onprepareoptionsmenu ");
        C17900vP.A0o(A10, menu.size());
        if (menu.size() == 0) {
            return false;
        }
        return super.C1Y(menu);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C77823rY(X.AnonymousClass01E r37, X.C19880zA r38, X.C19880zA r39, X.C84164Ii r40, X.C56322hH r41, X.C84174Ij r42, X.AnonymousClass1FR r43, X.AnonymousClass1KB r44, X.AnonymousClass11S r45, X.AnonymousClass18O r46, X.C33251iW r47, X.AnonymousClass4ZR r48, X.AnonymousClass1HS r49, X.AnonymousClass1MC r50, X.C24671Lf r51, X.C108885cS r52, X.C32951i1 r53, X.AnonymousClass11C r54, X.C19830z4 r55, X.C18000vb r56, X.AnonymousClass1Q1 r57, X.AnonymousClass1CJ r58, X.C25181Nf r59, X.AnonymousClass1E7 r60, X.AnonymousClass1RK r61, X.C18030ve r62, X.AnonymousClass12L r63, X.C25191Ng r64, X.C47712Jo r65, X.C37701pz r66, X.AnonymousClass1Nb r67, X.C25831Pu r68, X.AnonymousClass1DC r69, X.AnonymousClass10I r70, X.AnonymousClass00H r71) {
        /*
            r36 = this;
            r29 = r64
            r28 = r63
            r27 = r62
            r26 = r61
            r25 = r60
            r24 = r59
            r23 = r58
            r11 = r46
            r12 = r47
            r13 = r48
            r30 = r65
            r1 = r36
            r31 = r66
            r2 = r37
            r32 = r67
            r3 = r38
            r33 = r68
            r4 = r39
            r8 = r43
            r5 = r40
            r9 = r44
            r34 = r70
            r6 = r41
            r10 = r45
            r35 = r71
            r7 = r42
            r14 = r49
            r15 = r50
            r16 = r51
            r17 = r52
            r18 = r53
            r19 = r54
            r20 = r55
            r21 = r56
            r22 = r57
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r0 = r69
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77823rY.<init>(X.01E, X.0zA, X.0zA, X.4Ii, X.2hH, X.4Ij, X.1FR, X.1KB, X.11S, X.18O, X.1iW, X.4ZR, X.1HS, X.1MC, X.1Lf, X.5cS, X.1i1, X.11C, X.0z4, X.0vb, X.1Q1, X.1CJ, X.1Nf, X.1E7, X.1RK, X.0ve, X.12L, X.1Ng, X.2Jo, X.1pz, X.1Nb, X.1Pu, X.1DC, X.10I, X.00H):void");
    }
}
