package X;

import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.newsletter.viewmodel.NewsletterViewModel$fetchSimilarNewsletters$1;

/* renamed from: X.5Rn  reason: invalid class name and case insensitive filesystem */
public final class C105315Rn extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C77853rb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105315Rn(C77853rb r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        int i;
        C77853rb r5 = this.this$0;
        Integer num = ((C86954Ts) obj).A01;
        if (r5.A05) {
            r5.A05 = false;
        } else {
            int intValue = num.intValue();
            if (intValue != 2) {
                if (intValue == 0) {
                    str = C18070vi.A0F(r5.A01, 2131893087);
                    i = 17;
                } else if (intValue != 1) {
                    if (intValue == 7) {
                        Menu menu = r5.A00;
                        if (menu != null) {
                            MenuItem findItem = menu.findItem(63);
                            if (findItem != null && findItem.isVisible()) {
                                findItem.setVisible(false);
                                C77853rb.A0A(r5, true);
                            }
                        }
                    } else if (intValue == 8) {
                        Menu menu2 = r5.A00;
                        if (menu2 != null) {
                            MenuItem findItem2 = menu2.findItem(63);
                            if (findItem2 != null) {
                                if (!findItem2.isVisible()) {
                                    findItem2.setVisible(true);
                                }
                            }
                            C77853rb.A0A(r5, true);
                        }
                    }
                    C18070vi.A11("menu");
                    throw null;
                } else {
                    str = C18070vi.A0F(r5.A01, 2131893088);
                    i = 18;
                }
                C77853rb.A08(r5, str, new AnonymousClass5Af(r5, i));
            } else {
                if (C18020vd.A05(C18040vf.A02, r5.A0E, 7472)) {
                    r5.A09.BjQ();
                    AnonymousClass440 r3 = r5.A0A;
                    AnonymousClass3MX.A1Q(new NewsletterViewModel$fetchSimilarNewsletters$1(r3, (C30391dr) null), C41561wd.A00(r3));
                } else {
                    C46162Dk A03 = C77853rb.A03(r5);
                    if (A03 != null) {
                        C77853rb.A08(r5, AnonymousClass3Ma.A10(r5.A01, A03.A0T, AnonymousClass3MW.A1a(), 0, 2131890492), new AnonymousClass5Af(r5, 16));
                    }
                }
                if (r5.A0A.A0U() != null && !AnonymousClass1c4.A02(r5.A08, 0)) {
                    C98774rh.A01(r5.A0J, r5, 21);
                }
            }
        }
        return C27621Wu.A00;
    }
}
