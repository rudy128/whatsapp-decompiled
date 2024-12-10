package X;

import android.text.SpannableStringBuilder;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.text.ReadMoreTextView;
import java.util.List;

/* renamed from: X.4mv  reason: invalid class name and case insensitive filesystem */
public class C95864mv implements C107355Zj {
    public final int A00;
    public final Object A01;

    public C95864mv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void CDU(String str) {
        SpannableStringBuilder spannableStringBuilder;
        switch (this.A00) {
            case 0:
                ListChatInfoActivity listChatInfoActivity = (ListChatInfoActivity) this.A01;
                if (!listChatInfoActivity.A0A.A0I(listChatInfoActivity.A0I).equals(str)) {
                    AnonymousClass1E7 r1 = listChatInfoActivity.A0I;
                    r1.A0R = str;
                    listChatInfoActivity.A0E.A0X(r1);
                    listChatInfoActivity.A0G.A03(listChatInfoActivity.A4l(), str);
                    ListChatInfoActivity.A11(listChatInfoActivity);
                    listChatInfoActivity.A0I.A02(listChatInfoActivity.A4l());
                    return;
                }
                return;
            case 1:
                ((GroupChatInfoActivity) this.A01).A19.A00(str);
                return;
            case 2:
                GroupChatInfoActivity.A1J((GroupChatInfoActivity) this.A01, str);
                return;
            default:
                NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) this.A01;
                C46162Dk A0y = NewsletterInfoActivity.A0y(newsletterInfoActivity);
                if (A0y != null) {
                    String str2 = null;
                    String A0I = AnonymousClass1YF.A0I(str);
                    if (A0I != null && !AnonymousClass1YF.A0T(A0I)) {
                        str2 = A0I;
                    }
                    if (!C18070vi.A18(str2, A0y.A0Q)) {
                        if (str2 != null) {
                            AnonymousClass11C r5 = newsletterInfoActivity.A08;
                            C18010vc r2 = newsletterInfoActivity.A0n;
                            if (r2 != null) {
                                ReadMoreTextView readMoreTextView = newsletterInfoActivity.A0q;
                                if (readMoreTextView != null) {
                                    spannableStringBuilder = AnonymousClass3MW.A09(C26302CxJ.A0C(r5, r2, C43251zV.A03(newsletterInfoActivity, readMoreTextView.getPaint(), newsletterInfoActivity.A0D, str2)));
                                    AnonymousClass00H r0 = newsletterInfoActivity.A0x;
                                    if (r0 != null) {
                                        C36401np r12 = (C36401np) r0.get();
                                        ReadMoreTextView readMoreTextView2 = newsletterInfoActivity.A0q;
                                        if (readMoreTextView2 != null) {
                                            r12.A08(readMoreTextView2.getContext(), spannableStringBuilder);
                                        }
                                    } else {
                                        AnonymousClass3MW.A1E();
                                        throw null;
                                    }
                                }
                                C18070vi.A11("descriptionTextView");
                                throw null;
                            }
                            C18070vi.A11("sharedPreferencesFactory");
                            throw null;
                        }
                        spannableStringBuilder = null;
                        ReadMoreTextView readMoreTextView3 = newsletterInfoActivity.A0q;
                        if (readMoreTextView3 != null) {
                            readMoreTextView3.A0S(spannableStringBuilder, (List) null, 0, false);
                            C96844oV r6 = new C96844oV(newsletterInfoActivity, 1);
                            AnonymousClass440 r02 = newsletterInfoActivity.A0m;
                            if (r02 == null) {
                                C18070vi.A11("newsletterViewModel");
                                throw null;
                            }
                            C29681ch A0M = A0y.A0M();
                            C18070vi.A0d(A0M, 0);
                            r02.A03.A0C(A0M, r6, (String) null, str2, (byte[]) null, true, false);
                            return;
                        }
                        C18070vi.A11("descriptionTextView");
                        throw null;
                    }
                    return;
                }
                return;
        }
    }
}
