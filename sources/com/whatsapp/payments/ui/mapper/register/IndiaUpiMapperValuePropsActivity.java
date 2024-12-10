package com.whatsapp.payments.ui.mapper.register;

import X.AFR;
import X.AFT;
import X.AGE;
import X.AZ6;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11S;
import X.AnonymousClass1FY;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BR;
import X.AnonymousClass8BU;
import X.AnonymousClass8BX;
import X.AnonymousClass9R2;
import X.C108965cb;
import X.C137116uw;
import X.C17880vN;
import X.C18070vi;
import X.C20008A2y;
import X.C21427Aju;
import X.C36401np;
import X.C63662tU;
import X.C63932tv;
import X.C72453Mb;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.MenuItem;
import android.widget.TextView;
import com.whatsapp.Me;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;

public final class IndiaUpiMapperValuePropsActivity extends AnonymousClass1FY {
    public TextView A00;
    public TextView A01;
    public AZ6 A02;
    public C20008A2y A03;
    public C36401np A04;
    public WDSButton A05;
    public WDSButton A06;
    public boolean A07;

    public void A2y() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A02 = AnonymousClass8BU.A0T(r2);
            this.A03 = (C20008A2y) r2.AW4.get();
            this.A04 = AnonymousClass3MY.A0e(r1);
        }
    }

    public IndiaUpiMapperValuePropsActivity(int i) {
        this.A07 = false;
        AGE.A00(this, 10);
    }

    public void onBackPressed() {
        super.onBackPressed();
        AZ6 az6 = this.A02;
        if (az6 != null) {
            az6.BiL(1, "alias_intro", AnonymousClass8BX.A0Y(this), 1);
        } else {
            C18070vi.A11("fieldStatsLogger");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        super.onCreate(bundle);
        AnonymousClass8BX.A0u(this);
        setContentView(2131625639);
        this.A06 = (WDSButton) AnonymousClass3MY.A0H(this, 2131432303);
        this.A05 = (WDSButton) AnonymousClass3MY.A0H(this, 2131432288);
        this.A00 = (TextView) AnonymousClass3MY.A0H(this, 2131432294);
        this.A01 = (TextView) AnonymousClass3MY.A0H(this, 2131434421);
        TextEmojiLabel A0H = AnonymousClass8BR.A0H(this, 2131432305);
        C36401np r7 = this.A04;
        if (r7 != null) {
            Context context = A0H.getContext();
            C20008A2y a2y = this.A03;
            if (a2y != null) {
                int i = 2131891876;
                if (a2y.A05()) {
                    i = 2131891875;
                }
                Object[] objArr = new Object[1];
                AnonymousClass11S r0 = this.A02;
                r0.A0I();
                Me me = r0.A00;
                if (me == null || (str = me.number) == null) {
                    str = "";
                }
                SpannableString A042 = r7.A04(context, C17880vN.A0q(this, str, objArr, 0, i), new Runnable[]{new C21427Aju(this, 28)}, new String[]{"learn-more"}, new String[]{"https://faq.whatsapp.com/general/payments/about-using-your-mobile-number-as-your-UPI-number"});
                AnonymousClass3Ma.A1K(A0H, this.A08);
                AnonymousClass3Ma.A1L(this.A0E, A0H);
                A0H.setText(A042);
                AnonymousClass9R2.A00(this, 2131232759);
                Intent A072 = AnonymousClass8BR.A07(this, IndiaUpiMapperLinkActivity.class);
                A072.putExtra("extra_payment_name", getIntent().getParcelableExtra("extra_payment_name"));
                A072.addFlags(33554432);
                WDSButton wDSButton = this.A06;
                if (wDSButton == null) {
                    str4 = "continueButton";
                } else {
                    AFT.A00(wDSButton, this, A072, 29);
                    WDSButton wDSButton2 = this.A05;
                    if (wDSButton2 == null) {
                        str4 = "addMobileNumberButton";
                    } else {
                        AFT.A00(wDSButton2, this, A072, 30);
                        onConfigurationChanged(C108965cb.A03(this));
                        AZ6 az6 = this.A02;
                        if (az6 != null) {
                            Intent intent = getIntent();
                            if (intent != null) {
                                str2 = intent.getStringExtra("extra_referral_screen");
                            } else {
                                str2 = null;
                            }
                            az6.BiL((Integer) null, "alias_intro", str2, 0);
                            TextView textView = this.A00;
                            if (textView == null) {
                                C18070vi.A11("createCustomNumberTextView");
                                throw null;
                            }
                            AFR.A00(textView, this, 4);
                            TextView textView2 = this.A01;
                            if (textView2 == null) {
                                C18070vi.A11("recoverCustomNumberTextView");
                                throw null;
                            }
                            AFR.A00(textView2, this, 5);
                            C20008A2y a2y2 = this.A03;
                            if (a2y2 != null) {
                                boolean A052 = a2y2.A05();
                                WDSButton wDSButton3 = this.A06;
                                if (wDSButton3 == null) {
                                    str3 = "continueButton";
                                } else {
                                    wDSButton3.setVisibility(C72453Mb.A07(A052 ^ true ? 1 : 0));
                                    WDSButton wDSButton4 = this.A05;
                                    if (wDSButton4 == null) {
                                        str3 = "addMobileNumberButton";
                                    } else {
                                        wDSButton4.setVisibility(C72453Mb.A07(A052 ? 1 : 0));
                                        TextView textView3 = this.A01;
                                        if (textView3 != null) {
                                            textView3.setVisibility(8);
                                            TextView textView4 = this.A00;
                                            if (textView4 != null) {
                                                textView4.setVisibility(8);
                                                if (A052) {
                                                    C20008A2y a2y3 = this.A03;
                                                    if (a2y3 != null) {
                                                        if (a2y3.A01() != null) {
                                                            TextView textView5 = this.A01;
                                                            if (textView5 != null) {
                                                                textView5.setVisibility(0);
                                                                TextView textView6 = this.A00;
                                                                if (textView6 != null) {
                                                                    textView6.setVisibility(4);
                                                                    return;
                                                                }
                                                            }
                                                        } else {
                                                            C20008A2y a2y4 = this.A03;
                                                            if (a2y4 != null) {
                                                                if (a2y4.A06()) {
                                                                    TextView textView7 = this.A00;
                                                                    if (textView7 != null) {
                                                                        textView7.setVisibility(0);
                                                                        return;
                                                                    }
                                                                } else {
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    return;
                                                }
                                            }
                                            C18070vi.A11("createCustomNumberTextView");
                                            throw null;
                                        }
                                        C18070vi.A11("recoverCustomNumberTextView");
                                        throw null;
                                    }
                                }
                                C18070vi.A11(str3);
                                throw null;
                            }
                            str3 = "indiaUpiMapperAliasManager";
                            C18070vi.A11(str3);
                            throw null;
                        }
                        C18070vi.A11("fieldStatsLogger");
                        throw null;
                    }
                }
                C18070vi.A11(str4);
                throw null;
            }
            C18070vi.A11("indiaUpiMapperAliasManager");
            throw null;
        }
        C18070vi.A11("linkifier");
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) == 16908332) {
            AZ6 az6 = this.A02;
            if (az6 != null) {
                az6.BiL(C17880vN.A0j(), "alias_intro", AnonymousClass8BX.A0Y(this), 1);
            } else {
                C18070vi.A11("fieldStatsLogger");
                throw null;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiMapperValuePropsActivity() {
        this(0);
    }
}
