package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.PagerSlidingTabStrip;
import com.whatsapp.qrcode.WaQrScannerView;
import com.whatsapp.qrcode.contactqr.ContactQrContactCardView;
import com.whatsapp.qrcode.contactqr.ContactQrMyCodeFragment;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;
import com.whatsapp.util.Log;

/* renamed from: X.990  reason: invalid class name */
public abstract class AnonymousClass990 extends C166848e8 implements C107625aK, AnonymousClass5XA {
    public Uri A00;
    public ImageView A01;
    public ViewPager A02;
    public AnonymousClass1LA A03;
    public C36361nl A04;
    public PagerSlidingTabStrip A05;
    public AnonymousClass6h0 A06;
    public AnonymousClass1M9 A07;
    public C37511pf A08;
    public AnonymousClass1PM A09;
    public C24921Me A0A;
    public C678831f A0B;
    public C25161Nd A0C;
    public C219217x A0D;
    public C18000vb A0E;
    public C30801eX A0F;
    public C32971i3 A0G;
    public AnonymousClass18K A0H;
    public AnonymousClass1LU A0I;
    public AnonymousClass1XN A0J;
    public AnonymousClass1QO A0K;
    public AnonymousClass1QS A0L;
    public C31041ev A0M;
    public C139676zG A0N;
    public C133286oV A0O;
    public C161488Er A0P;
    public ContactQrMyCodeFragment A0Q;
    public C132996o0 A0R;
    public QrScanCodeFragment A0S;
    public C26521Sl A0T;
    public AnonymousClass00H A0U;
    public AnonymousClass00H A0V;
    public AnonymousClass00H A0W;
    public AnonymousClass00H A0X;
    public String A0Y;
    public boolean A0Z = false;
    public boolean A0a;
    public C192109no A0b;
    public boolean A0c;
    public boolean A0d;
    public final C1601987n A0e = new C21006Acy(this, 1);

    public static void A03(AnonymousClass990 r7) {
        if (r7.A0S == null) {
            return;
        }
        if (r7.A0D.A02("android.permission.CAMERA") != 0) {
            C134126q5 r5 = new C134126q5(r7);
            r5.A01 = 2131232198;
            r5.A02 = 2131894277;
            r5.A0A = new int[]{2131899103};
            r5.A03 = 2131894276;
            r5.A08 = new int[]{2131899103};
            r5.A01(new String[]{"android.permission.CAMERA"});
            r5.A06 = true;
            r7.startActivityForResult(r5.A00(), 1);
            return;
        }
        r7.A0S.A26();
    }

    public void A4c() {
        if (!this.A0D.A0G()) {
            C17960vV.A07(this);
            int i = Build.VERSION.SDK_INT;
            int i2 = 2131894478;
            if (i >= 30) {
                i2 = 2131894481;
                if (i < 33) {
                    i2 = 2131894480;
                }
            }
            CNh(AnonymousClass74O.A03(this, 2131894479, i2, false), 4);
        } else if (this.A0Y == null) {
            Log.e("BaseQrActivity/shareFailed/noQr");
            this.A05.A08(2131896086, 0);
        } else {
            CNA(2131888852);
            boolean A052 = C18020vd.A05(C18040vf.A02, this.A0E, 8389);
            boolean z = true;
            AnonymousClass10I r2 = this.A05;
            if (A052) {
                AnonymousClass1KB r13 = this.A05;
                AnonymousClass11S r14 = this.A02;
                C218617r r12 = this.A04;
                String str = this.A0Y;
                String A0q = C17880vN.A0q(this, AnonymousClass001.A1H("https://wa.me/qr/", str, C18070vi.A0K(str)), new Object[1], 0, 2131888824);
                if (this.A0A.A0I() != 0) {
                    z = false;
                }
                String str2 = this.A0Y;
                AnonymousClass3MW.A1T(new AnonymousClass49S(this, r12, r13, r14, A0q, AnonymousClass001.A1H("https://wa.me/qr/", str2, C18070vi.A0K(str2)), getString(2131888845), z), r2, 0);
                return;
            }
            AnonymousClass1KB r10 = this.A05;
            AnonymousClass11S r9 = this.A02;
            C218617r r8 = this.A04;
            String str3 = this.A0Y;
            C218617r r142 = r8;
            AnonymousClass1KB r15 = r10;
            AnonymousClass11S r16 = r9;
            AnonymousClass49K r122 = new AnonymousClass49K(this, r142, r15, r16, C17880vN.A0q(this, AnonymousClass001.A1H("https://wa.me/qr/", str3, C18070vi.A0K(str3)), new Object[1], 0, 2131888824));
            Bitmap[] bitmapArr = new Bitmap[1];
            AnonymousClass1E8 A0Q2 = AnonymousClass3MZ.A0Q(this.A02);
            if (this.A0A.A0I() != 0) {
                z = false;
            }
            String str4 = this.A0Y;
            String A1H = AnonymousClass001.A1H("https://wa.me/qr/", str4, C18070vi.A0K(str4));
            String string = getString(2131888845);
            C72473Md.A1I(A0Q2, A1H);
            C18070vi.A0d(string, 4);
            bitmapArr[0] = C1408473h.A01(this, A0Q2, A1H, string, z);
            r2.CGD(r122, bitmapArr);
        }
    }

    public void A4d(boolean z) {
        String str;
        C1775098y r5 = (C1775098y) this;
        r5.CNA(2131888852);
        r5.A0a = true;
        r5.A01 = z;
        r5.A00 = SystemClock.elapsedRealtime();
        C20976AcU acU = new C20976AcU(r5.A05, C17880vN.A0U(r5.A0W), new C186239ds(r5.A05, r5.A0A, r5));
        AnonymousClass1OZ r9 = acU.A01;
        String A0B2 = r9.A0B();
        AnonymousClass1MD[] r2 = new AnonymousClass1MD[2];
        boolean A1W = C17890vO.A1W(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "contact", r2);
        if (z) {
            str = "revoke";
        } else {
            str = "get";
        }
        C17880vN.A1Q("action", str, r2, 1);
        C29621ca A0k = AnonymousClass8BR.A0k("qr", r2);
        AnonymousClass1MD[] r22 = new AnonymousClass1MD[3];
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2, r22, A1W ? 1 : 0);
        C17880vN.A1Q("xmlns", "w:qr", r22, 1);
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r22, 2);
        r9.A0J(acU, AnonymousClass8BT.A0a(A0k, r22), A0B2, 215, 32000);
    }

    public boolean A4e(String str, boolean z, int i) {
        if (this.A0N.A0j || this.A0a) {
            return false;
        }
        return this.A0N.A02((AnonymousClass205) null, str, i, z, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        if (r3 != 1) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPrepareOptionsMenu(android.view.Menu r5) {
        /*
            r4 = this;
            androidx.viewpager.widget.ViewPager r0 = r4.A02
            int r3 = r0.getCurrentItem()
            X.0vb r0 = r4.A0E
            boolean r2 = X.AnonymousClass3MY.A1b(r0)
            r1 = 1
            if (r3 == 0) goto L_0x0012
            if (r3 == r1) goto L_0x0014
        L_0x0011:
            return r1
        L_0x0012:
            r2 = r2 ^ 1
        L_0x0014:
            r0 = 0
            if (r2 == 0) goto L_0x001d
            if (r2 != r1) goto L_0x0011
            r5.setGroupVisible(r0, r0)
            return r1
        L_0x001d:
            r5.setGroupVisible(r0, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass990.onPrepareOptionsMenu(android.view.Menu):boolean");
    }

    public void onStop() {
        this.A0b.A00(getWindow());
        super.onStop();
    }

    public void A2l(Fragment fragment) {
        super.A2l(fragment);
        if (fragment instanceof ContactQrMyCodeFragment) {
            ContactQrMyCodeFragment contactQrMyCodeFragment = (ContactQrMyCodeFragment) fragment;
            this.A0Q = contactQrMyCodeFragment;
            String str = this.A0Y;
            if (str != null) {
                contactQrMyCodeFragment.A02 = str;
                ContactQrContactCardView contactQrContactCardView = contactQrMyCodeFragment.A01;
                if (contactQrContactCardView != null) {
                    contactQrContactCardView.setQrCode(AnonymousClass001.A1H("https://wa.me/qr/", str, C18070vi.A0K(str)));
                }
            }
        } else if (fragment instanceof QrScanCodeFragment) {
            this.A0S = (QrScanCodeFragment) fragment;
            ViewPager viewPager = this.A02;
            if (viewPager == null) {
                Log.e("BaseQrActivity/onAttachFragment/viewPagerNull");
            } else if (1 == viewPager.getCurrentItem()) {
                A03(this);
            }
        }
    }

    public void A4b() {
        boolean A1b;
        C72463Mc.A0t(this);
        setTitle(getString(2131888847));
        setContentView(2131624686);
        Toolbar toolbar = (Toolbar) C110885hR.A0A(this, 2131436270);
        toolbar.setNavigationIcon((Drawable) new C74743cP(AnonymousClass4aX.A08(getResources().getDrawable(2131231675), AnonymousClass3Ma.A01(this, getResources(), 2130970284, 2131101275)), this.A0E));
        toolbar.setTitle((CharSequence) getString(2131888847));
        toolbar.setNavigationOnClickListener(new AFD(this, 23));
        setSupportActionBar(toolbar);
        this.A0b = new C192109no();
        this.A02 = (ViewPager) C110885hR.A0A(this, 2131429448);
        this.A05 = (PagerSlidingTabStrip) C110885hR.A0A(this, 2131429450);
        ImageView imageView = (ImageView) C110885hR.A0A(this, 2131429449);
        this.A01 = imageView;
        imageView.setImportantForAccessibility(2);
        int i = 0;
        C139676zG A002 = this.A0O.A00(this, (C135976t4) null, false, true);
        this.A0N = A002;
        A002.A02 = true;
        C161488Er r1 = new C161488Er(getSupportFragmentManager(), this);
        this.A0P = r1;
        this.A02.setAdapter(r1);
        this.A02.A0K(new C162148Jd(this, 1));
        this.A05.setLayoutDirection(0);
        this.A05.setViewPager(this.A02);
        String stringExtra = getIntent().getStringExtra("qrcode");
        if (stringExtra != null) {
            this.A0c = true;
            A4e(stringExtra, false, 5);
        }
        if (!this.A0c) {
            A4d(false);
        }
        boolean booleanExtra = getIntent().getBooleanExtra("scan", false);
        this.A0d = booleanExtra;
        C18000vb r0 = this.A0E;
        if (booleanExtra) {
            A1b = AnonymousClass3MW.A1Z(r0);
        } else {
            A1b = AnonymousClass3MY.A1b(r0);
        }
        boolean z = !A1b;
        this.A02.A0J(z ? 1 : 0, false);
        C161488Er r2 = this.A0P;
        do {
            r2.A00[i].A00.setSelected(AnonymousClass000.A1T(i, z));
            i++;
        } while (i < 2);
    }

    public void C2J() {
        if (AnonymousClass4Yv.A02(this)) {
            return;
        }
        if (this.A0c) {
            finish();
            return;
        }
        this.A01.setVisibility(8);
        this.A01.setImageBitmap((Bitmap) null);
        if (this.A0S != null) {
            this.A0N.A0j = false;
            QrScanCodeFragment qrScanCodeFragment = this.A0S;
            qrScanCodeFragment.A06 = null;
            WaQrScannerView waQrScannerView = qrScanCodeFragment.A04;
            if (waQrScannerView != null) {
                waQrScannerView.CFY();
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            if (i == 2) {
                if (i2 == -1) {
                    if (intent != null) {
                        Uri data = intent.getData();
                        this.A00 = data;
                        if (data != null) {
                            CNA(2131888852);
                            AnonymousClass3MW.A1T(new AnonymousClass9BE(this.A00, this, this.A0T, this.A01.getWidth(), this.A01.getHeight()), this.A05, 0);
                            return;
                        }
                        this.A05.A08(2131889981, 0);
                    } else {
                        return;
                    }
                }
                this.A0a = false;
            } else if (i == 3) {
                QrScanCodeFragment qrScanCodeFragment = this.A0S;
                qrScanCodeFragment.A06 = null;
                WaQrScannerView waQrScannerView = qrScanCodeFragment.A04;
                if (waQrScannerView != null) {
                    waQrScannerView.CFY();
                }
            } else if (i == 4 && i2 == -1) {
                A4c();
            }
        } else if (i2 != 0) {
            this.A0S.A26();
        } else if (this.A0d) {
            finish();
        } else {
            this.A02.A0J(AnonymousClass3MY.A1b(this.A0E) ^ true ? 1 : 0, true);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A4b();
    }

    public void onStart() {
        super.onStart();
        this.A0b.A01(getWindow(), this.A08);
        this.A01.setVisibility(8);
        this.A01.setImageBitmap((Bitmap) null);
    }
}
