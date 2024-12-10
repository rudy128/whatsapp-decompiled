package X;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.wds.components.banners.WDSBannerCompact;

/* renamed from: X.3rt  reason: invalid class name and case insensitive filesystem */
public class C77963rt extends C78023rz implements C108915cV {
    public AnonymousClass1E7 A00;
    public WDSBannerCompact A01 = null;
    public final AnonymousClass4MM A02;
    public final AnonymousClass11C A03;
    public final C22621Co A04;
    public final AnonymousClass1KW A05;
    public final C18010vc A06;
    public final AnonymousClass18O A07;
    public final AnonymousClass1CJ A08;
    public final C36401np A09;
    public final boolean A0A;

    public C77963rt(AnonymousClass18O r2, C108885cS r3, AnonymousClass4MM r4, AnonymousClass11C r5, C22621Co r6, AnonymousClass1CJ r7, AnonymousClass1E7 r8, AnonymousClass1KW r9, C18010vc r10, C36401np r11, C28931bI r12, boolean z) {
        super(r3, r12, 40);
        this.A09 = r11;
        this.A08 = r7;
        this.A04 = r6;
        this.A05 = r9;
        this.A07 = r2;
        this.A03 = r5;
        this.A06 = r10;
        this.A02 = r4;
        this.A00 = r8;
        this.A0A = z;
    }

    /* renamed from: A0B */
    public void BD4(AnonymousClass5Z8 r6, AnonymousClass1E7 r7) {
        C28931bI r3 = this.A01;
        if (r3.A02().findViewById(2131431250) == null) {
            ((ViewGroup) r3.A02()).removeAllViews();
            AnonymousClass48j r4 = new AnonymousClass48j(r7, r6, this, 14);
            if (AnonymousClass1J8.A02(AnonymousClass1J8.A00(C98524rI.A03(this)))) {
                A0A(2131624734);
                WDSBannerCompact wDSBannerCompact = (WDSBannerCompact) r3.A02().findViewById(2131431244);
                this.A01 = wDSBannerCompact;
                wDSBannerCompact.setOnDismissListener((View.OnClickListener) r4);
            } else {
                A0A(2131624733);
                r3.A02().findViewById(2131431245).setOnClickListener(r4);
            }
        }
        C825248h r1 = new C825248h(this, r7, 36);
        WDSBannerCompact wDSBannerCompact2 = this.A01;
        if (wDSBannerCompact2 != null) {
            wDSBannerCompact2.setOnClickListener(r1);
            TextPaint textPaint = this.A01.getTextPaint();
            textPaint.getClass();
            C42661yX r0 = this.A00.A0M;
            r0.getClass();
            SpannableStringBuilder A0J = C72483Me.A0J(textPaint, this.A03, this.A06, C43251zV.A03(C98524rI.A03(this), textPaint, this.A05, r0.A03));
            ReadMoreTextView readMoreTextView = this.A01.A00;
            if (readMoreTextView != null) {
                C72453Mb.A1L(readMoreTextView, A0J);
                return;
            }
            return;
        }
        r3.A02().setOnClickListener(r1);
        ReadMoreTextView readMoreTextView2 = (ReadMoreTextView) r3.A02().findViewById(2131431250);
        readMoreTextView2.A03 = new C97984qN(this, r7, 0);
        TextPaint paint = readMoreTextView2.getPaint();
        C42661yX r02 = this.A00.A0M;
        r02.getClass();
        SpannableStringBuilder A0J2 = C72483Me.A0J(paint, this.A03, this.A06, C43251zV.A03(C98524rI.A03(this), paint, this.A05, r02.A03));
        this.A09.A08(readMoreTextView2.getContext(), A0J2);
        readMoreTextView2.A0R(A0J2);
    }

    /* renamed from: A0C */
    public boolean BEC(AnonymousClass1E7 r3) {
        C29691ci A0a;
        C42661yX r0;
        if (!this.A0A || this.A07.A04(AnonymousClass18O.A1V) <= 0 || r3 == null || (A0a = C72463Mc.A0a(this.A08, AnonymousClass3MW.A0g(r3))) == null || !A0a.A0t || (r0 = r3.A0M) == null || TextUtils.isEmpty(r0.A03)) {
            return false;
        }
        return true;
    }
}
