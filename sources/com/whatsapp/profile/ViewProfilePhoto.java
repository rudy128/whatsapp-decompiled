package com.whatsapp.profile;

import X.AQ9;
import X.AR8;
import X.AU6;
import X.AnonymousClass00H;
import X.AnonymousClass0DT;
import X.AnonymousClass10E;
import X.AnonymousClass18K;
import X.AnonymousClass1E7;
import X.AnonymousClass1LU;
import X.AnonymousClass1MZ;
import X.AnonymousClass204;
import X.AnonymousClass3L6;
import X.AnonymousClass3MY;
import X.AnonymousClass4FQ;
import X.AnonymousClass4aU;
import X.AnonymousClass73O;
import X.AnonymousClass8BR;
import X.AnonymousClass97E;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C120536Ec;
import X.C1423279a;
import X.C161268Cm;
import X.C17880vN;
import X.C17960vV;
import X.C19880zA;
import X.C218617r;
import X.C23581Gv;
import X.C24671Lf;
import X.C25221Nj;
import X.C27001Ui;
import X.C27071Up;
import X.C27141Uw;
import X.C27191Vc;
import X.C28741ap;
import X.C42761yh;
import X.C64062u9;
import X.C72463Mc;
import X.C88764ak;
import X.C90024dP;
import X.C96314ne;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ViewProfilePhoto extends AnonymousClass97E {
    public C19880zA A00;
    public C19880zA A01;
    public C24671Lf A02;
    public C27191Vc A03;
    public AnonymousClass1MZ A04;
    public AnonymousClass18K A05;
    public AnonymousClass1LU A06;
    public C27001Ui A07;
    public C27071Up A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public boolean A0D = false;
    public C88764ak A0E;
    public final Handler A0F = new C161268Cm(Looper.getMainLooper(), this, 3);
    public final C23581Gv A0G = new AQ9(this, 4);
    public final C28741ap A0H = new AR8(this, 1);
    public final AnonymousClass3L6 A0I = new AU6(this, 1);
    public final C25221Nj A0J = new C96314ne(this, 22);

    public class SavePhoto extends C120536Ec {
        public boolean A00;

        public void A2n() {
            if (!this.A00) {
                this.A00 = true;
                AnonymousClass10E r1 = C108955ca.A0K(this).AAQ;
                this.A00 = C108965cb.A0G(r1);
                this.A01 = AnonymousClass10E.A12(r1);
            }
        }

        public SavePhoto(int i) {
            this.A00 = false;
            C1423279a.A00(this, 33);
        }

        public SavePhoto() {
            this(0);
        }
    }

    public static void A03(ViewProfilePhoto viewProfilePhoto) {
        AnonymousClass1E7 A0H2 = viewProfilePhoto.A04.A0H(C72463Mc.A0g(viewProfilePhoto.A09));
        viewProfilePhoto.A09 = A0H2;
        if (A0H2.A0F()) {
            viewProfilePhoto.setTitle(2131891126);
        } else {
            viewProfilePhoto.A43(viewProfilePhoto.A05.A0I(viewProfilePhoto.A09));
        }
    }

    public static void A0Q(ViewProfilePhoto viewProfilePhoto) {
        FileInputStream A052;
        TextView textView;
        int i;
        if (AnonymousClass73O.A02(AnonymousClass1E7.A00(viewProfilePhoto.A09))) {
            viewProfilePhoto.A00.setVisibility(0);
            viewProfilePhoto.A0B.setVisibility(8);
            viewProfilePhoto.A02.setVisibility(8);
            return;
        }
        if (C42761yh.A00(viewProfilePhoto.A09, viewProfilePhoto.A0A)) {
            viewProfilePhoto.A00.setVisibility(8);
            viewProfilePhoto.A0B.setVisibility(8);
            viewProfilePhoto.A02.setVisibility(8);
            viewProfilePhoto.A01.setImageResource(2131231059);
            return;
        }
        try {
            A052 = viewProfilePhoto.A03.A05(viewProfilePhoto.A09, true);
            if (A052 == null) {
                viewProfilePhoto.A0B.setVisibility(8);
                viewProfilePhoto.A00.setVisibility(8);
                viewProfilePhoto.A02.setVisibility(0);
                viewProfilePhoto.A01.setVisibility(8);
                if (viewProfilePhoto.A09.A0F()) {
                    textView = viewProfilePhoto.A02;
                    i = 2131892924;
                } else {
                    textView = viewProfilePhoto.A02;
                    i = 2131892961;
                }
                textView.setText(i);
                return;
            }
            viewProfilePhoto.A0B.setVisibility(0);
            viewProfilePhoto.A02.setVisibility(8);
            if (viewProfilePhoto.A09.A07 == 0) {
                viewProfilePhoto.A00.setVisibility(0);
            } else {
                viewProfilePhoto.A00.setVisibility(8);
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDither = true;
            Bitmap A062 = AnonymousClass204.A06(options, A052);
            viewProfilePhoto.A0B.A0A(A062);
            viewProfilePhoto.A01.setImageBitmap(A062);
            A052.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (r7.getBooleanExtra("skip_cropping", false) != false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            r0 = 12
            r3 = -1
            r2 = 13
            if (r5 == r0) goto L_0x000d
            if (r5 == r2) goto L_0x003c
            super.onActivityResult(r5, r6, r7)
        L_0x000c:
            return
        L_0x000d:
            if (r6 != r3) goto L_0x000c
            r1 = 0
            if (r7 == 0) goto L_0x006b
            java.lang.String r0 = "is_reset"
            boolean r0 = r7.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0033
            r0 = 1
            r4.A0D = r0
            X.1Lf r1 = r4.A02
            X.1E7 r0 = r4.A09
            X.1BI r0 = X.AnonymousClass1E7.A00(r0)
            r1.A01(r0)
            X.1Up r1 = r4.A08
            X.1E7 r0 = r4.A09
            r1.A0D(r0)
            X.AnonymousClass4FQ.A00(r4)
            return
        L_0x0033:
            java.lang.String r0 = "skip_cropping"
            boolean r0 = r7.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x006b
            goto L_0x0053
        L_0x003c:
            X.1Up r1 = r4.A08
            java.lang.String r0 = "ViewProfilePhoto"
            r1.A0A(r0)
            if (r6 != r3) goto L_0x0061
            r0 = 1
            r4.A0D = r0
            X.1Lf r1 = r4.A02
            X.1E7 r0 = r4.A09
            X.1BI r0 = X.AnonymousClass1E7.A00(r0)
            r1.A01(r0)
        L_0x0053:
            X.1Up r1 = r4.A08
            X.1E7 r0 = r4.A09
            boolean r0 = r1.A0F(r0)
            if (r0 == 0) goto L_0x000c
            A0Q(r4)
            return
        L_0x0061:
            if (r6 != 0) goto L_0x000c
            if (r7 == 0) goto L_0x000c
            X.1Up r0 = r4.A08
            r0.A03(r7, r4)
            return
        L_0x006b:
            X.1Up r0 = r4.A08
            r0.A04(r7, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.ViewProfilePhoto.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.CZW, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v1, types: [X.B9J, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01e9, code lost:
        if (X.C42761yh.A00(r6, r8.A0A) == false) goto L_0x00ff;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0193  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r22) {
        /*
            r21 = this;
            r8 = r21
            android.content.Intent r0 = r8.getIntent()
            X.Cb1 r3 = X.C26083Cry.A00(r0)
            r2 = 2131899529(0x7f123489, float:1.9434007E38)
            X.CZW r0 = new X.CZW
            r0.<init>()
            X.C26083Cry.A02(r8, r3, r0)
            r0 = r22
            super.onCreate(r0)
            r0 = 2131627375(0x7f0e0d6f, float:1.8882013E38)
            r8.setContentView((int) r0)
            androidx.appcompat.widget.Toolbar r14 = X.AnonymousClass3Ma.A0G(r8)
            X.01n r0 = X.C72463Mc.A0S(r8, r14)
            r4 = 1
            r0.A0W(r4)
            java.lang.String r0 = X.C72453Mb.A0u(r8)
            X.1BI r7 = X.AnonymousClass3MX.A0l(r0)
            X.C17960vV.A07(r7)
            X.1M9 r0 = r8.A04
            X.1E7 r0 = r0.A0H(r7)
            r8.A09 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ViewProfilePhoto/create "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " photo_full_id:"
            r1.append(r0)
            X.1E7 r0 = r8.A09
            int r0 = r0.A07
            X.C17900vP.A0o(r1, r0)
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "can_user_remove_photo"
            boolean r0 = r1.getBooleanExtra(r0, r4)
            r8.A0D = r0
            X.11S r1 = r8.A02
            X.1E7 r0 = r8.A09
            boolean r0 = X.AnonymousClass3Ma.A1V(r1, r0)
            r5 = 0
            if (r0 == 0) goto L_0x0086
            X.0zA r1 = r8.A01
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r0 = r1.A03()
            X.00H r0 = (X.AnonymousClass00H) r0
            r0.get()
            java.lang.String r0 = "isProfileLockedAndMvEditEnabled"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0086:
            X.1Lf r1 = r8.A02
            X.1Gv r0 = r8.A0G
            r1.registerObserver(r0)
            X.00H r0 = r8.A09
            X.10T r1 = X.C17880vN.A0V(r0)
            X.1ap r0 = r8.A0H
            r1.registerObserver(r0)
            X.00H r0 = r8.A0B
            X.10T r1 = X.C17880vN.A0V(r0)
            X.1Nj r0 = r8.A0J
            r1.registerObserver(r0)
            X.1E8 r6 = X.AnonymousClass3MY.A0P(r8)
            if (r6 != 0) goto L_0x00b9
            java.lang.String r0 = "ViewProfilePhoto/create/no-me"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r0 = X.AnonymousClass1LU.A0A(r8)
            r8.startActivity(r0)
            r8.finish()
            return
        L_0x00b9:
            X.1E7 r0 = r8.A09
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x01ed
            r0 = 2131891126(0x7f1213b6, float:1.9416963E38)
        L_0x00c4:
            r8.setTitle(r0)
        L_0x00c7:
            X.1BI r0 = r6.A0J
            boolean r4 = r7.equals(r0)
            r0 = 32000(0x7d00, double:1.581E-319)
            if (r4 == 0) goto L_0x0193
            X.1E7 r6 = r8.A09
            int r4 = r6.A07
            if (r4 <= 0) goto L_0x0104
            X.1Lr r4 = r8.A06
            java.io.File r4 = r4.A00(r6)
            if (r4 == 0) goto L_0x0104
            boolean r4 = r4.exists()
            if (r4 != 0) goto L_0x0104
            X.1E7 r4 = r8.A09
            r4.A07 = r5
            X.1Ui r6 = r8.A07
            X.1BI r16 = X.AnonymousClass1E7.A00(r4)
            X.1E7 r4 = r8.A09
            int r4 = r4.A07
            java.lang.String r17 = "ViewProfilePhoto.onCreate_A"
            r19 = 1
            r15 = r6
            r18 = r4
            r20 = r5
            r15.A03(r16, r17, r18, r19, r20)
        L_0x00ff:
            android.os.Handler r4 = r8.A0F
            r4.sendEmptyMessageDelayed(r5, r0)
        L_0x0104:
            X.1Vc r7 = r8.A03
            X.1E7 r9 = r8.A09
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131168739(0x7f070de3, float:1.7951788E38)
            int r12 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131168737(0x7f070de1, float:1.7951784E38)
            float r11 = r1.getDimension(r0)
            r13 = 1
            java.lang.String r10 = "ViewProfilePhoto.onCreate_C"
            android.graphics.Bitmap r1 = r7.A04(r8, r9, r10, r11, r12, r13)
            r0 = 2131434181(0x7f0b1ac5, float:1.8490169E38)
            android.view.View r0 = r8.findViewById(r0)
            r8.A00 = r0
            r0 = 2131433831(0x7f0b1967, float:1.8489459E38)
            android.view.View r0 = r8.findViewById(r0)
            com.whatsapp.mediaview.PhotoView r0 = (com.whatsapp.mediaview.PhotoView) r0
            r8.A0B = r0
            r0 = 2131432664(0x7f0b14d8, float:1.8487092E38)
            android.widget.TextView r0 = X.AnonymousClass3MX.A0L(r8, r0)
            r8.A02 = r0
            r0 = 2131433835(0x7f0b196b, float:1.8489467E38)
            android.widget.ImageView r0 = X.AnonymousClass3MX.A0I(r8, r0)
            r8.A01 = r0
            r8.A4c(r1)
            A0Q(r8)
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "circular_return_name"
            java.lang.String r0 = r1.getStringExtra(r0)
            if (r0 != 0) goto L_0x0166
            X.4ZR r0 = new X.4ZR
            r0.<init>(r8)
            java.lang.String r0 = r0.A02(r2)
        L_0x0166:
            boolean r1 = X.AnonymousClass745.A00
            r8.A4d(r1, r0)
            r0 = 2131434744(0x7f0b1cf8, float:1.849131E38)
            android.view.View r12 = r8.findViewById(r0)
            r0 = 2131429510(0x7f0b0886, float:1.8480695E38)
            android.view.View r13 = r8.findViewById(r0)
            com.whatsapp.mediaview.PhotoView r0 = r8.A0B
            r15 = r8
            r18 = r1
            r17 = r3
            r16 = r0
            X.C26083Cry.A01(r12, r13, r14, r15, r16, r17, r18)
            X.00H r0 = r8.A0A
            java.lang.Object r1 = r0.get()
            X.1Uw r1 = (X.C27141Uw) r1
            X.3L6 r0 = r8.A0I
            r1.A00(r0)
            return
        L_0x0193:
            X.Abf r7 = new X.Abf
            r7.<init>()
            X.00H r4 = r8.A0C
            java.lang.Object r4 = r4.get()
            X.6zi r4 = (X.C139956zi) r4
            X.AQY r6 = new X.AQY
            r6.<init>(r8, r7, r4)
            X.1NM r4 = r8.A07
            boolean r4 = r4.A04(r6)
            if (r4 == 0) goto L_0x0104
            X.1E7 r6 = r8.A09
            int r4 = r6.A07
            if (r4 <= 0) goto L_0x01c5
            X.1Lr r4 = r8.A06
            java.io.File r4 = r4.A00(r6)
            if (r4 == 0) goto L_0x01c5
            boolean r4 = r4.exists()
            if (r4 != 0) goto L_0x01c5
            X.1E7 r4 = r8.A09
            r4.A07 = r5
        L_0x01c5:
            X.1Ui r6 = r8.A07
            X.1E7 r4 = r8.A09
            X.1BI r16 = X.AnonymousClass1E7.A00(r4)
            X.1E7 r4 = r8.A09
            int r4 = r4.A07
            java.lang.String r17 = "ViewProfilePhoto.onCreate_B"
            r19 = 1
            r15 = r6
            r18 = r4
            r20 = r5
            r15.A03(r16, r17, r18, r19, r20)
            X.1E7 r6 = r8.A09
            int r4 = r6.A07
            if (r4 != 0) goto L_0x0104
            X.12L r4 = r8.A0A
            boolean r4 = X.C42761yh.A00(r6, r4)
            if (r4 != 0) goto L_0x0104
            goto L_0x00ff
        L_0x01ed:
            X.1BI r0 = r6.A0J
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x01fa
            r0 = 2131899332(0x7f1233c4, float:1.9433607E38)
            goto L_0x00c4
        L_0x01fa:
            X.1Me r1 = r8.A05
            X.1E7 r0 = r8.A09
            java.lang.String r0 = r1.A0I(r0)
            r8.A43(r0)
            X.AnonymousClass8BV.A11(r8)
            boolean r0 = X.AnonymousClass112.A0A()
            if (r0 == 0) goto L_0x00c7
            X.0ve r4 = r8.A0E
            r1 = 12040(0x2f08, float:1.6872E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x00c7
            X.18K r4 = r8.A05
            X.1E7 r1 = r8.A09
            X.4ak r0 = new X.4ak
            r0.<init>(r8, r1, r4, r5)
            r8.A0E = r0
            goto L_0x00c7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.ViewProfilePhoto.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A09.equals(AnonymousClass3MY.A0P(this)) || this.A09.A0F()) {
            MenuItem add = menu.add(0, 2131432585, 0, 2131889637);
            add.setShowAsAction(2);
            add.setActionView(2131627506);
            ImageView imageView = (ImageView) add.getActionView();
            if (imageView != null) {
                imageView.setImageResource(2131231878);
                C90024dP.A00(imageView, this, add, 21);
                AnonymousClass3MY.A0w(this, imageView, 2131889637);
                add.setActionView(imageView);
            }
            MenuItem add2 = menu.add(0, 1, 0, 2131899418);
            add2.setShowAsAction(2);
            add2.setActionView(2131627506);
            ImageView imageView2 = (ImageView) add2.getActionView();
            if (imageView2 != null) {
                imageView2.setImageResource(2131232296);
                C90024dP.A00(imageView2, this, add2, 22);
                AnonymousClass3MY.A0w(this, imageView2, 2131899418);
                add2.setActionView(imageView2);
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        FileOutputStream A19;
        MenuItem menuItem2 = menuItem;
        int itemId = menuItem2.getItemId();
        if (itemId == 2131432585) {
            this.A08.A08(this, this.A09, (Integer) null, 12, 1, 2, this.A0D, false, false);
            return true;
        } else if (itemId == 1) {
            C218617r r3 = this.A04;
            if (this.A09.equals(AnonymousClass3MY.A0P(this))) {
                str = "me.jpg";
            } else {
                str = "photo.jpg";
            }
            File A0a = r3.A0a(str);
            try {
                File A002 = this.A06.A00(this.A09);
                C17960vV.A07(A002);
                FileInputStream A18 = C108945cZ.A18(A002);
                try {
                    A19 = C108945cZ.A19(A0a);
                    C64062u9.A00(A18, A19);
                    Uri A022 = C64062u9.A02(this, A0a);
                    this.A03.A05().A0E(A022.toString());
                    Intent[] intentArr = new Intent[2];
                    intentArr[0] = C108945cZ.A0G("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", A022);
                    startActivity(AnonymousClass4aU.A01((IntentSender) null, (CharSequence) null, AnonymousClass8BR.A15(AnonymousClass8BR.A07(this, SavePhoto.class).putExtra("android.intent.extra.STREAM", Uri.fromFile(A0a)).putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A05.A0I(this.A09)), intentArr, 1)));
                    A19.close();
                    A18.close();
                    return true;
                } catch (Throwable th) {
                    A18.close();
                    throw th;
                }
            } catch (IOException e) {
                Log.e((Throwable) e);
                this.A05.A08(2131894542, 1);
                return true;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem2);
        } else {
            AnonymousClass4FQ.A00(this);
            return true;
        }
        throw th;
    }

    public void A3I() {
        super.A3I();
        if (this.A0E != null) {
            try {
                registerScreenCaptureCallback(getMainExecutor(), this.A0E);
            } catch (IllegalStateException e) {
                this.A0E = null;
                Log.e((Throwable) e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0F.removeMessages(0);
        this.A02.unregisterObserver(this.A0G);
        C17880vN.A0V(this.A09).unregisterObserver(this.A0H);
        ((C27141Uw) this.A0A.get()).A01(this.A0I);
        C17880vN.A0V(this.A0B).unregisterObserver(this.A0J);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0054, code lost:
        if (r5.A09.A13 != false) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPrepareOptionsMenu(android.view.Menu r6) {
        /*
            r5 = this;
            int r0 = r6.size()
            if (r0 == 0) goto L_0x0092
            X.1E7 r1 = r5.A09
            X.1E8 r0 = X.AnonymousClass3MY.A0P(r5)
            boolean r4 = r1.equals(r0)
            r2 = 0
            r1 = 1
            if (r4 != 0) goto L_0x001c
            X.1E7 r0 = r5.A09
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x0092
        L_0x001c:
            android.view.MenuItem r3 = r6.findItem(r1)
            X.1Lr r1 = r5.A06
            X.1E7 r0 = r5.A09
            java.io.File r0 = r1.A00(r0)
            X.C17960vV.A07(r0)
            boolean r0 = r0.exists()
            r3.setVisible(r0)
            r0 = 2131432585(0x7f0b1489, float:1.8486932E38)
            android.view.MenuItem r3 = r6.findItem(r0)
            if (r4 != 0) goto L_0x0056
            X.1MZ r4 = r5.A04
            X.1E7 r1 = r5.A09
            java.lang.Class<X.1EC> r0 = X.AnonymousClass1EC.class
            com.whatsapp.jid.Jid r0 = r1.A06(r0)
            X.C17960vV.A07(r0)
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r0 = r4.A0K(r0)
            if (r0 != 0) goto L_0x0056
            X.1E7 r0 = r5.A09
            boolean r0 = r0.A13
            if (r0 != 0) goto L_0x008f
        L_0x0056:
            X.0zA r1 = r5.A01
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x006e
            java.lang.Object r0 = r1.A03()
            X.00H r0 = (X.AnonymousClass00H) r0
            r0.get()
            java.lang.String r0 = "shouldDisableProfileEdits"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x006e:
            X.00H r0 = r5.A0C
            java.lang.Object r1 = r0.get()
            X.1xo r1 = (X.C42211xo) r1
            X.1E7 r0 = r5.A09
            boolean r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x008f
            X.00H r0 = r5.A0C
            java.lang.Object r1 = r0.get()
            X.1xo r1 = (X.C42211xo) r1
            X.1E7 r0 = r5.A09
            boolean r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x008f
            r2 = 1
        L_0x008f:
            r3.setVisible(r2)
        L_0x0092:
            boolean r0 = super.onPrepareOptionsMenu(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.ViewProfilePhoto.onPrepareOptionsMenu(android.view.Menu):boolean");
    }

    public void onStop() {
        super.onStop();
        C88764ak r0 = this.A0E;
        if (r0 != null) {
            try {
                unregisterScreenCaptureCallback(r0);
            } catch (IllegalStateException e) {
                Log.e((Throwable) e);
            }
        }
    }
}
