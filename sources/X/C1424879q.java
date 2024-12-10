package X;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.whatsapp.IntentChooserBottomSheetDialogFragment;
import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment;
import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;
import com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel;
import com.whatsapp.stickers.info.bottomsheet.EditCustomStickerPackBottomSheet;
import com.whatsapp.stickers.info.bottomsheet.StickerAddToPackBottomSheet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.79q  reason: invalid class name and case insensitive filesystem */
public class C1424879q implements AnonymousClass03O {
    public final int A00;
    public final Object A01;

    public C1424879q(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Map map;
        String str;
        AnonymousClass1FL A1B;
        C22821Di r0;
        switch (this.A00) {
            case 0:
                IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment = (IntentChooserBottomSheetDialogFragment) this.A01;
                if (!intentChooserBottomSheetDialogFragment.A0L.A02.A00(C23401Fx.STARTED)) {
                    return false;
                }
                Integer num = intentChooserBottomSheetDialogFragment.A08;
                if (num == null) {
                    intentChooserBottomSheetDialogFragment.A1D().startActivityForResult(menuItem.getIntent(), intentChooserBottomSheetDialogFragment.A00);
                } else {
                    Fragment A0O = intentChooserBottomSheetDialogFragment.A1F().A0O(num.intValue());
                    C17960vV.A07(A0O);
                    A0O.startActivityForResult(menuItem.getIntent(), intentChooserBottomSheetDialogFragment.A00);
                }
                intentChooserBottomSheetDialogFragment.A28();
                return true;
            case 1:
                StickerExpressionsFragment stickerExpressionsFragment = (StickerExpressionsFragment) this.A01;
                C111835kV r02 = stickerExpressionsFragment.A0F;
                if (r02 == null || (map = r02.A0H) == null) {
                    return true;
                }
                LinkedHashMap A13 = C17880vN.A13();
                Iterator A15 = AnonymousClass000.A15(map);
                while (A15.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A15);
                    Number number = (Number) A16.getValue();
                    if (number != null && number.intValue() == 3) {
                        C108985cd.A1T(A16, A13);
                    }
                }
                List A0q = C29431cG.A0q(A13.keySet());
                LinkedHashMap A132 = C17880vN.A13();
                Iterator A152 = AnonymousClass000.A15(map);
                while (A152.hasNext()) {
                    Map.Entry A162 = AnonymousClass000.A16(A152);
                    Number number2 = (Number) A162.getValue();
                    if (number2 != null && number2.intValue() == 4) {
                        C108985cd.A1T(A162, A132);
                    }
                }
                List A0q2 = C29431cG.A0q(A132.keySet());
                if (menuItem == null) {
                    return true;
                }
                int itemId = menuItem.getItemId();
                if (Integer.valueOf(itemId) == null) {
                    return true;
                }
                if (itemId == 2131435785) {
                    if (AnonymousClass000.A1a(A0q2)) {
                        AnonymousClass1SB r6 = stickerExpressionsFragment.A0I;
                        if (r6 != null) {
                            AnonymousClass7RQ.A02(r6.A0C, r6, A0q2, 18);
                        } else {
                            str = "stickerRepository";
                            C18070vi.A11(str);
                            throw null;
                        }
                    }
                    if (C18020vd.A05(C18040vf.A02, stickerExpressionsFragment.A02, 10463)) {
                        A59 A0e = C108945cZ.A0e(stickerExpressionsFragment.A2H());
                        int i = 45;
                        if (map.size() > 1) {
                            i = 46;
                        }
                        A0e.A03(Integer.valueOf(i), 1, 15);
                    }
                    AnonymousClass00H r03 = stickerExpressionsFragment.A0Q;
                    if (r03 != null) {
                        List A0q3 = C29431cG.A0q(map.keySet());
                        C122606Ra r3 = C122606Ra.TRAY_RECENT;
                        C18070vi.A0d(A0q3, 0);
                        C18070vi.A0d(r3, 1);
                        C1193467t A0w = C108945cZ.A0w(((C132486mt) r03.get()).A01);
                        A0w.A07.execute(new AnonymousClass7RT(A0w, r3, A0q3));
                    } else {
                        str = "recentStickerHandler";
                        C18070vi.A11(str);
                        throw null;
                    }
                } else if (itemId == 2131427650) {
                    List A0q4 = C29431cG.A0q(map.keySet());
                    if (AnonymousClass000.A1a(A0q4) && (A1B = stickerExpressionsFragment.A1B()) != null) {
                        AnonymousClass00H r04 = stickerExpressionsFragment.A0K;
                        if (r04 != null) {
                            r04.get();
                            Bundle A0D = C17880vN.A0D();
                            A0D.putParcelableArrayList("arg_stickers", (ArrayList) A0q4);
                            StickerAddToPackBottomSheet stickerAddToPackBottomSheet = new StickerAddToPackBottomSheet();
                            stickerAddToPackBottomSheet.A1R(A0D);
                            ((AnonymousClass1FU) A1B).CMl(stickerAddToPackBottomSheet);
                        } else {
                            str = "customStickerPackStore";
                            C18070vi.A11(str);
                            throw null;
                        }
                    }
                } else if (itemId != 2131435787) {
                    return true;
                } else {
                    if (C18020vd.A05(C18040vf.A02, stickerExpressionsFragment.A02, 10463)) {
                        A59 A0e2 = C108945cZ.A0e(stickerExpressionsFragment.A2H());
                        int i2 = 47;
                        if (map.size() > 1) {
                            i2 = 48;
                        }
                        A0e2.A03(Integer.valueOf(i2), 1, 15);
                    }
                    int A0A = C108945cZ.A0A(A0q2, A0q.size());
                    AnonymousClass1FL A1B2 = stickerExpressionsFragment.A1B();
                    if (A1B2 == null) {
                        return true;
                    }
                    C73203Rj A002 = AnonymousClass4a6.A00(A1B2);
                    A002.A0k(C72473Md.A0k(AnonymousClass3MZ.A09(stickerExpressionsFragment), A0A, 2131755263));
                    A002.A0Z(new AnonymousClass754(stickerExpressionsFragment, A0q, A0q2, A0A, 1), 2131895092);
                    A002.A0X((DialogInterface.OnClickListener) null, 2131898766);
                    AnonymousClass3MY.A1G(A002);
                    return true;
                }
                StickerExpressionsFragment.A02(stickerExpressionsFragment);
                return true;
            case 2:
                AnonymousClass61G r4 = (AnonymousClass61G) this.A01;
                List list = C42011xT.A0I;
                AnonymousClass614 r32 = r4.A01;
                if (r32 == null || menuItem == null) {
                    return true;
                }
                int itemId2 = menuItem.getItemId();
                if (Integer.valueOf(itemId2) == null) {
                    return true;
                }
                if (itemId2 == 2131435751) {
                    r0 = r4.A06;
                } else if (itemId2 == 2131435741) {
                    r0 = r4.A04;
                } else if (itemId2 != 2131435750) {
                    return true;
                } else {
                    r0 = r4.A05;
                }
                if (r0 == null) {
                    return true;
                }
                r0.invoke(r32);
                return true;
            case 3:
                GalleryTabHostFragment galleryTabHostFragment = (GalleryTabHostFragment) this.A01;
                int itemId3 = menuItem.getItemId();
                if (itemId3 == 2131432837) {
                    Integer A003 = GalleryPickerViewModel.A00(galleryTabHostFragment.A0n);
                    if (A003 != null) {
                        C108955ca.A1Q(C108985cd.A0b(galleryTabHostFragment), 33, 1, A003.intValue());
                    }
                    if (!galleryTabHostFragment.A2A()) {
                        return true;
                    }
                    GalleryTabHostFragment.A0i(galleryTabHostFragment, true);
                    if (GalleryTabHostFragment.A0q(galleryTabHostFragment)) {
                        return true;
                    }
                    menuItem.setVisible(false);
                    Toolbar toolbar = galleryTabHostFragment.A02;
                    if (toolbar == null) {
                        return true;
                    }
                    AnonymousClass118 r05 = galleryTabHostFragment.A0B;
                    if (r05 != null) {
                        toolbar.setTitle((CharSequence) AnonymousClass3MW.A05(r05).getString(2131895609));
                        return true;
                    }
                    C18070vi.A11("waContext");
                    throw null;
                } else if (itemId3 != 2131431353) {
                    return false;
                } else {
                    Integer A004 = GalleryPickerViewModel.A00(galleryTabHostFragment.A0n);
                    if (A004 != null) {
                        int intValue = A004.intValue();
                        C20050A4v A0b = C108985cd.A0b(galleryTabHostFragment);
                        int i3 = 30;
                        if (MediaQualityViewModel.A00(galleryTabHostFragment) == 3) {
                            i3 = 31;
                        }
                        C108955ca.A1Q(A0b, i3, 1, intValue);
                    }
                    ((MediaQualityViewModel) galleryTabHostFragment.A0x.getValue()).A0V();
                    return true;
                }
            default:
                EditCustomStickerPackBottomSheet editCustomStickerPackBottomSheet = (EditCustomStickerPackBottomSheet) this.A01;
                AnonymousClass1FL A1B3 = editCustomStickerPackBottomSheet.A1B();
                if (A1B3 == null) {
                    return true;
                }
                String str2 = null;
                if (menuItem == null) {
                    return true;
                }
                int itemId4 = menuItem.getItemId();
                if (Integer.valueOf(itemId4) == null || itemId4 == 2131435785 || itemId4 == 2131435787 || itemId4 != 2131434498) {
                    return true;
                }
                editCustomStickerPackBottomSheet.A0B.get();
                AnonymousClass725 r06 = editCustomStickerPackBottomSheet.A02;
                if (r06 != null) {
                    str2 = r06.A04;
                }
                C20098A7b.A01(C83634Gb.A00(new C145647Mb(editCustomStickerPackBottomSheet), str2), A1B3.getSupportFragmentManager());
                return true;
        }
    }
}
