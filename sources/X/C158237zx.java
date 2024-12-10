package X;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.gallerypicker.GalleryDropdownFilterFragment;
import com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity;
import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;
import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$loadDropdownFolders$1;
import com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel;
import com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel;
import com.whatsapp.wds.components.fab.WDSFab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7zx  reason: invalid class name and case insensitive filesystem */
public final class C158237zx extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ GalleryTabHostFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C158237zx(GalleryTabHostFragment galleryTabHostFragment) {
        super(1);
        this.this$0 = galleryTabHostFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        GalleryTabHostFragment galleryTabHostFragment;
        boolean z;
        GalleryPickerBottomSheetActivity galleryPickerBottomSheetActivity;
        C18100vl r0;
        AnonymousClass857 r12 = (AnonymousClass857) obj;
        if (C18070vi.A18(r12, AnonymousClass7HO.A00)) {
            AnonymousClass00H r02 = this.this$0.A0Y;
            if (r02 != null) {
                r02.get();
                AnonymousClass1FL A1D = this.this$0.A1D();
                int A01 = GalleryTabHostFragment.A01(this.this$0);
                boolean A1T = AnonymousClass000.A1T(GalleryTabHostFragment.A00(this.this$0), 7);
                Intent A0A = C17880vN.A0A();
                A0A.setClassName(A1D.getPackageName(), "com.whatsapp.gallery.google.GoogleGalleryActivity");
                A0A.putExtra("extra_max_items_to_select", A01);
                A0A.putExtra("extra_include_all_media", A1T);
                this.this$0.A0j.A02(new C110865hM(ActivityOptions.makeCustomAnimation(this.this$0.A1D(), 2130771985, 2130772032)), A0A);
            } else {
                str = "waIntents";
                C18070vi.A11(str);
                throw null;
            }
        } else if (r12 instanceof AnonymousClass7HJ) {
            GalleryTabHostFragment galleryTabHostFragment2 = this.this$0;
            View view = galleryTabHostFragment2.A0B;
            if (view != null) {
                boolean z2 = ((AnonymousClass7HJ) r12).A00;
                GalleryDropdownFilterFragment galleryDropdownFilterFragment = galleryTabHostFragment2.A0E;
                if (galleryDropdownFilterFragment != null) {
                    GalleryPickerViewModel galleryPickerViewModel = (GalleryPickerViewModel) galleryDropdownFilterFragment.A07.getValue();
                    Bundle bundle = galleryDropdownFilterFragment.A06;
                    int i = 7;
                    if (bundle != null) {
                        i = bundle.getInt("include", 7);
                    }
                    AnonymousClass3Ma.A1R(galleryPickerViewModel.A00);
                    galleryPickerViewModel.A05.A0F(new C1188165j(C18460wS.A00));
                    AnonymousClass1OX A00 = C41561wd.A00(galleryPickerViewModel);
                    galleryPickerViewModel.A00 = C30451dy.A02(AnonymousClass00R.A00, galleryPickerViewModel.A0G, new GalleryPickerViewModel$loadDropdownFolders$1(galleryPickerViewModel, (C30391dr) null, 1, i, z2), A00);
                }
                if (z2) {
                    View findViewById = view.findViewById(2131431193);
                    if (findViewById != null && galleryTabHostFragment2.A0M == null) {
                        WDSFab wDSFab = (WDSFab) new C28931bI(findViewById).A02();
                        C18070vi.A0b(wDSFab);
                        C84084Hu.A00(wDSFab, new C158227zw(galleryTabHostFragment2));
                        C108955ca.A1J(wDSFab, galleryTabHostFragment2, 2131890836);
                        wDSFab.setWdsFabStyle(AnonymousClass1ZE.GOOGLE_GALLERY_SHORTCUT);
                        galleryTabHostFragment2.A0M = wDSFab;
                    }
                    ViewPager2 viewPager2 = galleryTabHostFragment2.A04;
                    if (viewPager2 != null) {
                        C108955ca.A1K(viewPager2, galleryTabHostFragment2, 7);
                    }
                }
            }
        } else if (r12 instanceof AnonymousClass7HI) {
            this.this$0.A28(((AnonymousClass7HI) r12).A00);
        } else if (r12 instanceof AnonymousClass7HK) {
            GalleryTabHostFragment galleryTabHostFragment3 = this.this$0;
            AnonymousClass7HK r122 = (AnonymousClass7HK) r12;
            List list = r122.A01;
            String str2 = r122.A00;
            List list2 = r122.A02;
            C108965cb.A0P(galleryTabHostFragment3).A05.A0F(AnonymousClass7HM.A00);
            C22931Dv r03 = AnonymousClass1BI.A00;
            AnonymousClass1BI A012 = C22931Dv.A01(GalleryTabHostFragment.A0B(galleryTabHostFragment3));
            ArrayList A0D = C29351c6.A0D(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C108995ce.A1P(A0D, it);
            }
            if (MediaQualityViewModel.A00(galleryTabHostFragment3) == 3) {
                r0 = galleryTabHostFragment3.A13;
            } else {
                r0 = galleryTabHostFragment3.A12;
            }
            C59382mD r7 = (C59382mD) r0.getValue();
            int i2 = r7.A00;
            boolean A1a = C72453Mb.A1a(MediaJidViewModel.A00(galleryTabHostFragment3).A09);
            GalleryTabHostFragment.A0g(galleryTabHostFragment3, C29431cG.A12(A0D));
            GalleryTabHostFragment.A0e(galleryTabHostFragment3, str2, A0D, list2);
            AnonymousClass10I r04 = galleryTabHostFragment3.A0L;
            if (r04 != null) {
                r04.CGF(new AnonymousClass7Q9(galleryTabHostFragment3, A012, r7, A0D, i2, A1a));
            } else {
                str = "waWorkers";
                C18070vi.A11(str);
                throw null;
            }
        } else if (r12 instanceof AnonymousClass7HL) {
            GalleryTabHostFragment galleryTabHostFragment4 = this.this$0;
            AnonymousClass7HL r123 = (AnonymousClass7HL) r12;
            GalleryTabHostFragment.A0M(galleryTabHostFragment4, r123.A00, r123.A01, C29431cG.A0t(C108965cb.A0P(galleryTabHostFragment4).A0T()), r123.A02);
        } else {
            if (r12 instanceof AnonymousClass7HN) {
                galleryTabHostFragment = this.this$0;
                z = true;
            } else if (r12 instanceof AnonymousClass7HM) {
                galleryTabHostFragment = this.this$0;
                z = false;
            }
            if (C72453Mb.A1a(galleryTabHostFragment.A0p)) {
                Iterator it2 = C200410p.A0P(new ViewGroup[]{galleryTabHostFragment.A15.getValue(), galleryTabHostFragment.A04}).iterator();
                while (it2.hasNext()) {
                    View A0E = AnonymousClass3MX.A0E(it2);
                    C18070vi.A0b(A0E);
                    GalleryTabHostFragment.A0F(A0E, galleryTabHostFragment, z);
                }
                List<Fragment> A04 = galleryTabHostFragment.A1E().A0U.A04();
                ArrayList A0t = C108965cb.A0t(A04);
                for (Fragment fragment : A04) {
                    View view2 = fragment.A0B;
                    if (view2 != null) {
                        A0t.add(view2);
                    }
                }
                Iterator it3 = A0t.iterator();
                while (it3.hasNext()) {
                    View A0E2 = AnonymousClass3MX.A0E(it3);
                    C18070vi.A0b(A0E2);
                    GalleryTabHostFragment.A0F(A0E2, galleryTabHostFragment, z);
                }
                View findViewById2 = galleryTabHostFragment.A17().findViewById(2131431353);
                if (findViewById2 != null) {
                    GalleryTabHostFragment.A0F(findViewById2, galleryTabHostFragment, z);
                }
                AnonymousClass1FL A1B = galleryTabHostFragment.A1B();
                if ((A1B instanceof GalleryPickerBottomSheetActivity) && (galleryPickerBottomSheetActivity = (GalleryPickerBottomSheetActivity) A1B) != null) {
                    BottomSheetBehavior bottomSheetBehavior = galleryPickerBottomSheetActivity.A00;
                    if (bottomSheetBehavior != null) {
                        bottomSheetBehavior.A0b(z);
                    } else {
                        C18070vi.A11("contentSheetBehaviour");
                        throw null;
                    }
                }
            }
        }
        return C27621Wu.A00;
    }
}
