package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.8HS  reason: invalid class name */
public final class AnonymousClass8HS extends C41251w3 {
    public final AnonymousClass9V7 A00;
    public final AnonymousClass9V8 A01;
    public final AnonymousClass9V9 A02;
    public final AnonymousClass9VA A03;
    public final C37451pZ A04;
    public final C22380B5j A05;
    public final C22381B5k A06;
    public final AnonymousClass8GV A07;

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        switch (i) {
            case 0:
                AnonymousClass9V9 r2 = this.A02;
                View A09 = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626492);
                C18070vi.A0X(A09);
                List list = C42011xT.A0I;
                AnonymousClass10E r0 = r2.A00.A01;
                return new C162048It(A09, AnonymousClass3Ma.A0a(r0), AnonymousClass3Ma.A0f(r0), AnonymousClass3Ma.A0r(r0));
            case 1:
                AnonymousClass9V8 r22 = this.A01;
                View A092 = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626491);
                List list2 = C42011xT.A0I;
                AnonymousClass10E r02 = r22.A00.A01;
                AnonymousClass1KW A0f = AnonymousClass3Ma.A0f(r02);
                return new AnonymousClass8J0(A092, AnonymousClass3Ma.A0a(r02), AnonymousClass10E.A6Q(r02), A0f, AnonymousClass3Ma.A0r(r02));
            case 2:
                AnonymousClass9VA r23 = this.A03;
                C37451pZ r8 = this.A04;
                View A093 = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626495);
                C18070vi.A0X(A093);
                C22381B5k b5k = this.A06;
                List list3 = C42011xT.A0I;
                AnonymousClass10E r03 = r23.A00.A01;
                return new AnonymousClass8J1(A093, AnonymousClass10E.A17(r03), AnonymousClass10E.A4z(r03), r8, AnonymousClass10E.A6O(r03), AnonymousClass10E.A6Q(r03), b5k);
            case 4:
                AnonymousClass9V7 r4 = this.A00;
                C37451pZ r3 = this.A04;
                View A094 = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626490);
                C18070vi.A0X(A094);
                List list4 = C42011xT.A0I;
                AnonymousClass10E r04 = r4.A00.A01;
                return new C162068Iv(A094, r3, AnonymousClass10E.A6O(r04), AnonymousClass10E.A6Q(r04));
            case 5:
            case 6:
                List list5 = C42011xT.A0I;
                View A095 = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626493);
                C18070vi.A0X(A095);
                return new C161868Ib(A095);
            case 7:
                List list6 = C42011xT.A0I;
                View A096 = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626489);
                C18070vi.A0X(A096);
                return new C42011xT(A096);
            case 8:
            case 9:
                List list7 = C42011xT.A0I;
                View A097 = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626488);
                C18070vi.A0X(A097);
                return new C161948Ij(A097, this.A05);
            default:
                List list8 = C42011xT.A0I;
                View A098 = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626494);
                C18070vi.A0X(A098);
                return new C161958Ik(A098, this.A07);
        }
    }

    public void Bmc(C42011xT r18, int i) {
        String string;
        AnonymousClass205 r0;
        AnonymousClass1BI r1;
        C37451pZ r2;
        AnonymousClass205 r02;
        AnonymousClass205 r03;
        int i2;
        int i3;
        C42011xT r3 = r18;
        C18070vi.A0d(r3, 0);
        int i4 = i;
        if (r3 instanceof C162048It) {
            C162048It r32 = (C162048It) r3;
            Object A0U = A0U(i4);
            C18070vi.A0z(A0U, "null cannot be cast to non-null type com.whatsapp.polls.results.PollResultsQuestion");
            C20881Aax aax = (C20881Aax) A0U;
            C18070vi.A0d(aax, 0);
            String str = aax.A02;
            if (str != null) {
                SpannableStringBuilder A09 = AnonymousClass3MW.A09(str);
                C26302CxJ.A0C(r32.A02, r32.A04, A09);
                WaTextView waTextView = r32.A00;
                waTextView.setText(C43251zV.A03(waTextView.getContext(), waTextView.getPaint(), r32.A03, A09));
                if (!aax.A03 || (i3 = aax.A00) <= 1) {
                    r32.A01.setVisibility(8);
                    return;
                }
                WaTextView waTextView2 = r32.A01;
                Context A0D = C108945cZ.A0D(r32);
                Object[] A1b = AnonymousClass3MW.A1b();
                C17880vN.A1T(A1b, aax.A01, 0);
                C17880vN.A1T(A1b, i3, 1);
                AnonymousClass3MY.A0y(A0D, waTextView2, A1b, 2131893097);
            }
        } else if ((r3 instanceof AnonymousClass8J0) && (A0U(i4) instanceof C20882Aay)) {
            AnonymousClass8J0 r33 = (AnonymousClass8J0) r3;
            Object A0U2 = A0U(i4);
            C18070vi.A0z(A0U2, "null cannot be cast to non-null type com.whatsapp.polls.results.PollResultsOption");
            C20882Aay aay = (C20882Aay) A0U2;
            C18070vi.A0d(aay, 0);
            String str2 = aay.A02;
            SpannableStringBuilder A092 = AnonymousClass3MW.A09(str2);
            C26302CxJ.A0C(r33.A06, r33.A09, A092);
            int i5 = aay.A00;
            WaTextView waTextView3 = r33.A05;
            waTextView3.setText(C43251zV.A03(waTextView3.getContext(), waTextView3.getPaint(), r33.A08, A092));
            WaTextView waTextView4 = r33.A04;
            C18000vb r8 = r33.A07;
            long j = (long) i5;
            Integer valueOf = Integer.valueOf(i5);
            waTextView4.setText(r8.A0K(new Object[]{valueOf}, 2131755268, j));
            LinearLayout linearLayout = r33.A01;
            Resources resources = linearLayout.getResources();
            boolean z = aay.A04;
            if (z) {
                i2 = AnonymousClass1YL.A00(linearLayout.getContext(), 2130970831, 2131102246);
            } else {
                i2 = 2131102197;
            }
            waTextView4.setTextColor(AnonymousClass1YH.A00((Resources.Theme) null, resources, i2));
            int i6 = 8;
            r33.A03.setVisibility(C72453Mb.A07(z ? 1 : 0));
            Resources resources2 = linearLayout.getResources();
            int i7 = 2131232831;
            if (z) {
                i7 = 2131232832;
            }
            linearLayout.setBackground(C40501uo.A00((Resources.Theme) null, resources2, i7));
            View view = r33.A00;
            if (!aay.A03) {
                i6 = 0;
            }
            view.setVisibility(i6);
            String A0K = r8.A0K(new Object[]{valueOf}, 2131755268, j);
            C18070vi.A0X(A0K);
            r33.A02.setContentDescription(C17890vO.A0Z(A0K, AnonymousClass000.A11(str2), ' '));
        } else if ((r3 instanceof AnonymousClass8J1) && (A0U(i4) instanceof C20883Aaz)) {
            AnonymousClass8J1 r34 = (AnonymousClass8J1) r3;
            Object A0U3 = A0U(i4);
            C18070vi.A0z(A0U3, "null cannot be cast to non-null type com.whatsapp.polls.results.PollResultsUser");
            C20883Aaz aaz = (C20883Aaz) A0U3;
            C18070vi.A0d(aaz, 0);
            WaTextView waTextView5 = r34.A03;
            String str3 = aaz.A03;
            waTextView5.setText(str3);
            WaTextView waTextView6 = r34.A04;
            String str4 = aaz.A04;
            waTextView6.setText(str4);
            String A08 = C64052u8.A08(r34.A09, r34.A08.A09(aaz.A00));
            C18070vi.A0X(A08);
            if (!AnonymousClass1YF.A0T(str3)) {
                r34.A05.setText(A08);
            } else {
                waTextView5.setText(A08);
            }
            AnonymousClass22E r22 = aaz.A02;
            AnonymousClass1E7 r10 = aaz.A01;
            AnonymousClass1E7 r5 = r10;
            if (r22 == null && r10 == null) {
                r34.A02.setVisibility(8);
            } else {
                WaImageView waImageView = r34.A02;
                waImageView.setVisibility(0);
                if (r22 == null || (r03 = r22.A0v) == null || !r03.A02) {
                    AnonymousClass1BI r12 = null;
                    if (!(r22 == null || (r02 = r22.A0v) == null)) {
                        r12 = r02.A00;
                    }
                    if (C22971Dz.A0e(r12)) {
                        if (r22 != null) {
                            r1 = r22.A0H();
                        }
                    } else if (r10 != null) {
                        r1 = r10.A0J;
                    } else if (!(r22 == null || (r0 = r22.A0v) == null)) {
                        r1 = r0.A00;
                    }
                    if (r1 != null) {
                        r2 = r34.A07;
                        if (r10 == null) {
                            r10 = r34.A06.A0H(r1);
                        }
                    }
                } else {
                    AnonymousClass11S r04 = r34.A01;
                    r04.A0I();
                    r10 = r04.A0D;
                    if (r10 != null) {
                        r2 = r34.A07;
                    }
                }
                r2.A07(waImageView, r10);
            }
            View view2 = r34.A00;
            view2.setContentDescription(AnonymousClass3MW.A0x(AnonymousClass000.A0Y(r34.A0H), A08, C108945cZ.A1a(str3, str4, 3, 1), 2, 2131894682));
            if (r5 != null && !C22971Dz.A0U(r5.A0J)) {
                AFT.A00(view2, r34, r5, 48);
            }
        } else if ((r3 instanceof C161958Ik) && (A0U(i4) instanceof C20879Aav)) {
            C161958Ik r35 = (C161958Ik) r3;
            Object A0U4 = A0U(i4);
            C18070vi.A0z(A0U4, "null cannot be cast to non-null type com.whatsapp.polls.results.PollResultsSeeAll");
            C20879Aav aav = (C20879Aav) A0U4;
            C18070vi.A0d(aav, 0);
            r35.A00 = aav.A01;
            int i8 = aav.A00;
            WaTextView waTextView7 = r35.A01;
            if (i8 == -1) {
                string = waTextView7.getContext().getString(2131895589);
            } else {
                Context context = waTextView7.getContext();
                Object[] A1a = AnonymousClass3MW.A1a();
                C17880vN.A1T(A1a, i8, 0);
                string = context.getString(2131894693, A1a);
            }
            C18070vi.A0b(string);
            waTextView7.setText(string);
            waTextView7.setContentDescription(string);
            r35.A0H.setContentDescription(string);
        } else if ((r3 instanceof C162068Iv) && (A0U(i4) instanceof C20880Aaw)) {
            C162068Iv r36 = (C162068Iv) r3;
            Object A0U5 = A0U(i4);
            C18070vi.A0z(A0U5, "null cannot be cast to non-null type com.whatsapp.polls.results.PollResultsNonContactUser");
            C20880Aaw aaw = (C20880Aaw) A0U5;
            C18070vi.A0d(aaw, 0);
            String A082 = C64052u8.A08(r36.A05, r36.A04.A09(aaw.A00));
            C18070vi.A0X(A082);
            r36.A02.setText(A082);
            r36.A03.A07(r36.A01, aaw.A01);
            View view3 = r36.A00;
            Resources A0Y = AnonymousClass000.A0Y(r36.A0H);
            Object[] A1a2 = AnonymousClass8BR.A1a();
            A1a2[0] = A082;
            A1a2[1] = "";
            view3.setContentDescription(AnonymousClass3MW.A0x(A0Y, A082, A1a2, 2, 2131894682));
        } else if ((r3 instanceof C161868Ib) && (A0U(i4) instanceof C20878Aau)) {
            C161868Ib r37 = (C161868Ib) r3;
            Object A0U6 = A0U(i4);
            C18070vi.A0z(A0U6, "null cannot be cast to non-null type com.whatsapp.polls.results.PollResultsContactTypeSection");
            C20878Aau aau = (C20878Aau) A0U6;
            C18070vi.A0d(aau, 0);
            int i9 = aau.A00;
            int i10 = 2131892889;
            if (i9 == 6) {
                i10 = 2131892892;
            }
            r37.A00.setText(i10);
        } else if ((r3 instanceof C161948Ij) && (A0U(i4) instanceof C20877Aat)) {
            C161948Ij r38 = (C161948Ij) r3;
            Object A0U7 = A0U(i4);
            C18070vi.A0z(A0U7, "null cannot be cast to non-null type com.whatsapp.polls.results.PollResultsError");
            C20877Aat aat = (C20877Aat) A0U7;
            C18070vi.A0d(aat, 0);
            int i11 = aat.A00;
            int i12 = 2131892891;
            if (i11 == 8) {
                i12 = 2131892890;
            }
            r38.A01.setText(i12);
            r38.A00.setText(2131897145);
        }
    }

    public AnonymousClass8HS(C40411uf r1, AnonymousClass9V7 r2, AnonymousClass9V8 r3, AnonymousClass9V9 r4, AnonymousClass9VA r5, C37451pZ r6, C22380B5j b5j, C22381B5k b5k, AnonymousClass8GV r9) {
        super(r1);
        this.A07 = r9;
        this.A04 = r6;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A05 = b5j;
        this.A06 = b5k;
    }

    public int getItemViewType(int i) {
        return ((C22547BCe) A0U(i)).Bbd();
    }
}
