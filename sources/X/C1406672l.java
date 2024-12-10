package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.72l  reason: invalid class name and case insensitive filesystem */
public final class C1406672l {
    public View A00;
    public ImageView A01;
    public ImageView A02;
    public C112195l5 A03;
    public boolean A04;
    public boolean A05;
    public final View A06;
    public final ViewStub A07;
    public final TextView A08;
    public final RecyclerView A09;
    public final AnonymousClass1KB A0A;
    public final WaTextView A0B;
    public final C23581Gv A0C;
    public final C24671Lf A0D;
    public final C19830z4 A0E;
    public final C18000vb A0F;
    public final C28741ap A0G;
    public final AnonymousClass1Q1 A0H;
    public final C25221Nj A0I;
    public final C25191Ng A0J;
    public final C127856f3 A0K;
    public final C111255jJ A0L;
    public final AnonymousClass72B A0M;
    public final Boolean A0N;
    public final Runnable A0O = new AnonymousClass7RH((Object) this, 39);
    public final C18100vl A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final AnonymousClass1M9 A0S;
    public final C24921Me A0T;
    public final AnonymousClass11P A0U;
    public final C129216hR A0V;
    public final AnonymousClass10I A0W;
    public final Boolean A0X;

    private final void A00(View view) {
        Boolean bool = this.A0X;
        if (bool != null) {
            ImageView A0H2 = AnonymousClass3MW.A0H(C72463Mc.A0M(view, 2131435633), 2131435634);
            A0H2.setColorFilter(C19740yt.A00(view.getContext(), C72473Md.A06(view)));
            AnonymousClass6LG.A00(A0H2, this, 10);
            this.A01 = A0H2;
            A0H2.setVisibility(C72453Mb.A07(bool.booleanValue() ? 1 : 0));
        }
    }

    public static final void A01(C1406672l r8) {
        AnonymousClass1KB r7 = r8.A0A;
        Runnable runnable = r8.A0O;
        r7.A0I(runnable);
        C112195l5 r1 = r8.A03;
        if (r1 == null) {
            C18070vi.A11("adapter");
            throw null;
        } else if (r1.A00.size() > 0) {
            Iterator it = r1.A00.iterator();
            if (it.hasNext()) {
                long j = ((C129226hS) it.next()).A01;
                while (it.hasNext()) {
                    long j2 = ((C129226hS) it.next()).A01;
                    if (j < j2) {
                        j = j2;
                    }
                }
                C108995ce.A1B(r7, runnable, j);
                return;
            }
            throw new NoSuchElementException();
        }
    }

    public static final void A02(C1406672l r9, Map map) {
        C112195l5 r2 = r9.A03;
        if (r2 == null) {
            C18070vi.A11("adapter");
            throw null;
        }
        List<C129226hS> list = r2.A00;
        ArrayList A0D2 = C29351c6.A0D(list);
        for (C129226hS r0 : list) {
            UserJid userJid = r0.A02;
            long j = r0.A01;
            A0D2.add(new C129226hS(userJid, r0.A00, r0.A03, j));
        }
        ArrayList A0m = C29431cG.A0m(A0D2);
        Iterator it = A0m.iterator();
        while (it.hasNext()) {
            C129226hS r1 = (C129226hS) it.next();
            C139106yE r02 = (C139106yE) map.get(r1.A02);
            if (r02 != null) {
                r1.A00 = r02;
            }
        }
        if (r2.A09) {
            C25734Cl4 A002 = C25367CeS.A00(new C111405jf(r2.A00, A0m));
            r2.A00 = A0m;
            A002.A02(r2);
            return;
        }
        r2.A00 = A0m;
        r2.notifyDataSetChanged();
    }

    public C1406672l(ViewGroup viewGroup, AnonymousClass1KB r33, AnonymousClass1M9 r34, C24671Lf r35, C24921Me r36, C27201Vd r37, AnonymousClass11P r38, C19830z4 r39, C18000vb r40, AnonymousClass1Q1 r41, C25191Ng r42, C129216hR r43, C127856f3 r44, C111255jJ r45, AnonymousClass10I r46, AnonymousClass72B r47, Boolean bool, Boolean bool2, boolean z, boolean z2) {
        View A0G2;
        C111255jJ r0;
        AnonymousClass1DT r2;
        C27201Vd r7 = r37;
        C18070vi.A0d(r7, 1);
        C129216hR r3 = r43;
        C19830z4 r20 = r39;
        C18070vi.A0k(r20, r3);
        AnonymousClass11P r26 = r38;
        C18070vi.A0d(r26, 5);
        C18000vb r19 = r40;
        C24921Me r27 = r36;
        C24671Lf r4 = r35;
        AnonymousClass1M9 r28 = r34;
        C72483Me.A16(r28, r27, r19, r4, 7);
        C127856f3 r18 = r44;
        C25191Ng r5 = r42;
        AnonymousClass1Q1 r6 = r41;
        C18070vi.A0r(r6, r5, r18);
        this.A0E = r20;
        this.A0V = r3;
        this.A0U = r26;
        AnonymousClass1KB r29 = r33;
        this.A0A = r29;
        this.A0S = r28;
        this.A0T = r27;
        this.A0F = r19;
        this.A0D = r4;
        this.A0H = r6;
        this.A0J = r5;
        this.A0K = r18;
        this.A0R = z;
        AnonymousClass10I r16 = r46;
        this.A0W = r16;
        this.A0X = bool;
        this.A0N = bool2;
        C111255jJ r17 = r45;
        this.A0L = r17;
        this.A0M = r47;
        ViewGroup viewGroup2 = viewGroup;
        this.A0P = AnonymousClass1DF.A01(new AnonymousClass7vK(viewGroup2, r7));
        boolean A1W = AnonymousClass000.A1W(r17);
        this.A0Q = A1W;
        AnonymousClass7E0 r9 = new AnonymousClass7E0(this, 11);
        this.A0C = r9;
        AnonymousClass7FF r8 = new AnonymousClass7FF(this, 6);
        this.A0G = r8;
        AnonymousClass7ID r72 = new AnonymousClass7ID(this, 6);
        this.A0I = r72;
        View inflate = AnonymousClass3MZ.A0D(viewGroup2).inflate(2131626997, viewGroup2, true);
        this.A06 = AnonymousClass3MX.A0C(inflate, 2131435636);
        ViewStub A0F2 = AnonymousClass3MW.A0F(inflate, 2131433412);
        int ordinal = this.A0M.A02(false).ordinal();
        if (ordinal == 1) {
            View A0G3 = AnonymousClass3MY.A0G(A0F2, 2131626999);
            C18070vi.A0b(A0G3);
            A00(A0G3);
        } else if (ordinal == 2 || ordinal == 3) {
            View A0G4 = AnonymousClass3MY.A0G(A0F2, 2131626999);
            C18070vi.A0b(A0G4);
            A00(A0G4);
            Boolean bool3 = this.A0N;
            if (bool3 != null) {
                ImageView A0H2 = AnonymousClass3MW.A0H(C72463Mc.A0M(A0G4, 2131435632), 2131435631);
                this.A02 = A0H2;
                if (A0H2 != null) {
                    A0H2.setColorFilter(C19740yt.A00(A0G4.getContext(), C72473Md.A06(A0G4)));
                }
                ImageView imageView = this.A02;
                if (imageView != null) {
                    AnonymousClass6LG.A00(imageView, this, 11);
                }
                ImageView imageView2 = this.A02;
                if (imageView2 != null) {
                    imageView2.setVisibility(C72453Mb.A07(bool3.booleanValue() ? 1 : 0));
                }
            }
        } else {
            A0F2.setLayoutResource(2131626998);
            A0F2.inflate();
        }
        RecyclerView recyclerView = (RecyclerView) AnonymousClass3MX.A0C(inflate, 16908298);
        this.A09 = recyclerView;
        AnonymousClass3Ma.A15(viewGroup2.getContext(), recyclerView);
        ViewStub viewStub = (ViewStub) C18070vi.A05(inflate, 2131432079);
        this.A07 = viewStub;
        C18070vi.A0d(viewStub, 0);
        if (((AnonymousClass72B) r3.A02.get()).A02(false) == AnonymousClass6R1.DISABLED) {
            A0G2 = null;
        } else {
            A0G2 = AnonymousClass3MY.A0G(viewStub, 2131627002);
            C18070vi.A0b(A0G2);
            AnonymousClass6LG.A00(AnonymousClass1HF.A06(A0G2, 2131435639), r3, 1);
        }
        this.A00 = A0G2;
        View findViewById = inflate.findViewById(16908292);
        TextView textView = (TextView) findViewById;
        textView.setText(r20.A2U() ? 2131892950 : 2131892951);
        C18070vi.A0X(findViewById);
        this.A08 = textView;
        C112195l5 r13 = new C112195l5(r29, r28, r27, (C37451pZ) this.A0P.getValue(), r26, r19, r18, r16, r20.A2U(), AnonymousClass000.A1W(r17), z2, A1W);
        this.A03 = r13;
        if (A1W) {
            r13.A0K(true);
        }
        WaTextView A0g = C72453Mb.A0g(viewGroup2, 2131436208);
        this.A0B = A0g;
        C43421zm.A04(A0g);
        recyclerView.setAdapter(this.A03);
        if (!A1W) {
            r4.registerObserver(r9);
            r6.registerObserver(r8);
            r5.registerObserver(r72);
        }
        if (inflate.isAttachedToWindow()) {
            AnonymousClass1F9 A002 = AnonymousClass1ZG.A00(inflate);
            if (A002 != null && (r0 = this.A0L) != null && (r2 = r0.A04) != null) {
                AnonymousClass7AS.A00(A002, r2, C108945cZ.A1K(this, 31), 19);
                return;
            }
            return;
        }
        inflate.addOnAttachStateChangeListener(new C1420477y(this, inflate, 3));
    }
}
