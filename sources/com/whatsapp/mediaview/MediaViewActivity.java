package com.whatsapp.mediaview;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1GP;
import X.AnonymousClass205;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass4aU;
import X.AnonymousClass745;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C109005cf;
import X.C1402270m;
import X.C1423279a;
import X.C18030ve;
import X.C18070vi;
import X.C18180vt;
import X.C19620yd;
import X.C19880zA;
import X.C19890zB;
import X.C222219b;
import X.C23301Fm;
import X.C34001jj;
import X.C72453Mb;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.util.Log;

public final class MediaViewActivity extends AnonymousClass1FY implements C23301Fm {
    public C19880zA A00;
    public AnonymousClass00H A01;
    public MediaViewBaseFragment A02;
    public boolean A03;

    public int A31() {
        return 703923716;
    }

    public void Brw() {
    }

    public void C86() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = (com.whatsapp.mediaview.MediaViewFragment) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyUp(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            r3 = 1
            X.C18070vi.A0d(r6, r3)
            com.whatsapp.mediaview.MediaViewBaseFragment r2 = r4.A02
            if (r2 == 0) goto L_0x0026
            r0 = 62
            if (r5 != r0) goto L_0x0026
            boolean r0 = r2 instanceof com.whatsapp.mediaview.MediaViewFragment
            if (r0 == 0) goto L_0x0021
            com.whatsapp.mediaview.MediaViewFragment r2 = (com.whatsapp.mediaview.MediaViewFragment) r2
            X.70X r0 = r2.A1E
            if (r0 == 0) goto L_0x0021
            boolean r1 = r0.A0a()
            X.70X r0 = r2.A1E
            if (r1 == 0) goto L_0x0022
            r0.A0B()
        L_0x0021:
            return r3
        L_0x0022:
            r0.A0K()
            return r3
        L_0x0026:
            boolean r0 = super.onKeyUp(r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.MediaViewActivity.onKeyUp(int, android.view.KeyEvent):boolean");
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E A0A = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            this.A00 = C19890zB.A00;
            this.A01 = AnonymousClass3MX.A11(A0A);
        }
    }

    public void A3K() {
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            AnonymousClass3MX.A0u(r0).A02(AnonymousClass1BI.A00.A02(C72453Mb.A0u(this)), 12);
        } else {
            C18070vi.A11("navigationTimeSpentManager");
            throw null;
        }
    }

    public boolean CMW() {
        C18030ve r0 = this.A0E;
        C18070vi.A0W(r0);
        return !C1402270m.A01(r0);
    }

    public void onBackPressed() {
        MediaViewBaseFragment mediaViewBaseFragment = this.A02;
        if (mediaViewBaseFragment != null) {
            mediaViewBaseFragment.A2E();
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        MediaViewBaseFragment.A00(this);
        this.A07 = false;
        super.onCreate(bundle);
        A3D("on_activity_create");
        setContentView(2131625980);
        AnonymousClass1GP A0O = AnonymousClass3MX.A0O(this);
        MediaViewBaseFragment mediaViewBaseFragment = (MediaViewBaseFragment) A0O.A0Q("media_view_fragment");
        this.A02 = mediaViewBaseFragment;
        if (mediaViewBaseFragment == null) {
            Intent intent = getIntent();
            AnonymousClass205 A022 = AnonymousClass4aU.A02(intent);
            if (A022 == null) {
                Log.e("mediaview/message key parameter is missing");
                finish();
                return;
            }
            AnonymousClass1BI A0Q = C108965cb.A0Q(intent, AnonymousClass1BI.A00, "jid");
            int intExtra = intent.getIntExtra("player_start_pos", 0);
            boolean booleanExtra = intent.getBooleanExtra("gallery", false);
            boolean booleanExtra2 = intent.getBooleanExtra("nogallery", false);
            int intExtra2 = intent.getIntExtra("video_play_origin", 5);
            long A06 = C108975cc.A06(intent, "start_t");
            Bundle bundleExtra = intent.getBundleExtra("animation_bundle");
            int intExtra3 = intent.getIntExtra("menu_style", 1);
            boolean booleanExtra3 = intent.getBooleanExtra("menu_set_wallpaper", false);
            boolean booleanExtra4 = intent.getBooleanExtra("is_premium_message_insight", false);
            intent.getParcelableExtra("temp_fmessage_media_info");
            int intExtra4 = intent.getIntExtra("message_card_index", -1);
            boolean booleanExtra5 = intent.getBooleanExtra("has_high_quality_thumbnail", false);
            C19880zA r2 = this.A00;
            if (r2 == null) {
                C18070vi.A11("mediaViewFragmentProvider");
                throw null;
            } else if (!r2.A07() || !booleanExtra4) {
                MediaViewFragment A032 = MediaViewFragment.A03(bundleExtra, A0Q, A022, intExtra, intExtra2, intExtra3, 1, intExtra4, A06, booleanExtra, booleanExtra2, booleanExtra3, booleanExtra5);
                C18070vi.A0b(A032);
                this.A02 = A032;
            } else {
                r2.A03();
                throw AnonymousClass000.A0s("createFragment");
            }
        }
        C34001jj r5 = new C34001jj(A0O);
        MediaViewBaseFragment mediaViewBaseFragment2 = this.A02;
        if (mediaViewBaseFragment2 != null) {
            r5.A0D(mediaViewBaseFragment2, "media_view_fragment", 2131432449);
        }
        r5.A01();
        A3C("on_activity_create");
    }

    public MediaViewActivity(int i) {
        this.A03 = false;
        C1423279a.A00(this, 13);
    }

    public C222219b A33() {
        C222219b A33 = super.A33();
        A33.A04 = true;
        return A33;
    }

    public C18180vt BYS() {
        return C19620yd.A01;
    }

    public void ByA() {
        finish();
    }

    public void ByB() {
        C3A();
    }

    public void finish() {
        AnonymousClass745 r0;
        super.finish();
        MediaViewBaseFragment mediaViewBaseFragment = this.A02;
        if (!(mediaViewBaseFragment == null || (r0 = mediaViewBaseFragment.A0B) == null)) {
            r0.A0B();
        }
        int i = 1;
        int intExtra = getIntent().getIntExtra("navigation_source", 1);
        if (intExtra > 0) {
            i = intExtra;
        }
        AnonymousClass00H r02 = this.A01;
        if (r02 != null) {
            AnonymousClass3MX.A0u(r02).A02(AnonymousClass1BI.A00.A02(C72453Mb.A0u(this)), i);
        } else {
            C18070vi.A11("navigationTimeSpentManager");
            throw null;
        }
    }

    public void onStop() {
        super.onStop();
        AnonymousClass3MZ.A0F(this).setSystemUiVisibility(3840);
    }

    public MediaViewActivity() {
        this(0);
    }
}
