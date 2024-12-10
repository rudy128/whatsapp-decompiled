package com.whatsapp.storage;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass190;
import X.AnonymousClass1BI;
import X.AnonymousClass1DC;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1FU;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1ST;
import X.AnonymousClass1WR;
import X.AnonymousClass1Xr;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass20F;
import X.AnonymousClass21V;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass4W0;
import X.AnonymousClass4ZR;
import X.AnonymousClass65B;
import X.AnonymousClass6WZ;
import X.AnonymousClass745;
import X.AnonymousClass747;
import X.AnonymousClass77F;
import X.AnonymousClass7AS;
import X.AnonymousClass7FH;
import X.AnonymousClass7H2;
import X.AnonymousClass7H9;
import X.AnonymousClass7RD;
import X.AnonymousClass7vZ;
import X.AnonymousClass81R;
import X.AnonymousClass87B;
import X.AnonymousClass8B2;
import X.C108875cR;
import X.C108975cc;
import X.C139956zi;
import X.C154107qb;
import X.C154117qc;
import X.C154127qd;
import X.C154137qe;
import X.C156967va;
import X.C18070vi;
import X.C18100vl;
import X.C22971Dz;
import X.C24681Lg;
import X.C32021gV;
import X.C32211gp;
import X.C438921i;
import X.C62272r8;
import X.C72453Mb;
import X.C88414Zp;
import X.C99274sY;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.storage.viewmodel.StorageUsageMediaGalleryViewModel;
import java.util.List;

public final class StorageUsageMediaGalleryFragment extends Hilt_StorageUsageMediaGalleryFragment {
    public int A00;
    public AnonymousClass1L9 A01;
    public AnonymousClass190 A02;
    public AnonymousClass1ST A03;
    public C24681Lg A04;
    public C32211gp A05;
    public AnonymousClass1BI A06;
    public C32021gV A07;
    public AnonymousClass1DC A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public final AnonymousClass87B A0E = new AnonymousClass7H9(this, 1);
    public final C18100vl A0F = AnonymousClass1DF.A01(new C154107qb(this));
    public final C18100vl A0G;
    public final AnonymousClass1WR A0H = new AnonymousClass7FH(this, 13);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131627135, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        AnonymousClass7AS.A00(A1G(), ((StorageUsageMediaGalleryViewModel) this.A0G.getValue()).A00, new AnonymousClass81R(this), 24);
        this.A00 = C72453Mb.A0I(C88414Zp.A03(this, "storage_media_gallery_fragment_gallery_type", 0));
        TextView A0E2 = AnonymousClass3Ma.A0E(view, 2131433151);
        if (this.A00 == 0) {
            AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(AnonymousClass3MW.A0y(C88414Zp.A01(this, "storage_media_gallery_fragment_jid")));
            this.A06 = A022;
            boolean A0V = C22971Dz.A0V(A022);
            int i = 2131891253;
            if (A0V) {
                i = 2131891254;
            }
            A0E2.setText(i);
        } else {
            A0E2.setVisibility(8);
        }
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            AnonymousClass1Xr.A05(recyclerView, true);
        }
        AnonymousClass1Xr.A05(view.findViewById(2131433150), true);
        A2F(false, true);
        C24681Lg r1 = this.A04;
        if (r1 != null) {
            r1.registerObserver(this.A0H);
        } else {
            C18070vi.A11("messageObservers");
            throw null;
        }
    }

    public void A2I(List list) {
        AnonymousClass206 A0k;
        C108875cR A002;
        if (!list.isEmpty()) {
            if (!(Bf1() || (A0k = AnonymousClass3MW.A0k(list, 0)) == null || (A002 = A00(this)) == null)) {
                A002.COH(A0k);
            }
            C108875cR A003 = A00(this);
            if (A003 != null) {
                A003.CKg(list, true);
            }
            A2B();
        }
    }

    public void BwD(AnonymousClass8B2 r21, AnonymousClass65B r22) {
        AnonymousClass1FU r2;
        String str;
        AnonymousClass21V r3 = ((AnonymousClass7H2) r21).A01;
        AnonymousClass1FL A1B = A1B();
        if (A1B instanceof AnonymousClass1FU) {
            r2 = (AnonymousClass1FU) A1B;
        } else {
            r2 = null;
        }
        if (r3 != null && r2 != null && !r2.isFinishing()) {
            AnonymousClass65B r4 = r22;
            if (Bf1()) {
                C108875cR A002 = A00(this);
                if (A002 == null || !A002.CPY(r3)) {
                    r4.A07();
                } else {
                    r4.A09((Integer) null);
                }
                A2B();
            } else if (r4.A0A() || !C72453Mb.A1a(this.A0F)) {
                int type = r21.getType();
                if (type == 4) {
                    if (r3 instanceof C438921i) {
                        AnonymousClass747 r7 = C62272r8.A04;
                        AnonymousClass00H r1 = this.A0A;
                        if (r1 != null) {
                            C139956zi r6 = (C139956zi) r1.get();
                            AnonymousClass1KB A26 = A26();
                            AnonymousClass190 r5 = this.A02;
                            if (r5 != null) {
                                AnonymousClass10I r42 = this.A0L;
                                if (r42 != null) {
                                    AnonymousClass1L9 r8 = this.A01;
                                    if (r8 != null) {
                                        AnonymousClass1DC r12 = this.A08;
                                        if (r12 != null) {
                                            C32211gp r0 = this.A05;
                                            if (r0 != null) {
                                                C18070vi.A0b(r6);
                                                r7.A0A(r8, r5, r2, A26, r0, (C438921i) r3, r6, r12, r42);
                                                return;
                                            }
                                            str = "sharedMediaIdsStore";
                                        } else {
                                            str = "systemFeatures";
                                        }
                                    } else {
                                        str = "activityUtils";
                                    }
                                } else {
                                    AnonymousClass3MW.A1G();
                                    throw null;
                                }
                            } else {
                                str = "crashLogs";
                            }
                            C18070vi.A11(str);
                            throw null;
                        }
                        C18070vi.A11("mediaUI");
                        throw null;
                    }
                } else if (type == 6) {
                    AnonymousClass10I r13 = this.A0L;
                    if (r13 != null) {
                        AnonymousClass7RD.A00(r13, this, r3, 1);
                    } else {
                        AnonymousClass3MW.A1G();
                        throw null;
                    }
                } else {
                    AnonymousClass205 r82 = r3.A0v;
                    AnonymousClass1BI r72 = r82.A00;
                    if (r72 != null) {
                        AnonymousClass00H r14 = this.A0D;
                        if (r14 != null) {
                            r14.get();
                            Intent A003 = AnonymousClass6WZ.A00(A1D(), (AnonymousClass77F) null, r72, r82, 0, 2, -1, 0, -1, 2, true, false, false, false, false);
                            AnonymousClass745.A09(r2, A003, r4, A27());
                            AnonymousClass745.A08(r2, A003, r4, new AnonymousClass4ZR(r2), AnonymousClass4W0.A01(r3));
                            return;
                        }
                        AnonymousClass3MW.A1F();
                        throw null;
                    }
                }
            }
        }
    }

    public boolean BwJ(AnonymousClass8B2 r6, AnonymousClass65B r7) {
        AnonymousClass21V r3 = ((AnonymousClass7H2) r6).A01;
        if (r3 == null) {
            return false;
        }
        boolean Bf1 = Bf1();
        C108875cR A002 = A00(this);
        if (Bf1) {
            if (A002 == null || !A002.CPY(r3)) {
                r7.A07();
                return true;
            }
        } else if (A002 != null) {
            A002.COH(r3);
        }
        r7.A09((Integer) null);
        return true;
    }

    public StorageUsageMediaGalleryFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C154127qd(new C154117qc(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(StorageUsageMediaGalleryViewModel.class);
        this.A0G = C99274sY.A00(new C154137qe(A002), new C156967va(this, A002), new AnonymousClass7vZ(A002), A15);
    }

    public static final C108875cR A00(StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment) {
        AnonymousClass1FL A1B = storageUsageMediaGalleryFragment.A1B();
        if (A1B instanceof C108875cR) {
            return (C108875cR) A1B;
        }
        return null;
    }

    public void A1r() {
        super.A1r();
        C24681Lg r1 = this.A04;
        if (r1 != null) {
            r1.unregisterObserver(this.A0H);
        } else {
            C18070vi.A11("messageObservers");
            throw null;
        }
    }

    public boolean Bf1() {
        C108875cR A002 = A00(this);
        if (A002 != null) {
            return C108975cc.A1B(A002.Bcq() ? 1 : 0);
        }
        return false;
    }
}
