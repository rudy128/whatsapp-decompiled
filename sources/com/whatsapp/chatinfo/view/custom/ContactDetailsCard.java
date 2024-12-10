package com.whatsapp.chatinfo.view.custom;

import X.A0Q;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass190;
import X.AnonymousClass1BI;
import X.AnonymousClass1DC;
import X.AnonymousClass1DT;
import X.AnonymousClass1E2;
import X.AnonymousClass1E7;
import X.AnonymousClass1FY;
import X.AnonymousClass1HF;
import X.AnonymousClass1KL;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1M2;
import X.AnonymousClass1QJ;
import X.AnonymousClass1R2;
import X.AnonymousClass1VP;
import X.AnonymousClass26n;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3Qh;
import X.AnonymousClass48l;
import X.AnonymousClass4PS;
import X.AnonymousClass4VP;
import X.AnonymousClass4YE;
import X.AnonymousClass7R9;
import X.AnonymousClass8FO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C191769n9;
import X.C19880zA;
import X.C21433Ak0;
import X.C22851Dl;
import X.C24071It;
import X.C28931bI;
import X.C30911ei;
import X.C30921ej;
import X.C31191fA;
import X.C36401np;
import X.C42141xh;
import X.C43351zf;
import X.C50802Vv;
import X.C63572tK;
import X.C72043Kk;
import X.C72453Mb;
import X.C72463Mc;
import X.C81743zj;
import X.C87244Uv;
import X.C89884dB;
import X.C91574fu;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.payments.ui.viewmodel.BrazilGetPixInfoViewModel;
import com.whatsapp.pnh.RequestPhoneNumberViewModel;
import com.whatsapp.wds.components.actiontile.WDSActionTile;
import java.util.List;

public class ContactDetailsCard extends AnonymousClass3Qh {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public TextView A0B;
    public C19880zA A0C;
    public C19880zA A0D;
    public AnonymousClass1L9 A0E;
    public AnonymousClass190 A0F;
    public AnonymousClass4PS A0G;
    public AnonymousClass11S A0H;
    public TextEmojiLabel A0I;
    public C72043Kk A0J;
    public AnonymousClass1FY A0K;
    public AnonymousClass1VP A0L;
    public C31191fA A0M;
    public AnonymousClass1M2 A0N;
    public AnonymousClass1E7 A0O;
    public C18030ve A0P;
    public C81743zj A0Q;
    public AnonymousClass1LU A0R;
    public AnonymousClass1QJ A0S;
    public C30921ej A0T;
    public BrazilGetPixInfoViewModel A0U;
    public A0Q A0V;
    public C191769n9 A0W;
    public AnonymousClass1R2 A0X;
    public AnonymousClass4VP A0Y;
    public RequestPhoneNumberViewModel A0Z;
    public AnonymousClass4YE A0a;
    public C36401np A0b;
    public AnonymousClass1DC A0c;
    public AnonymousClass00H A0d;
    public boolean A0e;
    public boolean A0f;
    public TextSwitcher A0g;
    public TextView A0h;
    public TextView A0i;
    public TextView A0j;
    public boolean A0k = true;
    public boolean A0l = true;
    public boolean A0m = true;
    public boolean A0n = true;
    public final C22851Dl A0o = new C91574fu(this, 40);

    public static boolean A01(ContactDetailsCard contactDetailsCard) {
        AnonymousClass1E7 r1;
        Jid A0g2;
        AnonymousClass1E7 A0K2;
        if (contactDetailsCard.A0e || (r1 = contactDetailsCard.A0O) == null || r1.A0I != null || (!contactDetailsCard.A0f ? !(!r1.A0B()) : (A0g2 = AnonymousClass3MW.A0g(r1)) == null || (A0K2 = contactDetailsCard.A0N.A0K(A0g2)) == null || A0K2.A0B()) || !(!contactDetailsCard.A0H.A0N())) {
            return false;
        }
        return true;
    }

    private void setContactStatusHelper(String str) {
        TextSwitcher textSwitcher = this.A0g;
        if (textSwitcher != null) {
            if (textSwitcher.getVisibility() == 8) {
                this.A0g.setVisibility(0);
            }
            this.A0g.setText(str);
        }
    }

    public /* synthetic */ void A03(C87244Uv r7) {
        boolean z = !r7.A03;
        boolean z2 = r7.A04;
        Uri uri = r7.A00;
        int i = 0;
        if (z) {
            this.A0A.setVisibility(8);
            this.A07.setVisibility(0);
            this.A07.setEnabled(!z2);
            int i2 = 2131894649;
            if (z2) {
                i2 = 2131894650;
            }
            ((WDSActionTile) this.A07).setText(i2);
            this.A01.setVisibility(8);
            this.A05.setVisibility(0);
            setPhoneHiddenBubbleText(uri);
            return;
        }
        this.A05.setVisibility(8);
        this.A07.setVisibility(8);
        View view = this.A01;
        if (!A01(this)) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void A04(boolean z) {
        AnonymousClass1BI r0;
        RequestPhoneNumberViewModel requestPhoneNumberViewModel;
        C87244Uv r1;
        AnonymousClass1E7 r02 = this.A0O;
        if (r02 != null) {
            r0 = r02.A0J;
        } else {
            r0 = null;
        }
        if (!(r0 instanceof AnonymousClass1E2) || (requestPhoneNumberViewModel = this.A0Z) == null || (r1 = (C87244Uv) requestPhoneNumberViewModel.A01.A06()) == null || (r1.A03 && r1.A02)) {
            AnonymousClass1E7 r3 = this.A0O;
            if (r3 != null) {
                C81743zj r12 = this.A0Q;
                if (r12 != null) {
                    r12.A0C = Boolean.valueOf(z);
                    r12.A0D = Boolean.valueOf(!z);
                }
                this.A0L.CNw(getContext(), r3, 6, z);
                return;
            }
            return;
        }
        int i = 3;
        if (z) {
            i = 4;
        }
        Integer valueOf = Integer.valueOf(i);
        AnonymousClass4VP r13 = this.A0Y;
        if (r13 != null) {
            r13.A00(valueOf.intValue());
        }
    }

    public void setAddContactButtonListener(View.OnClickListener onClickListener) {
        this.A01.setOnClickListener(onClickListener);
    }

    public void setContact(AnonymousClass1E7 r7) {
        this.A0O = r7;
        this.A0f = AnonymousClass3Ma.A1V(this.A0H, r7);
        C42141xh BGE = this.A0J.BGE(getContext(), this.A0I);
        if (this.A0f) {
            BGE.A09(r7, (C43351zf) null, (List) null, 1.0f);
        } else {
            BGE.A05(r7);
        }
        AnonymousClass1BI r5 = r7.A0J;
        RequestPhoneNumberViewModel requestPhoneNumberViewModel = this.A0Z;
        if (requestPhoneNumberViewModel != null && this.A0K != null && (r5 instanceof AnonymousClass1E2)) {
            C18070vi.A0d(r5, 0);
            AnonymousClass1DT r3 = requestPhoneNumberViewModel.A01;
            requestPhoneNumberViewModel.A05.CGF(new C21433Ak0(requestPhoneNumberViewModel, r5, 18));
            r3.A0A(this.A0K, this.A0o);
        }
    }

    public void setContactChatStatus(String str) {
        if (C18020vd.A05(C18040vf.A02, this.A0P, 5839)) {
            setContactStatusHelper(str);
        } else {
            this.A0h.setText(str);
        }
    }

    public void setContactChatStatusVisibility(int i) {
        if (!C18020vd.A05(C18040vf.A02, this.A0P, 5839)) {
            this.A0h.setVisibility(i);
        }
    }

    public void setCurrencyIcon(C63572tK r6) {
        Context context = this.A04.getContext();
        C18070vi.A0d(context, 0);
        int A002 = AnonymousClass3Ma.A00(context, 2130971952, 2131103094);
        Context context2 = this.A04.getContext();
        C63572tK A022 = this.A0S.A02();
        if (A022 == null || A022.A02() == null) {
            this.A04.setVisibility(8);
            AnonymousClass190 r3 = this.A0F;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Currency icon for country ");
            A10.append(r6.A03);
            r3.A0G("ContactDetailsCard/PayButton", AnonymousClass000.A0y(" missing", A10), true);
            return;
        }
        C18070vi.A0d(context2, 0);
        AnonymousClass26n r2 = new AnonymousClass26n(C50802Vv.A00(context2), ((AnonymousClass1KL) A022.A02()).BPn(context2, 0), A002, AnonymousClass3MZ.A01(context2, 2131169467));
        ((WDSActionTile) this.A04).setText(2131888773);
        ((WDSActionTile) this.A04).setIcon((Drawable) r2);
    }

    public void setSubTitle(String str) {
        this.A0B.setText(str);
        this.A0B.setVisibility(C72453Mb.A01(str.isEmpty() ? 1 : 0));
    }

    public void setSubtitleOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A0B.setOnLongClickListener(onLongClickListener);
    }

    public void setTitleOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A0I.setOnLongClickListener(onLongClickListener);
    }

    public void setUsername(String str) {
        TextView textView;
        int i;
        this.A0i.setText(str);
        if (str.isEmpty() || this.A0I.getText().equals(str)) {
            textView = this.A0i;
            i = 8;
        } else {
            textView = this.A0i;
            i = 0;
        }
        textView.setVisibility(i);
    }

    public ContactDetailsCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void setPhoneHiddenBubbleText(Uri uri) {
        this.A0j.setText(this.A0b.A03(this.A0j.getContext(), AnonymousClass3MW.A0x(getResources(), uri.toString(), AnonymousClass3MW.A1a(), 0, 2131894636)), TextView.BufferType.SPANNABLE);
        AnonymousClass3Ma.A1I(this.A0j, this.A0P);
    }

    public void onFinishInflate() {
        C30911ei A002;
        super.onFinishInflate();
        this.A0I = AnonymousClass3MX.A0V(this, 2131429465);
        if (this.A0n) {
            AnonymousClass1FY r0 = (AnonymousClass1FY) C72453Mb.A0L(this);
            this.A0K = r0;
            this.A0U = (BrazilGetPixInfoViewModel) AnonymousClass3MW.A0N(r0).A00(BrazilGetPixInfoViewModel.class);
            C28931bI A003 = C28931bI.A00(this, 2131427515);
            C30911ei A004 = this.A0T.A00();
            if (A004 != null) {
                if (C18020vd.A05(C18040vf.A02, A004.A00, 12356)) {
                    this.A06 = C72463Mc.A0N(A003);
                }
            }
            A003.A04(8);
        }
        if (this.A0m) {
            this.A04 = AnonymousClass1HF.A06(this, 2131427513);
        }
        if (this.A0k) {
            this.A01 = AnonymousClass1HF.A06(this, 2131427471);
            this.A03 = AnonymousClass1HF.A06(this, 2131427487);
            this.A02 = AnonymousClass1HF.A06(this, 2131427486);
            this.A09 = AnonymousClass1HF.A06(this, 2131427509);
            this.A08 = AnonymousClass1HF.A06(this, 2131427520);
            this.A0A = AnonymousClass1HF.A06(this, 2131427535);
            this.A07 = AnonymousClass1HF.A06(this, 2131427517);
        }
        this.A0B = AnonymousClass3MW.A0J(this, 2131429459);
        this.A0i = AnonymousClass3MW.A0J(this, 2131429470);
        this.A0h = AnonymousClass3MW.A0J(this, 2131429391);
        if (this.A0l) {
            this.A05 = AnonymousClass1HF.A06(this, 2131433794);
            this.A0j = AnonymousClass3MW.A0J(this, 2131433795);
        }
        if (getContext() instanceof AnonymousClass1FY) {
            AnonymousClass1FY r02 = (AnonymousClass1FY) C72453Mb.A0L(this);
            this.A0K = r02;
            C24071It A0N2 = AnonymousClass3MW.A0N(r02);
            if (this.A0m) {
                this.A0V = this.A0W.A00(getContext(), this.A0K, (AnonymousClass8FO) A0N2.A00(AnonymousClass8FO.class), (Runnable) null, new AnonymousClass7R9((Object) this, 44), false);
            }
            if (this.A0l) {
                RequestPhoneNumberViewModel requestPhoneNumberViewModel = (RequestPhoneNumberViewModel) A0N2.A00(RequestPhoneNumberViewModel.class);
                this.A0Z = requestPhoneNumberViewModel;
                this.A0Y = this.A0G.A00(this.A0K, requestPhoneNumberViewModel);
            }
        }
        C18030ve r1 = this.A0P;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r1, 5839)) {
            TextView textView = this.A0h;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextSwitcher textSwitcher = (TextSwitcher) findViewById(2131435710);
            this.A0g = textSwitcher;
            if (textSwitcher != null) {
                textSwitcher.setInAnimation(getContext(), 2130772020);
                this.A0g.setOutAnimation(getContext(), 2130772022);
            }
        }
        if (findViewById(2131429431) != null) {
            C19880zA r12 = this.A0C;
            if (r12.A07()) {
                r12.A03();
                throw AnonymousClass000.A0s("getSmbContactNoteCardLayoutId");
            }
        }
        if (!(this instanceof NewsletterDetailsCard)) {
            C89884dB.A00(this.A09, this, 32);
            C89884dB.A00(this.A08, this, 33);
            C89884dB.A00(this.A03, this, 34);
            C30911ei A005 = this.A0T.A00();
            if (A005 == null || !C18020vd.A05(r2, A005.A00, 12356) || (A002 = this.A0T.A00()) == null || !C18020vd.A05(r2, A002.A00, 10897)) {
                C89884dB.A00(this.A04, this, 35);
            }
            C89884dB.A00(this.A02, this, 36);
            C89884dB.A00(this.A0A, this, 37);
            C89884dB.A00(this.A07, this, 38);
            View view = this.A06;
            if (view != null) {
                AnonymousClass48l.A00(view, this, 42);
            }
        }
    }

    public void setContactInfoLoggingEvent(C81743zj r1) {
        this.A0Q = r1;
    }

    public void setContactNote(AnonymousClass1E7 r1) {
    }

    public void setContactTextStatus(String str) {
        setContactStatusHelper(str);
    }

    public void setInteropContactInfo(boolean z) {
        this.A0e = z;
    }

    public void setPaymentEligibility(int i) {
        this.A00 = i;
    }

    public void setProfileEntryPoint(Integer num) {
    }

    public ContactDetailsCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
    }

    public ContactDetailsCard(Context context) {
        super(context);
        A02();
    }
}
