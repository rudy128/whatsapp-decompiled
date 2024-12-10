package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.bot.BonsaiSystemMessageBottomSheet;
import com.whatsapp.bot.metaai.imageinput.disclosure.MetaAiImageInputDisclosureBottomSheet;
import com.whatsapp.util.Log;

/* renamed from: X.1Ps  reason: invalid class name and case insensitive filesystem */
public final class C25811Ps {
    public final C25731Pk A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final C18100vl A04 = new C18110vm(C25821Pt.A00);
    public final AnonymousClass1PW A05;
    public final C25781Pp A06;
    public final C25721Pj A07;
    public final C18000vb A08;
    public final C25801Pr A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;

    public C25811Ps(C25731Pk r3, AnonymousClass1PW r4, C25781Pp r5, C25721Pj r6, C18000vb r7, C25801Pr r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        C18070vi.A0d(r9, 1);
        C18070vi.A0d(r10, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r3, 4);
        C18070vi.A0d(r7, 5);
        C18070vi.A0d(r11, 6);
        C18070vi.A0d(r12, 7);
        C18070vi.A0d(r13, 8);
        C18070vi.A0d(r14, 9);
        C18070vi.A0d(r6, 10);
        C18070vi.A0d(r15, 11);
        C18070vi.A0d(r5, 12);
        C18070vi.A0d(r8, 13);
        this.A0A = r9;
        this.A0B = r10;
        this.A05 = r4;
        this.A00 = r3;
        this.A08 = r7;
        this.A02 = r11;
        this.A03 = r12;
        this.A0C = r13;
        this.A0D = r14;
        this.A07 = r6;
        this.A01 = r15;
        this.A06 = r5;
        this.A09 = r8;
    }

    public static final void A00(Bundle bundle, C125786bg r4, String str) {
        C18070vi.A0d(str, 1);
        C18070vi.A0d(bundle, 2);
        if (str.hashCode() == 1905382724 && str.equals("IMAGINE_BOTTOM_SHEET_REQUEST_KEY")) {
            boolean z = bundle.getBoolean("IMAGINE_BOTTOM_SHEET_SEND_RESULT");
            C115095tO r2 = r4.A00;
            C88184Yq r1 = r2.A0J;
            if (r1 != null) {
                if (z) {
                    r1.A03(17);
                } else {
                    r1.A02(17);
                }
            }
            if (C87544Vz.A01(r2.A0Q)) {
                r2.A0K();
            } else {
                C115095tO.A07(r2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r12 == false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A01(android.view.ViewGroup r8, X.C18090vk r9, X.C18090vk r10, X.C18090vk r11, boolean r12) {
        /*
            r7 = this;
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            if (r11 == 0) goto L_0x0009
            r6 = 1
            if (r12 != 0) goto L_0x000a
        L_0x0009:
            r6 = 0
        L_0x000a:
            X.1Pr r5 = r7.A09
            X.00H r4 = r7.A0D
            r2 = 0
            android.content.Context r0 = r8.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131624777(0x7f0e0349, float:1.8876743E38)
            android.view.View r0 = r1.inflate(r0, r8, r2)
            X.C18070vi.A0X(r0)
            X.2fQ r3 = new X.2fQ
            r3.<init>(r0, r5, r4, r6)
            com.whatsapp.WaImageView r2 = r3.A02
            r1 = 38
            X.AFB r0 = new X.AFB
            r0.<init>(r9, r1)
            r2.setOnClickListener(r0)
            com.whatsapp.WaImageView r2 = r3.A01
            r1 = 37
            X.AFB r0 = new X.AFB
            r0.<init>(r10, r1)
            r2.setOnClickListener(r0)
            if (r11 == 0) goto L_0x004c
            X.1bI r2 = r3.A04
            r1 = 38
            X.78Q r0 = new X.78Q
            r0.<init>((java.lang.Object) r3, (java.lang.Object) r11, (int) r1)
            r2.A05(r0)
        L_0x004c:
            android.view.View r0 = r3.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25811Ps.A01(android.view.ViewGroup, X.0vk, X.0vk, X.0vk, boolean):android.view.View");
    }

    public String A05(Context context, AnonymousClass1BI r7, String str) {
        if (C42701yb.A01(r7)) {
            C17960vV.A07(r7);
            String str2 = r7.user;
            int i = 2131887312;
            if (r7 instanceof C42711yc) {
                i = 2131887311;
            }
            return context.getString(i, new Object[]{str, str2, "5"});
        }
        Log.w("BonsaiUIUtilImpl/getShareLinkForBot contact jid is not a bot or null");
        return null;
    }

    public void A06(TextView textView, int i, boolean z) {
        C18070vi.A0d(textView, 0);
        if (z) {
            Context context = textView.getContext();
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165497);
            Drawable A002 = C24261Jm.A00(context, 2131232432);
            if (A002 != null) {
                A002.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                C18000vb r2 = this.A08;
                if (C18000vb.A00(r2).A06) {
                    textView.setCompoundDrawables(new C74743cP(A002, r2), (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    textView.setCompoundDrawables((Drawable) null, (Drawable) null, A002, (Drawable) null);
                }
            }
        } else {
            C27641Ww.A0B(textView, this.A08, 2131232432);
        }
        C18000vb r1 = this.A08;
        int A003 = C19740yt.A00(textView.getContext(), i);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        char c = 2;
        if (C18000vb.A00(r1).A06) {
            c = 0;
        }
        compoundDrawables[c].setColorFilter(A003, PorterDuff.Mode.SRC_IN);
    }

    public void A07(AnonymousClass1FU r11, AnonymousClass86Z r12, C1598286a r13, C1598386b r14) {
        C18070vi.A0d(r11, 0);
        this.A07.A03(r11, r12, r13, r14, (C134526qj) null, AnonymousClass6RD.INVOKE_TOS, 4, false);
    }

    public void A09(AnonymousClass1FU r5, boolean z) {
        AnonymousClass4CO r0;
        C18070vi.A0d(r5, 0);
        BonsaiSystemMessageBottomSheet bonsaiSystemMessageBottomSheet = new BonsaiSystemMessageBottomSheet();
        Bundle bundle = new Bundle();
        if (z) {
            r0 = AnonymousClass4CO.USER_AGENT;
        } else {
            r0 = AnonymousClass4CO.INVOKE;
        }
        bundle.putInt("ARG_TYPE_ORDINAL", r0.ordinal());
        bonsaiSystemMessageBottomSheet.A1R(bundle);
        r5.CMl(bonsaiSystemMessageBottomSheet);
    }

    public boolean A0C(AnonymousClass1GP r5, C18090vk r6) {
        C18070vi.A0d(r5, 0);
        if (((SharedPreferences) ((C38731rn) this.A0D.get()).A01.getValue()).getBoolean("meta_ai_image_input_disclosure_seen", false)) {
            return false;
        }
        if (r5.A0Q("MetaAiImageInputDisclosureBottomSheet") == null) {
            MetaAiImageInputDisclosureBottomSheet metaAiImageInputDisclosureBottomSheet = new MetaAiImageInputDisclosureBottomSheet();
            metaAiImageInputDisclosureBottomSheet.A2C(r5, "MetaAiImageInputDisclosureBottomSheet");
            metaAiImageInputDisclosureBottomSheet.A04 = new AnonymousClass3H6(r6);
        }
        return true;
    }

    public boolean A0F(AnonymousClass206 r3) {
        return (r3 instanceof AnonymousClass210) && AnonymousClass2UX.A00(r3) != null && C87494Vu.A00(r3) && !r3.A0z(256) && ((AnonymousClass1UD) this.A0B.get()).A06();
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0G(java.util.Collection r5) {
        /*
            r4 = this;
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            boolean r0 = r5.isEmpty()
            r3 = 0
            if (r0 != 0) goto L_0x002a
            java.util.Iterator r2 = r5.iterator()
        L_0x000f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0029
            r0 = 3
            if (r1 == r0) goto L_0x0029
            r0 = 13
            if (r1 != r0) goto L_0x000f
        L_0x0029:
            r3 = 1
        L_0x002a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25811Ps.A0G(java.util.Collection):boolean");
    }

    public AnonymousClass1E7 A02() {
        C42961z1 r1 = (C42961z1) this.A02.get();
        if (r1.A08 == null) {
            C42961z1.A00(r1, false);
        }
        return r1.A08;
    }

    public String A03() {
        String A012 = C18020vd.A01(C18040vf.A01, (C18020vd) this.A0A.get(), 11614);
        C18070vi.A0X(A012);
        return (String) C29431cG.A0b(AnonymousClass1YF.A0S(A012, new String[]{","}, 0));
    }

    public String A04() {
        String A012 = C18020vd.A01(C18040vf.A01, (C18020vd) this.A0A.get(), 11614);
        C18070vi.A0X(A012);
        return (String) C29431cG.A0d(AnonymousClass1YF.A0S(A012, new String[]{","}, 0));
    }

    public void A08(AnonymousClass1FU r13, Integer num, int i) {
        C25721Pj r3 = this.A07;
        AnonymousClass18K r2 = r3.A04;
        C47192Hl r1 = new C47192Hl();
        r1.A02 = 61;
        r1.A05 = num;
        r1.A0E = C50542Uv.A00();
        r2.CC7(r1);
        AnonymousClass6RD r9 = AnonymousClass6RD.AI_STUDIO_TOS;
        r3.A03(r13, (AnonymousClass86Z) null, (C1598286a) null, new C66402y7(r13, r3, num, i), (C134526qj) null, r9, num, false);
    }

    public void A0A(AnonymousClass1BI r3, int i, int i2) {
        C25781Pp r1 = this.A06;
        if (r3 != null) {
            r1.A04(r3, i, i2, true);
        }
    }

    public boolean A0B() {
        if (!((AnonymousClass1UD) this.A0B.get()).A09()) {
            return false;
        }
        return C38771rr.A00((C38771rr) this.A0C.get()).getBoolean("bonsai_meta_ai_button_setting_enabled", true);
    }

    public boolean A0D(AnonymousClass1BI r3) {
        if (r3 == null || !C42701yb.A01(r3) || !((AnonymousClass1UD) this.A0B.get()).A06()) {
            return false;
        }
        return true;
    }

    public boolean A0E(AnonymousClass1BI r4) {
        if (C42701yb.A01(r4)) {
            AnonymousClass00H r1 = this.A0B;
            if (((AnonymousClass1UD) r1.get()).A0B()) {
                if (C18020vd.A05(C18040vf.A01, ((AnonymousClass1UD) r1.get()).A00, 8684)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
