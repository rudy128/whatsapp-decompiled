package X;

import com.whatsapp.jid.UserJid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: X.4aI  reason: invalid class name and case insensitive filesystem */
public class C88654aI {
    public final AnonymousClass1M9 A00;
    public final C30751eS A01;
    public final C51962a8 A02;
    public final C18030ve A03;
    public final C37711q0 A04;
    public final AnonymousClass18K A05;
    public final C189399jB A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass10I A0A;
    public final HashMap A0B;

    public final void A06(UserJid userJid, String str) {
        C18070vi.A0d(str, 1);
        if (userJid != null) {
            A00(this, userJid).A00 = str;
        }
    }

    public static final AnonymousClass4YT A00(C88654aI r2, UserJid userJid) {
        HashMap hashMap = r2.A0B;
        AnonymousClass4YT r1 = (AnonymousClass4YT) hashMap.get(userJid);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass4YT r12 = new AnonymousClass4YT(C17880vN.A12());
        hashMap.put(userJid, r12);
        return r12;
    }

    public static final C81693ze A01(C88654aI r11, AnonymousClass4YT r12, AnonymousClass1E7 r13, int i) {
        AnonymousClass1BI r8;
        String format;
        C81693ze r5 = new C81693ze();
        r5.A01 = Integer.valueOf(i);
        r5.A03 = r12.A00;
        r5.A04 = r11.A06.A00(r13.A0J);
        r5.A00 = Boolean.valueOf(r12.A02);
        if (C18020vd.A05(C18040vf.A02, r11.A03, 8492) && (r8 = r13.A0J) != null) {
            AnonymousClass00H r1 = r11.A07;
            long A092 = ((AnonymousClass1LW) r1.get()).A09(r8);
            long A072 = ((AnonymousClass1LW) r1.get()).A07(A092);
            if (A072 < 0 && A092 >= 0) {
                A072 = ((AnonymousClass121) r11.A08.get()).BVc(A092);
                ((AnonymousClass1LW) r1.get()).A0E(A092, A072);
            }
            if (A072 < 0) {
                format = null;
            } else {
                format = new SimpleDateFormat("yyyy/MM/dd", Locale.US).format(new Date(A072));
            }
            r5.A07 = format;
            r5.A08 = AnonymousClass3Ma.A14(r11.A04, r8);
        }
        AnonymousClass4QA r2 = (AnonymousClass4QA) r11.A09.get();
        C19830z4 r6 = r2.A01;
        long A0W = r6.A0W("pref_ctwa_customer_logging_counter_timestamp");
        AnonymousClass11P r4 = r2.A00;
        if (((float) (AnonymousClass11P.A01(r4) - A0W)) / 8.64E7f >= 1.0f) {
            r6.A1q("pref_ctwa_customer_logging_counter_timestamp", AnonymousClass11P.A01(r4));
            C17880vN.A1D(C19830z4.A00(r6), "pref_ctwa_customer_logging_counter", 0);
        }
        r5.A02 = Long.valueOf(C17890vO.A05(C17890vO.A0B(r6), "pref_ctwa_customer_logging_counter"));
        return r5;
    }

    public static final void A02(C88654aI r4, UserJid userJid, String str, int i) {
        if (userJid != null) {
            C88654aI r3 = r4;
            AnonymousClass4YT A002 = A00(r4, userJid);
            C18030ve r2 = r3.A03;
            C18040vf r1 = C18040vf.A02;
            if (C18020vd.A05(r1, r2, 1681) && C18020vd.A05(r1, r2, 12140)) {
                r3.A0A.CGF(new C98824rm(r3, A002, userJid, str, i));
            }
        }
    }

    public static final void A03(C88654aI r5, UserJid userJid, String str, int i, boolean z) {
        if (userJid != null) {
            C88654aI r4 = r5;
            AnonymousClass4YT A002 = A00(r5, userJid);
            if (C18020vd.A05(C18040vf.A02, r4.A03, 1681)) {
                HashSet A12 = C17880vN.A12();
                C17890vO.A1D(A12, 5);
                Integer A0h = AnonymousClass3MY.A0h();
                A12.add(A0h);
                C17890vO.A1D(A12, 14);
                A12.add(17);
                A12.add(17);
                C17890vO.A1D(A12, 16);
                C17890vO.A1D(A12, 18);
                Integer valueOf = Integer.valueOf(i);
                if (A12.contains(valueOf)) {
                    HashSet hashSet = A002.A03;
                    if (i == 16) {
                        hashSet.add(A0h);
                    }
                    if (!hashSet.add(valueOf)) {
                        return;
                    }
                }
                r4.A0A.CGF(new C70793Cn(r4, A002, userJid, str, i, z));
            }
        }
    }

    public C88654aI(AnonymousClass1M9 r2, C30751eS r3, C51962a8 r4, C18030ve r5, C37711q0 r6, AnonymousClass18K r7, C189399jB r8, AnonymousClass10I r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, HashMap hashMap) {
        C18070vi.A0w(r5, r7, r4, r3, r10);
        C72483Me.A16(r2, r8, r9, r6, 7);
        C72473Md.A1L(r11, r12);
        this.A03 = r5;
        this.A05 = r7;
        this.A02 = r4;
        this.A01 = r3;
        this.A09 = r10;
        this.A0B = hashMap;
        this.A00 = r2;
        this.A06 = r8;
        this.A0A = r9;
        this.A04 = r6;
        this.A07 = r11;
        this.A08 = r12;
    }

    public void A04(UserJid userJid) {
        if (C18020vd.A04(this)) {
            A03(this, userJid, (String) null, 33, true);
        }
    }

    public void A05(UserJid userJid) {
        if (C18020vd.A04(this)) {
            A03(this, userJid, (String) null, 34, true);
        }
    }
}
