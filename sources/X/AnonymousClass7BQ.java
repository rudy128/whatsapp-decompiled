package X;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.WaEditText;
import com.whatsapp.picker.search.StickerSearchDialogFragment;
import com.whatsapp.reactions.ReactionsBottomSheetDialogFragment;
import com.whatsapp.statuscomposer.ConsolidatedStatusComposerActivity;
import com.whatsapp.statuscomposer.composer.CameraStatusFragment;
import com.whatsapp.statuscomposer.composer.ComposerModeTabLayout;
import com.whatsapp.stickers.store.StickerStoreActivity;
import java.util.List;

/* renamed from: X.7BQ  reason: invalid class name */
public class AnonymousClass7BQ implements C1606189f, AnonymousClass8B5 {
    public final int A00;
    public final Object A01;

    public AnonymousClass7BQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.whatsapp.statuscomposer.composer.ComposerModeTabLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.6IX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.whatsapp.statuscomposer.composer.ComposerModeTabLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.whatsapp.statuscomposer.composer.ComposerModeTabLayout} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C8J(X.C136836uU r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 1: goto L_0x0015;
                case 2: goto L_0x0021;
                case 3: goto L_0x0005;
                case 4: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r1 = r2.A01
            X.6IX r1 = (X.AnonymousClass6IX) r1
            boolean r0 = r1.isEnabled()
            if (r0 == 0) goto L_0x0005
            X.11C r0 = r1.getSystemServices()
            goto L_0x0029
        L_0x0015:
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            java.lang.Object r0 = r2.A01
            com.whatsapp.reactions.ReactionsBottomSheetDialogFragment r0 = (com.whatsapp.reactions.ReactionsBottomSheetDialogFragment) r0
            com.whatsapp.reactions.ReactionsBottomSheetDialogFragment.A01(r3, r0)
            return
        L_0x0021:
            java.lang.Object r1 = r2.A01
            com.whatsapp.statuscomposer.composer.ComposerModeTabLayout r1 = (com.whatsapp.statuscomposer.composer.ComposerModeTabLayout) r1
            X.11C r0 = r1.getSystemServices()
        L_0x0029:
            X.AnonymousClass4a5.A01(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7BQ.C8J(X.6uU):void");
    }

    public void C8K(C136836uU r10) {
        boolean z;
        List list;
        Object obj;
        AnonymousClass7DY r0;
        AnonymousClass7DY r02;
        C122696Rj r03;
        ViewPager viewPager;
        Integer num;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(r10, 0);
                StickerSearchDialogFragment stickerSearchDialogFragment = (StickerSearchDialogFragment) this.A01;
                WaEditText waEditText = stickerSearchDialogFragment.A05;
                if (waEditText != null) {
                    waEditText.A0H();
                }
                viewPager = stickerSearchDialogFragment.A03;
                if (viewPager == null) {
                    return;
                }
                break;
            case 1:
                C18070vi.A0d(r10, 0);
                ReactionsBottomSheetDialogFragment.A01(r10, (ReactionsBottomSheetDialogFragment) this.A01);
                return;
            case 2:
                C18070vi.A0d(r10, 0);
                ComposerModeTabLayout composerModeTabLayout = (ComposerModeTabLayout) this.A01;
                C1597285q r5 = composerModeTabLayout.A03;
                if (r5 != null) {
                    Object obj2 = r10.A06;
                    C18070vi.A0z(obj2, "null cannot be cast to non-null type com.whatsapp.statuscomposer.composer.ComposerTab");
                    C122696Rj r2 = (C122696Rj) obj2;
                    ConsolidatedStatusComposerActivity consolidatedStatusComposerActivity = (ConsolidatedStatusComposerActivity) r5;
                    C18070vi.A0d(r2, 0);
                    C122696Rj r1 = consolidatedStatusComposerActivity.A05;
                    if (r1 == r2 || !(r1 == (r03 = C122696Rj.TEXT) || r2 == r03)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    consolidatedStatusComposerActivity.A05 = r2;
                    String A002 = r2.A00();
                    if (z) {
                        ConsolidatedStatusComposerActivity.A0c(consolidatedStatusComposerActivity);
                    }
                    int ordinal = r2.ordinal();
                    if (ordinal == 0) {
                        list = consolidatedStatusComposerActivity.A0A;
                        Object obj3 = list.get(0);
                        C18070vi.A0z(obj3, "null cannot be cast to non-null type com.whatsapp.statuscomposer.composer.CameraStatusFragment");
                        CameraStatusFragment cameraStatusFragment = (CameraStatusFragment) obj3;
                        cameraStatusFragment.A00 = 2;
                        if (cameraStatusFragment.A1b() && cameraStatusFragment.A0C && (r0 = cameraStatusFragment.A02) != null) {
                            r0.A0p(2);
                        }
                        obj = list.get(0);
                    } else if (ordinal == 1) {
                        list = consolidatedStatusComposerActivity.A0A;
                        Object obj4 = list.get(0);
                        C18070vi.A0z(obj4, "null cannot be cast to non-null type com.whatsapp.statuscomposer.composer.CameraStatusFragment");
                        CameraStatusFragment cameraStatusFragment2 = (CameraStatusFragment) obj4;
                        cameraStatusFragment2.A00 = 1;
                        if (cameraStatusFragment2.A1b() && cameraStatusFragment2.A0C && (r02 = cameraStatusFragment2.A02) != null) {
                            r02.A0p(1);
                        }
                        obj = list.get(0);
                    } else if (ordinal == 2) {
                        obj = consolidatedStatusComposerActivity.A0A.get(1);
                    }
                    ConsolidatedStatusComposerActivity.A0V((Fragment) obj, consolidatedStatusComposerActivity, A002);
                }
                AnonymousClass4a5.A01(composerModeTabLayout, composerModeTabLayout.getSystemServices());
                composerModeTabLayout.A00 = r10;
                return;
            case 3:
                viewPager = ((StickerStoreActivity) this.A01).A00;
                break;
            default:
                C18070vi.A0d(r10, 0);
                AnonymousClass6IX r3 = (AnonymousClass6IX) this.A01;
                C17960vV.A0F(r3.isEnabled(), "Tab should not be selectable when layout is disabled!");
                int i = r10.A00;
                AnonymousClass6IX.A03(r3, r3.A00, i);
                if (r3.A04) {
                    AnonymousClass4a5.A01(r3, r3.getSystemServices());
                }
                r3.A04 = true;
                int A07 = C108945cZ.A07(r3);
                int i2 = r3.A00;
                if (i2 < 0 || i2 >= A07) {
                    num = null;
                } else {
                    num = Integer.valueOf(i2);
                }
                AnonymousClass88D r04 = r3.A03;
                if (r04 != null) {
                    r04.C8M(i, num);
                }
                r3.A00 = i;
                return;
        }
        viewPager.setCurrentItem(r10.A00);
    }

    public void C8N(C136836uU r3) {
        if (2 - this.A00 == 0) {
            ((ComposerModeTabLayout) this.A01).A06 = true;
        }
    }
}
