package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.3X1  reason: invalid class name */
public final class AnonymousClass3X1 extends C38391rD {
    public final AnonymousClass3UB A00;
    public final Context A01;
    public final C108015az A02;
    public final C18000vb A03;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        View inflate = C72463Mc.A0K(viewGroup, 0).inflate(2131626045, viewGroup, false);
        C18070vi.A0z(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new C74193Yw((ViewGroup) inflate, this);
    }

    public int A0Q() {
        AnonymousClass4Q9 r0 = (AnonymousClass4Q9) this.A00.A01.A06();
        if (r0 != null) {
            return r0.A00.size();
        }
        return 0;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r2, int i) {
        C74193Yw r22 = (C74193Yw) r2;
        C18070vi.A0d(r22, 0);
        AnonymousClass4Q9 r0 = (AnonymousClass4Q9) this.A00.A01.A06();
        if (r0 != null) {
            Object obj = r0.A00.get(i);
            C18070vi.A0X(obj);
            A0U((C108445bi) obj, r22, i);
        }
    }

    public AnonymousClass3X1(Context context, AnonymousClass1F9 r5, C108015az r6, AnonymousClass3UB r7, C18000vb r8) {
        this.A01 = context;
        this.A03 = r8;
        this.A02 = r6;
        this.A00 = r7;
        C91644g1.A00(r5, r7.A01, AnonymousClass3MW.A16(this, 40), 22);
    }

    public final void A0U(C108445bi r9, C74193Yw r10, int i) {
        C18070vi.A0i(r10, r9);
        String BaW = r9.BaW(this.A02);
        Context context = this.A01;
        C18000vb r6 = this.A03;
        Drawable BSc = r9.BSc(context, r6);
        C89754cy r4 = new C89754cy(r10, this, 175.0f * Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f), i);
        boolean z = r9 instanceof C95004lX;
        TextEmojiLabel textEmojiLabel = r10.A00;
        textEmojiLabel.A0S(BaW, (List) null, 0, false);
        if (BSc == null) {
            textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            boolean A1Z = AnonymousClass3MW.A1Z(r6);
            if (z) {
                if (A1Z) {
                    textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds(BSc, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, BSc, (Drawable) null);
                }
            } else if (A1Z) {
                textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, BSc, (Drawable) null);
            } else {
                textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds(BSc, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        textEmojiLabel.setOnClickListener(r4);
    }
}
