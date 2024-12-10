package com.whatsapp.newsletter.ui;

import X.AFC;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DF;
import X.AnonymousClass1F9;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1YF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass687;
import X.AnonymousClass6ZQ;
import X.AnonymousClass6ZS;
import X.AnonymousClass74D;
import X.AnonymousClass787;
import X.AnonymousClass8B4;
import X.C000200d;
import X.C108955ca;
import X.C108965cb;
import X.C109005cf;
import X.C114695rp;
import X.C114705rq;
import X.C114715rr;
import X.C114725rs;
import X.C131296kr;
import X.C1423279a;
import X.C152667oH;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C23291Fl;
import X.C23391Fw;
import X.C23401Fx;
import X.C24681Lg;
import X.C24921Me;
import X.C25181Nf;
import X.C29681ch;
import X.C29691ci;
import X.C30361do;
import X.C46162Dk;
import X.C72463Mc;
import X.C72473Md;
import X.C90594eK;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class ShareNewsletterInviteLinkActivity extends AnonymousClass687 implements C23291Fl, AnonymousClass8B4 {
    public C131296kr A00;
    public AnonymousClass6ZQ A01;
    public C24921Me A02;
    public AnonymousClass1CJ A03;
    public C25181Nf A04;
    public C24681Lg A05;
    public C29681ch A06;
    public C30361do A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public Integer A0B;
    public C114705rq A0C;
    public C114695rp A0D;
    public C114725rs A0E;
    public C114715rr A0F;
    public C114715rr A0G;
    public C46162Dk A0H;
    public boolean A0I;
    public final C18100vl A0J;

    public void A4g(C114725rs r6) {
        String str;
        C18070vi.A0d(r6, 0);
        AnonymousClass00H r0 = this.A08;
        if (r0 != null) {
            AnonymousClass74D r4 = (AnonymousClass74D) r0.get();
            C29681ch r3 = this.A06;
            if (r3 == null) {
                str = "jid";
            } else {
                r4.A0D(r3, this.A0B, 3, 4);
                super.A4g(r6);
                return;
            }
        } else {
            str = "newsletterLogging";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A4h(C114715rr r9) {
        String str;
        C18070vi.A0d(r9, 0);
        Log.i("sharenewsletterinvitelinkactivity/shareviawhatsapp/");
        AnonymousClass00H r0 = this.A08;
        if (r0 != null) {
            AnonymousClass74D r4 = (AnonymousClass74D) r0.get();
            C29681ch r2 = this.A06;
            if (r2 != null) {
                r4.A0D(r2, this.A0B, 1, 4);
                if (C18020vd.A05(C18040vf.A02, this.A0E, 6445)) {
                    String str2 = r9.A00;
                    if (str2 != null) {
                        AnonymousClass00H r02 = this.A0A;
                        if (r02 != null) {
                            r02.get();
                            C29681ch r42 = this.A06;
                            if (r42 != null) {
                                Intent A0B2 = C72473Md.A0B(this, "com.whatsapp.contact.picker.ContactPicker");
                                A0B2.putExtra("source_surface", 28);
                                A0B2.setType("text/plain");
                                A0B2.putExtra("android.intent.extra.TEXT", str2);
                                A0B2.putExtra("newsletter_invite_link_jid", r42.getRawString());
                                A0B2.putExtra("disable_post_send_intent", true);
                                startActivityForResult(A0B2, 1);
                                return;
                            }
                        } else {
                            str = "waIntents";
                        }
                    } else {
                        return;
                    }
                } else {
                    super.A4h(r9);
                    return;
                }
            }
            C18070vi.A11("jid");
            throw null;
        }
        str = "newsletterLogging";
        C18070vi.A11(str);
        throw null;
    }

    public C90594eK BZQ(int i, int i2, boolean z) {
        View view = this.A00;
        ArrayList A0t = C108965cb.A0t(view);
        AnonymousClass11C r3 = this.A08;
        C18070vi.A0W(r3);
        return new C90594eK(view, (AnonymousClass1F9) this, r3, (List) A0t, i, i2, z);
    }

    public void By8(ArrayList arrayList) {
    }

    private final void A0Q() {
        String str;
        C46162Dk r0 = this.A0H;
        String str2 = "newsletterInfo";
        if (r0 != null) {
            String str3 = r0.A0S;
            if (str3 == null || AnonymousClass1YF.A0T(str3)) {
                A0V(false);
                this.A01.setText(" \n ");
                return;
            }
            String A1H = AnonymousClass001.A1H("https://whatsapp.com/channel/", str3, AnonymousClass000.A10());
            this.A01.setText(A1H);
            Object[] A1b = AnonymousClass3MW.A1b();
            C46162Dk r02 = this.A0H;
            if (r02 != null) {
                A1b[0] = r02.A0T;
                String A10 = AnonymousClass3Ma.A10(this, str3, A1b, 1, 2131892897);
                C114725rs r3 = this.A0E;
                if (r3 == null) {
                    str = "shareBtn";
                } else {
                    r3.A02 = A10;
                    Object[] objArr = new Object[1];
                    C46162Dk r03 = this.A0H;
                    if (r03 != null) {
                        r3.A01 = C17880vN.A0q(this, r03.A0T, objArr, 0, 2131896101);
                        r3.A00 = getString(2131896094);
                        C114715rr r04 = this.A0F;
                        if (r04 == null) {
                            str2 = "sendViaWhatsAppBtn";
                        } else {
                            r04.A00 = A10;
                            C114715rr r05 = this.A0G;
                            if (r05 == null) {
                                str2 = "shareToStatusBtn";
                            } else {
                                r05.A00 = A10;
                                C114705rq r06 = this.A0C;
                                if (r06 == null) {
                                    str = "copyBtn";
                                } else {
                                    r06.A00 = A1H;
                                    return;
                                }
                            }
                        }
                    }
                }
                C18070vi.A11(str);
                throw null;
            }
        }
        C18070vi.A11(str2);
        throw null;
    }

    private final void A0V(boolean z) {
        String str;
        this.A01.setEnabled(z);
        C114705rq r0 = this.A0C;
        if (r0 == null) {
            str = "copyBtn";
        } else {
            r0.A00.setEnabled(z);
            C114725rs r02 = this.A0E;
            if (r02 == null) {
                str = "shareBtn";
            } else {
                r02.A00.setEnabled(z);
                C114715rr r03 = this.A0F;
                if (r03 == null) {
                    str = "sendViaWhatsAppBtn";
                } else {
                    r03.A00.setEnabled(z);
                    C114695rp r04 = this.A0D;
                    if (r04 == null) {
                        str = "qrCodeBtn";
                    } else {
                        r04.A00.setEnabled(z);
                        return;
                    }
                }
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A2y() {
        if (!this.A0I) {
            this.A0I = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A2 = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r3 = A0A2.A00;
            C109005cf.A0d(A0A2, r3, this);
            C109005cf.A0e(A0A2, r3, this, r3.A5A);
            this.A02 = AnonymousClass3MY.A0Z(A0A2);
            this.A03 = AnonymousClass3MZ.A0e(A0A2);
            this.A01 = (AnonymousClass6ZS) A0K.A2s.get();
            this.A03 = AnonymousClass3Ma.A0d(A0A2);
            this.A04 = AnonymousClass3MZ.A0m(A0A2);
            this.A05 = AnonymousClass3MZ.A0o(A0A2);
            this.A00 = (C131296kr) A0K.A17.get();
            this.A07 = (C30361do) A0A2.A74.get();
            this.A08 = C000200d.A00(A0A2.A7M);
            this.A09 = C000200d.A00(r3.AE1);
            this.A01 = (AnonymousClass6ZQ) A0K.A5V.get();
            this.A02 = AnonymousClass3MZ.A0g(A0A2);
            this.A0A = AnonymousClass3MW.A0s(A0A2);
        }
    }

    public void A3K() {
        if (C18020vd.A05(C18040vf.A02, this.A0E, 12350)) {
            C30361do r3 = this.A07;
            if (r3 != null) {
                C18100vl r0 = C30361do.A0C;
                r3.A02((AnonymousClass1BI) null, 113);
                return;
            }
            C18070vi.A11("navigationTimeSpentManager");
            throw null;
        }
        super.A3K();
    }

    public void onDestroy() {
        C24681Lg r1 = this.A05;
        if (r1 != null) {
            r1.unregisterObserver(this.A0J.getValue());
            super.onDestroy();
            return;
        }
        C18070vi.A11("messageObservers");
        throw null;
    }

    public ShareNewsletterInviteLinkActivity(int i) {
        this.A0I = false;
        C1423279a.A00(this, 16);
    }

    public C23401Fx BPx() {
        return ((C23391Fw) getLifecycle()).A02;
    }

    public String BSb() {
        return "newsletter_link_activity";
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1 && intent != null) {
            CPW(C72463Mc.A0r(intent, AnonymousClass1BI.class), 1);
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.5rr, X.6nW, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v2, types: [X.5rp, X.6nW, java.lang.Object] */
    public void onCreate(Bundle bundle) {
        Integer num;
        String str;
        C46162Dk r1;
        int i;
        super.onCreate(bundle);
        C29681ch A012 = C29681ch.A03.A01(getIntent().getStringExtra("jid"));
        if (A012 != null) {
            this.A06 = A012;
            setTitle(2131892886);
            A4f();
            int i2 = 0;
            int intExtra = getIntent().getIntExtra("entry_point", 0);
            Integer[] A002 = AnonymousClass00R.A00(27);
            int length = A002.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    num = A002[i3];
                    switch (num.intValue()) {
                        case 1:
                            i = 1;
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            i = 3;
                            break;
                        case 4:
                            i = 4;
                            break;
                        case 5:
                            i = 5;
                            break;
                        case 6:
                            i = 6;
                            break;
                        case 7:
                            i = 7;
                            break;
                        case 8:
                            i = 8;
                            break;
                        case 9:
                            i = 9;
                            break;
                        case 10:
                            i = 10;
                            break;
                        case 11:
                            i = 11;
                            break;
                        case 12:
                            i = 12;
                            break;
                        case 13:
                            i = 13;
                            break;
                        case 14:
                            i = 14;
                            break;
                        case 15:
                            i = 15;
                            break;
                        case 16:
                            i = 16;
                            break;
                        case 17:
                            i = 17;
                            break;
                        case 18:
                            i = 18;
                            break;
                        case 19:
                            i = 19;
                            break;
                        case 20:
                            i = 20;
                            break;
                        case 21:
                            i = 21;
                            break;
                        case 22:
                            i = 22;
                            break;
                        case 23:
                            i = 23;
                            break;
                        case 24:
                            i = 24;
                            break;
                        case 25:
                            i = 25;
                            break;
                        case 26:
                            i = 26;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    if (i != intExtra) {
                        i3++;
                    }
                } else {
                    num = null;
                }
            }
            this.A0B = num;
            AnonymousClass1CJ r12 = this.A03;
            if (r12 != null) {
                C29681ch r0 = this.A06;
                if (r0 != null) {
                    C29691ci A003 = AnonymousClass1CJ.A00(r12, r0);
                    if ((A003 instanceof C46162Dk) && (r1 = (C46162Dk) A003) != null) {
                        this.A0H = r1;
                        this.A0F = A4e();
                        ? obj = new Object();
                        obj.A00 = A4b();
                        obj.A00(new AnonymousClass787(this, obj, 38), getString(2131896120), 2131231656);
                        this.A0G = obj;
                        this.A0C = A4c();
                        this.A0E = A4d();
                        AFC afc = new AFC(this, 11);
                        ? obj2 = new Object();
                        obj2.A00 = A4b();
                        obj2.A00(afc, getString(2131895996), 2131232231);
                        View view = obj2.A00;
                        if (!C18020vd.A05(C18040vf.A02, this.A0E, 11692)) {
                            i2 = 8;
                        }
                        view.setVisibility(i2);
                        this.A0D = obj2;
                        ((TextView) AnonymousClass3MY.A0H(this, 2131435368)).setText(2131891486);
                        A0V(true);
                        A2v(false);
                        A0Q();
                        C29681ch r02 = this.A06;
                        if (r02 != null) {
                            A4i(r02);
                            C24681Lg r13 = this.A05;
                            if (r13 != null) {
                                r13.registerObserver(this.A0J.getValue());
                                return;
                            }
                            str = "messageObservers";
                        }
                    }
                }
                C18070vi.A11("jid");
                throw null;
            }
            str = "chatsCache";
            C18070vi.A11(str);
            throw null;
        }
        finish();
    }

    public void onResume() {
        super.onResume();
        A0Q();
    }

    public ShareNewsletterInviteLinkActivity() {
        this(0);
        this.A0J = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C152667oH(this));
    }
}
