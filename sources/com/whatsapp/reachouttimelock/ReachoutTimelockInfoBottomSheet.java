package com.whatsapp.reachouttimelock;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass11P;
import X.AnonymousClass18K;
import X.AnonymousClass1HF;
import X.AnonymousClass1MB;
import X.AnonymousClass1Y1;
import X.AnonymousClass1YL;
import X.AnonymousClass2HX;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NO;
import X.AnonymousClass48o;
import X.AnonymousClass4AI;
import X.AnonymousClass4CF;
import X.AnonymousClass4OE;
import X.AnonymousClass4Z9;
import X.AnonymousClass6P4;
import X.AnonymousClass7RB;
import X.C132896np;
import X.C139436yq;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18090vk;
import X.C19740yt;
import X.C19830z4;
import X.C21449AkG;
import X.C27881Xz;
import X.C36531o3;
import X.C38541rS;
import X.C43421zm;
import X.C64052u8;
import X.C88494Zy;
import X.C99434so;
import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;
import java.util.Iterator;

public final class ReachoutTimelockInfoBottomSheet extends Hilt_ReachoutTimelockInfoBottomSheet {
    public CountDownTimer A00;
    public C36531o3 A01;
    public AnonymousClass11P A02;
    public C19830z4 A03;
    public C18000vb A04;
    public C18030ve A05;
    public AnonymousClass1MB A06;
    public AnonymousClass4OE A07;
    public C132896np A08;
    public C38541rS A09;
    public AnonymousClass00H A0A;

    public void A21(Bundle bundle, View view) {
        String str;
        String str2;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        super.A21(bundle, view2);
        int i = AnonymousClass3MZ.A09(this).getDisplayMetrics().heightPixels;
        C17900vP.A0j("ReachoutTimelockInfoBottomSheet/creating sheet with height: ", AnonymousClass000.A10(), i);
        C38541rS r8 = this.A09;
        if (r8 != null) {
            Context A042 = AnonymousClass3MY.A04(view2);
            String A16 = AnonymousClass3MX.A16(this, "learn-more", new Object[1], 0, 2131894908);
            C18070vi.A0X(A16);
            SpannableStringBuilder A043 = r8.A04(A042, new AnonymousClass7RB((Object) this, 47), A16, "learn-more", AnonymousClass1YL.A00(view2.getContext(), 2130968627, 2131099690));
            C38541rS r82 = this.A09;
            if (r82 != null) {
                Context A044 = AnonymousClass3MY.A04(view2);
                String A0o = AnonymousClass3MY.A0o(this, "learn-more", 0, 2131894909);
                C18070vi.A0X(A0o);
                SpannableStringBuilder A045 = r82.A04(A044, new AnonymousClass7RB((Object) this, 48), A0o, "learn-more", AnonymousClass1YL.A00(view2.getContext(), 2130968627, 2131099690));
                WDSTextLayout wDSTextLayout = (WDSTextLayout) C18070vi.A05(view2, 2131435406);
                TextView A0E = C17880vN.A0E(view2, 2131430969);
                TextView A0E2 = C17880vN.A0E(view2, 2131429927);
                wDSTextLayout.setMinimumHeight((i * 3) / 4);
                AnonymousClass3MY.A1J(this, wDSTextLayout, 2131894910);
                if (A0E != null) {
                    C18030ve r1 = this.A05;
                    if (r1 != null) {
                        AnonymousClass3Ma.A1I(A0E, r1);
                    }
                    str = "abProps";
                    C18070vi.A11(str);
                    throw null;
                }
                if (A0E2 != null) {
                    C18030ve r12 = this.A05;
                    if (r12 != null) {
                        AnonymousClass3Ma.A1I(A0E2, r12);
                    }
                    str = "abProps";
                    C18070vi.A11(str);
                    throw null;
                }
                wDSTextLayout.setDescriptionText(A043);
                wDSTextLayout.setFootnoteText(A045);
                wDSTextLayout.setSecondaryButtonText(A1H(2131898783));
                wDSTextLayout.setSecondaryButtonClickListener(new AnonymousClass48o(this, 1));
                C88494Zy[] r4 = new C88494Zy[3];
                C88494Zy.A01(AnonymousClass3MY.A0n(this, 2131894905), (CharSequence) null, r4, 2131233239, 0);
                C88494Zy.A01(AnonymousClass3MY.A0n(this, 2131894907), (CharSequence) null, r4, 2131231719, 1);
                AnonymousClass4CF.A00(wDSTextLayout, C88494Zy.A00(A1H(2131894906), r4, 2131233382));
                ((WDSButton) C18070vi.A05(wDSTextLayout, 2131435001)).setVariant(C27881Xz.OUTLINE);
                Iterator A002 = C99434so.A00(C18070vi.A05(wDSTextLayout, 2131429513), 1);
                while (A002.hasNext()) {
                    View A0E3 = AnonymousClass3MX.A0E(A002);
                    int A012 = AnonymousClass3MW.A01(AnonymousClass3MZ.A09(this), 2131169544);
                    A0E3.setPadding(A012, A012, A012, A012);
                    View A062 = AnonymousClass1HF.A06(A0E3, 2131428481);
                    C18070vi.A0z(A062, "null cannot be cast to non-null type com.whatsapp.WaImageView");
                    ((ImageView) A062).setColorFilter(C19740yt.A00(A14(), AnonymousClass4Z9.A00(A14(), 2130971978)));
                }
                CircularProgressBar circularProgressBar = (CircularProgressBar) C18070vi.A05(view2, 2131436193);
                C19830z4 r0 = this.A03;
                if (r0 != null) {
                    long j = C17890vO.A0B(r0).getLong("TOwmL_end_time_in_ms", 0);
                    C19830z4 r42 = this.A03;
                    if (r42 != null) {
                        long j2 = j - C17890vO.A0B(r42).getLong("TOwmL_start_time_in_ms", 0);
                        circularProgressBar.A0I = true;
                        circularProgressBar.setMax((int) j2);
                        view2.getContext();
                        circularProgressBar.A0E = C43421zm.A01();
                        circularProgressBar.A09 = 20;
                        circularProgressBar.A05 = 0.083333336f;
                        AnonymousClass11P r02 = this.A02;
                        if (r02 != null) {
                            long A013 = j - AnonymousClass11P.A01(r02);
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("ReachoutTimelockInfoBottomSheet/creating timer - endTime: ");
                            A10.append(j);
                            A10.append(" - length: ");
                            A10.append(j2);
                            C17900vP.A0m(" - timeTillEnd: ", A10, A013);
                            if (A013 > 1000) {
                                this.A00 = new AnonymousClass3NO(circularProgressBar, this, A013, j).start();
                                return;
                            }
                            circularProgressBar.setProgress(0);
                            C18000vb r5 = this.A04;
                            if (r5 != null) {
                                circularProgressBar.A0G = C64052u8.A0D(r5, r5.A08(221), 0);
                                circularProgressBar.A07 = (float) AnonymousClass3Ma.A02(circularProgressBar, 2131165503);
                                AnonymousClass4OE r43 = this.A07;
                                if (r43 != null) {
                                    r43.A03.CGF(new C21449AkG((Object) r43, 0));
                                    AnonymousClass2HX r2 = new AnonymousClass2HX();
                                    r2.A01 = Long.valueOf(Math.abs(A013));
                                    AnonymousClass00H r03 = this.A0A;
                                    if (r03 != null) {
                                        ((AnonymousClass18K) r03.get()).CC7(r2);
                                        return;
                                    }
                                    str2 = "wamRuntime";
                                } else {
                                    str2 = "reachoutTimelockQueryRunner";
                                }
                            } else {
                                str2 = "whatsAppLocale";
                            }
                        } else {
                            str2 = "time";
                        }
                        C18070vi.A11(str2);
                        throw null;
                    }
                }
                str2 = "waSharedPreferences";
                C18070vi.A11(str2);
                throw null;
            }
        }
        str = "linkifierUtils";
        C18070vi.A11(str);
        throw null;
    }

    public void A2I(C139436yq r4) {
        C18070vi.A0d(r4, 0);
        r4.A01(true);
        Bundle bundle = this.A06;
        if (bundle == null || !bundle.getBoolean("show_full_height")) {
            r4.A00(AnonymousClass4AI.A00);
            r4.A00.A02 = AnonymousClass3MZ.A09(this).getDisplayMetrics().heightPixels / 2;
            return;
        }
        r4.A00(new AnonymousClass6P4((C18090vk) null, (AnonymousClass1Y1) null, 1));
    }

    public void A1s() {
        super.A1s();
        CountDownTimer countDownTimer = this.A00;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.A00 = null;
    }

    public int A2F() {
        return 2131626669;
    }
}
