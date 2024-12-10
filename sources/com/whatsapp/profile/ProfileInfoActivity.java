package com.whatsapp.profile;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11Q;
import X.AnonymousClass11S;
import X.AnonymousClass18K;
import X.AnonymousClass1E7;
import X.AnonymousClass1E8;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass1VW;
import X.AnonymousClass1VX;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3PZ;
import X.AnonymousClass4YE;
import X.AnonymousClass73O;
import X.AnonymousClass745;
import X.AnonymousClass7RS;
import X.AnonymousClass8B1;
import X.C000200d;
import X.C108265bP;
import X.C136936ue;
import X.C146757Qm;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18180vt;
import X.C19620yd;
import X.C19880zA;
import X.C19890zB;
import X.C20113A7w;
import X.C222219b;
import X.C23581Gv;
import X.C24671Lf;
import X.C26261Rl;
import X.C27031Ul;
import X.C27071Up;
import X.C27191Vc;
import X.C28931bI;
import X.C30391dr;
import X.C36661oG;
import X.C36681oI;
import X.C41561wd;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C91024f1;
import X.C92744hq;
import X.C94164k9;
import X.C97334pI;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.whatsapp.PushnameEmojiBlacklistDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.productinfra.avatar.coinflip.AvatarCoinFlipProfilePhotoImageView;
import com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel;
import com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel$fetchAvatarProfilePic$1;

public class ProfileInfoActivity extends AnonymousClass1FY implements C108265bP {
    public Bitmap A00;
    public View A01;
    public View A02;
    public View A03;
    public ViewStub A04;
    public FrameLayout A05;
    public ImageView A06;
    public ProgressBar A07;
    public C19880zA A08;
    public C19880zA A09;
    public C26261Rl A0A;
    public AnonymousClass3PZ A0B;
    public C36681oI A0C;
    public AnonymousClass1VW A0D;
    public C24671Lf A0E;
    public C27191Vc A0F;
    public AnonymousClass11Q A0G;
    public AnonymousClass1E7 A0H;
    public AnonymousClass18K A0I;
    public AnonymousClass1LU A0J;
    public WhatsAppLibLoader A0K;
    public AvatarCoinFlipProfilePhotoImageView A0L;
    public C27031Ul A0M;
    public C27071Up A0N;
    public ProfileSettingsRowIconText A0O;
    public ProfileSettingsRowIconText A0P;
    public SettingsRowPhotoOrInitialText A0Q;
    public CoinFlipProfilePicViewModel A0R;
    public AnonymousClass4YE A0S;
    public AnonymousClass00H A0T;
    public AnonymousClass00H A0U;
    public AnonymousClass00H A0V;
    public AnonymousClass00H A0W;
    public AnonymousClass00H A0X;
    public boolean A0Y;
    public Handler A0Z;
    public View A0a;
    public ProfileSettingsRowIconText A0b;
    public C28931bI A0c;
    public C28931bI A0d;
    public Runnable A0e;
    public boolean A0f;
    public final C23581Gv A0g;
    public final AnonymousClass8B1 A0h;

    public ProfileInfoActivity() {
        this(0);
        this.A0g = new C94164k9(this, 21);
        this.A0h = new C97334pI(this);
    }

    public int A31() {
        return 78318969;
    }

    public /* synthetic */ void Bnk(int i) {
    }

    private void A03() {
        if (((C36661oG) this.A0W.get()).A06()) {
            if (this.A05 == null) {
                this.A05 = (FrameLayout) AnonymousClass3MX.A0H(this, 2131428074).inflate();
            }
            C36681oI r2 = this.A0C;
            r2.A00 = null;
            r2.A01(new C92744hq(this, 6));
        }
    }

    public static void A0Q(ProfileInfoActivity profileInfoActivity) {
        CoinFlipProfilePicViewModel coinFlipProfilePicViewModel;
        ProfileInfoActivity profileInfoActivity2 = profileInfoActivity;
        profileInfoActivity2.A03.setVisibility(8);
        int dimensionPixelSize = profileInfoActivity2.getResources().getDimensionPixelSize(2131168292);
        boolean A022 = AnonymousClass73O.A02(AnonymousClass11S.A00(profileInfoActivity2.A02));
        ImageView imageView = profileInfoActivity2.A06;
        if (A022) {
            imageView.setEnabled(false);
            profileInfoActivity2.A03.setVisibility(0);
        } else {
            imageView.setEnabled(true);
            profileInfoActivity2.A03.setVisibility(4);
        }
        Bitmap A042 = profileInfoActivity2.A0F.A04(profileInfoActivity2, profileInfoActivity2.A0H, "ProfileInfoActivity.updatePhoto", -1.0f, dimensionPixelSize, false);
        if (A042 == null) {
            AnonymousClass1E7 r1 = profileInfoActivity2.A0H;
            if (r1.A08 == 0 && r1.A07 == 0) {
                profileInfoActivity2.A03.setVisibility(0);
                Handler handler = profileInfoActivity2.A0Z;
                if (handler == null) {
                    handler = C17890vO.A0D();
                    profileInfoActivity2.A0Z = handler;
                    profileInfoActivity2.A0e = new C146757Qm((Object) profileInfoActivity2, 31);
                }
                handler.removeCallbacks(profileInfoActivity2.A0e);
                profileInfoActivity2.A0Z.postDelayed(profileInfoActivity2.A0e, C20113A7w.A0L);
            } else {
                profileInfoActivity2.A03.setVisibility(4);
            }
            if (!C72453Mb.A1V(profileInfoActivity2) || (coinFlipProfilePicViewModel = profileInfoActivity2.A0R) == null || !coinFlipProfilePicViewModel.A04.A06()) {
                AnonymousClass1VW r12 = profileInfoActivity2.A0D;
                Context context = profileInfoActivity2.A06.getContext();
                C18070vi.A0d(context, 0);
                A042 = r12.A04(context, (AnonymousClass1VX) null, -1.0f, 2131231047, dimensionPixelSize);
                profileInfoActivity2.A0Y = false;
                profileInfoActivity2.A06.setImageBitmap(A042);
                return;
            }
        } else {
            if (C72453Mb.A1V(profileInfoActivity2)) {
                if (profileInfoActivity2.A0H.A0g) {
                    profileInfoActivity2.A06.setVisibility(0);
                }
            }
            profileInfoActivity2.A0Y = true;
            profileInfoActivity2.A06.setImageBitmap(A042);
            return;
        }
        profileInfoActivity2.A06.setVisibility(8);
        profileInfoActivity2.A0Y = false;
    }

    public static void A0V(ProfileInfoActivity profileInfoActivity, boolean z) {
        UserJid userJid;
        Bitmap bitmap = profileInfoActivity.A00;
        if (bitmap != null) {
            profileInfoActivity.A0R.A0T(bitmap);
        }
        AnonymousClass1E8 A0P2 = AnonymousClass3MY.A0P(profileInfoActivity);
        if (A0P2 != null && (userJid = (UserJid) A0P2.A0J) != null) {
            profileInfoActivity.startActivity(AnonymousClass1LU.A1F(profileInfoActivity, userJid, true, z));
        }
    }

    public static void A0c(ProfileInfoActivity profileInfoActivity, boolean z) {
        ViewStub viewStub;
        int i;
        CoinFlipProfilePicViewModel coinFlipProfilePicViewModel = profileInfoActivity.A0R;
        if (coinFlipProfilePicViewModel != null) {
            if (coinFlipProfilePicViewModel.A04.A06()) {
                CoinFlipProfilePicViewModel coinFlipProfilePicViewModel2 = profileInfoActivity.A0R;
                AnonymousClass3MX.A1Q(new CoinFlipProfilePicViewModel$fetchAvatarProfilePic$1(coinFlipProfilePicViewModel2, (C30391dr) null, z), C41561wd.A00(coinFlipProfilePicViewModel2));
                viewStub = profileInfoActivity.A04;
                i = 0;
            } else {
                viewStub = profileInfoActivity.A04;
                i = 8;
            }
            viewStub.setVisibility(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r3.A0E, 4023) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0d(java.lang.Runnable r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.A02
            if (r0 == 0) goto L_0x0016
            boolean r0 = X.AnonymousClass3MX.A1V(r3)
            if (r0 != 0) goto L_0x001a
            X.0ve r2 = r3.A0E
            r1 = 4023(0xfb7, float:5.637E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x001a
        L_0x0016:
            r4.run()
            return
        L_0x001a:
            android.view.View r0 = r3.A02
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 0
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r1)
            android.view.ViewPropertyAnimator r2 = r0.scaleY(r1)
            r0 = 125(0x7d, double:6.2E-322)
            android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
            X.3Mn r0 = new X.3Mn
            r0.<init>(r3, r4)
            r1.setListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.ProfileInfoActivity.A0d(java.lang.Runnable):void");
    }

    public void A2y() {
        if (!this.A0f) {
            this.A0f = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r1 = A0K2.AAQ;
            C72483Me.A0q(r1, this);
            AnonymousClass10G r3 = r1.A00;
            AnonymousClass1FB.A0K(r1, r3, this, r3.A45);
            AnonymousClass1FB.A0L(r1, r3, this, r3.A5A);
            this.A0T = C000200d.A00(r1.A05);
            C19890zB r4 = C19890zB.A00;
            this.A09 = r4;
            this.A0J = AnonymousClass3MY.A0Z(r1);
            this.A0I = AnonymousClass3Ma.A0g(r1);
            this.A0V = C000200d.A00(r1.A0V);
            this.A0D = AnonymousClass3MZ.A0e(r1);
            this.A0X = C000200d.A00(r3.AFu);
            this.A08 = r4;
            this.A0E = AnonymousClass3Ma.A0S(r1);
            this.A0K = (WhatsAppLibLoader) r1.ABy.get();
            this.A0N = C72453Mb.A0p(r1);
            this.A0F = AnonymousClass3MZ.A0j(r1);
            this.A0S = (AnonymousClass4YE) r3.AD4.get();
            this.A0C = AnonymousClass1K1.A08(A0K2);
            this.A0W = C000200d.A00(A0K2.A5Z);
            this.A0G = (AnonymousClass11Q) r1.A2T.get();
            this.A0A = (C26261Rl) r1.A8j.get();
            this.A0M = (C27031Ul) r1.ADv.get();
            this.A0U = C000200d.A00(r1.ADn);
        }
    }

    public C18180vt BYS() {
        return C19620yd.A02;
    }

    public void BsU(int i, String str) {
        if (i == 0 && str.length() != 0) {
            this.A05.CGF(new AnonymousClass7RS(0, str, this));
            this.A0b.setSubText(str);
            AnonymousClass4YE.A00(this.A0S, 2, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c9, code lost:
        if (r5.A0A.A00("profile") == 0) goto L_0x00cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            java.lang.String r2 = "ProfileInfoActivity"
            r1 = -1
            switch(r6) {
                case 12: goto L_0x000a;
                case 13: goto L_0x0080;
                case 14: goto L_0x00a6;
                case 15: goto L_0x00b4;
                default: goto L_0x0006;
            }
        L_0x0006:
            super.onActivityResult(r6, r7, r8)
        L_0x0009:
            return
        L_0x000a:
            if (r7 != r1) goto L_0x002d
            r1 = 0
            if (r8 == 0) goto L_0x0078
            java.lang.String r0 = "is_reset"
            boolean r0 = r8.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x005d
            android.view.View r0 = r5.A03
            r0.setVisibility(r1)
            X.1Up r1 = r5.A0N
            X.1E7 r0 = r5.A0H
            r1.A0D(r0)
            r5.A03()
        L_0x0026:
            X.4YE r2 = r5.A0S
            r1 = 1
            r0 = 2
            X.AnonymousClass4YE.A00(r2, r1, r0)
        L_0x002d:
            android.view.View r0 = r5.A02
            if (r0 == 0) goto L_0x0009
            float r0 = r0.getScaleX()
            double r1 = (double) r0
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0009
            android.view.View r0 = r5.A02
            float r0 = r0.getScaleY()
            double r1 = (double) r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0009
            android.view.View r0 = r5.A02
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r1)
            android.view.ViewPropertyAnimator r2 = r0.scaleY(r1)
            r0 = 125(0x7d, double:6.2E-322)
            r2.setDuration(r0)
            return
        L_0x005d:
            java.lang.String r0 = "skip_cropping"
            boolean r0 = r8.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0078
            X.1Up r0 = r5.A0N
            r0.A0A(r2)
            X.1Up r1 = r5.A0N
            X.1E7 r0 = r5.A0H
            boolean r0 = r1.A0F(r0)
            if (r0 == 0) goto L_0x002d
            A0Q(r5)
            goto L_0x0026
        L_0x0078:
            X.1Up r1 = r5.A0N
            r0 = 13
            r1.A04(r8, r5, r0)
            goto L_0x002d
        L_0x0080:
            X.1Up r0 = r5.A0N
            r0.A0A(r2)
            if (r7 != r1) goto L_0x009c
            X.1Up r1 = r5.A0N
            X.1E7 r0 = r5.A0H
            boolean r0 = r1.A0F(r0)
            if (r0 == 0) goto L_0x0009
            A0Q(r5)
            X.4YE r2 = r5.A0S
            r1 = 1
            r0 = 2
            X.AnonymousClass4YE.A00(r2, r1, r0)
            return
        L_0x009c:
            if (r7 != 0) goto L_0x0009
            if (r8 == 0) goto L_0x0009
            X.1Up r0 = r5.A0N
            r0.A03(r8, r5)
            return
        L_0x00a6:
            if (r7 != r1) goto L_0x0009
            com.whatsapp.profile.ProfileSettingsRowIconText r1 = r5.A0b
            X.11S r0 = r5.A02
            java.lang.String r0 = r0.A0D()
            r1.setSubText(r0)
            return
        L_0x00b4:
            X.0ve r2 = r5.A0E
            r1 = 6149(0x1805, float:8.617E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00cb
            X.1Rl r1 = r5.A0A
            java.lang.String r0 = "profile"
            int r1 = r1.A00(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00cc
        L_0x00cb:
            r0 = 0
        L_0x00cc:
            android.view.View r1 = r5.A01
            int r0 = X.C72453Mb.A0J(r0)
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.ProfileInfoActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        C146757Qm r1 = new C146757Qm((Object) this, 32);
        if (AnonymousClass745.A00) {
            A0d(r1);
        } else {
            r1.run();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0311, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r11.A0E, 4023) != false) goto L_0x01ff;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            boolean r0 = X.AnonymousClass745.A00
            r4 = 13
            r5 = 1
            if (r0 == 0) goto L_0x0078
            android.view.Window r8 = r11.getWindow()
            r0 = 12
            r8.requestFeature(r0)
            r8.requestFeature(r4)
            android.transition.ChangeBounds r2 = new android.transition.ChangeBounds
            r2.<init>()
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            X.1YX r0 = new X.1YX
            r0.<init>()
            r2.setInterpolator(r0)
            r10 = 16908335(0x102002f, float:2.387736E-38)
            r2.excludeTarget(r10, r5)
            r9 = 16908336(0x1020030, float:2.3877364E-38)
            r2.excludeTarget(r9, r5)
            r0 = 2131427474(0x7f0b0092, float:1.8476565E38)
            r7 = 2131427474(0x7f0b0092, float:1.8476565E38)
            r2.excludeTarget(r0, r5)
            r8.setSharedElementEnterTransition(r2)
            r8.setSharedElementExitTransition(r2)
            android.transition.Fade r6 = new android.transition.Fade
            r6.<init>()
            android.transition.Fade r3 = new android.transition.Fade
            r3.<init>()
            r0 = 220(0xdc, double:1.087E-321)
            r6.setDuration(r0)
            r6.excludeTarget(r10, r5)
            r6.excludeTarget(r9, r5)
            r6.excludeTarget(r7, r5)
            r0 = 2131428896(0x7f0b0620, float:1.847945E38)
            r2 = 2131428896(0x7f0b0620, float:1.847945E38)
            r6.excludeTarget(r0, r5)
            r0 = 240(0xf0, double:1.186E-321)
            r3.setDuration(r0)
            r3.excludeTarget(r10, r5)
            r3.excludeTarget(r9, r5)
            r3.excludeTarget(r7, r5)
            r3.excludeTarget(r2, r5)
            r8.setEnterTransition(r6)
            r8.setReturnTransition(r3)
        L_0x0078:
            super.onCreate(r12)
            com.whatsapp.nativelibloader.WhatsAppLibLoader r0 = r11.A0K
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x008c
            java.lang.String r0 = "aborting due to native libraries missing"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0088:
            r11.finish()
            return
        L_0x008c:
            r0 = 2131626631(0x7f0e0a87, float:1.8880504E38)
            r11.setContentView((int) r0)
            X.01n r0 = r11.getSupportActionBar()
            r3 = 0
            if (r0 == 0) goto L_0x00a1
            r0.A0W(r5)
            androidx.appcompat.widget.Toolbar r0 = r11.A02
            r0.setTouchscreenBlocksFocus(r3)
        L_0x00a1:
            X.1E8 r0 = X.AnonymousClass3MY.A0P(r11)
            r11.A0H = r0
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = "profileinfo/create/no-me"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r0 = X.AnonymousClass1LU.A0A(r11)
            r11.startActivity(r0)
            goto L_0x0088
        L_0x00b6:
            r0 = 2131434144(0x7f0b1aa0, float:1.8490094E38)
            android.view.View r0 = r11.findViewById(r0)
            com.whatsapp.profile.ProfileSettingsRowIconText r0 = (com.whatsapp.profile.ProfileSettingsRowIconText) r0
            r11.A0b = r0
            r0 = 2131434150(0x7f0b1aa6, float:1.8490106E38)
            android.view.View r0 = r11.findViewById(r0)
            com.whatsapp.profile.ProfileSettingsRowIconText r0 = (com.whatsapp.profile.ProfileSettingsRowIconText) r0
            r11.A0O = r0
            r0 = 2131434151(0x7f0b1aa7, float:1.8490108E38)
            android.view.View r0 = r11.findViewById(r0)
            r11.A0a = r0
            com.whatsapp.profile.ProfileSettingsRowIconText r1 = r11.A0b
            X.11S r0 = r11.A02
            java.lang.String r0 = r0.A0D()
            r1.setSubText(r0)
            boolean r0 = X.AnonymousClass3MX.A1V(r11)
            if (r0 == 0) goto L_0x038f
            X.11Q r0 = r11.A0G
            android.content.SharedPreferences r1 = X.AnonymousClass11Q.A01(r0)
            java.lang.String r0 = "username_creation_supported_on_primary"
            boolean r0 = r1.getBoolean(r0, r3)
        L_0x00f2:
            if (r0 == 0) goto L_0x015b
            com.whatsapp.profile.ProfileSettingsRowIconText r0 = r11.A0O
            r0.setVisibility(r3)
            com.whatsapp.profile.ProfileSettingsRowIconText r1 = r11.A0O
            r0 = 2131894807(0x7f122217, float:1.942443E38)
            java.lang.String r0 = r11.getString(r0)
            r1.setText(r0)
            com.whatsapp.profile.ProfileSettingsRowIconText r1 = r11.A0O
            r0 = 2131894806(0x7f122216, float:1.9424427E38)
            java.lang.String r0 = r11.getString(r0)
            r1.setDescription(r0)
            com.whatsapp.profile.ProfileSettingsRowIconText r1 = r11.A0O
            r0 = 2131233207(0x7f0809b7, float:1.8082545E38)
            r1.setPrimaryIcon(r0)
            android.view.View r0 = r11.A0a
            r0.setVisibility(r3)
            X.1It r1 = X.AnonymousClass3MW.A0N(r11)
            java.lang.Class<com.whatsapp.profile.viewmodel.UsernameViewModel> r0 = com.whatsapp.profile.viewmodel.UsernameViewModel.class
            X.1J2 r6 = r1.A00(r0)
            com.whatsapp.profile.viewmodel.UsernameViewModel r6 = (com.whatsapp.profile.viewmodel.UsernameViewModel) r6
            X.0vl r5 = r6.A05
            java.lang.Object r2 = r5.getValue()
            X.1DS r2 = (X.AnonymousClass1DS) r2
            X.4XD r0 = r6.A02
            r0.A01()
            java.lang.Object r0 = r2.A06()
            if (r0 != 0) goto L_0x0151
            X.11S r0 = r6.A00
            java.lang.String r1 = r0.A0C()
            java.lang.Object r0 = r5.getValue()
            X.1DS r0 = (X.AnonymousClass1DS) r0
            r0.A0E(r1)
            X.5bg r0 = r6.A01
            r0.Bb8(r6)
        L_0x0151:
            r1 = 29
            X.4fm r0 = new X.4fm
            r0.<init>(r6, r11, r1)
            r2.A0A(r11, r0)
        L_0x015b:
            com.whatsapp.profile.ProfileSettingsRowIconText r1 = r11.A0b
            r0 = 35
            X.C89964dJ.A00(r1, r11, r0)
            r0 = 2131433801(0x7f0b1949, float:1.8489398E38)
            android.widget.ImageView r1 = X.AnonymousClass3MX.A0I(r11, r0)
            r11.A06 = r1
            r0 = 36
            X.C89964dJ.A00(r1, r11, r0)
            r0 = 2131428999(0x7f0b0687, float:1.8479658E38)
            X.1bI r0 = X.AnonymousClass3Ma.A0x(r11, r0)
            r11.A0c = r0
            r0 = 2131434142(0x7f0b1a9e, float:1.849009E38)
            X.1bI r0 = X.AnonymousClass3Ma.A0x(r11, r0)
            r11.A0d = r0
            r0 = 2131427988(0x7f0b0294, float:1.8477608E38)
            android.view.ViewStub r0 = X.AnonymousClass3MX.A0H(r11, r0)
            r11.A04 = r0
            boolean r0 = X.C72453Mb.A1V(r11)
            r5 = 8
            if (r0 == 0) goto L_0x02e1
            X.1It r1 = X.AnonymousClass3MW.A0N(r11)
            java.lang.Class<com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel> r0 = com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel.class
            X.1J2 r0 = r1.A00(r0)
            com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel r0 = (com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel) r0
            r11.A0R = r0
            android.view.ViewStub r1 = r11.A04
            r0 = 2131626634(0x7f0e0a8a, float:1.888051E38)
            r1.setLayoutResource(r0)
            android.view.ViewStub r0 = r11.A04
            android.view.View r1 = r0.inflate()
            r0 = 2131427983(0x7f0b028f, float:1.8477598E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 2131427985(0x7f0b0291, float:1.8477602E38)
            android.view.View r0 = r1.findViewById(r0)
            com.whatsapp.productinfra.avatar.coinflip.AvatarCoinFlipProfilePhotoImageView r0 = (com.whatsapp.productinfra.avatar.coinflip.AvatarCoinFlipProfilePhotoImageView) r0
            r11.A0L = r0
            r0 = 2131427986(0x7f0b0292, float:1.8477604E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r11.A07 = r0
            com.whatsapp.productinfra.avatar.coinflip.AvatarCoinFlipProfilePhotoImageView r1 = r11.A0L
            r0 = 37
            X.C89964dJ.A00(r1, r11, r0)
            A0c(r11, r3)
            X.1bI r0 = r11.A0c
            r0.A04(r5)
            X.1bI r0 = r11.A0d
            r0.A04(r3)
            X.1bI r2 = r11.A0d
            r1 = 38
            X.4dJ r0 = new X.4dJ
            r0.<init>(r11, r1)
            r2.A05(r0)
            X.00H r0 = r11.A0U
            X.10T r1 = X.C17880vN.A0V(r0)
            X.8B1 r0 = r11.A0h
            r1.registerObserver(r0)
            com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel r0 = r11.A0R
            X.1DS r1 = r0.A00
            r0 = 3
            X.C91614fy.A00(r11, r1, r0)
        L_0x01ff:
            r0 = 2131429002(0x7f0b068a, float:1.8479664E38)
            android.view.View r0 = r11.findViewById(r0)
            r11.A03 = r0
            A0Q(r11)
            r0 = 2131434156(0x7f0b1aac, float:1.8490118E38)
            android.view.View r2 = r11.findViewById(r0)
            com.whatsapp.profile.ProfileSettingsRowIconText r2 = (com.whatsapp.profile.ProfileSettingsRowIconText) r2
            com.whatsapp.TextEmojiLabel r1 = r2.A03
            r0 = 3
            r1.setTextDirection(r0)
            X.1E7 r0 = r11.A0H
            java.lang.String r0 = X.AnonymousClass17K.A02(r0)
            r2.setSubText(r0)
            boolean r0 = X.AnonymousClass3MX.A1V(r11)
            if (r0 != 0) goto L_0x022e
            r0 = 48
            X.AnonymousClass3Ma.A1D(r2, r11, r0)
        L_0x022e:
            r0 = 2131434149(0x7f0b1aa5, float:1.8490104E38)
            android.view.View r0 = r11.findViewById(r0)
            com.whatsapp.profile.ProfileSettingsRowIconText r0 = (com.whatsapp.profile.ProfileSettingsRowIconText) r0
            r11.A0P = r0
            X.0ve r1 = r11.A0E
            r0 = 4921(0x1339, float:6.896E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            com.whatsapp.profile.ProfileSettingsRowIconText r1 = r11.A0P
            if (r0 == 0) goto L_0x02cf
            r1.setVisibility(r5)
        L_0x024a:
            X.1Lf r1 = r11.A0E
            X.1Gv r0 = r11.A0g
            r1.registerObserver(r0)
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r1 = r0.getAction()
            java.lang.String r0 = "android.intent.action.ATTACH_DATA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02c8
            r0 = 2131899385(0x7f1233f9, float:1.9433714E38)
            r11.setTitle(r0)
            X.1Up r1 = r11.A0N
            android.content.Intent r0 = r11.getIntent()
            r1.A04(r0, r11, r4)
        L_0x0270:
            X.00H r0 = r11.A0V
            java.lang.Object r1 = r0.get()
            X.6ue r1 = (X.C136936ue) r1
            r0 = 4
            r1.A01(r0)
            r0 = 2131427782(0x7f0b01c6, float:1.847719E38)
            android.view.View r0 = r11.findViewById(r0)
            r11.A01 = r0
            X.0ve r1 = r11.A0E
            r0 = 6149(0x1805, float:8.617E-42)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x02c2
            X.1Rl r1 = r11.A0A
            java.lang.String r0 = "profile"
            int r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x02c2
            r0 = 2131427781(0x7f0b01c5, float:1.8477188E38)
            android.view.View r1 = r11.findViewById(r0)
            com.whatsapp.profile.SettingsRowPhotoOrInitialText r1 = (com.whatsapp.profile.SettingsRowPhotoOrInitialText) r1
            r11.A0Q = r1
            X.11S r0 = r11.A02
            java.lang.String r0 = r0.A0D()
            r1.setName(r0)
            android.view.View r0 = r11.A01
            r0.setVisibility(r3)
        L_0x02b2:
            X.1oI r0 = r11.A0C
            r0.A00(r11)
            r11.A03()
            android.view.View r1 = r11.A00
            X.1KB r0 = r11.A05
            r11.A39(r1, r0)
            return
        L_0x02c2:
            android.view.View r0 = r11.A01
            r0.setVisibility(r5)
            goto L_0x02b2
        L_0x02c8:
            r0 = 2131895992(0x7f1226b8, float:1.9426833E38)
            r11.setTitle(r0)
            goto L_0x0270
        L_0x02cf:
            r0 = 49
            X.AnonymousClass3Ma.A1D(r1, r11, r0)
            X.00H r0 = r11.A0T
            java.lang.String r1 = X.C72453Mb.A10(r0)
            com.whatsapp.profile.ProfileSettingsRowIconText r0 = r11.A0P
            r0.setSubText(r1)
            goto L_0x024a
        L_0x02e1:
            android.view.ViewStub r0 = r11.A04
            r0.setVisibility(r5)
            X.1bI r0 = r11.A0d
            r0.A04(r5)
            X.1bI r0 = r11.A0c
            android.view.View r0 = r0.A02()
            r11.A02 = r0
            X.1bI r0 = r11.A0c
            r0.A04(r3)
            android.view.View r1 = r11.A02
            r0 = 34
            X.C89964dJ.A00(r1, r11, r0)
            if (r12 != 0) goto L_0x01ff
            boolean r0 = X.AnonymousClass3MX.A1V(r11)
            if (r0 != 0) goto L_0x0315
            X.0ve r2 = r11.A0E
            r1 = 4023(0xfb7, float:5.637E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0315
            goto L_0x01ff
        L_0x0315:
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "is_deep_link"
            boolean r0 = r1.getBooleanExtra(r0, r3)
            if (r0 != 0) goto L_0x01ff
            android.view.Window r0 = r11.getWindow()
            android.transition.Transition r2 = r0.getSharedElementEnterTransition()
            android.view.Window r1 = r11.getWindow()
            android.transition.Transition r0 = r2.clone()
            r1.setSharedElementExitTransition(r0)
            android.view.Window r1 = r11.getWindow()
            android.transition.Transition r0 = r2.clone()
            r1.setSharedElementReenterTransition(r0)
            android.view.Window r1 = r11.getWindow()
            android.transition.Transition r0 = r2.clone()
            r1.setSharedElementReturnTransition(r0)
            android.view.View r0 = r11.A02
            r1 = 0
            r0.setScaleX(r1)
            android.view.View r0 = r11.A02
            r0.setScaleY(r1)
            android.view.View r0 = r11.A02
            r0.setVisibility(r3)
            android.view.Window r0 = r11.getWindow()
            android.transition.Transition r2 = r0.getSharedElementEnterTransition()
            r1 = 2
            X.3hW r0 = new X.3hW
            r0.<init>(r11, r1)
            r2.addListener(r0)
            android.view.Window r0 = r11.getWindow()
            android.transition.Transition r2 = r0.getSharedElementExitTransition()
            r1 = 3
            X.3hW r0 = new X.3hW
            r0.<init>(r11, r1)
            r2.addListener(r0)
            android.view.Window r0 = r11.getWindow()
            android.transition.Transition r2 = r0.getSharedElementReenterTransition()
            r1 = 4
            X.3hW r0 = new X.3hW
            r0.<init>(r11, r1)
            r2.addListener(r0)
            goto L_0x01ff
        L_0x038f:
            X.0ve r2 = r11.A0E
            r1 = 4745(0x1289, float:6.649E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            goto L_0x00f2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.ProfileInfoActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!C18020vd.A05(C18040vf.A02, this.A0E, 6149)) {
            return false;
        }
        menu.add(0, 0, 0, 2131899333);
        return true;
    }

    public C222219b A33() {
        C222219b A33 = super.A33();
        C72483Me.A10(A33, this);
        return A33;
    }

    public void Bmf(String str) {
        CMl(PushnameEmojiBlacklistDialogFragment.A00(str));
    }

    public void onDestroy() {
        super.onDestroy();
        ((C136936ue) this.A0V.get()).A00(4);
        this.A0E.unregisterObserver(this.A0g);
        Handler handler = this.A0Z;
        if (handler != null) {
            handler.removeCallbacks(this.A0e);
        }
        if (C72453Mb.A1V(this)) {
            C17880vN.A0V(this.A0U).unregisterObserver(this.A0h);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            startActivityForResult(C17880vN.A0A().setClassName(this, "com.whatsapp.profile.ProfilePhotoPrivacyActivity"), 15);
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            if (AnonymousClass745.A00) {
                A0d(new C146757Qm((Object) this, 33));
                return true;
            }
            finish();
            return true;
        }
    }

    public /* synthetic */ void A4b() {
        super.onBackPressed();
    }

    public ProfileInfoActivity(int i) {
        this.A0f = false;
        C91024f1.A00(this, 33);
    }
}
