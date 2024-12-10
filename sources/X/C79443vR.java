package X;

import android.os.Bundle;
import com.whatsapp.conversation.CommentsBottomSheet;
import com.whatsapp.messagetranslation.TranslationManager$removeTranslation$1;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3vR  reason: invalid class name and case insensitive filesystem */
public final class C79443vR extends C95124lj {
    public final AnonymousClass4aY A00;
    public final C79683vr A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C79443vR(X.C56472hW r3, X.AnonymousClass4aY r4, X.C79683vr r5) {
        /*
            r2 = this;
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            X.C18070vi.A0k(r4, r5)
            X.5ZZ[] r1 = new X.AnonymousClass5ZZ[r0]
            X.1FY r0 = X.C72453Mb.A0e(r4)
            X.C95124lj.A00(r3, r0, r1)
            r2.<init>(r1)
            r2.A00 = r4
            r2.A01 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79443vR.<init>(X.2hW, X.4aY, X.3vr):void");
    }

    public boolean BKp(int i, Collection collection) {
        AnonymousClass206 r2;
        String str;
        CM2 cm2;
        Boolean bool;
        C25550Cho cho;
        Integer num;
        List list;
        List<C135966t3> list2;
        String A0H;
        String str2;
        Collection collection2 = collection;
        C18070vi.A0d(collection2, 1);
        int i2 = i;
        if (i2 == 1) {
            C80123wa r22 = (C80123wa) this.A01.A09.get();
            AnonymousClass206 A0s = AnonymousClass3MX.A0s(collection2);
            AnonymousClass4aY r1 = this.A00;
            C18070vi.A0d(A0s, 0);
            if (((C695937u) r22.A00.get()).A01(A0s)) {
                AnonymousClass1BI r3 = r1.A3R;
                AnonymousClass1FY A0e = C72453Mb.A0e(r1);
                if (r3 == null) {
                    Log.i("Unable to launch bottom sheet due to null chatJid");
                    return true;
                }
                Bundle A0D = C17880vN.A0D();
                AnonymousClass4aU.A0A(A0D, A0s.A0v);
                AnonymousClass3MY.A15(A0D, r3, "jid");
                CommentsBottomSheet commentsBottomSheet = new CommentsBottomSheet();
                commentsBottomSheet.A1R(A0D);
                A0e.CMl(commentsBottomSheet);
                return true;
            } else if (r1.A3H()) {
                r22.A02(C72453Mb.A0e(r1), A0s);
                return true;
            } else {
                r1.A2b.A0b(A0s);
                return true;
            }
        } else if (i2 == 12) {
            return ((C79713vu) this.A01.A08.get()).A02(C72453Mb.A0e(this.A00), AnonymousClass3MX.A0s(collection2));
        } else if (i2 == 15) {
            C79793w2 r4 = (C79793w2) this.A01.A0A.get();
            AnonymousClass206 A0s2 = AnonymousClass3MX.A0s(collection2);
            AnonymousClass4aY r12 = this.A00;
            C18070vi.A0d(A0s2, 0);
            AnonymousClass1FY A0e2 = C72453Mb.A0e(r12);
            AnonymousClass5H7 r7 = new AnonymousClass5H7(r12);
            AnonymousClass1BI r5 = A0s2.A0v.A00;
            if (r5 == null) {
                return false;
            }
            r4.A01.A04().A09(new C146017Nm(A0e2, r4, r5, A0s2, r7, "message_menu", 1));
            return true;
        } else if (i2 == 26) {
            C95064ld r52 = (C95064ld) this.A01.A0D.get();
            AnonymousClass1FY A0e3 = C72453Mb.A0e(this.A00);
            ArrayList A13 = AnonymousClass000.A13();
            for (Object next : collection2) {
                if (next instanceof C441822l) {
                    A13.add(next);
                }
            }
            if (A13.isEmpty()) {
                return false;
            }
            ((AnonymousClass4V5) r52.A00.get()).A02(A0e3, A13);
            return true;
        } else if (i2 == 28) {
            C79823w5 r42 = (C79823w5) this.A01.A04.get();
            AnonymousClass206 A0s3 = AnonymousClass3MX.A0s(collection2);
            AnonymousClass4aY r53 = this.A00;
            C18070vi.A0d(A0s3, 0);
            AnonymousClass1BI r23 = A0s3.A0v.A00;
            if (!(r23 instanceof AnonymousClass1EC)) {
                return false;
            }
            AnonymousClass1FY A0e4 = C72453Mb.A0e(r53);
            AnonymousClass1EC A05 = AnonymousClass3MW.A0Z(r42.A0C).A05((AnonymousClass1EC) r23);
            String A0F = r42.A05.A0F(A05);
            A0e4.A44(A0e4.getString(2131889109));
            String A0R = C17890vO.A0R(A0e4, A0F, 1, 0, 2131898916);
            C18070vi.A0X(A0R);
            String valueOf = String.valueOf(A0s3.A0P());
            List emptyList = Collections.emptyList();
            C18070vi.A0X(emptyList);
            AnonymousClass1EB A002 = ((C57672jS) r42.A0D.get()).A00();
            AnonymousClass126 r32 = r42.A0A;
            r32.A1F.add(A002);
            C188679ho r8 = new C188679ho(A05, A002, A0R, valueOf, emptyList, 0, false, true, true, false, true, false, true, false);
            AnonymousClass11P r122 = r42.A04;
            AnonymousClass126 r15 = r32;
            AnonymousClass415 r9 = new AnonymousClass415(r53, r42, r122, r42.A06, r42.A07, r15, r8, r42.A0B);
            C18030ve r54 = r42.A09;
            new C20988Acg(r42.A00, r42.A02, r42.A03, r122, r42.A08, r54, r15, r9, r9.A00, C17880vN.A0U(r42.A0E)).A00();
            return true;
        } else if (i2 == 31) {
            return ((C79843w7) this.A01.A0B.get()).A02(C72453Mb.A0e(this.A00), AnonymousClass3MX.A0s(collection2));
        } else if (i2 == 37) {
            C95044lb r72 = (C95044lb) this.A01.A02.get();
            ArrayList A132 = AnonymousClass000.A13();
            for (Object next2 : collection2) {
                if (next2 instanceof C441822l) {
                    A132.add(next2);
                }
            }
            if (A132.isEmpty()) {
                return false;
            }
            for (Object next3 : A132) {
                C128826gk r33 = (C128826gk) r72.A00.get();
                C18070vi.A0d(next3, 0);
                r33.A01.CGF(new AnonymousClass7RN(r33, next3, 1));
            }
            return true;
        } else if (i2 == 9) {
            return ((C79863w9) this.A01.A06.get()).A02(this.A00, AnonymousClass3MX.A0s(collection2));
        } else if (i2 == 10) {
            AnonymousClass206 A0s4 = AnonymousClass3MX.A0s(collection2);
            AnonymousClass4aY r13 = this.A00;
            return ((C79853w8) this.A01.A00.get()).A02(C72453Mb.A0e(r13), r13, A0s4);
        } else if (i2 == 34) {
            C79773w0 r43 = (C79773w0) this.A01.A0C.get();
            AnonymousClass206 A0s5 = AnonymousClass3MX.A0s(collection2);
            C18070vi.A0d(A0s5, 0);
            AnonymousClass4aS.A05(r43.A00, r43.A01, r43.A03, A0s5);
            return true;
        } else if (i2 != 35) {
            switch (i) {
                case 39:
                    this.A01.A03.get();
                    Object A0X = C29431cG.A0X(collection2);
                    AnonymousClass4aY r34 = this.A00;
                    C18070vi.A0d(A0X, 0);
                    r34.A1L.A0J(new C98704ra(r34, A0X, 34));
                    return true;
                case 40:
                    this.A01.A05.get();
                    AnonymousClass4aY r35 = this.A00;
                    if (collection2.size() != 1 || (r2 = (AnonymousClass206) C29431cG.A0Y(collection2)) == null) {
                        return false;
                    }
                    if (!(r2 instanceof C441822l)) {
                        C17900vP.A0X(r2, "DebugTranscriptionAction called on non-audio message ", AnonymousClass000.A10());
                        return false;
                    }
                    AnonymousClass1GP supportFragmentManager = AnonymousClass3MW.A0P(r35).getSupportFragmentManager();
                    C441722k r24 = (C441722k) r2;
                    C62572rc r14 = r24.A02;
                    AnonymousClass7LG r10 = (AnonymousClass7LG) r24.A00.A02;
                    Integer num2 = null;
                    if (r14 != null) {
                        str = r14.A0P;
                    } else {
                        str = null;
                    }
                    if (r10 != null) {
                        cm2 = r10.A04;
                        bool = Boolean.valueOf(r10.A07);
                        cho = r10.A03;
                        num = Integer.valueOf(r10.A01);
                    } else {
                        cm2 = null;
                        bool = null;
                        cho = null;
                        num = null;
                    }
                    List A1G = r24.A1G();
                    if (A1G != null) {
                        list = C98924rw.A00(A1G, 6);
                    } else {
                        list = null;
                    }
                    boolean z = false;
                    if (str == null) {
                        A0H = "null";
                    } else {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("\n\n");
                        if (list == null) {
                            list2 = C18460wS.A00;
                        } else {
                            list2 = list;
                        }
                        int i3 = 0;
                        for (C135966t3 r16 : list2) {
                            int i4 = r16.A03;
                            int i5 = r16.A02;
                            int i6 = r16.A00;
                            int i7 = i5 + i4;
                            A10.append(str, i3, i4);
                            String substring = str.substring(i4, i7);
                            C18070vi.A0X(substring);
                            StringBuilder A102 = AnonymousClass000.A10();
                            A102.append('[');
                            A102.append(substring);
                            A102.append("][");
                            A102.append(i6);
                            A10.append(C17890vO.A0c(A102, ']'));
                            i3 = i7;
                        }
                        A10.append(str, i3, str.length());
                        A0H = C18070vi.A0H(A10);
                    }
                    StringBuilder A103 = AnonymousClass000.A10();
                    StringBuilder A104 = AnonymousClass000.A10();
                    A104.append("\n      Status: ");
                    A104.append(cm2);
                    A104.append("\n      Locale: ");
                    A104.append(cho);
                    A104.append("\n      Feedback submitted: ");
                    A104.append(bool);
                    A104.append("\n      Min segment confidence: ");
                    A104.append(num);
                    A104.append("\n      Transcription ID: ");
                    if (r10 != null) {
                        str2 = r10.A05;
                    } else {
                        str2 = null;
                    }
                    A104.append(str2);
                    A104.append("\n      Segments are loaded: ");
                    if (list != null) {
                        z = true;
                    }
                    A104.append(z);
                    A104.append("\n      Segment count: ");
                    if (list != null) {
                        num2 = Integer.valueOf(list.size());
                    }
                    A104.append(num2);
                    A103.append(AnonymousClass1Y7.A01(AnonymousClass000.A0y("\n    ", A104)));
                    AnonymousClass9P2.A00(supportFragmentManager, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, AnonymousClass001.A1H("\nTranscription: ", A0H, A103), (Object[]) null, 2131899286);
                    return true;
                case 41:
                    this.A01.A0E.get();
                    AnonymousClass1FY A0e5 = C72453Mb.A0e(this.A00);
                    if (collection2.isEmpty()) {
                        return false;
                    }
                    AnonymousClass1BI r44 = AnonymousClass3MX.A0s(collection2).A0v.A00;
                    if (r44 == null) {
                        return true;
                    }
                    AnonymousClass1GP supportFragmentManager2 = A0e5.getSupportFragmentManager();
                    ArrayList A0D2 = C29351c6.A0D(collection2);
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        AnonymousClass205 A105 = AnonymousClass3MZ.A10(it);
                        C18070vi.A0W(A105);
                        A0D2.add(A105);
                    }
                    C20098A7b.A01(AnonymousClass4H4.A00(r44, A0D2, false), supportFragmentManager2);
                    return true;
                case 42:
                    C95054lc r25 = (C95054lc) this.A01.A07.get();
                    if (collection2.isEmpty()) {
                        return false;
                    }
                    AnonymousClass4RU r55 = r25.A00;
                    AnonymousClass3MW.A1X(r55.A04, new TranslationManager$removeTranslation$1(r55, collection2, (C30391dr) null), r55.A06);
                    return true;
                case 43:
                    this.A01.A0G.get();
                    AnonymousClass206 A0s6 = AnonymousClass3MX.A0s(collection2);
                    AnonymousClass1FY A0e6 = C72453Mb.A0e(this.A00);
                    C18070vi.A0d(A0s6, 0);
                    AnonymousClass205 r0 = A0s6.A0v;
                    AnonymousClass1BI r26 = r0.A00;
                    if (r26 == null) {
                        return true;
                    }
                    C20098A7b.A01(AnonymousClass4H4.A00(r26, C18070vi.A0M(r0), true), A0e6.getSupportFragmentManager());
                    return true;
                case 44:
                    C95034la r6 = (C95034la) this.A01.A01.get();
                    AnonymousClass1FY A0e7 = C72453Mb.A0e(this.A00);
                    ArrayList A133 = AnonymousClass000.A13();
                    for (Object next4 : collection2) {
                        if (next4 instanceof C441822l) {
                            A133.add(next4);
                        }
                    }
                    if (A133.isEmpty()) {
                        return false;
                    }
                    AnonymousClass4V5 r36 = (AnonymousClass4V5) r6.A00.get();
                    ArrayList A0D3 = C29351c6.A0D(A133);
                    Iterator it2 = A133.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass205 A106 = AnonymousClass3MZ.A10(it2);
                        C18070vi.A0W(A106);
                        A0D3.add(A106);
                    }
                    r36.A00(A0e7, A0D3);
                    return true;
                default:
                    return super.BKp(i2, collection2);
            }
        } else {
            this.A01.A0F.get();
            AnonymousClass1FY A0e8 = C72453Mb.A0e(this.A00);
            AnonymousClass206 A0s7 = AnonymousClass3MX.A0s(collection2);
            C18070vi.A0d(A0s7, 1);
            A0e8.startActivity(AnonymousClass1LU.A1B(A0e8, A0s7.A0I()));
            return true;
        }
    }
}
