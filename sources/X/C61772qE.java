package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.2qE  reason: invalid class name and case insensitive filesystem */
public class C61772qE {
    public final AnonymousClass11S A00;
    public final C25161Nd A01;
    public final AnonymousClass11P A02;
    public final C19830z4 A03;
    public final AnonymousClass1P3 A04;
    public final C25571Os A05;
    public final AnonymousClass122 A06;
    public final AnonymousClass1MZ A07;
    public final AnonymousClass1PT A08;
    public final AnonymousClass1PQ A09;
    public final AnonymousClass10I A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;

    public C61772qE(AnonymousClass11S r1, C25161Nd r2, AnonymousClass11P r3, C19830z4 r4, AnonymousClass1P3 r5, C25571Os r6, AnonymousClass122 r7, AnonymousClass1MZ r8, AnonymousClass1PT r9, AnonymousClass1PQ r10, AnonymousClass10I r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        this.A02 = r3;
        this.A00 = r1;
        this.A0A = r11;
        this.A05 = r6;
        this.A08 = r9;
        this.A0C = r12;
        this.A06 = r7;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
        this.A09 = r10;
        this.A07 = r8;
        this.A0B = r13;
    }

    public static HashSet A00(C61772qE r7, UserJid userJid) {
        HashSet A0G;
        HashSet A0G2;
        HashSet A12 = C17880vN.A12();
        AnonymousClass11S r2 = r7.A00;
        PhoneUserJid A012 = AnonymousClass11S.A01(r2);
        if (r2.A0O(A012)) {
            A0G = new HashSet(r7.A01.A08());
        } else {
            A0G = r7.A07.A08.A0G(A012);
        }
        if (r2.A0O(userJid)) {
            A0G2 = new HashSet(r7.A01.A08());
        } else {
            A0G2 = r7.A07.A08.A0G(userJid);
        }
        Iterator it = A0G2.iterator();
        while (it.hasNext()) {
            AnonymousClass1E9 r5 = (AnonymousClass1E9) it.next();
            if (A0G.contains(r5)) {
                C199410f A072 = r7.A07.A08.A0C(r5).A07();
                if (A072.contains(userJid) && (A072.contains(AnonymousClass11S.A00(r2)) || A072.contains(r2.A09()) || C22971Dz.A0N(r5))) {
                    A12.add(r5);
                }
            }
        }
        return A12;
    }
}
