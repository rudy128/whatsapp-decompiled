package X;

import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.ui.delete.DeleteNewsletterActivity;
import com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity;
import com.whatsapp.phonematching.CountryAndPhoneNumberFragment;
import com.whatsapp.phonematching.MatchPhoneNumberFragment;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.43w  reason: invalid class name and case insensitive filesystem */
public abstract class C822343w extends C75153e5 implements C108755cF, AnonymousClass5Y8 {
    public C27201Vd A00;
    public C25011Mn A01;
    public C85034Lv A02;
    public final C18100vl A03 = AnonymousClass1DF.A01(new AnonymousClass5JI(this));
    public final C72293Lj A04 = new C96984oj(this, 1);
    public final AnonymousClass00H A05 = C217517g.A00(16449);

    public void BIv() {
    }

    public C83004Cz A4b() {
        if (this instanceof NewsletterTransferOwnershipActivity) {
            return C83004Cz.TRANSFER_OWNERSHIP;
        }
        return C83004Cz.DELETE;
    }

    public void Bpm() {
    }

    public void CE1(C85034Lv r4) {
        this.A02 = r4;
        C72293Lj r1 = this.A04;
        C18070vi.A0d(r1, 0);
        ((C37191p7) this.A05.get()).A00.add(r1);
    }

    public boolean CHU(String str, String str2) {
        C25011Mn r0 = this.A01;
        if (r0 != null) {
            return r0.A06(str, str2);
        }
        C18070vi.A11("sendMethods");
        throw null;
    }

    public void CN9() {
    }

    public void CQE() {
        C72293Lj r1 = this.A04;
        C18070vi.A0d(r1, 0);
        ((C37191p7) this.A05.get()).A00.remove(r1);
        this.A02 = null;
    }

    public static final void A0V(C822343w r2) {
        Fragment A0O = r2.getSupportFragmentManager().A0O(2131433788);
        if (A0O != null) {
            C34001jj A0H = AnonymousClass3Ma.A0H(r2);
            A0H.A07(A0O);
            A0H.A02();
        }
        DialogFragment dialogFragment = (DialogFragment) r2.getSupportFragmentManager().A0Q("owner_action_confirmation");
        if (dialogFragment != null) {
            dialogFragment.A29();
        }
    }

    public void Bxc() {
        String str;
        A0V(this);
        if (this instanceof NewsletterTransferOwnershipActivity) {
            NewsletterTransferOwnershipActivity newsletterTransferOwnershipActivity = (NewsletterTransferOwnershipActivity) this;
            C18100vl r3 = newsletterTransferOwnershipActivity.A02;
            r3.getValue();
            C18100vl r2 = newsletterTransferOwnershipActivity.A03;
            if (r2.getValue() == null || r3.getValue() == null) {
                newsletterTransferOwnershipActivity.finish();
                return;
            }
            newsletterTransferOwnershipActivity.CNA(2131897129);
            AnonymousClass4RH r1 = newsletterTransferOwnershipActivity.A00;
            if (r1 != null) {
                C29681ch A0o = AnonymousClass3MX.A0o(r2);
                C18070vi.A0z(A0o, "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid");
                UserJid userJid = (UserJid) r3.getValue();
                C18070vi.A0z(userJid, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                C96844oV r7 = new C96844oV(newsletterTransferOwnershipActivity, 3);
                C18070vi.A0h(A0o, userJid);
                AnonymousClass4KL r0 = r1.A04;
                if (r0 != null) {
                    AnonymousClass10E r12 = r0.A00.A00;
                    new C175128y6(AnonymousClass3Ma.A0l(r12), A0o, userJid, r7, (AnonymousClass5Y9) r12.A7S.get(), (C20131A8r) r12.A7I.get(), AnonymousClass10E.AL1(r12)).A01();
                    return;
                }
                str = "newsletterTransferOwnershipHandler";
            } else {
                str = "newsletterMultiAdminManager";
            }
        } else {
            DeleteNewsletterActivity deleteNewsletterActivity = (DeleteNewsletterActivity) this;
            C18100vl r22 = deleteNewsletterActivity.A03;
            if (r22.getValue() == null) {
                AnonymousClass3Ma.A1J(deleteNewsletterActivity.A05, deleteNewsletterActivity, 43);
            }
            deleteNewsletterActivity.CNA(2131889343);
            C35681md r32 = deleteNewsletterActivity.A01;
            if (r32 != null) {
                C29681ch A0o2 = AnonymousClass3MX.A0o(r22);
                C18070vi.A0z(A0o2, "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid");
                r32.A0B(A0o2, new C96844oV(deleteNewsletterActivity, 2));
                return;
            }
            str = "newsletterManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void Byf() {
        CountryAndPhoneNumberFragment countryAndPhoneNumberFragment;
        Fragment A0O = getSupportFragmentManager().A0O(2131433788);
        if ((A0O instanceof MatchPhoneNumberFragment) && (countryAndPhoneNumberFragment = (CountryAndPhoneNumberFragment) A0O) != null) {
            String A0F = C18070vi.A0F(this, 2131889268);
            TextView textView = countryAndPhoneNumberFragment.A03;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = countryAndPhoneNumberFragment.A03;
            if (textView2 != null) {
                textView2.setText(A0F);
            }
            WaEditText waEditText = countryAndPhoneNumberFragment.A06;
            if (waEditText != null) {
                waEditText.requestFocus();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        String str;
        boolean z;
        C39261sm r3;
        int i3;
        String A10;
        super.onCreate(bundle);
        boolean z2 = this instanceof NewsletterTransferOwnershipActivity;
        if (z2) {
            i = 2131624091;
        } else {
            i = 2131624085;
        }
        setContentView(i);
        Toolbar A0G = AnonymousClass3Ma.A0G(this);
        if (z2) {
            i2 = 2131897127;
        } else {
            i2 = 2131889323;
        }
        A0G.setTitle(i2);
        C72473Md.A16(AnonymousClass3MY.A0K(this, A0G));
        C18100vl r1 = this.A03;
        if (r1.getValue() == null) {
            finish();
            return;
        }
        AnonymousClass1E7 r32 = new AnonymousClass1E7(AnonymousClass3MX.A0m(r1));
        WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) AnonymousClass3MY.A0C(this, 2131431496);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168065);
        C27201Vd r12 = this.A00;
        if (r12 != null) {
            r12.A06(this, "owner-action-newsletter").A0A(wDSProfilePhoto, r32, dimensionPixelSize);
            int A032 = C72463Mc.A03(this);
            if (z2) {
                z = false;
                r3 = new C39261sm(2131103088, A032, 0, 0);
                i3 = 2131233465;
            } else {
                z = false;
                r3 = new C39261sm(2131103332, A032, 0, 0);
                i3 = 2131231847;
            }
            wDSProfilePhoto.setProfileBadge(new AnonymousClass2QF(C39321ss.A00(), r3, i3, z));
            AnonymousClass3Ma.A19(C110885hR.A0A(this, 2131434059), this, 10);
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass3MY.A0C(this, 2131433131);
            if (z2) {
                NewsletterTransferOwnershipActivity newsletterTransferOwnershipActivity = (NewsletterTransferOwnershipActivity) this;
                Object value = newsletterTransferOwnershipActivity.A03.getValue();
                if (value == null || (A10 = C72473Md.A0j(newsletterTransferOwnershipActivity, value, 2131892906)) == null) {
                    A10 = "";
                }
            } else {
                DeleteNewsletterActivity deleteNewsletterActivity = (DeleteNewsletterActivity) this;
                AnonymousClass1E7 r13 = new AnonymousClass1E7(AnonymousClass3MX.A0m(deleteNewsletterActivity.A03));
                Object[] A1a = AnonymousClass3MW.A1a();
                C24921Me r0 = deleteNewsletterActivity.A00;
                if (r0 != null) {
                    A10 = AnonymousClass3Ma.A10(deleteNewsletterActivity, r0.A0I(r13), A1a, 0, 2131889326);
                } else {
                    str = "waContactNames";
                }
            }
            C72453Mb.A1L(textEmojiLabel, A10);
            AnonymousClass4W3.A00(AnonymousClass3MY.A0C(this, 2131428589), (ScrollView) AnonymousClass3MY.A0C(this, 2131434842));
            return;
        }
        str = "contactPhotos";
        C18070vi.A11(str);
        throw null;
    }
}
