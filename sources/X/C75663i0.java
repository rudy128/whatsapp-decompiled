package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.autodelete.NewsletterMediaSettingActivity;
import com.whatsapp.autodelete.NewsletterMediaSettingGlobalActivity;
import com.whatsapp.wds.components.list.footer.WDSSectionFooter;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;

/* renamed from: X.3i0  reason: invalid class name and case insensitive filesystem */
public abstract class C75663i0 extends C75113e1 {
    public AnonymousClass129 A00;
    public C36401np A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;

    public String A4b() {
        if (this instanceof NewsletterMediaSettingGlobalActivity) {
            return C18070vi.A0F(this, 2131886808);
        }
        NewsletterMediaSettingActivity newsletterMediaSettingActivity = (NewsletterMediaSettingActivity) this;
        Object[] A1a = AnonymousClass3MW.A1a();
        String str = newsletterMediaSettingActivity.A01;
        if (str != null) {
            return AnonymousClass3Ma.A10(newsletterMediaSettingActivity, str, A1a, 0, 2131886809);
        }
        C18070vi.A11("newsletterName");
        throw null;
    }

    public final void A4c(boolean z) {
        String A0F;
        String str;
        AnonymousClass200 r5;
        int i;
        String A0F2;
        Toolbar A0F3 = AnonymousClass3Ma.A0F(this);
        AnonymousClass3NL.A02(A0F3.getContext(), A0F3, this.A00, 2131231675);
        A0F3.setTitle(2131886806);
        A0F3.setBackgroundResource(AnonymousClass4Z9.A01(AnonymousClass3MY.A04(A0F3), false));
        A0F3.A0Q(A0F3.getContext(), 2132083960);
        setSupportActionBar(A0F3);
        A0F3.setNavigationOnClickListener(new AnonymousClass78J(this, 6));
        View A0A = C110885hR.A0A(this, 2131435240);
        if (A0A instanceof ViewStub) {
            ViewStub viewStub = (ViewStub) A0A;
            int i2 = 2131624241;
            if (AnonymousClass3MX.A1U(this)) {
                i2 = 2131627597;
            }
            A0A = AnonymousClass3MY.A0G(viewStub, i2);
        }
        if (A0A instanceof WaTextView) {
            TextView textView = (TextView) A0A;
            if (this instanceof NewsletterMediaSettingGlobalActivity) {
                A0F2 = C18070vi.A0F(this, 2131886810);
            } else {
                A0F2 = C18070vi.A0F(this, 2131886811);
            }
            textView.setText(A0F2);
        } else if (A0A instanceof WDSSectionHeader) {
            WDSSectionHeader wDSSectionHeader = (WDSSectionHeader) A0A;
            if (this instanceof NewsletterMediaSettingGlobalActivity) {
                A0F = C18070vi.A0F(this, 2131886810);
            } else {
                A0F = C18070vi.A0F(this, 2131886811);
            }
            wDSSectionHeader.setHeaderText(A0F);
        }
        if (this instanceof NewsletterMediaSettingGlobalActivity) {
            AnonymousClass00H r0 = this.A02;
            if (r0 != null) {
                r5 = C50482Up.A00(C18070vi.A03(((AnonymousClass4MA) ((AnonymousClass4M9) r0.get()).A01.get()).A01).getInt("newsletter_auto_media_delete_mode", AnonymousClass200.OFF.value));
            }
            str = "autoDeleteMediaManager";
            C18070vi.A11(str);
            throw null;
        }
        NewsletterMediaSettingActivity newsletterMediaSettingActivity = (NewsletterMediaSettingActivity) this;
        AnonymousClass00H r02 = newsletterMediaSettingActivity.A02;
        if (r02 != null) {
            AnonymousClass4M9 r03 = (AnonymousClass4M9) r02.get();
            C29681ch r1 = newsletterMediaSettingActivity.A00;
            if (r1 == null) {
                str = "newsletterJid";
                C18070vi.A11(str);
                throw null;
            }
            r5 = r03.A00.A0a(r1).A0C;
        }
        str = "autoDeleteMediaManager";
        C18070vi.A11(str);
        throw null;
        CompoundButton compoundButton = (CompoundButton) C110885hR.A0A(this, 2131429852);
        boolean z2 = true;
        if (z) {
            AnonymousClass00H r04 = this.A02;
            if (r04 != null) {
                int ordinal = C50482Up.A00(C18070vi.A03(((AnonymousClass4MA) ((AnonymousClass4M9) r04.get()).A01.get()).A01).getInt("newsletter_auto_media_delete_mode", AnonymousClass200.OFF.value)).ordinal();
                if (ordinal != 1) {
                    i = 2131886802;
                    if (ordinal != 0) {
                        if (ordinal != 2) {
                            throw AnonymousClass3MW.A14();
                        }
                        throw AnonymousClass000.A0n("Auto delete media global setting can't be default");
                    }
                } else {
                    i = 2131886803;
                }
                compoundButton.setText(C18070vi.A0F(this, i));
                AnonymousClass200 r12 = AnonymousClass200.DEFAULT;
                AnonymousClass3MY.A19(compoundButton, r12.value);
                compoundButton.setChecked(AnonymousClass000.A1Z(r5, r12));
                compoundButton.setVisibility(0);
            }
            str = "autoDeleteMediaManager";
            C18070vi.A11(str);
            throw null;
        }
        compoundButton.setVisibility(8);
        CompoundButton compoundButton2 = (CompoundButton) C110885hR.A0A(this, 2131433266);
        compoundButton2.setText(2131886805);
        AnonymousClass200 r13 = AnonymousClass200.ON;
        AnonymousClass3MY.A19(compoundButton2, r13.value);
        compoundButton2.setChecked(AnonymousClass000.A1Z(r5, r13));
        CompoundButton compoundButton3 = (CompoundButton) C110885hR.A0A(this, 2131433250);
        compoundButton3.setText(2131886804);
        AnonymousClass200 r14 = AnonymousClass200.OFF;
        AnonymousClass3MY.A19(compoundButton3, r14.value);
        if (r5 != r14) {
            z2 = false;
        }
        compoundButton3.setChecked(z2);
        ((RadioGroup) C110885hR.A0A(this, 2131427930)).setOnCheckedChangeListener(new C90894eo(this, 0));
        View A0A2 = C110885hR.A0A(this, 2131427929);
        if (A0A2 instanceof ViewStub) {
            ViewStub viewStub2 = (ViewStub) A0A2;
            int i3 = 2131624240;
            if (AnonymousClass3MX.A1U(this)) {
                i3 = 2131627594;
            }
            A0A2 = AnonymousClass3MY.A0G(viewStub2, i3);
        }
        if (A0A2 instanceof TextEmojiLabel) {
            TextView textView2 = (TextView) A0A2;
            C36401np r15 = this.A01;
            if (r15 != null) {
                textView2.setText(r15.A06(textView2.getContext(), new C21457AkO((Object) this, 1), A4b(), "learn-more", C72473Md.A05(textView2)));
                AnonymousClass3Ma.A1I(textView2, this.A0E);
                return;
            }
            str = "linkifier";
            C18070vi.A11(str);
            throw null;
        } else if (A0A2 instanceof WDSSectionFooter) {
            ((WDSSectionFooter) A0A2).setFooterTextWithLink(A4b(), "learn-more", AnonymousClass4DZ.A02, new C39441t5(this.A0E), new C21457AkO((Object) this, 2));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624239);
    }

    public void onBackPressed() {
        C72453Mb.A14(this);
    }
}
