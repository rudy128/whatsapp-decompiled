package X;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;

/* renamed from: X.6y0  reason: invalid class name and case insensitive filesystem */
public final class C138976y0 {
    public final C36401np A00;
    public final AnonymousClass11C A01;
    public final C18030ve A02;

    public C138976y0(AnonymousClass11C r1, C18030ve r2, C36401np r3) {
        C18070vi.A0o(r2, r3, r1);
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = r1;
    }

    private final void A00(Context context, String str, C18090vk r9, int i, int i2) {
        int i3;
        DialogInterface.OnClickListener r1;
        C73193Ri A002 = C73193Ri.A00(context);
        if (A002.A03) {
            A002.A00 = 2131232439;
        } else {
            A002.A01.A01 = 2131232439;
        }
        A002.A0V(i);
        if (str == null) {
            A002.A0U(i2);
        } else {
            C36401np r4 = this.A00;
            Context context2 = A002.getContext();
            A002.A0d(r4.A05(context2, new C146817Qs(39, str, A002), context2.getString(i2), "passkeys_learn_more_uri"));
        }
        if (r9 != null) {
            A002.A0W(new C1411974r(26), 2131898766);
            i3 = 2131893564;
            r1 = new AnonymousClass758(r9, 9);
        } else {
            i3 = 2131899286;
            r1 = new C1411974r(27);
        }
        A002.A0X(r1, i3);
        C010105w A0C = A002.A0C();
        TextView textView = (TextView) A0C.findViewById(16908299);
        if (textView != null) {
            AnonymousClass3Ma.A1I(textView, this.A02);
            AnonymousClass3MZ.A1Q(textView, this.A01);
        }
        A0C.show();
    }

    public final void A01(Context context, Integer num) {
        int i;
        int i2;
        C18090vk r4;
        String str;
        int i3;
        Context context2 = context;
        switch (num.intValue()) {
            case 0:
                i2 = 2131893566;
                i = 2131893565;
                i3 = 7;
                break;
            case 1:
                i2 = 2131893572;
                i = 2131893571;
                i3 = 8;
                break;
            case 2:
                i2 = 2131893570;
                i = 2131893569;
                r4 = new AnonymousClass7S3((Object) context, 49);
                str = "https://support.google.com/android/answer/9079129?hl=en";
                break;
            case 3:
                A00(context2, (String) null, (C18090vk) null, 2131893568, 2131893567);
                return;
            case 4:
                return;
            default:
                A00(context2, "https://faq.whatsapp.com/5064231857013976", (C18090vk) null, 2131893563, 2131893562);
                return;
        }
        r4 = new AnonymousClass7S0(context, this, i3);
        str = "https://support.google.com/googleplay/answer/9037938?hl=en";
        A00(context2, str, r4, i2, i);
    }
}
