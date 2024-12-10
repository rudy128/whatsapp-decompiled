package com.whatsapp.status.tiles;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1DF;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass7RS;
import X.AnonymousClass7xD;
import X.AnonymousClass88H;
import X.AnonymousClass89O;
import X.C108945cZ;
import X.C108965cb;
import X.C112275lD;
import X.C112575lh;
import X.C126526cs;
import X.C140066zt;
import X.C153847qB;
import X.C153857qC;
import X.C161008Az;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C24641Lc;
import X.C34551kg;
import X.C37451pZ;
import X.C37961qT;
import X.C38251qy;
import X.C38391rD;
import X.C72453Mb;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.collections.ObservableRecyclerView;
import com.whatsapp.jid.UserJid;
import java.util.List;

public final class StatusGridPageFragment extends Hilt_StatusGridPageFragment implements C34551kg, C161008Az, AnonymousClass89O {
    public int A00 = -1;
    public ObservableRecyclerView A01;
    public C18000vb A02;
    public C18030ve A03;
    public C140066zt A04;
    public C34551kg A05;
    public C112275lD A06;
    public AnonymousClass88H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public List A0C;
    public boolean A0D;
    public final C18100vl A0E = AnonymousClass1DF.A01(AnonymousClass7xD.A00);
    public final C18100vl A0F = AnonymousClass1DF.A01(new C153847qB(this));
    public final C18100vl A0G = AnonymousClass1DF.A01(new C153857qC(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        C18070vi.A0d(layoutInflater, 0);
        if (bundle != null) {
            i = bundle.getInt("page_index");
        } else {
            i = A15().getInt("page_index", -1);
        }
        this.A00 = i;
        return layoutInflater.inflate(2131627088, viewGroup);
    }

    public void A20(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        bundle.putInt("page_index", this.A00);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        AnonymousClass88H r2 = this.A07;
        if (r2 != null) {
            AnonymousClass00H r0 = this.A0A;
            if (r0 != null) {
                this.A06 = r2.BH5((C37451pZ) ((C126526cs) r0.get()).A00.getValue(), this.A04, this);
                ObservableRecyclerView observableRecyclerView = (ObservableRecyclerView) view.findViewById(2131435657);
                C18000vb r02 = this.A02;
                if (r02 != null) {
                    observableRecyclerView.setLayoutDirection(AnonymousClass3MW.A1Z(r02) ? 1 : 0);
                    observableRecyclerView.setLayoutManager(new GridLayoutManager(A14(), C72453Mb.A0I(this.A0E), 1, false));
                    observableRecyclerView.setAdapter(this.A06);
                    observableRecyclerView.A0r(new C112575lh(this, AnonymousClass3MW.A01(AnonymousClass000.A0Y(view), 2131168774)));
                    C18030ve r22 = this.A03;
                    if (r22 != null) {
                        observableRecyclerView.A00 = C18020vd.A05(C18040vf.A02, r22, 9640);
                        C18100vl r1 = this.A0G;
                        if (!C72453Mb.A1a(((C24641Lc) r1.getValue()).A04)) {
                            observableRecyclerView.setItemAnimator((C37961qT) null);
                        }
                        this.A01 = observableRecyclerView;
                        if (((C24641Lc) r1.getValue()).A06()) {
                            AnonymousClass00H r03 = this.A08;
                            if (r03 != null) {
                                C72453Mb.A1Q(r03, this);
                                return;
                            } else {
                                C18070vi.A11("dataObserverLazy");
                                throw null;
                            }
                        } else {
                            return;
                        }
                    } else {
                        AnonymousClass3MW.A1A();
                        throw null;
                    }
                } else {
                    str = "waLocale";
                }
            } else {
                str = "photoLoader";
            }
        } else {
            str = "statusAdapterFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void ByX(AnonymousClass206 r3, int i) {
        C112275lD r1;
        C18070vi.A0d(r3, 0);
        ObservableRecyclerView observableRecyclerView = this.A01;
        C38391rD r12 = null;
        if (observableRecyclerView != null) {
            r12 = observableRecyclerView.A0B;
        }
        if ((r12 instanceof C112275lD) && (r1 = (C112275lD) r12) != null) {
            r1.A0U(r3, i);
        }
    }

    public /* synthetic */ void CAG(List list, String str) {
    }

    public void BIZ() {
        ObservableRecyclerView observableRecyclerView = this.A01;
        if (observableRecyclerView != null) {
            observableRecyclerView.setAdapter((C38391rD) null);
            observableRecyclerView.setLayoutManager((C38251qy) null);
        }
    }

    public void Bqq() {
        if (this.A0D) {
            AnonymousClass00H r0 = this.A09;
            if (r0 != null) {
                C108945cZ.A0a(r0).A0J(new AnonymousClass7RS(this));
            } else {
                C18070vi.A11("globalUiLazy");
                throw null;
            }
        }
    }

    public void Bys(int i) {
        C34551kg r0 = this.A05;
        if (r0 != null) {
            r0.Bys(i);
        }
    }

    public void Byu() {
        C34551kg r0 = this.A05;
        if (r0 != null) {
            r0.Byu();
        }
    }

    public void C14(int i, int i2) {
        C34551kg r0 = this.A05;
        if (r0 != null) {
            r0.C14(11, 58);
        }
    }

    public void C1D() {
        C34551kg r0 = this.A05;
        if (r0 != null) {
            r0.C1D();
        }
    }

    public void C6a(UserJid userJid) {
        C34551kg r0 = this.A05;
        if (r0 != null) {
            r0.C6a(userJid);
        }
    }

    public void C6g(UserJid userJid, boolean z) {
        C34551kg r0 = this.A05;
        if (r0 != null) {
            r0.C6g(userJid, z);
        }
    }

    public void A1s() {
        super.A1s();
        ObservableRecyclerView observableRecyclerView = this.A01;
        if (observableRecyclerView != null) {
            observableRecyclerView.setAdapter((C38391rD) null);
            observableRecyclerView.setLayoutManager((C38251qy) null);
            this.A01 = null;
        }
        if (((C24641Lc) this.A0G.getValue()).A06()) {
            AnonymousClass00H r0 = this.A08;
            if (r0 != null) {
                C108965cb.A1L(r0, this);
            } else {
                C18070vi.A11("dataObserverLazy");
                throw null;
            }
        }
    }

    public void A1u() {
        super.A1u();
        List list = this.A0C;
        if (list != null) {
            C112275lD r1 = this.A06;
            if (r1 != null) {
                r1.A0V(this.A04, list);
            }
            this.A0C = null;
        }
    }
}
