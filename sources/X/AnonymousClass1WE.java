package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.1WE  reason: invalid class name */
public class AnonymousClass1WE {
    public final AnonymousClass1Cd A00;
    public final C24751Ln A01;
    public final AnonymousClass1WD A02;
    public final C202711m A03;
    public final C18030ve A04;
    public final AnonymousClass1WC A05;
    public final AnonymousClass190 A06;
    public final AnonymousClass11S A07;
    public final AnonymousClass121 A08;
    public final AnonymousClass1DL A09;

    public static AnonymousClass227 A00(AnonymousClass1WE r13, AnonymousClass1BI r14, AnonymousClass206 r15, boolean z) {
        long j;
        Cursor A032;
        long j2 = r15.A0x;
        if (r14 != null) {
            j = r13.A09.A09(r14);
        } else {
            j = -1;
        }
        C28781at A042 = r13.A00.get();
        try {
            C202711m r5 = r13.A03;
            A032 = r5.A03(A042, 56, j2, j, z);
            if (A032.moveToNext()) {
                HashMap A012 = C63792th.A01(A032, 56);
                AnonymousClass212 A052 = r5.A05(A032, A012);
                if (!(A052 instanceof AnonymousClass227)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MessageAddOnReactionManager/getMessageAddOnReactionForMessageAndSender unexpected fmessage ");
                    sb.append(A052);
                    Log.e(sb.toString());
                } else {
                    AnonymousClass227 r3 = (AnonymousClass227) A052;
                    r3.A1B(A032, r13.A09, A012);
                    r3.A05 = new A51(r15.A0H(), r15.A0v);
                    A032.close();
                    A042.close();
                    return r3;
                }
            }
            A032.close();
            A042.close();
            return null;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass1WE(AnonymousClass190 r1, AnonymousClass11S r2, AnonymousClass121 r3, AnonymousClass1DL r4, AnonymousClass1Cd r5, C24751Ln r6, AnonymousClass1WD r7, C202711m r8, C18030ve r9, AnonymousClass1WC r10) {
        this.A04 = r9;
        this.A09 = r4;
        this.A06 = r1;
        this.A07 = r2;
        this.A01 = r6;
        this.A03 = r8;
        this.A00 = r5;
        this.A05 = r10;
        this.A08 = r3;
        this.A02 = r7;
    }

    public static void A01(AnonymousClass1WE r4, AnonymousClass206 r5, AnonymousClass227 r6, AnonymousClass227 r7) {
        if (!r5.A0w()) {
            AnonymousClass8BG A012 = C63892tr.A01(r5);
            if (A012 != null) {
                if (r6 != null) {
                    C24751Ln r2 = r4.A01;
                    AnonymousClass1BI A0H = r6.A0H();
                    C22941Dw r0 = UserJid.Companion;
                    A012.CFH(r6, r7, r2.A0Q(C22941Dw.A01(A0H), C22941Dw.A01(r7.A0H())));
                } else {
                    A012.BBg(r7);
                }
                ((AnonymousClass122) r4.A08).A0R.A0B(r5);
            } else if (!r5.A10(1)) {
                C63892tr.A07(new AnonymousClass7CA(r4.A07, Collections.singletonList(r7)), r5);
                r5.A0W(1);
                r4.A08.CQv(r5);
            }
        }
    }
}
