package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.3Zf  reason: invalid class name and case insensitive filesystem */
public final class C74283Zf extends C42011xT {
    public LottieAnimationView A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass4L4 A02;
    public final C86404Rm A03;
    public final C18030ve A04;
    public final Context A05;
    public final AnonymousClass1L9 A06;
    public final AnonymousClass11C A07;
    public final AnonymousClass129 A08;
    public final AnonymousClass10I A09;

    public static final void A01(C74283Zf r7, List list) {
        C74283Zf r3 = r7;
        View view = r7.A0H;
        TextEmojiLabel A0c = C72453Mb.A0c(view, 2131432048);
        View A052 = C18070vi.A05(view, 2131432049);
        if (!C18020vd.A05(C18040vf.A02, r7.A04, 8966)) {
            A00(A0c, r7, 2131891687);
        } else {
            r7.A09.CGF(new C70833Cr((Object) r3, (Object) A0c, (Object) A052, (Object) list, 0));
        }
    }

    public static final void A00(TextEmojiLabel textEmojiLabel, C74283Zf r13, int i) {
        Context context = r13.A05;
        C18030ve r9 = r13.A04;
        AnonymousClass1KB r6 = r13.A01;
        C26302CxJ.A0K(context, r13.A08.A05("download-and-installation", "about-linked-devices"), r13.A06, r6, textEmojiLabel, r13.A07, r9, C17880vN.A0q(context, "learn-more", AnonymousClass3MW.A1a(), 0, i), "learn-more");
    }

    public C74283Zf(View view, AnonymousClass1L9 r4, AnonymousClass1KB r5, AnonymousClass4L4 r6, C86404Rm r7, AnonymousClass11C r8, C18030ve r9, AnonymousClass129 r10, AnonymousClass10I r11, List list) {
        super(view);
        this.A04 = r9;
        this.A01 = r5;
        this.A09 = r11;
        this.A06 = r4;
        this.A07 = r8;
        this.A08 = r10;
        this.A03 = r7;
        this.A02 = r6;
        this.A05 = AnonymousClass3MY.A04(view);
        A01(this, list);
        TextView A0E = AnonymousClass3Ma.A0E(view, 2131432012);
        A0E.setText(2131891652);
        C89894dC.A00(A0E, this, 48);
        ViewStub viewStub = (ViewStub) C18070vi.A05(view, 2131432051);
        if (C22891Dp.A02) {
            View A0G = AnonymousClass3MY.A0G(viewStub, 2131625832);
            C18070vi.A0z(A0G, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
            this.A00 = (LottieAnimationView) A0G;
            return;
        }
        viewStub.setLayoutResource(2131625833);
        viewStub.inflate();
    }
}
