package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2ri  reason: invalid class name and case insensitive filesystem */
public final class C62632ri {
    public int A00;
    public long A01;
    public Animation A02;
    public C72103Kq A03;
    public boolean A04;
    public SpannableStringBuilder A05;
    public Pair A06;
    public Boolean A07;
    public Runnable A08;
    public Runnable A09;
    public final C19880zA A0A;
    public final AnonymousClass11S A0B;
    public final C25491Ok A0C;
    public final C18000vb A0D;
    public final C18030ve A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final C18100vl A0H = new C18110vm(AnonymousClass3I7.A00);
    public final AnonymousClass11P A0I;

    public final SpannableStringBuilder A01(TextEmojiLabel textEmojiLabel) {
        C18070vi.A0d(textEmojiLabel, 0);
        SpannableStringBuilder spannableStringBuilder = this.A05;
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        Drawable A022 = AnonymousClass4aX.A02(textEmojiLabel.getContext(), 2131232072, AnonymousClass1YL.A00(textEmojiLabel.getContext(), 2130969226, 2131102411));
        C18070vi.A0X(A022);
        this.A00 = A022.getIntrinsicWidth();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C72813Np.A03(textEmojiLabel.getPaint(), A022, textEmojiLabel.getContext().getString(2131894758)));
        this.A05 = spannableStringBuilder2;
        return spannableStringBuilder2;
    }

    public final void A03() {
        this.A03 = null;
        this.A01 = 0;
        Runnable runnable = this.A08;
        if (runnable != null) {
            ((Handler) this.A0H.getValue()).removeCallbacks(runnable);
        }
        Runnable runnable2 = this.A09;
        if (runnable2 != null) {
            ((Handler) this.A0H.getValue()).removeCallbacks(runnable2);
        }
    }

    public final void A04(View view, TextEmojiLabel textEmojiLabel, CharSequence charSequence) {
        TextEmojiLabel textEmojiLabel2 = textEmojiLabel;
        CharSequence charSequence2 = charSequence;
        if (textEmojiLabel != null) {
            View view2 = view;
            if (view != null) {
                if (charSequence == null) {
                    charSequence2 = A01(textEmojiLabel);
                }
                textEmojiLabel.setText(charSequence2);
                if (!this.A04 && this.A09 == null) {
                    C70833Cr r3 = new C70833Cr((Object) this, (Object) view2, (Object) textEmojiLabel2, (Object) charSequence2, 5);
                    ((Handler) this.A0H.getValue()).postDelayed(r3, 1000);
                    this.A09 = r3;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        if (r1.A01((com.whatsapp.jid.UserJid) r3) == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ab, code lost:
        if (r2 != 1) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b2, code lost:
        if (r2 == 1) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b5, code lost:
        if (r2 == 2) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ba, code lost:
        if (r2 == 0) goto L_0x00bc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.C62632ri r6, X.AnonymousClass1E7 r7) {
        /*
            java.lang.Boolean r0 = r6.A07
            if (r0 == 0) goto L_0x0009
            boolean r5 = r0.booleanValue()
            return r5
        L_0x0009:
            X.0ve r2 = r6.A0E
            r1 = 6843(0x1abb, float:9.589E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r5 = 0
            if (r0 == 0) goto L_0x0041
            X.1BI r3 = r7.A0J
            if (r3 == 0) goto L_0x0041
            X.00H r0 = r6.A0F
            java.lang.Object r4 = r0.get()
            X.2cC r4 = (X.C53232cC) r4
            r2 = 1
            boolean r0 = r7.A0F()
            if (r0 != 0) goto L_0x0048
            X.11S r1 = r4.A00
            X.1BI r0 = r7.A0J
            boolean r0 = r1.A0O(r0)
            if (r0 != 0) goto L_0x0048
            java.util.concurrent.ConcurrentHashMap r0 = r4.A01
            java.lang.Object r0 = r0.get(r3)
            boolean r0 = X.C18070vi.A19(r0, r2)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0048
        L_0x0041:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r6.A07 = r0
            return r5
        L_0x0048:
            boolean r0 = r7.A0F()
            if (r0 != 0) goto L_0x005e
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A00(r3)
            X.1Ok r1 = r6.A0C
            X.2tn r0 = new X.2tn
            r0.<init>((X.C25491Ok) r1, (X.AnonymousClass1E7) r7, (com.whatsapp.jid.UserJid) r2)
            boolean r5 = r0.A05()
            goto L_0x0041
        L_0x005e:
            X.1yf r0 = r7.A0G
            if (r0 == 0) goto L_0x008d
            X.1ya r2 = r0.A00()
        L_0x0066:
            X.00H r0 = r6.A0G
            java.lang.Object r1 = r0.get()
            X.12B r1 = (X.AnonymousClass12B) r1
            boolean r0 = X.C22971Dz.A0d(r3)
            if (r0 == 0) goto L_0x0082
            X.00H r0 = r1.A01
            r0.get()
            r0 = r3
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r1.A01(r0)
            if (r0 != 0) goto L_0x0041
        L_0x0082:
            if (r2 != 0) goto L_0x008f
            X.11S r1 = r6.A0B
            X.1BI r0 = r7.A0J
            boolean r5 = r1.A0O(r0)
            goto L_0x0041
        L_0x008d:
            r2 = 0
            goto L_0x0066
        L_0x008f:
            X.0zA r1 = r6.A0A
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = r1.A03()
            X.1gl r0 = (X.C32171gl) r0
            boolean r0 = r0.Bey(r3)
            if (r0 == 0) goto L_0x00a4
            goto L_0x0041
        L_0x00a4:
            int r3 = r2.hostStorage
            int r2 = r2.actualActors
            r1 = 1
            if (r3 != r1) goto L_0x00b8
            if (r2 == r1) goto L_0x00bc
        L_0x00ad:
            r0 = 2
            if (r3 == r1) goto L_0x00b5
            if (r3 != r0) goto L_0x00be
            if (r2 != r1) goto L_0x00b5
            goto L_0x0041
        L_0x00b5:
            if (r2 != r0) goto L_0x00be
            goto L_0x0041
        L_0x00b8:
            if (r3 != 0) goto L_0x00ad
            if (r2 != 0) goto L_0x00be
        L_0x00bc:
            r5 = 1
            goto L_0x0041
        L_0x00be:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "getProviderCategory unexpected arguments hostStorage: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ". actualActors:"
            X.C17900vP.A0i(r0, r1, r2)
            goto L_0x00bc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62632ri.A00(X.2ri, X.1E7):boolean");
    }

    public C62632ri(C19880zA r3, AnonymousClass11S r4, C25491Ok r5, AnonymousClass11P r6, C18000vb r7, C18030ve r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r8, r4, r6, r9, r7);
        C18070vi.A0q(r10, r5, r3);
        this.A0E = r8;
        this.A0B = r4;
        this.A0I = r6;
        this.A0F = r9;
        this.A0D = r7;
        this.A0G = r10;
        this.A0C = r5;
        this.A0A = r3;
    }

    public final Pair A02(Context context, AnonymousClass1E7 r8, long j) {
        if (!A00(this, r8) || System.currentTimeMillis() - j >= this.A01) {
            return null;
        }
        Pair pair = this.A06;
        if (pair != null) {
            return pair;
        }
        Pair pair2 = new Pair(C17880vN.A0m(), context.getString(2131894758));
        this.A06 = pair2;
        return pair2;
    }

    public final void A05(AnonymousClass1E7 r5, AnonymousClass1BI r6, long j, boolean z) {
        if (A00(this, r5)) {
            if (this.A08 == null) {
                this.A08 = new C70773Cl(this, r6, r5, 19);
            }
            long j2 = 3000;
            if (r5.A0C() || z || r5.A0F()) {
                j2 = 3000 + j;
            }
            this.A01 = j2;
            Runnable runnable = this.A08;
            if (runnable != null) {
                ((Handler) this.A0H.getValue()).postDelayed(runnable, j2);
            }
        }
    }
}
