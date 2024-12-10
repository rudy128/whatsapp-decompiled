package com.whatsapp.profile.coinflip.preview;

import X.AnonymousClass00H;
import X.AnonymousClass112;
import X.AnonymousClass12Q;
import X.AnonymousClass17O;
import X.AnonymousClass18K;
import X.AnonymousClass1E8;
import X.AnonymousClass1OR;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass45z;
import X.AnonymousClass5U1;
import X.AnonymousClass5U2;
import X.C103395Kd;
import X.C103405Ke;
import X.C104595Ot;
import X.C110885hR;
import X.C137526vb;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C201811d;
import X.C24671Lf;
import X.C24771Lp;
import X.C24791Lr;
import X.C24921Me;
import X.C30391dr;
import X.C30451dy;
import X.C37581pm;
import X.C41561wd;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C75263eG;
import X.C822845e;
import X.C88764ak;
import X.C91634g0;
import X.C94164k9;
import X.C99274sY;
import X.C99434so;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.profile.coinflip.edit.CoinFlipEditBottomSheet;
import com.whatsapp.util.Log;
import java.util.Iterator;

public final class CoinFlipPreviewActivity extends C75263eG {
    public View A00;
    public WaImageView A01;
    public WaTextView A02;
    public C24771Lp A03;
    public C24671Lf A04;
    public C24921Me A05;
    public C24791Lr A06;
    public AnonymousClass18K A07;
    public C18600wl A08;
    public boolean A09;
    public C88764ak A0A;
    public final CoinFlipEditBottomSheet A0B = ((CoinFlipEditBottomSheet) AnonymousClass12Q.A01(16454));
    public final C18100vl A0C = C99274sY.A00(new C103405Ke(this), new C103395Kd(this), new C104595Ot(this), AnonymousClass3MW.A15(CoinFlipPreviewViewModel.class));
    public final C94164k9 A0D = new C94164k9(this, 24);
    public final AnonymousClass00H A0E = C201811d.A00(32849);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624552);
        setTitle(2131888357);
        C72473Md.A18(this);
        UserJid A042 = UserJid.Companion.A04(C72453Mb.A0u(this));
        C17960vV.A07(A042);
        C18070vi.A0X(A042);
        this.A09 = getIntent().getBooleanExtra("showMyPreview", false);
        boolean booleanExtra = getIntent().getBooleanExtra("startWithAvatar", false);
        if (!this.A09) {
            C18030ve r1 = this.A0E;
            C18040vf r2 = C18040vf.A02;
            if (C18020vd.A05(r2, r1, 9852)) {
                getWindow().setFlags(DefaultCrypto.BUFFER_SIZE, DefaultCrypto.BUFFER_SIZE);
                if (AnonymousClass112.A0A() && C18020vd.A05(r2, this.A0E, 12040)) {
                    CoinFlipPreviewViewModel coinFlipPreviewViewModel = (CoinFlipPreviewViewModel) this.A0C.getValue();
                    AnonymousClass5U2 r3 = new AnonymousClass5U2(this);
                    AnonymousClass3MX.A1Q(new CoinFlipPreviewViewModel$getOtherProfileContact$1(A042, coinFlipPreviewViewModel, (C30391dr) null, r3), C41561wd.A00(coinFlipPreviewViewModel));
                }
            }
        }
        boolean z = this.A09;
        this.A00 = C110885hR.A0A(this, 2131434042);
        this.A01 = (WaImageView) C110885hR.A0A(this, 2131434166);
        this.A02 = (WaTextView) C110885hR.A0A(this, 2131435951);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165923);
        C18100vl r22 = this.A0C;
        CoinFlipPreviewViewModel coinFlipPreviewViewModel2 = (CoinFlipPreviewViewModel) r22.getValue();
        AnonymousClass1OX A002 = C41561wd.A00(coinFlipPreviewViewModel2);
        CoinFlipPreviewViewModel$getProfilePicBitmap$1 coinFlipPreviewViewModel$getProfilePicBitmap$1 = new CoinFlipPreviewViewModel$getProfilePicBitmap$1(this, A042, coinFlipPreviewViewModel2, (C30391dr) null, dimensionPixelSize, z);
        AnonymousClass1OR r4 = AnonymousClass1OR.A00;
        Integer A0w = AnonymousClass3MW.A0w(r4, coinFlipPreviewViewModel$getProfilePicBitmap$1, A002);
        C30451dy.A02(A0w, r4, new CoinFlipPreviewActivity$setProfilePic$1(this, (C30391dr) null, booleanExtra), AnonymousClass3MZ.A0H(this));
        C91634g0.A00(this, ((CoinFlipPreviewViewModel) r22.getValue()).A07, new AnonymousClass5U1(this), 21);
        C30451dy.A02(A0w, r4, new CoinFlipPreviewActivity$observeAvatarEvents$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
        C24671Lf r12 = this.A04;
        if (r12 != null) {
            r12.registerObserver(this.A0D);
        } else {
            C18070vi.A11("contactObservers");
            throw null;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        if (this.A09) {
            getMenuInflater().inflate(2131820550, menu);
            C137526vb.A01(menu, true);
            Iterator A002 = C99434so.A00(menu, 0);
            while (A002.hasNext()) {
                MenuItem menuItem = (MenuItem) A002.next();
                if (menuItem.getItemId() == 2131432495 && !(!(((CoinFlipPreviewViewModel) this.A0C.getValue()).A0A.getValue() instanceof C822845e))) {
                    menuItem.setVisible(false);
                }
                Drawable icon = menuItem.getIcon();
                if (icon != null) {
                    icon.setTint(C72483Me.A03(this));
                }
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(android.graphics.Bitmap r10, android.graphics.Bitmap r11, com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity r12, X.C30391dr r13, boolean r14) {
        /*
            boolean r0 = r13 instanceof X.C100504uc
            if (r0 == 0) goto L_0x0058
            r4 = r13
            X.4uc r4 = (X.C100504uc) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0058
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r1) goto L_0x005e
            java.lang.Object r12 = r4.L$0
            com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity r12 = (com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity) r12
            X.C30691eM.A01(r3)
        L_0x0024:
            X.00H r0 = r12.A0E
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.17O r0 = (X.AnonymousClass17O) r0
            r0.A01()
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0032:
            X.C30691eM.A01(r3)
            android.view.View r8 = r12.A00
            com.whatsapp.WaImageView r9 = r12.A01
            if (r8 == 0) goto L_0x004b
            if (r9 == 0) goto L_0x004b
            X.00H r0 = r12.A0E
            java.lang.Object r5 = X.C18070vi.A0E(r0)
            X.17O r5 = (X.AnonymousClass17O) r5
            r6 = r10
            r7 = r11
            r10 = r14
            r5.A02(r6, r7, r8, r9, r10)
        L_0x004b:
            r4.L$0 = r12
            r4.label = r1
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.C62882s9.A00(r4, r0)
            if (r0 != r2) goto L_0x0024
            return r2
        L_0x0058:
            X.4uc r4 = new X.4uc
            r4.<init>(r12, r13)
            goto L_0x0012
        L_0x005e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity.A03(android.graphics.Bitmap, android.graphics.Bitmap, com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity, X.1dr, boolean):java.lang.Object");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        AnonymousClass1OX A002;
        AnonymousClass1OS coinFlipPreviewViewModel$saveProfilePicture$1;
        if (i != 12) {
            if (i != 13) {
                super.onActivityResult(i, i2, intent);
            } else if (i2 == -1) {
                CoinFlipPreviewViewModel coinFlipPreviewViewModel = (CoinFlipPreviewViewModel) this.A0C.getValue();
                AnonymousClass1E8 A0P = AnonymousClass3MY.A0P(this);
                AnonymousClass3MX.A1Q(new CoinFlipPreviewViewModel$saveProfilePicture$1(A0P, coinFlipPreviewViewModel, (C30391dr) null), C41561wd.A00(coinFlipPreviewViewModel));
                finish();
            }
        } else if (i2 == -1 && intent != null) {
            if (intent.getBooleanExtra("is_reset", false)) {
                CoinFlipPreviewViewModel coinFlipPreviewViewModel2 = (CoinFlipPreviewViewModel) this.A0C.getValue();
                AnonymousClass1E8 A0P2 = AnonymousClass3MY.A0P(this);
                A002 = C41561wd.A00(coinFlipPreviewViewModel2);
                coinFlipPreviewViewModel$saveProfilePicture$1 = new CoinFlipPreviewViewModel$deleteProfilePicture$1(A0P2, coinFlipPreviewViewModel2, (C30391dr) null);
            } else {
                boolean booleanExtra = intent.getBooleanExtra("skip_cropping", false);
                CoinFlipPreviewViewModel coinFlipPreviewViewModel3 = (CoinFlipPreviewViewModel) this.A0C.getValue();
                if (booleanExtra) {
                    AnonymousClass1E8 A0P3 = AnonymousClass3MY.A0P(this);
                    A002 = C41561wd.A00(coinFlipPreviewViewModel3);
                    coinFlipPreviewViewModel$saveProfilePicture$1 = new CoinFlipPreviewViewModel$saveProfilePicture$1(A0P3, coinFlipPreviewViewModel3, (C30391dr) null);
                } else {
                    coinFlipPreviewViewModel3.A05.A04(intent, this, 13);
                    return;
                }
            }
            AnonymousClass3MX.A1Q(coinFlipPreviewViewModel$saveProfilePicture$1, A002);
        }
    }

    public void A3I() {
        super.A3I();
        Activity.ScreenCaptureCallback screenCaptureCallback = this.A0A;
        if (screenCaptureCallback != null) {
            try {
                registerScreenCaptureCallback(getMainExecutor(), screenCaptureCallback);
            } catch (IllegalStateException e) {
                this.A0A = null;
                Log.e((Throwable) e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ((AnonymousClass17O) this.A0E.get()).A00();
        C24671Lf r1 = this.A04;
        if (r1 != null) {
            r1.unregisterObserver(this.A0D);
        } else {
            C18070vi.A11("contactObservers");
            throw null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        AnonymousClass1E8 A0P;
        int A0B2 = C72453Mb.A0B(menuItem);
        if (A0B2 == 2131432493) {
            ((CoinFlipPreviewViewModel) this.A0C.getValue()).A07.A0F(AnonymousClass45z.A00);
        } else if (A0B2 == 2131432495 && (A0P = AnonymousClass3MY.A0P(this)) != null) {
            C37581pm A0H = AnonymousClass3MZ.A0H(this);
            C18600wl r2 = this.A08;
            if (r2 != null) {
                AnonymousClass3MW.A1X(r2, new CoinFlipPreviewActivity$onShareProfileClicked$1(A0P, this, (C30391dr) null), A0H);
            } else {
                AnonymousClass3MW.A1K();
                throw null;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        super.onPause();
        C88764ak r1 = this.A0A;
        if (r1 != null) {
            r1.A00(true);
        }
    }

    public void onResume() {
        super.onResume();
        C88764ak r1 = this.A0A;
        if (r1 != null) {
            r1.A00(false);
        }
    }

    public void onStop() {
        super.onStop();
        Activity.ScreenCaptureCallback screenCaptureCallback = this.A0A;
        if (screenCaptureCallback != null) {
            try {
                unregisterScreenCaptureCallback(screenCaptureCallback);
            } catch (IllegalStateException e) {
                Log.e((Throwable) e);
            }
        }
    }
}
