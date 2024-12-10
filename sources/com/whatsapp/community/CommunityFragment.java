package com.whatsapp.community;

import X.AnonymousClass00H;
import X.AnonymousClass01E;
import X.AnonymousClass11P;
import X.AnonymousClass1BI;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1NN;
import X.AnonymousClass1Q1;
import X.AnonymousClass28K;
import X.AnonymousClass3II;
import X.AnonymousClass3IJ;
import X.AnonymousClass3VJ;
import X.C17960vV;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C19830z4;
import X.C22621Co;
import X.C22851Dl;
import X.C23471Gk;
import X.C23571Gu;
import X.C24001Il;
import X.C24071It;
import X.C24261Jm;
import X.C24671Lf;
import X.C25191Ng;
import X.C27201Vd;
import X.C28931bI;
import X.C29201bm;
import X.C30361do;
import X.C32111gf;
import X.C34011jl;
import X.C35751mk;
import X.C37451pZ;
import X.C37911qO;
import X.C37961qT;
import X.C39511tC;
import X.C40041u3;
import X.C40241uO;
import X.C40251uP;
import X.C40261uQ;
import X.C40341uY;
import X.C40401ue;
import X.C40501uo;
import X.C40631v1;
import X.C41111vp;
import X.C45902Cc;
import X.C49822Sb;
import X.C65032vj;
import X.C65042vk;
import X.C85664Og;
import X.C91664g3;
import X.C98764rg;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class CommunityFragment extends Hilt_CommunityFragment implements C34011jl, C29201bm {
    public AnonymousClass1L9 A00;
    public C40261uQ A01;
    public C40241uO A02;
    public C40251uP A03;
    public AnonymousClass1KB A04;
    public C40401ue A05;
    public C24671Lf A06;
    public C27201Vd A07;
    public AnonymousClass11P A08;
    public C19830z4 A09;
    public C18000vb A0A;
    public C22621Co A0B;
    public AnonymousClass1NN A0C;
    public C18030ve A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public C37911qO A0M;
    public AnonymousClass3VJ A0N;
    public C40631v1 A0O;
    public C28931bI A0P;
    public boolean A0Q;
    public boolean A0R;
    public final C22851Dl A0S = new C65032vj(this, 1);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        C18030ve r0 = this.A0D;
        if (r0 != null) {
            boolean A002 = C40041u3.A00(this, r0);
            C18030ve r2 = this.A0D;
            if (r2 != null) {
                boolean A052 = C18020vd.A05(C18040vf.A01, r2, 11291);
                if (!A002) {
                    int i = 2131625360;
                    if (A052) {
                        i = 2131625363;
                    }
                    View inflate = layoutInflater.inflate(i, viewGroup, false);
                    C18070vi.A0b(inflate);
                    A02(inflate);
                    return inflate;
                }
                int i2 = 2131625361;
                if (A052) {
                    i2 = 2131625362;
                }
                View inflate2 = layoutInflater.inflate(i2, viewGroup, false);
                this.A0P = new C28931bI(inflate2.findViewById(2131429234));
                return inflate2;
            }
        }
        C18070vi.A11("abProps");
        throw null;
    }

    public void A1t() {
        A03(false);
        this.A0X = true;
    }

    public /* synthetic */ void BBR(C23571Gu r2) {
        C18070vi.A0d(r2, 1);
        r2.BlE();
    }

    public /* synthetic */ void BCQ(C23471Gk r1) {
    }

    public String BUM() {
        return null;
    }

    public String BYl() {
        return null;
    }

    public Drawable BYm() {
        return null;
    }

    public int Ba6() {
        return 600;
    }

    public String BaZ() {
        return null;
    }

    public void C4p() {
    }

    public /* synthetic */ void CI2(ImageView imageView) {
        C49822Sb.A00(imageView);
    }

    public /* synthetic */ void CKa(boolean z) {
    }

    public /* synthetic */ void CKb() {
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        C40401ue r2 = this.A05;
        if (r2 != null && r2.A0Q() == 1) {
            r2.A0G(0);
        }
        super.onConfigurationChanged(configuration);
    }

    private final void A00() {
        String str;
        if (this.A0N == null) {
            C40241uO r2 = this.A02;
            if (r2 != null) {
                AnonymousClass3VJ r5 = (AnonymousClass3VJ) new C24071It(new C91664g3(r2, 1), this).A00(AnonymousClass3VJ.class);
                r5.A00.A0A(A1G(), this.A0S);
                r5.A0Q.A0A(A1G(), new C65042vk(new AnonymousClass3II(this), 31));
                r5.A0R.A0A(A1G(), new C65042vk(new AnonymousClass3IJ(this), 31));
                AnonymousClass01E r4 = (AnonymousClass01E) AnonymousClass1L9.A01(A1n(), AnonymousClass01E.class);
                C18000vb r3 = this.A0A;
                if (r3 != null) {
                    AnonymousClass1L9 r22 = this.A00;
                    if (r22 != null) {
                        new C85664Og(r4, r22, r3, r5.A04.A04);
                        this.A0N = r5;
                        return;
                    }
                    str = "activityUtils";
                } else {
                    str = "whatsAppLocale";
                }
            } else {
                str = "communityTabViewModelFactory";
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    private final void A01() {
        C28931bI r0;
        View A022;
        C18030ve r02 = this.A0D;
        if (r02 == null) {
            C18070vi.A11("abProps");
            throw null;
        } else if (C40041u3.A00(this, r02)) {
            C28931bI r03 = this.A0P;
            if ((r03 == null || r03.A01() != 0) && (r0 = this.A0P) != null && (A022 = r0.A02()) != null) {
                A022.setVisibility(0);
                View findViewById = A022.findViewById(2131429234);
                C18070vi.A0b(findViewById);
                A02(findViewById);
            }
        }
    }

    private final void A03(boolean z) {
        String str;
        C41111vp r1;
        C41111vp r12;
        boolean z2 = this.A0R;
        this.A0R = z;
        if (z) {
            A01();
        }
        if (z2 != z) {
            if (this.A0N == null) {
                A00();
            }
            if (z) {
                C19830z4 r4 = this.A09;
                if (r4 != null) {
                    C19830z4.A00(r4).putLong("previous_last_seen_community_activity", ((SharedPreferences) r4.A00.get()).getLong("last_seen_community_activity", 0)).apply();
                    AnonymousClass3VJ r0 = this.A0N;
                    if (!(r0 == null || (r12 = r0.A0O) == null)) {
                        r12.A0D(this.A0S);
                    }
                }
                str = "waSharedPreferences";
                C18070vi.A11(str);
                throw null;
            }
            AnonymousClass3VJ r02 = this.A0N;
            if (!(r02 == null || (r1 = r02.A0O) == null)) {
                r1.A0A(this, this.A0S);
            }
            C19830z4 r42 = this.A09;
            if (r42 != null) {
                AnonymousClass11P r03 = this.A08;
                if (r03 != null) {
                    C19830z4.A00(r42).putLong("last_seen_community_activity", AnonymousClass11P.A01(r03) / 1000).apply();
                    C40401ue r3 = this.A05;
                    if (r3 != null) {
                        r3.A03.A0J(new C98764rg((Object) r3, 14));
                        return;
                    }
                    return;
                }
                str = "time";
                C18070vi.A11(str);
                throw null;
            }
            str = "waSharedPreferences";
            C18070vi.A11(str);
            throw null;
        }
    }

    private final boolean A04() {
        AnonymousClass3VJ r0;
        AnonymousClass3VJ r02 = this.A0N;
        if ((r02 == null || !r02.A0U()) && ((r0 = this.A0N) == null || !r0.A0T())) {
            return false;
        }
        C18030ve r2 = this.A0D;
        if (r2 == null) {
            C18070vi.A11("abProps");
            throw null;
        } else if (C18020vd.A05(C18040vf.A01, r2, 11118)) {
            return true;
        } else {
            return false;
        }
    }

    public void A1s() {
        C40401ue r0;
        AnonymousClass00H r02 = this.A0H;
        if (r02 != null) {
            r02.get();
            C40631v1 r03 = this.A0O;
            if (r03 != null) {
                r03.A01();
            }
            C37911qO r1 = this.A0M;
            if (!(r1 == null || (r0 = this.A05) == null)) {
                r0.A01.unregisterObserver(r1);
            }
            this.A0M = null;
            this.A0X = true;
            return;
        }
        C18070vi.A11("communityChatManager");
        throw null;
    }

    public RecyclerView BY0() {
        View view = this.A0B;
        if (view != null) {
            return (RecyclerView) view.findViewById(2131429279);
        }
        return null;
    }

    public boolean isEmpty() {
        C17960vV.A0F(this.A0Q, "isEmpty should be called after onFragmentAsyncInit for accuracy");
        C40401ue r1 = this.A05;
        if (r1 == null || r1.A0Q() <= 0 || r1.getItemViewType(0) == 9) {
            return true;
        }
        return false;
    }

    private final void A02(View view) {
        Resources.Theme theme;
        String str;
        String str2;
        View A062 = AnonymousClass1HF.A06(view, 2131429279);
        RecyclerView recyclerView = (RecyclerView) A062;
        recyclerView.A0R = true;
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        Resources.Theme theme2 = null;
        recyclerView.setItemAnimator((C37961qT) null);
        C18070vi.A0X(A062);
        int dimensionPixelSize = A14().getResources().getDimensionPixelSize(2131165285);
        Bundle bundle = this.A06;
        if (bundle != null) {
            dimensionPixelSize = bundle.getInt("top_padding", dimensionPixelSize);
        }
        recyclerView.setPadding(recyclerView.getPaddingLeft(), dimensionPixelSize, recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
        C40401ue r3 = this.A05;
        if (r3 == null) {
            C27201Vd r2 = this.A07;
            if (r2 != null) {
                C37451pZ A042 = r2.A04(A1D(), this, "community-tab");
                C27201Vd r32 = this.A07;
                if (r32 != null) {
                    C37451pZ A072 = r32.A07(this, "community-tab-multi-contact", 0.0f, A14().getResources().getDimensionPixelSize(2131166074));
                    C40251uP r1 = this.A03;
                    if (r1 != null) {
                        C40341uY A002 = r1.A00(A1D());
                        C40261uQ r12 = this.A01;
                        if (r12 != null) {
                            r3 = r12.A00(A042, A072, A002, 4);
                            this.A05 = r3;
                            C18070vi.A0b(r3);
                        } else {
                            C18070vi.A11("subgroupAdapterFactory");
                            throw null;
                        }
                    } else {
                        str2 = "conversationsListInterfaceImplFactory";
                        C18070vi.A11(str2);
                        throw null;
                    }
                }
            }
            str2 = "contactPhotos";
            C18070vi.A11(str2);
            throw null;
        }
        recyclerView.setAdapter(r3);
        Resources resources = A14().getResources();
        Context A1n = A1n();
        if (A1n != null) {
            theme = A1n.getTheme();
        } else {
            theme = null;
        }
        Drawable A003 = C40501uo.A00(theme, resources, 2131231263);
        if (A003 != null) {
            recyclerView.A0r(new C45902Cc(A003, this, 0));
        }
        Resources resources2 = A14().getResources();
        Context A1n2 = A1n();
        if (A1n2 != null) {
            theme2 = A1n2.getTheme();
        }
        Drawable A004 = C40501uo.A00(theme2, resources2, 2131233074);
        if (A004 != null) {
            recyclerView.A0r(new C45902Cc(A004, this, 1));
        }
        AnonymousClass00H r0 = this.A0F;
        if (r0 != null) {
            AnonymousClass1Q1 r5 = (AnonymousClass1Q1) r0.get();
            C24671Lf r4 = this.A06;
            if (r4 != null) {
                AnonymousClass00H r02 = this.A0G;
                if (r02 != null) {
                    C35751mk r22 = (C35751mk) r02.get();
                    AnonymousClass1NN r6 = this.A0C;
                    if (r6 != null) {
                        AnonymousClass00H r03 = this.A0E;
                        if (r03 != null) {
                            C39511tC r13 = (C39511tC) r03.get();
                            AnonymousClass00H r04 = this.A0J;
                            if (r04 != null) {
                                C40631v1 r05 = new C40631v1(r13, r22, r3, r4, r5, r6, (C25191Ng) r04.get());
                                this.A0O = r05;
                                r05.A00();
                                return;
                            }
                            str = "groupParticipantsObservers";
                        } else {
                            str = "businessProfileObservers";
                        }
                    } else {
                        str = "conversationObservers";
                    }
                } else {
                    str = "chatStateObservers";
                }
            } else {
                str = "contactObservers";
            }
        } else {
            str = "chatObservers";
        }
        C18070vi.A11(str);
        throw null;
    }

    public /* synthetic */ boolean BBu() {
        return false;
    }

    public boolean BLg() {
        return true;
    }

    public String BUK() {
        if (A04()) {
            return A1H(2131892456);
        }
        return null;
    }

    public Drawable BUL() {
        if (!A04()) {
            return null;
        }
        return C24261Jm.A00(A14(), 2131231475);
    }

    public /* synthetic */ String BYn() {
        return null;
    }

    public void Buy() {
        A01();
        A00();
        this.A0Q = true;
        AnonymousClass00H r0 = this.A0L;
        if (r0 != null) {
            if (((C24001Il) r0.get()).A0A()) {
                AnonymousClass28K r1 = new AnonymousClass28K(this, 2);
                this.A0M = r1;
                C40401ue r02 = this.A05;
                if (r02 != null) {
                    r02.CDq(r1);
                }
            }
            if (!isEmpty()) {
                AnonymousClass00H r03 = this.A0L;
                if (r03 != null) {
                    ((C24001Il) r03.get()).A02(600, false);
                    return;
                }
            } else {
                return;
            }
        }
        C18070vi.A11("splitWindowManager");
        throw null;
    }

    public boolean Buz() {
        return this.A0Q;
    }

    public /* synthetic */ void BxX(int i, int i2) {
        if (A04()) {
            AnonymousClass00H r0 = this.A0I;
            if (r0 != null) {
                ((C32111gf) r0.get()).CNu(A14(), 2, 2);
            } else {
                C18070vi.A11("communityNavigator");
                throw null;
            }
        }
    }

    public /* synthetic */ boolean C4q() {
        return false;
    }

    public void CKd(boolean z, boolean z2) {
        A03(z);
        if (z) {
            AnonymousClass00H r0 = this.A0K;
            if (r0 != null) {
                Object obj = r0.get();
                C18070vi.A0X(obj);
                C18100vl r02 = C30361do.A0C;
                ((C30361do) obj).A02((AnonymousClass1BI) null, 3);
                return;
            }
            C18070vi.A11("navigationTimeSpentManager");
            throw null;
        }
    }

    public /* synthetic */ boolean COp() {
        return false;
    }
}
