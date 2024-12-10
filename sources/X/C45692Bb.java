package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.view.View;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2Bb  reason: invalid class name and case insensitive filesystem */
public final class C45692Bb extends C39381sz {
    public final C40371ub A00;
    public final AnonymousClass1BI A01;
    public final Typeface A02;
    public final AnonymousClass11S A03;
    public final C203411t A04;
    public final AnonymousClass1CJ A05;
    public final AnonymousClass1MZ A06;
    public final C70503Bi A07;
    public final C18030ve A08;
    public final AnonymousClass00H A09;

    public void onClick(View view) {
        AnonymousClass1BI r6 = this.A07.A00;
        if (!this.A03.A0O(r6)) {
            AnonymousClass1FU r4 = (AnonymousClass1FU) AnonymousClass1L9.A01(view.getContext(), AnonymousClass1FU.class);
            if (C42701yb.A01(r6)) {
                if (C22971Dz.A0M(r6)) {
                    if (C18020vd.A05(C18040vf.A02, this.A08, 12795) && C22971Dz.A0M(r6)) {
                        C18070vi.A0z(r6, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                        r6 = C22971Dz.A03((UserJid) r6);
                    }
                }
                ((C25811Ps) this.A09.get()).A07(r4, (AnonymousClass86Z) null, (C1598286a) null, new C143217Cn(r4, r6, this, 1));
            } else if (C22971Dz.A0d(r6)) {
                AnonymousClass1MZ r2 = this.A06;
                AnonymousClass1BI r1 = this.A01;
                C36321nh r0 = GroupJid.Companion;
                r2.A03(r6, C36321nh.A00(r1)).A0A(r4, new C91494fm(r4, this, 25));
            } else if (r6 instanceof AnonymousClass1EC) {
                AnonymousClass1BI r12 = this.A01;
                if (C22971Dz.A0e(r12)) {
                    Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
                    AnonymousClass1EC A002 = C42941yz.A00(r12);
                    if (A002 != null) {
                        C40371ub r9 = this.A00;
                        int BVA = r9.A00.BVA(A002);
                        int A062 = r9.A01.A06(A002);
                        Integer A012 = C40371ub.A01(BVA);
                        long A063 = (long) r9.A02.A08.A0B(A002).A06();
                        r9.A06.get();
                        Integer A013 = C63152sb.A01(A062);
                        if (!(A012 == null || A013 == null)) {
                            AnonymousClass2GC r5 = new AnonymousClass2GC();
                            r5.A05 = ((C189339iv) r9.A04.get()).A00();
                            r5.A00 = 14;
                            r5.A01 = 1;
                            r5.A03 = A012;
                            r5.A04 = Long.valueOf(A063);
                            r5.A02 = A013;
                            r9.A03.CC7(r5);
                        }
                    }
                }
                GroupJid groupJid = (GroupJid) r6;
                AnonymousClass1CJ r13 = this.A05;
                if (!r13.A0P(groupJid) || !this.A06.A0J(groupJid)) {
                    Parcelable.Creator creator2 = AnonymousClass1EC.CREATOR;
                    AnonymousClass1EC A003 = C42941yz.A00(groupJid);
                    if (A003 != null) {
                        C203411t r22 = this.A04;
                        r4.getClass();
                        r22.CAv(A003, new AnonymousClass3AT(r4, 0), 9);
                    }
                } else if (AnonymousClass2TI.A00(r13.A06(groupJid))) {
                    this.A04.CAt(r4, groupJid, 9);
                } else {
                    new Object();
                    r4.startActivity(AnonymousClass1LU.A0C(r4, 0).putExtra("jid", C22971Dz.A06(groupJid)), (Bundle) null);
                }
            }
        }
    }

    public C45692Bb(Context context, AnonymousClass11S r3, C203411t r4, C40371ub r5, AnonymousClass1CJ r6, AnonymousClass1MZ r7, C70503Bi r8, C18030ve r9, AnonymousClass1BI r10, AnonymousClass00H r11, int i, boolean z) {
        super(context, i);
        Typeface typeface;
        this.A08 = r9;
        this.A03 = r3;
        this.A05 = r6;
        this.A09 = r11;
        this.A00 = r5;
        this.A04 = r4;
        this.A06 = r7;
        this.A07 = r8;
        this.A01 = r10;
        if (z) {
            typeface = C43421zm.A00();
        } else {
            typeface = null;
        }
        this.A02 = typeface;
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        Typeface typeface = this.A02;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
    }
}
