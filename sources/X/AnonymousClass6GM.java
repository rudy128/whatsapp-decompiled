package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;

/* renamed from: X.6GM  reason: invalid class name */
public final class AnonymousClass6GM extends C136016t8 implements C201511a {
    public AnonymousClass72S A04(Context context, AnonymousClass1E7 r22, C20947Ac1 ac1) {
        C46162Dk r12;
        int i;
        String str;
        Context context2 = context;
        C18070vi.A0d(context2, 0);
        C003101k A02 = C28281Zt.A02(context2);
        AnonymousClass6BE r1 = new AnonymousClass6BE(A02);
        AnonymousClass7E7 r8 = this.A00;
        C18070vi.A0d(r8, 0);
        int dimensionPixelSize = r1.getResources().getDimensionPixelSize(2131168033);
        float A022 = C108945cZ.A02(dimensionPixelSize);
        AnonymousClass1E7 r10 = r22;
        Bitmap BX4 = r8.BX4(AnonymousClass3MY.A04(r1), r10, "NewsletterLinkView.bind", A022, dimensionPixelSize);
        r1.setBackground(r1.A02(BX4));
        ImageView imageView = r1.A04;
        if (BX4 == null) {
            BX4 = r1.getContactAvatars().A04(AnonymousClass3MY.A04(r1), (AnonymousClass1VX) null, A022, r1.getContactAvatars().A02(r10), dimensionPixelSize);
        }
        imageView.setImageBitmap(BX4);
        r1.A08.A08(r10, -1);
        C29691ci A0A = r1.getChatsCache().A0A(r10.A0J);
        if (A0A instanceof C46162Dk) {
            r12 = (C46162Dk) A0A;
            if (r12 != null) {
                i = (int) r12.A0G;
            }
            i = 0;
        } else {
            r12 = null;
            i = 0;
        }
        AnonymousClass4XM r5 = (AnonymousClass4XM) r1.getNewsletterNumberFormatter().get();
        int A00 = AnonymousClass4XM.A00(r5, i);
        String A01 = r5.A01(A00);
        C18070vi.A0d(A01, 1);
        AnonymousClass3MX.A1E(r1.getResources(), r1.A06, new Object[]{A01}, 2131755282, A00);
        if (r12 == null || (str = r12.A0Q) == null || AnonymousClass1YF.A0T(str)) {
            r1.A05.setVisibility(8);
        } else {
            AnonymousClass11C systemServices = r1.getSystemServices();
            C18010vc sharedPreferencesFactory = r1.getSharedPreferencesFactory();
            Context context3 = r1.getContext();
            TextView textView = r1.A05;
            textView.setText(AnonymousClass3MW.A09(C26302CxJ.A0C(systemServices, sharedPreferencesFactory, C43251zV.A03(context3, textView.getPaint(), r1.getEmojiLoader(), str))));
        }
        C108995ce.A0v(r1, View.MeasureSpec.makeMeasureSpec(r1.getResources().getDimensionPixelSize(2131166858), 1073741824), View.MeasureSpec.makeMeasureSpec(r1.getResources().getDimensionPixelSize(2131166856), 1073741824));
        File A012 = this.A02.A01(A02, r1, (View) null, 0.0f);
        if (A012 == null) {
            return null;
        }
        Uri fromFile = Uri.fromFile(A012);
        C18070vi.A0b(fromFile);
        AnonymousClass72S r82 = new AnonymousClass72S(fromFile);
        r82.A0N(A012);
        C20947Ac1 ac12 = ac1;
        A03(r1, r82, C18070vi.A0N(A00((RectF) null, r1.A03, ac12, true), A00((RectF) null, r1.A07, ac12, false), new AnonymousClass69e[2], 0, 1));
        return r82;
    }

    public static final AnonymousClass69e A00(RectF rectF, View view, C20947Ac1 ac1, boolean z) {
        String rawString = ac1.A01.getRawString();
        int i = ac1.A00;
        AnonymousClass69e r2 = new AnonymousClass69e(ac1.A02, rawString, ac1.A04, ac1.A03, i, z);
        float f = 3.0f / AnonymousClass3MX.A05(view).getDisplayMetrics().density;
        RectF A00 = AnonymousClass4aO.A00(view);
        if (rectF != null) {
            A00.set(rectF);
        }
        float f2 = A00.left * f;
        A00.left = f2;
        float f3 = A00.top * f;
        A00.top = f3;
        float f4 = A00.right * f;
        A00.right = f4;
        float f5 = A00.bottom * f;
        A00.bottom = f5;
        r2.A0O(A00, f2, f3, f4, f5);
        return r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6GM(AnonymousClass1T1 r1, C27181Vb r2, C139326ye r3, C32021gV r4) {
        super(r1, r2, r3, r4);
        C18070vi.A0o(r4, r2, r1);
    }
}
