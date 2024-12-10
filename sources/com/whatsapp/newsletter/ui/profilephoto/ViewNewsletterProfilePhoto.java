package com.whatsapp.newsletter.ui.profilephoto;

import X.AGC;
import X.AQQ;
import X.AQR;
import X.AQY;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11S;
import X.AnonymousClass1CJ;
import X.AnonymousClass1E7;
import X.AnonymousClass1K1;
import X.AnonymousClass1M9;
import X.AnonymousClass1NM;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4FQ;
import X.AnonymousClass4ZR;
import X.AnonymousClass4aU;
import X.AnonymousClass745;
import X.AnonymousClass8BV;
import X.AnonymousClass8o7;
import X.AnonymousClass8o8;
import X.AnonymousClass97G;
import X.AnonymousClass9IW;
import X.C000200d;
import X.C108945cZ;
import X.C108985cd;
import X.C137116uw;
import X.C139956zi;
import X.C161268Cm;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C24771Lp;
import X.C24791Lr;
import X.C24921Me;
import X.C26083Cry;
import X.C26521Sl;
import X.C27001Ui;
import X.C27191Vc;
import X.C27201Vd;
import X.C29681ch;
import X.C29691ci;
import X.C35681md;
import X.C37451pZ;
import X.C40501uo;
import X.C46162Dk;
import X.C48292Lx;
import X.C56432hS;
import X.C63662tU;
import X.C63932tv;
import X.C64062u9;
import X.C72453Mb;
import X.C72463Mc;
import X.Cb1;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

public final class ViewNewsletterProfilePhoto extends AnonymousClass97G {
    public C56432hS A00;
    public C27201Vd A01;
    public C27191Vc A02;
    public AnonymousClass1CJ A03;
    public AnonymousClass1E7 A04;
    public C35681md A05;
    public C27001Ui A06;
    public C26521Sl A07;
    public AnonymousClass00H A08;
    public Integer A09;
    public C37451pZ A0A;
    public C48292Lx A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Handler A0F;

    private final void A0Q() {
        String str;
        C48292Lx r0 = this.A0B;
        if (r0 == null) {
            str = "photoUpdater";
        } else {
            AnonymousClass1E7 r2 = this.A04;
            if (r2 == null) {
                str = "tempContact";
            } else {
                r0.A08(this, r2, (Integer) null, 12, 1, -1, this.A0C, true, true);
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        C46162Dk A032 = A03(this);
        if (A032 != null && A032.A0P()) {
            menu.add(0, 2131432585, 0, 2131889637).setIcon(2131231878).setShowAsAction(2);
            menu.add(0, 1, 0, 2131899418).setIcon(2131232296).setShowAsAction(2);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        C46162Dk A032;
        boolean z;
        C46162Dk A033;
        boolean z2;
        C18070vi.A0d(menu, 0);
        if (menu.size() > 0 && (A032 = A03(this)) != null && A032.A0P()) {
            boolean z3 = true;
            MenuItem findItem = menu.findItem(1);
            if (findItem != null) {
                C24791Lr r1 = this.A06;
                if (r1 != null) {
                    File A002 = r1.A00(A4b());
                    if (A002 != null) {
                        z2 = A002.exists();
                    } else {
                        z2 = false;
                    }
                    findItem.setVisible(z2);
                } else {
                    C18070vi.A11("contactPhotoHelper");
                    throw null;
                }
            }
            if (C18020vd.A05(C18040vf.A02, this.A0E, 6618)) {
                MenuItem findItem2 = menu.findItem(2131432585);
                if (findItem2 != null) {
                    C46162Dk A034 = A03(this);
                    if (A034 == null || !A034.A0P() || ((A033 = A03(this)) != null && AnonymousClass000.A1Z(A033.A05, AnonymousClass9IW.VERIFIED))) {
                        z3 = false;
                    }
                    findItem2.setVisible(z3);
                }
            } else {
                MenuItem findItem3 = menu.findItem(2131432585);
                if (findItem3 != null) {
                    C46162Dk A035 = A03(this);
                    if (A035 != null) {
                        z = A035.A0P();
                    } else {
                        z = false;
                    }
                    findItem3.setVisible(z);
                }
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public static final C46162Dk A03(ViewNewsletterProfilePhoto viewNewsletterProfilePhoto) {
        AnonymousClass1CJ r1 = viewNewsletterProfilePhoto.A03;
        if (r1 != null) {
            C29691ci A0A2 = r1.A0A(viewNewsletterProfilePhoto.A4b().A0J);
            if (A0A2 instanceof C46162Dk) {
                return (C46162Dk) A0A2;
            }
            return null;
        }
        C18070vi.A11("chatsCache");
        throw null;
    }

    public static final void A0V(ViewNewsletterProfilePhoto viewNewsletterProfilePhoto, boolean z) {
        AnonymousClass00H r0 = viewNewsletterProfilePhoto.A08;
        if (r0 != null) {
            AnonymousClass8o7 r02 = ((AnonymousClass8o8) r0.get()).A00;
            if (r02 == null || !(!r02.A00.A03())) {
                AnonymousClass00H r03 = viewNewsletterProfilePhoto.A08;
                if (r03 != null) {
                    AnonymousClass8o8 r4 = (AnonymousClass8o8) r03.get();
                    AnonymousClass1E7 A4b = viewNewsletterProfilePhoto.A4b();
                    AQQ aqq = new AQQ(viewNewsletterProfilePhoto, z);
                    AnonymousClass8o7 r04 = r4.A00;
                    if (r04 != null) {
                        r04.A00.A01();
                    }
                    r4.A00 = null;
                    AnonymousClass8o7 r2 = new AnonymousClass8o7(A4b, r4);
                    r4.A00(new AQR(r4, aqq, 1), r2);
                    r4.A00 = r2;
                    return;
                }
            } else {
                return;
            }
        }
        C18070vi.A11("newsletterPhotoLoader");
        throw null;
    }

    public void A2y() {
        if (!this.A0D) {
            this.A0D = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r1 = A002.AAQ;
            C63932tv.A02(r1, this);
            AnonymousClass10G r3 = r1.A00;
            C63932tv.A01(r1, r3, this);
            C63662tU.A00(r1, r3, this, r3.A5A);
            this.A03 = (C24771Lp) r1.A0o.get();
            this.A04 = AnonymousClass10E.A4z(r1);
            this.A06 = (C24791Lr) r1.A2h.get();
            this.A0A = AnonymousClass3MZ.A0u(r1);
            this.A07 = (AnonymousClass1NM) r1.A6D.get();
            this.A0C = C000200d.A00(r1.AYQ);
            this.A05 = AnonymousClass3MZ.A0g(r1);
            this.A08 = AnonymousClass3Ma.A0b(r1);
            this.A03 = AnonymousClass3Ma.A0d(r1);
            this.A01 = AnonymousClass3MZ.A0i(r1);
            this.A02 = (C27191Vc) r1.A2i.get();
            this.A07 = (C26521Sl) r1.A69.get();
            this.A05 = (C35681md) r1.A7N.get();
            this.A08 = C000200d.A00(A002.A59);
            this.A00 = (C56432hS) A002.A33.get();
            this.A06 = (C27001Ui) r1.A8p.get();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r14, int r15, android.content.Intent r16) {
        /*
            r13 = this;
            r0 = 12
            r4 = -1
            r3 = 13
            java.lang.String r2 = "photoUpdater"
            r12 = r16
            if (r14 == r0) goto L_0x0011
            if (r14 == r3) goto L_0x0035
            super.onActivityResult(r14, r15, r12)
        L_0x0010:
            return
        L_0x0011:
            if (r15 != r4) goto L_0x0010
            r1 = 0
            if (r16 == 0) goto L_0x00d4
            java.lang.String r0 = "is_reset"
            boolean r0 = r12.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0028
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            r13.A09 = r0
            X.AvK r4 = new X.AvK
            r4.<init>(r13)
            goto L_0x004c
        L_0x0028:
            java.lang.String r0 = "skip_cropping"
            boolean r0 = r12.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x00d4
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r13.A09 = r0
            goto L_0x0047
        L_0x0035:
            X.2Lx r1 = r13.A0B
            if (r1 == 0) goto L_0x00e6
            java.lang.String r0 = "ViewNewsletterProfilePhoto"
            r1.A0A(r0)
            if (r15 != r4) goto L_0x0082
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r13.A09 = r0
            r0 = 1
            r13.A0D = r0
        L_0x0047:
            X.AvL r4 = new X.AvL
            r4.<init>(r13)
        L_0x004c:
            r0 = 2131897384(0x7f122c28, float:1.9429656E38)
            r13.CNA(r0)
            X.2Dk r1 = A03(r13)
            if (r1 == 0) goto L_0x0010
            X.1md r5 = r13.A05
            if (r5 == 0) goto L_0x00d1
            X.1E7 r0 = r13.A4b()
            X.1BI r6 = r0.A0J
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.C18070vi.A0z(r6, r0)
            X.1ch r6 = (X.C29681ch) r6
            java.lang.String r8 = r1.A0T
            java.lang.Integer r0 = r13.A09
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L_0x008e
            r0 = 1
            if (r1 == r0) goto L_0x008e
            r0 = 3
            if (r1 == r0) goto L_0x00cc
            r0 = 0
            if (r1 == r0) goto L_0x00cc
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0082:
            if (r15 != 0) goto L_0x0010
            if (r16 == 0) goto L_0x0010
            X.2Lx r0 = r13.A0B
            if (r0 == 0) goto L_0x00e6
            r0.A03(r12, r13)
            return
        L_0x008e:
            X.1Lr r1 = r13.A06
            if (r1 == 0) goto L_0x00ea
            X.1E7 r0 = r13.A04
            r3 = 0
            if (r0 != 0) goto L_0x009d
            java.lang.String r0 = "tempContact"
        L_0x0099:
            X.C18070vi.A11(r0)
            throw r3
        L_0x009d:
            java.io.File r2 = r1.A00(r0)
            if (r2 == 0) goto L_0x00cc
            boolean r1 = r2.exists()
            r0 = 1
            if (r1 != r0) goto L_0x00cc
            android.net.Uri r2 = android.net.Uri.fromFile(r2)
            if (r2 == 0) goto L_0x00cc
            X.1Sl r1 = r13.A07
            if (r1 == 0) goto L_0x00ce
            r0 = 0
            java.io.File r0 = r1.A0j(r2, r0)
            if (r0 == 0) goto L_0x00cc
            byte[] r10 = X.C64062u9.A0W(r0)
        L_0x00bf:
            r0 = 2
            X.4oW r7 = new X.4oW
            r7.<init>(r4, r13, r0)
            r9 = 0
            r11 = 0
            r12 = 1
            r5.A0C(r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x00cc:
            r10 = 0
            goto L_0x00bf
        L_0x00ce:
            java.lang.String r0 = "mediaFileUtils"
            goto L_0x0099
        L_0x00d1:
            java.lang.String r0 = "newsletterManager"
            goto L_0x00ec
        L_0x00d4:
            X.2Lx r11 = r13.A0B
            if (r11 == 0) goto L_0x00e6
            X.1E7 r15 = r13.A04
            if (r15 != 0) goto L_0x00df
            java.lang.String r0 = "tempContact"
            goto L_0x00ec
        L_0x00df:
            r14 = r13
            r16 = r3
            r11.A05(r12, r13, r14, r15, r16)
            return
        L_0x00e6:
            X.C18070vi.A11(r2)
            goto L_0x00ef
        L_0x00ea:
            java.lang.String r0 = "contactPhotoHelper"
        L_0x00ec:
            X.C18070vi.A11(r0)
        L_0x00ef:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.ui.profilephoto.ViewNewsletterProfilePhoto.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.CZW, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v7, types: [X.B9J, java.lang.Object] */
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        Intent intent = getIntent();
        C18070vi.A0X(intent);
        Cb1 A002 = C26083Cry.A00(intent);
        C26083Cry.A02(this, A002, new Object());
        super.onCreate(bundle);
        setContentView(2131627375);
        this.A00 = AnonymousClass3MY.A0H(this, 2131434181);
        PhotoView photoView = (PhotoView) AnonymousClass3MY.A0H(this, 2131433831);
        C18070vi.A0d(photoView, 0);
        this.A0B = photoView;
        TextView textView = (TextView) AnonymousClass3MY.A0H(this, 2131432664);
        C18070vi.A0d(textView, 0);
        this.A02 = textView;
        ImageView imageView = (ImageView) AnonymousClass3MY.A0H(this, 2131433835);
        C18070vi.A0d(imageView, 0);
        this.A01 = imageView;
        Toolbar A0G = AnonymousClass3Ma.A0G(this);
        C72463Mc.A0S(this, A0G).A0W(true);
        C18070vi.A0b(A0G);
        C29681ch A012 = C29681ch.A03.A01(C72453Mb.A0u(this));
        if (A012 != null) {
            AnonymousClass1M9 r0 = this.A04;
            if (r0 != null) {
                this.A09 = r0.A0H(A012);
                StringBuilder A11 = AnonymousClass000.A11(AnonymousClass11S.A01(this.A02).user);
                A11.append('-');
                String A0y = AnonymousClass000.A0y(AnonymousClass8BV.A0s(C108985cd.A0f(), "-"), A11);
                C18070vi.A0d(A0y, 0);
                C29681ch A032 = C29681ch.A02.A03(A0y, "newsletter");
                C18070vi.A0X(A032);
                A032.A00 = true;
                AnonymousClass1E7 r2 = new AnonymousClass1E7(A032);
                C46162Dk A033 = A03(this);
                if (!(A033 == null || (str3 = A033.A0T) == null)) {
                    r2.A0R = str3;
                }
                this.A04 = r2;
                C46162Dk A034 = A03(this);
                if (A034 != null) {
                    C27201Vd r22 = this.A01;
                    if (r22 != null) {
                        this.A0A = r22.A06(this, "newsletter-profile-pic-activity");
                        boolean A1W = AnonymousClass000.A1W(A034.A0V);
                        this.A0C = A1W;
                        C56432hS r23 = this.A00;
                        if (r23 != null) {
                            this.A0B = r23.A00(A1W);
                            C17890vO.A0v(this.A05, this, 3);
                            AnonymousClass1NM r5 = this.A07;
                            if (r5 != null) {
                                AnonymousClass00H r24 = this.A0C;
                                if (r24 != null) {
                                    if (r5.A04(new AQY(this, new Object(), (C139956zi) C18070vi.A0E(r24)))) {
                                        C27001Ui r3 = this.A06;
                                        if (r3 != null) {
                                            r3.A03(AnonymousClass1E7.A00(A4b()), "ViewNewsletterProfilePhoto.onCreate_A", A4b().A07, 1, false);
                                            C46162Dk A035 = A03(this);
                                            if (A035 == null || (str2 = A035.A0V) == null || str2.length() == 0) {
                                                this.A0F.sendEmptyMessageDelayed(0, 32000);
                                            }
                                        } else {
                                            str = "profilePhotoManager";
                                        }
                                    }
                                    C27191Vc r52 = this.A02;
                                    if (r52 != null) {
                                        A4c(r52.A04(this, A4b(), "ViewNewsletterProfilePhoto.onCreate_B", getResources().getDimension(2131167227), getResources().getDimensionPixelSize(2131167227), true));
                                        A0V(this, getIntent().getBooleanExtra("open_pic_selection_sheet", false));
                                        if (!this.A0C) {
                                            PhotoView photoView2 = this.A0B;
                                            if (photoView2 != null) {
                                                Drawable A003 = C40501uo.A00(getTheme(), getResources(), 2131231057);
                                                C18070vi.A0z(A003, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                                                photoView2.A0B((BitmapDrawable) A003);
                                            }
                                            str = "pictureView";
                                        }
                                        String stringExtra = getIntent().getStringExtra("circular_return_name");
                                        if (stringExtra == null) {
                                            stringExtra = new AnonymousClass4ZR(this).A02(2131899529);
                                        }
                                        C18070vi.A0b(stringExtra);
                                        boolean z = AnonymousClass745.A00;
                                        A4d(z, stringExtra);
                                        View A0H = AnonymousClass3MY.A0H(this, 2131434744);
                                        View A0H2 = AnonymousClass3MY.A0H(this, 2131429510);
                                        PhotoView photoView3 = this.A0B;
                                        if (photoView3 != null) {
                                            C26083Cry.A01(A0H, A0H2, A0G, this, photoView3, A002, z);
                                            return;
                                        }
                                        str = "pictureView";
                                    } else {
                                        str = "contactPhotosBitmapManager";
                                    }
                                } else {
                                    str = "mediaUI";
                                }
                            } else {
                                str = "mediaStateManager";
                            }
                        } else {
                            str = "photoUpdateFactory";
                        }
                    } else {
                        str = "contactPhotos";
                    }
                }
            } else {
                str = "contactManager";
            }
            C18070vi.A11(str);
            throw null;
        }
        finish();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IOException iOException;
        C18070vi.A0d(menuItem, 0);
        int itemId = menuItem.getItemId();
        if (itemId == 2131432585) {
            A0Q();
            return true;
        } else if (itemId == 1) {
            File A0a = this.A04.A0a("photo.jpg");
            try {
                C24791Lr r1 = this.A06;
                if (r1 != null) {
                    File A002 = r1.A00(A4b());
                    if (A002 != null) {
                        C64062u9.A00(C108945cZ.A18(A002), C108945cZ.A19(A0a));
                        Uri A022 = C64062u9.A02(this, A0a);
                        C18070vi.A0X(A022);
                        C24771Lp r0 = this.A03;
                        if (r0 != null) {
                            r0.A05().A0E(A022.toString());
                            C24921Me r12 = this.A05;
                            if (r12 != null) {
                                String A0I = r12.A0I(A4b());
                                Intent[] intentArr = new Intent[2];
                                intentArr[0] = C108945cZ.A0G("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", A022);
                                Intent A012 = AnonymousClass4aU.A01((IntentSender) null, (CharSequence) null, C18070vi.A0O(C17880vN.A0A().setClassName(this, "com.whatsapp.profile.ViewProfilePhoto$SavePhoto").putExtra("android.intent.extra.STREAM", Uri.fromFile(A0a)).putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A0I), intentArr, 1));
                                C18070vi.A0X(A012);
                                startActivity(A012);
                                return true;
                            }
                            C18070vi.A11("waContactNames");
                        } else {
                            C18070vi.A11("caches");
                        }
                    } else {
                        iOException = C17880vN.A0f("File cannot be read");
                        throw iOException;
                    }
                } else {
                    C18070vi.A11("contactPhotoHelper");
                }
                iOException = null;
                throw iOException;
            } catch (IOException e) {
                Log.e((Throwable) e);
                this.A05.A08(2131894542, 1);
                return true;
            }
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            AnonymousClass4FQ.A00(this);
            return true;
        }
    }

    public ViewNewsletterProfilePhoto(int i) {
        this.A0D = false;
        AGC.A00(this, 5);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0F.removeMessages(0);
    }

    public void onResume() {
        super.onResume();
        if (!this.A0E && AnonymousClass3MY.A1a(getIntent(), "open_pic_selection_sheet")) {
            this.A0E = true;
            A0Q();
        }
    }

    public ViewNewsletterProfilePhoto() {
        this(0);
        this.A0F = new C161268Cm(Looper.getMainLooper(), this, 2);
        this.A09 = AnonymousClass00R.A00;
    }
}
