package com.whatsapp.statuscomposer;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass1BI;
import X.AnonymousClass1HF;
import X.AnonymousClass1L9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass6VM;
import X.AnonymousClass7DY;
import X.AnonymousClass7DZ;
import X.AnonymousClass7RI;
import X.AnonymousClass7vO;
import X.AnonymousClass885;
import X.AnonymousClass886;
import X.C108945cZ;
import X.C108955ca;
import X.C108975cc;
import X.C108985cd;
import X.C114875s8;
import X.C122696Rj;
import X.C123496Ur;
import X.C1422378r;
import X.C1425779z;
import X.C153877qE;
import X.C153887qF;
import X.C1597285q;
import X.C1599186j;
import X.C1605288v;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18000vb;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18090vk;
import X.C18100vl;
import X.C19740yt;
import X.C19880zA;
import X.C23661Hd;
import X.C25932Cow;
import X.C30361do;
import X.C34001jj;
import X.C58752lC;
import X.C72453Mb;
import X.C99274sY;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.whatsapp.gallery.viewmodel.GalleryTabsViewModel;
import com.whatsapp.statuscomposer.composer.CameraStatusFragment;
import com.whatsapp.statuscomposer.composer.ComposerModeTabLayout;
import com.whatsapp.statuscomposer.composer.Hilt_CameraStatusFragment;
import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;
import com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;
import java.util.Iterator;
import java.util.List;

public final class ConsolidatedStatusComposerActivity extends C114875s8 implements C1605288v, AnonymousClass886, C1599186j, C1597285q {
    public View A00;
    public C19880zA A01;
    public C23661Hd A02;
    public C58752lC A03;
    public AnonymousClass7DZ A04;
    public C122696Rj A05 = C122696Rj.PHOTO;
    public CreationModeBottomBar A06;
    public AnonymousClass00H A07;
    public ComposerModeTabLayout A08;
    public final Handler A09 = C17890vO.A0D();
    public final List A0A = AnonymousClass000.A13();
    public final C18100vl A0B = C99274sY.A00(new C153887qF(this), new C153877qE(this), new AnonymousClass7vO(this), AnonymousClass3MW.A15(GalleryTabsViewModel.class));

    /* JADX WARNING: type inference failed for: r1v8, types: [com.whatsapp.statuscomposer.composer.Hilt_CameraStatusFragment, com.whatsapp.statuscomposer.composer.CameraStatusFragment] */
    private final CameraStatusFragment A03() {
        Object obj;
        Iterator it = this.A0A.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof CameraStatusFragment) {
                break;
            }
        }
        if (!(obj instanceof CameraStatusFragment)) {
            obj = null;
        }
        CameraStatusFragment cameraStatusFragment = (CameraStatusFragment) obj;
        if (cameraStatusFragment != null) {
            return cameraStatusFragment;
        }
        Fragment A0Q = getSupportFragmentManager().A0Q(C122696Rj.PHOTO.A00());
        if (A0Q == null) {
            A0Q = null;
        }
        CameraStatusFragment cameraStatusFragment2 = (CameraStatusFragment) A0Q;
        if (cameraStatusFragment2 != null) {
            return cameraStatusFragment2;
        }
        ? hilt_CameraStatusFragment = new Hilt_CameraStatusFragment();
        hilt_CameraStatusFragment.A00 = 1;
        return hilt_CameraStatusFragment;
    }

    private final TextStatusComposerFragment A0Q() {
        Object obj;
        TextStatusComposerFragment textStatusComposerFragment = null;
        Iterator it = this.A0A.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof TextStatusComposerFragment) {
                break;
            }
        }
        if (obj instanceof TextStatusComposerFragment) {
            textStatusComposerFragment = obj;
        }
        TextStatusComposerFragment textStatusComposerFragment2 = textStatusComposerFragment;
        if (textStatusComposerFragment2 != null) {
            return textStatusComposerFragment2;
        }
        Fragment A0Q = getSupportFragmentManager().A0Q(C122696Rj.TEXT.A00());
        if (A0Q == null) {
            A0Q = null;
        }
        TextStatusComposerFragment textStatusComposerFragment3 = (TextStatusComposerFragment) A0Q;
        if (textStatusComposerFragment3 == null) {
            return new TextStatusComposerFragment();
        }
        return textStatusComposerFragment3;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putInt("status_composer_mode", this.A05.ordinal());
    }

    public static final void A0c(ConsolidatedStatusComposerActivity consolidatedStatusComposerActivity) {
        C30361do r2;
        int i;
        int ordinal = consolidatedStatusComposerActivity.A05.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            AnonymousClass00H r0 = consolidatedStatusComposerActivity.A07;
            if (r0 != null) {
                r2 = (C30361do) C18070vi.A0E(r0);
                i = 20;
            }
            C18070vi.A11("navigationTimeSpentManager");
            throw null;
        } else if (ordinal == 2) {
            AnonymousClass00H r02 = consolidatedStatusComposerActivity.A07;
            if (r02 != null) {
                r2 = (C30361do) C18070vi.A0E(r02);
                i = 34;
            }
            C18070vi.A11("navigationTimeSpentManager");
            throw null;
        } else {
            return;
        }
        C18100vl r03 = C30361do.A0C;
        r2.A02((AnonymousClass1BI) null, i);
    }

    public static final void A0d(ConsolidatedStatusComposerActivity consolidatedStatusComposerActivity, boolean z) {
        View findViewById;
        CreationModeBottomBar creationModeBottomBar = consolidatedStatusComposerActivity.A06;
        if (creationModeBottomBar != null && (findViewById = creationModeBottomBar.findViewById(2131432422)) != null) {
            findViewById.setVisibility(C72453Mb.A01(z ? 1 : 0));
        }
    }

    public AnonymousClass7DY BO9() {
        C122696Rj r2 = this.A05;
        if (r2 != C122696Rj.TEXT) {
            AnonymousClass7DY r0 = A03().A02;
            if (r0 != null) {
                return r0;
            }
            throw C17880vN.A0g();
        }
        throw AnonymousClass000.A0n(AnonymousClass001.A1E(r2, "CameraUi is not available for current mode ", AnonymousClass000.A10()));
    }

    public void Buj(float f) {
        AnonymousClass7DZ r0 = this.A04;
        if (r0 != null) {
            r0.Buj(f);
        }
    }

    public void CAO() {
        AnonymousClass7DZ r0 = this.A04;
        if (r0 != null) {
            r0.setVisibility(0);
        }
        CreationModeBottomBar creationModeBottomBar = this.A06;
        if (creationModeBottomBar != null) {
            creationModeBottomBar.setBackgroundColor(0);
        }
        this.A09.postDelayed(AnonymousClass7RI.A00(this, 9), 100);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 90) {
            BO9().A0q(i, i2, intent);
        } else if (this.A01 != null) {
            super.onActivityResult(i, i2, intent);
        } else {
            C18070vi.A11("textComposerExtras");
            throw null;
        }
    }

    public void setVisibility(int i) {
        AnonymousClass7DZ r0 = this.A04;
        if (r0 != null) {
            r0.setVisibility(i);
        }
    }

    public static final void A0V(Fragment fragment, ConsolidatedStatusComposerActivity consolidatedStatusComposerActivity, String str) {
        C34001jj A0H = AnonymousClass3Ma.A0H(consolidatedStatusComposerActivity);
        A0H.A06(2130772020, 2130772022, 0, 0);
        A0H.A0D(fragment, str, 2131429330);
        A0H.A01();
        if (consolidatedStatusComposerActivity.A05.ordinal() == 2) {
            consolidatedStatusComposerActivity.A06 = (CreationModeBottomBar) consolidatedStatusComposerActivity.findViewById(2131436083);
            consolidatedStatusComposerActivity.A0Q().A0m = consolidatedStatusComposerActivity.A06;
            consolidatedStatusComposerActivity.A09.postDelayed(AnonymousClass7RI.A00(consolidatedStatusComposerActivity, 10), 100);
            return;
        }
        C72453Mb.A1D(consolidatedStatusComposerActivity.A06);
    }

    public void A3I() {
        if (!isDestroyed() && !isFinishing()) {
            super.A3I();
            if (C18020vd.A05(C18040vf.A02, this.A0E, 7905)) {
                C58752lC r0 = this.A03;
                if (r0 != null) {
                    r0.A00();
                } else {
                    C18070vi.A11("statusDistributeSenderKeyRequester");
                    throw null;
                }
            }
        }
    }

    public void A3K() {
        if (!isDestroyed() && !isFinishing()) {
            A0c(this);
        }
    }

    public void onBackPressed() {
        AnonymousClass885 r1;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ConsolidatedStatusComposerActivity/onBackPressed/currentMode: ");
        C17900vP.A0b(this.A05, A10);
        int ordinal = this.A05.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            Object obj = this.A0A.get(0);
            C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.statuscomposer.composer.CameraStatusFragment");
            r1 = (CameraStatusFragment) obj;
        } else if (ordinal == 2) {
            Object obj2 = this.A0A.get(1);
            C18070vi.A0z(obj2, "null cannot be cast to non-null type com.whatsapp.statuscomposer.composer.TextStatusComposerFragment");
            r1 = (TextStatusComposerFragment) obj2;
        } else {
            throw AnonymousClass3MW.A14();
        }
        if (!r1.Bm9()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        int intExtra;
        ComposerModeTabLayout composerModeTabLayout;
        super.onCreate(bundle);
        GalleryTabsViewModel A0g = C108945cZ.A0g(this.A0B);
        A0g.A0U(this, C18020vd.A00(C18040vf.A02, A0g.A07, 2614), false);
        C23661Hd r0 = this.A02;
        if (r0 != null) {
            setRequestedOrientation(C108975cc.A0m(r0.A01() ? 1 : 0));
            getWindow();
            AnonymousClass6VM.A00(getWindow(), false);
            C123496Ur r02 = new C25932Cow(AnonymousClass3MZ.A0F(this), getWindow()).A00;
            r02.A00();
            r02.A02(1);
            AnonymousClass3Ma.A1H(getWindow(), C19740yt.A00(this, 2131103052));
            AnonymousClass1L9.A04(getWindow());
            setContentView(2131624040);
            this.A00 = AnonymousClass3MY.A0H(this, 2131435624);
            this.A08 = (ComposerModeTabLayout) AnonymousClass3MY.A0H(this, 2131429331);
            C18000vb r2 = this.A00;
            C18070vi.A0W(r2);
            ComposerModeTabLayout composerModeTabLayout2 = this.A08;
            if (composerModeTabLayout2 == null) {
                C18070vi.A11("tabLayout");
                throw null;
            }
            AnonymousClass7DZ r03 = new AnonymousClass7DZ(r2, composerModeTabLayout2, this);
            this.A04 = r03;
            ComposerModeTabLayout composerModeTabLayout3 = r03.A01;
            composerModeTabLayout3.setOnTouchListener(new C1422378r(composerModeTabLayout3, r03.A00, (C18090vk) null));
            if (bundle != null) {
                intExtra = bundle.getInt("status_composer_mode");
            } else {
                intExtra = getIntent().getIntExtra("status_composer_mode", 1);
            }
            this.A05 = ((C122696Rj[]) C122696Rj.A00.toArray(new C122696Rj[0]))[intExtra];
            View view = this.A00;
            if (view == null) {
                C18070vi.A11("rootView");
                throw null;
            }
            AnonymousClass1HF.A0g(view, new C1425779z(this, 3));
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("ConsolidatedStatusComposerActivity/initComposer/currentMode: ");
            C17900vP.A0b(this.A05, A10);
            List list = this.A0A;
            list.add(A03());
            list.add(A0Q());
            C122696Rj r04 = this.A05;
            C122696Rj r3 = C122696Rj.PHOTO;
            if (r04 == r3) {
                A0V((Fragment) list.get(0), this, r3.A00());
            }
            AnonymousClass7DZ r22 = this.A04;
            if (r22 != null) {
                int A042 = C108955ca.A04(this.A05, 0);
                if (A042 == 1) {
                    composerModeTabLayout = r22.A01;
                } else if (A042 == 0) {
                    composerModeTabLayout = r22.A01;
                    r3 = C122696Rj.VIDEO;
                } else if (A042 == 2) {
                    composerModeTabLayout = r22.A01;
                    r3 = C122696Rj.TEXT;
                } else {
                    return;
                }
                C108985cd.A16(composerModeTabLayout, r3.ordinal());
                return;
            }
            return;
        }
        C18070vi.A11("deviceUtils");
        throw null;
    }
}
