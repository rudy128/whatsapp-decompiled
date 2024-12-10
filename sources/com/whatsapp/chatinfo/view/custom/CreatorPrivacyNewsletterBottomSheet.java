package com.whatsapp.chatinfo.view.custom;

import X.AQC;
import X.AnonymousClass00H;
import X.AnonymousClass03S;
import X.AnonymousClass1CJ;
import X.AnonymousClass1E7;
import X.AnonymousClass1FL;
import X.AnonymousClass1FU;
import X.AnonymousClass3MW;
import X.C18070vi;
import X.C22891Dp;
import X.C27201Vd;
import X.C29681ch;
import X.C29691ci;
import X.C36401np;
import X.C37451pZ;
import X.C42971z2;
import X.C46162Dk;
import X.C62762rw;
import X.C72453Mb;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public class CreatorPrivacyNewsletterBottomSheet extends Hilt_CreatorPrivacyNewsletterBottomSheet {
    public WaImageView A00;
    public C37451pZ A01;
    public C27201Vd A02;
    public AnonymousClass1CJ A03;
    public C36401np A04;
    public AnonymousClass00H A05;

    public void A21(Bundle bundle, View view) {
        String str;
        C29681ch r0;
        String string;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        WaTextView waTextView = this.A04;
        if (waTextView != null) {
            waTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
        if (C22891Dp.A02) {
            C72453Mb.A1D(this.A04);
            WaImageView waImageView = this.A03;
            if (waImageView != null) {
                waImageView.setImageResource(2131232735);
            }
        } else {
            AnonymousClass1FL A1B = A1B();
            WaImageView waImageView2 = null;
            if ((A1B instanceof AnonymousClass1FU) && A1B != null) {
                C27201Vd r6 = this.A02;
                if (r6 != null) {
                    this.A01 = r6.A07(A1B, "newsletter-admin-privacy", A1B.getResources().getDimension(2131168737), C62762rw.A01(A1B, 24.0f));
                    WaImageView A0S = AnonymousClass3MW.A0S(view, 2131429433);
                    if (A0S != null) {
                        A0S.setVisibility(0);
                        AnonymousClass00H r02 = this.A05;
                        if (r02 != null) {
                            ((AQC) r02.get()).A00 = 2131231784;
                            A0S.setBackground(AnonymousClass03S.A01(A1B, 2131233688));
                            A0S.setClipToOutline(true);
                            C37451pZ r2 = this.A01;
                            if (r2 == null) {
                                str = "contactPhotoLoader";
                            } else {
                                Bundle bundle2 = this.A06;
                                if (bundle2 == null || (string = bundle2.getString("jid")) == null) {
                                    r0 = null;
                                } else {
                                    r0 = C29681ch.A03.A01(string);
                                }
                                AnonymousClass1E7 r1 = new AnonymousClass1E7(r0);
                                AnonymousClass00H r03 = this.A05;
                                if (r03 != null) {
                                    r2.A05(A0S, (C42971z2) r03.get(), r1, false);
                                    waImageView2 = A0S;
                                }
                            }
                        }
                        str = "contactPhotoDisplayer";
                    }
                    this.A00 = waImageView2;
                } else {
                    str = "contactPhotos";
                }
                C18070vi.A11(str);
                throw null;
            }
        }
        PhoneNumberHiddenInNewsletterBottomSheet.A02(this.A00, 2131232228);
        PhoneNumberHiddenInNewsletterBottomSheet.A02(this.A01, 2131232416);
        PhoneNumberHiddenInNewsletterBottomSheet.A02(this.A02, 2131233438);
    }

    public static final C46162Dk A00(CreatorPrivacyNewsletterBottomSheet creatorPrivacyNewsletterBottomSheet) {
        C29681ch r0;
        String string;
        AnonymousClass1CJ r2 = creatorPrivacyNewsletterBottomSheet.A03;
        if (r2 != null) {
            Bundle bundle = creatorPrivacyNewsletterBottomSheet.A06;
            if (bundle == null || (string = bundle.getString("jid")) == null) {
                r0 = null;
            } else {
                r0 = C29681ch.A03.A01(string);
            }
            C29691ci A0A = r2.A0A(r0);
            if (A0A instanceof C46162Dk) {
                return (C46162Dk) A0A;
            }
            return null;
        }
        C18070vi.A11("chatsCache");
        throw null;
    }

    public void A1s() {
        super.A1s();
        this.A00 = null;
    }
}
