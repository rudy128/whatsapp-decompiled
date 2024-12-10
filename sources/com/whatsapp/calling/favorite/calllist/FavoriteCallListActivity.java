package com.whatsapp.calling.favorite.calllist;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11S;
import X.AnonymousClass1E7;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1V9;
import X.AnonymousClass1VP;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3W7;
import X.AnonymousClass3XD;
import X.AnonymousClass4CZ;
import X.AnonymousClass4aX;
import X.AnonymousClass5MS;
import X.BM5;
import X.C000200d;
import X.C101585De;
import X.C101595Df;
import X.C105155Qx;
import X.C107195Yt;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C28391a8;
import X.C30391dr;
import X.C63982u1;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C73173Rg;
import X.C74743cP;
import X.C84544Jx;
import X.C90034dQ;
import X.C90994ey;
import X.C99274sY;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.wds.components.topbar.WDSToolbar;
import java.util.List;

public final class FavoriteCallListActivity extends AnonymousClass1FY implements C107195Yt {
    public BM5 A00;
    public RecyclerView A01;
    public C84544Jx A02;
    public AnonymousClass3XD A03;
    public AnonymousClass1V9 A04;
    public WDSToolbar A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final C18100vl A0F;

    public FavoriteCallListActivity() {
        this(0);
        this.A0F = C99274sY.A00(new C101595Df(this), new C101585De(this), new AnonymousClass5MS(this), AnonymousClass3MW.A15(FavoriteCallListViewModel.class));
    }

    public void Bn5(AnonymousClass1E7 r13, boolean z) {
        String str;
        C18070vi.A0d(r13, 1);
        AnonymousClass00H r0 = this.A0A;
        if (r0 != null) {
            C72453Mb.A1P(r0);
            boolean z2 = z;
            if (r13.A0F()) {
                GroupJid A0a = AnonymousClass3MY.A0a(r13);
                AnonymousClass00H r02 = this.A08;
                if (r02 != null) {
                    AnonymousClass1MZ r2 = (AnonymousClass1MZ) r02.get();
                    AnonymousClass11S r1 = this.A02;
                    AnonymousClass00H r03 = this.A07;
                    if (r03 != null) {
                        List A042 = C63982u1.A04(r1, (AnonymousClass1M9) r03.get(), r2, r13);
                        C18070vi.A0X(A042);
                        if (!z) {
                            AnonymousClass00H r04 = this.A06;
                            if (r04 != null) {
                                if (((AnonymousClass1VP) r04.get()).BjT(this, A0a, A042, 49, true)) {
                                    return;
                                }
                            }
                        }
                        AnonymousClass00H r05 = this.A06;
                        if (r05 != null) {
                            ((AnonymousClass1VP) r05.get()).CNy(this, A0a, A042, 49, z2);
                            return;
                        }
                    } else {
                        str = "contactManager";
                    }
                } else {
                    str = "groupParticipantsManager";
                }
            } else {
                AnonymousClass00H r06 = this.A06;
                if (r06 != null) {
                    ((AnonymousClass1VP) r06.get()).CNw(this, r13, 49, z);
                    return;
                }
            }
            str = "callsManager";
        } else {
            str = "voipUXResponsivenessLogger";
        }
        C18070vi.A11(str);
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        getMenuInflater().inflate(2131820563, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public static final void A03(FavoriteCallListActivity favoriteCallListActivity) {
        if (favoriteCallListActivity.A0C || favoriteCallListActivity.A0E) {
            AnonymousClass1V9 r3 = favoriteCallListActivity.A04;
            if (r3 != null) {
                r3.A01(10, 40, 15);
                favoriteCallListActivity.finish();
                return;
            }
            C18070vi.A11("callUserJourneyLogger");
            throw null;
        }
        AnonymousClass3MY.A1Y(((FavoriteCallListViewModel) favoriteCallListActivity.A0F.getValue()).A0D, false);
    }

    public void A2y() {
        if (!this.A0D) {
            this.A0D = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r1 = A0K.AAQ;
            C72483Me.A0q(r1, this);
            AnonymousClass10G r2 = r1.A00;
            AnonymousClass1FB.A0K(r1, r2, this, r2.A45);
            AnonymousClass1FB.A0L(r1, r2, this, r2.A5A);
            this.A02 = (C84544Jx) A0K.A3v.get();
            this.A04 = (AnonymousClass1V9) r1.A1e.get();
            this.A06 = C000200d.A00(r1.A1l);
            this.A07 = C000200d.A00(r1.A2f);
            this.A08 = C000200d.A00(r1.A4t);
            this.A09 = C000200d.A00(r1.A59);
            this.A0A = C000200d.A00(r1.ABV);
            this.A0B = AnonymousClass3MW.A0s(r1);
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        if (menu != null) {
            menu.setGroupVisible(2131430807, this.A0C);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131625305);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass3MY.A0H(this, 2131430804);
        this.A01 = recyclerView;
        BM5 bm5 = new BM5(new AnonymousClass3W7(this));
        this.A00 = bm5;
        if (recyclerView == null) {
            str = "recyclerView";
        } else {
            bm5.A0D(recyclerView);
            WDSToolbar wDSToolbar = (WDSToolbar) AnonymousClass3MY.A0H(this, 2131436246);
            this.A05 = wDSToolbar;
            if (wDSToolbar == null) {
                str = "wdsToolBar";
            } else {
                wDSToolbar.setNavigationIcon((Drawable) new C74743cP(AnonymousClass4aX.A03(this, 2130970284, 2131101275, 2131231675), this.A00));
                wDSToolbar.setTitle(2131887799);
                setSupportActionBar(wDSToolbar);
                wDSToolbar.setNavigationOnClickListener(new C90034dQ(this, 19));
                this.A0E = AnonymousClass3MY.A1a(getIntent(), "com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity.edit");
                C18100vl r3 = this.A0F;
                AnonymousClass3MY.A1Y(((FavoriteCallListViewModel) r3.getValue()).A0D, this.A0E);
                AnonymousClass3MX.A1Q(new FavoriteCallListActivity$initObservables$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
                AnonymousClass3MY.A1K(this, ((FavoriteCallListViewModel) r3.getValue()).A07, new C105155Qx(this), 25);
                BVe().A09(new C73173Rg(this, 3), this);
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        Intent A0A2;
        int A0B2 = C72453Mb.A0B(menuItem);
        if (A0B2 == 2131430250) {
            AnonymousClass1V9 r1 = this.A04;
            if (r1 != null) {
                r1.A01(10, 41, 15);
                AnonymousClass3MY.A1Y(((FavoriteCallListViewModel) this.A0F.getValue()).A0D, true);
                return true;
            }
        } else if (A0B2 != 2131427600) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            AnonymousClass1V9 r12 = this.A04;
            if (r12 != null) {
                r12.A01(10, 38, 15);
                AnonymousClass00H r0 = this.A09;
                if (r0 != null) {
                    boolean A032 = ((C28391a8) r0.get()).A03();
                    AnonymousClass00H r02 = this.A0B;
                    if (r02 != null) {
                        r02.get();
                        if (A032) {
                            A0A2 = AnonymousClass1LU.A0X(this, AnonymousClass4CZ.CALLS, 10);
                        } else {
                            A0A2 = C17880vN.A0A();
                            A0A2.setClassName(getPackageName(), "com.whatsapp.calling.favorite.FavoritePicker");
                        }
                        startActivity(A0A2);
                        return true;
                    }
                    str = "waIntents";
                } else {
                    str = "inboxHelper";
                }
                C18070vi.A11(str);
                throw null;
            }
        }
        str = "callUserJourneyLogger";
        C18070vi.A11(str);
        throw null;
    }

    public FavoriteCallListActivity(int i) {
        this.A0D = false;
        C90994ey.A00(this, 31);
    }
}
