package X;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.expressionstray.expression.emoji.view.EmojiImageView;
import com.whatsapp.expressionstray.expression.emoji.view.EmojiImageViewLoader;
import com.whatsapp.expressionstray.expression.emoji.view.EmojiImageViewLoader$loadEmoji$job$2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.5kX  reason: invalid class name and case insensitive filesystem */
public final class C111855kX extends C41251w3 {
    public static final C40411uf A07 = new C111565jv(1);
    public final int A00;
    public final int A01;
    public final Paint A02;
    public final EmojiImageViewLoader A03;
    public final C139496yw A04;
    public final AnonymousClass1OS A05;
    public final AnonymousClass1OS A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111855kX(Paint paint, EmojiImageViewLoader emojiImageViewLoader, C139496yw r4, AnonymousClass1OS r5, AnonymousClass1OS r6, int i, int i2) {
        super(A07);
        C18070vi.A0g(emojiImageViewLoader, 1, r4);
        this.A03 = emojiImageViewLoader;
        this.A02 = paint;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = r4;
        this.A06 = r5;
        this.A05 = r6;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 0) {
            View inflate = AnonymousClass3MZ.A0D(viewGroup).inflate(2131625196, viewGroup, false);
            List list = C42011xT.A0I;
            C72453Mb.A1S(inflate);
            return new C42011xT(inflate);
        } else if (i == 1) {
            View inflate2 = AnonymousClass3MZ.A0D(viewGroup).inflate(2131625184, viewGroup, false);
            Paint paint = this.A02;
            AnonymousClass1OS r8 = this.A06;
            AnonymousClass1OS r9 = this.A05;
            EmojiImageViewLoader emojiImageViewLoader = this.A03;
            List list2 = C42011xT.A0I;
            C18070vi.A0b(inflate2);
            return new C117505zu(paint, inflate2, emojiImageViewLoader, r8, r9);
        } else if (i == 2) {
            ViewGroup A0H = C108955ca.A0H(AnonymousClass3MZ.A0D(viewGroup).inflate(2131625190, viewGroup, false));
            int i2 = this.A01;
            for (int i3 = 0; i3 < i2; i3++) {
                A0H.addView(AnonymousClass3MZ.A0D(viewGroup).inflate(2131625185, A0H, false), new LinearLayout.LayoutParams(0, this.A00, 1.0f));
            }
            return new C117495zt(this.A02, A0H, this.A03, this.A06, this.A05);
        } else {
            throw AnonymousClass000.A0n("Unknown view type.");
        }
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r18, int i) {
        C139496yw r3;
        int intValue;
        String str;
        String str2;
        int[] iArr;
        C1421078e r0;
        C1421078e r02;
        int i2 = i;
        C112815m5 r6 = (C112815m5) r18;
        C18070vi.A0d(r6, 0);
        C131546lH r32 = (C131546lH) A0U(i2);
        if (r32 instanceof C117525zw) {
            if (r6 instanceof C117505zu) {
                C117525zw r33 = (C117525zw) r32;
                Integer num = r33.A02;
                if (num != null) {
                    this.A04.A02(num.intValue(), "emoji_view_bind_start", (String) null);
                }
                C117505zu r62 = (C117505zu) r6;
                int[] iArr2 = r33.A04;
                C117025z5 r9 = new C117025z5(iArr2);
                long A002 = C43291zZ.A00(r9, false);
                EmojiImageViewLoader emojiImageViewLoader = r62.A01;
                EmojiImageView emojiImageView = r62.A00;
                emojiImageViewLoader.A01(r9, emojiImageView, num, A002);
                AnonymousClass78T.A00(emojiImageView, r62, r33, i2, 15);
                if (AnonymousClass74I.A03(iArr2) || AnonymousClass74I.A02(iArr2)) {
                    emojiImageView.setLongClickable(true);
                    r02 = new C1421078e(r62, i2, 1, r33);
                } else {
                    emojiImageView.setLongClickable(false);
                    r02 = null;
                }
                emojiImageView.setOnLongClickListener(r02);
                if (num != null) {
                    r3 = this.A04;
                    intValue = num.intValue();
                    str = null;
                    str2 = "emoji_view_bind_end";
                } else {
                    return;
                }
            } else {
                throw AnonymousClass000.A0n(AnonymousClass001.A1E(r6, "Impossible to bind EmojiItem to ", AnonymousClass000.A10()));
            }
        } else if (r32 instanceof C117515zv) {
            C117515zv r34 = (C117515zv) r32;
            C18070vi.A0d(r34, 0);
            C108975cc.A0C(r6.A0H).setText(r34.A00);
            return;
        } else if (r32 instanceof C117535zx) {
            C117535zx r35 = (C117535zx) r32;
            Integer num2 = r35.A02;
            if (num2 != null) {
                this.A04.A02(num2.intValue(), "emoji_row_bind_start", (String) null);
            }
            C117495zt r63 = (C117495zt) r6;
            int i3 = i * this.A01;
            View view = r63.A0H;
            C18070vi.A0z(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ArrayList A13 = AnonymousClass000.A13();
            Iterator A003 = C99434so.A00(view, 1);
            int i4 = 0;
            while (A003.hasNext()) {
                Object next = A003.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    AnonymousClass1ZU.A0B();
                    throw null;
                }
                View view2 = (View) next;
                EmojiImageView emojiImageView2 = (EmojiImageView) view2.findViewById(2131430307);
                int[][] iArr3 = r35.A04;
                C18070vi.A0d(iArr3, 0);
                if (i4 >= iArr3.length || (iArr = iArr3[i4]) == null) {
                    view2.setVisibility(4);
                    if (emojiImageView2 != null) {
                        emojiImageView2.A00((int[]) null, (Drawable) null);
                    }
                } else {
                    view2.setVisibility(0);
                    if (emojiImageView2 != null) {
                        emojiImageView2.setPaint(r63.A00);
                        C117025z5 r14 = new C117025z5(iArr);
                        A13.add(new C135196ro(r14, emojiImageView2, C43291zZ.A00(r14, false)));
                        int i6 = i4 + i3;
                        AnonymousClass78T.A00(emojiImageView2, r63, iArr, i6, 14);
                        AnonymousClass3MW.A1Q(emojiImageView2);
                        if (AnonymousClass74I.A03(iArr) || AnonymousClass74I.A02(iArr)) {
                            emojiImageView2.setLongClickable(true);
                            r0 = new C1421078e(r63, i6, 0, iArr);
                        } else {
                            emojiImageView2.setLongClickable(false);
                            r0 = null;
                        }
                        emojiImageView2.setOnLongClickListener(r0);
                    }
                }
                i4 = i5;
            }
            if (A13.size() > 0) {
                EmojiImageViewLoader emojiImageViewLoader2 = r63.A01;
                ArrayList<C136126tJ> A0E = C29351c6.A0E(A13);
                Iterator it = A13.iterator();
                while (it.hasNext()) {
                    C135196ro r36 = (C135196ro) it.next();
                    long j = r36.A00;
                    C43271zX r10 = r36.A01;
                    WeakReference A0z = AnonymousClass3MW.A0z(r36.A02);
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("emoji_");
                    A10.append(j);
                    A10.append('/');
                    A0E.add(new C136126tJ(r10, new C134316qO(C17890vO.A0V(r10, A10)), num2, A0z, j));
                }
                for (C136126tJ r1 : A0E) {
                    EmojiImageView emojiImageView3 = (EmojiImageView) r1.A04.get();
                    if (emojiImageView3 != null) {
                        Object tag = emojiImageView3.getTag();
                        C134316qO r12 = r1.A03;
                        if (!C18070vi.A18(tag, r12)) {
                            emojiImageView3.A00((int[]) null, (Drawable) null);
                        }
                        emojiImageView3.setTag(r12);
                    }
                }
                ArrayList A0E2 = C29351c6.A0E(A0E);
                for (C136126tJ r03 : A0E) {
                    C108955ca.A1U(r03.A03, A0E2);
                }
                C134316qO r8 = new C134316qO(C29431cG.A0h(", ", A0E2, (C22821Di) null));
                HashMap hashMap = emojiImageViewLoader2.A03;
                AnonymousClass1OB r04 = (AnonymousClass1OB) hashMap.remove(r8);
                if (r04 != null) {
                    r04.BEM((CancellationException) null);
                }
                if (num2 != null) {
                    C108975cc.A0H(emojiImageViewLoader2.A02).A02(num2.intValue(), "emoji_image_loader_launch_batch", (String) null);
                }
                hashMap.put(r8, AnonymousClass3MY.A0s(new EmojiImageViewLoader$loadEmoji$job$2(new C134666qx(num2, A0E), emojiImageViewLoader2, (C30391dr) null), (AnonymousClass1OX) emojiImageViewLoader2.A04.getValue()));
            }
            if (num2 != null) {
                r3 = this.A04;
                intValue = num2.intValue();
                str = null;
                str2 = "emoji_row_bind_end";
            } else {
                return;
            }
        } else {
            return;
        }
        r3.A02(intValue, str2, str);
    }

    public int getItemViewType(int i) {
        Object A0U = A0U(i);
        if (A0U instanceof C117535zx) {
            return 2;
        }
        if (A0U instanceof C117525zw) {
            return 1;
        }
        if (A0U instanceof C117515zv) {
            return 0;
        }
        throw AnonymousClass3MW.A14();
    }
}
