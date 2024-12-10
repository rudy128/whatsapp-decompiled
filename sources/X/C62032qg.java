package X;

import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.2qg  reason: invalid class name and case insensitive filesystem */
public final class C62032qg {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass190 A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public final AnonymousClass206 A01(C688634z r12, C63362sw r13) {
        AnonymousClass1BI r7;
        C166418cr r2;
        long j;
        Parcelable.Creator creator = C29681ch.CREATOR;
        Jid jid = r13.A0Z;
        if (!(jid instanceof C29681ch) || (r7 = (AnonymousClass1BI) jid) == null) {
            throw new C32711hd(0, "NewsletterMessageManager/trying to process newsletter message for non newsletter chat");
        }
        C58882lP r0 = r12.A02;
        if (r0 == null || (r2 = r0.A00) == null) {
            AnonymousClass00H r6 = this.A04;
            r6.get();
            boolean z = r13.A0B.A02;
            AnonymousClass1BI A032 = r13.A03();
            String str = r13.A0h;
            AnonymousClass23Q r3 = new AnonymousClass23Q(AnonymousClass205.A01(A032, str, z), r13.A0X);
            r3.A01 = str;
            if (z || A00(r7)) {
                r3.A0a(4);
            }
            r3.A0y = r12.A00;
            if (C18020vd.A05(C18040vf.A02, ((AnonymousClass1c4) r6.get()).A02, 10657)) {
                r3.A0S = 7;
            }
            return r3;
        }
        C59052lg r32 = r12.A01;
        if (r32 != null) {
            j = r32.A01;
        } else {
            j = r13.A0X;
        }
        C192879p8 A012 = C196699vU.A01(r2, r13.A0B, r13, j);
        A012.A02 = C22971Dz.A00(r13.A0Y);
        A012.A0A = true;
        A012.A00 = r13.A01;
        A012.A08 = r13.A0R;
        AnonymousClass206 A002 = ((AnonymousClass12N) this.A00.get()).A00(A012.A00());
        if (r13.A01 == 3) {
            A002.A0b(131072);
            if (r32 != null) {
                AnonymousClass205 r62 = A002.A0v;
                C18070vi.A0W(r62);
                long j2 = r32.A00;
                C60492o7.A01(A002, new C691536c(r62, j2, j2));
                A002.A0I = r32.A01;
            }
        }
        if (!((C1179361n) this.A01.get()).A04(A002)) {
            byte[] A0M = r2.A0M();
            A002 = new AnonymousClass23U(A002.A0v, A0M, 2, r13.A01, A002.A0I);
        }
        AnonymousClass205 r1 = A002.A0v;
        if (r1.A02 || A00(r1.A00)) {
            A002.A0a(4);
        }
        A002.A0y = r12.A00;
        return A002;
    }

    private final boolean A00(AnonymousClass1BI r4) {
        C46162Dk r2;
        if (r4 == null) {
            return false;
        }
        C29691ci A002 = AnonymousClass1CJ.A00((AnonymousClass1CJ) this.A03.get(), r4);
        Boolean bool = null;
        if ((A002 instanceof C46162Dk) && (r2 = (C46162Dk) A002) != null) {
            bool = Boolean.valueOf(r2.A0P());
        }
        return C18070vi.A18(bool, AnonymousClass000.A0i());
    }

    public C62032qg(AnonymousClass190 r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        this.A02 = r1;
        this.A03 = r2;
        this.A04 = r3;
        this.A00 = r4;
        this.A01 = r5;
    }
}
