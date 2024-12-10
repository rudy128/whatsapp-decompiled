package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.wds.components.list.listitem.WDSListItem;

/* renamed from: X.2D5  reason: invalid class name */
public class AnonymousClass2D5 extends C42461yD {
    public C116715yV A00;
    public final Context A01;
    public final AnonymousClass1M9 A02;
    public final C37471pb A03;
    public final C34021jm A04;
    public final C18000vb A05;

    public static void A00(C128376ft r13, AnonymousClass2D5 r14) {
        if (r13 != null) {
            AnonymousClass206 r4 = r13.A02;
            AnonymousClass1E7 r3 = r13.A00;
            AnonymousClass1E7 r5 = r13.A01;
            C18000vb r9 = r14.A05;
            C42071xZ r6 = r14.A06;
            View view = r6.A02;
            Context context = r14.A01;
            C27641Ww.A07(view, r9, context.getResources().getDimensionPixelSize(2131167291), 0, 0, 0);
            View view2 = r6.A02;
            if (view2 instanceof WDSListItem) {
                ((WDSListItem) view2).A08();
            }
            r6.A01.setVisibility(8);
            r6.A0L.A04(8);
            r6.A06.setVisibility(8);
            r6.A05.setVisibility(8);
            r6.A0O.A04(8);
            r6.A0M.A04(8);
            r6.A0D.A04(8);
            r6.A0K(false, 0);
            r6.A07.setVisibility(0);
            C43411zl.A00(r6.A07);
            r6.A07.A0L();
            r6.A07.setPlaceholder(0);
            C42131xg r2 = r6.A09;
            r2.A06.getDateView().setTextColor(C19740yt.A00(context, AnonymousClass1YL.A00(context, 2130970340, 2131101312)));
            r6.A09.A03(0);
            r6.A04.setEnabled(false);
            r6.A04.setOnClickListener((View.OnClickListener) null);
            r6.A04.setOnLongClickListener((View.OnLongClickListener) null);
            r6.A01.setOnClickListener((View.OnClickListener) null);
            r6.A01.setOnLongClickListener((View.OnLongClickListener) null);
            r6.A0H.setOnClickListener(new C90014dO(r14, r4, 14));
            r6.A09.A04(r3, r14.A0G, r14.A04.BXB());
            r6.A09.A03.A0E(r3);
            r14.A0H(r3, r5, (GroupJid) null, r4);
        }
    }

    public void A0I() {
        super.A0I();
        C116715yV r0 = this.A00;
        if (r0 != null) {
            r0.A00.A01();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2D5(android.content.Context r30, X.AnonymousClass11S r31, X.C32191gn r32, X.C37551pj r33, X.AnonymousClass1M9 r34, X.C24921Me r35, X.C37471pb r36, X.C34021jm r37, X.C42071xZ r38, X.AnonymousClass11C r39, X.AnonymousClass11P r40, X.AnonymousClass118 r41, X.C18000vb r42, X.AnonymousClass1CJ r43, X.AnonymousClass1NA r44, X.C42351y2 r45, X.C18030ve r46, X.AnonymousClass12L r47, X.C42211xo r48, X.C32091gc r49, X.AnonymousClass1QO r50, X.AnonymousClass1QS r51, X.AnonymousClass1R2 r52, X.C42341y1 r53, X.AnonymousClass1PU r54, X.C43351zf r55, X.AnonymousClass00H r56, X.AnonymousClass00H r57) {
        /*
            r29 = this;
            r12 = r41
            r11 = r40
            r10 = r39
            r9 = r38
            r8 = r37
            r7 = r35
            r6 = r34
            r5 = r33
            r4 = r32
            r3 = r31
            r2 = r30
            r1 = r29
            r13 = r42
            r14 = r43
            r15 = r44
            r28 = r57
            r27 = r56
            r26 = r55
            r25 = r54
            r24 = r53
            r23 = r52
            r22 = r51
            r21 = r50
            r20 = r49
            r19 = r48
            r18 = r47
            r17 = r46
            r16 = r45
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r1.A01 = r2
            r1.A05 = r13
            r0 = r36
            r1.A03 = r0
            r1.A04 = r8
            r1.A02 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2D5.<init>(android.content.Context, X.11S, X.1gn, X.1pj, X.1M9, X.1Me, X.1pb, X.1jm, X.1xZ, X.11C, X.11P, X.118, X.0vb, X.1CJ, X.1NA, X.1y2, X.0ve, X.12L, X.1xo, X.1gc, X.1QO, X.1QS, X.1R2, X.1y1, X.1PU, X.1zf, X.00H, X.00H):void");
    }
}
