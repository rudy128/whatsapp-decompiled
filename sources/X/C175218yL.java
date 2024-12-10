package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.InputFilter;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.WaEditText;
import com.whatsapp.newsletter.ui.NewsletterCreationActivity;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.io.File;

/* renamed from: X.8yL  reason: invalid class name and case insensitive filesystem */
public abstract class C175218yL extends AnonymousClass8e2 {
    public C182529Us A00;
    public C182539Ut A01;
    public C56432hS A02;
    public WaEditText A03;
    public WaEditText A04;
    public C24791Lr A05;
    public C27191Vc A06;
    public AnonymousClass1CJ A07;
    public AnonymousClass1E7 A08;
    public AnonymousClass1VU A09;
    public C29681ch A0A;
    public C35681md A0B;
    public C48292Lx A0C;
    public C18010vc A0D;
    public C26521Sl A0E;
    public WDSButton A0F;
    public WDSProfilePhoto A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public Integer A0K;
    public String A0L;
    public String A0M;

    public static void A0Q(C003401n r1) {
        r1.A0Y(true);
        r1.A0W(true);
    }

    public void A4l() {
        String str;
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168470);
        C27191Vc r1 = this.A06;
        if (r1 != null) {
            AnonymousClass1E7 r3 = this.A08;
            if (r3 == null) {
                str = "tempContact";
            } else {
                Bitmap A042 = r1.A04(this, r3, "BaseEditCreateNewsletterActivity.handleCroppedProfilePic", 0.0f, dimensionPixelSize, false);
                if (A042 != null) {
                    WDSProfilePhoto A4e = A4e();
                    AnonymousClass1VU r32 = this.A09;
                    if (r32 != null) {
                        A4e.setImageDrawable(r32.A01(getResources(), A042, new C65492wa(2)));
                        return;
                    }
                    str = "pathDrawableHelper";
                } else {
                    return;
                }
            }
        } else {
            str = "contactBitmapManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A4m() {
        String str;
        C48292Lx r1 = this.A0C;
        if (r1 != null) {
            AnonymousClass1E7 r0 = this.A08;
            if (r0 != null) {
                r1.A02(r0).delete();
                int dimensionPixelSize = getResources().getDimensionPixelSize(2131168470);
                C27191Vc r4 = this.A06;
                if (r4 != null) {
                    AnonymousClass1E7 r6 = this.A08;
                    if (r6 != null) {
                        Bitmap A042 = r4.A04(this, r6, "BaseEditCreateNewsletterActivity.handleNoCropProfilePic", 0.0f, dimensionPixelSize, false);
                        if (A042 != null) {
                            WDSProfilePhoto A4e = A4e();
                            AnonymousClass1VU r2 = this.A09;
                            if (r2 != null) {
                                A4e.setImageDrawable(r2.A01(getResources(), A042, new C65492wa(0)));
                                return;
                            }
                            str = "pathDrawableHelper";
                        } else {
                            return;
                        }
                    }
                } else {
                    str = "contactBitmapManager";
                }
            }
            C18070vi.A11("tempContact");
            throw null;
        }
        str = "photoUpdater";
        C18070vi.A11(str);
        throw null;
    }

    public static void A0c(AnonymousClass10E r1, C175208yK r2) {
        r2.A0D = (C18010vc) r1.A9s.get();
        r2.A02 = (C27201Vd) r1.A2j.get();
        r2.A00 = C19890zB.A00;
        r2.A01 = (AnonymousClass1PM) r1.ABM.get();
        r2.A03 = C000200d.A00(r1.ABd);
    }

    public final WaEditText A4b() {
        WaEditText waEditText = this.A03;
        if (waEditText != null) {
            return waEditText;
        }
        C18070vi.A11("descriptionEditText");
        throw null;
    }

    public final WaEditText A4c() {
        WaEditText waEditText = this.A04;
        if (waEditText != null) {
            return waEditText;
        }
        C18070vi.A11("nameEditText");
        throw null;
    }

    public final C46162Dk A4d() {
        C29681ch r1 = this.A0A;
        if (r1 != null) {
            AnonymousClass1CJ r0 = this.A07;
            if (r0 != null) {
                C29691ci A002 = AnonymousClass1CJ.A00(r0, r1);
                if (A002 instanceof C46162Dk) {
                    return (C46162Dk) A002;
                }
            } else {
                C18070vi.A11("chatsCache");
                throw null;
            }
        }
        return null;
    }

    public final WDSProfilePhoto A4e() {
        WDSProfilePhoto wDSProfilePhoto = this.A0G;
        if (wDSProfilePhoto != null) {
            return wDSProfilePhoto;
        }
        C18070vi.A11(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
        throw null;
    }

    public File A4f() {
        Uri fromFile;
        String str;
        C24791Lr r1 = this.A05;
        if (r1 != null) {
            AnonymousClass1E7 r0 = this.A08;
            if (r0 == null) {
                str = "tempContact";
            } else {
                File A002 = r1.A00(r0);
                if (A002 == null || !A002.exists() || (fromFile = Uri.fromFile(A002)) == null) {
                    return null;
                }
                C26521Sl r12 = this.A0E;
                if (r12 != null) {
                    return r12.A0j(fromFile, false);
                }
                str = "mediaFileUtils";
            }
            C18070vi.A11(str);
            throw null;
        }
        C18070vi.A11("contactPhotoHelper");
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.whatsapp.newsletter.ui.NewsletterEditActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.8yK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.whatsapp.newsletter.ui.NewsletterEditActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: X.8yK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: com.whatsapp.newsletter.ui.NewsletterEditActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: com.whatsapp.newsletter.ui.NewsletterEditActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: com.whatsapp.newsletter.ui.NewsletterEditActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: com.whatsapp.newsletter.ui.NewsletterEditActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: com.whatsapp.newsletter.ui.NewsletterEditActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4i() {
        /*
            r12 = this;
            boolean r0 = r12 instanceof com.whatsapp.newsletter.ui.mv.NewsletterUpgradeToMVActivity
            if (r0 == 0) goto L_0x008b
            r2 = r12
            X.8yK r2 = (X.C175208yK) r2
            X.00H r0 = r2.A0H
            if (r0 == 0) goto L_0x02fe
            X.1OZ r0 = X.C17880vN.A0U(r0)
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x0019
            r2.A4p()
        L_0x0018:
            return
        L_0x0019:
            com.whatsapp.WaEditText r0 = r2.A4b()
            java.lang.String r0 = X.AnonymousClass3MZ.A17(r0)
            java.lang.String r7 = X.AnonymousClass1YF.A0I(r0)
            boolean r0 = X.AnonymousClass1YF.A0T(r7)
            if (r0 == 0) goto L_0x002c
            r7 = 0
        L_0x002c:
            java.io.File r0 = r2.A4f()
            if (r0 == 0) goto L_0x0089
            byte[] r8 = X.C64062u9.A0W(r0)
        L_0x0036:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r2.A04
            if (r0 == 0) goto L_0x02e7
            r1.append(r0)
            java.lang.String r0 = r2.A4h()
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.CharSequence r0 = X.AnonymousClass1YF.A0H(r0)
            java.lang.String r6 = r0.toString()
            X.1ch r4 = r2.A0A
            if (r4 == 0) goto L_0x0018
            r0 = 2131892586(0x7f12196a, float:1.9419924E38)
            r2.CNA(r0)
            X.1md r3 = r2.A0B
            if (r3 == 0) goto L_0x02f7
            r0 = 6
            X.AWT r5 = new X.AWT
            r5.<init>(r2, r0)
            X.00H r2 = r3.A0P
            boolean r0 = X.C72453Mb.A1X(r2)
            if (r0 == 0) goto L_0x0018
            X.1CJ r1 = r3.A0E
            java.lang.Object r0 = X.C18070vi.A0E(r2)
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            boolean r0 = X.AnonymousClass4aS.A08(r1, r4, r0)
            if (r0 == 0) goto L_0x0018
            X.1mj r2 = r3.A05
            if (r2 == 0) goto L_0x0301
            X.9IW r3 = X.AnonymousClass9IW.VERIFIED
            X.8y8 r0 = r2.A00(r3, r4, r5, r6, r7, r8)
            r0.A01()
            return
        L_0x0089:
            r8 = 0
            goto L_0x0036
        L_0x008b:
            boolean r0 = r12 instanceof com.whatsapp.newsletter.ui.mv.NewsletterEditMVActivity
            if (r0 == 0) goto L_0x011c
            r1 = r12
            X.8yK r1 = (X.C175208yK) r1
            X.00H r0 = r1.A0H
            if (r0 == 0) goto L_0x02fe
            X.1OZ r0 = X.C17880vN.A0U(r0)
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x02f0
            r1.A4q()
            com.whatsapp.WaEditText r0 = r1.A4b()
            java.lang.String r0 = X.AnonymousClass3MZ.A17(r0)
            java.lang.String r8 = X.AnonymousClass1YF.A0I(r0)
            boolean r0 = X.AnonymousClass1YF.A0T(r8)
            r3 = 0
            if (r0 == 0) goto L_0x00b7
            r8 = r3
        L_0x00b7:
            java.io.File r0 = r1.A4f()
            if (r0 == 0) goto L_0x011a
            byte[] r9 = X.C64062u9.A0W(r0)
        L_0x00c1:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = r1.A04
            if (r0 == 0) goto L_0x02de
            r2.append(r0)
            java.lang.String r0 = r1.A4h()
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)
            java.lang.CharSequence r0 = X.AnonymousClass1YF.A0H(r0)
            java.lang.String r7 = r0.toString()
            X.1ch r5 = r1.A0A
            if (r5 == 0) goto L_0x0018
            r0 = 2131892586(0x7f12196a, float:1.9419924E38)
            r1.CNA(r0)
            X.2Dk r0 = r1.A4d()
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = r0.A0Q
        L_0x00ee:
            boolean r10 = X.AnonymousClass8BR.A1T(r8, r0)
            X.2Dk r0 = r1.A4d()
            if (r0 == 0) goto L_0x0116
            java.lang.String r0 = r0.A0T
        L_0x00fa:
            boolean r0 = X.AnonymousClass8BR.A1T(r7, r0)
            X.1md r4 = r1.A0B
            if (r4 == 0) goto L_0x02d8
            if (r10 != 0) goto L_0x0105
            r8 = r3
        L_0x0105:
            boolean r11 = X.AnonymousClass000.A1W(r9)
            if (r0 != 0) goto L_0x010c
            r7 = r3
        L_0x010c:
            r0 = 5
        L_0x010d:
            X.AWT r6 = new X.AWT
            r6.<init>(r1, r0)
            r4.A0C(r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0116:
            r0 = r3
            goto L_0x00fa
        L_0x0118:
            r0 = r3
            goto L_0x00ee
        L_0x011a:
            r9 = 0
            goto L_0x00c1
        L_0x011c:
            boolean r0 = r12 instanceof com.whatsapp.newsletter.ui.mv.NewsletterCreateMVActivity
            if (r0 == 0) goto L_0x01a7
            r1 = r12
            X.8yK r1 = (X.C175208yK) r1
            X.00H r0 = r1.A0H
            if (r0 == 0) goto L_0x02fe
            X.1OZ r0 = X.C17880vN.A0U(r0)
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x02f0
            r1.A4q()
            r0 = 2131889111(0x7f120bd7, float:1.9412876E38)
            r1.CNA(r0)
            X.1md r3 = r1.A0B
            if (r3 == 0) goto L_0x02f7
            com.whatsapp.WaEditText r0 = r1.A4b()
            java.lang.String r0 = X.AnonymousClass3MZ.A17(r0)
            java.lang.String r8 = X.AnonymousClass1YF.A0I(r0)
            boolean r0 = X.AnonymousClass1YF.A0T(r8)
            if (r0 == 0) goto L_0x0151
            r8 = 0
        L_0x0151:
            r0 = 4
            X.AWT r4 = new X.AWT
            r4.<init>(r1, r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = r1.A04
            if (r0 == 0) goto L_0x02e7
            r2.append(r0)
            java.lang.String r0 = r1.A4h()
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)
            java.lang.CharSequence r0 = X.AnonymousClass1YF.A0H(r0)
            java.lang.String r9 = r0.toString()
            java.io.File r0 = r1.A4f()
            if (r0 == 0) goto L_0x01a5
            byte[] r10 = X.C64062u9.A0W(r0)
        L_0x017c:
            X.1mg r0 = r3.A02
            if (r0 == 0) goto L_0x02e4
            X.10F r0 = r0.A00
            X.10E r1 = r0.A00
            X.10I r7 = X.AnonymousClass10E.AL1(r1)
            X.1PY r3 = X.AnonymousClass3Ma.A0l(r1)
            X.00S r0 = r1.A7S
            java.lang.Object r5 = r0.get()
            X.5Y9 r5 = (X.AnonymousClass5Y9) r5
            X.1i5 r2 = X.AnonymousClass8BU.A0G(r1)
            X.A8r r6 = X.AnonymousClass8BT.A0P(r1)
            X.8y2 r1 = new X.8y2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x01a1:
            r1.A01()
            return
        L_0x01a5:
            r10 = 0
            goto L_0x017c
        L_0x01a7:
            boolean r0 = r12 instanceof com.whatsapp.newsletter.ui.NewsletterEditDescriptionActivity
            if (r0 == 0) goto L_0x0200
            X.00H r0 = r12.A0H
            if (r0 == 0) goto L_0x02fe
            X.1OZ r0 = X.C17880vN.A0U(r0)
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x02fa
            r12.A4q()
            java.lang.String r5 = r12.A4g()
            java.lang.String r4 = r12.A4h()
            X.1ch r2 = r12.A0A
            if (r2 == 0) goto L_0x0018
            r0 = 2131897384(0x7f122c28, float:1.9429656E38)
            r12.CNA(r0)
            X.2Dk r0 = r12.A4d()
            r6 = 0
            if (r0 == 0) goto L_0x01fe
            java.lang.String r0 = r0.A0Q
        L_0x01d7:
            boolean r7 = X.AnonymousClass8BR.A1T(r5, r0)
            X.1md r1 = r12.A0B
            if (r1 == 0) goto L_0x02ea
            X.2Dk r0 = r12.A4d()
            if (r0 == 0) goto L_0x01fc
            java.lang.String r0 = r0.A0T
        L_0x01e7:
            boolean r0 = X.C18070vi.A18(r4, r0)
            if (r0 == 0) goto L_0x01ee
            r4 = r6
        L_0x01ee:
            if (r7 != 0) goto L_0x01f1
            r5 = r6
        L_0x01f1:
            r0 = 3
            X.AWT r3 = new X.AWT
            r3.<init>(r12, r0)
            r8 = 0
            r1.A0C(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x01fc:
            r0 = r6
            goto L_0x01e7
        L_0x01fe:
            r0 = r6
            goto L_0x01d7
        L_0x0200:
            boolean r0 = r12 instanceof com.whatsapp.newsletter.ui.NewsletterEditActivity
            if (r0 == 0) goto L_0x0270
            r1 = r12
            com.whatsapp.newsletter.ui.NewsletterEditActivity r1 = (com.whatsapp.newsletter.ui.NewsletterEditActivity) r1
            X.00H r0 = r1.A0H
            if (r0 == 0) goto L_0x02fe
            X.1OZ r0 = X.C17880vN.A0U(r0)
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x02f0
            r1.A4q()
            X.1ch r5 = r1.A0A
            if (r5 == 0) goto L_0x0018
            r0 = 2131897384(0x7f122c28, float:1.9429656E38)
            r1.CNA(r0)
            java.lang.String r8 = r1.A4g()
            java.lang.String r7 = r1.A4h()
            java.io.File r0 = r1.A4f()
            if (r0 == 0) goto L_0x026e
            byte[] r9 = X.C64062u9.A0W(r0)
        L_0x0234:
            X.9I0 r2 = r1.A02
            X.9I0 r0 = X.AnonymousClass9I0.UNCHANGED
            boolean r11 = X.AnonymousClass3Ma.A1Z(r2, r0)
            java.lang.String r2 = r1.A4h()
            X.2Dk r0 = r1.A4d()
            if (r0 == 0) goto L_0x026c
            java.lang.String r0 = r0.A0T
        L_0x0248:
            boolean r3 = X.AnonymousClass8BR.A1T(r2, r0)
            java.lang.String r2 = r1.A4g()
            X.2Dk r0 = r1.A4d()
            if (r0 == 0) goto L_0x026a
            java.lang.String r0 = r0.A0Q
        L_0x0258:
            boolean r10 = X.AnonymousClass8BR.A1T(r2, r0)
            X.1md r4 = r1.A0B
            if (r4 == 0) goto L_0x02f7
            r0 = 0
            if (r3 != 0) goto L_0x0264
            r7 = r0
        L_0x0264:
            if (r10 != 0) goto L_0x0267
            r8 = r0
        L_0x0267:
            r0 = 2
            goto L_0x010d
        L_0x026a:
            r0 = 0
            goto L_0x0258
        L_0x026c:
            r0 = 0
            goto L_0x0248
        L_0x026e:
            r9 = 0
            goto L_0x0234
        L_0x0270:
            X.00H r0 = r12.A0H
            if (r0 == 0) goto L_0x02fe
            X.1OZ r0 = X.C17880vN.A0U(r0)
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x02fa
            r12.A4q()
            r0 = 2131889111(0x7f120bd7, float:1.9412876E38)
            r12.CNA(r0)
            X.1md r1 = r12.A0B
            if (r1 == 0) goto L_0x02f7
            java.lang.String r8 = r12.A4h()
            java.lang.String r9 = r12.A4g()
            java.io.File r0 = r12.A4f()
            if (r0 == 0) goto L_0x02d6
            byte[] r10 = X.C64062u9.A0W(r0)
        L_0x029d:
            r0 = 1
            X.AWT r4 = new X.AWT
            r4.<init>(r12, r0)
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.00H r0 = r1.A0P
            boolean r0 = X.C72453Mb.A1X(r0)
            if (r0 == 0) goto L_0x0018
            X.1mf r0 = r1.A01
            if (r0 == 0) goto L_0x02f4
            X.10F r0 = r0.A00
            X.10E r1 = r0.A00
            X.10I r7 = X.AnonymousClass10E.AL1(r1)
            X.1PY r3 = X.AnonymousClass3Ma.A0l(r1)
            X.00S r0 = r1.A7S
            java.lang.Object r5 = r0.get()
            X.5Y9 r5 = (X.AnonymousClass5Y9) r5
            X.1i5 r2 = X.AnonymousClass8BU.A0G(r1)
            X.A8r r6 = X.AnonymousClass8BT.A0P(r1)
            X.8y7 r1 = new X.8y7
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x01a1
        L_0x02d6:
            r10 = 0
            goto L_0x029d
        L_0x02d8:
            java.lang.String r0 = "newsletterManager"
            X.C18070vi.A11(r0)
            throw r3
        L_0x02de:
            java.lang.String r0 = "prefixText"
            X.C18070vi.A11(r0)
            throw r3
        L_0x02e4:
            java.lang.String r0 = "createVerifiedNewsletterGraphQlHandler"
            goto L_0x0303
        L_0x02e7:
            java.lang.String r0 = "prefixText"
            goto L_0x0303
        L_0x02ea:
            java.lang.String r0 = "newsletterManager"
            X.C18070vi.A11(r0)
            throw r6
        L_0x02f0:
            r1.A4p()
            return
        L_0x02f4:
            java.lang.String r0 = "createNewsletterGraphQlHandler"
            goto L_0x0303
        L_0x02f7:
            java.lang.String r0 = "newsletterManager"
            goto L_0x0303
        L_0x02fa:
            r12.A4p()
            return
        L_0x02fe:
            java.lang.String r0 = "messageClient"
            goto L_0x0303
        L_0x0301:
            java.lang.String r0 = "newsletterUpdateVerifiedStatusGraphqlHandler"
        L_0x0303:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175218yL.A4i():void");
    }

    public void A4k() {
        WDSButton wDSButton = this.A0F;
        if (wDSButton != null) {
            AnonymousClass3Ma.A1D(wDSButton, this, 21);
        } else {
            C18070vi.A11("saveButton");
            throw null;
        }
    }

    public void A4n() {
        String str;
        C24791Lr r1 = this.A05;
        if (r1 != null) {
            AnonymousClass1E7 r0 = this.A08;
            if (r0 == null) {
                str = "tempContact";
            } else {
                File A002 = r1.A00(r0);
                if (A002 != null) {
                    A002.delete();
                }
                WDSProfilePhoto A4e = A4e();
                AnonymousClass1VU r5 = this.A09;
                if (r5 != null) {
                    A4e.setImageDrawable(AnonymousClass1VU.A00(getTheme(), getResources(), new C65492wa(1), r5.A00, 2131231057));
                    return;
                }
                str = "pathDrawableHelper";
            }
        } else {
            str = "contactPhotoHelper";
        }
        C18070vi.A11(str);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A4q() {
        /*
            r3 = this;
            r0 = 12
            r3.A4r(r0)
            com.whatsapp.WaEditText r0 = r3.A4c()
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = r3.A0M
            if (r1 != 0) goto L_0x001a
            java.lang.String r0 = "tempNameText"
        L_0x0015:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x001a:
            com.whatsapp.WaEditText r0 = r3.A4c()
            java.lang.String r0 = X.AnonymousClass3MZ.A17(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002a
            r0 = 6
            goto L_0x004b
        L_0x002a:
            com.whatsapp.WaEditText r0 = r3.A4b()
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x004e
            java.lang.String r1 = r3.A0L
            if (r1 != 0) goto L_0x003b
            java.lang.String r0 = "tempDescriptionText"
            goto L_0x0015
        L_0x003b:
            com.whatsapp.WaEditText r0 = r3.A4b()
            java.lang.String r0 = X.AnonymousClass3MZ.A17(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x004e
            r0 = 11
        L_0x004b:
            r3.A4r(r0)
        L_0x004e:
            X.00H r0 = r3.A0J
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r0.get()
            X.A6Q r0 = (X.A6Q) r0
            java.lang.Integer r1 = r3.A0K
            if (r1 == 0) goto L_0x006f
            java.util.Map r0 = r0.A00
            java.lang.Object r2 = r0.get(r1)
            X.19a r2 = (X.C222119a) r2
            if (r2 == 0) goto L_0x006f
            int r1 = r1.intValue()
            java.lang.String r0 = "network_request"
            r2.A03(r1, r0)
        L_0x006f:
            return
        L_0x0070:
            java.lang.String r0 = "newsletterPerfTracker"
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175218yL.A4q():void");
    }

    public void A4r(int i) {
        if (!(this instanceof C175208yK)) {
            AnonymousClass00H r0 = this.A0I;
            if (r0 != null) {
                ((AnonymousClass74D) r0.get()).A0A(i, this instanceof NewsletterCreationActivity);
            } else {
                C18070vi.A11("newsletterLogging");
                throw null;
            }
        }
    }

    public final void A4s(boolean z) {
        String str;
        AnonymousClass00H r0 = this.A0I;
        if (r0 != null) {
            ((AnonymousClass74D) r0.get()).A0A(14, z);
            Integer num = this.A0K;
            if (num != null) {
                int intValue = num.intValue();
                AnonymousClass00H r02 = this.A0J;
                if (r02 != null) {
                    A6Q.A02((A6Q) r02.get(), Integer.valueOf(intValue), 3);
                    return;
                }
                str = "newsletterPerfTracker";
            } else {
                return;
            }
        } else {
            str = "newsletterLogging";
        }
        C18070vi.A11(str);
        throw null;
    }

    public final void A4t(boolean z) {
        String str;
        AnonymousClass00H r0 = this.A0I;
        if (r0 != null) {
            ((AnonymousClass74D) r0.get()).A0A(13, z);
            Integer num = this.A0K;
            if (num != null) {
                int intValue = num.intValue();
                AnonymousClass00H r02 = this.A0J;
                if (r02 != null) {
                    A6Q.A02((A6Q) r02.get(), Integer.valueOf(intValue), 2);
                    return;
                }
                str = "newsletterPerfTracker";
            } else {
                return;
            }
        } else {
            str = "newsletterLogging";
        }
        C18070vi.A11(str);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0069, code lost:
        if (r1 != 2) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r10, int r11, android.content.Intent r12) {
        /*
            r9 = this;
            r0 = 2001(0x7d1, float:2.804E-42)
            r2 = -1
            r5 = r9
            r4 = r12
            if (r10 == r0) goto L_0x0030
            r0 = 2002(0x7d2, float:2.805E-42)
            if (r10 == r0) goto L_0x0013
            android.content.Intent r0 = r9.getIntent()
            super.onActivityResult(r10, r11, r0)
        L_0x0012:
            return
        L_0x0013:
            X.2Lx r1 = r9.A0C
            if (r1 == 0) goto L_0x008d
            X.1E7 r0 = r9.A08
            if (r0 == 0) goto L_0x0090
            java.io.File r0 = r1.A02(r0)
            r0.delete()
            if (r11 == r2) goto L_0x006e
            if (r11 != 0) goto L_0x0012
            if (r12 == 0) goto L_0x0012
            X.2Lx r0 = r9.A0C
            if (r0 == 0) goto L_0x008d
            r0.A03(r12, r9)
            return
        L_0x0030:
            if (r11 != r2) goto L_0x0012
            if (r12 == 0) goto L_0x007e
            r0 = 0
            java.lang.String r3 = "is_reset"
            boolean r0 = r12.getBooleanExtra(r3, r0)
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "emojiEditorImageResult"
            boolean r0 = r12.hasExtra(r0)
            if (r0 == 0) goto L_0x0055
            r2 = 9
        L_0x0047:
            r9.A4r(r2)
        L_0x004a:
            r1 = 0
            boolean r0 = r12.getBooleanExtra(r3, r1)
            if (r0 == 0) goto L_0x0072
            r9.A4n()
            return
        L_0x0055:
            java.lang.String r1 = "photo_source"
            boolean r0 = r12.hasExtra(r1)
            if (r0 == 0) goto L_0x006b
            r0 = 0
            int r1 = r12.getIntExtra(r1, r0)
            r0 = 1
            r2 = 7
            if (r1 == r0) goto L_0x0047
            r0 = 2
            r2 = 8
            if (r1 == r0) goto L_0x0047
        L_0x006b:
            r2 = 10
            goto L_0x0047
        L_0x006e:
            r9.A4l()
            return
        L_0x0072:
            java.lang.String r0 = "skip_cropping"
            boolean r0 = r12.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x007e
            r9.A4m()
            return
        L_0x007e:
            X.2Lx r3 = r9.A0C
            if (r3 == 0) goto L_0x008d
            X.1E7 r7 = r9.A08
            if (r7 == 0) goto L_0x0090
            r8 = 2002(0x7d2, float:2.805E-42)
            r6 = r9
            r3.A05(r4, r5, r6, r7, r8)
            return
        L_0x008d:
            java.lang.String r0 = "photoUpdater"
            goto L_0x0092
        L_0x0090:
            java.lang.String r0 = "tempContact"
        L_0x0092:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175218yL.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        AnonymousClass00H r0 = this.A0J;
        if (r0 != null) {
            A6Q.A02((A6Q) r0.get(), this.A0K, 105);
            super.onBackPressed();
            return;
        }
        C18070vi.A11("newsletterPerfTracker");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r0 = r16
            super.onCreate(r0)
            X.25J r1 = X.C29681ch.A03
            java.lang.String r0 = X.C72453Mb.A0u(r15)
            X.1ch r0 = r1.A01(r0)
            r15.A0A = r0
            android.content.Intent r1 = r15.getIntent()
            X.C18070vi.A0X(r1)
            java.lang.String r0 = "log_instance_key"
            r2 = -1
            int r1 = r1.getIntExtra(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r1 != r2) goto L_0x0026
            r0 = 0
        L_0x0026:
            r15.A0K = r0
            boolean r0 = r15 instanceof X.C175208yK
            if (r0 == 0) goto L_0x01bf
            r0 = 2131624083(0x7f0e0093, float:1.8875336E38)
        L_0x002f:
            r15.setContentView((int) r0)
            X.11S r0 = r15.A02
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A01(r0)
            java.lang.String r0 = r0.user
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r0)
            r0 = 45
            r2.append(r0)
            java.lang.String r1 = X.C108985cd.A0f()
            java.lang.String r0 = "-"
            java.lang.String r0 = X.AnonymousClass8BV.A0s(r1, r0)
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r2)
            java.lang.String r1 = "newsletter"
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.1Du r0 = X.C29681ch.A02
            X.1ch r2 = r0.A03(r2, r1)
            X.C18070vi.A0X(r2)
            r0 = 1
            r2.A00 = r0
            X.1E7 r1 = new X.1E7
            r1.<init>(r2)
            r0 = 2131889090(0x7f120bc2, float:1.9412834E38)
            java.lang.String r0 = r15.getString(r0)
            r1.A0R = r0
            r15.A08 = r1
            r0 = 2131431496(0x7f0b1048, float:1.8484723E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r15, r0)
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r0
            r2 = 0
            X.C18070vi.A0d(r0, r2)
            r15.A0G = r0
            r0 = 2131433058(0x7f0b1662, float:1.848789E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r15, r0)
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
            X.C18070vi.A0d(r0, r2)
            r15.A04 = r0
            r0 = 2131432997(0x7f0b1625, float:1.8487767E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r15, r0)
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
            X.C18070vi.A0d(r0, r2)
            r15.A03 = r0
            r0 = 2131433082(0x7f0b167a, float:1.848794E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r15, r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            X.C18070vi.A0d(r0, r2)
            r15.A0F = r0
            androidx.appcompat.widget.Toolbar r0 = X.AnonymousClass3Ma.A0G(r15)
            r15.setSupportActionBar(r0)
            boolean r0 = r15 instanceof com.whatsapp.newsletter.ui.mv.NewsletterUpgradeToMVActivity
            if (r0 == 0) goto L_0x016d
            X.01n r1 = r15.getSupportActionBar()
            if (r1 == 0) goto L_0x00c6
            A0Q(r1)
            r0 = 2131892736(0x7f121a00, float:1.9420229E38)
        L_0x00c3:
            r1.A0M(r0)
        L_0x00c6:
            r15.A4o()
            r15.A4j()
            r0 = 2131432912(0x7f0b15d0, float:1.8487595E38)
            android.view.View r1 = X.AnonymousClass3MY.A0C(r15, r0)
            com.google.android.material.textfield.TextInputLayout r1 = (com.google.android.material.textfield.TextInputLayout) r1
            r0 = 2131899264(0x7f123380, float:1.943347E38)
            java.lang.String r0 = r15.getString(r0)
            r1.setHint((java.lang.CharSequence) r0)
            r0 = 2131432997(0x7f0b1625, float:1.8487767E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r15, r0)
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
            X.C18070vi.A0d(r0, r2)
            r15.A03 = r0
            r0 = 2131429936(0x7f0b0a30, float:1.8481559E38)
            X.C72463Mc.A19(r15, r0)
            com.whatsapp.WaEditText r1 = r15.A4b()
            r0 = 2131892562(0x7f121952, float:1.9419876E38)
            r1.setHint(r0)
            r0 = 2131429934(0x7f0b0a2e, float:1.8481555E38)
            android.view.View r3 = X.C110885hR.A0A(r15, r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            X.C18070vi.A0z(r3, r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r13 = 0
            r3.setVisibility(r2)
            X.9Us r0 = r15.A00
            if (r0 == 0) goto L_0x01c7
            com.whatsapp.WaEditText r2 = r15.A4b()
            r10 = 2048(0x800, float:2.87E-42)
            r12 = 1
            X.1K2 r0 = r0.A00
            X.10E r0 = r0.A01
            X.0ve r8 = X.AnonymousClass10E.A8r(r0)
            X.1KW r7 = X.AnonymousClass3Ma.A0f(r0)
            X.11C r4 = X.AnonymousClass3Ma.A0a(r0)
            X.0vb r5 = X.AnonymousClass10E.A6Q(r0)
            X.0vc r9 = X.AnonymousClass3Ma.A0r(r0)
            X.10G r0 = r0.A00
            X.00S r0 = r0.A40
            java.lang.Object r6 = r0.get()
            X.1L2 r6 = (X.AnonymousClass1L2) r6
            X.48A r1 = new X.48A
            r11 = r10
            r14 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            com.whatsapp.WaEditText r0 = r15.A4b()
            r0.addTextChangedListener(r1)
            com.whatsapp.WaEditText r1 = r15.A4b()
            X.77f[] r0 = new X.C1418577f[r12]
            X.C72453Mb.A1H(r1, r0, r10, r13)
            com.whatsapp.WaEditText r1 = r15.A4b()
            r0 = 3
            X.AFX.A00(r1, r15, r0)
            r15.A4k()
            boolean r1 = r15.A4u()
            X.2hS r0 = r15.A02
            if (r0 == 0) goto L_0x01c4
            X.2Lx r0 = r0.A00(r1)
            r15.A0C = r0
            return
        L_0x016d:
            boolean r0 = r15 instanceof com.whatsapp.newsletter.ui.mv.NewsletterEditMVActivity
            if (r0 == 0) goto L_0x017f
            X.01n r1 = r15.getSupportActionBar()
            if (r1 == 0) goto L_0x00c6
            A0Q(r1)
            r0 = 2131892736(0x7f121a00, float:1.9420229E38)
            goto L_0x00c3
        L_0x017f:
            boolean r0 = r15 instanceof com.whatsapp.newsletter.ui.mv.NewsletterCreateMVActivity
            if (r0 == 0) goto L_0x0191
            X.01n r1 = r15.getSupportActionBar()
            if (r1 == 0) goto L_0x00c6
            A0Q(r1)
            r0 = 2131889087(0x7f120bbf, float:1.9412828E38)
            goto L_0x00c3
        L_0x0191:
            boolean r0 = r15 instanceof com.whatsapp.newsletter.ui.NewsletterEditDescriptionActivity
            if (r0 == 0) goto L_0x01a3
            X.01n r1 = r15.getSupportActionBar()
            if (r1 == 0) goto L_0x00c6
            A0Q(r1)
            r0 = 2131889634(0x7f120de2, float:1.9413937E38)
            goto L_0x00c3
        L_0x01a3:
            boolean r0 = r15 instanceof com.whatsapp.newsletter.ui.NewsletterEditActivity
            X.01n r1 = r15.getSupportActionBar()
            if (r0 == 0) goto L_0x01b5
            if (r1 == 0) goto L_0x00c6
            A0Q(r1)
            r0 = 2131889634(0x7f120de2, float:1.9413937E38)
            goto L_0x00c3
        L_0x01b5:
            if (r1 == 0) goto L_0x00c6
            A0Q(r1)
            r0 = 2131889090(0x7f120bc2, float:1.9412834E38)
            goto L_0x00c3
        L_0x01bf:
            r0 = 2131624084(0x7f0e0094, float:1.8875338E38)
            goto L_0x002f
        L_0x01c4:
            java.lang.String r0 = "photoUpdaterFactory"
            goto L_0x01c9
        L_0x01c7:
            java.lang.String r0 = "formattedTextWatcherFactory"
        L_0x01c9:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175218yL.onCreate(android.os.Bundle):void");
    }

    public static void A0V(AnonymousClass1K1 r1, AnonymousClass10E r2, C175218yL r3, C18140vp r4) {
        r3.A07 = (AnonymousClass1CJ) r4.get();
        r3.A06 = (C27191Vc) r2.A2i.get();
        r3.A05 = (C24791Lr) r2.A2h.get();
        r3.A00 = (C182529Us) r1.A31.get();
        r3.A01 = (C182539Ut) r1.A32.get();
        r3.A0E = (C26521Sl) r2.A69.get();
        r3.A0H = C000200d.A00(r2.A6N);
        r3.A0I = C000200d.A00(r2.A7M);
        r3.A0B = (C35681md) r2.A7N.get();
        r3.A0J = C000200d.A00(r2.A7R);
        r3.A09 = (AnonymousClass1VU) r2.A7y.get();
        r3.A02 = (C56432hS) r1.A33.get();
    }

    public final String A4g() {
        String A0I2 = AnonymousClass1YF.A0I(AnonymousClass3MZ.A17(A4b()));
        if (AnonymousClass1YF.A0T(A0I2)) {
            return null;
        }
        return A0I2;
    }

    public final String A4h() {
        return AnonymousClass1YF.A0I(AnonymousClass3MZ.A17(A4c()));
    }

    public void A4j() {
        String str;
        int i;
        WaEditText waEditText = (WaEditText) AnonymousClass3MY.A0C(this, 2131433058);
        C18070vi.A0d(waEditText, 0);
        this.A04 = waEditText;
        C72453Mb.A1H(A4c(), new InputFilter[1], 100, 0);
        TextView textView = (TextView) AnonymousClass3MY.A0C(this, 2131432905);
        WaEditText A4c = A4c();
        C182539Ut r4 = this.A01;
        if (r4 != null) {
            WaEditText A4c2 = A4c();
            if (this instanceof C175208yK) {
                String str2 = ((C175208yK) this).A04;
                if (str2 != null) {
                    i = Math.min(str2.length(), 100);
                } else {
                    str = "prefixText";
                }
            } else {
                i = 0;
            }
            int i2 = 100 - i;
            AnonymousClass10E r0 = r4.A00.A01;
            C18030ve A8r = AnonymousClass10E.A8r(r0);
            AnonymousClass1KW A0f = AnonymousClass3Ma.A0f(r0);
            A4c.addTextChangedListener(new AnonymousClass48A(A4c2, textView, AnonymousClass3Ma.A0a(r0), AnonymousClass10E.A6Q(r0), (AnonymousClass1L2) r0.A00.A40.get(), A0f, A8r, AnonymousClass3Ma.A0r(r0), i2, 0, false, false, false));
            AFX.A00(A4c(), this, 2);
            return;
        }
        str = "limitingTextFactory";
        C18070vi.A11(str);
        throw null;
    }

    public void A4o() {
        AnonymousClass3Ma.A19(A4e(), this, 9);
    }

    public final void A4p() {
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0E(2131888272);
        A002.A0D(2131888732);
        C20336AGs.A01(this, A002, 19, 2131897145);
        A002.A0e(this, new C20328AGk(4), 2131889490);
        AnonymousClass3MY.A1G(A002);
    }

    public boolean A4u() {
        File A4f = A4f();
        if (A4f != null) {
            return A4f.exists();
        }
        return false;
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass00H r0 = this.A0I;
        if (r0 != null) {
            AnonymousClass74D r2 = (AnonymousClass74D) r0.get();
            r2.A00 = 0;
            r2.A01 = 0;
            return;
        }
        C18070vi.A11("newsletterLogging");
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
