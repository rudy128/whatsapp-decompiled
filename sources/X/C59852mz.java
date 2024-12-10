package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2mz  reason: invalid class name and case insensitive filesystem */
public final class C59852mz {
    public final AnonymousClass11S A00;
    public final AnonymousClass1VW A01;
    public final C27191Vc A02;
    public final AnonymousClass118 A03;
    public final C18000vb A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass1KB A09;
    public final C19830z4 A0A;

    public final void A00(Context context, TextEmojiLabel textEmojiLabel, int i) {
        C18070vi.A0d(textEmojiLabel, 2);
        int A012 = C22339B3q.A01(TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics()));
        if (context.getResources().getConfiguration().orientation == 1) {
            textEmojiLabel.setPadding(A012, 0, A012, 0);
            return;
        }
        C18000vb r2 = this.A04;
        int i2 = 0;
        if (C18000vb.A00(r2).A06) {
            i2 = A012;
        }
        if (C18000vb.A00(r2).A06) {
            A012 = 0;
        }
        textEmojiLabel.setPadding(i2, 0, A012, 0);
    }

    public final void A01(AnonymousClass1F9 r19, C36001nB r20) {
        Bitmap bitmap;
        AnonymousClass1F9 r12 = r19;
        C18070vi.A0d(r12, 0);
        AnonymousClass11S r5 = this.A00;
        r5.A0I();
        if (r5.A0D != null) {
            C19830z4 r2 = this.A0A;
            if (C17890vO.A0B(r2).getBoolean("show_account_switching_toast", false)) {
                C18000vb r4 = this.A04;
                r5.A0I();
                AnonymousClass1E8 r3 = r5.A0D;
                C17960vV.A07(r3);
                String A0G = r4.A0G(AnonymousClass17K.A02(r3));
                Context context = this.A03.A00;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167000);
                r5.A0I();
                AnonymousClass1E8 r7 = r5.A0D;
                if (r7 == null || (bitmap = this.A02.A04(context, r7, "AccountSwitchingHandler.getToastFacePileDrawable", -1.0f, dimensionPixelSize, true)) == null) {
                    bitmap = this.A01.A04(context, (AnonymousClass1VX) null, -1.0f, 2131231047, dimensionPixelSize);
                }
                this.A09.A0J(new C21462AkT(r12, r20, this, new BitmapDrawable(context.getResources(), bitmap), A0G, 1));
                C17880vN.A1F(C19830z4.A00(r2), "show_account_switching_toast", false);
            }
        }
    }

    public final void A02(C28931bI r5) {
        C18070vi.A0d(r5, 0);
        if (r5.A01() == 0) {
            r5.A04(8);
            View A022 = r5.A02();
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(320);
            A022.startAnimation(alphaAnimation);
        }
    }

    public C59852mz(AnonymousClass1KB r2, AnonymousClass11S r3, AnonymousClass1VW r4, C27191Vc r5, AnonymousClass118 r6, C19830z4 r7, C18000vb r8, AnonymousClass10I r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        C18070vi.A0w(r2, r3, r6, r9, r4);
        C18070vi.A0x(r8, r10, r11, r7, r12);
        C18070vi.A0d(r5, 11);
        this.A09 = r2;
        this.A00 = r3;
        this.A03 = r6;
        this.A05 = r9;
        this.A01 = r4;
        this.A04 = r8;
        this.A06 = r10;
        this.A08 = r11;
        this.A0A = r7;
        this.A07 = r12;
        this.A02 = r5;
    }
}
