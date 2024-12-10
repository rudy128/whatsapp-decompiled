package com.whatsapp.gallery;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass11P;
import X.AnonymousClass122;
import X.AnonymousClass1BI;
import X.AnonymousClass1CL;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass1OX;
import X.AnonymousClass1WR;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3XJ;
import X.AnonymousClass49D;
import X.C108055b3;
import X.C109335dH;
import X.C144347Gy;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C219217x;
import X.C24681Lg;
import X.C30391dr;
import X.C30451dy;
import X.C34141jz;
import X.C41561wd;
import X.C42621yT;
import X.C72453Mb;
import X.C826349d;
import X.C91604fx;
import X.C95504mL;
import X.C99244sV;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.gallery.viewmodel.GalleryViewModel;
import com.whatsapp.gallery.viewmodel.GalleryViewModel$loadData$1;
import java.util.ArrayList;

public abstract class GalleryFragmentBase extends Hilt_GalleryFragmentBase implements C108055b3 {
    public int A00 = -1;
    public View A01;
    public RecyclerView A02;
    public AnonymousClass11P A03;
    public C219217x A04;
    public C18000vb A05;
    public AnonymousClass122 A06;
    public C24681Lg A07;
    public AnonymousClass1CL A08;
    public C18030ve A09;
    public AnonymousClass3XJ A0A;
    public C826349d A0B;
    public GalleryViewModel A0C;
    public AnonymousClass1BI A0D;
    public C34141jz A0E;
    public AnonymousClass10I A0F;
    public AnonymousClass00H A0G;
    public View A0H;
    public AnonymousClass49D A0I;
    public String A0J = "";
    public final String A0K;
    public final ArrayList A0L = AnonymousClass000.A13();
    public final AnonymousClass1WR A0M = new C95504mL(this, 13);

    public static int A01(GalleryFragmentBase galleryFragmentBase) {
        View view = galleryFragmentBase.A0B;
        if (view == null) {
            return -1;
        }
        int height = (view.getHeight() / AnonymousClass3MZ.A09(galleryFragmentBase).getDimensionPixelSize(2131168743)) + 1;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(galleryFragmentBase.A0K);
        C17900vP.A0j("/approxScreenItemCount ", A10, height);
        return height;
    }

    public static void A02(GalleryFragmentBase galleryFragmentBase) {
        if (galleryFragmentBase.A0C != null) {
            int A012 = A01(galleryFragmentBase);
            if (A012 > -1) {
                C144347Gy r4 = new C144347Gy(galleryFragmentBase.A14(), galleryFragmentBase.A05);
                GalleryViewModel galleryViewModel = galleryFragmentBase.A0C;
                String str = galleryFragmentBase.A0K;
                ArrayList arrayList = galleryFragmentBase.A0L;
                C99244sV A002 = C99244sV.A00(galleryFragmentBase, 30);
                AnonymousClass3Ma.A1O(str, 0, arrayList);
                C42621yT r0 = galleryViewModel.A00;
                if (r0 != null) {
                    r0.A01();
                }
                AnonymousClass3Ma.A1R(galleryViewModel.A02);
                AnonymousClass1OX A003 = C41561wd.A00(galleryViewModel);
                galleryViewModel.A02 = C30451dy.A02(AnonymousClass00R.A00, galleryViewModel.A07, new GalleryViewModel$loadData$1(r4, galleryViewModel, str, arrayList, (C30391dr) null, A002, A012), A003);
                return;
            }
            return;
        }
        AnonymousClass49D r1 = galleryFragmentBase.A0I;
        if (r1 != null) {
            r1.A0B(true);
            synchronized (r1) {
                C42621yT r02 = r1.A00;
                if (r02 != null) {
                    r02.A01();
                }
            }
        }
        C826349d r03 = galleryFragmentBase.A0B;
        if (r03 != null) {
            r03.A0J();
        }
        AnonymousClass49D r12 = new AnonymousClass49D(galleryFragmentBase, galleryFragmentBase.A0D, galleryFragmentBase.A0E);
        galleryFragmentBase.A0I = r12;
        C17890vO.A0u(r12, galleryFragmentBase.A0F);
    }

    public static void A03(GalleryFragmentBase galleryFragmentBase) {
        if (galleryFragmentBase.A00 == -1) {
            return;
        }
        if (galleryFragmentBase.A04.A05() == AnonymousClass00R.A01 || galleryFragmentBase.A00 <= 0) {
            galleryFragmentBase.A0H.setVisibility(0);
            galleryFragmentBase.A02.setVisibility(8);
            return;
        }
        galleryFragmentBase.A0H.setVisibility(8);
        galleryFragmentBase.A02.setVisibility(0);
    }

    public void A21(Bundle bundle, View view) {
        this.A0E = new C34141jz(this.A05);
        C18030ve r2 = this.A09;
        C18070vi.A0d(r2, 0);
        if (C18020vd.A05(C18040vf.A02, r2, 8569)) {
            GalleryViewModel galleryViewModel = (GalleryViewModel) AnonymousClass3MW.A0N(this).A00(GalleryViewModel.class);
            this.A0C = galleryViewModel;
            galleryViewModel.A04.A0A(A1G(), new C91604fx(this, 16));
        }
        AnonymousClass1BI A0l = AnonymousClass3MX.A0l(C72453Mb.A0u(A1D()));
        C17960vV.A07(A0l);
        this.A0D = A0l;
        this.A0H = view.findViewById(16908292);
        this.A02 = AnonymousClass3MX.A0Q(view, 2131431229);
        this.A01 = AnonymousClass1HF.A06(view, 2131434181);
        AnonymousClass1FL A1B = A1B();
        if (A1B instanceof MediaGalleryActivity) {
            this.A02.A0t(((MediaGalleryActivity) A1B).A0o);
        }
        this.A07.registerObserver(this.A0M);
        View view2 = this.A01;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        A02(this);
    }

    public Cursor A26(C42621yT r6, C34141jz r7) {
        if (this instanceof LinksGalleryFragment) {
            return ((LinksGalleryFragment) this).A09.BUo(r6, r7);
        }
        DocumentsGalleryFragment documentsGalleryFragment = (DocumentsGalleryFragment) this;
        Cursor BUo = documentsGalleryFragment.A04.BUo(r6, r7);
        if (BUo == null) {
            return null;
        }
        return new C109335dH(BUo, (C18030ve) null, r7.A03, C17880vN.A0c(documentsGalleryFragment.A0G));
    }

    public void C4h(C34141jz r3) {
        if (!TextUtils.equals(this.A0J, r3.A02())) {
            this.A0J = r3.A02();
            this.A0E = r3;
            A02(this);
        }
    }

    public void C4y() {
        this.A0A.notifyDataSetChanged();
    }

    public GalleryFragmentBase(String str) {
        this.A0K = str;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131625414);
    }

    public void A1r() {
        super.A1r();
        this.A07.unregisterObserver(this.A0M);
        Cursor A0U = this.A0A.A0U((Cursor) null);
        if (A0U != null) {
            A0U.close();
        }
        C826349d r0 = this.A0B;
        if (r0 != null) {
            r0.A0J();
            this.A0B = null;
        }
        AnonymousClass49D r1 = this.A0I;
        if (r1 != null) {
            r1.A0B(true);
            synchronized (r1) {
                C42621yT r02 = r1.A00;
                if (r02 != null) {
                    r02.A01();
                }
            }
            this.A0I = null;
        }
    }

    public void A1u() {
        super.A1u();
        A03(this);
    }
}
