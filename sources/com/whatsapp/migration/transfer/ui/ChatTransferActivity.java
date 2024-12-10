package com.whatsapp.migration.transfer.ui;

import X.A7P;
import X.AGB;
import X.AGI;
import X.AnonymousClass00H;
import X.AnonymousClass02n;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass129;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass5YV;
import X.AnonymousClass7R0;
import X.AnonymousClass8BT;
import X.AnonymousClass8BW;
import X.C000200d;
import X.C003401n;
import X.C108945cZ;
import X.C108975cc;
import X.C110885hR;
import X.C137116uw;
import X.C173628vP;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C188799i0;
import X.C192109no;
import X.C20339AGv;
import X.C22205AzL;
import X.C22206AzM;
import X.C22207AzN;
import X.C22208AzO;
import X.C22209AzP;
import X.C22210AzQ;
import X.C22211AzR;
import X.C22212AzS;
import X.C22213AzT;
import X.C22214AzU;
import X.C22215AzV;
import X.C22216AzW;
import X.C22269B0x;
import X.C25088CWz;
import X.C26302CxJ;
import X.C28281Zt;
import X.C28931bI;
import X.C33641j9;
import X.C36401np;
import X.C40751vD;
import X.C58712l8;
import X.C63662tU;
import X.C63932tv;
import X.C70593Bs;
import X.C72453Mb;
import X.C90054dS;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

public final class ChatTransferActivity extends C173628vP implements AnonymousClass5YV {
    public LottieAnimationView A00;
    public CircularProgressBar A01;
    public C40751vD A02;
    public WaTextView A03;
    public RoundCornerProgressBar A04;
    public A7P A05;
    public ChatTransferViewModel A06;
    public C33641j9 A07;
    public AnonymousClass129 A08;
    public C28931bI A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public RelativeLayout A0D;
    public Toolbar A0E;
    public TextEmojiLabel A0F;
    public WaTextView A0G;
    public WaTextView A0H;
    public WDSButton A0I;
    public boolean A0J;
    public final AnonymousClass02n A0K;
    public final AnonymousClass02n A0L;
    public final AnonymousClass02n A0M;

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        menu.add(0, 1, 0, 2131895081);
        menu.add(0, 2, 0, 2131888238);
        return super.onCreateOptionsMenu(menu);
    }

    public void A2y() {
        if (!this.A0J) {
            this.A0J = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r1 = A002.AAQ;
            C63932tv.A02(r1, this);
            AnonymousClass10G r2 = r1.A00;
            C63932tv.A01(r1, r2, this);
            C63662tU.A00(r1, r2, this, r2.A5A);
            this.A06 = AnonymousClass8BT.A0f(r1);
            this.A04 = AnonymousClass3MY.A0e(r2);
            this.A07 = AnonymousClass3MW.A0s(r1);
            this.A01 = AnonymousClass3Ma.A0b(r1);
            this.A0A = C000200d.A00(r2.A5a);
            this.A08 = C108975cc.A0O(r1);
            this.A05 = (A7P) r2.A32.get();
            this.A0B = C000200d.A00(A002.A5g);
            this.A0C = C000200d.A00(r1.A9T);
            this.A02 = C72453Mb.A0d(r1);
            this.A07 = AnonymousClass8BW.A0T(r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b1, code lost:
        r0.A06(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e8, code lost:
        r1 = new X.C188349hH(r2, (X.B8L) null, r4, r5, r6, r7, r8, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ef, code lost:
        A4h(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        super.A4c(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f7, code lost:
        r0 = "chatTransferViewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fc, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0100, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4c(int r11) {
        /*
            r10 = this;
            java.lang.String r4 = "hotspot_check"
            java.lang.String r3 = "wifi_check"
            java.lang.String r1 = "location_services_check"
            java.lang.String r2 = "failed"
            switch(r11) {
                case 2: goto L_0x00c8;
                case 3: goto L_0x00bf;
                case 4: goto L_0x00b6;
                case 5: goto L_0x00ad;
                case 6: goto L_0x00a4;
                case 7: goto L_0x009d;
                case 8: goto L_0x008e;
                case 9: goto L_0x0070;
                case 10: goto L_0x000f;
                case 11: goto L_0x0085;
                case 12: goto L_0x007d;
                case 13: goto L_0x0042;
                default: goto L_0x000b;
            }
        L_0x000b:
            super.A4c(r11)
            return
        L_0x000f:
            boolean r0 = X.AnonymousClass112.A06()
            if (r0 == 0) goto L_0x0029
            r4 = 2131888202(0x7f12084a, float:1.9411033E38)
            r5 = 2131888201(0x7f120849, float:1.941103E38)
            r6 = 2131899162(0x7f12331a, float:1.9433262E38)
            r7 = 2131892995(0x7f121b03, float:1.9420754E38)
            r8 = 0
            X.AWF r2 = new X.AWF
            r2.<init>(r10, r8)
            goto L_0x00e8
        L_0x0029:
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r10.A06
            if (r0 == 0) goto L_0x00f7
            r4 = 2131888202(0x7f12084a, float:1.9411033E38)
            r5 = 2131888201(0x7f120849, float:1.941103E38)
            r6 = 2131899286(0x7f123396, float:1.9433514E38)
            r7 = 0
            r2 = 0
            r9 = r7
            X.9hH r1 = new X.9hH
            r3 = r2
            r8 = r7
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00ef
        L_0x0042:
            X.00H r0 = r10.A0C
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r2 = r0.get()
            X.1jT r2 = (X.C33841jT) r2
            r1 = 38
            r0 = 1
            X.C33841jT.A03(r2, r1, r0)
            X.02n r3 = r10.A0L
            X.00H r0 = r10.A07
            if (r0 == 0) goto L_0x00fa
            r0.get()
            X.11S r0 = r10.A02
            com.whatsapp.Me r0 = r0.A07()
            boolean r2 = X.AnonymousClass000.A1W(r0)
            r1 = 0
            r0 = 5
            android.content.Intent r1 = X.AnonymousClass1LU.A0J(r10, r0, r2, r1)
            r0 = 0
            r3.A02(r0, r1)
            goto L_0x000b
        L_0x0070:
            X.10I r2 = r10.A05
            r1 = 47
            X.3Bs r0 = new X.3Bs
            r0.<init>(r10, r1)
            r2.CGF(r0)
            goto L_0x000b
        L_0x007d:
            X.A7P r0 = r10.A4j()
            r0.A07(r4, r2)
            goto L_0x000b
        L_0x0085:
            X.A7P r0 = r10.A4j()
            r0.A06(r4)
            goto L_0x000b
        L_0x008e:
            X.A7P r0 = r10.A4j()
            r1 = 0
            r4 = 0
            java.lang.String r3 = "feature_eligibility_check"
            r2 = r1
            r0.A05(r1, r2, r3, r4)
            goto L_0x000b
        L_0x009d:
            X.A7P r0 = r10.A4j()
            java.lang.String r3 = "feature_eligibility_check"
            goto L_0x00b1
        L_0x00a4:
            X.A7P r0 = r10.A4j()
            r0.A07(r3, r2)
            goto L_0x000b
        L_0x00ad:
            X.A7P r0 = r10.A4j()
        L_0x00b1:
            r0.A06(r3)
            goto L_0x000b
        L_0x00b6:
            X.A7P r0 = r10.A4j()
            r0.A07(r1, r2)
            goto L_0x000b
        L_0x00bf:
            X.A7P r0 = r10.A4j()
            r0.A06(r1)
            goto L_0x000b
        L_0x00c8:
            X.A7P r1 = r10.A4j()
            java.lang.String r0 = "permissions_check"
            r1.A07(r0, r2)
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r1 = r10.A06
            if (r1 == 0) goto L_0x00f7
            r5 = 2131888212(0x7f120854, float:1.9411053E38)
            r4 = 2131888213(0x7f120855, float:1.9411055E38)
            r6 = 2131888214(0x7f120856, float:1.9411057E38)
            r7 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 3
            X.AWF r2 = new X.AWF
            r2.<init>(r1, r0)
            r8 = 1
        L_0x00e8:
            r3 = 0
            X.9hH r1 = new X.9hH
            r9 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x00ef:
            r10.A4h(r1)
            goto L_0x000b
        L_0x00f4:
            java.lang.String r0 = "registrationManager"
            goto L_0x00fc
        L_0x00f7:
            java.lang.String r0 = "chatTransferViewModel"
            goto L_0x00fc
        L_0x00fa:
            java.lang.String r0 = "waIntents"
        L_0x00fc:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.transfer.ui.ChatTransferActivity.A4c(int):void");
    }

    public void A4g(C188799i0 r24) {
        String str;
        Spanned fromHtml;
        C188799i0 r4 = r24;
        if (r24 == null) {
            Log.e("p2p/fpm/ChatTransferActivity/onCurrentScreenChanged/viewData is null");
            return;
        }
        boolean z = r4.A0L;
        Toolbar toolbar = this.A0E;
        if (z) {
            if (toolbar == null) {
                C18070vi.A11("titleToolbar");
                throw null;
            }
            toolbar.setNavigationOnClickListener(new C90054dS(r4, 14));
            Toolbar toolbar2 = this.A0E;
            if (toolbar2 == null) {
                C18070vi.A11("titleToolbar");
                throw null;
            }
            boolean A0B2 = C28281Zt.A0B(this);
            C18000vb r1 = this.A00;
            int i = 2131231672;
            if (A0B2) {
                i = 2131231675;
            }
            AnonymousClass3NL.A02(this, toolbar2, r1, i);
        } else if (toolbar == null) {
            C18070vi.A11("titleToolbar");
            throw null;
        } else {
            toolbar.setNavigationIcon((Drawable) null);
        }
        RelativeLayout relativeLayout = this.A0D;
        if (relativeLayout == null) {
            C18070vi.A11("imageLayout");
            throw null;
        }
        relativeLayout.setVisibility(r4.A00);
        if (r4.A00 == 0) {
            LottieAnimationView lottieAnimationView = this.A00;
            if (lottieAnimationView == null) {
                C18070vi.A11("lottieAnimationView");
                throw null;
            }
            lottieAnimationView.setFrame(r4.A02);
            LottieAnimationView lottieAnimationView2 = this.A00;
            if (lottieAnimationView2 == null) {
                C18070vi.A11("lottieAnimationView");
                throw null;
            }
            lottieAnimationView2.A09.A0F(r4.A02, r4.A01);
            LottieAnimationView lottieAnimationView3 = this.A00;
            if (lottieAnimationView3 == null) {
                C18070vi.A11("lottieAnimationView");
                throw null;
            }
            lottieAnimationView3.A04();
            int i2 = r4.A02;
            int i3 = r4.A01;
            LottieAnimationView lottieAnimationView4 = this.A00;
            if (i2 == i3) {
                if (lottieAnimationView4 == null) {
                    C18070vi.A11("lottieAnimationView");
                    throw null;
                }
                lottieAnimationView4.A03();
            } else if (lottieAnimationView4 == null) {
                C18070vi.A11("lottieAnimationView");
                throw null;
            } else {
                lottieAnimationView4.A04();
                LottieAnimationView lottieAnimationView5 = this.A00;
                if (lottieAnimationView5 == null) {
                    C18070vi.A11("lottieAnimationView");
                    throw null;
                }
                int i4 = 0;
                if (r4.A0K) {
                    i4 = -1;
                }
                lottieAnimationView5.setRepeatCount(i4);
            }
        }
        WaTextView waTextView = this.A0H;
        if (waTextView == null) {
            C18070vi.A11("title");
            throw null;
        }
        waTextView.setText(r4.A0D);
        boolean z2 = r4.A0I;
        WaTextView waTextView2 = this.A0G;
        if (z2) {
            if (waTextView2 == null) {
                C18070vi.A11("subtitle");
                throw null;
            }
            int i5 = r4.A0C;
            C36401np r11 = this.A04;
            if (r11 != null) {
                AnonymousClass00H r0 = this.A06;
                if (r0 != null) {
                    Object A0E2 = C18070vi.A0E(r0);
                    String str2 = r4.A0H;
                    C70593Bs r8 = new C70593Bs(this, 48);
                    String string = getString(i5, (str2 == null || str2.length() == 0) ? new Object[]{"learn-more"} : C108945cZ.A1a(str2, "learn-more", 2, 1));
                    C18070vi.A0b(string);
                    SpannableStringBuilder A052 = r11.A05(this, new AnonymousClass7R0(r8, A0E2, this, 49), string, "learn-more");
                    C18070vi.A0X(A052);
                    waTextView2.setText(A052);
                    WaTextView waTextView3 = this.A0G;
                    if (waTextView3 == null) {
                        C18070vi.A11("subtitle");
                        throw null;
                    }
                    AnonymousClass3Ma.A1I(waTextView3, this.A0E);
                } else {
                    C18070vi.A11("contextualHelpHandler");
                    throw null;
                }
            } else {
                C18070vi.A11("linkifier");
                throw null;
            }
        } else if (waTextView2 == null) {
            C18070vi.A11("subtitle");
            throw null;
        } else {
            String str3 = r4.A0H;
            if (str3 == null || str3.length() == 0) {
                fromHtml = Html.fromHtml(getString(r4.A0C));
            } else {
                fromHtml = Html.fromHtml(C17890vO.A0R(this, str3, 1, 0, r4.A0C));
            }
            waTextView2.setText(fromHtml);
        }
        TextEmojiLabel textEmojiLabel = this.A0F;
        if (textEmojiLabel == null) {
            C18070vi.A11("secondSubtitle");
            throw null;
        }
        textEmojiLabel.setVisibility(r4.A09);
        if (r4.A09 == 0) {
            TextEmojiLabel textEmojiLabel2 = this.A0F;
            if (textEmojiLabel2 == null) {
                C18070vi.A11("secondSubtitle");
                throw null;
            }
            textEmojiLabel2.setText(Html.fromHtml(getString(r4.A0C)));
            C18030ve abProps = getAbProps();
            AnonymousClass1KB r82 = this.A05;
            AnonymousClass1L9 r7 = this.A01;
            AnonymousClass11C r6 = this.A08;
            TextEmojiLabel textEmojiLabel3 = this.A0F;
            if (textEmojiLabel3 == null) {
                C18070vi.A11("secondSubtitle");
                throw null;
            }
            String A0q = C17880vN.A0q(this, "learn-more", new Object[1], 0, 2131886411);
            AnonymousClass129 r12 = this.A08;
            if (r12 != null) {
                C26302CxJ.A0K(this, r12.A03("1313491802751163"), r7, r82, textEmojiLabel3, r6, abProps, A0q, "learn-more");
            } else {
                C18070vi.A11("faqLinkFactory");
                throw null;
            }
        }
        C25088CWz cWz = (C25088CWz) A4b().A0B.A06();
        if (r4.A08 != 0 || cWz == null) {
            C28931bI r13 = this.A09;
            if (r13 == null) {
                str = "qrCodeViewStub";
            } else {
                r13.A04(8);
                C192109no r14 = this.A03;
                if (r14 != null) {
                    Window window = getWindow();
                    C18070vi.A0X(window);
                    r14.A00(window);
                } else {
                    str = "brightnessController";
                }
            }
            C18070vi.A11(str);
            throw null;
        }
        A4f(cWz);
        CircularProgressBar circularProgressBar = this.A01;
        if (circularProgressBar == null) {
            C18070vi.A11("progressSpinner");
            throw null;
        }
        circularProgressBar.setVisibility(r4.A07);
        WaTextView waTextView4 = this.A03;
        if (waTextView4 == null) {
            C18070vi.A11("progressDescription");
            throw null;
        }
        waTextView4.setVisibility(r4.A06);
        RoundCornerProgressBar roundCornerProgressBar = this.A04;
        if (roundCornerProgressBar == null) {
            C18070vi.A11("progressBar");
            throw null;
        }
        roundCornerProgressBar.setVisibility(8);
        WaTextView waTextView5 = this.A03;
        if (waTextView5 == null) {
            C18070vi.A11("progressDescription");
            throw null;
        }
        waTextView5.setText(r4.A05);
        WDSButton wDSButton = this.A05;
        if (wDSButton != null) {
            wDSButton.setVisibility(r4.A04);
            WDSButton wDSButton2 = this.A05;
            if (wDSButton2 != null) {
                wDSButton2.setText(r4.A03);
                WDSButton wDSButton3 = this.A05;
                if (wDSButton3 != null) {
                    C90054dS.A00(wDSButton3, r4, 15);
                    WDSButton wDSButton4 = this.A0I;
                    if (wDSButton4 == null) {
                        C18070vi.A11("secondaryBtn");
                        throw null;
                    }
                    wDSButton4.setVisibility(r4.A0B);
                    WDSButton wDSButton5 = this.A0I;
                    if (wDSButton5 == null) {
                        C18070vi.A11("secondaryBtn");
                        throw null;
                    }
                    wDSButton5.setText(r4.A0A);
                    WDSButton wDSButton6 = this.A0I;
                    if (wDSButton6 == null) {
                        C18070vi.A11("secondaryBtn");
                        throw null;
                    }
                    C90054dS.A00(wDSButton6, r4, 16);
                    super.A4g(r4);
                    return;
                }
                C18070vi.A11("primaryBtn");
                throw null;
            }
            C18070vi.A11("primaryBtn");
            throw null;
        }
        C18070vi.A11("primaryBtn");
        throw null;
    }

    public final A7P A4j() {
        A7P a7p = this.A05;
        if (a7p != null) {
            return a7p;
        }
        C18070vi.A11("loggingManager");
        throw null;
    }

    public boolean C5Z() {
        Log.i("p2p/fpm/ChatTransferActivity/logout received from the server");
        return false;
    }

    public ChatTransferActivity(int i) {
        this.A0J = false;
        AGB.A00(this, 45);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        this.A0D = (RelativeLayout) AnonymousClass3MY.A0C(this, 2131429058);
        this.A0E = (Toolbar) AnonymousClass3MY.A0H(this, 2131436246);
        this.A00 = (LottieAnimationView) AnonymousClass3MY.A0C(this, 2131429059);
        this.A09 = new C28931bI(C110885hR.A0A(this, 2131429067));
        this.A0H = (WaTextView) AnonymousClass3MY.A0C(this, 2131429071);
        this.A0G = (WaTextView) AnonymousClass3MY.A0C(this, 2131429070);
        this.A0F = (TextEmojiLabel) AnonymousClass3MY.A0C(this, 2131429068);
        this.A01 = (CircularProgressBar) AnonymousClass3MY.A0C(this, 2131429064);
        this.A03 = (WaTextView) AnonymousClass3MY.A0C(this, 2131429063);
        this.A04 = (RoundCornerProgressBar) AnonymousClass3MY.A0C(this, 2131429062);
        WDSButton wDSButton = (WDSButton) AnonymousClass3MY.A0C(this, 2131429061);
        C18070vi.A0d(wDSButton, 0);
        this.A05 = wDSButton;
        this.A0I = (WDSButton) AnonymousClass3MY.A0C(this, 2131429069);
        ChatTransferViewModel chatTransferViewModel = (ChatTransferViewModel) AnonymousClass3MW.A0N(this).A00(ChatTransferViewModel.class);
        this.A06 = chatTransferViewModel;
        if (chatTransferViewModel != null) {
            C20339AGv.A00(this, chatTransferViewModel.A0M, new C22205AzL(this), 30);
            ChatTransferViewModel chatTransferViewModel2 = this.A06;
            if (chatTransferViewModel2 != null) {
                C20339AGv.A00(this, chatTransferViewModel2.A0L, new C22206AzM(this), 30);
                ChatTransferViewModel chatTransferViewModel3 = this.A06;
                if (chatTransferViewModel3 != null) {
                    this.A02 = chatTransferViewModel3;
                    P2pTransferViewModel A4b = A4b();
                    Bundle A092 = AnonymousClass3MY.A09(this);
                    if (A092 != null) {
                        A4b.A0f(A092);
                    }
                    C20339AGv.A00(this, A4b.A0G, new C22209AzP(this), 31);
                    C20339AGv.A00(this, A4b.A0D, new C22210AzQ(this), 31);
                    C20339AGv.A00(this, A4b.A0A, new C22211AzR(this), 31);
                    C20339AGv.A00(this, A4b.A07, new C22212AzS(this), 31);
                    C20339AGv.A00(this, A4b.A09, new C22213AzT(this), 31);
                    C20339AGv.A00(this, A4b.A08, new C22214AzU(this), 31);
                    C20339AGv.A00(this, A4b.A0E, new C22215AzV(this), 31);
                    C20339AGv.A00(this, A4b.A0F, new C22216AzW(this), 31);
                    C20339AGv.A00(this, A4b.A0C, new C22208AzO(this), 31);
                    C20339AGv.A00(this, A4b.A0B, new C22269B0x(this, chatTransferViewModel3), 31);
                    ChatTransferViewModel chatTransferViewModel4 = this.A06;
                    if (chatTransferViewModel4 != null) {
                        C20339AGv.A00(this, chatTransferViewModel4.A0N, new C22207AzN(this), 30);
                        if (!ViewConfiguration.get(this).hasPermanentMenuKey()) {
                            Toolbar toolbar = this.A0E;
                            if (toolbar == null) {
                                str = "titleToolbar";
                                C18070vi.A11(str);
                                throw null;
                            }
                            C003401n A0K2 = AnonymousClass3MY.A0K(this, toolbar);
                            if (A0K2 != null) {
                                A0K2.A0W(false);
                                A0K2.A0Y(false);
                            }
                        }
                        LottieAnimationView lottieAnimationView = this.A00;
                        if (lottieAnimationView == null) {
                            str = "lottieAnimationView";
                            C18070vi.A11(str);
                            throw null;
                        }
                        lottieAnimationView.setAnimation(2132017254);
                        return;
                    }
                }
            }
        }
        C18070vi.A11("chatTransferViewModel");
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        if (C72453Mb.A0B(menuItem) == 1) {
            C33641j9 r0 = this.A07;
            if (r0 != null) {
                r0.A02("chat-transfer");
                AnonymousClass00H r02 = this.A0B;
                if (r02 != null) {
                    C58712l8 r1 = (C58712l8) r02.get();
                    C33641j9 r03 = this.A07;
                    if (r03 != null) {
                        r1.A01(this, r03, "chat-transfer");
                        return true;
                    }
                } else {
                    str = "registrationHelper";
                }
            }
            str = "verificationFlowState";
        } else if (menuItem.getItemId() != 2) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            ChatTransferViewModel chatTransferViewModel = this.A06;
            if (chatTransferViewModel == null) {
                str = "chatTransferViewModel";
            } else {
                chatTransferViewModel.A0c();
                return true;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onResume() {
        super.onResume();
        Number A1C = C108945cZ.A1C(A4b().A0D);
        if (A1C != null && A1C.intValue() == 10) {
            this.A05.CGF(new C70593Bs(this, 47));
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.02h] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.02h] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.02h] */
    public ChatTransferActivity() {
        this(0);
        this.A0M = CDw(new AGI((Object) this, 8), new Object());
        this.A0K = CDw(new AGI((Object) this, 9), new Object());
        this.A0L = CDw(new AGI((Object) this, 10), new Object());
    }
}
