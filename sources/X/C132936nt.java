package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6nt  reason: invalid class name and case insensitive filesystem */
public final class C132936nt {
    public int A00;
    public final int A01;
    public final C128876gp A02;
    public final ArrayList A03 = AnonymousClass000.A13();
    public final ArrayList A04 = AnonymousClass000.A13();
    public final ArrayList A05 = AnonymousClass000.A13();

    public final synchronized void A00(int i, long j, int i2) {
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        synchronized (this) {
            int i3 = i;
            long j2 = j;
            if (i3 == 1) {
                C17880vN.A1R(this.A04, j2);
            } else if (i3 != 2) {
                C17880vN.A1R(this.A03, j2);
            } else {
                C17880vN.A1R(this.A05, j2);
            }
            int i4 = this.A00 + 1;
            this.A00 = i4;
            int i5 = this.A01;
            if (i4 == i5) {
                if (this.A04.size() == i5) {
                    C128856gn r3 = this.A02.A00;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("CrosspostRequestSessionManager/media upload success for session: ");
                    C136316tc r8 = r3.A02;
                    String str5 = r8.A04;
                    C18070vi.A0d(AnonymousClass000.A0y(str5, A10), 0);
                    C132196mM r7 = new C132196mM(r3.A00, r8);
                    C138626xP r5 = (C138626xP) r3.A01.A05.get();
                    ArrayList A13 = AnonymousClass000.A13();
                    AnonymousClass1IZ it = r8.A02.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            AnonymousClass206 A0Y = C17880vN.A0Y(it);
                            C136066tD r0 = (C136066tD) C108965cb.A0o(r8.A05, A0Y.A0x);
                            String str6 = null;
                            if (r0 == null || (str = r0.A03) == null || (str2 = r0.A01) == null || str2.length() == 0) {
                                break;
                            }
                            C26551So A012 = C63972u0.A01((AnonymousClass1BI) null, A0Y.A0u, 8);
                            C18070vi.A0X(A012);
                            if (A012.equals(C26551So.A0w)) {
                                num = AnonymousClass00R.A00;
                            } else {
                                num = AnonymousClass00R.A01;
                            }
                            if (num.intValue() != 0) {
                                str3 = "VIDEO";
                            } else {
                                str3 = "IMAGE";
                            }
                            if (A0Y instanceof AnonymousClass21V) {
                                str4 = ((AnonymousClass21V) A0Y).A18();
                            } else {
                                str4 = "";
                            }
                            String A0D = C109005cf.A0D(r5.A01, A0Y);
                            long j3 = A0Y.A0I;
                            C692236j A022 = C63672tV.A02(A0Y);
                            if (A022 != null && A022.A08) {
                                ((C25321Nt) r5.A04.get()).A04(A0Y);
                                AnonymousClass77U A002 = AnonymousClass6XJ.A00(A0Y);
                                if (A002 != null) {
                                    str6 = A002.A03;
                                }
                            }
                            String str7 = str;
                            A13.add(new C136396tk(Long.valueOf(j3), str7, str2, str3, str4, A0D, str6));
                        } else {
                            C128866go r1 = new C128866go(r7, r5, r8);
                            C122186Ob r52 = (C122186Ob) r5.A03.get();
                            AnonymousClass1IX r72 = r8.A01;
                            C130256j8 r82 = new C130256j8((C51502Yn) r52.A00.A00.A00.A4A.get(), r8.A03, str5, A13, r72);
                            C146407Oz r4 = new C146407Oz(r1, 1);
                            C18100vl r12 = r82.A04;
                            if (AnonymousClass3MW.A0y(r12) == null) {
                                r4.Bsx(AnonymousClass000.A0n("payload encryption failed"), (Integer) null);
                            } else {
                                String A0y = AnonymousClass3MW.A0y(r12);
                                if (A0y != null) {
                                    r52.A01(r4, (C122226Of) r52.A03.getValue(), A0y, 47);
                                } else {
                                    throw C17880vN.A0g();
                                }
                            }
                        }
                    }
                } else if (C17880vN.A1X(this.A03)) {
                    C128876gp r73 = this.A02;
                    C133526ou r6 = (C133526ou) r73.A02.A0A.get();
                    C136316tc r32 = r73.A01;
                    String str8 = r32.A04;
                    AnonymousClass1IX r02 = r32.A02;
                    ArrayList A0E = C29351c6.A0E(r02);
                    Iterator it2 = r02.iterator();
                    while (it2.hasNext()) {
                        C108995ce.A1Q(A0E, it2);
                    }
                    AnonymousClass1IX r03 = r32.A01;
                    ArrayList A0E2 = C29351c6.A0E(r03);
                    Iterator it3 = r03.iterator();
                    while (it3.hasNext()) {
                        C139886zb.A00(A0E2, it3);
                    }
                    r6.A01(str8, A0E, A0E2);
                    C128856gn r42 = r73.A00;
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("CrosspostRequestSessionManager/media upload delivery failure for session: ");
                    String str9 = r42.A02.A04;
                    C108995ce.A1O(A102, str9);
                    r42.A00.A02(AnonymousClass00R.A01, str9);
                } else {
                    C128856gn r43 = this.A02.A00;
                    StringBuilder A103 = AnonymousClass000.A10();
                    A103.append("CrosspostRequestSessionManager/media upload error for session: ");
                    C136316tc r33 = r43.A02;
                    String str10 = r33.A04;
                    A103.append(str10);
                    int i6 = i2;
                    C18070vi.A0d(AnonymousClass001.A1I(" with errorCode: ", A103, i6), 0);
                    r43.A00.A01(new AnonymousClass6OJ(i6), AnonymousClass00R.A01, str10, r33.A02, r33.A00);
                }
            }
        }
    }

    public C132936nt(C128876gp r2, int i) {
        this.A01 = i;
        this.A02 = r2;
    }
}
